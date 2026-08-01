package org.apache.commons.lang3.time;

import java.util.function.Consumer;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5683 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ StringBuilder f15612;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15613;

    public /* synthetic */ C5683(StringBuilder sb, int i) {
        this.f15613 = i;
        this.f15612 = sb;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f15613;
        StringBuilder sb = this.f15612;
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
