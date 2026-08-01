package p000;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: renamed from: ui */
/* JADX INFO: loaded from: classes.dex */
public final class C0782ui implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final EditText f4827a;

    /* JADX INFO: renamed from: b */
    public C0745ti f4828b;

    /* JADX INFO: renamed from: c */
    public boolean f4829c = true;

    public C0782ui(EditText editText) {
        this.f4827a = editText;
    }

    /* JADX INFO: renamed from: a */
    public static void m2476a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0262gi c0262giM1277a = C0262gi.m1277a();
            if (editableText == null) {
                length = 0;
            } else {
                c0262giM1277a.getClass();
                length = editableText.length();
            }
            c0262giM1277a.m1281e(editableText, 0, length);
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
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.f4827a;
        if (editText.isInEditMode() || !this.f4829c || C0262gi.f1988j == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iM1278b = C0262gi.m1277a().m1278b();
        if (iM1278b != 0) {
            if (iM1278b == 1) {
                C0262gi.m1277a().m1281e((Spannable) charSequence, i, i3 + i);
                return;
            } else if (iM1278b != 3) {
                return;
            }
        }
        C0262gi c0262giM1277a = C0262gi.m1277a();
        if (this.f4828b == null) {
            this.f4828b = new C0745ti(editText);
        }
        c0262giM1277a.m1282f(this.f4828b);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
