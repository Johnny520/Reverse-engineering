package tg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: tg.u */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4203u {

    /* JADX INFO: renamed from: g */
    public static final EnumC4203u f13793g;

    /* JADX INFO: renamed from: h */
    public static final EnumC4203u f13794h;

    /* JADX INFO: renamed from: i */
    public static final EnumC4203u f13795i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC4203u[] f13796j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC4203u enumC4203u = new EnumC4203u("START", 0);
        f13793g = enumC4203u;
        EnumC4203u enumC4203u2 = new EnumC4203u("STOP", 1);
        f13794h = enumC4203u2;
        EnumC4203u enumC4203u3 = new EnumC4203u("STOP_AND_RESET_REPLAY_CACHE", 2);
        f13795i = enumC4203u3;
        f13796j = new EnumC4203u[]{enumC4203u, enumC4203u2, enumC4203u3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4203u valueOf(String str) {
        return (EnumC4203u) Enum.valueOf(EnumC4203u.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4203u[] values() {
        return (EnumC4203u[]) f13796j.clone();
    }
}
