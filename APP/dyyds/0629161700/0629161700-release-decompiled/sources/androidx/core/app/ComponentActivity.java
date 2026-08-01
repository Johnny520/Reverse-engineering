package androidx.core.app;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends android.app.Activity implements defpackage.InterfaceC0770, defpackage.InterfaceC1177 {
    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.view.Window r0 = r1.getWindow()
            r0.getDecorView()
            java.util.WeakHashMap r0 = defpackage.AbstractC0858.f3911
            boolean r1 = super.dispatchKeyEvent(r2)
            return r1
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.view.Window r0 = r1.getWindow()
            r0.getDecorView()
            java.util.WeakHashMap r0 = defpackage.AbstractC0858.f3911
            boolean r1 = super.dispatchKeyShortcutEvent(r2)
            return r1
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            int r1 = defpackage.FragmentC2020.f8725
            defpackage.AbstractC0227.m834(r0)
            return
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public androidx.lifecycle.C0005 mo0() {
            r0 = this;
            r0 = 0
            return r0
    }
}
