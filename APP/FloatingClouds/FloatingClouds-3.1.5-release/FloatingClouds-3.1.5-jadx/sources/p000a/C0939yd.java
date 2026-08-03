package p000a;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: a.yd */
/* JADX INFO: loaded from: classes.dex */
public final class C0939yd extends AbstractC0522ce {

    /* JADX INFO: renamed from: a */
    public final SideSheetBehavior<? extends View> f3551a;

    public C0939yd(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f3551a = sideSheetBehavior;
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: a */
    public final int mo1284a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: b */
    public final float mo1285b(int i) {
        float f = this.f3551a.f5844m;
        return (f - i) / (f - mo1286c());
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: c */
    public final int mo1286c() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f3551a;
        return Math.max(0, (sideSheetBehavior.f5844m - sideSheetBehavior.f5843l) - sideSheetBehavior.f5846o);
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: d */
    public final int mo1287d() {
        return this.f3551a.f5844m;
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: e */
    public final int mo1288e() {
        return this.f3551a.f5844m;
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: f */
    public final int mo1289f() {
        return mo1286c();
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: g */
    public final <V extends View> int mo1290g(V v) {
        return v.getLeft() - this.f3551a.f5846o;
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: h */
    public final int mo1291h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: i */
    public final int mo1292i() {
        return 0;
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: j */
    public final boolean mo1293j(float f) {
        return f < 0.0f;
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: k */
    public final boolean mo1294k(View view) {
        return view.getLeft() > (mo1286c() + this.f3551a.f5844m) / 2;
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: l */
    public final boolean mo1295l(float f, float f2) {
        if (Math.abs(f) <= Math.abs(f2)) {
            return false;
        }
        float fAbs = Math.abs(f);
        this.f3551a.getClass();
        return fAbs > ((float) 500);
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: m */
    public final boolean mo1296m(View view, float f) {
        float right = view.getRight();
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f3551a;
        float fAbs = Math.abs((f * sideSheetBehavior.f5842k) + right);
        sideSheetBehavior.getClass();
        return fAbs > 0.5f;
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: n */
    public final void mo1297n(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.f3551a.f5844m;
        if (i <= i3) {
            marginLayoutParams.rightMargin = i3 - i;
        }
    }
}
