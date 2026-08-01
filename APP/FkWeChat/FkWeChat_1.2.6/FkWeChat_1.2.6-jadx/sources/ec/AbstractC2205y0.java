package ec;

import p172l8.C4700i0;
import p215oc.C5729x;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5977g;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6324b;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6539h;
import p314vb.AbstractC8899f;
import p314vb.C8895b;
import p314vb.EnumC8900g;

/* JADX INFO: renamed from: ec.y0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2205y0 {

    /* JADX INFO: renamed from: ec.y0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public /* synthetic */ Object f6031q;

        /* JADX INFO: renamed from: r */
        public int f6032r;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f6031q = obj;
            this.f6032r |= Integer.MIN_VALUE;
            return AbstractC2205y0.m7937a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m7937a(p228p8.InterfaceC5976f r4) throws java.lang.Throwable {
        /*
            boolean r0 = r4 instanceof ec.AbstractC2205y0.a
            if (r0 == 0) goto L13
            r0 = r4
            ec.y0$a r0 = (ec.AbstractC2205y0.a) r0
            int r1 = r0.f6032r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6032r = r1
            goto L18
        L13:
            ec.y0$a r0 = new ec.y0$a
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f6031q
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f6032r
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 == r3) goto L2c
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r4)
        L2a:
            r4 = 0
            return r4
        L2c:
            p172l8.AbstractC4713t.m18808b(r4)
            goto L51
        L30:
            p172l8.AbstractC4713t.m18808b(r4)
            r0.f6032r = r3
            ec.o r4 = new ec.o
            p8.f r2 = p242q8.AbstractC6324b.m24989d(r0)
            r4.<init>(r2, r3)
            r4.m7851E()
            java.lang.Object r4 = r4.m7875w()
            java.lang.Object r2 = p242q8.AbstractC6325c.m24992g()
            if (r4 != r2) goto L4e
            p257r8.AbstractC6539h.m25860c(r0)
        L4e:
            if (r4 != r1) goto L51
            return r1
        L51:
            p215oc.C5706c.m23089a()
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.AbstractC2205y0.m7937a(p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public static final Object m7938b(long j10, InterfaceC5976f interfaceC5976f) {
        if (j10 <= 0) {
            return C4700i0.f13910a;
        }
        C2164o c2164o = new C2164o(AbstractC6324b.m24989d(interfaceC5976f), 1);
        c2164o.m7851E();
        if (j10 < Long.MAX_VALUE) {
            m7939c(c2164o.getContext()).mo7803m(j10, c2164o);
        }
        Object objM7875w = c2164o.m7875w();
        if (objM7875w == AbstractC6325c.m24992g()) {
            AbstractC6539h.m25860c(interfaceC5976f);
        }
        return objM7875w == AbstractC6325c.m24992g() ? objM7875w : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC2201x0 m7939c(InterfaceC5980j interfaceC5980j) {
        InterfaceC5980j.b bVarMo1654h = interfaceC5980j.mo1654h(InterfaceC5977g.f18915n);
        InterfaceC2201x0 interfaceC2201x0 = bVarMo1654h instanceof InterfaceC2201x0 ? (InterfaceC2201x0) bVarMo1654h : null;
        return interfaceC2201x0 == null ? AbstractC2189u0.m7911a() : interfaceC2201x0;
    }

    /* JADX INFO: renamed from: d */
    public static final long m7940d(long j10) {
        boolean zM34100N = C8895b.m34100N(j10);
        if (zM34100N) {
            return C8895b.m34123y(C8895b.m34101O(j10, AbstractC8899f.m34138C(999999L, EnumC8900g.f29493r)));
        }
        if (!zM34100N) {
            return 0L;
        }
        C5729x.m23182a();
        return 0L;
    }
}
