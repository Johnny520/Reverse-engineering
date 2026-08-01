package androidx.recyclerview.widget;

import androidx.appcompat.widget.C0191;
import androidx.core.view.AbstractC2270;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2526 extends AbstractC2535 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f7621;

    public C2526(RecyclerView recyclerView) {
        this.f7621 = recyclerView;
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo4841() {
        AbstractC2450 abstractC2450;
        RecyclerView recyclerView = this.f7621;
        if (recyclerView.f7224 == null || (abstractC2450 = recyclerView.f7193) == null) {
            return;
        }
        int iOrdinal = abstractC2450.f7295.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return;
            }
        } else if (abstractC2450.mo4784() <= 0) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo4842(int i, int i2) {
        RecyclerView recyclerView = this.f7621;
        recyclerView.m4722(null);
        C0191 c0191 = recyclerView.f7223;
        ArrayList arrayList = (ArrayList) c0191.f748;
        if (i2 < 1) {
            return;
        }
        arrayList.add(c0191.m664(null, 2, i, i2));
        c0191.f750 |= 2;
        if (arrayList.size() == 1) {
            m5017();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo4843(int i, int i2) {
        RecyclerView recyclerView = this.f7621;
        recyclerView.m4722(null);
        C0191 c0191 = recyclerView.f7223;
        ArrayList arrayList = (ArrayList) c0191.f748;
        if (i == i2) {
            return;
        }
        arrayList.add(c0191.m664(null, 8, i, i2));
        c0191.f750 |= 8;
        if (arrayList.size() == 1) {
            m5017();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo4844(int i, int i2) {
        RecyclerView recyclerView = this.f7621;
        recyclerView.m4722(null);
        C0191 c0191 = recyclerView.f7223;
        ArrayList arrayList = (ArrayList) c0191.f748;
        if (i2 < 1) {
            return;
        }
        arrayList.add(c0191.m664(null, 1, i, i2));
        c0191.f750 |= 1;
        if (arrayList.size() == 1) {
            m5017();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo4845(Object obj, int i, int i2) {
        RecyclerView recyclerView = this.f7621;
        recyclerView.m4722(null);
        C0191 c0191 = recyclerView.f7223;
        ArrayList arrayList = (ArrayList) c0191.f748;
        if (i2 < 1) {
            return;
        }
        arrayList.add(c0191.m664(obj, 4, i, i2));
        c0191.f750 |= 4;
        if (arrayList.size() == 1) {
            m5017();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2535
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo4846() {
        RecyclerView recyclerView = this.f7621;
        recyclerView.m4722(null);
        recyclerView.f7240.f7607 = true;
        recyclerView.m4745(true);
        if (recyclerView.f7223.m666()) {
            return;
        }
        recyclerView.requestLayout();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m5017() {
        RecyclerView recyclerView = this.f7621;
        if (!recyclerView.f7198 || !recyclerView.f7199) {
            recyclerView.f7186 = true;
            recyclerView.requestLayout();
        } else {
            RunnableC2455 runnableC2455 = recyclerView.f7226;
            WeakHashMap weakHashMap = AbstractC2270.f6593;
            recyclerView.postOnAnimation(runnableC2455);
        }
    }
}
