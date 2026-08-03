package p025N;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import p018J0.C0234d;
import p089x0.C1121e;

/* JADX INFO: renamed from: N.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0254e implements KeyListener {

    /* JADX INFO: renamed from: a */
    public final KeyListener f535a;

    /* JADX INFO: renamed from: b */
    public final C1121e f536b;

    public C0254e(KeyListener keyListener) {
        C1121e c1121e = new C1121e(5);
        this.f535a = keyListener;
        this.f536b = c1121e;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i2) {
        this.f535a.clearMetaKeyState(view, editable, i2);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f535a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i2, KeyEvent keyEvent) {
        boolean z2;
        this.f536b.getClass();
        if (i2 != 67 ? i2 != 112 ? false : C0234d.m637c(editable, keyEvent, true) : C0234d.m637c(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2 || this.f535a.onKeyDown(view, editable, i2, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f535a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i2, KeyEvent keyEvent) {
        return this.f535a.onKeyUp(view, editable, i2, keyEvent);
    }
}
