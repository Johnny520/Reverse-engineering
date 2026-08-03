package p082fd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: fd.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1207d {

    /* JADX INFO: renamed from: g */
    public static final EnumC1207d f4053g;

    /* JADX INFO: renamed from: h */
    public static final EnumC1207d f4054h;

    /* JADX INFO: renamed from: i */
    public static final EnumC1207d f4055i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC1207d[] f4056j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1207d enumC1207d = new EnumC1207d("BODY_ONLY", 0);
        f4053g = enumC1207d;
        EnumC1207d enumC1207d2 = new EnumC1207d("BODY_ONLY_NOWRAP", 1);
        f4054h = enumC1207d2;
        EnumC1207d enumC1207d3 = new EnumC1207d("INLINE", 2);
        f4055i = enumC1207d3;
        f4056j = new EnumC1207d[]{enumC1207d, enumC1207d2, enumC1207d3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1207d valueOf(String str) {
        return (EnumC1207d) Enum.valueOf(EnumC1207d.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1207d[] values() {
        return (EnumC1207d[]) f4056j.clone();
    }
}
