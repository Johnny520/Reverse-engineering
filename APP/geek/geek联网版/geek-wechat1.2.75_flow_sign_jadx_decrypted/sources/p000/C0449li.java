package p000;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: li */
/* JADX INFO: loaded from: classes.dex */
public final class C0449li extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final EditText f3004a;

    /* JADX INFO: renamed from: b */
    public final C0893xh f3005b;

    public C0449li(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C0893xh c0893xh = new C0893xh(20);
        super(inputConnection, false);
        this.f3004a = editText;
        this.f3005b = c0893xh;
        if (C0262gi.f1988j != null) {
            C0262gi c0262giM1277a = C0262gi.m1277a();
            if (c0262giM1277a.m1278b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C0069bi c0069bi = c0262giM1277a.f1993e;
            c0069bi.getClass();
            Bundle bundle = editorInfo.extras;
            C0165dw c0165dw = (C0165dw) c0069bi.f732c.f2794a;
            int iM2795a = c0165dw.m2795a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM2795a != 0 ? ((ByteBuffer) c0165dw.f5550d).getInt(iM2795a + c0165dw.f5547a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f3004a.getEditableText();
        this.f3005b.getClass();
        return C0893xh.m2694o(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f3004a.getEditableText();
        this.f3005b.getClass();
        return C0893xh.m2694o(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
