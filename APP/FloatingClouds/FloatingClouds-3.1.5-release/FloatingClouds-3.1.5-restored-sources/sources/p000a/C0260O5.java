package p000a;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C1094c;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: a.O5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0260O5 implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final TextView f941a;

    /* JADX INFO: renamed from: b */
    public a f942b;

    /* JADX INFO: renamed from: a.O5$a */
    public static class a extends C1094c.e {

        /* JADX INFO: renamed from: a */
        public final WeakReference f943a;

        /* JADX INFO: renamed from: b */
        public final WeakReference f944b;

        public a(TextView textView, C0260O5 c0260o5) {
            this.f943a = new WeakReference(textView);
            this.f944b = new WeakReference(c0260o5);
        }

        @Override // androidx.emoji2.text.C1094c.e
        /* JADX INFO: renamed from: b */
        public final void mo746b() throws Throwable {
            InputFilter[] filters;
            int length;
            TextView textView = (TextView) this.f943a.get();
            InputFilter inputFilter = (InputFilter) this.f944b.get();
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    if (textView.isAttachedToWindow()) {
                        CharSequence text = textView.getText();
                        C1094c c1094cM2505a = C1094c.m2505a();
                        if (text == null) {
                            length = 0;
                        } else {
                            c1094cM2505a.getClass();
                            length = text.length();
                        }
                        CharSequence charSequenceM2509e = c1094cM2505a.m2509e(text, 0, length);
                        if (text == charSequenceM2509e) {
                            return;
                        }
                        int selectionStart = Selection.getSelectionStart(charSequenceM2509e);
                        int selectionEnd = Selection.getSelectionEnd(charSequenceM2509e);
                        textView.setText(charSequenceM2509e);
                        if (charSequenceM2509e instanceof Spannable) {
                            Spannable spannable = (Spannable) charSequenceM2509e;
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

    public C0260O5(TextView textView) {
        this.f941a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f941a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM2506b = C1094c.m2505a().m2506b();
        if (iM2506b != 0) {
            if (iM2506b == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C1094c.m2505a().m2509e(charSequence, 0, charSequence.length());
            }
            if (iM2506b != 3) {
                return charSequence;
            }
        }
        C1094c c1094cM2505a = C1094c.m2505a();
        if (this.f942b == null) {
            this.f942b = new a(textView, this);
        }
        c1094cM2505a.m2510f(this.f942b);
        return charSequence;
    }
}
