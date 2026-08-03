package p116i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: i.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1754h {

    /* JADX INFO: renamed from: g */
    public static final EnumC1754h f5861g;

    /* JADX INFO: renamed from: h */
    public static final EnumC1754h f5862h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC1754h[] f5863i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC1754h enumC1754h = new EnumC1754h("BoundReached", 0);
        f5861g = enumC1754h;
        EnumC1754h enumC1754h2 = new EnumC1754h("Finished", 1);
        f5862h = enumC1754h2;
        f5863i = new EnumC1754h[]{enumC1754h, enumC1754h2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1754h valueOf(String str) {
        return (EnumC1754h) Enum.valueOf(EnumC1754h.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC1754h[] values() {
        return (EnumC1754h[]) f5863i.clone();
    }
}
