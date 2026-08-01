package io.fastkv;

import android.content.SharedPreferences;
import android.os.FileObserver;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
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
import p000.RunnableC0349is;
import p000.RunnableC0733t5;
import p000.z30;

/* JADX INFO: loaded from: classes.dex */
public final class MPFastKV extends AbsFastKV {
    private static final int LOCK_TIMEOUT = 3000;
    private static final int MSG_APPLY = 2;
    private static final int MSG_CLEAR = 4;
    private static final int MSG_DATA_CHANGE = 3;
    private static final int MSG_REFRESH = 1;
    private static final Random random = new Random();
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

    /* JADX INFO: renamed from: io.fastkv.MPFastKV$1 */
    public class HandlerC03421 extends Handler {
        public HandlerC03421(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Executor executor = MPFastKV.this.refreshExecutor;
                final MPFastKV mPFastKV = MPFastKV.this;
                executor.execute(new Runnable() { // from class: io.fastkv.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        MPFastKV.access$200(mPFastKV);
                    }
                });
            } else if (i == 2) {
                MPFastKV.this.apply();
            } else if (i == MPFastKV.MSG_DATA_CHANGE) {
                MPFastKV.this.notifyChangedKeys();
            } else {
                if (i != MPFastKV.MSG_CLEAR) {
                    return;
                }
                MPFastKV.this.notifyListeners(null);
            }
        }
    }

    public static class Builder {
        private static final Map<String, MPFastKV> INSTANCE_MAP = new ConcurrentHashMap();
        private FastCipher cipher;
        private FastEncoder[] encoders;
        private final String name;
        private boolean needWatchFileChange = true;
        private final String path;

        public Builder(String str, String str2) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("path is empty");
            }
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            this.path = str.endsWith("/") ? str : str.concat("/");
            this.name = str2;
        }

        public MPFastKV build() {
            MPFastKV mPFastKV;
            String str = this.path + this.name;
            Map<String, MPFastKV> map = INSTANCE_MAP;
            MPFastKV mPFastKV2 = map.get(str);
            if (mPFastKV2 != null) {
                return mPFastKV2;
            }
            synchronized (Builder.class) {
                try {
                    mPFastKV = map.get(str);
                    if (mPFastKV == null) {
                        MPFastKV mPFastKV3 = new MPFastKV(this.path, this.name, this.encoders, this.cipher, this.needWatchFileChange);
                        map.put(str, mPFastKV3);
                        mPFastKV = mPFastKV3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return mPFastKV;
        }

        public Builder cipher(FastCipher fastCipher) {
            this.cipher = fastCipher;
            return this;
        }

        public Builder disableWatchFileChange() {
            this.needWatchFileChange = false;
            return this;
        }

        public Builder encoder(FastEncoder[] fastEncoderArr) {
            this.encoders = fastEncoderArr;
            return this;
        }
    }

    public class KVFileObserver extends FileObserver {
        public KVFileObserver(String str) {
            super(str, 2);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i, String str) {
            if (MPFastKV.this.kvHandler.hasMessages(1)) {
                return;
            }
            MPFastKV.this.kvHandler.sendEmptyMessageDelayed(1, 30L);
        }
    }

    public MPFastKV(String str, String str2, FastEncoder[] fastEncoderArr, FastCipher fastCipher, boolean z) {
        super(str, str2, fastEncoderArr, fastCipher);
        this.updateStartAndSize = new int[16];
        this.updateCount = 0;
        this.needFullWrite = false;
        this.applyExecutor = new LimitExecutor();
        this.refreshExecutor = new LimitExecutor();
        this.changedKey = new HashSet();
        this.kvHandler = new HandlerC03421(Looper.getMainLooper());
        this.aFile = new File(str, z30.m2764i(str2, ".kva"));
        this.bFile = new File(str, z30.m2764i(str2, ".kvb"));
        this.needWatchFileChange = z;
        synchronized (this.data) {
            FastKVConfig.getExecutor().execute(new RunnableC0349is(this, 0));
            while (!this.startLoading) {
                try {
                    this.data.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public static /* synthetic */ void access$200(MPFastKV mPFastKV) {
        mPFastKV.refresh();
    }

    private void addUpdate(int i, int i2) {
        int i3 = this.updateCount;
        int[] iArr = this.updateStartAndSize;
        int length = iArr.length;
        if ((i3 << 1) >= length) {
            int[] iArr2 = new int[length << 1];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.updateStartAndSize = iArr2;
        }
        int[] iArr3 = this.updateStartAndSize;
        iArr3[i3] = i;
        iArr3[i3 + 1] = i2;
        this.updateCount = i3 + 2;
    }

    private boolean alignAToBuffer() {
        int length = this.fastBuffer.f2461hb.length;
        try {
            if (this.aAccessFile == null) {
                if (!Utils.makeFileIfNotExist(this.aFile)) {
                    return false;
                }
                this.aAccessFile = new RandomAccessFile(this.aFile, "rw");
            }
            long j = length;
            if (this.aAccessFile.length() != j) {
                this.aAccessFile.setLength(j);
            }
            FileChannel fileChannel = this.aChannel;
            if (fileChannel == null) {
                this.aChannel = this.aAccessFile.getChannel();
            } else if (fileChannel.size() != j) {
                this.aChannel.truncate(j);
            }
            MappedByteBuffer mappedByteBuffer = this.aBuffer;
            if (mappedByteBuffer != null && mappedByteBuffer.capacity() == length) {
                return true;
            }
            MappedByteBuffer map = this.aChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
            this.aBuffer = map;
            map.order(ByteOrder.LITTLE_ENDIAN);
            return true;
        } catch (Exception e) {
            error(e);
            return false;
        }
    }

    private void checkDiff(HashMap<String, Container.BaseContainer> map) {
        HashSet hashSet = new HashSet(this.data.keySet());
        HashSet hashSet2 = new HashSet(map.keySet());
        HashSet<String> hashSet3 = new HashSet(hashSet);
        hashSet3.retainAll(hashSet2);
        hashSet.removeAll(hashSet3);
        hashSet2.removeAll(hashSet3);
        this.changedKey.addAll(hashSet);
        this.changedKey.addAll(hashSet2);
        for (String str : hashSet3) {
            Container.BaseContainer baseContainer = map.get(str);
            Container.BaseContainer baseContainer2 = this.data.get(str);
            if (baseContainer != null && !baseContainer.equalTo(baseContainer2)) {
                this.changedKey.add(str);
            }
        }
        if (this.changedKey.isEmpty()) {
            return;
        }
        this.kvHandler.sendEmptyMessage(MSG_DATA_CHANGE);
    }

    private void checkUpdate() throws IOException {
        File file;
        MappedByteBuffer map = this.aBuffer;
        if (map == null || (file = this.aFile) == null) {
            return;
        }
        int length = (int) file.length();
        if (length <= 0) {
            error("invalid file length");
            return;
        }
        if (this.aBuffer.capacity() != length) {
            long j = length;
            this.aChannel.truncate(j);
            map = this.aChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
            if (map == null) {
                return;
            }
            this.aBuffer = map;
            map.order(ByteOrder.LITTLE_ENDIAN);
        }
        long j2 = length;
        if (this.bChannel.size() != j2) {
            this.bChannel.truncate(j2);
        }
        int iCapacity = map.capacity();
        int i = map.getInt(0);
        int iUnpackSize = AbsFastKV.unpackSize(i);
        boolean zIsCipher = AbsFastKV.isCipher(i);
        if (iUnpackSize < 0 || iUnpackSize > iCapacity) {
            throw new IllegalStateException("Invalid file, dataSize:" + iUnpackSize + ", capacity:" + iCapacity);
        }
        long j3 = map.getLong(MSG_CLEAR);
        int i2 = iUnpackSize + 12;
        long j4 = this.updateHash;
        if (i2 < map.capacity() - 8) {
            j4 = map.getLong(i2);
        }
        if (i2 == this.dataEnd && j3 == this.checksum && j4 == this.updateHash) {
            return;
        }
        this.dataEnd = i2;
        this.checksum = j3;
        this.updateHash = j4;
        HashMap<String, Container.BaseContainer> map2 = this.listeners.isEmpty() ? null : new HashMap<>(this.data);
        reloadData();
        if (j3 != this.fastBuffer.getChecksum(12, iUnpackSize) || !parseData(zIsCipher)) {
            clearData();
        } else if (map2 != null) {
            checkDiff(map2);
        }
    }

    private void clearData() {
        resetMemory();
        try {
            alignAToBuffer();
            this.aBuffer.putInt(0, packSize(0));
            this.aBuffer.putLong(MSG_CLEAR, 0L);
            getUpdateHash();
            if (Utils.makeFileIfNotExist(this.bFile)) {
                setBFileSize(AbsFastKV.PAGE_SIZE);
                syncAToB(0, 12);
                trySettingObserver();
            }
        } catch (Exception e) {
            error(e);
            this.needFullWrite = true;
        }
        Utils.deleteFile(new File(this.path + this.name));
        this.kvHandler.sendEmptyMessage(MSG_CLEAR);
    }

    private boolean fullWrite() {
        FastBuffer fastBuffer = this.fastBuffer;
        fastBuffer.position = 0;
        int iUnpackSize = AbsFastKV.unpackSize(fastBuffer.getInt());
        long j = this.fastBuffer.getLong();
        this.checksum = j;
        this.dataEnd = iUnpackSize + 12;
        if (j == this.fastBuffer.getChecksum(12, iUnpackSize)) {
            return writeToABFile(this.fastBuffer);
        }
        clearData();
        return true;
    }

    private void fullWriteAToB() {
        try {
            if (Utils.makeFileIfNotExist(this.bFile)) {
                setBFileSize(this.aBuffer.capacity());
                syncAToB(0, this.dataEnd);
            }
        } catch (Exception e) {
            error(e);
        }
    }

    private void fullWriteBufferToA() {
        try {
            if (alignAToBuffer()) {
                this.aBuffer.position(0);
                this.aBuffer.put(this.fastBuffer.f2461hb, 0, this.dataEnd);
            }
        } catch (Exception e) {
            error(e);
        }
    }

    private void getUpdateHash() {
        MappedByteBuffer mappedByteBuffer = this.aBuffer;
        if (mappedByteBuffer == null || this.dataEnd + 8 >= mappedByteBuffer.capacity()) {
            return;
        }
        this.updateHash = this.aBuffer.getLong(this.dataEnd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateFile$0(String str) {
        Utils.deleteFile(new File(this.path + this.name, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void loadData() {
        try {
            synchronized (this.data) {
                this.startLoading = true;
                this.data.notify();
            }
            long jNanoTime = System.nanoTime();
            if (!loadFromCFile()) {
                loadFromABFile();
            }
            if (this.fastBuffer == null) {
                this.fastBuffer = new FastBuffer(AbsFastKV.PAGE_SIZE);
            }
            if (this.dataEnd == 0) {
                this.dataEnd = 12;
            }
            if (this.needRewrite) {
                rewrite();
                info("rewrite data");
            }
            if (this.logger != null) {
                info("loading finish, data len:" + this.dataEnd + ", get keys:" + this.data.size() + ", use time:" + ((System.nanoTime() - jNanoTime) / 1000000) + " ms");
            }
            trySettingObserver();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[Catch: all -> 0x009e, TryCatch #2 {all -> 0x009e, blocks: (B:19:0x0067, B:23:0x0077, B:28:0x008c, B:62:0x0164, B:31:0x00a1, B:35:0x00ad, B:37:0x00ba, B:38:0x00c7, B:40:0x00cb, B:43:0x00d2, B:46:0x00d9, B:47:0x00e8, B:49:0x00f1, B:52:0x0109, B:54:0x0119, B:56:0x0121, B:58:0x0146, B:60:0x014c, B:61:0x015c, B:51:0x00fc, B:22:0x0073, B:66:0x016c), top: B:76:0x0067, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015c A[Catch: all -> 0x009e, TryCatch #2 {all -> 0x009e, blocks: (B:19:0x0067, B:23:0x0077, B:28:0x008c, B:62:0x0164, B:31:0x00a1, B:35:0x00ad, B:37:0x00ba, B:38:0x00c7, B:40:0x00cb, B:43:0x00d2, B:46:0x00d9, B:47:0x00e8, B:49:0x00f1, B:52:0x0109, B:54:0x0119, B:56:0x0121, B:58:0x0146, B:60:0x014c, B:61:0x015c, B:51:0x00fc, B:22:0x0073, B:66:0x016c), top: B:76:0x0067, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void loadFromABFile() {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fastkv.MPFastKV.loadFromABFile():void");
    }

    private boolean loadFromCFile() {
        File file = new File(this.path, z30.m2767l(new StringBuilder(), this.name, ".kvc"));
        File file2 = new File(this.path, z30.m2767l(new StringBuilder(), this.name, ".tmp"));
        boolean z = false;
        try {
            if (!file.exists()) {
                file = file2.exists() ? file2 : null;
            }
            if (file != null) {
                if (!loadWithBlockingIO(file)) {
                    resetMemory();
                } else if (writeToABFile(this.fastBuffer)) {
                    info("recover from c file");
                    z = true;
                }
                deleteCFiles();
            }
            return z;
        } catch (Exception e) {
            error(e);
            return z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void notifyChangedKeys() {
        try {
            if (!this.changedKey.isEmpty()) {
                Iterator<String> it = this.changedKey.iterator();
                while (it.hasNext()) {
                    notifyListeners(it.next());
                }
                this.changedKey.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void refresh() {
        lockAndCheckUpdate();
        releaseLock();
    }

    private synchronized void releaseLock() {
        FileLock fileLock = this.bFileLock;
        if (fileLock != null) {
            try {
                fileLock.release();
            } catch (Exception e) {
                error(e);
            }
            this.bFileLock = null;
            this.kvHandler.removeMessages(2);
        }
    }

    private void reloadData() {
        this.data.clear();
        clearInvalid();
        int iCapacity = this.aBuffer.capacity();
        FastBuffer fastBuffer = this.fastBuffer;
        if (fastBuffer == null) {
            this.fastBuffer = new FastBuffer(iCapacity);
        } else if (fastBuffer.f2461hb.length != iCapacity) {
            fastBuffer.f2461hb = new byte[iCapacity];
        }
        this.aBuffer.rewind();
        this.aBuffer.get(this.fastBuffer.f2461hb, 0, this.dataEnd);
    }

    private void reloadFromABuffer() {
        if (this.aBuffer == null) {
            return;
        }
        reloadData();
        getUpdateHash();
        FastBuffer fastBuffer = this.fastBuffer;
        fastBuffer.position = 0;
        int i = fastBuffer.getInt();
        int iUnpackSize = AbsFastKV.unpackSize(i);
        boolean zIsCipher = AbsFastKV.isCipher(i);
        long j = this.fastBuffer.getLong();
        this.checksum = j;
        this.dataEnd = iUnpackSize + 12;
        if (j == this.fastBuffer.getChecksum(12, iUnpackSize) && parseData(zIsCipher)) {
            return;
        }
        clearData();
    }

    private void setBFileSize(int i) throws IOException {
        if (this.bAccessFile == null) {
            this.bAccessFile = new RandomAccessFile(this.bFile, "rw");
        }
        if (this.bChannel == null) {
            this.bChannel = this.bAccessFile.getChannel();
        }
        long j = i;
        if (this.bChannel.size() != j) {
            this.bAccessFile.setLength(j);
            this.bChannel.truncate(j);
        }
    }

    private void syncAToB(int i, int i2) throws IOException {
        MappedByteBuffer mappedByteBuffer = this.aBuffer;
        mappedByteBuffer.position(i);
        mappedByteBuffer.limit(i2 + i);
        if (this.bChannel.size() != mappedByteBuffer.capacity()) {
            this.bChannel.truncate(mappedByteBuffer.capacity());
        }
        this.bChannel.position(i);
        while (mappedByteBuffer.hasRemaining()) {
            this.bChannel.write(mappedByteBuffer);
        }
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    private void syncBufferToA(int i, int i2) {
        byte[] bArr = this.fastBuffer.f2461hb;
        this.aBuffer.position(i);
        this.aBuffer.put(bArr, i, i2);
    }

    private void truncate() {
        int i = AbsFastKV.PAGE_SIZE;
        int newCapacity = getNewCapacity(i, this.dataEnd + i);
        byte[] bArr = this.fastBuffer.f2461hb;
        if (newCapacity >= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[newCapacity];
        System.arraycopy(bArr, 0, bArr2, 0, this.dataEnd);
        this.fastBuffer.f2461hb = bArr2;
        try {
            long j = newCapacity;
            this.aChannel.truncate(j);
            MappedByteBuffer map = this.aChannel.map(FileChannel.MapMode.READ_WRITE, 0L, j);
            this.aBuffer = map;
            map.order(ByteOrder.LITTLE_ENDIAN);
            this.bAccessFile.setLength(j);
            this.bChannel.truncate(j);
        } catch (Exception e) {
            error(new Exception("map failed", e));
            this.needFullWrite = true;
        }
        info("truncate finish");
    }

    private void trySettingObserver() {
        File file;
        if (this.needWatchFileChange && this.fileObserver == null && (file = this.bFile) != null && file.exists()) {
            this.fileObserver = new KVFileObserver(this.bFile.getPath());
            this.fileObserver.startWatching();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean updateFile() {
        if (this.bFileLock == null) {
            return false;
        }
        if (this.fastBuffer == null || (this.updateCount == 0 && !this.needFullWrite)) {
            releaseLock();
            return false;
        }
        try {
            try {
                int iPackSize = packSize(this.dataEnd - 12);
                this.fastBuffer.putInt(0, iPackSize);
                this.fastBuffer.putLong(MSG_CLEAR, this.checksum);
                if (this.needFullWrite) {
                    boolean zFullWrite = fullWrite();
                    if (zFullWrite) {
                        this.needFullWrite = false;
                    }
                    return zFullWrite;
                }
                if (!alignAToBuffer()) {
                    if (this.aBuffer != null) {
                        reloadFromABuffer();
                    } else {
                        this.needFullWrite = true;
                    }
                    this.updateCount = 0;
                    if (!this.deletedFiles.isEmpty()) {
                        this.deletedFiles.clear();
                    }
                    waitExternalWriting();
                    releaseLock();
                    this.kvHandler.sendEmptyMessage(MSG_DATA_CHANGE);
                    return false;
                }
                setBFileSize(this.aBuffer.capacity());
                this.aBuffer.putInt(0, iPackSize);
                this.aBuffer.putLong(MSG_CLEAR, this.checksum);
                for (int i = 0; i < this.updateCount; i += 2) {
                    int[] iArr = this.updateStartAndSize;
                    syncBufferToA(iArr[i], iArr[i + 1]);
                }
                if (this.dataEnd + 8 < this.aBuffer.capacity()) {
                    long jNextLong = random.nextLong() ^ System.nanoTime();
                    this.updateHash = jNextLong;
                    this.aBuffer.putLong(this.dataEnd, jNextLong);
                }
                syncAToB(0, 12);
                for (int i2 = 0; i2 < this.updateCount; i2 += 2) {
                    int[] iArr2 = this.updateStartAndSize;
                    syncAToB(iArr2[i2], iArr2[i2 + 1]);
                }
                if (!this.deletedFiles.isEmpty()) {
                    Iterator<String> it = this.deletedFiles.iterator();
                    while (it.hasNext()) {
                        FastKVConfig.getExecutor().execute(new RunnableC0733t5(this, MSG_CLEAR, it.next()));
                    }
                }
                if (this.fastBuffer.f2461hb.length - this.dataEnd > AbsFastKV.TRUNCATE_THRESHOLD) {
                    truncate();
                }
                this.updateCount = 0;
                if (!this.deletedFiles.isEmpty()) {
                    this.deletedFiles.clear();
                }
                waitExternalWriting();
                releaseLock();
                this.kvHandler.sendEmptyMessage(MSG_DATA_CHANGE);
                return true;
            } finally {
                this.updateCount = 0;
                if (!this.deletedFiles.isEmpty()) {
                    this.deletedFiles.clear();
                }
                waitExternalWriting();
                releaseLock();
                this.kvHandler.sendEmptyMessage(MSG_DATA_CHANGE);
            }
        } catch (Exception e) {
            error(e);
            this.needFullWrite = true;
            this.updateCount = 0;
            if (!this.deletedFiles.isEmpty()) {
                this.deletedFiles.clear();
            }
            waitExternalWriting();
            releaseLock();
            this.kvHandler.sendEmptyMessage(MSG_DATA_CHANGE);
            return false;
        }
    }

    private void waitExternalWriting() {
        while (!this.externalExecutor.isEmpty()) {
            try {
                Thread.sleep(10L);
            } catch (Exception unused) {
            }
        }
    }

    private boolean writeToABFile(FastBuffer fastBuffer) {
        int length = fastBuffer.f2461hb.length;
        try {
            if (!Utils.makeFileIfNotExist(this.aFile) || !Utils.makeFileIfNotExist(this.bFile)) {
                throw new Exception("open file failed");
            }
            if (this.bAccessFile == null) {
                this.bAccessFile = new RandomAccessFile(this.bFile, "rw");
            }
            if (this.bChannel == null) {
                this.bChannel = this.bAccessFile.getChannel();
            }
            FileLock fileLockLock = this.bFileLock == null ? this.bChannel.lock() : null;
            try {
                alignAToBuffer();
                this.aBuffer.put(fastBuffer.f2461hb, 0, this.dataEnd);
                getUpdateHash();
                long j = length;
                if (this.bAccessFile.length() != j) {
                    this.bAccessFile.setLength(j);
                }
                this.bChannel.truncate(j);
                syncAToB(0, this.dataEnd);
                this.bChannel.force(false);
                if (fileLockLock != null) {
                    fileLockLock.release();
                }
                trySettingObserver();
                return true;
            } catch (Throwable th) {
                if (fileLockLock != null) {
                    fileLockLock.release();
                }
                throw th;
            }
        } catch (Exception e) {
            error(e);
            return false;
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public void apply() {
        this.applyExecutor.execute(new RunnableC0349is(this, 1));
    }

    @Override // io.fastkv.AbsFastKV
    public void checkGC() {
        if (this.invalidBytes >= bytesThreshold() || this.invalids.size() >= 80) {
            m1452gc(0);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor clear() {
        lockAndCheckUpdate();
        clearData();
        releaseLock();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public boolean commit() {
        return updateFile();
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ boolean contains(String str) {
        return super.contains(str);
    }

    @Override // io.fastkv.AbsFastKV
    public void copyToMainFile(FastKV fastKV) {
        writeToABFile(fastKV.fastBuffer);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ SharedPreferences.Editor edit() {
        return super.edit();
    }

    @Override // io.fastkv.AbsFastKV
    public void ensureSize(int i) {
        int length = this.fastBuffer.f2461hb.length;
        int i2 = this.dataEnd + i + 8;
        if (i2 >= length) {
            byte[] bArr = new byte[getNewCapacity(length, i2)];
            System.arraycopy(this.fastBuffer.f2461hb, 0, bArr, 0, this.dataEnd);
            this.fastBuffer.f2461hb = bArr;
        }
    }

    public synchronized void force() {
        try {
            try {
                MappedByteBuffer mappedByteBuffer = this.aBuffer;
                if (mappedByteBuffer != null) {
                    mappedByteBuffer.force();
                }
                FileChannel fileChannel = this.bChannel;
                if (fileChannel != null) {
                    fileChannel.force(false);
                }
            } catch (Exception e) {
                error(e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ Map getAll() {
        return super.getAll();
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ byte[] getArray(String str) {
        return super.getArray(str);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ boolean getBoolean(String str) {
        return super.getBoolean(str);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ double getDouble(String str) {
        return super.getDouble(str);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ float getFloat(String str) {
        return super.getFloat(str);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ int getInt(String str) {
        return super.getInt(str);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ long getLong(String str) {
        return super.getLong(str);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ Object getObject(String str) {
        return super.getObject(str);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ String getString(String str) {
        return super.getString(str);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ Set getStringSet(String str) {
        return super.getStringSet(str);
    }

    @Override // io.fastkv.AbsFastKV
    public void handleChange(String str) {
        if (this.listeners.isEmpty()) {
            return;
        }
        this.changedKey.add(str);
    }

    @Override // io.fastkv.AbsFastKV
    public void lockAndCheckUpdate() {
        if (this.bFileLock != null) {
            return;
        }
        if (this.bChannel == null) {
            loadFromABFile();
            trySettingObserver();
        }
        FileChannel fileChannel = this.bChannel;
        if (fileChannel != null) {
            try {
                this.bFileLock = fileChannel.lock();
                try {
                    checkUpdate();
                } finally {
                    this.kvHandler.sendEmptyMessageDelayed(2, 3000L);
                }
            } catch (Exception e) {
                error(e);
            }
        }
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ SharedPreferences.Editor putArray(String str, byte[] bArr) {
        return super.putArray(str, bArr);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ SharedPreferences.Editor putBoolean(String str, boolean z) {
        return super.putBoolean(str, z);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ SharedPreferences.Editor putDouble(String str, double d) {
        return super.putDouble(str, d);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ SharedPreferences.Editor putFloat(String str, float f) {
        return super.putFloat(str, f);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ SharedPreferences.Editor putInt(String str, int i) {
        return super.putInt(str, i);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ SharedPreferences.Editor putLong(String str, long j) {
        return super.putLong(str, j);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ SharedPreferences.Editor putObject(String str, Object obj, FastEncoder fastEncoder) {
        return super.putObject(str, obj, fastEncoder);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ SharedPreferences.Editor putString(String str, String str2) {
        return super.putString(str, str2);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences.Editor
    public /* bridge */ /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
        return super.putStringSet(str, set);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        super.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor remove(String str) {
        try {
            lockAndCheckUpdate();
            handleChange(str);
            Container.BaseContainer baseContainer = this.data.get(str);
            if (baseContainer != null) {
                this.data.remove(str);
                this.bigValueCache.remove(str);
                this.externalCache.remove(str);
                byte type = baseContainer.getType();
                String str2 = null;
                if (type <= 5) {
                    int stringSize = FastBuffer.getStringSize(str);
                    int i = baseContainer.offset;
                    remove(type, i - (stringSize + 2), i + AbsFastKV.TYPE_SIZE[type]);
                } else {
                    Container.VarContainer varContainer = (Container.VarContainer) baseContainer;
                    remove(type, varContainer.start, varContainer.offset + varContainer.valueSize);
                    if (varContainer.external) {
                        str2 = (String) varContainer.value;
                    }
                }
                if (str2 != null) {
                    this.deletedFiles.add(str2);
                }
                checkGC();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // io.fastkv.AbsFastKV
    public void removeOldFile(String str) {
        this.deletedFiles.add(str);
    }

    @Override // io.fastkv.AbsFastKV
    public void resetData() {
        super.resetData();
        this.updateHash = 0L;
    }

    @Override // io.fastkv.AbsFastKV
    public void syncCompatBuffer(int i, int i2, int i3) {
        for (int i4 = 0; i4 < this.updateCount; i4 += 2) {
            int i5 = this.updateStartAndSize[i4];
            if (i5 < i) {
                i = i5;
            }
        }
        int[] iArr = this.updateStartAndSize;
        iArr[0] = i;
        iArr[1] = this.dataEnd - i;
        this.updateCount = 2;
    }

    public synchronized String toString() {
        return "MPFastKV: path:" + this.path + " name:" + this.name;
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        super.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // io.fastkv.AbsFastKV
    public void updateBoolean(byte b, int i) {
        this.checksum ^= shiftCheckSum(1L, i);
        this.fastBuffer.f2461hb[i] = b;
        addUpdate(i, 1);
    }

    @Override // io.fastkv.AbsFastKV
    public void updateBytes(int i, byte[] bArr) {
        super.updateBytes(i, bArr);
        addUpdate(i, bArr.length);
    }

    @Override // io.fastkv.AbsFastKV
    public void updateChange() {
        this.checksum ^= this.fastBuffer.getChecksum(this.updateStart, this.updateSize);
        int i = this.updateSize;
        if (i != 0) {
            addUpdate(this.updateStart, i);
            this.updateSize = 0;
        }
    }

    @Override // io.fastkv.AbsFastKV
    public void updateInt32(int i, long j, int i2) {
        this.checksum = shiftCheckSum(j, i2) ^ this.checksum;
        this.fastBuffer.putInt(i2, i);
        addUpdate(i2, MSG_CLEAR);
    }

    @Override // io.fastkv.AbsFastKV
    public void updateInt64(long j, long j2, int i) {
        this.checksum = shiftCheckSum(j2, i) ^ this.checksum;
        this.fastBuffer.putLong(i, j);
        addUpdate(i, 8);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ byte[] getArray(String str, byte[] bArr) {
        return super.getArray(str, bArr);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ boolean getBoolean(String str, boolean z) {
        return super.getBoolean(str, z);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ double getDouble(String str, double d) {
        return super.getDouble(str, d);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ float getFloat(String str, float f) {
        return super.getFloat(str, f);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ int getInt(String str, int i) {
        return super.getInt(str, i);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ long getLong(String str, long j) {
        return super.getLong(str, j);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ String getString(String str, String str2) {
        return super.getString(str, str2);
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ Set getStringSet(String str, Set set) {
        return super.getStringSet(str, set);
    }

    @Override // io.fastkv.AbsFastKV
    public /* bridge */ /* synthetic */ void putAll(Map map, Map map2) {
        super.putAll(map, map2);
    }

    @Override // io.fastkv.AbsFastKV
    public void remove(byte b, int i, int i2) {
        super.remove(b, i, i2);
        addUpdate(i, 1);
    }
}
