package p014H;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.AbstractC0393h;
import androidx.emoji2.text.C0396k;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: H.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0145d extends AbstractC0393h {

    /* JADX INFO: renamed from: a */
    public final WeakReference f450a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f451b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0145d(TextView textView, C0146e c0146e) {
        this.f450a = new WeakReference(textView);
        this.f451b = new WeakReference(c0146e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.emoji2.text.AbstractC0393h
    /* JADX INFO: renamed from: a */
    public final void mo335a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f450a.get();
        InputFilter inputFilter = (InputFilter) this.f451b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C0396k c0396kM761a = C0396k.m761a();
                    if (text == null) {
                        length = 0;
                    } else {
                        c0396kM761a.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM765e = c0396kM761a.m765e(text, 0, length);
                    if (text == charSequenceM765e) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM765e);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM765e);
                    textView.setText(charSequenceM765e);
                    if (charSequenceM765e instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM765e;
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
}
