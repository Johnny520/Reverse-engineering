package org.luckypray.dexkit;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitBridge implements java.io.Closeable {
    public static final bh.a Companion = null;
    private long token;

    static {
            bh.a r0 = new bh.a
            r0.<init>()
            org.luckypray.dexkit.DexKitBridge.Companion = r0
            return
    }

    private DexKitBridge(java.lang.ClassLoader r2, boolean r3) {
            r1 = this;
            r1.<init>()
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            r0.getClass()
            long r2 = access$nativeInitDexKitByClassLoader(r2, r3)
            r1.token = r2
            return
    }

    public /* synthetic */ DexKitBridge(java.lang.ClassLoader r1, boolean r2, gg.g r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private DexKitBridge(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            r0.getClass()
            long r0 = access$nativeInitDexKit(r3)
            r2.token = r0
            return
    }

    public /* synthetic */ DexKitBridge(java.lang.String r1, gg.g r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private DexKitBridge(byte[][] r3) {
            r2 = this;
            r2.<init>()
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            r0.getClass()
            long r0 = access$nativeInitDexKitByBytesArray(r3)
            r2.token = r0
            return
    }

    public /* synthetic */ DexKitBridge(byte[][] r1, gg.g r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static final /* synthetic */ long access$getSafeToken(org.luckypray.dexkit.DexKitBridge r2) {
            long r0 = r2.getSafeToken()
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeBatchFindClassUsingStrings(long r0, byte[] r2) {
            byte[] r0 = nativeBatchFindClassUsingStrings(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeBatchFindMethodUsingStrings(long r0, byte[] r2) {
            byte[] r0 = nativeBatchFindMethodUsingStrings(r0, r2)
            return r0
    }

    public static final /* synthetic */ void access$nativeExportDexFile(long r0, java.lang.String r2) {
            nativeExportDexFile(r0, r2)
            return
    }

    public static final /* synthetic */ byte[] access$nativeFieldGetMethods(long r0, long r2) {
            byte[] r0 = nativeFieldGetMethods(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeFieldPutMethods(long r0, long r2) {
            byte[] r0 = nativeFieldPutMethods(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeFindClass(long r0, byte[] r2) {
            byte[] r0 = nativeFindClass(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeFindField(long r0, byte[] r2) {
            byte[] r0 = nativeFindField(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeFindMethod(long r0, byte[] r2) {
            byte[] r0 = nativeFindMethod(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetCallMethods(long r0, long r2) {
            byte[] r0 = nativeGetCallMethods(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetClassAnnotations(long r0, long r2) {
            byte[] r0 = nativeGetClassAnnotations(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetClassByIds(long r0, long[] r2) {
            byte[] r0 = nativeGetClassByIds(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetClassData(long r0, java.lang.String r2) {
            byte[] r0 = nativeGetClassData(r0, r2)
            return r0
    }

    public static final /* synthetic */ int access$nativeGetDexNum(long r0) {
            int r0 = nativeGetDexNum(r0)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetFieldAnnotations(long r0, long r2) {
            byte[] r0 = nativeGetFieldAnnotations(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetFieldByIds(long r0, long[] r2) {
            byte[] r0 = nativeGetFieldByIds(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetFieldData(long r0, java.lang.String r2) {
            byte[] r0 = nativeGetFieldData(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetInvokeMethods(long r0, long r2) {
            byte[] r0 = nativeGetInvokeMethods(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetMethodAnnotations(long r0, long r2) {
            byte[] r0 = nativeGetMethodAnnotations(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetMethodByIds(long r0, long[] r2) {
            byte[] r0 = nativeGetMethodByIds(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetMethodData(long r0, java.lang.String r2) {
            byte[] r0 = nativeGetMethodData(r0, r2)
            return r0
    }

    public static final /* synthetic */ int[] access$nativeGetMethodOpCodes(long r0, long r2) {
            int[] r0 = nativeGetMethodOpCodes(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetMethodUsingFields(long r0, long r2) {
            byte[] r0 = nativeGetMethodUsingFields(r0, r2)
            return r0
    }

    public static final /* synthetic */ java.lang.String[] access$nativeGetMethodUsingStrings(long r0, long r2) {
            java.lang.String[] r0 = nativeGetMethodUsingStrings(r0, r2)
            return r0
    }

    public static final /* synthetic */ byte[] access$nativeGetParameterAnnotations(long r0, long r2) {
            byte[] r0 = nativeGetParameterAnnotations(r0, r2)
            return r0
    }

    public static final /* synthetic */ java.lang.String[] access$nativeGetParameterNames(long r0, long r2) {
            java.lang.String[] r0 = nativeGetParameterNames(r0, r2)
            return r0
    }

    public static final /* synthetic */ long access$nativeInitDexKit(java.lang.String r2) {
            long r0 = nativeInitDexKit(r2)
            return r0
    }

    public static final /* synthetic */ long access$nativeInitDexKitByBytesArray(byte[][] r2) {
            long r0 = nativeInitDexKitByBytesArray(r2)
            return r0
    }

    public static final /* synthetic */ long access$nativeInitDexKitByClassLoader(java.lang.ClassLoader r0, boolean r1) {
            long r0 = nativeInitDexKitByClassLoader(r0, r1)
            return r0
    }

    public static final /* synthetic */ void access$nativeInitFullCache(long r0) {
            nativeInitFullCache(r0)
            return
    }

    public static final /* synthetic */ void access$nativeRelease(long r0) {
            nativeRelease(r0)
            return
    }

    public static final /* synthetic */ void access$nativeSetThreadNum(long r0, int r2) {
            nativeSetThreadNum(r0, r2)
            return
    }

    private final java.util.Map<java.lang.String, hh.j> batchFindClassUsingStrings(fg.l r2) {
            r1 = this;
            r2.getClass()
            ch.a r0 = new ch.a
            r0.<init>()
            r2.invoke(r0)
            java.util.Map r2 = r1.batchFindClassUsingStrings(r0)
            return r2
    }

    private final java.util.Map<java.lang.String, hh.j> batchFindClassUsingStrings$dexkit_android_release(g6.b r18) {
            r17 = this;
            r18.getClass()
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r17)
            byte[] r3 = r18.l()
            r0.getClass()
            byte[] r0 = access$nativeBatchFindClassUsingStrings(r1, r3)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.getClass()
            g6.a.a()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r1 = j8.b.d(r0, r1)
            int r2 = r0.position()
            int r2 = r2 + r1
            int r1 = r0.getInt(r2)
            int r1 = r2 - r1
            short r3 = r0.getShort(r1)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r6 = 4
            if (r6 >= r3) goto L42
            int r7 = r1 + 4
            short r7 = r0.getShort(r7)
            goto L43
        L42:
            r7 = 0
        L43:
            if (r7 == 0) goto L50
            int r7 = r7 + r2
            int r8 = r0.getInt(r7)
            int r8 = r8 + r7
            int r7 = r0.getInt(r8)
            goto L51
        L50:
            r7 = 0
        L51:
            r8 = 0
        L52:
            if (r8 >= r7) goto Lee
            jh.a r9 = new jh.a
            r9.<init>()
            if (r6 >= r3) goto L62
            int r10 = r1 + 4
            short r10 = r0.getShort(r10)
            goto L63
        L62:
            r10 = 0
        L63:
            if (r10 == 0) goto L78
            int r10 = r10 + r2
            int r12 = r0.getInt(r10)
            int r12 = r12 + r10
            int r12 = r12 + r6
            int r10 = r8 * 4
            int r10 = r10 + r12
            int r12 = r0.getInt(r10)
            int r12 = r12 + r10
            r9.c(r12, r0)
            goto L79
        L78:
            r9 = 0
        L79:
            r9.getClass()
            int r10 = r9.b(r6)
            if (r10 == 0) goto L8a
            int r12 = r9.f4331a
            int r10 = r10 + r12
            java.lang.String r10 = r9.d(r10)
            goto L8b
        L8a:
            r10 = 0
        L8b:
            r10.getClass()
            hh.j r12 = new hh.j
            r12.<init>()
            r13 = 6
            int r14 = r9.b(r13)
            if (r14 == 0) goto L9f
            int r14 = r9.f(r14)
            goto La0
        L9f:
            r14 = 0
        La0:
            r15 = 0
        La1:
            if (r15 >= r14) goto Ld4
            jh.d r5 = new jh.d
            r5.<init>()
            int r6 = r9.b(r13)
            if (r6 == 0) goto Lc3
            int r6 = r9.e(r6)
            int r16 = r15 * 4
            int r6 = r16 + r6
            int r6 = r9.a(r6)
            java.nio.ByteBuffer r11 = r9.f4332b
            r11.getClass()
            r5.c(r6, r11)
            goto Lc4
        Lc3:
            r5 = 0
        Lc4:
            r5.getClass()
            r6 = r17
            hh.i r5 = f8.i.v(r6, r5)
            r12.add(r5)
            int r15 = r15 + 1
            r6 = 4
            goto La1
        Ld4:
            r6 = r17
            int r5 = r12.size()
            r9 = 1
            if (r5 <= r9) goto Le6
            a9.h r5 = new a9.h
            r9 = 1
            r5.<init>(r9)
            tf.q.g1(r12, r5)
        Le6:
            r4.put(r10, r12)
            int r8 = r8 + 1
            r6 = 4
            goto L52
        Lee:
            r6 = r17
            return r4
    }

    private final java.util.Map<java.lang.String, hh.p> batchFindMethodUsingStrings(fg.l r2) {
            r1 = this;
            r2.getClass()
            ch.b r0 = new ch.b
            r0.<init>()
            r2.invoke(r0)
            java.util.Map r2 = r1.batchFindMethodUsingStrings(r0)
            return r2
    }

    private final java.util.Map<java.lang.String, hh.p> batchFindMethodUsingStrings$dexkit_android_release(g6.b r18) {
            r17 = this;
            r18.getClass()
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r17)
            byte[] r3 = r18.l()
            r0.getClass()
            byte[] r0 = access$nativeBatchFindMethodUsingStrings(r1, r3)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.getClass()
            g6.a.a()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r1 = j8.b.d(r0, r1)
            int r2 = r0.position()
            int r2 = r2 + r1
            int r1 = r0.getInt(r2)
            int r1 = r2 - r1
            short r3 = r0.getShort(r1)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r6 = 4
            if (r6 >= r3) goto L42
            int r7 = r1 + 4
            short r7 = r0.getShort(r7)
            goto L43
        L42:
            r7 = 0
        L43:
            if (r7 == 0) goto L50
            int r7 = r7 + r2
            int r8 = r0.getInt(r7)
            int r8 = r8 + r7
            int r7 = r0.getInt(r8)
            goto L51
        L50:
            r7 = 0
        L51:
            r8 = 0
        L52:
            if (r8 >= r7) goto Lee
            jh.a r9 = new jh.a
            r9.<init>()
            if (r6 >= r3) goto L62
            int r10 = r1 + 4
            short r10 = r0.getShort(r10)
            goto L63
        L62:
            r10 = 0
        L63:
            if (r10 == 0) goto L78
            int r10 = r10 + r2
            int r12 = r0.getInt(r10)
            int r12 = r12 + r10
            int r12 = r12 + r6
            int r10 = r8 * 4
            int r10 = r10 + r12
            int r12 = r0.getInt(r10)
            int r12 = r12 + r10
            r9.c(r12, r0)
            goto L79
        L78:
            r9 = 0
        L79:
            r9.getClass()
            int r10 = r9.b(r6)
            if (r10 == 0) goto L8a
            int r12 = r9.f4331a
            int r10 = r10 + r12
            java.lang.String r10 = r9.d(r10)
            goto L8b
        L8a:
            r10 = 0
        L8b:
            r10.getClass()
            hh.p r12 = new hh.p
            r12.<init>()
            r13 = 6
            int r14 = r9.b(r13)
            if (r14 == 0) goto L9f
            int r14 = r9.f(r14)
            goto La0
        L9f:
            r14 = 0
        La0:
            r15 = 0
        La1:
            if (r15 >= r14) goto Ld4
            jh.p r5 = new jh.p
            r5.<init>()
            int r6 = r9.b(r13)
            if (r6 == 0) goto Lc3
            int r6 = r9.e(r6)
            int r16 = r15 * 4
            int r6 = r16 + r6
            int r6 = r9.a(r6)
            java.nio.ByteBuffer r11 = r9.f4332b
            r11.getClass()
            r5.c(r6, r11)
            goto Lc4
        Lc3:
            r5 = 0
        Lc4:
            r5.getClass()
            r6 = r17
            hh.o r5 = g4.a.p(r6, r5)
            r12.add(r5)
            int r15 = r15 + 1
            r6 = 4
            goto La1
        Ld4:
            r6 = r17
            int r5 = r12.size()
            r9 = 1
            if (r5 <= r9) goto Le6
            a9.h r5 = new a9.h
            r9 = 2
            r5.<init>(r9)
            tf.q.g1(r12, r5)
        Le6:
            r4.put(r10, r12)
            int r8 = r8 + 1
            r6 = 4
            goto L52
        Lee:
            r6 = r17
            return r4
    }

    public static final org.luckypray.dexkit.DexKitBridge create(java.lang.ClassLoader r2, boolean r3) {
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            r0.getClass()
            r2.getClass()
            org.luckypray.dexkit.DexKitBridge r0 = new org.luckypray.dexkit.DexKitBridge
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static final org.luckypray.dexkit.DexKitBridge create(java.lang.String r2) {
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            r0.getClass()
            r2.getClass()
            org.luckypray.dexkit.DexKitBridge r0 = new org.luckypray.dexkit.DexKitBridge
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static final org.luckypray.dexkit.DexKitBridge create(byte[][] r2) {
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            r0.getClass()
            r2.getClass()
            org.luckypray.dexkit.DexKitBridge r0 = new org.luckypray.dexkit.DexKitBridge
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    private final hh.j findClass(fg.l r2) {
            r1 = this;
            r2.getClass()
            ch.c r0 = new ch.c
            r0.<init>()
            r2.invoke(r0)
            hh.j r2 = r1.findClass(r0)
            return r2
    }

    private final hh.j findClass$dexkit_android_release(g6.b r5) {
            r4 = this;
            r5.getClass()
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r4)
            byte[] r5 = r5.l()
            r0.getClass()
            byte[] r5 = access$nativeFindClass(r1, r5)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r5.getClass()
            jh.a r0 = new jh.a
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r1 = j8.b.d(r5, r1)
            int r2 = r5.position()
            int r2 = r2 + r1
            r0.c(r2, r5)
            hh.j r5 = new hh.j
            r5.<init>()
            int r1 = r0.l()
            r2 = 0
        L38:
            if (r2 >= r1) goto L4b
            jh.d r3 = r0.i(r2)
            r3.getClass()
            hh.i r3 = f8.i.v(r4, r3)
            r5.add(r3)
            int r2 = r2 + 1
            goto L38
        L4b:
            int r0 = r5.size()
            r1 = 1
            if (r0 <= r1) goto L5b
            a9.h r0 = new a9.h
            r1 = 3
            r0.<init>(r1)
            tf.q.g1(r5, r0)
        L5b:
            return r5
    }

    private final hh.m findField(fg.l r2) {
            r1 = this;
            r2.getClass()
            ch.d r0 = new ch.d
            r0.<init>()
            r2.invoke(r0)
            hh.m r2 = r1.findField(r0)
            return r2
    }

    private final hh.m findField$dexkit_android_release(g6.b r5) {
            r4 = this;
            r5.getClass()
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r4)
            byte[] r5 = r5.l()
            r0.getClass()
            byte[] r5 = access$nativeFindField(r1, r5)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r5.getClass()
            jh.a r0 = new jh.a
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r1 = j8.b.d(r5, r1)
            int r2 = r5.position()
            int r2 = r2 + r1
            r0.c(r2, r5)
            hh.m r5 = new hh.m
            r5.<init>()
            r1 = 4
            int r1 = r0.b(r1)
            r2 = 0
            if (r1 == 0) goto L40
            int r1 = r0.f(r1)
            goto L41
        L40:
            r1 = r2
        L41:
            if (r2 >= r1) goto L54
            jh.o r3 = r0.j(r2)
            r3.getClass()
            hh.l r3 = fb.v0.r(r4, r3)
            r5.add(r3)
            int r2 = r2 + 1
            goto L41
        L54:
            int r0 = r5.size()
            r1 = 1
            if (r0 <= r1) goto L64
            a9.h r0 = new a9.h
            r1 = 4
            r0.<init>(r1)
            tf.q.g1(r5, r0)
        L64:
            return r5
    }

    private final hh.p findMethod(fg.l r2) {
            r1 = this;
            r2.getClass()
            ch.e r0 = new ch.e
            r0.<init>()
            r2.invoke(r0)
            hh.p r2 = r1.findMethod(r0)
            return r2
    }

    private final hh.p findMethod$dexkit_android_release(g6.b r5) {
            r4 = this;
            r5.getClass()
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r4)
            byte[] r5 = r5.l()
            r0.getClass()
            byte[] r5 = access$nativeFindMethod(r1, r5)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r5.getClass()
            jh.a r0 = new jh.a
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r1 = j8.b.d(r5, r1)
            int r2 = r5.position()
            int r2 = r2 + r1
            r0.c(r2, r5)
            hh.p r5 = new hh.p
            r5.<init>()
            int r1 = r0.m()
            r2 = 0
        L38:
            if (r2 >= r1) goto L4b
            jh.p r3 = r0.o(r2)
            r3.getClass()
            hh.o r3 = g4.a.p(r4, r3)
            r5.add(r3)
            int r2 = r2 + 1
            goto L38
        L4b:
            int r0 = r5.size()
            r1 = 1
            if (r0 <= r1) goto L5b
            a9.h r0 = new a9.h
            r1 = 5
            r0.<init>(r1)
            tf.q.g1(r5, r0)
        L5b:
            return r5
    }

    private final hh.p getCallMethods$dexkit_android_release(long r4) {
            r3 = this;
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r3)
            r0.getClass()
            byte[] r4 = access$nativeGetCallMethods(r1, r4)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            r4.getClass()
            jh.a r5 = new jh.a
            r5.<init>()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r0 = j8.b.d(r4, r0)
            int r1 = r4.position()
            int r1 = r1 + r0
            r5.c(r1, r4)
            hh.p r4 = new hh.p
            r4.<init>()
            int r0 = r5.m()
            r1 = 0
        L31:
            if (r1 >= r0) goto L44
            jh.p r2 = r5.o(r1)
            r2.getClass()
            hh.o r2 = g4.a.p(r3, r2)
            r4.add(r2)
            int r1 = r1 + 1
            goto L31
        L44:
            return r4
    }

    private final java.util.List<hh.a> getClassAnnotations$dexkit_android_release(long r4) {
            r3 = this;
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r3)
            r0.getClass()
            byte[] r4 = access$nativeGetClassAnnotations(r1, r4)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            r4.getClass()
            jh.a r5 = new jh.a
            r5.<init>()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r0 = j8.b.d(r4, r0)
            int r1 = r4.position()
            int r1 = r1 + r0
            r5.c(r1, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r0 = r5.k()
            r1 = 0
        L31:
            if (r1 >= r0) goto L44
            jh.c r2 = r5.g(r1)
            r2.getClass()
            hh.a r2 = ac.p.s(r3, r2)
            r4.add(r2)
            int r1 = r1 + 1
            goto L31
        L44:
            return r4
    }

    private final java.util.List<hh.a> getFieldAnnotations$dexkit_android_release(long r4) {
            r3 = this;
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r3)
            r0.getClass()
            byte[] r4 = access$nativeGetFieldAnnotations(r1, r4)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            r4.getClass()
            jh.a r5 = new jh.a
            r5.<init>()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r0 = j8.b.d(r4, r0)
            int r1 = r4.position()
            int r1 = r1 + r0
            r5.c(r1, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r0 = r5.k()
            r1 = 0
        L31:
            if (r1 >= r0) goto L44
            jh.c r2 = r5.g(r1)
            r2.getClass()
            hh.a r2 = ac.p.s(r3, r2)
            r4.add(r2)
            int r1 = r1 + 1
            goto L31
        L44:
            return r4
    }

    private final hh.m getFieldByIds$dexkit_android_release(long[] r5) {
            r4 = this;
            r5.getClass()
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r4)
            r0.getClass()
            byte[] r5 = access$nativeGetFieldByIds(r1, r5)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r5.getClass()
            jh.a r0 = new jh.a
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r1 = j8.b.d(r5, r1)
            int r2 = r5.position()
            int r2 = r2 + r1
            r0.c(r2, r5)
            hh.m r5 = new hh.m
            r5.<init>()
            r1 = 4
            int r1 = r0.b(r1)
            r2 = 0
            if (r1 == 0) goto L3c
            int r1 = r0.f(r1)
            goto L3d
        L3c:
            r1 = r2
        L3d:
            if (r2 >= r1) goto L50
            jh.o r3 = r0.j(r2)
            r3.getClass()
            hh.l r3 = fb.v0.r(r4, r3)
            r5.add(r3)
            int r2 = r2 + 1
            goto L3d
        L50:
            return r5
    }

    private final hh.p getInvokeMethods$dexkit_android_release(long r4) {
            r3 = this;
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r3)
            r0.getClass()
            byte[] r4 = access$nativeGetInvokeMethods(r1, r4)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            r4.getClass()
            jh.a r5 = new jh.a
            r5.<init>()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r0 = j8.b.d(r4, r0)
            int r1 = r4.position()
            int r1 = r1 + r0
            r5.c(r1, r4)
            hh.p r4 = new hh.p
            r4.<init>()
            int r0 = r5.m()
            r1 = 0
        L31:
            if (r1 >= r0) goto L44
            jh.p r2 = r5.o(r1)
            r2.getClass()
            hh.o r2 = g4.a.p(r3, r2)
            r4.add(r2)
            int r1 = r1 + 1
            goto L31
        L44:
            return r4
    }

    private final java.util.List<hh.a> getMethodAnnotations$dexkit_android_release(long r4) {
            r3 = this;
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r3)
            r0.getClass()
            byte[] r4 = access$nativeGetMethodAnnotations(r1, r4)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            r4.getClass()
            jh.a r5 = new jh.a
            r5.<init>()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r0 = j8.b.d(r4, r0)
            int r1 = r4.position()
            int r1 = r1 + r0
            r5.c(r1, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r0 = r5.k()
            r1 = 0
        L31:
            if (r1 >= r0) goto L44
            jh.c r2 = r5.g(r1)
            r2.getClass()
            hh.a r2 = ac.p.s(r3, r2)
            r4.add(r2)
            int r1 = r1 + 1
            goto L31
        L44:
            return r4
    }

    private final hh.p getMethodByIds$dexkit_android_release(long[] r5) {
            r4 = this;
            r5.getClass()
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r4)
            r0.getClass()
            byte[] r5 = access$nativeGetMethodByIds(r1, r5)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r5.getClass()
            jh.a r0 = new jh.a
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r1 = j8.b.d(r5, r1)
            int r2 = r5.position()
            int r2 = r2 + r1
            r0.c(r2, r5)
            hh.p r5 = new hh.p
            r5.<init>()
            int r1 = r0.m()
            r2 = 0
        L34:
            if (r2 >= r1) goto L47
            jh.p r3 = r0.o(r2)
            r3.getClass()
            hh.o r3 = g4.a.p(r4, r3)
            r5.add(r3)
            int r2 = r2 + 1
            goto L34
        L47:
            return r5
    }

    private final java.util.List<java.lang.Integer> getMethodOpCodes$dexkit_android_release(long r4) {
            r3 = this;
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r3)
            r0.getClass()
            int[] r4 = access$nativeGetMethodOpCodes(r1, r4)
            java.util.List r4 = tf.l.K0(r4)
            return r4
    }

    private final java.util.List<hh.q> getMethodUsingFields$dexkit_android_release(long r4) {
            r3 = this;
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r3)
            r0.getClass()
            byte[] r4 = access$nativeGetMethodUsingFields(r1, r4)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            r4.getClass()
            jh.a r5 = new jh.a
            r5.<init>()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r0 = j8.b.d(r4, r0)
            int r1 = r4.position()
            int r1 = r1 + r0
            r5.c(r1, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0 = 4
            int r0 = r5.b(r0)
            r1 = 0
            if (r0 == 0) goto L39
            int r0 = r5.f(r0)
            goto L3a
        L39:
            r0 = r1
        L3a:
            if (r1 >= r0) goto L4d
            jh.a r2 = r5.n(r1)
            r2.getClass()
            hh.q r2 = ig.a.p(r3, r2)
            r4.add(r2)
            int r1 = r1 + 1
            goto L3a
        L4d:
            return r4
    }

    private final java.util.List<java.lang.String> getMethodUsingStrings$dexkit_android_release(long r4) {
            r3 = this;
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r3)
            r0.getClass()
            java.lang.String[] r4 = access$nativeGetMethodUsingStrings(r1, r4)
            java.util.List r4 = tf.l.L0(r4)
            return r4
    }

    private final java.util.List<java.util.List<hh.a>> getParameterAnnotations$dexkit_android_release(long r9) {
            r8 = this;
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r8)
            r0.getClass()
            byte[] r9 = access$nativeGetParameterAnnotations(r1, r9)
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r9)
            r9.getClass()
            jh.a r10 = new jh.a
            r10.<init>()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r0 = j8.b.d(r9, r0)
            int r1 = r9.position()
            int r1 = r1 + r0
            r10.c(r1, r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r0 = 4
            int r0 = r10.b(r0)
            r1 = 0
            if (r0 == 0) goto L39
            int r0 = r10.f(r0)
            goto L3a
        L39:
            r0 = r1
        L3a:
            r2 = r1
        L3b:
            if (r2 >= r0) goto L67
            jh.a r3 = r10.h(r2)
            r3.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r3.k()
            r6 = r1
        L4e:
            if (r6 >= r5) goto L61
            jh.c r7 = r3.g(r6)
            r7.getClass()
            hh.a r7 = ac.p.s(r8, r7)
            r4.add(r7)
            int r6 = r6 + 1
            goto L4e
        L61:
            r9.add(r4)
            int r2 = r2 + 1
            goto L3b
        L67:
            return r9
    }

    private final java.util.List<java.lang.String> getParameterNames$dexkit_android_release(long r4) {
            r3 = this;
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r3)
            r0.getClass()
            java.lang.String[] r4 = access$nativeGetParameterNames(r1, r4)
            if (r4 == 0) goto L22
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = r4.length
            r5.<init>(r0)
            int r0 = r4.length
            r1 = 0
        L17:
            if (r1 >= r0) goto L21
            r2 = r4[r1]
            r5.add(r2)
            int r1 = r1 + 1
            goto L17
        L21:
            return r5
        L22:
            r4 = 0
            return r4
    }

    private final long getSafeToken() {
            r4 = this;
            long r0 = r4.token
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L9
            return r0
        L9:
            java.lang.String r0 = "DexKitBridge is not valid"
            j8.o.A(r0)
            r0 = 0
            return r0
    }

    private final hh.j getTypeByIds$dexkit_android_release(long[] r5) {
            r4 = this;
            r5.getClass()
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r4)
            byte[] r5 = bh.a.a(r0, r1, r5)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r5.getClass()
            jh.a r0 = new jh.a
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r1 = j8.b.d(r5, r1)
            int r2 = r5.position()
            int r2 = r2 + r1
            r0.c(r2, r5)
            hh.j r5 = new hh.j
            r5.<init>()
            int r1 = r0.l()
            r2 = 0
        L31:
            if (r2 >= r1) goto L44
            jh.d r3 = r0.i(r2)
            r3.getClass()
            hh.i r3 = f8.i.v(r4, r3)
            r5.add(r3)
            int r2 = r2 + 1
            goto L31
        L44:
            return r5
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

    private static final native void nativeSetThreadNum(long r0, int r2);

    private final hh.p readFieldMethods$dexkit_android_release(long r4) {
            r3 = this;
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r3)
            r0.getClass()
            byte[] r4 = access$nativeFieldGetMethods(r1, r4)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            r4.getClass()
            jh.a r5 = new jh.a
            r5.<init>()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r0 = j8.b.d(r4, r0)
            int r1 = r4.position()
            int r1 = r1 + r0
            r5.c(r1, r4)
            hh.p r4 = new hh.p
            r4.<init>()
            int r0 = r5.m()
            r1 = 0
        L31:
            if (r1 >= r0) goto L44
            jh.p r2 = r5.o(r1)
            r2.getClass()
            hh.o r2 = g4.a.p(r3, r2)
            r4.add(r2)
            int r1 = r1 + 1
            goto L31
        L44:
            return r4
    }

    private final hh.p writeFieldMethods$dexkit_android_release(long r4) {
            r3 = this;
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r3)
            r0.getClass()
            byte[] r4 = access$nativeFieldPutMethods(r1, r4)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            r4.getClass()
            jh.a r5 = new jh.a
            r5.<init>()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r0 = j8.b.d(r4, r0)
            int r1 = r4.position()
            int r1 = r1 + r0
            r5.c(r1, r4)
            hh.p r4 = new hh.p
            r4.<init>()
            int r0 = r5.m()
            r1 = 0
        L31:
            if (r1 >= r0) goto L44
            jh.p r2 = r5.o(r1)
            r2.getClass()
            hh.o r2 = g4.a.p(r3, r2)
            r4.add(r2)
            int r1 = r1 + 1
            goto L31
        L44:
            return r4
    }

    public final java.util.Map<java.lang.String, hh.j> batchFindClassUsingStrings(ch.a r2) {
            r1 = this;
            r2.getClass()
            g6.a.a()
            r2 = 1024(0x400, float:1.435E-42)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r0)
            r2.capacity()
            java.lang.IllegalAccessException r2 = new java.lang.IllegalAccessException
            java.lang.String r0 = "searchGroups not be empty"
            r2.<init>(r0)
            throw r2
    }

    public final java.util.Map<java.lang.String, hh.p> batchFindMethodUsingStrings(ch.b r2) {
            r1 = this;
            r2.getClass()
            g6.a.a()
            r2 = 1024(0x400, float:1.435E-42)
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r2 = r2.order(r0)
            r2.capacity()
            java.lang.IllegalAccessException r2 = new java.lang.IllegalAccessException
            java.lang.String r0 = "searchGroups not be empty"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.isValid()     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L18
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion     // Catch: java.lang.Throwable -> L16
            long r1 = r3.token     // Catch: java.lang.Throwable -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L16
            access$nativeRelease(r1)     // Catch: java.lang.Throwable -> L16
            r0 = 0
            r3.token = r0     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r0 = move-exception
            goto L1a
        L18:
            monitor-exit(r3)
            return
        L1a:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L16
            throw r0
    }

    public final void exportDexFile(java.lang.String r4) {
            r3 = this;
            r4.getClass()
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = r3.getSafeToken()
            r0.getClass()
            access$nativeExportDexFile(r1, r4)
            return
    }

    public final void finalize() {
            r0 = this;
            r0.close()
            return
    }

    public final hh.j findClass(ch.c r5) {
            r4 = this;
            r5.getClass()
            g6.b r0 = new g6.b
            r0.<init>()
            r5.G(r0)
            bh.a r5 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r4)
            byte[] r0 = r0.l()
            r5.getClass()
            byte[] r5 = access$nativeFindClass(r1, r0)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r5.getClass()
            jh.a r0 = new jh.a
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r1 = j8.b.d(r5, r1)
            int r2 = r5.position()
            int r2 = r2 + r1
            r0.c(r2, r5)
            hh.j r5 = new hh.j
            r5.<init>()
            int r1 = r0.l()
            r2 = 0
        L40:
            if (r2 >= r1) goto L53
            jh.d r3 = r0.i(r2)
            r3.getClass()
            hh.i r3 = f8.i.v(r4, r3)
            r5.add(r3)
            int r2 = r2 + 1
            goto L40
        L53:
            int r0 = r5.size()
            r1 = 1
            if (r0 <= r1) goto L63
            a9.h r0 = new a9.h
            r1 = 3
            r0.<init>(r1)
            tf.q.g1(r5, r0)
        L63:
            return r5
    }

    public final hh.m findField(ch.d r5) {
            r4 = this;
            r5.getClass()
            g6.b r0 = new g6.b
            r0.<init>()
            r5.G(r0)
            bh.a r5 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r4)
            byte[] r0 = r0.l()
            r5.getClass()
            byte[] r5 = access$nativeFindField(r1, r0)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r5.getClass()
            jh.a r0 = new jh.a
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r1 = j8.b.d(r5, r1)
            int r2 = r5.position()
            int r2 = r2 + r1
            r0.c(r2, r5)
            hh.m r5 = new hh.m
            r5.<init>()
            r1 = 4
            int r1 = r0.b(r1)
            r2 = 0
            if (r1 == 0) goto L48
            int r1 = r0.f(r1)
            goto L49
        L48:
            r1 = r2
        L49:
            if (r2 >= r1) goto L5c
            jh.o r3 = r0.j(r2)
            r3.getClass()
            hh.l r3 = fb.v0.r(r4, r3)
            r5.add(r3)
            int r2 = r2 + 1
            goto L49
        L5c:
            int r0 = r5.size()
            r1 = 1
            if (r0 <= r1) goto L6c
            a9.h r0 = new a9.h
            r1 = 4
            r0.<init>(r1)
            tf.q.g1(r5, r0)
        L6c:
            return r5
    }

    public final hh.p findMethod(ch.e r5) {
            r4 = this;
            r5.getClass()
            g6.b r0 = new g6.b
            r0.<init>()
            r5.G(r0)
            bh.a r5 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = access$getSafeToken(r4)
            byte[] r0 = r0.l()
            r5.getClass()
            byte[] r5 = access$nativeFindMethod(r1, r0)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r5.getClass()
            jh.a r0 = new jh.a
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r1 = j8.b.d(r5, r1)
            int r2 = r5.position()
            int r2 = r2 + r1
            r0.c(r2, r5)
            hh.p r5 = new hh.p
            r5.<init>()
            int r1 = r0.m()
            r2 = 0
        L40:
            if (r2 >= r1) goto L53
            jh.p r3 = r0.o(r2)
            r3.getClass()
            hh.o r3 = g4.a.p(r4, r3)
            r5.add(r3)
            int r2 = r2 + 1
            goto L40
        L53:
            int r0 = r5.size()
            r1 = 1
            if (r0 <= r1) goto L63
            a9.h r0 = new a9.h
            r1 = 5
            r0.<init>(r1)
            tf.q.g1(r5, r0)
        L63:
            return r5
    }

    public final hh.i getClassData(java.lang.Class<?> r1) {
            r0 = this;
            r1.getClass()
            java.lang.String r1 = kh.b.f(r1)
            hh.i r1 = r0.getClassData(r1)
            return r1
    }

    public final hh.i getClassData(java.lang.String r4) {
            r3 = this;
            r4.getClass()
            int r0 = r4.length()
            if (r0 == 0) goto L6c
            r0 = 0
            char r0 = r4.charAt(r0)
            r1 = 76
            if (r0 != r1) goto L1b
            char r0 = og.m.u0(r4)
            r1 = 59
            if (r0 != r1) goto L1b
            goto L39
        L1b:
            r0 = 46
            r1 = 47
            java.lang.String r4 = r4.replace(r0, r1)
            r4.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "L"
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = ";"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L39:
            kh.b.e(r4)
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = r3.getSafeToken()
            r0.getClass()
            byte[] r4 = access$nativeGetClassData(r1, r4)
            if (r4 == 0) goto L6a
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            r4.getClass()
            jh.d r0 = new jh.d
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r1 = j8.b.d(r4, r1)
            int r2 = r4.position()
            int r2 = r2 + r1
            r0.c(r2, r4)
            hh.i r4 = f8.i.v(r3, r0)
            return r4
        L6a:
            r4 = 0
            return r4
        L6c:
            java.lang.String r4 = "Char sequence is empty."
            j8.o.l(r4)
            r4 = 0
            return r4
    }

    public final int getDexNum() {
            r3 = this;
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = r3.getSafeToken()
            r0.getClass()
            int r0 = access$nativeGetDexNum(r1)
            return r0
    }

    public final hh.l getFieldData(java.lang.String r4) {
            r3 = this;
            r4.getClass()
            lh.b r0 = new lh.b
            r0.<init>(r4)
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = r3.getSafeToken()
            r0.getClass()
            byte[] r4 = access$nativeGetFieldData(r1, r4)
            if (r4 == 0) goto L36
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            r4.getClass()
            jh.o r0 = new jh.o
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r1 = j8.b.d(r4, r1)
            int r2 = r4.position()
            int r2 = r2 + r1
            r0.c(r2, r4)
            hh.l r4 = fb.v0.r(r3, r0)
            return r4
        L36:
            r4 = 0
            return r4
    }

    public final hh.l getFieldData(java.lang.reflect.Field r3) {
            r2 = this;
            r3.getClass()
            java.util.LinkedHashMap r0 = kh.b.f7612a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r3.getDeclaringClass()
            r1.getClass()
            java.lang.String r1 = kh.b.f(r1)
            r0.append(r1)
            java.lang.String r1 = "->"
            r0.append(r1)
            java.lang.String r1 = r3.getName()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.Class r3 = r3.getType()
            r3.getClass()
            java.lang.String r3 = kh.b.f(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            hh.l r3 = r2.getFieldData(r3)
            return r3
    }

    public final hh.o getMethodData(java.lang.String r4) {
            r3 = this;
            r4.getClass()
            lh.d r0 = new lh.d
            r0.<init>(r4)
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = r3.getSafeToken()
            r0.getClass()
            byte[] r4 = access$nativeGetMethodData(r1, r4)
            if (r4 == 0) goto L36
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            r4.getClass()
            jh.p r0 = new jh.p
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            int r1 = j8.b.d(r4, r1)
            int r2 = r4.position()
            int r2 = r2 + r1
            r0.c(r2, r4)
            hh.o r4 = g4.a.p(r3, r0)
            return r4
        L36:
            r4 = 0
            return r4
    }

    public final hh.o getMethodData(java.lang.reflect.Constructor<?> r3) {
            r2 = this;
            r3.getClass()
            java.util.LinkedHashMap r0 = kh.b.f7612a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r3.getDeclaringClass()
            r1.getClass()
            java.lang.String r1 = kh.b.f(r1)
            r0.append(r1)
            java.lang.String r1 = "-><init>"
            r0.append(r1)
            java.lang.String r3 = kh.b.a(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            hh.o r3 = r2.getMethodData(r3)
            return r3
    }

    public final hh.o getMethodData(java.lang.reflect.Method r1) {
            r0 = this;
            r1.getClass()
            java.lang.String r1 = kh.b.b(r1)
            hh.o r1 = r0.getMethodData(r1)
            return r1
    }

    public final void initFullCache() {
            r3 = this;
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = r3.getSafeToken()
            r0.getClass()
            access$nativeInitFullCache(r1)
            return
    }

    public final boolean isValid() {
            r4 = this;
            long r0 = r4.token
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final void setThreadNum(int r4) {
            r3 = this;
            bh.a r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r1 = r3.getSafeToken()
            r0.getClass()
            access$nativeSetThreadNum(r1, r4)
            return
    }
}
