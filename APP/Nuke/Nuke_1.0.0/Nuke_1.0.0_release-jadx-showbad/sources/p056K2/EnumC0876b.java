package p056K2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: K2.b */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0876b {

    /* JADX INFO: renamed from: d */
    public static final EnumC0876b f2764d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ EnumC0876b[] f2765e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0876b enumC0876b = new EnumC0876b("WARNING", 0);
        f2764d = enumC0876b;
        f2765e = new EnumC0876b[]{enumC0876b, new EnumC0876b("ERROR", 1), new EnumC0876b("HIDDEN", 2)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0876b valueOf(String str) {
        return (EnumC0876b) Enum.valueOf(EnumC0876b.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0876b[] values() {
        return (EnumC0876b[]) f2765e.clone();
    }
}
