package p014H;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C0396k;

/* JADX INFO: renamed from: H.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0146e implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final TextView f452a;

    /* JADX INFO: renamed from: b */
    public C0145d f453b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0146e(TextView textView) {
        this.f452a = textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        TextView textView = this.f452a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM762b = C0396k.m761a().m762b();
        if (iM762b != 0) {
            if (iM762b == 1) {
                if ((i5 == 0 && i4 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i2 != 0 || i3 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i2, i3);
                }
                return C0396k.m761a().m765e(charSequence, 0, charSequence.length());
            }
            if (iM762b != 3) {
                return charSequence;
            }
        }
        C0396k c0396kM761a = C0396k.m761a();
        if (this.f453b == null) {
            this.f453b = new C0145d(textView, this);
        }
        c0396kM761a.m766f(this.f453b);
        return charSequence;
    }
}
