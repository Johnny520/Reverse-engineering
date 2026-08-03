package p332wb;

import p136j8.AbstractC2091b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wb.wv */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5455wv {

    /* JADX INFO: renamed from: g */
    public static final EnumC5455wv f21837g;

    /* JADX INFO: renamed from: h */
    public static final EnumC5455wv f21838h;

    /* JADX INFO: renamed from: i */
    public static final EnumC5455wv f21839i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC5455wv[] f21840j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC5455wv enumC5455wv = new EnumC5455wv("TARGETS", 0);
        f21837g = enumC5455wv;
        EnumC5455wv enumC5455wv2 = new EnumC5455wv("EXCLUDED", 1);
        f21838h = enumC5455wv2;
        EnumC5455wv enumC5455wv3 = new EnumC5455wv("DELETE", 2);
        f21839i = enumC5455wv3;
        f21840j = new EnumC5455wv[]{enumC5455wv, enumC5455wv2, enumC5455wv3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5455wv valueOf(String str) {
        return (EnumC5455wv) AbstractC2091b.m5160g(EnumC5455wv.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5455wv[] values() {
        return (EnumC5455wv[]) f21840j.clone();
    }
}
