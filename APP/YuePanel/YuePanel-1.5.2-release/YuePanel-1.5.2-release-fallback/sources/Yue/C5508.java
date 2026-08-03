package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5508 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public android.content.Context f20397;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f20398;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.view.ViewGroup f20399;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.view.View f20400;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.lang.Runnable f20401;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.lang.Runnable f20402;

    public C5508(@Yue.InterfaceC4410 android.view.ViewGroup r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f20398 = r0
            r1.f20399 = r2
            return
    }

    public C5508(android.view.ViewGroup r1, int r2, android.content.Context r3) {
            r0 = this;
            r0.<init>()
            r0.f20397 = r3
            r0.f20399 = r1
            r0.f20398 = r2
            return
    }

    public C5508(@Yue.InterfaceC4410 android.view.ViewGroup r2, @Yue.InterfaceC4410 android.view.View r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f20398 = r0
            r1.f20399 = r2
            r1.f20400 = r3
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Yue.C5508 m20728(@Yue.InterfaceC4410 android.view.ViewGroup r1) {
            int r0 = Yue.C5102.C5103.f18361
            java.lang.Object r1 = r1.getTag(r0)
            Yue.ۥۡۧۤۥ r1 = (Yue.C5508) r1
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.C5508 m20729(@Yue.InterfaceC4410 android.view.ViewGroup r2, @Yue.InterfaceC3573 int r3, @Yue.InterfaceC4410 android.content.Context r4) {
            int r0 = Yue.C5102.C5103.f18366
            java.lang.Object r0 = r2.getTag(r0)
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            if (r0 != 0) goto L14
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            int r1 = Yue.C5102.C5103.f18366
            r2.setTag(r1, r0)
        L14:
            java.lang.Object r1 = r0.get(r3)
            Yue.ۥۡۧۤۥ r1 = (Yue.C5508) r1
            if (r1 == 0) goto L1d
            return r1
        L1d:
            Yue.ۥۡۧۤۥ r1 = new Yue.ۥۡۧۤۥ
            r1.<init>(r2, r3, r4)
            r0.put(r3, r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m20730(@Yue.InterfaceC4410 android.view.ViewGroup r1, @Yue.InterfaceC4544 Yue.C5508 r2) {
            int r0 = Yue.C5102.C5103.f18361
            r1.setTag(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m20731() {
            r3 = this;
            int r0 = r3.f20398
            if (r0 > 0) goto L8
            android.view.View r0 = r3.f20400
            if (r0 == 0) goto L28
        L8:
            android.view.ViewGroup r0 = r3.m20733()
            r0.removeAllViews()
            int r0 = r3.f20398
            if (r0 <= 0) goto L21
            android.content.Context r0 = r3.f20397
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f20398
            android.view.ViewGroup r2 = r3.f20399
            r0.inflate(r1, r2)
            goto L28
        L21:
            android.view.ViewGroup r0 = r3.f20399
            android.view.View r1 = r3.f20400
            r0.addView(r1)
        L28:
            java.lang.Runnable r0 = r3.f20401
            if (r0 == 0) goto L2f
            r0.run()
        L2f:
            android.view.ViewGroup r0 = r3.f20399
            m20730(r0, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m20732() {
            r1 = this;
            android.view.ViewGroup r0 = r1.f20399
            Yue.ۥۡۧۤۥ r0 = m20728(r0)
            if (r0 != r1) goto Lf
            java.lang.Runnable r0 = r1.f20402
            if (r0 == 0) goto Lf
            r0.run()
        Lf:
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.view.ViewGroup m20733() {
            r1 = this;
            android.view.ViewGroup r0 = r1.f20399
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m20734() {
            r1 = this;
            int r0 = r1.f20398
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m20735(@Yue.InterfaceC4544 java.lang.Runnable r1) {
            r0 = this;
            r0.f20401 = r1
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m20736(@Yue.InterfaceC4544 java.lang.Runnable r1) {
            r0 = this;
            r0.f20402 = r1
            return
    }
}
