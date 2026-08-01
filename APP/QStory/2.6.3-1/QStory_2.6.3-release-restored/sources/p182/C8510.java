package p182;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import p183.C8542;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8510 implements InputFilter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public RunnableC8511 f21201;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TextView f21202;

    public C8510(TextView textView) {
        this.f21202 = textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r1 != 3) goto L27;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f21202;
        if (!textView.isInEditMode()) {
            int iM13572 = C8542.m13569().m13572();
            if (iM13572 != 0) {
                if (iM13572 == 1) {
                    if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                        if (i != 0 || i2 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i, i2);
                        }
                        return C8542.m13569().m13575(0, charSequence.length(), 0, charSequence);
                    }
                }
            }
            C8542 c8542M13569 = C8542.m13569();
            if (this.f21201 == null) {
                this.f21201 = new RunnableC8511(textView, this);
            }
            c8542M13569.m13574(this.f21201);
            return charSequence;
        }
        return charSequence;
    }
}
