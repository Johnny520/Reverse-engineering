package net.bytebuddy.description.modifier;

/* JADX INFO: loaded from: classes2.dex */
public enum Mandate extends java.lang.Enum<net.bytebuddy.description.modifier.Mandate> implements net.bytebuddy.description.modifier.ModifierContributor.ForField, net.bytebuddy.description.modifier.ModifierContributor.ForMethod, net.bytebuddy.description.modifier.ModifierContributor.ForParameter {
    private static final /* synthetic */ net.bytebuddy.description.modifier.Mandate[] $VALUES = null;
    public static final net.bytebuddy.description.modifier.Mandate MANDATED = null;
    public static final net.bytebuddy.description.modifier.Mandate PLAIN = null;
    private final int mask;

    static {
            net.bytebuddy.description.modifier.Mandate r0 = new net.bytebuddy.description.modifier.Mandate
            java.lang.String r1 = "PLAIN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            net.bytebuddy.description.modifier.Mandate.PLAIN = r0
            net.bytebuddy.description.modifier.Mandate r1 = new net.bytebuddy.description.modifier.Mandate
            r2 = 1
            r3 = 32768(0x8000, float:4.5918E-41)
            java.lang.String r4 = "MANDATED"
            r1.<init>(r4, r2, r3)
            net.bytebuddy.description.modifier.Mandate.MANDATED = r1
            net.bytebuddy.description.modifier.Mandate[] r0 = new net.bytebuddy.description.modifier.Mandate[]{r0, r1}
            net.bytebuddy.description.modifier.Mandate.$VALUES = r0
            return
    }

    Mandate(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mask = r3
            return
    }

    public static net.bytebuddy.description.modifier.Mandate valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.description.modifier.Mandate> r0 = net.bytebuddy.description.modifier.Mandate.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.description.modifier.Mandate r1 = (net.bytebuddy.description.modifier.Mandate) r1
            return r1
    }

    public static net.bytebuddy.description.modifier.Mandate[] values() {
            net.bytebuddy.description.modifier.Mandate[] r0 = net.bytebuddy.description.modifier.Mandate.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.description.modifier.Mandate[] r0 = (net.bytebuddy.description.modifier.Mandate[]) r0
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
            r0 = 32768(0x8000, float:4.5918E-41)
            return r0
    }

    @Override // net.bytebuddy.description.modifier.ModifierContributor
    public boolean isDefault() {
            r1 = this;
            net.bytebuddy.description.modifier.Mandate r0 = net.bytebuddy.description.modifier.Mandate.PLAIN
            if (r1 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isMandated() {
            r1 = this;
            net.bytebuddy.description.modifier.Mandate r0 = net.bytebuddy.description.modifier.Mandate.MANDATED
            if (r1 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
