package p000;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a00 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f3a;

    /* JADX INFO: renamed from: b */
    public ArrayList f4b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f5c;

    /* JADX INFO: renamed from: d */
    public final List f6d;

    /* JADX INFO: renamed from: e */
    public int f7e;

    /* JADX INFO: renamed from: f */
    public int f8f;

    /* JADX INFO: renamed from: g */
    public C0985zz f9g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ RecyclerView f10h;

    public a00(RecyclerView recyclerView) {
        this.f10h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f3a = arrayList;
        this.f4b = null;
        this.f5c = new ArrayList();
        this.f6d = Collections.unmodifiableList(arrayList);
        this.f7e = 2;
        this.f8f = 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m3a(i00 i00Var, boolean z) {
        RecyclerView.m357j(i00Var);
        View view = i00Var.f2296a;
        RecyclerView recyclerView = this.f10h;
        k00 k00Var = recyclerView.f565j0;
        if (k00Var != null) {
            j00 j00Var = k00Var.f2762e;
            oa0.m2012l(view, j00Var != null ? (C0875x) j00Var.f2622e.remove(view) : null);
        }
        if (z && recyclerView.f551c0 != null) {
            recyclerView.f556f.m838J(i00Var);
        }
        i00Var.f2313r = null;
        C0985zz c0985zzM5c = m5c();
        c0985zzM5c.getClass();
        int i = i00Var.f2301f;
        ArrayList arrayList = c0985zzM5c.m2853a(i).f5518a;
        if (((C0948yz) c0985zzM5c.f5631a.get(i)).f5519b <= arrayList.size()) {
            return;
        }
        i00Var.m1431m();
        arrayList.add(i00Var);
    }

    /* JADX INFO: renamed from: b */
    public final int m4b(int i) {
        RecyclerView recyclerView = this.f10h;
        if (i >= 0 && i < recyclerView.f551c0.m1068b()) {
            return !recyclerView.f551c0.f1711g ? i : recyclerView.f552d.m2717e(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.f551c0.m1068b() + recyclerView.m403y());
    }

    /* JADX INFO: renamed from: c */
    public final C0985zz m5c() {
        if (this.f9g == null) {
            C0985zz c0985zz = new C0985zz();
            c0985zz.f5631a = new SparseArray();
            c0985zz.f5632b = 0;
            this.f9g = c0985zz;
        }
        return this.f9g;
    }

    /* JADX INFO: renamed from: d */
    public final void m6d() {
        ArrayList arrayList = this.f5c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m7e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f520s0;
        C0157dn c0157dn = this.f10h.f549b0;
        int[] iArr2 = c0157dn.f1398c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        c0157dn.f1399d = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m7e(int i) {
        ArrayList arrayList = this.f5c;
        m3a((i00) arrayList.get(i), true);
        arrayList.remove(i);
    }

    /* JADX INFO: renamed from: f */
    public final void m8f(View view) {
        i00 i00VarM352I = RecyclerView.m352I(view);
        boolean zM1428j = i00VarM352I.m1428j();
        RecyclerView recyclerView = this.f10h;
        if (zM1428j) {
            recyclerView.removeDetachedView(view, false);
        }
        if (i00VarM352I.m1427i()) {
            i00VarM352I.f2309n.m12j(i00VarM352I);
        } else if (i00VarM352I.m1434p()) {
            i00VarM352I.f2305j &= -33;
        }
        m9g(i00VarM352I);
        if (recyclerView.f530H == null || i00VarM352I.m1425g()) {
            return;
        }
        recyclerView.f530H.mo2192d(i00VarM352I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9g(p000.i00 r12) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.a00.m9g(i00):void");
    }

    /* JADX INFO: renamed from: h */
    public final void m10h(View view) {
        AbstractC0651qz abstractC0651qz;
        i00 i00VarM352I = RecyclerView.m352I(view);
        int i = i00VarM352I.f2305j & 12;
        RecyclerView recyclerView = this.f10h;
        if (i == 0 && i00VarM352I.m1429k() && (abstractC0651qz = recyclerView.f530H) != null) {
            C0816vf c0816vf = (C0816vf) abstractC0651qz;
            if (i00VarM352I.m1421c().isEmpty() && c0816vf.f4942g && !i00VarM352I.m1424f()) {
                if (this.f4b == null) {
                    this.f4b = new ArrayList();
                }
                i00VarM352I.f2309n = this;
                i00VarM352I.f2310o = true;
                this.f4b.add(i00VarM352I);
                return;
            }
        }
        if (i00VarM352I.m1424f() && !i00VarM352I.m1426h() && !recyclerView.f566k.f3197b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.m403y());
        }
        i00VarM352I.f2309n = this;
        i00VarM352I.f2310o = false;
        this.f3a.add(i00VarM352I);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p000.i00 m11i(int r28, long r29) {
        /*
            Method dump skipped, instruction units count: 1398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.a00.m11i(int, long):i00");
    }

    /* JADX INFO: renamed from: j */
    public final void m12j(i00 i00Var) {
        if (i00Var.f2310o) {
            this.f4b.remove(i00Var);
        } else {
            this.f3a.remove(i00Var);
        }
        i00Var.f2309n = null;
        i00Var.f2310o = false;
        i00Var.f2305j &= -33;
    }

    /* JADX INFO: renamed from: k */
    public final void m13k() {
        AbstractC0799uz abstractC0799uz = this.f10h.f568l;
        this.f8f = this.f7e + (abstractC0799uz != null ? abstractC0799uz.f4864j : 0);
        ArrayList arrayList = this.f5c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f8f; size--) {
            m7e(size);
        }
    }
}
