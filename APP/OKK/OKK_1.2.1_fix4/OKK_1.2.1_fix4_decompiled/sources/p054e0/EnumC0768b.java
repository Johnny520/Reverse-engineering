package p054e0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: e0.b */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0768b {

    /* JADX INFO: renamed from: a */
    public static final EnumC0768b f2723a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0768b f2724b;

    /* JADX INFO: renamed from: c */
    public static final EnumC0768b f2725c;

    /* JADX INFO: renamed from: d */
    public static final EnumC0768b f2726d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ EnumC0768b[] f2727e;

    static {
        EnumC0768b enumC0768b = new EnumC0768b("OK", 0);
        f2723a = enumC0768b;
        EnumC0768b enumC0768b2 = new EnumC0768b("FAIL", 1);
        f2724b = enumC0768b2;
        EnumC0768b enumC0768b3 = new EnumC0768b("SKIP", 2);
        f2725c = enumC0768b3;
        EnumC0768b enumC0768b4 = new EnumC0768b("PARTIAL", 3);
        f2726d = enumC0768b4;
        f2727e = new EnumC0768b[]{enumC0768b, enumC0768b2, enumC0768b3, enumC0768b4};
    }

    public static EnumC0768b valueOf(String str) {
        return (EnumC0768b) Enum.valueOf(EnumC0768b.class, str);
    }

    public static EnumC0768b[] values() {
        return (EnumC0768b[]) f2727e.clone();
    }
}
