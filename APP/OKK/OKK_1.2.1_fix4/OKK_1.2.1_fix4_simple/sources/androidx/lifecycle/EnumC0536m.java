package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.m */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0536m extends Enum {

    /* JADX INFO: renamed from: a */
    public static final EnumC0536m f1482a = null;

    /* JADX INFO: renamed from: b */
    public static final EnumC0536m f1483b = null;

    /* JADX INFO: renamed from: c */
    public static final EnumC0536m f1484c = null;

    /* JADX INFO: renamed from: d */
    public static final EnumC0536m f1485d = null;

    /* JADX INFO: renamed from: e */
    public static final EnumC0536m f1486e = null;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ EnumC0536m[] f1487f = null;

    static {
        EnumC0536m r02 = new EnumC0536m("DESTROYED", 0);
        f1482a = r02;
        EnumC0536m r1 = new EnumC0536m("INITIALIZED", 1);
        f1483b = r1;
        EnumC0536m r2 = new EnumC0536m("CREATED", 2);
        f1484c = r2;
        EnumC0536m r3 = new EnumC0536m("STARTED", 3);
        f1485d = r3;
        EnumC0536m r4 = new EnumC0536m("RESUMED", 4);
        f1486e = r4;
        f1487f = new EnumC0536m[]{r02, r1, r2, r3, r4};
    }

    public static EnumC0536m valueOf(String r1) {
        return (EnumC0536m) Enum.valueOf(EnumC0536m.class, r1);
    }

    public static EnumC0536m[] values() {
        return (EnumC0536m[]) f1487f.clone();
    }
}
