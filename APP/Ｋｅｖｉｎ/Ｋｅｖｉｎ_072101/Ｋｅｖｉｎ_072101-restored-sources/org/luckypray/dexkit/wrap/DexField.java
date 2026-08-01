package org.luckypray.dexkit.wrap;

/* JADX INFO: compiled from: DexField.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\u000e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0003H\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u001b\u0010\u0011\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\n¨\u0006!"}, m115d2 = {"Lorg/luckypray/dexkit/wrap/DexField;", "Lorg/luckypray/dexkit/wrap/ISerializable;", "descriptor", "", "(Ljava/lang/String;)V", "field", "Ljava/lang/reflect/Field;", "(Ljava/lang/reflect/Field;)V", "className", "getClassName", "()Ljava/lang/String;", "declaredClassName", "getDeclaredClassName", "name", "getName", "typeName", "getTypeName", "typeSign", "getTypeSign", "typeSign$delegate", "Lkotlin/Lazy;", "equals", "", "other", "", "getFieldInstance", "classLoader", "Ljava/lang/ClassLoader;", "getSign", "hashCode", "", "toString", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class DexField implements org.luckypray.dexkit.wrap.ISerializable {
    public static final org.luckypray.dexkit.wrap.DexField.Companion Companion = null;
    private final java.lang.String className;
    private final java.lang.String name;
    private final java.lang.String typeName;
    private final kotlin.Lazy typeSign$delegate;

    /* JADX INFO: compiled from: DexField.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m115d2 = {"Lorg/luckypray/dexkit/wrap/DexField$Companion;", "", "()V", "deserialize", "Lorg/luckypray/dexkit/wrap/DexField;", "descriptor", "", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        public final org.luckypray.dexkit.wrap.DexField deserialize(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
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

    public DexField(java.lang.String r8) {
            r7 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r7.<init>()
            org.luckypray.dexkit.wrap.DexField$typeSign$2 r0 = new org.luckypray.dexkit.wrap.DexField$typeSign$2
            r0.<init>(r7)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r7.typeSign$delegate = r0
            r1 = r8
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r5 = 6
            r6 = 0
            java.lang.String r2 = "->"
            r3 = 0
            r4 = 0
            int r0 = kotlin.text.StringsKt.indexOf$default(r1, r2, r3, r4, r5, r6)
            r1 = r8
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r3 = r0 + 1
            r5 = 4
            java.lang.String r2 = ":"
            int r1 = kotlin.text.StringsKt.indexOf$default(r1, r2, r3, r4, r5, r6)
            r2 = -1
            if (r0 == r2) goto L60
            if (r1 == r2) goto L60
            r2 = 0
            java.lang.String r2 = r8.substring(r2, r0)
            java.lang.String r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r2 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r2)
            r7.className = r2
            int r2 = r0 + 2
            java.lang.String r2 = r8.substring(r2, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r7.name = r2
            int r2 = r1 + 1
            java.lang.String r2 = r8.substring(r2)
            java.lang.String r3 = "(this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r2 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r2)
            r7.typeName = r2
            return
        L60:
            java.lang.IllegalAccessError r2 = new java.lang.IllegalAccessError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "not field descriptor: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public DexField(java.lang.reflect.Field r3) {
            r2 = this;
            java.lang.String r0 = "field"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.<init>()
            org.luckypray.dexkit.wrap.DexField$typeSign$2 r0 = new org.luckypray.dexkit.wrap.DexField$typeSign$2
            r0.<init>(r2)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r2.typeSign$delegate = r0
            java.lang.Class r0 = r3.getDeclaringClass()
            java.lang.String r1 = "field.declaringClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r0 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r0)
            r2.className = r0
            java.lang.String r0 = r3.getName()
            java.lang.String r1 = "field.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.name = r0
            java.lang.Class r0 = r3.getType()
            java.lang.String r1 = "field.type"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r0 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r0)
            r2.typeName = r0
            return
    }

    public static final /* synthetic */ java.lang.String access$getSign(org.luckypray.dexkit.wrap.DexField r1) {
            java.lang.String r0 = r1.getSign()
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.wrap.DexField deserialize(java.lang.String r1) {
            org.luckypray.dexkit.wrap.DexField$Companion r0 = org.luckypray.dexkit.wrap.DexField.Companion
            org.luckypray.dexkit.wrap.DexField r0 = r0.deserialize(r1)
            return r0
    }

    private final java.lang.String getSign() {
            r1 = this;
            java.lang.String r0 = r1.typeName
            java.lang.String r0 = org.luckypray.dexkit.util.DexSignUtil.getTypeSign(r0)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
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
            r3 = r5
            org.luckypray.dexkit.wrap.DexField r3 = (org.luckypray.dexkit.wrap.DexField) r3
            java.lang.String r3 = r3.className
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L32
            java.lang.String r1 = r4.name
            r3 = r5
            org.luckypray.dexkit.wrap.DexField r3 = (org.luckypray.dexkit.wrap.DexField) r3
            java.lang.String r3 = r3.name
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L32
            java.lang.String r1 = r4.typeName
            r3 = r5
            org.luckypray.dexkit.wrap.DexField r3 = (org.luckypray.dexkit.wrap.DexField) r3
            java.lang.String r3 = r3.typeName
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L32
            goto L33
        L32:
            r0 = r2
        L33:
            return r0
    }

    public final java.lang.String getClassName() {
            r1 = this;
            java.lang.String r0 = r1.className
            return r0
    }

    public final java.lang.String getDeclaredClassName() {
            r1 = this;
            java.lang.String r0 = r1.className
            return r0
    }

    public final java.lang.reflect.Field getFieldInstance(java.lang.ClassLoader r2) throws java.lang.NoSuchFieldException {
            r1 = this;
            java.lang.String r0 = "classLoader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            org.luckypray.dexkit.util.InstanceUtil r0 = org.luckypray.dexkit.util.InstanceUtil.INSTANCE
            java.lang.reflect.Field r0 = r0.getFieldInstance(r2, r1)
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.lang.String getTypeName() {
            r1 = this;
            java.lang.String r0 = r1.typeName
            return r0
    }

    public final java.lang.String getTypeSign() {
            r1 = this;
            kotlin.Lazy r0 = r1.typeSign$delegate
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
    public java.lang.String serialize() {
            r1 = this;
            java.lang.String r0 = org.luckypray.dexkit.wrap.ISerializable.DefaultImpls.serialize(r1)
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r0
            r2 = 0
            java.lang.String r3 = r4.className
            java.lang.String r3 = org.luckypray.dexkit.util.DexSignUtil.getTypeSign(r3)
            r1.append(r3)
            java.lang.String r3 = "->"
            r1.append(r3)
            java.lang.String r3 = r4.name
            r1.append(r3)
            java.lang.String r3 = ":"
            r1.append(r3)
            java.lang.String r3 = r4.getTypeSign()
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}
