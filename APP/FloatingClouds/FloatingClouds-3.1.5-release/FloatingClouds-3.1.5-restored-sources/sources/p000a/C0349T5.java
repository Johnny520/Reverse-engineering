package p000a;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C1094c;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: a.T5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0349T5 implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final EditText f1240a;

    /* JADX INFO: renamed from: b */
    public a f1241b;

    /* JADX INFO: renamed from: c */
    public boolean f1242c = true;

    /* JADX INFO: renamed from: a.T5$a */
    public static class a extends C1094c.e {

        /* JADX INFO: renamed from: a */
        public final WeakReference f1243a;

        public a(EditText editText) {
            this.f1243a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.C1094c.e
        /* JADX INFO: renamed from: b */
        public final void mo746b() throws Throwable {
            C0349T5.m942a((EditText) this.f1243a.get(), 1);
        }
    }

    public C0349T5(EditText editText) {
        this.f1240a = editText;
    }

    /* JADX INFO: renamed from: a */
    public static void m942a(EditText editText, int i) throws Throwable {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C1094c c1094cM2505a = C1094c.m2505a();
            if (editableText == null) {
                length = 0;
            } else {
                c1094cM2505a.getClass();
                length = editableText.length();
            }
            c1094cM2505a.m2509e(editableText, 0, length);
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
        EditText editText = this.f1240a;
        if (editText.isInEditMode() || !this.f1242c || C1094c.f4484k == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iM2506b = C1094c.m2505a().m2506b();
        if (iM2506b != 0) {
            if (iM2506b == 1) {
                C1094c.m2505a().m2509e((Spannable) charSequence, i, i3 + i);
                return;
            } else if (iM2506b != 3) {
                return;
            }
        }
        C1094c c1094cM2505a = C1094c.m2505a();
        if (this.f1241b == null) {
            this.f1241b = new a(editText);
        }
        c1094cM2505a.m2510f(this.f1241b);
    }
}
