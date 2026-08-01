package p104;

import kotlin.collections.AbstractC4334;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7282 extends AbstractC4334 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C7281 f19382;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f19383 = -1;

    public C7282(C7281 c7281) {
        this.f19382 = c7281;
    }

    @Override // kotlin.collections.AbstractC4334
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8760() {
        int i;
        Object[] objArr;
        do {
            i = this.f19383 + 1;
            this.f19383 = i;
            objArr = this.f19382.f19381;
            if (i >= objArr.length) {
                break;
            }
        } while (objArr[i] == null);
        if (i >= objArr.length) {
            this.f12918 = 2;
            return;
        }
        Object obj = objArr[i];
        obj.getClass();
        this.f12917 = obj;
        this.f12918 = 1;
    }
}
