package p339x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: x1.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5586b0 {

    /* JADX INFO: renamed from: g */
    public static final EnumC5586b0 f22708g;

    /* JADX INFO: renamed from: h */
    public static final EnumC5586b0 f22709h;

    /* JADX INFO: renamed from: i */
    public static final EnumC5586b0 f22710i;

    /* JADX INFO: renamed from: j */
    public static final EnumC5586b0 f22711j;

    /* JADX INFO: renamed from: k */
    public static final EnumC5586b0 f22712k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ EnumC5586b0[] f22713l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC5586b0 enumC5586b0 = new EnumC5586b0("Measuring", 0);
        f22708g = enumC5586b0;
        EnumC5586b0 enumC5586b02 = new EnumC5586b0("LookaheadMeasuring", 1);
        f22709h = enumC5586b02;
        EnumC5586b0 enumC5586b03 = new EnumC5586b0("LayingOut", 2);
        f22710i = enumC5586b03;
        EnumC5586b0 enumC5586b04 = new EnumC5586b0("LookaheadLayingOut", 3);
        f22711j = enumC5586b04;
        EnumC5586b0 enumC5586b05 = new EnumC5586b0("Idle", 4);
        f22712k = enumC5586b05;
        f22713l = new EnumC5586b0[]{enumC5586b0, enumC5586b02, enumC5586b03, enumC5586b04, enumC5586b05};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5586b0 valueOf(String str) {
        return (EnumC5586b0) Enum.valueOf(EnumC5586b0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5586b0[] values() {
        return (EnumC5586b0[]) f22713l.clone();
    }
}
