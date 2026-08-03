package p353xg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: xg.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5805b {

    /* JADX INFO: renamed from: g */
    public static final EnumC5805b f23566g;

    /* JADX INFO: renamed from: h */
    public static final EnumC5805b f23567h;

    /* JADX INFO: renamed from: i */
    public static final EnumC5805b f23568i;

    /* JADX INFO: renamed from: j */
    public static final EnumC5805b f23569j;

    /* JADX INFO: renamed from: k */
    public static final EnumC5805b f23570k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ EnumC5805b[] f23571l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC5805b enumC5805b = new EnumC5805b("CPU_ACQUIRED", 0);
        f23566g = enumC5805b;
        EnumC5805b enumC5805b2 = new EnumC5805b("BLOCKING", 1);
        f23567h = enumC5805b2;
        EnumC5805b enumC5805b3 = new EnumC5805b("PARKING", 2);
        f23568i = enumC5805b3;
        EnumC5805b enumC5805b4 = new EnumC5805b("DORMANT", 3);
        f23569j = enumC5805b4;
        EnumC5805b enumC5805b5 = new EnumC5805b("TERMINATED", 4);
        f23570k = enumC5805b5;
        f23571l = new EnumC5805b[]{enumC5805b, enumC5805b2, enumC5805b3, enumC5805b4, enumC5805b5};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5805b valueOf(String str) {
        return (EnumC5805b) Enum.valueOf(EnumC5805b.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC5805b[] values() {
        return (EnumC5805b[]) f23571l.clone();
    }
}
