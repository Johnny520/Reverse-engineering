package p000;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: wf */
/* JADX INFO: loaded from: classes.dex */
public final class C2673wf extends AbstractC2278nf {

    /* JADX INFO: renamed from: a */
    public final WeakReference f9232a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f9233b;

    public C2673wf(TextView textView, C2716xf c2716xf) {
        this.f9232a = new WeakReference(textView);
        this.f9233b = new WeakReference(c2716xf);
    }

    @Override // p000.AbstractC2278nf
    /* JADX INFO: renamed from: b */
    public final void mo296b() throws Throwable {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f9232a.get();
        InputFilter inputFilter = (InputFilter) this.f9233b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C2372pf c2372pfM4798a = C2372pf.m4798a();
                    if (text == null) {
                        length = 0;
                    } else {
                        c2372pfM4798a.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM4802e = c2372pfM4798a.m4802e(text, 0, length);
                    if (text == charSequenceM4802e) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM4802e);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM4802e);
                    textView.setText(charSequenceM4802e);
                    if (charSequenceM4802e instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM4802e;
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
