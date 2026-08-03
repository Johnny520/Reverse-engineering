package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C6261 extends android.content.ContextWrapper {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.Object f22312 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.util.ArrayList<java.lang.ref.WeakReference<Yue.C6261>> f22313;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.res.Resources f22314;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final android.content.res.Resources.Theme f22315;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            Yue.C6261.f22312 = r0
            return
    }

    public C6261(@Yue.InterfaceC4410 android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            boolean r0 = Yue.C6670.m25687()
            if (r0 == 0) goto L22
            Yue.ۥۣۢۥۤ r0 = new Yue.ۥۣۢۥۤ
            android.content.res.Resources r1 = r3.getResources()
            r0.<init>(r2, r1)
            r2.f22314 = r0
            android.content.res.Resources$Theme r0 = r0.newTheme()
            r2.f22315 = r0
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r0.setTo(r3)
            goto L30
        L22:
            Yue.ۥۢۡۥۥ r0 = new Yue.ۥۢۡۥۥ
            android.content.res.Resources r3 = r3.getResources()
            r0.<init>(r2, r3)
            r2.f22314 = r0
            r3 = 0
            r2.f22315 = r3
        L30:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m23334(@Yue.InterfaceC4410 android.content.Context r1) {
            boolean r0 = r1 instanceof Yue.C6261
            if (r0 != 0) goto L1a
            android.content.res.Resources r0 = r1.getResources()
            boolean r0 = r0 instanceof Yue.C6263
            if (r0 != 0) goto L1a
            android.content.res.Resources r1 = r1.getResources()
            boolean r1 = r1 instanceof Yue.C6670
            if (r1 == 0) goto L15
            goto L1a
        L15:
            boolean r1 = Yue.C6670.m25687()
            return r1
        L1a:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static android.content.Context m23335(@Yue.InterfaceC4410 android.content.Context r4) {
            boolean r0 = m23334(r4)
            if (r0 == 0) goto L73
            java.lang.Object r0 = Yue.C6261.f22312
            monitor-enter(r0)
            java.util.ArrayList<java.lang.ref.WeakReference<Yue.ۥۢۡۥۣ>> r1 = Yue.C6261.f22313     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L17
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            Yue.C6261.f22313 = r1     // Catch: java.lang.Throwable -> L15
            goto L60
        L15:
            r4 = move-exception
            goto L71
        L17:
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L15
            int r1 = r1 + (-1)
        L1d:
            if (r1 < 0) goto L37
            java.util.ArrayList<java.lang.ref.WeakReference<Yue.ۥۢۡۥۣ>> r2 = Yue.C6261.f22313     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L15
            if (r2 != 0) goto L34
        L2f:
            java.util.ArrayList<java.lang.ref.WeakReference<Yue.ۥۢۡۥۣ>> r2 = Yue.C6261.f22313     // Catch: java.lang.Throwable -> L15
            r2.remove(r1)     // Catch: java.lang.Throwable -> L15
        L34:
            int r1 = r1 + (-1)
            goto L1d
        L37:
            java.util.ArrayList<java.lang.ref.WeakReference<Yue.ۥۢۡۥۣ>> r1 = Yue.C6261.f22313     // Catch: java.lang.Throwable -> L15
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L15
            int r1 = r1 + (-1)
        L3f:
            if (r1 < 0) goto L60
            java.util.ArrayList<java.lang.ref.WeakReference<Yue.ۥۢۡۥۣ>> r2 = Yue.C6261.f22313     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L52
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L15
            Yue.ۥۢۡۥۣ r2 = (Yue.C6261) r2     // Catch: java.lang.Throwable -> L15
            goto L53
        L52:
            r2 = 0
        L53:
            if (r2 == 0) goto L5d
            android.content.Context r3 = r2.getBaseContext()     // Catch: java.lang.Throwable -> L15
            if (r3 != r4) goto L5d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r2
        L5d:
            int r1 = r1 + (-1)
            goto L3f
        L60:
            Yue.ۥۢۡۥۣ r1 = new Yue.ۥۢۡۥۣ     // Catch: java.lang.Throwable -> L15
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList<java.lang.ref.WeakReference<Yue.ۥۢۡۥۣ>> r4 = Yue.C6261.f22313     // Catch: java.lang.Throwable -> L15
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L15
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L15
            r4.add(r2)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r1
        L71:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r4
        L73:
            return r4
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
            r1 = this;
            android.content.res.Resources r0 = r1.f22314
            android.content.res.AssetManager r0 = r0.getAssets()
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
            r1 = this;
            android.content.res.Resources r0 = r1.f22314
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
            r1 = this;
            android.content.res.Resources$Theme r0 = r1.f22315
            if (r0 != 0) goto L8
            android.content.res.Resources$Theme r0 = super.getTheme()
        L8:
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int r3) {
            r2 = this;
            android.content.res.Resources$Theme r0 = r2.f22315
            if (r0 != 0) goto L8
            super.setTheme(r3)
            goto Lc
        L8:
            r1 = 1
            r0.applyStyle(r3, r1)
        Lc:
            return
    }
}
