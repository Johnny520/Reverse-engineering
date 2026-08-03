package p054e0;

/* JADX INFO: renamed from: e0.b */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0768b extends Enum {

    /* JADX INFO: renamed from: a */
    public static final EnumC0768b f2723a = null;

    /* JADX INFO: renamed from: b */
    public static final EnumC0768b f2724b = null;

    /* JADX INFO: renamed from: c */
    public static final EnumC0768b f2725c = null;

    /* JADX INFO: renamed from: d */
    public static final EnumC0768b f2726d = null;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ EnumC0768b[] f2727e = null;

    static {
        EnumC0768b r02 = new EnumC0768b("OK", 0);
        f2723a = r02;
        EnumC0768b r1 = new EnumC0768b("FAIL", 1);
        f2724b = r1;
        EnumC0768b r2 = new EnumC0768b("SKIP", 2);
        f2725c = r2;
        EnumC0768b r3 = new EnumC0768b("PARTIAL", 3);
        f2726d = r3;
        f2727e = new EnumC0768b[]{r02, r1, r2, r3};
    }

    public static EnumC0768b valueOf(String r1) {
        return (EnumC0768b) Enum.valueOf(EnumC0768b.class, r1);
    }

    public static EnumC0768b[] values() {
        return (EnumC0768b[]) f2727e.clone();
    }
}
