package p000;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: mi */
/* JADX INFO: loaded from: classes.dex */
public final class C0486mi implements KeyListener {

    /* JADX INFO: renamed from: a */
    public final KeyListener f3218a;

    /* JADX INFO: renamed from: b */
    public final C0819vh f3219b;

    public C0486mi(KeyListener keyListener) {
        C0819vh c0819vh = new C0819vh(19);
        this.f3218a = keyListener;
        this.f3219b = c0819vh;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f3218a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f3218a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        this.f3219b.getClass();
        if (i != 67 ? i != 112 ? false : C0138d4.m868b(editable, keyEvent, true) : C0138d4.m868b(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        return z || this.f3218a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f3218a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f3218a.onKeyUp(view, editable, i, keyEvent);
    }
}
