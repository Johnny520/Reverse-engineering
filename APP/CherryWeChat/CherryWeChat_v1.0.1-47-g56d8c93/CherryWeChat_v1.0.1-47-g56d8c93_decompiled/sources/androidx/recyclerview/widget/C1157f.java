package androidx.recyclerview.widget;

import p000.C1347e1;

/* JADX INFO: renamed from: androidx.recyclerview.widget.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1157f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f4032a;

    public C1157f(RecyclerView recyclerView) {
        this.f4032a = recyclerView;
    }

    /* JADX INFO: renamed from: a */
    public final void m2244a(C1347e1 c1347e1) {
        int i = c1347e1.f4841a;
        RecyclerView recyclerView = this.f4032a;
        if (i == 1) {
            recyclerView.mLayout.onItemsAdded(recyclerView, c1347e1.f4842b, c1347e1.f4844d);
            return;
        }
        if (i == 2) {
            recyclerView.mLayout.onItemsRemoved(recyclerView, c1347e1.f4842b, c1347e1.f4844d);
        } else if (i == 4) {
            recyclerView.mLayout.onItemsUpdated(recyclerView, c1347e1.f4842b, c1347e1.f4844d, c1347e1.f4843c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.mLayout.onItemsMoved(recyclerView, c1347e1.f4842b, c1347e1.f4844d, 1);
        }
    }
}
