package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0717 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C0717.C0718 f1974 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f1975 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f1976 = 1;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final float f1977;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final float f1978;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final float f1979;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int f1980;

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۤۥ$ۥ, reason: contains not printable characters */
    public static final class C0718 {
        public C0718() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C0718(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۤۥ$ۥ۟, reason: contains not printable characters */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @Yue.InterfaceC5401(Yue.EnumC0409.f947)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @Yue.InterfaceC6109(allowedTargets = {Yue.EnumC0410.f963})
    public @interface InterfaceC0719 {
    }

    static {
            Yue.ۥ۟ۢۤۥ$ۥ r0 = new Yue.ۥ۟ۢۤۥ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C0717.f1974 = r0
            return
    }

    @Yue.InterfaceC6959
    public C0717(float r1, float r2, @Yue.InterfaceC2458(from = 0.0d, to = 1.0d) float r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f1977 = r1
            r0.f1978 = r2
            r0.f1979 = r3
            r0.f1980 = r4
            return
    }

    @Yue.InterfaceC5336(34)
    public C0717(@Yue.InterfaceC4418 android.window.BackEvent r5) {
            r4 = this;
            java.lang.String r0 = "backEvent"
            Yue.C3329.m13906(r5, r0)
            Yue.ۥ۟۠ۧۧ r0 = Yue.C0413.f969
            float r1 = r0.m1556(r5)
            float r2 = r0.m1557(r5)
            float r3 = r0.m1554(r5)
            int r5 = r0.m1555(r5)
            r4.<init>(r1, r2, r3, r5)
            return
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "BackEventCompat{touchX="
            r0.append(r1)
            float r1 = r2.f1977
            r0.append(r1)
            java.lang.String r1 = ", touchY="
            r0.append(r1)
            float r1 = r2.f1978
            r0.append(r1)
            java.lang.String r1 = ", progress="
            r0.append(r1)
            float r1 = r2.f1979
            r0.append(r1)
            java.lang.String r1 = ", swipeEdge="
            r0.append(r1)
            int r1 = r2.f1980
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final float m4458() {
            r1 = this;
            float r0 = r1.f1979
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final int m4459() {
            r1 = this;
            int r0 = r1.f1980
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final float m4460() {
            r1 = this;
            float r0 = r1.f1977
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final float m4461() {
            r1 = this;
            float r0 = r1.f1978
            return r0
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5336(34)
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final android.window.BackEvent m4462() {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L15
            Yue.ۥ۟۠ۧۧ r0 = Yue.C0413.f969
            float r1 = r5.f1977
            float r2 = r5.f1978
            float r3 = r5.f1979
            int r4 = r5.f1980
            android.window.BackEvent r0 = r0.m1553(r1, r2, r3, r4)
            return r0
        L15:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This method is only supported on API level 34+"
            r0.<init>(r1)
            throw r0
    }
}
