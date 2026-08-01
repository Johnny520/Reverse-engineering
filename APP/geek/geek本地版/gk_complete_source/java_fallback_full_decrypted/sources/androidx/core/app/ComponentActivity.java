package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends android.app.Activity implements defpackage.oq, defpackage.aq {
    public final androidx.lifecycle.a a;

    public ComponentActivity() {
            r1 = this;
            r1.<init>()
            androidx.lifecycle.a r0 = new androidx.lifecycle.a
            r0.<init>(r1)
            r1.a = r0
            return
    }

    @Override // defpackage.aq
    public final boolean c(android.view.KeyEvent r1) {
            r0 = this;
            boolean r1 = super.dispatchKeyEvent(r1)
            return r1
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L12
            boolean r1 = defpackage.ip.r(r0, r3)
            if (r1 == 0) goto L12
            r3 = 1
            return r3
        L12:
            boolean r3 = defpackage.ip.s(r2, r0, r2, r3)
            return r3
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L12
            boolean r0 = defpackage.ip.r(r0, r2)
            if (r0 == 0) goto L12
            r2 = 1
            return r2
        L12:
            boolean r2 = super.dispatchKeyShortcutEvent(r2)
            return r2
    }

    public androidx.lifecycle.a e() {
            r1 = this;
            androidx.lifecycle.a r0 = r1.a
            return r0
    }

    public void f() {
            r0 = this;
            r0.invalidateOptionsMenu()
            return
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            int r1 = defpackage.p00.b
            defpackage.n00.b(r0)
            return
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            androidx.lifecycle.a r0 = r2.a
            r0.getClass()
            java.lang.String r1 = "markState"
            r0.c(r1)
            r0.g()
            super.onSaveInstanceState(r3)
            return
    }
}
