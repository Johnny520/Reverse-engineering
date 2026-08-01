package p182;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p183.AbstractC8539;
import p183.C8542;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8511 extends AbstractC8539 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final WeakReference f21203;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final WeakReference f21204;

    public RunnableC8511(TextView textView, C8510 c8510) {
        this.f21204 = new WeakReference(textView);
        this.f21203 = new WeakReference(c8510);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f21204.get();
        InputFilter inputFilter = (InputFilter) this.f21203.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C8542 c8542M13569 = C8542.m13569();
                    if (text == null) {
                        length = 0;
                    } else {
                        c8542M13569.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM13575 = c8542M13569.m13575(0, length, 0, text);
                    if (text == charSequenceM13575) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM13575);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM13575);
                    textView.setText(charSequenceM13575);
                    if (charSequenceM13575 instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM13575;
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

    @Override // p183.AbstractC8539
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo13549() {
        Handler handler;
        TextView textView = (TextView) this.f21204.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }
}
