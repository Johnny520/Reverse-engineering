package p104;

import kotlin.collections.AbstractC4333;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子兰哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7281 extends AbstractC4333 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C7280 f19387;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f19388 = -1;

    public C7281(C7280 c7280) {
        this.f19387 = c7280;
    }

    @Override // kotlin.collections.AbstractC4333
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8770() {
        int i;
        Object[] objArr;
        do {
            i = this.f19388 + 1;
            this.f19388 = i;
            objArr = this.f19387.f19386;
            if (i >= objArr.length) {
                break;
            }
        } while (objArr[i] == null);
        if (i >= objArr.length) {
            this.f12914 = 2;
            return;
        }
        Object obj = objArr[i];
        obj.getClass();
        this.f12913 = obj;
        this.f12914 = 1;
    }
}
