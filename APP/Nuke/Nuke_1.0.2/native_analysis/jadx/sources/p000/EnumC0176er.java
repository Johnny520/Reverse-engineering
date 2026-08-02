package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: er */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0176er {
    public static final C0139dr Companion;

    /* JADX INFO: renamed from: h */
    public static final j71 f2562h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0176er f2563i;

    /* JADX INFO: renamed from: j */
    public static final EnumC0176er f2564j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC0176er[] f2565k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ yf0 f2566l;

    static {
        EnumC0176er enumC0176er = new EnumC0176er("BLACKLIST", 0);
        f2563i = enumC0176er;
        EnumC0176er enumC0176er2 = new EnumC0176er("WHITELIST", 1);
        f2564j = enumC0176er2;
        EnumC0176er[] enumC0176erArr = {enumC0176er, enumC0176er2};
        f2565k = enumC0176erArr;
        f2566l = new yf0(enumC0176erArr);
        Companion = new C0139dr();
        f2562h = AbstractC0570p7.m3746B(i91.f4497h, new C0074c0(19));
    }

    public static EnumC0176er valueOf(String str) {
        return (EnumC0176er) Enum.valueOf(EnumC0176er.class, str);
    }

    public static EnumC0176er[] values() {
        return (EnumC0176er[]) f2565k.clone();
    }
}
