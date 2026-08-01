package p198m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: m0.b */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2571b {

    /* JADX INFO: renamed from: d */
    public static final EnumC2571b f8203d;

    /* JADX INFO: renamed from: e */
    public static final EnumC2571b f8204e;

    /* JADX INFO: renamed from: f */
    public static final EnumC2571b f8205f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC2571b[] f8206g;

    static {
        EnumC2571b enumC2571b = new EnumC2571b("None", 0);
        f8203d = enumC2571b;
        EnumC2571b enumC2571b2 = new EnumC2571b("Cancelled", 1);
        f8204e = enumC2571b2;
        EnumC2571b enumC2571b3 = new EnumC2571b("Redirected", 2);
        f8205f = enumC2571b3;
        f8206g = new EnumC2571b[]{enumC2571b, enumC2571b2, enumC2571b3, new EnumC2571b("RedirectCancelled", 3)};
    }

    public static EnumC2571b valueOf(String str) {
        return (EnumC2571b) Enum.valueOf(EnumC2571b.class, str);
    }

    public static EnumC2571b[] values() {
        return (EnumC2571b[]) f8206g.clone();
    }
}
