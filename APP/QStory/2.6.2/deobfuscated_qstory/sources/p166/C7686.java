package p166;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import p167.C7712;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7686 implements TextWatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public RunnableC7684 f20872;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f20873 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final EditText f20874;

    public C7686(EditText editText) {
        this.f20874 = editText;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12959(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C7712 c7712M12980 = C7712.m12980();
            if (editableText == null) {
                length = 0;
            } else {
                c7712M12980.getClass();
                length = editableText.length();
            }
            c7712M12980.m12986(0, length, 0, editableText);
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
        EditText editText = this.f20874;
        if (!editText.isInEditMode() && this.f20873 && C7712.m12979() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iM12983 = C7712.m12980().m12983();
            if (iM12983 != 0) {
                if (iM12983 == 1) {
                    C7712.m12980().m12986(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (iM12983 != 3) {
                    return;
                }
            }
            C7712 c7712M12980 = C7712.m12980();
            if (this.f20872 == null) {
                this.f20872 = new RunnableC7684(editText);
            }
            c7712M12980.m12985(this.f20872);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
