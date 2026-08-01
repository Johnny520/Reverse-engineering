package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0036a;
import p000.AbstractC0493mp;
import p000.InterfaceC0196eq;
import p000.InterfaceC0716sq;
import p000.u00;
import p000.w00;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends Activity implements InterfaceC0716sq, InterfaceC0196eq {

    /* JADX INFO: renamed from: a */
    public final C0036a f402a = new C0036a(this);

    @Override // p000.InterfaceC0196eq
    /* JADX INFO: renamed from: c */
    public final boolean mo214c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !AbstractC0493mp.m1861k(decorView, keyEvent)) {
            return AbstractC0493mp.m1862l(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !AbstractC0493mp.m1861k(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public C0036a mo105e() {
        return this.f402a;
    }

    /* JADX INFO: renamed from: f */
    public void mo114f() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = w00.f5023b;
        u00.m2424b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C0036a c0036a = this.f402a;
        c0036a.getClass();
        c0036a.m261c("markState");
        c0036a.m265g();
        super.onSaveInstanceState(bundle);
    }
}
