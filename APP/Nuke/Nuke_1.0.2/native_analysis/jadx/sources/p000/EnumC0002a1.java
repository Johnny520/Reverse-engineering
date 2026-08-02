package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: a1 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0002a1 {

    /* JADX INFO: renamed from: h */
    public static final EnumC0002a1 f16h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0002a1 f17i;

    /* JADX INFO: renamed from: j */
    public static final EnumC0002a1 f18j;

    /* JADX INFO: renamed from: k */
    public static final EnumC0002a1 f19k;

    /* JADX INFO: renamed from: l */
    public static final EnumC0002a1 f20l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ EnumC0002a1[] f21m;

    static {
        EnumC0002a1 enumC0002a1 = new EnumC0002a1("INVALID_CONFIGURATION", 0);
        f16h = enumC0002a1;
        EnumC0002a1 enumC0002a12 = new EnumC0002a1("NETWORK", 1);
        f17i = enumC0002a12;
        EnumC0002a1 enumC0002a13 = new EnumC0002a1("HTTP", 2);
        f18j = enumC0002a13;
        EnumC0002a1 enumC0002a14 = new EnumC0002a1("INVALID_RESPONSE", 3);
        f19k = enumC0002a14;
        EnumC0002a1 enumC0002a15 = new EnumC0002a1("EMPTY_RESPONSE", 4);
        f20l = enumC0002a15;
        f21m = new EnumC0002a1[]{enumC0002a1, enumC0002a12, enumC0002a13, enumC0002a14, enumC0002a15};
    }

    public static EnumC0002a1 valueOf(String str) {
        return (EnumC0002a1) Enum.valueOf(EnumC0002a1.class, str);
    }

    public static EnumC0002a1[] values() {
        return (EnumC0002a1[]) f21m.clone();
    }
}
