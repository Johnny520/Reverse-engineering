package p100h0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h0.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1516f0 {

    /* JADX INFO: renamed from: g */
    public static final EnumC1516f0 f5066g;

    /* JADX INFO: renamed from: h */
    public static final EnumC1516f0 f5067h;

    /* JADX INFO: renamed from: i */
    public static final EnumC1516f0 f5068i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC1516f0[] f5069j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1516f0 enumC1516f0 = new EnumC1516f0("Left", 0);
        f5066g = enumC1516f0;
        EnumC1516f0 enumC1516f02 = new EnumC1516f0("Middle", 1);
        f5067h = enumC1516f02;
        EnumC1516f0 enumC1516f03 = new EnumC1516f0("Right", 2);
        f5068i = enumC1516f03;
        f5069j = new EnumC1516f0[]{enumC1516f0, enumC1516f02, enumC1516f03};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1516f0 valueOf(String str) {
        return (EnumC1516f0) Enum.valueOf(EnumC1516f0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1516f0[] values() {
        return (EnumC1516f0[]) f5069j.clone();
    }
}
