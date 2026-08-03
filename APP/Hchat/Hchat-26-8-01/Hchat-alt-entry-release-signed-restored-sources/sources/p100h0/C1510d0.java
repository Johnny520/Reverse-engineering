package p100h0;

import gg.C1424t;
import p085fg.InterfaceC1235p;
import p267s1.C3904k0;
import p267s1.C3914t;
import p276sf.C3967n;
import p370yf.AbstractC6043h;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: h0.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1510d0 extends AbstractC6043h implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5023g = 0;

    /* JADX INFO: renamed from: h */
    public long f5024h;

    /* JADX INFO: renamed from: i */
    public int f5025i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f5026j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f5027k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1510d0(long j3, C1424t c1424t, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f5024h = j3;
        this.f5027k = c1424t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f5023g) {
            case 0:
                C1510d0 c1510d0 = new C1510d0(this.f5024h, (C1424t) this.f5027k, interfaceC5557c);
                c1510d0.f5026j = obj;
                return c1510d0;
            default:
                C1510d0 c1510d02 = new C1510d0((C3914t) this.f5027k, interfaceC5557c);
                c1510d02.f5026j = obj;
                return c1510d02;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        C3904k0 c3904k0 = (C3904k0) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f5023g) {
        }
        return ((C1510d0) create(c3904k0, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:13:0x0047). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f5023g
            switch(r0) {
                case 0: goto L50;
                default: goto L5;
            }
        L5:
            int r0 = r6.f5025i
            r1 = 1
            if (r0 == 0) goto L1d
            if (r0 != r1) goto L16
            long r2 = r6.f5024h
            java.lang.Object r0 = r6.f5026j
            s1.k0 r0 = (p267s1.C3904k0) r0
            p077f8.AbstractC1089i.m2732I0(r7)
            goto L47
        L16:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r7)
            r7 = 0
            goto L4f
        L1d:
            p077f8.AbstractC1089i.m2732I0(r7)
            java.lang.Object r7 = r6.f5026j
            s1.k0 r7 = (p267s1.C3904k0) r7
            java.lang.Object r0 = r6.f5027k
            s1.t r0 = (p267s1.C3914t) r0
            long r2 = r0.f12835b
            y1.l2 r0 = r7.m8099B()
            r0.getClass()
            r4 = 40
            long r4 = r4 + r2
            r0 = r7
            r2 = r4
        L36:
            r6.f5026j = r0
            r6.f5024h = r2
            r6.f5025i = r1
            r7 = 3
            java.lang.Object r7 = p174m.AbstractC2677y2.m6117b(r0, r6, r7)
            xf.a r4 = p352xf.EnumC5799a.f23547g
            if (r7 != r4) goto L47
            r7 = r4
            goto L4f
        L47:
            s1.t r7 = (p267s1.C3914t) r7
            long r4 = r7.f12835b
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 < 0) goto L36
        L4f:
            return r7
        L50:
            java.lang.Object r0 = r6.f5027k
            gg.t r0 = (gg.C1424t) r0
            int r1 = r6.f5025i
            r2 = 1
            if (r1 == 0) goto L6a
            if (r1 != r2) goto L63
            java.lang.Object r1 = r6.f5026j
            s1.k0 r1 = (p267s1.C3904k0) r1
            p077f8.AbstractC1089i.m2732I0(r7)
            goto L88
        L63:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p136j8.C2104o.m5276A(r7)
            r7 = 0
            goto Lba
        L6a:
            p077f8.AbstractC1089i.m2732I0(r7)
            java.lang.Object r7 = r6.f5026j
            r1 = r7
            s1.k0 r1 = (p267s1.C3904k0) r1
            long r3 = r6.f5024h
            b0.t r7 = new b0.t
            r5 = 6
            r7.<init>(r0, r5)
            r6.f5026j = r1
            r6.f5025i = r2
            java.lang.Object r7 = p174m.AbstractC2615j0.m6066c(r1, r3, r7, r6)
            xf.a r2 = p352xf.EnumC5799a.f23547g
            if (r7 != r2) goto L88
            r7 = r2
            goto Lba
        L88:
            s1.t r7 = (p267s1.C3914t) r7
            if (r7 == 0) goto La0
            long r2 = r0.f4737g
            r4 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r2 = r2 & r4
            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto La0
            h0.j r7 = p100h0.EnumC1527j.f5096h
            goto Lba
        La0:
            s1.l0 r7 = r1.f12811l
            s1.k r7 = r7.f12826z
            java.lang.Object r7 = r7.f12800a
            java.lang.Object r7 = tf.AbstractC4166m.m8422t1(r7)
            s1.t r7 = (p267s1.C3914t) r7
            boolean r0 = p267s1.AbstractC3913s.m8111d(r7)
            if (r0 == 0) goto Lb8
            r7.m8118a()
            h0.j r7 = p100h0.EnumC1527j.f5095g
            goto Lba
        Lb8:
            h0.j r7 = p100h0.EnumC1527j.f5098j
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p100h0.C1510d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1510d0(C3914t c3914t, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f5027k = c3914t;
    }
}
