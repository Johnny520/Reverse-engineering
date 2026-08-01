package org.luckypray.dexkit;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p117X2.AbstractC1665j;
import p179i4.AbstractC2352g;
import p206n2.C2689a;
import p254v4.C3363j;
import p265x4.C3458d;

/* JADX INFO: loaded from: classes.dex */
public final class DexKitBridge implements Closeable {

    /* JADX INFO: renamed from: d */
    public volatile long f8836d;

    /* JADX INFO: renamed from: e */
    public final ReentrantReadWriteLock f8837e = new ReentrantReadWriteLock();

    public DexKitBridge(ClassLoader classLoader) {
        this.f8836d = nativeInitDexKitByClassLoader(classLoader, true);
    }

    private static final native byte[] nativeBatchFindClassUsingStrings(long j5, byte[] bArr);

    private static final native byte[] nativeBatchFindMethodUsingStrings(long j5, byte[] bArr);

    private static final native void nativeExportDexFile(long j5, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFieldGetMethods(long j5, long j6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFieldPutMethods(long j5, long j6);

    private static final native byte[] nativeFindClass(long j5, byte[] bArr);

    private static final native byte[] nativeFindField(long j5, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFindMethod(long j5, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetCallMethods(long j5, long j6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetClassAnnotations(long j5, long j6);

    private static final native byte[] nativeGetClassByIds(long j5, long[] jArr);

    private static final native byte[] nativeGetClassData(long j5, String str);

    private static final native int nativeGetDexNum(long j5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetFieldAnnotations(long j5, long j6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetFieldByIds(long j5, long[] jArr);

    private static final native byte[] nativeGetFieldData(long j5, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetInvokeMethods(long j5, long j6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetMethodAnnotations(long j5, long j6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetMethodByIds(long j5, long[] jArr);

    private static final native byte[] nativeGetMethodData(long j5, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int[] nativeGetMethodOpCodes(long j5, long j6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetMethodUsingFields(long j5, long j6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native String[] nativeGetMethodUsingStrings(long j5, long j6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetParameterAnnotations(long j5, long j6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native String[] nativeGetParameterNames(long j5, long j6);

    private static final native long nativeInitDexKit(String str);

    private static final native long nativeInitDexKitByBytesArray(byte[][] bArr);

    private static final native long nativeInitDexKitByClassLoader(ClassLoader classLoader, boolean z5);

    private static final native void nativeInitFullCache(long j5);

    private static final native void nativeRelease(long j5);

    private static final native void nativeSetMaxConcurrentQueries(long j5, int i5);

    private static final native void nativeSetThreadNum(long j5, int i5);

    /* JADX INFO: renamed from: D */
    public final C3363j m5006D(long[] jArr) {
        int i5;
        ReentrantReadWriteLock.ReadLock lock = this.f8837e.readLock();
        lock.lock();
        try {
            long j5 = this.f8836d;
            if (j5 == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrNativeGetClassByIds = nativeGetClassByIds(j5, jArr);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetClassByIds);
            AbstractC1665j.m2984d(byteBufferWrap, "wrap(res)");
            C2689a.m4670a();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            int iPosition = byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position());
            int i6 = iPosition - byteBufferWrap.getInt(iPosition);
            short s5 = byteBufferWrap.getShort(i6);
            C3363j c3363j = new C3363j();
            short s6 = 4 < s5 ? byteBufferWrap.getShort(i6 + 4) : (short) 0;
            if (s6 != 0) {
                int i7 = s6 + iPosition;
                i5 = byteBufferWrap.getInt(byteBufferWrap.getInt(i7) + i7);
            } else {
                i5 = 0;
            }
            for (int i8 = 0; i8 < i5; i8++) {
                C3458d c3458d = new C3458d();
                short s7 = 4 < s5 ? byteBufferWrap.getShort(i6 + 4) : (short) 0;
                if (s7 != 0) {
                    int i9 = s7 + iPosition;
                    int i10 = (i8 * 4) + byteBufferWrap.getInt(i9) + i9 + 4;
                    c3458d.m4686c(byteBufferWrap.getInt(i10) + i10, byteBufferWrap);
                } else {
                    c3458d = null;
                }
                AbstractC1665j.m2982b(c3458d);
                c3363j.add(AbstractC2352g.m4205r(this, c3458d));
            }
            return c3363j;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f8837e;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i5 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i6 = 0; i6 < readHoldCount; i6++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            long j5 = this.f8836d;
            if (j5 == 0) {
                return;
            }
            this.f8836d = 0L;
            nativeRelease(j5);
            while (i5 < readHoldCount) {
                lock.lock();
                i5++;
            }
            writeLock.unlock();
        } finally {
            while (i5 < readHoldCount) {
                lock.lock();
                i5++;
            }
            writeLock.unlock();
        }
    }

    public final void finalize() {
        close();
    }
}
