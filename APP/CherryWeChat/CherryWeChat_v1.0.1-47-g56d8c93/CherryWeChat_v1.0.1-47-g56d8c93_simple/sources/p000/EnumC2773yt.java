package p000;

/* JADX INFO: renamed from: yt */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC2773yt extends Enum implements InterfaceC0415Jl {

    /* JADX INFO: renamed from: b */
    public static final EnumC2773yt f9417b = null;

    /* JADX INFO: renamed from: c */
    public static final EnumC2773yt f9418c = null;

    /* JADX INFO: renamed from: d */
    public static final EnumC2773yt f9419d = null;

    /* JADX INFO: renamed from: e */
    public static final EnumC2773yt f9420e = null;

    /* JADX INFO: renamed from: f */
    public static final EnumC2773yt f9421f = null;

    /* JADX INFO: renamed from: g */
    public static final EnumC2773yt f9422g = null;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ EnumC2773yt[] f9423h = null;

    /* JADX INFO: renamed from: a */
    public final int f9424a;

    static {
        EnumC2773yt r0 = new EnumC2773yt("UNKNOWN_PREFIX", 0, 0);
        f9417b = r0;
        EnumC2773yt r1 = new EnumC2773yt("TINK", 1, 1);
        f9418c = r1;
        EnumC2773yt r2 = new EnumC2773yt("LEGACY", 2, 2);
        f9419d = r2;
        EnumC2773yt r3 = new EnumC2773yt("RAW", 3, 3);
        f9420e = r3;
        EnumC2773yt r4 = new EnumC2773yt("CRUNCHY", 4, 4);
        f9421f = r4;
        EnumC2773yt r5 = new EnumC2773yt("UNRECOGNIZED", 5, -1);
        f9422g = r5;
        f9423h = new EnumC2773yt[]{r0, r1, r2, r3, r4, r5};
    }

    EnumC2773yt(String r1, int r2, int r3) {
        this.f9424a = r3;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC2773yt m5344a(int r1) {
        if (r1 == 0) goto L22;
        if (r1 == 1) goto L20;
        if (r1 == 2) goto L18;
        if (r1 == 3) goto L16;
        if (r1 == 4) goto L14;
        return null;
    L14:
        return f9421f;
    L16:
        return f9420e;
    L18:
        return f9419d;
    L20:
        return f9418c;
    L22:
        return f9417b;
    }

    public static EnumC2773yt valueOf(String r1) {
        return (EnumC2773yt) Enum.valueOf(EnumC2773yt.class, r1);
    }

    public static EnumC2773yt[] values() {
        return (EnumC2773yt[]) f9423h.clone();
    }

    /* JADX INFO: renamed from: b */
    public final int m5345b() {
        if (this == f9422g) goto L7;
        return this.f9424a;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
