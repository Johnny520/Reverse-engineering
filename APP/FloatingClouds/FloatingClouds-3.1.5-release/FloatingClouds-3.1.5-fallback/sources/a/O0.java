package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class O0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.O0.c f192a = null;
    public static final int b = 0;
    public static a.J9 c;
    public static a.J9 d;
    public static java.lang.Boolean e;
    public static boolean f;
    public static final a.L1<java.lang.ref.WeakReference<a.O0>> g = null;
    public static final java.lang.Object h = null;
    public static final java.lang.Object i = null;

    public static class a {
        public static android.os.LocaleList a(java.lang.String r0) {
                android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r0)
                return r0
        }
    }

    public static class b {
        public static android.os.LocaleList a(java.lang.Object r0) {
                android.app.LocaleManager r0 = (android.app.LocaleManager) r0
                android.os.LocaleList r0 = r0.getApplicationLocales()
                return r0
        }

        public static void b(java.lang.Object r0, android.os.LocaleList r1) {
                android.app.LocaleManager r0 = (android.app.LocaleManager) r0
                r0.setApplicationLocales(r1)
                return
        }
    }

    public static class c implements java.util.concurrent.Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.Object f193a;
        public final java.util.ArrayDeque b;
        public final a.O0.d c;
        public java.lang.Runnable d;

        public c(a.O0.d r2) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.f193a = r0
                java.util.ArrayDeque r0 = new java.util.ArrayDeque
                r0.<init>()
                r1.b = r0
                r1.c = r2
                return
        }

        public final void b() {
                r3 = this;
                java.lang.Object r0 = r3.f193a
                monitor-enter(r0)
                java.util.ArrayDeque r1 = r3.b     // Catch: java.lang.Throwable -> L15
                java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L15
                java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L15
                r3.d = r1     // Catch: java.lang.Throwable -> L15
                if (r1 == 0) goto L17
                a.O0$d r2 = r3.c     // Catch: java.lang.Throwable -> L15
                r2.execute(r1)     // Catch: java.lang.Throwable -> L15
                goto L17
            L15:
                r1 = move-exception
                goto L19
            L17:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                return
            L19:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                throw r1
        }

        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable r5) {
                r4 = this;
                java.lang.Object r0 = r4.f193a
                monitor-enter(r0)
                java.util.ArrayDeque r1 = r4.b     // Catch: java.lang.Throwable -> L16
                a.P0 r2 = new a.P0     // Catch: java.lang.Throwable -> L16
                r3 = 0
                r2.<init>(r4, r3, r5)     // Catch: java.lang.Throwable -> L16
                r1.add(r2)     // Catch: java.lang.Throwable -> L16
                java.lang.Runnable r5 = r4.d     // Catch: java.lang.Throwable -> L16
                if (r5 != 0) goto L18
                r4.b()     // Catch: java.lang.Throwable -> L16
                goto L18
            L16:
                r5 = move-exception
                goto L1a
            L18:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                return
            L1a:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                throw r5
        }
    }

    public static class d implements java.util.concurrent.Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable r2) {
                r1 = this;
                java.lang.Thread r0 = new java.lang.Thread
                r0.<init>(r2)
                r0.start()
                return
        }
    }

    static {
            a.O0$c r0 = new a.O0$c
            a.O0$d r1 = new a.O0$d
            r1.<init>()
            r0.<init>(r1)
            a.O0.f192a = r0
            r0 = -100
            a.O0.b = r0
            r0 = 0
            a.O0.c = r0
            a.O0.d = r0
            a.O0.e = r0
            r0 = 0
            a.O0.f = r0
            a.L1 r0 = new a.L1
            r0.<init>()
            a.O0.g = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            a.O0.h = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            a.O0.i = r0
            return
    }

    public O0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean m(android.content.Context r4) {
            java.lang.Boolean r0 = a.O0.e
            if (r0 != 0) goto L37
            int r0 = a.ServiceC0417v1.f728a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            int r0 = a.ServiceC0417v1.a.a()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            r0 = r0 | 128(0x80, float:1.8E-43)
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            java.lang.Class<a.v1> r3 = a.ServiceC0417v1.class
            r2.<init>(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            android.content.pm.ServiceInfo r4 = r1.getServiceInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            android.os.Bundle r4 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            if (r4 == 0) goto L37
            java.lang.String r0 = "autoStoreLocales"
            boolean r4 = r4.getBoolean(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            a.O0.e = r4     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2c
            goto L37
        L2c:
            java.lang.String r4 = "AppCompatDelegate"
            java.lang.String r0 = "Checking for metadata for AppLocalesMetadataHolderService : Service not found"
            android.util.Log.d(r4, r0)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            a.O0.e = r4
        L37:
            java.lang.Boolean r4 = a.O0.e
            boolean r4 = r4.booleanValue()
            return r4
    }

    public static void u(a.Q0 r4) {
            java.lang.Object r0 = a.O0.h
            monitor-enter(r0)
            a.L1<java.lang.ref.WeakReference<a.O0>> r1 = a.O0.g     // Catch: java.lang.Throwable -> L26
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L26
        L9:
            r2 = r1
            a.Z9$a r2 = (a.Z9.a) r2     // Catch: java.lang.Throwable -> L26
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto L28
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L26
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L26
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L26
            a.O0 r3 = (a.O0) r3     // Catch: java.lang.Throwable -> L26
            if (r3 == r4) goto L22
            if (r3 != 0) goto L9
        L22:
            r2.remove()     // Catch: java.lang.Throwable -> L26
            goto L9
        L26:
            r4 = move-exception
            goto L2a
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            return
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r4
    }

    public void A(int r1) {
            r0 = this;
            return
    }

    public abstract void B(java.lang.CharSequence r1);

    public abstract a.P C(a.P.a r1);

    public abstract void c(android.view.View r1, android.view.ViewGroup.LayoutParams r2);

    public android.content.Context d(android.content.Context r1) {
            r0 = this;
            return r1
    }

    public abstract <T extends android.view.View> T e(int r1);

    public android.content.Context f() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract a.Q0.b g();

    public int h() {
            r1 = this;
            r0 = -100
            return r0
    }

    public abstract android.view.MenuInflater i();

    public abstract a.L j();

    public abstract void k();

    public abstract void l();

    public abstract void n(android.content.res.Configuration r1);

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract void t();

    public abstract boolean v(int r1);

    public abstract void w(int r1);

    public abstract void x(android.view.View r1);

    public abstract void y(android.view.View r1, android.view.ViewGroup.LayoutParams r2);

    public abstract void z(androidx.appcompat.widget.Toolbar r1);
}
