package p050c0;

/* JADX INFO: renamed from: c0.a1 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0640a1 extends Enum {

    /* JADX INFO: renamed from: a */
    public static final EnumC0640a1 f1993a = null;

    /* JADX INFO: renamed from: b */
    public static final EnumC0640a1 f1994b = null;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EnumC0640a1[] f1995c = null;

    static {
        EnumC0640a1 r02 = new EnumC0640a1("None", 0);
        f1993a = r02;
        EnumC0640a1 r1 = new EnumC0640a1("Left", 1);
        f1994b = r1;
        f1995c = new EnumC0640a1[]{r02, r1, new EnumC0640a1("Right", 2)};
    }

    public static EnumC0640a1 valueOf(String r1) {
        return (EnumC0640a1) Enum.valueOf(EnumC0640a1.class, r1);
    }

    public static EnumC0640a1[] values() {
        return (EnumC0640a1[]) f1995c.clone();
    }
}
