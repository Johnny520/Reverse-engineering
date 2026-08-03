package p116i;

import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p117i0.InterfaceC1809a1;
import p144k.C2176h1;
import p249qg.InterfaceC3599t;
import p267s1.InterfaceC3918x;
import p276sf.C3967n;
import p370yf.AbstractC6044i;
import sg.InterfaceC3975g;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: i.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1745e extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5830h = 1;

    /* JADX INFO: renamed from: i */
    public Object f5831i;

    /* JADX INFO: renamed from: j */
    public int f5832j;

    /* JADX INFO: renamed from: k */
    public Object f5833k;

    /* JADX INFO: renamed from: l */
    public Object f5834l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f5835m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f5836n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f5837o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745e(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f5836n = interfaceC1809a1;
        this.f5837o = interfaceC1809a12;
        this.f5833k = interfaceC1809a13;
        this.f5834l = interfaceC1809a14;
        this.f5835m = interfaceC1809a15;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v1, types: [fg.l, yf.i] */
    /* JADX WARN: Type inference failed for: r1v3, types: [fg.l, yf.i] */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f5830h) {
            case 0:
                C1745e c1745e = new C1745e((InterfaceC3975g) this.f5834l, (C1739c) this.f5835m, (InterfaceC1809a1) this.f5836n, (InterfaceC1809a1) this.f5837o, interfaceC5557c);
                c1745e.f5831i = obj;
                return c1745e;
            case 1:
                C1745e c1745e2 = new C1745e((C1773n0) this.f5836n, (InterfaceC1231l) this.f5837o, interfaceC5557c);
                c1745e2.f5835m = obj;
                return c1745e2;
            case 2:
                C1745e c1745e3 = new C1745e((C2176h1) this.f5836n, (InterfaceC1231l) this.f5837o, interfaceC5557c);
                c1745e3.f5835m = obj;
                return c1745e3;
            case 3:
                C1745e c1745e4 = new C1745e((InterfaceC3918x) this.f5833k, (InterfaceC1231l) this.f5834l, (InterfaceC1231l) this.f5835m, (InterfaceC1236q) this.f5836n, (InterfaceC1231l) this.f5837o, interfaceC5557c);
                c1745e4.f5831i = obj;
                return c1745e4;
            default:
                C1745e c1745e5 = new C1745e((InterfaceC1809a1) this.f5836n, (InterfaceC1809a1) this.f5837o, (InterfaceC1809a1) this.f5833k, (InterfaceC1809a1) this.f5834l, (InterfaceC1809a1) this.f5835m, interfaceC5557c);
                c1745e5.f5831i = obj;
                return c1745e5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f5830h) {
        }
        return ((C1745e) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x0316 -> B:161:0x031a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // p370yf.AbstractC6036a
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.f5830h
            switch(r0) {
                case 0: goto L2e0;
                case 1: goto L1e5;
                case 2: goto L11e;
                case 3: goto Ld2;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r14.f5831i
            r1 = r0
            qg.t r1 = (p249qg.InterfaceC3599t) r1
            int r0 = r14.f5832j
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 != r2) goto L12
            goto L1a
        L12:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r15)
            r15 = 0
            goto Ld1
        L1a:
            p077f8.AbstractC1089i.m2732I0(r15)
        L1d:
            java.lang.Object r15 = r14.f5836n
            i0.a1 r15 = (p117i0.InterfaceC1809a1) r15
            java.lang.Object r15 = r15.getValue()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto Lcf
            java.lang.Object r15 = r14.f5837o
            i0.a1 r15 = (p117i0.InterfaceC1809a1) r15
            java.lang.Object r15 = r15.getValue()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto Lcf
            java.lang.Object r15 = r14.f5833k
            i0.a1 r15 = (p117i0.InterfaceC1809a1) r15
            java.lang.Object r15 = r15.getValue()
            android.media.MediaPlayer r15 = (android.media.MediaPlayer) r15
            if (r15 == 0) goto Lbf
            java.lang.Object r0 = r14.f5834l
            r3 = r0
            i0.a1 r3 = (p117i0.InterfaceC1809a1) r3
            java.lang.Object r0 = r14.f5835m
            r4 = r0
            i0.a1 r4 = (p117i0.InterfaceC1809a1) r4
            r5 = 0
            int r0 = r15.getCurrentPosition()     // Catch: java.lang.Throwable -> L61
            if (r0 >= 0) goto L5b
            r0 = r5
        L5b:
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Throwable -> L61
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L61
            goto L67
        L61:
            r0 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r0)
        L67:
            java.lang.Object r0 = r3.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r0)
            boolean r0 = r6 instanceof p276sf.C3959f
            if (r0 == 0) goto L7b
            r6 = r7
        L7b:
            java.lang.Number r6 = (java.lang.Number) r6
            int r0 = r6.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.setValue(r0)
            int r15 = r15.getDuration()     // Catch: java.lang.Throwable -> L96
            if (r15 >= 0) goto L8f
            goto L90
        L8f:
            r5 = r15
        L90:
            java.lang.Integer r15 = new java.lang.Integer     // Catch: java.lang.Throwable -> L96
            r15.<init>(r5)     // Catch: java.lang.Throwable -> L96
            goto L9e
        L96:
            r0 = move-exception
            r15 = r0
            sf.f r0 = new sf.f
            r0.<init>(r15)
            r15 = r0
        L9e:
            java.lang.Object r0 = r4.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r0)
            boolean r0 = r15 instanceof p276sf.C3959f
            if (r0 == 0) goto Lb2
            r15 = r3
        Lb2:
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r4.setValue(r15)
        Lbf:
            r14.f5831i = r1
            r14.f5832j = r2
            r3 = 250(0xfa, double:1.235E-321)
            java.lang.Object r15 = p249qg.AbstractC3603v.m7552f(r3, r14)
            xf.a r0 = p352xf.EnumC5799a.f23547g
            if (r15 != r0) goto L1d
            r15 = r0
            goto Ld1
        Lcf:
            sf.n r15 = p276sf.C3967n.f12976a
        Ld1:
            return r15
        Ld2:
            java.lang.Object r0 = r14.f5833k
            s1.x r0 = (p267s1.InterfaceC3918x) r0
            int r1 = r14.f5832j
            r2 = 1
            if (r1 == 0) goto Le8
            if (r1 != r2) goto Le1
            p077f8.AbstractC1089i.m2732I0(r15)
            goto L11b
        Le1:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r15)
            r15 = 0
            goto L11d
        Le8:
            p077f8.AbstractC1089i.m2732I0(r15)
            java.lang.Object r15 = r14.f5831i
            r4 = r15
            qg.t r4 = (p249qg.InterfaceC3599t) r4
            m.t1 r5 = new m.t1
            r5.<init>(r0)
            m.t2 r3 = new m.t2
            java.lang.Object r15 = r14.f5834l
            r6 = r15
            fg.l r6 = (p085fg.InterfaceC1231l) r6
            java.lang.Object r15 = r14.f5835m
            r7 = r15
            fg.l r7 = (p085fg.InterfaceC1231l) r7
            java.lang.Object r15 = r14.f5836n
            r8 = r15
            fg.q r8 = (p085fg.InterfaceC1236q) r8
            java.lang.Object r15 = r14.f5837o
            r9 = r15
            fg.l r9 = (p085fg.InterfaceC1231l) r9
            r10 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r14.f5832j = r2
            java.lang.Object r15 = p000a.AbstractC0000a.m78n(r0, r3, r14)
            xf.a r0 = p352xf.EnumC5799a.f23547g
            if (r15 != r0) goto L11b
            r15 = r0
            goto L11d
        L11b:
            sf.n r15 = p276sf.C3967n.f12976a
        L11d:
            return r15
        L11e:
            java.lang.Object r0 = r14.f5836n
            k.h1 r0 = (p144k.C2176h1) r0
            int r1 = r14.f5832j
            r2 = 2
            r3 = 1
            r4 = 0
            xf.a r5 = p352xf.EnumC5799a.f23547g
            if (r1 == 0) goto L164
            if (r1 == r3) goto L14f
            if (r1 != r2) goto L147
            java.lang.Object r0 = r14.f5831i
            r1 = r0
            k.h1 r1 = (p144k.C2176h1) r1
            java.lang.Object r0 = r14.f5833k
            r2 = r0
            yg.b r2 = (p371yg.C6046b) r2
            java.lang.Object r0 = r14.f5835m
            r3 = r0
            k.f1 r3 = (p144k.C2170f1) r3
            p077f8.AbstractC1089i.m2732I0(r15)     // Catch: java.lang.Throwable -> L143
            goto L1b5
        L143:
            r0 = move-exception
            r15 = r0
            goto L1d1
        L147:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r15)
            r5 = 0
            goto L1c8
        L14f:
            java.lang.Object r0 = r14.f5834l
            k.h1 r0 = (p144k.C2176h1) r0
            java.lang.Object r1 = r14.f5831i
            fg.l r1 = (p085fg.InterfaceC1231l) r1
            java.lang.Object r3 = r14.f5833k
            yg.b r3 = (p371yg.C6046b) r3
            java.lang.Object r6 = r14.f5835m
            k.f1 r6 = (p144k.C2170f1) r6
            p077f8.AbstractC1089i.m2732I0(r15)
        L162:
            r15 = r0
            goto L1a0
        L164:
            p077f8.AbstractC1089i.m2732I0(r15)
            java.lang.Object r15 = r14.f5835m
            qg.t r15 = (p249qg.InterfaceC3599t) r15
            k.f1 r1 = new k.f1
            wf.g r15 = r15.mo4457n()
            qg.q r6 = p249qg.C3593q.f11607h
            wf.e r15 = r15.mo2062s(r6)
            r15.getClass()
            qg.r0 r15 = (p249qg.InterfaceC3596r0) r15
            k.d1 r6 = p144k.EnumC2164d1.f7173g
            r1.<init>(r6, r15)
            p144k.C2176h1.m5406a(r0, r1)
            yg.b r15 = r0.f7236b
            java.lang.Object r6 = r14.f5837o
            yf.i r6 = (p370yf.AbstractC6044i) r6
            r14.f5835m = r1
            r14.f5833k = r15
            r14.f5831i = r6
            r14.f5834l = r0
            r14.f5832j = r3
            java.lang.Object r3 = r15.m10806d(r14)
            if (r3 != r5) goto L19b
            goto L1c8
        L19b:
            r3 = r6
            r6 = r1
            r1 = r3
            r3 = r15
            goto L162
        L1a0:
            r14.f5835m = r6     // Catch: java.lang.Throwable -> L1cc
            r14.f5833k = r3     // Catch: java.lang.Throwable -> L1cc
            r14.f5831i = r15     // Catch: java.lang.Throwable -> L1cc
            r14.f5834l = r4     // Catch: java.lang.Throwable -> L1cc
            r14.f5832j = r2     // Catch: java.lang.Throwable -> L1cc
            java.lang.Object r0 = r1.invoke(r14)     // Catch: java.lang.Throwable -> L1cc
            if (r0 != r5) goto L1b1
            goto L1c8
        L1b1:
            r1 = r15
            r15 = r0
            r2 = r3
            r3 = r6
        L1b5:
            java.util.concurrent.atomic.AtomicReference r0 = r1.f7235a     // Catch: java.lang.Throwable -> L1c9
        L1b7:
            boolean r1 = r0.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L1c9
            if (r1 == 0) goto L1be
            goto L1c4
        L1be:
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Throwable -> L1c9
            if (r1 == r3) goto L1b7
        L1c4:
            r2.m10808f(r4)
            r5 = r15
        L1c8:
            return r5
        L1c9:
            r0 = move-exception
            r15 = r0
            goto L1e1
        L1cc:
            r0 = move-exception
            r1 = r15
            r15 = r0
            r2 = r3
            r3 = r6
        L1d1:
            java.util.concurrent.atomic.AtomicReference r0 = r1.f7235a     // Catch: java.lang.Throwable -> L1c9
        L1d3:
            boolean r1 = r0.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L1c9
            if (r1 != 0) goto L1e0
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Throwable -> L1c9
            if (r1 != r3) goto L1e0
            goto L1d3
        L1e0:
            throw r15     // Catch: java.lang.Throwable -> L1c9
        L1e1:
            r2.m10808f(r4)
            throw r15
        L1e5:
            java.lang.Object r0 = r14.f5836n
            i.n0 r0 = (p116i.C1773n0) r0
            int r1 = r14.f5832j
            r2 = 2
            r3 = 1
            r4 = 0
            xf.a r5 = p352xf.EnumC5799a.f23547g
            if (r1 == 0) goto L22b
            if (r1 == r3) goto L216
            if (r1 != r2) goto L20e
            java.lang.Object r0 = r14.f5831i
            r1 = r0
            i.n0 r1 = (p116i.C1773n0) r1
            java.lang.Object r0 = r14.f5833k
            r2 = r0
            yg.b r2 = (p371yg.C6046b) r2
            java.lang.Object r0 = r14.f5835m
            r3 = r0
            i.m0 r3 = (p116i.C1770m0) r3
            p077f8.AbstractC1089i.m2732I0(r15)     // Catch: java.lang.Throwable -> L20a
            goto L2a8
        L20a:
            r0 = move-exception
            r15 = r0
            goto L2c4
        L20e:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r15)
            r5 = 0
            goto L2bb
        L216:
            java.lang.Object r0 = r14.f5834l
            i.n0 r0 = (p116i.C1773n0) r0
            java.lang.Object r1 = r14.f5831i
            fg.l r1 = (p085fg.InterfaceC1231l) r1
            java.lang.Object r3 = r14.f5833k
            yg.b r3 = (p371yg.C6046b) r3
            java.lang.Object r6 = r14.f5835m
            i.m0 r6 = (p116i.C1770m0) r6
            p077f8.AbstractC1089i.m2732I0(r15)
        L229:
            r15 = r0
            goto L293
        L22b:
            p077f8.AbstractC1089i.m2732I0(r15)
            java.lang.Object r15 = r14.f5835m
            qg.t r15 = (p249qg.InterfaceC3599t) r15
            i.m0 r1 = new i.m0
            wf.g r15 = r15.mo4457n()
            qg.q r6 = p249qg.C3593q.f11607h
            wf.e r15 = r15.mo2062s(r6)
            r15.getClass()
            qg.r0 r15 = (p249qg.InterfaceC3596r0) r15
            r1.<init>(r15)
            java.util.concurrent.atomic.AtomicReference r6 = r0.f5916a
        L248:
            java.lang.Object r15 = r6.get()
            r7 = r15
            i.m0 r7 = (p116i.C1770m0) r7
            if (r7 == 0) goto L262
            i.k0 r15 = p116i.EnumC1764k0.f5887g
            int r15 = r15.compareTo(r15)
            if (r15 < 0) goto L25a
            goto L262
        L25a:
            java.util.concurrent.CancellationException r15 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Current mutation had a higher priority"
            r15.<init>(r0)
            throw r15
        L262:
            boolean r15 = r6.compareAndSet(r7, r1)
            if (r15 == 0) goto L2d8
            if (r7 == 0) goto L277
            qg.r0 r15 = r7.f5911a
            i.l0 r6 = new i.l0
            java.lang.String r7 = "Mutation interrupted"
            r8 = 0
            r6.<init>(r7, r8)
            r15.mo7485a(r6)
        L277:
            yg.b r15 = r0.f5917b
            java.lang.Object r6 = r14.f5837o
            yf.i r6 = (p370yf.AbstractC6044i) r6
            r14.f5835m = r1
            r14.f5833k = r15
            r14.f5831i = r6
            r14.f5834l = r0
            r14.f5832j = r3
            java.lang.Object r3 = r15.m10806d(r14)
            if (r3 != r5) goto L28e
            goto L2bb
        L28e:
            r3 = r6
            r6 = r1
            r1 = r3
            r3 = r15
            goto L229
        L293:
            r14.f5835m = r6     // Catch: java.lang.Throwable -> L2bf
            r14.f5833k = r3     // Catch: java.lang.Throwable -> L2bf
            r14.f5831i = r15     // Catch: java.lang.Throwable -> L2bf
            r14.f5834l = r4     // Catch: java.lang.Throwable -> L2bf
            r14.f5832j = r2     // Catch: java.lang.Throwable -> L2bf
            java.lang.Object r0 = r1.invoke(r14)     // Catch: java.lang.Throwable -> L2bf
            if (r0 != r5) goto L2a4
            goto L2bb
        L2a4:
            r1 = r15
            r15 = r0
            r2 = r3
            r3 = r6
        L2a8:
            java.util.concurrent.atomic.AtomicReference r0 = r1.f5916a     // Catch: java.lang.Throwable -> L2bc
        L2aa:
            boolean r1 = r0.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L2bc
            if (r1 == 0) goto L2b1
            goto L2b7
        L2b1:
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Throwable -> L2bc
            if (r1 == r3) goto L2aa
        L2b7:
            r2.m10808f(r4)
            r5 = r15
        L2bb:
            return r5
        L2bc:
            r0 = move-exception
            r15 = r0
            goto L2d4
        L2bf:
            r0 = move-exception
            r1 = r15
            r15 = r0
            r2 = r3
            r3 = r6
        L2c4:
            java.util.concurrent.atomic.AtomicReference r0 = r1.f5916a     // Catch: java.lang.Throwable -> L2bc
        L2c6:
            boolean r1 = r0.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L2bc
            if (r1 != 0) goto L2d3
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Throwable -> L2bc
            if (r1 != r3) goto L2d3
            goto L2c6
        L2d3:
            throw r15     // Catch: java.lang.Throwable -> L2bc
        L2d4:
            r2.m10808f(r4)
            throw r15
        L2d8:
            java.lang.Object r15 = r6.get()
            if (r15 == r7) goto L262
            goto L248
        L2e0:
            java.lang.Object r0 = r14.f5834l
            sg.g r0 = (sg.InterfaceC3975g) r0
            int r1 = r14.f5832j
            r2 = 1
            if (r1 == 0) goto L2fe
            if (r1 != r2) goto L2f7
            java.lang.Object r1 = r14.f5833k
            sg.b r1 = (sg.C3970b) r1
            java.lang.Object r3 = r14.f5831i
            qg.t r3 = (p249qg.InterfaceC3599t) r3
            p077f8.AbstractC1089i.m2732I0(r15)
            goto L31a
        L2f7:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r15)
            r15 = 0
            goto L353
        L2fe:
            p077f8.AbstractC1089i.m2732I0(r15)
            java.lang.Object r15 = r14.f5831i
            qg.t r15 = (p249qg.InterfaceC3599t) r15
            sg.b r1 = r0.iterator()
            r3 = r15
        L30a:
            r14.f5831i = r3
            r14.f5833k = r1
            r14.f5832j = r2
            java.lang.Object r15 = r1.m8185b(r14)
            xf.a r4 = p352xf.EnumC5799a.f23547g
            if (r15 != r4) goto L31a
            r15 = r4
            goto L353
        L31a:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L351
            java.lang.Object r15 = r1.m8186c()
            java.lang.Object r4 = r0.mo8197d()
            boolean r5 = r4 instanceof sg.C3977i
            r6 = 0
            if (r5 != 0) goto L330
            goto L331
        L330:
            r4 = r6
        L331:
            if (r4 != 0) goto L335
            r8 = r15
            goto L336
        L335:
            r8 = r4
        L336:
            ci.e r7 = new ci.e
            java.lang.Object r15 = r14.f5835m
            r9 = r15
            i.c r9 = (p116i.C1739c) r9
            java.lang.Object r15 = r14.f5836n
            r10 = r15
            i0.a1 r10 = (p117i0.InterfaceC1809a1) r10
            java.lang.Object r15 = r14.f5837o
            r11 = r15
            i0.a1 r11 = (p117i0.InterfaceC1809a1) r11
            r12 = 0
            r13 = 4
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r15 = 3
            p249qg.AbstractC3603v.m7563q(r3, r6, r7, r15)
            goto L30a
        L351:
            sf.n r15 = p276sf.C3967n.f12976a
        L353:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p116i.C1745e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: fg.l */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1745e(C1773n0 c1773n0, InterfaceC1231l interfaceC1231l, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f5836n = c1773n0;
        this.f5837o = (AbstractC6044i) interfaceC1231l;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: fg.l */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1745e(C2176h1 c2176h1, InterfaceC1231l interfaceC1231l, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f5836n = c2176h1;
        this.f5837o = (AbstractC6044i) interfaceC1231l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745e(InterfaceC3918x interfaceC3918x, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2, InterfaceC1236q interfaceC1236q, InterfaceC1231l interfaceC1231l3, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f5833k = interfaceC3918x;
        this.f5834l = interfaceC1231l;
        this.f5835m = interfaceC1231l2;
        this.f5836n = interfaceC1236q;
        this.f5837o = interfaceC1231l3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745e(InterfaceC3975g interfaceC3975g, C1739c c1739c, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f5834l = interfaceC3975g;
        this.f5835m = c1739c;
        this.f5836n = interfaceC1809a1;
        this.f5837o = interfaceC1809a12;
    }
}
