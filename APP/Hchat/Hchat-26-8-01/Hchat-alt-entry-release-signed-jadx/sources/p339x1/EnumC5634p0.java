package p339x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x1.p0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5634p0 {

    /* JADX INFO: renamed from: g */
    public static final EnumC5634p0 f22943g;

    /* JADX INFO: renamed from: h */
    public static final EnumC5634p0 f22944h;

    /* JADX INFO: renamed from: i */
    public static final EnumC5634p0 f22945i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC5634p0[] f22946j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC5634p0 enumC5634p0 = new EnumC5634p0("IsPlacedInLookahead", 0);
        f22943g = enumC5634p0;
        EnumC5634p0 enumC5634p02 = new EnumC5634p0("IsPlacedInApproach", 1);
        f22944h = enumC5634p02;
        EnumC5634p0 enumC5634p03 = new EnumC5634p0("IsNotPlaced", 2);
        f22945i = enumC5634p03;
        f22946j = new EnumC5634p0[]{enumC5634p0, enumC5634p02, enumC5634p03};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5634p0 valueOf(String str) {
        return (EnumC5634p0) Enum.valueOf(EnumC5634p0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5634p0[] values() {
        return (EnumC5634p0[]) f22946j.clone();
    }
}
