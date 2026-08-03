package androidx.recyclerview.widget;

import p000.C1347e1;

/* JADX INFO: renamed from: androidx.recyclerview.widget.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1157f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f4032a;

    public C1157f(RecyclerView r1) {
        this.f4032a = r1;
    }

    /* JADX INFO: renamed from: a */
    public final void m2244a(C1347e1 r5) {
        int r0 = r5.f4841a;
        RecyclerView r1 = this.f4032a;
        if (r0 != 1) goto L5;
        r1.mLayout.onItemsAdded(r1, r5.f4842b, r5.f4844d);
        return;
    L5:
        if (r0 != 2) goto L7;
        r1.mLayout.onItemsRemoved(r1, r5.f4842b, r5.f4844d);
        return;
    L7:
        if (r0 != 4) goto L9;
        r1.mLayout.onItemsUpdated(r1, r5.f4842b, r5.f4844d, r5.f4843c);
        return;
    L9:
        if (r0 == 8) goto L11;
        return;
    L11:
        r1.mLayout.onItemsMoved(r1, r5.f4842b, r5.f4844d, 1);
    }
}
