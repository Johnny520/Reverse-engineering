package p160f3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: f3.u */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2161u {

    /* JADX INFO: renamed from: d */
    public static final EnumC2161u f7105d;

    /* JADX INFO: renamed from: e */
    public static final EnumC2161u f7106e;

    /* JADX INFO: renamed from: f */
    public static final EnumC2161u f7107f;

    /* JADX INFO: renamed from: g */
    public static final EnumC2161u f7108g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC2161u[] f7109h;

    static {
        EnumC2161u enumC2161u = new EnumC2161u("DEFAULT", 0);
        f7105d = enumC2161u;
        EnumC2161u enumC2161u2 = new EnumC2161u("LAZY", 1);
        f7106e = enumC2161u2;
        EnumC2161u enumC2161u3 = new EnumC2161u("ATOMIC", 2);
        f7107f = enumC2161u3;
        EnumC2161u enumC2161u4 = new EnumC2161u("UNDISPATCHED", 3);
        f7108g = enumC2161u4;
        f7109h = new EnumC2161u[]{enumC2161u, enumC2161u2, enumC2161u3, enumC2161u4};
    }

    public static EnumC2161u valueOf(String str) {
        return (EnumC2161u) Enum.valueOf(EnumC2161u.class, str);
    }

    public static EnumC2161u[] values() {
        return (EnumC2161u[]) f7109h.clone();
    }
}
