package org.apache.commons.lang3.text;

import java.util.List;

/* JADX INFO: renamed from: org.apache.commons.lang3.text.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6475 extends C6477 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final /* synthetic */ StrBuilder f15871;

    public C6475(StrBuilder strBuilder) {
        this.f15871 = strBuilder;
    }

    @Override // org.apache.commons.lang3.text.C6477
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List mo11592(int i, char[] cArr) {
        if (cArr != null) {
            return super.mo11592(i, cArr);
        }
        StrBuilder strBuilder = this.f15871;
        return super.mo11592(strBuilder.size(), strBuilder.buffer);
    }
}
