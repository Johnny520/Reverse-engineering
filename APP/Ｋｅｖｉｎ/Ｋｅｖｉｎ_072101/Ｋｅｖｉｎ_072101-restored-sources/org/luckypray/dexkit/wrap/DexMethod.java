package org.luckypray.dexkit.wrap;

/* JADX INFO: compiled from: DexMethod.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0001,B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0013\b\u0016\u0012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0002\u0010\nJ\u0013\u0010!\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\u0012\u0010$\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&J\b\u0010(\u001a\u00020\u0003H\u0002J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u0003H\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\rR\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\r¨\u0006-"}, m115d2 = {"Lorg/luckypray/dexkit/wrap/DexMethod;", "Lorg/luckypray/dexkit/wrap/ISerializable;", "descriptor", "", "(Ljava/lang/String;)V", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "constructor", "Ljava/lang/reflect/Constructor;", "(Ljava/lang/reflect/Constructor;)V", "className", "getClassName", "()Ljava/lang/String;", "declaredClassName", "getDeclaredClassName", "isConstructor", "", "()Z", "isMethod", "isStaticInitializer", "methodSign", "getMethodSign", "methodSign$delegate", "Lkotlin/Lazy;", "name", "getName", "paramTypeNames", "", "getParamTypeNames", "()Ljava/util/List;", "returnTypeName", "getReturnTypeName", "equals", "other", "", "getConstructorInstance", "classLoader", "Ljava/lang/ClassLoader;", "getMethodInstance", "getSign", "hashCode", "", "toString", "Companion", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
public final class DexMethod implements org.luckypray.dexkit.wrap.ISerializable {
    public static final org.luckypray.dexkit.wrap.DexMethod.Companion Companion = null;
    private final java.lang.String className;
    private final kotlin.Lazy methodSign$delegate;
    private final java.lang.String name;
    private final java.util.List<java.lang.String> paramTypeNames;
    private final java.lang.String returnTypeName;

    /* JADX INFO: compiled from: DexMethod.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m115d2 = {"Lorg/luckypray/dexkit/wrap/DexMethod$Companion;", "", "()V", "deserialize", "Lorg/luckypray/dexkit/wrap/DexMethod;", "descriptor", "", "dexkit-android_release"}, m116k = 1, m117mv = {1, 5, 1}, m119xi = 48)
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
        public final org.luckypray.dexkit.wrap.DexMethod deserialize(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                org.luckypray.dexkit.wrap.DexMethod r0 = new org.luckypray.dexkit.wrap.DexMethod
                r0.<init>(r2)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.wrap.DexMethod$Companion r0 = new org.luckypray.dexkit.wrap.DexMethod$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.wrap.DexMethod.Companion = r0
            return
    }

    public DexMethod(java.lang.String r9) {
            r8 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r8.<init>()
            org.luckypray.dexkit.wrap.DexMethod$methodSign$2 r0 = new org.luckypray.dexkit.wrap.DexMethod$methodSign$2
            r0.<init>(r8)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r8.methodSign$delegate = r0
            r1 = r9
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r5 = 6
            r6 = 0
            java.lang.String r2 = "->"
            r3 = 0
            r4 = 0
            int r0 = kotlin.text.StringsKt.indexOf$default(r1, r2, r3, r4, r5, r6)
            r1 = r9
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r3 = r0 + 1
            r5 = 4
            java.lang.String r2 = "("
            int r1 = kotlin.text.StringsKt.indexOf$default(r1, r2, r3, r4, r5, r6)
            r2 = r9
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r4 = r1 + 1
            r6 = 4
            r7 = 0
            java.lang.String r3 = ")"
            r5 = 0
            int r2 = kotlin.text.StringsKt.indexOf$default(r2, r3, r4, r5, r6, r7)
            r3 = -1
            if (r0 == r3) goto L7f
            if (r1 == r3) goto L7f
            if (r2 == r3) goto L7f
            r3 = 0
            java.lang.String r3 = r9.substring(r3, r0)
            java.lang.String r4 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r3 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r3)
            r8.className = r3
            int r3 = r0 + 2
            java.lang.String r3 = r9.substring(r3, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r8.name = r3
            int r3 = r1 + 1
            java.lang.String r3 = r9.substring(r3, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.util.List r3 = org.luckypray.dexkit.util.DexSignUtil.getParamTypeNames(r3)
            r8.paramTypeNames = r3
            int r3 = r2 + 1
            java.lang.String r3 = r9.substring(r3)
            java.lang.String r4 = "(this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r3 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r3)
            r8.returnTypeName = r3
            return
        L7f:
            java.lang.IllegalAccessError r3 = new java.lang.IllegalAccessError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "not method descriptor: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r9)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public DexMethod(java.lang.reflect.Constructor<?> r12) {
            r11 = this;
            java.lang.String r0 = "constructor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r11.<init>()
            org.luckypray.dexkit.wrap.DexMethod$methodSign$2 r0 = new org.luckypray.dexkit.wrap.DexMethod$methodSign$2
            r0.<init>(r11)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r11.methodSign$delegate = r0
            java.lang.Class r0 = r12.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "constructor.declaringClass.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r11.className = r0
            java.lang.String r0 = "<init>"
            r11.name = r0
            java.lang.Class[] r0 = r12.getParameterTypes()
            java.lang.String r1 = "constructor.parameterTypes"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r0.length
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = r0
            r4 = 0
            int r5 = r3.length
            r6 = 0
        L40:
            if (r6 >= r5) goto L58
            r7 = r3[r6]
            r8 = r7
            java.lang.Class r8 = (java.lang.Class) r8
            r9 = 0
            java.lang.String r10 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r10)
            java.lang.String r8 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r8)
            r2.add(r8)
            int r6 = r6 + 1
            goto L40
        L58:
            java.util.List r2 = (java.util.List) r2
            r11.paramTypeNames = r2
            java.lang.String r0 = "void"
            r11.returnTypeName = r0
            return
    }

    public DexMethod(java.lang.reflect.Method r12) {
            r11 = this;
            java.lang.String r0 = "method"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r11.<init>()
            org.luckypray.dexkit.wrap.DexMethod$methodSign$2 r0 = new org.luckypray.dexkit.wrap.DexMethod$methodSign$2
            r0.<init>(r11)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r11.methodSign$delegate = r0
            java.lang.Class r0 = r12.getDeclaringClass()
            java.lang.String r1 = "method.declaringClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r0 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r0)
            r11.className = r0
            java.lang.String r0 = r12.getName()
            java.lang.String r1 = "method.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r11.name = r0
            java.lang.Class[] r0 = r12.getParameterTypes()
            java.lang.String r1 = "method.parameterTypes"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r0.length
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = r0
            r4 = 0
            int r5 = r3.length
            r6 = 0
        L47:
            if (r6 >= r5) goto L5f
            r7 = r3[r6]
            r8 = r7
            java.lang.Class r8 = (java.lang.Class) r8
            r9 = 0
            java.lang.String r10 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r10)
            java.lang.String r8 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r8)
            r2.add(r8)
            int r6 = r6 + 1
            goto L47
        L5f:
            java.util.List r2 = (java.util.List) r2
            r11.paramTypeNames = r2
            java.lang.Class r0 = r12.getReturnType()
            java.lang.String r1 = "method.returnType"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r0 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r0)
            r11.returnTypeName = r0
            return
    }

    public static final /* synthetic */ java.lang.String access$getSign(org.luckypray.dexkit.wrap.DexMethod r1) {
            java.lang.String r0 = r1.getSign()
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final org.luckypray.dexkit.wrap.DexMethod deserialize(java.lang.String r1) {
            org.luckypray.dexkit.wrap.DexMethod$Companion r0 = org.luckypray.dexkit.wrap.DexMethod.Companion
            org.luckypray.dexkit.wrap.DexMethod r0 = r0.deserialize(r1)
            return r0
    }

    private final java.lang.String getSign() {
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r0
            r2 = 0
            java.lang.String r3 = "("
            r1.append(r3)
            java.util.List<java.lang.String> r3 = r13.paramTypeNames
            r4 = r3
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.String r3 = ""
            r5 = r3
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            org.luckypray.dexkit.wrap.DexMethod$getSign$1$1 r3 = org.luckypray.dexkit.wrap.DexMethod$getSign$1$1.INSTANCE
            r10 = r3
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            r11 = 30
            r12 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r3 = kotlin.collections.CollectionsKt.joinToString$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1.append(r3)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r3 = r13.returnTypeName
            java.lang.String r3 = org.luckypray.dexkit.util.DexSignUtil.getTypeSign(r3)
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof org.luckypray.dexkit.wrap.DexMethod
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.lang.String r1 = r4.className
            r3 = r5
            org.luckypray.dexkit.wrap.DexMethod r3 = (org.luckypray.dexkit.wrap.DexMethod) r3
            java.lang.String r3 = r3.className
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L3f
            java.lang.String r1 = r4.name
            r3 = r5
            org.luckypray.dexkit.wrap.DexMethod r3 = (org.luckypray.dexkit.wrap.DexMethod) r3
            java.lang.String r3 = r3.name
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L3f
            java.util.List<java.lang.String> r1 = r4.paramTypeNames
            r3 = r5
            org.luckypray.dexkit.wrap.DexMethod r3 = (org.luckypray.dexkit.wrap.DexMethod) r3
            java.util.List<java.lang.String> r3 = r3.paramTypeNames
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L3f
            java.lang.String r1 = r4.returnTypeName
            r3 = r5
            org.luckypray.dexkit.wrap.DexMethod r3 = (org.luckypray.dexkit.wrap.DexMethod) r3
            java.lang.String r3 = r3.returnTypeName
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L3f
            goto L40
        L3f:
            r0 = r2
        L40:
            return r0
    }

    public final java.lang.String getClassName() {
            r1 = this;
            java.lang.String r0 = r1.className
            return r0
    }

    public final java.lang.reflect.Constructor<?> getConstructorInstance(java.lang.ClassLoader r2) throws java.lang.NoSuchMethodException {
            r1 = this;
            java.lang.String r0 = "classLoader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            org.luckypray.dexkit.util.InstanceUtil r0 = org.luckypray.dexkit.util.InstanceUtil.INSTANCE
            java.lang.reflect.Constructor r0 = r0.getConstructorInstance(r2, r1)
            return r0
    }

    public final java.lang.String getDeclaredClassName() {
            r1 = this;
            java.lang.String r0 = r1.className
            return r0
    }

    public final java.lang.reflect.Method getMethodInstance(java.lang.ClassLoader r2) throws java.lang.NoSuchMethodException {
            r1 = this;
            java.lang.String r0 = "classLoader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            org.luckypray.dexkit.util.InstanceUtil r0 = org.luckypray.dexkit.util.InstanceUtil.INSTANCE
            java.lang.reflect.Method r0 = r0.getMethodInstance(r2, r1)
            return r0
    }

    public final java.lang.String getMethodSign() {
            r1 = this;
            kotlin.Lazy r0 = r1.methodSign$delegate
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public final java.util.List<java.lang.String> getParamTypeNames() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.paramTypeNames
            return r0
    }

    public final java.lang.String getReturnTypeName() {
            r1 = this;
            java.lang.String r0 = r1.returnTypeName
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
            java.util.List<java.lang.String> r1 = r2.paramTypeNames
            int r1 = r1.hashCode()
            int r1 = r1 * 31
            int r0 = r0 + r1
            java.lang.String r1 = r2.returnTypeName
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final boolean isConstructor() {
            r2 = this;
            java.lang.String r0 = r2.name
            java.lang.String r1 = "<init>"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            return r0
    }

    public final boolean isMethod() {
            r1 = this;
            boolean r0 = r1.isStaticInitializer()
            if (r0 != 0) goto Le
            boolean r0 = r1.isConstructor()
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public final boolean isStaticInitializer() {
            r2 = this;
            java.lang.String r0 = r2.name
            java.lang.String r1 = "<clinit>"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
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
            java.lang.String r3 = r4.getMethodSign()
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}
