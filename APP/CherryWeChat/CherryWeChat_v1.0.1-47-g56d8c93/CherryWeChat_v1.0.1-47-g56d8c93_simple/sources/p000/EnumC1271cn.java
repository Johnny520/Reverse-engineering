package p000;

/* JADX INFO: renamed from: cn */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1271cn extends Enum implements InterfaceC0415Jl {

    /* JADX INFO: renamed from: b */
    public static final EnumC1271cn f4326b = null;

    /* JADX INFO: renamed from: c */
    public static final EnumC1271cn f4327c = null;

    /* JADX INFO: renamed from: d */
    public static final EnumC1271cn f4328d = null;

    /* JADX INFO: renamed from: e */
    public static final EnumC1271cn f4329e = null;

    /* JADX INFO: renamed from: f */
    public static final EnumC1271cn f4330f = null;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ EnumC1271cn[] f4331g = null;

    /* JADX INFO: renamed from: a */
    public final int f4332a;

    static {
        EnumC1271cn r0 = new EnumC1271cn("UNKNOWN_STATUS", 0, 0);
        f4326b = r0;
        EnumC1271cn r1 = new EnumC1271cn("ENABLED", 1, 1);
        f4327c = r1;
        EnumC1271cn r2 = new EnumC1271cn("DISABLED", 2, 2);
        f4328d = r2;
        EnumC1271cn r3 = new EnumC1271cn("DESTROYED", 3, 3);
        f4329e = r3;
        EnumC1271cn r4 = new EnumC1271cn("UNRECOGNIZED", 4, -1);
        f4330f = r4;
        f4331g = new EnumC1271cn[]{r0, r1, r2, r3, r4};
    }

    EnumC1271cn(String r1, int r2, int r3) {
        this.f4332a = r3;
    }

    public static EnumC1271cn valueOf(String r1) {
        return (EnumC1271cn) Enum.valueOf(EnumC1271cn.class, r1);
    }

    public static EnumC1271cn[] values() {
        return (EnumC1271cn[]) f4331g.clone();
    }

    /* JADX INFO: renamed from: a */
    public final int m2409a() {
        if (this == f4330f) goto L7;
        return this.f4332a;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
