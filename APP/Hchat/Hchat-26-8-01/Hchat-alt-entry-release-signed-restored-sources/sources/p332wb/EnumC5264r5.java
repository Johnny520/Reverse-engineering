package p332wb;

import p136j8.AbstractC2091b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: wb.r5 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5264r5 {

    /* JADX INFO: renamed from: g */
    public static final EnumC5264r5 f20335g;

    /* JADX INFO: renamed from: h */
    public static final EnumC5264r5 f20336h;

    /* JADX INFO: renamed from: i */
    public static final EnumC5264r5 f20337i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC5264r5[] f20338j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC5264r5 enumC5264r5 = new EnumC5264r5("PRIVATE", 0);
        f20335g = enumC5264r5;
        EnumC5264r5 enumC5264r52 = new EnumC5264r5("GROUP", 1);
        f20336h = enumC5264r52;
        EnumC5264r5 enumC5264r53 = new EnumC5264r5("OFFICIAL", 2);
        f20337i = enumC5264r53;
        f20338j = new EnumC5264r5[]{enumC5264r5, enumC5264r52, enumC5264r53};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5264r5 valueOf(String str) {
        return (EnumC5264r5) AbstractC2091b.m5160g(EnumC5264r5.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5264r5[] values() {
        return (EnumC5264r5[]) f20338j.clone();
    }
}
