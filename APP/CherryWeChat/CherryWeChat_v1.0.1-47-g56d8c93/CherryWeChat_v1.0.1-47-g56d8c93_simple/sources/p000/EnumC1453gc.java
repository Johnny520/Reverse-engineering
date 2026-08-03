package p000;

/* JADX INFO: renamed from: gc */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1453gc extends Enum {

    /* JADX INFO: renamed from: a */
    public static final EnumC1453gc f5148a = null;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC1453gc[] f5149b = null;

    static {
        EnumC1453gc r0 = new EnumC1453gc("COROUTINE_SUSPENDED", 0);
        f5148a = r0;
        f5149b = new EnumC1453gc[]{r0, new EnumC1453gc("UNDECIDED", 1), new EnumC1453gc("RESUMED", 2)};
    }

    public static EnumC1453gc valueOf(String r1) {
        return (EnumC1453gc) Enum.valueOf(EnumC1453gc.class, r1);
    }

    public static EnumC1453gc[] values() {
        return (EnumC1453gc[]) f5149b.clone();
    }
}
