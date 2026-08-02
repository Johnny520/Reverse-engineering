package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gr */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0250gr {
    public static final C0213fr Companion;

    /* JADX INFO: renamed from: h */
    public static final j71 f3669h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0250gr f3670i;

    /* JADX INFO: renamed from: j */
    public static final EnumC0250gr f3671j;

    /* JADX INFO: renamed from: k */
    public static final EnumC0250gr f3672k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ EnumC0250gr[] f3673l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ yf0 f3674m;

    static {
        EnumC0250gr enumC0250gr = new EnumC0250gr("CONTAINS", 0);
        f3670i = enumC0250gr;
        EnumC0250gr enumC0250gr2 = new EnumC0250gr("EXACT", 1);
        f3671j = enumC0250gr2;
        EnumC0250gr enumC0250gr3 = new EnumC0250gr("REGEX", 2);
        f3672k = enumC0250gr3;
        EnumC0250gr[] enumC0250grArr = {enumC0250gr, enumC0250gr2, enumC0250gr3};
        f3673l = enumC0250grArr;
        f3674m = new yf0(enumC0250grArr);
        Companion = new C0213fr();
        f3669h = AbstractC0570p7.m3746B(i91.f4497h, new C0074c0(20));
    }

    public static EnumC0250gr valueOf(String str) {
        return (EnumC0250gr) Enum.valueOf(EnumC0250gr.class, str);
    }

    public static EnumC0250gr[] values() {
        return (EnumC0250gr[]) f3673l.clone();
    }
}
