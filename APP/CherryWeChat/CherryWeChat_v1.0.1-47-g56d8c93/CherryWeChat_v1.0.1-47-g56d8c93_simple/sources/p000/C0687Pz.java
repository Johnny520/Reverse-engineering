package p000;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: renamed from: Pz */
/* JADX INFO: loaded from: classes.dex */
public final class C0687Pz extends AbstractC1293cr {

    /* JADX INFO: renamed from: f */
    public int f2214f;

    /* JADX INFO: renamed from: g */
    public int f2215g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SwipeDismissBehavior f2216h;

    public C0687Pz(SwipeDismissBehavior r1) {
        this.f2216h = r1;
        this.f2215g = -1;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: B */
    public final int mo1385B(View r1) {
        return r1.getWidth();
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: J */
    public final void mo1386J(View r2, int r3) {
        this.f2215g = r3;
        this.f2214f = r2.getLeft();
        ViewParent r22 = r2.getParent();
        if (r22 == null) goto L6;
        SwipeDismissBehavior r32 = this.f2216h;
        r32.f4404c = true;
        r22.requestDisallowInterceptTouchEvent(true);
        r32.f4404c = false;
        return;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: K */
    public final void mo1387K(int r1) {
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: L */
    public final void mo1388L(View r5, int r6, int r7) {
        float r72 = r5.getWidth();
        SwipeDismissBehavior r0 = this.f2216h;
        float r73 = r72 * r0.f4406e;
        float r1 = r5.getWidth() * r0.f4407f;
        float r62 = Math.abs(r6 - this.f2214f);
        if (r62 > r73) goto L7;
        r5.setAlpha(1.0f);
        return;
    L7:
        if (r62 < r1) goto L10;
        r5.setAlpha(0.0f);
        return;
    L10:
        r5.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((r62 - r73) / (r1 - r73))), 1.0f));
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: M */
    public final void mo1389M(View r9, float r10, float r11) {
        this.f2215g = -1;
        int r112 = r9.getWidth();
        boolean r2 = false;
        SwipeDismissBehavior r3 = this.f2216h;
        if (r10 != 0.0f) goto L5;
        int r1 = r9.getLeft() - this.f2214f;
        if (Math.abs(r1) >= Math.round(r9.getWidth() * 0.5f)) goto L28;
    L35:
        int r0 = this.f2214f;
    L37:
        if (r3.f4402a.m4499n(r0, r9.getTop()) == false) goto L40;
        r9.postOnAnimation(new RunnableC0044B0(r3, r9, r2));
        return;
    L40:
        return;
    L28:
        if (r10 < 0.0f) goto L33;
        int r102 = r9.getLeft();
        int r02 = this.f2214f;
        if (r102 < r02) goto L33;
        r0 = r02 + r112;
    L34:
        r2 = true;
    L33:
        r0 = this.f2214f - r112;
        goto L34
    L5:
        if (r9.getLayoutDirection() != 1) goto L7;
        boolean r5 = true;
    L8:
        int r6 = r3.f4405d;
        if (r6 == 2) goto L28;
        if (r6 != 0) goto L18;
        if (r5 == true) goto L14;
        if (r10 <= 0.0f) goto L35;
    L14:
        if (r10 >= 0.0f) goto L35;
    L18:
        if (r6 != 1) goto L35;
        if (r5 == false) goto L23;
        if (r10 <= 0.0f) goto L35;
    L23:
        if (r10 >= 0.0f) goto L35;
    L7:
        r5 = false;
        goto L8
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: W */
    public final boolean mo1390W(View r3, int r4) {
        int r0 = this.f2215g;
        if (r0 == (-1)) goto L6;
        if (r0 == r4) goto L6;
        return false;
    L6:
        if (this.f2216h.mo2426r(r3) == false) goto L11;
        return true;
    L11:
        return false;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: j */
    public final int mo1391j(View r4, int r5) {
        if (r4.getLayoutDirection() != 1) goto L5;
        boolean r0 = true;
    L6:
        int r2 = this.f2216h.f4405d;
        if (r2 != 0) goto L12;
        if (r0 == false) goto L10;
        int r02 = this.f2214f - r4.getWidth();
        int r42 = this.f2214f;
    L18:
        return Math.min(Math.max(r02, r5), r42);
    L10:
        r02 = this.f2214f;
        int r43 = r4.getWidth();
    L11:
        r42 = r43 + r02;
        goto L18
    L12:
        if (r2 != 1) goto L16;
        if (r0 == false) goto L15;
        r02 = this.f2214f;
        r43 = r4.getWidth();
        goto L11
    L15:
        r02 = this.f2214f - r4.getWidth();
        r42 = this.f2214f;
        goto L18
    L16:
        r02 = this.f2214f - r4.getWidth();
        r42 = r4.getWidth() + this.f2214f;
        goto L18
    L5:
        r0 = false;
        goto L6
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: k */
    public final int mo1392k(View r1, int r2) {
        return r1.getTop();
    }
}
