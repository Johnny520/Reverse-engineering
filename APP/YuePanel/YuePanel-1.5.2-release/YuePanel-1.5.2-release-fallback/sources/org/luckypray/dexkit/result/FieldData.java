package org.luckypray.dexkit.result;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 M2\u00020\u0001:\u0001MBA\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u001b\u0010*\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0019R\u001b\u0010/\u001a\u00020+8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010.R\u001b\u00102\u001a\u00020+8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b1\u0010.R!\u00108\u001a\b\u0012\u0004\u0012\u000204038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u0010(\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b:\u0010(\u001a\u0004\b;\u0010<R\u001b\u0010@\u001a\u0002098FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u0010(\u001a\u0004\b?\u0010<R\u0011\u0010B\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bA\u0010\u001bR\u0011\u0010D\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bC\u0010\u001bR\u0011\u0010F\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bE\u0010\u001bR\u0011\u0010H\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bG\u0010\u001bR\u0011\u0010J\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bI\u0010\u001bR\u0011\u0010L\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bK\u0010\u001b¨\u0006N"}, d2 = {"Lorg/luckypray/dexkit/result/FieldData;", "Lorg/luckypray/dexkit/result/base/BaseData;", "Lorg/luckypray/dexkit/DexKitBridge;", "bridge", "", "id", "dexId", "classId", "modifiers", "", "descriptor", "typeId", "<init>", "(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;I)V", "Ljava/lang/ClassLoader;", "classLoader", "Ljava/lang/Class;", "getClassInstance", "(Ljava/lang/ClassLoader;)Ljava/lang/Class;", "getTypeInstance", "Ljava/lang/reflect/Field;", "getFieldInstance", "(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Field;", "Lorg/luckypray/dexkit/wrap/DexField;", "toDexField", "()Lorg/luckypray/dexkit/wrap/DexField;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "getModifiers", "Ljava/lang/String;", "getDescriptor", "dexField$delegate", "LYue/ۥ۠ۦۨۨ;", "getDexField", "dexField", "Lorg/luckypray/dexkit/result/ClassData;", "declaredClass$delegate", "getDeclaredClass", "()Lorg/luckypray/dexkit/result/ClassData;", "declaredClass", "type$delegate", "getType", "type", "", "Lorg/luckypray/dexkit/result/AnnotationData;", "annotations$delegate", "getAnnotations", "()Ljava/util/List;", "annotations", "Lorg/luckypray/dexkit/result/MethodDataList;", "readers$delegate", "getReaders", "()Lorg/luckypray/dexkit/result/MethodDataList;", "readers", "writers$delegate", "getWriters", "writers", "getTypeSign", "typeSign", "getClassName", "className", "getDeclaredClassName", "declaredClassName", "getFieldName", "fieldName", "getName", "name", "getTypeName", "typeName", "-Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class FieldData extends org.luckypray.dexkit.result.base.BaseData {

    /* JADX INFO: renamed from: -Companion, reason: not valid java name */
    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.result.FieldData.Companion f30806Companion = null;

    @Yue.InterfaceC4418
    private final Yue.InterfaceC3574 annotations$delegate;
    private final int classId;

    @Yue.InterfaceC4418
    private final Yue.InterfaceC3574 declaredClass$delegate;

    @Yue.InterfaceC4418
    private final java.lang.String descriptor;

    @Yue.InterfaceC4418
    private final Yue.InterfaceC3574 dexField$delegate;
    private final int modifiers;

    @Yue.InterfaceC4418
    private final Yue.InterfaceC3574 readers$delegate;

    @Yue.InterfaceC4418
    private final Yue.InterfaceC3574 type$delegate;
    private final int typeId;

    @Yue.InterfaceC4418
    private final Yue.InterfaceC3574 writers$delegate;

    /* JADX INFO: renamed from: org.luckypray.dexkit.result.FieldData$-Companion, reason: invalid class name */
    @Yue.InterfaceC4201(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\t¨\u0006\n"}, d2 = {"Lorg/luckypray/dexkit/result/FieldData$-Companion;", "", "()V", "from", "Lorg/luckypray/dexkit/result/FieldData;", "bridge", "Lorg/luckypray/dexkit/DexKitBridge;", "fieldMeta", "Lorg/luckypray/dexkit/schema/-FieldMeta;", "Lorg/luckypray/dexkit/InnerFieldMeta;", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        public final org.luckypray.dexkit.result.FieldData from(@Yue.InterfaceC4418 org.luckypray.dexkit.DexKitBridge r11, @Yue.InterfaceC4418 org.luckypray.dexkit.schema.FieldMeta r12) {
                r10 = this;
                java.lang.String r0 = "bridge"
                Yue.C3329.m13906(r11, r0)
                java.lang.String r0 = "fieldMeta"
                Yue.C3329.m13906(r12, r0)
                org.luckypray.dexkit.result.FieldData r0 = new org.luckypray.dexkit.result.FieldData
                int r3 = r12.m30830getIdpVg5ArA()
                int r4 = r12.m30829getDexIdpVg5ArA()
                int r5 = r12.m30828getClassIdpVg5ArA()
                int r6 = r12.m30827getAccessFlagspVg5ArA()
                java.lang.String r7 = r12.getDexDescriptor()
                Yue.C3329.m13903(r7)
                int r8 = r12.m30831getTypeIdpVg5ArA()
                r9 = 0
                r1 = r0
                r2 = r11
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.result.FieldData$-Companion r0 = new org.luckypray.dexkit.result.FieldData$-Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.result.FieldData.f30806Companion = r0
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
            Yue.ۥ۠ۦۨۨ r4 = Yue.C3579.m14505(r4)
            r0.dexField$delegate = r4
            org.luckypray.dexkit.result.FieldData$declaredClass$2 r4 = new org.luckypray.dexkit.result.FieldData$declaredClass$2
            r4.<init>(r1, r0, r3)
            Yue.ۥ۠ۦۨۨ r4 = Yue.C3579.m14505(r4)
            r0.declaredClass$delegate = r4
            org.luckypray.dexkit.result.FieldData$type$2 r4 = new org.luckypray.dexkit.result.FieldData$type$2
            r4.<init>(r1, r0, r3)
            Yue.ۥ۠ۦۨۨ r4 = Yue.C3579.m14505(r4)
            r0.type$delegate = r4
            org.luckypray.dexkit.result.FieldData$annotations$2 r4 = new org.luckypray.dexkit.result.FieldData$annotations$2
            r4.<init>(r1, r0, r3, r2)
            Yue.ۥ۠ۦۨۨ r4 = Yue.C3579.m14505(r4)
            r0.annotations$delegate = r4
            org.luckypray.dexkit.result.FieldData$readers$2 r4 = new org.luckypray.dexkit.result.FieldData$readers$2
            r4.<init>(r1, r0, r3, r2)
            Yue.ۥ۠ۦۨۨ r4 = Yue.C3579.m14505(r4)
            r0.readers$delegate = r4
            org.luckypray.dexkit.result.FieldData$writers$2 r4 = new org.luckypray.dexkit.result.FieldData$writers$2
            r4.<init>(r1, r0, r3, r2)
            Yue.ۥ۠ۦۨۨ r1 = Yue.C3579.m14505(r4)
            r0.writers$delegate = r1
            return
    }

    public /* synthetic */ FieldData(org.luckypray.dexkit.DexKitBridge r1, int r2, int r3, int r4, int r5, java.lang.String r6, int r7, Yue.C1769 r8) {
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
            r1 = this;
            Yue.ۥ۠ۦۨۨ r0 = r1.dexField$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.wrap.DexField r0 = (org.luckypray.dexkit.wrap.DexField) r0
            return r0
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof org.luckypray.dexkit.result.FieldData
            if (r1 == 0) goto L15
            org.luckypray.dexkit.result.FieldData r3 = (org.luckypray.dexkit.result.FieldData) r3
            java.lang.String r3 = r3.descriptor
            java.lang.String r1 = r2.descriptor
            boolean r3 = Yue.C3329.m13897(r3, r1)
            if (r3 == 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    @Yue.InterfaceC4418
    public final java.util.List<org.luckypray.dexkit.result.AnnotationData> getAnnotations() {
            r1 = this;
            Yue.ۥ۠ۦۨۨ r0 = r1.annotations$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    @Yue.InterfaceC4418
    public final java.lang.Class<?> getClassInstance(@Yue.InterfaceC4418 java.lang.ClassLoader r3) throws java.lang.ClassNotFoundException {
            r2 = this;
            java.lang.String r0 = "classLoader"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.util.InstanceUtil r0 = org.luckypray.dexkit.util.InstanceUtil.INSTANCE
            java.lang.String r1 = r2.getClassName()
            java.lang.Class r3 = r0.getClassInstance(r3, r1)
            return r3
    }

    @Yue.InterfaceC4418
    public final java.lang.String getClassName() {
            r1 = this;
            org.luckypray.dexkit.wrap.DexField r0 = r1.getDexField()
            java.lang.String r0 = r0.getClassName()
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.result.ClassData getDeclaredClass() {
            r1 = this;
            Yue.ۥ۠ۦۨۨ r0 = r1.declaredClass$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.result.ClassData r0 = (org.luckypray.dexkit.result.ClassData) r0
            return r0
    }

    @Yue.InterfaceC4418
    public final java.lang.String getDeclaredClassName() {
            r1 = this;
            java.lang.String r0 = r1.getClassName()
            return r0
    }

    @Yue.InterfaceC4418
    public final java.lang.String getDescriptor() {
            r1 = this;
            java.lang.String r0 = r1.descriptor
            return r0
    }

    @Yue.InterfaceC4418
    public final java.lang.reflect.Field getFieldInstance(@Yue.InterfaceC4418 java.lang.ClassLoader r3) throws java.lang.NoSuchFieldException {
            r2 = this;
            java.lang.String r0 = "classLoader"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.wrap.DexField r0 = r2.getDexField()
            int r1 = r2.modifiers
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.reflect.Field r3 = r0.getFieldInstance(r3, r1)
            return r3
    }

    @Yue.InterfaceC4418
    public final java.lang.String getFieldName() {
            r1 = this;
            org.luckypray.dexkit.wrap.DexField r0 = r1.getDexField()
            java.lang.String r0 = r0.getName()
            return r0
    }

    public final int getModifiers() {
            r1 = this;
            int r0 = r1.modifiers
            return r0
    }

    @Yue.InterfaceC4418
    public final java.lang.String getName() {
            r1 = this;
            org.luckypray.dexkit.wrap.DexField r0 = r1.getDexField()
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.result.MethodDataList getReaders() {
            r1 = this;
            Yue.ۥ۠ۦۨۨ r0 = r1.readers$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.result.MethodDataList r0 = (org.luckypray.dexkit.result.MethodDataList) r0
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.result.ClassData getType() {
            r1 = this;
            Yue.ۥ۠ۦۨۨ r0 = r1.type$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.result.ClassData r0 = (org.luckypray.dexkit.result.ClassData) r0
            return r0
    }

    @Yue.InterfaceC4418
    public final java.lang.Class<?> getTypeInstance(@Yue.InterfaceC4418 java.lang.ClassLoader r3) throws java.lang.ClassNotFoundException {
            r2 = this;
            java.lang.String r0 = "classLoader"
            Yue.C3329.m13906(r3, r0)
            org.luckypray.dexkit.util.InstanceUtil r0 = org.luckypray.dexkit.util.InstanceUtil.INSTANCE
            java.lang.String r1 = r2.getTypeName()
            java.lang.Class r3 = r0.getClassInstance(r3, r1)
            return r3
    }

    @Yue.InterfaceC4418
    public final java.lang.String getTypeName() {
            r1 = this;
            org.luckypray.dexkit.wrap.DexField r0 = r1.getDexField()
            java.lang.String r0 = r0.getTypeName()
            return r0
    }

    @Yue.InterfaceC4418
    public final java.lang.String getTypeSign() {
            r1 = this;
            org.luckypray.dexkit.wrap.DexField r0 = r1.getDexField()
            java.lang.String r0 = r0.getTypeSign()
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.result.MethodDataList getWriters() {
            r1 = this;
            Yue.ۥ۠ۦۨۨ r0 = r1.writers$delegate
            java.lang.Object r0 = r0.getValue()
            org.luckypray.dexkit.result.MethodDataList r0 = (org.luckypray.dexkit.result.MethodDataList) r0
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.descriptor
            int r0 = r0.hashCode()
            return r0
    }

    @Yue.InterfaceC4418
    public final org.luckypray.dexkit.wrap.DexField toDexField() {
            r1 = this;
            org.luckypray.dexkit.wrap.DexField r0 = r1.getDexField()
            return r0
    }

    @Yue.InterfaceC4418
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
            java.lang.String r1 = r4.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            Yue.C3329.m13905(r0, r1)
            return r0
    }
}
