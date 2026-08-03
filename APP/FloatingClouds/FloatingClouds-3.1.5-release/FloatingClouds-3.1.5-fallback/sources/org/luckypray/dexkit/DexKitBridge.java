package org.luckypray.dexkit;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/luckypray/dexkit/DexKitBridge;", "Ljava/io/Closeable;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DexKitBridge implements java.io.Closeable, java.lang.AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f1107a;
    public final java.util.concurrent.locks.ReentrantReadWriteLock b;

    public DexKitBridge(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r2.b = r0
            long r0 = nativeInitDexKit(r3)
            r2.f1107a = r0
            return
    }

    public static final /* synthetic */ byte[] a(long r0, long r2) {
            byte[] r0 = nativeFieldGetMethods(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] b(long r0, long r2) {
            byte[] r0 = nativeFieldPutMethods(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] c(long r0, byte[] r2) {
            byte[] r0 = nativeFindField(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] d(long r0, long r2) {
            byte[] r0 = nativeGetCallMethods(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] e(long r0, long r2) {
            byte[] r0 = nativeGetClassAnnotations(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] f(long r0, long r2) {
            byte[] r0 = nativeGetFieldAnnotations(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] g(long r0, long[] r2) {
            byte[] r0 = nativeGetFieldByIds(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] h(long r0, long r2) {
            byte[] r0 = nativeGetInvokeMethods(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] i(long r0, long r2) {
            byte[] r0 = nativeGetMethodAnnotations(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] j(long r0, long[] r2) {
            byte[] r0 = nativeGetMethodByIds(r0, r2)
            return r0
    }

    public static final /* synthetic */ int[] k(long r0, long r2) {
            int[] r0 = nativeGetMethodOpCodes(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] l(long r0, long r2) {
            byte[] r0 = nativeGetMethodUsingFields(r0, r2)
            return r0
    }

    public static final /* synthetic */ java.lang.String[] m(long r0, long r2) {
            java.lang.String[] r0 = nativeGetMethodUsingStrings(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] n(long r0, long r2) {
            byte[] r0 = nativeGetParameterAnnotations(r0, r2)
            return r0
    }

    private static final native byte[] nativeBatchFindClassUsingStrings(long r0, byte[] r2);

    private static final native byte[] nativeBatchFindMethodUsingStrings(long r0, byte[] r2);

    private static final native void nativeExportDexFile(long r0, java.lang.String r2);

    private static final native byte[] nativeFieldGetMethods(long r0, long r2);

    private static final native byte[] nativeFieldPutMethods(long r0, long r2);

    private static final native byte[] nativeFindClass(long r0, byte[] r2);

    private static final native byte[] nativeFindField(long r0, byte[] r2);

    private static final native byte[] nativeFindMethod(long r0, byte[] r2);

    private static final native byte[] nativeGetCallMethods(long r0, long r2);

    private static final native byte[] nativeGetClassAnnotations(long r0, long r2);

    private static final native byte[] nativeGetClassByIds(long r0, long[] r2);

    private static final native byte[] nativeGetClassData(long r0, java.lang.String r2);

    private static final native int nativeGetDexNum(long r0);

    private static final native byte[] nativeGetFieldAnnotations(long r0, long r2);

    private static final native byte[] nativeGetFieldByIds(long r0, long[] r2);

    private static final native byte[] nativeGetFieldData(long r0, java.lang.String r2);

    private static final native byte[] nativeGetInvokeMethods(long r0, long r2);

    private static final native byte[] nativeGetMethodAnnotations(long r0, long r2);

    private static final native byte[] nativeGetMethodByIds(long r0, long[] r2);

    private static final native byte[] nativeGetMethodData(long r0, java.lang.String r2);

    private static final native int[] nativeGetMethodOpCodes(long r0, long r2);

    private static final native byte[] nativeGetMethodUsingFields(long r0, long r2);

    private static final native java.lang.String[] nativeGetMethodUsingStrings(long r0, long r2);

    private static final native byte[] nativeGetParameterAnnotations(long r0, long r2);

    private static final native java.lang.String[] nativeGetParameterNames(long r0, long r2);

    private static final native long nativeInitDexKit(java.lang.String r0);

    private static final native long nativeInitDexKitByBytesArray(byte[][] r0);

    private static final native long nativeInitDexKitByClassLoader(java.lang.ClassLoader r0, boolean r1);

    private static final native void nativeInitFullCache(long r0);

    private static final native void nativeRelease(long r0);

    private static final native void nativeSetMaxConcurrentQueries(long r0, int r2);

    private static final native void nativeSetThreadNum(long r0, int r2);

    public static final /* synthetic */ java.lang.String[] o(long r0, long r2) {
            java.lang.String[] r0 = nativeGetParameterNames(r0, r2)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r9 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r9.b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L12
            int r2 = r0.getReadHoldCount()
            goto L13
        L12:
            r2 = r3
        L13:
            r4 = r3
        L14:
            if (r4 >= r2) goto L1c
            r1.unlock()
            int r4 = r4 + 1
            goto L14
        L1c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            long r4 = r9.f1107a     // Catch: java.lang.Throwable -> L4a
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L37
        L2b:
            if (r3 >= r2) goto L33
            r1.lock()
            int r3 = r3 + 1
            goto L2b
        L33:
            r0.unlock()
            return
        L37:
            r9.f1107a = r6     // Catch: java.lang.Throwable -> L4a
            nativeRelease(r4)     // Catch: java.lang.Throwable -> L4a
            a.Wf r4 = a.Wf.f330a     // Catch: java.lang.Throwable -> L4a
        L3e:
            if (r3 >= r2) goto L46
            r1.lock()
            int r3 = r3 + 1
            goto L3e
        L46:
            r0.unlock()
            return
        L4a:
            r4 = move-exception
        L4b:
            if (r3 >= r2) goto L53
            r1.lock()
            int r3 = r3 + 1
            goto L4b
        L53:
            r0.unlock()
            throw r4
    }

    public final void finalize() {
            r0 = this;
            r0.close()
            return
    }

    public final a.C0097d3 p(a.C0476y6 r6) {
            r5 = this;
            byte[] r6 = r6.g()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            long r1 = r5.f1107a     // Catch: java.lang.Throwable -> L7e
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L76
            byte[] r6 = nativeFindClass(r1, r6)     // Catch: java.lang.Throwable -> L7e
            r0.unlock()
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            java.lang.String r0 = "wrap(res)"
            a.C0193i9.d(r6, r0)
            a.a r0 = new a.a
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r6.order(r1)
            int r1 = r6.position()
            int r1 = r6.getInt(r1)
            int r2 = r6.position()
            int r2 = r2 + r1
            r0.c(r2, r6)
            a.d3 r6 = new a.d3
            r6.<init>()
            r1 = 4
            int r1 = r0.b(r1)
            r2 = 0
            if (r1 == 0) goto L51
            int r1 = r0.f(r1)
            goto L52
        L51:
            r1 = r2
        L52:
            if (r2 >= r1) goto L65
            a.d r3 = r0.h(r2)
            a.C0193i9.b(r3)
            a.b3 r3 = a.C0060b3.a.a(r5, r3)
            r6.add(r3)
            int r2 = r2 + 1
            goto L52
        L65:
            int r0 = r6.size()
            r1 = 1
            if (r0 <= r1) goto L75
            a.Z4 r0 = new a.Z4
            r1 = 0
            r0.<init>(r1)
            a.C0365s3.j0(r6, r0)
        L75:
            return r6
        L76:
            java.lang.String r6 = "DexKitBridge is not valid"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7e
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L7e
            throw r1     // Catch: java.lang.Throwable -> L7e
        L7e:
            r6 = move-exception
            r0.unlock()
            throw r6
    }

    public final a.C0302ob q(a.C0494z6 r6) {
            r5 = this;
            byte[] r6 = r6.g()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            long r1 = r5.f1107a     // Catch: java.lang.Throwable -> L75
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L6d
            byte[] r6 = nativeFindMethod(r1, r6)     // Catch: java.lang.Throwable -> L75
            r0.unlock()
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            java.lang.String r0 = "wrap(res)"
            a.C0193i9.d(r6, r0)
            a.a r0 = new a.a
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r6.order(r1)
            int r1 = r6.position()
            int r1 = r6.getInt(r1)
            int r2 = r6.position()
            int r2 = r2 + r1
            r0.c(r2, r6)
            a.ob r6 = new a.ob
            r6.<init>()
            int r1 = r0.j()
            r2 = 0
        L49:
            if (r2 >= r1) goto L5c
            a.p r3 = r0.k(r2)
            a.C0193i9.b(r3)
            a.lb r3 = a.C0248lb.a.a(r5, r3)
            r6.add(r3)
            int r2 = r2 + 1
            goto L49
        L5c:
            int r0 = r6.size()
            r1 = 1
            if (r0 <= r1) goto L6c
            a.Z4 r0 = new a.Z4
            r1 = 2
            r0.<init>(r1)
            a.C0365s3.j0(r6, r0)
        L6c:
            return r6
        L6d:
            java.lang.String r6 = "DexKitBridge is not valid"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L75
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L75
            throw r1     // Catch: java.lang.Throwable -> L75
        L75:
            r6 = move-exception
            r0.unlock()
            throw r6
    }

    public final a.C0097d3 r(long[] r6) {
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            long r1 = r5.f1107a     // Catch: java.lang.Throwable -> L6a
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L62
            byte[] r6 = nativeGetClassByIds(r1, r6)     // Catch: java.lang.Throwable -> L6a
            r0.unlock()
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            java.lang.String r0 = "wrap(res)"
            a.C0193i9.d(r6, r0)
            a.a r0 = new a.a
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r6.order(r1)
            int r1 = r6.position()
            int r1 = r6.getInt(r1)
            int r2 = r6.position()
            int r2 = r2 + r1
            r0.c(r2, r6)
            a.d3 r6 = new a.d3
            r6.<init>()
            r1 = 4
            int r1 = r0.b(r1)
            r2 = 0
            if (r1 == 0) goto L4d
            int r1 = r0.f(r1)
            goto L4e
        L4d:
            r1 = r2
        L4e:
            if (r2 >= r1) goto L61
            a.d r3 = r0.h(r2)
            a.C0193i9.b(r3)
            a.b3 r3 = a.C0060b3.a.a(r5, r3)
            r6.add(r3)
            int r2 = r2 + 1
            goto L4e
        L61:
            return r6
        L62:
            java.lang.String r6 = "DexKitBridge is not valid"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L6a
            throw r1     // Catch: java.lang.Throwable -> L6a
        L6a:
            r6 = move-exception
            r0.unlock()
            throw r6
    }
}
