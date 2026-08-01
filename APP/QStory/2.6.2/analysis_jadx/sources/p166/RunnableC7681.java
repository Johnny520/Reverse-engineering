package p166;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p167.AbstractC7709;
import p167.C7712;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7681 extends AbstractC7709 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final WeakReference f20863;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final WeakReference f20864;

    public RunnableC7681(TextView textView, C7680 c7680) {
        this.f20864 = new WeakReference(textView);
        this.f20863 = new WeakReference(c7680);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f20864.get();
        InputFilter inputFilter = (InputFilter) this.f20863.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C7712 c7712M12980 = C7712.m12980();
                    if (text == null) {
                        length = 0;
                    } else {
                        c7712M12980.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM12986 = c7712M12980.m12986(0, length, 0, text);
                    if (text == charSequenceM12986) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM12986);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM12986);
                    textView.setText(charSequenceM12986);
                    if (charSequenceM12986 instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM12986;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // p167.AbstractC7709
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo12958() {
        Handler handler;
        TextView textView = (TextView) this.f20864.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }
}
