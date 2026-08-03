package p056f0;

import p020K0.C0240a;

/* JADX INFO: renamed from: f0.Q */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0806Q extends Enum {

    /* JADX INFO: renamed from: c */
    public static final EnumC0806Q f2921c = null;

    /* JADX INFO: renamed from: d */
    public static final EnumC0806Q f2922d = null;

    /* JADX INFO: renamed from: e */
    public static final EnumC0806Q f2923e = null;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC0806Q[] f2924f = null;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ C0240a f2925g = null;

    /* JADX INFO: renamed from: a */
    public final String f2926a;

    /* JADX INFO: renamed from: b */
    public final String f2927b;

    static {
        EnumC0806Q r02 = new EnumC0806Q("Features", 0, "功能", "⚡");
        f2921c = r02;
        EnumC0806Q r1 = new EnumC0806Q("Diagnostics", 1, "诊断", "🛡");
        f2922d = r1;
        EnumC0806Q r2 = new EnumC0806Q("Settings", 2, "关于", "⚙");
        f2923e = r2;
        EnumC0806Q[] r03 = {r02, r1, r2};
        f2924f = r03;
        f2925g = new C0240a(r03);
    }

    EnumC0806Q(String r1, int r2, String r3, String r4) {
        this.f2926a = r3;
        this.f2927b = r4;
    }

    public static EnumC0806Q valueOf(String r1) {
        return (EnumC0806Q) Enum.valueOf(EnumC0806Q.class, r1);
    }

    public static EnumC0806Q[] values() {
        return (EnumC0806Q[]) f2924f.clone();
    }
}
