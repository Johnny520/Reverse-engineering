package p025N;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C0485j;

/* JADX INFO: renamed from: N.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0258i implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final EditText f543a;

    /* JADX INFO: renamed from: c */
    public C0257h f545c;

    /* JADX INFO: renamed from: b */
    public final boolean f544b = false;

    /* JADX INFO: renamed from: d */
    public boolean f546d = true;

    public C0258i(EditText editText) {
        this.f543a = editText;
    }

    /* JADX INFO: renamed from: a */
    public static void m687a(EditText editText, int i2) {
        int length;
        if (i2 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0485j c0485jM1199a = C0485j.m1199a();
            if (editableText == null) {
                length = 0;
            } else {
                c0485jM1199a.getClass();
                length = editableText.length();
            }
            c0485jM1199a.m1204f(editableText, 0, length);
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
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        EditText editText = this.f543a;
        if (editText.isInEditMode() || !this.f546d) {
            return;
        }
        if ((this.f544b || C0485j.f1354k != null) && i3 <= i4 && (charSequence instanceof Spannable)) {
            int iM1200b = C0485j.m1199a().m1200b();
            if (iM1200b != 0) {
                if (iM1200b == 1) {
                    C0485j.m1199a().m1204f((Spannable) charSequence, i2, i4 + i2);
                    return;
                } else if (iM1200b != 3) {
                    return;
                }
            }
            C0485j c0485jM1199a = C0485j.m1199a();
            if (this.f545c == null) {
                this.f545c = new C0257h(editText);
            }
            c0485jM1199a.m1205g(this.f545c);
        }
    }
}
