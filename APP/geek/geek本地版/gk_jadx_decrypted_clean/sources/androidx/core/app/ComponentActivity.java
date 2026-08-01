package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0036a;
import p000.AbstractC0346ip;
import p000.InterfaceC0040aq;
import p000.InterfaceC0568oq;
import p000.n00;
import p000.p00;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends Activity implements InterfaceC0568oq, InterfaceC0040aq {

    /* JADX INFO: renamed from: a */
    public final C0036a f439a = new C0036a(this);

    @Override // p000.InterfaceC0040aq
    /* JADX INFO: renamed from: c */
    public final boolean mo229c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !AbstractC0346ip.m1506r(decorView, keyEvent)) {
            return AbstractC0346ip.m1507s(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !AbstractC0346ip.m1506r(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public C0036a mo120e() {
        return this.f439a;
    }

    /* JADX INFO: renamed from: f */
    public void mo129f() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = p00.f3627b;
        n00.m1881b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C0036a c0036a = this.f439a;
        c0036a.getClass();
        c0036a.m276c("markState");
        c0036a.m280g();
        super.onSaveInstanceState(bundle);
    }
}
