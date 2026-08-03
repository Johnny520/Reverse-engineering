package p049b0;

/* JADX INFO: renamed from: b0.m */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0563m extends Enum {

    /* JADX INFO: renamed from: a */
    public static final EnumC0563m f1664a = null;

    /* JADX INFO: renamed from: b */
    public static final EnumC0563m f1665b = null;

    /* JADX INFO: renamed from: c */
    public static final EnumC0563m f1666c = null;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumC0563m[] f1667d = null;

    static {
        EnumC0563m r02 = new EnumC0563m("OK", 0);
        f1664a = r02;
        EnumC0563m r1 = new EnumC0563m("PARTIAL", 1);
        f1665b = r1;
        EnumC0563m r2 = new EnumC0563m("FAIL", 2);
        f1666c = r2;
        f1667d = new EnumC0563m[]{r02, r1, r2};
    }

    public static EnumC0563m valueOf(String r1) {
        return (EnumC0563m) Enum.valueOf(EnumC0563m.class, r1);
    }

    public static EnumC0563m[] values() {
        return (EnumC0563m[]) f1667d.clone();
    }
}
