package p000;

/* JADX INFO: renamed from: wu */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2688wu extends Enum {

    /* JADX INFO: renamed from: a */
    public static final EnumC2688wu f9251a = null;

    /* JADX INFO: renamed from: b */
    public static final EnumC2688wu f9252b = null;

    /* JADX INFO: renamed from: c */
    public static final EnumC2688wu f9253c = null;

    /* JADX INFO: renamed from: d */
    public static final EnumC2688wu f9254d = null;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ EnumC2688wu[] f9255e = null;

    static {
        EnumC2688wu r0 = new EnumC2688wu("IMMEDIATE", 0);
        f9251a = r0;
        EnumC2688wu r1 = new EnumC2688wu("HIGH", 1);
        f9252b = r1;
        EnumC2688wu r2 = new EnumC2688wu("NORMAL", 2);
        f9253c = r2;
        EnumC2688wu r3 = new EnumC2688wu("LOW", 3);
        f9254d = r3;
        f9255e = new EnumC2688wu[]{r0, r1, r2, r3};
    }

    public static EnumC2688wu valueOf(String r1) {
        return (EnumC2688wu) Enum.valueOf(EnumC2688wu.class, r1);
    }

    public static EnumC2688wu[] values() {
        return (EnumC2688wu[]) f9255e.clone();
    }
}
