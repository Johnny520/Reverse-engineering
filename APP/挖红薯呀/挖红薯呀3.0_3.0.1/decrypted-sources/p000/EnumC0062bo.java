package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: bo */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0062bo {

    /* JADX INFO: renamed from: d */
    public static final EnumC0062bo f549d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0062bo f550e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0062bo f551f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC0062bo[] f552g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0062bo enumC0062bo = new EnumC0062bo("Vertical", 0);
        f549d = enumC0062bo;
        EnumC0062bo enumC0062bo2 = new EnumC0062bo("Horizontal", 1);
        f550e = enumC0062bo2;
        EnumC0062bo enumC0062bo3 = new EnumC0062bo("Both", 2);
        f551f = enumC0062bo3;
        f552g = new EnumC0062bo[]{enumC0062bo, enumC0062bo2, enumC0062bo3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0062bo valueOf(String str) {
        return (EnumC0062bo) Enum.valueOf(EnumC0062bo.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0062bo[] values() {
        return (EnumC0062bo[]) f552g.clone();
    }
}
