package p014H;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import p012G.C0140d;

/* JADX INFO: renamed from: H.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0147f implements KeyListener {

    /* JADX INFO: renamed from: a */
    public final KeyListener f454a;

    /* JADX INFO: renamed from: b */
    public final C0140d f455b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0147f(KeyListener keyListener) {
        C0140d c0140d = new C0140d(2);
        this.f454a = keyListener;
        this.f455b = c0140d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i2) {
        this.f454a.clearMetaKeyState(view, editable, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f454a.getInputType();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i2, KeyEvent keyEvent) {
        boolean z2;
        this.f455b.getClass();
        if (i2 != 67 ? i2 != 112 ? false : C0142a.m316a(editable, keyEvent, true) : C0142a.m316a(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2 || this.f454a.onKeyDown(view, editable, i2, keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f454a.onKeyOther(view, editable, keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i2, KeyEvent keyEvent) {
        return this.f454a.onKeyUp(view, editable, i2, keyEvent);
    }
}
