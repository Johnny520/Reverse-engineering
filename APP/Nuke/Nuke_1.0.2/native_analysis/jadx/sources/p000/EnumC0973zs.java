package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: zs */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0973zs {

    /* JADX INFO: renamed from: h */
    public static final EnumC0973zs f14080h;

    /* JADX INFO: renamed from: i */
    public static final EnumC0973zs f14081i;

    /* JADX INFO: renamed from: j */
    public static final EnumC0973zs f14082j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC0973zs[] f14083k;

    static {
        EnumC0973zs enumC0973zs = new EnumC0973zs("NONE", 0);
        f14080h = enumC0973zs;
        EnumC0973zs enumC0973zs2 = new EnumC0973zs("ALL_JSON_OBJECTS", 1);
        f14081i = enumC0973zs2;
        EnumC0973zs enumC0973zs3 = new EnumC0973zs("POLYMORPHIC", 2);
        f14082j = enumC0973zs3;
        f14083k = new EnumC0973zs[]{enumC0973zs, enumC0973zs2, enumC0973zs3};
    }

    public static EnumC0973zs valueOf(String str) {
        return (EnumC0973zs) Enum.valueOf(EnumC0973zs.class, str);
    }

    public static EnumC0973zs[] values() {
        return (EnumC0973zs[]) f14083k.clone();
    }
}
