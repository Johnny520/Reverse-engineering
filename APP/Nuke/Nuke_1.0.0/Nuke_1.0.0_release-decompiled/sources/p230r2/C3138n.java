package p230r2;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import p191k4.C2475a;
import p213o2.AbstractC2770B;
import p213o2.C2785n;
import p213o2.C2789r;
import p224q2.InterfaceC2924o;
import p258w2.C3390a;

/* JADX INFO: renamed from: r2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C3138n extends AbstractC2770B {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9877a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f9878b;

    /* JADX INFO: renamed from: c */
    public final AbstractC2770B f9879c;

    /* JADX INFO: renamed from: d */
    public final Object f9880d;

    public C3138n(C2785n c2785n, AbstractC2770B abstractC2770B, Type type) {
        this.f9878b = c2785n;
        this.f9879c = abstractC2770B;
        this.f9880d = type;
    }

    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: b */
    public final Object mo4964b(C3390a c3390a) throws IOException {
        switch (this.f9877a) {
            case 0:
                int iM5630J = c3390a.m5630J();
                if (iM5630J == 9) {
                    c3390a.m5626F();
                    return null;
                }
                Map map = (Map) ((InterfaceC2924o) this.f9880d).mo602c();
                if (iM5630J == 1) {
                    c3390a.m5639b();
                    while (c3390a.m5647n()) {
                        c3390a.m5639b();
                        Object objMo4964b = ((C3138n) this.f9878b).f9879c.mo4964b(c3390a);
                        if (map.put(objMo4964b, ((C3138n) this.f9879c).f9879c.mo4964b(c3390a)) != null) {
                            throw new C2789r("duplicate key: " + objMo4964b);
                        }
                        c3390a.m5643h();
                    }
                    c3390a.m5643h();
                } else {
                    c3390a.m5640c();
                    while (c3390a.m5647n()) {
                        C2475a.f7965e.getClass();
                        int iM5642f = c3390a.f10590j;
                        if (iM5642f == 0) {
                            iM5642f = c3390a.m5642f();
                        }
                        if (iM5642f == 13) {
                            c3390a.f10590j = 9;
                        } else if (iM5642f == 12) {
                            c3390a.f10590j = 8;
                        } else {
                            if (iM5642f != 14) {
                                throw c3390a.m5638R("a name");
                            }
                            c3390a.f10590j = 10;
                        }
                        Object objMo4964b2 = ((C3138n) this.f9878b).f9879c.mo4964b(c3390a);
                        if (map.put(objMo4964b2, ((C3138n) this.f9879c).f9879c.mo4964b(c3390a)) != null) {
                            throw new C2789r("duplicate key: " + objMo4964b2);
                        }
                    }
                    c3390a.m5644j();
                }
                return map;
            default:
                return this.f9879c.mo4964b(c3390a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    @Override // p213o2.AbstractC2770B
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo4965c(p258w2.C3391b r5, java.lang.Object r6) throws java.io.IOException {
        /*
            r4 = this;
            int r0 = r4.f9877a
            switch(r0) {
                case 0: goto L4a;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f9880d
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            if (r6 == 0) goto L18
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto L13
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L18
        L13:
            java.lang.Class r1 = r6.getClass()
            goto L19
        L18:
            r1 = r0
        L19:
            o2.B r2 = r4.f9879c
            if (r1 == r0) goto L46
            java.lang.Object r0 = r4.f9878b
            o2.n r0 = (p213o2.C2785n) r0
            v2.a r3 = new v2.a
            r3.<init>(r1)
            o2.B r0 = r0.m4973b(r3)
            boolean r1 = r0 instanceof p230r2.AbstractC3143s
            if (r1 != 0) goto L2f
            goto L45
        L2f:
            r1 = r2
        L30:
            boolean r3 = r1 instanceof p230r2.AbstractC3148x
            if (r3 == 0) goto L40
            r3 = r1
            r2.x r3 = (p230r2.AbstractC3148x) r3
            o2.B r3 = r3.mo4971d()
            if (r3 != r1) goto L3e
            goto L40
        L3e:
            r1 = r3
            goto L30
        L40:
            boolean r1 = r1 instanceof p230r2.AbstractC3143s
            if (r1 != 0) goto L45
            goto L46
        L45:
            r2 = r0
        L46:
            r2.mo4965c(r5, r6)
            return
        L4a:
            java.util.Map r6 = (java.util.Map) r6
            o2.B r0 = r4.f9879c
            r2.n r0 = (p230r2.C3138n) r0
            if (r6 != 0) goto L56
            r5.m5666n()
            goto L83
        L56:
            r5.m5660d()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L61:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L80
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r5.m5664l(r2)
            java.lang.Object r1 = r1.getValue()
            r0.mo4965c(r5, r1)
            goto L61
        L80:
            r5.m5663j()
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p230r2.C3138n.mo4965c(w2.b, java.lang.Object):void");
    }

    public C3138n(C3128d c3128d, C3138n c3138n, C3138n c3138n2, InterfaceC2924o interfaceC2924o) {
        this.f9878b = c3138n;
        this.f9879c = c3138n2;
        this.f9880d = interfaceC2924o;
    }
}
