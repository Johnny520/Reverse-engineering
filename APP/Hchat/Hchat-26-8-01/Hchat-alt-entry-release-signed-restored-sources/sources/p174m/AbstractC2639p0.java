package p174m;

import ac.AbstractC0063p;
import ac.C0058k;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.util.ArrayList;
import okio.C3193a;
import p000a.AbstractC0000a;
import p005a5.C0016a;
import p007a7.AbstractC0018a;
import p057e1.C0807b;
import p069f.C0967y;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p092g4.AbstractC1341a;
import p136j8.C2104o;
import p144k.AbstractC2192n;
import p144k.C2187l0;
import p144k.InterfaceC2184k0;
import p187n.C2847a;
import p187n.C2848b;
import p187n.C2849c;
import p187n.C2857k;
import p224p1.C3286a;
import p224p1.C3287b;
import p224p1.InterfaceC3288c;
import p249qg.AbstractC3603v;
import p267s1.AbstractC3913s;
import p267s1.C3890d0;
import p267s1.C3903k;
import p267s1.C3914t;
import p267s1.EnumC3905l;
import p276sf.C3967n;
import p279t1.C4081a;
import p279t1.C4082b;
import p279t1.C4084d;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p339x1.InterfaceC5609h;
import p339x1.InterfaceC5656w1;
import p343x6.AbstractC5700d;
import p352xf.EnumC5799a;
import p357y1.AbstractC5888h1;
import p357y1.InterfaceC5905l2;
import p370yf.AbstractC6038c;
import sg.AbstractC3978j;
import sg.C3971c;
import sg.InterfaceC3975g;
import tf.AbstractC4165l;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: m.p0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2639p0 extends AbstractC5615j implements InterfaceC5656w1, InterfaceC3288c, InterfaceC5609h, InterfaceC2184k0 {

    /* JADX INFO: renamed from: A */
    public C2187l0 f8603A;

    /* JADX INFO: renamed from: B */
    public C3971c f8604B;

    /* JADX INFO: renamed from: C */
    public C2848b f8605C;

    /* JADX INFO: renamed from: D */
    public boolean f8606D;

    /* JADX INFO: renamed from: E */
    public boolean f8607E;

    /* JADX INFO: renamed from: F */
    public C2654t f8608F;

    /* JADX INFO: renamed from: G */
    public C2666w f8609G;

    /* JADX INFO: renamed from: H */
    public C2662v f8610H;

    /* JADX INFO: renamed from: I */
    public C2658u f8611I;

    /* JADX INFO: renamed from: J */
    public AbstractC5700d f8612J;

    /* JADX INFO: renamed from: K */
    public C2571a f8613K;

    /* JADX INFO: renamed from: M */
    public C2575a3 f8615M;

    /* JADX INFO: renamed from: N */
    public C2578b1 f8616N;

    /* JADX INFO: renamed from: w */
    public EnumC2640p1 f8618w;

    /* JADX INFO: renamed from: x */
    public InterfaceC1231l f8619x;

    /* JADX INFO: renamed from: y */
    public boolean f8620y;

    /* JADX INFO: renamed from: z */
    public C2857k f8621z;

    /* JADX INFO: renamed from: L */
    public long f8614L = 9205357640488583168L;

    /* JADX INFO: renamed from: O */
    public long f8617O = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC2639p0(InterfaceC1231l interfaceC1231l, boolean z9, C2857k c2857k, EnumC2640p1 enumC2640p1) {
        this.f8618w = enumC2640p1;
        this.f8619x = interfaceC1231l;
        this.f8620y = z9;
        this.f8621z = c2857k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: n1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m6097n1(AbstractC2639p0 abstractC2639p0, AbstractC6038c abstractC6038c) throws Throwable {
        C2623l0 c2623l0;
        if (abstractC6038c instanceof C2623l0) {
            c2623l0 = (C2623l0) abstractC6038c;
            int i9 = c2623l0.f8536i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2623l0.f8536i = i9 - Integer.MIN_VALUE;
            } else {
                c2623l0 = new C2623l0(abstractC2639p0, abstractC6038c);
            }
        }
        Object obj = c2623l0.f8534g;
        int i10 = c2623l0.f8536i;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            C2848b c2848b = abstractC2639p0.f8605C;
            if (c2848b != null) {
                C2857k c2857k = abstractC2639p0.f8621z;
                if (c2857k != null) {
                    C2847a c2847a = new C2847a(c2848b);
                    c2623l0.f8536i = 1;
                    Object objM6281a = c2857k.m6281a(c2847a, c2623l0);
                    EnumC5799a enumC5799a = EnumC5799a.f23547g;
                    if (objM6281a == enumC5799a) {
                        return enumC5799a;
                    }
                }
            }
            abstractC2639p0.mo6063x1(new C2572a0(0L, false));
            return C3967n.f12976a;
        }
        if (i10 != 1) {
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC1089i.m2732I0(obj);
        abstractC2639p0.f8605C = null;
        abstractC2639p0.mo6063x1(new C2572a0(0L, false));
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: o1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m6098o1(AbstractC2639p0 abstractC2639p0, C2678z c2678z, AbstractC6038c abstractC6038c) {
        C2627m0 c2627m0;
        C2857k c2857k;
        C2848b c2848b;
        C2678z c2678z2;
        C2848b c2848b2;
        if (abstractC6038c instanceof C2627m0) {
            c2627m0 = (C2627m0) abstractC6038c;
            int i9 = c2627m0.f8553k;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2627m0.f8553k = i9 - Integer.MIN_VALUE;
            } else {
                c2627m0 = new C2627m0(abstractC2639p0, abstractC6038c);
            }
        }
        Object obj = c2627m0.f8551i;
        int i10 = c2627m0.f8553k;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            C2848b c2848b3 = abstractC2639p0.f8605C;
            if (c2848b3 != null && (c2857k = abstractC2639p0.f8621z) != null) {
                C2847a c2847a = new C2847a(c2848b3);
                c2627m0.f8549g = c2678z;
                c2627m0.f8553k = 1;
                if (c2857k.m6281a(c2847a, c2627m0) != enumC5799a) {
                }
                return enumC5799a;
            }
            abstractC2639p0.f8605C = c2848b;
            abstractC2639p0.mo6062w1(c2678z.f8732a);
            return C3967n.f12976a;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c2848b2 = c2627m0.f8550h;
            c2678z2 = c2627m0.f8549g;
            AbstractC1089i.m2732I0(obj);
            c2848b = c2848b2;
            c2678z = c2678z2;
            abstractC2639p0.f8605C = c2848b;
            abstractC2639p0.mo6062w1(c2678z.f8732a);
            return C3967n.f12976a;
        }
        c2678z = c2627m0.f8549g;
        AbstractC1089i.m2732I0(obj);
        c2848b = new C2848b();
        C2857k c2857k2 = abstractC2639p0.f8621z;
        if (c2857k2 != null) {
            c2627m0.f8549g = c2678z;
            c2627m0.f8550h = c2848b;
            c2627m0.f8553k = 2;
            if (c2857k2.m6281a(c2848b, c2627m0) != enumC5799a) {
                c2678z2 = c2678z;
                c2848b2 = c2848b;
                c2848b = c2848b2;
                c2678z = c2678z2;
            }
            return enumC5799a;
        }
        abstractC2639p0.f8605C = c2848b;
        abstractC2639p0.mo6062w1(c2678z.f8732a);
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: p1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m6099p1(AbstractC2639p0 abstractC2639p0, C2572a0 c2572a0, AbstractC6038c abstractC6038c) throws Throwable {
        C2631n0 c2631n0;
        if (abstractC6038c instanceof C2631n0) {
            c2631n0 = (C2631n0) abstractC6038c;
            int i9 = c2631n0.f8563j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2631n0.f8563j = i9 - Integer.MIN_VALUE;
            } else {
                c2631n0 = new C2631n0(abstractC2639p0, abstractC6038c);
            }
        }
        Object obj = c2631n0.f8561h;
        int i10 = c2631n0.f8563j;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            C2848b c2848b = abstractC2639p0.f8605C;
            if (c2848b != null) {
                C2857k c2857k = abstractC2639p0.f8621z;
                if (c2857k != null) {
                    C2849c c2849c = new C2849c(c2848b);
                    c2631n0.f8560g = c2572a0;
                    c2631n0.f8563j = 1;
                    Object objM6281a = c2857k.m6281a(c2849c, c2631n0);
                    EnumC5799a enumC5799a = EnumC5799a.f23547g;
                    if (objM6281a == enumC5799a) {
                        return enumC5799a;
                    }
                }
            }
            abstractC2639p0.mo6063x1(c2572a0);
            return C3967n.f12976a;
        }
        if (i10 != 1) {
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c2572a0 = c2631n0.f8560g;
        AbstractC1089i.m2732I0(obj);
        abstractC2639p0.f8605C = null;
        abstractC2639p0.mo6063x1(c2572a0);
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u1 */
    public static void m6100u1(AbstractC2639p0 abstractC2639p0, C3914t c3914t, long j3, long j4, int i9) {
        if ((i9 & 4) != 0) {
            j4 = 0;
        }
        C2662v c2662v = abstractC2639p0.f8610H;
        if (c2662v == null) {
            c2662v = new C2662v();
            c2662v.f8697g = null;
            c2662v.f8698h = Long.MAX_VALUE;
            c2662v.f8699i = false;
            abstractC2639p0.f8610H = c2662v;
        }
        c2662v.f8697g = c3914t;
        c2662v.f8698h = j3;
        C2575a3 c2575a3 = abstractC2639p0.f8615M;
        EnumC2640p1 enumC2640p1 = abstractC2639p0.f8618w;
        if (c2575a3 == null) {
            abstractC2639p0.f8615M = new C2575a3(enumC2640p1);
        } else {
            c2575a3.f8347a = enumC2640p1;
            c2575a3.f8348b = j4;
        }
        c2662v.f8699i = false;
        abstractC2639p0.f8612J = c2662v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A1 */
    public final void m6101A1(long j3, C3914t c3914t) {
        long jMo8859P = AbstractC5618k.m10166v(this.f23788g).mo8859P(0L);
        if (!C0807b.m2039b(this.f8614L, 9205357640488583168L) && !C0807b.m2039b(jMo8859P, this.f8614L)) {
            this.f8617O = C0807b.m2042e(this.f8617O, C0807b.m2041d(jMo8859P, this.f8614L));
        }
        this.f8614L = jMo8859P;
        AbstractC1341a.m3590f(m6110z1(), c3914t, this.f8617O);
        m6109y1().mo8208p(new C2674y(j3, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.InterfaceC2184k0
    /* JADX INFO: renamed from: B0 */
    public final boolean mo5418B0(C3287b c3287b) {
        return AbstractC0063p.m417j(c3287b) && this.f8620y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B1 */
    public final void m6102B1(C3914t c3914t, C3914t c3914t2, long j3) {
        if (this.f8613K == null) {
            this.f8613K = new C2571a(17);
        }
        AbstractC1341a.m3590f(m6110z1(), c3914t, 0L);
        long jM2041d = C0807b.m2041d(c3914t2.f12836c, j3);
        this.f8617O = 0L;
        if (((Boolean) this.f8619x.invoke(new C3890d0(c3914t.f12842i))).booleanValue()) {
            if (!this.f8606D) {
                if (this.f8604B == null) {
                    this.f8604B = AbstractC3978j.m8218a(Integer.MAX_VALUE, 6, null);
                }
                m6103D1();
            }
            this.f8614L = AbstractC5618k.m10166v(this).mo8859P(0L);
            m6109y1().mo8208p(new C2678z(jM2041d));
        }
    }

    /* JADX INFO: renamed from: C1 */
    public abstract boolean mo6059C1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D1 */
    public final void m6103D1() {
        this.f8606D = true;
        if (this.f8604B == null) {
            this.f8604B = AbstractC3978j.m8218a(Integer.MAX_VALUE, 6, null);
        }
        AbstractC3603v.m7563q(m10550Y0(), null, new C2635o0(this, null), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E1 */
    public final void m6104E1(InterfaceC1231l interfaceC1231l, boolean z9, C2857k c2857k, EnumC2640p1 enumC2640p1, boolean z10) {
        this.f8619x = interfaceC1231l;
        boolean z11 = true;
        if (this.f8620y != z9) {
            this.f8620y = z9;
            if (!z9) {
                m6105q1();
                this.f8616N = null;
            }
            z10 = true;
        }
        if (!AbstractC1416l.m3825a(this.f8621z, c2857k)) {
            m6105q1();
            this.f8621z = c2857k;
        }
        if (this.f8618w != enumC2640p1) {
            this.f8618w = enumC2640p1;
        } else {
            z11 = z10;
        }
        if (z11) {
            boolean z12 = this.f8607E;
            C2670x c2670x = C2670x.f8719a;
            if (z12) {
                m6106s1();
                if (this.f8606D) {
                    m6109y1().mo8208p(c2670x);
                }
                this.f8613K = null;
            }
            C2578b1 c2578b1 = this.f8616N;
            if (c2578b1 != null) {
                c2578b1.m6045a();
                AbstractC2639p0 abstractC2639p0 = c2578b1.f8352a;
                if (abstractC2639p0.f8606D) {
                    abstractC2639p0.m6108v1(c2670x);
                }
                c2578b1.f8358g = null;
                C0016a c0016a = c2578b1.f8362k;
                c0016a.f55h = 0;
                ((C0967y) c0016a.f56i).f3044b = 0;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: P */
    public void mo1608P(C3903k c3903k, EnumC3905l enumC3905l, long j3) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        boolean z9 = true;
        this.f8607E = true;
        if (this.f8603A == null) {
            C2187l0 c2187l0 = new C2187l0(this);
            m10122k1(c2187l0);
            this.f8603A = c2187l0;
        }
        if (this.f8620y) {
            if (this.f8612J == null) {
                C2654t c2654t = this.f8608F;
                if (c2654t == null) {
                    c2654t = new C2654t();
                    c2654t.f8662g = EnumC2650s.f8652i;
                    c2654t.f8663h = false;
                    this.f8608F = c2654t;
                }
                this.f8612J = c2654t;
            }
            AbstractC5700d abstractC5700d = this.f8612J;
            if (abstractC5700d == null) {
                C2104o.m5294t("currentDragState should not be null");
                return;
            }
            boolean z10 = abstractC5700d instanceof C2654t;
            EnumC3905l enumC3905l2 = EnumC3905l.f12812g;
            EnumC3905l enumC3905l3 = EnumC3905l.f12813h;
            if (z10) {
                C2654t c2654t2 = (C2654t) abstractC5700d;
                if (!c3903k.f12800a.isEmpty() && AbstractC2677y2.m6120e(c3903k, false)) {
                    C3914t c3914t = (C3914t) AbstractC4166m.m8422t1(c3903k.f12800a);
                    int i9 = AbstractC2619k0.f8522a[c2654t2.f8662g.ordinal()];
                    EnumC2650s enumC2650s = EnumC2650s.f8651h;
                    EnumC2650s enumC2650s2 = EnumC2650s.f8650g;
                    EnumC2650s enumC2650s3 = i9 == 1 ? !mo6059C1() ? enumC2650s2 : enumC2650s : c2654t2.f8662g;
                    c2654t2.f8662g = enumC2650s3;
                    if (enumC3905l == enumC3905l2 && enumC2650s3 == enumC2650s) {
                        c3914t.m8118a();
                        c2654t2.f8663h = true;
                    }
                    if (enumC3905l == enumC3905l3) {
                        if (enumC2650s3 == enumC2650s2) {
                            m6100u1(this, c3914t, c3914t.f12834a, 0L, 12);
                            return;
                        }
                        if (c2654t2.f8663h) {
                            m6102B1(c3914t, c3914t, 0L);
                            m6101A1(0L, c3914t);
                            long j4 = c3914t.f12834a;
                            C2666w c2666w = this.f8609G;
                            if (c2666w == null) {
                                c2666w = new C2666w();
                                c2666w.f8713g = Long.MAX_VALUE;
                                this.f8609G = c2666w;
                            }
                            c2666w.f8713g = j4;
                            this.f8612J = c2666w;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z11 = abstractC5700d instanceof C2662v;
            EnumC3905l enumC3905l4 = EnumC3905l.f12814i;
            if (!z11) {
                if (abstractC5700d instanceof C2658u) {
                    C2658u c2658u = (C2658u) abstractC5700d;
                    if (enumC3905l != enumC3905l4) {
                        return;
                    }
                    ?? r12 = c3903k.f12800a;
                    int size = r12.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        if (((C3914t) r12.get(i10)).m8119b()) {
                            z9 = false;
                            break;
                        }
                        i10++;
                    }
                    int size2 = r12.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size2) {
                            break;
                        }
                        if (!((C3914t) r12.get(i11)).f12837d) {
                            i11++;
                        } else if (!r12.isEmpty()) {
                            if (z9) {
                                long j5 = ((C3914t) AbstractC4166m.m8422t1(r12)).f12836c;
                                C3914t c3914t2 = c2658u.f8680g;
                                c3914t2.getClass();
                                long jM2041d = C0807b.m2041d(j5, c3914t2.f12836c);
                                C3914t c3914t3 = c2658u.f8680g;
                                if (c3914t3 != null) {
                                    m6100u1(this, c3914t3, c2658u.f8681h, jM2041d, 8);
                                    return;
                                } else {
                                    C2104o.m5294t("AwaitGesturePickup.initialDown was not initialized.");
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    m6106s1();
                    return;
                }
                if (!(abstractC5700d instanceof C2666w)) {
                    C3193a.m6822k();
                    return;
                }
                C2666w c2666w2 = (C2666w) abstractC5700d;
                if (enumC3905l != enumC3905l3) {
                    return;
                }
                long j10 = c2666w2.f8713g;
                ?? r2 = c3903k.f12800a;
                int size3 = r2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size3) {
                        obj = null;
                        break;
                    }
                    obj = r2.get(i12);
                    if (AbstractC3913s.m8112e(((C3914t) obj).f12834a, j10)) {
                        break;
                    } else {
                        i12++;
                    }
                }
                C3914t c3914t4 = (C3914t) obj;
                if (c3914t4 == null) {
                    return;
                }
                boolean zM8111d = AbstractC3913s.m8111d(c3914t4);
                Object obj6 = C2670x.f8719a;
                if (!zM8111d) {
                    if (c3914t4.m8119b()) {
                        m6109y1().mo8208p(obj6);
                        return;
                    } else {
                        if (C0807b.m2040c(AbstractC3913s.m8115h(c3914t4, true)) == 0.0f) {
                            return;
                        }
                        m6101A1(AbstractC3913s.m8115h(c3914t4, false), c3914t4);
                        c3914t4.m8118a();
                        return;
                    }
                }
                ?? r13 = c3903k.f12800a;
                int size4 = r13.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size4) {
                        obj2 = null;
                        break;
                    }
                    obj2 = r13.get(i13);
                    if (((C3914t) obj2).f12837d) {
                        break;
                    } else {
                        i13++;
                    }
                }
                C3914t c3914t5 = (C3914t) obj2;
                if (c3914t5 != null) {
                    c2666w2.f8713g = c3914t5.f12834a;
                    return;
                }
                if (c3914t4.m8119b() || !AbstractC3913s.m8111d(c3914t4)) {
                    m6109y1().mo8208p(obj6);
                } else {
                    AbstractC1341a.m3590f(m6110z1(), c3914t4, 0L);
                    float fMo10620e = ((InterfaceC5905l2) AbstractC5618k.m10152h(this, AbstractC5888h1.f23938t)).mo10620e();
                    long jM6030j = m6110z1().m6030j(AbstractC0000a.m59d(fMo10620e, fMo10620e));
                    C4082b c4082b = (C4082b) m6110z1().f8339h;
                    C4084d c4084d = c4082b.f13523a;
                    C4081a[] c4081aArr = c4084d.f13532d;
                    AbstractC4165l.m8387v0(0, c4081aArr.length, null, c4081aArr);
                    c4084d.f13533e = 0;
                    C4084d c4084d2 = c4082b.f13524b;
                    C4081a[] c4081aArr2 = c4084d2.f13532d;
                    AbstractC4165l.m8387v0(0, c4081aArr2.length, null, c4081aArr2);
                    c4084d2.f13533e = 0;
                    c4082b.f13525c = 0L;
                    m6109y1().mo8208p(new C2572a0(AbstractC2651s0.m6113c(jM6030j), false));
                    this.f8607E = false;
                }
                m6106s1();
                return;
            }
            C2662v c2662v = (C2662v) abstractC5700d;
            if (enumC3905l == enumC3905l2) {
                return;
            }
            ?? r14 = c3903k.f12800a;
            int size5 = r14.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size5) {
                    obj3 = null;
                    break;
                }
                obj3 = r14.get(i14);
                int i15 = size5;
                if (AbstractC3913s.m8112e(((C3914t) obj3).f12834a, c2662v.f8698h)) {
                    break;
                }
                i14++;
                size5 = i15;
            }
            C3914t c3914t6 = (C3914t) obj3;
            if (c3914t6 == null) {
                int size6 = r14.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size6) {
                        obj5 = null;
                        break;
                    }
                    obj5 = r14.get(i16);
                    if (((C3914t) obj5).f12837d) {
                        break;
                    } else {
                        i16++;
                    }
                }
                c3914t6 = (C3914t) obj5;
                if (c3914t6 == null) {
                    m6106s1();
                    return;
                }
                c2662v.f8698h = c3914t6.f12834a;
            }
            if (enumC3905l == enumC3905l3) {
                if (c3914t6.m8119b()) {
                    C3914t c3914t7 = c2662v.f8697g;
                    if (c3914t7 == null) {
                        C2104o.m5294t("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j11 = c2662v.f8698h;
                    C2575a3 c2575a3 = this.f8615M;
                    if (c2575a3 == null) {
                        C2104o.m5294t("AwaitTouchSlop.touchSlopDetector was not initialized");
                        return;
                    }
                    m6107t1(c3914t7, j11, c2575a3);
                } else if (AbstractC3913s.m8111d(c3914t6)) {
                    int size7 = r14.size();
                    int i17 = 0;
                    while (true) {
                        if (i17 >= size7) {
                            obj4 = null;
                            break;
                        }
                        Object obj7 = r14.get(i17);
                        if (((C3914t) obj7).f12837d) {
                            obj4 = obj7;
                            break;
                        }
                        i17++;
                    }
                    C3914t c3914t8 = (C3914t) obj4;
                    if (c3914t8 == null) {
                        m6106s1();
                    } else {
                        c2662v.f8698h = c3914t8.f12834a;
                    }
                } else {
                    float fM6069f = AbstractC2615j0.m6069f((InterfaceC5905l2) AbstractC5618k.m10152h(this, AbstractC5888h1.f23938t), c3914t6.f12842i);
                    C2575a3 c2575a32 = this.f8615M;
                    if (c2575a32 == null) {
                        C2104o.m5294t("Touch slop detector not initialized.");
                        return;
                    }
                    long jM6042a = c2575a32.m6042a(AbstractC3913s.m8115h(c3914t6, true), fM6069f, true);
                    if ((9223372034707292159L & jM6042a) != 9205357640488583168L) {
                        boolean zMo5419X = mo5419X(c3914t6);
                        InterfaceC2184k0 interfaceC2184k0M5436m = AbstractC2192n.m5436m(this);
                        boolean z12 = interfaceC2184k0M5436m != null && interfaceC2184k0M5436m.mo5419X(c3914t6);
                        if (zMo5419X || !z12) {
                            c3914t6.m8118a();
                            C3914t c3914t9 = c2662v.f8697g;
                            c3914t9.getClass();
                            m6102B1(c3914t9, c3914t6, jM6042a);
                            m6101A1(jM6042a, c3914t6);
                            long j12 = c3914t6.f12834a;
                            C2666w c2666w3 = this.f8609G;
                            if (c2666w3 == null) {
                                c2666w3 = new C2666w();
                                c2666w3.f8713g = Long.MAX_VALUE;
                                this.f8609G = c2666w3;
                            }
                            c2666w3.f8713g = j12;
                            this.f8612J = c2666w3;
                        } else {
                            c2662v.f8699i = true;
                        }
                    } else {
                        c2662v.f8699i = true;
                    }
                }
            }
            if (enumC3905l == enumC3905l4 && c2662v.f8699i) {
                if (!c3914t6.m8119b()) {
                    c2662v.f8699i = false;
                    return;
                }
                C3914t c3914t10 = c2662v.f8697g;
                if (c3914t10 == null) {
                    C2104o.m5294t("AwaitTouchSlop.initialDown was not initialized");
                    return;
                }
                long j13 = c2662v.f8698h;
                C2575a3 c2575a33 = this.f8615M;
                if (c2575a33 != null) {
                    m6107t1(c3914t10, j13, c2575a33);
                } else {
                    C2104o.m5294t("AwaitTouchSlop.touchSlopDetector was not initialized");
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p224p1.InterfaceC3288c
    /* JADX INFO: renamed from: T0 */
    public final void mo5377T0(C0058k c0058k, EnumC3905l enumC3905l) {
        Object obj;
        Object obj2;
        boolean z9;
        EnumC3905l enumC3905l2;
        EnumC3905l enumC3905l3;
        Object obj3;
        Object obj4;
        int i9 = c0058k.f176h;
        ArrayList arrayList = (ArrayList) c0058k.f177i;
        if (this.f8603A == null) {
            C2187l0 c2187l0 = new C2187l0(this);
            m10122k1(c2187l0);
            this.f8603A = c2187l0;
        }
        if (this.f8620y) {
            if (this.f8616N == null) {
                this.f8616N = new C2578b1(this);
            }
            C2578b1 c2578b1 = this.f8616N;
            if (c2578b1 != null) {
                AbstractC2639p0 abstractC2639p0 = c2578b1.f8352a;
                if (c2578b1.f8357f == null) {
                    C2667w0 c2667w0 = c2578b1.f8353b;
                    if (c2667w0 == null) {
                        c2667w0 = new C2667w0();
                        c2667w0.f8714b = EnumC2663v0.f8702i;
                        c2667w0.f8715c = false;
                        c2578b1.f8353b = c2667w0;
                    }
                    c2578b1.f8357f = c2667w0;
                }
                AbstractC0018a abstractC0018a = c2578b1.f8357f;
                if (abstractC0018a == null) {
                    C2104o.m5294t("currentDragState should not be null");
                    return;
                }
                boolean z10 = abstractC0018a instanceof C2667w0;
                EnumC3905l enumC3905l4 = EnumC3905l.f12812g;
                EnumC3905l enumC3905l5 = EnumC3905l.f12813h;
                if (z10) {
                    C2667w0 c2667w02 = (C2667w0) abstractC0018a;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (!AbstractC0063p.m417j((C3287b) arrayList.get(i10))) {
                            return;
                        }
                    }
                    C3287b c3287b = (C3287b) AbstractC4166m.m8422t1(arrayList);
                    int i11 = AbstractC2573a1.f8342a[c2667w02.f8714b.ordinal()];
                    EnumC2663v0 enumC2663v0 = EnumC2663v0.f8701h;
                    EnumC2663v0 enumC2663v02 = EnumC2663v0.f8700g;
                    EnumC2663v0 enumC2663v03 = i11 == 1 ? !abstractC2639p0.mo6059C1() ? enumC2663v02 : enumC2663v0 : c2667w02.f8714b;
                    c2667w02.f8714b = enumC2663v03;
                    if (enumC3905l == enumC3905l4 && enumC2663v03 == enumC2663v0) {
                        c3287b.f10458i = true;
                        c2667w02.f8715c = true;
                    }
                    if (enumC3905l == enumC3905l5) {
                        if (enumC2663v03 == enumC2663v02) {
                            C2578b1.m6044c(c2578b1, c3287b, c3287b.f10450a, 0L, 12);
                            return;
                        }
                        if (c2667w02.f8715c) {
                            c2578b1.m6049f(c3287b, c3287b, new C3286a(i9), 0L);
                            c2578b1.m6048e(c3287b, new C3286a(i9), 0L);
                            long j3 = c3287b.f10450a;
                            C2679z0 c2679z0 = c2578b1.f8354c;
                            if (c2679z0 == null) {
                                c2679z0 = new C2679z0();
                                c2679z0.f8733b = Long.MAX_VALUE;
                                c2578b1.f8354c = c2679z0;
                            }
                            c2679z0.f8733b = j3;
                            c2578b1.f8357f = c2679z0;
                            return;
                        }
                        return;
                    }
                    return;
                }
                boolean z11 = abstractC0018a instanceof C2675y0;
                EnumC3905l enumC3905l6 = EnumC3905l.f12814i;
                Object obj5 = null;
                if (!z11) {
                    if (abstractC0018a instanceof C2671x0) {
                        C2671x0 c2671x0 = (C2671x0) abstractC0018a;
                        if (enumC3905l != enumC3905l6) {
                            return;
                        }
                        int size2 = arrayList.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size2) {
                                z9 = true;
                                break;
                            } else {
                                if (((C3287b) arrayList.get(i12)).f10458i) {
                                    z9 = false;
                                    break;
                                }
                                i12++;
                            }
                        }
                        int size3 = arrayList.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size3) {
                                break;
                            }
                            if (!((C3287b) arrayList.get(i13)).f10453d) {
                                i13++;
                            } else if (!arrayList.isEmpty()) {
                                if (z9) {
                                    long jM399I = AbstractC0063p.m399I((C3287b) AbstractC4166m.m8422t1(arrayList), abstractC2639p0.f8618w, new C3286a(i9));
                                    C3287b c3287b2 = c2671x0.f8720b;
                                    c3287b2.getClass();
                                    long jM2041d = C0807b.m2041d(jM399I, AbstractC0063p.m399I(c3287b2, abstractC2639p0.f8618w, new C3286a(i9)));
                                    C3287b c3287b3 = c2671x0.f8720b;
                                    if (c3287b3 != null) {
                                        C2578b1.m6044c(c2578b1, c3287b3, c2671x0.f8721c, jM2041d, 8);
                                        return;
                                    } else {
                                        C2104o.m5294t("AwaitGesturePickup.initialDown was not initialized.");
                                        return;
                                    }
                                }
                                return;
                            }
                        }
                        c2578b1.m6045a();
                        return;
                    }
                    if (!(abstractC0018a instanceof C2679z0)) {
                        C3193a.m6822k();
                        return;
                    }
                    C2679z0 c2679z02 = (C2679z0) abstractC0018a;
                    if (enumC3905l != enumC3905l5) {
                        return;
                    }
                    long j4 = c2679z02.f8733b;
                    int size4 = arrayList.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size4) {
                            obj = null;
                            break;
                        }
                        obj = arrayList.get(i14);
                        if (AbstractC3913s.m8112e(((C3287b) obj).f10450a, j4)) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                    C3287b c3287b4 = (C3287b) obj;
                    if (c3287b4 == null) {
                        return;
                    }
                    boolean zM410c = AbstractC0063p.m410c(c3287b4);
                    C2670x c2670x = C2670x.f8719a;
                    if (!zM410c) {
                        if (c3287b4.f10458i) {
                            abstractC2639p0.m6108v1(c2670x);
                            return;
                        } else {
                            if (C0807b.m2040c(AbstractC0063p.m398H(c3287b4, abstractC2639p0.f8618w, new C3286a(i9), true)) == 0.0f) {
                                return;
                            }
                            c2578b1.m6048e(c3287b4, new C3286a(i9), AbstractC0063p.m398H(c3287b4, abstractC2639p0.f8618w, new C3286a(i9), false));
                            c3287b4.f10458i = true;
                            return;
                        }
                    }
                    int size5 = arrayList.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size5) {
                            obj2 = null;
                            break;
                        }
                        obj2 = arrayList.get(i15);
                        if (((C3287b) obj2).f10453d) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    C3287b c3287b5 = (C3287b) obj2;
                    if (c3287b5 != null) {
                        c2679z02.f8733b = c3287b5.f10450a;
                        return;
                    }
                    if (c3287b4.f10458i || !AbstractC0063p.m410c(c3287b4)) {
                        abstractC2639p0.m6108v1(c2670x);
                    } else {
                        AbstractC0063p.m409b(c2578b1.m6047d(), c3287b4, abstractC2639p0.f8618w, new C3286a(i9), c2578b1.f8361j, c2578b1.f8363l);
                        float fMo10620e = ((InterfaceC5905l2) AbstractC5618k.m10152h(abstractC2639p0, AbstractC5888h1.f23938t)).mo10620e();
                        long jM6030j = c2578b1.m6047d().m6030j(AbstractC0000a.m59d(fMo10620e, fMo10620e));
                        C4082b c4082b = (C4082b) c2578b1.m6047d().f8339h;
                        C4084d c4084d = c4082b.f13523a;
                        C4081a[] c4081aArr = c4084d.f13532d;
                        AbstractC4165l.m8387v0(0, c4081aArr.length, null, c4081aArr);
                        c4084d.f13533e = 0;
                        C4084d c4084d2 = c4082b.f13524b;
                        C4081a[] c4081aArr2 = c4084d2.f13532d;
                        AbstractC4165l.m8387v0(0, c4081aArr2.length, null, c4081aArr2);
                        c4084d2.f13533e = 0;
                        c4082b.f13525c = 0L;
                        abstractC2639p0.m6108v1(new C2572a0(AbstractC2651s0.m6113c(jM6030j), true));
                    }
                    c2578b1.m6045a();
                    return;
                }
                C2675y0 c2675y0 = (C2675y0) abstractC0018a;
                if (enumC3905l == enumC3905l4) {
                    return;
                }
                int size6 = arrayList.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size6) {
                        enumC3905l2 = enumC3905l5;
                        enumC3905l3 = enumC3905l6;
                        obj3 = null;
                        break;
                    }
                    obj3 = arrayList.get(i16);
                    enumC3905l3 = enumC3905l6;
                    enumC3905l2 = enumC3905l5;
                    if (AbstractC3913s.m8112e(((C3287b) obj3).f10450a, c2675y0.f8729c)) {
                        break;
                    }
                    i16++;
                    enumC3905l6 = enumC3905l3;
                    enumC3905l5 = enumC3905l2;
                }
                C3287b c3287b6 = (C3287b) obj3;
                if (c3287b6 == null) {
                    int size7 = arrayList.size();
                    int i17 = 0;
                    while (true) {
                        if (i17 >= size7) {
                            obj4 = null;
                            break;
                        }
                        obj4 = arrayList.get(i17);
                        if (((C3287b) obj4).f10453d) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                    c3287b6 = (C3287b) obj4;
                    if (c3287b6 == null) {
                        c2578b1.m6045a();
                        return;
                    }
                    c2675y0.f8729c = c3287b6.f10450a;
                }
                C3287b c3287b7 = c3287b6;
                if (enumC3905l == enumC3905l2) {
                    if (c3287b7.f10458i) {
                        C3287b c3287b8 = c2675y0.f8728b;
                        if (c3287b8 == null) {
                            C2104o.m5294t("AwaitTouchSlop.initialDown was not initialized");
                            return;
                        }
                        long j5 = c2675y0.f8729c;
                        C2575a3 c2575a3 = c2578b1.f8360i;
                        if (c2575a3 == null) {
                            C2104o.m5294t("AwaitTouchSlop.touchSlopDetector was not initialized");
                            return;
                        }
                        c2578b1.m6046b(c3287b8, j5, c2575a3);
                    } else if (AbstractC0063p.m410c(c3287b7)) {
                        int size8 = arrayList.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 >= size8) {
                                break;
                            }
                            Object obj6 = arrayList.get(i18);
                            if (((C3287b) obj6).f10453d) {
                                obj5 = obj6;
                                break;
                            }
                            i18++;
                        }
                        C3287b c3287b9 = (C3287b) obj5;
                        if (c3287b9 == null) {
                            c2578b1.m6045a();
                        } else {
                            c2675y0.f8729c = c3287b9.f10450a;
                        }
                    } else {
                        InterfaceC5905l2 interfaceC5905l2 = (InterfaceC5905l2) AbstractC5618k.m10152h(abstractC2639p0, AbstractC5888h1.f23938t);
                        float f3 = AbstractC2615j0.f8497a;
                        float fMo10228f = interfaceC5905l2.mo10228f();
                        C2575a3 c2575a32 = c2578b1.f8360i;
                        if (c2575a32 == null) {
                            C2104o.m5294t("Touch slop detector not initialized.");
                            return;
                        }
                        long jM6042a = c2575a32.m6042a(AbstractC0063p.m398H(c3287b7, abstractC2639p0.f8618w, new C3286a(i9), true), fMo10228f, true);
                        if ((jM6042a & 9223372034707292159L) != 9205357640488583168L) {
                            c3287b7.f10458i = true;
                            C3287b c3287b10 = c2675y0.f8728b;
                            c3287b10.getClass();
                            c2578b1 = c2578b1;
                            c2578b1.m6049f(c3287b10, c3287b7, new C3286a(i9), jM6042a);
                            c2578b1.m6048e(c3287b7, new C3286a(i9), jM6042a);
                            long j10 = c3287b7.f10450a;
                            C2679z0 c2679z03 = c2578b1.f8354c;
                            if (c2679z03 == null) {
                                c2679z03 = new C2679z0();
                                c2679z03.f8733b = Long.MAX_VALUE;
                                c2578b1.f8354c = c2679z03;
                            }
                            c2679z03.f8733b = j10;
                            c2578b1.f8357f = c2679z03;
                        } else {
                            c2578b1 = c2578b1;
                            c2675y0.f8730d = true;
                        }
                    }
                }
                if (enumC3905l == enumC3905l3 && c2675y0.f8730d) {
                    if (!c3287b7.f10458i) {
                        c2675y0.f8730d = false;
                        return;
                    }
                    C3287b c3287b11 = c2675y0.f8728b;
                    if (c3287b11 == null) {
                        C2104o.m5294t("AwaitTouchSlop.initialDown was not initialized");
                        return;
                    }
                    long j11 = c2675y0.f8729c;
                    C2575a3 c2575a33 = c2578b1.f8360i;
                    if (c2575a33 != null) {
                        c2578b1.m6046b(c3287b11, j11, c2575a33);
                    } else {
                        C2104o.m5294t("AwaitTouchSlop.touchSlopDetector was not initialized");
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.InterfaceC2184k0
    /* JADX INFO: renamed from: X */
    public final boolean mo5419X(C3914t c3914t) {
        if (AbstractC3913s.m8109b(c3914t)) {
            return this.f8620y;
        }
        if (!AbstractC3913s.m8111d(c3914t)) {
            if (this.f8615M == null) {
                this.f8615M = new C2575a3(this.f8618w);
            }
            float fMo10228f = ((InterfaceC5905l2) AbstractC5618k.m10152h(this, AbstractC5888h1.f23938t)).mo10228f();
            long jM8115h = AbstractC3913s.m8115h(c3914t, false);
            C2575a3 c2575a3 = this.f8615M;
            if (c2575a3 == null) {
                C2104o.m5294t("Touch slop detector not initialized.");
                return false;
            }
            if (!C0807b.m2039b(c2575a3.m6042a(jM8115h, fMo10228f, false), 9205357640488583168L)) {
                long jM2042e = C0807b.m2042e(c2575a3.f8348b, jM8115h);
                double dAtan2 = ((double) (((float) Math.atan2(Math.abs(Float.intBitsToFloat((int) (jM2042e & 4294967295L))), Math.abs(Float.intBitsToFloat((int) (jM2042e >> 32))))) * Opcodes.GETFIELD)) / 3.141592653589793d;
                EnumC2640p1 enumC2640p1 = c2575a3.f8347a;
                int i9 = enumC2640p1 == null ? -1 : AbstractC2681z2.f8738a[enumC2640p1.ordinal()];
                if (i9 == 1 ? dAtan2 < 30.0d : !(i9 != 2 || dAtan2 <= 30.0d)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5656w1
    /* JADX INFO: renamed from: b0 */
    public final void mo1611b0() {
        if (this.f8607E) {
            m6106s1();
            if (this.f8606D) {
                m6109y1().mo8208p(C2670x.f8719a);
            }
            this.f8613K = null;
        }
        this.f8607E = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        this.f8606D = false;
        m6105q1();
        this.f8617O = 0L;
        C2187l0 c2187l0 = this.f8603A;
        if (c2187l0 != null) {
            m10123l1(c2187l0);
        }
        this.f8603A = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q1 */
    public final void m6105q1() {
        C2848b c2848b = this.f8605C;
        if (c2848b != null) {
            C2857k c2857k = this.f8621z;
            if (c2857k != null) {
                c2857k.m6282b(new C2847a(c2848b));
            }
            this.f8605C = null;
        }
    }

    /* JADX INFO: renamed from: r1 */
    public abstract Object mo6061r1(C2635o0 c2635o0, C2635o0 c2635o02);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s1 */
    public final void m6106s1() {
        C2654t c2654t = this.f8608F;
        EnumC2650s enumC2650s = EnumC2650s.f8652i;
        if (c2654t == null) {
            c2654t = new C2654t();
            c2654t.f8662g = enumC2650s;
            c2654t.f8663h = false;
            this.f8608F = c2654t;
        }
        c2654t.f8662g = enumC2650s;
        c2654t.f8663h = false;
        this.f8612J = c2654t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t1 */
    public final void m6107t1(C3914t c3914t, long j3, C2575a3 c2575a3) {
        C2658u c2658u = this.f8611I;
        if (c2658u == null) {
            c2658u = new C2658u();
            c2658u.f8680g = null;
            c2658u.f8681h = Long.MAX_VALUE;
            this.f8611I = c2658u;
        }
        c2658u.f8680g = c3914t;
        c2658u.f8681h = j3;
        c2575a3.f8348b = 0L;
        this.f8612J = c2658u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v1 */
    public final void m6108v1(AbstractC2577b0 abstractC2577b0) {
        if ((abstractC2577b0 instanceof C2678z) && !this.f8606D) {
            this.f8606D = true;
            m6103D1();
        }
        m6109y1().mo8208p(abstractC2577b0);
    }

    /* JADX INFO: renamed from: w1 */
    public abstract void mo6062w1(long j3);

    /* JADX INFO: renamed from: x1 */
    public abstract void mo6063x1(C2572a0 c2572a0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p224p1.InterfaceC3288c
    /* JADX INFO: renamed from: y0 */
    public final void mo5382y0() {
        C2578b1 c2578b1 = this.f8616N;
        if (c2578b1 != null) {
            c2578b1.m6045a();
            AbstractC2639p0 abstractC2639p0 = c2578b1.f8352a;
            if (abstractC2639p0.f8606D) {
                abstractC2639p0.m6108v1(C2670x.f8719a);
            }
            c2578b1.f8358g = null;
            C0016a c0016a = c2578b1.f8362k;
            c0016a.f55h = 0;
            ((C0967y) c0016a.f56i).f3044b = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y1 */
    public final InterfaceC3975g m6109y1() {
        C3971c c3971c = this.f8604B;
        if (c3971c != null) {
            return c3971c;
        }
        C2104o.m5294t("Events channel not initialized.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z1 */
    public final C2571a m6110z1() {
        C2571a c2571a = this.f8613K;
        if (c2571a != null) {
            return c2571a;
        }
        C2104o.m5294t("Velocity Tracker not initialized.");
        return null;
    }
}
