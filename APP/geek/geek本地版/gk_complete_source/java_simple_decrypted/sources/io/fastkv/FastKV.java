package io.fastkv;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.rj;
import defpackage.sj;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class FastKV extends AbsFastKV {
    static final int ASYNC_BLOCKING = 1;
    static final int NON_BLOCKING = 0;
    static final int SYNC_BLOCKING = 2;
    private MappedByteBuffer aBuffer;
    private FileChannel aChannel;
    private final Executor applyExecutor;
    boolean autoCommit;
    private MappedByteBuffer bBuffer;
    private FileChannel bChannel;
    private int removeStart;
    private int writingMode;

    public static final class Builder {
        static final Map<String, FastKV> INSTANCE_MAP = null;
        private FastCipher cipher;
        private FastEncoder[] encoders;
        private final String name;
        private final String path;
        private int writingMode;

        static {
            INSTANCE_MAP = new ConcurrentHashMap();
        }

        public Builder(Context r2, String r3) {
            this.writingMode = 0;
            if (r2 == null) goto L12;
            if (r3 == null) goto L10;
            if (r3.isEmpty() == true) goto L10;
            this.path = r2.getFilesDir().getAbsolutePath() + "/fastkv/";
            this.name = r3;
            return;
        L10:
            throw new IllegalArgumentException("name is empty");
        L12:
            throw new IllegalArgumentException("context is null");
        }

        public Builder asyncBlocking() {
            this.writingMode = 1;
            return this;
        }

        public Builder blocking() {
            this.writingMode = 2;
            return this;
        }

        public FastKV build() {
            String r0 = this.path + this.name;
            Map<String, FastKV> r1 = INSTANCE_MAP;
            FastKV r2 = r1.get(r0);
            if (r2 == null) goto L5;
            return r2;
        L5:
            monitor-enter(Builder.class);
            FastKV r22 = r1.get(r0);     // Catch: Throwable -> L9
            if (r22 != null) goto L11;
            FastKV r4 = new FastKV(this.path, this.name, this.encoders, this.cipher, this.writingMode);     // Catch: Throwable -> L9
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

        public Builder encoder(FastEncoder[] r1) {
            this.encoders = r1;
            return this;
        }

        public Builder(String r3, String r4) {
            this.writingMode = 0;
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
    }

    public FastKV(String r1, String r2, FastEncoder[] r3, FastCipher r4, int r5) {
        super(r1, r2, r3, r4);
        this.autoCommit = true;
        this.applyExecutor = new LimitExecutor();
        this.writingMode = r5;
        HashMap<String, Container.BaseContainer> r12 = this.data;
        monitor-enter(r12);
        FastKVConfig.getExecutor().execute(new sj(this, 1));     // Catch: Throwable -> L9
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

    public static SharedPreferences adapt(Context r3, String r4) {
        FastKV r0 = new Builder(r3.getFilesDir().getAbsolutePath() + "/fastkv", r4).build();
        if (r0.contains("kv_import_flag") == true) goto L5;
        r0.putAll(r3.getSharedPreferences(r4, 0).getAll());
        r0.putBoolean("kv_import_flag", true);
    L5:
        return r0;
    }

    public static /* synthetic */ void c(FastKV r0) {
        r0.writeToCFile();
    }

    private void checkIfCommit() {
        if (this.writingMode != 0) goto L5;
        return;
    L5:
        if (this.autoCommit == false) goto L9;
        commitToCFile();
        return;
    }

    private void clearData() {
        if (this.writingMode == 0) goto L9;
    L7:
        resetMemory();
        Utils.deleteFile(new File(this.path + this.name));
        return;
    L9:
        resetBuffer(this.aBuffer);     // Catch: Exception -> L6
        resetBuffer(this.bBuffer);     // Catch: Exception -> L6
    L6:
        toBlockingMode();
        goto L7
    }

    private void clearDeletedFiles() {
        if (this.deletedFiles.isEmpty() == true) goto L11;
        Iterator<String> r0 = this.deletedFiles.iterator();
    L6:
        if (r0.hasNext() == false) goto L8;
        String r1 = r0.next();
        FastKVConfig.getExecutor().execute(new rj(this, r1, 2));
        goto L6
    L8:
        this.deletedFiles.clear();
        return;
    }

    private boolean commitToCFile() {
        int r0 = this.writingMode;
        if (r0 != 1) goto L7;
        this.applyExecutor.execute(new sj(this, 0));
        return true;
    L7:
        if (r0 == 2) goto L9;
        return true;
    L9:
        return writeToCFile();
    }

    private void copyBuffer(MappedByteBuffer r8, MappedByteBuffer r9, int r10) {
        if (r8.capacity() != r9.capacity()) goto L20;
    L18:
        r8.rewind();
        r9.rewind();
        r8.limit(r10);
        r9.put(r8);
        r8.limit(r8.capacity());
        return;
    L20:
    L8:
        e = move-exception;
        error(e);
        toBlockingMode();
        return;
    L5:
        if (r9 != this.bBuffer) goto L10;
        FileChannel r0 = this.bChannel;     // Catch: IOException -> L8
    L11:
        MappedByteBuffer r02 = r0.map(FileChannel.MapMode.READ_WRITE, 0, r8.capacity());     // Catch: IOException -> L8
        r02.order(ByteOrder.LITTLE_ENDIAN);     // Catch: IOException -> L8
        if (r9 != this.bBuffer) goto L14;
        this.bBuffer = r02;     // Catch: IOException -> L8
    L15:
        r9 = r02;
        goto L18
    L14:
        this.aBuffer = r02;     // Catch: IOException -> L8
        goto L15
    L10:
        r0 = this.aChannel;     // Catch: IOException -> L8
        goto L11
    }

    public static /* synthetic */ void d(FastKV r0, String r1) {
        r0.lambda$remove$0(r1);
    }

    public static /* synthetic */ void e(FastKV r0, String r1) {
        r0.lambda$removeOldFile$2(r1);
    }

    public static /* synthetic */ void f(FastKV r0) {
        r0.loadData();
    }

    public static /* synthetic */ void g(FastKV r0, String r1) {
        r0.lambda$clearDeletedFiles$1(r1);
    }

    private boolean isABFileEqual() {
        FastBuffer r0 = new FastBuffer(this.dataEnd);
        this.bBuffer.rewind();
        this.bBuffer.get(r0.hb, 0, this.dataEnd);
        byte[] r1 = this.fastBuffer.hb;
        byte[] r02 = r0.hb;
        int r2 = 0;
    L4:
        if (r2 >= this.dataEnd) goto L9;
        if (r1[r2] != r02[r2]) goto L7;
        r2 = r2 + 1;
        goto L4
    L7:
        return false;
    L9:
        return true;
    }

    private /* synthetic */ void lambda$clearDeletedFiles$1(String r4) {
        Utils.deleteFile(new File(this.path + this.name, r4));
    }

    private /* synthetic */ void lambda$remove$0(String r4) {
        Utils.deleteFile(new File(this.path + this.name, r4));
    }

    private /* synthetic */ void lambda$removeOldFile$2(String r4) {
        Utils.deleteFile(new File(this.path + this.name, r4));
    }

    private synchronized void loadData() {
        monitor-enter(this);
        HashMap<String, Container.BaseContainer> r1 = this.data;     // Catch: Throwable -> L14
        monitor-enter(r1);     // Catch: Throwable -> L14
        this.startLoading = true;     // Catch: Throwable -> L30
        this.data.notify();     // Catch: Throwable -> L30
        monitor-exit(r1);     // Catch: Throwable -> L30
        long r12 = System.nanoTime();     // Catch: Throwable -> L14
        if (loadFromCFile() == true) goto L17;
        if (this.writingMode != 0) goto L17;
        loadFromABFile();     // Catch: Throwable -> L14
    L17:
        if (this.fastBuffer != null) goto L20;
        this.fastBuffer = new FastBuffer(AbsFastKV.PAGE_SIZE);     // Catch: Throwable -> L14
    L20:
        if (this.dataEnd != 0) goto L23;
        this.dataEnd = 12;     // Catch: Throwable -> L14
    L23:
        if (this.needRewrite == false) goto L26;
        rewrite();     // Catch: Throwable -> L14
        info("rewrite data");     // Catch: Throwable -> L14
    L26:
        if (this.logger == null) goto L28;
        info("loading finish, data len:" + this.dataEnd + ", get keys:" + this.data.size() + ", use time:" + ((System.nanoTime() - r12) / 1000000) + " ms");     // Catch: Throwable -> L14
    L28:
        monitor-exit(this);
        return;
    L30:
        th = move-exception;
        throw th;     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        throw th;
    }

    private void loadFromABFile() {
        File r2 = new File(this.path, z30.l(new StringBuilder(), this.name, ".kva"));
        File r3 = new File(this.path, z30.l(new StringBuilder(), this.name, ".kvb"));
    L23:
        e = move-exception;
        error(e);
        resetMemory();
        toBlockingMode();
        return;
    L4:
        if (Utils.makeFileIfNotExist(r2) == true) goto L6;
    L56:
        error(new Exception("open file failed"));     // Catch: Exception -> L23
        toBlockingMode();     // Catch: Exception -> L23
        return;
    L6:
        if (Utils.makeFileIfNotExist(r3) == false) goto L56;
        RandomAccessFile r4 = new RandomAccessFile(r2, "rw");     // Catch: Exception -> L23
        RandomAccessFile r5 = new RandomAccessFile(r3, "rw");     // Catch: Exception -> L23
        long r6 = r4.length();     // Catch: Exception -> L23
        long r8 = r5.length();     // Catch: Exception -> L23
        this.aChannel = r4.getChannel();     // Catch: Exception -> L23
        this.bChannel = r5.getChannel();     // Catch: Exception -> L23
        FileChannel r10 = this.aChannel;     // Catch: Exception -> L23 IOException -> L53
        FileChannel.MapMode r11 = FileChannel.MapMode.READ_WRITE;     // Catch: Exception -> L23 IOException -> L53
        if (r6 <= 0) goto L12;
        long r14 = r6;
    L13:
        MappedByteBuffer r102 = r10.map(r11, 0, r14);     // Catch: Exception -> L23 IOException -> L53
        this.aBuffer = r102;     // Catch: Exception -> L23 IOException -> L53
        ByteOrder r12 = ByteOrder.LITTLE_ENDIAN;     // Catch: Exception -> L23 IOException -> L53
        r102.order(r12);     // Catch: Exception -> L23 IOException -> L53
        FileChannel r112 = this.bChannel;     // Catch: Exception -> L23 IOException -> L53
        if (r8 <= 0) goto L16;
        long r15 = r8;
    L17:
        MappedByteBuffer r52 = r112.map(r11, 0, r15);     // Catch: Exception -> L23 IOException -> L53
        this.bBuffer = r52;     // Catch: Exception -> L23 IOException -> L53
        r52.order(r12);     // Catch: Exception -> L23 IOException -> L53
        this.fastBuffer = new FastBuffer(this.aBuffer.capacity());     // Catch: Exception -> L23
        if (r6 != 0) goto L25;
        if (r8 != 0) goto L25;
        this.dataEnd = 12;     // Catch: Exception -> L23
        return;
    L25:
        int r0 = this.aBuffer.getInt();     // Catch: Exception -> L23
        int r32 = AbsFastKV.unpackSize(r0);     // Catch: Exception -> L23
        boolean r02 = AbsFastKV.isCipher(r0);     // Catch: Exception -> L23
        long r42 = this.aBuffer.getLong();     // Catch: Exception -> L23
        int r103 = this.bBuffer.getInt();     // Catch: Exception -> L23
        int r113 = AbsFastKV.unpackSize(r103);     // Catch: Exception -> L23
        boolean r104 = AbsFastKV.isCipher(r103);     // Catch: Exception -> L23
        long r122 = this.bBuffer.getLong();     // Catch: Exception -> L23
        if (r32 >= 0) goto L28;
    L39:
        if (r113 >= 0) goto L41;
    L51:
        error("both files error");     // Catch: Exception -> L23
        clearData();     // Catch: Exception -> L23
        return;
    L41:
        if (r113 > (r8 - 12)) goto L51;
        this.data.clear();     // Catch: Exception -> L23
        clearInvalid();     // Catch: Exception -> L23
        this.dataEnd = r113 + 12;     // Catch: Exception -> L23
        if (this.fastBuffer.hb.length == this.bBuffer.capacity()) goto L45;
        this.fastBuffer = new FastBuffer(this.bBuffer.capacity());     // Catch: Exception -> L23
    L45:
        this.bBuffer.rewind();     // Catch: Exception -> L23
        this.bBuffer.get(this.fastBuffer.hb, 0, this.dataEnd);     // Catch: Exception -> L23
        if (r122 != this.fastBuffer.getChecksum(12, r113)) goto L51;
        if (parseData(r104) == false) goto L51;
        warning(new Exception("A file error"));     // Catch: Exception -> L23
        copyBuffer(this.bBuffer, this.aBuffer, this.dataEnd);     // Catch: Exception -> L23
        this.checksum = r122;     // Catch: Exception -> L23
        return;
    L28:
        if (r32 > (r6 - 12)) goto L39;
        this.dataEnd = r32 + 12;     // Catch: Exception -> L23
        this.aBuffer.rewind();     // Catch: Exception -> L23
        this.aBuffer.get(this.fastBuffer.hb, 0, this.dataEnd);     // Catch: Exception -> L23
        if (r42 != this.fastBuffer.getChecksum(12, r32)) goto L39;
        if (parseData(r02) == false) goto L39;
        this.checksum = r42;     // Catch: Exception -> L23
        if (r6 == r8) goto L36;
    L37:
        warning(new Exception("B file error"));     // Catch: Exception -> L23
        copyBuffer(this.aBuffer, this.bBuffer, this.dataEnd);     // Catch: Exception -> L23
        return;
    L36:
        if (isABFileEqual() == false) goto L37;
        return;
    L16:
        r15 = AbsFastKV.PAGE_SIZE;     // Catch: Exception -> L23 IOException -> L53
        goto L17
    L12:
        r14 = AbsFastKV.PAGE_SIZE;     // Catch: Exception -> L23 IOException -> L53
    L53:
        e = move-exception;
        error(e);     // Catch: Exception -> L23
        toBlockingMode();     // Catch: Exception -> L23
        tryBlockingIO(r2, r3);     // Catch: Exception -> L23
    }

    private boolean loadFromCFile() {
        File r0 = new File(this.path, z30.l(new StringBuilder(), this.name, ".kvc"));
        File r1 = new File(this.path, z30.l(new StringBuilder(), this.name, ".tmp"));
        boolean r2 = false;
    L22:
        e = e;
    L36:
        error(e);
        return r2;
    L4:
        if (r0.exists() == false) goto L7;
    L10:
        if (r0 == null) goto L29;
        if (loadWithBlockingIO(r0) == true) goto L14;
        resetMemory();     // Catch: Exception -> L22
        deleteCFiles();     // Catch: Exception -> L22
        return false;
    L14:
        if (this.writingMode == 0) goto L16;
    L35:
        return false;
    L16:
        if (writeToABFile(this.fastBuffer) == false) goto L24;
        info("recover from c file");     // Catch: Exception -> L22
        deleteCFiles();     // Catch: Exception -> L20
        return true;
    L20:
        e = e;
        r2 = true;
        goto L36
    L24:
        this.writingMode = 1;     // Catch: Exception -> L22
        return false;
    L29:
        if (this.writingMode == 0) goto L35;
        File r02 = new File(this.path, this.name + ".kva");     // Catch: Exception -> L22
        File r12 = new File(this.path, this.name + ".kvb");     // Catch: Exception -> L22
        if (r02.exists() == false) goto L35;
        if (r12.exists() == false) goto L35;
        tryBlockingIO(r02, r12);     // Catch: Exception -> L22
        goto L35
    L7:
        if (r1.exists() == false) goto L9;
        r0 = r1;
        goto L10
    L9:
        r0 = null;
        goto L10
    }

    private void resetBuffer(MappedByteBuffer r9) {
        int r0 = r9.capacity();
        int r1 = AbsFastKV.PAGE_SIZE;
        if (r0 != r1) goto L5;
    L14:
        r9.putInt(0, packSize(0));
        r9.putLong(4, 0);
        return;
    L5:
        if (r9 != this.aBuffer) goto L8;
        FileChannel r02 = this.aChannel;
    L7:
        FileChannel r2 = r02;
        r2.truncate(r1);
        MappedByteBuffer r03 = r2.map(FileChannel.MapMode.READ_WRITE, 0, r1);
        r03.order(ByteOrder.LITTLE_ENDIAN);
        if (r9 != this.aBuffer) goto L12;
        this.aBuffer = r03;
    L13:
        r9 = r03;
        goto L14
    L12:
        this.bBuffer = r03;
        goto L13
    L8:
        r02 = this.bChannel;
        goto L7
    }

    private void syncToABBuffer(MappedByteBuffer r4) {
        r4.putLong(4, this.checksum);
        int r0 = this.removeStart;
        if (r0 == 0) goto L6;
        r4.put(r0, this.fastBuffer.hb[r0]);
    L6:
        if (this.updateSize == 0) goto L9;
        r4.position(this.updateStart);
        r4.put(this.fastBuffer.hb, this.updateStart, this.updateSize);
        return;
    }

    private void toBlockingMode() {
        this.writingMode = 1;
        Utils.closeQuietly(this.aChannel);
        Utils.closeQuietly(this.bChannel);
        this.aChannel = null;
        this.bChannel = null;
        this.aBuffer = null;
        this.bBuffer = null;
    }

    private void truncate(int r8) {
        int r0 = AbsFastKV.PAGE_SIZE;
        int r82 = getNewCapacity(r0, r8 + r0);
        byte[] r02 = this.fastBuffer.hb;
        if (r82 < r02.length) goto L5;
        return;
    L5:
        byte[] r1 = new byte[r82];
        System.arraycopy(r02, 0, r1, 0, this.dataEnd);
        this.fastBuffer.hb = r1;
        if (this.writingMode == 0) goto L13;
    L11:
        info("truncate finish");
        return;
    L13:
        long r5 = r82;
        this.aChannel.truncate(r5);     // Catch: Exception -> L9
        FileChannel r12 = this.aChannel;     // Catch: Exception -> L9
        FileChannel.MapMode r2 = FileChannel.MapMode.READ_WRITE;     // Catch: Exception -> L9
        MappedByteBuffer r83 = r12.map(r2, 0, r5);     // Catch: Exception -> L9
        this.aBuffer = r83;     // Catch: Exception -> L9
        ByteOrder r03 = ByteOrder.LITTLE_ENDIAN;     // Catch: Exception -> L9
        r83.order(r03);     // Catch: Exception -> L9
        this.bChannel.truncate(r5);     // Catch: Exception -> L9
        MappedByteBuffer r84 = this.bChannel.map(r2, 0, r5);     // Catch: Exception -> L9
        this.bBuffer = r84;     // Catch: Exception -> L9
        r84.order(r03);     // Catch: Exception -> L9
    L9:
        e = move-exception;
        error(new Exception("map failed", e));
        toBlockingMode();
        goto L11
    }

    private boolean writeToABFile(FastBuffer r13) {
        int r1 = r13.hb.length;
        File r2 = new File(this.path, z30.l(new StringBuilder(), this.name, ".kva"));
        File r3 = new File(this.path, z30.l(new StringBuilder(), this.name, ".kvb"));
    L9:
        e = move-exception;
        error(e);
        return false;
    L4:
        if (Utils.makeFileIfNotExist(r2) == false) goto L12;
        if (Utils.makeFileIfNotExist(r3) == false) goto L12;
        RandomAccessFile r5 = new RandomAccessFile(r2, "rw");     // Catch: Exception -> L9
        long r10 = r1;
        r5.setLength(r10);     // Catch: Exception -> L9
        FileChannel r6 = r5.getChannel();     // Catch: Exception -> L9
        this.aChannel = r6;     // Catch: Exception -> L9
        FileChannel.MapMode r7 = FileChannel.MapMode.READ_WRITE;     // Catch: Exception -> L9
        MappedByteBuffer r12 = r6.map(r7, 0, r10);     // Catch: Exception -> L9
        this.aBuffer = r12;     // Catch: Exception -> L9
        ByteOrder r22 = ByteOrder.LITTLE_ENDIAN;     // Catch: Exception -> L9
        r12.order(r22);     // Catch: Exception -> L9
        this.aBuffer.put(r13.hb, 0, this.dataEnd);     // Catch: Exception -> L9
        RandomAccessFile r14 = new RandomAccessFile(r3, "rw");     // Catch: Exception -> L9
        r14.setLength(r10);     // Catch: Exception -> L9
        FileChannel r62 = r14.getChannel();     // Catch: Exception -> L9
        this.bChannel = r62;     // Catch: Exception -> L9
        MappedByteBuffer r0 = r62.map(r7, 0, r10);     // Catch: Exception -> L9
        this.bBuffer = r0;     // Catch: Exception -> L9
        r0.order(r22);     // Catch: Exception -> L9
        this.bBuffer.put(r13.hb, 0, this.dataEnd);     // Catch: Exception -> L9
        return true;
    L12:
        throw new Exception("open file failed");     // Catch: Exception -> L9
    }

    private synchronized boolean writeToCFile() {
        monitor-enter(this);
        File r0 = new File(this.path, this.name + ".tmp");     // Catch: Throwable -> L11 Exception -> L13
        if (Utils.saveBytes(r0, this.fastBuffer.hb, this.dataEnd) == true) goto L6;
    L18:
        monitor-exit(this);
        return false;
    L6:
        if (Utils.renameFile(r0, new File(this.path, this.name + ".kvc")) == false) goto L15;
        clearDeletedFiles();     // Catch: Throwable -> L11 Exception -> L13
        monitor-exit(this);
        return true;
    L15:
        warning(new Exception("rename failed"));     // Catch: Throwable -> L11 Exception -> L13
    L13:
        e = move-exception;
        error(e);     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized void apply() {
        monitor-enter(this);
    L11:
        th = move-exception;
        throw th;
    L4:
        if (this.closed == false) goto L8;
        monitor-exit(this);
        return;
    L8:
        this.autoCommit = true;     // Catch: Throwable -> L11
        commitToCFile();     // Catch: Throwable -> L11
        monitor-exit(this);
    }

    @Override // io.fastkv.AbsFastKV
    public void checkGC() {
        if (this.invalidBytes >= (bytesThreshold() << 1)) goto L11;
        int r0 = this.invalids.size();
        if (this.dataEnd >= 16384) goto L7;
        int r1 = 80;
    L8:
        if (r0 >= r1) goto L11;
        return;
    L7:
        r1 = 160;
    L11:
        gc(0);
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor clear() {
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L4:
        if (this.closed == false) goto L7;
        monitor-exit(this);
        return this;
    L7:
        clearData();     // Catch: Throwable -> L10
        if (this.writingMode == 0) goto L12;
        deleteCFiles();     // Catch: Throwable -> L10
    L12:
        notifyListeners(null);     // Catch: Throwable -> L10
        monitor-exit(this);
        return this;
    }

    public synchronized void close() {
        monitor-enter(this);
    L12:
        th = move-exception;
        throw th;
    L4:
        if (this.closed == false) goto L8;
        monitor-exit(this);
        return;
    L8:
        this.closed = true;     // Catch: Throwable -> L12
        if (this.writingMode != 0) goto L17;
        this.aChannel.force(false);     // Catch: Throwable -> L12 Exception -> L14
        this.aChannel.close();     // Catch: Throwable -> L12 Exception -> L14
        this.bChannel.force(false);     // Catch: Throwable -> L12 Exception -> L14
        this.bChannel.close();     // Catch: Throwable -> L12 Exception -> L14
    L14:
        e = move-exception;
        error(e);     // Catch: Throwable -> L12
    L17:
        monitor-enter(Builder.class);     // Catch: Throwable -> L12
        Builder.INSTANCE_MAP.remove(this.path + this.name);     // Catch: Throwable -> L22
        monitor-exit(Builder.class);     // Catch: Throwable -> L22
        monitor-exit(this);
        return;
    L22:
        th = move-exception;
        throw th;     // Catch: Throwable -> L12
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized boolean commit() {
        monitor-enter(this);
    L12:
        th = move-exception;
        throw th;
    L4:
        if (this.closed == false) goto L9;
        monitor-exit(this);
        return false;
    L9:
        this.autoCommit = true;     // Catch: Throwable -> L12
        boolean r0 = commitToCFile();     // Catch: Throwable -> L12
        monitor-exit(this);
        return r0;
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ boolean contains(String r1) {
        return super.contains(r1);
    }

    @Override // io.fastkv.AbsFastKV
    public void copyToMainFile(FastKV r5) {
        FastBuffer r52 = r5.fastBuffer;
        if (this.writingMode != 0) goto L17;
        int r0 = r52.hb.length;
        MappedByteBuffer r1 = this.aBuffer;
        if (r1 == null) goto L14;
        if (r1.capacity() != r0) goto L14;
        MappedByteBuffer r12 = this.bBuffer;
        if (r12 == null) goto L14;
        if (r12.capacity() != r0) goto L14;
        this.aBuffer.position(0);
        this.aBuffer.put(r52.hb, 0, this.dataEnd);
        this.bBuffer.position(0);
        this.bBuffer.put(r52.hb, 0, this.dataEnd);
    L14:
        if (writeToABFile(r52) == true) goto L17;
        this.writingMode = 1;
    L17:
        if (this.writingMode == 0) goto L20;
        writeToCFile();
        return;
    }

    public synchronized void disableAutoCommit() {
        monitor-enter(this);
        this.autoCommit = false;     // Catch: Throwable -> L7
        monitor-exit(this);
        return;
    L7:
        th = move-exception;
        throw th;
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ SharedPreferences.Editor edit() {
        return super.edit();
    }

    @Override // io.fastkv.AbsFastKV
    public void ensureSize(int r12) {
        int r0 = this.fastBuffer.hb.length;
        int r1 = this.dataEnd + r12;
        if (r1 < r0) goto L19;
        int r2 = this.invalidBytes;
        if (r2 > r12) goto L7;
    L10:
        int r122 = getNewCapacity(r0, r1);
        byte[] r02 = new byte[r122];
        System.arraycopy(this.fastBuffer.hb, 0, r02, 0, this.dataEnd);
        this.fastBuffer.hb = r02;
        if (this.writingMode != 0) goto L20;
        FileChannel r4 = this.aChannel;     // Catch: IOException -> L14
        FileChannel.MapMode r5 = FileChannel.MapMode.READ_WRITE;     // Catch: IOException -> L14
        long r8 = r122;
        MappedByteBuffer r123 = r4.map(r5, 0, r8);     // Catch: IOException -> L14
        this.aBuffer = r123;     // Catch: IOException -> L14
        ByteOrder r03 = ByteOrder.LITTLE_ENDIAN;     // Catch: IOException -> L14
        r123.order(r03);     // Catch: IOException -> L14
        MappedByteBuffer r124 = this.bChannel.map(r5, 0, r8);     // Catch: IOException -> L14
        this.bBuffer = r124;     // Catch: IOException -> L14
        r124.order(r03);     // Catch: IOException -> L14
        return;
    L14:
        e = move-exception;
        error(new Exception("map failed", e));
        this.fastBuffer.putInt(0, packSize(this.dataEnd - 12));
        this.fastBuffer.putLong(4, this.checksum);
        toBlockingMode();
        return;
    L20:
        return;
    L7:
        if (r2 <= bytesThreshold()) goto L10;
        gc(r12);
        return;
    }

    public synchronized void force() {
        monitor-enter(this);
    L11:
        th = move-exception;
        throw th;
    L4:
        if (this.closed == false) goto L8;
        monitor-exit(this);
        return;
    L8:
        if (this.writingMode != 0) goto L13;
        this.aBuffer.force();     // Catch: Throwable -> L11
        this.bBuffer.force();     // Catch: Throwable -> L11
    L13:
        monitor-exit(this);
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
    public void handleChange(String r1) {
        checkIfCommit();
        notifyListeners(r1);
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
    public synchronized SharedPreferences.Editor remove(String r7) {
        monitor-enter(this);
    L12:
        th = move-exception;
        throw th;
    L4:
        if (this.closed == false) goto L7;
        monitor-exit(this);
        return this;
    L7:
        Container.BaseContainer r0 = this.data.get(r7);     // Catch: Throwable -> L12
        if (r0 == null) goto L28;
        this.data.remove(r7);     // Catch: Throwable -> L12
        this.bigValueCache.remove(r7);     // Catch: Throwable -> L12
        this.externalCache.remove(r7);     // Catch: Throwable -> L12
        byte r1 = r0.getType();     // Catch: Throwable -> L12
        String r3 = null;
        if (r1 > 5) goto L14;
        int r72 = FastBuffer.getStringSize(r7);     // Catch: Throwable -> L12
        int r02 = r0.offset;     // Catch: Throwable -> L12
        remove(r1, r02 - (r72 + 2), r02 + AbsFastKV.TYPE_SIZE[r1]);     // Catch: Throwable -> L12
    L17:
        byte r73 = (byte) (r1 | DataType.DELETE_MASK);     // Catch: Throwable -> L12
        if (this.writingMode != 0) goto L20;
        this.aBuffer.putLong(4, this.checksum);     // Catch: Throwable -> L12
        this.aBuffer.put(this.removeStart, r73);     // Catch: Throwable -> L12
        this.bBuffer.putLong(4, this.checksum);     // Catch: Throwable -> L12
        this.bBuffer.put(this.removeStart, r73);     // Catch: Throwable -> L12
    L21:
        this.removeStart = 0;     // Catch: Throwable -> L12
        if (r3 != null) goto L24;
    L27:
        checkGC();     // Catch: Throwable -> L12
        checkIfCommit();     // Catch: Throwable -> L12
        goto L28
    L24:
        if (this.writingMode != 0) goto L26;
        FastKVConfig.getExecutor().execute(new rj(this, r3, 1));     // Catch: Throwable -> L12
        goto L27
    L26:
        this.deletedFiles.add(r3);     // Catch: Throwable -> L12
        goto L27
    L20:
        this.fastBuffer.putLong(4, this.checksum);     // Catch: Throwable -> L12
        goto L21
    L14:
        Container.VarContainer r03 = (Container.VarContainer) r0;     // Catch: Throwable -> L12
        remove(r1, r03.start, r03.offset + r03.valueSize);     // Catch: Throwable -> L12
        if (r03.external == false) goto L17;
        r3 = (String) r03.value;     // Catch: Throwable -> L12
    L28:
        monitor-exit(this);
        return this;
    }

    @Override // io.fastkv.AbsFastKV
    public void removeOldFile(String r4) {
        if (this.writingMode != 0) goto L6;
        FastKVConfig.getExecutor().execute(new rj(this, r4, 0));
        return;
    L6:
        this.deletedFiles.add(r4);
    }

    @Override // io.fastkv.AbsFastKV
    public void syncCompatBuffer(int r7, int r8, int r9) {
        int r0 = packSize(this.dataEnd - 12);
        if (this.writingMode != 0) goto L5;
        this.aBuffer.putInt(0, -1);
        this.aBuffer.putLong(4, this.checksum);
        this.aBuffer.position(r7);
        this.aBuffer.put(this.fastBuffer.hb, r7, r9);
        this.aBuffer.putInt(0, r0);
        this.bBuffer.putInt(0, r0);
        this.bBuffer.putLong(4, this.checksum);
        this.bBuffer.position(r7);
        this.bBuffer.put(this.fastBuffer.hb, r7, r9);
    L6:
        int r72 = this.dataEnd + r8;
        if ((this.fastBuffer.hb.length - r72) <= AbsFastKV.TRUNCATE_THRESHOLD) goto L10;
        truncate(r72);
        return;
    L10:
        return;
    L5:
        this.fastBuffer.putInt(0, r0);
        this.fastBuffer.putLong(4, this.checksum);
        goto L6
    }

    public synchronized String toString() {
        monitor-enter(this);
        String r0 = "FastKV: path:" + this.path + " name:" + this.name;     // Catch: Throwable -> L7
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
        long r0 = this.checksum ^ shiftCheckSum(1, r6);
        this.checksum = r0;
        if (this.writingMode != 0) goto L5;
        this.aBuffer.putLong(4, r0);
        this.aBuffer.put(r6, r5);
        this.bBuffer.putLong(4, this.checksum);
        this.bBuffer.put(r6, r5);
    L6:
        this.fastBuffer.hb[r6] = r5;
        return;
    L5:
        this.fastBuffer.putLong(4, r0);
        goto L6
    }

    @Override // io.fastkv.AbsFastKV
    public void updateBytes(int r7, byte[] r8) {
        super.updateBytes(r7, r8);
        if (this.writingMode != 0) goto L6;
        this.aBuffer.putInt(0, -1);
        this.aBuffer.putLong(4, this.checksum);
        this.aBuffer.position(r7);
        this.aBuffer.put(r8);
        this.aBuffer.putInt(0, packSize(this.dataEnd - 12));
        this.bBuffer.putLong(4, this.checksum);
        this.bBuffer.position(r7);
        this.bBuffer.put(r8);
        return;
    L6:
        this.fastBuffer.putLong(4, this.checksum);
    }

    @Override // io.fastkv.AbsFastKV
    public void updateChange() {
        this.checksum ^= this.fastBuffer.getChecksum(this.updateStart, this.updateSize);
        int r0 = packSize(this.dataEnd - 12);
        if (this.writingMode != 0) goto L5;
        this.aBuffer.putInt(0, -1);
        syncToABBuffer(this.aBuffer);
        this.aBuffer.putInt(0, r0);
        this.bBuffer.putInt(0, r0);
        syncToABBuffer(this.bBuffer);
    L6:
        this.removeStart = 0;
        this.updateSize = 0;
        return;
    L5:
        this.fastBuffer.putInt(0, r0);
        this.fastBuffer.putLong(4, this.checksum);
        goto L6
    }

    @Override // io.fastkv.AbsFastKV
    public void updateInt32(int r5, long r6, int r8) {
        long r0 = this.checksum;
        long r62 = shiftCheckSum(r6, r8) ^ r0;
        this.checksum = r62;
        if (this.writingMode != 0) goto L5;
        this.aBuffer.putLong(4, r62);
        this.aBuffer.putInt(r8, r5);
        this.bBuffer.putLong(4, this.checksum);
        this.bBuffer.putInt(r8, r5);
    L6:
        this.fastBuffer.putInt(r8, r5);
        return;
    L5:
        this.fastBuffer.putLong(4, r62);
        goto L6
    }

    @Override // io.fastkv.AbsFastKV
    public void updateInt64(long r5, long r7, int r9) {
        long r0 = this.checksum;
        long r72 = shiftCheckSum(r7, r9) ^ r0;
        this.checksum = r72;
        if (this.writingMode != 0) goto L5;
        this.aBuffer.putLong(4, r72);
        this.aBuffer.putLong(r9, r5);
        this.bBuffer.putLong(4, this.checksum);
        this.bBuffer.putLong(r9, r5);
    L6:
        this.fastBuffer.putLong(r9, r5);
        return;
    L5:
        this.fastBuffer.putLong(4, r72);
        goto L6
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
    public synchronized void putAll(Map<String, Object> r2, Map<Class, FastEncoder> r3) {
        monitor-enter(this);
    L10:
        th = move-exception;
        throw th;
    L4:
        if (this.closed == false) goto L8;
        monitor-exit(this);
        return;
    L8:
        if (this.writingMode == 0) goto L12;
        this.autoCommit = false;     // Catch: Throwable -> L10
    L12:
        super.putAll(r2, r3);     // Catch: Throwable -> L10
        if (this.writingMode == 0) goto L15;
        commit();     // Catch: Throwable -> L10
    L15:
        monitor-exit(this);
    }

    @Override // io.fastkv.AbsFastKV
    public void remove(byte r1, int r2, int r3) {
        super.remove(r1, r2, r3);
        this.removeStart = r2;
    }
}
