package p056e0;

import ac.C0058k;
import p000a.AbstractC0000a;
import p041d1.C0653b0;
import p057e1.C0807b;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p100h0.AbstractC1513e0;
import p100h0.C1545q0;
import p131j0.C2046b;
import p136j8.C2104o;
import p174m.AbstractC2615j0;
import p174m.AbstractC2677y2;
import p267s1.AbstractC3913s;
import p267s1.C3903k;
import p267s1.C3904k0;
import p267s1.C3914t;
import p267s1.EnumC3905l;
import p276sf.C3967n;
import p292u1.AbstractC4229a;
import p321w.InterfaceC4647y0;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p352xf.EnumC5799a;
import p356y0.AbstractC5852n;
import p357y1.InterfaceC5905l2;
import p370yf.AbstractC6043h;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: e0.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0803c extends AbstractC6043h implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2400g = 1;

    /* JADX INFO: renamed from: h */
    public int f2401h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f2402i;

    /* JADX INFO: renamed from: j */
    public Object f2403j;

    /* JADX INFO: renamed from: k */
    public Object f2404k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f2405l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0803c(C0058k c0058k, C1545q0 c1545q0, InterfaceC4647y0 interfaceC4647y0, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f2403j = c0058k;
        this.f2404k = c1545q0;
        this.f2405l = interfaceC4647y0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f2400g) {
            case 0:
                C0803c c0803c = new C0803c((C0804d) this.f2405l, interfaceC5557c);
                c0803c.f2402i = obj;
                return c0803c;
            default:
                C0803c c0803c2 = new C0803c((C0058k) this.f2403j, (C1545q0) this.f2404k, (InterfaceC4647y0) this.f2405l, interfaceC5557c);
                c0803c2.f2402i = obj;
                return c0803c2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        C3904k0 c3904k0 = (C3904k0) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f2400g) {
        }
        return ((C0803c) create(c3904k0, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0318, code lost:
    
        if (r6 != r8) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0295, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        if (r10 == r9) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0141, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b1, code lost:
    
        if (r12 == r9) goto L60;
     */
    /* JADX WARN: Path cross not found for [B:75:0x0194, B:70:0x0173], limit reached: 235 */
    /* JADX WARN: Path cross not found for [B:78:0x0199, B:81:0x019f], limit reached: 235 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARN: Type inference failed for: r11v26, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v31, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:181:0x0318 -> B:183:0x031c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x01b1 -> B:86:0x01b4). Please report as a decompilation issue!!! */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C3904k0 c3904k0;
        Object objM6116a;
        C3914t c3914t;
        boolean z9;
        C3904k0 c3904k02;
        EnumC3905l enumC3905l;
        EnumC5799a enumC5799a;
        Object objM8102e;
        EnumC5799a enumC5799a2;
        Object obj2;
        C3914t c3914t2;
        C3904k0 c3904k03;
        Object obj3;
        Object objM8102e2;
        Object obj4;
        C3904k0 c3904k04;
        Object objM63f;
        boolean zM4035a;
        switch (this.f2400g) {
            case 0:
                C0804d c0804d = (C0804d) this.f2405l;
                int i9 = this.f2401h;
                EnumC3905l enumC3905l2 = EnumC3905l.f12812g;
                int i10 = 2;
                EnumC5799a enumC5799a3 = EnumC5799a.f23547g;
                if (i9 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    c3904k0 = (C3904k0) this.f2402i;
                    this.f2402i = c3904k0;
                    this.f2401h = 1;
                    objM6116a = AbstractC2677y2.m6116a(c3904k0, true, enumC3905l2, this);
                } else if (i9 == 1) {
                    c3904k0 = (C3904k0) this.f2402i;
                    AbstractC1089i.m2732I0(obj);
                    objM6116a = obj;
                } else if (i9 == 2) {
                    enumC3905l = (EnumC3905l) this.f2404k;
                    c3914t = (C3914t) this.f2403j;
                    c3904k02 = (C3904k0) this.f2402i;
                    AbstractC1089i.m2732I0(obj);
                    objM8102e = obj;
                    C3903k c3903k = (C3903k) objM8102e;
                    ?? r13 = c3903k.f12800a;
                    int size = r13.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            obj2 = r13.get(i11);
                            C3914t c3914t3 = (C3914t) obj2;
                            enumC5799a2 = enumC5799a3;
                            if (c3914t3.m8119b() || !AbstractC3913s.m8112e(c3914t3.f12834a, c3914t.f12834a) || !c3914t3.f12837d) {
                                i11++;
                                enumC5799a3 = enumC5799a2;
                            }
                        } else {
                            enumC5799a2 = enumC5799a3;
                            obj2 = null;
                        }
                    }
                    C3914t c3914t4 = (C3914t) obj2;
                    if (c3914t4 == null || c3914t4.f12835b - c3914t.f12835b >= c3904k02.m8099B().mo10226b() || c3903k.f12802c == 2) {
                        c3914t4 = null;
                    } else if (C0807b.m2040c(C0807b.m2041d(c3914t4.f12836c, c3914t.f12836c)) <= c3904k02.m8099B().mo10619c()) {
                        i10 = 2;
                        enumC5799a3 = enumC5799a2;
                        this.f2402i = c3904k02;
                        this.f2403j = c3914t;
                        this.f2404k = enumC3905l;
                        this.f2401h = i10;
                        objM8102e = c3904k02.m8102e(enumC3905l, this);
                    }
                    if (c3914t4 != null) {
                        if (!c0804d.f2407x) {
                            AbstractC5852n abstractC5852nM10149e = c0804d.f23788g;
                            C2046b c2046b = null;
                            while (true) {
                                if (abstractC5852nM10149e == null) {
                                    if (!c0804d.f23788g.f23801t) {
                                        AbstractC4229a.m8494b("visitChildren called on an unattached node");
                                    }
                                    C2046b c2046b2 = new C2046b(new AbstractC5852n[16]);
                                    AbstractC5852n abstractC5852n = c0804d.f23788g;
                                    AbstractC5852n abstractC5852n2 = abstractC5852n.f23793l;
                                    if (abstractC5852n2 == null) {
                                        AbstractC5618k.m10146b(c2046b2, abstractC5852n);
                                    } else {
                                        c2046b2.m5056b(abstractC5852n2);
                                    }
                                    while (true) {
                                        int i12 = c2046b2.f6893i;
                                        if (i12 != 0) {
                                            AbstractC5852n abstractC5852nM10149e2 = (AbstractC5852n) c2046b2.m5065k(i12 - 1);
                                            if ((abstractC5852nM10149e2.f23791j & 1024) == 0) {
                                                AbstractC5618k.m10146b(c2046b2, abstractC5852nM10149e2);
                                            } else {
                                                while (true) {
                                                    if (abstractC5852nM10149e2 == null) {
                                                    }
                                                    if ((abstractC5852nM10149e2.f23790i & 1024) != 0) {
                                                        C2046b c2046b3 = null;
                                                        while (abstractC5852nM10149e2 != null) {
                                                            if (abstractC5852nM10149e2 instanceof C0653b0) {
                                                                ((C0653b0) abstractC5852nM10149e2).m1805r1(7);
                                                            } else {
                                                                if ((abstractC5852nM10149e2.f23790i & 1024) != 0 && (abstractC5852nM10149e2 instanceof AbstractC5615j)) {
                                                                    int i13 = 0;
                                                                    for (AbstractC5852n abstractC5852n3 = ((AbstractC5615j) abstractC5852nM10149e2).f22875v; abstractC5852n3 != null; abstractC5852n3 = abstractC5852n3.f23793l) {
                                                                        if ((abstractC5852n3.f23790i & 1024) != 0) {
                                                                            i13++;
                                                                            if (i13 == 1) {
                                                                                abstractC5852nM10149e2 = abstractC5852n3;
                                                                            } else {
                                                                                if (c2046b3 == null) {
                                                                                    c2046b3 = new C2046b(new AbstractC5852n[16]);
                                                                                }
                                                                                if (abstractC5852nM10149e2 != null) {
                                                                                    c2046b3.m5056b(abstractC5852nM10149e2);
                                                                                    abstractC5852nM10149e2 = null;
                                                                                }
                                                                                c2046b3.m5056b(abstractC5852n3);
                                                                            }
                                                                        }
                                                                    }
                                                                    if (i13 == 1) {
                                                                    }
                                                                }
                                                                abstractC5852nM10149e2 = AbstractC5618k.m10149e(c2046b3);
                                                            }
                                                        }
                                                    } else {
                                                        abstractC5852nM10149e2 = abstractC5852nM10149e2.f23793l;
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                    }
                                } else if (abstractC5852nM10149e instanceof C0653b0) {
                                    ((C0653b0) abstractC5852nM10149e).m1805r1(7);
                                } else {
                                    if ((abstractC5852nM10149e.f23790i & 1024) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                        int i14 = 0;
                                        for (AbstractC5852n abstractC5852n4 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n4 != null; abstractC5852n4 = abstractC5852n4.f23793l) {
                                            if ((abstractC5852n4.f23790i & 1024) != 0) {
                                                i14++;
                                                if (i14 == 1) {
                                                    abstractC5852nM10149e = abstractC5852n4;
                                                } else {
                                                    if (c2046b == null) {
                                                        c2046b = new C2046b(new AbstractC5852n[16]);
                                                    }
                                                    if (abstractC5852nM10149e != null) {
                                                        c2046b.m5056b(abstractC5852nM10149e);
                                                        abstractC5852nM10149e = null;
                                                    }
                                                    c2046b.m5056b(abstractC5852n4);
                                                }
                                            }
                                        }
                                        if (i14 == 1) {
                                        }
                                    }
                                    abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b);
                                }
                            }
                        }
                        c0804d.f2406w.invoke();
                        c3914t4.m8118a();
                        c3914t2 = c3914t;
                        c3904k03 = c3904k02;
                        this.f2402i = c3904k03;
                        this.f2403j = c3914t2;
                        obj3 = null;
                        this.f2404k = null;
                        this.f2401h = 3;
                        objM8102e2 = c3904k03.m8102e(enumC3905l2, this);
                        enumC5799a = enumC5799a2;
                    }
                } else if (i9 == 3) {
                    c3914t2 = (C3914t) this.f2403j;
                    c3904k03 = (C3904k0) this.f2402i;
                    AbstractC1089i.m2732I0(obj);
                    objM8102e2 = obj;
                    enumC5799a = enumC5799a3;
                    obj3 = null;
                    ?? r62 = ((C3903k) objM8102e2).f12800a;
                    int size2 = r62.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 < size2) {
                            obj4 = r62.get(i15);
                            C3914t c3914t5 = (C3914t) obj4;
                            if (c3914t5.m8119b() || !AbstractC3913s.m8112e(c3914t5.f12834a, c3914t2.f12834a) || !c3914t5.f12837d) {
                                i15++;
                            }
                        } else {
                            obj4 = obj3;
                        }
                    }
                    C3914t c3914t6 = (C3914t) obj4;
                    if (c3914t6 != null) {
                        c3914t6.m8118a();
                        enumC5799a2 = enumC5799a;
                        this.f2402i = c3904k03;
                        this.f2403j = c3914t2;
                        obj3 = null;
                        this.f2404k = null;
                        this.f2401h = 3;
                        objM8102e2 = c3904k03.m8102e(enumC3905l2, this);
                        enumC5799a = enumC5799a2;
                    }
                } else {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                }
                c3914t = (C3914t) objM6116a;
                int i16 = c3914t.f12842i;
                long j3 = c3914t.f12836c;
                if (i16 == 3 || i16 == 4) {
                    int i17 = (int) (j3 >> 32);
                    if (Float.intBitsToFloat(i17) >= 0.0f && Float.intBitsToFloat(i17) < ((int) (c3904k0.f12811l.f12820E >> 32))) {
                        int i18 = (int) (j3 & 4294967295L);
                        if (Float.intBitsToFloat(i18) >= 0.0f && Float.intBitsToFloat(i18) < ((int) (4294967295L & c3904k0.f12811l.f12820E))) {
                            z9 = true;
                        }
                        EnumC3905l enumC3905l3 = (!c0804d.f2407x || z9) ? enumC3905l2 : EnumC3905l.f12813h;
                        c3904k02 = c3904k0;
                        enumC3905l = enumC3905l3;
                        this.f2402i = c3904k02;
                        this.f2403j = c3914t;
                        this.f2404k = enumC3905l;
                        this.f2401h = i10;
                        objM8102e = c3904k02.m8102e(enumC3905l, this);
                    }
                    z9 = false;
                    EnumC3905l enumC3905l32 = (!c0804d.f2407x || z9) ? enumC3905l2 : EnumC3905l.f12813h;
                    c3904k02 = c3904k0;
                    enumC3905l = enumC3905l32;
                    this.f2402i = c3904k02;
                    this.f2403j = c3914t;
                    this.f2404k = enumC3905l;
                    this.f2401h = i10;
                    objM8102e = c3904k02.m8102e(enumC3905l, this);
                }
                break;
            default:
                C0058k c0058k = (C0058k) this.f2403j;
                int i19 = this.f2401h;
                EnumC5799a enumC5799a4 = EnumC5799a.f23547g;
                if (i19 != 0) {
                    if (i19 == 1) {
                        c3904k04 = (C3904k0) this.f2402i;
                        AbstractC1089i.m2732I0(obj);
                        objM63f = obj;
                    } else if (i19 == 2 || i19 == 3 || i19 == 4) {
                        AbstractC1089i.m2732I0(obj);
                    } else {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    AbstractC1089i.m2732I0(obj);
                    c3904k04 = (C3904k0) this.f2402i;
                    this.f2402i = c3904k04;
                    this.f2401h = 1;
                    objM63f = AbstractC0000a.m63f(c3904k04, this);
                    if (objM63f == enumC5799a4) {
                    }
                }
                C3903k c3903k2 = (C3903k) objM63f;
                InterfaceC5905l2 interfaceC5905l2 = (InterfaceC5905l2) c0058k.f177i;
                C3914t c3914t7 = (C3914t) c0058k.f178j;
                C3914t c3914t8 = (C3914t) c3903k2.f12800a.get(0);
                if (c3914t7 == null || c3914t8.f12835b - c3914t7.f12835b >= interfaceC5905l2.mo10225a()) {
                    c0058k.f176h = 1;
                    c0058k.f178j = c3914t8;
                    zM4035a = AbstractC1513e0.m4035a(c3903k2);
                    if (!zM4035a && (c3903k2.f12803d & 33) != 0) {
                        ?? r11 = c3903k2.f12800a;
                        int size3 = r11.size();
                        for (int i20 = 0; i20 < size3; i20++) {
                            if (((C3914t) r11.get(i20)).m8119b()) {
                                if (!zM4035a) {
                                }
                            }
                        }
                        C1545q0 c1545q0 = (C1545q0) this.f2404k;
                        this.f2402i = null;
                        this.f2401h = 2;
                        if (AbstractC0000a.m3B0(c3904k04, c1545q0, c0058k, c3903k2, this) == enumC5799a4) {
                        }
                    } else if (!zM4035a) {
                        int i21 = c0058k.f176h;
                        InterfaceC4647y0 interfaceC4647y0 = (InterfaceC4647y0) this.f2405l;
                        if (i21 == 1) {
                            this.f2402i = null;
                            this.f2401h = 3;
                            if (AbstractC0000a.m38T0(c3904k04, interfaceC4647y0, c3903k2, this) == enumC5799a4) {
                            }
                        } else {
                            this.f2402i = null;
                            this.f2401h = 4;
                            if (AbstractC0000a.m68i(c3904k04, interfaceC4647y0, c3903k2, i21, this) == enumC5799a4) {
                            }
                        }
                    }
                } else {
                    if (C0807b.m2040c(C0807b.m2041d(c3914t7.f12836c, c3914t8.f12836c)) < AbstractC2615j0.m6069f(interfaceC5905l2, c3914t7.f12842i)) {
                        c0058k.f176h++;
                    }
                    c0058k.f178j = c3914t8;
                    zM4035a = AbstractC1513e0.m4035a(c3903k2);
                    if (!zM4035a) {
                        if (!zM4035a) {
                        }
                    }
                }
                break;
        }
        return C3967n.f12976a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0803c(C0804d c0804d, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f2405l = c0804d;
    }
}
