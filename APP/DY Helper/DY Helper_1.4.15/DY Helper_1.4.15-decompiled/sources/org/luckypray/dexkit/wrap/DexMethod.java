package org.luckypray.dexkit.wrap;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class DexMethod implements org.luckypray.dexkit.wrap.ISerializable {
    public static final org.luckypray.dexkit.wrap.DexMethod.Companion Companion = null;
    private final java.lang.String className;
    private final p000.oq0 methodSign$delegate;
    private final java.lang.String name;
    private final java.util.List<java.lang.String> paramTypeNames;
    private final java.lang.String returnTypeName;

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

        public final org.luckypray.dexkit.wrap.DexMethod deserialize(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                org.luckypray.dexkit.wrap.DexMethod r0 = new org.luckypray.dexkit.wrap.DexMethod
                r0.<init>(r1)
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

    public DexMethod(java.lang.String r7) {
            r6 = this;
            r7.getClass()
            r6.<init>()
            org.luckypray.dexkit.wrap.DexMethod$methodSign$2 r0 = new org.luckypray.dexkit.wrap.DexMethod$methodSign$2
            r0.<init>(r6)
            h22 r1 = new h22
            r1.<init>(r0)
            r6.methodSign$delegate = r1
            r0 = 6
            java.lang.String r1 = "->"
            r2 = 0
            int r0 = p000.q02.m4669(r7, r1, r2, r2, r0)
            int r1 = r0 + 1
            java.lang.String r3 = "("
            r4 = 4
            int r1 = p000.q02.m4669(r7, r3, r1, r2, r4)
            int r3 = r1 + 1
            java.lang.String r5 = ")"
            int r4 = p000.q02.m4669(r7, r5, r3, r2, r4)
            r5 = -1
            if (r0 == r5) goto L5b
            if (r1 == r5) goto L5b
            if (r4 == r5) goto L5b
            java.lang.String r2 = r7.substring(r2, r0)
            java.lang.String r2 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r2)
            r6.className = r2
            int r0 = r0 + 2
            java.lang.String r0 = r7.substring(r0, r1)
            r6.name = r0
            java.lang.String r0 = r7.substring(r3, r4)
            java.util.List r0 = org.luckypray.dexkit.util.DexSignUtil.getParamTypeNames(r0)
            r6.paramTypeNames = r0
            int r4 = r4 + 1
            java.lang.String r7 = r7.substring(r4)
            java.lang.String r7 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r7)
            r6.returnTypeName = r7
            return
        L5b:
            java.lang.IllegalAccessError r6 = new java.lang.IllegalAccessError
            java.lang.String r0 = "not method descriptor: "
            java.lang.String r7 = r0.concat(r7)
            r6.<init>(r7)
            throw r6
    }

    public DexMethod(java.lang.reflect.Constructor<?> r5) {
            r4 = this;
            r5.getClass()
            r4.<init>()
            org.luckypray.dexkit.wrap.DexMethod$methodSign$2 r0 = new org.luckypray.dexkit.wrap.DexMethod$methodSign$2
            r0.<init>(r4)
            h22 r1 = new h22
            r1.<init>(r0)
            r4.methodSign$delegate = r1
            java.lang.Class r0 = r5.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            r4.className = r0
            java.lang.String r0 = "<init>"
            r4.name = r0
            java.lang.Class[] r5 = r5.getParameterTypes()
            r5.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.length
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        L2f:
            if (r2 >= r1) goto L40
            r3 = r5[r2]
            r3.getClass()
            java.lang.String r3 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L2f
        L40:
            r4.paramTypeNames = r0
            java.lang.String r5 = "void"
            r4.returnTypeName = r5
            return
    }

    public DexMethod(java.lang.reflect.Method r6) {
            r5 = this;
            r6.getClass()
            r5.<init>()
            org.luckypray.dexkit.wrap.DexMethod$methodSign$2 r0 = new org.luckypray.dexkit.wrap.DexMethod$methodSign$2
            r0.<init>(r5)
            h22 r1 = new h22
            r1.<init>(r0)
            r5.methodSign$delegate = r1
            java.lang.Class r0 = r6.getDeclaringClass()
            r0.getClass()
            java.lang.String r0 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r0)
            r5.className = r0
            java.lang.String r0 = r6.getName()
            r0.getClass()
            r5.name = r0
            java.lang.Class[] r0 = r6.getParameterTypes()
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        L37:
            if (r3 >= r2) goto L48
            r4 = r0[r3]
            r4.getClass()
            java.lang.String r4 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto L37
        L48:
            r5.paramTypeNames = r1
            java.lang.Class r6 = r6.getReturnType()
            r6.getClass()
            java.lang.String r6 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r6)
            r5.returnTypeName = r6
            return
    }

    public static final /* synthetic */ java.lang.String access$getSign(org.luckypray.dexkit.wrap.DexMethod r0) {
            java.lang.String r0 = r0.getSign()
            return r0
    }

    public static final org.luckypray.dexkit.wrap.DexMethod deserialize(java.lang.String r1) {
            org.luckypray.dexkit.wrap.DexMethod$Companion r0 = org.luckypray.dexkit.wrap.DexMethod.Companion
            org.luckypray.dexkit.wrap.DexMethod r1 = r0.deserialize(r1)
            return r1
    }

    public static /* synthetic */ java.lang.reflect.Method getMethodInstance$default(org.luckypray.dexkit.wrap.DexMethod r0, java.lang.ClassLoader r1, java.lang.Boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.lang.reflect.Method r0 = r0.getMethodInstance(r1, r2)
            return r0
    }

    private final java.lang.String getSign() {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.util.List<java.lang.String> r2 = r9.paramTypeNames
            org.luckypray.dexkit.wrap.DexMethod$getSign$1$1 r7 = org.luckypray.dexkit.wrap.DexMethod$getSign$1$1.INSTANCE
            r8 = 30
            java.lang.String r3 = ""
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r1 = p000.AbstractC0984xh.m6644(r2, r3, r4, r5, r6, r7, r8)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r9 = r9.returnTypeName
            java.lang.String r9 = org.luckypray.dexkit.util.DexSignUtil.getTypeSign(r9)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
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
            org.luckypray.dexkit.wrap.DexMethod r5 = (org.luckypray.dexkit.wrap.DexMethod) r5
            java.lang.String r3 = r5.className
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 == 0) goto L35
            java.lang.String r1 = r4.name
            java.lang.String r3 = r5.name
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 == 0) goto L35
            java.util.List<java.lang.String> r1 = r4.paramTypeNames
            java.util.List<java.lang.String> r3 = r5.paramTypeNames
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 == 0) goto L35
            java.lang.String r4 = r4.returnTypeName
            java.lang.String r5 = r5.returnTypeName
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto L35
            return r0
        L35:
            return r2
    }

    public final java.lang.String getClassName() {
            r0 = this;
            java.lang.String r0 = r0.className
            return r0
    }

    public final java.lang.reflect.Constructor<?> getConstructorInstance(java.lang.ClassLoader r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.util.InstanceUtil r0 = org.luckypray.dexkit.util.InstanceUtil.INSTANCE
            java.lang.reflect.Constructor r1 = r0.getConstructorInstance(r2, r1)
            return r1
    }

    public final java.lang.String getDeclaredClassName() {
            r0 = this;
            java.lang.String r0 = r0.className
            return r0
    }

    public final java.lang.reflect.Method getMethodInstance(java.lang.ClassLoader r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            r1 = 2
            java.lang.reflect.Method r2 = getMethodInstance$default(r2, r3, r0, r1, r0)
            return r2
    }

    public final java.lang.reflect.Method getMethodInstance(java.lang.ClassLoader r2, java.lang.Boolean r3) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.util.InstanceUtil r0 = org.luckypray.dexkit.util.InstanceUtil.INSTANCE
            java.lang.reflect.Method r1 = r0.getMethodInstance(r2, r1, r3)
            return r1
    }

    public final java.lang.String getMethodSign() {
            r0 = this;
            oq0 r0 = r0.methodSign$delegate
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public final java.lang.String getName() {
            r0 = this;
            java.lang.String r0 = r0.name
            return r0
    }

    public final java.util.List<java.lang.String> getParamTypeNames() {
            r0 = this;
            java.util.List<java.lang.String> r0 = r0.paramTypeNames
            return r0
    }

    public final java.lang.String getReturnTypeName() {
            r0 = this;
            java.lang.String r0 = r0.returnTypeName
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
            int r1 = r1 + r0
            java.util.List<java.lang.String> r0 = r2.paramTypeNames
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r0 = r0 + r1
            java.lang.String r2 = r2.returnTypeName
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final boolean isConstructor() {
            r1 = this;
            java.lang.String r1 = r1.name
            java.lang.String r0 = "<init>"
            boolean r1 = p000.ln0.m3626(r1, r0)
            return r1
    }

    public final boolean isMethod() {
            r1 = this;
            boolean r0 = r1.isStaticInitializer()
            if (r0 != 0) goto Le
            boolean r1 = r1.isConstructor()
            if (r1 != 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public final boolean isStaticInitializer() {
            r1 = this;
            java.lang.String r1 = r1.name
            java.lang.String r0 = "<clinit>"
            boolean r1 = p000.ln0.m3626(r1, r0)
            return r1
    }

    @Override // org.luckypray.dexkit.wrap.ISerializable
    public java.lang.String serialize() {
            r0 = this;
            java.lang.String r0 = org.luckypray.dexkit.wrap.ISerializable.DefaultImpls.serialize(r0)
            return r0
    }

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
            java.lang.String r2 = r2.getMethodSign()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
