package p026N0;

/* JADX INFO: renamed from: N0.j */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0269j extends Enum {

    /* JADX INFO: renamed from: a */
    public static final EnumC0269j f564a = null;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC0269j[] f565b = null;

    static {
        EnumC0269j r02 = new EnumC0269j("TOP_DOWN", 0);
        EnumC0269j r1 = new EnumC0269j("BOTTOM_UP", 1);
        f564a = r1;
        f565b = new EnumC0269j[]{r02, r1};
    }

    public static EnumC0269j valueOf(String r1) {
        return (EnumC0269j) Enum.valueOf(EnumC0269j.class, r1);
    }

    public static EnumC0269j[] values() {
        return (EnumC0269j[]) f565b.clone();
    }
}
