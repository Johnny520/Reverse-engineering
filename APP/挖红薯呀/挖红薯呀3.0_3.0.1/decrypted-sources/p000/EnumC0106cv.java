package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: cv */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0106cv {

    /* JADX INFO: renamed from: d */
    public static final EnumC0106cv f893d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0106cv f894e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0106cv f895f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC0106cv[] f896g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0106cv enumC0106cv = new EnumC0106cv("Active", 0);
        f893d = enumC0106cv;
        EnumC0106cv enumC0106cv2 = new EnumC0106cv("ActiveParent", 1);
        f894e = enumC0106cv2;
        EnumC0106cv enumC0106cv3 = new EnumC0106cv("Captured", 2);
        EnumC0106cv enumC0106cv4 = new EnumC0106cv("Inactive", 3);
        f895f = enumC0106cv4;
        f896g = new EnumC0106cv[]{enumC0106cv, enumC0106cv2, enumC0106cv3, enumC0106cv4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0106cv valueOf(String str) {
        return (EnumC0106cv) Enum.valueOf(EnumC0106cv.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0106cv[] values() {
        return (EnumC0106cv[]) f896g.clone();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m603a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                C0921xc.m5129j();
                return false;
            }
        }
        return true;
    }
}
