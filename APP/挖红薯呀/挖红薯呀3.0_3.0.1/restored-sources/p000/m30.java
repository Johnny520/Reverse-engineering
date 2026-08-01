package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class m30 {

    /* JADX INFO: renamed from: d */
    public static final m30 f3798d;

    /* JADX INFO: renamed from: e */
    public static final m30 f3799e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ m30[] f3800f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        m30 m30Var = new m30("Min", 0);
        f3798d = m30Var;
        m30 m30Var2 = new m30("Max", 1);
        f3799e = m30Var2;
        f3800f = new m30[]{m30Var, m30Var2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static m30 valueOf(String str) {
        return (m30) Enum.valueOf(m30.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static m30[] values() {
        return (m30[]) f3800f.clone();
    }
}
