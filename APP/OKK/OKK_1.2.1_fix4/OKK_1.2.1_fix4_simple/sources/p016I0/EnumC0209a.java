package p016I0;

/* JADX INFO: renamed from: I0.a */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0209a extends Enum {

    /* JADX INFO: renamed from: a */
    public static final EnumC0209a f425a = null;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC0209a[] f426b = null;

    static {
        EnumC0209a r02 = new EnumC0209a("COROUTINE_SUSPENDED", 0);
        f425a = r02;
        f426b = new EnumC0209a[]{r02, new EnumC0209a("UNDECIDED", 1), new EnumC0209a("RESUMED", 2)};
    }

    public static EnumC0209a valueOf(String r1) {
        return (EnumC0209a) Enum.valueOf(EnumC0209a.class, r1);
    }

    public static EnumC0209a[] values() {
        return (EnumC0209a[]) f426b.clone();
    }
}
