package org.luckypray.dexkit.wrap;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 &2\u00020\u0001:\u0001&B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u001a\u0010\u0014\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\nR\u001b\u0010#\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\nR\u0011\u0010%\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b$\u0010\n¨\u0006'"}, d2 = {"Lorg/luckypray/dexkit/wrap/DexField;", "Lorg/luckypray/dexkit/wrap/ISerializable;", "", "descriptor", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/reflect/Field;", "field", "(Ljava/lang/reflect/Field;)V", "getSign", "()Ljava/lang/String;", "Ljava/lang/ClassLoader;", "classLoader", "", "isStatic", "getFieldInstance", "(Ljava/lang/ClassLoader;Ljava/lang/Boolean;)Ljava/lang/reflect/Field;", "toString", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "className", "Ljava/lang/String;", "getClassName", "name", "getName", "typeName", "getTypeName", "typeSign$delegate", "LYue/ۥ۠ۦۨۨ;", "getTypeSign", "typeSign", "getDeclaredClassName", "declaredClassName", "Companion", "dexkit-android_release"}, k = 1, mv = {1, 5, 1})
public final class DexField implements org.luckypray.dexkit.wrap.ISerializable {

    @Yue.InterfaceC4418
    public static final org.luckypray.dexkit.wrap.DexField.Companion Companion = null;

    @Yue.InterfaceC4418
    private final java.lang.String className;

    @Yue.InterfaceC4418
    private final java.lang.String name;

    @Yue.InterfaceC4418
    private final java.lang.String typeName;

    @Yue.InterfaceC4418
    private final Yue.InterfaceC3574 typeSign$delegate;

    @Yue.InterfaceC4201(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lorg/luckypray/dexkit/wrap/DexField$Companion;", "", "()V", "deserialize", "Lorg/luckypray/dexkit/wrap/DexField;", "descriptor", "", "dexkit-android_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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
        @Yue.InterfaceC3427
        public final org.luckypray.dexkit.wrap.DexField deserialize(@Yue.InterfaceC4418 java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "descriptor"
                Yue.C3329.m13906(r2, r0)
                org.luckypray.dexkit.wrap.DexField r0 = new org.luckypray.dexkit.wrap.DexField
                r0.<init>(r2)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.wrap.DexField$Companion r0 = new org.luckypray.dexkit.wrap.DexField$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.wrap.DexField.Companion = r0
            return
    }

    public DexField(@Yue.InterfaceC4418 java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "descriptor"
            Yue.C3329.m13906(r8, r0)
            r7.<init>()
            org.luckypray.dexkit.wrap.DexField$typeSign$2 r0 = new org.luckypray.dexkit.wrap.DexField$typeSign$2
            r0.<init>(r7)
            Yue.ۥ۠ۦۨۨ r0 = Yue.C3579.m14505(r0)
            r7.typeSign$delegate = r0
            r5 = 6
            r6 = 0
            java.lang.String r2 = "->"
            r3 = 0
            r4 = 0
            r1 = r8
            int r0 = Yue.C5989.m22364(r1, r2, r3, r4, r5, r6)
            int r3 = r0 + 1
            r5 = 4
            java.lang.String r2 = ":"
            int r1 = Yue.C5989.m22364(r1, r2, r3, r4, r5, r6)
            r2 = -1
            if (r0 == r2) goto L59
            if (r1 == r2) goto L59
            r2 = 0
            java.lang.String r2 = r8.substring(r2, r0)
            java.lang.String r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            Yue.C3329.m13905(r2, r3)
            java.lang.String r2 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r2)
            r7.className = r2
            int r0 = r0 + 2
            java.lang.String r0 = r8.substring(r0, r1)
            Yue.C3329.m13905(r0, r3)
            r7.name = r0
            int r1 = r1 + 1
            java.lang.String r8 = r8.substring(r1)
            java.lang.String r0 = "(this as java.lang.String).substring(startIndex)"
            Yue.C3329.m13905(r8, r0)
            java.lang.String r8 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r8)
            r7.typeName = r8
            return
        L59:
            java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "not field descriptor: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
    }

    public DexField(@Yue.InterfaceC4418 java.lang.reflect.Field r3) {
            r2 = this;
            java.lang.String r0 = "field"
            Yue.C3329.m13906(r3, r0)
            r2.<init>()
            org.luckypray.dexkit.wrap.DexField$typeSign$2 r0 = new org.luckypray.dexkit.wrap.DexField$typeSign$2
            r0.<init>(r2)
            Yue.ۥ۠ۦۨۨ r0 = Yue.C3579.m14505(r0)
            r2.typeSign$delegate = r0
            java.lang.Class r0 = r3.getDeclaringClass()
            java.lang.String r1 = "field.declaringClass"
            Yue.C3329.m13905(r0, r1)
            java.lang.String r0 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r0)
            r2.className = r0
            java.lang.String r0 = r3.getName()
            java.lang.String r1 = "field.name"
            Yue.C3329.m13905(r0, r1)
            r2.name = r0
            java.lang.Class r3 = r3.getType()
            java.lang.String r0 = "field.type"
            Yue.C3329.m13905(r3, r0)
            java.lang.String r3 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r3)
            r2.typeName = r3
            return
    }

    public static final /* synthetic */ java.lang.String access$getSign(org.luckypray.dexkit.wrap.DexField r0) {
            java.lang.String r0 = r0.getSign()
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final org.luckypray.dexkit.wrap.DexField deserialize(@Yue.InterfaceC4418 java.lang.String r1) {
            org.luckypray.dexkit.wrap.DexField$Companion r0 = org.luckypray.dexkit.wrap.DexField.Companion
            org.luckypray.dexkit.wrap.DexField r1 = r0.deserialize(r1)
            return r1
    }

    public static /* synthetic */ java.lang.reflect.Field getFieldInstance$default(org.luckypray.dexkit.wrap.DexField r0, java.lang.ClassLoader r1, java.lang.Boolean r2, int r3, java.lang.Object r4) throws java.lang.NoSuchFieldException {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.lang.reflect.Field r0 = r0.getFieldInstance(r1, r2)
            return r0
    }

    private final java.lang.String getSign() {
            r1 = this;
            java.lang.String r0 = r1.typeName
            java.lang.String r0 = org.luckypray.dexkit.util.DexSignUtil.getTypeSign(r0)
            return r0
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof org.luckypray.dexkit.wrap.DexField
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.lang.String r1 = r4.className
            org.luckypray.dexkit.wrap.DexField r5 = (org.luckypray.dexkit.wrap.DexField) r5
            java.lang.String r3 = r5.className
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 == 0) goto L2b
            java.lang.String r1 = r4.name
            java.lang.String r3 = r5.name
            boolean r1 = Yue.C3329.m13897(r1, r3)
            if (r1 == 0) goto L2b
            java.lang.String r1 = r4.typeName
            java.lang.String r5 = r5.typeName
            boolean r5 = Yue.C3329.m13897(r1, r5)
            if (r5 == 0) goto L2b
            goto L2c
        L2b:
            r0 = r2
        L2c:
            return r0
    }

    @Yue.InterfaceC4418
    public final java.lang.String getClassName() {
            r1 = this;
            java.lang.String r0 = r1.className
            return r0
    }

    @Yue.InterfaceC4418
    public final java.lang.String getDeclaredClassName() {
            r1 = this;
            java.lang.String r0 = r1.className
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final java.lang.reflect.Field getFieldInstance(@Yue.InterfaceC4418 java.lang.ClassLoader r3) throws java.lang.NoSuchFieldException {
            r2 = this;
            java.lang.String r0 = "classLoader"
            Yue.C3329.m13906(r3, r0)
            r0 = 0
            r1 = 2
            java.lang.reflect.Field r3 = getFieldInstance$default(r2, r3, r0, r1, r0)
            return r3
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3422
    public final java.lang.reflect.Field getFieldInstance(@Yue.InterfaceC4418 java.lang.ClassLoader r2, @Yue.InterfaceC4543 java.lang.Boolean r3) throws java.lang.NoSuchFieldException {
            r1 = this;
            java.lang.String r0 = "classLoader"
            Yue.C3329.m13906(r2, r0)
            org.luckypray.dexkit.util.InstanceUtil r0 = org.luckypray.dexkit.util.InstanceUtil.INSTANCE
            java.lang.reflect.Field r2 = r0.getFieldInstance(r2, r1, r3)
            return r2
    }

    @Yue.InterfaceC4418
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    @Yue.InterfaceC4418
    public final java.lang.String getTypeName() {
            r1 = this;
            java.lang.String r0 = r1.typeName
            return r0
    }

    @Yue.InterfaceC4418
    public final java.lang.String getTypeSign() {
            r1 = this;
            Yue.ۥ۠ۦۨۨ r0 = r1.typeSign$delegate
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.className
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.name
            int r1 = r1.hashCode()
            int r1 = r1 * 31
            int r0 = r0 + r1
            java.lang.String r1 = r2.typeName
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // org.luckypray.dexkit.wrap.ISerializable
    @Yue.InterfaceC4418
    public java.lang.String serialize() {
            r1 = this;
            java.lang.String r0 = org.luckypray.dexkit.wrap.ISerializable.DefaultImpls.serialize(r1)
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.className
            java.lang.String r1 = org.luckypray.dexkit.util.DexSignUtil.getTypeSign(r1)
            r0.append(r1)
            java.lang.String r1 = "->"
            r0.append(r1)
            java.lang.String r1 = r2.name
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r1 = r2.getTypeSign()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            Yue.C3329.m13905(r0, r1)
            return r0
    }
}
