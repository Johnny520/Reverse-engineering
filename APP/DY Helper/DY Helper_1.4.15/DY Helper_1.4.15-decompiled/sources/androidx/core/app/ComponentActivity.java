package androidx.core.app;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends android.app.Activity implements p000.hr0, p000.xo0 {

    /* JADX INFO: renamed from: ε */
    public final p000.jr0 f988;

    public ComponentActivity() {
            r1 = this;
            r1.<init>()
            jr0 r0 = new jr0
            r0.<init>(r1)
            r1.f988 = r0
            return
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            r2.getClass()
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            java.util.WeakHashMap r0 = p000.b92.f1572
            boolean r1 = super.dispatchKeyEvent(r2)
            return r1
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r2) {
            r1 = this;
            r2.getClass()
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            r0.getClass()
            java.util.WeakHashMap r0 = p000.b92.f1572
            boolean r1 = super.dispatchKeyShortcutEvent(r2)
            return r1
    }

    @Override // android.app.Activity
    public void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            int r1 = p000.jn1.f5528
            p000.hn1.m2524(r0)
            return
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            r3.getClass()
            java.lang.String r0 = "setCurrentState"
            jr0 r1 = r2.f988
            r1.m2982(r0)
            cr0 r0 = p000.cr0.f2726
            r1.m2984(r0)
            super.onSaveInstanceState(r3)
            return
    }

    /* JADX INFO: renamed from: δ */
    public p000.jr0 mo192() {
            r0 = this;
            jr0 r0 = r0.f988
            return r0
    }
}
