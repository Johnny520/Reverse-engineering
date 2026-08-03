package p049d9;

import gg.C1425u;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p267s1.C3904k0;
import p267s1.EnumC3905l;
import p276sf.C3967n;
import p321w.InterfaceC4647y0;
import p370yf.AbstractC6043h;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: d9.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0750k extends AbstractC6043h implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2233g;

    /* JADX INFO: renamed from: h */
    public int f2234h;

    /* JADX INFO: renamed from: i */
    public Object f2235i;

    /* JADX INFO: renamed from: j */
    public Object f2236j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f2237k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: fg.p */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0750k(InterfaceC5561g interfaceC5561g, InterfaceC1235p interfaceC1235p, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f2233g = 1;
        this.f2236j = interfaceC5561g;
        this.f2237k = (AbstractC6043h) interfaceC1235p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [fg.p, yf.h] */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f2233g) {
            case 0:
                C0750k c0750k = new C0750k((Class) this.f2237k, interfaceC5557c, 0);
                c0750k.f2235i = obj;
                return c0750k;
            case 1:
                C0750k c0750k2 = new C0750k((InterfaceC5561g) this.f2236j, (InterfaceC1235p) this.f2237k, interfaceC5557c);
                c0750k2.f2235i = obj;
                return c0750k2;
            case 2:
                C0750k c0750k3 = new C0750k((InterfaceC1220a) this.f2237k, interfaceC5557c, 2);
                c0750k3.f2236j = obj;
                return c0750k3;
            case 3:
                C0750k c0750k4 = new C0750k((EnumC3905l) this.f2236j, (C1425u) this.f2237k, interfaceC5557c, 3);
                c0750k4.f2235i = obj;
                return c0750k4;
            case 4:
                C0750k c0750k5 = new C0750k((InterfaceC4647y0) this.f2237k, interfaceC5557c, 4);
                c0750k5.f2235i = obj;
                return c0750k5;
            case 5:
                C0750k c0750k6 = new C0750k((InterfaceC1231l) this.f2236j, (InterfaceC1220a) this.f2237k, interfaceC5557c, 5);
                c0750k6.f2235i = obj;
                return c0750k6;
            default:
                C0750k c0750k7 = new C0750k((InterfaceC1220a) this.f2237k, interfaceC5557c, 6);
                c0750k7.f2235i = obj;
                return c0750k7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2233g) {
        }
        return ((C0750k) create((C3904k0) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02e1 A[Catch: CancellationException -> 0x02c8, TRY_ENTER, TryCatch #0 {CancellationException -> 0x02c8, blocks: (B:154:0x02e1, B:157:0x02f0, B:143:0x02c4, B:148:0x02cf), top: B:192:0x02a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0335  */
    /* JADX WARN: Type inference failed for: r0v14, types: [fg.p, yf.h] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x022b -> B:112:0x022e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x0294 -> B:132:0x0295). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x02f8 -> B:152:0x02db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:163:0x0309 -> B:152:0x02db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:187:0x036b -> B:189:0x036f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0080 -> B:25:0x0083). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0166 -> B:72:0x0169). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.f2233g
            switch(r0) {
                case 0: goto L310;
                case 1: goto L29a;
                case 2: goto L25e;
                case 3: goto L192;
                case 4: goto L10d;
                case 5: goto Lb4;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r1.f2235i
            s1.k0 r0 = (p267s1.C3904k0) r0
            int r2 = r1.f2234h
            s1.l r3 = p267s1.EnumC3905l.f12812g
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            xf.a r8 = p352xf.EnumC5799a.f23547g
            if (r2 == 0) goto L3f
            if (r2 == r6) goto L39
            if (r2 == r5) goto L2f
            if (r2 != r4) goto L27
            java.lang.Object r2 = r1.f2236j
            s1.t r2 = (p267s1.C3914t) r2
            p077f8.AbstractC1089i.m2732I0(r18)
            r5 = r18
            goto L83
        L27:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r0)
            r8 = 0
            goto Lb3
        L2f:
            java.lang.Object r2 = r1.f2236j
            s1.t r2 = (p267s1.C3914t) r2
            p077f8.AbstractC1089i.m2732I0(r18)
            r5 = r18
            goto L6b
        L39:
            p077f8.AbstractC1089i.m2732I0(r18)
            r2 = r18
            goto L4e
        L3f:
            p077f8.AbstractC1089i.m2732I0(r18)
            r1.f2235i = r0
            r1.f2234h = r6
            r2 = 0
            java.lang.Object r2 = p174m.AbstractC2677y2.m6116a(r0, r2, r3, r1)
            if (r2 != r8) goto L4e
            goto Lb3
        L4e:
            s1.t r2 = (p267s1.C3914t) r2
            y1.l2 r6 = r0.m8099B()
            long r9 = r6.mo10226b()
            a0.b r6 = new a0.b
            r11 = 3
            r6.<init>(r2, r7, r11)
            r1.f2235i = r0
            r1.f2236j = r2
            r1.f2234h = r5
            java.lang.Object r5 = r0.m8101E(r9, r6, r1)
            if (r5 != r8) goto L6b
            goto Lb3
        L6b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 != 0) goto Lb1
            java.lang.Object r5 = r1.f2237k
            fg.a r5 = (p085fg.InterfaceC1220a) r5
            r5.invoke()
        L76:
            r1.f2235i = r0
            r1.f2236j = r2
            r1.f2234h = r4
            java.lang.Object r5 = r0.m8102e(r3, r1)
            if (r5 != r8) goto L83
            goto Lb3
        L83:
            s1.k r5 = (p267s1.C3903k) r5
            java.lang.Object r5 = r5.f12800a
            java.util.Iterator r5 = r5.iterator()
        L8b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto La3
            java.lang.Object r6 = r5.next()
            r9 = r6
            s1.t r9 = (p267s1.C3914t) r9
            long r9 = r9.f12834a
            long r11 = r2.f12834a
            boolean r9 = p267s1.AbstractC3913s.m8112e(r9, r11)
            if (r9 == 0) goto L8b
            goto La4
        La3:
            r6 = r7
        La4:
            s1.t r6 = (p267s1.C3914t) r6
            if (r6 == 0) goto Lab
            r6.m8118a()
        Lab:
            if (r6 == 0) goto Lb1
            boolean r5 = r6.f12837d
            if (r5 != 0) goto L76
        Lb1:
            sf.n r8 = p276sf.C3967n.f12976a
        Lb3:
            return r8
        Lb4:
            java.lang.Object r0 = r1.f2236j
            fg.l r0 = (p085fg.InterfaceC1231l) r0
            java.lang.Object r2 = r1.f2235i
            s1.k0 r2 = (p267s1.C3904k0) r2
            int r3 = r1.f2234h
            r4 = 2
            r5 = 1
            xf.a r6 = p352xf.EnumC5799a.f23547g
            if (r3 == 0) goto Ld9
            if (r3 == r5) goto Ld5
            if (r3 != r4) goto Lce
            p077f8.AbstractC1089i.m2732I0(r18)
            r2 = r18
            goto Lfa
        Lce:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r0)
            r6 = 0
            goto L10c
        Ld5:
            p077f8.AbstractC1089i.m2732I0(r18)
            goto Le7
        Ld9:
            p077f8.AbstractC1089i.m2732I0(r18)
            r1.f2235i = r2
            r1.f2234h = r5
            java.lang.Object r3 = p174m.AbstractC2677y2.m6117b(r2, r1, r4)
            if (r3 != r6) goto Le7
            goto L10c
        Le7:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.invoke(r3)
            r3 = 0
            r1.f2235i = r3
            r1.f2234h = r4
            s1.l r3 = p267s1.EnumC3905l.f12813h
            java.lang.Object r2 = p174m.AbstractC2677y2.m6124i(r2, r3, r1)
            if (r2 != r6) goto Lfa
            goto L10c
        Lfa:
            s1.t r2 = (p267s1.C3914t) r2
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r0.invoke(r3)
            if (r2 == 0) goto L10a
            java.lang.Object r0 = r1.f2237k
            fg.a r0 = (p085fg.InterfaceC1220a) r0
            r0.invoke()
        L10a:
            sf.n r6 = p276sf.C3967n.f12976a
        L10c:
            return r6
        L10d:
            java.lang.Object r0 = r1.f2237k
            w.y0 r0 = (p321w.InterfaceC4647y0) r0
            int r2 = r1.f2234h
            r3 = 2
            r4 = 1
            xf.a r5 = p352xf.EnumC5799a.f23547g
            if (r2 == 0) goto L13c
            if (r2 == r4) goto L132
            if (r2 != r3) goto L12b
            java.lang.Object r2 = r1.f2236j
            s1.t r2 = (p267s1.C3914t) r2
            java.lang.Object r4 = r1.f2235i
            s1.k0 r4 = (p267s1.C3904k0) r4
            p077f8.AbstractC1089i.m2732I0(r18)
            r6 = r18
            goto L169
        L12b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r0)
            r5 = 0
            goto L191
        L132:
            java.lang.Object r2 = r1.f2235i
            s1.k0 r2 = (p267s1.C3904k0) r2
            p077f8.AbstractC1089i.m2732I0(r18)
            r4 = r18
            goto L14e
        L13c:
            p077f8.AbstractC1089i.m2732I0(r18)
            java.lang.Object r2 = r1.f2235i
            s1.k0 r2 = (p267s1.C3904k0) r2
            r1.f2235i = r2
            r1.f2234h = r4
            java.lang.Object r4 = p174m.AbstractC2677y2.m6117b(r2, r1, r3)
            if (r4 != r5) goto L14e
            goto L191
        L14e:
            s1.t r4 = (p267s1.C3914t) r4
            long r6 = r4.f12836c
            r0.mo4012d()
            r16 = r4
            r4 = r2
            r2 = r16
        L15a:
            r1.f2235i = r4
            r1.f2236j = r2
            r1.f2234h = r3
            s1.l r6 = p267s1.EnumC3905l.f12813h
            java.lang.Object r6 = r4.m8102e(r6, r1)
            if (r6 != r5) goto L169
            goto L191
        L169:
            s1.k r6 = (p267s1.C3903k) r6
            java.lang.Object r6 = r6.f12800a
            int r7 = r6.size()
            r8 = 0
        L172:
            if (r8 >= r7) goto L18c
            java.lang.Object r9 = r6.get(r8)
            s1.t r9 = (p267s1.C3914t) r9
            long r10 = r9.f12834a
            long r12 = r2.f12834a
            boolean r10 = p267s1.AbstractC3913s.m8112e(r10, r12)
            if (r10 == 0) goto L189
            boolean r9 = r9.f12837d
            if (r9 == 0) goto L189
            goto L15a
        L189:
            int r8 = r8 + 1
            goto L172
        L18c:
            r0.mo4011c()
            sf.n r5 = p276sf.C3967n.f12976a
        L191:
            return r5
        L192:
            java.lang.Object r0 = r1.f2237k
            gg.u r0 = (gg.C1425u) r0
            int r2 = r1.f2234h
            m.c1 r3 = p174m.C2583c1.f8376a
            r4 = 2
            r5 = 0
            r6 = 1
            xf.a r7 = p352xf.EnumC5799a.f23547g
            if (r2 == 0) goto L1c2
            if (r2 == r6) goto L1b8
            if (r2 != r4) goto L1b0
            java.lang.Object r2 = r1.f2235i
            s1.k0 r2 = (p267s1.C3904k0) r2
            p077f8.AbstractC1089i.m2732I0(r18)
            r8 = r18
            goto L22e
        L1b0:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r0)
            r7 = 0
            goto L25d
        L1b8:
            java.lang.Object r2 = r1.f2235i
            s1.k0 r2 = (p267s1.C3904k0) r2
            p077f8.AbstractC1089i.m2732I0(r18)
            r8 = r18
            goto L1d9
        L1c2:
            p077f8.AbstractC1089i.m2732I0(r18)
            java.lang.Object r2 = r1.f2235i
            s1.k0 r2 = (p267s1.C3904k0) r2
        L1c9:
            java.lang.Object r8 = r1.f2236j
            s1.l r8 = (p267s1.EnumC3905l) r8
            r1.f2235i = r2
            r1.f2234h = r6
            java.lang.Object r8 = r2.m8102e(r8, r1)
            if (r8 != r7) goto L1d9
            goto L25d
        L1d9:
            s1.k r8 = (p267s1.C3903k) r8
            java.lang.Object r9 = r8.f12800a
            int r10 = r9.size()
            r11 = r5
        L1e2:
            if (r11 >= r10) goto L24e
            java.lang.Object r12 = r9.get(r11)
            s1.t r12 = (p267s1.C3914t) r12
            boolean r12 = p267s1.AbstractC3913s.m8110c(r12)
            if (r12 != 0) goto L24b
            int r8 = r8.f12802c
            if (r8 != r4) goto L1f9
            m.e1 r2 = p174m.C2593e1.f8401a
            r0.f4738g = r2
            goto L25b
        L1f9:
            int r8 = r9.size()
            r10 = r5
        L1fe:
            if (r10 >= r8) goto L221
            java.lang.Object r11 = r9.get(r10)
            s1.t r11 = (p267s1.C3914t) r11
            boolean r12 = r11.m8119b()
            if (r12 != 0) goto L21e
            s1.l0 r12 = r2.f12811l
            long r12 = r12.f12820E
            long r14 = r2.m8103m()
            boolean r11 = p267s1.AbstractC3913s.m8113f(r11, r12, r14)
            if (r11 == 0) goto L21b
            goto L21e
        L21b:
            int r10 = r10 + 1
            goto L1fe
        L21e:
            r0.f4738g = r3
            goto L25b
        L221:
            r1.f2235i = r2
            r1.f2234h = r4
            s1.l r8 = p267s1.EnumC3905l.f12814i
            java.lang.Object r8 = r2.m8102e(r8, r1)
            if (r8 != r7) goto L22e
            goto L25d
        L22e:
            s1.k r8 = (p267s1.C3903k) r8
            java.lang.Object r8 = r8.f12800a
            int r9 = r8.size()
            r10 = r5
        L237:
            if (r10 >= r9) goto L1c9
            java.lang.Object r11 = r8.get(r10)
            s1.t r11 = (p267s1.C3914t) r11
            boolean r11 = r11.m8119b()
            if (r11 == 0) goto L248
            r0.f4738g = r3
            goto L25b
        L248:
            int r10 = r10 + 1
            goto L237
        L24b:
            int r11 = r11 + 1
            goto L1e2
        L24e:
            m.d1 r2 = new m.d1
            java.lang.Object r3 = r9.get(r5)
            s1.t r3 = (p267s1.C3914t) r3
            r2.<init>(r3)
            r0.f4738g = r2
        L25b:
            sf.n r7 = p276sf.C3967n.f12976a
        L25d:
            return r7
        L25e:
            int r0 = r1.f2234h
            r2 = 1
            if (r0 == 0) goto L276
            if (r0 != r2) goto L26f
            java.lang.Object r0 = r1.f2235i
            java.lang.Object r3 = r1.f2236j
            ng.l r3 = (ng.AbstractC3014l) r3
            p077f8.AbstractC1089i.m2732I0(r18)
            goto L295
        L26f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r0)
            r0 = 0
            goto L299
        L276:
            p077f8.AbstractC1089i.m2732I0(r18)
            java.lang.Object r0 = r1.f2236j
            ng.l r0 = (ng.AbstractC3014l) r0
            r3 = r0
        L27e:
            java.lang.Object r0 = r1.f2237k
            fg.a r0 = (p085fg.InterfaceC1220a) r0
            java.lang.Object r0 = r0.invoke()
            if (r0 == 0) goto L294
            r1.f2236j = r3
            r1.f2235i = r0
            r1.f2234h = r2
            r3.mo6406a(r0, r1)
            xf.a r0 = p352xf.EnumC5799a.f23547g
            goto L299
        L294:
            r0 = 0
        L295:
            if (r0 != 0) goto L27e
            sf.n r0 = p276sf.C3967n.f12976a
        L299:
            return r0
        L29a:
            java.lang.Object r0 = r1.f2236j
            r2 = r0
            wf.g r2 = (wf.InterfaceC5561g) r2
            int r0 = r1.f2234h
            s1.l r3 = p267s1.EnumC3905l.f12814i
            r4 = 3
            r5 = 2
            r6 = 1
            xf.a r7 = p352xf.EnumC5799a.f23547g
            if (r0 == 0) goto L2d3
            if (r0 == r6) goto L2ca
            if (r0 == r5) goto L2bf
            if (r0 != r4) goto L2b8
            java.lang.Object r0 = r1.f2235i
            s1.k0 r0 = (p267s1.C3904k0) r0
            p077f8.AbstractC1089i.m2732I0(r18)
            goto L2da
        L2b8:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r0)
            r7 = 0
            goto L30f
        L2bf:
            java.lang.Object r0 = r1.f2235i
            r8 = r0
            s1.k0 r8 = (p267s1.C3904k0) r8
            p077f8.AbstractC1089i.m2732I0(r18)     // Catch: java.util.concurrent.CancellationException -> L2c8
            goto L2db
        L2c8:
            r0 = move-exception
            goto L2fb
        L2ca:
            java.lang.Object r0 = r1.f2235i
            r8 = r0
            s1.k0 r8 = (p267s1.C3904k0) r8
            p077f8.AbstractC1089i.m2732I0(r18)     // Catch: java.util.concurrent.CancellationException -> L2c8
            goto L2f0
        L2d3:
            p077f8.AbstractC1089i.m2732I0(r18)
            java.lang.Object r0 = r1.f2235i
            s1.k0 r0 = (p267s1.C3904k0) r0
        L2da:
            r8 = r0
        L2db:
            boolean r0 = p249qg.AbstractC3603v.m7562p(r2)
            if (r0 == 0) goto L30d
            java.lang.Object r0 = r1.f2237k     // Catch: java.util.concurrent.CancellationException -> L2c8
            yf.h r0 = (p370yf.AbstractC6043h) r0     // Catch: java.util.concurrent.CancellationException -> L2c8
            r1.f2235i = r8     // Catch: java.util.concurrent.CancellationException -> L2c8
            r1.f2234h = r6     // Catch: java.util.concurrent.CancellationException -> L2c8
            java.lang.Object r0 = r0.invoke(r8, r1)     // Catch: java.util.concurrent.CancellationException -> L2c8
            if (r0 != r7) goto L2f0
            goto L30f
        L2f0:
            r1.f2235i = r8     // Catch: java.util.concurrent.CancellationException -> L2c8
            r1.f2234h = r5     // Catch: java.util.concurrent.CancellationException -> L2c8
            java.lang.Object r0 = p000a.AbstractC0000a.m76m(r8, r3, r1)     // Catch: java.util.concurrent.CancellationException -> L2c8
            if (r0 != r7) goto L2db
            goto L30f
        L2fb:
            boolean r9 = p249qg.AbstractC3603v.m7562p(r2)
            if (r9 == 0) goto L30c
            r1.f2235i = r8
            r1.f2234h = r4
            java.lang.Object r0 = p000a.AbstractC0000a.m76m(r8, r3, r1)
            if (r0 != r7) goto L2db
            goto L30f
        L30c:
            throw r0
        L30d:
            sf.n r7 = p276sf.C3967n.f12976a
        L30f:
            return r7
        L310:
            java.lang.Object r0 = r1.f2235i
            ng.l r0 = (ng.AbstractC3014l) r0
            int r2 = r1.f2234h
            r3 = 1
            if (r2 == 0) goto L32a
            if (r2 != r3) goto L323
            java.lang.Object r2 = r1.f2236j
            java.lang.Class r2 = (java.lang.Class) r2
            p077f8.AbstractC1089i.m2732I0(r18)
            goto L36f
        L323:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r0)
            r0 = 0
            goto L375
        L32a:
            p077f8.AbstractC1089i.m2732I0(r18)
            java.lang.Object r2 = r1.f2237k
            java.lang.Class r2 = (java.lang.Class) r2
        L331:
            sf.n r4 = p276sf.C3967n.f12976a
            if (r2 == 0) goto L374
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L374
            java.util.List r5 = p099h.Hchat.utils.KavaReflector.declaredFields(r2)
            r1.f2235i = r0
            r1.f2236j = r2
            r1.f2234h = r3
            r0.getClass()
            xf.a r6 = p352xf.EnumC5799a.f23547g
            if (r5 == 0) goto L355
            boolean r7 = r5.isEmpty()
            if (r7 == 0) goto L355
            goto L36b
        L355:
            java.util.Iterator r5 = r5.iterator()
            r7 = r0
            ng.k r7 = (ng.C3013k) r7
            boolean r8 = r5.hasNext()
            if (r8 != 0) goto L363
            goto L36b
        L363:
            r7.f9810i = r5
            r4 = 2
            r7.f9808g = r4
            r7.f9811j = r1
            r4 = r6
        L36b:
            if (r4 != r6) goto L36f
            r0 = r6
            goto L375
        L36f:
            java.lang.Class r2 = r2.getSuperclass()
            goto L331
        L374:
            r0 = r4
        L375:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p049d9.C0750k.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0750k(Object obj, InterfaceC5557c interfaceC5557c, int i9) {
        super(interfaceC5557c);
        this.f2233g = i9;
        this.f2237k = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0750k(Object obj, Object obj2, InterfaceC5557c interfaceC5557c, int i9) {
        super(interfaceC5557c);
        this.f2233g = i9;
        this.f2236j = obj;
        this.f2237k = obj2;
    }
}
