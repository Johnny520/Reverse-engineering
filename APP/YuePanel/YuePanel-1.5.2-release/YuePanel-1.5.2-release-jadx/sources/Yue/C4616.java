package Yue;

import Yue.InterfaceC7144;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C8812;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
@InterfaceC7113(19)
public final class C4616 implements InputFilter {

    /* JADX INFO: renamed from: ۥ */
    public final TextView f1006;

    /* JADX INFO: renamed from: ۥ۟ */
    public C8812.AbstractC8818 f1007;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۦۥ$ۥ */
    @InterfaceC7113(19)
    public static class C0456 extends C8812.AbstractC8818 {

        /* JADX INFO: renamed from: ۥ */
        public final Reference<TextView> f1008;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Reference<C4616> f1009;

        public C0456(TextView textView, C4616 c4616) {
            this.f1008 = new WeakReference(textView);
            this.f1009 = new WeakReference(c4616);
        }

        @Override // androidx.emoji2.text.C8812.AbstractC8818
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo1574() {
            CharSequence text;
            CharSequence charSequenceM29641;
            super.mo1574();
            TextView textView = this.f1008.get();
            if (m13888(textView, this.f1009.get()) && textView.isAttachedToWindow() && text != (charSequenceM29641 = C8812.m29617().m29641((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(charSequenceM29641);
                int selectionEnd = Selection.getSelectionEnd(charSequenceM29641);
                textView.setText(charSequenceM29641);
                if (charSequenceM29641 instanceof Spannable) {
                    C4616.m1572((Spannable) charSequenceM29641, selectionStart, selectionEnd);
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final boolean m13888(@InterfaceC6490 TextView textView, @InterfaceC6490 InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }
    }

    public C4616(@InterfaceC6391 TextView textView) {
        this.f1006 = textView;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m1572(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.f1006.isInEditMode()) {
            return charSequence;
        }
        int iM29632 = C8812.m29617().m29632();
        if (iM29632 != 0) {
            if (iM29632 == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.f1006.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C8812.m29617().m29642(charSequence, 0, charSequence.length());
            }
            if (iM29632 != 3) {
                return charSequence;
            }
        }
        C8812.m29617().m29645(m1573());
        return charSequence;
    }

    /* JADX INFO: renamed from: ۥ */
    public final C8812.AbstractC8818 m1573() {
        if (this.f1007 == null) {
            this.f1007 = new C0456(this.f1006, this);
        }
        return this.f1007;
    }
}
