package p000;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n40 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f3326a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public int f3327b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public int f3328c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public int f3329d = 0;

    /* JADX INFO: renamed from: e */
    public final int f3330e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ StaggeredGridLayoutManager f3331f;

    public n40(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f3331f = staggeredGridLayoutManager;
        this.f3330e = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m1897a() {
        View view = (View) this.f3326a.get(r0.size() - 1);
        k40 k40Var = (k40) view.getLayoutParams();
        this.f3328c = this.f3331f.f640r.mo98b(view);
        k40Var.getClass();
    }

    /* JADX INFO: renamed from: b */
    public final void m1898b() {
        this.f3326a.clear();
        this.f3327b = Integer.MIN_VALUE;
        this.f3328c = Integer.MIN_VALUE;
        this.f3329d = 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m1899c() {
        return this.f3331f.f645w ? m1901e(r1.size() - 1, -1) : m1901e(0, this.f3326a.size());
    }

    /* JADX INFO: renamed from: d */
    public final int m1900d() {
        return this.f3331f.f645w ? m1901e(0, this.f3326a.size()) : m1901e(r1.size() - 1, -1);
    }

    /* JADX INFO: renamed from: e */
    public final int m1901e(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f3331f;
        int iMo107k = staggeredGridLayoutManager.f640r.mo107k();
        int iMo103g = staggeredGridLayoutManager.f640r.mo103g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f3326a.get(i);
            int iMo101e = staggeredGridLayoutManager.f640r.mo101e(view);
            int iMo98b = staggeredGridLayoutManager.f640r.mo98b(view);
            boolean z = iMo101e <= iMo103g;
            boolean z2 = iMo98b >= iMo107k;
            if (z && z2 && (iMo101e < iMo107k || iMo98b > iMo103g)) {
                return AbstractC0540nz.m1953F(view);
            }
            i += i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public final int m1902f(int i) {
        int i2 = this.f3328c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f3326a.size() == 0) {
            return i;
        }
        m1897a();
        return this.f3328c;
    }

    /* JADX INFO: renamed from: g */
    public final View m1903g(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f3331f;
        ArrayList arrayList = this.f3326a;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f645w && AbstractC0540nz.m1953F(view2) >= i) || ((!staggeredGridLayoutManager.f645w && AbstractC0540nz.m1953F(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.f645w && AbstractC0540nz.m1953F(view3) <= i) || ((!staggeredGridLayoutManager.f645w && AbstractC0540nz.m1953F(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    /* JADX INFO: renamed from: h */
    public final int m1904h(int i) {
        int i2 = this.f3327b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        ArrayList arrayList = this.f3326a;
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        k40 k40Var = (k40) view.getLayoutParams();
        this.f3327b = this.f3331f.f640r.mo101e(view);
        k40Var.getClass();
        return this.f3327b;
    }
}
