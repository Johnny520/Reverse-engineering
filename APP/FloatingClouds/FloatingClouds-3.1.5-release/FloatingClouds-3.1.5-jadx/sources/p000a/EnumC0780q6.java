package p000a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a.q6 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0780q6 {

    /* JADX INFO: renamed from: a */
    public static final EnumC0780q6 f3074a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0780q6 f3075b;

    /* JADX INFO: renamed from: c */
    public static final EnumC0780q6 f3076c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumC0780q6[] f3077d;

    static {
        EnumC0780q6 enumC0780q6 = new EnumC0780q6("ACTIVE", 0);
        f3074a = enumC0780q6;
        EnumC0780q6 enumC0780q62 = new EnumC0780q6("ISOLATED", 1);
        f3075b = enumC0780q62;
        EnumC0780q6 enumC0780q63 = new EnumC0780q6("DISABLED", 2);
        f3076c = enumC0780q63;
        f3077d = new EnumC0780q6[]{enumC0780q6, enumC0780q62, enumC0780q63};
    }

    public EnumC0780q6() {
        throw null;
    }

    public static EnumC0780q6 valueOf(String str) {
        return (EnumC0780q6) Enum.valueOf(EnumC0780q6.class, str);
    }

    public static EnumC0780q6[] values() {
        return (EnumC0780q6[]) f3077d.clone();
    }
}
