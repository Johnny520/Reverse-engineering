package org.luckypray.dexkit.result;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ClassData extends org.luckypray.dexkit.result.base.BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final org.luckypray.dexkit.result.ClassData.Companion f13532Companion = null;
    private final p000.oq0 annotations$delegate;
    private final java.lang.String descriptor;
    private final p000.oq0 dexClass$delegate;
    private final java.util.List<java.lang.Integer> fieldIds;
    private final p000.oq0 fields$delegate;
    private final java.util.List<java.lang.Integer> interfaceIds;
    private final p000.oq0 interfaces$delegate;
    private final java.util.List<java.lang.Integer> methodIds;
    private final p000.oq0 methods$delegate;
    private final int modifiers;
    private final java.lang.String sourceFile;
    private final p000.oq0 superClass$delegate;
    private final java.lang.Integer superClassId;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.ClassData$-Companion, reason: invalid class name */
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

        public final org.luckypray.dexkit.result.ClassData from(org.luckypray.dexkit.DexKitBridge r13, org.luckypray.dexkit.schema.ClassMeta r14) {
                r12 = this;
                r13.getClass()
                r14.getClass()
                int r2 = r14.m7423getIdpVg5ArA()
                int r3 = r14.m7422getDexIdpVg5ArA()
                java.lang.String r12 = r14.getSourceFile()
                java.lang.String r0 = ""
                if (r12 != 0) goto L18
                r4 = r0
                goto L19
            L18:
                r4 = r12
            L19:
                int r5 = r14.m7421getAccessFlagspVg5ArA()
                java.lang.String r12 = r14.getDexDescriptor()
                if (r12 != 0) goto L25
                r6 = r0
                goto L26
            L25:
                r6 = r12
            L26:
                int r12 = r14.m7424getSuperClasspVg5ArA()
                r0 = -1
                if (r12 != r0) goto L30
                r12 = 0
            L2e:
                r7 = r12
                goto L35
            L30:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                goto L2e
            L35:
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                int r12 = r14.getInterfacesLength()
                r0 = 0
                r1 = r0
            L40:
                if (r1 >= r12) goto L50
                int r9 = r14.interfaces(r1)
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r8.add(r9)
                int r1 = r1 + 1
                goto L40
            L50:
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                int r12 = r14.getMethodsLength()
                r1 = r0
            L5a:
                if (r1 >= r12) goto L6a
                int r10 = r14.methods(r1)
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r9.add(r10)
                int r1 = r1 + 1
                goto L5a
            L6a:
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                int r12 = r14.getFieldsLength()
            L73:
                if (r0 >= r12) goto L83
                int r1 = r14.fields(r0)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r10.add(r1)
                int r0 = r0 + 1
                goto L73
            L83:
                org.luckypray.dexkit.result.ClassData r0 = new org.luckypray.dexkit.result.ClassData
                r11 = 0
                r1 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.result.ClassData$-Companion r0 = new org.luckypray.dexkit.result.ClassData$-Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.result.ClassData.f13532Companion = r0
            return
    }

    private ClassData(org.luckypray.dexkit.DexKitBridge r1, int r2, int r3, java.lang.String r4, int r5, java.lang.String r6, java.lang.Integer r7, java.util.List<java.lang.Integer> r8, java.util.List<java.lang.Integer> r9, java.util.List<java.lang.Integer> r10) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.sourceFile = r4
            r0.modifiers = r5
            r0.descriptor = r6
            r0.superClassId = r7
            r0.interfaceIds = r8
            r0.methodIds = r9
            r0.fieldIds = r10
            org.luckypray.dexkit.result.ClassData$dexClass$2 r4 = new org.luckypray.dexkit.result.ClassData$dexClass$2
            r4.<init>(r0)
            h22 r5 = new h22
            r5.<init>(r4)
            r0.dexClass$delegate = r5
            org.luckypray.dexkit.result.ClassData$superClass$2 r4 = new org.luckypray.dexkit.result.ClassData$superClass$2
            r4.<init>(r0, r1, r3)
            h22 r5 = new h22
            r5.<init>(r4)
            r0.superClass$delegate = r5
            org.luckypray.dexkit.result.ClassData$interfaces$2 r4 = new org.luckypray.dexkit.result.ClassData$interfaces$2
            r4.<init>(r1, r0, r3)
            h22 r5 = new h22
            r5.<init>(r4)
            r0.interfaces$delegate = r5
            org.luckypray.dexkit.result.ClassData$methods$2 r4 = new org.luckypray.dexkit.result.ClassData$methods$2
            r4.<init>(r1, r0, r3)
            h22 r5 = new h22
            r5.<init>(r4)
            r0.methods$delegate = r5
            org.luckypray.dexkit.result.ClassData$fields$2 r4 = new org.luckypray.dexkit.result.ClassData$fields$2
            r4.<init>(r1, r0, r3)
            h22 r5 = new h22
            r5.<init>(r4)
            r0.fields$delegate = r5
            org.luckypray.dexkit.result.ClassData$annotations$2 r4 = new org.luckypray.dexkit.result.ClassData$annotations$2
            r4.<init>(r1, r0, r3, r2)
            h22 r1 = new h22
            r1.<init>(r4)
            r0.annotations$delegate = r1
            return
    }

    public /* synthetic */ ClassData(org.luckypray.dexkit.DexKitBridge r1, int r2, int r3, java.lang.String r4, int r5, java.lang.String r6, java.lang.Integer r7, java.util.List r8, java.util.List r9, java.util.List r10, p000.AbstractC1067zq r11) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static final /* synthetic */ long access$getEncodeId(org.luckypray.dexkit.result.ClassData r0, int r1, int r2) {
            long r0 = r0.getEncodeId(r1, r2)
            return r0
    }

    public static final /* synthetic */ java.util.List access$getFieldIds$p(org.luckypray.dexkit.result.ClassData r0) {
            java.util.List<java.lang.Integer> r0 = r0.fieldIds
            return r0
    }

    public static final /* synthetic */ java.util.List access$getInterfaceIds$p(org.luckypray.dexkit.result.ClassData r0) {
            java.util.List<java.lang.Integer> r0 = r0.interfaceIds
            return r0
    }

    public static final /* synthetic */ java.util.List access$getMethodIds$p(org.luckypray.dexkit.result.ClassData r0) {
            java.util.List<java.lang.Integer> r0 = r0.methodIds
            return r0
    }

    public static final /* synthetic */ java.lang.Integer access$getSuperClassId$p(org.luckypray.dexkit.result.ClassData r0) {
            java.lang.Integer r0 = r0.superClassId
            return r0
    }

    private final org.luckypray.dexkit.wrap.DexClass getDexClass() {
            r0 = this;
            oq0 r0 = r0.dexClass$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.wrap.DexClass r0 = (org.luckypray.dexkit.wrap.DexClass) r0
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof org.luckypray.dexkit.result.ClassData
            if (r1 == 0) goto L15
            java.lang.String r2 = r2.descriptor
            org.luckypray.dexkit.result.ClassData r3 = (org.luckypray.dexkit.result.ClassData) r3
            java.lang.String r3 = r3.descriptor
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 == 0) goto L15
            return r0
        L15:
            r2 = 0
            return r2
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

    public final org.luckypray.dexkit.result.FieldDataList findField(org.luckypray.dexkit.query.FindField r2) {
            r1 = this;
            r2.getClass()
            java.util.List r0 = p000.AbstractC1021yh.m6896(r1)
            r2.searchInClass(r0)
            org.luckypray.dexkit.DexKitBridge r1 = r1.getBridge()
            org.luckypray.dexkit.result.FieldDataList r1 = r1.findField(r2)
            return r1
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

    public final org.luckypray.dexkit.result.MethodDataList findMethod(org.luckypray.dexkit.query.FindMethod r2) {
            r1 = this;
            r2.getClass()
            java.util.List r0 = p000.AbstractC1021yh.m6896(r1)
            r2.searchInClass(r0)
            org.luckypray.dexkit.DexKitBridge r1 = r1.getBridge()
            org.luckypray.dexkit.result.MethodDataList r1 = r1.findMethod(r2)
            return r1
    }

    public final java.util.List<org.luckypray.dexkit.result.AnnotationData> getAnnotations() {
            r0 = this;
            oq0 r0 = r0.annotations$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public final java.lang.String getDescriptor() {
            r0 = this;
            java.lang.String r0 = r0.descriptor
            return r0
    }

    public final int getFieldCount() {
            r0 = this;
            java.util.List<java.lang.Integer> r0 = r0.fieldIds
            int r0 = r0.size()
            return r0
    }

    public final org.luckypray.dexkit.result.FieldDataList getFields() {
            r0 = this;
            oq0 r0 = r0.fields$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.result.FieldDataList r0 = (org.luckypray.dexkit.result.FieldDataList) r0
            return r0
    }

    public final java.lang.Class<?> getInstance(java.lang.ClassLoader r1) {
            r0 = this;
            r1.getClass()
            org.luckypray.dexkit.wrap.DexClass r0 = r0.getDexClass()
            java.lang.Class r0 = r0.getInstance(r1)
            return r0
    }

    public final int getInterfaceCount() {
            r0 = this;
            java.util.List<java.lang.Integer> r0 = r0.interfaceIds
            int r0 = r0.size()
            return r0
    }

    public final java.util.List<java.lang.Class<?>> getInterfaceInstances(java.lang.ClassLoader r4) {
            r3 = this;
            r4.getClass()
            org.luckypray.dexkit.result.ClassDataList r3 = r3.getInterfaces()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L16:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r3.next()
            org.luckypray.dexkit.result.ClassData r1 = (org.luckypray.dexkit.result.ClassData) r1
            org.luckypray.dexkit.util.InstanceUtil r2 = org.luckypray.dexkit.util.InstanceUtil.INSTANCE
            java.lang.String r1 = r1.getName()
            java.lang.Class r1 = r2.getClassInstance(r4, r1)
            r0.add(r1)
            goto L16
        L30:
            return r0
    }

    public final org.luckypray.dexkit.result.ClassDataList getInterfaces() {
            r0 = this;
            oq0 r0 = r0.interfaces$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.result.ClassDataList r0 = (org.luckypray.dexkit.result.ClassDataList) r0
            return r0
    }

    public final int getMethodCount() {
            r0 = this;
            java.util.List<java.lang.Integer> r0 = r0.methodIds
            int r0 = r0.size()
            return r0
    }

    public final org.luckypray.dexkit.result.MethodDataList getMethods() {
            r0 = this;
            oq0 r0 = r0.methods$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.result.MethodDataList r0 = (org.luckypray.dexkit.result.MethodDataList) r0
            return r0
    }

    public final int getModifiers() {
            r0 = this;
            int r0 = r0.modifiers
            return r0
    }

    public final java.lang.String getName() {
            r0 = this;
            org.luckypray.dexkit.wrap.DexClass r0 = r0.getDexClass()
            java.lang.String r0 = r0.getTypeName()
            return r0
    }

    public final java.lang.String getSimpleName() {
            r0 = this;
            org.luckypray.dexkit.wrap.DexClass r0 = r0.getDexClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    public final java.lang.String getSourceFile() {
            r0 = this;
            java.lang.String r0 = r0.sourceFile
            return r0
    }

    public final org.luckypray.dexkit.result.ClassData getSuperClass() {
            r0 = this;
            oq0 r0 = r0.superClass$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.result.ClassData r0 = (org.luckypray.dexkit.result.ClassData) r0
            return r0
    }

    public final java.lang.Class<?> getSuperClassInstance(java.lang.ClassLoader r1) {
            r0 = this;
            r1.getClass()
            org.luckypray.dexkit.result.ClassData r0 = r0.getSuperClass()
            if (r0 == 0) goto Le
            java.lang.Class r0 = r0.getInstance(r1)
            return r0
        Le:
            r0 = 0
            return r0
    }

    public int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.descriptor
            int r0 = r0.hashCode()
            return r0
    }

    public final boolean isArray() {
            r0 = this;
            org.luckypray.dexkit.wrap.DexClass r0 = r0.getDexClass()
            boolean r0 = r0.isArray()
            return r0
    }

    public final org.luckypray.dexkit.wrap.DexClass toDexClass() {
            r0 = this;
            org.luckypray.dexkit.wrap.DexClass r0 = r0.getDexClass()
            return r0
    }

    @p000.InterfaceC0088bs
    public final org.luckypray.dexkit.wrap.DexClass toDexType() {
            r0 = this;
            org.luckypray.dexkit.wrap.DexClass r0 = r0.getDexClass()
            return r0
    }

    public java.lang.String toString() {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r9.modifiers
            if (r1 <= 0) goto L21
            java.lang.String r1 = java.lang.reflect.Modifier.toString(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " "
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
        L21:
            java.lang.String r1 = r9.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "class "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
            org.luckypray.dexkit.result.ClassData r1 = r9.getSuperClass()
            if (r1 == 0) goto L48
            java.lang.String r2 = " extends "
            r0.append(r2)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L48:
            int r1 = r9.getInterfaceCount()
            if (r1 <= 0) goto L67
            java.lang.String r1 = " implements "
            r0.append(r1)
            org.luckypray.dexkit.result.ClassDataList r2 = r9.getInterfaces()
            org.luckypray.dexkit.result.ClassData$toString$1$2 r7 = org.luckypray.dexkit.result.ClassData$toString$1$2.INSTANCE
            r8 = 30
            java.lang.String r3 = ", "
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r9 = p000.AbstractC0984xh.m6644(r2, r3, r4, r5, r6, r7, r8)
            r0.append(r9)
        L67:
            java.lang.String r9 = r0.toString()
            return r9
    }
}
