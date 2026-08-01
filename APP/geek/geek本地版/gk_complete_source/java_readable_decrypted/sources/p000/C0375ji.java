package p000;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: ji */
/* JADX INFO: loaded from: classes.dex */
public final class C0375ji extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final EditText f2634a;

    /* JADX INFO: renamed from: b */
    public final C0819vh f2635b;

    public C0375ji(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C0819vh c0819vh = new C0819vh(18);
        super(inputConnection, false);
        this.f2634a = editText;
        this.f2635b = c0819vh;
        if (C0188ei.f1777j != null) {
            C0188ei c0188eiM1029a = C0188ei.m1029a();
            if (c0188eiM1029a.m1030b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C0967zh c0967zh = c0188eiM1029a.f1782e;
            c0967zh.getClass();
            Bundle bundle = editorInfo.extras;
            C0870wv c0870wv = (C0870wv) c0967zh.f5559c.f64a;
            int iM2359a = c0870wv.m2359a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM2359a != 0 ? ((ByteBuffer) c0870wv.f4513d).getInt(iM2359a + c0870wv.f4510a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f2634a.getEditableText();
        this.f2635b.getClass();
        return C0819vh.m2515i(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f2634a.getEditableText();
        this.f2635b.getClass();
        return C0819vh.m2515i(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
