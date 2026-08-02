package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: kw */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0402kw implements mn0, nn0, on0, pn0, qn0, rn0, sn0, tn0, ym0, zm0, bn0, cn0, dn0, en0, fn0, gn0, hn0, jn0, kn0 {

    /* JADX INFO: renamed from: h */
    public final int f5833h;

    /* JADX INFO: renamed from: i */
    public final boolean f5834i;

    /* JADX INFO: renamed from: j */
    public un0 f5835j;

    /* JADX INFO: renamed from: k */
    public b62 f5836k;

    /* JADX INFO: renamed from: l */
    public ArrayList f5837l;

    public C0402kw(int i, boolean z, un0 un0Var) {
        this.f5833h = i;
        this.f5834i = z;
        this.f5835j = un0Var;
    }

    @Override // p000.sn0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo2744b(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, go0 go0Var, Integer num) {
        return m2748i(obj, bool, obj2, obj3, obj4, go0Var, num.intValue());
    }

    /* JADX INFO: renamed from: d */
    public final Object m2745d(int i, InterfaceC0596px interfaceC0596px) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(this.f5833h);
        m2751m(go0Var);
        int iM6121g = i | (go0Var.m1980f(this) ? xe1.m6121g(2, 0) : xe1.m6121g(1, 0));
        un0 un0Var = this.f5835j;
        xe1.m6119f(2, un0Var);
        Object objMo12g = ((mn0) un0Var).mo12g(go0Var, Integer.valueOf(iM6121g));
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0365jw(2, this, C0402kw.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return objMo12g;
    }

    @Override // p000.nn0
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo489e(Object obj, Object obj2, Object obj3) {
        return m2747h(obj, (InterfaceC0596px) obj2, ((Number) obj3).intValue());
    }

    /* JADX INFO: renamed from: f */
    public final Object m2746f(C0206fk c0206fk, Object obj, Object obj2, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(this.f5833h);
        m2751m(go0Var);
        int iM6121g = go0Var.m1980f(this) ? xe1.m6121g(2, 3) : xe1.m6121g(1, 3);
        un0 un0Var = this.f5835j;
        xe1.m6119f(5, un0Var);
        Object objMo2749k = ((pn0) un0Var).mo2749k(c0206fk, obj, obj2, go0Var, Integer.valueOf(iM6121g | i));
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0292hw(this, c0206fk, obj, obj2, i);
        }
        return objMo2749k;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ Object mo12g(Object obj, Object obj2) {
        return m2745d(((Number) obj2).intValue(), (InterfaceC0596px) obj);
    }

    /* JADX INFO: renamed from: h */
    public final Object m2747h(Object obj, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(this.f5833h);
        m2751m(go0Var);
        int i2 = 1;
        int iM6121g = go0Var.m1980f(this) ? xe1.m6121g(2, 1) : xe1.m6121g(1, 1);
        un0 un0Var = this.f5835j;
        xe1.m6119f(3, un0Var);
        Object objMo489e = ((nn0) un0Var).mo489e(obj, go0Var, Integer.valueOf(iM6121g | i));
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0781up(i, i2, this, obj);
        }
        return objMo489e;
    }

    /* JADX INFO: renamed from: i */
    public final Object m2748i(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(this.f5833h);
        m2751m(go0Var);
        int iM6121g = go0Var.m1980f(this) ? xe1.m6121g(2, 6) : xe1.m6121g(1, 6);
        un0 un0Var = this.f5835j;
        xe1.m6119f(8, un0Var);
        Object objMo2744b = ((sn0) un0Var).mo2744b(obj, bool, obj2, obj3, obj4, go0Var, Integer.valueOf(i | iM6121g));
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0327iw(this, obj, bool, obj2, obj3, obj4, i);
        }
        return objMo2744b;
    }

    @Override // p000.pn0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ Object mo2749k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m2746f((C0206fk) obj, obj2, obj3, (InterfaceC0596px) obj4, ((Number) obj5).intValue());
    }

    /* JADX INFO: renamed from: l */
    public final Object m2750l(Object obj, Object obj2, InterfaceC0596px interfaceC0596px, int i) {
        go0 go0Var = (go0) interfaceC0596px;
        go0Var.m1967X(this.f5833h);
        m2751m(go0Var);
        int iM6121g = go0Var.m1980f(this) ? xe1.m6121g(2, 2) : xe1.m6121g(1, 2);
        un0 un0Var = this.f5835j;
        xe1.m6119f(4, un0Var);
        Object objMo171o = ((on0) un0Var).mo171o(obj, obj2, go0Var, Integer.valueOf(iM6121g | i));
        b62 b62VarM1996r = go0Var.m1996r();
        if (b62VarM1996r != null) {
            b62VarM1996r.f616d = new C0803va(this, obj, obj2, i);
        }
        return objMo171o;
    }

    /* JADX INFO: renamed from: m */
    public final void m2751m(InterfaceC0596px interfaceC0596px) {
        b62 b62VarM2002x;
        if (!this.f5834i || (b62VarM2002x = ((go0) interfaceC0596px).m2002x()) == null) {
            return;
        }
        b62VarM2002x.f614b |= 1;
        b62 b62Var = this.f5836k;
        if (b62Var == null || !b62Var.m441a() || b62Var == b62VarM2002x || t11.m5086l(b62Var.f615c, b62VarM2002x.f615c)) {
            this.f5836k = b62VarM2002x;
            return;
        }
        ArrayList arrayList = this.f5837l;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f5837l = arrayList2;
            arrayList2.add(b62VarM2002x);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b62 b62Var2 = (b62) arrayList.get(i);
            if (b62Var2 == null || !b62Var2.m441a() || b62Var2 == b62VarM2002x || t11.m5086l(b62Var2.f615c, b62VarM2002x.f615c)) {
                arrayList.set(i, b62VarM2002x);
                return;
            }
        }
        arrayList.add(b62VarM2002x);
    }

    @Override // p000.on0
    /* JADX INFO: renamed from: o */
    public final /* bridge */ /* synthetic */ Object mo171o(Object obj, Object obj2, Object obj3, Object obj4) {
        return m2750l(obj, obj2, (InterfaceC0596px) obj3, ((Number) obj4).intValue());
    }
}
