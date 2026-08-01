package org.luckypray.dexkit;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class DexKitBridge implements java.io.Closeable {
    public static final org.luckypray.dexkit.DexKitBridge.Companion Companion = null;
    private final java.util.concurrent.locks.ReentrantReadWriteLock lifecycleLock;
    private volatile long token;

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(p000.AbstractC1067zq r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ byte[] access$nativeBatchFindClassUsingStrings(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, byte[] r3) {
                byte[] r0 = r0.nativeBatchFindClassUsingStrings(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeBatchFindMethodUsingStrings(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, byte[] r3) {
                byte[] r0 = r0.nativeBatchFindMethodUsingStrings(r1, r3)
                return r0
        }

        public static final /* synthetic */ void access$nativeExportDexFile(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, java.lang.String r3) {
                r0.nativeExportDexFile(r1, r3)
                return
        }

        public static final /* synthetic */ byte[] access$nativeFieldGetMethods(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                byte[] r0 = r0.nativeFieldGetMethods(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeFieldPutMethods(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                byte[] r0 = r0.nativeFieldPutMethods(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeFindClass(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, byte[] r3) {
                byte[] r0 = r0.nativeFindClass(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeFindField(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, byte[] r3) {
                byte[] r0 = r0.nativeFindField(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeFindMethod(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, byte[] r3) {
                byte[] r0 = r0.nativeFindMethod(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetCallMethods(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                byte[] r0 = r0.nativeGetCallMethods(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetClassAnnotations(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                byte[] r0 = r0.nativeGetClassAnnotations(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetClassByIds(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long[] r3) {
                byte[] r0 = r0.nativeGetClassByIds(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetClassData(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, java.lang.String r3) {
                byte[] r0 = r0.nativeGetClassData(r1, r3)
                return r0
        }

        public static final /* synthetic */ int access$nativeGetDexNum(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1) {
                int r0 = r0.nativeGetDexNum(r1)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetFieldAnnotations(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                byte[] r0 = r0.nativeGetFieldAnnotations(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetFieldByIds(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long[] r3) {
                byte[] r0 = r0.nativeGetFieldByIds(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetFieldData(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, java.lang.String r3) {
                byte[] r0 = r0.nativeGetFieldData(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetInvokeMethods(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                byte[] r0 = r0.nativeGetInvokeMethods(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetMethodAnnotations(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                byte[] r0 = r0.nativeGetMethodAnnotations(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetMethodByIds(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long[] r3) {
                byte[] r0 = r0.nativeGetMethodByIds(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetMethodData(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, java.lang.String r3) {
                byte[] r0 = r0.nativeGetMethodData(r1, r3)
                return r0
        }

        public static final /* synthetic */ int[] access$nativeGetMethodOpCodes(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                int[] r0 = r0.nativeGetMethodOpCodes(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetMethodUsingFields(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                byte[] r0 = r0.nativeGetMethodUsingFields(r1, r3)
                return r0
        }

        public static final /* synthetic */ java.lang.String[] access$nativeGetMethodUsingStrings(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                java.lang.String[] r0 = r0.nativeGetMethodUsingStrings(r1, r3)
                return r0
        }

        public static final /* synthetic */ byte[] access$nativeGetParameterAnnotations(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                byte[] r0 = r0.nativeGetParameterAnnotations(r1, r3)
                return r0
        }

        public static final /* synthetic */ java.lang.String[] access$nativeGetParameterNames(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, long r3) {
                java.lang.String[] r0 = r0.nativeGetParameterNames(r1, r3)
                return r0
        }

        public static final /* synthetic */ long access$nativeInitDexKit(org.luckypray.dexkit.DexKitBridge.Companion r0, java.lang.String r1) {
                long r0 = r0.nativeInitDexKit(r1)
                return r0
        }

        public static final /* synthetic */ long access$nativeInitDexKitByBytesArray(org.luckypray.dexkit.DexKitBridge.Companion r0, byte[][] r1) {
                long r0 = r0.nativeInitDexKitByBytesArray(r1)
                return r0
        }

        public static final /* synthetic */ long access$nativeInitDexKitByClassLoader(org.luckypray.dexkit.DexKitBridge.Companion r0, java.lang.ClassLoader r1, boolean r2) {
                long r0 = r0.nativeInitDexKitByClassLoader(r1, r2)
                return r0
        }

        public static final /* synthetic */ void access$nativeInitFullCache(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1) {
                r0.nativeInitFullCache(r1)
                return
        }

        public static final /* synthetic */ void access$nativeRelease(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1) {
                r0.nativeRelease(r1)
                return
        }

        public static final /* synthetic */ void access$nativeSetMaxConcurrentQueries(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, int r3) {
                r0.nativeSetMaxConcurrentQueries(r1, r3)
                return
        }

        public static final /* synthetic */ void access$nativeSetThreadNum(org.luckypray.dexkit.DexKitBridge.Companion r0, long r1, int r3) {
                r0.nativeSetThreadNum(r1, r3)
                return
        }

        private final byte[] nativeBatchFindClassUsingStrings(long r1, byte[] r3) {
                r0 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeBatchFindClassUsingStrings(r1, r3)
                return r0
        }

        private final byte[] nativeBatchFindMethodUsingStrings(long r1, byte[] r3) {
                r0 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeBatchFindMethodUsingStrings(r1, r3)
                return r0
        }

        private final void nativeExportDexFile(long r1, java.lang.String r3) {
                r0 = this;
                org.luckypray.dexkit.DexKitBridge.access$nativeExportDexFile(r1, r3)
                return
        }

        private final byte[] nativeFieldGetMethods(long r1, long r3) {
                r0 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeFieldGetMethods(r1, r3)
                return r0
        }

        private final byte[] nativeFieldPutMethods(long r1, long r3) {
                r0 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeFieldPutMethods(r1, r3)
                return r0
        }

        private final byte[] nativeFindClass(long r1, byte[] r3) {
                r0 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeFindClass(r1, r3)
                return r0
        }

        private final byte[] nativeFindField(long r1, byte[] r3) {
                r0 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeFindField(r1, r3)
                return r0
        }

        private final byte[] nativeFindMethod(long r1, byte[] r3) {
                r0 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeFindMethod(r1, r3)
                return r0
        }

        private final byte[] nativeGetCallMethods(long r1, long r3) {
                r0 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetCallMethods(r1, r3)
                return r0
        }

        private final byte[] nativeGetClassAnnotations(long r1, long r3) {
                r0 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetClassAnnotations(r1, r3)
                return r0
        }

        private final byte[] nativeGetClassByIds(long r1, long[] r3) {
                r0 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetClassByIds(r1, r3)
                return r0
        }

        private final byte[] nativeGetClassData(long r1, java.lang.String r3) {
                r0 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetClassData(r1, r3)
                return r0
        }

        private final int nativeGetDexNum(long r1) {
                r0 = this;
                int r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetDexNum(r1)
                return r0
        }

        private final byte[] nativeGetFieldAnnotations(long r1, long r3) {
                r0 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetFieldAnnotations(r1, r3)
                return r0
        }

        private final byte[] nativeGetFieldByIds(long r1, long[] r3) {
                r0 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetFieldByIds(r1, r3)
                return r0
        }

        private final byte[] nativeGetFieldData(long r1, java.lang.String r3) {
                r0 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetFieldData(r1, r3)
                return r0
        }

        private final byte[] nativeGetInvokeMethods(long r1, long r3) {
                r0 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetInvokeMethods(r1, r3)
                return r0
        }

        private final byte[] nativeGetMethodAnnotations(long r1, long r3) {
                r0 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodAnnotations(r1, r3)
                return r0
        }

        private final byte[] nativeGetMethodByIds(long r1, long[] r3) {
                r0 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodByIds(r1, r3)
                return r0
        }

        private final byte[] nativeGetMethodData(long r1, java.lang.String r3) {
                r0 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodData(r1, r3)
                return r0
        }

        private final int[] nativeGetMethodOpCodes(long r1, long r3) {
                r0 = this;
                int[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodOpCodes(r1, r3)
                return r0
        }

        private final byte[] nativeGetMethodUsingFields(long r1, long r3) {
                r0 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodUsingFields(r1, r3)
                return r0
        }

        private final java.lang.String[] nativeGetMethodUsingStrings(long r1, long r3) {
                r0 = this;
                java.lang.String[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetMethodUsingStrings(r1, r3)
                return r0
        }

        private final byte[] nativeGetParameterAnnotations(long r1, long r3) {
                r0 = this;
                byte[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetParameterAnnotations(r1, r3)
                return r0
        }

        private final java.lang.String[] nativeGetParameterNames(long r1, long r3) {
                r0 = this;
                java.lang.String[] r0 = org.luckypray.dexkit.DexKitBridge.access$nativeGetParameterNames(r1, r3)
                return r0
        }

        private final long nativeInitDexKit(java.lang.String r1) {
                r0 = this;
                long r0 = org.luckypray.dexkit.DexKitBridge.access$nativeInitDexKit(r1)
                return r0
        }

        private final long nativeInitDexKitByBytesArray(byte[][] r1) {
                r0 = this;
                long r0 = org.luckypray.dexkit.DexKitBridge.access$nativeInitDexKitByBytesArray(r1)
                return r0
        }

        private final long nativeInitDexKitByClassLoader(java.lang.ClassLoader r1, boolean r2) {
                r0 = this;
                long r0 = org.luckypray.dexkit.DexKitBridge.access$nativeInitDexKitByClassLoader(r1, r2)
                return r0
        }

        private final void nativeInitFullCache(long r1) {
                r0 = this;
                org.luckypray.dexkit.DexKitBridge.access$nativeInitFullCache(r1)
                return
        }

        private final void nativeRelease(long r1) {
                r0 = this;
                org.luckypray.dexkit.DexKitBridge.access$nativeRelease(r1)
                return
        }

        private final void nativeSetMaxConcurrentQueries(long r1, int r3) {
                r0 = this;
                org.luckypray.dexkit.DexKitBridge.access$nativeSetMaxConcurrentQueries(r1, r3)
                return
        }

        private final void nativeSetThreadNum(long r1, int r3) {
                r0 = this;
                org.luckypray.dexkit.DexKitBridge.access$nativeSetThreadNum(r1, r3)
                return
        }

        public final org.luckypray.dexkit.DexKitBridge create(java.lang.ClassLoader r2, boolean r3) {
                r1 = this;
                r2.getClass()
                r1 = 0
                java.lang.String r0 = "dalvik.system.BaseDexClassLoader"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L1c
                boolean r0 = r0.isInstance(r2)
                if (r0 == 0) goto L16
                org.luckypray.dexkit.DexKitBridge r0 = new org.luckypray.dexkit.DexKitBridge
                r0.<init>(r2, r3, r1)
                return r0
            L16:
                java.lang.String r2 = "classLoader must be a BaseDexClassLoader (e.g. PathClassLoader/DexClassLoader)"
                p000.C1080.m7279(r2)
                return r1
            L1c:
                java.lang.String r2 = "This method requires Android runtime"
                p000.C1080.m7279(r2)
                return r1
        }

        public final org.luckypray.dexkit.DexKitBridge create(java.lang.String r2) {
                r1 = this;
                r2.getClass()
                org.luckypray.dexkit.DexKitBridge r1 = new org.luckypray.dexkit.DexKitBridge
                r0 = 0
                r1.<init>(r2, r0)
                return r1
        }

        public final org.luckypray.dexkit.DexKitBridge create(byte[][] r2) {
                r1 = this;
                r2.getClass()
                org.luckypray.dexkit.DexKitBridge r1 = new org.luckypray.dexkit.DexKitBridge
                r0 = 0
                r1.<init>(r2, r0)
                return r1
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$exportDexFile$1 */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class C06341 extends p000.bp0 implements p000.a80 {
        final /* synthetic */ java.lang.String $outPath;

        public C06341(java.lang.String r1) {
                r0 = this;
                r0.$outPath = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // p000.a80
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                r2.invoke(r0)
                s62 r2 = p000.s62.f9751
                return r2
        }

        public final void invoke(long r2) {
                r1 = this;
                org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
                java.lang.String r1 = r1.$outPath
                org.luckypray.dexkit.DexKitBridge.Companion.access$nativeExportDexFile(r0, r2, r1)
                return
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$getClassData$1 */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class C06351 extends p000.bp0 implements p000.a80 {
        final /* synthetic */ java.lang.String $descriptor;

        public C06351(java.lang.String r1) {
                r0 = this;
                r0.$descriptor = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // p000.a80
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                byte[] r2 = r2.invoke(r0)
                return r2
        }

        public final byte[] invoke(long r2) {
                r1 = this;
                org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
                java.lang.String r1 = r1.$descriptor
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetClassData(r0, r2, r1)
                return r1
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$getDexNum$1 */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class C06361 extends p000.bp0 implements p000.a80 {
        public static final org.luckypray.dexkit.DexKitBridge.C06361 INSTANCE = null;

        static {
                org.luckypray.dexkit.DexKitBridge$getDexNum$1 r0 = new org.luckypray.dexkit.DexKitBridge$getDexNum$1
                r0.<init>()
                org.luckypray.dexkit.DexKitBridge.C06361.INSTANCE = r0
                return
        }

        public C06361() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        public final java.lang.Integer invoke(long r1) {
                r0 = this;
                org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
                int r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetDexNum(r0, r1)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                return r0
        }

        @Override // p000.a80
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                java.lang.Integer r2 = r2.invoke(r0)
                return r2
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$getFieldData$1 */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class C06371 extends p000.bp0 implements p000.a80 {
        final /* synthetic */ java.lang.String $descriptor;

        public C06371(java.lang.String r1) {
                r0 = this;
                r0.$descriptor = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // p000.a80
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                byte[] r2 = r2.invoke(r0)
                return r2
        }

        public final byte[] invoke(long r2) {
                r1 = this;
                org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
                java.lang.String r1 = r1.$descriptor
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetFieldData(r0, r2, r1)
                return r1
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$getMethodData$1 */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class C06381 extends p000.bp0 implements p000.a80 {
        final /* synthetic */ java.lang.String $descriptor;

        public C06381(java.lang.String r1) {
                r0 = this;
                r0.$descriptor = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // p000.a80
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                byte[] r2 = r2.invoke(r0)
                return r2
        }

        public final byte[] invoke(long r2) {
                r1 = this;
                org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
                java.lang.String r1 = r1.$descriptor
                byte[] r1 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeGetMethodData(r0, r2, r1)
                return r1
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$initFullCache$1 */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class C06391 extends p000.bp0 implements p000.a80 {
        public static final org.luckypray.dexkit.DexKitBridge.C06391 INSTANCE = null;

        static {
                org.luckypray.dexkit.DexKitBridge$initFullCache$1 r0 = new org.luckypray.dexkit.DexKitBridge$initFullCache$1
                r0.<init>()
                org.luckypray.dexkit.DexKitBridge.C06391.INSTANCE = r0
                return
        }

        public C06391() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        @Override // p000.a80
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                r2.invoke(r0)
                s62 r2 = p000.s62.f9751
                return r2
        }

        public final void invoke(long r1) {
                r0 = this;
                org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
                org.luckypray.dexkit.DexKitBridge.Companion.access$nativeInitFullCache(r0, r1)
                return
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$setMaxConcurrentQueries$2 */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class C06402 extends p000.bp0 implements p000.a80 {
        final /* synthetic */ int $maxConcurrentQueries;

        public C06402(int r1) {
                r0 = this;
                r0.$maxConcurrentQueries = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // p000.a80
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                r2.invoke(r0)
                s62 r2 = p000.s62.f9751
                return r2
        }

        public final void invoke(long r2) {
                r1 = this;
                org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
                int r1 = r1.$maxConcurrentQueries
                org.luckypray.dexkit.DexKitBridge.Companion.access$nativeSetMaxConcurrentQueries(r0, r2, r1)
                return
        }
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.DexKitBridge$setThreadNum$2 */
    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class C06412 extends p000.bp0 implements p000.a80 {
        final /* synthetic */ int $num;

        public C06412(int r1) {
                r0 = this;
                r0.$num = r1
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // p000.a80
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                r2.invoke(r0)
                s62 r2 = p000.s62.f9751
                return r2
        }

        public final void invoke(long r2) {
                r1 = this;
                org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
                int r1 = r1.$num
                org.luckypray.dexkit.DexKitBridge.Companion.access$nativeSetThreadNum(r0, r2, r1)
                return
        }
    }

    static {
            org.luckypray.dexkit.DexKitBridge$Companion r0 = new org.luckypray.dexkit.DexKitBridge$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.DexKitBridge.Companion = r0
            return
    }

    private DexKitBridge(java.lang.ClassLoader r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r1.lifecycleLock = r0
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r2 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeInitDexKitByClassLoader(r0, r2, r3)
            r1.token = r2
            return
    }

    public /* synthetic */ DexKitBridge(java.lang.ClassLoader r1, boolean r2, p000.AbstractC1067zq r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private DexKitBridge(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r2.lifecycleLock = r0
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeInitDexKit(r0, r3)
            r2.token = r0
            return
    }

    public /* synthetic */ DexKitBridge(java.lang.String r1, p000.AbstractC1067zq r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private DexKitBridge(byte[][] r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r2.lifecycleLock = r0
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            long r0 = org.luckypray.dexkit.DexKitBridge.Companion.access$nativeInitDexKitByBytesArray(r0, r3)
            r2.token = r0
            return
    }

    public /* synthetic */ DexKitBridge(byte[][] r1, p000.AbstractC1067zq r2) {
            r0 = this;
            r0.<init>(r1)
            return
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

    public static final /* synthetic */ void access$nativeSetMaxConcurrentQueries(long r0, int r2) {
            nativeSetMaxConcurrentQueries(r0, r2)
            return
    }

    public static final /* synthetic */ void access$nativeSetThreadNum(long r0, int r2) {
            nativeSetThreadNum(r0, r2)
            return
    }

    private final java.util.Map<java.lang.String, org.luckypray.dexkit.result.ClassDataList> batchFindClassUsingStrings(byte[] r12) {
            r11 = this;
            org.luckypray.dexkit.DexKitBridge$batchFindClassUsingStrings$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$batchFindClassUsingStrings$res$1
            r0.<init>(r12)
            java.lang.Object r12 = r11.withNativeReadToken$dexkit_android_release(r0)
            byte[] r12 = (byte[]) r12
            org.luckypray.dexkit.schema.-BatchClassMetaArrayHolder$Companion r0 = org.luckypray.dexkit.schema.BatchClassMetaArrayHolder.Companion
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.wrap(r12)
            r12.getClass()
            org.luckypray.dexkit.schema.-BatchClassMetaArrayHolder r12 = r0.getRootAsBatchClassMetaArrayHolder(r12)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r12.getItemsLength()
            r2 = 0
            r3 = r2
        L23:
            if (r3 >= r1) goto L67
            org.luckypray.dexkit.schema.-BatchClassMeta r4 = r12.items(r3)
            r4.getClass()
            java.lang.String r5 = r4.getUnionKey()
            r5.getClass()
            org.luckypray.dexkit.result.ClassDataList r6 = new org.luckypray.dexkit.result.ClassDataList
            r6.<init>()
            int r7 = r4.getClassesLength()
            r8 = r2
        L3d:
            if (r8 >= r7) goto L52
            org.luckypray.dexkit.result.ClassData$-Companion r9 = org.luckypray.dexkit.result.ClassData.f13532Companion
            org.luckypray.dexkit.schema.-ClassMeta r10 = r4.classes(r8)
            r10.getClass()
            org.luckypray.dexkit.result.ClassData r9 = r9.from(r11, r10)
            r6.add(r9)
            int r8 = r8 + 1
            goto L3d
        L52:
            int r4 = r6.size()
            r7 = 1
            if (r4 <= r7) goto L61
            org.luckypray.dexkit.DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1 r4 = new org.luckypray.dexkit.DexKitBridge$batchFindClassUsingStrings$$inlined$sortBy$1
            r4.<init>()
            p000.AbstractC0019ai.m168(r6, r4)
        L61:
            r0.put(r5, r6)
            int r3 = r3 + 1
            goto L23
        L67:
            return r0
    }

    private final java.util.Map<java.lang.String, org.luckypray.dexkit.result.MethodDataList> batchFindMethodUsingStrings(byte[] r12) {
            r11 = this;
            org.luckypray.dexkit.DexKitBridge$batchFindMethodUsingStrings$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$batchFindMethodUsingStrings$res$1
            r0.<init>(r12)
            java.lang.Object r12 = r11.withNativeReadToken$dexkit_android_release(r0)
            byte[] r12 = (byte[]) r12
            org.luckypray.dexkit.schema.-BatchMethodMetaArrayHolder$Companion r0 = org.luckypray.dexkit.schema.BatchMethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r12 = java.nio.ByteBuffer.wrap(r12)
            r12.getClass()
            org.luckypray.dexkit.schema.-BatchMethodMetaArrayHolder r12 = r0.getRootAsBatchMethodMetaArrayHolder(r12)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r12.getItemsLength()
            r2 = 0
            r3 = r2
        L23:
            if (r3 >= r1) goto L67
            org.luckypray.dexkit.schema.-BatchMethodMeta r4 = r12.items(r3)
            r4.getClass()
            java.lang.String r5 = r4.getUnionKey()
            r5.getClass()
            org.luckypray.dexkit.result.MethodDataList r6 = new org.luckypray.dexkit.result.MethodDataList
            r6.<init>()
            int r7 = r4.getMethodsLength()
            r8 = r2
        L3d:
            if (r8 >= r7) goto L52
            org.luckypray.dexkit.result.MethodData$-Companion r9 = org.luckypray.dexkit.result.MethodData.f13534Companion
            org.luckypray.dexkit.schema.-MethodMeta r10 = r4.methods(r8)
            r10.getClass()
            org.luckypray.dexkit.result.MethodData r9 = r9.from(r11, r10)
            r6.add(r9)
            int r8 = r8 + 1
            goto L3d
        L52:
            int r4 = r6.size()
            r7 = 1
            if (r4 <= r7) goto L61
            org.luckypray.dexkit.DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1 r4 = new org.luckypray.dexkit.DexKitBridge$batchFindMethodUsingStrings$$inlined$sortBy$1
            r4.<init>()
            p000.AbstractC0019ai.m168(r6, r4)
        L61:
            r0.put(r5, r6)
            int r3 = r3 + 1
            goto L23
        L67:
            return r0
    }

    public static final org.luckypray.dexkit.DexKitBridge create(java.lang.ClassLoader r1, boolean r2) {
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            org.luckypray.dexkit.DexKitBridge r1 = r0.create(r1, r2)
            return r1
    }

    public static final org.luckypray.dexkit.DexKitBridge create(java.lang.String r1) {
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            org.luckypray.dexkit.DexKitBridge r1 = r0.create(r1)
            return r1
    }

    public static final org.luckypray.dexkit.DexKitBridge create(byte[][] r1) {
            org.luckypray.dexkit.DexKitBridge$Companion r0 = org.luckypray.dexkit.DexKitBridge.Companion
            org.luckypray.dexkit.DexKitBridge r1 = r0.create(r1)
            return r1
    }

    private final org.luckypray.dexkit.result.ClassDataList findClass(byte[] r6) {
            r5 = this;
            org.luckypray.dexkit.DexKitBridge$findClass$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$findClass$res$1
            r0.<init>(r6)
            java.lang.Object r6 = r5.withNativeReadToken$dexkit_android_release(r0)
            byte[] r6 = (byte[]) r6
            org.luckypray.dexkit.schema.-ClassMetaArrayHolder$Companion r0 = org.luckypray.dexkit.schema.ClassMetaArrayHolder.Companion
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            r6.getClass()
            org.luckypray.dexkit.schema.-ClassMetaArrayHolder r6 = r0.getRootAsClassMetaArrayHolder(r6)
            org.luckypray.dexkit.result.ClassDataList r0 = new org.luckypray.dexkit.result.ClassDataList
            r0.<init>()
            int r1 = r6.getClassesLength()
            r2 = 0
        L22:
            if (r2 >= r1) goto L37
            org.luckypray.dexkit.result.ClassData$-Companion r3 = org.luckypray.dexkit.result.ClassData.f13532Companion
            org.luckypray.dexkit.schema.-ClassMeta r4 = r6.classes(r2)
            r4.getClass()
            org.luckypray.dexkit.result.ClassData r3 = r3.from(r5, r4)
            r0.add(r3)
            int r2 = r2 + 1
            goto L22
        L37:
            int r5 = r0.size()
            r6 = 1
            if (r5 <= r6) goto L46
            org.luckypray.dexkit.DexKitBridge$findClass$$inlined$sortBy$1 r5 = new org.luckypray.dexkit.DexKitBridge$findClass$$inlined$sortBy$1
            r5.<init>()
            p000.AbstractC0019ai.m168(r0, r5)
        L46:
            return r0
    }

    private final org.luckypray.dexkit.result.FieldDataList findField(byte[] r6) {
            r5 = this;
            org.luckypray.dexkit.DexKitBridge$findField$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$findField$res$1
            r0.<init>(r6)
            java.lang.Object r6 = r5.withNativeReadToken$dexkit_android_release(r0)
            byte[] r6 = (byte[]) r6
            org.luckypray.dexkit.schema.-FieldMetaArrayHolder$Companion r0 = org.luckypray.dexkit.schema.FieldMetaArrayHolder.Companion
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            r6.getClass()
            org.luckypray.dexkit.schema.-FieldMetaArrayHolder r6 = r0.getRootAsFieldMetaArrayHolder(r6)
            org.luckypray.dexkit.result.FieldDataList r0 = new org.luckypray.dexkit.result.FieldDataList
            r0.<init>()
            int r1 = r6.getFieldsLength()
            r2 = 0
        L22:
            if (r2 >= r1) goto L37
            org.luckypray.dexkit.result.FieldData$-Companion r3 = org.luckypray.dexkit.result.FieldData.f13533Companion
            org.luckypray.dexkit.schema.-FieldMeta r4 = r6.fields(r2)
            r4.getClass()
            org.luckypray.dexkit.result.FieldData r3 = r3.from(r5, r4)
            r0.add(r3)
            int r2 = r2 + 1
            goto L22
        L37:
            int r5 = r0.size()
            r6 = 1
            if (r5 <= r6) goto L46
            org.luckypray.dexkit.DexKitBridge$findField$$inlined$sortBy$1 r5 = new org.luckypray.dexkit.DexKitBridge$findField$$inlined$sortBy$1
            r5.<init>()
            p000.AbstractC0019ai.m168(r0, r5)
        L46:
            return r0
    }

    private final org.luckypray.dexkit.result.MethodDataList findMethod(byte[] r6) {
            r5 = this;
            org.luckypray.dexkit.DexKitBridge$findMethod$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$findMethod$res$1
            r0.<init>(r6)
            java.lang.Object r6 = r5.withNativeReadToken$dexkit_android_release(r0)
            byte[] r6 = (byte[]) r6
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder$Companion r0 = org.luckypray.dexkit.schema.MethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            r6.getClass()
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder r6 = r0.getRootAsMethodMetaArrayHolder(r6)
            org.luckypray.dexkit.result.MethodDataList r0 = new org.luckypray.dexkit.result.MethodDataList
            r0.<init>()
            int r1 = r6.getMethodsLength()
            r2 = 0
        L22:
            if (r2 >= r1) goto L37
            org.luckypray.dexkit.result.MethodData$-Companion r3 = org.luckypray.dexkit.result.MethodData.f13534Companion
            org.luckypray.dexkit.schema.-MethodMeta r4 = r6.methods(r2)
            r4.getClass()
            org.luckypray.dexkit.result.MethodData r3 = r3.from(r5, r4)
            r0.add(r3)
            int r2 = r2 + 1
            goto L22
        L37:
            int r5 = r0.size()
            r6 = 1
            if (r5 <= r6) goto L46
            org.luckypray.dexkit.DexKitBridge$findMethod$$inlined$sortBy$1 r5 = new org.luckypray.dexkit.DexKitBridge$findMethod$$inlined$sortBy$1
            r5.<init>()
            p000.AbstractC0019ai.m168(r0, r5)
        L46:
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

    private final <T> T withNativeWriteToken(p000.a80 r9) {
            r8 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r8.lifecycleLock
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
            long r4 = r8.token     // Catch: java.lang.Throwable -> L3f
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L41
            java.lang.Long r8 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r8 = r9.invoke(r8)     // Catch: java.lang.Throwable -> L3f
        L33:
            if (r3 >= r2) goto L3b
            r1.lock()
            int r3 = r3 + 1
            goto L33
        L3b:
            r0.unlock()
            return r8
        L3f:
            r8 = move-exception
            goto L49
        L41:
            java.lang.String r8 = "DexKitBridge is not valid"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3f
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L3f
            throw r9     // Catch: java.lang.Throwable -> L3f
        L49:
            if (r3 >= r2) goto L51
            r1.lock()
            int r3 = r3 + 1
            goto L49
        L51:
            r0.unlock()
            throw r8
    }

    public final /* synthetic */ java.util.Map batchFindClassUsingStrings(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.BatchFindClassUsingStrings r0 = new org.luckypray.dexkit.query.BatchFindClassUsingStrings
            r0.<init>()
            r2.invoke(r0)
            java.util.Map r1 = r1.batchFindClassUsingStrings(r0)
            return r1
    }

    public final java.util.Map<java.lang.String, org.luckypray.dexkit.result.ClassDataList> batchFindClassUsingStrings(org.luckypray.dexkit.query.BatchFindClassUsingStrings r1) {
            r0 = this;
            r1.getClass()
            byte[] r1 = r1.serializedBytes$dexkit_android_release()
            java.util.Map r0 = r0.batchFindClassUsingStrings(r1)
            return r0
    }

    public final /* synthetic */ java.util.Map batchFindMethodUsingStrings(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.BatchFindMethodUsingStrings r0 = new org.luckypray.dexkit.query.BatchFindMethodUsingStrings
            r0.<init>()
            r2.invoke(r0)
            java.util.Map r1 = r1.batchFindMethodUsingStrings(r0)
            return r1
    }

    public final java.util.Map<java.lang.String, org.luckypray.dexkit.result.MethodDataList> batchFindMethodUsingStrings(org.luckypray.dexkit.query.BatchFindMethodUsingStrings r1) {
            r0 = this;
            r1.getClass()
            byte[] r1 = r1.serializedBytes$dexkit_android_release()
            java.util.Map r0 = r0.batchFindMethodUsingStrings(r1)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r9 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r9.lifecycleLock
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
            long r4 = r9.token     // Catch: java.lang.Throwable -> L4a
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
            r9.token = r6     // Catch: java.lang.Throwable -> L4a
            org.luckypray.dexkit.DexKitBridge$Companion r9 = org.luckypray.dexkit.DexKitBridge.Companion     // Catch: java.lang.Throwable -> L4a
            org.luckypray.dexkit.DexKitBridge.Companion.access$nativeRelease(r9, r4)     // Catch: java.lang.Throwable -> L4a
        L3e:
            if (r3 >= r2) goto L46
            r1.lock()
            int r3 = r3 + 1
            goto L3e
        L46:
            r0.unlock()
            return
        L4a:
            r9 = move-exception
        L4b:
            if (r3 >= r2) goto L53
            r1.lock()
            int r3 = r3 + 1
            goto L4b
        L53:
            r0.unlock()
            throw r9
    }

    public final void exportDexFile(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.DexKitBridge$exportDexFile$1 r0 = new org.luckypray.dexkit.DexKitBridge$exportDexFile$1
            r0.<init>(r2)
            r1.withNativeReadToken$dexkit_android_release(r0)
            return
    }

    public final void finalize() {
            r0 = this;
            r0.close()
            return
    }

    public final /* synthetic */ org.luckypray.dexkit.result.ClassDataList findClass(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.FindClass r0 = new org.luckypray.dexkit.query.FindClass
            r0.<init>()
            r2.invoke(r0)
            org.luckypray.dexkit.result.ClassDataList r1 = r1.findClass(r0)
            return r1
    }

    public final org.luckypray.dexkit.result.ClassDataList findClass(org.luckypray.dexkit.query.FindClass r1) {
            r0 = this;
            r1.getClass()
            byte[] r1 = r1.serializedBytes$dexkit_android_release()
            org.luckypray.dexkit.result.ClassDataList r0 = r0.findClass(r1)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.result.FieldDataList findField(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.FindField r0 = new org.luckypray.dexkit.query.FindField
            r0.<init>()
            r2.invoke(r0)
            org.luckypray.dexkit.result.FieldDataList r1 = r1.findField(r0)
            return r1
    }

    public final org.luckypray.dexkit.result.FieldDataList findField(org.luckypray.dexkit.query.FindField r1) {
            r0 = this;
            r1.getClass()
            byte[] r1 = r1.serializedBytes$dexkit_android_release()
            org.luckypray.dexkit.result.FieldDataList r0 = r0.findField(r1)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.result.MethodDataList findMethod(p000.a80 r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.query.FindMethod r0 = new org.luckypray.dexkit.query.FindMethod
            r0.<init>()
            r2.invoke(r0)
            org.luckypray.dexkit.result.MethodDataList r1 = r1.findMethod(r0)
            return r1
    }

    public final org.luckypray.dexkit.result.MethodDataList findMethod(org.luckypray.dexkit.query.FindMethod r1) {
            r0 = this;
            r1.getClass()
            byte[] r1 = r1.serializedBytes$dexkit_android_release()
            org.luckypray.dexkit.result.MethodDataList r0 = r0.findMethod(r1)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.result.MethodDataList getCallMethods$dexkit_android_release(long r5) {
            r4 = this;
            org.luckypray.dexkit.DexKitBridge$getCallMethods$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$getCallMethods$res$1
            r0.<init>(r5)
            java.lang.Object r5 = r4.withNativeReadToken$dexkit_android_release(r0)
            byte[] r5 = (byte[]) r5
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder$Companion r6 = org.luckypray.dexkit.schema.MethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r5.getClass()
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder r5 = r6.getRootAsMethodMetaArrayHolder(r5)
            org.luckypray.dexkit.result.MethodDataList r6 = new org.luckypray.dexkit.result.MethodDataList
            r6.<init>()
            int r0 = r5.getMethodsLength()
            r1 = 0
        L22:
            if (r1 >= r0) goto L37
            org.luckypray.dexkit.result.MethodData$-Companion r2 = org.luckypray.dexkit.result.MethodData.f13534Companion
            org.luckypray.dexkit.schema.-MethodMeta r3 = r5.methods(r1)
            r3.getClass()
            org.luckypray.dexkit.result.MethodData r2 = r2.from(r4, r3)
            r6.add(r2)
            int r1 = r1 + 1
            goto L22
        L37:
            return r6
    }

    public final /* synthetic */ java.util.List getClassAnnotations$dexkit_android_release(long r5) {
            r4 = this;
            org.luckypray.dexkit.DexKitBridge$getClassAnnotations$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$getClassAnnotations$res$1
            r0.<init>(r5)
            java.lang.Object r5 = r4.withNativeReadToken$dexkit_android_release(r0)
            byte[] r5 = (byte[]) r5
            org.luckypray.dexkit.schema.-AnnotationMetaArrayHolder$Companion r6 = org.luckypray.dexkit.schema.AnnotationMetaArrayHolder.Companion
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r5.getClass()
            org.luckypray.dexkit.schema.-AnnotationMetaArrayHolder r5 = r6.getRootAsAnnotationMetaArrayHolder(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r0 = r5.getAnnotationsLength()
            r1 = 0
        L22:
            if (r1 >= r0) goto L37
            org.luckypray.dexkit.result.AnnotationData$-Companion r2 = org.luckypray.dexkit.result.AnnotationData.f13528Companion
            org.luckypray.dexkit.schema.-AnnotationMeta r3 = r5.annotations(r1)
            r3.getClass()
            org.luckypray.dexkit.result.AnnotationData r2 = r2.from(r4, r3)
            r6.add(r2)
            int r1 = r1 + 1
            goto L22
        L37:
            return r6
    }

    public final org.luckypray.dexkit.result.ClassData getClassData(java.lang.Class<?> r1) {
            r0 = this;
            r1.getClass()
            java.lang.String r1 = org.luckypray.dexkit.util.DexSignUtil.getDescriptor(r1)
            org.luckypray.dexkit.result.ClassData r0 = r0.getClassData(r1)
            return r0
    }

    public final org.luckypray.dexkit.result.ClassData getClassData(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            int r0 = r3.length()
            if (r0 == 0) goto L61
            r0 = 0
            char r0 = r3.charAt(r0)
            r1 = 76
            if (r0 != r1) goto L1b
            char r0 = p000.q02.m4672(r3)
            r1 = 59
            if (r0 != r1) goto L1b
            goto L39
        L1b:
            r0 = 46
            r1 = 47
            java.lang.String r3 = r3.replace(r0, r1)
            r3.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "L"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = ";"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L39:
            org.luckypray.dexkit.wrap.DexClass r0 = new org.luckypray.dexkit.wrap.DexClass
            r0.<init>(r3)
            org.luckypray.dexkit.DexKitBridge$getClassData$1 r0 = new org.luckypray.dexkit.DexKitBridge$getClassData$1
            r0.<init>(r3)
            java.lang.Object r3 = r2.withNativeReadToken$dexkit_android_release(r0)
            byte[] r3 = (byte[]) r3
            if (r3 == 0) goto L5f
            org.luckypray.dexkit.result.ClassData$-Companion r0 = org.luckypray.dexkit.result.ClassData.f13532Companion
            org.luckypray.dexkit.schema.-ClassMeta$Companion r1 = org.luckypray.dexkit.schema.ClassMeta.Companion
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
            r3.getClass()
            org.luckypray.dexkit.schema.-ClassMeta r3 = r1.getRootAsClassMeta(r3)
            org.luckypray.dexkit.result.ClassData r2 = r0.from(r2, r3)
            return r2
        L5f:
            r2 = 0
            return r2
        L61:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r3 = "Char sequence is empty."
            r2.<init>(r3)
            throw r2
    }

    public final int getDexNum() {
            r1 = this;
            org.luckypray.dexkit.DexKitBridge$getDexNum$1 r0 = org.luckypray.dexkit.DexKitBridge.C06361.INSTANCE
            java.lang.Object r1 = r1.withNativeReadToken$dexkit_android_release(r0)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            return r1
    }

    public final /* synthetic */ java.util.List getFieldAnnotations$dexkit_android_release(long r5) {
            r4 = this;
            org.luckypray.dexkit.DexKitBridge$getFieldAnnotations$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$getFieldAnnotations$res$1
            r0.<init>(r5)
            java.lang.Object r5 = r4.withNativeReadToken$dexkit_android_release(r0)
            byte[] r5 = (byte[]) r5
            org.luckypray.dexkit.schema.-AnnotationMetaArrayHolder$Companion r6 = org.luckypray.dexkit.schema.AnnotationMetaArrayHolder.Companion
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r5.getClass()
            org.luckypray.dexkit.schema.-AnnotationMetaArrayHolder r5 = r6.getRootAsAnnotationMetaArrayHolder(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r0 = r5.getAnnotationsLength()
            r1 = 0
        L22:
            if (r1 >= r0) goto L37
            org.luckypray.dexkit.result.AnnotationData$-Companion r2 = org.luckypray.dexkit.result.AnnotationData.f13528Companion
            org.luckypray.dexkit.schema.-AnnotationMeta r3 = r5.annotations(r1)
            r3.getClass()
            org.luckypray.dexkit.result.AnnotationData r2 = r2.from(r4, r3)
            r6.add(r2)
            int r1 = r1 + 1
            goto L22
        L37:
            return r6
    }

    public final /* synthetic */ org.luckypray.dexkit.result.FieldDataList getFieldByIds$dexkit_android_release(long[] r6) {
            r5 = this;
            r6.getClass()
            org.luckypray.dexkit.DexKitBridge$getFieldByIds$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$getFieldByIds$res$1
            r0.<init>(r6)
            java.lang.Object r6 = r5.withNativeReadToken$dexkit_android_release(r0)
            byte[] r6 = (byte[]) r6
            org.luckypray.dexkit.schema.-FieldMetaArrayHolder$Companion r0 = org.luckypray.dexkit.schema.FieldMetaArrayHolder.Companion
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            r6.getClass()
            org.luckypray.dexkit.schema.-FieldMetaArrayHolder r6 = r0.getRootAsFieldMetaArrayHolder(r6)
            org.luckypray.dexkit.result.FieldDataList r0 = new org.luckypray.dexkit.result.FieldDataList
            r0.<init>()
            int r1 = r6.getFieldsLength()
            r2 = 0
        L25:
            if (r2 >= r1) goto L3a
            org.luckypray.dexkit.result.FieldData$-Companion r3 = org.luckypray.dexkit.result.FieldData.f13533Companion
            org.luckypray.dexkit.schema.-FieldMeta r4 = r6.fields(r2)
            r4.getClass()
            org.luckypray.dexkit.result.FieldData r3 = r3.from(r5, r4)
            r0.add(r3)
            int r2 = r2 + 1
            goto L25
        L3a:
            return r0
    }

    public final org.luckypray.dexkit.result.FieldData getFieldData(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            org.luckypray.dexkit.wrap.DexField r0 = new org.luckypray.dexkit.wrap.DexField
            r0.<init>(r3)
            org.luckypray.dexkit.DexKitBridge$getFieldData$1 r0 = new org.luckypray.dexkit.DexKitBridge$getFieldData$1
            r0.<init>(r3)
            java.lang.Object r3 = r2.withNativeReadToken$dexkit_android_release(r0)
            byte[] r3 = (byte[]) r3
            if (r3 == 0) goto L29
            org.luckypray.dexkit.result.FieldData$-Companion r0 = org.luckypray.dexkit.result.FieldData.f13533Companion
            org.luckypray.dexkit.schema.-FieldMeta$Companion r1 = org.luckypray.dexkit.schema.FieldMeta.Companion
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
            r3.getClass()
            org.luckypray.dexkit.schema.-FieldMeta r3 = r1.getRootAsFieldMeta(r3)
            org.luckypray.dexkit.result.FieldData r2 = r0.from(r2, r3)
            return r2
        L29:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.result.FieldData getFieldData(java.lang.reflect.Field r1) {
            r0 = this;
            r1.getClass()
            java.lang.String r1 = org.luckypray.dexkit.util.DexSignUtil.getDescriptor(r1)
            org.luckypray.dexkit.result.FieldData r0 = r0.getFieldData(r1)
            return r0
    }

    public final /* synthetic */ org.luckypray.dexkit.result.MethodDataList getInvokeMethods$dexkit_android_release(long r5) {
            r4 = this;
            org.luckypray.dexkit.DexKitBridge$getInvokeMethods$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$getInvokeMethods$res$1
            r0.<init>(r5)
            java.lang.Object r5 = r4.withNativeReadToken$dexkit_android_release(r0)
            byte[] r5 = (byte[]) r5
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder$Companion r6 = org.luckypray.dexkit.schema.MethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r5.getClass()
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder r5 = r6.getRootAsMethodMetaArrayHolder(r5)
            org.luckypray.dexkit.result.MethodDataList r6 = new org.luckypray.dexkit.result.MethodDataList
            r6.<init>()
            int r0 = r5.getMethodsLength()
            r1 = 0
        L22:
            if (r1 >= r0) goto L37
            org.luckypray.dexkit.result.MethodData$-Companion r2 = org.luckypray.dexkit.result.MethodData.f13534Companion
            org.luckypray.dexkit.schema.-MethodMeta r3 = r5.methods(r1)
            r3.getClass()
            org.luckypray.dexkit.result.MethodData r2 = r2.from(r4, r3)
            r6.add(r2)
            int r1 = r1 + 1
            goto L22
        L37:
            return r6
    }

    public final /* synthetic */ java.util.List getMethodAnnotations$dexkit_android_release(long r5) {
            r4 = this;
            org.luckypray.dexkit.DexKitBridge$getMethodAnnotations$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$getMethodAnnotations$res$1
            r0.<init>(r5)
            java.lang.Object r5 = r4.withNativeReadToken$dexkit_android_release(r0)
            byte[] r5 = (byte[]) r5
            org.luckypray.dexkit.schema.-AnnotationMetaArrayHolder$Companion r6 = org.luckypray.dexkit.schema.AnnotationMetaArrayHolder.Companion
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r5.getClass()
            org.luckypray.dexkit.schema.-AnnotationMetaArrayHolder r5 = r6.getRootAsAnnotationMetaArrayHolder(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r0 = r5.getAnnotationsLength()
            r1 = 0
        L22:
            if (r1 >= r0) goto L37
            org.luckypray.dexkit.result.AnnotationData$-Companion r2 = org.luckypray.dexkit.result.AnnotationData.f13528Companion
            org.luckypray.dexkit.schema.-AnnotationMeta r3 = r5.annotations(r1)
            r3.getClass()
            org.luckypray.dexkit.result.AnnotationData r2 = r2.from(r4, r3)
            r6.add(r2)
            int r1 = r1 + 1
            goto L22
        L37:
            return r6
    }

    public final /* synthetic */ org.luckypray.dexkit.result.MethodDataList getMethodByIds$dexkit_android_release(long[] r6) {
            r5 = this;
            r6.getClass()
            org.luckypray.dexkit.DexKitBridge$getMethodByIds$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$getMethodByIds$res$1
            r0.<init>(r6)
            java.lang.Object r6 = r5.withNativeReadToken$dexkit_android_release(r0)
            byte[] r6 = (byte[]) r6
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder$Companion r0 = org.luckypray.dexkit.schema.MethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            r6.getClass()
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder r6 = r0.getRootAsMethodMetaArrayHolder(r6)
            org.luckypray.dexkit.result.MethodDataList r0 = new org.luckypray.dexkit.result.MethodDataList
            r0.<init>()
            int r1 = r6.getMethodsLength()
            r2 = 0
        L25:
            if (r2 >= r1) goto L3a
            org.luckypray.dexkit.result.MethodData$-Companion r3 = org.luckypray.dexkit.result.MethodData.f13534Companion
            org.luckypray.dexkit.schema.-MethodMeta r4 = r6.methods(r2)
            r4.getClass()
            org.luckypray.dexkit.result.MethodData r3 = r3.from(r5, r4)
            r0.add(r3)
            int r2 = r2 + 1
            goto L25
        L3a:
            return r0
    }

    public final org.luckypray.dexkit.result.MethodData getMethodData(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            org.luckypray.dexkit.wrap.DexMethod r0 = new org.luckypray.dexkit.wrap.DexMethod
            r0.<init>(r3)
            org.luckypray.dexkit.DexKitBridge$getMethodData$1 r0 = new org.luckypray.dexkit.DexKitBridge$getMethodData$1
            r0.<init>(r3)
            java.lang.Object r3 = r2.withNativeReadToken$dexkit_android_release(r0)
            byte[] r3 = (byte[]) r3
            if (r3 == 0) goto L29
            org.luckypray.dexkit.result.MethodData$-Companion r0 = org.luckypray.dexkit.result.MethodData.f13534Companion
            org.luckypray.dexkit.schema.-MethodMeta$Companion r1 = org.luckypray.dexkit.schema.MethodMeta.Companion
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r3)
            r3.getClass()
            org.luckypray.dexkit.schema.-MethodMeta r3 = r1.getRootAsMethodMeta(r3)
            org.luckypray.dexkit.result.MethodData r2 = r0.from(r2, r3)
            return r2
        L29:
            r2 = 0
            return r2
    }

    public final org.luckypray.dexkit.result.MethodData getMethodData(java.lang.reflect.Constructor<?> r1) {
            r0 = this;
            r1.getClass()
            java.lang.String r1 = org.luckypray.dexkit.util.DexSignUtil.getDescriptor(r1)
            org.luckypray.dexkit.result.MethodData r0 = r0.getMethodData(r1)
            return r0
    }

    public final org.luckypray.dexkit.result.MethodData getMethodData(java.lang.reflect.Method r1) {
            r0 = this;
            r1.getClass()
            java.lang.String r1 = org.luckypray.dexkit.util.DexSignUtil.getDescriptor(r1)
            org.luckypray.dexkit.result.MethodData r0 = r0.getMethodData(r1)
            return r0
    }

    public final /* synthetic */ java.util.List getMethodOpCodes$dexkit_android_release(long r2) {
            r1 = this;
            org.luckypray.dexkit.DexKitBridge$getMethodOpCodes$1 r0 = new org.luckypray.dexkit.DexKitBridge$getMethodOpCodes$1
            r0.<init>(r2)
            java.lang.Object r1 = r1.withNativeReadToken$dexkit_android_release(r0)
            int[] r1 = (int[]) r1
            java.util.List r1 = p000.AbstractC0312g7.m2261(r1)
            return r1
    }

    public final /* synthetic */ java.util.List getMethodUsingFields$dexkit_android_release(long r5) {
            r4 = this;
            org.luckypray.dexkit.DexKitBridge$getMethodUsingFields$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$getMethodUsingFields$res$1
            r0.<init>(r5)
            java.lang.Object r5 = r4.withNativeReadToken$dexkit_android_release(r0)
            byte[] r5 = (byte[]) r5
            org.luckypray.dexkit.schema.-UsingFieldMetaArrayHolder$Companion r6 = org.luckypray.dexkit.schema.UsingFieldMetaArrayHolder.Companion
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r5.getClass()
            org.luckypray.dexkit.schema.-UsingFieldMetaArrayHolder r5 = r6.getRootAsUsingFieldMetaArrayHolder(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r0 = r5.getItemsLength()
            r1 = 0
        L22:
            if (r1 >= r0) goto L37
            org.luckypray.dexkit.result.UsingFieldData$-Companion r2 = org.luckypray.dexkit.result.UsingFieldData.f13535Companion
            org.luckypray.dexkit.schema.-UsingFieldMeta r3 = r5.items(r1)
            r3.getClass()
            org.luckypray.dexkit.result.UsingFieldData r2 = r2.from(r4, r3)
            r6.add(r2)
            int r1 = r1 + 1
            goto L22
        L37:
            return r6
    }

    public final /* synthetic */ java.util.List getMethodUsingStrings$dexkit_android_release(long r2) {
            r1 = this;
            org.luckypray.dexkit.DexKitBridge$getMethodUsingStrings$1 r0 = new org.luckypray.dexkit.DexKitBridge$getMethodUsingStrings$1
            r0.<init>(r2)
            java.lang.Object r1 = r1.withNativeReadToken$dexkit_android_release(r0)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.util.List r1 = p000.AbstractC0312g7.m2262(r1)
            return r1
    }

    public final /* synthetic */ java.util.List getParameterAnnotations$dexkit_android_release(long r10) {
            r9 = this;
            org.luckypray.dexkit.DexKitBridge$getParameterAnnotations$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$getParameterAnnotations$res$1
            r0.<init>(r10)
            java.lang.Object r10 = r9.withNativeReadToken$dexkit_android_release(r0)
            byte[] r10 = (byte[]) r10
            org.luckypray.dexkit.schema.-ParametersAnnotationMetaArrayHoler$Companion r11 = org.luckypray.dexkit.schema.ParametersAnnotationMetaArrayHoler.Companion
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.wrap(r10)
            r10.getClass()
            org.luckypray.dexkit.schema.-ParametersAnnotationMetaArrayHoler r10 = r11.getRootAsParametersAnnotationMetaArrayHoler(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r0 = r10.getAnnotationsArrayLength()
            r1 = 0
            r2 = r1
        L23:
            if (r2 >= r0) goto L51
            org.luckypray.dexkit.schema.-AnnotationMetaArrayHolder r3 = r10.annotationsArray(r2)
            r3.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r3.getAnnotationsLength()
            r6 = r1
        L36:
            if (r6 >= r5) goto L4b
            org.luckypray.dexkit.result.AnnotationData$-Companion r7 = org.luckypray.dexkit.result.AnnotationData.f13528Companion
            org.luckypray.dexkit.schema.-AnnotationMeta r8 = r3.annotations(r6)
            r8.getClass()
            org.luckypray.dexkit.result.AnnotationData r7 = r7.from(r9, r8)
            r4.add(r7)
            int r6 = r6 + 1
            goto L36
        L4b:
            r11.add(r4)
            int r2 = r2 + 1
            goto L23
        L51:
            return r11
    }

    public final /* synthetic */ java.util.List getParameterNames$dexkit_android_release(long r3) {
            r2 = this;
            org.luckypray.dexkit.DexKitBridge$getParameterNames$1 r0 = new org.luckypray.dexkit.DexKitBridge$getParameterNames$1
            r0.<init>(r3)
            java.lang.Object r2 = r2.withNativeReadToken$dexkit_android_release(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            if (r2 == 0) goto L20
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.length
            r3.<init>(r4)
            int r4 = r2.length
            r0 = 0
        L15:
            if (r0 >= r4) goto L1f
            r1 = r2[r0]
            r3.add(r1)
            int r0 = r0 + 1
            goto L15
        L1f:
            return r3
        L20:
            r2 = 0
            return r2
    }

    public final /* synthetic */ org.luckypray.dexkit.result.ClassDataList getTypeByIds$dexkit_android_release(long[] r6) {
            r5 = this;
            r6.getClass()
            org.luckypray.dexkit.DexKitBridge$getTypeByIds$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$getTypeByIds$res$1
            r0.<init>(r6)
            java.lang.Object r6 = r5.withNativeReadToken$dexkit_android_release(r0)
            byte[] r6 = (byte[]) r6
            org.luckypray.dexkit.schema.-ClassMetaArrayHolder$Companion r0 = org.luckypray.dexkit.schema.ClassMetaArrayHolder.Companion
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            r6.getClass()
            org.luckypray.dexkit.schema.-ClassMetaArrayHolder r6 = r0.getRootAsClassMetaArrayHolder(r6)
            org.luckypray.dexkit.result.ClassDataList r0 = new org.luckypray.dexkit.result.ClassDataList
            r0.<init>()
            int r1 = r6.getClassesLength()
            r2 = 0
        L25:
            if (r2 >= r1) goto L3a
            org.luckypray.dexkit.result.ClassData$-Companion r3 = org.luckypray.dexkit.result.ClassData.f13532Companion
            org.luckypray.dexkit.schema.-ClassMeta r4 = r6.classes(r2)
            r4.getClass()
            org.luckypray.dexkit.result.ClassData r3 = r3.from(r5, r4)
            r0.add(r3)
            int r2 = r2 + 1
            goto L25
        L3a:
            return r0
    }

    public final void initFullCache() {
            r1 = this;
            org.luckypray.dexkit.DexKitBridge$initFullCache$1 r0 = org.luckypray.dexkit.DexKitBridge.C06391.INSTANCE
            r1.withNativeReadToken$dexkit_android_release(r0)
            return
    }

    public final boolean isValid() {
            r4 = this;
            long r0 = r4.token
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La
            r4 = 1
            return r4
        La:
            r4 = 0
            return r4
    }

    public final /* synthetic */ org.luckypray.dexkit.result.MethodDataList readFieldMethods$dexkit_android_release(long r5) {
            r4 = this;
            org.luckypray.dexkit.DexKitBridge$readFieldMethods$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$readFieldMethods$res$1
            r0.<init>(r5)
            java.lang.Object r5 = r4.withNativeReadToken$dexkit_android_release(r0)
            byte[] r5 = (byte[]) r5
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder$Companion r6 = org.luckypray.dexkit.schema.MethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r5.getClass()
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder r5 = r6.getRootAsMethodMetaArrayHolder(r5)
            org.luckypray.dexkit.result.MethodDataList r6 = new org.luckypray.dexkit.result.MethodDataList
            r6.<init>()
            int r0 = r5.getMethodsLength()
            r1 = 0
        L22:
            if (r1 >= r0) goto L37
            org.luckypray.dexkit.result.MethodData$-Companion r2 = org.luckypray.dexkit.result.MethodData.f13534Companion
            org.luckypray.dexkit.schema.-MethodMeta r3 = r5.methods(r1)
            r3.getClass()
            org.luckypray.dexkit.result.MethodData r2 = r2.from(r4, r3)
            r6.add(r2)
            int r1 = r1 + 1
            goto L22
        L37:
            return r6
    }

    public final void setMaxConcurrentQueries(int r2) {
            r1 = this;
            if (r2 < 0) goto Lb
            org.luckypray.dexkit.DexKitBridge$setMaxConcurrentQueries$2 r0 = new org.luckypray.dexkit.DexKitBridge$setMaxConcurrentQueries$2
            r0.<init>(r2)
            r1.withNativeWriteToken(r0)
            return
        Lb:
            java.lang.String r1 = "maxConcurrentQueries must be >= 0"
            p000.C1080.m7275(r1)
            return
    }

    public final void setThreadNum(int r2) {
            r1 = this;
            if (r2 <= 0) goto Lb
            org.luckypray.dexkit.DexKitBridge$setThreadNum$2 r0 = new org.luckypray.dexkit.DexKitBridge$setThreadNum$2
            r0.<init>(r2)
            r1.withNativeWriteToken(r0)
            return
        Lb:
            java.lang.String r1 = "threadNum must be > 0"
            p000.C1080.m7275(r1)
            return
    }

    public final /* synthetic */ java.lang.Object withNativeReadToken$dexkit_android_release(p000.a80 r6) {
            r5 = this;
            r6.getClass()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.lifecycleLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            long r1 = r5.token     // Catch: java.lang.Throwable -> L20
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L22
            java.lang.Long r5 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.Object r5 = r6.invoke(r5)     // Catch: java.lang.Throwable -> L20
            r0.unlock()
            return r5
        L20:
            r5 = move-exception
            goto L2a
        L22:
            java.lang.String r5 = "DexKitBridge is not valid"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L20
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L20
            throw r6     // Catch: java.lang.Throwable -> L20
        L2a:
            r0.unlock()
            throw r5
    }

    public final /* synthetic */ org.luckypray.dexkit.result.MethodDataList writeFieldMethods$dexkit_android_release(long r5) {
            r4 = this;
            org.luckypray.dexkit.DexKitBridge$writeFieldMethods$res$1 r0 = new org.luckypray.dexkit.DexKitBridge$writeFieldMethods$res$1
            r0.<init>(r5)
            java.lang.Object r5 = r4.withNativeReadToken$dexkit_android_release(r0)
            byte[] r5 = (byte[]) r5
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder$Companion r6 = org.luckypray.dexkit.schema.MethodMetaArrayHolder.Companion
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r5.getClass()
            org.luckypray.dexkit.schema.-MethodMetaArrayHolder r5 = r6.getRootAsMethodMetaArrayHolder(r5)
            org.luckypray.dexkit.result.MethodDataList r6 = new org.luckypray.dexkit.result.MethodDataList
            r6.<init>()
            int r0 = r5.getMethodsLength()
            r1 = 0
        L22:
            if (r1 >= r0) goto L37
            org.luckypray.dexkit.result.MethodData$-Companion r2 = org.luckypray.dexkit.result.MethodData.f13534Companion
            org.luckypray.dexkit.schema.-MethodMeta r3 = r5.methods(r1)
            r3.getClass()
            org.luckypray.dexkit.result.MethodData r2 = r2.from(r4, r3)
            r6.add(r2)
            int r1 = r1 + 1
            goto L22
        L37:
            return r6
    }
}
