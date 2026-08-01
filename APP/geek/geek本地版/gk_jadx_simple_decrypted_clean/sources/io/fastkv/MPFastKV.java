package io.fastkv;

import android.content.SharedPreferences;
import android.os.FileObserver;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.is;
import defpackage.t5;
import defpackage.z30;
import io.fastkv.Container;
import io.fastkv.interfaces.FastCipher;
import io.fastkv.interfaces.FastEncoder;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class MPFastKV extends AbsFastKV {
    private static final int LOCK_TIMEOUT = 3000;
    private static final int MSG_APPLY = 2;
    private static final int MSG_CLEAR = 4;
    private static final int MSG_DATA_CHANGE = 3;
    private static final int MSG_REFRESH = 1;
    private static final Random random = null;
    private RandomAccessFile aAccessFile;
    private MappedByteBuffer aBuffer;
    private FileChannel aChannel;
    private final File aFile;
    private final Executor applyExecutor;
    private RandomAccessFile bAccessFile;
    private FileChannel bChannel;
    private final File bFile;
    private FileLock bFileLock;
    private final Set<String> changedKey;
    private volatile KVFileObserver fileObserver;
    private final Handler kvHandler;
    private boolean needFullWrite;
    private final boolean needWatchFileChange;
    private final Executor refreshExecutor;
    private int updateCount;
    private long updateHash;
    private int[] updateStartAndSize;

    /* JADX INFO: renamed from: io.fastkv.MPFastKV$1, reason: invalid class name */
    public class AnonymousClass1 extends Handler {
        final /* synthetic */ MPFastKV this$0;

        public AnonymousClass1(MPFastKV r1, Looper r2) {
            this.this$0 = r1;
            super(r2);
        }

        public static /* synthetic */ void a(MPFastKV r0) {
            lambda$handleMessage$0(r0);
        }

        private static /* synthetic */ void lambda$handleMessage$0(MPFastKV r0) {
            MPFastKV.access$200(r0);
        }

        @Override // android.os.Handler
        public void handleMessage(Message r3) {
            int r32 = r3.what;
            if (r32 != 1) goto L5;
            Executor r33 = MPFastKV.access$000(this.this$0);
            final MPFastKV r0 = this.this$0;
            r33.execute(new c(r0));
            return;
        L5:
            if (r32 != 2) goto L7;
            this.this$0.apply();
            return;
        L7:
            if (r32 != MPFastKV.MSG_DATA_CHANGE) goto L9;
            MPFastKV.access$100(this.this$0);
            return;
        L9:
            if (r32 == MPFastKV.MSG_CLEAR) goto L11;
            return;
        L11:
            this.this$0.notifyListeners(null);
        }
    }

    public static class Builder {
        private static final Map<String, MPFastKV> INSTANCE_MAP = null;
        private FastCipher cipher;
        private FastEncoder[] encoders;
        private final String name;
        private boolean needWatchFileChange;
        private final String path;

        static {
            INSTANCE_MAP = new ConcurrentHashMap();
        }

        public Builder(String r3, String r4) {
            this.needWatchFileChange = true;
            if (r3 == null) goto L18;
            if (r3.isEmpty() == true) goto L18;
            if (r4 == null) goto L16;
            if (r4.isEmpty() == true) goto L16;
            if (r3.endsWith("/") == true) goto L13;
            r3 = r3.concat("/");
        L13:
            this.path = r3;
            this.name = r4;
            return;
        L16:
            throw new IllegalArgumentException("name is empty");
        L18:
            throw new IllegalArgumentException("path is empty");
        }

        public MPFastKV build() {
            String r0 = this.path + this.name;
            Map<String, MPFastKV> r1 = INSTANCE_MAP;
            MPFastKV r2 = r1.get(r0);
            if (r2 == null) goto L5;
            return r2;
        L5:
            monitor-enter(Builder.class);
            MPFastKV r22 = r1.get(r0);     // Catch: Throwable -> L9
            if (r22 != null) goto L11;
            MPFastKV r4 = new MPFastKV(this.path, this.name, this.encoders, this.cipher, this.needWatchFileChange);     // Catch: Throwable -> L9
            r1.put(r0, r4);     // Catch: Throwable -> L9
            r22 = r4;
        L11:
            monitor-exit(Builder.class);     // Catch: Throwable -> L9
            return r22;
        L9:
            th = move-exception;
            throw th;
        }

        public Builder cipher(FastCipher r1) {
            this.cipher = r1;
            return this;
        }

        public Builder disableWatchFileChange() {
            this.needWatchFileChange = false;
            return this;
        }

        public Builder encoder(FastEncoder[] r1) {
            this.encoders = r1;
            return this;
        }
    }

    public class KVFileObserver extends FileObserver {
        final /* synthetic */ MPFastKV this$0;

        public KVFileObserver(MPFastKV r1, String r2) {
            this.this$0 = r1;
            super(r2, 2);
        }

        @Override // android.os.FileObserver
        public void onEvent(int r3, String r4) {
            if (MPFastKV.access$300(this.this$0).hasMessages(1) == true) goto L6;
            MPFastKV.access$300(this.this$0).sendEmptyMessageDelayed(1, 30);
            return;
        }
    }

    static {
        random = new Random();
    }

    public MPFastKV(String r1, String r2, FastEncoder[] r3, FastCipher r4, boolean r5) {
        super(r1, r2, r3, r4);
        this.updateStartAndSize = new int[16];
        this.updateCount = 0;
        this.needFullWrite = false;
        this.applyExecutor = new LimitExecutor();
        this.refreshExecutor = new LimitExecutor();
        this.changedKey = new HashSet();
        this.kvHandler = new AnonymousClass1(this, Looper.getMainLooper());
        this.aFile = new File(r1, z30.i(r2, ".kva"));
        this.bFile = new File(r1, z30.i(r2, ".kvb"));
        this.needWatchFileChange = r5;
        HashMap<String, Container.BaseContainer> r12 = this.data;
        monitor-enter(r12);
        FastKVConfig.getExecutor().execute(new is(this, 0));     // Catch: Throwable -> L9
    L6:
        if (this.startLoading == true) goto L11;
        this.data.wait();     // Catch: InterruptedException -> L15 Throwable -> L9
        goto L6
    L11:
        monitor-exit(r12);     // Catch: Throwable -> L9
        return;
    L9:
        th = move-exception;
        throw th;
    }

    public static /* synthetic */ Executor access$000(MPFastKV r0) {
        return r0.refreshExecutor;
    }

    public static /* synthetic */ void access$100(MPFastKV r0) {
        r0.notifyChangedKeys();
    }

    public static /* synthetic */ void access$200(MPFastKV r0) {
        r0.refresh();
    }

    public static /* synthetic */ Handler access$300(MPFastKV r0) {
        return r0.kvHandler;
    }

    private void addUpdate(int r6, int r7) {
        int r0 = this.updateCount;
        int[] r1 = this.updateStartAndSize;
        int r2 = r1.length;
        if ((r0 << 1) < r2) goto L5;
        int[] r3 = new int[r2 << 1];
        System.arraycopy(r1, 0, r3, 0, r2);
        this.updateStartAndSize = r3;
    L5:
        int[] r12 = this.updateStartAndSize;
        r12[r0] = r6;
        r12[r0 + 1] = r7;
        this.updateCount = r0 + 2;
    }

    private boolean alignAToBuffer() {
        int r0 = this.fastBuffer.hb.length;
    L9:
        e = move-exception;
        error(e);
        return false;
    L4:
        if (this.aAccessFile == null) goto L6;
    L11:
        long r8 = r0;
        if (this.aAccessFile.length() == r8) goto L14;
        this.aAccessFile.setLength(r8);     // Catch: Exception -> L9
    L14:
        FileChannel r2 = this.aChannel;     // Catch: Exception -> L9
        if (r2 != null) goto L18;
        this.aChannel = this.aAccessFile.getChannel();     // Catch: Exception -> L9
    L20:
        MappedByteBuffer r22 = this.aBuffer;     // Catch: Exception -> L9
        if (r22 != null) goto L23;
    L24:
        MappedByteBuffer r02 = this.aChannel.map(FileChannel.MapMode.READ_WRITE, 0, r8);     // Catch: Exception -> L9
        this.aBuffer = r02;     // Catch: Exception -> L9
        r02.order(ByteOrder.LITTLE_ENDIAN);     // Catch: Exception -> L9
        return true;
    L23:
        if (r22.capacity() != r0) goto L24;
        return true;
    L18:
        if (r2.size() == r8) goto L20;
        this.aChannel.truncate(r8);     // Catch: Exception -> L9
        goto L20
    L6:
        if (Utils.makeFileIfNotExist(this.aFile) == true) goto L8;
        return false;
    L8:
        this.aAccessFile = new RandomAccessFile(this.aFile, "rw");     // Catch: Exception -> L9
        goto L11
    }

    public static /* synthetic */ void c(MPFastKV r0, String r1) {
        r0.lambda$updateFile$0(r1);
    }

    private void checkDiff(HashMap<String, Container.BaseContainer> r5) {
        HashSet r0 = new HashSet(this.data.keySet());
        HashSet r1 = new HashSet(r5.keySet());
        HashSet r2 = new HashSet(r0);
        r2.retainAll(r1);
        r0.removeAll(r2);
        r1.removeAll(r2);
        this.changedKey.addAll(r0);
        this.changedKey.addAll(r1);
        Iterator r02 = r2.iterator();
    L4:
        if (r02.hasNext() == false) goto L11;
        String r12 = (String) r02.next();
        Container.BaseContainer r22 = r5.get(r12);
        Container.BaseContainer r3 = this.data.get(r12);
        if (r22 == null) goto L4;
        if (r22.equalTo(r3) == true) goto L4;
        this.changedKey.add(r12);
        goto L4
    L11:
        if (this.changedKey.isEmpty() == true) goto L21;
        this.kvHandler.sendEmptyMessage(MSG_DATA_CHANGE);
        return;
    }

    private void checkUpdate() {
        MappedByteBuffer r0 = this.aBuffer;
        if (r0 == null) goto L47;
        File r1 = this.aFile;
        if (r1 == null) goto L50;
        int r12 = (int) r1.length();
        if (r12 > 0) goto L12;
        error("invalid file length");
        return;
    L12:
        if (this.aBuffer.capacity() == r12) goto L17;
        long r6 = r12;
        this.aChannel.truncate(r6);
        r0 = this.aChannel.map(FileChannel.MapMode.READ_WRITE, 0, r6);
        if (r0 == null) goto L51;
        this.aBuffer = r0;
        r0.order(ByteOrder.LITTLE_ENDIAN);
        goto L17
    L51:
        return;
    L17:
        long r4 = r12;
        if (this.bChannel.size() == r4) goto L20;
        this.bChannel.truncate(r4);
    L20:
        int r13 = r0.capacity();
        int r2 = r0.getInt(0);
        int r3 = AbsFastKV.unpackSize(r2);
        boolean r22 = AbsFastKV.isCipher(r2);
        if (r3 < 0) goto L46;
        if (r3 > r13) goto L46;
        long r42 = r0.getLong(MSG_CLEAR);
        int r14 = r3 + 12;
        long r62 = this.updateHash;
        if (r14 >= (r0.capacity() - 8)) goto L27;
        r62 = r0.getLong(r14);
    L27:
        if (r14 == this.dataEnd) goto L29;
    L32:
        this.dataEnd = r14;
        this.checksum = r42;
        this.updateHash = r62;
        if (this.listeners.isEmpty() == false) goto L35;
        HashMap<String, Container.BaseContainer> r02 = null;
    L36:
        reloadData();
        if (r42 == this.fastBuffer.getChecksum(12, r3)) goto L39;
    L43:
        clearData();
        return;
    L39:
        if (parseData(r22) == false) goto L43;
        if (r02 == null) goto L49;
        checkDiff(r02);
        return;
    L49:
        return;
    L35:
        r02 = new HashMap(this.data);
        goto L36
    L29:
        if (r42 != this.checksum) goto L32;
        if (r62 != this.updateHash) goto L32;
        return;
    L46:
        throw new IllegalStateException("Invalid file, dataSize:" + r3 + ", capacity:" + r13);
    L50:
        return;
    }

    private void clearData() {
        resetMemory();
        alignAToBuffer();     // Catch: Exception -> L7
        this.aBuffer.putInt(0, packSize(0));     // Catch: Exception -> L7
        this.aBuffer.putLong(MSG_CLEAR, 0);     // Catch: Exception -> L7
        getUpdateHash();     // Catch: Exception -> L7
        if (Utils.makeFileIfNotExist(this.bFile) == false) goto L9;
        setBFileSize(AbsFastKV.PAGE_SIZE);     // Catch: Exception -> L7
        syncAToB(0, 12);     // Catch: Exception -> L7
        trySettingObserver();     // Catch: Exception -> L7
    L9:
        Utils.deleteFile(new File(this.path + this.name));
        this.kvHandler.sendEmptyMessage(MSG_CLEAR);
        return;
    L7:
        e = move-exception;
        error(e);
        this.needFullWrite = true;
        goto L9
    }

    public static /* synthetic */ void d(MPFastKV r0) {
        r0.updateFile();
    }

    public static /* synthetic */ void e(MPFastKV r0) {
        r0.loadData();
    }

    private boolean fullWrite() {
        FastBuffer r0 = this.fastBuffer;
        r0.position = 0;
        int r02 = AbsFastKV.unpackSize(r0.getInt());
        long r1 = this.fastBuffer.getLong();
        this.checksum = r1;
        this.dataEnd = r02 + 12;
        if (r1 == this.fastBuffer.getChecksum(12, r02)) goto L5;
        clearData();
        return true;
    L5:
        return writeToABFile(this.fastBuffer);
    }

    private void fullWriteAToB() {
    L7:
        e = move-exception;
        error(e);
        return;
    L3:
        if (Utils.makeFileIfNotExist(this.bFile) == true) goto L5;
        return;
    L5:
        setBFileSize(this.aBuffer.capacity());     // Catch: Exception -> L7
        syncAToB(0, this.dataEnd);     // Catch: Exception -> L7
    }

    private void fullWriteBufferToA() {
    L6:
        e = move-exception;
        error(e);
        return;
    L3:
        if (alignAToBuffer() == false) goto L8;
        this.aBuffer.position(0);     // Catch: Exception -> L6
        this.aBuffer.put(this.fastBuffer.hb, 0, this.dataEnd);     // Catch: Exception -> L6
        return;
    }

    private void getUpdateHash() {
        MappedByteBuffer r0 = this.aBuffer;
        if (r0 != null) goto L5;
        return;
    L5:
        if ((this.dataEnd + 8) >= r0.capacity()) goto L9;
        this.updateHash = this.aBuffer.getLong(this.dataEnd);
        return;
    }

    private /* synthetic */ void lambda$updateFile$0(String r4) {
        Utils.deleteFile(new File(this.path + this.name, r4));
    }

    private synchronized void loadData() {
        monitor-enter(this);
        HashMap<String, Container.BaseContainer> r1 = this.data;     // Catch: Throwable -> L12
        monitor-enter(r1);     // Catch: Throwable -> L12
        this.startLoading = true;     // Catch: Throwable -> L29
        this.data.notify();     // Catch: Throwable -> L29
        monitor-exit(r1);     // Catch: Throwable -> L29
        long r12 = System.nanoTime();     // Catch: Throwable -> L12
        if (loadFromCFile() == true) goto L15;
        loadFromABFile();     // Catch: Throwable -> L12
    L15:
        if (this.fastBuffer != null) goto L18;
        this.fastBuffer = new FastBuffer(AbsFastKV.PAGE_SIZE);     // Catch: Throwable -> L12
    L18:
        if (this.dataEnd != 0) goto L21;
        this.dataEnd = 12;     // Catch: Throwable -> L12
    L21:
        if (this.needRewrite == false) goto L24;
        rewrite();     // Catch: Throwable -> L12
        info("rewrite data");     // Catch: Throwable -> L12
    L24:
        if (this.logger == null) goto L26;
        info("loading finish, data len:" + this.dataEnd + ", get keys:" + this.data.size() + ", use time:" + ((System.nanoTime() - r12) / 1000000) + " ms");     // Catch: Throwable -> L12
    L26:
        trySettingObserver();     // Catch: Throwable -> L12
        monitor-exit(this);
        return;
    L29:
        th = move-exception;
        throw th;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    }

    private void loadFromABFile() {
        int r1 = 0;
        int r2 = 0;
    L75:
    L8:
        e = move-exception;
        error(e);
        resetMemory();
        return;
    L4:
        if (Utils.makeFileIfNotExist(this.aFile) == false) goto L11;
        if (Utils.makeFileIfNotExist(this.bFile) == false) goto L11;
    L14:
        if (this.aFile.exists() == true) goto L16;
    L71:
        error(new Exception("open file failed"));     // Catch: Exception -> L8
        return;
    L16:
        if (this.bFile.exists() == false) goto L71;
        this.aAccessFile = new RandomAccessFile(this.aFile, "rw");     // Catch: Exception -> L8
        this.bAccessFile = new RandomAccessFile(this.bFile, "rw");     // Catch: Exception -> L8
        long r22 = this.aAccessFile.length();     // Catch: Exception -> L8
        long r4 = this.bAccessFile.length();     // Catch: Exception -> L8
        this.aChannel = this.aAccessFile.getChannel();     // Catch: Exception -> L8
        FileChannel r0 = this.bAccessFile.getChannel();     // Catch: Exception -> L8
        this.bChannel = r0;     // Catch: Exception -> L8
        FileLock r6 = r0.lock();     // Catch: Exception -> L8
        FileChannel r7 = this.aChannel;     // Catch: Throwable -> L29 IOException -> L65
        FileChannel.MapMode r8 = FileChannel.MapMode.READ_WRITE;     // Catch: Throwable -> L29 IOException -> L65
        if (r22 <= 0) goto L22;
        long r11 = r22;
    L23:
        MappedByteBuffer r72 = r7.map(r8, 0, r11);     // Catch: Throwable -> L29 IOException -> L65
        this.aBuffer = r72;     // Catch: Throwable -> L29 IOException -> L65
        r72.order(ByteOrder.LITTLE_ENDIAN);     // Catch: Throwable -> L29 IOException -> L65
    L25:
        if (r22 != 0) goto L32;
        if (r4 != 0) goto L32;
        this.dataEnd = 12;     // Catch: Throwable -> L29
        RandomAccessFile r02 = this.bAccessFile;     // Catch: Throwable -> L29
        int r12 = AbsFastKV.PAGE_SIZE;     // Catch: Throwable -> L29
        r02.setLength(r12);     // Catch: Throwable -> L29
        this.bChannel.truncate(r12);     // Catch: Throwable -> L29
    L62:
        getUpdateHash();     // Catch: Throwable -> L29
        r6.release();     // Catch: Exception -> L8
        return;
    L32:
        if (loadWithBlockingIO(this.bFile) == true) goto L34;
        this.updateCount = 0;     // Catch: Throwable -> L29
        resetData();     // Catch: Throwable -> L29
        FastBuffer r03 = this.fastBuffer;     // Catch: Throwable -> L29
        if (r03 != null) goto L50;
    L51:
        this.fastBuffer = new FastBuffer(this.aBuffer.capacity());     // Catch: Throwable -> L29
    L52:
        int r04 = this.aBuffer.getInt();     // Catch: Throwable -> L29
        int r42 = AbsFastKV.unpackSize(r04);     // Catch: Throwable -> L29
        boolean r05 = AbsFastKV.isCipher(r04);     // Catch: Throwable -> L29
        if (r42 >= 0) goto L55;
    L61:
        error("both files error");     // Catch: Throwable -> L29
        clearData();     // Catch: Throwable -> L29
        goto L62
    L55:
        if (r42 > (r22 - 12)) goto L61;
        this.dataEnd = r42 + 12;     // Catch: Throwable -> L29
        long r23 = this.aBuffer.getLong(MSG_CLEAR);     // Catch: Throwable -> L29
        this.aBuffer.rewind();     // Catch: Throwable -> L29
        this.aBuffer.get(this.fastBuffer.hb, 0, this.dataEnd);     // Catch: Throwable -> L29
        if (r23 != this.fastBuffer.getChecksum(12, r42)) goto L61;
        if (parseData(r05) == false) goto L61;
        this.checksum = r23;     // Catch: Throwable -> L29
        warning(new Exception("B file error"));     // Catch: Throwable -> L29
        fullWriteAToB();     // Catch: Throwable -> L29
        goto L62
    L50:
        if (r03.hb.length == this.aBuffer.capacity()) goto L52;
    L34:
        if (r22 == r4) goto L36;
    L46:
        warning(new Exception("A file error"));     // Catch: Throwable -> L29
        fullWriteBufferToA();     // Catch: Throwable -> L29
        goto L62
    L36:
        if (this.fastBuffer.hb.length != this.aBuffer.capacity()) goto L46;
        byte[] r06 = this.fastBuffer.hb;     // Catch: Throwable -> L29
        int r24 = this.dataEnd;     // Catch: Throwable -> L29
        byte[] r3 = new byte[r24];     // Catch: Throwable -> L29
        this.aBuffer.get(r3, 0, r24);     // Catch: Throwable -> L29
    L38:
        int r25 = this.dataEnd;     // Catch: Throwable -> L29
        if (r1 >= r25) goto L44;
        if (r3[r1] != r06[r1]) goto L44;
        r1 = r1 + 1;     // Catch: Throwable -> L29
    L44:
        if (r1 != r25) goto L46;
    L22:
        r11 = AbsFastKV.PAGE_SIZE;     // Catch: Throwable -> L29 IOException -> L65
    L65:
        e = move-exception;
        error(e);     // Catch: Throwable -> L29
        tryBlockingIO(this.aFile, this.bFile);     // Catch: Throwable -> L29
        r6.release();     // Catch: Exception -> L8
        return;
    L29:
        th = move-exception;
        r6.release();     // Catch: Exception -> L8
        throw th;     // Catch: Exception -> L8
    L11:
        if (r2 >= MSG_DATA_CHANGE) goto L14;
        Thread.sleep(20);     // Catch: Exception -> L8
        r2 = r2 + 1;     // Catch: Exception -> L8
        goto L75
    }

    private boolean loadFromCFile() {
        File r0 = new File(this.path, z30.l(new StringBuilder(), this.name, ".kvc"));
        File r1 = new File(this.path, z30.l(new StringBuilder(), this.name, ".tmp"));
        boolean r2 = false;
    L16:
        e = move-exception;
        error(e);
        return r2;
    L4:
        if (r0.exists() == false) goto L7;
    L10:
        if (r0 != null) goto L12;
    L20:
        return r2;
    L12:
        if (loadWithBlockingIO(r0) == true) goto L14;
        resetMemory();     // Catch: Exception -> L16
    L19:
        deleteCFiles();     // Catch: Exception -> L16
        goto L20
    L14:
        if (writeToABFile(this.fastBuffer) == false) goto L19;
        info("recover from c file");     // Catch: Exception -> L16
        r2 = true;
        goto L19
    L7:
        if (r1.exists() == false) goto L9;
        r0 = r1;
        goto L10
    L9:
        r0 = null;
        goto L10
    }

    private synchronized void notifyChangedKeys() {
        monitor-enter(this);
    L9:
        th = move-exception;
        throw th;
    L4:
        if (this.changedKey.isEmpty() == true) goto L12;
        Iterator<String> r0 = this.changedKey.iterator();     // Catch: Throwable -> L9
    L7:
        if (r0.hasNext() == false) goto L11;
        notifyListeners(r0.next());     // Catch: Throwable -> L9
        goto L7
    L11:
        this.changedKey.clear();     // Catch: Throwable -> L9
    L12:
        monitor-exit(this);
    }

    private synchronized void refresh() {
        monitor-enter(this);
        lockAndCheckUpdate();     // Catch: Throwable -> L6
        releaseLock();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    private synchronized void releaseLock() {
        monitor-enter(this);
        FileLock r0 = this.bFileLock;     // Catch: Throwable -> L7
        if (r0 != null) goto L16;
    L12:
        monitor-exit(this);
        return;
    L16:
        r0.release();     // Catch: Throwable -> L7 Exception -> L9
    L11:
        this.bFileLock = null;     // Catch: Throwable -> L7
        this.kvHandler.removeMessages(2);     // Catch: Throwable -> L7
        goto L12
    L9:
        e = move-exception;
        error(e);     // Catch: Throwable -> L7
    L7:
        th = move-exception;
        throw th;
    }

    private void reloadData() {
        this.data.clear();
        clearInvalid();
        int r0 = this.aBuffer.capacity();
        FastBuffer r1 = this.fastBuffer;
        if (r1 != null) goto L6;
        this.fastBuffer = new FastBuffer(r0);
    L8:
        this.aBuffer.rewind();
        this.aBuffer.get(this.fastBuffer.hb, 0, this.dataEnd);
        return;
    L6:
        if (r1.hb.length == r0) goto L8;
        r1.hb = new byte[r0];
        goto L8
    }

    private void reloadFromABuffer() {
        if (this.aBuffer == null) goto L13;
        reloadData();
        getUpdateHash();
        FastBuffer r0 = this.fastBuffer;
        r0.position = 0;
        int r02 = r0.getInt();
        int r1 = AbsFastKV.unpackSize(r02);
        boolean r03 = AbsFastKV.isCipher(r02);
        long r2 = this.fastBuffer.getLong();
        this.checksum = r2;
        this.dataEnd = r1 + 12;
        if (r2 == this.fastBuffer.getChecksum(12, r1)) goto L8;
    L11:
        clearData();
        return;
    L8:
        if (parseData(r03) == false) goto L11;
        return;
    }

    private void setBFileSize(int r5) {
        if (this.bAccessFile != null) goto L6;
        this.bAccessFile = new RandomAccessFile(this.bFile, "rw");
    L6:
        if (this.bChannel != null) goto L8;
        this.bChannel = this.bAccessFile.getChannel();
    L8:
        long r2 = r5;
        if (this.bChannel.size() == r2) goto L12;
        this.bAccessFile.setLength(r2);
        this.bChannel.truncate(r2);
        return;
    }

    private void syncAToB(int r6, int r7) {
        MappedByteBuffer r0 = this.aBuffer;
        r0.position(r6);
        r0.limit(r7 + r6);
        if (this.bChannel.size() == r0.capacity()) goto L5;
        this.bChannel.truncate(r0.capacity());
    L5:
        this.bChannel.position(r6);
    L7:
        if (r0.hasRemaining() == false) goto L9;
        this.bChannel.write(r0);
        goto L7
    L9:
        r0.limit(r0.capacity());
    }

    private void syncBufferToA(int r3, int r4) {
        byte[] r0 = this.fastBuffer.hb;
        this.aBuffer.position(r3);
        this.aBuffer.put(r0, r3, r4);
    }

    private void truncate() {
        int r0 = AbsFastKV.PAGE_SIZE;
        int r02 = getNewCapacity(r0, this.dataEnd + r0);
        byte[] r1 = this.fastBuffer.hb;
        if (r02 < r1.length) goto L5;
        return;
    L5:
        byte[] r2 = new byte[r02];
        System.arraycopy(r1, 0, r2, 0, this.dataEnd);
        this.fastBuffer.hb = r2;
        long r6 = r02;
        this.aChannel.truncate(r6);     // Catch: Exception -> L8
        MappedByteBuffer r03 = this.aChannel.map(FileChannel.MapMode.READ_WRITE, 0, r6);     // Catch: Exception -> L8
        this.aBuffer = r03;     // Catch: Exception -> L8
        r03.order(ByteOrder.LITTLE_ENDIAN);     // Catch: Exception -> L8
        this.bAccessFile.setLength(r6);     // Catch: Exception -> L8
        this.bChannel.truncate(r6);     // Catch: Exception -> L8
    L10:
        info("truncate finish");
        return;
    L8:
        e = move-exception;
        error(new Exception("map failed", e));
        this.needFullWrite = true;
        goto L10
    }

    private void trySettingObserver() {
        if (this.needWatchFileChange == true) goto L5;
        return;
    L5:
        if (this.fileObserver != null) goto L13;
        File r0 = this.bFile;
        if (r0 != null) goto L9;
        return;
    L9:
        if (r0.exists() == false) goto L15;
        this.fileObserver = new KVFileObserver(this, this.bFile.getPath());
        this.fileObserver.startWatching();
        return;
    L15:
        return;
    }

    private synchronized boolean updateFile() {
        monitor-enter(this);
    L15:
        th = move-exception;
        throw th;
    L5:
        if (this.bFileLock != null) goto L9;
        monitor-exit(this);
        return false;
    L9:
        if (this.fastBuffer != null) goto L11;
    L84:
        releaseLock();     // Catch: Throwable -> L15
        monitor-exit(this);
        return false;
    L11:
        if (this.updateCount != 0) goto L90;
        if (this.needFullWrite == false) goto L84;
    L90:
        int r3 = packSize(this.dataEnd - 12);     // Catch: Throwable -> L24 Exception -> L26
        this.fastBuffer.putInt(0, r3);     // Catch: Throwable -> L24 Exception -> L26
        this.fastBuffer.putLong(MSG_CLEAR, this.checksum);     // Catch: Throwable -> L24 Exception -> L26
        if (this.needFullWrite == false) goto L35;
        boolean r32 = fullWrite();     // Catch: Throwable -> L24 Exception -> L26
        if (r32 == false) goto L28;
        this.needFullWrite = false;     // Catch: Throwable -> L24 Exception -> L26
    L28:
        this.updateCount = 0;     // Catch: Throwable -> L15
        if (this.deletedFiles.isEmpty() == true) goto L31;
        this.deletedFiles.clear();     // Catch: Throwable -> L15
    L31:
        waitExternalWriting();     // Catch: Throwable -> L15
        releaseLock();     // Catch: Throwable -> L15
        this.kvHandler.sendEmptyMessage(MSG_DATA_CHANGE);     // Catch: Throwable -> L15
        monitor-exit(this);
        return r32;
    L35:
        if (alignAToBuffer() == false) goto L37;
        setBFileSize(this.aBuffer.capacity());     // Catch: Throwable -> L24 Exception -> L26
        this.aBuffer.putInt(0, r3);     // Catch: Throwable -> L24 Exception -> L26
        this.aBuffer.putLong(MSG_CLEAR, this.checksum);     // Catch: Throwable -> L24 Exception -> L26
        int r33 = 0;
    L48:
        if (r33 >= this.updateCount) goto L51;
        int[] r5 = this.updateStartAndSize;     // Catch: Throwable -> L24 Exception -> L26
        syncBufferToA(r5[r33], r5[r33 + 1]);     // Catch: Throwable -> L24 Exception -> L26
        r33 = r33 + 2;     // Catch: Throwable -> L24 Exception -> L26
        goto L48
    L51:
        if ((this.dataEnd + 8) >= this.aBuffer.capacity()) goto L53;
        long r52 = random.nextLong() ^ System.nanoTime();     // Catch: Throwable -> L24 Exception -> L26
        this.updateHash = r52;     // Catch: Throwable -> L24 Exception -> L26
        this.aBuffer.putLong(this.dataEnd, r52);     // Catch: Throwable -> L24 Exception -> L26
    L53:
        syncAToB(0, 12);     // Catch: Throwable -> L24 Exception -> L26
        int r34 = 0;
    L55:
        if (r34 >= this.updateCount) goto L58;
        int[] r4 = this.updateStartAndSize;     // Catch: Throwable -> L24 Exception -> L26
        syncAToB(r4[r34], r4[r34 + 1]);     // Catch: Throwable -> L24 Exception -> L26
        r34 = r34 + 2;     // Catch: Throwable -> L24 Exception -> L26
        goto L55
    L58:
        if (this.deletedFiles.isEmpty() == true) goto L64;
        Iterator<String> r35 = this.deletedFiles.iterator();     // Catch: Throwable -> L24 Exception -> L26
    L61:
        if (r35.hasNext() == false) goto L64;
        FastKVConfig.getExecutor().execute(new t5(this, MSG_CLEAR, r35.next()));     // Catch: Throwable -> L24 Exception -> L26
    L64:
        if ((this.fastBuffer.hb.length - this.dataEnd) <= AbsFastKV.TRUNCATE_THRESHOLD) goto L66;
        truncate();     // Catch: Throwable -> L24 Exception -> L26
    L66:
        this.updateCount = 0;     // Catch: Throwable -> L15
        if (this.deletedFiles.isEmpty() == true) goto L69;
        this.deletedFiles.clear();     // Catch: Throwable -> L15
    L69:
        waitExternalWriting();     // Catch: Throwable -> L15
        releaseLock();     // Catch: Throwable -> L15
        this.kvHandler.sendEmptyMessage(MSG_DATA_CHANGE);     // Catch: Throwable -> L15
        monitor-exit(this);
        return true;
    L37:
        if (this.aBuffer == null) goto L39;
        reloadFromABuffer();     // Catch: Throwable -> L24 Exception -> L26
    L40:
        this.updateCount = 0;     // Catch: Throwable -> L15
        if (this.deletedFiles.isEmpty() == true) goto L43;
        this.deletedFiles.clear();     // Catch: Throwable -> L15
    L43:
        waitExternalWriting();     // Catch: Throwable -> L15
        releaseLock();     // Catch: Throwable -> L15
        this.kvHandler.sendEmptyMessage(MSG_DATA_CHANGE);     // Catch: Throwable -> L15
        monitor-exit(this);
        return false;
    L39:
        this.needFullWrite = true;     // Catch: Throwable -> L24 Exception -> L26
    L24:
        th = move-exception;
        this.updateCount = 0;     // Catch: Throwable -> L15
        if (this.deletedFiles.isEmpty() == true) goto L82;
        this.deletedFiles.clear();     // Catch: Throwable -> L15
    L82:
        waitExternalWriting();     // Catch: Throwable -> L15
        releaseLock();     // Catch: Throwable -> L15
        this.kvHandler.sendEmptyMessage(MSG_DATA_CHANGE);     // Catch: Throwable -> L15
        throw th;     // Catch: Throwable -> L15
    L26:
        e = move-exception;
        error(e);     // Catch: Throwable -> L24
        this.needFullWrite = true;     // Catch: Throwable -> L24
        this.updateCount = 0;     // Catch: Throwable -> L15
        if (this.deletedFiles.isEmpty() == true) goto L76;
        this.deletedFiles.clear();     // Catch: Throwable -> L15
    L76:
        waitExternalWriting();     // Catch: Throwable -> L15
        releaseLock();     // Catch: Throwable -> L15
        this.kvHandler.sendEmptyMessage(MSG_DATA_CHANGE);     // Catch: Throwable -> L15
        return false;
    }

    private void waitExternalWriting() {
    L3:
        if (this.externalExecutor.isEmpty() == true) goto L7;
        Thread.sleep(10);     // Catch: Exception -> L8
        goto L3
    }

    private boolean writeToABFile(FastBuffer r8) {
        int r0 = r8.hb.length;
    L10:
        e = move-exception;
        error(e);
        return false;
    L4:
        if (Utils.makeFileIfNotExist(this.aFile) == false) goto L34;
        if (Utils.makeFileIfNotExist(this.bFile) == false) goto L34;
        if (this.bAccessFile != null) goto L13;
        this.bAccessFile = new RandomAccessFile(this.bFile, "rw");     // Catch: Exception -> L10
    L13:
        if (this.bChannel != null) goto L16;
        this.bChannel = this.bAccessFile.getChannel();     // Catch: Exception -> L10
    L16:
        if (this.bFileLock != null) goto L19;
        FileLock r2 = this.bChannel.lock();     // Catch: Exception -> L10
    L38:
        alignAToBuffer();     // Catch: Throwable -> L23
        this.aBuffer.put(r8.hb, 0, this.dataEnd);     // Catch: Throwable -> L23
        getUpdateHash();     // Catch: Throwable -> L23
        long r5 = r0;
        if (this.bAccessFile.length() == r5) goto L25;
        this.bAccessFile.setLength(r5);     // Catch: Throwable -> L23
    L25:
        this.bChannel.truncate(r5);     // Catch: Throwable -> L23
        syncAToB(0, this.dataEnd);     // Catch: Throwable -> L23
        this.bChannel.force(false);     // Catch: Throwable -> L23
        if (r2 == null) goto L28;
        r2.release();     // Catch: Exception -> L10
    L28:
        trySettingObserver();     // Catch: Exception -> L10
        return true;
    L23:
        th = move-exception;
        if (r2 == null) goto L32;
        r2.release();     // Catch: Exception -> L10
    L32:
        throw th;     // Catch: Exception -> L10
    L19:
        r2 = null;
    L34:
        throw new Exception("open file failed");     // Catch: Exception -> L10
    }

    @Override // android.content.SharedPreferences.Editor
    public void apply() {
        this.applyExecutor.execute(new is(this, 1));
    }

    @Override // io.fastkv.AbsFastKV
    public void checkGC() {
        if (this.invalidBytes < bytesThreshold()) goto L5;
    L8:
        gc(0);
        return;
    L5:
        if (this.invalids.size() >= 80) goto L8;
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor clear() {
        monitor-enter(this);
        lockAndCheckUpdate();     // Catch: Throwable -> L6
        clearData();     // Catch: Throwable -> L6
        releaseLock();     // Catch: Throwable -> L6
        monitor-exit(this);
        return this;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // android.content.SharedPreferences.Editor
    public boolean commit() {
        return updateFile();
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ boolean contains(String r1) {
        return super.contains(r1);
    }

    @Override // io.fastkv.AbsFastKV
    public void copyToMainFile(FastKV r1) {
        writeToABFile(r1.fastBuffer);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ SharedPreferences.Editor edit() {
        return super.edit();
    }

    @Override // io.fastkv.AbsFastKV
    public void ensureSize(int r4) {
        int r0 = this.fastBuffer.hb.length;
        int r1 = (this.dataEnd + r4) + 8;
        if (r1 < r0) goto L6;
        byte[] r42 = new byte[getNewCapacity(r0, r1)];
        System.arraycopy(this.fastBuffer.hb, 0, r42, 0, this.dataEnd);
        this.fastBuffer.hb = r42;
        return;
    }

    public synchronized void force() {
        monitor-enter(this);
        MappedByteBuffer r0 = this.aBuffer;     // Catch: Throwable -> L6 Exception -> L8
        if (r0 == null) goto L10;
        r0.force();     // Catch: Throwable -> L6 Exception -> L8
    L10:
        FileChannel r02 = this.bChannel;     // Catch: Throwable -> L6 Exception -> L8
        if (r02 == null) goto L15;
        r02.force(false);     // Catch: Throwable -> L6 Exception -> L8
    L15:
        monitor-exit(this);
        return;
    L8:
        e = move-exception;
        error(e);     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        throw th;
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ Map getAll() {
        return super.getAll();
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ byte[] getArray(String r1) {
        return super.getArray(r1);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ boolean getBoolean(String r1) {
        return super.getBoolean(r1);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ double getDouble(String r3) {
        return super.getDouble(r3);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ float getFloat(String r1) {
        return super.getFloat(r1);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ int getInt(String r1) {
        return super.getInt(r1);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ long getLong(String r3) {
        return super.getLong(r3);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ Object getObject(String r1) {
        return super.getObject(r1);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ String getString(String r1) {
        return super.getString(r1);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ Set getStringSet(String r1) {
        return super.getStringSet(r1);
    }

    @Override // io.fastkv.AbsFastKV
    public void handleChange(String r2) {
        if (this.listeners.isEmpty() == true) goto L6;
        this.changedKey.add(r2);
        return;
    }

    @Override // io.fastkv.AbsFastKV
    public void lockAndCheckUpdate() {
        if (this.bFileLock == null) goto L6;
        return;
    L6:
        if (this.bChannel != null) goto L8;
        loadFromABFile();
        trySettingObserver();
    L8:
        FileChannel r0 = this.bChannel;
        if (r0 == null) goto L25;
        this.bFileLock = r0.lock();     // Catch: Exception -> L15
        checkUpdate();     // Catch: Throwable -> L17
        this.kvHandler.sendEmptyMessageDelayed(2, 3000);     // Catch: Exception -> L15
        return;
    L17:
        th = move-exception;
        this.kvHandler.sendEmptyMessageDelayed(2, 3000);     // Catch: Exception -> L15
        throw th;     // Catch: Exception -> L15
    L15:
        e = move-exception;
        error(e);
        return;
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ void putAll(Map r1) {
        super.putAll(r1);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ SharedPreferences.Editor putArray(String r1, byte[] r2) {
        return super.putArray(r1, r2);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ SharedPreferences.Editor putBoolean(String r1, boolean r2) {
        return super.putBoolean(r1, r2);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ SharedPreferences.Editor putDouble(String r1, double r2) {
        return super.putDouble(r1, r2);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ SharedPreferences.Editor putFloat(String r1, float r2) {
        return super.putFloat(r1, r2);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ SharedPreferences.Editor putInt(String r1, int r2) {
        return super.putInt(r1, r2);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ SharedPreferences.Editor putLong(String r1, long r2) {
        return super.putLong(r1, r2);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ SharedPreferences.Editor putObject(String r1, Object r2, FastEncoder r3) {
        return super.putObject(r1, r2, r3);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ SharedPreferences.Editor putString(String r1, String r2) {
        return super.putString(r1, r2);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ SharedPreferences.Editor putStringSet(String r1, Set r2) {
        return super.putStringSet(r1, r2);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener r1) {
        super.registerOnSharedPreferenceChangeListener(r1);
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor remove(String r6) {
        monitor-enter(this);
        lockAndCheckUpdate();     // Catch: Throwable -> L8
        handleChange(r6);     // Catch: Throwable -> L8
        Container.BaseContainer r0 = this.data.get(r6);     // Catch: Throwable -> L8
        if (r0 == null) goto L16;
        this.data.remove(r6);     // Catch: Throwable -> L8
        this.bigValueCache.remove(r6);     // Catch: Throwable -> L8
        this.externalCache.remove(r6);     // Catch: Throwable -> L8
        byte r1 = r0.getType();     // Catch: Throwable -> L8
        String r3 = null;
        if (r1 > 5) goto L10;
        int r62 = FastBuffer.getStringSize(r6);     // Catch: Throwable -> L8
        int r02 = r0.offset;     // Catch: Throwable -> L8
        remove(r1, r02 - (r62 + 2), r02 + AbsFastKV.TYPE_SIZE[r1]);     // Catch: Throwable -> L8
    L13:
        if (r3 == null) goto L15;
        this.deletedFiles.add(r3);     // Catch: Throwable -> L8
    L15:
        checkGC();     // Catch: Throwable -> L8
        goto L16
    L10:
        Container.VarContainer r03 = (Container.VarContainer) r0;     // Catch: Throwable -> L8
        remove(r1, r03.start, r03.offset + r03.valueSize);     // Catch: Throwable -> L8
        if (r03.external == false) goto L13;
        r3 = (String) r03.value;     // Catch: Throwable -> L8
    L16:
        monitor-exit(this);
        return this;
    L8:
        th = move-exception;
        throw th;
    }

    @Override // io.fastkv.AbsFastKV
    public void removeOldFile(String r2) {
        this.deletedFiles.add(r2);
    }

    @Override // io.fastkv.AbsFastKV
    public void resetData() {
        super.resetData();
        this.updateHash = 0;
    }

    @Override // io.fastkv.AbsFastKV
    public void syncCompatBuffer(int r2, int r3, int r4) {
        int r42 = 0;
    L4:
        if (r42 >= this.updateCount) goto L9;
        int r0 = this.updateStartAndSize[r42];
        if (r0 >= r2) goto L8;
        r2 = r0;
    L8:
        r42 = r42 + 2;
        goto L4
    L9:
        int[] r43 = this.updateStartAndSize;
        r43[0] = r2;
        r43[1] = this.dataEnd - r2;
        this.updateCount = 2;
    }

    public synchronized String toString() {
        monitor-enter(this);
        String r0 = "MPFastKV: path:" + this.path + " name:" + this.name;     // Catch: Throwable -> L7
        monitor-exit(this);
        return r0;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener r1) {
        super.unregisterOnSharedPreferenceChangeListener(r1);
    }

    @Override // io.fastkv.AbsFastKV
    public void updateBoolean(byte r5, int r6) {
        this.checksum ^= shiftCheckSum(1, r6);
        this.fastBuffer.hb[r6] = r5;
        addUpdate(r6, 1);
    }

    @Override // io.fastkv.AbsFastKV
    public void updateBytes(int r1, byte[] r2) {
        super.updateBytes(r1, r2);
        addUpdate(r1, r2.length);
    }

    @Override // io.fastkv.AbsFastKV
    public void updateChange() {
        this.checksum ^= this.fastBuffer.getChecksum(this.updateStart, this.updateSize);
        int r0 = this.updateSize;
        if (r0 == 0) goto L6;
        addUpdate(this.updateStart, r0);
        this.updateSize = 0;
        return;
    }

    @Override // io.fastkv.AbsFastKV
    public void updateInt32(int r3, long r4, int r6) {
        long r0 = this.checksum;
        this.checksum = shiftCheckSum(r4, r6) ^ r0;
        this.fastBuffer.putInt(r6, r3);
        addUpdate(r6, MSG_CLEAR);
    }

    @Override // io.fastkv.AbsFastKV
    public void updateInt64(long r3, long r5, int r7) {
        long r0 = this.checksum;
        this.checksum = shiftCheckSum(r5, r7) ^ r0;
        this.fastBuffer.putLong(r7, r3);
        addUpdate(r7, 8);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ byte[] getArray(String r1, byte[] r2) {
        return super.getArray(r1, r2);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ boolean getBoolean(String r1, boolean r2) {
        return super.getBoolean(r1, r2);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ double getDouble(String r1, double r2) {
        return super.getDouble(r1, r2);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ float getFloat(String r1, float r2) {
        return super.getFloat(r1, r2);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ int getInt(String r1, int r2) {
        return super.getInt(r1, r2);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ long getLong(String r1, long r2) {
        return super.getLong(r1, r2);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ String getString(String r1, String r2) {
        return super.getString(r1, r2);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ Set getStringSet(String r1, Set r2) {
        return super.getStringSet(r1, r2);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ void putAll(Map r1, Map r2) {
        super.putAll(r1, r2);
    }

    @Override // io.fastkv.AbsFastKV
    public void remove(byte r1, int r2, int r3) {
        super.remove(r1, r2, r3);
        addUpdate(r2, 1);
    }
}
