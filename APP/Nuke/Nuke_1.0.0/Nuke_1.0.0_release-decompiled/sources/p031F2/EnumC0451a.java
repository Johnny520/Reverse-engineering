package p031F2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: F2.a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0451a {

    /* JADX INFO: renamed from: d */
    public static final EnumC0451a f1348d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ EnumC0451a[] f1349e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0451a EF0;

    static {
        EnumC0451a enumC0451a = new EnumC0451a("DEBUG", 0);
        EnumC0451a enumC0451a2 = new EnumC0451a("INFO", 1);
        EnumC0451a enumC0451a3 = new EnumC0451a("WARN", 2);
        f1348d = enumC0451a3;
        f1349e = new EnumC0451a[]{enumC0451a, enumC0451a2, enumC0451a3, new EnumC0451a("ERROR", 3), new EnumC0451a("OFF", 4)};
    }

    public static EnumC0451a valueOf(String str) {
        return (EnumC0451a) Enum.valueOf(EnumC0451a.class, str);
    }

    public static EnumC0451a[] values() {
        return (EnumC0451a[]) f1349e.clone();
    }
}
