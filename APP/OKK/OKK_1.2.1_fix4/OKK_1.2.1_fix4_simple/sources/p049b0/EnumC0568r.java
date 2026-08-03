package p049b0;

/* JADX INFO: renamed from: b0.r */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0568r extends Enum {

    /* JADX INFO: renamed from: a */
    public static final EnumC0568r f1679a = null;

    /* JADX INFO: renamed from: b */
    public static final EnumC0568r f1680b = null;

    /* JADX INFO: renamed from: c */
    public static final EnumC0568r f1681c = null;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumC0568r[] f1682d = null;

    static {
        EnumC0568r r02 = new EnumC0568r("CN", 0);
        f1679a = r02;
        EnumC0568r r1 = new EnumC0568r("PLAY", 1);
        f1680b = r1;
        EnumC0568r r2 = new EnumC0568r("UNKNOWN", 2);
        f1681c = r2;
        f1682d = new EnumC0568r[]{r02, r1, r2};
    }

    public static EnumC0568r valueOf(String r1) {
        return (EnumC0568r) Enum.valueOf(EnumC0568r.class, r1);
    }

    public static EnumC0568r[] values() {
        return (EnumC0568r[]) f1682d.clone();
    }
}
