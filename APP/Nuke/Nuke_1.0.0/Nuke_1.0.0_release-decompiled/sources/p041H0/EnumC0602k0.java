package p041H0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: H0.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0602k0 {

    /* JADX INFO: renamed from: d */
    public static final EnumC0602k0 f1948d;

    /* JADX INFO: renamed from: e */
    public static final EnumC0602k0 f1949e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC0602k0[] f1950f;

    static {
        EnumC0602k0 enumC0602k0 = new EnumC0602k0("Width", 0);
        f1948d = enumC0602k0;
        EnumC0602k0 enumC0602k02 = new EnumC0602k0("Height", 1);
        f1949e = enumC0602k02;
        f1950f = new EnumC0602k0[]{enumC0602k0, enumC0602k02};
    }

    public static EnumC0602k0 valueOf(String str) {
        return (EnumC0602k0) Enum.valueOf(EnumC0602k0.class, str);
    }

    public static EnumC0602k0[] values() {
        return (EnumC0602k0[]) f1950f.clone();
    }
}
