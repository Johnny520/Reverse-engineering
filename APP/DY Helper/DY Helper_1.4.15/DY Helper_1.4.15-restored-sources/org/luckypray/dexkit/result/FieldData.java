package org.luckypray.dexkit.result;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class FieldData extends org.luckypray.dexkit.result.base.BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    public static final org.luckypray.dexkit.result.FieldData.Companion f13533Companion = null;
    private final p000.oq0 annotations$delegate;
    private final int classId;
    private final p000.oq0 declaredClass$delegate;
    private final java.lang.String descriptor;
    private final p000.oq0 dexField$delegate;
    private final int modifiers;
    private final p000.oq0 readers$delegate;
    private final p000.oq0 type$delegate;
    private final int typeId;
    private final p000.oq0 writers$delegate;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.FieldData$-Companion, reason: invalid class name */
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

        public final org.luckypray.dexkit.result.FieldData from(org.luckypray.dexkit.DexKitBridge r10, org.luckypray.dexkit.schema.FieldMeta r11) {
                r9 = this;
                r10.getClass()
                r11.getClass()
                org.luckypray.dexkit.result.FieldData r0 = new org.luckypray.dexkit.result.FieldData
                int r2 = r11.m7437getIdpVg5ArA()
                int r3 = r11.m7436getDexIdpVg5ArA()
                int r4 = r11.m7435getClassIdpVg5ArA()
                int r5 = r11.m7434getAccessFlagspVg5ArA()
                java.lang.String r6 = r11.getDexDescriptor()
                r6.getClass()
                int r7 = r11.m7438getTypeIdpVg5ArA()
                r8 = 0
                r1 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.result.FieldData$-Companion r0 = new org.luckypray.dexkit.result.FieldData$-Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.result.FieldData.f13533Companion = r0
            return
    }

    private FieldData(org.luckypray.dexkit.DexKitBridge r1, int r2, int r3, int r4, int r5, java.lang.String r6, int r7) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.classId = r4
            r0.modifiers = r5
            r0.descriptor = r6
            r0.typeId = r7
            org.luckypray.dexkit.result.FieldData$dexField$2 r4 = new org.luckypray.dexkit.result.FieldData$dexField$2
            r4.<init>(r0)
            h22 r5 = new h22
            r5.<init>(r4)
            r0.dexField$delegate = r5
            org.luckypray.dexkit.result.FieldData$declaredClass$2 r4 = new org.luckypray.dexkit.result.FieldData$declaredClass$2
            r4.<init>(r1, r0, r3)
            h22 r5 = new h22
            r5.<init>(r4)
            r0.declaredClass$delegate = r5
            org.luckypray.dexkit.result.FieldData$type$2 r4 = new org.luckypray.dexkit.result.FieldData$type$2
            r4.<init>(r1, r0, r3)
            h22 r5 = new h22
            r5.<init>(r4)
            r0.type$delegate = r5
            org.luckypray.dexkit.result.FieldData$annotations$2 r4 = new org.luckypray.dexkit.result.FieldData$annotations$2
            r4.<init>(r1, r0, r3, r2)
            h22 r5 = new h22
            r5.<init>(r4)
            r0.annotations$delegate = r5
            org.luckypray.dexkit.result.FieldData$readers$2 r4 = new org.luckypray.dexkit.result.FieldData$readers$2
            r4.<init>(r1, r0, r3, r2)
            h22 r5 = new h22
            r5.<init>(r4)
            r0.readers$delegate = r5
            org.luckypray.dexkit.result.FieldData$writers$2 r4 = new org.luckypray.dexkit.result.FieldData$writers$2
            r4.<init>(r1, r0, r3, r2)
            h22 r1 = new h22
            r1.<init>(r4)
            r0.writers$delegate = r1
            return
    }

    public /* synthetic */ FieldData(org.luckypray.dexkit.DexKitBridge r1, int r2, int r3, int r4, int r5, java.lang.String r6, int r7, p000.AbstractC1067zq r8) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static final /* synthetic */ int access$getClassId$p(org.luckypray.dexkit.result.FieldData r0) {
            int r0 = r0.classId
            return r0
    }

    public static final /* synthetic */ long access$getEncodeId(org.luckypray.dexkit.result.FieldData r0, int r1, int r2) {
            long r0 = r0.getEncodeId(r1, r2)
            return r0
    }

    public static final /* synthetic */ int access$getTypeId$p(org.luckypray.dexkit.result.FieldData r0) {
            int r0 = r0.typeId
            return r0
    }

    private final org.luckypray.dexkit.wrap.DexField getDexField() {
            r0 = this;
            oq0 r0 = r0.dexField$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.wrap.DexField r0 = (org.luckypray.dexkit.wrap.DexField) r0
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof org.luckypray.dexkit.result.FieldData
            if (r1 == 0) goto L15
            org.luckypray.dexkit.result.FieldData r3 = (org.luckypray.dexkit.result.FieldData) r3
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
            org.luckypray.dexkit.wrap.DexField r0 = r0.getDexField()
            java.lang.String r0 = r0.getClassName()
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

    public final java.lang.reflect.Field getFieldInstance(java.lang.ClassLoader r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.wrap.DexField r0 = r1.getDexField()
            int r1 = r1.modifiers
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.reflect.Field r1 = r0.getFieldInstance(r2, r1)
            return r1
    }

    public final java.lang.String getFieldName() {
            r0 = this;
            org.luckypray.dexkit.wrap.DexField r0 = r0.getDexField()
            java.lang.String r0 = r0.getName()
            return r0
    }

    public final int getModifiers() {
            r0 = this;
            int r0 = r0.modifiers
            return r0
    }

    public final java.lang.String getName() {
            r0 = this;
            org.luckypray.dexkit.wrap.DexField r0 = r0.getDexField()
            java.lang.String r0 = r0.getName()
            return r0
    }

    public final org.luckypray.dexkit.result.MethodDataList getReaders() {
            r0 = this;
            oq0 r0 = r0.readers$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.result.MethodDataList r0 = (org.luckypray.dexkit.result.MethodDataList) r0
            return r0
    }

    public final org.luckypray.dexkit.result.ClassData getType() {
            r0 = this;
            oq0 r0 = r0.type$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.result.ClassData r0 = (org.luckypray.dexkit.result.ClassData) r0
            return r0
    }

    public final java.lang.Class<?> getTypeInstance(java.lang.ClassLoader r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.util.InstanceUtil r0 = org.luckypray.dexkit.util.InstanceUtil.INSTANCE
            java.lang.String r1 = r1.getTypeName()
            java.lang.Class r1 = r0.getClassInstance(r2, r1)
            return r1
    }

    public final java.lang.String getTypeName() {
            r0 = this;
            org.luckypray.dexkit.wrap.DexField r0 = r0.getDexField()
            java.lang.String r0 = r0.getTypeName()
            return r0
    }

    public final java.lang.String getTypeSign() {
            r0 = this;
            org.luckypray.dexkit.wrap.DexField r0 = r0.getDexField()
            java.lang.String r0 = r0.getTypeSign()
            return r0
    }

    public final org.luckypray.dexkit.result.MethodDataList getWriters() {
            r0 = this;
            oq0 r0 = r0.writers$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.result.MethodDataList r0 = (org.luckypray.dexkit.result.MethodDataList) r0
            return r0
    }

    public int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.descriptor
            int r0 = r0.hashCode()
            return r0
    }

    public final org.luckypray.dexkit.wrap.DexField toDexField() {
            r0 = this;
            org.luckypray.dexkit.wrap.DexField r0 = r0.getDexField()
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r4.modifiers
            java.lang.String r2 = " "
            if (r1 <= 0) goto L21
            java.lang.String r1 = java.lang.reflect.Modifier.toString(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
        L21:
            java.lang.String r1 = r4.getTypeName()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r4.getClassName()
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
