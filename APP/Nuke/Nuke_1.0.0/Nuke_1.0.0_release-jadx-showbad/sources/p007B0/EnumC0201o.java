package p007B0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: B0.o */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0201o {

    /* JADX INFO: renamed from: d */
    public static final EnumC0201o f702d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0201o f703e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0201o f704f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC0201o[] f705g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0201o enumC0201o = new EnumC0201o("Initial", 0);
        f702d = enumC0201o;
        EnumC0201o enumC0201o2 = new EnumC0201o("Main", 1);
        f703e = enumC0201o2;
        EnumC0201o enumC0201o3 = new EnumC0201o("Final", 2);
        f704f = enumC0201o3;
        f705g = new EnumC0201o[]{enumC0201o, enumC0201o2, enumC0201o3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0201o valueOf(String str) {
        return (EnumC0201o) Enum.valueOf(EnumC0201o.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0201o[] values() {
        return (EnumC0201o[]) f705g.clone();
    }
}
