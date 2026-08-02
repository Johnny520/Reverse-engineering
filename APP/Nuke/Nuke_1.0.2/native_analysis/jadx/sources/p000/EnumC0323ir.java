package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ir */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0323ir {
    public static final C0287hr Companion;

    /* JADX INFO: renamed from: h */
    public static final j71 f4750h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0323ir f4751i;

    /* JADX INFO: renamed from: j */
    public static final EnumC0323ir f4752j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC0323ir[] f4753k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ yf0 f4754l;

    static {
        EnumC0323ir enumC0323ir = new EnumC0323ir("TEXT", 0);
        f4751i = enumC0323ir;
        EnumC0323ir enumC0323ir2 = new EnumC0323ir("IMAGE", 1);
        EnumC0323ir enumC0323ir3 = new EnumC0323ir("VOICE", 2);
        f4752j = enumC0323ir3;
        EnumC0323ir[] enumC0323irArr = {enumC0323ir, enumC0323ir2, enumC0323ir3};
        f4753k = enumC0323irArr;
        f4754l = new yf0(enumC0323irArr);
        Companion = new C0287hr();
        f4750h = AbstractC0570p7.m3746B(i91.f4497h, new C0074c0(21));
    }

    public static EnumC0323ir valueOf(String str) {
        return (EnumC0323ir) Enum.valueOf(EnumC0323ir.class, str);
    }

    public static EnumC0323ir[] values() {
        return (EnumC0323ir[]) f4753k.clone();
    }
}
