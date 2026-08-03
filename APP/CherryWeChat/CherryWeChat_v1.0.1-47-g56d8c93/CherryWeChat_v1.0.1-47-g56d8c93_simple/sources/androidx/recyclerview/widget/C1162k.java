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

    public C1162k(RecyclerView r1) {
        this.f4047a = r1;
    }

    /* JADX INFO: renamed from: a */
    public final void m2269a() {
        boolean r0 = RecyclerView.POST_UPDATES_ON_ANIMATION;
        RecyclerView r1 = this.f4047a;
        if (r0 == true) goto L5;
    L10:
        r1.mAdapterUpdateDuringMeasure = true;
        r1.requestLayout();
        return;
    L5:
        if (r1.mHasFixedSize == false) goto L10;
        if (r1.mIsAttached == false) goto L10;
        Runnable r02 = r1.mUpdateChildViewsRunnable;
        WeakHashMap r2 = AbstractC2185lE.f7617a;
        r1.postOnAnimation(r02);
    }

    @Override // p000.AbstractC1516hv
    public final void onChanged() {
        RecyclerView r1 = this.f4047a;
        r1.assertNotInLayoutOrScroll(null);
        r1.mState.f81f = true;
        r1.processDataSetCompletelyChanged(true);
        if (r1.mAdapterHelper.m2222g() == true) goto L6;
        r1.requestLayout();
        return;
    }

    @Override // p000.AbstractC1516hv
    public final void onItemRangeChanged(int r5, int r6, Object r7) {
        RecyclerView r1 = this.f4047a;
        r1.assertNotInLayoutOrScroll(null);
        C1152a r0 = r1.mAdapterHelper;
        ArrayList r12 = r0.f4012b;
        if (r6 < 1) goto L10;
        r12.add(r0.m2223h(r7, 4, r5, r6));
        r0.f4016f |= 4;
        if (r12.size() != 1) goto L9;
        m2269a();
        return;
    L9:
        return;
    }

    @Override // p000.AbstractC1516hv
    public final void onItemRangeInserted(int r5, int r6) {
        RecyclerView r0 = this.f4047a;
        r0.assertNotInLayoutOrScroll(null);
        C1152a r02 = r0.mAdapterHelper;
        ArrayList r2 = r02.f4012b;
        if (r6 < 1) goto L10;
        r2.add(r02.m2223h(null, 1, r5, r6));
        r02.f4016f |= 1;
        if (r2.size() != 1) goto L9;
        m2269a();
        return;
    L9:
        return;
    }

    @Override // p000.AbstractC1516hv
    public final void onItemRangeMoved(int r5, int r6, int r7) {
        RecyclerView r0 = this.f4047a;
        r0.assertNotInLayoutOrScroll(null);
        C1152a r02 = r0.mAdapterHelper;
        ArrayList r2 = r02.f4012b;
        if (r5 != r6) goto L6;
        return;
    L6:
        if (r7 != 1) goto L12;
        r2.add(r02.m2223h(null, 8, r5, r6));
        r02.f4016f |= 8;
        if (r2.size() != 1) goto L13;
        m2269a();
        return;
    L13:
        return;
    L12:
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    @Override // p000.AbstractC1516hv
    public final void onItemRangeRemoved(int r6, int r7) {
        RecyclerView r0 = this.f4047a;
        r0.assertNotInLayoutOrScroll(null);
        C1152a r02 = r0.mAdapterHelper;
        ArrayList r2 = r02.f4012b;
        if (r7 < 1) goto L10;
        r2.add(r02.m2223h(null, 2, r6, r7));
        r02.f4016f |= 2;
        if (r2.size() != 1) goto L9;
        m2269a();
        return;
    L9:
        return;
    }

    @Override // p000.AbstractC1516hv
    public final void onStateRestorationPolicyChanged() {
        RecyclerView r0 = this.f4047a;
        if (r0.mPendingSavedState == null) goto L13;
        AbstractC1158g r1 = r0.mAdapter;
        if (r1 != null) goto L8;
        return;
    L8:
        if (r1.canRestoreState() == false) goto L12;
        r0.requestLayout();
        return;
    L12:
        return;
    }
}
