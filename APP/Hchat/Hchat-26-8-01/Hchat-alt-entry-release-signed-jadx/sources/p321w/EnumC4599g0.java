package p321w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: w.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4599g0 {

    /* JADX INFO: renamed from: g */
    public static final EnumC4599g0 f15156g;

    /* JADX INFO: renamed from: h */
    public static final EnumC4599g0 f15157h;

    /* JADX INFO: renamed from: i */
    public static final EnumC4599g0 f15158i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC4599g0[] f15159j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC4599g0 enumC4599g0 = new EnumC4599g0("Cursor", 0);
        f15156g = enumC4599g0;
        EnumC4599g0 enumC4599g02 = new EnumC4599g0("SelectionStart", 1);
        f15157h = enumC4599g02;
        EnumC4599g0 enumC4599g03 = new EnumC4599g0("SelectionEnd", 2);
        f15158i = enumC4599g03;
        f15159j = new EnumC4599g0[]{enumC4599g0, enumC4599g02, enumC4599g03};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4599g0 valueOf(String str) {
        return (EnumC4599g0) Enum.valueOf(EnumC4599g0.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4599g0[] values() {
        return (EnumC4599g0[]) f15159j.clone();
    }
}
