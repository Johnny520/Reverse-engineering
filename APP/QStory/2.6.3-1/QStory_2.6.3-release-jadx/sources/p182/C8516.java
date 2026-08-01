package p182;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import p183.C8542;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8516 implements TextWatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public RunnableC8514 f21212;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f21213 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final EditText f21214;

    public C8516(EditText editText) {
        this.f21214 = editText;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m13550(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C8542 c8542M13569 = C8542.m13569();
            if (editableText == null) {
                length = 0;
            } else {
                c8542M13569.getClass();
                length = editableText.length();
            }
            c8542M13569.m13575(0, length, 0, editableText);
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
        EditText editText = this.f21214;
        if (!editText.isInEditMode() && this.f21213 && C8542.m13568() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iM13572 = C8542.m13569().m13572();
            if (iM13572 != 0) {
                if (iM13572 == 1) {
                    C8542.m13569().m13575(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (iM13572 != 3) {
                    return;
                }
            }
            C8542 c8542M13569 = C8542.m13569();
            if (this.f21212 == null) {
                this.f21212 = new RunnableC8514(editText);
            }
            c8542M13569.m13574(this.f21212);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
