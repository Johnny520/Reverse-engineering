package org.apache.commons.lang3.time;

import java.util.function.Consumer;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6513 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ StringBuilder f15957;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15958;

    public /* synthetic */ C6513(StringBuilder sb, int i) {
        this.f15958 = i;
        this.f15957 = sb;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f15958;
        StringBuilder sb = this.f15957;
        String str = (String) obj;
        switch (i) {
            case 0:
                FastDateParser.lambda$appendDisplayNames$1(sb, str);
                break;
            default:
                sb.append('|');
                FastDateParser.simpleQuote(sb, str);
                break;
        }
    }
}
