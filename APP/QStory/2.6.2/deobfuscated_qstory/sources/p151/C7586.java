package p151;

import java.util.ArrayList;
import java.util.List;
import p164.C7664;

/* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7586 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f20561;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f20562;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7664 f20563;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C7664 f20564;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7584 f20565;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f20566 = new ArrayList();

    public C7586(C7584 c7584, ArrayList arrayList) {
        C7664 c7664 = C7664.f20811;
        this.f20564 = c7664;
        this.f20563 = c7664;
        m12789(arrayList, false);
        m12789(arrayList, true);
        ArrayList arrayList2 = c7584.f20557;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            C7664 c76642 = c7584.f20556;
            C7664 c76643 = c7584.f20555;
            this.f20564 = c76642;
            this.f20563 = c76643;
            m12787();
            m12788(c7584.f20554);
        }
        this.f20565 = c7584;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12787() {
        ArrayList arrayList = this.f20566;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        AbstractC7588 abstractC7588 = (AbstractC7588) arrayList.get(size);
        C7664 c7664 = this.f20564;
        C7664 c76642 = this.f20563;
        abstractC7588.f20577 = c7664;
        abstractC7588.f20576 = c76642;
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12788(int i) {
        ArrayList arrayList = this.f20566;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC7588 abstractC7588 = (AbstractC7588) arrayList.get(size);
            if (!abstractC7588.f20574 && abstractC7588.f20573 != i) {
                abstractC7588.f20573 = i;
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12789(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC7588 abstractC7588 = (AbstractC7588) list.get(i);
            abstractC7588.getClass();
            if (true == z) {
                C7586 c7586 = abstractC7588.f20575;
                if (c7586 != null) {
                    throw new IllegalStateException(abstractC7588 + " (" + (i + 1) + "/" + size + ") is already controlled by " + c7586 + " but is still added to " + this);
                }
                abstractC7588.f20575 = this;
                this.f20566.add(abstractC7588);
            }
        }
    }
}
