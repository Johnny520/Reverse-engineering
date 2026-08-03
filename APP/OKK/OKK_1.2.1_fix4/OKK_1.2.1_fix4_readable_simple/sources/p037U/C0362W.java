package p037U;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* JADX INFO: renamed from: U.W */
/* JADX INFO: loaded from: classes.dex */
public final class C0362W {

    /* JADX INFO: renamed from: a */
    public final ArrayList f761a;

    /* JADX INFO: renamed from: b */
    public int f762b;

    /* JADX INFO: renamed from: c */
    public int f763c;

    /* JADX INFO: renamed from: d */
    public int f764d;

    /* JADX INFO: renamed from: e */
    public final int f765e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ StaggeredGridLayoutManager f766f;

    public C0362W(StaggeredGridLayoutManager r1, int r2) {
        this.f766f = r1;
        this.f761a = new ArrayList();
        this.f762b = Integer.MIN_VALUE;
        this.f763c = Integer.MIN_VALUE;
        this.f764d = 0;
        this.f765e = r2;
    }

    /* JADX INFO: renamed from: a */
    public final void m927a() {
        View r02 = (View) this.f761a.get(r0.size() - 1);
        C0359T r1 = (C0359T) r02.getLayoutParams();
        this.f763c = this.f766f.f1600m.m964b(r02);
        r1.getClass();
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
        boolean r02 = this.f766f.f1604q;
        ArrayList r1 = this.f761a;
        if (r02 == false) goto L6;
        return m931e(r1.size() - 1, -1);
    L6:
        return m931e(0, r1.size());
    }

    /* JADX INFO: renamed from: d */
    public final int m930d() {
        boolean r02 = this.f766f.f1604q;
        ArrayList r1 = this.f761a;
        if (r02 == false) goto L6;
        return m931e(0, r1.size());
    L6:
        return m931e(r1.size() - 1, -1);
    }

    /* JADX INFO: renamed from: e */
    public final int m931e(int r12, int r13) {
        StaggeredGridLayoutManager r02 = this.f766f;
        int r1 = r02.f1600m.m973k();
        int r2 = r02.f1600m.m969g();
        if (r13 <= r12) goto L5;
        int r5 = 1;
    L6:
        if (r12 == r13) goto L27;
        View r6 = (View) this.f761a.get(r12);
        int r7 = r02.f1600m.m967e(r6);
        int r8 = r02.f1600m.m964b(r6);
        boolean r9 = false;
        if (r7 > r2) goto L10;
        boolean r10 = true;
    L11:
        if (r8 < r1) goto L13;
        r9 = true;
    L13:
        if (r10 == false) goto L18;
        if (r9 == false) goto L18;
        if (r7 < r1) goto L19;
        if (r8 <= r2) goto L18;
    L19:
        return AbstractC0343C.m765D(r6);
    L18:
        r12 = r12 + r5;
        goto L6
    L10:
        r10 = false;
        goto L11
    L27:
        return -1;
    L5:
        r5 = -1;
        goto L6
    }

    /* JADX INFO: renamed from: f */
    public final int m932f(int r3) {
        int r02 = this.f763c;
        if (r02 == Integer.MIN_VALUE) goto L6;
        return r02;
    L6:
        if (this.f761a.size() != 0) goto L8;
        return r3;
    L8:
        m927a();
        return this.f763c;
    }

    /* JADX INFO: renamed from: g */
    public final View m933g(int r7, int r8) {
        ArrayList r02 = this.f761a;
        StaggeredGridLayoutManager r2 = this.f766f;
        View r3 = null;
        if (r8 != (-1)) goto L18;
        int r82 = r02.size();
        int r1 = 0;
    L5:
        if (r1 >= r82) goto L32;
        View r4 = (View) r02.get(r1);
        if (r2.f1604q == false) goto L11;
        if (AbstractC0343C.m765D(r4) <= r7) goto L32;
    L11:
        if (r2.f1604q == true) goto L16;
        if (AbstractC0343C.m765D(r4) >= r7) goto L32;
    L16:
        if (r4.hasFocusable() == false) goto L32;
        r1 = r1 + 1;
        r3 = r4;
    L32:
        return r3;
    L18:
        int r83 = r02.size() - 1;
    L19:
        if (r83 < 0) goto L32;
        View r12 = (View) r02.get(r83);
        if (r2.f1604q == false) goto L25;
        if (AbstractC0343C.m765D(r12) >= r7) goto L32;
    L25:
        if (r2.f1604q == true) goto L30;
        if (AbstractC0343C.m765D(r12) <= r7) goto L32;
    L30:
        if (r12.hasFocusable() == false) goto L32;
        r83 = r83 - 1;
        r3 = r12;
        goto L19
    }

    /* JADX INFO: renamed from: h */
    public final int m934h(int r3) {
        int r02 = this.f762b;
        if (r02 == Integer.MIN_VALUE) goto L6;
        return r02;
    L6:
        if (this.f761a.size() != 0) goto L8;
        return r3;
    L8:
        View r32 = (View) this.f761a.get(0);
        C0359T r03 = (C0359T) r32.getLayoutParams();
        this.f762b = this.f766f.f1600m.m967e(r32);
        r03.getClass();
        return this.f762b;
    }
}
