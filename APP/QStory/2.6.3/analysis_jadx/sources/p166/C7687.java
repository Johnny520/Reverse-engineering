package p166;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import p167.C7713;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7687 implements TextWatcher {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public RunnableC7685 f20867;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f20868 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final EditText f20869;

    public C7687(EditText editText) {
        this.f20869 = editText;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12991(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C7713 c7713M13010 = C7713.m13010();
            if (editableText == null) {
                length = 0;
            } else {
                c7713M13010.getClass();
                length = editableText.length();
            }
            c7713M13010.m13016(0, length, 0, editableText);
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
        EditText editText = this.f20869;
        if (!editText.isInEditMode() && this.f20868 && C7713.m13009() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iM13013 = C7713.m13010().m13013();
            if (iM13013 != 0) {
                if (iM13013 == 1) {
                    C7713.m13010().m13016(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (iM13013 != 3) {
                    return;
                }
            }
            C7713 c7713M13010 = C7713.m13010();
            if (this.f20867 == null) {
                this.f20867 = new RunnableC7685(editText);
            }
            c7713M13010.m13015(this.f20867);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
