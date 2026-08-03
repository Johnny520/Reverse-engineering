package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6930 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final Yue.C6935 f24177 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f24178 = "ViewUtils";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final android.util.Property<android.view.View, java.lang.Float> f24179 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final android.util.Property<android.view.View, android.graphics.Rect> f24180 = null;

    /* JADX INFO: renamed from: Yue.ۥۢۤۨ$ۥ, reason: contains not printable characters */
    public class C6931 extends android.util.Property<android.view.View, java.lang.Float> {
        public C6931(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ java.lang.Float get(android.view.View r1) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                java.lang.Float r1 = r0.m26823(r1)
                return r1
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(android.view.View r1, java.lang.Float r2) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                java.lang.Float r2 = (java.lang.Float) r2
                r0.m26824(r1, r2)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public java.lang.Float m26823(android.view.View r1) {
                r0 = this;
                float r1 = Yue.C6930.m26815(r1)
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m26824(android.view.View r1, java.lang.Float r2) {
                r0 = this;
                float r2 = r2.floatValue()
                Yue.C6930.m26819(r1, r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۨ$ۥ۟, reason: contains not printable characters */
    public class C6932 extends android.util.Property<android.view.View, android.graphics.Rect> {
        public C6932(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ android.graphics.Rect get(android.view.View r1) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.graphics.Rect r1 = r0.m26825(r1)
                return r1
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(android.view.View r1, android.graphics.Rect r2) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.graphics.Rect r2 = (android.graphics.Rect) r2
                r0.m26826(r1, r2)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.graphics.Rect m26825(android.view.View r1) {
                r0 = this;
                android.graphics.Rect r1 = r1.getClipBounds()
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m26826(android.view.View r1, android.graphics.Rect r2) {
                r0 = this;
                r1.setClipBounds(r2)
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Le
            Yue.ۥۢۥ۟ r0 = new Yue.ۥۢۥ۟
            r0.<init>()
            Yue.C6930.f24177 = r0
            goto L15
        Le:
            Yue.ۥۢۥ r0 = new Yue.ۥۢۥ
            r0.<init>()
            Yue.C6930.f24177 = r0
        L15:
            Yue.ۥۢۤۨ$ۥ r0 = new Yue.ۥۢۤۨ$ۥ
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "translationAlpha"
            r0.<init>(r1, r2)
            Yue.C6930.f24179 = r0
            Yue.ۥۢۤۨ$ۥ۟ r0 = new Yue.ۥۢۤۨ$ۥ۟
            java.lang.Class<android.graphics.Rect> r1 = android.graphics.Rect.class
            java.lang.String r2 = "clipBounds"
            r0.<init>(r1, r2)
            Yue.C6930.f24180 = r0
            return
    }

    public C6930() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m26814(@Yue.InterfaceC4410 android.view.View r1) {
            Yue.ۥۢۤۨۡ r0 = Yue.C6930.f24177
            r0.m26829(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static float m26815(@Yue.InterfaceC4410 android.view.View r1) {
            Yue.ۥۢۤۨۡ r0 = Yue.C6930.f24177
            float r1 = r0.mo26831(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m26816(@Yue.InterfaceC4410 android.view.View r1) {
            Yue.ۥۢۤۨۡ r0 = Yue.C6930.f24177
            r0.m26832(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m26817(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4544 android.graphics.Matrix r2) {
            Yue.ۥۢۤۨۡ r0 = Yue.C6930.f24177
            r0.mo26833(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m26818(@Yue.InterfaceC4410 android.view.View r6, int r7, int r8, int r9, int r10) {
            Yue.ۥۢۤۨۡ r0 = Yue.C6930.f24177
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.mo26834(r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m26819(@Yue.InterfaceC4410 android.view.View r1, float r2) {
            Yue.ۥۢۤۨۡ r0 = Yue.C6930.f24177
            r0.mo26835(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m26820(@Yue.InterfaceC4410 android.view.View r1, int r2) {
            Yue.ۥۢۤۨۡ r0 = Yue.C6930.f24177
            r0.mo26836(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m26821(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4410 android.graphics.Matrix r2) {
            Yue.ۥۢۤۨۡ r0 = Yue.C6930.f24177
            r0.mo26837(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m26822(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4410 android.graphics.Matrix r2) {
            Yue.ۥۢۤۨۡ r0 = Yue.C6930.f24177
            r0.mo26838(r1, r2)
            return
    }
}
