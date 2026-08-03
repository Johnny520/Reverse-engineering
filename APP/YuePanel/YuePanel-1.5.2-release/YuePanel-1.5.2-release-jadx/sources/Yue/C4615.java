package Yue;

import Yue.InterfaceC7144;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.C8812;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(19)
public final class C4615 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ۥ */
    public final TextView f1004;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C0455 f1005;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۦۤ$ۥ */
    public static class C0455 {
        /* JADX INFO: renamed from: ۥ */
        public boolean m1570(@InterfaceC6391 InputConnection inputConnection, @InterfaceC6391 Editable editable, @InterfaceC5459(from = 0) int i, @InterfaceC5459(from = 0) int i2, boolean z) {
            return C8812.m29618(inputConnection, editable, i, i2, z);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m1571(@InterfaceC6391 EditorInfo editorInfo) {
            if (C8812.m29623()) {
                C8812.m29617().m29647(editorInfo);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4615(@InterfaceC6391 TextView textView, @InterfaceC6391 InputConnection inputConnection, @InterfaceC6391 EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new C0455());
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        return this.f1005.m1570(this, m1569(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return this.f1005.m1570(this, m1569(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }

    /* JADX INFO: renamed from: ۥ */
    public final Editable m1569() {
        return this.f1004.getEditableText();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4615(@InterfaceC6391 TextView textView, @InterfaceC6391 InputConnection inputConnection, @InterfaceC6391 EditorInfo editorInfo, @InterfaceC6391 C0455 c0455) {
        super(inputConnection, false);
        this.f1004 = textView;
        this.f1005 = c0455;
        c0455.m1571(editorInfo);
    }
}
