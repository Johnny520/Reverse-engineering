package net.bytebuddy.description.modifier;

/* JADX INFO: loaded from: classes2.dex */
public enum MethodManifestation extends java.lang.Enum<net.bytebuddy.description.modifier.MethodManifestation> implements net.bytebuddy.description.modifier.ModifierContributor.ForMethod {
    private static final /* synthetic */ net.bytebuddy.description.modifier.MethodManifestation[] $VALUES = null;
    public static final net.bytebuddy.description.modifier.MethodManifestation ABSTRACT = null;
    public static final net.bytebuddy.description.modifier.MethodManifestation BRIDGE = null;
    public static final net.bytebuddy.description.modifier.MethodManifestation FINAL = null;
    public static final net.bytebuddy.description.modifier.MethodManifestation FINAL_BRIDGE = null;
    public static final net.bytebuddy.description.modifier.MethodManifestation FINAL_NATIVE = null;
    public static final net.bytebuddy.description.modifier.MethodManifestation NATIVE = null;
    public static final net.bytebuddy.description.modifier.MethodManifestation PLAIN = null;
    private final int mask;

    static {
            net.bytebuddy.description.modifier.MethodManifestation r0 = new net.bytebuddy.description.modifier.MethodManifestation
            java.lang.String r1 = "PLAIN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            net.bytebuddy.description.modifier.MethodManifestation.PLAIN = r0
            net.bytebuddy.description.modifier.MethodManifestation r1 = new net.bytebuddy.description.modifier.MethodManifestation
            r2 = 1
            r3 = 256(0x100, float:3.59E-43)
            java.lang.String r4 = "NATIVE"
            r1.<init>(r4, r2, r3)
            net.bytebuddy.description.modifier.MethodManifestation.NATIVE = r1
            net.bytebuddy.description.modifier.MethodManifestation r2 = new net.bytebuddy.description.modifier.MethodManifestation
            r3 = 2
            r4 = 1024(0x400, float:1.435E-42)
            java.lang.String r5 = "ABSTRACT"
            r2.<init>(r5, r3, r4)
            net.bytebuddy.description.modifier.MethodManifestation.ABSTRACT = r2
            net.bytebuddy.description.modifier.MethodManifestation r3 = new net.bytebuddy.description.modifier.MethodManifestation
            r4 = 3
            r5 = 16
            java.lang.String r6 = "FINAL"
            r3.<init>(r6, r4, r5)
            net.bytebuddy.description.modifier.MethodManifestation.FINAL = r3
            net.bytebuddy.description.modifier.MethodManifestation r4 = new net.bytebuddy.description.modifier.MethodManifestation
            r5 = 4
            r6 = 272(0x110, float:3.81E-43)
            java.lang.String r7 = "FINAL_NATIVE"
            r4.<init>(r7, r5, r6)
            net.bytebuddy.description.modifier.MethodManifestation.FINAL_NATIVE = r4
            net.bytebuddy.description.modifier.MethodManifestation r5 = new net.bytebuddy.description.modifier.MethodManifestation
            r6 = 5
            r7 = 64
            java.lang.String r8 = "BRIDGE"
            r5.<init>(r8, r6, r7)
            net.bytebuddy.description.modifier.MethodManifestation.BRIDGE = r5
            net.bytebuddy.description.modifier.MethodManifestation r6 = new net.bytebuddy.description.modifier.MethodManifestation
            r7 = 6
            r8 = 80
            java.lang.String r9 = "FINAL_BRIDGE"
            r6.<init>(r9, r7, r8)
            net.bytebuddy.description.modifier.MethodManifestation.FINAL_BRIDGE = r6
            net.bytebuddy.description.modifier.MethodManifestation[] r0 = new net.bytebuddy.description.modifier.MethodManifestation[]{r0, r1, r2, r3, r4, r5, r6}
            net.bytebuddy.description.modifier.MethodManifestation.$VALUES = r0
            return
    }

    MethodManifestation(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mask = r3
            return
    }

    public static net.bytebuddy.description.modifier.MethodManifestation valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.description.modifier.MethodManifestation> r0 = net.bytebuddy.description.modifier.MethodManifestation.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.description.modifier.MethodManifestation r1 = (net.bytebuddy.description.modifier.MethodManifestation) r1
            return r1
    }

    public static net.bytebuddy.description.modifier.MethodManifestation[] values() {
            net.bytebuddy.description.modifier.MethodManifestation[] r0 = net.bytebuddy.description.modifier.MethodManifestation.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.description.modifier.MethodManifestation[] r0 = (net.bytebuddy.description.modifier.MethodManifestation[]) r0
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
            r0 = 1360(0x550, float:1.906E-42)
            return r0
    }

    public boolean isAbstract() {
            r1 = this;
            int r0 = r1.mask
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isBridge() {
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

    @Override // net.bytebuddy.description.modifier.ModifierContributor
    public boolean isDefault() {
            r1 = this;
            net.bytebuddy.description.modifier.MethodManifestation r0 = net.bytebuddy.description.modifier.MethodManifestation.PLAIN
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

    public boolean isNative() {
            r1 = this;
            int r0 = r1.mask
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }
}
