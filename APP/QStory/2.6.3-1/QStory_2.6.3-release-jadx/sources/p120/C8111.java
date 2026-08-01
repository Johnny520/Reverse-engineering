package p120;

import kotlin.collections.AbstractC5166;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8111 extends AbstractC5166 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C8110 f19727;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f19728 = -1;

    public C8111(C8110 c8110) {
        this.f19727 = c8110;
    }

    @Override // kotlin.collections.AbstractC5166
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo9319() {
        int i;
        Object[] objArr;
        do {
            i = this.f19728 + 1;
            this.f19728 = i;
            objArr = this.f19727.f19726;
            if (i >= objArr.length) {
                break;
            }
        } while (objArr[i] == null);
        if (i >= objArr.length) {
            this.f13263 = 2;
            return;
        }
        Object obj = objArr[i];
        obj.getClass();
        this.f13262 = obj;
        this.f13263 = 1;
    }
}
