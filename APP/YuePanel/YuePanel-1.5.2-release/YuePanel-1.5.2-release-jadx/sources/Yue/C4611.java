package Yue;

import Yue.InterfaceC7144;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4611 {

    /* JADX INFO: renamed from: ۥ */
    public final C0451 f996;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f997;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f9892;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۦ۠$ۥ */
    @InterfaceC7113(19)
    public static class C0450 extends C0451 {

        /* JADX INFO: renamed from: ۥ */
        public final EditText f998;

        /* JADX INFO: renamed from: ۥ۟ */
        public final C4625 f999;

        public C0450(@InterfaceC6391 EditText editText, boolean z) {
            this.f998 = editText;
            C4625 c4625 = new C4625(editText, z);
            this.f999 = c4625;
            editText.addTextChangedListener(c4625);
            editText.setEditableFactory(C4612.getInstance());
        }

        @Override // Yue.C4611.C0451
        /* JADX INFO: renamed from: ۥ */
        public KeyListener mo1564(@InterfaceC6490 KeyListener keyListener) {
            if (keyListener instanceof C4617) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new C4617(keyListener);
        }

        @Override // Yue.C4611.C0451
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo1565() {
            return this.f999.m13914();
        }

        @Override // Yue.C4611.C0451
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public InputConnection mo13884(@InterfaceC6391 InputConnection inputConnection, @InterfaceC6391 EditorInfo editorInfo) {
            return inputConnection instanceof C4615 ? inputConnection : new C4615(this.f998, inputConnection, editorInfo);
        }

        @Override // Yue.C4611.C0451
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo13885(int i) {
            this.f999.m13915(i);
        }

        @Override // Yue.C4611.C0451
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo13886(boolean z) {
            this.f999.m13916(z);
        }

        @Override // Yue.C4611.C0451
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void mo13887(int i) {
            this.f999.m13917(i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۦ۠$ۥ۟ */
    public static class C0451 {
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public KeyListener mo1564(@InterfaceC6490 KeyListener keyListener) {
            return keyListener;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo1565() {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟ */
        public InputConnection mo13884(@InterfaceC6391 InputConnection inputConnection, @InterfaceC6391 EditorInfo editorInfo) {
            return inputConnection;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public void mo13885(int i) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo13886(boolean z) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public void mo13887(int i) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4611(@InterfaceC6391 EditText editText) {
        this(editText, true);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    /* JADX INFO: renamed from: ۥ */
    public int m1562() {
        return this.f9892;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public KeyListener m1563(@InterfaceC6490 KeyListener keyListener) {
        return this.f996.mo1564(keyListener);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m13878() {
        return this.f997;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m13879() {
        return this.f996.mo1565();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public InputConnection m13880(@InterfaceC6490 InputConnection inputConnection, @InterfaceC6391 EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f996.mo13884(inputConnection, editorInfo);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m13881(int i) {
        this.f9892 = i;
        this.f996.mo13885(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m13882(boolean z) {
        this.f996.mo13886(z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m13883(@InterfaceC5459(from = 0) int i) {
        C6740.m21413(i, "maxEmojiCount should be greater than 0");
        this.f997 = i;
        this.f996.mo13887(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4611(@InterfaceC6391 EditText editText, boolean z) {
        this.f997 = Integer.MAX_VALUE;
        this.f9892 = 0;
        C6740.m21416(editText, "editText cannot be null");
        this.f996 = new C0450(editText, z);
    }
}
