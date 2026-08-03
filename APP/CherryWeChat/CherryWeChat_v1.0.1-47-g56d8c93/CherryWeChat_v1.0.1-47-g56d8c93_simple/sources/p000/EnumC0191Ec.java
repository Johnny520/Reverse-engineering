package p000;

/* JADX INFO: renamed from: Ec */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0191Ec extends Enum {

    /* JADX INFO: renamed from: a */
    public static final EnumC0191Ec f576a = null;

    /* JADX INFO: renamed from: b */
    public static final EnumC0191Ec f577b = null;

    /* JADX INFO: renamed from: c */
    public static final EnumC0191Ec f578c = null;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumC0191Ec[] f579d = null;

    static {
        EnumC0191Ec r0 = new EnumC0191Ec("PREFER_ARGB_8888", 0);
        f576a = r0;
        EnumC0191Ec r1 = new EnumC0191Ec("PREFER_RGB_565", 1);
        f577b = r1;
        f579d = new EnumC0191Ec[]{r0, r1};
        f578c = r0;
    }

    public static EnumC0191Ec valueOf(String r1) {
        return (EnumC0191Ec) Enum.valueOf(EnumC0191Ec.class, r1);
    }

    public static EnumC0191Ec[] values() {
        return (EnumC0191Ec[]) f579d.clone();
    }
}
