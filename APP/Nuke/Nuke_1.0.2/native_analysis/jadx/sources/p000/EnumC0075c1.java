package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: c1 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0075c1 {
    public static final C0039b1 Companion;

    /* JADX INFO: renamed from: h */
    public static final j71 f1099h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0075c1 f1100i;

    /* JADX INFO: renamed from: j */
    public static final EnumC0075c1 f1101j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC0075c1[] f1102k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ yf0 f1103l;

    static {
        EnumC0075c1 enumC0075c1 = new EnumC0075c1("BLACKLIST", 0);
        f1100i = enumC0075c1;
        EnumC0075c1 enumC0075c12 = new EnumC0075c1("WHITELIST", 1);
        f1101j = enumC0075c12;
        EnumC0075c1[] enumC0075c1Arr = {enumC0075c1, enumC0075c12};
        f1102k = enumC0075c1Arr;
        f1103l = new yf0(enumC0075c1Arr);
        Companion = new C0039b1();
        f1099h = AbstractC0570p7.m3746B(i91.f4497h, new C0074c0(2));
    }

    public static EnumC0075c1 valueOf(String str) {
        return (EnumC0075c1) Enum.valueOf(EnumC0075c1.class, str);
    }

    public static EnumC0075c1[] values() {
        return (EnumC0075c1[]) f1102k.clone();
    }
}
