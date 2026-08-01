package p166;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p167.AbstractC7710;
import p167.C7713;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7682 extends AbstractC7710 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final WeakReference f20858;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final WeakReference f20859;

    public RunnableC7682(TextView textView, C7681 c7681) {
        this.f20859 = new WeakReference(textView);
        this.f20858 = new WeakReference(c7681);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f20859.get();
        InputFilter inputFilter = (InputFilter) this.f20858.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C7713 c7713M13010 = C7713.m13010();
                    if (text == null) {
                        length = 0;
                    } else {
                        c7713M13010.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM13016 = c7713M13010.m13016(0, length, 0, text);
                    if (text == charSequenceM13016) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM13016);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM13016);
                    textView.setText(charSequenceM13016);
                    if (charSequenceM13016 instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM13016;
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

    @Override // p167.AbstractC7710
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo12990() {
        Handler handler;
        TextView textView = (TextView) this.f20859.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }
}
