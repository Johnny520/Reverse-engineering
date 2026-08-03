package sh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: sh.s0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4046s0 {

    /* JADX INFO: renamed from: g */
    public static final EnumC4046s0 f13370g;

    /* JADX INFO: renamed from: h */
    public static final EnumC4046s0 f13371h;

    /* JADX INFO: renamed from: i */
    public static final EnumC4046s0 f13372i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC4046s0[] f13373j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC4046s0 enumC4046s0 = new EnumC4046s0("None", 0);
        f13370g = enumC4046s0;
        EnumC4046s0 enumC4046s02 = new EnumC4046s0("Edge", 1);
        f13371h = enumC4046s02;
        EnumC4046s0 enumC4046s03 = new EnumC4046s0("Step", 2);
        f13372i = enumC4046s03;
        f13373j = new EnumC4046s0[]{enumC4046s0, enumC4046s02, enumC4046s03};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4046s0 valueOf(String str) {
        return (EnumC4046s0) Enum.valueOf(EnumC4046s0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4046s0[] values() {
        return (EnumC4046s0[]) f13373j.clone();
    }
}
