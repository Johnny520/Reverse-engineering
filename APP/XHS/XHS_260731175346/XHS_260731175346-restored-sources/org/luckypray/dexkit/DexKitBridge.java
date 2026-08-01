package org.luckypray.dexkit;

/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitBridge implements java.io.Closeable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public volatile long f136;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.util.concurrent.locks.ReentrantReadWriteLock f137;

    public DexKitBridge(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r1.f137 = r0
            long r2 = nativeInitDexKit(r2, r3)
            r1.f136 = r2
            return
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

    private static final native long nativeInitDexKit(java.lang.String r0, java.lang.String r1);

    private static final native long nativeInitDexKitByBytesArray(byte[][] r0, java.lang.String r1);

    private static final native long nativeInitDexKitByClassLoader(java.lang.ClassLoader r0, boolean r1, java.lang.String r2);

    private static final native void nativeInitFullCache(long r0);

    private static final native void nativeRelease(long r0);

    private static final native void nativeSetMaxConcurrentQueries(long r0, int r2);

    private static final native void nativeSetThreadNum(long r0, int r2);

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final /* synthetic */ byte[] m83(long r0, long r2) {
            byte[] r0 = nativeFieldGetMethods(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final /* synthetic */ byte[] m84(long r0, long r2) {
            byte[] r0 = nativeGetCallMethods(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final /* synthetic */ byte[] m85(long r0, long r2) {
            byte[] r0 = nativeGetInvokeMethods(r0, r2)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r9 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r9.f137
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
            long r4 = r9.f136     // Catch: java.lang.Throwable -> L48
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
            r9.f136 = r6     // Catch: java.lang.Throwable -> L48
            nativeRelease(r4)     // Catch: java.lang.Throwable -> L48
        L3c:
            if (r3 >= r2) goto L44
            r1.lock()
            int r3 = r3 + 1
            goto L3c
        L44:
            r0.unlock()
            return
        L48:
            r9 = move-exception
        L49:
            if (r3 >= r2) goto L51
            r1.lock()
            int r3 = r3 + 1
            goto L49
        L51:
            r0.unlock()
            throw r9
    }

    public final void finalize() {
            r0 = this;
            r0.close()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final xhss.C1136 m86(xhss.C0616 r6) {
            r5 = this;
            byte[] r6 = r6.m408()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.f137
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            long r1 = r5.f136     // Catch: java.lang.Throwable -> L73
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L75
            byte[] r6 = nativeFindMethod(r1, r6)     // Catch: java.lang.Throwable -> L73
            r0.unlock()
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            xhss.ᛳᲁᲇᛸ r0 = new xhss.ᛳᲁᲇᛸ
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r6.order(r1)
            int r1 = r6.position()
            int r1 = r6.getInt(r1)
            int r2 = r6.position()
            int r2 = r2 + r1
            r0.m655(r2, r6)
            xhss.ᲈᛴᲀᛲ r6 = new xhss.ᲈᛴᲀᛲ
            r6.<init>()
            r1 = 4
            int r2 = r0.m654(r1)
            r3 = 0
            if (r2 == 0) goto L4c
            int r2 = r0.m661(r2)
            goto L4d
        L4c:
            r2 = r3
        L4d:
            if (r3 >= r2) goto L5d
            xhss.ᛳᲁᲇᛸ r4 = r0.m658(r3)
            xhss.ᛳᛸᛸᛵ r4 = xhss.AbstractC0775.m1318(r5, r4)
            r6.add(r4)
            int r3 = r3 + 1
            goto L4d
        L5d:
            int r5 = r6.size()
            r0 = 1
            if (r5 <= r0) goto L72
            xhss.ᛸᛲᲇᲁ r5 = new xhss.ᛸᛲᲇᲁ
            r5.<init>(r1)
            int r1 = r6.size()
            if (r1 <= r0) goto L72
            java.util.Collections.sort(r6, r5)
        L72:
            return r6
        L73:
            r5 = move-exception
            goto L7d
        L75:
            java.lang.String r5 = "DexKitBridge is not valid"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L73
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L73
            throw r6     // Catch: java.lang.Throwable -> L73
        L7d:
            r0.unlock()
            throw r5
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final xhss.C1149 m87(xhss.C0616 r18) {
            r17 = this;
            r1 = r17
            byte[] r0 = r18.m408()
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = r1.f137
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r2.readLock()
            r2.lock()
            long r3 = r1.f136     // Catch: java.lang.Throwable -> L111
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L113
            byte[] r0 = nativeFindField(r3, r0)     // Catch: java.lang.Throwable -> L111
            r2.unlock()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            xhss.ᛳᲁᲇᛸ r8 = new xhss.ᛳᲁᲇᛸ
            r8.<init>()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r2)
            int r2 = r0.position()
            int r2 = r0.getInt(r2)
            int r3 = r0.position()
            int r3 = r3 + r2
            r8.m655(r3, r0)
            xhss.ᲈᛶᲀᛱ r9 = new xhss.ᲈᛶᲀᛱ
            r9.<init>()
            r10 = 4
            int r0 = r8.m654(r10)
            r11 = 0
            if (r0 == 0) goto L4f
            int r0 = r8.m661(r0)
            r12 = r0
            goto L50
        L4f:
            r12 = r11
        L50:
            r13 = r11
        L51:
            if (r13 >= r12) goto Lfa
            xhss.ᛳᲁᲇᛸ r0 = new xhss.ᛳᲁᲇᛸ
            r0.<init>()
            int r2 = r8.m654(r10)
            r3 = 0
            if (r2 == 0) goto L70
            int r2 = r8.m656(r2)
            int r4 = r13 * 4
            int r4 = r4 + r2
            int r2 = r8.m657(r4)
            java.nio.ByteBuffer r4 = r8.f1202
            r0.m655(r2, r4)
            goto L71
        L70:
            r0 = r3
        L71:
            xhss.ᲀᛷᲀᲇ r2 = new xhss.ᲀᛷᲀᲇ
            int r4 = r0.m654(r10)
            if (r4 == 0) goto L83
            java.nio.ByteBuffer r5 = r0.f1202
            int r6 = r0.f1205
            int r4 = r4 + r6
            int r4 = r5.getInt(r4)
            goto L84
        L83:
            r4 = r11
        L84:
            r5 = 6
            int r5 = r0.m654(r5)
            if (r5 == 0) goto L95
            java.nio.ByteBuffer r6 = r0.f1202
            int r7 = r0.f1205
            int r5 = r5 + r7
            int r5 = r6.getInt(r5)
            goto L96
        L95:
            r5 = r11
        L96:
            r6 = 8
            int r6 = r0.m654(r6)
            if (r6 == 0) goto La8
            java.nio.ByteBuffer r7 = r0.f1202
            int r14 = r0.f1205
            int r6 = r6 + r14
            int r6 = r7.getInt(r6)
            goto La9
        La8:
            r6 = r11
        La9:
            r7 = 10
            int r7 = r0.m654(r7)
            if (r7 == 0) goto Lbb
            java.nio.ByteBuffer r14 = r0.f1202
            int r15 = r0.f1205
            int r7 = r7 + r15
            int r7 = r14.getInt(r7)
            goto Lbc
        Lbb:
            r7 = r11
        Lbc:
            r14 = 12
            int r14 = r0.m654(r14)
            if (r14 == 0) goto Lcb
            int r3 = r0.f1205
            int r14 = r14 + r3
            java.lang.String r3 = r0.m660(r14)
        Lcb:
            r14 = 14
            int r14 = r0.m654(r14)
            if (r14 == 0) goto Le7
            java.nio.ByteBuffer r15 = r0.f1202
            int r0 = r0.f1205
            int r14 = r14 + r0
            int r0 = r15.getInt(r14)
            r16 = r7
            r7 = r0
            r0 = r2
            r2 = r4
            r4 = r6
            r6 = r3
            r3 = r5
            r5 = r16
            goto Lee
        Le7:
            r0 = r2
            r2 = r4
            r4 = r6
            r6 = r3
            r3 = r5
            r5 = r7
            r7 = r11
        Lee:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.add(r0)
            int r13 = r13 + 1
            r1 = r17
            goto L51
        Lfa:
            int r0 = r9.size()
            r1 = 1
            if (r0 <= r1) goto L110
            xhss.ᛸᛲᲇᲁ r0 = new xhss.ᛸᛲᲇᲁ
            r2 = 3
            r0.<init>(r2)
            int r2 = r9.size()
            if (r2 <= r1) goto L110
            java.util.Collections.sort(r9, r0)
        L110:
            return r9
        L111:
            r0 = move-exception
            goto L11b
        L113:
            java.lang.String r0 = "DexKitBridge is not valid"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L111
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L111
            throw r1     // Catch: java.lang.Throwable -> L111
        L11b:
            r2.unlock()
            throw r0
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public final xhss.C0443 m88(long[] r6) {
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.f137
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            long r1 = r5.f136     // Catch: java.lang.Throwable -> L5a
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L5c
            byte[] r6 = nativeGetClassByIds(r1, r6)     // Catch: java.lang.Throwable -> L5a
            r0.unlock()
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            xhss.ᛳᲁᲇᛸ r0 = new xhss.ᛳᲁᲇᛸ
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r6.order(r1)
            int r1 = r6.position()
            int r1 = r6.getInt(r1)
            int r2 = r6.position()
            int r2 = r2 + r1
            r0.m655(r2, r6)
            xhss.ᛵᛲᛴᛵ r6 = new xhss.ᛵᛲᛴᛵ
            r6.<init>()
            r1 = 4
            int r1 = r0.m654(r1)
            r2 = 0
            if (r1 == 0) goto L48
            int r1 = r0.m661(r1)
            goto L49
        L48:
            r1 = r2
        L49:
            if (r2 >= r1) goto L59
            xhss.ᛳᲁᲇᛸ r3 = r0.m659(r2)
            xhss.ᲇᛸᛳᛸ r3 = xhss.AbstractC0007.m96(r5, r3)
            r6.add(r3)
            int r2 = r2 + 1
            goto L49
        L59:
            return r6
        L5a:
            r5 = move-exception
            goto L64
        L5c:
            java.lang.String r5 = "DexKitBridge is not valid"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5a
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L5a
            throw r6     // Catch: java.lang.Throwable -> L5a
        L64:
            r0.unlock()
            throw r5
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final xhss.C0443 m89(xhss.InterfaceC0645 r6) {
            r5 = this;
            xhss.ᛸᛴᛶᛷ r0 = new xhss.ᛸᛴᛶᛷ
            r0.<init>()
            r6.mo112(r0)
            byte[] r6 = r0.m408()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.f137
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            long r1 = r5.f136     // Catch: java.lang.Throwable -> L7c
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L7e
            byte[] r6 = nativeFindClass(r1, r6)     // Catch: java.lang.Throwable -> L7c
            r0.unlock()
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            xhss.ᛳᲁᲇᛸ r0 = new xhss.ᛳᲁᲇᛸ
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r6.order(r1)
            int r1 = r6.position()
            int r1 = r6.getInt(r1)
            int r2 = r6.position()
            int r2 = r2 + r1
            r0.m655(r2, r6)
            xhss.ᛵᛲᛴᛵ r6 = new xhss.ᛵᛲᛴᛵ
            r6.<init>()
            r1 = 4
            int r1 = r0.m654(r1)
            r2 = 0
            if (r1 == 0) goto L54
            int r1 = r0.m661(r1)
            goto L55
        L54:
            r1 = r2
        L55:
            if (r2 >= r1) goto L65
            xhss.ᛳᲁᲇᛸ r3 = r0.m659(r2)
            xhss.ᲇᛸᛳᛸ r3 = xhss.AbstractC0007.m96(r5, r3)
            r6.add(r3)
            int r2 = r2 + 1
            goto L55
        L65:
            int r5 = r6.size()
            r0 = 1
            if (r5 <= r0) goto L7b
            xhss.ᛸᛲᲇᲁ r5 = new xhss.ᛸᛲᲇᲁ
            r1 = 2
            r5.<init>(r1)
            int r1 = r6.size()
            if (r1 <= r0) goto L7b
            java.util.Collections.sort(r6, r5)
        L7b:
            return r6
        L7c:
            r5 = move-exception
            goto L86
        L7e:
            java.lang.String r5 = "DexKitBridge is not valid"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L7c
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L7c
            throw r6     // Catch: java.lang.Throwable -> L7c
        L86:
            r0.unlock()
            throw r5
    }
}
