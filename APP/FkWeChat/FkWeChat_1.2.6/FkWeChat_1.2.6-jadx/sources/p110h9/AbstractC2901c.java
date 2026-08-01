package p110h9;

import java.util.Iterator;
import p098g9.InterfaceC2548b;
import p098g9.InterfaceC2556j;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: h9.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2901c {

    /* JADX INFO: renamed from: h9.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f7647q;

        /* JADX INFO: renamed from: r */
        public Object f7648r;

        /* JADX INFO: renamed from: s */
        public Object f7649s;

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f7650t;

        /* JADX INFO: renamed from: u */
        public int f7651u;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f7650t = obj;
            this.f7651u |= Integer.MIN_VALUE;
            return AbstractC2901c.m10547a(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10547a(p098g9.InterfaceC2548b r4, java.util.Map r5, p228p8.InterfaceC5976f r6) {
        /*
            boolean r0 = r6 instanceof p110h9.AbstractC2901c.a
            if (r0 == 0) goto L13
            r0 = r6
            h9.c$a r0 = (p110h9.AbstractC2901c.a) r0
            int r1 = r0.f7651u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7651u = r1
            goto L18
        L13:
            h9.c$a r0 = new h9.c$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f7650t
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f7651u
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L35
            java.lang.Object r4 = r0.f7649s
            j9.b0 r4 = (p142j9.AbstractC3656b0) r4
            java.lang.Object r4 = r0.f7648r
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r4 = r0.f7647q
            g9.b r4 = (p098g9.InterfaceC2548b) r4
            p172l8.AbstractC4713t.m18808b(r6)
            goto L6c
        L35:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r4)
        L3a:
            r4 = 0
            return r4
        L3c:
            p172l8.AbstractC4713t.m18808b(r6)
            boolean r6 = r4.mo3783n()
            if (r6 != 0) goto L4a
            java.lang.Object r4 = r4.mo3784r(r5)
            return r4
        L4a:
            boolean r6 = r4 instanceof p098g9.InterfaceC2552f
            if (r6 == 0) goto L96
            j9.b0 r6 = p142j9.AbstractC3714m3.m13805b(r4)
            if (r6 == 0) goto L90
            r0.f7647q = r4
            r0.f7648r = r5
            r0.f7649s = r6
            r0.f7651u = r3
            java.lang.Object r6 = r6.m13633N(r5, r0)
            java.lang.Object r5 = p242q8.AbstractC6325c.m24992g()
            if (r6 != r5) goto L69
            p257r8.AbstractC6539h.m25860c(r0)
        L69:
            if (r6 != r1) goto L6c
            return r1
        L6c:
            g9.f r4 = (p098g9.InterfaceC2552f) r4
            g9.n r5 = r4.mo3779f()
            g9.d r5 = r5.mo3877e()
            java.lang.Class<l8.i0> r0 = p172l8.C4700i0.class
            g9.c r0 = p024b9.AbstractC1052o0.m3807b(r0)
            boolean r5 = p024b9.AbstractC1061t.m3842c(r5, r0)
            if (r5 == 0) goto L8f
            g9.n r4 = r4.mo3779f()
            boolean r4 = r4.mo3875a()
            if (r4 != 0) goto L8f
            l8.i0 r4 = p172l8.C4700i0.f13910a
            return r4
        L8f:
            return r6
        L90:
            java.lang.String r5 = "This callable does not support a default call: "
            p127i9.C3364b.m12576a(r5, r4)
            goto L3a
        L96:
            java.lang.String r5 = "Cannot callSuspendBy on a property "
            java.lang.String r6 = ": suspend properties are not supported yet"
            p086ff.C2435c.m8796a(r5, r4, r6)
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: p110h9.AbstractC2901c.m10547a(g9.b, java.util.Map, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2556j m10548b(InterfaceC2548b interfaceC2548b) {
        interfaceC2548b.getClass();
        Iterator it = interfaceC2548b.mo3778d().iterator();
        Object obj = null;
        boolean z10 = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((InterfaceC2556j) next).mo9077j() == InterfaceC2556j.a.f6814s) {
                    if (z10) {
                        break;
                    }
                    z10 = true;
                    obj2 = next;
                }
            } else if (z10) {
                obj = obj2;
            }
        }
        return (InterfaceC2556j) obj;
    }
}
