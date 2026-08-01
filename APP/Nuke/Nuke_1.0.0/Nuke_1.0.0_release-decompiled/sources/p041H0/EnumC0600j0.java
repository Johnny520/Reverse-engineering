package p041H0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: H0.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0600j0 {

    /* JADX INFO: renamed from: d */
    public static final EnumC0600j0 f1944d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0600j0 f1945e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC0600j0[] f1946f;

    static {
        EnumC0600j0 enumC0600j0 = new EnumC0600j0("Min", 0);
        f1944d = enumC0600j0;
        EnumC0600j0 enumC0600j02 = new EnumC0600j0("Max", 1);
        f1945e = enumC0600j02;
        f1946f = new EnumC0600j0[]{enumC0600j0, enumC0600j02};
    }

    public static EnumC0600j0 valueOf(String str) {
        return (EnumC0600j0) Enum.valueOf(EnumC0600j0.class, str);
    }

    public static EnumC0600j0[] values() {
        return (EnumC0600j0[]) f1946f.clone();
    }
}
