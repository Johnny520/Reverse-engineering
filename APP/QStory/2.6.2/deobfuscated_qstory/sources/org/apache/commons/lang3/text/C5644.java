package org.apache.commons.lang3.text;

import java.util.List;

/* JADX INFO: renamed from: org.apache.commons.lang3.text.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5644 extends C5646 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ StrBuilder f15526;

    public C5644(StrBuilder strBuilder) {
        this.f15526 = strBuilder;
    }

    @Override // org.apache.commons.lang3.text.C5646
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List mo10976(int i, char[] cArr) {
        if (cArr != null) {
            return super.mo10976(i, cArr);
        }
        StrBuilder strBuilder = this.f15526;
        return super.mo10976(strBuilder.size(), strBuilder.buffer);
    }
}
