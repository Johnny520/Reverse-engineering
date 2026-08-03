package p117i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: i0.m1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1857m1 {

    /* JADX INFO: renamed from: g */
    public static final EnumC1857m1 f6176g;

    /* JADX INFO: renamed from: h */
    public static final EnumC1857m1 f6177h;

    /* JADX INFO: renamed from: i */
    public static final EnumC1857m1 f6178i;

    /* JADX INFO: renamed from: j */
    public static final EnumC1857m1 f6179j;

    /* JADX INFO: renamed from: k */
    public static final EnumC1857m1 f6180k;

    /* JADX INFO: renamed from: l */
    public static final EnumC1857m1 f6181l;

    /* JADX INFO: renamed from: m */
    public static final EnumC1857m1 f6182m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ EnumC1857m1[] f6183n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1857m1 enumC1857m1 = new EnumC1857m1("Invalid", 0);
        f6176g = enumC1857m1;
        EnumC1857m1 enumC1857m12 = new EnumC1857m1("Cancelled", 1);
        f6177h = enumC1857m12;
        EnumC1857m1 enumC1857m13 = new EnumC1857m1("InitialPending", 2);
        f6178i = enumC1857m13;
        EnumC1857m1 enumC1857m14 = new EnumC1857m1("RecomposePending", 3);
        f6179j = enumC1857m14;
        EnumC1857m1 enumC1857m15 = new EnumC1857m1("Recomposing", 4);
        f6180k = enumC1857m15;
        EnumC1857m1 enumC1857m16 = new EnumC1857m1("ApplyPending", 5);
        f6181l = enumC1857m16;
        EnumC1857m1 enumC1857m17 = new EnumC1857m1("Applied", 6);
        f6182m = enumC1857m17;
        f6183n = new EnumC1857m1[]{enumC1857m1, enumC1857m12, enumC1857m13, enumC1857m14, enumC1857m15, enumC1857m16, enumC1857m17};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1857m1 valueOf(String str) {
        return (EnumC1857m1) Enum.valueOf(EnumC1857m1.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1857m1[] values() {
        return (EnumC1857m1[]) f6183n.clone();
    }
}
