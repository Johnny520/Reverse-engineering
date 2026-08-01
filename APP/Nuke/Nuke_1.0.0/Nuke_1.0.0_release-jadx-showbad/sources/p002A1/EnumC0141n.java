package p002A1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: A1.n */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0141n {

    /* JADX INFO: renamed from: d */
    public static final EnumC0141n f531d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0141n f532e;

    /* JADX INFO: renamed from: f */
    public static final EnumC0141n f533f;

    /* JADX INFO: renamed from: g */
    public static final EnumC0141n f534g;

    /* JADX INFO: renamed from: h */
    public static final EnumC0141n f535h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ EnumC0141n[] f536i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0141n enumC0141n = new EnumC0141n("DESTROYED", 0);
        f531d = enumC0141n;
        EnumC0141n enumC0141n2 = new EnumC0141n("INITIALIZED", 1);
        f532e = enumC0141n2;
        EnumC0141n enumC0141n3 = new EnumC0141n("CREATED", 2);
        f533f = enumC0141n3;
        EnumC0141n enumC0141n4 = new EnumC0141n("STARTED", 3);
        f534g = enumC0141n4;
        EnumC0141n enumC0141n5 = new EnumC0141n("RESUMED", 4);
        f535h = enumC0141n5;
        f536i = new EnumC0141n[]{enumC0141n, enumC0141n2, enumC0141n3, enumC0141n4, enumC0141n5};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0141n valueOf(String str) {
        return (EnumC0141n) Enum.valueOf(EnumC0141n.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EnumC0141n[] values() {
        return (EnumC0141n[]) f536i.clone();
    }
}
