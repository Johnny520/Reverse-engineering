package p203n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: n.g */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2655g {

    /* JADX INFO: renamed from: d */
    public static final EnumC2655g f8462d;

    /* JADX INFO: renamed from: e */
    public static final EnumC2655g f8463e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC2655g[] f8464f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC2655g enumC2655g = new EnumC2655g("BoundReached", 0);
        f8462d = enumC2655g;
        EnumC2655g enumC2655g2 = new EnumC2655g("Finished", 1);
        f8463e = enumC2655g2;
        f8464f = new EnumC2655g[]{enumC2655g, enumC2655g2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2655g valueOf(String str) {
        return (EnumC2655g) Enum.valueOf(EnumC2655g.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC2655g[] values() {
        return (EnumC2655g[]) f8464f.clone();
    }
}
