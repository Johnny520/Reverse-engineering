package p100h0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: h0.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1521h {

    /* JADX INFO: renamed from: g */
    public static final EnumC1521h f5080g;

    /* JADX INFO: renamed from: h */
    public static final EnumC1521h f5081h;

    /* JADX INFO: renamed from: i */
    public static final EnumC1521h f5082i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ EnumC1521h[] f5083j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1521h enumC1521h = new EnumC1521h("CROSSED", 0);
        f5080g = enumC1521h;
        EnumC1521h enumC1521h2 = new EnumC1521h("NOT_CROSSED", 1);
        f5081h = enumC1521h2;
        EnumC1521h enumC1521h3 = new EnumC1521h("COLLAPSED", 2);
        f5082i = enumC1521h3;
        f5083j = new EnumC1521h[]{enumC1521h, enumC1521h2, enumC1521h3};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1521h valueOf(String str) {
        return (EnumC1521h) Enum.valueOf(EnumC1521h.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1521h[] values() {
        return (EnumC1521h[]) f5083j.clone();
    }
}
