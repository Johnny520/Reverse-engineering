package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: s7 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0684s7 {

    /* JADX INFO: renamed from: h */
    public static final EnumC0684s7 f9949h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0684s7 f9950i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC0684s7[] f9951j;

    static {
        EnumC0684s7 enumC0684s7 = new EnumC0684s7("SHOW_ORIGINAL", 0);
        f9949h = enumC0684s7;
        EnumC0684s7 enumC0684s72 = new EnumC0684s7("SHOW_TRANSLATED", 1);
        f9950i = enumC0684s72;
        f9951j = new EnumC0684s7[]{enumC0684s7, enumC0684s72};
    }

    public static EnumC0684s7 valueOf(String str) {
        return (EnumC0684s7) Enum.valueOf(EnumC0684s7.class, str);
    }

    public static EnumC0684s7[] values() {
        return (EnumC0684s7[]) f9951j.clone();
    }
}
