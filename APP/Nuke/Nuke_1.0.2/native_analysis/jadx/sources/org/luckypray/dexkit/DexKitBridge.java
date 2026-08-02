package org.luckypray.dexkit;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000.AbstractC0738tl;
import p000.C0000a;
import p000.C0185f;
import p000.C0858ws;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitBridge implements Closeable {

    /* JADX INFO: renamed from: h */
    public volatile long f7818h;

    /* JADX INFO: renamed from: i */
    public final ReentrantReadWriteLock f7819i = new ReentrantReadWriteLock();

    public DexKitBridge(ClassLoader classLoader) {
        this.f7818h = nativeInitDexKitByClassLoader(classLoader, true);
    }

    private static final native byte[] nativeBatchFindClassUsingStrings(long j, byte[] bArr);

    private static final native byte[] nativeBatchFindMethodUsingStrings(long j, byte[] bArr);

    private static final native void nativeExportDexFile(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFieldGetMethods(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFieldPutMethods(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFindClass(long j, byte[] bArr);

    private static final native byte[] nativeFindField(long j, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFindMethod(long j, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetCallMethods(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetClassAnnotations(long j, long j2);

    private static final native byte[] nativeGetClassByIds(long j, long[] jArr);

    private static final native byte[] nativeGetClassData(long j, String str);

    private static final native int nativeGetDexNum(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetFieldAnnotations(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetFieldByIds(long j, long[] jArr);

    private static final native byte[] nativeGetFieldData(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetInvokeMethods(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetMethodAnnotations(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetMethodByIds(long j, long[] jArr);

    private static final native byte[] nativeGetMethodData(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int[] nativeGetMethodOpCodes(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetMethodUsingFields(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native String[] nativeGetMethodUsingStrings(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetParameterAnnotations(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native String[] nativeGetParameterNames(long j, long j2);

    private static final native long nativeInitDexKit(String str);

    private static final native long nativeInitDexKitByBytesArray(byte[][] bArr);

    private static final native long nativeInitDexKitByClassLoader(ClassLoader classLoader, boolean z);

    private static final native void nativeInitFullCache(long j);

    private static final native void nativeRelease(long j);

    private static final native void nativeSetMaxConcurrentQueries(long j, int i);

    private static final native void nativeSetThreadNum(long j, int i);

    /* JADX INFO: renamed from: D */
    public final C0858ws m3629D(long[] jArr) {
        ReentrantReadWriteLock.ReadLock lock = this.f7819i.readLock();
        lock.lock();
        try {
            long j = this.f7818h;
            if (j == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrNativeGetClassByIds = nativeGetClassByIds(j, jArr);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetClassByIds);
            byteBufferWrap.getClass();
            C0000a c0000a = new C0000a();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            c0000a.m3662c(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
            C0858ws c0858ws = new C0858ws();
            int iM3661b = c0000a.m3661b(4);
            int iM3665f = iM3661b != 0 ? c0000a.m3665f(iM3661b) : 0;
            for (int i = 0; i < iM3665f; i++) {
                C0185f c0185fM1h = c0000a.m1h(i);
                c0185fM1h.getClass();
                c0858ws.add(AbstractC0738tl.m5327z(this, c0185fM1h));
            }
            return c0858ws;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f7819i;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            long j = this.f7818h;
            if (j == 0) {
                return;
            }
            this.f7818h = 0L;
            nativeRelease(j);
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final void finalize() {
        close();
    }
}
