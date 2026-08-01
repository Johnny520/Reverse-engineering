package p067eb;

import la.C4728h;
import la.C4729i;
import la.InterfaceC4724d;
import p024b9.AbstractC1043k;
import p143ja.C3777j;
import p213oa.C5695f;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC6000f1;
import p229p9.InterfaceC6003g1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6056z;
import p243q9.InterfaceC6333h;
import p273s9.AbstractC7237s;
import p273s9.C7230o0;

/* JADX INFO: renamed from: eb.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2089o0 extends C7230o0 implements InterfaceC2062b {

    /* JADX INFO: renamed from: U */
    public final C3777j f5842U;

    /* JADX INFO: renamed from: V */
    public final InterfaceC4724d f5843V;

    /* JADX INFO: renamed from: W */
    public final C4728h f5844W;

    /* JADX INFO: renamed from: X */
    public final C4729i f5845X;

    /* JADX INFO: renamed from: Y */
    public final InterfaceC2096s f5846Y;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public C2089o0(p229p9.InterfaceC6019m r8, p229p9.InterfaceC6000f1 r9, p243q9.InterfaceC6333h r10, p213oa.C5695f r11, p229p9.InterfaceC5986b.a r12, p143ja.C3777j r13, la.InterfaceC4724d r14, la.C4728h r15, la.C4729i r16, p067eb.InterfaceC2096s r17, p229p9.InterfaceC6003g1 r18) {
        /*
            r7 = this;
            r8.getClass()
            r10.getClass()
            r11.getClass()
            r12.getClass()
            r13.getClass()
            r14.getClass()
            r15.getClass()
            r16.getClass()
            if (r18 != 0) goto L24
            p9.g1 r0 = p229p9.InterfaceC6003g1.f18958a
            r6 = r0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0 = r7
            goto L2c
        L24:
            r6 = r18
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
        L2c:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f5842U = r13
            r7.f5843V = r14
            r7.f5844W = r15
            r1 = r16
            r7.f5845X = r1
            r1 = r17
            r7.f5846Y = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p067eb.C2089o0.<init>(p9.m, p9.f1, q9.h, oa.f, p9.b$a, ja.j, la.d, la.h, la.i, eb.s, p9.g1):void");
    }

    @Override // p273s9.C7230o0, p273s9.AbstractC7237s
    /* JADX INFO: renamed from: R0 */
    public AbstractC7237s mo423u1(InterfaceC6019m interfaceC6019m, InterfaceC6056z interfaceC6056z, InterfaceC5986b.a aVar, C5695f c5695f, InterfaceC6333h interfaceC6333h, InterfaceC6003g1 interfaceC6003g1) {
        C5695f c5695f2;
        interfaceC6019m.getClass();
        aVar.getClass();
        interfaceC6333h.getClass();
        interfaceC6003g1.getClass();
        InterfaceC6000f1 interfaceC6000f1 = (InterfaceC6000f1) interfaceC6056z;
        if (c5695f == null) {
            C5695f name = getName();
            name.getClass();
            c5695f2 = name;
        } else {
            c5695f2 = c5695f;
        }
        C2089o0 c2089o0 = new C2089o0(interfaceC6019m, interfaceC6000f1, interfaceC6333h, c5695f2, aVar, mo7417J(), mo7420g0(), mo7419X(), m7498w1(), mo7421i0(), interfaceC6003g1);
        c2089o0.mo421e1(mo420W0());
        return c2089o0;
    }

    @Override // p067eb.InterfaceC2098t
    /* JADX INFO: renamed from: X */
    public C4728h mo7419X() {
        return this.f5844W;
    }

    @Override // p067eb.InterfaceC2098t
    /* JADX INFO: renamed from: g0 */
    public InterfaceC4724d mo7420g0() {
        return this.f5843V;
    }

    @Override // p067eb.InterfaceC2098t
    /* JADX INFO: renamed from: i0 */
    public InterfaceC2096s mo7421i0() {
        return this.f5846Y;
    }

    @Override // p067eb.InterfaceC2098t
    /* JADX INFO: renamed from: v1, reason: merged with bridge method [inline-methods] */
    public C3777j mo7417J() {
        return this.f5842U;
    }

    /* JADX INFO: renamed from: w1 */
    public C4729i m7498w1() {
        return this.f5845X;
    }

    public /* synthetic */ C2089o0(InterfaceC6019m interfaceC6019m, InterfaceC6000f1 interfaceC6000f1, InterfaceC6333h interfaceC6333h, C5695f c5695f, InterfaceC5986b.a aVar, C3777j c3777j, InterfaceC4724d interfaceC4724d, C4728h c4728h, C4729i c4729i, InterfaceC2096s interfaceC2096s, InterfaceC6003g1 interfaceC6003g1, int i10, AbstractC1043k abstractC1043k) {
        this(interfaceC6019m, interfaceC6000f1, interfaceC6333h, c5695f, aVar, c3777j, interfaceC4724d, c4728h, c4729i, interfaceC2096s, (i10 & 1024) != 0 ? null : interfaceC6003g1);
    }
}
