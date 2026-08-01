package defpackage;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n40 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public final int e;
    public final /* synthetic */ StaggeredGridLayoutManager f;

    public n40(StaggeredGridLayoutManager r1, int r2) {
        this.f = r1;
        this.a = new ArrayList();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
        this.e = r2;
    }

    public final void a() {
        View r0 = (View) this.a.get(r0.size() - 1);
        k40 r1 = (k40) r0.getLayoutParams();
        this.c = this.f.r.b(r0);
        r1.getClass();
    }

    public final void b() {
        this.a.clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public final int c() {
        boolean r0 = this.f.w;
        ArrayList r1 = this.a;
        if (r0 == false) goto L7;
        return e(r1.size() - 1, -1);
    L7:
        return e(0, r1.size());
    }

    public final int d() {
        boolean r0 = this.f.w;
        ArrayList r1 = this.a;
        if (r0 == false) goto L7;
        return e(0, r1.size());
    L7:
        return e(r1.size() - 1, -1);
    }

    public final int e(int r12, int r13) {
        StaggeredGridLayoutManager r0 = this.f;
        int r1 = r0.r.k();
        int r2 = r0.r.g();
        if (r13 <= r12) goto L5;
        int r5 = 1;
    L6:
        if (r12 == r13) goto L20;
        View r6 = (View) this.a.get(r12);
        int r7 = r0.r.e(r6);
        int r8 = r0.r.b(r6);
        boolean r9 = false;
        if (r7 > r2) goto L10;
        boolean r10 = true;
    L11:
        if (r8 < r1) goto L13;
        r9 = true;
    L13:
        if (r10 == false) goto L19;
        if (r9 == false) goto L19;
        if (r7 < r1) goto L18;
        if (r8 <= r2) goto L19;
    L18:
        return nz.F(r6);
    L19:
        r12 = r12 + r5;
        goto L6
    L10:
        r10 = false;
        goto L11
    L20:
        return -1;
    L5:
        r5 = -1;
        goto L6
    }

    public final int f(int r3) {
        int r0 = this.c;
        if (r0 == Integer.MIN_VALUE) goto L6;
        return r0;
    L6:
        if (this.a.size() != 0) goto L8;
        return r3;
    L8:
        a();
        return this.c;
    }

    public final View g(int r7, int r8) {
        StaggeredGridLayoutManager r1 = this.f;
        ArrayList r2 = this.a;
        View r3 = null;
        if (r8 != (-1)) goto L19;
        int r82 = r2.size();
        int r0 = 0;
    L5:
        if (r0 >= r82) goto L18;
        View r4 = (View) r2.get(r0);
        if (r1.w == false) goto L11;
        if (nz.F(r4) <= r7) goto L18;
    L11:
        if (r1.w == true) goto L16;
        if (nz.F(r4) >= r7) goto L18;
    L16:
        if (r4.hasFocusable() == false) goto L18;
        r0 = r0 + 1;
        r3 = r4;
    L18:
        return r3;
    L19:
        int r83 = r2.size() - 1;
    L20:
        if (r83 < 0) goto L33;
        View r02 = (View) r2.get(r83);
        if (r1.w == false) goto L26;
        if (nz.F(r02) >= r7) goto L33;
    L26:
        if (r1.w == true) goto L31;
        if (nz.F(r02) <= r7) goto L33;
    L31:
        if (r02.hasFocusable() == false) goto L33;
        r83 = r83 - 1;
        r3 = r02;
    L33:
        return r3;
    }

    public final int h(int r3) {
        int r0 = this.b;
        if (r0 == Integer.MIN_VALUE) goto L5;
        return r0;
    L5:
        ArrayList r02 = this.a;
        if (r02.size() != 0) goto L8;
        return r3;
    L8:
        View r32 = (View) r02.get(0);
        k40 r03 = (k40) r32.getLayoutParams();
        this.b = this.f.r.e(r32);
        r03.getClass();
        return this.b;
    }
}
