package p041H0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import com.bumptech.glide.AbstractC1923e;
import com.bumptech.glide.AbstractC1925g;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;
import p000A.C0038T0;
import p000A.C0072l0;
import p007B0.C0190d;
import p007B0.C0212z;
import p007B0.InterfaceC0195i;
import p011B4.AbstractC0231b;
import p023E0.AbstractC0277a;
import p027E4.C0330q;
import p029F0.AbstractC0388a;
import p029F0.AbstractC0435z;
import p029F0.C0372J;
import p029F0.C0375M;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0430v;
import p047I0.AbstractC0681L;
import p047I0.C0769w0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p082Q0.C1168b;
import p105V.C1483e;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p153e1.C2014j;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p158f0.AbstractC2074f;
import p158f0.AbstractC2086r;
import p169h0.AbstractC2206o;
import p179i4.AbstractC2352g;
import p186k.AbstractC2412I;
import p186k.AbstractC2416M;
import p186k.C2404A;
import p186k.C2409F;
import p186k.C2441w;
import p186k.C2444z;
import p204n0.C2682a;
import p204n0.C2683b;
import p204n0.C2684c;
import p204n0.C2685d;
import p211o0.AbstractC2728C;
import p211o0.AbstractC2744c;
import p211o0.AbstractC2752k;
import p211o0.AbstractC2767z;
import p211o0.C2730E;
import p211o0.C2731F;
import p211o0.C2732G;
import p211o0.C2733H;
import p211o0.C2735J;
import p211o0.C2741P;
import p211o0.C2748g;
import p211o0.C2750i;
import p211o0.C2753l;
import p211o0.C2757p;
import p211o0.C2762u;
import p211o0.InterfaceC2738M;
import p211o0.InterfaceC2760s;
import p211o0.InterfaceC2765x;
import p222q0.C2900a;
import p222q0.C2901b;
import p228r0.C3029b;
import p228r0.InterfaceC3031d;

/* JADX INFO: renamed from: H0.h0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0596h0 extends AbstractC0572Q implements InterfaceC0376N, InterfaceC0430v, InterfaceC0616r0 {

    /* JADX INFO: renamed from: P */
    public static final C2735J f1912P = new C2735J();

    /* JADX INFO: renamed from: Q */
    public static final C0623v f1913Q = new C0623v();

    /* JADX INFO: renamed from: R */
    public static final float[] f1914R = C2730E.m4782a();

    /* JADX INFO: renamed from: S */
    public static final C0592f0 f1915S = new C0592f0(0);

    /* JADX INFO: renamed from: T */
    public static final C0592f0 f1916T = new C0592f0(1);

    /* JADX INFO: renamed from: A */
    public InterfaceC0378P f1917A;

    /* JADX INFO: renamed from: B */
    public C2444z f1918B;

    /* JADX INFO: renamed from: D */
    public float f1920D;

    /* JADX INFO: renamed from: E */
    public C2682a f1921E;

    /* JADX INFO: renamed from: F */
    public C0623v f1922F;

    /* JADX INFO: renamed from: H */
    public boolean f1924H;

    /* JADX INFO: renamed from: I */
    public boolean f1925I;

    /* JADX INFO: renamed from: J */
    public C3029b f1926J;

    /* JADX INFO: renamed from: K */
    public InterfaceC2760s f1927K;

    /* JADX INFO: renamed from: L */
    public C0372J f1928L;

    /* JADX INFO: renamed from: N */
    public boolean f1930N;

    /* JADX INFO: renamed from: O */
    public InterfaceC0612p0 f1931O;

    /* JADX INFO: renamed from: r */
    public final C0564I f1932r;

    /* JADX INFO: renamed from: s */
    public AbstractC0596h0 f1933s;

    /* JADX INFO: renamed from: t */
    public AbstractC0596h0 f1934t;

    /* JADX INFO: renamed from: u */
    public boolean f1935u;

    /* JADX INFO: renamed from: v */
    public boolean f1936v;

    /* JADX INFO: renamed from: w */
    public InterfaceC1601c f1937w;

    /* JADX INFO: renamed from: x */
    public InterfaceC2007c f1938x;

    /* JADX INFO: renamed from: y */
    public EnumC2017m f1939y;

    /* JADX INFO: renamed from: z */
    public float f1940z = 0.8f;

    /* JADX INFO: renamed from: C */
    public long f1919C = 0;

    /* JADX INFO: renamed from: G */
    public InterfaceC2738M f1923G = AbstractC2767z.f8776b;

    /* JADX INFO: renamed from: M */
    public final C0594g0 f1929M = new C0594g0(this, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0596h0(C0564I c0564i) {
        this.f1932r = c0564i;
        this.f1938x = c0564i.f1692C;
        this.f1939y = c0564i.f1693D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l1 */
    public static AbstractC0596h0 m969l1(InterfaceC0430v interfaceC0430v) {
        AbstractC0596h0 abstractC0596h0;
        C0375M c0375m = interfaceC0430v instanceof C0375M ? (C0375M) interfaceC0430v : null;
        if (c0375m != null && (abstractC0596h0 = c0375m.f1189d.f1785r) != null) {
            return abstractC0596h0;
        }
        AbstractC1665j.m2983c(interfaceC0430v, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (AbstractC0596h0) interfaceC0430v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0572Q
    /* JADX INFO: renamed from: A0 */
    public final AbstractC0572Q mo879A0() {
        return this.f1934t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: B */
    public final long mo631B(long j5) {
        if (!mo981R0().f7199q) {
            AbstractC0277a.m483b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return mo635O(AbstractC0435z.m693f(this), ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(this.f1932r)).m1300H(j5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0572Q
    /* JADX INFO: renamed from: B0 */
    public final long mo880B0() {
        return this.f1919C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: D */
    public final boolean mo632D() {
        return mo981R0().f7199q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0572Q
    /* JADX INFO: renamed from: F0 */
    public final void mo883F0() {
        mo666i0(this.f1919C, this.f1920D, this.f1937w);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G0 */
    public final void m970G0(AbstractC0596h0 abstractC0596h0, C2682a c2682a, boolean z5) {
        if (abstractC0596h0 == this) {
            return;
        }
        AbstractC0596h0 abstractC0596h02 = this.f1934t;
        if (abstractC0596h02 != null) {
            abstractC0596h02.m970G0(abstractC0596h0, c2682a, z5);
        }
        long j5 = this.f1919C;
        float f2 = (int) (j5 >> 32);
        c2682a.f8552a -= f2;
        c2682a.f8554c -= f2;
        float f5 = (int) (j5 & 4294967295L);
        c2682a.f8553b -= f5;
        c2682a.f8555d -= f5;
        InterfaceC0612p0 interfaceC0612p0 = this.f1931O;
        if (interfaceC0612p0 != null) {
            C0769w0 c0769w0 = (C0769w0) interfaceC0612p0;
            float[] fArrM1279a = c0769w0.m1279a();
            if (!c0769w0.f2413v) {
                if (fArrM1279a == null) {
                    c2682a.f8552a = 0.0f;
                    c2682a.f8553b = 0.0f;
                    c2682a.f8554c = 0.0f;
                    c2682a.f8555d = 0.0f;
                } else {
                    C2730E.m4784c(fArrM1279a, c2682a);
                }
            }
            if (this.f1936v && z5) {
                long j6 = this.f1208f;
                c2682a.m4640a(0.0f, 0.0f, (int) (j6 >> 32), (int) (j6 & 4294967295L));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0616r0
    /* JADX INFO: renamed from: H */
    public final boolean mo800H() {
        return (this.f1931O == null || this.f1935u || !this.f1932r.m799G()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H0 */
    public final long m971H0(AbstractC0596h0 abstractC0596h0, long j5) {
        if (abstractC0596h0 == this) {
            return j5;
        }
        AbstractC0596h0 abstractC0596h02 = this.f1934t;
        return (abstractC0596h02 == null || AbstractC1665j.m2981a(abstractC0596h0, abstractC0596h02)) ? m978O0(j5) : m978O0(abstractC0596h02.m971H0(abstractC0596h0, j5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: I */
    public final void mo633I(float[] fArr) {
        InterfaceC0614q0 interfaceC0614q0M866a = AbstractC0567L.m866a(this.f1932r);
        AbstractC0596h0 abstractC0596h0M969l1 = m969l1(AbstractC0435z.m693f(this));
        m1003o1(abstractC0596h0M969l1, fArr);
        if (interfaceC0614q0M866a instanceof InterfaceC0195i) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0772y) ((InterfaceC0195i) interfaceC0614q0M866a)).m1313s(fArr);
            return;
        }
        long jMo640d = abstractC0596h0M969l1.mo640d(0L);
        if ((9223372034707292159L & jMo640d) != 9205357640488583168L) {
            C2730E.m4787f(fArr, Float.intBitsToFloat((int) (jMo640d >> 32)), Float.intBitsToFloat((int) (jMo640d & 4294967295L)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I0 */
    public final long m972I0(long j5) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) - mo664g0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) - mo663d0();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    public final float m973J0(long j5, long j6) {
        if (mo664g0() >= Float.intBitsToFloat((int) (j6 >> 32)) && mo663d0() >= Float.intBitsToFloat((int) (j6 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jM972I0 = m972I0(j6);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM972I0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM972I0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j5 >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - mo664g0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - mo663d0()))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i5 = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i5) <= fIntBitsToFloat) {
                int i6 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i6) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i5);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i6);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: K */
    public final C2684c mo634K(InterfaceC0430v interfaceC0430v, boolean z5) {
        if (!mo981R0().f7199q) {
            AbstractC0277a.m483b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!interfaceC0430v.mo632D()) {
            AbstractC0277a.m483b("LayoutCoordinates " + interfaceC0430v + " is not attached!");
        }
        AbstractC0596h0 abstractC0596h0M969l1 = m969l1(interfaceC0430v);
        abstractC0596h0M969l1.m990a1();
        AbstractC0596h0 abstractC0596h0M977N0 = m977N0(abstractC0596h0M969l1);
        C2682a c2682a = this.f1921E;
        if (c2682a == null) {
            c2682a = new C2682a();
            this.f1921E = c2682a;
        }
        c2682a.f8552a = 0.0f;
        c2682a.f8553b = 0.0f;
        c2682a.f8554c = (int) (interfaceC0430v.mo637Q() >> 32);
        c2682a.f8555d = (int) (interfaceC0430v.mo637Q() & 4294967295L);
        while (abstractC0596h0M969l1 != abstractC0596h0M977N0) {
            abstractC0596h0M969l1.m998i1(c2682a, z5, false);
            if (c2682a.m4641b()) {
                return C2684c.f8557e;
            }
            abstractC0596h0M969l1 = abstractC0596h0M969l1.f1934t;
            AbstractC1665j.m2982b(abstractC0596h0M969l1);
        }
        m970G0(abstractC0596h0M977N0, c2682a, z5);
        return new C2684c(c2682a.f8552a, c2682a.f8553b, c2682a.f8554c, c2682a.f8555d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K0 */
    public final void m974K0(InterfaceC2760s interfaceC2760s, C3029b c3029b) {
        boolean z5;
        Canvas canvas;
        boolean z6;
        boolean z7;
        float f2;
        InterfaceC0612p0 interfaceC0612p0 = this.f1931O;
        if (interfaceC0612p0 == null) {
            long j5 = this.f1919C;
            float f5 = (int) (j5 >> 32);
            float f6 = (int) (j5 & 4294967295L);
            interfaceC2760s.mo4846g(f5, f6);
            m975L0(interfaceC2760s, c3029b);
            interfaceC2760s.mo4846g(-f5, -f6);
            return;
        }
        C0769w0 c0769w0 = (C0769w0) interfaceC0612p0;
        C2901b c2901b = c0769w0.f2407p;
        c0769w0.m1284f();
        c0769w0.f2414w = c0769w0.f2395d.f9607a.mo5237G() > 0.0f;
        C0072l0 c0072l0 = c2901b.f9185e;
        c0072l0.m116v(interfaceC2760s);
        c0072l0.f308f = c3029b;
        C3029b c3029b2 = c0769w0.f2395d;
        InterfaceC2760s interfaceC2760sM106j = c2901b.mo854L().m106j();
        C3029b c3029b3 = (C3029b) c2901b.mo854L().f308f;
        InterfaceC3031d interfaceC3031d = c3029b2.f9607a;
        if (c3029b2.f9625s) {
            return;
        }
        c3029b2.m5225a();
        if (!interfaceC3031d.mo5238H()) {
            try {
                c3029b2.f9607a.mo5232B(c3029b2.f9608b, c3029b2.f9609c, c3029b2, c3029b2.f9611e);
            } catch (Throwable unused) {
            }
        }
        boolean z8 = interfaceC3031d.mo5237G() > 0.0f;
        if (z8) {
            interfaceC2760sM106j.mo4857s();
        }
        Canvas canvasM4858a = AbstractC2744c.m4858a(interfaceC2760sM106j);
        boolean zIsHardwareAccelerated = canvasM4858a.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j6 = c3029b2.f9626t;
            float f7 = (int) (j6 >> 32);
            float f8 = (int) (j6 & 4294967295L);
            long j7 = c3029b2.f9627u;
            float f9 = ((int) (j7 >> 32)) + f7;
            float f10 = f8 + ((int) (j7 & 4294967295L));
            float fMo5246a = interfaceC3031d.mo5246a();
            C2753l c2753lMo5268w = interfaceC3031d.mo5268w();
            int iMo5243M = interfaceC3031d.mo5243M();
            if (fMo5246a < 1.0f || iMo5243M != 3 || c2753lMo5268w != null || interfaceC3031d.mo5266u() == 1) {
                C2748g c2748gM4937g = c3029b2.f9622p;
                if (c2748gM4937g == null) {
                    c2748gM4937g = AbstractC2767z.m4937g();
                    c3029b2.f9622p = c2748gM4937g;
                }
                c2748gM4937g.m4867e(fMo5246a);
                c2748gM4937g.m4868f(iMo5243M);
                c2748gM4937g.m4870h(c2753lMo5268w);
                f2 = f7;
                canvasM4858a.saveLayer(f2, f8, f9, f10, (Paint) c2748gM4937g.f8737c);
            } else {
                canvasM4858a.save();
                f2 = f7;
            }
            canvasM4858a.translate(f2, f8);
            canvasM4858a.concat(interfaceC3031d.mo5231A());
        }
        boolean z9 = !zIsHardwareAccelerated && c3029b2.f9629w;
        if (z9) {
            interfaceC2760sM106j.mo4852n();
            AbstractC2767z abstractC2767zM5228d = c3029b2.m5228d();
            if (abstractC2767zM5228d instanceof C2732G) {
                InterfaceC2760s.m4918m(interfaceC2760sM106j, ((C2732G) abstractC2767zM5228d).f8677f);
            } else if (abstractC2767zM5228d instanceof C2733H) {
                C2750i c2750iM4885a = c3029b2.f9619m;
                if (c2750iM4885a != null) {
                    c2750iM4885a.f8742a.rewind();
                } else {
                    c2750iM4885a = AbstractC2752k.m4885a();
                    c3029b2.f9619m = c2750iM4885a;
                }
                C2750i.m4878b(c2750iM4885a, ((C2733H) abstractC2767zM5228d).f8678f);
                interfaceC2760sM106j.mo4844e(c2750iM4885a);
            } else {
                if (!(abstractC2767zM5228d instanceof C2731F)) {
                    throw new C0330q();
                }
                interfaceC2760sM106j.mo4844e(((C2731F) abstractC2767zM5228d).f8676f);
            }
        }
        if (c3029b3 != null) {
            C0212z c0212z = c3029b3.f9624r;
            if (!c0212z.f740a) {
                AbstractC2728C.m4780a("Only add dependencies during a tracking");
            }
            C2409F c2409f = (C2409F) c0212z.f743d;
            if (c2409f != null) {
                c2409f.m4279a(c3029b2);
            } else if (((C3029b) c0212z.f741b) != null) {
                C2409F c2409f2 = AbstractC2416M.f7817a;
                C2409F c2409f3 = new C2409F();
                C3029b c3029b4 = (C3029b) c0212z.f741b;
                AbstractC1665j.m2982b(c3029b4);
                c2409f3.m4279a(c3029b4);
                c2409f3.m4279a(c3029b2);
                c0212z.f743d = c2409f3;
                c0212z.f741b = null;
            } else {
                c0212z.f741b = c3029b2;
            }
            C2409F c2409f4 = (C2409F) c0212z.f744e;
            if (c2409f4 != null) {
                z7 = !c2409f4.m4290l(c3029b2);
            } else if (((C3029b) c0212z.f742c) != c3029b2) {
                z7 = true;
            } else {
                c0212z.f742c = null;
                z7 = false;
            }
            if (z7) {
                c3029b2.f9623q++;
            }
        }
        if (AbstractC2744c.m4858a(interfaceC2760sM106j).isHardwareAccelerated()) {
            z5 = z8;
            canvas = canvasM4858a;
            z6 = z9;
            interfaceC3031d.mo5239I(interfaceC2760sM106j);
        } else {
            C2901b c2901b2 = c3029b2.f9621o;
            if (c2901b2 == null) {
                c2901b2 = new C2901b();
                c3029b2.f9621o = c2901b2;
            }
            C0072l0 c0072l02 = c2901b2.f9185e;
            InterfaceC2007c interfaceC2007c = c3029b2.f9608b;
            EnumC2017m enumC2017m = c3029b2.f9609c;
            long jM3523F = AbstractC1925g.m3523F(c3029b2.f9627u);
            C2900a c2900a = ((C2901b) c0072l02.f309g).f9184d;
            InterfaceC2007c interfaceC2007c2 = c2900a.f9180a;
            EnumC2017m enumC2017m2 = c2900a.f9181b;
            InterfaceC2760s interfaceC2760sM106j2 = c0072l02.m106j();
            canvas = canvasM4858a;
            z6 = z9;
            long jM110n = c0072l02.m110n();
            z5 = z8;
            C3029b c3029b5 = (C3029b) c0072l02.f308f;
            c0072l02.m117w(interfaceC2007c);
            c0072l02.m118x(enumC2017m);
            c0072l02.m116v(interfaceC2760sM106j);
            c0072l02.m119y(jM3523F);
            c0072l02.f308f = c3029b2;
            interfaceC2760sM106j.mo4852n();
            try {
                c3029b2.m5227c(c2901b2);
            } finally {
                interfaceC2760sM106j.mo4851l();
                c0072l02.m117w(interfaceC2007c2);
                c0072l02.m118x(enumC2017m2);
                c0072l02.m116v(interfaceC2760sM106j2);
                c0072l02.m119y(jM110n);
                c0072l02.f308f = c3029b5;
            }
        }
        if (z6) {
            interfaceC2760sM106j.mo4851l();
        }
        if (z5) {
            interfaceC2760sM106j.mo4853o();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L0 */
    public final void m975L0(InterfaceC2760s interfaceC2760s, C3029b c3029b) {
        InterfaceC2760s interfaceC2760s2;
        C3029b c3029b2;
        AbstractC2206o abstractC2206oM982S0 = m982S0(4);
        if (abstractC2206oM982S0 == null) {
            mo996g1(interfaceC2760s, c3029b);
            return;
        }
        C0564I c0564i = this.f1932r;
        c0564i.getClass();
        C0566K sharedDrawScope = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0564i)).getSharedDrawScope();
        long jM3523F = AbstractC1925g.m3523F(this.f1208f);
        sharedDrawScope.getClass();
        C1483e c1483e = null;
        while (abstractC2206oM982S0 != null) {
            if (abstractC2206oM982S0 instanceof InterfaceC0605m) {
                interfaceC2760s2 = interfaceC2760s;
                c3029b2 = c3029b;
                sharedDrawScope.m860d(interfaceC2760s2, jM3523F, this, (InterfaceC0605m) abstractC2206oM982S0, c3029b2);
            } else {
                interfaceC2760s2 = interfaceC2760s;
                c3029b2 = c3029b;
                if ((abstractC2206oM982S0.f7188f & 4) != 0 && (abstractC2206oM982S0 instanceof AbstractC0599j)) {
                    int i5 = 0;
                    for (AbstractC2206o abstractC2206o = ((AbstractC0599j) abstractC2206oM982S0).f1943s; abstractC2206o != null; abstractC2206o = abstractC2206o.f7191i) {
                        if ((abstractC2206o.f7188f & 4) != 0) {
                            i5++;
                            if (i5 == 1) {
                                abstractC2206oM982S0 = abstractC2206o;
                            } else {
                                if (c1483e == null) {
                                    c1483e = new C1483e(new AbstractC2206o[16]);
                                }
                                if (abstractC2206oM982S0 != null) {
                                    c1483e.m2753b(abstractC2206oM982S0);
                                    abstractC2206oM982S0 = null;
                                }
                                c1483e.m2753b(abstractC2206o);
                            }
                        }
                    }
                    if (i5 == 1) {
                    }
                }
                interfaceC2760s = interfaceC2760s2;
                c3029b = c3029b2;
            }
            abstractC2206oM982S0 = AbstractC0601k.m1029e(c1483e);
            interfaceC2760s = interfaceC2760s2;
            c3029b = c3029b2;
        }
    }

    /* JADX INFO: renamed from: M0 */
    public abstract void mo976M0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N0 */
    public final AbstractC0596h0 m977N0(AbstractC0596h0 abstractC0596h0) {
        C0564I c0564iM839u = abstractC0596h0.f1932r;
        C0564I c0564i = this.f1932r;
        if (c0564iM839u == c0564i) {
            AbstractC2206o abstractC2206oMo981R0 = abstractC0596h0.mo981R0();
            AbstractC2206o abstractC2206oMo981R02 = mo981R0();
            if (!abstractC2206oMo981R02.f7186d.f7199q) {
                AbstractC0277a.m483b("visitLocalAncestors called on an unattached node");
            }
            for (AbstractC2206o abstractC2206o = abstractC2206oMo981R02.f7186d.f7190h; abstractC2206o != null; abstractC2206o = abstractC2206o.f7190h) {
                if ((abstractC2206o.f7188f & 2) != 0 && abstractC2206o == abstractC2206oMo981R0) {
                    return abstractC0596h0;
                }
            }
            return this;
        }
        while (c0564iM839u.f1727t > c0564i.f1727t) {
            c0564iM839u = c0564iM839u.m839u();
            AbstractC1665j.m2982b(c0564iM839u);
        }
        C0564I c0564iM839u2 = c0564i;
        while (c0564iM839u2.f1727t > c0564iM839u.f1727t) {
            c0564iM839u2 = c0564iM839u2.m839u();
            AbstractC1665j.m2982b(c0564iM839u2);
        }
        while (c0564iM839u != c0564iM839u2) {
            c0564iM839u = c0564iM839u.m839u();
            c0564iM839u2 = c0564iM839u2.m839u();
            if (c0564iM839u == null || c0564iM839u2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (c0564iM839u2 != c0564i) {
            if (c0564iM839u != abstractC0596h0.f1932r) {
                return c0564iM839u.f1699J.f1893c;
            }
            return abstractC0596h0;
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: O */
    public final long mo635O(InterfaceC0430v interfaceC0430v, long j5) {
        if (interfaceC0430v instanceof C0375M) {
            C0375M c0375m = (C0375M) interfaceC0430v;
            c0375m.f1189d.f1785r.m990a1();
            return c0375m.mo635O(this, j5 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        AbstractC0596h0 abstractC0596h0M969l1 = m969l1(interfaceC0430v);
        abstractC0596h0M969l1.m990a1();
        AbstractC0596h0 abstractC0596h0M977N0 = m977N0(abstractC0596h0M969l1);
        while (abstractC0596h0M969l1 != abstractC0596h0M977N0) {
            InterfaceC0612p0 interfaceC0612p0 = abstractC0596h0M969l1.f1931O;
            if (interfaceC0612p0 != null) {
                j5 = ((C0769w0) interfaceC0612p0).m1281c(j5, false);
            }
            j5 = AbstractC1923e.m3454N(j5, abstractC0596h0M969l1.f1919C);
            abstractC0596h0M969l1 = abstractC0596h0M969l1.f1934t;
            AbstractC1665j.m2982b(abstractC0596h0M969l1);
        }
        return m971H0(abstractC0596h0M977N0, j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O0 */
    public final long m978O0(long j5) {
        long j6 = this.f1919C;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 & 4294967295L)) - ((int) (j6 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 >> 32)) - ((int) (j6 >> 32)))) << 32);
        InterfaceC0612p0 interfaceC0612p0 = this.f1931O;
        return interfaceC0612p0 != null ? ((C0769w0) interfaceC0612p0).m1281c(jFloatToRawIntBits, true) : jFloatToRawIntBits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: P */
    public final long mo636P(InterfaceC0430v interfaceC0430v, long j5) {
        return mo635O(interfaceC0430v, j5);
    }

    /* JADX INFO: renamed from: P0 */
    public abstract AbstractC0573S mo979P0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: Q */
    public final long mo637Q() {
        return this.f1208f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q0 */
    public final long m980Q0() {
        return this.f1938x.mo273c0(this.f1932r.f1694E.mo778g());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: R */
    public final long mo638R(long j5) {
        if (!mo981R0().f7199q) {
            AbstractC0277a.m483b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m990a1();
        for (AbstractC0596h0 abstractC0596h0 = this; abstractC0596h0 != null; abstractC0596h0 = abstractC0596h0.f1934t) {
            C0564I c0564i = abstractC0596h0.f1932r;
            if (abstractC0596h0 == c0564i.f1699J.f1894d && !c0564i.f1713f) {
                long jM2208b = ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0564i)).getRectManager().m2208b(c0564i);
                if (!C2014j.m3700a(jM2208b, 9223372034707292159L)) {
                    return AbstractC1923e.m3454N(j5, jM2208b);
                }
            }
            InterfaceC0612p0 interfaceC0612p0 = abstractC0596h0.f1931O;
            if (interfaceC0612p0 != null) {
                j5 = ((C0769w0) interfaceC0612p0).m1281c(j5, false);
            }
            j5 = AbstractC1923e.m3454N(j5, abstractC0596h0.f1919C);
        }
        return j5;
    }

    /* JADX INFO: renamed from: R0 */
    public abstract AbstractC2206o mo981R0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S0 */
    public final AbstractC2206o m982S0(int i5) {
        boolean zM1014g = AbstractC0598i0.m1014g(i5);
        AbstractC2206o abstractC2206oMo981R0 = mo981R0();
        if (!zM1014g && (abstractC2206oMo981R0 = abstractC2206oMo981R0.f7190h) == null) {
            return null;
        }
        for (AbstractC2206o abstractC2206oM983T0 = m983T0(zM1014g); abstractC2206oM983T0 != null && (abstractC2206oM983T0.f7189g & i5) != 0; abstractC2206oM983T0 = abstractC2206oM983T0.f7191i) {
            if ((abstractC2206oM983T0.f7188f & i5) != 0) {
                return abstractC2206oM983T0;
            }
            if (abstractC2206oM983T0 == abstractC2206oMo981R0) {
                return null;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T0 */
    public final AbstractC2206o m983T0(boolean z5) {
        AbstractC2206o abstractC2206oMo981R0;
        C0590e0 c0590e0 = this.f1932r.f1699J;
        if (c0590e0.f1894d == this) {
            return c0590e0.f1896f;
        }
        if (!z5) {
            AbstractC0596h0 abstractC0596h0 = this.f1934t;
            if (abstractC0596h0 != null) {
                return abstractC0596h0.mo981R0();
            }
            return null;
        }
        AbstractC0596h0 abstractC0596h02 = this.f1934t;
        if (abstractC0596h02 == null || (abstractC2206oMo981R0 = abstractC0596h02.mo981R0()) == null) {
            return null;
        }
        return abstractC2206oMo981R0.f7191i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U0 */
    public final void m984U0(AbstractC2206o abstractC2206o, C0592f0 c0592f0, long j5, C0613q c0613q, int i5, boolean z5) {
        if (abstractC2206o == null) {
            mo987X0(c0592f0, j5, c0613q, i5, z5);
            return;
        }
        int i6 = c0613q.f1968f;
        C2404A c2404a = c0613q.f1966d;
        c0613q.m1056b(i6 + 1, c2404a.f7767b);
        c0613q.f1968f++;
        c2404a.m4243a(abstractC2206o);
        c0613q.f1967e.m4351a(AbstractC0601k.m1025a(-1.0f, z5, false));
        m984U0(AbstractC0601k.m1028d(abstractC2206o, c0592f0.m968b()), c0592f0, j5, c0613q, i5, z5);
        c0613q.f1968f = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V0 */
    public final void m985V0(AbstractC2206o abstractC2206o, C0592f0 c0592f0, long j5, C0613q c0613q, int i5, boolean z5, float f2) {
        if (abstractC2206o == null) {
            mo987X0(c0592f0, j5, c0613q, i5, z5);
            return;
        }
        int i6 = c0613q.f1968f;
        C2404A c2404a = c0613q.f1966d;
        c0613q.m1056b(i6 + 1, c2404a.f7767b);
        c0613q.f1968f++;
        c2404a.m4243a(abstractC2206o);
        c0613q.f1967e.m4351a(AbstractC0601k.m1025a(f2, z5, false));
        m995f1(AbstractC0601k.m1028d(abstractC2206o, c0592f0.m968b()), c0592f0, j5, c0613q, i5, z5, f2, true);
        c0613q.f1968f = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W0 */
    public final void m986W0(C0592f0 c0592f0, long j5, C0613q c0613q, int i5, boolean z5) {
        boolean z6;
        boolean z7;
        AbstractC2206o abstractC2206oM982S0 = m982S0(c0592f0.m968b());
        if (!m1006r1(j5)) {
            if (i5 == 1) {
                float fM973J0 = m973J0(j5, m980Q0());
                if ((Float.floatToRawIntBits(fM973J0) & Integer.MAX_VALUE) < 2139095040) {
                    if (c0613q.f1968f != AbstractC2352g.m4208u(c0613q)) {
                        if (AbstractC0601k.m1031g(c0613q.m1055a(), AbstractC0601k.m1025a(fM973J0, false, false)) <= 0) {
                            return;
                        }
                    }
                    m985V0(abstractC2206oM982S0, c0592f0, j5, c0613q, i5, false, fM973J0);
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC2206oM982S0 == null) {
            mo987X0(c0592f0, j5, c0613q, i5, z5);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < mo664g0() && fIntBitsToFloat2 < mo663d0()) {
            m984U0(abstractC2206oM982S0, c0592f0, j5, c0613q, i5, z5);
            return;
        }
        float fM973J02 = i5 == 1 ? m973J0(j5, m980Q0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fM973J02) & Integer.MAX_VALUE) < 2139095040) {
            if (c0613q.f1968f != AbstractC2352g.m4208u(c0613q)) {
                z6 = z5;
                if (AbstractC0601k.m1031g(c0613q.m1055a(), AbstractC0601k.m1025a(fM973J02, z6, false)) > 0) {
                }
                m995f1(abstractC2206oM982S0, c0592f0, j5, c0613q, i5, z6, fM973J02, z7);
            }
            z6 = z5;
            z7 = true;
            m995f1(abstractC2206oM982S0, c0592f0, j5, c0613q, i5, z6, fM973J02, z7);
        }
        z6 = z5;
        z7 = false;
        m995f1(abstractC2206oM982S0, c0592f0, j5, c0613q, i5, z6, fM973J02, z7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X0 */
    public void mo987X0(C0592f0 c0592f0, long j5, C0613q c0613q, int i5, boolean z5) {
        AbstractC0596h0 abstractC0596h0 = this.f1933s;
        if (abstractC0596h0 != null) {
            abstractC0596h0.m986W0(c0592f0, abstractC0596h0.m978O0(j5), c0613q, i5, z5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y0 */
    public final void m988Y0() {
        InterfaceC0612p0 interfaceC0612p0 = this.f1931O;
        if (interfaceC0612p0 != null) {
            interfaceC0612p0.invalidate();
            return;
        }
        AbstractC0596h0 abstractC0596h0 = this.f1934t;
        if (abstractC0596h0 != null) {
            abstractC0596h0.m988Y0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z0 */
    public final boolean m989Z0() {
        if (this.f1931O != null && this.f1940z <= 0.0f) {
            return true;
        }
        AbstractC0596h0 abstractC0596h0 = this.f1934t;
        if (abstractC0596h0 != null) {
            return abstractC0596h0.m989Z0();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a1 */
    public final void m990a1() {
        this.f1932r.f1700K.m868b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: b */
    public final float mo272b() {
        return this.f1932r.f1692C.mo272b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:43:0x0080 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x008f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:69:0x004a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x004a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:74:0x0089 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r7v7, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [V.e] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: b1 */
    public final void m991b1() {
        AbstractC2206o abstractC2206oMo981R0;
        boolean zM1014g = AbstractC0598i0.m1014g(128);
        AbstractC2206o abstractC2206oM983T0 = m983T0(zM1014g);
        if (abstractC2206oM983T0 == null || (abstractC2206oM983T0.f7186d.f7189g & 128) == 0) {
            return;
        }
        AbstractC2074f abstractC2074fM3853e = AbstractC2086r.m3853e();
        InterfaceC1601c interfaceC1601cMo3789e = abstractC2074fM3853e != null ? abstractC2074fM3853e.mo3789e() : null;
        AbstractC2074f abstractC2074fM3856h = AbstractC2086r.m3856h(abstractC2074fM3853e);
        try {
            if (!zM1014g) {
                abstractC2206oMo981R0 = mo981R0().f7190h;
                if (abstractC2206oMo981R0 == null) {
                }
            }
            abstractC2206oMo981R0 = mo981R0();
            for (AbstractC2206o abstractC2206oM983T02 = m983T0(zM1014g); abstractC2206oM983T02 != null; abstractC2206oM983T02 = abstractC2206oM983T02.f7191i) {
                if ((abstractC2206oM983T02.f7189g & 128) == 0) {
                    break;
                }
                if ((abstractC2206oM983T02.f7188f & 128) != 0) {
                    ?? M1029e = abstractC2206oM983T02;
                    ?? c1483e = 0;
                    while (M1029e != 0) {
                        if (M1029e instanceof InterfaceC0625w) {
                            ((InterfaceC0625w) M1029e).mo655x(this.f1208f);
                        } else if ((M1029e.f7188f & 128) != 0 && (M1029e instanceof AbstractC0599j)) {
                            AbstractC2206o abstractC2206o = ((AbstractC0599j) M1029e).f1943s;
                            int i5 = 0;
                            M1029e = M1029e;
                            c1483e = c1483e;
                            while (abstractC2206o != null) {
                                if ((abstractC2206o.f7188f & 128) != 0) {
                                    i5++;
                                    c1483e = c1483e;
                                    if (i5 == 1) {
                                        M1029e = abstractC2206o;
                                    } else {
                                        if (c1483e == 0) {
                                            c1483e = new C1483e(new AbstractC2206o[16]);
                                        }
                                        if (M1029e != 0) {
                                            c1483e.m2753b(M1029e);
                                            M1029e = 0;
                                        }
                                        c1483e.m2753b(abstractC2206o);
                                    }
                                }
                                abstractC2206o = abstractC2206o.f7191i;
                                M1029e = M1029e;
                                c1483e = c1483e;
                            }
                            if (i5 == 1) {
                            }
                        }
                        M1029e = AbstractC0601k.m1029e(c1483e);
                    }
                }
                if (abstractC2206oM983T02 == abstractC2206oMo981R0) {
                    break;
                }
            }
        } finally {
            AbstractC2086r.m3859k(abstractC2074fM3853e, abstractC2074fM3856h, interfaceC1601cMo3789e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:33:0x005a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x0069 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x0026 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:53:0x0026 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:56:0x0063 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: c1 */
    public final void m992c1() {
        boolean zM1014g = AbstractC0598i0.m1014g(4194304);
        AbstractC2206o abstractC2206oMo981R0 = mo981R0();
        if (!zM1014g && (abstractC2206oMo981R0 = abstractC2206oMo981R0.f7190h) == null) {
            return;
        }
        for (AbstractC2206o abstractC2206oM983T0 = m983T0(zM1014g); abstractC2206oM983T0 != null && (abstractC2206oM983T0.f7189g & 4194304) != 0; abstractC2206oM983T0 = abstractC2206oM983T0.f7191i) {
            if ((abstractC2206oM983T0.f7188f & 4194304) != 0) {
                ?? M1029e = abstractC2206oM983T0;
                ?? c1483e = 0;
                while (M1029e != 0) {
                    if (M1029e instanceof InterfaceC0625w) {
                        ((InterfaceC0625w) M1029e).mo953v(this);
                    } else if ((M1029e.f7188f & 4194304) != 0 && (M1029e instanceof AbstractC0599j)) {
                        AbstractC2206o abstractC2206o = ((AbstractC0599j) M1029e).f1943s;
                        int i5 = 0;
                        M1029e = M1029e;
                        c1483e = c1483e;
                        while (abstractC2206o != null) {
                            if ((abstractC2206o.f7188f & 4194304) != 0) {
                                i5++;
                                c1483e = c1483e;
                                if (i5 == 1) {
                                    M1029e = abstractC2206o;
                                } else {
                                    if (c1483e == 0) {
                                        c1483e = new C1483e(new AbstractC2206o[16]);
                                    }
                                    if (M1029e != 0) {
                                        c1483e.m2753b(M1029e);
                                        M1029e = 0;
                                    }
                                    c1483e.m2753b(abstractC2206o);
                                }
                            }
                            abstractC2206o = abstractC2206o.f7191i;
                            M1029e = M1029e;
                            c1483e = c1483e;
                        }
                        if (i5 == 1) {
                        }
                    }
                    M1029e = AbstractC0601k.m1029e(c1483e);
                }
            }
            if (abstractC2206oM983T0 == abstractC2206oMo981R0) {
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: d */
    public final long mo640d(long j5) {
        if (!mo981R0().f7199q) {
            AbstractC0277a.m483b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(this.f1932r)).m1314t(mo638R(j5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d1 */
    public final void m993d1() {
        this.f1935u = true;
        this.f1929M.mo6a();
        m999j1();
        if (C2014j.m3700a(this.f1919C, 0L)) {
            return;
        }
        this.f1932r.m806N();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e1 */
    public final void m994e1() {
        boolean zM1014g = AbstractC0598i0.m1014g(1048576);
        AbstractC2206o abstractC2206oM983T0 = m983T0(zM1014g);
        if (abstractC2206oM983T0 == null || (abstractC2206oM983T0.f7186d.f7189g & 1048576) == 0) {
            return;
        }
        AbstractC2206o abstractC2206oMo981R0 = mo981R0();
        if (!zM1014g && (abstractC2206oMo981R0 = abstractC2206oMo981R0.f7190h) == null) {
            return;
        }
        for (AbstractC2206o abstractC2206oM983T02 = m983T0(zM1014g); abstractC2206oM983T02 != null && (abstractC2206oM983T02.f7189g & 1048576) != 0; abstractC2206oM983T02 = abstractC2206oM983T02.f7191i) {
            if ((abstractC2206oM983T02.f7188f & 1048576) != 0) {
                AbstractC2206o abstractC2206oM1029e = abstractC2206oM983T02;
                C1483e c1483e = null;
                while (abstractC2206oM1029e != null) {
                    if ((abstractC2206oM1029e.f7188f & 1048576) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                        int i5 = 0;
                        for (AbstractC2206o abstractC2206o = ((AbstractC0599j) abstractC2206oM1029e).f1943s; abstractC2206o != null; abstractC2206o = abstractC2206o.f7191i) {
                            if ((abstractC2206o.f7188f & 1048576) != 0) {
                                i5++;
                                if (i5 == 1) {
                                    abstractC2206oM1029e = abstractC2206o;
                                } else {
                                    if (c1483e == null) {
                                        c1483e = new C1483e(new AbstractC2206o[16]);
                                    }
                                    if (abstractC2206oM1029e != null) {
                                        c1483e.m2753b(abstractC2206oM1029e);
                                        abstractC2206oM1029e = null;
                                    }
                                    c1483e.m2753b(abstractC2206o);
                                }
                            }
                        }
                        if (i5 == 1) {
                        }
                    }
                    abstractC2206oM1029e = AbstractC0601k.m1029e(c1483e);
                }
            }
            if (abstractC2206oM983T02 == abstractC2206oMo981R0) {
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:106:0x0212 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:108:0x01ce */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:110:0x01ce */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:113:0x020c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:118:0x01b2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:121:0x01ab */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x01a2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:67:0x01b0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:94:0x0203 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b8 A[PHI: r9
  0x01b8: PHI (r9v5 ??) = (r9v1 ??), (r9v1 ??), (r9v7 ??) binds: [B:51:0x017d, B:53:0x0181, B:67:0x01b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r4v10, types: [V.e] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [V.e] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v7, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v5, types: [V.e] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [V.e] */
    /* JADX INFO: renamed from: f1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m995f1(AbstractC2206o abstractC2206o, C0592f0 c0592f0, long j5, C0613q c0613q, int i5, boolean z5, float f2, boolean z6) {
        ?? M1029e;
        if (abstractC2206o == null) {
            mo987X0(c0592f0, j5, c0613q, i5, z5);
            return;
        }
        int i6 = i5;
        boolean z7 = z5;
        if (i6 == 3 || i6 == 4) {
            ?? r8 = abstractC2206o;
            ?? c1483e = 0;
            while (true) {
                if (r8 == 0) {
                    break;
                }
                if (r8 instanceof InterfaceC0624v0) {
                    long jMo299w = ((InterfaceC0624v0) r8).mo299w();
                    int i7 = (int) (j5 >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i7);
                    C0564I c0564i = this.f1932r;
                    EnumC2017m enumC2017m = c0564i.f1693D;
                    int i8 = AbstractC0554C0.f1667b;
                    long j6 = jMo299w & Long.MIN_VALUE;
                    EnumC2017m enumC2017m2 = EnumC2017m.f6742d;
                    if (fIntBitsToFloat >= (-((j6 == 0 || enumC2017m == enumC2017m2) ? C0592f0.m966a(jMo299w, 0) : C0592f0.m966a(jMo299w, 2)))) {
                        if (Float.intBitsToFloat(i7) < mo664g0() + ((j6 == 0 || c0564i.f1693D == enumC2017m2) ? C0592f0.m966a(jMo299w, 2) : C0592f0.m966a(jMo299w, 0))) {
                            int i9 = (int) (j5 & 4294967295L);
                            if (Float.intBitsToFloat(i9) >= (-C0592f0.m966a(jMo299w, 1))) {
                                if (Float.intBitsToFloat(i9) < C0592f0.m966a(jMo299w, 3) + mo663d0()) {
                                    C2441w c2441w = c0613q.f1967e;
                                    C2404A c2404a = c0613q.f1966d;
                                    if (c0613q.f1968f == AbstractC2352g.m4208u(c0613q)) {
                                        int i10 = c0613q.f1968f;
                                        c0613q.m1056b(i10 + 1, c2404a.f7767b);
                                        c0613q.f1968f++;
                                        c2404a.m4243a(abstractC2206o);
                                        c2441w.m4351a(AbstractC0601k.m1025a(0.0f, z7, true));
                                        m995f1(AbstractC0601k.m1028d(abstractC2206o, c0592f0.m968b()), c0592f0, j5, c0613q, i6, z7, f2, z6);
                                        c0613q.f1968f = i10;
                                        return;
                                    }
                                    long jM1055a = c0613q.m1055a();
                                    int i11 = c0613q.f1968f;
                                    if (!AbstractC0601k.m1037m(jM1055a)) {
                                        if (AbstractC0601k.m1033i(jM1055a) > 0.0f) {
                                            int i12 = c0613q.f1968f;
                                            c0613q.m1056b(i12 + 1, c2404a.f7767b);
                                            c0613q.f1968f++;
                                            c2404a.m4243a(abstractC2206o);
                                            c2441w.m4351a(AbstractC0601k.m1025a(0.0f, z7, true));
                                            m995f1(AbstractC0601k.m1028d(abstractC2206o, c0592f0.m968b()), c0592f0, j5, c0613q, i5, z7, f2, z6);
                                            c0613q.f1968f = i12;
                                            return;
                                        }
                                        return;
                                    }
                                    int iM4208u = AbstractC2352g.m4208u(c0613q);
                                    c0613q.f1968f = iM4208u;
                                    c0613q.m1056b(iM4208u + 1, c2404a.f7767b);
                                    c0613q.f1968f++;
                                    c2404a.m4243a(abstractC2206o);
                                    c2441w.m4351a(AbstractC0601k.m1025a(0.0f, z7, true));
                                    m995f1(AbstractC0601k.m1028d(abstractC2206o, c0592f0.m968b()), c0592f0, j5, c0613q, i5, z7, f2, z6);
                                    c0613q.f1968f = iM4208u;
                                    if (AbstractC0601k.m1033i(c0613q.m1055a()) < 0.0f) {
                                        c0613q.m1056b(i11 + 1, c0613q.f1968f + 1);
                                    }
                                    c0613q.f1968f = i11;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    int i13 = 16;
                    if ((r8.f7188f & 16) == 0 || !(r8 instanceof AbstractC0599j)) {
                        M1029e = AbstractC0601k.m1029e(c1483e);
                    } else {
                        AbstractC2206o abstractC2206o2 = ((AbstractC0599j) r8).f1943s;
                        int i14 = 0;
                        M1029e = r8;
                        c1483e = c1483e;
                        while (abstractC2206o2 != null) {
                            if ((abstractC2206o2.f7188f & 16) != 0) {
                                i14++;
                                c1483e = c1483e;
                                if (i14 == 1) {
                                    M1029e = abstractC2206o2;
                                } else {
                                    if (c1483e == 0) {
                                        c1483e = new C1483e(new AbstractC2206o[i13]);
                                    }
                                    if (M1029e != 0) {
                                        c1483e.m2753b(M1029e);
                                        M1029e = 0;
                                    }
                                    c1483e.m2753b(abstractC2206o2);
                                }
                            }
                            abstractC2206o2 = abstractC2206o2.f7191i;
                            i13 = 16;
                            M1029e = M1029e;
                            c1483e = c1483e;
                        }
                        if (i14 == 1) {
                        }
                    }
                    i6 = i5;
                    z7 = z5;
                    r8 = M1029e;
                    c1483e = c1483e;
                }
            }
        }
        if (z6) {
            m985V0(abstractC2206o, c0592f0, j5, c0613q, i5, z5, f2);
            return;
        }
        switch (c0592f0.f1908a) {
            case 0:
                ?? M1029e2 = abstractC2206o;
                ?? c1483e2 = 0;
                while (M1029e2 != 0) {
                    if (M1029e2 instanceof InterfaceC0624v0) {
                        ((InterfaceC0624v0) M1029e2).mo952p0();
                    } else if ((M1029e2.f7188f & 16) != 0 && (M1029e2 instanceof AbstractC0599j)) {
                        AbstractC2206o abstractC2206o3 = ((AbstractC0599j) M1029e2).f1943s;
                        int i15 = 0;
                        M1029e2 = M1029e2;
                        c1483e2 = c1483e2;
                        while (abstractC2206o3 != null) {
                            if ((abstractC2206o3.f7188f & 16) != 0) {
                                i15++;
                                c1483e2 = c1483e2;
                                if (i15 == 1) {
                                    M1029e2 = abstractC2206o3;
                                } else {
                                    if (c1483e2 == 0) {
                                        c1483e2 = new C1483e(new AbstractC2206o[16]);
                                    }
                                    if (M1029e2 != 0) {
                                        c1483e2.m2753b(M1029e2);
                                        M1029e2 = 0;
                                    }
                                    c1483e2.m2753b(abstractC2206o3);
                                }
                            }
                            abstractC2206o3 = abstractC2206o3.f7191i;
                            M1029e2 = M1029e2;
                            c1483e2 = c1483e2;
                        }
                        if (i15 == 1) {
                        }
                    }
                    M1029e2 = AbstractC0601k.m1029e(c1483e2);
                }
                break;
        }
        m995f1(AbstractC0601k.m1028d(abstractC2206o, c0592f0.m968b()), c0592f0, j5, c0613q, i5, z5, f2, false);
    }

    /* JADX INFO: renamed from: g1 */
    public abstract void mo996g1(InterfaceC2760s interfaceC2760s, C3029b c3029b);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0420q
    public final EnumC2017m getLayoutDirection() {
        return this.f1932r.f1693D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h1 */
    public final void m997h1(long j5, float f2, InterfaceC1601c interfaceC1601c) {
        m1004p1(interfaceC1601c, false);
        boolean zM3700a = C2014j.m3700a(this.f1919C, j5);
        C0564I c0564i = this.f1932r;
        if (!zM3700a) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0564i)).m1306N(-4.0f);
            this.f1919C = j5;
            c0564i.f1700K.f1760p.m934r0();
            InterfaceC0612p0 interfaceC0612p0 = this.f1931O;
            if (interfaceC0612p0 != null) {
                ((C0769w0) interfaceC0612p0).m1282d(j5);
            } else {
                AbstractC0596h0 abstractC0596h0 = this.f1934t;
                if (abstractC0596h0 != null) {
                    abstractC0596h0.m988Y0();
                }
            }
            c0564i.m806N();
            AbstractC0572Q.m878D0(this);
            InterfaceC0614q0 interfaceC0614q0 = c0564i.f1725r;
            if (interfaceC0614q0 != null) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0772y) interfaceC0614q0).m1320z(c0564i);
            }
        }
        this.f1920D = f2;
        if (this == c0564i.f1699J.f1894d) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0564i)).getRectManager().m2211e(c0564i, false);
        }
        if (this.f1781n) {
            return;
        }
        m887r0(mo894z0());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: i */
    public final long mo641i(long j5) {
        if (!mo981R0().f7199q) {
            AbstractC0277a.m483b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        InterfaceC0430v interfaceC0430vM693f = AbstractC0435z.m693f(this);
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = (ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(this.f1932r);
        viewTreeObserverOnGlobalLayoutListenerC0772y.m1296D();
        return mo635O(interfaceC0430vM693f, C2683b.m4646d(C2730E.m4783b(j5, viewTreeObserverOnGlobalLayoutListenerC0772y.f2470f0), interfaceC0430vM693f.mo638R(0L)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i1 */
    public final void m998i1(C2682a c2682a, boolean z5, boolean z6) {
        InterfaceC0612p0 interfaceC0612p0 = this.f1931O;
        if (interfaceC0612p0 != null) {
            if (this.f1936v) {
                if (z6) {
                    long jM980Q0 = m980Q0();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jM980Q0 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM980Q0 & 4294967295L)) / 2.0f;
                    long j5 = this.f1208f;
                    c2682a.m4640a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j5 >> 32)) + fIntBitsToFloat, ((int) (j5 & 4294967295L)) + fIntBitsToFloat2);
                } else if (z5) {
                    long j6 = this.f1208f;
                    c2682a.m4640a(0.0f, 0.0f, (int) (j6 >> 32), (int) (j6 & 4294967295L));
                }
                if (c2682a.m4641b()) {
                    return;
                }
            }
            C0769w0 c0769w0 = (C0769w0) interfaceC0612p0;
            float[] fArrM1280b = c0769w0.m1280b();
            if (!c0769w0.f2413v) {
                if (fArrM1280b == null) {
                    c2682a.f8552a = 0.0f;
                    c2682a.f8553b = 0.0f;
                    c2682a.f8554c = 0.0f;
                    c2682a.f8555d = 0.0f;
                } else {
                    C2730E.m4784c(fArrM1280b, c2682a);
                }
            }
        }
        long j7 = this.f1919C;
        float f2 = (int) (j7 >> 32);
        c2682a.f8552a += f2;
        c2682a.f8554c += f2;
        float f5 = (int) (j7 & 4294967295L);
        c2682a.f8553b += f5;
        c2682a.f8555d += f5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j1 */
    public final void m999j1() {
        if (this.f1931O != null) {
            m1004p1(null, false);
            this.f1932r.m812U(false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: k */
    public final long mo642k(long j5) {
        long jMo638R = mo638R(j5);
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = (ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(this.f1932r);
        viewTreeObserverOnGlobalLayoutListenerC0772y.m1296D();
        return C2730E.m4783b(jMo638R, viewTreeObserverOnGlobalLayoutListenerC0772y.f2468e0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:116:0x00c6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:119:0x0083 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:121:0x0083 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:124:0x00c0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x00b7 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [V.e] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [V.e] */
    /* JADX INFO: renamed from: k1 */
    public final void m1000k1(InterfaceC0378P interfaceC0378P) {
        AbstractC0596h0 abstractC0596h0;
        InterfaceC0378P interfaceC0378P2 = this.f1917A;
        if (interfaceC0378P != interfaceC0378P2) {
            this.f1917A = interfaceC0378P;
            C0564I c0564i = this.f1932r;
            int i5 = 0;
            if (interfaceC0378P2 == null || interfaceC0378P.mo611e() != interfaceC0378P2.mo611e() || interfaceC0378P.mo609c() != interfaceC0378P2.mo609c()) {
                int iMo611e = interfaceC0378P.mo611e();
                int iMo609c = interfaceC0378P.mo609c();
                InterfaceC0612p0 interfaceC0612p0 = this.f1931O;
                if (interfaceC0612p0 != null) {
                    ((C0769w0) interfaceC0612p0).m1283e((((long) iMo611e) << 32) | (((long) iMo609c) & 4294967295L));
                } else if (c0564i.m801I() && (abstractC0596h0 = this.f1934t) != null) {
                    abstractC0596h0.m988Y0();
                }
                m667j0((((long) iMo609c) & 4294967295L) | (((long) iMo611e) << 32));
                if (this.f1937w != null) {
                    m1005q1(false);
                }
                boolean zM1014g = AbstractC0598i0.m1014g(4);
                AbstractC2206o abstractC2206oMo981R0 = mo981R0();
                if (zM1014g || (abstractC2206oMo981R0 = abstractC2206oMo981R0.f7190h) != null) {
                    for (AbstractC2206o abstractC2206oM983T0 = m983T0(zM1014g); abstractC2206oM983T0 != null && (abstractC2206oM983T0.f7189g & 4) != 0; abstractC2206oM983T0 = abstractC2206oM983T0.f7191i) {
                        if ((abstractC2206oM983T0.f7188f & 4) != 0) {
                            ?? M1029e = abstractC2206oM983T0;
                            ?? c1483e = 0;
                            while (M1029e != 0) {
                                if (M1029e instanceof InterfaceC0605m) {
                                    ((InterfaceC0605m) M1029e).mo951n0();
                                } else if ((M1029e.f7188f & 4) != 0 && (M1029e instanceof AbstractC0599j)) {
                                    AbstractC2206o abstractC2206o = ((AbstractC0599j) M1029e).f1943s;
                                    int i6 = 0;
                                    M1029e = M1029e;
                                    c1483e = c1483e;
                                    while (abstractC2206o != null) {
                                        if ((abstractC2206o.f7188f & 4) != 0) {
                                            i6++;
                                            c1483e = c1483e;
                                            if (i6 == 1) {
                                                M1029e = abstractC2206o;
                                            } else {
                                                if (c1483e == 0) {
                                                    c1483e = new C1483e(new AbstractC2206o[16]);
                                                }
                                                if (M1029e != 0) {
                                                    c1483e.m2753b(M1029e);
                                                    M1029e = 0;
                                                }
                                                c1483e.m2753b(abstractC2206o);
                                            }
                                        }
                                        abstractC2206o = abstractC2206o.f7191i;
                                        M1029e = M1029e;
                                        c1483e = c1483e;
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                                M1029e = AbstractC0601k.m1029e(c1483e);
                            }
                        }
                        if (abstractC2206oM983T0 == abstractC2206oMo981R0) {
                            break;
                        }
                    }
                }
                InterfaceC0614q0 interfaceC0614q0 = c0564i.f1725r;
                if (interfaceC0614q0 != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC0772y) interfaceC0614q0).m1320z(c0564i);
                }
            }
            C2444z c2444z = this.f1918B;
            if ((c2444z == null || c2444z.f7902e == 0) && interfaceC0378P.mo607a().isEmpty()) {
                return;
            }
            C2444z c2444z2 = this.f1918B;
            Map mapMo607a = interfaceC0378P.mo607a();
            if (c2444z2 != null && c2444z2.f7902e == mapMo607a.size()) {
                Object[] objArr = c2444z2.f7899b;
                int[] iArr = c2444z2.f7900c;
                long[] jArr = c2444z2.f7898a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i7 = 0;
                loop0: while (true) {
                    long j5 = jArr[i7];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i9 = i5; i9 < i8; i9++) {
                            if ((255 & j5) < 128) {
                                int i10 = (i7 << 3) + i9;
                                Object obj = objArr[i10];
                                int i11 = iArr[i10];
                                Integer num = (Integer) mapMo607a.get((AbstractC0388a) obj);
                                if (num == null || num.intValue() != i11) {
                                    break loop0;
                                }
                            }
                            j5 >>= 8;
                        }
                        if (i8 != 8) {
                            return;
                        }
                    }
                    if (i7 == length) {
                        return;
                    }
                    i7++;
                    i5 = 0;
                }
            }
            c0564i.f1700K.f1760p.f1863z.m850f();
            C2444z c2444z3 = this.f1918B;
            if (c2444z3 == null) {
                C2444z c2444z4 = AbstractC2412I.f7812a;
                c2444z3 = new C2444z();
                this.f1918B = c2444z3;
            }
            c2444z3.m4361a();
            for (Map.Entry entry : interfaceC0378P.mo607a().entrySet()) {
                c2444z3.m4367g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:27:0x0053 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x0062 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x001e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:46:0x001e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x005c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    @Override // p029F0.AbstractC0391b0, p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: l */
    public final Object mo650l() {
        C0564I c0564i = this.f1932r;
        if (!c0564i.f1699J.m962d(64)) {
            return null;
        }
        mo981R0();
        Object objMo950m0 = null;
        for (AbstractC2206o abstractC2206o = c0564i.f1699J.f1895e; abstractC2206o != null; abstractC2206o = abstractC2206o.f7190h) {
            if ((abstractC2206o.f7188f & 64) != 0) {
                ?? M1029e = abstractC2206o;
                ?? c1483e = 0;
                while (M1029e != 0) {
                    if (M1029e instanceof InterfaceC0620t0) {
                        objMo950m0 = ((InterfaceC0620t0) M1029e).mo950m0(objMo950m0);
                    } else if ((M1029e.f7188f & 64) != 0 && (M1029e instanceof AbstractC0599j)) {
                        AbstractC2206o abstractC2206o2 = ((AbstractC0599j) M1029e).f1943s;
                        int i5 = 0;
                        M1029e = M1029e;
                        c1483e = c1483e;
                        while (abstractC2206o2 != null) {
                            if ((abstractC2206o2.f7188f & 64) != 0) {
                                i5++;
                                c1483e = c1483e;
                                if (i5 == 1) {
                                    M1029e = abstractC2206o2;
                                } else {
                                    if (c1483e == 0) {
                                        c1483e = new C1483e(new AbstractC2206o[16]);
                                    }
                                    if (M1029e != 0) {
                                        c1483e.m2753b(M1029e);
                                        M1029e = 0;
                                    }
                                    c1483e.m2753b(abstractC2206o2);
                                }
                            }
                            abstractC2206o2 = abstractC2206o2.f7191i;
                            M1029e = M1029e;
                            c1483e = c1483e;
                        }
                        if (i5 == 1) {
                        }
                    }
                    M1029e = AbstractC0601k.m1029e(c1483e);
                }
            }
        }
        return objMo950m0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m1 */
    public final C2684c m1001m1() {
        if (mo981R0().f7199q) {
            InterfaceC0430v interfaceC0430vM693f = AbstractC0435z.m693f(this);
            C2682a c2682a = this.f1921E;
            if (c2682a == null) {
                c2682a = new C2682a();
                this.f1921E = c2682a;
            }
            long jM972I0 = m972I0(m980Q0());
            int i5 = (int) (jM972I0 >> 32);
            c2682a.f8552a = -Float.intBitsToFloat(i5);
            int i6 = (int) (jM972I0 & 4294967295L);
            c2682a.f8553b = -Float.intBitsToFloat(i6);
            c2682a.f8554c = Float.intBitsToFloat(i5) + mo664g0();
            c2682a.f8555d = Float.intBitsToFloat(i6) + mo663d0();
            AbstractC0596h0 abstractC0596h0 = this;
            while (abstractC0596h0 != interfaceC0430vM693f) {
                abstractC0596h0.m998i1(c2682a, false, true);
                if (!c2682a.m4641b()) {
                    abstractC0596h0 = abstractC0596h0.f1934t;
                    AbstractC1665j.m2982b(abstractC0596h0);
                }
            }
            return new C2684c(c2682a.f8552a, c2682a.f8553b, c2682a.f8554c, c2682a.f8555d);
        }
        return C2684c.f8557e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: n */
    public final InterfaceC0430v mo643n() {
        boolean z5 = mo981R0().f7199q;
        C0564I c0564i = this.f1932r;
        if (!z5) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (C0564I c0564iM839u = c0564i; c0564iM839u != null; c0564iM839u = c0564iM839u.m839u()) {
                sb.append("\n|");
                sb.append(c0564iM839u);
                sb.append(" isAttached=");
                sb.append(c0564iM839u.m799G());
                sb.append(" modifier=");
                sb.append(c0564iM839u.f1704O);
                sb.append(" tail=");
                sb.append(mo981R0());
            }
            AbstractC0277a.m483b(sb.toString());
        }
        m990a1();
        return c0564i.f1699J.f1894d.f1934t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n1 */
    public final void m1002n1(AbstractC0596h0 abstractC0596h0, float[] fArr) {
        float[] fArrM1279a;
        if (AbstractC1665j.m2981a(abstractC0596h0, this)) {
            return;
        }
        AbstractC0596h0 abstractC0596h02 = this.f1934t;
        AbstractC1665j.m2982b(abstractC0596h02);
        abstractC0596h02.m1002n1(abstractC0596h0, fArr);
        if (!C2014j.m3700a(this.f1919C, 0L)) {
            float[] fArr2 = f1914R;
            C2730E.m4785d(fArr2);
            long j5 = this.f1919C;
            C2730E.m4787f(fArr2, -((int) (j5 >> 32)), -((int) (j5 & 4294967295L)));
            C2730E.m4786e(fArr, fArr2);
        }
        InterfaceC0612p0 interfaceC0612p0 = this.f1931O;
        if (interfaceC0612p0 == null || (fArrM1279a = ((C0769w0) interfaceC0612p0).m1279a()) == null) {
            return;
        }
        C2730E.m4786e(fArr, fArrM1279a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o1 */
    public final void m1003o1(AbstractC0596h0 abstractC0596h0, float[] fArr) {
        AbstractC0596h0 abstractC0596h02 = this;
        while (!abstractC0596h02.equals(abstractC0596h0)) {
            InterfaceC0612p0 interfaceC0612p0 = abstractC0596h02.f1931O;
            if (interfaceC0612p0 != null) {
                C2730E.m4786e(fArr, ((C0769w0) interfaceC0612p0).m1280b());
            }
            if (!C2014j.m3700a(abstractC0596h02.f1919C, 0L)) {
                float[] fArr2 = f1914R;
                C2730E.m4785d(fArr2);
                C2730E.m4787f(fArr2, (int) (r1 >> 32), (int) (r1 & 4294967295L));
                C2730E.m4786e(fArr, fArr2);
            }
            abstractC0596h02 = abstractC0596h02.f1934t;
            AbstractC1665j.m2982b(abstractC0596h02);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: p */
    public final float mo282p() {
        return this.f1932r.f1692C.mo282p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p1 */
    public final void m1004p1(InterfaceC1601c interfaceC1601c, boolean z5) {
        InterfaceC0614q0 interfaceC0614q0;
        C1483e c1483e;
        Reference referencePoll;
        C0372J c0372j;
        C1483e c1483e2;
        Reference referencePoll2;
        Object obj;
        C0564I c0564i = this.f1932r;
        boolean z6 = (!z5 && this.f1937w == interfaceC1601c && AbstractC1665j.m2981a(this.f1938x, c0564i.f1692C) && this.f1939y == c0564i.f1693D) ? false : true;
        this.f1938x = c0564i.f1692C;
        this.f1939y = c0564i.f1693D;
        boolean zM799G = c0564i.m799G();
        C0594g0 c0594g0 = this.f1929M;
        if (!zM799G || interfaceC1601c == null) {
            this.f1937w = null;
            InterfaceC0612p0 interfaceC0612p0 = this.f1931O;
            if (interfaceC0612p0 != null) {
                C0769w0 c0769w0 = (C0769w0) interfaceC0612p0;
                ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = c0769w0.f2397f;
                if (!AbstractC2767z.m4944o(c0769w0.m1280b())) {
                    c0564i.m806N();
                }
                c0769w0.f2398g = null;
                c0769w0.f2399h = null;
                c0769w0.f2401j = true;
                if (c0769w0.f2404m) {
                    c0769w0.f2404m = false;
                    viewTreeObserverOnGlobalLayoutListenerC0772y.m1318x(c0769w0, false);
                }
                InterfaceC2765x interfaceC2765x = c0769w0.f2396e;
                if (interfaceC2765x != null) {
                    interfaceC2765x.mo4859a(c0769w0.f2395d);
                    C0038T0 c0038t0 = viewTreeObserverOnGlobalLayoutListenerC0772y.f2510z0;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) c0038t0.f170f;
                        c1483e = (C1483e) c0038t0.f169e;
                        referencePoll = referenceQueue.poll();
                        if (referencePoll != null) {
                            c1483e.m2761j(referencePoll);
                        }
                    } while (referencePoll != null);
                    c1483e.m2753b(new WeakReference(c0769w0, (ReferenceQueue) c0038t0.f170f));
                    viewTreeObserverOnGlobalLayoutListenerC0772y.f2438G.m4252j(c0769w0);
                }
                c0564i.f1703N = true;
                c0594g0.mo6a();
                if (mo981R0().f7199q && c0564i.m801I() && (interfaceC0614q0 = c0564i.f1725r) != null) {
                    ((ViewTreeObserverOnGlobalLayoutListenerC0772y) interfaceC0614q0).m1320z(c0564i);
                }
            }
            this.f1931O = null;
            this.f1930N = false;
            return;
        }
        this.f1937w = interfaceC1601c;
        if (this.f1931O != null) {
            if (z6) {
                m1005q1(true);
                return;
            }
            return;
        }
        InterfaceC0614q0 interfaceC0614q0M866a = AbstractC0567L.m866a(c0564i);
        C0372J c0372j2 = this.f1928L;
        if (c0372j2 == null) {
            C0372J c0372j3 = new C0372J(1, this, new C0594g0(this, 0));
            this.f1928L = c0372j3;
            c0372j = c0372j3;
        } else {
            c0372j = c0372j2;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y2 = (ViewTreeObserverOnGlobalLayoutListenerC0772y) interfaceC0614q0M866a;
        C0038T0 c0038t02 = viewTreeObserverOnGlobalLayoutListenerC0772y2.f2510z0;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) c0038t02.f170f;
            c1483e2 = (C1483e) c0038t02.f169e;
            referencePoll2 = referenceQueue2.poll();
            if (referencePoll2 != null) {
                c1483e2.m2761j(referencePoll2);
            }
        } while (referencePoll2 != null);
        while (true) {
            int i5 = c1483e2.f5183f;
            if (i5 == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) c1483e2.m2762k(i5 - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        InterfaceC0612p0 c0769w02 = (InterfaceC0612p0) obj;
        if (c0769w02 != null) {
            C0769w0 c0769w03 = (C0769w0) c0769w02;
            InterfaceC2765x interfaceC2765x2 = c0769w03.f2396e;
            if (interfaceC2765x2 == null) {
                throw AbstractC0231b.m396g("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!c0769w03.f2395d.f9625s) {
                AbstractC0277a.m482a("layer should have been released before reuse");
            }
            c0769w03.f2395d = interfaceC2765x2.mo4860b();
            c0769w03.f2401j = false;
            c0769w03.f2398g = c0372j;
            c0769w03.f2399h = c0594g0;
            c0769w03.f2411t = false;
            c0769w03.f2412u = false;
            c0769w03.f2413v = true;
            C2730E.m4785d(c0769w03.f2402k);
            float[] fArr = c0769w03.f2403l;
            if (fArr != null) {
                C2730E.m4785d(fArr);
            }
            c0769w03.f2409r = C2741P.f8720b;
            c0769w03.f2414w = false;
            long j5 = Integer.MAX_VALUE;
            c0769w03.f2400i = (j5 & 4294967295L) | (j5 << 32);
            c0769w03.f2410s = null;
            c0769w03.f2408q = 0;
        } else {
            c0769w02 = new C0769w0(viewTreeObserverOnGlobalLayoutListenerC0772y2.getGraphicsContext().mo4860b(), viewTreeObserverOnGlobalLayoutListenerC0772y2.getGraphicsContext(), viewTreeObserverOnGlobalLayoutListenerC0772y2, c0372j, c0594g0);
        }
        C0769w0 c0769w04 = (C0769w0) c0769w02;
        c0769w04.m1283e(this.f1208f);
        c0769w04.m1282d(this.f1919C);
        this.f1931O = c0769w02;
        m1005q1(true);
        c0564i.f1703N = true;
        c0594g0.mo6a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q1 */
    public final void m1005q1(boolean z5) {
        char c5;
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y;
        boolean z6;
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y2;
        InterfaceC0614q0 interfaceC0614q0;
        InterfaceC1599a interfaceC1599a;
        InterfaceC1599a interfaceC1599a2;
        InterfaceC0612p0 interfaceC0612p0 = this.f1931O;
        if (interfaceC0612p0 == null) {
            if (this.f1937w == null) {
                return;
            }
            AbstractC0277a.m483b("null layer with a non-null layerBlock");
            return;
        }
        InterfaceC1601c interfaceC1601c = this.f1937w;
        if (interfaceC1601c == null) {
            throw AbstractC0231b.m396g("updateLayerParameters requires a non-null layerBlock");
        }
        C2735J c2735j = f1912P;
        c2735j.m4791a();
        C0564I c0564i = this.f1932r;
        c2735j.f8696t = c0564i.f1692C;
        c2735j.f8697u = c0564i.f1693D;
        c2735j.f8695s = AbstractC1925g.m3523F(this.f1208f);
        ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0564i)).getSnapshotObserver().f1972a.m3867c(this, C0587d.f1876i, new C0190d(2, interfaceC1601c, this));
        C0623v c0623v = this.f1922F;
        if (c0623v == null) {
            c0623v = new C0623v();
            this.f1922F = c0623v;
        }
        C0623v c0623v2 = f1913Q;
        c0623v2.getClass();
        c0623v2.f1989a = c0623v.f1989a;
        c0623v2.f1990b = c0623v.f1990b;
        c0623v2.f1991c = c0623v.f1991c;
        c0623v2.f1992d = c0623v.f1992d;
        c0623v2.f1993e = c0623v.f1993e;
        c0623v2.f1994f = c0623v.f1994f;
        c0623v2.f1995g = c0623v.f1995g;
        c0623v2.f1996h = c0623v.f1996h;
        float f2 = c2735j.f8681e;
        c0623v.f1989a = f2;
        c0623v.f1990b = c2735j.f8682f;
        c0623v.f1991c = c2735j.f8684h;
        c0623v.f1992d = c2735j.f8688l;
        c0623v.f1993e = c2735j.f8689m;
        c0623v.f1994f = c2735j.f8690n;
        c0623v.f1995g = c2735j.f8691o;
        long j5 = c2735j.f8692p;
        c0623v.f1996h = j5;
        C0769w0 c0769w0 = (C0769w0) interfaceC0612p0;
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y3 = c0769w0.f2397f;
        int i5 = c2735j.f8680d | c0769w0.f2408q;
        c0769w0.f2406o = c2735j.f8697u;
        c0769w0.f2405n = c2735j.f8696t;
        int i6 = i5 & 4096;
        if (i6 != 0) {
            c0769w0.f2409r = j5;
        }
        if ((i5 & 1) != 0) {
            InterfaceC3031d interfaceC3031d = c0769w0.f2395d.f9607a;
            if (interfaceC3031d.mo5249d() != f2) {
                interfaceC3031d.mo5259n(f2);
            }
        }
        if ((i5 & 2) != 0) {
            C3029b c3029b = c0769w0.f2395d;
            float f5 = c2735j.f8682f;
            InterfaceC3031d interfaceC3031d2 = c3029b.f9607a;
            if (interfaceC3031d2.mo5240J() != f5) {
                interfaceC3031d2.mo5271z(f5);
            }
        }
        if ((i5 & 4) != 0) {
            C3029b c3029b2 = c0769w0.f2395d;
            float f6 = c2735j.f8683g;
            InterfaceC3031d interfaceC3031d3 = c3029b2.f9607a;
            if (interfaceC3031d3.mo5246a() != f6) {
                interfaceC3031d3.mo5248c(f6);
            }
        }
        if ((i5 & 8) != 0) {
            InterfaceC3031d interfaceC3031d4 = c0769w0.f2395d.f9607a;
            if (interfaceC3031d4.mo5263r() != 0.0f) {
                interfaceC3031d4.mo5264s();
            }
        }
        if ((i5 & 16) != 0) {
            C3029b c3029b3 = c0769w0.f2395d;
            float f7 = c2735j.f8684h;
            InterfaceC3031d interfaceC3031d5 = c3029b3.f9607a;
            if (interfaceC3031d5.mo5251f() != f7) {
                interfaceC3031d5.mo5254i(f7);
            }
        }
        if ((i5 & 32) != 0) {
            C3029b c3029b4 = c0769w0.f2395d;
            float f8 = c2735j.f8685i;
            InterfaceC3031d interfaceC3031d6 = c3029b4.f9607a;
            if (interfaceC3031d6.mo5237G() != f8) {
                interfaceC3031d6.mo5250e(f8);
                c3029b4.f9613g = true;
                c3029b4.m5225a();
            }
            if (c2735j.f8685i > 0.0f && !c0769w0.f2414w && (interfaceC1599a2 = c0769w0.f2399h) != null) {
                interfaceC1599a2.mo6a();
            }
        }
        if ((i5 & 64) != 0) {
            C3029b c3029b5 = c0769w0.f2395d;
            long j6 = c2735j.f8686j;
            InterfaceC3031d interfaceC3031d7 = c3029b5.f9607a;
            if (!C2762u.m4921c(j6, interfaceC3031d7.mo5245O())) {
                interfaceC3031d7.mo5256k(j6);
            }
        }
        if ((i5 & 128) != 0) {
            C3029b c3029b6 = c0769w0.f2395d;
            long j7 = c2735j.f8687k;
            InterfaceC3031d interfaceC3031d8 = c3029b6.f9607a;
            if (!C2762u.m4921c(j7, interfaceC3031d8.mo5255j())) {
                interfaceC3031d8.mo5270y(j7);
            }
        }
        if ((i5 & 1024) != 0) {
            C3029b c3029b7 = c0769w0.f2395d;
            float f9 = c2735j.f8690n;
            InterfaceC3031d interfaceC3031d9 = c3029b7.f9607a;
            if (interfaceC3031d9.mo5242L() != f9) {
                interfaceC3031d9.mo5253h(f9);
            }
        }
        if ((i5 & 256) != 0) {
            C3029b c3029b8 = c0769w0.f2395d;
            float f10 = c2735j.f8688l;
            InterfaceC3031d interfaceC3031d10 = c3029b8.f9607a;
            if (interfaceC3031d10.mo5267v() != f10) {
                interfaceC3031d10.mo5241K(f10);
            }
        }
        if ((i5 & 512) != 0) {
            C3029b c3029b9 = c0769w0.f2395d;
            float f11 = c2735j.f8689m;
            InterfaceC3031d interfaceC3031d11 = c3029b9.f9607a;
            if (interfaceC3031d11.mo5234D() != f11) {
                interfaceC3031d11.mo5247b(f11);
            }
        }
        if ((i5 & 2048) != 0) {
            C3029b c3029b10 = c0769w0.f2395d;
            float f12 = c2735j.f8691o;
            InterfaceC3031d interfaceC3031d12 = c3029b10.f9607a;
            if (interfaceC3031d12.mo5261p() != f12) {
                interfaceC3031d12.mo5236F(f12);
            }
        }
        if (i6 != 0) {
            c5 = ' ';
            if (C2741P.m4806a(c0769w0.f2409r, C2741P.f8720b)) {
                C3029b c3029b11 = c0769w0.f2395d;
                if (!C2683b.m4644b(c3029b11.f9628v, 9205357640488583168L)) {
                    c3029b11.f9628v = 9205357640488583168L;
                    c3029b11.f9607a.mo5244N(9205357640488583168L);
                }
            } else {
                C3029b c3029b12 = c0769w0.f2395d;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(C2741P.m4807b(c0769w0.f2409r) * ((int) (c0769w0.f2400i >> 32)))) << 32) | (((long) Float.floatToRawIntBits(C2741P.m4808c(c0769w0.f2409r) * ((int) (c0769w0.f2400i & 4294967295L)))) & 4294967295L);
                if (!C2683b.m4644b(c3029b12.f9628v, jFloatToRawIntBits)) {
                    c3029b12.f9628v = jFloatToRawIntBits;
                    c3029b12.f9607a.mo5244N(jFloatToRawIntBits);
                }
            }
        } else {
            c5 = ' ';
        }
        if ((i5 & 16384) != 0) {
            C3029b c3029b13 = c0769w0.f2395d;
            boolean z7 = c2735j.f8694r;
            if (c3029b13.f9629w != z7) {
                c3029b13.f9629w = z7;
                c3029b13.f9613g = true;
                c3029b13.m5225a();
            }
        }
        if ((131072 & i5) != 0) {
            C3029b c3029b14 = c0769w0.f2395d;
            C2757p c2757p = c2735j.f8698v;
            InterfaceC3031d interfaceC3031d13 = c3029b14.f9607a;
            if (!AbstractC1665j.m2981a(interfaceC3031d13.mo5252g(), c2757p)) {
                interfaceC3031d13.mo5235E(c2757p);
            }
        }
        if ((262144 & i5) != 0) {
            InterfaceC3031d interfaceC3031d14 = c0769w0.f2395d.f9607a;
            if (!AbstractC1665j.m2981a(interfaceC3031d14.mo5268w(), null)) {
                interfaceC3031d14.mo5258m();
            }
        }
        if ((524288 & i5) != 0) {
            C3029b c3029b15 = c0769w0.f2395d;
            int i7 = c2735j.f8699w;
            InterfaceC3031d interfaceC3031d15 = c3029b15.f9607a;
            if (interfaceC3031d15.mo5243M() != i7) {
                interfaceC3031d15.mo5260o(i7);
            }
        }
        if ((32768 & i5) != 0) {
            InterfaceC3031d interfaceC3031d16 = c0769w0.f2395d.f9607a;
            if (interfaceC3031d16.mo5266u() != 0) {
                interfaceC3031d16.mo5269x(0);
            }
        }
        if ((i5 & 7963) != 0) {
            c0769w0.f2411t = true;
            c0769w0.f2412u = true;
        }
        if (AbstractC1665j.m2981a(c0769w0.f2410s, c2735j.f8700x)) {
            viewTreeObserverOnGlobalLayoutListenerC0772y = viewTreeObserverOnGlobalLayoutListenerC0772y3;
            z6 = false;
        } else {
            AbstractC2767z abstractC2767z = c2735j.f8700x;
            c0769w0.f2410s = abstractC2767z;
            if (abstractC2767z == null) {
                viewTreeObserverOnGlobalLayoutListenerC0772y = viewTreeObserverOnGlobalLayoutListenerC0772y3;
            } else {
                C3029b c3029b16 = c0769w0.f2395d;
                if (abstractC2767z instanceof C2732G) {
                    C2684c c2684c = ((C2732G) abstractC2767z).f8677f;
                    float f13 = c2684c.f8558a;
                    float f14 = c2684c.f8559b;
                    viewTreeObserverOnGlobalLayoutListenerC0772y = viewTreeObserverOnGlobalLayoutListenerC0772y3;
                    c3029b16.m5230f((((long) Float.floatToRawIntBits(f13)) << c5) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L), (((long) Float.floatToRawIntBits(c2684c.f8560c - f13)) << c5) | (((long) Float.floatToRawIntBits(c2684c.f8561d - f14)) & 4294967295L), 0.0f);
                } else {
                    viewTreeObserverOnGlobalLayoutListenerC0772y = viewTreeObserverOnGlobalLayoutListenerC0772y3;
                    if (abstractC2767z instanceof C2731F) {
                        C2750i c2750i = ((C2731F) abstractC2767z).f8676f;
                        c3029b16.f9617k = null;
                        c3029b16.f9615i = 9205357640488583168L;
                        c3029b16.f9614h = 0L;
                        c3029b16.f9616j = 0.0f;
                        c3029b16.f9613g = true;
                        c3029b16.f9620n = false;
                        c3029b16.f9618l = c2750i;
                        c3029b16.m5225a();
                    } else {
                        if (!(abstractC2767z instanceof C2733H)) {
                            throw new C0330q();
                        }
                        C2733H c2733h = (C2733H) abstractC2767z;
                        C2750i c2750i2 = c2733h.f8679g;
                        if (c2750i2 != null) {
                            c3029b16.f9617k = null;
                            c3029b16.f9615i = 9205357640488583168L;
                            c3029b16.f9614h = 0L;
                            c3029b16.f9616j = 0.0f;
                            c3029b16.f9613g = true;
                            c3029b16.f9620n = false;
                            c3029b16.f9618l = c2750i2;
                            c3029b16.m5225a();
                        } else {
                            C2685d c2685d = c2733h.f8678f;
                            c3029b16.m5230f((((long) Float.floatToRawIntBits(c2685d.f8562a)) << c5) | (((long) Float.floatToRawIntBits(c2685d.f8563b)) & 4294967295L), (((long) Float.floatToRawIntBits(c2685d.m4660b())) << c5) | (((long) Float.floatToRawIntBits(c2685d.m4659a())) & 4294967295L), Float.intBitsToFloat((int) (c2685d.f8569h >> c5)));
                        }
                    }
                }
                if ((abstractC2767z instanceof C2731F) && Build.VERSION.SDK_INT < 33 && (interfaceC1599a = c0769w0.f2399h) != null) {
                    interfaceC1599a.mo6a();
                }
            }
            z6 = true;
        }
        c0769w0.f2408q = c2735j.f8680d;
        if (i5 != 0 || z6) {
            ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC0772y.getParent();
            if (parent != null) {
                viewTreeObserverOnGlobalLayoutListenerC0772y2 = viewTreeObserverOnGlobalLayoutListenerC0772y;
                parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC0772y2, viewTreeObserverOnGlobalLayoutListenerC0772y2);
            } else {
                viewTreeObserverOnGlobalLayoutListenerC0772y2 = viewTreeObserverOnGlobalLayoutListenerC0772y;
            }
            if (viewTreeObserverOnGlobalLayoutListenerC0772y2.f2487o) {
                viewTreeObserverOnGlobalLayoutListenerC0772y2.m1306N(0.0f);
            }
        }
        boolean z8 = this.f1936v;
        this.f1936v = c2735j.f8694r;
        this.f1940z = c2735j.f8683g;
        boolean z9 = c0623v2.f1989a == c0623v.f1989a && c0623v2.f1990b == c0623v.f1990b && c0623v2.f1991c == c0623v.f1991c && c0623v2.f1992d == c0623v.f1992d && c0623v2.f1993e == c0623v.f1993e && c0623v2.f1994f == c0623v.f1994f && c0623v2.f1995g == c0623v.f1995g && C2741P.m4806a(c0623v2.f1996h, c0623v.f1996h);
        if (z5 && ((!z9 || z8 != this.f1936v) && (interfaceC0614q0 = c0564i.f1725r) != null)) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0772y) interfaceC0614q0).m1320z(c0564i);
        }
        if (z9) {
            return;
        }
        C0568M c0568m = c0564i.f1700K;
        if (c0568m.f1756l > 0) {
            if (c0568m.f1755k || c0568m.f1754j) {
                c0564i.m812U(false);
            }
            c0568m.f1760p.m934r0();
        }
        c0564i.m806N();
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y4 = (ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0567L.m866a(c0564i);
        C1168b rectManager = viewTreeObserverOnGlobalLayoutListenerC0772y4.getRectManager();
        if (this == c0564i.f1699J.f1894d) {
            rectManager.m2211e(c0564i, false);
        } else {
            rectManager.getClass();
            if (c0564i.m801I()) {
                long jM2205f = C1168b.m2205f(c0564i);
                if (C2014j.m3700a(jM2205f, 9223372034707292159L)) {
                    rectManager.m2209c(c0564i);
                } else {
                    c0564i.f1716i = jM2205f;
                    c0564i.f1717j = false;
                    C1483e c1483eM843y = c0564i.m843y();
                    Object[] objArr = c1483eM843y.f5181d;
                    int i8 = c1483eM843y.f5183f;
                    for (int i9 = 0; i9 < i8; i9++) {
                        rectManager.m2211e((C0564I) objArr[i9], false);
                    }
                    rectManager.m2210d(c0564i);
                }
            }
        }
        if (c0564i.f1709T > 0) {
            C0038T0 c0038t0 = viewTreeObserverOnGlobalLayoutListenerC0772y4.f2462a0.f1826e;
            c0038t0.getClass();
            if (c0564i.f1709T > 0) {
                ((C1483e) c0038t0.f169e).m2753b(c0564i);
                c0564i.f1708S = true;
            }
            viewTreeObserverOnGlobalLayoutListenerC0772y4.m1299G(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0180  */
    /* JADX INFO: renamed from: r1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1006r1(long j5) {
        boolean z5;
        boolean z6;
        boolean zM1192n;
        if ((((9187343241974906880L ^ (j5 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        InterfaceC0612p0 interfaceC0612p0 = this.f1931O;
        if (interfaceC0612p0 == null || !this.f1936v) {
            return true;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        C3029b c3029b = ((C0769w0) interfaceC0612p0).f2395d;
        if (c3029b.f9629w) {
            AbstractC2767z abstractC2767zM5228d = c3029b.m5228d();
            if (abstractC2767zM5228d instanceof C2732G) {
                C2684c c2684c = ((C2732G) abstractC2767zM5228d).f8677f;
                if (c2684c.f8558a > fIntBitsToFloat || fIntBitsToFloat >= c2684c.f8560c || c2684c.f8559b > fIntBitsToFloat2 || fIntBitsToFloat2 >= c2684c.f8561d) {
                    z5 = false;
                    z6 = true;
                }
                z5 = false;
                z6 = true;
            } else if (abstractC2767zM5228d instanceof C2733H) {
                C2685d c2685d = ((C2733H) abstractC2767zM5228d).f8678f;
                float f2 = c2685d.f8562a;
                long j6 = c2685d.f8567f;
                long j7 = c2685d.f8569h;
                long j8 = c2685d.f8568g;
                z5 = false;
                float f5 = c2685d.f8565d;
                z6 = true;
                float f6 = c2685d.f8563b;
                float f7 = c2685d.f8564c;
                long j9 = c2685d.f8566e;
                if (fIntBitsToFloat >= f2 && fIntBitsToFloat < f7 && fIntBitsToFloat2 >= f6 && fIntBitsToFloat2 < f5) {
                    int i5 = (int) (j9 >> 32);
                    float fIntBitsToFloat3 = Float.intBitsToFloat(i5);
                    int i6 = (int) (j6 >> 32);
                    if (Float.intBitsToFloat(i6) + fIntBitsToFloat3 <= c2685d.m4660b()) {
                        int i7 = (int) (j7 >> 32);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i7);
                        int i8 = (int) (j8 >> 32);
                        if (Float.intBitsToFloat(i8) + fIntBitsToFloat4 <= c2685d.m4660b()) {
                            int i9 = (int) (j9 & 4294967295L);
                            int i10 = (int) (j7 & 4294967295L);
                            if (Float.intBitsToFloat(i10) + Float.intBitsToFloat(i9) <= c2685d.m4659a()) {
                                int i11 = (int) (j6 & 4294967295L);
                                int i12 = (int) (j8 & 4294967295L);
                                if (Float.intBitsToFloat(i12) + Float.intBitsToFloat(i11) <= c2685d.m4659a()) {
                                    float fIntBitsToFloat5 = Float.intBitsToFloat(i5) + f2;
                                    float fIntBitsToFloat6 = Float.intBitsToFloat(i9) + f6;
                                    float fIntBitsToFloat7 = f7 - Float.intBitsToFloat(i6);
                                    float fIntBitsToFloat8 = Float.intBitsToFloat(i11) + f6;
                                    float fIntBitsToFloat9 = f7 - Float.intBitsToFloat(i8);
                                    float fIntBitsToFloat10 = f5 - Float.intBitsToFloat(i12);
                                    float fIntBitsToFloat11 = f5 - Float.intBitsToFloat(i10);
                                    float fIntBitsToFloat12 = Float.intBitsToFloat(i7) + f2;
                                    zM1192n = (fIntBitsToFloat >= fIntBitsToFloat5 || fIntBitsToFloat2 >= fIntBitsToFloat6) ? (fIntBitsToFloat >= fIntBitsToFloat12 || fIntBitsToFloat2 <= fIntBitsToFloat11) ? (fIntBitsToFloat <= fIntBitsToFloat7 || fIntBitsToFloat2 >= fIntBitsToFloat8) ? (fIntBitsToFloat <= fIntBitsToFloat9 || fIntBitsToFloat2 <= fIntBitsToFloat10) ? z6 : AbstractC0681L.m1192n(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat9, fIntBitsToFloat10, c2685d.f8568g) : AbstractC0681L.m1192n(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat7, fIntBitsToFloat8, c2685d.f8567f) : AbstractC0681L.m1192n(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat12, fIntBitsToFloat11, c2685d.f8569h) : AbstractC0681L.m1192n(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat5, fIntBitsToFloat6, c2685d.f8566e);
                                } else {
                                    C2750i c2750iM4885a = AbstractC2752k.m4885a();
                                    C2750i.m4878b(c2750iM4885a, c2685d);
                                    zM1192n = AbstractC0681L.m1191m(fIntBitsToFloat, fIntBitsToFloat2, c2750iM4885a);
                                }
                            }
                        }
                    }
                }
            } else {
                z5 = false;
                z6 = true;
                if (!(abstractC2767zM5228d instanceof C2731F)) {
                    throw new C0330q();
                }
                zM1192n = AbstractC0681L.m1191m(fIntBitsToFloat, fIntBitsToFloat2, ((C2731F) abstractC2767zM5228d).f8676f);
            }
            zM1192n = z5;
        } else {
            z5 = false;
            z6 = true;
        }
        return zM1192n ? z6 : z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0430v
    /* JADX INFO: renamed from: s */
    public final void mo644s(InterfaceC0430v interfaceC0430v, float[] fArr) {
        AbstractC0596h0 abstractC0596h0M969l1 = m969l1(interfaceC0430v);
        abstractC0596h0M969l1.m990a1();
        AbstractC0596h0 abstractC0596h0M977N0 = m977N0(abstractC0596h0M969l1);
        C2730E.m4785d(fArr);
        abstractC0596h0M969l1.m1003o1(abstractC0596h0M977N0, fArr);
        m1002n1(abstractC0596h0M977N0, fArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0572Q
    /* JADX INFO: renamed from: t0 */
    public final AbstractC0572Q mo889t0() {
        return this.f1933s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0572Q
    /* JADX INFO: renamed from: x0 */
    public final boolean mo892x0() {
        return this.f1917A != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0572Q
    /* JADX INFO: renamed from: y0 */
    public final C0564I mo893y0() {
        return this.f1932r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0572Q
    /* JADX INFO: renamed from: z0 */
    public final InterfaceC0378P mo894z0() {
        InterfaceC0378P interfaceC0378P = this.f1917A;
        if (interfaceC0378P != null) {
            return interfaceC0378P;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // p041H0.AbstractC0572Q
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC0430v mo891w0() {
        return this;
    }
}
