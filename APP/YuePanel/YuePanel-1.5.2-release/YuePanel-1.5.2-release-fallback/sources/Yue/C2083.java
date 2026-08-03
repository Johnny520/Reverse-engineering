package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C2083 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.widget.EdgeEffect f6617;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۤ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C2084 {
        private C2084() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m9743(android.widget.EdgeEffect r0, float r1, float r2) {
                r0.onPull(r1, r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۤ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(31)
    public static class C2085 {
        private C2085() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.widget.EdgeEffect m9744(android.content.Context r1, android.util.AttributeSet r2) {
                android.widget.EdgeEffect r0 = new android.widget.EdgeEffect     // Catch: java.lang.Throwable -> L6
                r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L6
                return r0
            L6:
                android.widget.EdgeEffect r2 = new android.widget.EdgeEffect
                r2.<init>(r1)
                return r2
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static float m9745(android.widget.EdgeEffect r0) {
                float r0 = r0.getDistance()     // Catch: java.lang.Throwable -> L5
                return r0
            L5:
                r0 = 0
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static float m9746(android.widget.EdgeEffect r0, float r1, float r2) {
                float r0 = r0.onPullDistance(r1, r2)     // Catch: java.lang.Throwable -> L5
                return r0
            L5:
                r0.onPull(r1, r2)
                r0 = 0
                return r0
        }
    }

    @java.lang.Deprecated
    public C2083(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect
            r0.<init>(r2)
            r1.f6617 = r0
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.widget.EdgeEffect m9731(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            android.widget.EdgeEffect r2 = Yue.C2083.C2085.m9744(r2, r3)
            return r2
        Lb:
            android.widget.EdgeEffect r3 = new android.widget.EdgeEffect
            r3.<init>(r2)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static float m9732(@Yue.InterfaceC4410 android.widget.EdgeEffect r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            float r2 = Yue.C2083.C2085.m9745(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m9733(@Yue.InterfaceC4410 android.widget.EdgeEffect r0, float r1, float r2) {
            Yue.C2083.C2084.m9743(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static float m9734(@Yue.InterfaceC4410 android.widget.EdgeEffect r2, float r3, float r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            float r2 = Yue.C2083.C2085.m9746(r2, r3, r4)
            return r2
        Lb:
            m9733(r2, r3, r4)
            return r3
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean m9735(android.graphics.Canvas r2) {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.f6617
            boolean r2 = r0.draw(r2)
            return r2
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m9736() {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.f6617
            r0.finish()
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m9737() {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.f6617
            boolean r0 = r0.isFinished()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m9738(int r2) {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.f6617
            r0.onAbsorb(r2)
            r2 = 1
            return r2
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m9739(float r2) {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.f6617
            r0.onPull(r2)
            r2 = 1
            return r2
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m9740(float r2, float r3) {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.f6617
            m9733(r0, r2, r3)
            r2 = 1
            return r2
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean m9741() {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.f6617
            r0.onRelease()
            android.widget.EdgeEffect r0 = r1.f6617
            boolean r0 = r0.isFinished()
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m9742(int r2, int r3) {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.f6617
            r0.setSize(r2, r3)
            return
    }
}
