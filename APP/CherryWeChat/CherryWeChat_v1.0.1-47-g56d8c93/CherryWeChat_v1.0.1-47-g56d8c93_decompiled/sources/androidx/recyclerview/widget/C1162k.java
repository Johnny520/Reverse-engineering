package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.WeakHashMap;
import p000.AbstractC1516hv;
import p000.AbstractC2185lE;

/* JADX INFO: renamed from: androidx.recyclerview.widget.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1162k extends AbstractC1516hv {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f4047a;

    public C1162k(RecyclerView recyclerView) {
        this.f4047a = recyclerView;
    }

    /* JADX INFO: renamed from: a */
    public final void m2269a() {
        boolean z = RecyclerView.POST_UPDATES_ON_ANIMATION;
        RecyclerView recyclerView = this.f4047a;
        if (!z || !recyclerView.mHasFixedSize || !recyclerView.mIsAttached) {
            recyclerView.mAdapterUpdateDuringMeasure = true;
            recyclerView.requestLayout();
        } else {
            Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            recyclerView.postOnAnimation(runnable);
        }
    }

    @Override // p000.AbstractC1516hv
    public final void onChanged() {
        RecyclerView recyclerView = this.f4047a;
        recyclerView.assertNotInLayoutOrScroll(null);
        recyclerView.mState.f81f = true;
        recyclerView.processDataSetCompletelyChanged(true);
        if (recyclerView.mAdapterHelper.m2222g()) {
            return;
        }
        recyclerView.requestLayout();
    }

    @Override // p000.AbstractC1516hv
    public final void onItemRangeChanged(int i, int i2, Object obj) {
        RecyclerView recyclerView = this.f4047a;
        recyclerView.assertNotInLayoutOrScroll(null);
        C1152a c1152a = recyclerView.mAdapterHelper;
        ArrayList arrayList = c1152a.f4012b;
        if (i2 < 1) {
            return;
        }
        arrayList.add(c1152a.m2223h(obj, 4, i, i2));
        c1152a.f4016f |= 4;
        if (arrayList.size() == 1) {
            m2269a();
        }
    }

    @Override // p000.AbstractC1516hv
    public final void onItemRangeInserted(int i, int i2) {
        RecyclerView recyclerView = this.f4047a;
        recyclerView.assertNotInLayoutOrScroll(null);
        C1152a c1152a = recyclerView.mAdapterHelper;
        ArrayList arrayList = c1152a.f4012b;
        if (i2 < 1) {
            return;
        }
        arrayList.add(c1152a.m2223h(null, 1, i, i2));
        c1152a.f4016f |= 1;
        if (arrayList.size() == 1) {
            m2269a();
        }
    }

    @Override // p000.AbstractC1516hv
    public final void onItemRangeMoved(int i, int i2, int i3) {
        RecyclerView recyclerView = this.f4047a;
        recyclerView.assertNotInLayoutOrScroll(null);
        C1152a c1152a = recyclerView.mAdapterHelper;
        ArrayList arrayList = c1152a.f4012b;
        if (i == i2) {
            return;
        }
        if (i3 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        arrayList.add(c1152a.m2223h(null, 8, i, i2));
        c1152a.f4016f |= 8;
        if (arrayList.size() == 1) {
            m2269a();
        }
    }

    @Override // p000.AbstractC1516hv
    public final void onItemRangeRemoved(int i, int i2) {
        RecyclerView recyclerView = this.f4047a;
        recyclerView.assertNotInLayoutOrScroll(null);
        C1152a c1152a = recyclerView.mAdapterHelper;
        ArrayList arrayList = c1152a.f4012b;
        if (i2 < 1) {
            return;
        }
        arrayList.add(c1152a.m2223h(null, 2, i, i2));
        c1152a.f4016f |= 2;
        if (arrayList.size() == 1) {
            m2269a();
        }
    }

    @Override // p000.AbstractC1516hv
    public final void onStateRestorationPolicyChanged() {
        AbstractC1158g abstractC1158g;
        RecyclerView recyclerView = this.f4047a;
        if (recyclerView.mPendingSavedState == null || (abstractC1158g = recyclerView.mAdapter) == null || !abstractC1158g.canRestoreState()) {
            return;
        }
        recyclerView.requestLayout();
    }
}
