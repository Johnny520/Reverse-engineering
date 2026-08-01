package p014H;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C0396k;

/* JADX INFO: renamed from: H.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0151j implements TextWatcher {

    /* JADX INFO: renamed from: b */
    public final EditText f461b;

    /* JADX INFO: renamed from: c */
    public C0150i f462c;

    /* JADX INFO: renamed from: d */
    public boolean f463d = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0151j(EditText editText) {
        this.f461b = editText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m337a(EditText editText, int i2) {
        int length;
        if (i2 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0396k c0396kM761a = C0396k.m761a();
            if (editableText == null) {
                length = 0;
            } else {
                c0396kM761a.getClass();
                length = editableText.length();
            }
            c0396kM761a.m765e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        EditText editText = this.f461b;
        if (editText.isInEditMode() || !this.f463d || C0396k.f1174j == null || i3 > i4 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iM762b = C0396k.m761a().m762b();
        if (iM762b != 0) {
            if (iM762b == 1) {
                C0396k.m761a().m765e((Spannable) charSequence, i2, i4 + i2);
                return;
            } else if (iM762b != 3) {
                return;
            }
        }
        C0396k c0396kM761a = C0396k.m761a();
        if (this.f462c == null) {
            this.f462c = new C0150i(editText);
        }
        c0396kM761a.m766f(this.f462c);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
