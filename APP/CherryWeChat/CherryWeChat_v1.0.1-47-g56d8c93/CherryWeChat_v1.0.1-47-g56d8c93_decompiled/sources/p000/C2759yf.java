package p000;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: yf */
/* JADX INFO: loaded from: classes.dex */
public final class C2759yf implements KeyListener {

    /* JADX INFO: renamed from: a */
    public final KeyListener f9393a;

    /* JADX INFO: renamed from: b */
    public final C2220m6 f9394b;

    public C2759yf(KeyListener keyListener) {
        C2220m6 c2220m6 = new C2220m6(19);
        this.f9393a = keyListener;
        this.f9394b = c2220m6;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f9393a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f9393a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        this.f9394b.getClass();
        if (i != 67 ? i != 112 ? false : C2656w4.m5190l(editable, keyEvent, true) : C2656w4.m5190l(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        return z || this.f9393a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f9393a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f9393a.onKeyUp(view, editable, i, keyEvent);
    }
}
