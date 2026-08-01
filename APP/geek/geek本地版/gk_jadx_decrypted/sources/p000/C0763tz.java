package p000;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: tz */
/* JADX INFO: loaded from: classes.dex */
public final class C0763tz {

    /* JADX INFO: renamed from: a */
    public final ArrayList f4633a;

    /* JADX INFO: renamed from: b */
    public ArrayList f4634b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f4635c;

    /* JADX INFO: renamed from: d */
    public final List f4636d;

    /* JADX INFO: renamed from: e */
    public int f4637e;

    /* JADX INFO: renamed from: f */
    public int f4638f;

    /* JADX INFO: renamed from: g */
    public C0726sz f4639g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ RecyclerView f4640h;

    public C0763tz(RecyclerView recyclerView) {
        this.f4640h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f4633a = arrayList;
        this.f4634b = null;
        this.f4635c = new ArrayList();
        this.f4636d = Collections.unmodifiableList(arrayList);
        this.f4637e = 2;
        this.f4638f = 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m2393a(b00 b00Var, boolean z) {
        RecyclerView.m372j(b00Var);
        View view = b00Var.f697a;
        RecyclerView recyclerView = this.f4640h;
        d00 d00Var = recyclerView.f602j0;
        if (d00Var != null) {
            c00 c00Var = d00Var.f1346e;
            ja0.m1575l(view, c00Var != null ? (C0875x) c00Var.f862e.remove(view) : null);
        }
        if (z && recyclerView.f588c0 != null) {
            recyclerView.f593f.m879J(b00Var);
        }
        b00Var.f714r = null;
        C0726sz c0726szM2395c = m2395c();
        c0726szM2395c.getClass();
        int i = b00Var.f702f;
        ArrayList arrayList = c0726szM2395c.m2341a(i).f4358a;
        if (((C0689rz) c0726szM2395c.f4472a.get(i)).f4359b <= arrayList.size()) {
            return;
        }
        b00Var.m493m();
        arrayList.add(b00Var);
    }

    /* JADX INFO: renamed from: b */
    public final int m2394b(int i) {
        RecyclerView recyclerView = this.f4640h;
        if (i >= 0 && i < recyclerView.f588c0.m2745b()) {
            return !recyclerView.f588c0.f5421g ? i : recyclerView.f589d.m2647e(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.f588c0.m2745b() + recyclerView.m418y());
    }

    /* JADX INFO: renamed from: c */
    public final C0726sz m2395c() {
        if (this.f4639g == null) {
            C0726sz c0726sz = new C0726sz();
            c0726sz.f4472a = new SparseArray();
            c0726sz.f4473b = 0;
            this.f4639g = c0726sz;
        }
        return this.f4639g;
    }

    /* JADX INFO: renamed from: d */
    public final void m2396d() {
        ArrayList arrayList = this.f4635c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m2397e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f557s0;
        C0074bn c0074bn = this.f4640h.f586b0;
        int[] iArr2 = c0074bn.f815c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        c0074bn.f816d = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m2397e(int i) {
        ArrayList arrayList = this.f4635c;
        m2393a((b00) arrayList.get(i), true);
        arrayList.remove(i);
    }

    /* JADX INFO: renamed from: f */
    public final void m2398f(View view) {
        b00 b00VarM367I = RecyclerView.m367I(view);
        boolean zM490j = b00VarM367I.m490j();
        RecyclerView recyclerView = this.f4640h;
        if (zM490j) {
            recyclerView.removeDetachedView(view, false);
        }
        if (b00VarM367I.m489i()) {
            b00VarM367I.f710n.m2402j(b00VarM367I);
        } else if (b00VarM367I.m496p()) {
            b00VarM367I.f706j &= -33;
        }
        m2399g(b00VarM367I);
        if (recyclerView.f567H == null || b00VarM367I.m487g()) {
            return;
        }
        recyclerView.f567H.mo1613d(b00VarM367I);
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
    public final void m2399g(p000.b00 r12) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0763tz.m2399g(b00):void");
    }

    /* JADX INFO: renamed from: h */
    public final void m2400h(View view) {
        AbstractC0392jz abstractC0392jz;
        b00 b00VarM367I = RecyclerView.m367I(view);
        int i = b00VarM367I.f706j & 12;
        RecyclerView recyclerView = this.f4640h;
        if (i == 0 && b00VarM367I.m491k() && (abstractC0392jz = recyclerView.f567H) != null) {
            C0780uf c0780uf = (C0780uf) abstractC0392jz;
            if (b00VarM367I.m483c().isEmpty() && c0780uf.f4717g && !b00VarM367I.m486f()) {
                if (this.f4634b == null) {
                    this.f4634b = new ArrayList();
                }
                b00VarM367I.f710n = this;
                b00VarM367I.f711o = true;
                this.f4634b.add(b00VarM367I);
                return;
            }
        }
        if (b00VarM367I.m486f() && !b00VarM367I.m488h() && !recyclerView.f603k.f1998b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.m418y());
        }
        b00VarM367I.f710n = this;
        b00VarM367I.f711o = false;
        this.f4633a.add(b00VarM367I);
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
    public final p000.b00 m2401i(int r28, long r29) {
        /*
            Method dump skipped, instruction units count: 1398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0763tz.m2401i(int, long):b00");
    }

    /* JADX INFO: renamed from: j */
    public final void m2402j(b00 b00Var) {
        if (b00Var.f711o) {
            this.f4634b.remove(b00Var);
        } else {
            this.f4633a.remove(b00Var);
        }
        b00Var.f710n = null;
        b00Var.f711o = false;
        b00Var.f706j &= -33;
    }

    /* JADX INFO: renamed from: k */
    public final void m2403k() {
        AbstractC0540nz abstractC0540nz = this.f4640h.f605l;
        this.f4638f = this.f4637e + (abstractC0540nz != null ? abstractC0540nz.f3464j : 0);
        ArrayList arrayList = this.f4635c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f4638f; size--) {
            m2397e(size);
        }
    }
}
