package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class eg0 {

    /* JADX INFO: renamed from: d */
    public static final eg0 f1445d;

    /* JADX INFO: renamed from: e */
    public static final eg0 f1446e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ eg0[] f1447f;

    /* JADX INFO: Fake field, exist only in values array */
    eg0 EF0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        eg0 eg0Var = new eg0("DefaultSpatial", 0);
        eg0 eg0Var2 = new eg0("FastSpatial", 1);
        f1445d = eg0Var2;
        eg0 eg0Var3 = new eg0("SlowSpatial", 2);
        eg0 eg0Var4 = new eg0("DefaultEffects", 3);
        f1446e = eg0Var4;
        f1447f = new eg0[]{eg0Var, eg0Var2, eg0Var3, eg0Var4, new eg0("FastEffects", 4), new eg0("SlowEffects", 5)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static eg0 valueOf(String str) {
        return (eg0) Enum.valueOf(eg0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static eg0[] values() {
        return (eg0[]) f1447f.clone();
    }
}
