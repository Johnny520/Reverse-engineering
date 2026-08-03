package Yue;

import Yue.C6898;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3307 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    public final EditText f208;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6391
    public final C4611 f209;

    public C3307(@InterfaceC6391 EditText editText) {
        this.f208 = editText;
        this.f209 = new C4611(editText, false);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public KeyListener m374(@InterfaceC6490 KeyListener keyListener) {
        return m375(keyListener) ? this.f209.m1563(keyListener) : keyListener;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean m375(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m6762() {
        return this.f209.m13879();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m6763(@InterfaceC6490 AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f208.getContext().obtainStyledAttributes(attributeSet, C6898.C6909.f19438, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(C6898.C6909.f19453) ? typedArrayObtainStyledAttributes.getBoolean(C6898.C6909.f19453, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m6765(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public InputConnection m6764(@InterfaceC6490 InputConnection inputConnection, @InterfaceC6391 EditorInfo editorInfo) {
        return this.f209.m13880(inputConnection, editorInfo);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m6765(boolean z) {
        this.f209.m13882(z);
    }
}
