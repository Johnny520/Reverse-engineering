package p203n;

import java.util.concurrent.CancellationException;
import p047I0.C0775z0;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p092S0.C1286x;
import p095T.AbstractC1385s;
import p108V3.C1534G;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p127Z2.AbstractC1784a;
import p169h0.C2194c;
import p169h0.InterfaceC2208q;

/* JADX INFO: renamed from: n.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2649d {

    /* JADX INFO: renamed from: a */
    public static final C2663k f8437a = new C2663k(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: b */
    public static final C2665l f8438b = new C2665l(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c */
    public static final C2667m f8439c = new C2667m(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d */
    public static final C2669n f8440d = new C2669n(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e */
    public static final C2663k f8441e = new C2663k(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: f */
    public static final C2665l f8442f = new C2665l(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: g */
    public static final C2667m f8443g = new C2667m(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: h */
    public static final C2669n f8444h = new C2669n(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: i */
    public static final float[] f8445i = new float[91];

    /* JADX INFO: renamed from: j */
    public static final C2652e0 f8446j = new C2652e0(new C1286x(28), new C2654f0(15));

    /* JADX INFO: renamed from: k */
    public static final C2652e0 f8447k = new C2652e0(new C1286x(29), new C2654f0(0));

    /* JADX INFO: renamed from: l */
    public static final C2652e0 f8448l = new C2652e0(new C2654f0(1), new C2654f0(2));

    /* JADX INFO: renamed from: m */
    public static final C2652e0 f8449m = new C2652e0(new C2654f0(3), new C2654f0(4));

    /* JADX INFO: renamed from: n */
    public static final C2652e0 f8450n = new C2652e0(new C2654f0(5), new C2654f0(6));

    /* JADX INFO: renamed from: o */
    public static final C2652e0 f8451o = new C2652e0(new C2654f0(7), new C2654f0(8));

    /* JADX INFO: renamed from: p */
    public static final C2652e0 f8452p = new C2652e0(new C2654f0(9), new C2654f0(10));

    /* JADX INFO: renamed from: q */
    public static final C2652e0 f8453q = new C2652e0(new C2654f0(11), new C2654f0(12));

    /* JADX INFO: renamed from: r */
    public static final C2652e0 f8454r = new C2652e0(new C2654f0(13), new C2654f0(14));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C2661j m4608a(float f2, int i5) {
        if ((i5 & 2) != 0) {
            f2 = 0.0f;
        }
        return new C2661j(f8446j, Float.valueOf(0.0f), new C2663k(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:(3:13|78|14)(2:18|19))(8:21|(10:76|23|24|74|25|26|70|27|(1:30)|50)(7:39|72|40|41|80|42|(6:44|45|68|46|47|48)(2:55|56))|34|59|(1:61)|62|(1:66)|67)|31|80|42|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011c, code lost:
    
        if (m4611d(r3, r5, r8) == r11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0125, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0126, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea A[Catch: CancellationException -> 0x0125, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x0125, blocks: (B:42:0x00d5, B:44:0x00ea), top: B:80:0x00d5 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x011c -> B:31:0x0090). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4609b(C2661j c2661j, InterfaceC2653f interfaceC2653f, long j5, final InterfaceC1601c interfaceC1601c, InterfaceC1046d interfaceC1046d) {
        C2632O c2632o;
        final C2661j c2661j2;
        C1675t c1675t;
        C2661j c2661j3;
        InterfaceC1601c interfaceC1601c2;
        C1675t c1675t2;
        C1675t c1675t3;
        C2657h c2657h;
        C2657h c2657h2;
        Object obj;
        final InterfaceC1601c interfaceC1601c3;
        final C1675t c1675t4;
        final InterfaceC2653f interfaceC2653f2;
        final C2661j c2661j4;
        final InterfaceC2653f interfaceC2653f3 = interfaceC2653f;
        if (interfaceC1046d instanceof C2632O) {
            c2632o = (C2632O) interfaceC1046d;
            int i5 = c2632o.f8365l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2632o.f8365l = i5 - Integer.MIN_VALUE;
            } else {
                c2632o = new C2632O(interfaceC1046d);
            }
        }
        C2632O c2632o2 = c2632o;
        InterfaceC1051i interfaceC1051i = c2632o2.f3866e;
        Object obj2 = c2632o2.f8364k;
        int i6 = c2632o2.f8365l;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        if (i6 == 0) {
            AbstractC1784a.m3205S(obj2);
            final Object objMo4578b = interfaceC2653f3.mo4578b(0L);
            final AbstractC2670o abstractC2670oMo4582f = interfaceC2653f3.mo4582f(0L);
            final C1675t c1675t5 = new C1675t();
            if (j5 == Long.MIN_VALUE) {
                try {
                    AbstractC1665j.m2982b(interfaceC1051i);
                    final float fM4615h = m4615h(interfaceC1051i);
                    c2661j2 = c2661j;
                    try {
                        InterfaceC1601c interfaceC1601c4 = new InterfaceC1601c() { // from class: n.L
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p112W2.InterfaceC1601c
                            /* JADX INFO: renamed from: h */
                            public final Object mo1h(Object obj3) {
                                long jLongValue = ((Long) obj3).longValue();
                                InterfaceC2653f interfaceC2653f4 = interfaceC2653f3;
                                C2652e0 c2652e0Mo4580d = interfaceC2653f4.mo4580d();
                                Object objMo4581e = interfaceC2653f4.mo4581e();
                                C2661j c2661j5 = c2661j2;
                                C2657h c2657h3 = new C2657h(objMo4578b, c2652e0Mo4580d, abstractC2670oMo4582f, jLongValue, objMo4581e, jLongValue, new C2630M(c2661j5, 1));
                                AbstractC2649d.m4614g(c2657h3, jLongValue, fM4615h, interfaceC2653f4, c2661j5, interfaceC1601c);
                                c1675t5.f5710e = c2657h3;
                                return C0891q.f2780a;
                            }
                        };
                        c1675t = c1675t5;
                        try {
                            c2632o2.f8360g = c2661j2;
                            c2632o2.f8361h = interfaceC2653f3;
                            c2632o2.f8362i = interfaceC1601c;
                            c2632o2.f8363j = c1675t;
                            c2632o2.f8365l = 1;
                            if (m4611d(interfaceC2653f3, interfaceC1601c4, c2632o2) != enumC1152a) {
                                c2661j3 = c2661j2;
                                interfaceC1601c2 = interfaceC1601c;
                                c1675t2 = c1675t;
                            }
                            return enumC1152a;
                        } catch (CancellationException e5) {
                            e = e5;
                            c2661j3 = c2661j2;
                            c1675t2 = c1675t;
                        }
                    } catch (CancellationException e6) {
                        e = e6;
                        c1675t = c1675t5;
                        c2661j3 = c2661j2;
                        c1675t2 = c1675t;
                        c2657h = (C2657h) c1675t2.f5710e;
                        if (c2657h != null) {
                        }
                        c2657h2 = (C2657h) c1675t2.f5710e;
                        if (c2657h2 != null) {
                            c2661j3.f8482i = false;
                        }
                        throw e;
                    }
                } catch (CancellationException e7) {
                    e = e7;
                    c2661j2 = c2661j;
                }
            } else {
                c1675t = c1675t5;
                try {
                    C2657h c2657h3 = new C2657h(objMo4578b, interfaceC2653f3.mo4580d(), abstractC2670oMo4582f, j5, interfaceC2653f3.mo4581e(), j5, new C2630M(c2661j, 0));
                    AbstractC1665j.m2982b(interfaceC1051i);
                    m4614g(c2657h3, j5, m4615h(interfaceC1051i), interfaceC2653f3, c2661j, interfaceC1601c);
                    c1675t.f5710e = c2657h3;
                    c2661j3 = c2661j;
                    interfaceC2653f3 = interfaceC2653f;
                    interfaceC1601c2 = interfaceC1601c;
                    c1675t3 = c1675t;
                    obj = c1675t3.f5710e;
                    AbstractC1665j.m2982b(obj);
                    if (((Boolean) ((C2657h) obj).f8473i.getValue()).booleanValue()) {
                        return C0891q.f2780a;
                    }
                    try {
                        InterfaceC1051i interfaceC1051i2 = c2632o2.f3866e;
                        AbstractC1665j.m2982b(interfaceC1051i2);
                        final float fM4615h2 = m4615h(interfaceC1051i2);
                        InterfaceC1601c interfaceC1601c5 = new InterfaceC1601c() { // from class: n.N
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p112W2.InterfaceC1601c
                            /* JADX INFO: renamed from: h */
                            public final Object mo1h(Object obj3) {
                                long jLongValue = ((Long) obj3).longValue();
                                Object obj4 = c1675t4.f5710e;
                                AbstractC1665j.m2982b(obj4);
                                AbstractC2649d.m4614g((C2657h) obj4, jLongValue, fM4615h2, interfaceC2653f2, c2661j4, interfaceC1601c3);
                                return C0891q.f2780a;
                            }
                        };
                        c1675t2 = c1675t4;
                        interfaceC2653f3 = interfaceC2653f2;
                        c2661j3 = c2661j4;
                        interfaceC1601c2 = interfaceC1601c3;
                        c2632o2.f8360g = c2661j3;
                        c2632o2.f8361h = interfaceC2653f3;
                        c2632o2.f8362i = interfaceC1601c2;
                        c2632o2.f8363j = c1675t2;
                        c2632o2.f8365l = 2;
                    } catch (CancellationException e8) {
                        e = e8;
                        c1675t2 = c1675t4;
                        c2661j3 = c2661j4;
                    }
                    interfaceC1601c3 = interfaceC1601c2;
                    c1675t4 = c1675t3;
                    interfaceC2653f2 = interfaceC2653f3;
                    c2661j4 = c2661j3;
                } catch (CancellationException e9) {
                    e = e9;
                    c2661j3 = c2661j;
                    c1675t2 = c1675t;
                }
            }
            c1675t2 = c1675t;
            c2657h = (C2657h) c1675t2.f5710e;
            if (c2657h != null) {
                c2657h.f8473i.setValue(Boolean.FALSE);
            }
            c2657h2 = (C2657h) c1675t2.f5710e;
            if (c2657h2 != null && c2657h2.f8471g == c2661j3.f8480g) {
                c2661j3.f8482i = false;
            }
            throw e;
        }
        if (i6 != 1 && i6 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c1675t2 = c2632o2.f8363j;
        interfaceC1601c2 = c2632o2.f8362i;
        interfaceC2653f3 = c2632o2.f8361h;
        c2661j3 = c2632o2.f8360g;
        try {
            AbstractC1784a.m3205S(obj2);
        } catch (CancellationException e10) {
            e = e10;
        }
        c1675t3 = c1675t2;
        obj = c1675t3.f5710e;
        AbstractC1665j.m2982b(obj);
        if (((Boolean) ((C2657h) obj).f8473i.getValue()).booleanValue()) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final Object m4610c(C2661j c2661j, Float f2, InterfaceC2677v interfaceC2677v, InterfaceC1601c interfaceC1601c, AbstractC1184i abstractC1184i) {
        Object objM4609b = m4609b(c2661j, new C2633P(interfaceC2677v, c2661j.f8477d, c2661j.f8478e.getValue(), f2, c2661j.f8479f), c2661j.f8480g, interfaceC1601c, abstractC1184i);
        return objM4609b == EnumC1152a.f3788d ? objM4609b : C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final Object m4611d(InterfaceC2653f interfaceC2653f, InterfaceC1601c interfaceC1601c, C2632O c2632o) {
        InterfaceC1051i interfaceC1051i = c2632o.f3866e;
        if (!interfaceC2653f.mo4577a()) {
            C1534G c1534g = new C1534G(interfaceC1601c, 3);
            AbstractC1665j.m2982b(interfaceC1051i);
            return AbstractC1385s.m2626p(interfaceC1051i).m1209a(c1534g, c2632o);
        }
        AbstractC1665j.m2982b(interfaceC1051i);
        if (interfaceC1051i.mo1166C(C0775z0.f2516d) != null) {
            throw new ClassCastException();
        }
        AbstractC1665j.m2982b(interfaceC1051i);
        return AbstractC1385s.m2626p(interfaceC1051i).m1209a(interfaceC1601c, c2632o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final AbstractC2670o m4612e(AbstractC2670o abstractC2670o) {
        AbstractC2670o abstractC2670oMo4626c = abstractC2670o.mo4626c();
        int iMo4625b = abstractC2670oMo4626c.mo4625b();
        for (int i5 = 0; i5 < iMo4625b; i5++) {
            abstractC2670oMo4626c.mo4628e(abstractC2670o.mo4624a(i5), i5);
        }
        return abstractC2670oMo4626c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static C2661j m4613f(C2661j c2661j, float f2) {
        float f5 = ((C2663k) c2661j.f8479f).f8483a;
        return new C2661j(c2661j.f8477d, Float.valueOf(f2), new C2663k(f5), c2661j.f8480g, c2661j.f8481h, c2661j.f8482i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final void m4614g(C2657h c2657h, long j5, float f2, InterfaceC2653f interfaceC2653f, C2661j c2661j, InterfaceC1601c interfaceC1601c) {
        long jMo4579c = f2 == 0.0f ? interfaceC2653f.mo4579c() : (long) ((j5 - c2657h.f8467c) / f2);
        c2657h.f8471g = j5;
        c2657h.f8469e.setValue(interfaceC2653f.mo4578b(jMo4579c));
        c2657h.f8470f = interfaceC2653f.mo4582f(jMo4579c);
        if (interfaceC2653f.m4623g(jMo4579c)) {
            c2657h.f8472h = c2657h.f8471g;
            c2657h.f8473i.setValue(Boolean.FALSE);
        }
        m4619l(c2657h, c2661j);
        interfaceC1601c.mo1h(c2657h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final float m4615h(InterfaceC1051i interfaceC1051i) {
        InterfaceC2208q interfaceC2208q = (InterfaceC2208q) interfaceC1051i.mo1166C(C2194c.f7174r);
        float fMo1169r = interfaceC2208q != null ? interfaceC2208q.mo1169r() : 1.0f;
        if (fMo1169r >= 0.0f) {
            return fMo1169r;
        }
        AbstractC2624G.m4575b("negative scale factor");
        return fMo1169r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final C2619B m4616i(InterfaceC1601c interfaceC1601c) {
        C2618A c2618a = new C2618A();
        interfaceC1601c.mo1h(c2618a);
        return new C2619B(c2618a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static C2626I m4617j(float f2, float f5, Object obj, int i5) {
        if ((i5 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i5 & 2) != 0) {
            f5 = 1500.0f;
        }
        if ((i5 & 4) != 0) {
            obj = null;
        }
        return new C2626I(f2, f5, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static C2650d0 m4618k(int i5, int i6, InterfaceC2675t interfaceC2675t, int i7) {
        if ((i7 & 2) != 0) {
            i6 = 0;
        }
        if ((i7 & 4) != 0) {
            interfaceC2675t = AbstractC2676u.f8542a;
        }
        return new C2650d0(i5, i6, interfaceC2675t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final void m4619l(C2657h c2657h, C2661j c2661j) {
        c2661j.f8478e.setValue(c2657h.f8469e.getValue());
        AbstractC2670o abstractC2670o = c2661j.f8479f;
        AbstractC2670o abstractC2670o2 = c2657h.f8470f;
        int iMo4625b = abstractC2670o.mo4625b();
        for (int i5 = 0; i5 < iMo4625b; i5++) {
            abstractC2670o.mo4628e(abstractC2670o2.mo4624a(i5), i5);
        }
        c2661j.f8481h = c2657h.f8472h;
        c2661j.f8480g = c2657h.f8471g;
        c2661j.f8482i = ((Boolean) c2657h.f8473i.getValue()).booleanValue();
    }
}
