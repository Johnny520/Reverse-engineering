package p000;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: renamed from: xf */
/* JADX INFO: loaded from: classes.dex */
public final class C2716xf implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final TextView f9293a;

    /* JADX INFO: renamed from: b */
    public C2673wf f9294b;

    public C2716xf(TextView textView) {
        this.f9293a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f9293a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM4799b = C2372pf.m4798a().m4799b();
        if (iM4799b != 0) {
            if (iM4799b == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C2372pf.m4798a().m4802e(charSequence, 0, charSequence.length());
            }
            if (iM4799b != 3) {
                return charSequence;
            }
        }
        C2372pf c2372pfM4798a = C2372pf.m4798a();
        if (this.f9294b == null) {
            this.f9294b = new C2673wf(textView, this);
        }
        c2372pfM4798a.m4803f(this.f9294b);
        return charSequence;
    }
}
