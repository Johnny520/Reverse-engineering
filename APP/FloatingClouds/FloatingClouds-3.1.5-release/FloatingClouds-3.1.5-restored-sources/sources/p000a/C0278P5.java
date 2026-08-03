package p000a;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: a.P5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0278P5 implements KeyListener {

    /* JADX INFO: renamed from: a */
    public final KeyListener f967a;

    /* JADX INFO: renamed from: b */
    public final a f968b;

    /* JADX INFO: renamed from: a.P5$a */
    public static class a {
    }

    public C0278P5(KeyListener keyListener) {
        a aVar = new a();
        this.f967a = keyListener;
        this.f968b = aVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f967a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f967a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        this.f968b.getClass();
        if (i != 67 ? i != 112 ? false : C0296Q5.m836a(editable, keyEvent, true) : C0296Q5.m836a(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        return z || this.f967a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f967a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f967a.onKeyUp(view, editable, i, keyEvent);
    }
}
