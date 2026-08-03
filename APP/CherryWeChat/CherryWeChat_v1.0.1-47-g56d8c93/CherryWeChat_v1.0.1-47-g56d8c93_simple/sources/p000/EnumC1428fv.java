package p000;

/* JADX INFO: renamed from: fv */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1428fv extends Enum {

    /* JADX INFO: renamed from: a */
    public static final EnumC1428fv f5030a = null;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC1428fv[] f5031b = null;

    static {
        EnumC1428fv r0 = new EnumC1428fv("ALLOW", 0);
        f5030a = r0;
        f5031b = new EnumC1428fv[]{r0, new EnumC1428fv("PREVENT_WHEN_EMPTY", 1), new EnumC1428fv("PREVENT", 2)};
    }

    public static EnumC1428fv valueOf(String r1) {
        return (EnumC1428fv) Enum.valueOf(EnumC1428fv.class, r1);
    }

    public static EnumC1428fv[] values() {
        return (EnumC1428fv[]) f5031b.clone();
    }
}
