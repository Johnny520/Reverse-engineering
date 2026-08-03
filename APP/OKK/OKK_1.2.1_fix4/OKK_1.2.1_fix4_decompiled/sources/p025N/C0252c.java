package p025N;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.AbstractC0483h;
import androidx.emoji2.text.C0485j;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: N.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0252c extends AbstractC0483h {

    /* JADX INFO: renamed from: a */
    public final WeakReference f531a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f532b;

    public C0252c(TextView textView, C0253d c0253d) {
        this.f531a = new WeakReference(textView);
        this.f532b = new WeakReference(c0253d);
    }

    @Override // androidx.emoji2.text.AbstractC0483h
    /* JADX INFO: renamed from: b */
    public final void mo685b() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f531a.get();
        InputFilter inputFilter = (InputFilter) this.f532b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C0485j c0485jM1199a = C0485j.m1199a();
                    if (text == null) {
                        length = 0;
                    } else {
                        c0485jM1199a.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM1204f = c0485jM1199a.m1204f(text, 0, length);
                    if (text == charSequenceM1204f) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM1204f);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM1204f);
                    textView.setText(charSequenceM1204f);
                    if (charSequenceM1204f instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM1204f;
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
