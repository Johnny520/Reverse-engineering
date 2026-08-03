package p042W0;

/* JADX INFO: renamed from: W0.h */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0423h extends Enum {

    /* JADX INFO: renamed from: b */
    public static final EnumC0423h f940b = null;

    /* JADX INFO: renamed from: c */
    public static final EnumC0423h f941c = null;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumC0423h[] f942d = null;

    /* JADX INFO: renamed from: a */
    public final int f943a;

    static {
        EnumC0423h r02 = new EnumC0423h(0, 2, "IGNORE_CASE");
        f940b = r02;
        EnumC0423h r1 = new EnumC0423h(1, 8, "MULTILINE");
        EnumC0423h r2 = new EnumC0423h(2, 16, "LITERAL");
        EnumC0423h r3 = new EnumC0423h(3, 1, "UNIX_LINES");
        EnumC0423h r4 = new EnumC0423h(4, 4, "COMMENTS");
        EnumC0423h r5 = new EnumC0423h(5, 32, "DOT_MATCHES_ALL");
        f941c = r5;
        f942d = new EnumC0423h[]{r02, r1, r2, r3, r4, r5, new EnumC0423h(6, 128, "CANON_EQ")};
    }

    EnumC0423h(int r1, int r2, String r3) {
        this.f943a = r2;
    }

    public static EnumC0423h valueOf(String r1) {
        return (EnumC0423h) Enum.valueOf(EnumC0423h.class, r1);
    }

    public static EnumC0423h[] values() {
        return (EnumC0423h[]) f942d.clone();
    }
}
