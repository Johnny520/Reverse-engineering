package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class l0 implements defpackage.cv, defpackage.iu, defpackage.e5, defpackage.nu, defpackage.zc, defpackage.bd, defpackage.qw, defpackage.j8, defpackage.di, defpackage.kt, defpackage.jy, defpackage.v0 {
    public final /* synthetic */ int a;
    public java.lang.Object b;

    public l0(int r1) {
            r0 = this;
            r0.a = r1
            switch(r1) {
                case 28: goto L10;
                default: goto L5;
            }
        L5:
            r0.<init>()
            k0 r1 = new k0
            r1.<init>(r0)
            r0.b = r1
            return
        L10:
            r0.<init>()
            return
    }

    public /* synthetic */ l0(int r1, java.lang.Object r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    public l0(android.content.ClipData r2, int r3) {
            r1 = this;
            r0 = 7
            r1.a = r0
            r1.<init>()
            android.view.ContentInfo$Builder r2 = defpackage.p7.f(r2, r3)
            r1.b = r2
            return
    }

    public l0(android.content.Context r2) {
            r1 = this;
            r0 = 12
            r1.a = r0
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            r1.b = r2
            return
    }

    public l0(android.view.ContentInfo r2) {
            r1 = this;
            r0 = 8
            r1.a = r0
            r1.<init>()
            r2.getClass()
            android.view.ContentInfo r2 = defpackage.p7.h(r2)
            r1.b = r2
            return
    }

    public l0(android.widget.EditText r3) {
            r2 = this;
            r0 = 13
            r2.a = r0
            r2.<init>()
            d4 r0 = new d4
            r1 = 8
            r0.<init>(r3, r1)
            r2.b = r0
            return
    }

    public l0(android.widget.TextView r2) {
            r1 = this;
            r0 = 14
            r1.a = r0
            r1.<init>()
            qi r0 = new qi
            r0.<init>(r2)
            r1.b = r0
            return
    }

    @Override // defpackage.cv
    public void a(defpackage.ku r3, boolean r4) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.c50
            if (r0 == 0) goto L11
            r0 = r3
            c50 r0 = (defpackage.c50) r0
            ku r0 = r0.z
            ku r0 = r0.k()
            r1 = 0
            r0.c(r1)
        L11:
            java.lang.Object r0 = r2.b
            j1 r0 = (defpackage.j1) r0
            cv r0 = r0.e
            if (r0 == 0) goto L1c
            r0.a(r3, r4)
        L1c:
            return
    }

    @Override // defpackage.bd
    public android.content.ClipData b() {
            r1 = this;
            java.lang.Object r0 = r1.b
            android.view.ContentInfo r0 = (android.view.ContentInfo) r0
            android.content.ClipData r0 = defpackage.p7.d(r0)
            return r0
    }

    @Override // defpackage.zc
    public defpackage.cd build() {
            r3 = this;
            cd r0 = new cd
            l0 r1 = new l0
            java.lang.Object r2 = r3.b
            android.view.ContentInfo$Builder r2 = (android.view.ContentInfo.Builder) r2
            android.view.ContentInfo r2 = defpackage.p7.g(r2)
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.v0
    public boolean c(android.view.View r5) {
            r4 = this;
            java.lang.Object r0 = r4.b
            com.google.android.material.behavior.SwipeDismissBehavior r0 = (com.google.android.material.behavior.SwipeDismissBehavior) r0
            boolean r1 = r0.r(r5)
            r2 = 0
            if (r1 == 0) goto L31
            java.util.WeakHashMap r1 = defpackage.ja0.a
            int r1 = defpackage.t90.d(r5)
            r3 = 1
            if (r1 != r3) goto L15
            r2 = r3
        L15:
            int r0 = r0.d
            if (r0 != 0) goto L1b
            if (r2 != 0) goto L1f
        L1b:
            if (r0 != r3) goto L25
            if (r2 != 0) goto L25
        L1f:
            int r0 = r5.getWidth()
            int r0 = -r0
            goto L29
        L25:
            int r0 = r5.getWidth()
        L29:
            r5.offsetLeftAndRight(r0)
            r0 = 0
            r5.setAlpha(r0)
            return r3
        L31:
            return r2
    }

    @Override // defpackage.qw
    public defpackage.wc0 d(android.view.View r6, defpackage.wc0 r7) {
            r5 = this;
            tc0 r6 = r7.a
            java.lang.Object r0 = r5.b
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            wc0 r1 = r0.n
            boolean r1 = defpackage.pw.a(r1, r7)
            if (r1 != 0) goto L5a
            r0.n = r7
            int r1 = r7.d()
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L1a
            r1 = r3
            goto L1b
        L1a:
            r1 = r2
        L1b:
            r0.o = r1
            if (r1 != 0) goto L26
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            if (r1 != 0) goto L26
            goto L27
        L26:
            r3 = r2
        L27:
            r0.setWillNotDraw(r3)
            boolean r1 = r6.m()
            if (r1 == 0) goto L31
            goto L57
        L31:
            int r1 = r0.getChildCount()
        L35:
            if (r2 >= r1) goto L57
            android.view.View r3 = r0.getChildAt(r2)
            java.util.WeakHashMap r4 = defpackage.ja0.a
            boolean r4 = defpackage.s90.b(r3)
            if (r4 == 0) goto L54
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            zd r3 = (defpackage.zd) r3
            wd r3 = r3.a
            if (r3 == 0) goto L54
            boolean r3 = r6.m()
            if (r3 == 0) goto L54
            goto L57
        L54:
            int r2 = r2 + 1
            goto L35
        L57:
            r0.requestLayout()
        L5a:
            return r7
    }

    @Override // defpackage.di
    public void e(defpackage.ip r9) {
            r8 = this;
            yb r7 = new yb
            java.lang.String r0 = "EmojiCompatInitializer"
            r7.<init>(r0)
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingDeque r6 = new java.util.concurrent.LinkedBlockingDeque
            r6.<init>()
            r1 = 0
            r2 = 1
            r3 = 15
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r1 = 1
            r0.allowCoreThreadTimeOut(r1)
            fi r1 = new fi
            r2 = 0
            r1.<init>(r8, r9, r0, r2)
            r0.execute(r1)
            return
    }

    @Override // defpackage.bd
    public int f() {
            r1 = this;
            java.lang.Object r0 = r1.b
            android.view.ContentInfo r0 = (android.view.ContentInfo) r0
            int r0 = defpackage.p7.b(r0)
            return r0
    }

    @Override // defpackage.jy
    public void g() {
            r2 = this;
            java.lang.String r0 = "DIAGNOSTIC_PROFILE_IS_COMPRESSED"
            java.lang.String r1 = "ProfileInstaller"
            android.util.Log.d(r1, r0)
            return
    }

    @Override // defpackage.bd
    public android.view.ContentInfo h() {
            r1 = this;
            java.lang.Object r0 = r1.b
            android.view.ContentInfo r0 = (android.view.ContentInfo) r0
            return r0
    }

    @Override // defpackage.jy
    public void i(int r4, java.lang.Object r5) {
            r3 = this;
            switch(r4) {
                case 1: goto L21;
                case 2: goto L1e;
                case 3: goto L1b;
                case 4: goto L18;
                case 5: goto L15;
                case 6: goto L12;
                case 7: goto Lf;
                case 8: goto Lc;
                case 9: goto L3;
                case 10: goto L9;
                case 11: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = ""
            goto L23
        L6:
            java.lang.String r0 = "RESULT_DELETE_SKIP_FILE_SUCCESS"
            goto L23
        L9:
            java.lang.String r0 = "RESULT_INSTALL_SKIP_FILE_SUCCESS"
            goto L23
        Lc:
            java.lang.String r0 = "RESULT_PARSE_EXCEPTION"
            goto L23
        Lf:
            java.lang.String r0 = "RESULT_IO_EXCEPTION"
            goto L23
        L12:
            java.lang.String r0 = "RESULT_BASELINE_PROFILE_NOT_FOUND"
            goto L23
        L15:
            java.lang.String r0 = "RESULT_DESIRED_FORMAT_UNSUPPORTED"
            goto L23
        L18:
            java.lang.String r0 = "RESULT_NOT_WRITABLE"
            goto L23
        L1b:
            java.lang.String r0 = "RESULT_UNSUPPORTED_ART_VERSION"
            goto L23
        L1e:
            java.lang.String r0 = "RESULT_ALREADY_INSTALLED"
            goto L23
        L21:
            java.lang.String r0 = "RESULT_INSTALL_SUCCESS"
        L23:
            r1 = 6
            java.lang.String r2 = "ProfileInstaller"
            if (r4 == r1) goto L33
            r1 = 7
            if (r4 == r1) goto L33
            r1 = 8
            if (r4 == r1) goto L33
            android.util.Log.d(r2, r0)
            goto L38
        L33:
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            android.util.Log.e(r2, r0, r5)
        L38:
            java.lang.Object r5 = r3.b
            androidx.profileinstaller.ProfileInstallReceiver r5 = (androidx.profileinstaller.ProfileInstallReceiver) r5
            r5.setResultCode(r4)
            return
    }

    public void j(int r1) {
            r0 = this;
            return
    }

    @Override // defpackage.iu
    public void k(defpackage.ku r2) {
            r1 = this;
            java.lang.Object r0 = r1.b
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            d70 r0 = r0.u
            if (r0 == 0) goto Lb
            r0.k(r2)
        Lb:
            return
    }

    public void l(int r1) {
            r0 = this;
            return
    }

    @Override // defpackage.zc
    public void m(android.net.Uri r2) {
            r1 = this;
            java.lang.Object r0 = r1.b
            android.view.ContentInfo$Builder r0 = (android.view.ContentInfo.Builder) r0
            defpackage.p7.k(r0, r2)
            return
    }

    @Override // defpackage.iu
    public boolean n(defpackage.ku r1, android.view.MenuItem r2) {
            r0 = this;
            java.lang.Object r1 = r0.b
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            m1 r1 = r1.z
            if (r1 == 0) goto L22
            d70 r1 = (defpackage.d70) r1
            androidx.appcompat.widget.Toolbar r1 = r1.a
            d4 r1 = r1.G
            java.lang.Object r1 = r1.c
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 != 0) goto L1d
            goto L22
        L1d:
            java.lang.ClassCastException r1 = defpackage.z30.h(r1)
            throw r1
        L22:
            r1 = 0
            return r1
    }

    @Override // defpackage.bd
    public int o() {
            r1 = this;
            java.lang.Object r0 = r1.b
            android.view.ContentInfo r0 = (android.view.ContentInfo) r0
            int r0 = defpackage.p7.s(r0)
            return r0
    }

    @Override // defpackage.j8
    public void onCancel() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 10: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.b
            g40 r0 = (defpackage.g40) r0
            r0.a()
            return
        Ld:
            java.lang.Object r0 = r1.b
            android.animation.Animator r0 = (android.animation.Animator) r0
            r0.end()
            return
    }

    @Override // defpackage.nu
    public void p(defpackage.ku r1, android.view.MenuItem r2) {
            r0 = this;
            java.lang.Object r2 = r0.b
            t8 r2 = (defpackage.t8) r2
            android.os.Handler r2 = r2.f
            r2.removeCallbacksAndMessages(r1)
            return
    }

    @Override // defpackage.cv
    public boolean q(defpackage.ku r4) {
            r3 = this;
            java.lang.Object r0 = r3.b
            j1 r0 = (defpackage.j1) r0
            ku r1 = r0.c
            r2 = 0
            if (r4 != r1) goto La
            return r2
        La:
            r1 = r4
            c50 r1 = (defpackage.c50) r1
            ou r1 = r1.A
            r1.getClass()
            r0.getClass()
            cv r0 = r0.e
            if (r0 == 0) goto L1e
            boolean r4 = r0.q(r4)
            return r4
        L1e:
            return r2
    }

    @Override // defpackage.nu
    public void r(defpackage.ku r8, defpackage.ou r9) {
            r7 = this;
            java.lang.Object r0 = r7.b
            t8 r0 = (defpackage.t8) r0
            android.os.Handler r1 = r0.f
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            java.util.ArrayList r0 = r0.h
            int r3 = r0.size()
            r4 = 0
        L11:
            r5 = -1
            if (r4 >= r3) goto L22
            java.lang.Object r6 = r0.get(r4)
            s8 r6 = (defpackage.s8) r6
            ku r6 = r6.b
            if (r8 != r6) goto L1f
            goto L23
        L1f:
            int r4 = r4 + 1
            goto L11
        L22:
            r4 = r5
        L23:
            if (r4 != r5) goto L26
            return
        L26:
            int r4 = r4 + 1
            int r3 = r0.size()
            if (r4 >= r3) goto L35
            java.lang.Object r0 = r0.get(r4)
            r2 = r0
            s8 r2 = (defpackage.s8) r2
        L35:
            r8 r0 = new r8
            r0.<init>(r7, r2, r9, r8)
            long r2 = android.os.SystemClock.uptimeMillis()
            r4 = 200(0xc8, double:9.9E-322)
            long r2 = r2 + r4
            r1.postAtTime(r0, r8, r2)
            return
    }

    @Override // defpackage.zc
    public void s(int r2) {
            r1 = this;
            java.lang.Object r0 = r1.b
            android.view.ContentInfo$Builder r0 = (android.view.ContentInfo.Builder) r0
            defpackage.p7.j(r0, r2)
            return
    }

    @Override // defpackage.zc
    public void setExtras(android.os.Bundle r2) {
            r1 = this;
            java.lang.Object r0 = r1.b
            android.view.ContentInfo$Builder r0 = (android.view.ContentInfo.Builder) r0
            defpackage.p7.l(r0, r2)
            return
    }

    public defpackage.j0 t(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 8: goto L22;
                case 27: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<"
            r0.<init>(r1)
            java.lang.Object r1 = r2.b
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            r1 = 62
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L22:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ContentInfoCompat{"
            r0.<init>(r1)
            java.lang.Object r1 = r2.b
            android.view.ContentInfo r1 = (android.view.ContentInfo) r1
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public defpackage.j0 u(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void v() {
            r1 = this;
            java.lang.Object r0 = r1.b
            nl r0 = (defpackage.nl) r0
            yl r0 = r0.F
            r0.F()
            return
    }

    public boolean w(int r1, int r2, android.os.Bundle r3) {
            r0 = this;
            r1 = 0
            return r1
    }
}
