package p000a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a.B2 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0022B2 {

    /* JADX INFO: renamed from: a */
    public static final EnumC0022B2 f66a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC0022B2[] f67b;

    static {
        EnumC0022B2 enumC0022B2 = new EnumC0022B2("NORMAL", 0);
        f66a = enumC0022B2;
        f67b = new EnumC0022B2[]{enumC0022B2, new EnumC0022B2("BYPASS", 1), new EnumC0022B2("FORCE_RESCAN", 2)};
    }

    public EnumC0022B2() {
        throw null;
    }

    public static EnumC0022B2 valueOf(String str) {
        return (EnumC0022B2) Enum.valueOf(EnumC0022B2.class, str);
    }

    public static EnumC0022B2[] values() {
        return (EnumC0022B2[]) f67b.clone();
    }
}
