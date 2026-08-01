package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class r90 {

    /* JADX INFO: renamed from: d */
    public static final r90 f5332d;

    /* JADX INFO: renamed from: e */
    public static final r90 f5333e;

    /* JADX INFO: renamed from: f */
    public static final r90 f5334f;

    /* JADX INFO: renamed from: g */
    public static final r90 f5335g;

    /* JADX INFO: renamed from: h */
    public static final r90 f5336h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ r90[] f5337i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        r90 r90Var = new r90("DESTROYED", 0);
        f5332d = r90Var;
        r90 r90Var2 = new r90("INITIALIZED", 1);
        f5333e = r90Var2;
        r90 r90Var3 = new r90("CREATED", 2);
        f5334f = r90Var3;
        r90 r90Var4 = new r90("STARTED", 3);
        f5335g = r90Var4;
        r90 r90Var5 = new r90("RESUMED", 4);
        f5336h = r90Var5;
        f5337i = new r90[]{r90Var, r90Var2, r90Var3, r90Var4, r90Var5};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static r90 valueOf(String str) {
        return (r90) Enum.valueOf(r90.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static r90[] values() {
        return (r90[]) f5337i.clone();
    }
}
