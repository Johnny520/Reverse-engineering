package Yue;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4118 {

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C4119 {
        public C4119() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m16156(android.view.Menu r0, boolean r1) {
                r0.setGroupDividerEnabled(r1)
                return
        }
    }

    public C4118() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m16154(@Yue.InterfaceC4410 android.view.Menu r2, boolean r3) {
            boolean r0 = r2 instanceof Yue.InterfaceMenuC6057
            if (r0 == 0) goto La
            Yue.ۥۢ۠ۥۡ r2 = (Yue.InterfaceMenuC6057) r2
            r2.setGroupDividerEnabled(r3)
            goto L13
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L13
            Yue.C4118.C4119.m16156(r2, r3)
        L13:
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m16155(android.view.MenuItem r0, int r1) {
            r0.setShowAsAction(r1)
            return
    }
}
