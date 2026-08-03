package p056f0;

import p020K0.C0240a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: f0.Q */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0806Q {

    /* JADX INFO: renamed from: c */
    public static final EnumC0806Q f2921c;

    /* JADX INFO: renamed from: d */
    public static final EnumC0806Q f2922d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0806Q f2923e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC0806Q[] f2924f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ C0240a f2925g;

    /* JADX INFO: renamed from: a */
    public final String f2926a;

    /* JADX INFO: renamed from: b */
    public final String f2927b;

    static {
        EnumC0806Q enumC0806Q = new EnumC0806Q("Features", 0, "功能", "⚡");
        f2921c = enumC0806Q;
        EnumC0806Q enumC0806Q2 = new EnumC0806Q("Diagnostics", 1, "诊断", "🛡");
        f2922d = enumC0806Q2;
        EnumC0806Q enumC0806Q3 = new EnumC0806Q("Settings", 2, "关于", "⚙");
        f2923e = enumC0806Q3;
        EnumC0806Q[] enumC0806QArr = {enumC0806Q, enumC0806Q2, enumC0806Q3};
        f2924f = enumC0806QArr;
        f2925g = new C0240a(enumC0806QArr);
    }

    public EnumC0806Q(String str, int i2, String str2, String str3) {
        this.f2926a = str2;
        this.f2927b = str3;
    }

    public static EnumC0806Q valueOf(String str) {
        return (EnumC0806Q) Enum.valueOf(EnumC0806Q.class, str);
    }

    public static EnumC0806Q[] values() {
        return (EnumC0806Q[]) f2924f.clone();
    }
}
