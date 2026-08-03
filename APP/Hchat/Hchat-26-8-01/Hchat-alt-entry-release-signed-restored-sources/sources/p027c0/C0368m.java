package p027c0;

import ci.C0581f;
import ci.C0586h0;
import ci.C0589j;
import ci.C0591k;
import gg.C1422r;
import java.util.concurrent.CancellationException;
import okhttp3.HttpUrl;
import p028c1.C0372b;
import p040d0.InterfaceC0648e;
import p041d1.C0655c0;
import p057e1.C0808c;
import p069f.C0945l0;
import p071f1.C1003g;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p099h.C1492w;
import p100h0.C1525i0;
import p100h0.C1534l0;
import p100h0.C1538n;
import p100h0.C1555v0;
import p100h0.C1557w0;
import p116i.AbstractC1742d;
import p116i.AbstractC1801x;
import p116i.C1739c;
import p116i.C1765k1;
import p116i.C1768l1;
import p117i0.AbstractC1874r;
import p117i0.C1819d;
import p117i0.C1845j1;
import p117i0.C1865o1;
import p117i0.C1894x1;
import p117i0.InterfaceC1809a1;
import p117i0.InterfaceC1854l2;
import p131j0.C2046b;
import p136j8.C2098i;
import p136j8.C2104o;
import p144k.C2173g1;
import p144k.C2176h1;
import p144k.EnumC2164d1;
import p172lg.C2564d;
import p174m.AbstractC2651s0;
import p174m.C2571a;
import p174m.C2572a0;
import p174m.C2576b;
import p174m.C2581c;
import p174m.C2610i;
import p174m.C2618k;
import p174m.C2626m;
import p174m.C2629m2;
import p174m.C2635o0;
import p174m.C2637o2;
import p174m.C2642q;
import p174m.C2646r;
import p174m.C2647r0;
import p174m.C2655t0;
import p174m.C2656t1;
import p174m.EnumC2640p1;
import p174m.InterfaceC2660u1;
import p187n.C2857k;
import p187n.C2858l;
import p187n.InterfaceC2856j;
import p218og.C3147k;
import p249qg.AbstractC3553c0;
import p249qg.AbstractC3603v;
import p249qg.C3560e1;
import p249qg.C3564g;
import p249qg.EnumC3601u;
import p249qg.InterfaceC3556d0;
import p249qg.InterfaceC3599t;
import p259r9.AbstractC3754e0;
import p267s1.C3914t;
import p269s3.C3927e;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p277t.C4074f;
import p277t.C4076h;
import p293u2.C4247q;
import p321w.C4594e1;
import p321w.C4639u0;
import p322w0.AbstractC4662m;
import p332wb.AbstractC4955ho;
import p332wb.C5026jv;
import p332wb.C5292s0;
import p332wb.C5523z2;
import p339x1.AbstractC5614i1;
import p345x8.C5732y;
import p352xf.EnumC5799a;
import p353xg.C5808e;
import p353xg.ExecutorC5807d;
import p357y1.AbstractC5912n1;
import p370yf.AbstractC6044i;
import sg.AbstractC3978j;
import sg.C3970b;
import sg.C3971c;
import sg.C3983o;
import sg.EnumC3969a;
import sg.InterfaceC3975g;
import tg.AbstractC4201s;
import tg.InterfaceC4187e;
import ug.C4342g;
import wf.C5558d;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: c0.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0368m extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1029h;

    /* JADX INFO: renamed from: i */
    public int f1030i;

    /* JADX INFO: renamed from: j */
    public Object f1031j;

    /* JADX INFO: renamed from: k */
    public Object f1032k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f1033l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0368m(Object obj, Object obj2, Object obj3, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f1029h = i9;
        this.f1031j = obj;
        this.f1032k = obj2;
        this.f1033l = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f1029h) {
            case 0:
                return new C0368m((C0369n) this.f1032k, (InterfaceC0648e) this.f1033l, interfaceC5557c, 0);
            case 1:
                return new C0368m((C0581f) this.f1031j, (C0586h0) this.f1032k, (C3914t) this.f1033l, interfaceC5557c, 1);
            case 2:
                C0368m c0368m = new C0368m((C0591k) this.f1032k, (C1422r) this.f1033l, interfaceC5557c, 2);
                c0368m.f1031j = obj;
                return c0368m;
            case 3:
                C0368m c0368m2 = new C0368m((C1765k1) this.f1032k, (InterfaceC1809a1) this.f1033l, interfaceC5557c, 3);
                c0368m2.f1031j = obj;
                return c0368m2;
            case 4:
                C0368m c0368m3 = new C0368m((InterfaceC1854l2) this.f1032k, (C1739c) this.f1033l, interfaceC5557c, 4);
                c0368m3.f1031j = obj;
                return c0368m3;
            case 5:
                C0368m c0368m4 = new C0368m((C1894x1) this.f1032k, (C1819d) this.f1033l, interfaceC5557c, 5);
                c0368m4.f1031j = obj;
                return c0368m4;
            case 6:
                C0368m c0368m5 = new C0368m((InterfaceC1235p) this.f1032k, (InterfaceC1809a1) this.f1033l, interfaceC5557c, 6);
                c0368m5.f1031j = obj;
                return c0368m5;
            case 7:
                return new C0368m((C2857k) this.f1031j, (C2858l) this.f1032k, (InterfaceC3556d0) this.f1033l, interfaceC5557c, 7);
            case 8:
                return new C0368m((C2857k) this.f1031j, (InterfaceC2856j) this.f1032k, (InterfaceC3556d0) this.f1033l, interfaceC5557c, 8);
            case 9:
                C0368m c0368m6 = new C0368m((C2646r) this.f1032k, (InterfaceC1235p) this.f1033l, interfaceC5557c, 9);
                c0368m6.f1031j = obj;
                return c0368m6;
            case 10:
                return new C0368m((C2646r) this.f1031j, (EnumC2164d1) this.f1032k, (InterfaceC1235p) this.f1033l, interfaceC5557c, 10);
            case 11:
                C0368m c0368m7 = new C0368m((C2635o0) this.f1032k, (C2655t0) this.f1033l, interfaceC5557c, 11);
                c0368m7.f1031j = obj;
                return c0368m7;
            case 12:
                C0368m c0368m8 = new C0368m((C2655t0) this.f1032k, (C2572a0) this.f1033l, interfaceC5557c, 12);
                c0368m8.f1031j = obj;
                return c0368m8;
            case 13:
                C0368m c0368m9 = new C0368m((C2635o0) this.f1032k, (C2637o2) this.f1033l, interfaceC5557c, 13);
                c0368m9.f1031j = obj;
                return c0368m9;
            case 14:
                C0368m c0368m10 = new C0368m((C2637o2) this.f1032k, (InterfaceC1235p) this.f1033l, interfaceC5557c, 14);
                c0368m10.f1031j = obj;
                return c0368m10;
            case 15:
                return new C0368m((C4594e1) this.f1031j, (C2656t1) this.f1032k, (C3914t) this.f1033l, interfaceC5557c, 15);
            case 16:
                return new C0368m((C4076h) this.f1031j, (AbstractC5614i1) this.f1032k, (C0372b) this.f1033l, interfaceC5557c, 16);
            case 17:
                C0368m c0368m11 = new C0368m((InterfaceC4187e) this.f1032k, (C4342g) this.f1033l, interfaceC5557c, 17);
                c0368m11.f1031j = obj;
                return c0368m11;
            case 18:
                return new C0368m((InterfaceC1809a1) this.f1031j, (InterfaceC1809a1) this.f1032k, (InterfaceC1809a1) this.f1033l, interfaceC5557c, 18);
            case 19:
                return new C0368m((C5292s0) this.f1032k, (InterfaceC1809a1) this.f1033l, interfaceC5557c, 19);
            case 20:
                return new C0368m((C5523z2) this.f1032k, (InterfaceC1809a1) this.f1033l, interfaceC5557c, 20);
            case 21:
                return new C0368m((C2098i) this.f1031j, (InterfaceC1809a1) this.f1032k, (InterfaceC1809a1) this.f1033l, interfaceC5557c, 21);
            case 22:
                return new C0368m((C5026jv) this.f1032k, (InterfaceC1809a1) this.f1033l, interfaceC5557c, 22);
            case 23:
                return new C0368m((C3927e) this.f1031j, (C1739c) this.f1032k, (C1739c) this.f1033l, interfaceC5557c, 23);
            default:
                return new C0368m((C3971c) this.f1033l, interfaceC5557c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1029h) {
        }
        return ((C0368m) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x006f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:401:0x0013 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x06f5, code lost:
    
        if (p116i.C1739c.m4359c(r0, r2, r1, null, r17, 12) != r9) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x078f, code lost:
    
        if (r2 == r9) goto L393;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[Catch: all -> 0x0025, TryCatch #3 {all -> 0x0025, blocks: (B:8:0x001f, B:18:0x0049, B:20:0x0051, B:21:0x005e, B:28:0x006e, B:15:0x003b, B:30:0x0071, B:32:0x0076, B:33:0x0077, B:14:0x0036, B:22:0x005f, B:24:0x0065), top: B:401:0x0013, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x078a  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v100, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v101, types: [sg.g] */
    /* JADX WARN: Type inference failed for: r2v104 */
    /* JADX WARN: Type inference failed for: r2v105 */
    /* JADX WARN: Type inference failed for: r2v97, types: [sg.g] */
    /* JADX WARN: Type inference failed for: r2v99, types: [sg.c] */
    /* JADX WARN: Type inference failed for: r6v13, types: [qg.a, sg.o] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0045 -> B:18:0x0049). Please report as a decompilation issue!!! */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1557w0 c1557w0;
        Object objM7512o;
        Object objM7570x;
        Object objM7570x2;
        InterfaceC1809a1 interfaceC1809a1;
        Object objM7570x3;
        InterfaceC1809a1 interfaceC1809a12;
        Object objM7570x4;
        Object objM7570x5;
        InterfaceC1809a1 interfaceC1809a13;
        C3970b c3970b;
        Object objM8185b;
        boolean z9;
        int i9 = 3;
        ?? r2 = 1065353216;
        int i10 = 0;
        int i11 = 2;
        int i12 = 1;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        switch (this.f1029h) {
            case 0:
                C3967n c3967n = C3967n.f12976a;
                C0369n c0369n = (C0369n) this.f1032k;
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                int i13 = this.f1030i;
                try {
                } catch (Throwable th2) {
                    C1557w0 c1557w02 = c0369n.f1039y;
                    if (c1557w02 == null) {
                        throw th2;
                    }
                    this.f1031j = th2;
                    this.f1030i = 4;
                    c1557w02.invoke(this);
                    if (c3967n != enumC5799a) {
                        throw th2;
                    }
                }
                if (i13 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C1555v0 c1555v0 = c0369n.f1038x;
                    if (c1555v0 != null) {
                        this.f1030i = 1;
                        if (c1555v0.invoke(this) == enumC5799a) {
                        }
                        return enumC5799a;
                    }
                } else {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            AbstractC1089i.m2732I0(obj);
                            c1557w0 = c0369n.f1039y;
                            if (c1557w0 != null) {
                                this.f1030i = 3;
                                c1557w0.invoke(this);
                                break;
                            }
                            return c3967n;
                        }
                        if (i13 == 3) {
                            AbstractC1089i.m2732I0(obj);
                            return c3967n;
                        }
                        if (i13 != 4) {
                            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th3 = (Throwable) this.f1031j;
                        AbstractC1089i.m2732I0(obj);
                        throw th3;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                InterfaceC0648e interfaceC0648e = (InterfaceC0648e) this.f1033l;
                this.f1030i = 2;
                if (interfaceC0648e.mo716a(c0369n, this) != enumC5799a) {
                    c1557w0 = c0369n.f1039y;
                    if (c1557w0 != null) {
                    }
                    return c3967n;
                }
                return enumC5799a;
            case 1:
                C3967n c3967n2 = C3967n.f12976a;
                EnumC5799a enumC5799a2 = EnumC5799a.f23547g;
                int i14 = this.f1030i;
                if (i14 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C0581f c0581f = (C0581f) this.f1031j;
                    C0586h0 c0586h0 = (C0586h0) this.f1032k;
                    long j3 = ((C3914t) this.f1033l).f12836c;
                    this.f1030i = 1;
                    C0581f c0581f2 = new C0581f(c0581f.f1807k, this);
                    c0581f2.f1805i = c0586h0;
                    c0581f2.f1806j = j3;
                    if (c0581f2.invokeSuspend(c3967n2) == enumC5799a2) {
                        return enumC5799a2;
                    }
                } else {
                    if (i14 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                return c3967n2;
            case 2:
                C0591k c0591k = (C0591k) this.f1032k;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f1031j;
                EnumC5799a enumC5799a3 = EnumC5799a.f23547g;
                int i15 = this.f1030i;
                if (i15 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    if (AbstractC3603v.m7562p(interfaceC3599t.mo4457n())) {
                        C3560e1 c3560e1 = c0591k.f1844B;
                        if (c3560e1 != null) {
                            this.f1031j = null;
                            this.f1030i = 1;
                            if (c3560e1.mo7488g(this) != enumC5799a3) {
                            }
                            return enumC5799a3;
                        }
                        C1739c c1739c = c0591k.f1843A;
                        Float f3 = new Float(((C1422r) this.f1033l).f4735g);
                        C1768l1 c1768l1M4380p = AbstractC1742d.m4380p(120, 2, AbstractC1801x.f6011b);
                        this.f1031j = null;
                        this.f1030i = 2;
                        break;
                    }
                    return C3967n.f12976a;
                }
                if (i15 != 1) {
                    if (i15 == 2) {
                        AbstractC1089i.m2732I0(obj);
                        return C3967n.f12976a;
                    }
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1089i.m2732I0(obj);
                C1739c c1739c2 = c0591k.f1843A;
                Float f32 = new Float(((C1422r) this.f1033l).f4735g);
                C1768l1 c1768l1M4380p2 = AbstractC1742d.m4380p(120, 2, AbstractC1801x.f6011b);
                this.f1031j = null;
                this.f1030i = 2;
                break;
                break;
            case 3:
                C1765k1 c1765k1 = (C1765k1) this.f1032k;
                EnumC5799a enumC5799a4 = EnumC5799a.f23547g;
                int i16 = this.f1030i;
                if (i16 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C1865o1 c1865o1 = (C1865o1) this.f1031j;
                    C2571a c2571aM4616B = AbstractC1874r.m4616B(new C0655c0(c1765k1, i11));
                    C1492w c1492w = new C1492w(c1865o1, c1765k1, (InterfaceC1809a1) this.f1033l, i10);
                    this.f1030i = 1;
                    if (c2571aM4616B.mo6025b(c1492w, this) == enumC5799a4) {
                        return enumC5799a4;
                    }
                } else {
                    if (i16 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                return C3967n.f12976a;
            case 4:
                EnumC5799a enumC5799a5 = EnumC5799a.f23547g;
                int i17 = this.f1030i;
                if (i17 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    InterfaceC3599t interfaceC3599t2 = (InterfaceC3599t) this.f1031j;
                    C2571a c2571aM4616B2 = AbstractC1874r.m4616B(new C1525i0((InterfaceC1854l2) this.f1032k, 1));
                    C1534l0 c1534l0 = new C1534l0((C1739c) this.f1033l, i10, interfaceC3599t2);
                    this.f1030i = 1;
                    if (c2571aM4616B2.mo6025b(c1534l0, this) == enumC5799a5) {
                        return enumC5799a5;
                    }
                } else {
                    if (i17 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                return C3967n.f12976a;
            case 5:
                EnumC5799a enumC5799a6 = EnumC5799a.f23547g;
                int i18 = this.f1030i;
                if (i18 != 0) {
                    if (i18 == 1) {
                        AbstractC1089i.m2732I0(obj);
                        return C3967n.f12976a;
                    }
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1089i.m2732I0(obj);
                InterfaceC3599t interfaceC3599t3 = (InterfaceC3599t) this.f1031j;
                C1894x1 c1894x1 = (C1894x1) this.f1032k;
                C1819d c1819d = (C1819d) this.f1033l;
                this.f1030i = 1;
                c1894x1.mo734b(interfaceC3599t3, c1819d, this);
                return enumC5799a6;
            case 6:
                EnumC5799a enumC5799a7 = EnumC5799a.f23547g;
                int i19 = this.f1030i;
                if (i19 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    InterfaceC3599t interfaceC3599t4 = (InterfaceC3599t) this.f1031j;
                    InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f1032k;
                    C1865o1 c1865o12 = new C1865o1((InterfaceC1809a1) this.f1033l, interfaceC3599t4.mo4457n());
                    this.f1030i = 1;
                    if (interfaceC1235p.invoke(c1865o12, this) == enumC5799a7) {
                        return enumC5799a7;
                    }
                } else {
                    if (i19 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                return C3967n.f12976a;
            case 7:
                EnumC5799a enumC5799a8 = EnumC5799a.f23547g;
                int i20 = this.f1030i;
                if (i20 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C2857k c2857k = (C2857k) this.f1031j;
                    C2858l c2858l = (C2858l) this.f1032k;
                    this.f1030i = 1;
                    if (c2857k.m6281a(c2858l, this) == enumC5799a8) {
                        return enumC5799a8;
                    }
                } else {
                    if (i20 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                InterfaceC3556d0 interfaceC3556d0 = (InterfaceC3556d0) this.f1033l;
                if (interfaceC3556d0 != null) {
                    interfaceC3556d0.mo7492a();
                }
                return C3967n.f12976a;
            case 8:
                EnumC5799a enumC5799a9 = EnumC5799a.f23547g;
                int i21 = this.f1030i;
                if (i21 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C2857k c2857k2 = (C2857k) this.f1031j;
                    InterfaceC2856j interfaceC2856j = (InterfaceC2856j) this.f1032k;
                    this.f1030i = 1;
                    if (c2857k2.m6281a(interfaceC2856j, this) == enumC5799a9) {
                        return enumC5799a9;
                    }
                } else {
                    if (i21 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                InterfaceC3556d0 interfaceC3556d02 = (InterfaceC3556d0) this.f1033l;
                if (interfaceC3556d02 != null) {
                    interfaceC3556d02.mo7492a();
                }
                return C3967n.f12976a;
            case 9:
                C1845j1 c1845j1 = ((C2646r) this.f1032k).f8641d;
                EnumC5799a enumC5799a10 = EnumC5799a.f23547g;
                int i22 = this.f1030i;
                try {
                    if (i22 == 0) {
                        AbstractC1089i.m2732I0(obj);
                        InterfaceC2660u1 interfaceC2660u1 = (InterfaceC2660u1) this.f1031j;
                        c1845j1.setValue(Boolean.TRUE);
                        InterfaceC1235p interfaceC1235p2 = (InterfaceC1235p) this.f1033l;
                        this.f1030i = 1;
                        if (interfaceC1235p2.invoke(interfaceC2660u1, this) == enumC5799a10) {
                            return enumC5799a10;
                        }
                    } else {
                        if (i22 != 1) {
                            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC1089i.m2732I0(obj);
                    }
                    c1845j1.setValue(Boolean.FALSE);
                    return C3967n.f12976a;
                } catch (Throwable th4) {
                    c1845j1.setValue(Boolean.FALSE);
                    throw th4;
                }
            case 10:
                EnumC5799a enumC5799a11 = EnumC5799a.f23547g;
                int i23 = this.f1030i;
                if (i23 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C2646r c2646r = (C2646r) this.f1031j;
                    C2176h1 c2176h1 = c2646r.f8640c;
                    C2642q c2642q = c2646r.f8639b;
                    EnumC2164d1 enumC2164d1 = (EnumC2164d1) this.f1032k;
                    C0368m c0368m = new C0368m(c2646r, (InterfaceC1235p) this.f1033l, z10 ? 1 : 0, 9);
                    this.f1030i = 1;
                    c2176h1.getClass();
                    if (AbstractC3603v.m7551e(new C2173g1(enumC2164d1, c2176h1, c0368m, c2642q, null), this) == enumC5799a11) {
                        return enumC5799a11;
                    }
                } else {
                    if (i23 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                return C3967n.f12976a;
            case 11:
                EnumC5799a enumC5799a12 = EnumC5799a.f23547g;
                int i24 = this.f1030i;
                if (i24 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C2626m c2626m = (C2626m) this.f1031j;
                    C2635o0 c2635o0 = (C2635o0) this.f1032k;
                    C2576b c2576b = new C2576b(c2626m, i12, (C2655t0) this.f1033l);
                    this.f1030i = 1;
                    if (c2635o0.invoke(c2576b, this) == enumC5799a12) {
                        return enumC5799a12;
                    }
                } else {
                    if (i24 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                return C3967n.f12976a;
            case 12:
                C2655t0 c2655t0 = (C2655t0) this.f1032k;
                EnumC5799a enumC5799a13 = EnumC5799a.f23547g;
                int i25 = this.f1030i;
                if (i25 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    InterfaceC3599t interfaceC3599t5 = (InterfaceC3599t) this.f1031j;
                    InterfaceC1236q interfaceC1236q = c2655t0.f8667S;
                    long jM8548f = C4247q.m8548f(((C2572a0) this.f1033l).f8340a, 1.0f);
                    EnumC2640p1 enumC2640p1 = c2655t0.f8665Q;
                    C2647r0 c2647r0 = AbstractC2651s0.f8654a;
                    Float f10 = new Float(enumC2640p1 == EnumC2640p1.f8622g ? C4247q.m8545c(jM8548f) : C4247q.m8544b(jM8548f));
                    this.f1030i = 1;
                    if (interfaceC1236q.mo734b(interfaceC3599t5, f10, this) == enumC5799a13) {
                        return enumC5799a13;
                    }
                } else {
                    if (i25 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                return C3967n.f12976a;
            case 13:
                EnumC5799a enumC5799a14 = EnumC5799a.f23547g;
                int i26 = this.f1030i;
                if (i26 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C2629m2 c2629m2 = (C2629m2) this.f1031j;
                    C2635o0 c2635o02 = (C2635o0) this.f1032k;
                    C2576b c2576b2 = new C2576b(c2629m2, i11, (C2637o2) this.f1033l);
                    this.f1030i = 1;
                    if (c2635o02.invoke(c2576b2, this) == enumC5799a14) {
                        return enumC5799a14;
                    }
                } else {
                    if (i26 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                return C3967n.f12976a;
            case 14:
                EnumC5799a enumC5799a15 = EnumC5799a.f23547g;
                int i27 = this.f1030i;
                if (i27 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    InterfaceC2660u1 interfaceC2660u12 = (InterfaceC2660u1) this.f1031j;
                    C2637o2 c2637o2 = (C2637o2) this.f1032k;
                    c2637o2.f8598k = interfaceC2660u12;
                    InterfaceC1235p interfaceC1235p3 = (InterfaceC1235p) this.f1033l;
                    C2629m2 c2629m22 = c2637o2.f8599l;
                    this.f1030i = 1;
                    if (interfaceC1235p3.invoke(c2629m22, this) == enumC5799a15) {
                        return enumC5799a15;
                    }
                } else {
                    if (i27 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                return C3967n.f12976a;
            case 15:
                C3967n c3967n3 = C3967n.f12976a;
                EnumC5799a enumC5799a16 = EnumC5799a.f23547g;
                int i28 = this.f1030i;
                if (i28 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C4594e1 c4594e1 = (C4594e1) this.f1031j;
                    C2656t1 c2656t1 = (C2656t1) this.f1032k;
                    long j4 = ((C3914t) this.f1033l).f12836c;
                    this.f1030i = 1;
                    C4594e1 c4594e12 = new C4594e1(c4594e1.f15143k, c4594e1.f15144l, this);
                    c4594e12.f15141i = c2656t1;
                    c4594e12.f15142j = j4;
                    if (c4594e12.invokeSuspend(c3967n3) == enumC5799a16) {
                        return enumC5799a16;
                    }
                } else {
                    if (i28 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                return c3967n3;
            case 16:
                C3967n c3967n4 = C3967n.f12976a;
                C4076h c4076h = (C4076h) this.f1031j;
                EnumC5799a enumC5799a17 = EnumC5799a.f23547g;
                int i29 = this.f1030i;
                if (i29 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C2618k c2618k = c4076h.f13513u;
                    C4074f c4074f = new C4074f(c4076h, (AbstractC5614i1) this.f1032k, (C0372b) this.f1033l);
                    this.f1030i = 1;
                    c2618k.getClass();
                    C0808c c0808c = (C0808c) c4074f.invoke();
                    if (c0808c == null || C2618k.m6072m1(c2618k, c0808c, 0L, 0L, 3)) {
                        objM7512o = c3967n4;
                        if (objM7512o == enumC5799a17) {
                            return enumC5799a17;
                        }
                    } else {
                        C3564g c3564g = new C3564g(1, AbstractC1184v0.m3214x(this));
                        c3564g.m7513p();
                        C2610i c2610i = new C2610i(c4074f, c3564g);
                        C2581c c2581c = c2618k.f8520y;
                        C2046b c2046b = c2581c.f8371a;
                        C0808c c0808c2 = (C0808c) c4074f.invoke();
                        if (c0808c2 == null) {
                            c3564g.resumeWith(c3967n4);
                        } else {
                            c3564g.m7515r(new C2576b(c2581c, i10, c2610i));
                            C2564d c2564dM7910r0 = AbstractC3754e0.m7910r0(0, c2046b.f6893i);
                            int i30 = c2564dM7910r0.f8312g;
                            int i31 = c2564dM7910r0.f8313h;
                            if (i30 <= i31) {
                                while (true) {
                                    C0808c c0808c3 = (C0808c) ((C2610i) c2046b.f6891g[i31]).f8467a.invoke();
                                    if (c0808c3 != null) {
                                        C0808c c0808cM2049e = c0808c2.m2049e(c0808c3);
                                        if (c0808cM2049e.equals(c0808c2)) {
                                            c2046b.m5055a(i31 + 1, c2610i);
                                        } else if (!c0808cM2049e.equals(c0808c3)) {
                                            CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                            int i32 = c2046b.f6893i - 1;
                                            if (i32 <= i31) {
                                                while (true) {
                                                    ((C2610i) c2046b.f6891g[i31]).f8468b.mo7500w(cancellationException);
                                                    if (i32 != i31) {
                                                        i32++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (i31 != i30) {
                                        i31--;
                                    }
                                }
                                c2046b.m5055a(0, c2610i);
                                if (!c2618k.f8515B) {
                                    c2618k.m6074n1(0L);
                                }
                            } else {
                                c2046b.m5055a(0, c2610i);
                                if (!c2618k.f8515B) {
                                }
                            }
                        }
                        objM7512o = c3564g.m7512o();
                        if (objM7512o != enumC5799a17) {
                        }
                        if (objM7512o == enumC5799a17) {
                        }
                    }
                } else {
                    if (i29 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                return c3967n4;
            case 17:
                C3967n c3967n5 = C3967n.f12976a;
                EnumC5799a enumC5799a18 = EnumC5799a.f23547g;
                int i33 = this.f1030i;
                if (i33 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    InterfaceC3599t interfaceC3599t6 = (InterfaceC3599t) this.f1031j;
                    InterfaceC4187e interfaceC4187e = (InterfaceC4187e) this.f1032k;
                    C4342g c4342g = (C4342g) this.f1033l;
                    InterfaceC5561g interfaceC5561g = c4342g.f14511g;
                    int i34 = c4342g.f14512h;
                    if (i34 == -3) {
                        i34 = -2;
                    }
                    EnumC3969a enumC3969a = c4342g.f14513i;
                    EnumC3601u enumC3601u = EnumC3601u.f11615i;
                    C0589j c0589j = new C0589j((Object) c4342g, (InterfaceC5557c) (z11 ? 1 : 0), 15);
                    C3971c c3971cM8218a = AbstractC3978j.m8218a(i34, 4, enumC3969a);
                    InterfaceC5561g interfaceC5561gM7554h = AbstractC3603v.m7554h(interfaceC3599t6.mo4457n(), interfaceC5561g, true);
                    C5808e c5808e = AbstractC3553c0.f11555a;
                    if (interfaceC5561gM7554h != c5808e && interfaceC5561gM7554h.mo2062s(C5558d.f22660g) == null) {
                        interfaceC5561gM7554h = interfaceC5561gM7554h.mo2059e(c5808e);
                    }
                    ?? c3983o = new C3983o(interfaceC5561gM7554h, c3971cM8218a);
                    c3983o.m7472c0(enumC3601u, c3983o, c0589j);
                    this.f1030i = 1;
                    Object objM8467e = AbstractC4201s.m8467e(interfaceC4187e, c3983o, true, this);
                    if (objM8467e != enumC5799a18) {
                        objM8467e = c3967n5;
                    }
                    if (objM8467e == enumC5799a18) {
                        return enumC5799a18;
                    }
                } else {
                    if (i33 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                return c3967n5;
            case 18:
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f1033l;
                EnumC5799a enumC5799a19 = EnumC5799a.f23547g;
                int i35 = this.f1030i;
                if (i35 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C5808e c5808e2 = AbstractC3553c0.f11555a;
                    ExecutorC5807d executorC5807d = ExecutorC5807d.f23583i;
                    C4639u0 c4639u0 = new C4639u0((InterfaceC1809a1) this.f1031j, (InterfaceC1809a1) this.f1032k, z12 ? 1 : 0, i11);
                    this.f1030i = 1;
                    objM7570x = AbstractC3603v.m7570x(executorC5807d, c4639u0, this);
                    if (objM7570x == enumC5799a19) {
                        return enumC5799a19;
                    }
                } else {
                    if (i35 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                    objM7570x = obj;
                }
                Object obj2 = ((C3960g) objM7570x).f12964g;
                if (!(obj2 instanceof C3959f)) {
                    C3147k c3147k = AbstractC4955ho.f17686a;
                    interfaceC1809a14.setValue((C5732y) obj2);
                }
                Throwable thM8182b = C3960g.m8182b(obj2);
                if (thM8182b != null) {
                    String message = thM8182b.getMessage();
                    if (message == null) {
                        message = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    C5732y c5732y = new C5732y("查询失败", message, false);
                    C3147k c3147k2 = AbstractC4955ho.f17686a;
                    interfaceC1809a14.setValue(c5732y);
                }
                return C3967n.f12976a;
            case 19:
                EnumC5799a enumC5799a20 = EnumC5799a.f23547g;
                int i36 = this.f1030i;
                if (i36 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f1033l;
                    C5292s0 c5292s0 = (C5292s0) this.f1032k;
                    String str = c5292s0.f20550a;
                    String str2 = c5292s0.f20553d;
                    String str3 = c5292s0.f20554e;
                    this.f1031j = interfaceC1809a15;
                    this.f1030i = 1;
                    C3147k c3147k3 = AbstractC4955ho.f17686a;
                    C5808e c5808e3 = AbstractC3553c0.f11555a;
                    objM7570x2 = AbstractC3603v.m7570x(ExecutorC5807d.f23583i, new C4639u0(str, str2, str3, null, 4), this);
                    if (objM7570x2 == enumC5799a20) {
                        return enumC5799a20;
                    }
                    interfaceC1809a1 = interfaceC1809a15;
                } else {
                    if (i36 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    interfaceC1809a1 = (InterfaceC1809a1) this.f1031j;
                    AbstractC1089i.m2732I0(obj);
                    objM7570x2 = obj;
                }
                C3147k c3147k4 = AbstractC4955ho.f17686a;
                interfaceC1809a1.setValue((C1003g) objM7570x2);
                return C3967n.f12976a;
            case 20:
                EnumC5799a enumC5799a21 = EnumC5799a.f23547g;
                int i37 = this.f1030i;
                if (i37 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C5523z2 c5523z2 = (C5523z2) this.f1032k;
                    if (c5523z2.f22314a.f7020b == 2) {
                        InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f1033l;
                        C5808e c5808e4 = AbstractC3553c0.f11555a;
                        ExecutorC5807d executorC5807d2 = ExecutorC5807d.f23583i;
                        C1538n c1538n = new C1538n(c5523z2, z13 ? 1 : 0, i11);
                        this.f1031j = interfaceC1809a16;
                        this.f1030i = 1;
                        objM7570x3 = AbstractC3603v.m7570x(executorC5807d2, c1538n, this);
                        if (objM7570x3 == enumC5799a21) {
                            return enumC5799a21;
                        }
                        interfaceC1809a12 = interfaceC1809a16;
                    }
                    return C3967n.f12976a;
                }
                if (i37 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC1809a12 = (InterfaceC1809a1) this.f1031j;
                AbstractC1089i.m2732I0(obj);
                objM7570x3 = obj;
                C3147k c3147k5 = AbstractC4955ho.f17686a;
                interfaceC1809a12.setValue((C1003g) objM7570x3);
                return C3967n.f12976a;
            case 21:
                C3967n c3967n6 = C3967n.f12976a;
                EnumC5799a enumC5799a22 = EnumC5799a.f23547g;
                int i38 = this.f1030i;
                if (i38 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C2098i c2098i = (C2098i) this.f1031j;
                    int i39 = c2098i.f7020b;
                    if (i39 == 2 || i39 == 4) {
                        C5808e c5808e5 = AbstractC3553c0.f11555a;
                        ExecutorC5807d executorC5807d3 = ExecutorC5807d.f23583i;
                        C1538n c1538n2 = new C1538n(c2098i, z14 ? 1 : 0, i9);
                        this.f1030i = 1;
                        objM7570x4 = AbstractC3603v.m7570x(executorC5807d3, c1538n2, this);
                        if (objM7570x4 == enumC5799a22) {
                            return enumC5799a22;
                        }
                    }
                    return c3967n6;
                }
                if (i38 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC1089i.m2732I0(obj);
                objM7570x4 = obj;
                C3958e c3958e = (C3958e) objM7570x4;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f1032k;
                String str4 = (String) c3958e.f12961g;
                C3147k c3147k6 = AbstractC4955ho.f17686a;
                interfaceC1809a17.setValue(str4);
                ((InterfaceC1809a1) this.f1033l).setValue((C1003g) c3958e.f12962h);
                return c3967n6;
            case 22:
                EnumC5799a enumC5799a23 = EnumC5799a.f23547g;
                int i40 = this.f1030i;
                if (i40 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f1033l;
                    C5026jv c5026jv = (C5026jv) this.f1032k;
                    String str5 = c5026jv.f18249a;
                    String str6 = c5026jv.f18252d;
                    String str7 = c5026jv.f18253e;
                    this.f1031j = interfaceC1809a18;
                    this.f1030i = 1;
                    C3147k c3147k7 = AbstractC4955ho.f17686a;
                    C5808e c5808e6 = AbstractC3553c0.f11555a;
                    objM7570x5 = AbstractC3603v.m7570x(ExecutorC5807d.f23583i, new C4639u0(str5, str6, str7, null, 4), this);
                    if (objM7570x5 == enumC5799a23) {
                        return enumC5799a23;
                    }
                    interfaceC1809a13 = interfaceC1809a18;
                } else {
                    if (i40 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    interfaceC1809a13 = (InterfaceC1809a1) this.f1031j;
                    AbstractC1089i.m2732I0(obj);
                    objM7570x5 = obj;
                }
                interfaceC1809a13.setValue((C1003g) objM7570x5);
                return C3967n.f12976a;
            case 23:
                EnumC5799a enumC5799a24 = EnumC5799a.f23547g;
                int i41 = this.f1030i;
                if (i41 == 0) {
                    AbstractC1089i.m2732I0(obj);
                } else if (i41 == 1) {
                    AbstractC1089i.m2732I0(obj);
                    C1739c c1739c3 = (C1739c) this.f1033l;
                    Float f11 = new Float(1.0f);
                    this.f1030i = 2;
                    if (c1739c3.m4361e(f11, this) == enumC5799a24) {
                        return enumC5799a24;
                    }
                } else {
                    if (i41 != 2) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                }
                return C3967n.f12976a;
            default:
                EnumC5799a enumC5799a25 = EnumC5799a.f23547g;
                int i42 = this.f1030i;
                try {
                    if (i42 == 0) {
                        AbstractC1089i.m2732I0(obj);
                        r2 = (C3971c) this.f1033l;
                        c3970b = new C3970b(r2);
                        this.f1031j = r2;
                        this.f1032k = c3970b;
                        this.f1030i = 1;
                        objM8185b = c3970b.m8185b(this);
                        r2 = r2;
                        if (objM8185b == enumC5799a25) {
                        }
                        if (((Boolean) objM8185b).booleanValue()) {
                        }
                    } else {
                        if (i42 != 1) {
                            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c3970b = (C3970b) this.f1032k;
                        InterfaceC3975g interfaceC3975g = (InterfaceC3975g) this.f1031j;
                        AbstractC1089i.m2732I0(obj);
                        objM8185b = obj;
                        r2 = interfaceC3975g;
                        if (((Boolean) objM8185b).booleanValue()) {
                            AbstractC5912n1.f23997b.set(false);
                            synchronized (AbstractC4662m.f15512c) {
                                C0945l0 c0945l0 = AbstractC4662m.f15519j.f15477h;
                                z9 = c0945l0 != null && c0945l0.m2335h();
                            }
                            if (z9) {
                                AbstractC4662m.m9120a();
                            }
                            this.f1031j = r2;
                            this.f1032k = c3970b;
                            this.f1030i = 1;
                            objM8185b = c3970b.m8185b(this);
                            r2 = r2;
                            if (objM8185b == enumC5799a25) {
                                return enumC5799a25;
                            }
                            if (((Boolean) objM8185b).booleanValue()) {
                                r2.mo8196a(null);
                                return C3967n.f12976a;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        CancellationException cancellationException2 = th5 instanceof CancellationException ? th5 : null;
                        if (cancellationException2 == null) {
                            cancellationException2 = new CancellationException("Channel was consumed, consumer had failed");
                            cancellationException2.initCause(th5);
                        }
                        r2.mo8196a(cancellationException2);
                        throw th6;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0368m(Object obj, Object obj2, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f1029h = i9;
        this.f1032k = obj;
        this.f1033l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0368m(C3971c c3971c, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f1029h = 24;
        this.f1033l = c3971c;
    }
}
