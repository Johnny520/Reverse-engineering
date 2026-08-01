package p078P1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: P1.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1139a {

    /* JADX INFO: renamed from: d */
    public static final EnumC1139a f3774d;

    /* JADX INFO: renamed from: e */
    public static final EnumC1139a f3775e;

    /* JADX INFO: renamed from: f */
    public static final EnumC1139a f3776f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC1139a[] f3777g;

    static {
        EnumC1139a enumC1139a = new EnumC1139a("PREFER_ARGB_8888", 0);
        f3774d = enumC1139a;
        EnumC1139a enumC1139a2 = new EnumC1139a("PREFER_RGB_565", 1);
        f3775e = enumC1139a2;
        f3777g = new EnumC1139a[]{enumC1139a, enumC1139a2};
        f3776f = enumC1139a;
    }

    public static EnumC1139a valueOf(String str) {
        return (EnumC1139a) Enum.valueOf(EnumC1139a.class, str);
    }

    public static EnumC1139a[] values() {
        return (EnumC1139a[]) f3777g.clone();
    }
}
