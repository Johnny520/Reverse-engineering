package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: tb */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0758tb {

    /* JADX INFO: renamed from: d */
    public static final EnumC0758tb f5968d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0758tb f5969e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0758tb f5970f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC0758tb[] f5971g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0758tb enumC0758tb = new EnumC0758tb("SUSPEND", 0);
        f5968d = enumC0758tb;
        EnumC0758tb enumC0758tb2 = new EnumC0758tb("DROP_OLDEST", 1);
        f5969e = enumC0758tb2;
        EnumC0758tb enumC0758tb3 = new EnumC0758tb("DROP_LATEST", 2);
        f5970f = enumC0758tb3;
        f5971g = new EnumC0758tb[]{enumC0758tb, enumC0758tb2, enumC0758tb3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0758tb valueOf(String str) {
        return (EnumC0758tb) Enum.valueOf(EnumC0758tb.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0758tb[] values() {
        return (EnumC0758tb[]) f5971g.clone();
    }
}
