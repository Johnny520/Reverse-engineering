package p223p3;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC0668k;
import androidx.lifecycle.C0680q;
import androidx.lifecycle.FragmentC0690z;
import androidx.lifecycle.InterfaceC0676o;
import p117i.C3059h1;
import p336x3.AbstractC9383e;

/* JADX INFO: renamed from: p3.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC5946a extends Activity implements InterfaceC0676o, AbstractC9383e.a {

    /* JADX INFO: renamed from: q */
    public final C3059h1 f18862q = new C3059h1(0, 1, null);

    /* JADX INFO: renamed from: r */
    public final C0680q f18863r = new C0680q(this);

    @Override // p336x3.AbstractC9383e.a
    /* JADX INFO: renamed from: d */
    public boolean mo23920d(KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (AbstractC9383e.m36517d(decorView, keyEvent)) {
            return true;
        }
        return AbstractC9383e.m36518e(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (AbstractC9383e.m36517d(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC0690z.INSTANCE.m2713c(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        this.f18863r.m2672m(AbstractC0668k.b.f1970s);
        super.onSaveInstanceState(bundle);
    }
}
