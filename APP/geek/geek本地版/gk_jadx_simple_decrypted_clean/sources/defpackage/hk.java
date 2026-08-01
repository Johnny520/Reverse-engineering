package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum hk extends Enum {
    public static final hk a = null;
    public static final /* synthetic */ hk[] b = null;

    static {
        hk r0 = new hk("TOP_DOWN", 0);
        hk r1 = new hk("BOTTOM_UP", 1);
        a = r1;
        b = new hk[]{r0, r1};
    }

    public static hk valueOf(String r1) {
        return (hk) Enum.valueOf(hk.class, r1);
    }

    public static hk[] values() {
        return (hk[]) b.clone();
    }
}
