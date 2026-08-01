package org.luckypray.dexkit.wrap;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class DexClass implements org.luckypray.dexkit.wrap.ISerializable {
    public static final org.luckypray.dexkit.wrap.DexClass.Companion Companion = null;
    private final java.lang.String typeName;

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

        public final org.luckypray.dexkit.wrap.DexClass deserialize(java.lang.String r1) {
                r0 = this;
                r1.getClass()
                org.luckypray.dexkit.wrap.DexClass r0 = new org.luckypray.dexkit.wrap.DexClass
                r0.<init>(r1)
                return r0
        }
    }

    static {
            org.luckypray.dexkit.wrap.DexClass$Companion r0 = new org.luckypray.dexkit.wrap.DexClass$Companion
            r1 = 0
            r0.<init>(r1)
            org.luckypray.dexkit.wrap.DexClass.Companion = r0
            return
    }

    public DexClass(java.lang.Class<?> r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            java.lang.String r1 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r1)
            r0.typeName = r1
            return
    }

    public DexClass(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            java.lang.String r1 = org.luckypray.dexkit.util.DexSignUtil.getTypeName(r1)
            r0.typeName = r1
            return
    }

    public static final org.luckypray.dexkit.wrap.DexClass deserialize(java.lang.String r1) {
            org.luckypray.dexkit.wrap.DexClass$Companion r0 = org.luckypray.dexkit.wrap.DexClass.Companion
            org.luckypray.dexkit.wrap.DexClass r1 = r0.deserialize(r1)
            return r1
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof org.luckypray.dexkit.wrap.DexClass
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            java.lang.String r1 = r1.typeName
            org.luckypray.dexkit.wrap.DexClass r2 = (org.luckypray.dexkit.wrap.DexClass) r2
            java.lang.String r2 = r2.typeName
            boolean r1 = p000.ln0.m3626(r1, r2)
            return r1
    }

    public final java.lang.String getClassName() {
            r0 = this;
            java.lang.String r0 = r0.typeName
            return r0
    }

    public final java.lang.Class<?> getInstance(java.lang.ClassLoader r2) {
            r1 = this;
            r2.getClass()
            org.luckypray.dexkit.util.InstanceUtil r0 = org.luckypray.dexkit.util.InstanceUtil.INSTANCE
            java.lang.Class r1 = r0.getClassInstance(r2, r1)
            return r1
    }

    public final java.lang.String getSimpleName() {
            r1 = this;
            java.lang.String r1 = r1.typeName
            r0 = 46
            java.lang.String r1 = p000.q02.m4687(r1, r0, r1)
            return r1
    }

    public final java.lang.String getTypeName() {
            r0 = this;
            java.lang.String r0 = r0.typeName
            return r0
    }

    public int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.typeName
            int r0 = r0.hashCode()
            return r0
    }

    public final boolean isArray() {
            r2 = this;
            java.lang.String r2 = r2.typeName
            java.lang.String r0 = "[]"
            r1 = 0
            boolean r2 = p000.x02.m6479(r2, r0, r1)
            return r2
    }

    @Override // org.luckypray.dexkit.wrap.ISerializable
    public java.lang.String serialize() {
            r0 = this;
            java.lang.String r0 = org.luckypray.dexkit.wrap.ISerializable.DefaultImpls.serialize(r0)
            return r0
    }

    public java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.typeName
            java.lang.String r0 = org.luckypray.dexkit.util.DexSignUtil.getTypeSign(r0)
            return r0
    }
}
