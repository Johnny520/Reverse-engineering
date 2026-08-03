package p378z6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: z6.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6103c {

    /* JADX INFO: renamed from: g */
    public static final EnumC6103c f24634g;

    /* JADX INFO: renamed from: h */
    public static final EnumC6103c f24635h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC6103c[] f24636i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC6103c enumC6103c = new EnumC6103c("Circular", 0);
        f24634g = enumC6103c;
        EnumC6103c enumC6103c2 = new EnumC6103c("Continuous", 1);
        f24635h = enumC6103c2;
        f24636i = new EnumC6103c[]{enumC6103c, enumC6103c2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC6103c valueOf(String str) {
        return (EnumC6103c) Enum.valueOf(EnumC6103c.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC6103c[] values() {
        return (EnumC6103c[]) f24636i.clone();
    }
}
