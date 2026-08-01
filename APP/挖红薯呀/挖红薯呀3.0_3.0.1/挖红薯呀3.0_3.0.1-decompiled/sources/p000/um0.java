package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class um0 {

    /* JADX INFO: renamed from: d */
    public static final um0 f6264d;

    /* JADX INFO: renamed from: e */
    public static final um0 f6265e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ um0[] f6266f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        um0 um0Var = new um0("Vertical", 0);
        f6264d = um0Var;
        um0 um0Var2 = new um0("Horizontal", 1);
        f6265e = um0Var2;
        f6266f = new um0[]{um0Var, um0Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static um0 valueOf(String str) {
        return (um0) Enum.valueOf(um0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static um0[] values() {
        return (um0[]) f6266f.clone();
    }
}
