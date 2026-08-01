package p244u;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: u.y */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3292y {

    /* JADX INFO: renamed from: d */
    public static final EnumC3292y f10175d;

    /* JADX INFO: renamed from: e */
    public static final EnumC3292y f10176e;

    /* JADX INFO: renamed from: f */
    public static final EnumC3292y f10177f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC3292y[] f10178g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3292y enumC3292y = new EnumC3292y("Vertical", 0);
        f10175d = enumC3292y;
        EnumC3292y enumC3292y2 = new EnumC3292y("Horizontal", 1);
        f10176e = enumC3292y2;
        EnumC3292y enumC3292y3 = new EnumC3292y("Both", 2);
        f10177f = enumC3292y3;
        f10178g = new EnumC3292y[]{enumC3292y, enumC3292y2, enumC3292y3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3292y valueOf(String str) {
        return (EnumC3292y) Enum.valueOf(EnumC3292y.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC3292y[] values() {
        return (EnumC3292y[]) f10178g.clone();
    }
}
