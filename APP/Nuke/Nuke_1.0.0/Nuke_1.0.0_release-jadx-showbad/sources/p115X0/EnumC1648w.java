package p115X0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X0.w */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1648w {

    /* JADX INFO: renamed from: d */
    public static final EnumC1648w f5655d;

    /* JADX INFO: renamed from: e */
    public static final EnumC1648w f5656e;

    /* JADX INFO: renamed from: f */
    public static final EnumC1648w f5657f;

    /* JADX INFO: renamed from: g */
    public static final EnumC1648w f5658g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC1648w[] f5659h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1648w enumC1648w = new EnumC1648w("StartInput", 0);
        f5655d = enumC1648w;
        EnumC1648w enumC1648w2 = new EnumC1648w("StopInput", 1);
        f5656e = enumC1648w2;
        EnumC1648w enumC1648w3 = new EnumC1648w("ShowKeyboard", 2);
        f5657f = enumC1648w3;
        EnumC1648w enumC1648w4 = new EnumC1648w("HideKeyboard", 3);
        f5658g = enumC1648w4;
        f5659h = new EnumC1648w[]{enumC1648w, enumC1648w2, enumC1648w3, enumC1648w4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1648w valueOf(String str) {
        return (EnumC1648w) Enum.valueOf(EnumC1648w.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1648w[] values() {
        return (EnumC1648w[]) f5659h.clone();
    }
}
