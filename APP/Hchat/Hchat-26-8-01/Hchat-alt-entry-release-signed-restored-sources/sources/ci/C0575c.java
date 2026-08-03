package ci;

import p070f0.C0978j;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p144k.C2158b1;
import p144k.C2163d0;
import p144k.C2178i0;
import p174m.C2624l1;
import p227p4.C3315t;
import p249qg.InterfaceC3599t;
import p267s1.C3906l0;
import p276sf.C3967n;
import p321w.C4632r0;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: ci.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0575c extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1768h;

    /* JADX INFO: renamed from: i */
    public int f1769i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f1770j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: fg.l */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0575c(InterfaceC1231l interfaceC1231l, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f1768h = 3;
        this.f1770j = (AbstractC6044i) interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v8, types: [fg.l, yf.i] */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f1768h) {
            case 0:
                return new C0575c((C0586h0) this.f1770j, interfaceC5557c, 0);
            case 1:
                return new C0575c((C0591k) this.f1770j, interfaceC5557c, 1);
            case 2:
                return new C0575c((C0598n0) this.f1770j, interfaceC5557c, 2);
            case 3:
                return new C0575c((InterfaceC1231l) this.f1770j, interfaceC5557c);
            case 4:
                return new C0575c((C2163d0) this.f1770j, interfaceC5557c, 4);
            case 5:
                return new C0575c((C2178i0) this.f1770j, interfaceC5557c, 5);
            case 6:
                return new C0575c((C2158b1) this.f1770j, interfaceC5557c, 6);
            case 7:
                return new C0575c((C2624l1) this.f1770j, interfaceC5557c, 7);
            case 8:
                C0575c c0575c = new C0575c(2, interfaceC5557c);
                c0575c.f1770j = obj;
                return c0575c;
            case 9:
                return new C0575c((C3315t) this.f1770j, interfaceC5557c, 9);
            case 10:
                return new C0575c((C3906l0) this.f1770j, interfaceC5557c, 10);
            case 11:
                return new C0575c((C0978j) this.f1770j, interfaceC5557c, 11);
            case 12:
                return new C0575c((C4632r0) this.f1770j, interfaceC5557c, 12);
            default:
                return new C0575c((InterfaceC1231l) this.f1770j, interfaceC5557c, 13);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f1768h) {
            case 6:
                ((C0575c) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
                break;
        }
        return ((C0575c) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01de  */
    /* JADX WARN: Type inference failed for: r15v21, types: [fg.l, yf.i] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x01ba -> B:86:0x01ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x01d7 -> B:96:0x01da). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            int r0 = r14.f1768h
            switch(r0) {
                case 0: goto L2da;
                case 1: goto L2a9;
                case 2: goto L278;
                case 3: goto L24f;
                case 4: goto L20e;
                case 5: goto L1e4;
                case 6: goto L188;
                case 7: goto L158;
                case 8: goto L10f;
                case 9: goto Lc8;
                case 10: goto L9a;
                case 11: goto L65;
                case 12: goto L2d;
                default: goto L5;
            }
        L5:
            int r0 = r14.f1769i
            r1 = 1
            if (r0 == 0) goto L17
            if (r0 != r1) goto L10
            p077f8.AbstractC1089i.m2732I0(r15)
            goto L2a
        L10:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r15)
            r15 = 0
            goto L2c
        L17:
            p077f8.AbstractC1089i.m2732I0(r15)
            java.lang.Object r15 = r14.f1770j
            fg.l r15 = (p085fg.InterfaceC1231l) r15
            r14.f1769i = r1
            java.lang.Object r15 = r15.invoke(r14)
            xf.a r0 = p352xf.EnumC5799a.f23547g
            if (r15 != r0) goto L2a
            r15 = r0
            goto L2c
        L2a:
            sf.n r15 = p276sf.C3967n.f12976a
        L2c:
            return r15
        L2d:
            int r0 = r14.f1769i
            r1 = 1
            if (r0 == 0) goto L41
            if (r0 != r1) goto L3a
            p077f8.AbstractC1089i.m2732I0(r15)
            sf.n r15 = p276sf.C3967n.f12976a
            goto L64
        L3a:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r15)
            r15 = 0
            goto L64
        L41:
            p077f8.AbstractC1089i.m2732I0(r15)
            java.lang.Object r15 = r14.f1770j
            w.r0 r15 = (p321w.C4632r0) r15
            r14.f1769i = r1
            r15.getClass()
            f.f0 r0 = new f.f0
            r0.<init>()
            n.k r1 = r15.f15361a
            tg.r r1 = r1.f9251a
            h0.l0 r2 = new h0.l0
            r3 = 3
            r2.<init>(r0, r3, r15)
            r1.getClass()
            tg.C4200r.m8449j(r1, r2, r14)
            xf.a r15 = p352xf.EnumC5799a.f23547g
        L64:
            return r15
        L65:
            int r0 = r14.f1769i
            sf.n r1 = p276sf.C3967n.f12976a
            r2 = 1
            if (r0 == 0) goto L79
            if (r0 != r2) goto L72
            p077f8.AbstractC1089i.m2732I0(r15)
            goto L99
        L72:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r15)
            r1 = 0
            goto L99
        L79:
            p077f8.AbstractC1089i.m2732I0(r15)
            java.lang.Object r15 = r14.f1770j
            f0.j r15 = (p070f0.C0978j) r15
            r14.f1769i = r2
            r15.getClass()
            ci.u r0 = new ci.u
            r2 = 0
            r3 = 1
            r0.<init>(r15, r2, r3)
            java.lang.Object r15 = p249qg.AbstractC3603v.m7551e(r0, r14)
            xf.a r0 = p352xf.EnumC5799a.f23547g
            if (r15 != r0) goto L95
            goto L96
        L95:
            r15 = r1
        L96:
            if (r15 != r0) goto L99
            r1 = r0
        L99:
            return r1
        L9a:
            java.lang.Object r0 = r14.f1770j
            s1.l0 r0 = (p267s1.C3906l0) r0
            int r1 = r14.f1769i
            r2 = 2
            if (r1 == 0) goto Lb4
            r0 = 1
            if (r1 == r0) goto Lb0
            if (r1 != r2) goto La9
            goto Lb0
        La9:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r15)
            r15 = 0
            goto Lc7
        Lb0:
            p077f8.AbstractC1089i.m2732I0(r15)
            goto Lc5
        Lb4:
            p077f8.AbstractC1089i.m2732I0(r15)
            androidx.compose.ui.input.pointer.PointerInputEventHandler r15 = r0.f12824x
            r14.f1769i = r2
            java.lang.Object r15 = r15.invoke(r0, r14)
            xf.a r0 = p352xf.EnumC5799a.f23547g
            if (r15 != r0) goto Lc5
            r15 = r0
            goto Lc7
        Lc5:
            sf.n r15 = p276sf.C3967n.f12976a
        Lc7:
            return r15
        Lc8:
            int r0 = r14.f1769i
            r1 = 1
            if (r0 == 0) goto Ldc
            if (r0 != r1) goto Ld4
            p077f8.AbstractC1089i.m2732I0(r15)
            r7 = r14
            goto L10c
        Ld4:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r15)
            r15 = 0
            r7 = r14
            goto L10e
        Ldc:
            p077f8.AbstractC1089i.m2732I0(r15)
            java.lang.Object r15 = r14.f1770j
            p4.t r15 = (p227p4.C3315t) r15
            java.lang.Object r15 = r15.f10678i
            r2 = r15
            i.l r2 = (p116i.C1766l) r2
            java.lang.Float r3 = new java.lang.Float
            r15 = 0
            r3.<init>(r15)
            java.lang.Float r0 = new java.lang.Float
            r4 = 1056964608(0x3f000000, float:0.5)
            r0.<init>(r4)
            r4 = 1137180672(0x43c80000, float:400.0)
            i.r0 r4 = p116i.AbstractC1742d.m4379o(r15, r4, r0, r1)
            r14.f1769i = r1
            r5 = 1
            r6 = 0
            r8 = 8
            r7 = r14
            java.lang.Object r15 = p116i.AbstractC1742d.m4372h(r2, r3, r4, r5, r6, r7, r8)
            xf.a r0 = p352xf.EnumC5799a.f23547g
            if (r15 != r0) goto L10c
            r15 = r0
            goto L10e
        L10c:
            sf.n r15 = p276sf.C3967n.f12976a
        L10e:
            return r15
        L10f:
            r7 = r14
            int r0 = r7.f1769i
            r1 = 1
            if (r0 == 0) goto L126
            if (r0 != r1) goto L11f
            java.lang.Object r0 = r7.f1770j
            qg.t r0 = (p249qg.InterfaceC3599t) r0
            p077f8.AbstractC1089i.m2732I0(r15)
            goto L12e
        L11f:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r15)
            r15 = 0
            goto L157
        L126:
            p077f8.AbstractC1089i.m2732I0(r15)
            java.lang.Object r15 = r7.f1770j
            qg.t r15 = (p249qg.InterfaceC3599t) r15
            r0 = r15
        L12e:
            wf.g r15 = r0.mo4457n()
            boolean r15 = p249qg.AbstractC3603v.m7562p(r15)
            if (r15 == 0) goto L155
            i2.z r15 = new i2.z
            r2 = 15
            r15.<init>(r2)
            r7.f1770j = r0
            r7.f1769i = r1
            wf.g r2 = r14.getContext()
            i0.d r2 = p117i0.AbstractC1874r.m4637s(r2)
            java.lang.Object r15 = r2.m4458d(r15, r14)
            xf.a r2 = p352xf.EnumC5799a.f23547g
            if (r15 != r2) goto L12e
            r15 = r2
            goto L157
        L155:
            sf.n r15 = p276sf.C3967n.f12976a
        L157:
            return r15
        L158:
            r7 = r14
            int r0 = r7.f1769i
            r1 = 1
            if (r0 == 0) goto L16b
            if (r0 != r1) goto L164
            p077f8.AbstractC1089i.m2732I0(r15)
            goto L187
        L164:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r15)
            r15 = 0
            goto L187
        L16b:
            p077f8.AbstractC1089i.m2732I0(r15)
            java.lang.Object r15 = r7.f1770j
            m.l1 r15 = (p174m.C2624l1) r15
            sg.c r15 = r15.f8538g
            r7.f1769i = r1
            ci.j r0 = new ci.j
            r1 = 0
            r2 = 11
            r0.<init>(r15, r1, r2)
            java.lang.Object r15 = p249qg.AbstractC3603v.m7551e(r0, r14)
            xf.a r0 = p352xf.EnumC5799a.f23547g
            if (r15 != r0) goto L187
            r15 = r0
        L187:
            return r15
        L188:
            r7 = r14
            java.lang.Object r0 = r7.f1770j
            k.b1 r0 = (p144k.C2158b1) r0
            int r1 = r7.f1769i
            r2 = 2
            r3 = 1
            xf.a r4 = p352xf.EnumC5799a.f23547g
            if (r1 == 0) goto L1a8
            if (r1 == r3) goto L1a4
            if (r1 != r2) goto L19d
            p077f8.AbstractC1089i.m2732I0(r15)
            goto L1da
        L19d:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r15)
            r4 = 0
            goto L1d9
        L1a4:
            p077f8.AbstractC1089i.m2732I0(r15)
            goto L1b8
        L1a8:
            p077f8.AbstractC1089i.m2732I0(r15)
        L1ab:
            sg.c r15 = r0.f7147E
            if (r15 == 0) goto L1b8
            r7.f1769i = r3
            java.lang.Object r15 = r15.mo8198f(r14)
            if (r15 != r4) goto L1b8
            goto L1d9
        L1b8:
            k.n1 r15 = r0.f7153z
            if (r15 == 0) goto L1ab
            i2.z r15 = new i2.z
            r1 = 15
            r15.<init>(r1)
            r7.f1769i = r2
            wf.g r1 = r14.getContext()
            i0.d r1 = p117i0.AbstractC1874r.m4637s(r1)
            i0.t0 r5 = new i0.t0
            r6 = 0
            r5.<init>(r15, r6)
            java.lang.Object r15 = r1.m4458d(r5, r14)
            if (r15 != r4) goto L1da
        L1d9:
            return r4
        L1da:
            k.n1 r15 = r0.f7153z
            if (r15 == 0) goto L1ab
            k.p1 r15 = (p144k.C2200p1) r15
            r15.m5452d()
            goto L1ab
        L1e4:
            r7 = r14
            int r0 = r7.f1769i
            r1 = 1
            if (r0 == 0) goto L1f7
            if (r0 != r1) goto L1f0
            p077f8.AbstractC1089i.m2732I0(r15)
            goto L20b
        L1f0:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r15)
            r15 = 0
            goto L20d
        L1f7:
            p077f8.AbstractC1089i.m2732I0(r15)
            java.lang.Object r15 = r7.f1770j
            k.i0 r15 = (p144k.C2178i0) r15
            r7.f1769i = r1
            r0 = 0
            java.lang.Object r15 = p219oh.AbstractC3165h.m6784k(r15, r0, r14)
            xf.a r0 = p352xf.EnumC5799a.f23547g
            if (r15 != r0) goto L20b
            r15 = r0
            goto L20d
        L20b:
            sf.n r15 = p276sf.C3967n.f12976a
        L20d:
            return r15
        L20e:
            r7 = r14
            int r0 = r7.f1769i
            r1 = 1
            if (r0 == 0) goto L223
            if (r0 != r1) goto L21c
            p077f8.AbstractC1089i.m2732I0(r15)
            sf.n r15 = p276sf.C3967n.f12976a
            goto L24e
        L21c:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r15)
            r15 = 0
            goto L24e
        L223:
            p077f8.AbstractC1089i.m2732I0(r15)
            gg.s r9 = new gg.s
            r9.<init>()
            gg.s r10 = new gg.s
            r10.<init>()
            gg.s r11 = new gg.s
            r11.<init>()
            java.lang.Object r15 = r7.f1770j
            r12 = r15
            k.d0 r12 = (p144k.C2163d0) r12
            n.k r15 = r12.f7169u
            tg.r r15 = r15.f9251a
            k.c0 r8 = new k.c0
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r7.f1769i = r1
            r15.getClass()
            tg.C4200r.m8449j(r15, r8, r14)
            xf.a r15 = p352xf.EnumC5799a.f23547g
        L24e:
            return r15
        L24f:
            r7 = r14
            int r0 = r7.f1769i
            r1 = 1
            if (r0 == 0) goto L262
            if (r0 != r1) goto L25b
            p077f8.AbstractC1089i.m2732I0(r15)
            goto L275
        L25b:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r15)
            r15 = 0
            goto L277
        L262:
            p077f8.AbstractC1089i.m2732I0(r15)
            java.lang.Object r15 = r7.f1770j
            yf.i r15 = (p370yf.AbstractC6044i) r15
            r7.f1769i = r1
            java.lang.Object r15 = r15.invoke(r14)
            xf.a r0 = p352xf.EnumC5799a.f23547g
            if (r15 != r0) goto L275
            r15 = r0
            goto L277
        L275:
            sf.n r15 = p276sf.C3967n.f12976a
        L277:
            return r15
        L278:
            r7 = r14
            int r0 = r7.f1769i
            r1 = 1
            if (r0 == 0) goto L28d
            if (r0 != r1) goto L286
            p077f8.AbstractC1089i.m2732I0(r15)
            sf.n r15 = p276sf.C3967n.f12976a
            goto L2a8
        L286:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r15)
            r15 = 0
            goto L2a8
        L28d:
            p077f8.AbstractC1089i.m2732I0(r15)
            java.lang.Object r15 = r7.f1770j
            ci.n0 r15 = (ci.C0598n0) r15
            n.k r0 = r15.f1874u
            tg.r r0 = r0.f9251a
            ci.i r2 = new ci.i
            r3 = 1
            r2.<init>(r15, r3)
            r7.f1769i = r1
            r0.getClass()
            tg.C4200r.m8449j(r0, r2, r14)
            xf.a r15 = p352xf.EnumC5799a.f23547g
        L2a8:
            return r15
        L2a9:
            r7 = r14
            int r0 = r7.f1769i
            r1 = 1
            if (r0 == 0) goto L2be
            if (r0 != r1) goto L2b7
            p077f8.AbstractC1089i.m2732I0(r15)
            sf.n r15 = p276sf.C3967n.f12976a
            goto L2d9
        L2b7:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r15)
            r15 = 0
            goto L2d9
        L2be:
            p077f8.AbstractC1089i.m2732I0(r15)
            java.lang.Object r15 = r7.f1770j
            ci.k r15 = (ci.C0591k) r15
            n.k r0 = r15.f1846u
            tg.r r0 = r0.f9251a
            ci.i r2 = new ci.i
            r3 = 0
            r2.<init>(r15, r3)
            r7.f1769i = r1
            r0.getClass()
            tg.C4200r.m8449j(r0, r2, r14)
            xf.a r15 = p352xf.EnumC5799a.f23547g
        L2d9:
            return r15
        L2da:
            r7 = r14
            int r0 = r7.f1769i
            r1 = 1
            if (r0 == 0) goto L2ed
            if (r0 != r1) goto L2e6
            p077f8.AbstractC1089i.m2732I0(r15)
            goto L300
        L2e6:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r15)
            r15 = 0
            goto L302
        L2ed:
            p077f8.AbstractC1089i.m2732I0(r15)
            java.lang.Object r15 = r7.f1770j
            ci.h0 r15 = (ci.C0586h0) r15
            r7.f1769i = r1
            java.lang.Object r15 = r15.m1597e(r14)
            xf.a r0 = p352xf.EnumC5799a.f23547g
            if (r15 != r0) goto L300
            r15 = r0
            goto L302
        L300:
            sf.n r15 = p276sf.C3967n.f12976a
        L302:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: ci.C0575c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0575c(int i9, InterfaceC5557c interfaceC5557c) {
        super(i9, interfaceC5557c);
        this.f1768h = 8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0575c(Object obj, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f1768h = i9;
        this.f1770j = obj;
    }
}
