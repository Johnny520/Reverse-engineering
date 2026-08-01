package org.apache.commons.lang3.time;

/* JADX INFO: renamed from: org.apache.commons.lang3.time.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5684 extends C5673 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f15614;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5684(int i, int i2) {
        super(i);
        this.f15614 = i2;
    }

    @Override // org.apache.commons.lang3.time.C5673
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo11049(FastDateParser fastDateParser, int i) {
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
