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

    public C0357Q(RecyclerView r1) {
        this.f719d = r1;
        C0356P r12 = this.f720e;
        if (r12 == null) goto L5;
        this.f720e = r12;
        return;
    L5:
        this.f720e = new C0356P(this);
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: c */
    public final void mo315c(View r2, AccessibilityEvent r3) {
        super.mo315c(r2, r3);
        if ((r2 instanceof RecyclerView) == true) goto L5;
        return;
    L5:
        if (this.f719d.m1330w() == true) goto L11;
        RecyclerView r22 = (RecyclerView) r2;
        if (r22.getLayoutManager() == null) goto L12;
        r22.getLayoutManager().mo781M(r3);
        return;
    L12:
        return;
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: d */
    public final void mo55d(View r7, C0156j r8) {
        View.AccessibilityDelegate r02 = this.f243a;
        AccessibilityNodeInfo r1 = r8.f357a;
        r02.onInitializeAccessibilityNodeInfo(r7, r1);
        RecyclerView r72 = this.f719d;
        if (r72.m1330w() == false) goto L5;
        return;
    L5:
        if (r72.getLayoutManager() == null) goto L19;
        AbstractC0343C r73 = r72.getLayoutManager();
        RecyclerView r03 = r73.f668b;
        C0349I r2 = r03.f1562a;
        if (r03.canScrollVertically(-1) == false) goto L9;
    L10:
        r8.m505a(8192);
        r1.setScrollable(true);
    L12:
        if (r73.f668b.canScrollVertically(1) == false) goto L14;
    L15:
        r8.m505a(4096);
        r1.setScrollable(true);
    L16:
        C0352L r82 = r03.f1561W;
        r1.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(r73.mo775F(r2, r82), r73.mo814t(r2, r82), false, 0));
        return;
    L14:
        if (r73.f668b.canScrollHorizontally(1) == false) goto L16;
    L9:
        if (r73.f668b.canScrollHorizontally(-1) == false) goto L12;
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: g */
    public final boolean mo317g(View r4, int r5, Bundle r6) {
        if (super.mo317g(r4, r5, r6) == false) goto L5;
        return true;
    L5:
        RecyclerView r42 = this.f719d;
        if (r42.m1330w() == false) goto L8;
    L34:
        return false;
    L8:
        if (r42.getLayoutManager() == null) goto L34;
        AbstractC0343C r43 = r42.getLayoutManager();
        RecyclerView r02 = r43.f668b;
        C0349I r2 = r02.f1562a;
        if (r5 == 4096) goto L23;
        if (r5 == 8192) goto L15;
        int r52 = 0;
        int r03 = 0;
    L29:
        if (r03 != 0) goto L32;
        if (r52 != 0) goto L32;
        return false;
    L32:
        r43.f668b.m1309H(r52, r03, true);
        return true;
    L15:
        if (r02.canScrollVertically(-1) == false) goto L17;
        r03 = -((r43.f676j - r43.m774C()) - r43.m818z());
    L19:
        if (r43.f668b.canScrollHorizontally(-1) == false) goto L21;
        r52 = -((r43.f675i - r43.m772A()) - r43.m773B());
    L21:
        r52 = 0;
        goto L29
    L17:
        r03 = 0;
        goto L19
    L23:
        if (r02.canScrollVertically(1) == false) goto L25;
        r03 = (r43.f676j - r43.m774C()) - r43.m818z();
    L27:
        if (r43.f668b.canScrollHorizontally(1) == false) goto L21;
        r52 = (r43.f675i - r43.m772A()) - r43.m773B();
        goto L29
    L25:
        r03 = 0;
        goto L27
    }
}
