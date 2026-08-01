package p145jc;

import ec.AbstractC2142i1;
import ec.AbstractC2149k0;
import ec.C2187t2;
import ec.C2209z0;
import p172l8.C4700i0;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: jc.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3810i {

    /* JADX INFO: renamed from: a */
    public static final C3801d0 f10985a = new C3801d0("UNDEFINED");

    /* JADX INFO: renamed from: b */
    public static final C3801d0 f10986b = new C3801d0("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[Catch: all -> 0x0067, DONT_GENERATE, TryCatch #0 {all -> 0x0067, blocks: (B:11:0x003e, B:13:0x004c, B:15:0x0052, B:28:0x0091, B:18:0x0069, B:20:0x0079, B:25:0x0088, B:27:0x008e, B:33:0x009e, B:36:0x00a7, B:35:0x00a4, B:23:0x007f), top: B:45:0x003e, inners: #1 }] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m15179b(p228p8.InterfaceC5976f r6, java.lang.Object r7) {
        /*
            boolean r0 = r6 instanceof p145jc.C3808h
            if (r0 == 0) goto Lb2
            jc.h r6 = (p145jc.C3808h) r6
            java.lang.Object r0 = ec.AbstractC2121d0.m7724b(r7)
            ec.k0 r1 = r6.f10981t
            p8.j r2 = r6.getContext()
            boolean r1 = m15181d(r1, r2)
            r2 = 1
            if (r1 == 0) goto L26
            r6.f10983v = r0
            r6.f5914s = r2
            ec.k0 r7 = r6.f10981t
            p8.j r0 = r6.getContext()
            m15180c(r7, r0, r6)
            goto Lac
        L26:
            ec.t2 r1 = ec.C2187t2.f6012a
            ec.i1 r1 = r1.m7908b()
            boolean r3 = r1.m7779Q0()
            if (r3 == 0) goto L3b
            r6.f10983v = r0
            r6.f5914s = r2
            r1.m7776M0(r6)
            goto Lac
        L3b:
            r1.m7778O0(r2)
            p8.j r3 = r6.getContext()     // Catch: java.lang.Throwable -> L67
            ec.w1$b r4 = ec.InterfaceC2198w1.f6022g     // Catch: java.lang.Throwable -> L67
            p8.j$b r3 = r3.mo1654h(r4)     // Catch: java.lang.Throwable -> L67
            ec.w1 r3 = (ec.InterfaceC2198w1) r3     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L69
            boolean r4 = r3.mo7586c()     // Catch: java.lang.Throwable -> L67
            if (r4 != 0) goto L69
            java.util.concurrent.CancellationException r7 = r3.mo7669T()     // Catch: java.lang.Throwable -> L67
            r6.mo7622b(r0, r7)     // Catch: java.lang.Throwable -> L67
            l8.s$a r0 = p172l8.C4712s.f13928r     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = p172l8.AbstractC4713t.m18807a(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = p172l8.C4712s.m18798b(r7)     // Catch: java.lang.Throwable -> L67
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L67
            goto L91
        L67:
            r7 = move-exception
            goto La8
        L69:
            p8.f r0 = r6.f10982u     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = r6.f10984w     // Catch: java.lang.Throwable -> L67
            p8.j r4 = r0.getContext()     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = p145jc.AbstractC3815k0.m15198f(r4, r3)     // Catch: java.lang.Throwable -> L67
            jc.d0 r5 = p145jc.AbstractC3815k0.f10996a     // Catch: java.lang.Throwable -> L67
            if (r3 == r5) goto L7e
            ec.y2 r0 = ec.AbstractC2141i0.m7772j(r0, r4, r3)     // Catch: java.lang.Throwable -> L67
            goto L7f
        L7e:
            r0 = 0
        L7f:
            p8.f r5 = r6.f10982u     // Catch: java.lang.Throwable -> L9b
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L9b
            l8.i0 r7 = p172l8.C4700i0.f13910a     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L8e
            boolean r7 = r0.m7945l1()     // Catch: java.lang.Throwable -> L67
            if (r7 == 0) goto L91
        L8e:
            p145jc.AbstractC3815k0.m15196d(r4, r3)     // Catch: java.lang.Throwable -> L67
        L91:
            boolean r7 = r1.m7782T0()     // Catch: java.lang.Throwable -> L67
            if (r7 != 0) goto L91
        L97:
            r1.m7784q0(r2)
            goto Lac
        L9b:
            r7 = move-exception
            if (r0 == 0) goto La4
            boolean r0 = r0.m7945l1()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto La7
        La4:
            p145jc.AbstractC3815k0.m15196d(r4, r3)     // Catch: java.lang.Throwable -> L67
        La7:
            throw r7     // Catch: java.lang.Throwable -> L67
        La8:
            r6.m7626f(r7)     // Catch: java.lang.Throwable -> Lad
            goto L97
        Lac:
            return
        Lad:
            r6 = move-exception
            r1.m7784q0(r2)
            throw r6
        Lb2:
            r6.resumeWith(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p145jc.AbstractC3810i.m15179b(p8.f, java.lang.Object):void");
    }

    /* JADX INFO: renamed from: c */
    public static final void m15180c(AbstractC2149k0 abstractC2149k0, InterfaceC5980j interfaceC5980j, Runnable runnable) {
        try {
            abstractC2149k0.mo7807x(interfaceC5980j, runnable);
        } catch (Throwable th) {
            throw new C2209z0(th, abstractC2149k0, interfaceC5980j);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m15181d(AbstractC2149k0 abstractC2149k0, InterfaceC5980j interfaceC5980j) throws C2209z0 {
        try {
            return abstractC2149k0.mo7821V(interfaceC5980j);
        } catch (Throwable th) {
            throw new C2209z0(th, abstractC2149k0, interfaceC5980j);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m15182e(C3808h c3808h) {
        C4700i0 c4700i0 = C4700i0.f13910a;
        AbstractC2142i1 abstractC2142i1M7908b = C2187t2.f6012a.m7908b();
        if (abstractC2142i1M7908b.m7780R0()) {
            return false;
        }
        if (abstractC2142i1M7908b.m7779Q0()) {
            c3808h.f10983v = c4700i0;
            c3808h.f5914s = 1;
            abstractC2142i1M7908b.m7776M0(c3808h);
            return true;
        }
        abstractC2142i1M7908b.m7778O0(true);
        try {
            c3808h.run();
            do {
            } while (abstractC2142i1M7908b.m7782T0());
        } finally {
            try {
            } finally {
            }
        }
        return false;
    }
}
