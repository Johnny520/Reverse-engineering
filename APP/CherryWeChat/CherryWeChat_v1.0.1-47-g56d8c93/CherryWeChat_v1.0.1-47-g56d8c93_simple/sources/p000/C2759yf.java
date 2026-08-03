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

    public C2759yf(KeyListener r3) {
        C2220m6 r0 = new C2220m6(19);
        this.f9393a = r3;
        this.f9394b = r0;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View r2, Editable r3, int r4) {
        this.f9393a.clearMetaKeyState(r2, r3, r4);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f9393a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View r4, Editable r5, int r6, KeyEvent r7) {
        this.f9394b.getClass();
        if (r6 != 67) goto L5;
        boolean r0 = C2656w4.m5190l(r5, r7, false);
    L9:
        if (r0 == false) goto L11;
        MetaKeyKeyListener.adjustMetaAfterKeypress(r5);
        boolean r02 = true;
    L12:
        if (r02 == false) goto L14;
    L17:
        return true;
    L14:
        if (this.f9393a.onKeyDown(r4, r5, r6, r7) == true) goto L17;
        return false;
    L11:
        r02 = false;
        goto L12
    L5:
        if (r6 == 112) goto L7;
        r0 = false;
        goto L9
    L7:
        r0 = C2656w4.m5190l(r5, r7, true);
        goto L9
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View r2, Editable r3, KeyEvent r4) {
        return this.f9393a.onKeyOther(r2, r3, r4);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View r2, Editable r3, int r4, KeyEvent r5) {
        return this.f9393a.onKeyUp(r2, r3, r4, r5);
    }
}
