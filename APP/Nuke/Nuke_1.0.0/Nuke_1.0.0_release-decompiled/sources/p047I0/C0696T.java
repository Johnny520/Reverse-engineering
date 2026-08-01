package p047I0;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import p074O2.InterfaceC1051i;
import p115X0.C1647v;
import p160f3.InterfaceC2160t;

/* JADX INFO: renamed from: I0.T */
/* JADX INFO: loaded from: classes.dex */
public final class C0696T implements InterfaceC2160t {

    /* JADX INFO: renamed from: d */
    public final View f2224d;

    /* JADX INFO: renamed from: e */
    public final C1647v f2225e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2160t f2226f;

    /* JADX INFO: renamed from: g */
    public final AtomicReference f2227g = new AtomicReference(null);

    public C0696T(View view, C1647v c1647v, InterfaceC2160t interfaceC2160t) {
        this.f2224d = view;
        this.f2225e = c1647v;
        this.f2226f = interfaceC2160t;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1201a(p051J.C0829u r5, p084Q2.AbstractC1178c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p047I0.C0694S
            if (r0 == 0) goto L13
            r0 = r6
            I0.S r0 = (p047I0.C0694S) r0
            int r1 = r0.f2221i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2221i = r1
            goto L18
        L13:
            I0.S r0 = new I0.S
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f2219g
            int r1 = r0.f2221i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L29:
            p127Z2.AbstractC1784a.m3205S(r6)
            goto L4f
        L2d:
            p127Z2.AbstractC1784a.m3205S(r6)
            B0.D r6 = new B0.D
            r1 = 3
            r6.<init>(r1, r5, r4)
            A.U r5 = new A.U
            r1 = 1
            r3 = 0
            r5.<init>(r4, r3, r1)
            r0.f2221i = r2
            J.b r1 = new J.b
            java.util.concurrent.atomic.AtomicReference r2 = r4.f2227g
            r1.<init>(r6, r2, r5, r3)
            java.lang.Object r5 = p160f3.AbstractC2162v.m3982d(r1, r0)
            P2.a r6 = p079P2.EnumC1152a.f3788d
            if (r5 != r6) goto L4f
            return
        L4f:
            E4.q r5 = new E4.q
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p047I0.C0696T.m1201a(J.u, Q2.c):void");
    }

    @Override // p160f3.InterfaceC2160t
    /* JADX INFO: renamed from: f */
    public final InterfaceC1051i mo1202f() {
        return this.f2226f.mo1202f();
    }
}
