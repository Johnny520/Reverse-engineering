package net.bytebuddy.description.modifier;

/* JADX INFO: loaded from: classes2.dex */
public enum Ownership extends java.lang.Enum<net.bytebuddy.description.modifier.Ownership> implements net.bytebuddy.description.modifier.ModifierContributor.ForField, net.bytebuddy.description.modifier.ModifierContributor.ForMethod, net.bytebuddy.description.modifier.ModifierContributor.ForType {
    private static final /* synthetic */ net.bytebuddy.description.modifier.Ownership[] $VALUES = null;
    public static final net.bytebuddy.description.modifier.Ownership MEMBER = null;
    public static final net.bytebuddy.description.modifier.Ownership STATIC = null;
    private final int mask;

    static {
            net.bytebuddy.description.modifier.Ownership r0 = new net.bytebuddy.description.modifier.Ownership
            java.lang.String r1 = "MEMBER"
            r2 = 0
            r0.<init>(r1, r2, r2)
            net.bytebuddy.description.modifier.Ownership.MEMBER = r0
            net.bytebuddy.description.modifier.Ownership r1 = new net.bytebuddy.description.modifier.Ownership
            r2 = 1
            r3 = 8
            java.lang.String r4 = "STATIC"
            r1.<init>(r4, r2, r3)
            net.bytebuddy.description.modifier.Ownership.STATIC = r1
            net.bytebuddy.description.modifier.Ownership[] r0 = new net.bytebuddy.description.modifier.Ownership[]{r0, r1}
            net.bytebuddy.description.modifier.Ownership.$VALUES = r0
            return
    }

    Ownership(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mask = r3
            return
    }

    public static net.bytebuddy.description.modifier.Ownership valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.description.modifier.Ownership> r0 = net.bytebuddy.description.modifier.Ownership.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.description.modifier.Ownership r1 = (net.bytebuddy.description.modifier.Ownership) r1
            return r1
    }

    public static net.bytebuddy.description.modifier.Ownership[] values() {
            net.bytebuddy.description.modifier.Ownership[] r0 = net.bytebuddy.description.modifier.Ownership.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.description.modifier.Ownership[] r0 = (net.bytebuddy.description.modifier.Ownership[]) r0
            return r0
    }

    @Override // net.bytebuddy.description.modifier.ModifierContributor
    public int getMask() {
            r1 = this;
            int r0 = r1.mask
            return r0
    }

    @Override // net.bytebuddy.description.modifier.ModifierContributor
    public int getRange() {
            r1 = this;
            r0 = 8
            return r0
    }

    @Override // net.bytebuddy.description.modifier.ModifierContributor
    public boolean isDefault() {
            r1 = this;
            net.bytebuddy.description.modifier.Ownership r0 = net.bytebuddy.description.modifier.Ownership.MEMBER
            if (r1 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isStatic() {
            r1 = this;
            net.bytebuddy.description.modifier.Ownership r0 = net.bytebuddy.description.modifier.Ownership.STATIC
            if (r1 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
