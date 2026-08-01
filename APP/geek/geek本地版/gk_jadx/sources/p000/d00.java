package p000;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class d00 extends C0875x {

    /* JADX INFO: renamed from: d */
    public final RecyclerView f1345d;

    /* JADX INFO: renamed from: e */
    public final c00 f1346e;

    public d00(RecyclerView recyclerView) {
        this.f1345d = recyclerView;
        c00 c00Var = this.f1346e;
        if (c00Var != null) {
            this.f1346e = c00Var;
        } else {
            this.f1346e = new c00(this);
        }
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: c */
    public final void mo65c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo65c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f1345d.m381K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo342R(accessibilityEvent);
        }
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: d */
    public final void mo66d(View view, C0357j0 c0357j0) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0357j0.f2513a;
        this.f5076a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f1345d;
        if (recyclerView.m381K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC0540nz layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f3456b;
        C0763tz c0763tz = recyclerView2.f585b;
        C0948yz c0948yz = recyclerView2.f588c0;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f3456b.canScrollHorizontally(-1)) {
            c0357j0.m1533a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f3456b.canScrollVertically(1) || layoutManager.f3456b.canScrollHorizontally(1)) {
            c0357j0.m1533a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.mo287H(c0763tz, c0948yz), layoutManager.mo321x(c0763tz, c0948yz), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[PHI: r0
  0x0056: PHI (r0v8 int) = (r0v4 int), (r0v12 int) binds: [B:27:0x0073, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.C0875x
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo619g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.mo619g(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L8
            return r6
        L8:
            androidx.recyclerview.widget.RecyclerView r4 = r3.f1345d
            boolean r0 = r4.m381K()
            r1 = 0
            if (r0 != 0) goto L8c
            nz r0 = r4.getLayoutManager()
            if (r0 == 0) goto L8c
            nz r4 = r4.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.f3456b
            tz r2 = r0.f585b
            r2 = 4096(0x1000, float:5.74E-42)
            if (r5 == r2) goto L58
            r2 = 8192(0x2000, float:1.148E-41)
            if (r5 == r2) goto L2a
            r5 = r1
            r0 = r5
            goto L81
        L2a:
            r5 = -1
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 == 0) goto L3f
            int r0 = r4.f3469o
            int r2 = r4.m1963E()
            int r0 = r0 - r2
            int r2 = r4.m1960B()
            int r0 = r0 - r2
            int r0 = -r0
            goto L40
        L3f:
            r0 = r1
        L40:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f3456b
            boolean r5 = r2.canScrollHorizontally(r5)
            if (r5 == 0) goto L56
            int r5 = r4.f3468n
            int r2 = r4.m1961C()
            int r5 = r5 - r2
            int r2 = r4.m1962D()
            int r5 = r5 - r2
            int r5 = -r5
            goto L81
        L56:
            r5 = r1
            goto L81
        L58:
            boolean r5 = r0.canScrollVertically(r6)
            if (r5 == 0) goto L6c
            int r5 = r4.f3469o
            int r0 = r4.m1963E()
            int r5 = r5 - r0
            int r0 = r4.m1960B()
            int r5 = r5 - r0
            r0 = r5
            goto L6d
        L6c:
            r0 = r1
        L6d:
            androidx.recyclerview.widget.RecyclerView r5 = r4.f3456b
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L56
            int r5 = r4.f3468n
            int r2 = r4.m1961C()
            int r5 = r5 - r2
            int r2 = r4.m1962D()
            int r5 = r5 - r2
        L81:
            if (r0 != 0) goto L86
            if (r5 != 0) goto L86
            goto L8c
        L86:
            androidx.recyclerview.widget.RecyclerView r4 = r4.f3456b
            r4.m396Z(r5, r0, r6)
            return r6
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.d00.mo619g(android.view.View, int, android.os.Bundle):boolean");
    }
}
