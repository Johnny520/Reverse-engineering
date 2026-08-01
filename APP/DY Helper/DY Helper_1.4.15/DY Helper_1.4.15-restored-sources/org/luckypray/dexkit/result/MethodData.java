package org.luckypray.dexkit.result;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class MethodData extends org.luckypray.dexkit.result.base.BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final org.luckypray.dexkit.result.MethodData.Companion f13534Companion = null;
    public static final int ACC_DECLARED_SYNCHRONIZED = 131072;
    private final p000.oq0 annotations$delegate;
    private final p000.oq0 callers$delegate;
    private final int classId;
    private final p000.oq0 declaredClass$delegate;
    private final java.lang.String descriptor;
    private final p000.oq0 dexMethod$delegate;
    private final p000.oq0 invokes$delegate;
    private final int modifiers;
    private final p000.oq0 opCodes$delegate;
    private final p000.oq0 paramAnnotations$delegate;
    private final p000.oq0 paramNames$delegate;
    private final java.util.List<java.lang.Integer> paramTypeIds;
    private final p000.oq0 paramTypes$delegate;
    private final p000.oq0 returnType$delegate;
    private final int returnTypeId;
    private final p000.oq0 usingFields$delegate;
    private final p000.oq0 usingStrings$delegate;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.MethodData$-Companion, reason: invalid class name */
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

        public final org.luckypray.dexkit.result.MethodData from(org.luckypray.dexkit.DexKitBridge r11, org.luckypray.dexkit.schema.MethodMeta r12) {
                r10 = this;
                r11.getClass()
                r12.getClass()
                int r10 = r12.m7453getAccessFlagspVg5ArA()
                r0 = 131072(0x20000, float:1.83671E-40)
                r1 = r10 & r0
                if (r1 <= 0) goto L13
                r10 = r10 ^ r0
                r10 = r10 | 32
            L13:
                r5 = r10
                int r2 = r12.m7456getIdpVg5ArA()
                int r3 = r12.m7455getDexIdpVg5ArA()
                int r4 = r12.m7454getClassIdpVg5ArA()
                java.lang.String r10 = r12.getDexDescriptor()
                if (r10 != 0) goto L28
                java.lang.String r10 = ""
            L28:
                r6 = r10
                int r7 = r12.m7457getReturnTypepVg5ArA()
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                int r10 = r12.getParameterTypesLength()
                r0 = 0
            L37:
                if (r0 >= r10) goto L47
                int r1 = r12.parameterTypes(r0)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r8.add(r1)
                int r0 = r0 + 1
                goto L37
            L47:
                org.luckypray.dexkit.result.MethodData r0 = new org.luckypray.dexkit.result.MethodData
                r9 = 0
                r1 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.result.MethodData$-Companion r0 = new org.luckypray.dexkit.result.MethodData$-Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.result.MethodData.f13534Companion = r0
            return
    }

    private MethodData(org.luckypray.dexkit.DexKitBridge r1, int r2, int r3, int r4, int r5, java.lang.String r6, int r7, java.util.List<java.lang.Integer> r8) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.classId = r4
            r0.modifiers = r5
            r0.descriptor = r6
            r0.returnTypeId = r7
            r0.paramTypeIds = r8
            org.luckypray.dexkit.result.MethodData$dexMethod$2 r4 = new org.luckypray.dexkit.result.MethodData$dexMethod$2
            r4.<init>(r0)
            h22 r5 = new h22
            r5.<init>(r4)
            r0.dexMethod$delegate = r5
            org.luckypray.dexkit.result.MethodData$declaredClass$2 r4 = new org.luckypray.dexkit.result.MethodData$declaredClass$2
            r4.<init>(r1, r0, r3)
            h22 r5 = new h22
            r5.<init>(r4)
            r0.declaredClass$delegate = r5
            org.luckypray.dexkit.result.MethodData$returnType$2 r4 = new org.luckypray.dexkit.result.MethodData$returnType$2
            r4.<init>(r1, r0, r3)
            h22 r5 = new h22
            r5.<init>(r4)
            r0.returnType$delegate = r5
            org.luckypray.dexkit.result.MethodData$paramTypes$2 r4 = new org.luckypray.dexkit.result.MethodData$paramTypes$2
            r4.<init>(r1, r0, r3)
            h22 r5 = new h22
            r5.<init>(r4)
            r0.paramTypes$delegate = r5
            org.luckypray.dexkit.result.MethodData$paramNames$2 r4 = new org.luckypray.dexkit.result.MethodData$paramNames$2
            r4.<init>(r1, r0, r3, r2)
            h22 r5 = new h22
            r5.<init>(r4)
            r0.paramNames$delegate = r5
            org.luckypray.dexkit.result.MethodData$annotations$2 r4 = new org.luckypray.dexkit.result.MethodData$annotations$2
            r4.<init>(r1, r0, r3, r2)
            h22 r5 = new h22
            r5.<init>(r4)
            r0.annotations$delegate = r5
            org.luckypray.dexkit.result.MethodData$paramAnnotations$2 r4 = new org.luckypray.dexkit.result.MethodData$paramAnnotations$2
            r4.<init>(r1, r0, r3, r2)
            h22 r5 = new h22
            r5.<init>(r4)
            r0.paramAnnotations$delegate = r5
            org.luckypray.dexkit.result.MethodData$opCodes$2 r4 = new org.luckypray.dexkit.result.MethodData$opCodes$2
            r4.<init>(r1, r0, r3, r2)
            h22 r5 = new h22
            r5.<init>(r4)
            r0.opCodes$delegate = r5
            org.luckypray.dexkit.result.MethodData$callers$2 r4 = new org.luckypray.dexkit.result.MethodData$callers$2
            r4.<init>(r1, r0, r3, r2)
            h22 r5 = new h22
            r5.<init>(r4)
            r0.callers$delegate = r5
            org.luckypray.dexkit.result.MethodData$invokes$2 r4 = new org.luckypray.dexkit.result.MethodData$invokes$2
            r4.<init>(r1, r0, r3, r2)
            h22 r5 = new h22
            r5.<init>(r4)
            r0.invokes$delegate = r5
            org.luckypray.dexkit.result.MethodData$usingStrings$2 r4 = new org.luckypray.dexkit.result.MethodData$usingStrings$2
            r4.<init>(r1, r0, r3, r2)
            h22 r5 = new h22
            r5.<init>(r4)
            r0.usingStrings$delegate = r5
            org.luckypray.dexkit.result.MethodData$usingFields$2 r4 = new org.luckypray.dexkit.result.MethodData$usingFields$2
            r4.<init>(r1, r0, r3, r2)
            h22 r1 = new h22
            r1.<init>(r4)
            r0.usingFields$delegate = r1
            return
    }

    public /* synthetic */ MethodData(org.luckypray.dexkit.DexKitBridge r1, int r2, int r3, int r4, int r5, java.lang.String r6, int r7, java.util.List r8, p000.AbstractC1067zq r9) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static final /* synthetic */ int access$getClassId$p(org.luckypray.dexkit.result.MethodData r0) {
            int r0 = r0.classId
            return r0
    }

    public static final /* synthetic */ long access$getEncodeId(org.luckypray.dexkit.result.MethodData r0, int r1, int r2) {
            long r0 = r0.getEncodeId(r1, r2)
            return r0
    }

    public static final /* synthetic */ java.util.List access$getParamTypeIds$p(org.luckypray.dexkit.result.MethodData r0) {
            java.util.List<java.lang.Integer> r0 = r0.paramTypeIds
            return r0
    }

    public static final /* synthetic */ int access$getReturnTypeId$p(org.luckypray.dexkit.result.MethodData r0) {
            int r0 = r0.returnTypeId
            return r0
    }

    private final org.luckypray.dexkit.wrap.DexMethod getDexMethod() {
            r0 = this;
            oq0 r0 = r0.dexMethod$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.wrap.DexMethod r0 = (org.luckypray.dexkit.wrap.DexMethod) r0
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof org.luckypray.dexkit.result.MethodData
            if (r1 == 0) goto L15
            org.luckypray.dexkit.result.MethodData r3 = (org.luckypray.dexkit.result.MethodData) r3
            java.lang.String r3 = r3.descriptor
            java.lang.String r2 = r2.descriptor
            boolean r2 = p000.ln0.m3626(r3, r2)
            if (r2 == 0) goto L15
            return r0
        L15:
            r2 = 0
            return r2
    }

    public final java.util.List<org.luckypray.dexkit.result.AnnotationData> getAnnotations() {
            r0 = this;
            oq0 r0 = r0.annotations$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public final org.luckypray.dexkit.result.MethodDataList getCallers() {
            r0 = this;
            oq0 r0 = r0.callers$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.result.MethodDataList r0 = (org.luckypray.dexkit.result.MethodDataList) r0
            return r0
    }

    public final java.lang.Class<?> getClassInstance(java.lang.ClassLoader r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.util.InstanceUtil r0 = org.luckypray.dexkit.util.InstanceUtil.INSTANCE
            java.lang.String r1 = r1.getClassName()
            java.lang.Class r1 = r0.getClassInstance(r2, r1)
            return r1
    }

    public final java.lang.String getClassName() {
            r0 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = r0.getDexMethod()
            java.lang.String r0 = r0.getClassName()
            return r0
    }

    public final java.lang.reflect.Constructor<?> getConstructorInstance(java.lang.ClassLoader r1) {
            r0 = this;
            r1.getClass()
            org.luckypray.dexkit.wrap.DexMethod r0 = r0.getDexMethod()
            java.lang.reflect.Constructor r0 = r0.getConstructorInstance(r1)
            return r0
    }

    public final org.luckypray.dexkit.result.ClassData getDeclaredClass() {
            r0 = this;
            oq0 r0 = r0.declaredClass$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.result.ClassData r0 = (org.luckypray.dexkit.result.ClassData) r0
            return r0
    }

    public final java.lang.String getDeclaredClassName() {
            r0 = this;
            java.lang.String r0 = r0.getClassName()
            return r0
    }

    public final java.lang.String getDescriptor() {
            r0 = this;
            java.lang.String r0 = r0.descriptor
            return r0
    }

    public final org.luckypray.dexkit.result.MethodDataList getInvokes() {
            r0 = this;
            oq0 r0 = r0.invokes$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.result.MethodDataList r0 = (org.luckypray.dexkit.result.MethodDataList) r0
            return r0
    }

    public final java.lang.reflect.Method getMethodInstance(java.lang.ClassLoader r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.wrap.DexMethod r0 = r1.getDexMethod()
            int r1 = r1.modifiers
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.reflect.Method r1 = r0.getMethodInstance(r2, r1)
            return r1
    }

    public final java.lang.String getMethodName() {
            r0 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = r0.getDexMethod()
            java.lang.String r0 = r0.getName()
            return r0
    }

    public final java.lang.String getMethodSign() {
            r0 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = r0.getDexMethod()
            java.lang.String r0 = r0.getMethodSign()
            return r0
    }

    public final int getModifiers() {
            r0 = this;
            int r0 = r0.modifiers
            return r0
    }

    public final java.lang.String getName() {
            r0 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = r0.getDexMethod()
            java.lang.String r0 = r0.getName()
            return r0
    }

    public final java.util.List<java.lang.Integer> getOpCodes() {
            r0 = this;
            oq0 r0 = r0.opCodes$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public final java.util.List<java.lang.String> getOpNames() {
            r2 = this;
            java.util.List r2 = r2.getOpCodes()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r2, r1)
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r2.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.String r1 = org.luckypray.dexkit.util.OpCodeUtil.getOpFormat(r1)
            r0.add(r1)
            goto L13
        L2b:
            return r0
    }

    public final java.util.List<java.util.List<org.luckypray.dexkit.result.AnnotationData>> getParamAnnotations() {
            r0 = this;
            oq0 r0 = r0.paramAnnotations$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public final int getParamCount() {
            r0 = this;
            java.util.List<java.lang.Integer> r0 = r0.paramTypeIds
            int r0 = r0.size()
            return r0
    }

    public final java.util.List<java.lang.String> getParamNames() {
            r0 = this;
            oq0 r0 = r0.paramNames$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public final java.util.List<java.lang.String> getParamTypeNames() {
            r0 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = r0.getDexMethod()
            java.util.List r0 = r0.getParamTypeNames()
            return r0
    }

    public final org.luckypray.dexkit.result.ClassDataList getParamTypes() {
            r0 = this;
            oq0 r0 = r0.paramTypes$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.result.ClassDataList r0 = (org.luckypray.dexkit.result.ClassDataList) r0
            return r0
    }

    public final org.luckypray.dexkit.result.ClassData getReturnType() {
            r0 = this;
            oq0 r0 = r0.returnType$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.result.ClassData r0 = (org.luckypray.dexkit.result.ClassData) r0
            return r0
    }

    public final java.lang.Class<?> getReturnTypeInstance(java.lang.ClassLoader r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.util.InstanceUtil r0 = org.luckypray.dexkit.util.InstanceUtil.INSTANCE
            java.lang.String r1 = r1.getReturnTypeName()
            java.lang.Class r1 = r0.getClassInstance(r2, r1)
            return r1
    }

    public final java.lang.String getReturnTypeName() {
            r0 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = r0.getDexMethod()
            java.lang.String r0 = r0.getReturnTypeName()
            return r0
    }

    public final java.util.List<org.luckypray.dexkit.result.UsingFieldData> getUsingFields() {
            r0 = this;
            oq0 r0 = r0.usingFields$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public final java.util.List<java.lang.String> getUsingStrings() {
            r0 = this;
            oq0 r0 = r0.usingStrings$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.descriptor
            int r0 = r0.hashCode()
            return r0
    }

    public final boolean isConstructor() {
            r0 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = r0.getDexMethod()
            boolean r0 = r0.isConstructor()
            return r0
    }

    public final boolean isMethod() {
            r0 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = r0.getDexMethod()
            boolean r0 = r0.isMethod()
            return r0
    }

    public final boolean isStaticInitializer() {
            r0 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = r0.getDexMethod()
            boolean r0 = r0.isStaticInitializer()
            return r0
    }

    public final org.luckypray.dexkit.wrap.DexMethod toDexMethod() {
            r0 = this;
            org.luckypray.dexkit.wrap.DexMethod r0 = r0.getDexMethod()
            return r0
    }

    public java.lang.String toString() {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r9.modifiers
            java.lang.String r2 = " "
            if (r1 == 0) goto L21
            java.lang.String r1 = java.lang.reflect.Modifier.toString(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
        L21:
            java.lang.String r1 = r9.getReturnTypeName()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r9.getClassName()
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            java.lang.String r1 = r9.getName()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.util.List r2 = r9.getParamTypeNames()
            r7 = 0
            r8 = 62
            java.lang.String r3 = ", "
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r9 = p000.AbstractC0984xh.m6644(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r1 = ")"
            java.lang.String r9 = p000.lz1.m3691(r0, r9, r1)
            return r9
    }
}
