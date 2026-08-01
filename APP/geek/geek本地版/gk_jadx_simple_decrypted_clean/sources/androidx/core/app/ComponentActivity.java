package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.a;
import defpackage.aq;
import defpackage.ip;
import defpackage.n00;
import defpackage.oq;
import defpackage.p00;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends Activity implements oq, aq {
    public final a a;

    public ComponentActivity() {
        this.a = new a(this);
    }

    @Override // defpackage.aq
    public final boolean c(KeyEvent r1) {
        return super.dispatchKeyEvent(r1);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent r3) {
        View r0 = getWindow().getDecorView();
        if (r0 == null) goto L9;
        if (ip.r(r0, r3) == false) goto L9;
        return true;
    L9:
        return ip.s(this, r0, this, r3);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent r2) {
        View r0 = getWindow().getDecorView();
        if (r0 == null) goto L9;
        if (ip.r(r0, r2) == false) goto L9;
        return true;
    L9:
        return super.dispatchKeyShortcutEvent(r2);
    }

    public a e() {
        return this.a;
    }

    public void f() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle r1) {
        super.onCreate(r1);
        int r12 = p00.b;
        n00.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle r3) {
        a r0 = this.a;
        r0.getClass();
        r0.c("markState");
        r0.g();
        super.onSaveInstanceState(r3);
    }
}
