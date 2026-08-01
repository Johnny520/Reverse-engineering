package org.apache.commons.lang3.time;

import java.util.function.Consumer;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5682 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ StringBuilder f15612;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15613;

    public /* synthetic */ C5682(StringBuilder sb, int i) {
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
