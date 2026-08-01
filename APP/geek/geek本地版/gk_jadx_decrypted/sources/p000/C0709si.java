package p000;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: renamed from: si */
/* JADX INFO: loaded from: classes.dex */
public final class C0709si implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final EditText f4437a;

    /* JADX INFO: renamed from: b */
    public C0672ri f4438b;

    /* JADX INFO: renamed from: c */
    public boolean f4439c = true;

    public C0709si(EditText editText) {
        this.f4437a = editText;
    }

    /* JADX INFO: renamed from: a */
    public static void m2331a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0188ei c0188eiM1029a = C0188ei.m1029a();
            if (editableText == null) {
                length = 0;
            } else {
                c0188eiM1029a.getClass();
                length = editableText.length();
            }
            c0188eiM1029a.m1033e(editableText, 0, length);
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
        EditText editText = this.f4437a;
        if (editText.isInEditMode() || !this.f4439c || C0188ei.f1777j == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iM1030b = C0188ei.m1029a().m1030b();
        if (iM1030b != 0) {
            if (iM1030b == 1) {
                C0188ei.m1029a().m1033e((Spannable) charSequence, i, i3 + i);
                return;
            } else if (iM1030b != 3) {
                return;
            }
        }
        C0188ei c0188eiM1029a = C0188ei.m1029a();
        if (this.f4438b == null) {
            this.f4438b = new C0672ri(editText);
        }
        c0188eiM1029a.m1034f(this.f4438b);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
