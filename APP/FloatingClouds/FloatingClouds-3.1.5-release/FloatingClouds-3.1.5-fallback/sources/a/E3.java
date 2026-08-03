package a;

/* JADX INFO: loaded from: classes.dex */
public class E3 extends android.app.Dialog implements a.InterfaceC0479y9, a.Yb, a.Ld {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.h f68a;
    public final a.Kd b;
    public final androidx.activity.OnBackPressedDispatcher c;

    public E3(android.content.Context r2, int r3) {
            r1 = this;
            r1.<init>(r2, r3)
            a.Kd r2 = new a.Kd
            r2.<init>(r1)
            r1.b = r2
            androidx.activity.OnBackPressedDispatcher r2 = new androidx.activity.OnBackPressedDispatcher
            a.M2 r3 = new a.M2
            r0 = 4
            r3.<init>(r0, r1)
            r2.<init>(r3)
            r1.c = r2
            return
    }

    public static void a(a.E3 r1) {
            java.lang.String r0 = "this$0"
            a.C0193i9.e(r1, r0)
            super.onBackPressed()
            return
    }

    @Override // android.app.Dialog
    public void addContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            java.lang.String r0 = "view"
            a.C0193i9.e(r2, r0)
            r1.b()
            super.addContentView(r2, r3)
            return
    }

    public final void b() {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            a.C0193i9.b(r0)
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "window!!.decorView"
            a.C0193i9.d(r0, r1)
            a.Mg.a(r0, r2)
            android.view.Window r0 = r2.getWindow()
            a.C0193i9.b(r0)
            android.view.View r0 = r0.getDecorView()
            a.C0193i9.d(r0, r1)
            androidx.activity.c.a(r0, r2)
            android.view.Window r0 = r2.getWindow()
            a.C0193i9.b(r0)
            android.view.View r0 = r0.getDecorView()
            a.C0193i9.d(r0, r1)
            androidx.savedstate.b.a(r0, r2)
            return
    }

    @Override // a.InterfaceC0479y9
    public final androidx.lifecycle.e getLifecycle() {
            r1 = this;
            androidx.lifecycle.h r0 = r1.f68a
            if (r0 != 0) goto Lb
            androidx.lifecycle.h r0 = new androidx.lifecycle.h
            r0.<init>(r1)
            r1.f68a = r0
        Lb:
            return r0
    }

    @Override // a.Yb
    public final androidx.activity.OnBackPressedDispatcher getOnBackPressedDispatcher() {
            r1 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r1.c
            return r0
    }

    @Override // a.Ld
    public final androidx.savedstate.a getSavedStateRegistry() {
            r1 = this;
            a.Kd r0 = r1.b
            androidx.savedstate.a r0 = r0.b
            return r0
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
            r1 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r1.c
            r0.b()
            return
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1e
            android.window.OnBackInvokedDispatcher r0 = a.H.c(r2)
            java.lang.String r1 = "onBackInvokedDispatcher"
            a.C0193i9.d(r0, r1)
            androidx.activity.OnBackPressedDispatcher r1 = r2.c
            r1.getClass()
            r1.e = r0
            boolean r0 = r1.g
            r1.c(r0)
        L1e:
            a.Kd r0 = r2.b
            r0.b(r3)
            androidx.lifecycle.h r3 = r2.f68a
            if (r3 != 0) goto L2e
            androidx.lifecycle.h r3 = new androidx.lifecycle.h
            r3.<init>(r2)
            r2.f68a = r3
        L2e:
            androidx.lifecycle.e$a r0 = androidx.lifecycle.e.a.ON_CREATE
            r3.f(r0)
            return
    }

    @Override // android.app.Dialog
    public final android.os.Bundle onSaveInstanceState() {
            r2 = this;
            android.os.Bundle r0 = super.onSaveInstanceState()
            java.lang.String r1 = "super.onSaveInstanceState()"
            a.C0193i9.d(r0, r1)
            a.Kd r1 = r2.b
            r1.c(r0)
            return r0
    }

    @Override // android.app.Dialog
    public final void onStart() {
            r2 = this;
            super.onStart()
            androidx.lifecycle.h r0 = r2.f68a
            if (r0 != 0) goto Le
            androidx.lifecycle.h r0 = new androidx.lifecycle.h
            r0.<init>(r2)
            r2.f68a = r0
        Le:
            androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_RESUME
            r0.f(r1)
            return
    }

    @Override // android.app.Dialog
    public void onStop() {
            r2 = this;
            androidx.lifecycle.h r0 = r2.f68a
            if (r0 != 0) goto Lb
            androidx.lifecycle.h r0 = new androidx.lifecycle.h
            r0.<init>(r2)
            r2.f68a = r0
        Lb:
            androidx.lifecycle.e$a r1 = androidx.lifecycle.e.a.ON_DESTROY
            r0.f(r1)
            r0 = 0
            r2.f68a = r0
            super.onStop()
            return
    }

    @Override // android.app.Dialog
    public void setContentView(int r1) {
            r0 = this;
            r0.b()
            super.setContentView(r1)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            a.C0193i9.e(r2, r0)
            r1.b()
            super.setContentView(r2)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            java.lang.String r0 = "view"
            a.C0193i9.e(r2, r0)
            r1.b()
            super.setContentView(r2, r3)
            return
    }
}
