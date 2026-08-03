package net.bytebuddy.dynamic.scaffold;

/* JADX INFO: loaded from: classes2.dex */
public enum TypeValidation extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.TypeValidation> {
    private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeValidation[] $VALUES = null;
    public static final net.bytebuddy.dynamic.scaffold.TypeValidation DISABLED = null;
    public static final net.bytebuddy.dynamic.scaffold.TypeValidation ENABLED = null;
    private final boolean enabled;

    static {
            net.bytebuddy.dynamic.scaffold.TypeValidation r0 = new net.bytebuddy.dynamic.scaffold.TypeValidation
            java.lang.String r1 = "ENABLED"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            net.bytebuddy.dynamic.scaffold.TypeValidation.ENABLED = r0
            net.bytebuddy.dynamic.scaffold.TypeValidation r1 = new net.bytebuddy.dynamic.scaffold.TypeValidation
            java.lang.String r4 = "DISABLED"
            r1.<init>(r4, r3, r2)
            net.bytebuddy.dynamic.scaffold.TypeValidation.DISABLED = r1
            net.bytebuddy.dynamic.scaffold.TypeValidation[] r0 = new net.bytebuddy.dynamic.scaffold.TypeValidation[]{r0, r1}
            net.bytebuddy.dynamic.scaffold.TypeValidation.$VALUES = r0
            return
    }

    TypeValidation(java.lang.String r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.enabled = r3
            return
    }

    public static net.bytebuddy.dynamic.scaffold.TypeValidation of(boolean r0) {
            if (r0 == 0) goto L5
            net.bytebuddy.dynamic.scaffold.TypeValidation r0 = net.bytebuddy.dynamic.scaffold.TypeValidation.ENABLED
            goto L7
        L5:
            net.bytebuddy.dynamic.scaffold.TypeValidation r0 = net.bytebuddy.dynamic.scaffold.TypeValidation.DISABLED
        L7:
            return r0
    }

    public static net.bytebuddy.dynamic.scaffold.TypeValidation valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.dynamic.scaffold.TypeValidation> r0 = net.bytebuddy.dynamic.scaffold.TypeValidation.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.dynamic.scaffold.TypeValidation r1 = (net.bytebuddy.dynamic.scaffold.TypeValidation) r1
            return r1
    }

    public static net.bytebuddy.dynamic.scaffold.TypeValidation[] values() {
            net.bytebuddy.dynamic.scaffold.TypeValidation[] r0 = net.bytebuddy.dynamic.scaffold.TypeValidation.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.dynamic.scaffold.TypeValidation[] r0 = (net.bytebuddy.dynamic.scaffold.TypeValidation[]) r0
            return r0
    }

    public boolean isEnabled() {
            r1 = this;
            boolean r0 = r1.enabled
            return r0
    }
}
