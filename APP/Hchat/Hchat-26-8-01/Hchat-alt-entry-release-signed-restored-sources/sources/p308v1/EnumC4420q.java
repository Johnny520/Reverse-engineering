package p308v1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: v1.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4420q {

    /* JADX INFO: renamed from: g */
    public static final EnumC4420q f14708g;

    /* JADX INFO: renamed from: h */
    public static final EnumC4420q f14709h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC4420q[] f14710i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC4420q enumC4420q = new EnumC4420q("Width", 0);
        f14708g = enumC4420q;
        EnumC4420q enumC4420q2 = new EnumC4420q("Height", 1);
        f14709h = enumC4420q2;
        f14710i = new EnumC4420q[]{enumC4420q, enumC4420q2};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4420q valueOf(String str) {
        return (EnumC4420q) Enum.valueOf(EnumC4420q.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC4420q[] values() {
        return (EnumC4420q[]) f14710i.clone();
    }
}
