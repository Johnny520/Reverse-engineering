package yyds;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: renamed from: yyds.ᲁᛴᛴᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2216 implements InputFilter {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final TextView f10966;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public C0788 f10967;

    public C2216(TextView textView) {
        this.f10966 = textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r1 != 3) goto L27;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f10966;
        if (!textView.isInEditMode()) {
            int iM1003 = C0331.m1001().m1003();
            if (iM1003 != 0) {
                if (iM1003 == 1) {
                    if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                        if (i != 0 || i2 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i, i2);
                        }
                        return C0331.m1001().m1002(charSequence, 0, charSequence.length());
                    }
                }
            }
            C0331 c0331M1001 = C0331.m1001();
            C0788 c0788 = this.f10967;
            if (c0788 == null) {
                c0788 = new C0788(textView, this);
                this.f10967 = c0788;
            }
            c0331M1001.m1005(c0788);
            return charSequence;
        }
        return charSequence;
    }
}
