package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: mh */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0474mh implements InterfaceC0904ww, InterfaceC0941xw, InterfaceC0978yw, InterfaceC1019zw, InterfaceC0034ax, InterfaceC0071bx, InterfaceC0108cx, InterfaceC0151dx, InterfaceC0333iw, InterfaceC0370jw, InterfaceC0446lw, InterfaceC0489mw, InterfaceC0528nw, InterfaceC0593ow, InterfaceC0630pw, InterfaceC0667qw, InterfaceC0704rw, InterfaceC0781tw, InterfaceC0818uw {

    /* JADX INFO: renamed from: d */
    public final int f3976d;

    /* JADX INFO: renamed from: e */
    public final boolean f3977e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0188ex f3978f;

    /* JADX INFO: renamed from: g */
    public ht0 f3979g;

    /* JADX INFO: renamed from: h */
    public ArrayList f3980h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0474mh(int i, boolean z, InterfaceC0188ex interfaceC0188ex) {
        this.f3976d = i;
        this.f3977e = z;
        this.f3978f = interfaceC0188ex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0941xw
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo353a(Object obj, Object obj2, Object obj3) {
        return m2593d(obj, (InterfaceC0356ji) obj2, ((Number) obj3).intValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0978yw
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo259b(Object obj, Object obj2, Object obj3, Object obj4) {
        return m2594e(obj, obj2, (InterfaceC0356ji) obj3, ((Number) obj4).intValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Object m2592c(InterfaceC0356ji interfaceC0356ji, int i) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(this.f3976d);
        m2595f(c0616pi);
        int iM1921g = i | (c0616pi.m3104f(this) ? AbstractC0398kl.m1921g(2, 0) : AbstractC0398kl.m1921g(1, 0));
        InterfaceC0188ex interfaceC0188ex = this.f3978f;
        s91.m4048m(2, interfaceC0188ex);
        Object objInvoke = ((InterfaceC0904ww) interfaceC0188ex).invoke(c0616pi, Integer.valueOf(iM1921g));
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0431lh(2, this, C0474mh.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return objInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Object m2593d(Object obj, InterfaceC0356ji interfaceC0356ji, int i) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(this.f3976d);
        m2595f(c0616pi);
        int iM1921g = c0616pi.m3104f(this) ? AbstractC0398kl.m1921g(2, 1) : AbstractC0398kl.m1921g(1, 1);
        InterfaceC0188ex interfaceC0188ex = this.f3978f;
        s91.m4048m(3, interfaceC0188ex);
        Object objMo353a = ((InterfaceC0941xw) interfaceC0188ex).mo353a(obj, c0616pi, Integer.valueOf(iM1921g | i));
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0355jh(i, 0, this, obj);
        }
        return objMo353a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final Object m2594e(Object obj, Object obj2, InterfaceC0356ji interfaceC0356ji, int i) {
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        c0616pi.m3091X(this.f3976d);
        m2595f(c0616pi);
        int iM1921g = c0616pi.m3104f(this) ? AbstractC0398kl.m1921g(2, 2) : AbstractC0398kl.m1921g(1, 2);
        InterfaceC0188ex interfaceC0188ex = this.f3978f;
        s91.m4048m(4, interfaceC0188ex);
        Object objMo259b = ((InterfaceC0978yw) interfaceC0188ex).mo259b(obj, obj2, c0616pi, Integer.valueOf(iM1921g | i));
        ht0 ht0VarM3121r = c0616pi.m3121r();
        if (ht0VarM3121r != null) {
            ht0VarM3121r.f2362d = new C0394kh(this, obj, obj2, i);
        }
        return objMo259b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m2595f(InterfaceC0356ji interfaceC0356ji) {
        ht0 ht0VarM3127x;
        if (!this.f3977e || (ht0VarM3127x = ((C0616pi) interfaceC0356ji).m3127x()) == null) {
            return;
        }
        ht0VarM3127x.f2360b |= 1;
        ht0 ht0Var = this.f3979g;
        if (ht0Var == null || !ht0Var.m1503a() || ht0Var == ht0VarM3127x || p30.m3002l(ht0Var.f2361c, ht0VarM3127x.f2361c)) {
            this.f3979g = ht0VarM3127x;
            return;
        }
        ArrayList arrayList = this.f3980h;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f3980h = arrayList2;
            arrayList2.add(ht0VarM3127x);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ht0 ht0Var2 = (ht0) arrayList.get(i);
            if (ht0Var2 == null || !ht0Var2.m1503a() || ht0Var2 == ht0VarM3127x || p30.m3002l(ht0Var2.f2361c, ht0VarM3127x.f2361c)) {
                arrayList.set(i, ht0VarM3127x);
                return;
            }
        }
        arrayList.add(ht0VarM3127x);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m2592c((InterfaceC0356ji) obj, ((Number) obj2).intValue());
    }
}
