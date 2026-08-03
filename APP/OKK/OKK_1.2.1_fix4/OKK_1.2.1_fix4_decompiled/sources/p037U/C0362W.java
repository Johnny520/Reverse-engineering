package p037U;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: renamed from: U.W */
/* JADX INFO: loaded from: classes.dex */
public final class C0362W {

    /* JADX INFO: renamed from: a */
    public final ArrayList f761a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public int f762b = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public int f763c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public int f764d = 0;

    /* JADX INFO: renamed from: e */
    public final int f765e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ StaggeredGridLayoutManager f766f;

    public C0362W(StaggeredGridLayoutManager staggeredGridLayoutManager, int i2) {
        this.f766f = staggeredGridLayoutManager;
        this.f765e = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m927a() {
        View view = (View) this.f761a.get(r0.size() - 1);
        C0359T c0359t = (C0359T) view.getLayoutParams();
        this.f763c = this.f766f.f1600m.m964b(view);
        c0359t.getClass();
    }

    /* JADX INFO: renamed from: b */
    public final void m928b() {
        this.f761a.clear();
        this.f762b = Integer.MIN_VALUE;
        this.f763c = Integer.MIN_VALUE;
        this.f764d = 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m929c() {
        return this.f766f.f1604q ? m931e(r1.size() - 1, -1) : m931e(0, this.f761a.size());
    }

    /* JADX INFO: renamed from: d */
    public final int m930d() {
        return this.f766f.f1604q ? m931e(0, this.f761a.size()) : m931e(r1.size() - 1, -1);
    }

    /* JADX INFO: renamed from: e */
    public final int m931e(int i2, int i3) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f766f;
        int iM973k = staggeredGridLayoutManager.f1600m.m973k();
        int iM969g = staggeredGridLayoutManager.f1600m.m969g();
        int i4 = i3 > i2 ? 1 : -1;
        while (i2 != i3) {
            View view = (View) this.f761a.get(i2);
            int iM967e = staggeredGridLayoutManager.f1600m.m967e(view);
            int iM964b = staggeredGridLayoutManager.f1600m.m964b(view);
            boolean z2 = iM967e <= iM969g;
            boolean z3 = iM964b >= iM973k;
            if (z2 && z3 && (iM967e < iM973k || iM964b > iM969g)) {
                return AbstractC0343C.m765D(view);
            }
            i2 += i4;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public final int m932f(int i2) {
        int i3 = this.f763c;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.f761a.size() == 0) {
            return i2;
        }
        m927a();
        return this.f763c;
    }

    /* JADX INFO: renamed from: g */
    public final View m933g(int i2, int i3) {
        ArrayList arrayList = this.f761a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f766f;
        View view = null;
        if (i3 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f1604q && AbstractC0343C.m765D(view2) >= i2) || ((!staggeredGridLayoutManager.f1604q && AbstractC0343C.m765D(view2) <= i2) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i4 = 0;
            while (i4 < size2) {
                View view3 = (View) arrayList.get(i4);
                if ((staggeredGridLayoutManager.f1604q && AbstractC0343C.m765D(view3) <= i2) || ((!staggeredGridLayoutManager.f1604q && AbstractC0343C.m765D(view3) >= i2) || !view3.hasFocusable())) {
                    break;
                }
                i4++;
                view = view3;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: h */
    public final int m934h(int i2) {
        int i3 = this.f762b;
        if (i3 != Integer.MIN_VALUE) {
            return i3;
        }
        if (this.f761a.size() == 0) {
            return i2;
        }
        View view = (View) this.f761a.get(0);
        C0359T c0359t = (C0359T) view.getLayoutParams();
        this.f762b = this.f766f.f1600m.m967e(view);
        c0359t.getClass();
        return this.f762b;
    }
}
