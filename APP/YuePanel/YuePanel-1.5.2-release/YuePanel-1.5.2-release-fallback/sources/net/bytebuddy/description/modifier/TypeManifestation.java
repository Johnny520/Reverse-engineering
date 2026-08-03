package net.bytebuddy.description.modifier;

/* JADX INFO: loaded from: classes2.dex */
public enum TypeManifestation extends java.lang.Enum<net.bytebuddy.description.modifier.TypeManifestation> implements net.bytebuddy.description.modifier.ModifierContributor.ForType {
    private static final /* synthetic */ net.bytebuddy.description.modifier.TypeManifestation[] $VALUES = null;
    public static final net.bytebuddy.description.modifier.TypeManifestation ABSTRACT = null;
    public static final net.bytebuddy.description.modifier.TypeManifestation ANNOTATION = null;
    public static final net.bytebuddy.description.modifier.TypeManifestation FINAL = null;
    public static final net.bytebuddy.description.modifier.TypeManifestation INTERFACE = null;
    public static final net.bytebuddy.description.modifier.TypeManifestation PLAIN = null;
    private final int mask;

    static {
            net.bytebuddy.description.modifier.TypeManifestation r0 = new net.bytebuddy.description.modifier.TypeManifestation
            java.lang.String r1 = "PLAIN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            net.bytebuddy.description.modifier.TypeManifestation.PLAIN = r0
            net.bytebuddy.description.modifier.TypeManifestation r1 = new net.bytebuddy.description.modifier.TypeManifestation
            r2 = 1
            r3 = 16
            java.lang.String r4 = "FINAL"
            r1.<init>(r4, r2, r3)
            net.bytebuddy.description.modifier.TypeManifestation.FINAL = r1
            net.bytebuddy.description.modifier.TypeManifestation r2 = new net.bytebuddy.description.modifier.TypeManifestation
            r3 = 2
            r4 = 1024(0x400, float:1.435E-42)
            java.lang.String r5 = "ABSTRACT"
            r2.<init>(r5, r3, r4)
            net.bytebuddy.description.modifier.TypeManifestation.ABSTRACT = r2
            net.bytebuddy.description.modifier.TypeManifestation r3 = new net.bytebuddy.description.modifier.TypeManifestation
            r4 = 3
            r5 = 1536(0x600, float:2.152E-42)
            java.lang.String r6 = "INTERFACE"
            r3.<init>(r6, r4, r5)
            net.bytebuddy.description.modifier.TypeManifestation.INTERFACE = r3
            net.bytebuddy.description.modifier.TypeManifestation r4 = new net.bytebuddy.description.modifier.TypeManifestation
            r5 = 4
            r6 = 9728(0x2600, float:1.3632E-41)
            java.lang.String r7 = "ANNOTATION"
            r4.<init>(r7, r5, r6)
            net.bytebuddy.description.modifier.TypeManifestation.ANNOTATION = r4
            net.bytebuddy.description.modifier.TypeManifestation[] r0 = new net.bytebuddy.description.modifier.TypeManifestation[]{r0, r1, r2, r3, r4}
            net.bytebuddy.description.modifier.TypeManifestation.$VALUES = r0
            return
    }

    TypeManifestation(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mask = r3
            return
    }

    public static net.bytebuddy.description.modifier.TypeManifestation valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.description.modifier.TypeManifestation> r0 = net.bytebuddy.description.modifier.TypeManifestation.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.description.modifier.TypeManifestation r1 = (net.bytebuddy.description.modifier.TypeManifestation) r1
            return r1
    }

    public static net.bytebuddy.description.modifier.TypeManifestation[] values() {
            net.bytebuddy.description.modifier.TypeManifestation[] r0 = net.bytebuddy.description.modifier.TypeManifestation.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.description.modifier.TypeManifestation[] r0 = (net.bytebuddy.description.modifier.TypeManifestation[]) r0
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
            r0 = 9744(0x2610, float:1.3654E-41)
            return r0
    }

    public boolean isAbstract() {
            r1 = this;
            int r0 = r1.mask
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto Le
            boolean r0 = r1.isInterface()
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public boolean isAnnotation() {
            r1 = this;
            int r0 = r1.mask
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // net.bytebuddy.description.modifier.ModifierContributor
    public boolean isDefault() {
            r1 = this;
            net.bytebuddy.description.modifier.TypeManifestation r0 = net.bytebuddy.description.modifier.TypeManifestation.PLAIN
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

    public boolean isInterface() {
            r1 = this;
            int r0 = r1.mask
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }
}
