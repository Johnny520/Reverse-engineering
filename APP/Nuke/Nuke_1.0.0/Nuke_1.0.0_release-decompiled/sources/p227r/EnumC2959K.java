package p227r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: r.K */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2959K {

    /* JADX INFO: renamed from: d */
    public static final EnumC2959K f9363d;

    /* JADX INFO: renamed from: e */
    public static final EnumC2959K f9364e;

    /* JADX INFO: renamed from: f */
    public static final EnumC2959K f9365f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC2959K[] f9366g;

    static {
        EnumC2959K enumC2959K = new EnumC2959K("Yes", 0);
        f9363d = enumC2959K;
        EnumC2959K enumC2959K2 = new EnumC2959K("No", 1);
        f9364e = enumC2959K2;
        EnumC2959K enumC2959K3 = new EnumC2959K("NotInitialized", 2);
        f9365f = enumC2959K3;
        f9366g = new EnumC2959K[]{enumC2959K, enumC2959K2, enumC2959K3};
    }

    public static EnumC2959K valueOf(String str) {
        return (EnumC2959K) Enum.valueOf(EnumC2959K.class, str);
    }

    public static EnumC2959K[] values() {
        return (EnumC2959K[]) f9366g.clone();
    }
}
