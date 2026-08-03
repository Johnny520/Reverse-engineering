package org.luckypray.dexkit;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import p000a.C0413Wf;
import p000a.C0456Z4;
import p000a.C0469a;
import p000a.C0492b3;
import p000a.C0526d;
import p000a.C0530d3;
import p000a.C0631i9;
import p000a.C0690lb;
import p000a.C0747ob;
import p000a.C0754p;
import p000a.C0815s3;
import p000a.C0932y6;
import p000a.C0951z6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m3302d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m3303d2 = {"Lorg/luckypray/dexkit/DexKitBridge;", "Ljava/io/Closeable;", "dexkit-android_release"}, m3304k = 1, m3305mv = {1, 5, 1}, m3307xi = 48)
public final class DexKitBridge implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: a */
    public volatile long f6030a;

    /* JADX INFO: renamed from: b */
    public final ReentrantReadWriteLock f6031b = new ReentrantReadWriteLock();

    public DexKitBridge(String str) {
        this.f6030a = nativeInitDexKit(str);
    }

    private static final native byte[] nativeBatchFindClassUsingStrings(long j, byte[] bArr);

    private static final native byte[] nativeBatchFindMethodUsingStrings(long j, byte[] bArr);

    private static final native void nativeExportDexFile(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFieldGetMethods(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFieldPutMethods(long j, long j2);

    private static final native byte[] nativeFindClass(long j, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeFindField(long j, byte[] bArr);

    private static final native byte[] nativeFindMethod(long j, byte[] bArr);

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

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE, ARITH, INVOKE] complete} */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f6031b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            long j = this.f6030a;
            if (j == 0) {
                return;
            }
            this.f6030a = 0L;
            nativeRelease(j);
            C0413Wf c0413Wf = C0413Wf.f1577a;
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

    /* JADX INFO: renamed from: p */
    public final C0530d3 m3324p(C0932y6 c0932y6) {
        byte[] bArrM1115g = c0932y6.m1115g();
        ReentrantReadWriteLock.ReadLock lock = this.f6031b.readLock();
        lock.lock();
        try {
            long j = this.f6030a;
            if (j == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrNativeFindClass = nativeFindClass(j, bArrM1115g);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFindClass);
            C0631i9.m1481d(byteBufferWrap, "wrap(res)");
            C0469a c0469a = new C0469a();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            c0469a.m781c(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
            C0530d3 c0530d3 = new C0530d3();
            int iM780b = c0469a.m780b(4);
            int iM784f = iM780b != 0 ? c0469a.m784f(iM780b) : 0;
            for (int i = 0; i < iM784f; i++) {
                C0526d c0526dM1141h = c0469a.m1141h(i);
                C0631i9.m1479b(c0526dM1141h);
                c0530d3.add(C0492b3.a.m1196a(this, c0526dM1141h));
            }
            if (c0530d3.size() > 1) {
                C0815s3.m1888j0(c0530d3, new C0456Z4(0));
            }
            return c0530d3;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: q */
    public final C0747ob m3325q(C0951z6 c0951z6) {
        byte[] bArrM1115g = c0951z6.m1115g();
        ReentrantReadWriteLock.ReadLock lock = this.f6031b.readLock();
        lock.lock();
        try {
            long j = this.f6030a;
            if (j == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrNativeFindMethod = nativeFindMethod(j, bArrM1115g);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeFindMethod);
            C0631i9.m1481d(byteBufferWrap, "wrap(res)");
            C0469a c0469a = new C0469a();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            c0469a.m781c(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
            C0747ob c0747ob = new C0747ob();
            int iM1143j = c0469a.m1143j();
            for (int i = 0; i < iM1143j; i++) {
                C0754p c0754pM1144k = c0469a.m1144k(i);
                C0631i9.m1479b(c0754pM1144k);
                c0747ob.add(C0690lb.a.m1552a(this, c0754pM1144k));
            }
            if (c0747ob.size() > 1) {
                C0815s3.m1888j0(c0747ob, new C0456Z4(2));
            }
            return c0747ob;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: r */
    public final C0530d3 m3326r(long[] jArr) {
        ReentrantReadWriteLock.ReadLock lock = this.f6031b.readLock();
        lock.lock();
        try {
            long j = this.f6030a;
            if (j == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrNativeGetClassByIds = nativeGetClassByIds(j, jArr);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrNativeGetClassByIds);
            C0631i9.m1481d(byteBufferWrap, "wrap(res)");
            C0469a c0469a = new C0469a();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            c0469a.m781c(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
            C0530d3 c0530d3 = new C0530d3();
            int iM780b = c0469a.m780b(4);
            int iM784f = iM780b != 0 ? c0469a.m784f(iM780b) : 0;
            for (int i = 0; i < iM784f; i++) {
                C0526d c0526dM1141h = c0469a.m1141h(i);
                C0631i9.m1479b(c0526dM1141h);
                c0530d3.add(C0492b3.a.m1196a(this, c0526dM1141h));
            }
            return c0530d3;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }
}
