package p000;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: renamed from: li */
/* JADX INFO: loaded from: classes.dex */
public final class C0449li implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final TextView f3058a;

    /* JADX INFO: renamed from: b */
    public C0412ki f3059b;

    public C0449li(TextView textView) {
        this.f3058a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f3058a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM1030b = C0188ei.m1029a().m1030b();
        if (iM1030b != 0) {
            if (iM1030b == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C0188ei.m1029a().m1033e(charSequence, 0, charSequence.length());
            }
            if (iM1030b != 3) {
                return charSequence;
            }
        }
        C0188ei c0188eiM1029a = C0188ei.m1029a();
        if (this.f3059b == null) {
            this.f3059b = new C0412ki(textView, this);
        }
        c0188eiM1029a.m1034f(this.f3059b);
        return charSequence;
    }
}
