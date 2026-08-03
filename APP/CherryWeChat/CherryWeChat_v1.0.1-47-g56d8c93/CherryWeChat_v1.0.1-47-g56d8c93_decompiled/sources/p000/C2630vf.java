package p000;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: vf */
/* JADX INFO: loaded from: classes.dex */
public final class C2630vf extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final EditText f9137a;

    /* JADX INFO: renamed from: b */
    public final C2220m6 f9138b;

    public C2630vf(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C2220m6 c2220m6 = new C2220m6(18);
        super(inputConnection, false);
        this.f9137a = editText;
        this.f9138b = c2220m6;
        if (C2372pf.f8342k != null) {
            C2372pf c2372pfM4798a = C2372pf.m4798a();
            if (c2372pfM4798a.m4799b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C2192lf c2192lf = c2372pfM4798a.f8347e;
            c2192lf.getClass();
            Bundle bundle = editorInfo.extras;
            C0679Pr c0679Pr = (C0679Pr) c2192lf.f7646c.f8520a;
            int iM4624a = c0679Pr.m4624a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM4624a != 0 ? ((ByteBuffer) c0679Pr.f8037d).getInt(iM4624a + c0679Pr.f8034a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f9137a.getEditableText();
        this.f9138b.getClass();
        return C2220m6.m4465i(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f9137a.getEditableText();
        this.f9138b.getClass();
        return C2220m6.m4465i(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
