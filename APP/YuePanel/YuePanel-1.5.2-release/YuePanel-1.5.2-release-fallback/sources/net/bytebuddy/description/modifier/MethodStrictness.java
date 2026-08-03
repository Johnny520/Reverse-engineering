package net.bytebuddy.description.modifier;

/* JADX INFO: loaded from: classes2.dex */
public enum MethodStrictness extends java.lang.Enum<net.bytebuddy.description.modifier.MethodStrictness> implements net.bytebuddy.description.modifier.ModifierContributor.ForMethod {
    private static final /* synthetic */ net.bytebuddy.description.modifier.MethodStrictness[] $VALUES = null;
    public static final net.bytebuddy.description.modifier.MethodStrictness PLAIN = null;
    public static final net.bytebuddy.description.modifier.MethodStrictness STRICT = null;
    private final int mask;

    static {
            net.bytebuddy.description.modifier.MethodStrictness r0 = new net.bytebuddy.description.modifier.MethodStrictness
            java.lang.String r1 = "PLAIN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            net.bytebuddy.description.modifier.MethodStrictness.PLAIN = r0
            net.bytebuddy.description.modifier.MethodStrictness r1 = new net.bytebuddy.description.modifier.MethodStrictness
            r2 = 1
            r3 = 2048(0x800, float:2.87E-42)
            java.lang.String r4 = "STRICT"
            r1.<init>(r4, r2, r3)
            net.bytebuddy.description.modifier.MethodStrictness.STRICT = r1
            net.bytebuddy.description.modifier.MethodStrictness[] r0 = new net.bytebuddy.description.modifier.MethodStrictness[]{r0, r1}
            net.bytebuddy.description.modifier.MethodStrictness.$VALUES = r0
            return
    }

    MethodStrictness(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mask = r3
            return
    }

    public static net.bytebuddy.description.modifier.MethodStrictness valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.description.modifier.MethodStrictness> r0 = net.bytebuddy.description.modifier.MethodStrictness.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.description.modifier.MethodStrictness r1 = (net.bytebuddy.description.modifier.MethodStrictness) r1
            return r1
    }

    public static net.bytebuddy.description.modifier.MethodStrictness[] values() {
            net.bytebuddy.description.modifier.MethodStrictness[] r0 = net.bytebuddy.description.modifier.MethodStrictness.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.description.modifier.MethodStrictness[] r0 = (net.bytebuddy.description.modifier.MethodStrictness[]) r0
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
            r0 = 2048(0x800, float:2.87E-42)
            return r0
    }

    @Override // net.bytebuddy.description.modifier.ModifierContributor
    public boolean isDefault() {
            r1 = this;
            net.bytebuddy.description.modifier.MethodStrictness r0 = net.bytebuddy.description.modifier.MethodStrictness.PLAIN
            if (r1 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isStrict() {
            r1 = this;
            net.bytebuddy.description.modifier.MethodStrictness r0 = net.bytebuddy.description.modifier.MethodStrictness.STRICT
            if (r1 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
