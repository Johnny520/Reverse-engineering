package net.bytebuddy.description.modifier;

/* JADX INFO: loaded from: classes2.dex */
public enum FieldPersistence extends java.lang.Enum<net.bytebuddy.description.modifier.FieldPersistence> implements net.bytebuddy.description.modifier.ModifierContributor.ForField {
    private static final /* synthetic */ net.bytebuddy.description.modifier.FieldPersistence[] $VALUES = null;
    public static final net.bytebuddy.description.modifier.FieldPersistence PLAIN = null;
    public static final net.bytebuddy.description.modifier.FieldPersistence TRANSIENT = null;
    private final int mask;

    static {
            net.bytebuddy.description.modifier.FieldPersistence r0 = new net.bytebuddy.description.modifier.FieldPersistence
            java.lang.String r1 = "PLAIN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            net.bytebuddy.description.modifier.FieldPersistence.PLAIN = r0
            net.bytebuddy.description.modifier.FieldPersistence r1 = new net.bytebuddy.description.modifier.FieldPersistence
            r2 = 1
            r3 = 128(0x80, float:1.8E-43)
            java.lang.String r4 = "TRANSIENT"
            r1.<init>(r4, r2, r3)
            net.bytebuddy.description.modifier.FieldPersistence.TRANSIENT = r1
            net.bytebuddy.description.modifier.FieldPersistence[] r0 = new net.bytebuddy.description.modifier.FieldPersistence[]{r0, r1}
            net.bytebuddy.description.modifier.FieldPersistence.$VALUES = r0
            return
    }

    FieldPersistence(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mask = r3
            return
    }

    public static net.bytebuddy.description.modifier.FieldPersistence valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.description.modifier.FieldPersistence> r0 = net.bytebuddy.description.modifier.FieldPersistence.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.description.modifier.FieldPersistence r1 = (net.bytebuddy.description.modifier.FieldPersistence) r1
            return r1
    }

    public static net.bytebuddy.description.modifier.FieldPersistence[] values() {
            net.bytebuddy.description.modifier.FieldPersistence[] r0 = net.bytebuddy.description.modifier.FieldPersistence.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.description.modifier.FieldPersistence[] r0 = (net.bytebuddy.description.modifier.FieldPersistence[]) r0
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
            r0 = 128(0x80, float:1.8E-43)
            return r0
    }

    @Override // net.bytebuddy.description.modifier.ModifierContributor
    public boolean isDefault() {
            r1 = this;
            net.bytebuddy.description.modifier.FieldPersistence r0 = net.bytebuddy.description.modifier.FieldPersistence.PLAIN
            if (r1 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isTransient() {
            r1 = this;
            int r0 = r1.mask
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }
}
