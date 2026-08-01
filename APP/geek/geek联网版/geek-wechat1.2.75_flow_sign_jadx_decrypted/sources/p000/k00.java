package p000;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class k00 extends C0875x {

    /* JADX INFO: renamed from: d */
    public final RecyclerView f2761d;

    /* JADX INFO: renamed from: e */
    public final j00 f2762e;

    public k00(RecyclerView recyclerView) {
        this.f2761d = recyclerView;
        j00 j00Var = this.f2762e;
        if (j00Var != null) {
            this.f2762e = j00Var;
        } else {
            this.f2762e = new j00(this);
        }
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: c */
    public final void mo1490c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1490c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f2761d.m366K()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo327R(accessibilityEvent);
        }
    }

    @Override // p000.C0875x
    /* JADX INFO: renamed from: d */
    public final void mo760d(View view, C0357j0 c0357j0) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0357j0.f2619a;
        this.f5147a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f2761d;
        if (recyclerView.m366K() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC0799uz layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f4856b;
        a00 a00Var = recyclerView2.f548b;
        f00 f00Var = recyclerView2.f551c0;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.f4856b.canScrollHorizontally(-1)) {
            c0357j0.m1547a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.f4856b.canScrollVertically(1) || layoutManager.f4856b.canScrollHorizontally(1)) {
            c0357j0.m1547a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.mo272H(a00Var, f00Var), layoutManager.mo306x(a00Var, f00Var), false, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[PHI: r0
  0x0056: PHI (r0v8 int) = (r0v4 int), (r0v12 int) binds: [B:27:0x0073, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p000.C0875x
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo761g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.mo761g(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L8
            return r6
        L8:
            androidx.recyclerview.widget.RecyclerView r4 = r3.f2761d
            boolean r0 = r4.m366K()
            r1 = 0
            if (r0 != 0) goto L8c
            uz r0 = r4.getLayoutManager()
            if (r0 == 0) goto L8c
            uz r4 = r4.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.f4856b
            a00 r2 = r0.f548b
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
            int r0 = r4.f4869o
            int r2 = r4.m2511E()
            int r0 = r0 - r2
            int r2 = r4.m2508B()
            int r0 = r0 - r2
            int r0 = -r0
            goto L40
        L3f:
            r0 = r1
        L40:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f4856b
            boolean r5 = r2.canScrollHorizontally(r5)
            if (r5 == 0) goto L56
            int r5 = r4.f4868n
            int r2 = r4.m2509C()
            int r5 = r5 - r2
            int r2 = r4.m2510D()
            int r5 = r5 - r2
            int r5 = -r5
            goto L81
        L56:
            r5 = r1
            goto L81
        L58:
            boolean r5 = r0.canScrollVertically(r6)
            if (r5 == 0) goto L6c
            int r5 = r4.f4869o
            int r0 = r4.m2511E()
            int r5 = r5 - r0
            int r0 = r4.m2508B()
            int r5 = r5 - r0
            r0 = r5
            goto L6d
        L6c:
            r0 = r1
        L6d:
            androidx.recyclerview.widget.RecyclerView r5 = r4.f4856b
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L56
            int r5 = r4.f4868n
            int r2 = r4.m2509C()
            int r5 = r5 - r2
            int r2 = r4.m2510D()
            int r5 = r5 - r2
        L81:
            if (r0 != 0) goto L86
            if (r5 != 0) goto L86
            goto L8c
        L86:
            androidx.recyclerview.widget.RecyclerView r4 = r4.f4856b
            r4.m381Z(r5, r0, r6)
            return r6
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.k00.mo761g(android.view.View, int, android.os.Bundle):boolean");
    }
}
