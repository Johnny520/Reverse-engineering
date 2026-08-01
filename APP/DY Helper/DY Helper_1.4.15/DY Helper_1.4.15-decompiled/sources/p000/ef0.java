package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ef0 {

    /* JADX INFO: renamed from: α */
    public static final p000.ef0 f3529 = null;

    /* JADX INFO: renamed from: β */
    private static final char f3530 = '/';

    /* JADX INFO: renamed from: γ */
    private static final char f3531 = 0;

    /* JADX INFO: renamed from: δ */
    public static final int f3532 = 0;

    static {
            ef0 r0 = new ef0
            r0.<init>()
            p000.ef0.f3529 = r0
            r0 = 46
            p000.ef0.f3531 = r0
            return
    }

    private ef0() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.String m1919(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            boolean r1 = p000.q02.m4671(r2)
            if (r1 != 0) goto L15
            r1 = 47
            char r0 = p000.ef0.f3531
            java.lang.String r1 = r2.replace(r1, r0)
            r1.getClass()
            return r1
        L15:
            java.lang.String r1 = "宿主类路径不能为空"
            p000.C1080.m7275(r1)
            r1 = 0
            return r1
    }
}
