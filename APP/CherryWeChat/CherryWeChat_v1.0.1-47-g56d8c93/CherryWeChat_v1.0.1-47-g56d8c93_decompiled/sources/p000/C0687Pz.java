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
    public int f2215g = -1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SwipeDismissBehavior f2216h;

    public C0687Pz(SwipeDismissBehavior swipeDismissBehavior) {
        this.f2216h = swipeDismissBehavior;
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: B */
    public final int mo1385B(View view) {
        return view.getWidth();
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: J */
    public final void mo1386J(View view, int i) {
        this.f2215g = i;
        this.f2214f = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f2216h;
            swipeDismissBehavior.f4404c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f4404c = false;
        }
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: K */
    public final void mo1387K(int i) {
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: L */
    public final void mo1388L(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f2216h;
        float f = width * swipeDismissBehavior.f4406e;
        float width2 = view.getWidth() * swipeDismissBehavior.f4407f;
        float fAbs = Math.abs(i - this.f2214f);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1389M(View view, float f, float f2) {
        int i;
        this.f2215g = -1;
        int width = view.getWidth();
        boolean z = false;
        SwipeDismissBehavior swipeDismissBehavior = this.f2216h;
        if (f != 0.0f) {
            boolean z2 = view.getLayoutDirection() == 1;
            int i2 = swipeDismissBehavior.f4405d;
            if (i2 != 2 && (i2 != 0 ? i2 != 1 || (!z2 ? f < 0.0f : f > 0.0f) : !z2 ? f > 0.0f : f < 0.0f)) {
                i = this.f2214f;
            } else if (f >= 0.0f) {
                int left = view.getLeft();
                int i3 = this.f2214f;
                i = left < i3 ? this.f2214f - width : i3 + width;
                z = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.f2214f) >= Math.round(view.getWidth() * 0.5f)) {
            }
        }
        if (swipeDismissBehavior.f4402a.m4499n(i, view.getTop())) {
            view.postOnAnimation(new RunnableC0044B0(swipeDismissBehavior, view, z));
        }
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: W */
    public final boolean mo1390W(View view, int i) {
        int i2 = this.f2215g;
        return (i2 == -1 || i2 == i) && this.f2216h.mo2426r(view);
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: j */
    public final int mo1391j(View view, int i) {
        int width;
        int width2;
        int width3;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.f2216h.f4405d;
        if (i2 == 0) {
            if (z) {
                width = this.f2214f - view.getWidth();
                width2 = this.f2214f;
            } else {
                width = this.f2214f;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.f2214f - view.getWidth();
            width2 = view.getWidth() + this.f2214f;
        } else if (z) {
            width = this.f2214f;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f2214f - view.getWidth();
            width2 = this.f2214f;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // p000.AbstractC1293cr
    /* JADX INFO: renamed from: k */
    public final int mo1392k(View view, int i) {
        return view.getTop();
    }
}
