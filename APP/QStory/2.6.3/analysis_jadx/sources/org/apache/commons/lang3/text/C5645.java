package org.apache.commons.lang3.text;

import java.util.List;

/* JADX INFO: renamed from: org.apache.commons.lang3.text.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5645 extends C5647 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ StrBuilder f15526;

    public C5645(StrBuilder strBuilder) {
        this.f15526 = strBuilder;
    }

    @Override // org.apache.commons.lang3.text.C5647
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List mo11033(int i, char[] cArr) {
        if (cArr != null) {
            return super.mo11033(i, cArr);
        }
        StrBuilder strBuilder = this.f15526;
        return super.mo11033(strBuilder.size(), strBuilder.buffer);
    }
}
