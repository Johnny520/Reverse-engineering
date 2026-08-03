package p000;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: renamed from: Ef */
/* JADX INFO: loaded from: classes.dex */
public final class C0194Ef implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final EditText f593a;

    /* JADX INFO: renamed from: b */
    public C0151Df f594b;

    /* JADX INFO: renamed from: c */
    public boolean f595c = true;

    public C0194Ef(EditText editText) {
        this.f593a = editText;
    }

    /* JADX INFO: renamed from: a */
    public static void m387a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C2372pf c2372pfM4798a = C2372pf.m4798a();
            if (editableText == null) {
                length = 0;
            } else {
                c2372pfM4798a.getClass();
                length = editableText.length();
            }
            c2372pfM4798a.m4802e(editableText, 0, length);
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
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.f593a;
        if (editText.isInEditMode() || !this.f595c || C2372pf.f8342k == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iM4799b = C2372pf.m4798a().m4799b();
        if (iM4799b != 0) {
            if (iM4799b == 1) {
                C2372pf.m4798a().m4802e((Spannable) charSequence, i, i3 + i);
                return;
            } else if (iM4799b != 3) {
                return;
            }
        }
        C2372pf c2372pfM4798a = C2372pf.m4798a();
        if (this.f594b == null) {
            this.f594b = new C0151Df(editText);
        }
        c2372pfM4798a.m4803f(this.f594b);
    }
}
