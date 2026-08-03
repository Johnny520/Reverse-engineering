package net.bytebuddy.description.modifier;

/* JADX INFO: loaded from: classes2.dex */
public enum SyntheticState extends java.lang.Enum<net.bytebuddy.description.modifier.SyntheticState> implements net.bytebuddy.description.modifier.ModifierContributor.ForType, net.bytebuddy.description.modifier.ModifierContributor.ForMethod, net.bytebuddy.description.modifier.ModifierContributor.ForField, net.bytebuddy.description.modifier.ModifierContributor.ForParameter {
    private static final /* synthetic */ net.bytebuddy.description.modifier.SyntheticState[] $VALUES = null;
    public static final net.bytebuddy.description.modifier.SyntheticState PLAIN = null;
    public static final net.bytebuddy.description.modifier.SyntheticState SYNTHETIC = null;
    private final int mask;

    static {
            net.bytebuddy.description.modifier.SyntheticState r0 = new net.bytebuddy.description.modifier.SyntheticState
            java.lang.String r1 = "PLAIN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            net.bytebuddy.description.modifier.SyntheticState.PLAIN = r0
            net.bytebuddy.description.modifier.SyntheticState r1 = new net.bytebuddy.description.modifier.SyntheticState
            r2 = 1
            r3 = 4096(0x1000, float:5.74E-42)
            java.lang.String r4 = "SYNTHETIC"
            r1.<init>(r4, r2, r3)
            net.bytebuddy.description.modifier.SyntheticState.SYNTHETIC = r1
            net.bytebuddy.description.modifier.SyntheticState[] r0 = new net.bytebuddy.description.modifier.SyntheticState[]{r0, r1}
            net.bytebuddy.description.modifier.SyntheticState.$VALUES = r0
            return
    }

    SyntheticState(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mask = r3
            return
    }

    public static net.bytebuddy.description.modifier.SyntheticState valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.description.modifier.SyntheticState> r0 = net.bytebuddy.description.modifier.SyntheticState.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.description.modifier.SyntheticState r1 = (net.bytebuddy.description.modifier.SyntheticState) r1
            return r1
    }

    public static net.bytebuddy.description.modifier.SyntheticState[] values() {
            net.bytebuddy.description.modifier.SyntheticState[] r0 = net.bytebuddy.description.modifier.SyntheticState.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.description.modifier.SyntheticState[] r0 = (net.bytebuddy.description.modifier.SyntheticState[]) r0
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
            r0 = 4096(0x1000, float:5.74E-42)
            return r0
    }

    @Override // net.bytebuddy.description.modifier.ModifierContributor
    public boolean isDefault() {
            r1 = this;
            net.bytebuddy.description.modifier.SyntheticState r0 = net.bytebuddy.description.modifier.SyntheticState.PLAIN
            if (r1 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isSynthetic() {
            r1 = this;
            net.bytebuddy.description.modifier.SyntheticState r0 = net.bytebuddy.description.modifier.SyntheticState.SYNTHETIC
            if (r1 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
