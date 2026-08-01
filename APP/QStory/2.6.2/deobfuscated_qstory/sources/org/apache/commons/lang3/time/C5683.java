package org.apache.commons.lang3.time;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5683 extends C5672 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f15614;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5683(int i, int i2) {
        super(i);
        this.f15614 = i2;
    }

    @Override // org.apache.commons.lang3.time.C5672
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo10992(FastDateParser fastDateParser, int i) {
        switch (this.f15614) {
            case 0:
                if (i < 100) {
                }
                break;
            case 1:
                break;
            case 2:
                if (i != 7) {
                    break;
                }
                break;
            case 3:
                if (i == 24) {
                }
                break;
            default:
                if (i == 12) {
                }
                break;
        }
        return 0;
    }
}
