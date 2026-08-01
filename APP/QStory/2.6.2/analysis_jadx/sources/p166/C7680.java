package p166;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7680 implements InputFilter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public RunnableC7681 f20861;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TextView f20862;

    public C7680(TextView textView) {
        this.f20862 = textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r1 != 3) goto L27;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence filter(java.lang.CharSequence r4, int r5, int r6, android.text.Spanned r7, int r8, int r9) {
        /*
            r3 = this;
            android.widget.TextView r0 = r3.f20862
            boolean r1 = r0.isInEditMode()
            if (r1 == 0) goto L9
            goto L48
        L9:
            飘花落叶言子哲苏兰楪世.飘花落叶言子楪苏哲世兰 r1 = p167.C7712.m12980()
            int r1 = r1.m12983()
            if (r1 == 0) goto L49
            r2 = 1
            if (r1 == r2) goto L1a
            r5 = 3
            if (r1 == r5) goto L49
            goto L48
        L1a:
            if (r9 != 0) goto L2b
            if (r8 != 0) goto L2b
            int r3 = r7.length()
            if (r3 != 0) goto L2b
            java.lang.CharSequence r3 = r0.getText()
            if (r4 != r3) goto L2b
            goto L48
        L2b:
            if (r4 == 0) goto L48
            if (r5 != 0) goto L36
            int r3 = r4.length()
            if (r6 != r3) goto L36
            goto L3a
        L36:
            java.lang.CharSequence r4 = r4.subSequence(r5, r6)
        L3a:
            飘花落叶言子哲苏兰楪世.飘花落叶言子楪苏哲世兰 r3 = p167.C7712.m12980()
            int r5 = r4.length()
            r6 = 0
            java.lang.CharSequence r3 = r3.m12986(r6, r5, r6, r4)
            return r3
        L48:
            return r4
        L49:
            飘花落叶言子哲苏兰楪世.飘花落叶言子楪苏哲世兰 r5 = p167.C7712.m12980()
            飘花落叶言子哲苏兰世楪.飘花落叶言子楪世哲苏兰 r6 = r3.f20861
            if (r6 != 0) goto L58
            飘花落叶言子哲苏兰世楪.飘花落叶言子楪世哲苏兰 r6 = new 飘花落叶言子哲苏兰世楪.飘花落叶言子楪世哲苏兰
            r6.<init>(r0, r3)
            r3.f20861 = r6
        L58:
            飘花落叶言子哲苏兰世楪.飘花落叶言子楪世哲苏兰 r3 = r3.f20861
            r5.m12985(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p166.C7680.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }
}
