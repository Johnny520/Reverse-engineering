package yyds;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: yyds.ᛴᛱᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0788 extends AbstractC0505 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final WeakReference f3626;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final WeakReference f3627;

    public C0788(TextView textView, C2216 c2216) {
        this.f3626 = new WeakReference(textView);
        this.f3627 = new WeakReference(c2216);
    }

    @Override // yyds.AbstractC0505
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo1356() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f3626.get();
        InputFilter inputFilter = (InputFilter) this.f3627.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C0331 c0331M1001 = C0331.m1001();
                    if (text == null) {
                        length = 0;
                    } else {
                        c0331M1001.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM1002 = c0331M1001.m1002(text, 0, length);
                    if (text == charSequenceM1002) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM1002);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM1002);
                    textView.setText(charSequenceM1002);
                    if (charSequenceM1002 instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM1002;
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
