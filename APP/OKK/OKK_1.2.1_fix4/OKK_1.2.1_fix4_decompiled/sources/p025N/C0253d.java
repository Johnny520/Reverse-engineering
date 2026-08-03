package p025N;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C0485j;

/* JADX INFO: renamed from: N.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0253d implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final TextView f533a;

    /* JADX INFO: renamed from: b */
    public C0252c f534b;

    public C0253d(TextView textView) {
        this.f533a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        TextView textView = this.f533a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM1200b = C0485j.m1199a().m1200b();
        if (iM1200b != 0) {
            if (iM1200b == 1) {
                if ((i5 == 0 && i4 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i2 != 0 || i3 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i2, i3);
                }
                return C0485j.m1199a().m1204f(charSequence, 0, charSequence.length());
            }
            if (iM1200b != 3) {
                return charSequence;
            }
        }
        C0485j c0485jM1199a = C0485j.m1199a();
        if (this.f534b == null) {
            this.f534b = new C0252c(textView, this);
        }
        c0485jM1199a.m1205g(this.f534b);
        return charSequence;
    }
}
