package p151;

import java.util.ArrayList;
import java.util.List;
import p164.C7665;

/* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7587 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f20556;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f20557;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7665 f20558;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C7665 f20559;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7585 f20560;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f20561 = new ArrayList();

    public C7587(C7585 c7585, ArrayList arrayList) {
        C7665 c7665 = C7665.f20806;
        this.f20559 = c7665;
        this.f20558 = c7665;
        m12818(arrayList, false);
        m12818(arrayList, true);
        ArrayList arrayList2 = c7585.f20552;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            C7665 c76652 = c7585.f20551;
            C7665 c76653 = c7585.f20550;
            this.f20559 = c76652;
            this.f20558 = c76653;
            m12816();
            m12817(c7585.f20549);
        }
        this.f20560 = c7585;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12816() {
        ArrayList arrayList = this.f20561;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        AbstractC7589 abstractC7589 = (AbstractC7589) arrayList.get(size);
        C7665 c7665 = this.f20559;
        C7665 c76652 = this.f20558;
        abstractC7589.f20572 = c7665;
        abstractC7589.f20571 = c76652;
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12817(int i) {
        ArrayList arrayList = this.f20561;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC7589 abstractC7589 = (AbstractC7589) arrayList.get(size);
            if (!abstractC7589.f20569 && abstractC7589.f20568 != i) {
                abstractC7589.f20568 = i;
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m12818(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC7589 abstractC7589 = (AbstractC7589) list.get(i);
            abstractC7589.getClass();
            if (true == z) {
                C7587 c7587 = abstractC7589.f20570;
                if (c7587 != null) {
                    throw new IllegalStateException(abstractC7589 + " (" + (i + 1) + "/" + size + ") is already controlled by " + c7587 + " but is still added to " + this);
                }
                abstractC7589.f20570 = this;
                this.f20561.add(abstractC7589);
            }
        }
    }
}
