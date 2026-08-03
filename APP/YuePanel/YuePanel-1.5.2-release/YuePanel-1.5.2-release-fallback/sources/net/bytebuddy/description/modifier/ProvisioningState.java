package net.bytebuddy.description.modifier;

/* JADX INFO: loaded from: classes2.dex */
public enum ProvisioningState extends java.lang.Enum<net.bytebuddy.description.modifier.ProvisioningState> implements net.bytebuddy.description.modifier.ModifierContributor.ForParameter {
    private static final /* synthetic */ net.bytebuddy.description.modifier.ProvisioningState[] $VALUES = null;
    public static final net.bytebuddy.description.modifier.ProvisioningState MANDATED = null;
    public static final net.bytebuddy.description.modifier.ProvisioningState PLAIN = null;
    private final int mask;

    static {
            net.bytebuddy.description.modifier.ProvisioningState r0 = new net.bytebuddy.description.modifier.ProvisioningState
            java.lang.String r1 = "PLAIN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            net.bytebuddy.description.modifier.ProvisioningState.PLAIN = r0
            net.bytebuddy.description.modifier.ProvisioningState r1 = new net.bytebuddy.description.modifier.ProvisioningState
            r2 = 1
            r3 = 32768(0x8000, float:4.5918E-41)
            java.lang.String r4 = "MANDATED"
            r1.<init>(r4, r2, r3)
            net.bytebuddy.description.modifier.ProvisioningState.MANDATED = r1
            net.bytebuddy.description.modifier.ProvisioningState[] r0 = new net.bytebuddy.description.modifier.ProvisioningState[]{r0, r1}
            net.bytebuddy.description.modifier.ProvisioningState.$VALUES = r0
            return
    }

    ProvisioningState(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mask = r3
            return
    }

    public static net.bytebuddy.description.modifier.ProvisioningState valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.description.modifier.ProvisioningState> r0 = net.bytebuddy.description.modifier.ProvisioningState.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.description.modifier.ProvisioningState r1 = (net.bytebuddy.description.modifier.ProvisioningState) r1
            return r1
    }

    public static net.bytebuddy.description.modifier.ProvisioningState[] values() {
            net.bytebuddy.description.modifier.ProvisioningState[] r0 = net.bytebuddy.description.modifier.ProvisioningState.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.description.modifier.ProvisioningState[] r0 = (net.bytebuddy.description.modifier.ProvisioningState[]) r0
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
            net.bytebuddy.description.modifier.ProvisioningState r0 = net.bytebuddy.description.modifier.ProvisioningState.PLAIN
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
            net.bytebuddy.description.modifier.ProvisioningState r0 = net.bytebuddy.description.modifier.ProvisioningState.MANDATED
            if (r1 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
