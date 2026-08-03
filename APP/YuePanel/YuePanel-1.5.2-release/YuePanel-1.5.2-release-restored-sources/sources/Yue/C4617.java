package Yue;

import Yue.InterfaceC7144;
import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.C8812;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(19)
public final class C4617 implements KeyListener {

    /* JADX INFO: renamed from: ۥ */
    public final KeyListener f1010;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C0457 f1011;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۦۦ$ۥ */
    public static class C0457 {
        /* JADX INFO: renamed from: ۥ */
        public boolean m1575(@InterfaceC6391 Editable editable, int i, @InterfaceC6391 KeyEvent keyEvent) {
            return C8812.m29619(editable, i, keyEvent);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4617(KeyListener keyListener) {
        this(keyListener, new C0457());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.f1010.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f1010.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f1011.m1575(editable, i, keyEvent) || this.f1010.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f1010.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f1010.onKeyUp(view, editable, i, keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4617(KeyListener keyListener, C0457 c0457) {
        this.f1010 = keyListener;
        this.f1011 = c0457;
    }
}
