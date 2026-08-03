package net.bytebuddy.description.modifier;

/* JADX INFO: loaded from: classes2.dex */
public enum FieldManifestation extends java.lang.Enum<net.bytebuddy.description.modifier.FieldManifestation> implements net.bytebuddy.description.modifier.ModifierContributor.ForField {
    private static final /* synthetic */ net.bytebuddy.description.modifier.FieldManifestation[] $VALUES = null;
    public static final net.bytebuddy.description.modifier.FieldManifestation FINAL = null;
    public static final net.bytebuddy.description.modifier.FieldManifestation PLAIN = null;
    public static final net.bytebuddy.description.modifier.FieldManifestation VOLATILE = null;
    private final int mask;

    static {
            net.bytebuddy.description.modifier.FieldManifestation r0 = new net.bytebuddy.description.modifier.FieldManifestation
            java.lang.String r1 = "PLAIN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            net.bytebuddy.description.modifier.FieldManifestation.PLAIN = r0
            net.bytebuddy.description.modifier.FieldManifestation r1 = new net.bytebuddy.description.modifier.FieldManifestation
            r2 = 1
            r3 = 16
            java.lang.String r4 = "FINAL"
            r1.<init>(r4, r2, r3)
            net.bytebuddy.description.modifier.FieldManifestation.FINAL = r1
            net.bytebuddy.description.modifier.FieldManifestation r2 = new net.bytebuddy.description.modifier.FieldManifestation
            r3 = 2
            r4 = 64
            java.lang.String r5 = "VOLATILE"
            r2.<init>(r5, r3, r4)
            net.bytebuddy.description.modifier.FieldManifestation.VOLATILE = r2
            net.bytebuddy.description.modifier.FieldManifestation[] r0 = new net.bytebuddy.description.modifier.FieldManifestation[]{r0, r1, r2}
            net.bytebuddy.description.modifier.FieldManifestation.$VALUES = r0
            return
    }

    FieldManifestation(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mask = r3
            return
    }

    public static net.bytebuddy.description.modifier.FieldManifestation valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.description.modifier.FieldManifestation> r0 = net.bytebuddy.description.modifier.FieldManifestation.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.description.modifier.FieldManifestation r1 = (net.bytebuddy.description.modifier.FieldManifestation) r1
            return r1
    }

    public static net.bytebuddy.description.modifier.FieldManifestation[] values() {
            net.bytebuddy.description.modifier.FieldManifestation[] r0 = net.bytebuddy.description.modifier.FieldManifestation.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.description.modifier.FieldManifestation[] r0 = (net.bytebuddy.description.modifier.FieldManifestation[]) r0
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
            r0 = 80
            return r0
    }

    @Override // net.bytebuddy.description.modifier.ModifierContributor
    public boolean isDefault() {
            r1 = this;
            net.bytebuddy.description.modifier.FieldManifestation r0 = net.bytebuddy.description.modifier.FieldManifestation.PLAIN
            if (r1 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isFinal() {
            r1 = this;
            int r0 = r1.mask
            r0 = r0 & 16
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isPlain() {
            r1 = this;
            boolean r0 = r1.isFinal()
            if (r0 != 0) goto Le
            boolean r0 = r1.isVolatile()
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public boolean isVolatile() {
            r1 = this;
            int r0 = r1.mask
            r0 = r0 & 64
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }
}
