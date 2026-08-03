package p037U;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import p006D.C0091b;
import p008E.C0156j;

/* JADX INFO: renamed from: U.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C0357Q extends C0091b {

    /* JADX INFO: renamed from: d */
    public final RecyclerView f719d;

    /* JADX INFO: renamed from: e */
    public final C0356P f720e;

    public C0357Q(RecyclerView recyclerView) {
        this.f719d = recyclerView;
        C0356P c0356p = this.f720e;
        if (c0356p != null) {
            this.f720e = c0356p;
        } else {
            this.f720e = new C0356P(this);
        }
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: c */
    public final void mo315c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo315c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f719d.m1330w()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo781M(accessibilityEvent);
        }
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: d */
    public final void mo55d(View view, C0156j c0156j) {
        View.AccessibilityDelegate accessibilityDelegate = this.f243a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0156j.f357a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f719d;
        if (recyclerView.m1330w() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC0343C layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f668b;
        C0349I c0349i = recyclerView2.f1562a;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f668b.canScrollHorizontally(-1)) {
            c0156j.m505a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f668b.canScrollVertically(1) || layoutManager.f668b.canScrollHorizontally(1)) {
            c0156j.m505a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        C0352L c0352l = recyclerView2.f1561W;
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.mo775F(c0349i, c0352l), layoutManager.mo814t(c0349i, c0352l), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[PHI: r0
  0x0056: PHI (r0v8 int) = (r0v4 int), (r0v12 int) binds: [B:27:0x0073, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p006D.C0091b
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo317g(View view, int i2, Bundle bundle) {
        int iM774C;
        int iM772A;
        if (super.mo317g(view, i2, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f719d;
        if (recyclerView.m1330w() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        AbstractC0343C layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f668b;
        C0349I c0349i = recyclerView2.f1562a;
        if (i2 == 4096) {
            iM774C = recyclerView2.canScrollVertically(1) ? (layoutManager.f676j - layoutManager.m774C()) - layoutManager.m818z() : 0;
            if (layoutManager.f668b.canScrollHorizontally(1)) {
                iM772A = (layoutManager.f675i - layoutManager.m772A()) - layoutManager.m773B();
            }
        } else if (i2 != 8192) {
            iM772A = 0;
            iM774C = 0;
        } else {
            iM774C = recyclerView2.canScrollVertically(-1) ? -((layoutManager.f676j - layoutManager.m774C()) - layoutManager.m818z()) : 0;
            iM772A = layoutManager.f668b.canScrollHorizontally(-1) ? -((layoutManager.f675i - layoutManager.m772A()) - layoutManager.m773B()) : 0;
        }
        if (iM774C == 0 && iM772A == 0) {
            return false;
        }
        layoutManager.f668b.m1309H(iM772A, iM774C, true);
        return true;
    }
}
