package org.luckypray.dexkit.wrap;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class DexField implements org.luckypray.dexkit.wrap.ISerializable {
    public static final org.luckypray.dexkit.wrap.DexField.Companion Companion = null;
    private final java.lang.String className;
    private final java.lang.String name;
    private final java.lang.String typeName;
    private final p000.oq0 typeSign$delegate;

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

        public final org.luckypray.dexkit.wrap.DexField deserialize(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                org.luckypray.dexkit.wrap.DexField r0 = new org.luckypray.dexkit.wrap.DexField
                r0.<init>(r1)
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

    public DexField(java.lang.String r6) {
            r5 = this;
            r6.getClass()
            r5.<init>()
            org.luckypray.dexkit.wrap.DexField$typeSign$2 r0 = new org.luckypray.dexkit.wrap.DexField$typeSign$2
            r0.<init>(r5)
            h22 r1 = new h22
            r1.<init>(r0)
            r5.typeSign$delegate = r1
            r0 = 6
            java.lang.String r1 = "->"
            r2 = 0
            int r0 = p000.q02.m4669(r6, r1, r2, r2, r0)
            int r1 = r0 + 1
            r3 = 4
            java.lang.String r4 = ":"
            int r1 = p000.q02.m4669(r6, r4, r1, r2, r3)
            r3 = -1
            if (r0 == r3) goto L47
            if (r1 == r3) goto L47
            java.lang.String r2 = r6.substring(r2, r0)
            java.lang.String r2 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r2)
            r5.className = r2
            int r0 = r0 + 2
            java.lang.String r0 = r6.substring(r0, r1)
            r5.name = r0
            int r1 = r1 + 1
            java.lang.String r6 = r6.substring(r1)
            java.lang.String r6 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r6)
            r5.typeName = r6
            return
        L47:
            java.lang.IllegalAccessError r5 = new java.lang.IllegalAccessError
            java.lang.String r0 = "not field descriptor: "
            java.lang.String r6 = r0.concat(r6)
            r5.<init>(r6)
            throw r5
    }

    public DexField(java.lang.reflect.Field r3) {
            r2 = this;
            r3.getClass()
            r2.<init>()
            org.luckypray.dexkit.wrap.DexField$typeSign$2 r0 = new org.luckypray.dexkit.wrap.DexField$typeSign$2
            r0.<init>(r2)
            h22 r1 = new h22
            r1.<init>(r0)
            r2.typeSign$delegate = r1
            java.lang.Class r0 = r3.getDeclaringClass()
            r0.getClass()
            java.lang.String r0 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r0)
            r2.className = r0
            java.lang.String r0 = r3.getName()
            r0.getClass()
            r2.name = r0
            java.lang.Class r3 = r3.getType()
            r3.getClass()
            java.lang.String r3 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r3)
            r2.typeName = r3
            return
    }

    public static final /* synthetic */ java.lang.String access$getSign(org.luckypray.dexkit.wrap.DexField r0) {
            java.lang.String r0 = r0.getSign()
            return r0
    }

    public static final org.luckypray.dexkit.wrap.DexField deserialize(java.lang.String r1) {
            org.luckypray.dexkit.wrap.DexField$Companion r0 = org.luckypray.dexkit.wrap.DexField.Companion
            org.luckypray.dexkit.wrap.DexField r1 = r0.deserialize(r1)
            return r1
    }

    public static /* synthetic */ java.lang.reflect.Field getFieldInstance$default(org.luckypray.dexkit.wrap.DexField r0, java.lang.ClassLoader r1, java.lang.Boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.lang.reflect.Field r0 = r0.getFieldInstance(r1, r2)
            return r0
    }

    private final java.lang.String getSign() {
            r0 = this;
            java.lang.String r0 = r0.typeName
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
            org.luckypray.dexkit.wrap.DexField r5 = (org.luckypray.dexkit.wrap.DexField) r5
            java.lang.String r3 = r5.className
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 == 0) goto L2b
            java.lang.String r1 = r4.name
            java.lang.String r3 = r5.name
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 == 0) goto L2b
            java.lang.String r4 = r4.typeName
            java.lang.String r5 = r5.typeName
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto L2b
            return r0
        L2b:
            return r2
    }

    public final java.lang.String getClassName() {
            r0 = this;
            java.lang.String r0 = r0.className
            return r0
    }

    public final java.lang.String getDeclaredClassName() {
            r0 = this;
            java.lang.String r0 = r0.className
            return r0
    }

    public final java.lang.reflect.Field getFieldInstance(java.lang.ClassLoader r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            r1 = 2
            java.lang.reflect.Field r2 = getFieldInstance$default(r2, r3, r0, r1, r0)
            return r2
    }

    public final java.lang.reflect.Field getFieldInstance(java.lang.ClassLoader r2, java.lang.Boolean r3) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.util.InstanceUtil r0 = org.luckypray.dexkit.util.InstanceUtil.INSTANCE
            java.lang.reflect.Field r1 = r0.getFieldInstance(r2, r1, r3)
            return r1
    }

    public final java.lang.String getName() {
            r0 = this;
            java.lang.String r0 = r0.name
            return r0
    }

    public final java.lang.String getTypeName() {
            r0 = this;
            java.lang.String r0 = r0.typeName
            return r0
    }

    public final java.lang.String getTypeSign() {
            r0 = this;
            oq0 r0 = r0.typeSign$delegate
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
            int r1 = r1 + r0
            java.lang.String r2 = r2.typeName
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
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
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r2 = r2.getTypeSign()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
