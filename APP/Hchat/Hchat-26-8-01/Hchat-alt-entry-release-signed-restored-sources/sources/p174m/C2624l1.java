package p174m;

import android.view.ViewConfiguration;
import ci.C0575c;
import gg.C1422r;
import gg.C1425u;
import ng.C3013k;
import p000a.AbstractC0000a;
import p014b.C0126e;
import p049d9.C0750k;
import p057e1.C0807b;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1235p;
import p116i.AbstractC1742d;
import p136j8.C2104o;
import p249qg.AbstractC3603v;
import p249qg.C3560e1;
import p267s1.C3903k;
import p267s1.C3914t;
import p276sf.C3967n;
import p279t1.C4084d;
import p293u2.C4247q;
import p293u2.InterfaceC4233c;
import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;
import sg.AbstractC3978j;
import sg.C3971c;
import sg.C3977i;
import tf.AbstractC4166m;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: m.l1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2624l1 extends AbstractC2636o1 {

    /* JADX INFO: renamed from: f */
    public final C2571a f8537f;

    /* JADX INFO: renamed from: g */
    public final C3971c f8538g;

    /* JADX INFO: renamed from: h */
    public C3560e1 f8539h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2624l1(C2637o2 c2637o2, C2571a c2571a, C2589d2 c2589d2, InterfaceC4233c interfaceC4233c) {
        super(c2637o2, c2589d2, interfaceC4233c);
        this.f8537f = c2571a;
        this.f8538g = AbstractC3978j.m8218a(Integer.MAX_VALUE, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r0v18, types: [fg.p, gg.a] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m6079c(C2624l1 c2624l1, C2637o2 c2637o2, C2608h1 c2608h1, float f3, float f10, AbstractC6038c abstractC6038c) {
        C2612i1 c2612i1;
        C3967n c3967n;
        C1422r c1422r;
        float f11;
        C2637o2 c2637o22;
        c2624l1.getClass();
        C0126e c0126e = c2624l1.f8587e;
        if (abstractC6038c instanceof C2612i1) {
            c2612i1 = (C2612i1) abstractC6038c;
            int i9 = c2612i1.f8490l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2612i1.f8490l = i9 - Integer.MIN_VALUE;
            } else {
                c2612i1 = new C2612i1(c2624l1, abstractC6038c);
            }
        }
        C2612i1 c2612i12 = c2612i1;
        Object obj = c2612i12.f8488j;
        int i10 = c2612i12.f8490l;
        C3967n c3967n2 = C3967n.f12976a;
        Object obj2 = EnumC5799a.f23547g;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            C1425u c1425u = new C1425u();
            c1425u.f4738g = c2608h1;
            long j3 = c2608h1.f8453b;
            long j4 = c2608h1.f8452a;
            c3967n = c3967n2;
            ((C4084d) c0126e.f332h).m8265a(j3, Float.intBitsToFloat((int) (j4 >> 32)));
            ((C4084d) c0126e.f333i).m8265a(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
            C2608h1 c2608h1M6081g = m6081g(c2624l1.f8538g);
            if (c2608h1M6081g != null) {
                long j5 = c2608h1M6081g.f8453b;
                long j10 = c2608h1M6081g.f8452a;
                ((C4084d) c0126e.f332h).m8265a(j5, Float.intBitsToFloat((int) (j10 >> 32)));
                ((C4084d) c0126e.f333i).m8265a(j5, Float.intBitsToFloat((int) (j10 & 4294967295L)));
                c1425u.f4738g = ((C2608h1) c1425u.f4738g).m6058a(c2608h1M6081g);
            }
            C1422r c1422r2 = new C1422r();
            float fM6094g = c2637o2.m6094g(c2637o2.m6092e(((C2608h1) c1425u.f4738g).f8452a));
            c1422r2.f4735g = fM6094g;
            if (!AbstractC2628m1.m6084a(fM6094g)) {
                C1425u c1425u2 = new C1425u();
                c1425u2.f4738g = AbstractC1742d.m4366b(0.0f, 0.0f, 30);
                InterfaceC1235p c2616j1 = new C2616j1(c1422r2, c1425u2, c1425u, f3, c2624l1, f10, c2637o2, null);
                c2612i12.f8485g = c2637o2;
                c2612i12.f8486h = c1422r2;
                c2612i12.f8487i = f10;
                c2612i12.f8490l = 1;
                if (c2624l1.m6087b(c2616j1, c2612i12) != obj2) {
                    c1422r = c1422r2;
                    f11 = f10;
                    c2637o22 = c2637o2;
                }
            }
        }
        if (i10 != 1) {
            if (i10 == 2) {
                AbstractC1089i.m2732I0(obj);
                return c3967n2;
            }
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f11 = c2612i12.f8487i;
        c1422r = c2612i12.f8486h;
        c2637o22 = c2612i12.f8485g;
        AbstractC1089i.m2732I0(obj);
        c3967n = c3967n2;
        long jM59d = AbstractC0000a.m59d(((C4084d) c0126e.f332h).m8266b(Float.MAX_VALUE), ((C4084d) c0126e.f333i).m8266b(Float.MAX_VALUE));
        if (jM59d == 0) {
            float fM6091d = c2637o22.m6091d(Math.signum(c1422r.f4735g)) * Math.min(Math.abs(c1422r.f4735g) / 100, f11) * 1000;
            if (fM6091d == 0.0f) {
                jM59d = 0;
            } else {
                jM59d = c2637o22.f8591d == EnumC2640p1.f8623h ? AbstractC0000a.m59d(fM6091d, 0.0f) : AbstractC0000a.m59d(0.0f, fM6091d);
            }
        }
        ?? r02 = c2624l1.f8584b;
        C4247q c4247q = new C4247q(jM59d);
        c2612i12.f8485g = null;
        c2612i12.f8486h = null;
        c2612i12.f8490l = 2;
        return r02.invoke(c4247q, c2612i12) == obj2 ? obj2 : c3967n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m6080d(C2624l1 c2624l1, C1425u c1425u, C1422r c1422r, C2637o2 c2637o2, C1425u c1425u2, long j3, AbstractC6038c abstractC6038c) {
        C2620k1 c2620k1;
        C1422r c1422r2;
        C2637o2 c2637o22;
        C1425u c1425u3;
        boolean z9;
        if (abstractC6038c instanceof C2620k1) {
            c2620k1 = (C2620k1) abstractC6038c;
            int i9 = c2620k1.f8529m;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2620k1.f8529m = i9 - Integer.MIN_VALUE;
            } else {
                c2620k1 = new C2620k1(abstractC6038c);
            }
        }
        Object objM7571y = c2620k1.f8528l;
        int i10 = c2620k1.f8529m;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(objM7571y);
            if (j3 < 0) {
                return Boolean.FALSE;
            }
            C0575c c0575c = new C0575c(c2624l1, null, 7);
            c2620k1.f8523g = c2624l1;
            c2620k1.f8524h = c1425u;
            c2620k1.f8525i = c1422r;
            c2620k1.f8526j = c2637o2;
            c2620k1.f8527k = c1425u2;
            c2620k1.f8529m = 1;
            objM7571y = AbstractC3603v.m7571y(j3, c0575c, c2620k1);
            EnumC5799a enumC5799a = EnumC5799a.f23547g;
            if (objM7571y == enumC5799a) {
                return enumC5799a;
            }
            c1422r2 = c1422r;
            c2637o22 = c2637o2;
            c1425u3 = c1425u2;
        } else {
            if (i10 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C1425u c1425u4 = c2620k1.f8527k;
            C2637o2 c2637o23 = c2620k1.f8526j;
            c1422r2 = c2620k1.f8525i;
            C1425u c1425u5 = c2620k1.f8524h;
            C2624l1 c2624l12 = c2620k1.f8523g;
            AbstractC1089i.m2732I0(objM7571y);
            c1425u3 = c1425u4;
            c2637o22 = c2637o23;
            c1425u = c1425u5;
            c2624l1 = c2624l12;
        }
        C2608h1 c2608h1 = (C2608h1) objM7571y;
        if (c2608h1 != null) {
            boolean z10 = ((C2608h1) c1425u.f4738g).f8454c;
            long j4 = c2608h1.f8452a;
            c1425u.f4738g = new C2608h1(j4, c2608h1.f8453b, z10);
            c1422r2.f4735g = c2637o22.m6096i(c2637o22.m6092e(j4));
            c1425u3.f4738g = AbstractC1742d.m4366b(0.0f, 0.0f, 30);
            C0126e c0126e = c2624l1.f8587e;
            long j5 = c2608h1.f8453b;
            long j10 = c2608h1.f8452a;
            ((C4084d) c0126e.f332h).m8265a(j5, Float.intBitsToFloat((int) (j10 >> 32)));
            ((C4084d) c0126e.f333i).m8265a(j5, Float.intBitsToFloat((int) (j10 & 4294967295L)));
            z9 = !AbstractC2628m1.m6084a(c1422r2.f4735g);
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static C2608h1 m6081g(C3971c c3971c) {
        C2608h1 c2608h1 = null;
        C3013k c3013kM3175B = AbstractC1184v0.m3175B(new C0750k((Object) new C2603g1(c3971c, 0), (InterfaceC5557c) (0 == true ? 1 : 0), 2));
        while (c3013kM3175B.hasNext()) {
            C2608h1 c2608h1M6058a = (C2608h1) c3013kM3175B.next();
            if (c2608h1 != null) {
                c2608h1M6058a = c2608h1.m6058a(c2608h1M6058a);
            }
            c2608h1 = c2608h1M6058a;
        }
        return c2608h1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final float m6082e(C2629m2 c2629m2, float f3) {
        C2637o2 c2637o2 = this.f8583a;
        long jM6095h = c2637o2.m6095h(c2637o2.m6091d(f3));
        C2637o2 c2637o22 = c2629m2.f8556a;
        return c2637o2.m6094g(c2637o2.m6092e(c2637o22.m6090c(c2637o22.f8598k, jM6095h, 1)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: f */
    public final boolean m6083f(C3903k c3903k) {
        long j3;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f8537f.f8339h;
        float f3 = -viewConfiguration.getScaledVerticalScrollFactor();
        float f10 = -viewConfiguration.getScaledHorizontalScrollFactor();
        ?? r2 = c3903k.f12800a;
        C0807b c0807b = new C0807b(0L);
        int size = r2.size();
        boolean zMo5461d = false;
        int i9 = 0;
        while (true) {
            j3 = c0807b.f2414a;
            if (i9 >= size) {
                break;
            }
            c0807b = new C0807b(C0807b.m2042e(j3, ((C3914t) r2.get(i9)).f12843j));
            i9++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 >> 32)) * f10)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) * f3)) & 4294967295L);
        C2637o2 c2637o2 = this.f8583a;
        float fM6096i = c2637o2.m6096i(c2637o2.m6092e(jFloatToRawIntBits));
        if (fM6096i != 0.0f) {
            InterfaceC2613i2 interfaceC2613i2 = c2637o2.f8588a;
            zMo5461d = fM6096i > 0.0f ? interfaceC2613i2.mo5461d() : interfaceC2613i2.mo5460c();
        }
        if (zMo5461d) {
            return !(this.f8538g.mo8208p(new C2608h1(jFloatToRawIntBits, ((C3914t) AbstractC4166m.m8422t1(c3903k.f12800a)).f12835b, false)) instanceof C3977i);
        }
        return this.f8586d;
    }
}
