package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class mz0 {

    /* JADX INFO: renamed from: d */
    public static final mz0 f4088d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ mz0[] f4089e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        mz0 mz0Var = new mz0("Inherit", 0);
        f4088d = mz0Var;
        f4089e = new mz0[]{mz0Var, new mz0("SecureOn", 1), new mz0("SecureOff", 2)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static mz0 valueOf(String str) {
        return (mz0) Enum.valueOf(mz0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static mz0[] values() {
        return (mz0[]) f4089e.clone();
    }
}
