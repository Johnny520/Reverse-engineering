package a;

/* JADX INFO: loaded from: classes.dex */
public class X0 extends a.E3 implements a.I0 {
    public a.Q0 d;
    public final a.W0 e;

    public X0(android.view.ContextThemeWrapper r5, int r6) {
            r4 = this;
            r0 = 1
            if (r6 != 0) goto L14
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            int r3 = androidx.appcompat.R.attr.dialogTheme
            r2.resolveAttribute(r3, r1, r0)
            int r1 = r1.resourceId
            goto L15
        L14:
            r1 = r6
        L15:
            r4.<init>(r5, r1)
            a.W0 r1 = new a.W0
            r2 = r4
            androidx.appcompat.app.b r2 = (androidx.appcompat.app.b) r2
            r1.<init>(r2)
            r4.e = r1
            a.O0 r1 = r4.c()
            if (r6 != 0) goto L38
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            int r2 = androidx.appcompat.R.attr.dialogTheme
            r5.resolveAttribute(r2, r6, r0)
            int r6 = r6.resourceId
        L38:
            r5 = r1
            a.Q0 r5 = (a.Q0) r5
            r5.U = r6
            r1.o()
            return
    }

    @Override // a.E3, android.app.Dialog
    public final void addContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            a.O0 r0 = r1.c()
            r0.c(r2, r3)
            return
    }

    public final a.O0 c() {
            r3 = this;
            a.Q0 r0 = r3.d
            if (r0 != 0) goto L15
            a.O0$c r0 = a.O0.f192a
            a.Q0 r0 = new a.Q0
            android.content.Context r1 = r3.getContext()
            android.view.Window r2 = r3.getWindow()
            r0.<init>(r1, r2, r3, r3)
            r3.d = r0
        L15:
            a.Q0 r0 = r3.d
            return r0
    }

    public final void d() {
            r1 = this;
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            a.Mg.a(r0, r1)
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.savedstate.b.a(r0, r1)
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.activity.c.a(r0, r1)
            return
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
            r1 = this;
            super.dismiss()
            a.O0 r0 = r1.c()
            r0.p()
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.view.Window r0 = r1.getWindow()
            r0.getDecorView()
            a.W0 r0 = r1.e
            if (r0 != 0) goto Ld
            r2 = 0
            return r2
        Ld:
            androidx.appcompat.app.b r0 = r0.f312a
            boolean r2 = r0.e(r2)
            return r2
    }

    public final boolean e(android.view.KeyEvent r1) {
            r0 = this;
            boolean r1 = super.dispatchKeyEvent(r1)
            return r1
    }

    @Override // android.app.Dialog
    public final <T extends android.view.View> T findViewById(int r2) {
            r1 = this;
            a.O0 r0 = r1.c()
            android.view.View r2 = r0.e(r2)
            return r2
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
            r1 = this;
            a.O0 r0 = r1.c()
            r0.l()
            return
    }

    @Override // a.E3, android.app.Dialog
    public void onCreate(android.os.Bundle r2) {
            r1 = this;
            a.O0 r0 = r1.c()
            r0.k()
            super.onCreate(r2)
            a.O0 r2 = r1.c()
            r2.o()
            return
    }

    @Override // a.E3, android.app.Dialog
    public final void onStop() {
            r1 = this;
            super.onStop()
            a.O0 r0 = r1.c()
            r0.t()
            return
    }

    @Override // a.I0
    public final void onSupportActionModeFinished(a.P r1) {
            r0 = this;
            return
    }

    @Override // a.I0
    public final void onSupportActionModeStarted(a.P r1) {
            r0 = this;
            return
    }

    @Override // a.I0
    public final a.P onWindowStartingSupportActionMode(a.P.a r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // a.E3, android.app.Dialog
    public final void setContentView(int r2) {
            r1 = this;
            r1.d()
            a.O0 r0 = r1.c()
            r0.w(r2)
            return
    }

    @Override // a.E3, android.app.Dialog
    public final void setContentView(android.view.View r2) {
            r1 = this;
            r1.d()
            a.O0 r0 = r1.c()
            r0.x(r2)
            return
    }

    @Override // a.E3, android.app.Dialog
    public final void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            r1.d()
            a.O0 r0 = r1.c()
            r0.y(r2, r3)
            return
    }

    @Override // android.app.Dialog
    public final void setTitle(int r3) {
            r2 = this;
            super.setTitle(r3)
            a.O0 r0 = r2.c()
            android.content.Context r1 = r2.getContext()
            java.lang.String r3 = r1.getString(r3)
            r0.B(r3)
            return
    }

    @Override // android.app.Dialog
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            super.setTitle(r2)
            a.O0 r0 = r1.c()
            r0.B(r2)
            return
    }
}
