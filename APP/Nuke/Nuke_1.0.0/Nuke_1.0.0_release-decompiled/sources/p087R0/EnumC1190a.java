package p087R0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: R0.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1190a {

    /* JADX INFO: renamed from: d */
    public static final EnumC1190a f3906d;

    /* JADX INFO: renamed from: e */
    public static final EnumC1190a f3907e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC1190a[] f3908f;

    static {
        EnumC1190a enumC1190a = new EnumC1190a("On", 0);
        f3906d = enumC1190a;
        EnumC1190a enumC1190a2 = new EnumC1190a("Off", 1);
        f3907e = enumC1190a2;
        f3908f = new EnumC1190a[]{enumC1190a, enumC1190a2, new EnumC1190a("Indeterminate", 2)};
    }

    public static EnumC1190a valueOf(String str) {
        return (EnumC1190a) Enum.valueOf(EnumC1190a.class, str);
    }

    public static EnumC1190a[] values() {
        return (EnumC1190a[]) f3908f.clone();
    }
}
