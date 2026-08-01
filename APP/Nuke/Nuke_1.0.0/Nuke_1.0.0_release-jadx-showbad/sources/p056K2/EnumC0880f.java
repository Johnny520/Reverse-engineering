package p056K2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: K2.f */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0880f {

    /* JADX INFO: renamed from: d */
    public static final EnumC0880f f2766d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0880f f2767e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC0880f[] f2768f;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0880f EF0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0880f enumC0880f = new EnumC0880f("SYNCHRONIZED", 0);
        EnumC0880f enumC0880f2 = new EnumC0880f("PUBLICATION", 1);
        f2766d = enumC0880f2;
        EnumC0880f enumC0880f3 = new EnumC0880f("NONE", 2);
        f2767e = enumC0880f3;
        f2768f = new EnumC0880f[]{enumC0880f, enumC0880f2, enumC0880f3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0880f valueOf(String str) {
        return (EnumC0880f) Enum.valueOf(EnumC0880f.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0880f[] values() {
        return (EnumC0880f[]) f2768f.clone();
    }
}
