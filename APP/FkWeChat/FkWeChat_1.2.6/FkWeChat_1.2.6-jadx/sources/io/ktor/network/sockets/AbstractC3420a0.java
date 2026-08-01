package io.ktor.network.sockets;

import io.ktor.utils.p131io.C3456a;
import io.ktor.utils.p131io.InterfaceC3468g;
import io.ktor.utils.p131io.InterfaceC3473k;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: io.ktor.network.sockets.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3420a0 {

    /* JADX INFO: renamed from: io.ktor.network.sockets.a0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f9421q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f9422r;

        /* JADX INFO: renamed from: s */
        public int f9423s;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f9422r = obj;
            this.f9423s |= Integer.MIN_VALUE;
            return AbstractC3420a0.m12789a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m12789a(io.ktor.network.sockets.InterfaceC3425d r4, p228p8.InterfaceC5976f r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof io.ktor.network.sockets.AbstractC3420a0.a
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.network.sockets.a0$a r0 = (io.ktor.network.sockets.AbstractC3420a0.a) r0
            int r1 = r0.f9423s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9423s = r1
            goto L18
        L13:
            io.ktor.network.sockets.a0$a r0 = new io.ktor.network.sockets.a0$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f9422r
            java.lang.Object r1 = p242q8.AbstractC6325c.m24992g()
            int r2 = r0.f9423s
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f9421q
            io.ktor.network.sockets.d r4 = (io.ktor.network.sockets.InterfaceC3425d) r4
            p172l8.AbstractC4713t.m18808b(r5)
            goto L46
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p376zd.C10010p0.m38820a(r4)
            r4 = 0
            return r4
        L34:
            p172l8.AbstractC4713t.m18808b(r5)
            ec.w1 r5 = r4.mo12802z0()
            r0.f9421q = r4
            r0.f9423s = r3
            java.lang.Object r5 = r5.mo7657J0(r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            ec.w1 r5 = r4.mo12802z0()
            boolean r5 = r5.isCancelled()
            if (r5 != 0) goto L53
            l8.i0 r4 = p172l8.C4700i0.f13910a
            return r4
        L53:
            ec.w1 r4 = r4.mo12802z0()
            java.util.concurrent.CancellationException r4 = r4.mo7669T()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.AbstractC3420a0.m12789a(io.ktor.network.sockets.d, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC3468g m12790b(InterfaceC3423c interfaceC3423c) {
        interfaceC3423c.getClass();
        C3456a c3456a = new C3456a(false);
        interfaceC3423c.mo12797c(c3456a);
        return c3456a;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC3473k m12791c(InterfaceC3427e interfaceC3427e, boolean z10) {
        interfaceC3427e.getClass();
        C3456a c3456a = new C3456a(z10);
        interfaceC3427e.mo12805f(c3456a);
        return c3456a;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC3473k m12792d(InterfaceC3427e interfaceC3427e, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m12791c(interfaceC3427e, z10);
    }
}
