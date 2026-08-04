package yyds;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: renamed from: yyds.ᛲᛴᲈᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0341 implements TextWatcher {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f1785 = true;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final EditText f1786;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public C1980 f1787;

    public C0341(EditText editText) {
        this.f1786 = editText;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m1026(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0331 c0331M1001 = C0331.m1001();
            if (editableText == null) {
                length = 0;
            } else {
                c0331M1001.getClass();
                length = editableText.length();
            }
            c0331M1001.m1002(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.f1786;
        if (editText.isInEditMode() || !this.f1785 || C0331.f1745 == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iM1003 = C0331.m1001().m1003();
        if (iM1003 != 0) {
            if (iM1003 == 1) {
                C0331.m1001().m1002((Spannable) charSequence, i, i3 + i);
                return;
            } else if (iM1003 != 3) {
                return;
            }
        }
        C0331 c0331M1001 = C0331.m1001();
        C1980 c1980 = this.f1787;
        if (c1980 == null) {
            c1980 = new C1980(editText);
            this.f1787 = c1980;
        }
        c0331M1001.m1005(c1980);
    }
}
