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

    public C0254e(KeyListener r3) {
        C1121e r02 = new C1121e(5);
        this.f535a = r3;
        this.f536b = r02;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View r2, Editable r3, int r4) {
        this.f535a.clearMetaKeyState(r2, r3, r4);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f535a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View r4, Editable r5, int r6, KeyEvent r7) {
        this.f536b.getClass();
        if (r6 != 67) goto L5;
        boolean r02 = C0234d.m637c(r5, r7, false);
    L9:
        if (r02 == false) goto L11;
        MetaKeyKeyListener.adjustMetaAfterKeypress(r5);
        boolean r03 = true;
    L12:
        if (r03 == true) goto L16;
        if (this.f535a.onKeyDown(r4, r5, r6, r7) == true) goto L16;
        return false;
    L16:
        return true;
    L11:
        r03 = false;
        goto L12
    L5:
        if (r6 == 112) goto L7;
        r02 = false;
        goto L9
    L7:
        r02 = C0234d.m637c(r5, r7, true);
        goto L9
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View r2, Editable r3, KeyEvent r4) {
        return this.f535a.onKeyOther(r2, r3, r4);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View r2, Editable r3, int r4, KeyEvent r5) {
        return this.f535a.onKeyUp(r2, r3, r4, r5);
    }
}
