package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class n30 {

    /* JADX INFO: renamed from: d */
    public static final n30 f4170d;

    /* JADX INFO: renamed from: e */
    public static final n30 f4171e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ n30[] f4172f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        n30 n30Var = new n30("Width", 0);
        f4170d = n30Var;
        n30 n30Var2 = new n30("Height", 1);
        f4171e = n30Var2;
        f4172f = new n30[]{n30Var, n30Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static n30 valueOf(String str) {
        return (n30) Enum.valueOf(n30.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static n30[] values() {
        return (n30[]) f4172f.clone();
    }
}
