package p086r0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: r0.n */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0923n {

    /* JADX INFO: renamed from: a */
    public static final EnumC0923n f3290a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0923n f3291b;

    /* JADX INFO: renamed from: c */
    public static final EnumC0923n f3292c;

    /* JADX INFO: renamed from: d */
    public static final EnumC0923n f3293d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0923n f3294e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC0923n[] f3295f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0923n enumC0923n = new EnumC0923n("KNOWN_ADAPTER", 0);
        f3290a = enumC0923n;
        EnumC0923n enumC0923n2 = new EnumC0923n("LEARNED_LEGACY", 1);
        f3291b = enumC0923n2;
        EnumC0923n enumC0923n3 = new EnumC0923n("LEARNED_MVVM", 2);
        f3292c = enumC0923n3;
        EnumC0923n enumC0923n4 = new EnumC0923n("RUNTIME_LIST", 3);
        f3293d = enumC0923n4;
        EnumC0923n enumC0923n5 = new EnumC0923n("RUNTIME_SAMPLE", 4);
        f3294e = enumC0923n5;
        f3295f = new EnumC0923n[]{enumC0923n, enumC0923n2, enumC0923n3, enumC0923n4, enumC0923n5};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0923n valueOf(String str) {
        return (EnumC0923n) Enum.valueOf(EnumC0923n.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0923n[] values() {
        return (EnumC0923n[]) f3295f.clone();
    }
}
