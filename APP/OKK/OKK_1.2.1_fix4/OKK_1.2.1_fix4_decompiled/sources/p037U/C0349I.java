package p037U;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import p006D.AbstractC0080Q;
import p006D.C0091b;
import p018J0.C0234d;

/* JADX INFO: renamed from: U.I */
/* JADX INFO: loaded from: classes.dex */
public final class C0349I {

    /* JADX INFO: renamed from: a */
    public final ArrayList f685a;

    /* JADX INFO: renamed from: b */
    public ArrayList f686b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f687c;

    /* JADX INFO: renamed from: d */
    public int f688d;

    /* JADX INFO: renamed from: e */
    public int f689e;

    /* JADX INFO: renamed from: f */
    public C0348H f690f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ RecyclerView f691g;

    public C0349I(RecyclerView recyclerView) {
        this.f691g = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f685a = arrayList;
        this.f686b = null;
        this.f687c = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f688d = 2;
        this.f689e = 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m821a(AbstractC0355O abstractC0355O, boolean z2) {
        RecyclerView.m1300e(abstractC0355O);
        RecyclerView recyclerView = this.f691g;
        C0357Q c0357q = recyclerView.f1569d0;
        if (c0357q != null) {
            C0356P c0356p = c0357q.f720e;
            boolean z3 = c0356p instanceof C0356P;
            abstractC0355O.getClass();
            AbstractC0080Q.m291j(null, z3 ? (C0091b) c0356p.f718e.remove(null) : null);
        }
        if (z2 && recyclerView.f1561W != null) {
            recyclerView.f1570e.m13n(abstractC0355O);
        }
        abstractC0355O.f716g = null;
        C0348H c0348hM823c = m823c();
        c0348hM823c.getClass();
        abstractC0355O.getClass();
        ArrayList arrayList = c0348hM823c.m820a(0).f680a;
        if (((C0347G) c0348hM823c.f683a.get(0)).f681b <= arrayList.size()) {
            return;
        }
        abstractC0355O.m847m();
        arrayList.add(abstractC0355O);
    }

    /* JADX INFO: renamed from: b */
    public final int m822b(int i2) {
        RecyclerView recyclerView = this.f691g;
        if (i2 >= 0 && i2 < recyclerView.f1561W.m832a()) {
            return !recyclerView.f1561W.f698f ? i2 : recyclerView.f1566c.m642e(i2, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + recyclerView.f1561W.m832a() + recyclerView.m1324p());
    }

    /* JADX INFO: renamed from: c */
    public final C0348H m823c() {
        if (this.f690f == null) {
            C0348H c0348h = new C0348H();
            c0348h.f683a = new SparseArray();
            c0348h.f684b = 0;
            this.f690f = c0348h;
        }
        return this.f690f;
    }

    /* JADX INFO: renamed from: d */
    public final void m824d() {
        ArrayList arrayList = this.f687c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m825e(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.f1536k0;
        C0376l c0376l = this.f691g.f1560V;
        c0376l.getClass();
        c0376l.f826c = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m825e(int i2) {
        ArrayList arrayList = this.f687c;
        m821a((AbstractC0355O) arrayList.get(i2), true);
        arrayList.remove(i2);
    }

    /* JADX INFO: renamed from: f */
    public final void m826f(View view) {
        AbstractC0355O abstractC0355OM1301u = RecyclerView.m1301u(view);
        boolean zM845k = abstractC0355OM1301u.m845k();
        RecyclerView recyclerView = this.f691g;
        if (zM845k) {
            recyclerView.removeDetachedView(view, false);
        }
        if (abstractC0355OM1301u.m844j()) {
            abstractC0355OM1301u.f712c.m830j(abstractC0355OM1301u);
        } else if (abstractC0355OM1301u.m850p()) {
            abstractC0355OM1301u.f711b &= -33;
        }
        m827g(abstractC0355OM1301u);
        if (recyclerView.f1544F == null || abstractC0355OM1301u.m842h()) {
            return;
        }
        recyclerView.f1544F.mo946c(abstractC0355OM1301u);
    }

    /* JADX INFO: renamed from: g */
    public final void m827g(AbstractC0355O abstractC0355O) {
        boolean zM844j = abstractC0355O.m844j();
        abstractC0355O.getClass();
        if (!zM844j) {
            throw null;
        }
        StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
        sb.append(abstractC0355O.m844j());
        sb.append(" isAttached:");
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public final void m828h(View view) {
        AbstractC0390z abstractC0390z;
        AbstractC0355O abstractC0355OM1301u = RecyclerView.m1301u(view);
        boolean zM838d = abstractC0355OM1301u.m838d(12);
        RecyclerView recyclerView = this.f691g;
        if (!zM838d && abstractC0355OM1301u.m846l() && (abstractC0390z = recyclerView.f1544F) != null) {
            C0371g c0371g = (C0371g) abstractC0390z;
            if (abstractC0355OM1301u.m837c().isEmpty() && c0371g.f784g && !abstractC0355OM1301u.m841g()) {
                if (this.f686b == null) {
                    this.f686b = new ArrayList();
                }
                abstractC0355OM1301u.f712c = this;
                abstractC0355OM1301u.f713d = true;
                this.f686b.add(abstractC0355OM1301u);
                return;
            }
        }
        if (abstractC0355OM1301u.m841g() && !abstractC0355OM1301u.m843i()) {
            recyclerView.getClass();
            throw null;
        }
        abstractC0355OM1301u.f712c = this;
        abstractC0355OM1301u.f713d = false;
        this.f685a.add(abstractC0355OM1301u);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ff  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0355O m829i(int i2, long j2) {
        View view;
        int iM938b;
        ArrayList arrayList;
        int size;
        RecyclerView recyclerView = this.f691g;
        if (i2 < 0 || i2 >= recyclerView.f1561W.m832a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i2 + "(" + i2 + "). Item count:" + recyclerView.f1561W.m832a() + recyclerView.m1324p());
        }
        C0352L c0352l = recyclerView.f1561W;
        if (c0352l.f698f && (arrayList = this.f686b) != null && (size = arrayList.size()) != 0) {
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC0355O abstractC0355O = (AbstractC0355O) this.f686b.get(i3);
                if (!abstractC0355O.m850p() && abstractC0355O.m836b() == i2) {
                    abstractC0355O.m835a(32);
                }
            }
            throw null;
        }
        ArrayList arrayList2 = this.f687c;
        ArrayList arrayList3 = this.f685a;
        int size2 = arrayList3.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AbstractC0355O abstractC0355O2 = (AbstractC0355O) arrayList3.get(i4);
            if (!abstractC0355O2.m850p() && abstractC0355O2.m836b() == i2 && !abstractC0355O2.m841g() && (c0352l.f698f || !abstractC0355O2.m843i())) {
                abstractC0355O2.m835a(32);
                break;
            }
        }
        C0234d c0234d = recyclerView.f1568d;
        ArrayList arrayList4 = (ArrayList) c0234d.f476d;
        int size3 = arrayList4.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                view = null;
                break;
            }
            view = (View) arrayList4.get(i5);
            ((C0386v) c0234d.f474b).getClass();
            AbstractC0355O abstractC0355OM1301u = RecyclerView.m1301u(view);
            if (abstractC0355OM1301u.m836b() == i2 && !abstractC0355OM1301u.m841g() && !abstractC0355OM1301u.m843i()) {
                break;
            }
            i5++;
        }
        if (view == null) {
            int size4 = arrayList2.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size4) {
                    break;
                }
                AbstractC0355O abstractC0355O3 = (AbstractC0355O) arrayList2.get(i6);
                if (!abstractC0355O3.m841g() && abstractC0355O3.m836b() == i2 && !abstractC0355O3.m839e()) {
                    arrayList2.remove(i6);
                    break;
                }
                i6++;
            }
        } else {
            AbstractC0355O abstractC0355OM1301u2 = RecyclerView.m1301u(view);
            C0234d c0234d2 = recyclerView.f1568d;
            int iIndexOfChild = ((C0386v) c0234d2.f474b).f875a.indexOfChild(view);
            if (iIndexOfChild < 0) {
                throw new IllegalArgumentException("view is not a child, cannot hide " + view);
            }
            C0366b c0366b = (C0366b) c0234d2.f475c;
            if (!c0366b.m940d(iIndexOfChild)) {
                throw new RuntimeException("trying to unhide a view that was not hidden" + view);
            }
            c0366b.m937a(iIndexOfChild);
            c0234d2.m660x(view);
            C0234d c0234d3 = recyclerView.f1568d;
            int iIndexOfChild2 = ((C0386v) c0234d3.f474b).f875a.indexOfChild(view);
            if (iIndexOfChild2 == -1) {
                iM938b = -1;
                if (iM938b != -1) {
                    throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + abstractC0355OM1301u2 + recyclerView.m1324p());
                }
                recyclerView.f1568d.m641d(iM938b);
                m828h(view);
                abstractC0355OM1301u2.m835a(8224);
            } else {
                C0366b c0366b2 = (C0366b) c0234d3.f475c;
                if (!c0366b2.m940d(iIndexOfChild2)) {
                    iM938b = iIndexOfChild2 - c0366b2.m938b(iIndexOfChild2);
                }
                if (iM938b != -1) {
                }
            }
        }
        int iM642e = recyclerView.f1566c.m642e(i2, 0);
        if (iM642e >= 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i2 + "(offset:" + iM642e + ").state:" + c0352l.m832a() + recyclerView.m1324p());
    }

    /* JADX INFO: renamed from: j */
    public final void m830j(AbstractC0355O abstractC0355O) {
        if (abstractC0355O.f713d) {
            this.f686b.remove(abstractC0355O);
        } else {
            this.f685a.remove(abstractC0355O);
        }
        abstractC0355O.f712c = null;
        abstractC0355O.f713d = false;
        abstractC0355O.f711b &= -33;
    }

    /* JADX INFO: renamed from: k */
    public final void m831k() {
        AbstractC0343C abstractC0343C = this.f691g.f1580j;
        if (abstractC0343C != null) {
            abstractC0343C.getClass();
        }
        this.f689e = this.f688d + 0;
        ArrayList arrayList = this.f687c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f689e; size--) {
            m825e(size);
        }
    }
}
