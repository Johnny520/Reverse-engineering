package p000a;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: a.v9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0878v9 extends AbstractC0522ce {

    /* JADX INFO: renamed from: a */
    public final SideSheetBehavior<? extends View> f3443a;

    public C0878v9(SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.f3443a = sideSheetBehavior;
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: a */
    public final int mo1284a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: b */
    public final float mo1285b(int i) {
        float fMo1287d = mo1287d();
        return (i - fMo1287d) / (mo1286c() - fMo1287d);
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: c */
    public final int mo1286c() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f3443a;
        return Math.max(0, sideSheetBehavior.f5845n + sideSheetBehavior.f5846o);
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: d */
    public final int mo1287d() {
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f3443a;
        return (-sideSheetBehavior.f5843l) - sideSheetBehavior.f5846o;
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: e */
    public final int mo1288e() {
        return this.f3443a.f5846o;
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: f */
    public final int mo1289f() {
        return -this.f3443a.f5843l;
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: g */
    public final <V extends View> int mo1290g(V v) {
        return v.getRight() + this.f3443a.f5846o;
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: h */
    public final int mo1291h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: i */
    public final int mo1292i() {
        return 1;
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: j */
    public final boolean mo1293j(float f) {
        return f > 0.0f;
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: k */
    public final boolean mo1294k(View view) {
        return view.getRight() < (mo1286c() - mo1287d()) / 2;
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: l */
    public final boolean mo1295l(float f, float f2) {
        if (Math.abs(f) <= Math.abs(f2)) {
            return false;
        }
        float fAbs = Math.abs(f);
        this.f3443a.getClass();
        return fAbs > ((float) 500);
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: m */
    public final boolean mo1296m(View view, float f) {
        float left = view.getLeft();
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f3443a;
        float fAbs = Math.abs((f * sideSheetBehavior.f5842k) + left);
        sideSheetBehavior.getClass();
        return fAbs > 0.5f;
    }

    @Override // p000a.AbstractC0522ce
    /* JADX INFO: renamed from: n */
    public final void mo1297n(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        if (i <= this.f3443a.f5844m) {
            marginLayoutParams.leftMargin = i2;
        }
    }
}
