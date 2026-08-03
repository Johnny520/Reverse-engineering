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

    public C0349I(RecyclerView r2) {
        this.f691g = r2;
        ArrayList r22 = new ArrayList();
        this.f685a = r22;
        this.f686b = null;
        this.f687c = new ArrayList();
        Collections.unmodifiableList(r22);
        this.f688d = 2;
        this.f689e = 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m821a(AbstractC0355O r6, boolean r7) {
        RecyclerView.m1300e(r6);
        RecyclerView r02 = this.f691g;
        C0357Q r1 = r02.f1569d0;
        if (r1 == null) goto L9;
        C0356P r12 = r1.f720e;
        boolean r3 = r12 instanceof C0356P;
        r6.getClass();
        if (r3 == false) goto L7;
        C0091b r13 = (C0091b) r12.f718e.remove(null);
    L8:
        AbstractC0080Q.m291j(null, r13);
        goto L9
    L7:
        r13 = null;
    L9:
        if (r7 == true) goto L11;
    L13:
        r6.f716g = null;
        C0348H r72 = m823c();
        r72.getClass();
        r6.getClass();
        ArrayList r14 = r72.m820a(0).f680a;
        if (((C0347G) r72.f683a.get(0)).f681b <= r14.size()) goto L18;
        r6.m847m();
        r14.add(r6);
        return;
    L18:
        return;
    L11:
        if (r02.f1561W == null) goto L13;
        r02.f1570e.m13n(r6);
        goto L13
    }

    /* JADX INFO: renamed from: b */
    public final int m822b(int r5) {
        RecyclerView r02 = this.f691g;
        if (r5 < 0) goto L12;
        if (r5 >= r02.f1561W.m832a()) goto L12;
        if (r02.f1561W.f698f == true) goto L10;
        return r5;
    L10:
        return r02.f1566c.m642e(r5, 0);
    L12:
        throw new IndexOutOfBoundsException("invalid position " + r5 + ". State item count is " + r02.f1561W.m832a() + r02.m1324p());
    }

    /* JADX INFO: renamed from: c */
    public final C0348H m823c() {
        if (this.f690f != null) goto L6;
        C0348H r02 = new C0348H();
        r02.f683a = new SparseArray();
        r02.f684b = 0;
        this.f690f = r02;
    L6:
        return this.f690f;
    }

    /* JADX INFO: renamed from: d */
    public final void m824d() {
        ArrayList r02 = this.f687c;
        int r1 = r02.size() - 1;
    L3:
        if (r1 < 0) goto L5;
        m825e(r1);
        r1 = r1 - 1;
        goto L3
    L5:
        r02.clear();
        int[] r03 = RecyclerView.f1536k0;
        C0376l r04 = this.f691g.f1560V;
        r04.getClass();
        r04.f826c = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m825e(int r4) {
        ArrayList r02 = this.f687c;
        m821a((AbstractC0355O) r02.get(r4), true);
        r02.remove(r4);
    }

    /* JADX INFO: renamed from: f */
    public final void m826f(View r4) {
        AbstractC0355O r02 = RecyclerView.m1301u(r4);
        boolean r1 = r02.m845k();
        RecyclerView r2 = this.f691g;
        if (r1 == false) goto L6;
        r2.removeDetachedView(r4, false);
    L6:
        if (r02.m844j() == false) goto L9;
        r02.f712c.m830j(r02);
    L11:
        m827g(r02);
        if (r2.f1544F != null) goto L14;
        return;
    L14:
        if (r02.m842h() == true) goto L18;
        r2.f1544F.mo946c(r02);
        return;
    L18:
        return;
    L9:
        if (r02.m850p() == false) goto L11;
        r02.f711b &= -33;
        goto L11
    }

    /* JADX INFO: renamed from: g */
    public final void m827g(AbstractC0355O r3) {
        boolean r02 = r3.m844j();
        r3.getClass();
        if (r02 == false) goto L5;
        StringBuilder r03 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
        r03.append(r3.m844j());
        r03.append(" isAttached:");
        throw null;
    L5:
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public final void m828h(View r4) {
        AbstractC0355O r42 = RecyclerView.m1301u(r4);
        boolean r02 = r42.m838d(12);
        RecyclerView r1 = this.f691g;
        if (r02 == true) goto L20;
        if (r42.m846l() == false) goto L20;
        AbstractC0390z r03 = r1.f1544F;
        if (r03 == null) goto L20;
        C0371g r04 = (C0371g) r03;
        if (r42.m837c().isEmpty() == false) goto L20;
        if (r04.f784g == false) goto L20;
        if (r42.m841g() == true) goto L20;
        if (this.f686b != null) goto L18;
        this.f686b = new ArrayList();
    L18:
        r42.f712c = this;
        r42.f713d = true;
        this.f686b.add(r42);
        return;
    L20:
        if (r42.m841g() == true) goto L22;
    L26:
        r42.f712c = this;
        r42.f713d = false;
        this.f685a.add(r42);
        return;
    L22:
        if (r42.m843i() == true) goto L26;
        r1.getClass();
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC0355O m829i(int r11, long r12) {
        RecyclerView r122 = this.f691g;
        if (r11 < 0) goto L83;
        if (r11 >= r122.f1561W.m832a()) goto L83;
        C0352L r13 = r122.f1561W;
        if (r13.f698f == false) goto L22;
        ArrayList r02 = this.f686b;
        if (r02 == null) goto L22;
        int r03 = r02.size();
        if (r03 == 0) goto L22;
        int r4 = 0;
    L14:
        if (r4 >= r03) goto L21;
        AbstractC0355O r5 = (AbstractC0355O) this.f686b.get(r4);
        if (r5.m850p() == true) goto L20;
        if (r5.m836b() != r11) goto L20;
        r5.m835a(32);
    L20:
        r4 = r4 + 1;
        goto L14
    L21:
        throw null;
    L22:
        ArrayList r04 = this.f687c;
        ArrayList r42 = this.f685a;
        int r52 = r42.size();
        int r6 = 0;
    L23:
        if (r6 >= r52) goto L36;
        AbstractC0355O r7 = (AbstractC0355O) r42.get(r6);
        if (r7.m850p() == true) goto L35;
        if (r7.m836b() != r11) goto L35;
        if (r7.m841g() == true) goto L35;
        if (r13.f698f == true) goto L34;
        if (r7.m843i() == true) goto L35;
    L34:
        r7.m835a(32);
    L77:
        int r05 = r122.f1566c.m642e(r11, 0);
        if (r05 < 0) goto L81;
        throw null;
    L81:
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + r11 + "(offset:" + r05 + ").state:" + r13.m832a() + r122.m1324p());
    L35:
        r6 = r6 + 1;
        goto L23
    L36:
        C0234d r2 = r122.f1568d;
        ArrayList r43 = (ArrayList) r2.f476d;
        int r53 = r43.size();
        int r62 = 0;
    L37:
        if (r62 >= r53) goto L46;
        View r72 = (View) r43.get(r62);
        ((C0386v) r2.f474b).getClass();
        AbstractC0355O r8 = RecyclerView.m1301u(r72);
        if (r8.m836b() != r11) goto L45;
        if (r8.m841g() == true) goto L45;
        if (r8.m843i() == true) goto L45;
    L47:
        if (r72 == null) goto L67;
        AbstractC0355O r06 = RecyclerView.m1301u(r72);
        C0234d r22 = r122.f1568d;
        int r44 = ((C0386v) r22.f474b).f875a.indexOfChild(r72);
        if (r44 < 0) goto L66;
        C0366b r54 = (C0366b) r22.f475c;
        if (r54.m940d(r44) == false) goto L64;
        r54.m937a(r44);
        r22.m660x(r72);
        C0234d r23 = r122.f1568d;
        int r45 = ((C0386v) r23.f474b).f875a.indexOfChild(r72);
        if (r45 != (-1)) goto L55;
    L54:
        int r46 = -1;
    L59:
        if (r46 == (-1)) goto L62;
        r122.f1568d.m641d(r46);
        m828h(r72);
        r06.m835a(8224);
        goto L77
    L62:
        throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + r06 + r122.m1324p());
    L55:
        C0366b r24 = (C0366b) r23.f475c;
        if (r24.m940d(r45) == true) goto L54;
        r46 = r45 - r24.m938b(r45);
        goto L59
    L64:
        throw new RuntimeException("trying to unhide a view that was not hidden" + r72);
    L66:
        throw new IllegalArgumentException("view is not a child, cannot hide " + r72);
    L67:
        int r25 = r04.size();
        int r47 = 0;
    L68:
        if (r47 >= r25) goto L77;
        AbstractC0355O r55 = (AbstractC0355O) r04.get(r47);
        if (r55.m841g() == true) goto L76;
        if (r55.m836b() != r11) goto L76;
        if (r55.m839e() == true) goto L76;
        r04.remove(r47);
    L76:
        r47 = r47 + 1;
    L45:
        r62 = r62 + 1;
        goto L37
    L46:
        r72 = null;
    L83:
        throw new IndexOutOfBoundsException("Invalid item position " + r11 + "(" + r11 + "). Item count:" + r122.f1561W.m832a() + r122.m1324p());
    }

    /* JADX INFO: renamed from: j */
    public final void m830j(AbstractC0355O r2) {
        if (r2.f713d == false) goto L5;
        this.f686b.remove(r2);
    L6:
        r2.f712c = null;
        r2.f713d = false;
        r2.f711b &= -33;
        return;
    L5:
        this.f685a.remove(r2);
        goto L6
    }

    /* JADX INFO: renamed from: k */
    public final void m831k() {
        AbstractC0343C r02 = this.f691g.f1580j;
        if (r02 == null) goto L5;
        r02.getClass();
    L5:
        this.f689e = this.f688d + 0;
        ArrayList r03 = this.f687c;
        int r1 = r03.size() - 1;
    L6:
        if (r1 < 0) goto L10;
        if (r03.size() <= this.f689e) goto L13;
        m825e(r1);
        r1 = r1 - 1;
        goto L6
    L13:
        return;
    }
}
