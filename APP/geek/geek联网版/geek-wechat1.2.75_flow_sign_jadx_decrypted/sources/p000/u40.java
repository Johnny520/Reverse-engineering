package p000;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u40 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f4625a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public int f4626b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public int f4627c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public int f4628d = 0;

    /* JADX INFO: renamed from: e */
    public final int f4629e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ StaggeredGridLayoutManager f4630f;

    public u40(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f4630f = staggeredGridLayoutManager;
        this.f4629e = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m2430a() {
        View view = (View) this.f4625a.get(r0.size() - 1);
        r40 r40Var = (r40) view.getLayoutParams();
        this.f4627c = this.f4630f.f603r.mo636b(view);
        r40Var.getClass();
    }

    /* JADX INFO: renamed from: b */
    public final void m2431b() {
        this.f4625a.clear();
        this.f4626b = Integer.MIN_VALUE;
        this.f4627c = Integer.MIN_VALUE;
        this.f4628d = 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m2432c() {
        return this.f4630f.f608w ? m2434e(r1.size() - 1, -1) : m2434e(0, this.f4625a.size());
    }

    /* JADX INFO: renamed from: d */
    public final int m2433d() {
        return this.f4630f.f608w ? m2434e(0, this.f4625a.size()) : m2434e(r1.size() - 1, -1);
    }

    /* JADX INFO: renamed from: e */
    public final int m2434e(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f4630f;
        int iMo645k = staggeredGridLayoutManager.f603r.mo645k();
        int iMo641g = staggeredGridLayoutManager.f603r.mo641g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f4625a.get(i);
            int iMo639e = staggeredGridLayoutManager.f603r.mo639e(view);
            int iMo636b = staggeredGridLayoutManager.f603r.mo636b(view);
            boolean z = iMo639e <= iMo641g;
            boolean z2 = iMo636b >= iMo645k;
            if (z && z2 && (iMo639e < iMo645k || iMo636b > iMo641g)) {
                return AbstractC0799uz.m2501F(view);
            }
            i += i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public final int m2435f(int i) {
        int i2 = this.f4627c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f4625a.size() == 0) {
            return i;
        }
        m2430a();
        return this.f4627c;
    }

    /* JADX INFO: renamed from: g */
    public final View m2436g(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f4630f;
        ArrayList arrayList = this.f4625a;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f608w && AbstractC0799uz.m2501F(view2) >= i) || ((!staggeredGridLayoutManager.f608w && AbstractC0799uz.m2501F(view2) <= i) || !view2.hasFocusable())) {
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
            if ((staggeredGridLayoutManager.f608w && AbstractC0799uz.m2501F(view3) <= i) || ((!staggeredGridLayoutManager.f608w && AbstractC0799uz.m2501F(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    /* JADX INFO: renamed from: h */
    public final int m2437h(int i) {
        int i2 = this.f4626b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        ArrayList arrayList = this.f4625a;
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        r40 r40Var = (r40) view.getLayoutParams();
        this.f4626b = this.f4630f.f603r.mo639e(view);
        r40Var.getClass();
        return this.f4626b;
    }
}
