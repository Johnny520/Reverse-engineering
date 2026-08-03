package tg;

import ci.C0579e;
import ci.C0587i;
import gg.C1425u;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p100h0.C1534l0;
import p136j8.C2104o;
import p162l3.C2463q;
import p174m.C2571a;
import p227p4.C3315t;
import p249qg.AbstractC3546a;
import p249qg.AbstractC3553c0;
import p249qg.AbstractC3603v;
import p249qg.C3560e1;
import p249qg.C3612z0;
import p249qg.EnumC3601u;
import p276sf.C3967n;
import p348xb.C5761g;
import p352xf.EnumC5799a;
import p353xg.C5808e;
import p370yf.AbstractC6038c;
import p370yf.AbstractC6044i;
import sg.C3970b;
import sg.C3974f;
import sg.C3983o;
import sg.EnumC3969a;
import sg.InterfaceC3975g;
import ug.AbstractC4338c;
import ug.C4336a;
import vg.C4554c;
import wf.C5558d;
import wf.C5562h;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: tg.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4201s {

    /* JADX INFO: renamed from: a */
    public static final C2463q f13788a = new C2463q("NO_VALUE", 1);

    /* JADX INFO: renamed from: b */
    public static final C2463q f13789b = new C2463q("NONE", 1);

    /* JADX INFO: renamed from: c */
    public static final C2463q f13790c = new C2463q("PENDING", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C4200r m8463a(int i9, EnumC3969a enumC3969a) {
        int i10 = (i9 & 1) != 0 ? 0 : 1;
        int i11 = (i9 & 2) == 0 ? 16 : 0;
        if (i10 <= 0 && i11 <= 0 && enumC3969a != EnumC3969a.f12979g) {
            C2104o.m5300z(enumC3969a, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i12 = i11 + i10;
        if (i12 < 0) {
            i12 = Integer.MAX_VALUE;
        }
        return new C4200r(i10, i12, enumC3969a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final C4183b0 m8464b(Object obj) {
        if (obj == null) {
            obj = AbstractC4338c.f14500b;
        }
        return new C4183b0(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m8465c(Object[] objArr, long j3, Object obj) {
        objArr[((int) j3) & (objArr.length - 1)] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final InterfaceC4186d m8466d(InterfaceC4186d interfaceC4186d) {
        return ((interfaceC4186d instanceof InterfaceC4208z) || (interfaceC4186d instanceof C4184c)) ? interfaceC4186d : new C4184c(interfaceC4186d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:47:0x0021 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        if (r1.mo1602e(r10, r0) == r5) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:24:0x0051, B:28:0x0066, B:30:0x006e, B:20:0x0046, B:23:0x004d), top: B:47:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [sg.o] */
    /* JADX WARN: Type inference failed for: r8v1, types: [sg.g] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [sg.g] */
    /* JADX WARN: Type inference failed for: r8v3, types: [sg.g] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0080 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8467e(InterfaceC4187e interfaceC4187e, C3983o c3983o, boolean z9, AbstractC6038c abstractC6038c) {
        C4188f c4188f;
        C3970b it;
        ?? r82;
        C3970b c3970b;
        InterfaceC4187e interfaceC4187e2;
        Object objM8185b;
        if (abstractC6038c instanceof C4188f) {
            c4188f = (C4188f) abstractC6038c;
            int i9 = c4188f.f13742l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c4188f.f13742l = i9 - Integer.MIN_VALUE;
            } else {
                c4188f = new C4188f(abstractC6038c);
            }
        }
        Object obj = c4188f.f13741k;
        int i10 = c4188f.f13742l;
        CancellationException cancellationException = null;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        try {
            if (i10 == 0) {
                AbstractC1089i.m2732I0(obj);
                it = c3983o.iterator();
                c3983o = c3983o;
                c4188f.f13737g = interfaceC4187e;
                c4188f.f13738h = c3983o;
                c4188f.f13739i = it;
                c4188f.f13740j = z9;
                c4188f.f13742l = 1;
                objM8185b = it.m8185b(c4188f);
                if (objM8185b != enumC5799a) {
                }
            } else if (i10 == 1) {
                z9 = c4188f.f13740j;
                c3970b = c4188f.f13739i;
                InterfaceC3975g interfaceC3975g = c4188f.f13738h;
                interfaceC4187e2 = c4188f.f13737g;
                AbstractC1089i.m2732I0(obj);
                r82 = interfaceC3975g;
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i10 != 2) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z9 = c4188f.f13740j;
                c3970b = c4188f.f13739i;
                InterfaceC3975g interfaceC3975g2 = c4188f.f13738h;
                interfaceC4187e2 = c4188f.f13737g;
                AbstractC1089i.m2732I0(obj);
                ?? r83 = interfaceC3975g2;
                it = c3970b;
                interfaceC4187e = interfaceC4187e2;
                c3983o = r83;
                c4188f.f13737g = interfaceC4187e;
                c4188f.f13738h = c3983o;
                c4188f.f13739i = it;
                c4188f.f13740j = z9;
                c4188f.f13742l = 1;
                objM8185b = it.m8185b(c4188f);
                if (objM8185b != enumC5799a) {
                    return enumC5799a;
                }
                interfaceC4187e2 = interfaceC4187e;
                c3970b = it;
                obj = objM8185b;
                r82 = c3983o;
                if (((Boolean) obj).booleanValue()) {
                    if (z9) {
                        r82.mo8196a(null);
                    }
                    return C3967n.f12976a;
                }
                Object objM8186c = c3970b.m8186c();
                c4188f.f13737g = interfaceC4187e2;
                c4188f.f13738h = r82;
                c4188f.f13739i = c3970b;
                c4188f.f13740j = z9;
                c4188f.f13742l = 2;
                r83 = r82;
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x002f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [fg.p] */
    /* JADX WARN: Type inference failed for: r5v0, types: [tg.d] */
    /* JADX WARN: Type inference failed for: r6v0, types: [fg.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.StringBuilder] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8468f(InterfaceC4186d interfaceC4186d, InterfaceC1235p interfaceC1235p, AbstractC6038c abstractC6038c) {
        C4194l c4194l;
        ?? r12;
        C1425u c1425u;
        C4336a e6;
        C1534l0 c1534l0;
        ?? r13;
        C2463q c2463q = AbstractC4338c.f14500b;
        if (abstractC6038c instanceof C4194l) {
            c4194l = (C4194l) abstractC6038c;
            int i9 = c4194l.f13766k;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c4194l.f13766k = i9 - Integer.MIN_VALUE;
            } else {
                c4194l = new C4194l(abstractC6038c);
            }
        }
        Object obj = c4194l.f13765j;
        int i10 = c4194l.f13766k;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            C1425u c1425u2 = new C1425u();
            c1425u2.f4738g = c2463q;
            C1534l0 c1534l02 = new C1534l0((Object) interfaceC1235p, 2, c1425u2);
            try {
                c4194l.f13762g = (AbstractC6044i) interfaceC1235p;
                c4194l.f13763h = c1425u2;
                c4194l.f13764i = c1534l02;
                c4194l.f13766k = 1;
                Object objMo6025b = interfaceC4186d.mo6025b(c1534l02, c4194l);
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (objMo6025b == enumC5799a) {
                    return enumC5799a;
                }
                r13 = interfaceC1235p;
                c1425u = c1425u2;
            } catch (C4336a e7) {
                r12 = interfaceC1235p;
                c1425u = c1425u2;
                e6 = e7;
                c1534l0 = c1534l02;
                r13 = r12;
                if (e6.f14494g != c1534l0) {
                    throw e6;
                }
            }
        } else {
            if (i10 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c1534l0 = c4194l.f13764i;
            c1425u = c4194l.f13763h;
            r12 = (InterfaceC1235p) c4194l.f13762g;
            try {
                AbstractC1089i.m2732I0(obj);
                r13 = r12;
            } catch (C4336a e10) {
                e6 = e10;
                r13 = r12;
                if (e6.f14494g != c1534l0) {
                }
            }
        }
        Object obj2 = c1425u.f4738g;
        if (obj2 != c2463q) {
            return obj2;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate " + r13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8469g(C5761g c5761g, AbstractC6038c abstractC6038c) {
        C4193k c4193k;
        C1425u c1425u;
        C4336a e6;
        C0587i c0587i;
        C2463q c2463q = AbstractC4338c.f14500b;
        if (abstractC6038c instanceof C4193k) {
            c4193k = (C4193k) abstractC6038c;
            int i9 = c4193k.f13761j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c4193k.f13761j = i9 - Integer.MIN_VALUE;
            } else {
                c4193k = new C4193k(abstractC6038c);
            }
        }
        Object obj = c4193k.f13760i;
        int i10 = c4193k.f13761j;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            C1425u c1425u2 = new C1425u();
            c1425u2.f4738g = c2463q;
            C0587i c0587i2 = new C0587i(c1425u2, 3);
            try {
                c4193k.f13758g = c1425u2;
                c4193k.f13759h = c0587i2;
                c4193k.f13761j = 1;
                Object objMo6025b = c5761g.mo6025b(c0587i2, c4193k);
                Object obj2 = EnumC5799a.f23547g;
                if (objMo6025b == obj2) {
                    return obj2;
                }
                c1425u = c1425u2;
            } catch (C4336a e7) {
                c1425u = c1425u2;
                e6 = e7;
                c0587i = c0587i2;
                if (e6.f14494g != c0587i) {
                    throw e6;
                }
            }
        } else {
            if (i10 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0587i = c4193k.f13759h;
            c1425u = c4193k.f13758g;
            try {
                AbstractC1089i.m2732I0(obj);
            } catch (C4336a e10) {
                e6 = e10;
                if (e6.f14494g != c0587i) {
                }
            }
        }
        Object obj3 = c1425u.f4738g;
        if (obj3 != c2463q) {
            return obj3;
        }
        C2104o.m5287l("Expected at least one element");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final C4197o m8470h(C2571a c2571a, C4554c c4554c, C4207y c4207y, Float f3) {
        InterfaceC3975g.f13018e.getClass();
        C3974f c3974f = C3974f.f13016a;
        C3315t c3315t = new C3315t(c2571a, 9, C5562h.f22661g);
        C4183b0 c4183b0M8464b = m8464b(f3);
        InterfaceC5561g interfaceC5561g = (InterfaceC5561g) c3315t.f10678i;
        InterfaceC4186d interfaceC4186d = (InterfaceC4186d) c3315t.f10677h;
        EnumC3601u enumC3601u = c4207y.equals(C4204v.f13797a) ? EnumC3601u.f11613g : EnumC3601u.f11616j;
        C0579e c0579e = new C0579e(c4207y, interfaceC4186d, c4183b0M8464b, f3, null, 8);
        InterfaceC5561g interfaceC5561gM7554h = AbstractC3603v.m7554h(c4554c.mo4457n(), interfaceC5561g, true);
        C5808e c5808e = AbstractC3553c0.f11555a;
        if (interfaceC5561gM7554h != c5808e && interfaceC5561gM7554h.mo2062s(C5558d.f22660g) == null) {
            interfaceC5561gM7554h = interfaceC5561gM7554h.mo2059e(c5808e);
        }
        AbstractC3546a c3612z0 = enumC3601u == EnumC3601u.f11614h ? new C3612z0(interfaceC5561gM7554h, c0579e) : new C3560e1(interfaceC5561gM7554h, true);
        c3612z0.m7472c0(enumC3601u, c3612z0, c0579e);
        return new C4197o(c4183b0M8464b);
    }
}
