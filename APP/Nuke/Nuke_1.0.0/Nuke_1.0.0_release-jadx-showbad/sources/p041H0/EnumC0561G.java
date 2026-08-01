package p041H0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: H0.G */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0561G {

    /* JADX INFO: renamed from: d */
    public static final EnumC0561G f1682d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0561G f1683e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0561G f1684f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC0561G[] f1685g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0561G enumC0561G = new EnumC0561G("InMeasureBlock", 0);
        f1682d = enumC0561G;
        EnumC0561G enumC0561G2 = new EnumC0561G("InLayoutBlock", 1);
        f1683e = enumC0561G2;
        EnumC0561G enumC0561G3 = new EnumC0561G("NotUsed", 2);
        f1684f = enumC0561G3;
        f1685g = new EnumC0561G[]{enumC0561G, enumC0561G2, enumC0561G3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0561G valueOf(String str) {
        return (EnumC0561G) Enum.valueOf(EnumC0561G.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0561G[] values() {
        return (EnumC0561G[]) f1685g.clone();
    }
}
