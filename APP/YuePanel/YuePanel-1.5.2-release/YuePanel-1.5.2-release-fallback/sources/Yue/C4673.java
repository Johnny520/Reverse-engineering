package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4673 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f14891 = "\udfffd";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f14892 = "m";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.ThreadLocal<Yue.C4678<android.graphics.Rect, android.graphics.Rect>> f14893 = null;

    /* JADX INFO: renamed from: Yue.ۥۣۡۦ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static class C4674 {
        public C4674() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static boolean m18533(android.graphics.Paint r0, java.lang.String r1) {
                boolean r0 = r0.hasGlyph(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۦ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C4675 {
        public C4675() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m18534(android.graphics.Paint r0, java.lang.Object r1) {
                android.graphics.BlendMode r1 = (android.graphics.BlendMode) r1
                r0.setBlendMode(r1)
                return
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            Yue.C4673.f14893 = r0
            return
    }

    public C4673() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m18530(@Yue.InterfaceC4410 android.graphics.Paint r0, @Yue.InterfaceC4410 java.lang.String r1) {
            boolean r0 = Yue.C4673.C4674.m18533(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C4678<android.graphics.Rect, android.graphics.Rect> m18531() {
            java.lang.ThreadLocal<Yue.ۥۣۡۦۡ<android.graphics.Rect, android.graphics.Rect>> r0 = Yue.C4673.f14893
            java.lang.Object r1 = r0.get()
            Yue.ۥۣۡۦۡ r1 = (Yue.C4678) r1
            if (r1 != 0) goto L1d
            Yue.ۥۣۡۦۡ r1 = new Yue.ۥۣۡۦۡ
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.<init>(r2, r3)
            r0.set(r1)
            goto L2b
        L1d:
            F r0 = r1.f14896
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r0.setEmpty()
            S r0 = r1.f14897
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r0.setEmpty()
        L2b:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m18532(@Yue.InterfaceC4410 android.graphics.Paint r4, @Yue.InterfaceC4544 Yue.EnumC0768 r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 1
            r3 = 0
            if (r0 < r1) goto L12
            if (r5 == 0) goto Le
            java.lang.Object r3 = Yue.C0769.C0771.m4679(r5)
        Le:
            Yue.C4673.C4675.m18534(r4, r3)
            return r2
        L12:
            if (r5 == 0) goto L27
            android.graphics.PorterDuff$Mode r5 = Yue.C0769.m4678(r5)
            if (r5 == 0) goto L1f
            android.graphics.PorterDuffXfermode r3 = new android.graphics.PorterDuffXfermode
            r3.<init>(r5)
        L1f:
            r4.setXfermode(r3)
            if (r5 == 0) goto L25
            goto L26
        L25:
            r2 = 0
        L26:
            return r2
        L27:
            r4.setXfermode(r3)
            return r2
    }
}
