package io.fastkv;

import android.content.Context;
import android.content.SharedPreferences;
import io.fastkv.Container;
import io.fastkv.interfaces.FastCipher;
import io.fastkv.interfaces.FastEncoder;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p000.RunnableC0673rj;
import p000.RunnableC0710sj;
import p000.z30;

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

    public FastKV(String str, String str2, FastEncoder[] fastEncoderArr, FastCipher fastCipher, int i) {
        super(str, str2, fastEncoderArr, fastCipher);
        this.autoCommit = true;
        this.applyExecutor = new LimitExecutor();
        this.writingMode = i;
        synchronized (this.data) {
            FastKVConfig.getExecutor().execute(new RunnableC0710sj(this, 1));
            while (!this.startLoading) {
                try {
                    this.data.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public static SharedPreferences adapt(Context context, String str) {
        FastKV fastKVBuild = new Builder(context.getFilesDir().getAbsolutePath() + "/fastkv", str).build();
        if (!fastKVBuild.contains("kv_import_flag")) {
            fastKVBuild.putAll(context.getSharedPreferences(str, 0).getAll());
            fastKVBuild.putBoolean("kv_import_flag", true);
        }
        return fastKVBuild;
    }

    private void checkIfCommit() {
        if (this.writingMode == 0 || !this.autoCommit) {
            return;
        }
        commitToCFile();
    }

    private void clearData() {
        if (this.writingMode == 0) {
            try {
                resetBuffer(this.aBuffer);
                resetBuffer(this.bBuffer);
            } catch (Exception unused) {
                toBlockingMode();
            }
        }
        resetMemory();
        Utils.deleteFile(new File(this.path + this.name));
    }

    private void clearDeletedFiles() {
        if (this.deletedFiles.isEmpty()) {
            return;
        }
        Iterator<String> it = this.deletedFiles.iterator();
        while (it.hasNext()) {
            FastKVConfig.getExecutor().execute(new RunnableC0673rj(this, it.next(), 2));
        }
        this.deletedFiles.clear();
    }

    private boolean commitToCFile() {
        int i = this.writingMode;
        if (i == 1) {
            this.applyExecutor.execute(new RunnableC0710sj(this, 0));
            return true;
        }
        if (i == 2) {
            return writeToCFile();
        }
        return true;
    }

    private void copyBuffer(MappedByteBuffer mappedByteBuffer, MappedByteBuffer mappedByteBuffer2, int i) {
        if (mappedByteBuffer.capacity() != mappedByteBuffer2.capacity()) {
            try {
                MappedByteBuffer map = (mappedByteBuffer2 == this.bBuffer ? this.bChannel : this.aChannel).map(FileChannel.MapMode.READ_WRITE, 0L, mappedByteBuffer.capacity());
                map.order(ByteOrder.LITTLE_ENDIAN);
                if (mappedByteBuffer2 == this.bBuffer) {
                    this.bBuffer = map;
                } else {
                    this.aBuffer = map;
                }
                mappedByteBuffer2 = map;
            } catch (IOException e) {
                error(e);
                toBlockingMode();
                return;
            }
        }
        mappedByteBuffer.rewind();
        mappedByteBuffer2.rewind();
        mappedByteBuffer.limit(i);
        mappedByteBuffer2.put(mappedByteBuffer);
        mappedByteBuffer.limit(mappedByteBuffer.capacity());
    }

    private boolean isABFileEqual() {
        FastBuffer fastBuffer = new FastBuffer(this.dataEnd);
        this.bBuffer.rewind();
        this.bBuffer.get(fastBuffer.f2461hb, 0, this.dataEnd);
        byte[] bArr = this.fastBuffer.f2461hb;
        byte[] bArr2 = fastBuffer.f2461hb;
        for (int i = 0; i < this.dataEnd; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearDeletedFiles$1(String str) {
        Utils.deleteFile(new File(this.path + this.name, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$remove$0(String str) {
        Utils.deleteFile(new File(this.path + this.name, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeOldFile$2(String str) {
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
            if (!loadFromCFile() && this.writingMode == 0) {
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
        } catch (Throwable th) {
            throw th;
        }
    }

    private void loadFromABFile() {
        File file = new File(this.path, z30.m2767l(new StringBuilder(), this.name, ".kva"));
        File file2 = new File(this.path, z30.m2767l(new StringBuilder(), this.name, ".kvb"));
        try {
            if (Utils.makeFileIfNotExist(file) && Utils.makeFileIfNotExist(file2)) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
                long length = randomAccessFile.length();
                long length2 = randomAccessFile2.length();
                this.aChannel = randomAccessFile.getChannel();
                this.bChannel = randomAccessFile2.getChannel();
                try {
                    FileChannel fileChannel = this.aChannel;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, length > 0 ? length : AbsFastKV.PAGE_SIZE);
                    this.aBuffer = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    MappedByteBuffer map2 = this.bChannel.map(mapMode, 0L, length2 > 0 ? length2 : AbsFastKV.PAGE_SIZE);
                    this.bBuffer = map2;
                    map2.order(byteOrder);
                    this.fastBuffer = new FastBuffer(this.aBuffer.capacity());
                    if (length == 0 && length2 == 0) {
                        this.dataEnd = 12;
                        return;
                    }
                    int i = this.aBuffer.getInt();
                    int iUnpackSize = AbsFastKV.unpackSize(i);
                    boolean zIsCipher = AbsFastKV.isCipher(i);
                    long j = this.aBuffer.getLong();
                    int i2 = this.bBuffer.getInt();
                    int iUnpackSize2 = AbsFastKV.unpackSize(i2);
                    boolean zIsCipher2 = AbsFastKV.isCipher(i2);
                    long j2 = this.bBuffer.getLong();
                    if (iUnpackSize >= 0 && iUnpackSize <= length - 12) {
                        this.dataEnd = iUnpackSize + 12;
                        this.aBuffer.rewind();
                        this.aBuffer.get(this.fastBuffer.f2461hb, 0, this.dataEnd);
                        if (j == this.fastBuffer.getChecksum(12, iUnpackSize) && parseData(zIsCipher)) {
                            this.checksum = j;
                            if (length == length2 && isABFileEqual()) {
                                return;
                            }
                            warning(new Exception("B file error"));
                            copyBuffer(this.aBuffer, this.bBuffer, this.dataEnd);
                            return;
                        }
                    }
                    if (iUnpackSize2 >= 0 && iUnpackSize2 <= length2 - 12) {
                        this.data.clear();
                        clearInvalid();
                        this.dataEnd = iUnpackSize2 + 12;
                        if (this.fastBuffer.f2461hb.length != this.bBuffer.capacity()) {
                            this.fastBuffer = new FastBuffer(this.bBuffer.capacity());
                        }
                        this.bBuffer.rewind();
                        this.bBuffer.get(this.fastBuffer.f2461hb, 0, this.dataEnd);
                        if (j2 == this.fastBuffer.getChecksum(12, iUnpackSize2) && parseData(zIsCipher2)) {
                            warning(new Exception("A file error"));
                            copyBuffer(this.bBuffer, this.aBuffer, this.dataEnd);
                            this.checksum = j2;
                            return;
                        }
                    }
                    error("both files error");
                    clearData();
                    return;
                } catch (IOException e) {
                    error(e);
                    toBlockingMode();
                    tryBlockingIO(file, file2);
                    return;
                }
            }
            error(new Exception("open file failed"));
            toBlockingMode();
        } catch (Exception e2) {
            error(e2);
            resetMemory();
            toBlockingMode();
        }
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
                    deleteCFiles();
                    return false;
                }
                if (this.writingMode == 0) {
                    if (!writeToABFile(this.fastBuffer)) {
                        this.writingMode = 1;
                        return false;
                    }
                    info("recover from c file");
                    try {
                        deleteCFiles();
                        return true;
                    } catch (Exception e) {
                        e = e;
                        z = true;
                        error(e);
                        return z;
                    }
                }
            } else if (this.writingMode != 0) {
                File file3 = new File(this.path, this.name + ".kva");
                File file4 = new File(this.path, this.name + ".kvb");
                if (file3.exists() && file4.exists()) {
                    tryBlockingIO(file3, file4);
                }
            }
            return false;
        } catch (Exception e2) {
            e = e2;
        }
    }

    private void resetBuffer(MappedByteBuffer mappedByteBuffer) throws IOException {
        int iCapacity = mappedByteBuffer.capacity();
        int i = AbsFastKV.PAGE_SIZE;
        if (iCapacity != i) {
            FileChannel fileChannel = mappedByteBuffer == this.aBuffer ? this.aChannel : this.bChannel;
            fileChannel.truncate(i);
            MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, i);
            map.order(ByteOrder.LITTLE_ENDIAN);
            if (mappedByteBuffer == this.aBuffer) {
                this.aBuffer = map;
            } else {
                this.bBuffer = map;
            }
            mappedByteBuffer = map;
        }
        mappedByteBuffer.putInt(0, packSize(0));
        mappedByteBuffer.putLong(4, 0L);
    }

    private void syncToABBuffer(MappedByteBuffer mappedByteBuffer) {
        mappedByteBuffer.putLong(4, this.checksum);
        int i = this.removeStart;
        if (i != 0) {
            mappedByteBuffer.put(i, this.fastBuffer.f2461hb[i]);
        }
        if (this.updateSize != 0) {
            mappedByteBuffer.position(this.updateStart);
            mappedByteBuffer.put(this.fastBuffer.f2461hb, this.updateStart, this.updateSize);
        }
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

    private void truncate(int i) {
        int i2 = AbsFastKV.PAGE_SIZE;
        int newCapacity = getNewCapacity(i2, i + i2);
        byte[] bArr = this.fastBuffer.f2461hb;
        if (newCapacity >= bArr.length) {
            return;
        }
        byte[] bArr2 = new byte[newCapacity];
        System.arraycopy(bArr, 0, bArr2, 0, this.dataEnd);
        this.fastBuffer.f2461hb = bArr2;
        if (this.writingMode == 0) {
            try {
                long j = newCapacity;
                this.aChannel.truncate(j);
                FileChannel fileChannel = this.aChannel;
                FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                MappedByteBuffer map = fileChannel.map(mapMode, 0L, j);
                this.aBuffer = map;
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                map.order(byteOrder);
                this.bChannel.truncate(j);
                MappedByteBuffer map2 = this.bChannel.map(mapMode, 0L, j);
                this.bBuffer = map2;
                map2.order(byteOrder);
            } catch (Exception e) {
                error(new Exception("map failed", e));
                toBlockingMode();
            }
        }
        info("truncate finish");
    }

    private boolean writeToABFile(FastBuffer fastBuffer) {
        int length = fastBuffer.f2461hb.length;
        File file = new File(this.path, z30.m2767l(new StringBuilder(), this.name, ".kva"));
        File file2 = new File(this.path, z30.m2767l(new StringBuilder(), this.name, ".kvb"));
        try {
            if (!Utils.makeFileIfNotExist(file) || !Utils.makeFileIfNotExist(file2)) {
                throw new Exception("open file failed");
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            long j = length;
            randomAccessFile.setLength(j);
            FileChannel channel = randomAccessFile.getChannel();
            this.aChannel = channel;
            FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
            MappedByteBuffer map = channel.map(mapMode, 0L, j);
            this.aBuffer = map;
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            map.order(byteOrder);
            this.aBuffer.put(fastBuffer.f2461hb, 0, this.dataEnd);
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file2, "rw");
            randomAccessFile2.setLength(j);
            FileChannel channel2 = randomAccessFile2.getChannel();
            this.bChannel = channel2;
            MappedByteBuffer map2 = channel2.map(mapMode, 0L, j);
            this.bBuffer = map2;
            map2.order(byteOrder);
            this.bBuffer.put(fastBuffer.f2461hb, 0, this.dataEnd);
            return true;
        } catch (Exception e) {
            error(e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean writeToCFile() {
        try {
            File file = new File(this.path, this.name + ".tmp");
            if (Utils.saveBytes(file, this.fastBuffer.f2461hb, this.dataEnd)) {
                if (Utils.renameFile(file, new File(this.path, this.name + ".kvc"))) {
                    clearDeletedFiles();
                    return true;
                }
                warning(new Exception("rename failed"));
            }
        } catch (Exception e) {
            error(e);
        }
        return false;
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized void apply() {
        if (this.closed) {
            return;
        }
        this.autoCommit = true;
        commitToCFile();
    }

    @Override // io.fastkv.AbsFastKV
    public void checkGC() {
        if (this.invalidBytes < (bytesThreshold() << 1)) {
            if (this.invalids.size() < (this.dataEnd < 16384 ? 80 : 160)) {
                return;
            }
        }
        m1452gc(0);
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized SharedPreferences.Editor clear() {
        try {
            if (this.closed) {
                return this;
            }
            clearData();
            if (this.writingMode != 0) {
                deleteCFiles();
            }
            notifyListeners(null);
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void close() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.closed     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L7
            monitor-exit(r4)
            return
        L7:
            r0 = 1
            r4.closed = r0     // Catch: java.lang.Throwable -> L24
            int r0 = r4.writingMode     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L2a
            java.nio.channels.FileChannel r0 = r4.aChannel     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            r1 = 0
            r0.force(r1)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            java.nio.channels.FileChannel r0 = r4.aChannel     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            r0.close()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            java.nio.channels.FileChannel r0 = r4.bChannel     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            r0.force(r1)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            java.nio.channels.FileChannel r0 = r4.bChannel     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            r0.close()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26
            goto L2a
        L24:
            r0 = move-exception
            goto L4b
        L26:
            r0 = move-exception
            r4.error(r0)     // Catch: java.lang.Throwable -> L24
        L2a:
            java.lang.Class<io.fastkv.FastKV$Builder> r0 = io.fastkv.FastKV.Builder.class
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L24
            java.util.Map<java.lang.String, io.fastkv.FastKV> r1 = io.fastkv.FastKV.Builder.INSTANCE_MAP     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r2.<init>()     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = r4.path     // Catch: java.lang.Throwable -> L48
            r2.append(r3)     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = r4.name     // Catch: java.lang.Throwable -> L48
            r2.append(r3)     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L48
            r1.remove(r2)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r4)
            return
        L48:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r1     // Catch: java.lang.Throwable -> L24
        L4b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fastkv.FastKV.close():void");
    }

    @Override // android.content.SharedPreferences.Editor
    public synchronized boolean commit() {
        if (this.closed) {
            return false;
        }
        this.autoCommit = true;
        return commitToCFile();
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ boolean contains(String str) {
        return super.contains(str);
    }

    @Override // io.fastkv.AbsFastKV
    public void copyToMainFile(FastKV fastKV) {
        MappedByteBuffer mappedByteBuffer;
        FastBuffer fastBuffer = fastKV.fastBuffer;
        if (this.writingMode == 0) {
            int length = fastBuffer.f2461hb.length;
            MappedByteBuffer mappedByteBuffer2 = this.aBuffer;
            if (mappedByteBuffer2 != null && mappedByteBuffer2.capacity() == length && (mappedByteBuffer = this.bBuffer) != null && mappedByteBuffer.capacity() == length) {
                this.aBuffer.position(0);
                this.aBuffer.put(fastBuffer.f2461hb, 0, this.dataEnd);
                this.bBuffer.position(0);
                this.bBuffer.put(fastBuffer.f2461hb, 0, this.dataEnd);
            } else if (!writeToABFile(fastBuffer)) {
                this.writingMode = 1;
            }
        }
        if (this.writingMode != 0) {
            writeToCFile();
        }
    }

    public synchronized void disableAutoCommit() {
        this.autoCommit = false;
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ SharedPreferences.Editor edit() {
        return super.edit();
    }

    @Override // io.fastkv.AbsFastKV
    public void ensureSize(int i) {
        int length = this.fastBuffer.f2461hb.length;
        int i2 = this.dataEnd + i;
        if (i2 >= length) {
            int i3 = this.invalidBytes;
            if (i3 > i && i3 > bytesThreshold()) {
                m1452gc(i);
                return;
            }
            int newCapacity = getNewCapacity(length, i2);
            byte[] bArr = new byte[newCapacity];
            System.arraycopy(this.fastBuffer.f2461hb, 0, bArr, 0, this.dataEnd);
            this.fastBuffer.f2461hb = bArr;
            if (this.writingMode == 0) {
                try {
                    FileChannel fileChannel = this.aChannel;
                    FileChannel.MapMode mapMode = FileChannel.MapMode.READ_WRITE;
                    long j = newCapacity;
                    MappedByteBuffer map = fileChannel.map(mapMode, 0L, j);
                    this.aBuffer = map;
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    map.order(byteOrder);
                    MappedByteBuffer map2 = this.bChannel.map(mapMode, 0L, j);
                    this.bBuffer = map2;
                    map2.order(byteOrder);
                } catch (IOException e) {
                    error(new Exception("map failed", e));
                    this.fastBuffer.putInt(0, packSize(this.dataEnd - 12));
                    this.fastBuffer.putLong(4, this.checksum);
                    toBlockingMode();
                }
            }
        }
    }

    public synchronized void force() {
        if (this.closed) {
            return;
        }
        if (this.writingMode == 0) {
            this.aBuffer.force();
            this.bBuffer.force();
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
        checkIfCommit();
        notifyListeners(str);
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
            if (this.closed) {
                return this;
            }
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
                byte b = (byte) (type | DataType.DELETE_MASK);
                if (this.writingMode == 0) {
                    this.aBuffer.putLong(4, this.checksum);
                    this.aBuffer.put(this.removeStart, b);
                    this.bBuffer.putLong(4, this.checksum);
                    this.bBuffer.put(this.removeStart, b);
                } else {
                    this.fastBuffer.putLong(4, this.checksum);
                }
                this.removeStart = 0;
                if (str2 != null) {
                    if (this.writingMode == 0) {
                        FastKVConfig.getExecutor().execute(new RunnableC0673rj(this, str2, 1));
                    } else {
                        this.deletedFiles.add(str2);
                    }
                }
                checkGC();
                checkIfCommit();
            }
            return this;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.fastkv.AbsFastKV
    public void removeOldFile(String str) {
        if (this.writingMode == 0) {
            FastKVConfig.getExecutor().execute(new RunnableC0673rj(this, str, 0));
        } else {
            this.deletedFiles.add(str);
        }
    }

    @Override // io.fastkv.AbsFastKV
    public void syncCompatBuffer(int i, int i2, int i3) {
        int iPackSize = packSize(this.dataEnd - 12);
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            this.aBuffer.putLong(4, this.checksum);
            this.aBuffer.position(i);
            this.aBuffer.put(this.fastBuffer.f2461hb, i, i3);
            this.aBuffer.putInt(0, iPackSize);
            this.bBuffer.putInt(0, iPackSize);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.position(i);
            this.bBuffer.put(this.fastBuffer.f2461hb, i, i3);
        } else {
            this.fastBuffer.putInt(0, iPackSize);
            this.fastBuffer.putLong(4, this.checksum);
        }
        int i4 = this.dataEnd + i2;
        if (this.fastBuffer.f2461hb.length - i4 > AbsFastKV.TRUNCATE_THRESHOLD) {
            truncate(i4);
        }
    }

    public synchronized String toString() {
        return "FastKV: path:" + this.path + " name:" + this.name;
    }

    @Override // io.fastkv.AbsFastKV, android.content.SharedPreferences
    public /* bridge */ /* synthetic */ void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        super.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // io.fastkv.AbsFastKV
    public void updateBoolean(byte b, int i) {
        long jShiftCheckSum = this.checksum ^ shiftCheckSum(1L, i);
        this.checksum = jShiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, jShiftCheckSum);
            this.aBuffer.put(i, b);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.put(i, b);
        } else {
            this.fastBuffer.putLong(4, jShiftCheckSum);
        }
        this.fastBuffer.f2461hb[i] = b;
    }

    @Override // io.fastkv.AbsFastKV
    public void updateBytes(int i, byte[] bArr) {
        super.updateBytes(i, bArr);
        if (this.writingMode != 0) {
            this.fastBuffer.putLong(4, this.checksum);
            return;
        }
        this.aBuffer.putInt(0, -1);
        this.aBuffer.putLong(4, this.checksum);
        this.aBuffer.position(i);
        this.aBuffer.put(bArr);
        this.aBuffer.putInt(0, packSize(this.dataEnd - 12));
        this.bBuffer.putLong(4, this.checksum);
        this.bBuffer.position(i);
        this.bBuffer.put(bArr);
    }

    @Override // io.fastkv.AbsFastKV
    public void updateChange() {
        this.checksum ^= this.fastBuffer.getChecksum(this.updateStart, this.updateSize);
        int iPackSize = packSize(this.dataEnd - 12);
        if (this.writingMode == 0) {
            this.aBuffer.putInt(0, -1);
            syncToABBuffer(this.aBuffer);
            this.aBuffer.putInt(0, iPackSize);
            this.bBuffer.putInt(0, iPackSize);
            syncToABBuffer(this.bBuffer);
        } else {
            this.fastBuffer.putInt(0, iPackSize);
            this.fastBuffer.putLong(4, this.checksum);
        }
        this.removeStart = 0;
        this.updateSize = 0;
    }

    @Override // io.fastkv.AbsFastKV
    public void updateInt32(int i, long j, int i2) {
        long jShiftCheckSum = shiftCheckSum(j, i2) ^ this.checksum;
        this.checksum = jShiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, jShiftCheckSum);
            this.aBuffer.putInt(i2, i);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.putInt(i2, i);
        } else {
            this.fastBuffer.putLong(4, jShiftCheckSum);
        }
        this.fastBuffer.putInt(i2, i);
    }

    @Override // io.fastkv.AbsFastKV
    public void updateInt64(long j, long j2, int i) {
        long jShiftCheckSum = shiftCheckSum(j2, i) ^ this.checksum;
        this.checksum = jShiftCheckSum;
        if (this.writingMode == 0) {
            this.aBuffer.putLong(4, jShiftCheckSum);
            this.aBuffer.putLong(i, j);
            this.bBuffer.putLong(4, this.checksum);
            this.bBuffer.putLong(i, j);
        } else {
            this.fastBuffer.putLong(4, jShiftCheckSum);
        }
        this.fastBuffer.putLong(i, j);
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
    public synchronized void putAll(Map<String, Object> map, Map<Class, FastEncoder> map2) {
        try {
            if (this.closed) {
                return;
            }
            if (this.writingMode != 0) {
                this.autoCommit = false;
            }
            super.putAll(map, map2);
            if (this.writingMode != 0) {
                commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static final class Builder {
        static final Map<String, FastKV> INSTANCE_MAP = new ConcurrentHashMap();
        private FastCipher cipher;
        private FastEncoder[] encoders;
        private final String name;
        private final String path;
        private int writingMode = 0;

        public Builder(Context context, String str) {
            if (context == null) {
                throw new IllegalArgumentException("context is null");
            }
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            this.path = context.getFilesDir().getAbsolutePath() + "/fastkv/";
            this.name = str;
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
            FastKV fastKV;
            String str = this.path + this.name;
            Map<String, FastKV> map = INSTANCE_MAP;
            FastKV fastKV2 = map.get(str);
            if (fastKV2 != null) {
                return fastKV2;
            }
            synchronized (Builder.class) {
                try {
                    fastKV = map.get(str);
                    if (fastKV == null) {
                        FastKV fastKV3 = new FastKV(this.path, this.name, this.encoders, this.cipher, this.writingMode);
                        map.put(str, fastKV3);
                        fastKV = fastKV3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return fastKV;
        }

        public Builder cipher(FastCipher fastCipher) {
            this.cipher = fastCipher;
            return this;
        }

        public Builder encoder(FastEncoder[] fastEncoderArr) {
            this.encoders = fastEncoderArr;
            return this;
        }

        public Builder(String str, String str2) {
            if (str != null && !str.isEmpty()) {
                if (str2 != null && !str2.isEmpty()) {
                    this.path = str.endsWith("/") ? str : str.concat("/");
                    this.name = str2;
                    return;
                }
                throw new IllegalArgumentException("name is empty");
            }
            throw new IllegalArgumentException("path is empty");
        }
    }

    @Override // io.fastkv.AbsFastKV
    public void remove(byte b, int i, int i2) {
        super.remove(b, i, i2);
        this.removeStart = i;
    }
}
