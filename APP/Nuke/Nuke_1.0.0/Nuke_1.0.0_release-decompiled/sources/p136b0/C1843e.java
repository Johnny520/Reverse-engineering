package p136b0;

import java.util.ArrayList;
import p008B1.C0213a;
import p008B1.C0214b;
import p037G2.C0510v;
import p040H.C0544b;
import p056K2.InterfaceC0877c;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.C1399z;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p112W2.InterfaceC1605g;
import p112W2.InterfaceC1606h;
import p112W2.InterfaceC1607i;
import p117X2.AbstractC1678w;

/* JADX INFO: renamed from: b0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1843e implements InterfaceC1841c {

    /* JADX INFO: renamed from: d */
    public final int f6241d;

    /* JADX INFO: renamed from: e */
    public final boolean f6242e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0877c f6243f;

    /* JADX INFO: renamed from: g */
    public C1388t0 f6244g;

    /* JADX INFO: renamed from: h */
    public ArrayList f6245h;

    public C1843e(int i5, boolean z5, InterfaceC0877c interfaceC0877c) {
        this.f6241d = i5;
        this.f6242e = z5;
        this.f6243f = interfaceC0877c;
    }

    /* JADX INFO: renamed from: c */
    public final Object m3300c(int i5, InterfaceC1373m interfaceC1373m) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(this.f6241d);
        m3305n(c1383r);
        int iM3312a = i5 | (c1383r.m2582f(this) ? AbstractC1848j.m3312a(2, 0) : AbstractC1848j.m3312a(1, 0));
        InterfaceC0877c interfaceC0877c = this.f6243f;
        AbstractC1678w.m2998b(2, interfaceC0877c);
        Object objMo0g = ((InterfaceC1603e) interfaceC0877c).mo0g(c1383r, Integer.valueOf(iM3312a));
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C1842d(2, this, C1843e.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return objMo0g;
    }

    /* JADX INFO: renamed from: d */
    public final Object m3301d(C0544b c0544b, Object obj, Object obj2, InterfaceC1373m interfaceC1373m, int i5) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(this.f6241d);
        m3305n(c1383r);
        int iM3312a = c1383r.m2582f(this) ? AbstractC1848j.m3312a(2, 3) : AbstractC1848j.m3312a(1, 3);
        InterfaceC0877c interfaceC0877c = this.f6243f;
        AbstractC1678w.m2998b(5, interfaceC0877c);
        Object objMo244j = ((InterfaceC1606h) interfaceC0877c).mo244j(c0544b, obj, obj2, c1383r, Integer.valueOf(iM3312a | i5));
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0213a(this, c0544b, obj, obj2, i5);
        }
        return objMo244j;
    }

    /* JADX INFO: renamed from: e */
    public final Object m3302e(Object obj, InterfaceC1373m interfaceC1373m, int i5) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(this.f6241d);
        m3305n(c1383r);
        int iM3312a = c1383r.m2582f(this) ? AbstractC1848j.m3312a(2, 1) : AbstractC1848j.m3312a(1, 1);
        InterfaceC0877c interfaceC0877c = this.f6243f;
        AbstractC1678w.m2998b(3, interfaceC0877c);
        Object objMo5f = ((InterfaceC1604f) interfaceC0877c).mo5f(obj, c1383r, Integer.valueOf(iM3312a | i5));
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C1399z(i5, this, obj);
        }
        return objMo5f;
    }

    @Override // p112W2.InterfaceC1604f
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo5f(Object obj, Object obj2, Object obj3) {
        return m3302e(obj, (InterfaceC1373m) obj2, ((Number) obj3).intValue());
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ Object mo0g(Object obj, Object obj2) {
        return m3300c(((Number) obj2).intValue(), (InterfaceC1373m) obj);
    }

    /* JADX INFO: renamed from: i */
    public final Object m3303i(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, InterfaceC1373m interfaceC1373m, int i5) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(this.f6241d);
        m3305n(c1383r);
        int iM3312a = c1383r.m2582f(this) ? AbstractC1848j.m3312a(2, 6) : AbstractC1848j.m3312a(1, 6);
        InterfaceC0877c interfaceC0877c = this.f6243f;
        AbstractC1678w.m2998b(8, interfaceC0877c);
        Object objMo2857m = ((InterfaceC1607i) interfaceC0877c).mo2857m(obj, bool, obj2, obj3, obj4, c1383r, Integer.valueOf(i5 | iM3312a));
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0510v(this, obj, bool, obj2, obj3, obj4, i5);
        }
        return objMo2857m;
    }

    @Override // p112W2.InterfaceC1606h
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ Object mo244j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m3301d((C0544b) obj, obj2, obj3, (InterfaceC1373m) obj4, ((Number) obj5).intValue());
    }

    /* JADX INFO: renamed from: k */
    public final Object m3304k(Object obj, Object obj2, InterfaceC1373m interfaceC1373m, int i5) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(this.f6241d);
        m3305n(c1383r);
        int iM3312a = c1383r.m2582f(this) ? AbstractC1848j.m3312a(2, 2) : AbstractC1848j.m3312a(1, 2);
        InterfaceC0877c interfaceC0877c = this.f6243f;
        AbstractC1678w.m2998b(4, interfaceC0877c);
        Object objMo1949l = ((InterfaceC1605g) interfaceC0877c).mo1949l(obj, obj2, c1383r, Integer.valueOf(iM3312a | i5));
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0214b(this, obj, obj2, i5, 5);
        }
        return objMo1949l;
    }

    @Override // p112W2.InterfaceC1605g
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ Object mo1949l(Object obj, Object obj2, Object obj3, Object obj4) {
        return m3304k(obj, obj2, (InterfaceC1373m) obj3, ((Number) obj4).intValue());
    }

    @Override // p112W2.InterfaceC1607i
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ Object mo2857m(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, C1383r c1383r, Integer num) {
        return m3303i(obj, bool, obj2, obj3, obj4, c1383r, num.intValue());
    }

    /* JADX INFO: renamed from: n */
    public final void m3305n(InterfaceC1373m interfaceC1373m) {
        C1383r c1383r;
        C1388t0 c1388t0M2605x;
        if (!this.f6242e || (c1388t0M2605x = (c1383r = (C1383r) interfaceC1373m).m2605x()) == null) {
            return;
        }
        c1383r.getClass();
        c1388t0M2605x.f4926b |= 1;
        if (AbstractC1848j.m3315d(this.f6244g, c1388t0M2605x)) {
            this.f6244g = c1388t0M2605x;
            return;
        }
        ArrayList arrayList = this.f6245h;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f6245h = arrayList2;
            arrayList2.add(c1388t0M2605x);
            return;
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (AbstractC1848j.m3315d((C1388t0) arrayList.get(i5), c1388t0M2605x)) {
                arrayList.set(i5, c1388t0M2605x);
                return;
            }
        }
        arrayList.add(c1388t0M2605x);
    }
}
