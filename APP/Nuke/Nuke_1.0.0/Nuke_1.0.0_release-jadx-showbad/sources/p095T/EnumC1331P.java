package p095T;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: T.P */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1331P {

    /* JADX INFO: renamed from: d */
    public static final EnumC1331P f4758d;

    /* JADX INFO: renamed from: e */
    public static final EnumC1331P f4759e;

    /* JADX INFO: renamed from: f */
    public static final EnumC1331P f4760f;

    /* JADX INFO: renamed from: g */
    public static final EnumC1331P f4761g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC1331P[] f4762h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1331P enumC1331P = new EnumC1331P("IGNORED", 0);
        f4758d = enumC1331P;
        EnumC1331P enumC1331P2 = new EnumC1331P("SCHEDULED", 1);
        f4759e = enumC1331P2;
        EnumC1331P enumC1331P3 = new EnumC1331P("DEFERRED", 2);
        f4760f = enumC1331P3;
        EnumC1331P enumC1331P4 = new EnumC1331P("IMMINENT", 3);
        f4761g = enumC1331P4;
        f4762h = new EnumC1331P[]{enumC1331P, enumC1331P2, enumC1331P3, enumC1331P4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1331P valueOf(String str) {
        return (EnumC1331P) Enum.valueOf(EnumC1331P.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1331P[] values() {
        return (EnumC1331P[]) f4762h.clone();
    }
}
