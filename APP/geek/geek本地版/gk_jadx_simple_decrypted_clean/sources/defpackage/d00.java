package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class d00 extends x {
    public final RecyclerView d;
    public final c00 e;

    public d00(RecyclerView r1) {
        this.d = r1;
        c00 r12 = this.e;
        if (r12 == null) goto L6;
        this.e = r12;
        return;
    L6:
        this.e = new c00(this);
    }

    @Override // defpackage.x
    public final void c(View r2, AccessibilityEvent r3) {
        super.c(r2, r3);
        if ((r2 instanceof RecyclerView) == true) goto L5;
        return;
    L5:
        if (this.d.K() == true) goto L11;
        RecyclerView r22 = (RecyclerView) r2;
        if (r22.getLayoutManager() == null) goto L12;
        r22.getLayoutManager().R(r3);
        return;
    L12:
        return;
    }

    @Override // defpackage.x
    public final void d(View r7, j0 r8) {
        AccessibilityNodeInfo r0 = r8.a;
        this.a.onInitializeAccessibilityNodeInfo(r7, r0);
        RecyclerView r72 = this.d;
        if (r72.K() == false) goto L5;
        return;
    L5:
        if (r72.getLayoutManager() == null) goto L19;
        nz r73 = r72.getLayoutManager();
        RecyclerView r1 = r73.b;
        tz r2 = r1.b;
        yz r3 = r1.c0;
        if (r1.canScrollVertically(-1) == false) goto L9;
    L10:
        r8.a(8192);
        r0.setScrollable(true);
    L12:
        if (r73.b.canScrollVertically(1) == false) goto L14;
    L15:
        r8.a(4096);
        r0.setScrollable(true);
    L16:
        r0.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(r73.H(r2, r3), r73.x(r2, r3), false, 0));
        return;
    L14:
        if (r73.b.canScrollHorizontally(1) == false) goto L16;
    L9:
        if (r73.b.canScrollHorizontally(-1) == false) goto L12;
    }

    @Override // defpackage.x
    public final boolean g(View r4, int r5, Bundle r6) {
        if (super.g(r4, r5, r6) == false) goto L5;
        return true;
    L5:
        RecyclerView r42 = this.d;
        if (r42.K() == false) goto L8;
    L34:
        return false;
    L8:
        if (r42.getLayoutManager() == null) goto L34;
        nz r43 = r42.getLayoutManager();
        RecyclerView r0 = r43.b;
        tz r2 = r0.b;
        if (r5 == 4096) goto L23;
        if (r5 == 8192) goto L15;
        int r52 = 0;
        int r02 = 0;
    L29:
        if (r02 != 0) goto L32;
        if (r52 == 0) goto L34;
    L32:
        r43.b.Z(r52, r02, true);
        return true;
    L15:
        if (r0.canScrollVertically(-1) == false) goto L17;
        r02 = -((r43.o - r43.E()) - r43.B());
    L19:
        if (r43.b.canScrollHorizontally(-1) == false) goto L21;
        r52 = -((r43.n - r43.C()) - r43.D());
    L21:
        r52 = 0;
        goto L29
    L17:
        r02 = 0;
        goto L19
    L23:
        if (r0.canScrollVertically(1) == false) goto L25;
        r02 = (r43.o - r43.E()) - r43.B();
    L27:
        if (r43.b.canScrollHorizontally(1) == false) goto L21;
        r52 = (r43.n - r43.C()) - r43.D();
        goto L29
    L25:
        r02 = 0;
        goto L27
    }
}
