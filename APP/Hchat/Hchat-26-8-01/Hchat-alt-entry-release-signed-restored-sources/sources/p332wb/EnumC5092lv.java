package p332wb;

import p136j8.AbstractC2091b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wb.lv */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5092lv {

    /* JADX INFO: renamed from: g */
    public static final C5491y2 f18821g;

    /* JADX INFO: renamed from: h */
    public static final EnumC5092lv f18822h;

    /* JADX INFO: renamed from: i */
    public static final EnumC5092lv f18823i;

    /* JADX INFO: renamed from: j */
    public static final EnumC5092lv f18824j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC5092lv[] f18825k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC5092lv enumC5092lv = new EnumC5092lv("TOP", 0);
        f18822h = enumC5092lv;
        EnumC5092lv enumC5092lv2 = new EnumC5092lv("CENTER", 1);
        f18823i = enumC5092lv2;
        EnumC5092lv enumC5092lv3 = new EnumC5092lv("BOTTOM", 2);
        f18824j = enumC5092lv3;
        f18825k = new EnumC5092lv[]{enumC5092lv, enumC5092lv2, enumC5092lv3};
        f18821g = new C5491y2(9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5092lv valueOf(String str) {
        return (EnumC5092lv) AbstractC2091b.m5160g(EnumC5092lv.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5092lv[] values() {
        return (EnumC5092lv[]) f18825k.clone();
    }
}
