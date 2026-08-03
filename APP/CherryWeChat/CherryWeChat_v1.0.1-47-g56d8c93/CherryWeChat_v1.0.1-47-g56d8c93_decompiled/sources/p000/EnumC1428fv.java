package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: fv */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1428fv {

    /* JADX INFO: renamed from: a */
    public static final EnumC1428fv f5030a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC1428fv[] f5031b;

    static {
        EnumC1428fv enumC1428fv = new EnumC1428fv("ALLOW", 0);
        f5030a = enumC1428fv;
        f5031b = new EnumC1428fv[]{enumC1428fv, new EnumC1428fv("PREVENT_WHEN_EMPTY", 1), new EnumC1428fv("PREVENT", 2)};
    }

    public static EnumC1428fv valueOf(String str) {
        return (EnumC1428fv) Enum.valueOf(EnumC1428fv.class, str);
    }

    public static EnumC1428fv[] values() {
        return (EnumC1428fv[]) f5031b.clone();
    }
}
