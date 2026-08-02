package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: hn */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0283hn {

    /* JADX INFO: renamed from: h */
    public static final EnumC0283hn f4084h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0283hn f4085i;

    /* JADX INFO: renamed from: j */
    public static final EnumC0283hn f4086j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC0283hn[] f4087k;

    static {
        EnumC0283hn enumC0283hn = new EnumC0283hn("SUSPEND", 0);
        f4084h = enumC0283hn;
        EnumC0283hn enumC0283hn2 = new EnumC0283hn("DROP_OLDEST", 1);
        f4085i = enumC0283hn2;
        EnumC0283hn enumC0283hn3 = new EnumC0283hn("DROP_LATEST", 2);
        f4086j = enumC0283hn3;
        f4087k = new EnumC0283hn[]{enumC0283hn, enumC0283hn2, enumC0283hn3};
    }

    public static EnumC0283hn valueOf(String str) {
        return (EnumC0283hn) Enum.valueOf(EnumC0283hn.class, str);
    }

    public static EnumC0283hn[] values() {
        return (EnumC0283hn[]) f4087k.clone();
    }
}
