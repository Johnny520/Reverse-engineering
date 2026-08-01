package p091S;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: S.l */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1240l {

    /* JADX INFO: renamed from: d */
    public static final EnumC1240l f4270d;

    /* JADX INFO: renamed from: e */
    public static final EnumC1240l f4271e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC1240l[] f4272f;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1240l EF0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1240l enumC1240l = new EnumC1240l("CornerExtraExtraLarge", 0);
        EnumC1240l enumC1240l2 = new EnumC1240l("CornerExtraLarge", 1);
        f4270d = enumC1240l2;
        EnumC1240l enumC1240l3 = new EnumC1240l("CornerExtraLargeIncreased", 2);
        EnumC1240l enumC1240l4 = new EnumC1240l("CornerExtraLargeTop", 3);
        EnumC1240l enumC1240l5 = new EnumC1240l("CornerExtraSmall", 4);
        EnumC1240l enumC1240l6 = new EnumC1240l("CornerExtraSmallTop", 5);
        EnumC1240l enumC1240l7 = new EnumC1240l("CornerFull", 6);
        f4271e = enumC1240l7;
        f4272f = new EnumC1240l[]{enumC1240l, enumC1240l2, enumC1240l3, enumC1240l4, enumC1240l5, enumC1240l6, enumC1240l7, new EnumC1240l("CornerLarge", 7), new EnumC1240l("CornerLargeEnd", 8), new EnumC1240l("CornerLargeIncreased", 9), new EnumC1240l("CornerLargeStart", 10), new EnumC1240l("CornerLargeTop", 11), new EnumC1240l("CornerMedium", 12), new EnumC1240l("CornerNone", 13), new EnumC1240l("CornerSmall", 14)};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1240l valueOf(String str) {
        return (EnumC1240l) Enum.valueOf(EnumC1240l.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1240l[] values() {
        return (EnumC1240l[]) f4272f.clone();
    }
}
