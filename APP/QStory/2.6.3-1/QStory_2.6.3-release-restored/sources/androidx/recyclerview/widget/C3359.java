package androidx.recyclerview.widget;

import androidx.appcompat.widget.C1038;
import androidx.core.view.AbstractC3103;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3359 extends AbstractC3368 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f7967;

    public C3359(RecyclerView recyclerView) {
        this.f7967 = recyclerView;
    }

    @Override // androidx.recyclerview.widget.AbstractC3368
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo5411() {
        AbstractC3283 abstractC3283;
        RecyclerView recyclerView = this.f7967;
        if (recyclerView.f7570 == null || (abstractC3283 = recyclerView.f7539) == null) {
            return;
        }
        int iOrdinal = abstractC3283.f7641.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return;
            }
        } else if (abstractC3283.mo5354() <= 0) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.AbstractC3368
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo5412(int i, int i2) {
        RecyclerView recyclerView = this.f7967;
        recyclerView.m5292(null);
        C1038 c1038 = recyclerView.f7569;
        ArrayList arrayList = (ArrayList) c1038.f1093;
        if (i2 < 1) {
            return;
        }
        arrayList.add(c1038.m1225(null, 2, i, i2));
        c1038.f1095 |= 2;
        if (arrayList.size() == 1) {
            m5587();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3368
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo5413(int i, int i2) {
        RecyclerView recyclerView = this.f7967;
        recyclerView.m5292(null);
        C1038 c1038 = recyclerView.f7569;
        ArrayList arrayList = (ArrayList) c1038.f1093;
        if (i == i2) {
            return;
        }
        arrayList.add(c1038.m1225(null, 8, i, i2));
        c1038.f1095 |= 8;
        if (arrayList.size() == 1) {
            m5587();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3368
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo5414(int i, int i2) {
        RecyclerView recyclerView = this.f7967;
        recyclerView.m5292(null);
        C1038 c1038 = recyclerView.f7569;
        ArrayList arrayList = (ArrayList) c1038.f1093;
        if (i2 < 1) {
            return;
        }
        arrayList.add(c1038.m1225(null, 1, i, i2));
        c1038.f1095 |= 1;
        if (arrayList.size() == 1) {
            m5587();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3368
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5415(Object obj, int i, int i2) {
        RecyclerView recyclerView = this.f7967;
        recyclerView.m5292(null);
        C1038 c1038 = recyclerView.f7569;
        ArrayList arrayList = (ArrayList) c1038.f1093;
        if (i2 < 1) {
            return;
        }
        arrayList.add(c1038.m1225(obj, 4, i, i2));
        c1038.f1095 |= 4;
        if (arrayList.size() == 1) {
            m5587();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC3368
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5416() {
        RecyclerView recyclerView = this.f7967;
        recyclerView.m5292(null);
        recyclerView.f7586.f7953 = true;
        recyclerView.m5315(true);
        if (recyclerView.f7569.m1227()) {
            return;
        }
        recyclerView.requestLayout();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m5587() {
        RecyclerView recyclerView = this.f7967;
        if (!recyclerView.f7544 || !recyclerView.f7545) {
            recyclerView.f7532 = true;
            recyclerView.requestLayout();
        } else {
            RunnableC3288 runnableC3288 = recyclerView.f7572;
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            recyclerView.postOnAnimation(runnableC3288);
        }
    }
}
