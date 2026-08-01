package androidx.recyclerview.widget;

import androidx.appcompat.widget.C0191;
import androidx.core.view.AbstractC2270;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2526 extends AbstractC2535 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f7622;

    public C2526(RecyclerView recyclerView) {
        this.f7622 = recyclerView;
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo4851() {
        AbstractC2450 abstractC2450;
        RecyclerView recyclerView = this.f7622;
        if (recyclerView.f7225 == null || (abstractC2450 = recyclerView.f7194) == null) {
            return;
        }
        int iOrdinal = abstractC2450.f7296.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return;
            }
        } else if (abstractC2450.mo4794() <= 0) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo4852(int i, int i2) {
        RecyclerView recyclerView = this.f7622;
        recyclerView.m4732(null);
        C0191 c0191 = recyclerView.f7224;
        ArrayList arrayList = (ArrayList) c0191.f748;
        if (i2 < 1) {
            return;
        }
        arrayList.add(c0191.m665(null, 2, i, i2));
        c0191.f750 |= 2;
        if (arrayList.size() == 1) {
            m5027();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo4853(int i, int i2) {
        RecyclerView recyclerView = this.f7622;
        recyclerView.m4732(null);
        C0191 c0191 = recyclerView.f7224;
        ArrayList arrayList = (ArrayList) c0191.f748;
        if (i == i2) {
            return;
        }
        arrayList.add(c0191.m665(null, 8, i, i2));
        c0191.f750 |= 8;
        if (arrayList.size() == 1) {
            m5027();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo4854(int i, int i2) {
        RecyclerView recyclerView = this.f7622;
        recyclerView.m4732(null);
        C0191 c0191 = recyclerView.f7224;
        ArrayList arrayList = (ArrayList) c0191.f748;
        if (i2 < 1) {
            return;
        }
        arrayList.add(c0191.m665(null, 1, i, i2));
        c0191.f750 |= 1;
        if (arrayList.size() == 1) {
            m5027();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo4855(Object obj, int i, int i2) {
        RecyclerView recyclerView = this.f7622;
        recyclerView.m4732(null);
        C0191 c0191 = recyclerView.f7224;
        ArrayList arrayList = (ArrayList) c0191.f748;
        if (i2 < 1) {
            return;
        }
        arrayList.add(c0191.m665(obj, 4, i, i2));
        c0191.f750 |= 4;
        if (arrayList.size() == 1) {
            m5027();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo4856() {
        RecyclerView recyclerView = this.f7622;
        recyclerView.m4732(null);
        recyclerView.f7241.f7608 = true;
        recyclerView.m4755(true);
        if (recyclerView.f7224.m667()) {
            return;
        }
        recyclerView.requestLayout();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m5027() {
        RecyclerView recyclerView = this.f7622;
        if (!recyclerView.f7199 || !recyclerView.f7200) {
            recyclerView.f7187 = true;
            recyclerView.requestLayout();
        } else {
            RunnableC2455 runnableC2455 = recyclerView.f7227;
            WeakHashMap weakHashMap = AbstractC2270.f6594;
            recyclerView.postOnAnimation(runnableC2455);
        }
    }
}
