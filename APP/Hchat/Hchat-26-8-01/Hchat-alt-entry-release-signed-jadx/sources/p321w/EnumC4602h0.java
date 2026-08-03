package p321w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: w.h0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4602h0 {

    /* JADX INFO: renamed from: g */
    public static final EnumC4602h0 f15180g;

    /* JADX INFO: renamed from: h */
    public static final EnumC4602h0 f15181h;

    /* JADX INFO: renamed from: i */
    public static final EnumC4602h0 f15182i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC4602h0[] f15183j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC4602h0 enumC4602h0 = new EnumC4602h0("None", 0);
        f15180g = enumC4602h0;
        EnumC4602h0 enumC4602h02 = new EnumC4602h0("Selection", 1);
        f15181h = enumC4602h02;
        EnumC4602h0 enumC4602h03 = new EnumC4602h0("Cursor", 2);
        f15182i = enumC4602h03;
        f15183j = new EnumC4602h0[]{enumC4602h0, enumC4602h02, enumC4602h03};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4602h0 valueOf(String str) {
        return (EnumC4602h0) Enum.valueOf(EnumC4602h0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4602h0[] values() {
        return (EnumC4602h0[]) f15183j.clone();
    }
}
