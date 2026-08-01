package p000;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ki */
/* JADX INFO: loaded from: classes.dex */
public final class C0412ki extends AbstractC0105ci {

    /* JADX INFO: renamed from: a */
    public final WeakReference f2902a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f2903b;

    public C0412ki(TextView textView, C0449li c0449li) {
        this.f2902a = new WeakReference(textView);
        this.f2903b = new WeakReference(c0449li);
    }

    @Override // p000.AbstractC0105ci
    /* JADX INFO: renamed from: a */
    public final void mo690a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f2902a.get();
        InputFilter inputFilter = (InputFilter) this.f2903b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C0188ei c0188eiM1029a = C0188ei.m1029a();
                    if (text == null) {
                        length = 0;
                    } else {
                        c0188eiM1029a.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM1033e = c0188eiM1029a.m1033e(text, 0, length);
                    if (text == charSequenceM1033e) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM1033e);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM1033e);
                    textView.setText(charSequenceM1033e);
                    if (charSequenceM1033e instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM1033e;
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
