package p000;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: oi */
/* JADX INFO: loaded from: classes.dex */
public final class C0560oi implements KeyListener {

    /* JADX INFO: renamed from: a */
    public final KeyListener f3463a;

    /* JADX INFO: renamed from: b */
    public final C0893xh f3464b;

    public C0560oi(KeyListener keyListener) {
        C0893xh c0893xh = new C0893xh(21);
        this.f3463a = keyListener;
        this.f3464b = c0893xh;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f3463a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f3463a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        this.f3464b.getClass();
        if (i != 67 ? i != 112 ? false : C0138d4.m827b(editable, keyEvent, true) : C0138d4.m827b(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        return z || this.f3463a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f3463a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f3463a.onKeyUp(view, editable, i, keyEvent);
    }
}
