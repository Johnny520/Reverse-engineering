package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.n */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0479n {

    /* JADX INFO: renamed from: a */
    public static final EnumC0479n f1517a;

    /* JADX INFO: renamed from: b */
    public static final EnumC0479n f1518b;

    /* JADX INFO: renamed from: c */
    public static final EnumC0479n f1519c;

    /* JADX INFO: renamed from: d */
    public static final EnumC0479n f1520d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0479n f1521e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC0479n[] f1522f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC0479n enumC0479n = new EnumC0479n("DESTROYED", 0);
        f1517a = enumC0479n;
        EnumC0479n enumC0479n2 = new EnumC0479n("INITIALIZED", 1);
        f1518b = enumC0479n2;
        EnumC0479n enumC0479n3 = new EnumC0479n("CREATED", 2);
        f1519c = enumC0479n3;
        EnumC0479n enumC0479n4 = new EnumC0479n("STARTED", 3);
        f1520d = enumC0479n4;
        EnumC0479n enumC0479n5 = new EnumC0479n("RESUMED", 4);
        f1521e = enumC0479n5;
        f1522f = new EnumC0479n[]{enumC0479n, enumC0479n2, enumC0479n3, enumC0479n4, enumC0479n5};
    }

    public static EnumC0479n valueOf(String str) {
        return (EnumC0479n) Enum.valueOf(EnumC0479n.class, str);
    }

    public static EnumC0479n[] values() {
        return (EnumC0479n[]) f1522f.clone();
    }
}
