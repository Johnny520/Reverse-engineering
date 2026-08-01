package p000;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: mi */
/* JADX INFO: loaded from: classes.dex */
public final class C0486mi extends AbstractC0188ei {

    /* JADX INFO: renamed from: a */
    public final WeakReference f3147a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f3148b;

    public C0486mi(TextView textView, C0523ni c0523ni) {
        this.f3147a = new WeakReference(textView);
        this.f3148b = new WeakReference(c0523ni);
    }

    @Override // p000.AbstractC0188ei
    /* JADX INFO: renamed from: a */
    public final void mo997a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f3147a.get();
        InputFilter inputFilter = (InputFilter) this.f3148b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C0262gi c0262giM1277a = C0262gi.m1277a();
                    if (text == null) {
                        length = 0;
                    } else {
                        c0262giM1277a.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM1281e = c0262giM1277a.m1281e(text, 0, length);
                    if (text == charSequenceM1281e) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM1281e);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM1281e);
                    textView.setText(charSequenceM1281e);
                    if (charSequenceM1281e instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM1281e;
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
