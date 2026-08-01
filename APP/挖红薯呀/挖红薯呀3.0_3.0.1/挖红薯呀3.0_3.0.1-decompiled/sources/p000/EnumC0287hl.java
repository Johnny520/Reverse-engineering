package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: hl */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0287hl {

    /* JADX INFO: renamed from: d */
    public static final EnumC0287hl f2282d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0287hl f2283e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0287hl f2284f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC0287hl[] f2285g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0287hl enumC0287hl = new EnumC0287hl("None", 0);
        f2282d = enumC0287hl;
        EnumC0287hl enumC0287hl2 = new EnumC0287hl("Cancelled", 1);
        f2283e = enumC0287hl2;
        EnumC0287hl enumC0287hl3 = new EnumC0287hl("Redirected", 2);
        f2284f = enumC0287hl3;
        f2285g = new EnumC0287hl[]{enumC0287hl, enumC0287hl2, enumC0287hl3, new EnumC0287hl("RedirectCancelled", 3)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0287hl valueOf(String str) {
        return (EnumC0287hl) Enum.valueOf(EnumC0287hl.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0287hl[] values() {
        return (EnumC0287hl[]) f2285g.clone();
    }
}
