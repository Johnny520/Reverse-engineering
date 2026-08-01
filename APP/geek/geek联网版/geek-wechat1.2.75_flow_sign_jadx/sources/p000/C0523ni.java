package p000;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: renamed from: ni */
/* JADX INFO: loaded from: classes.dex */
public final class C0523ni implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final TextView f3298a;

    /* JADX INFO: renamed from: b */
    public C0486mi f3299b;

    public C0523ni(TextView textView) {
        this.f3298a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f3298a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM1278b = C0262gi.m1277a().m1278b();
        if (iM1278b != 0) {
            if (iM1278b == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C0262gi.m1277a().m1281e(charSequence, 0, charSequence.length());
            }
            if (iM1278b != 3) {
                return charSequence;
            }
        }
        C0262gi c0262giM1277a = C0262gi.m1277a();
        if (this.f3299b == null) {
            this.f3299b = new C0486mi(textView, this);
        }
        c0262giM1277a.m1282f(this.f3299b);
        return charSequence;
    }
}
