package p000A;

import android.graphics.Paint;
import me.dartcv.nuke.BuildConfig;
import p041H0.AbstractC0601k;
import p041H0.C0566K;
import p047I0.AbstractC0757q0;
import p047I0.InterfaceC0697T0;
import p051J.C0811c;
import p051J.C0818j;
import p051J.C0824p;
import p051J.C0829u;
import p056K2.C0891q;
import p092S0.C1259L;
import p112W2.InterfaceC1601c;
import p115X0.C1636k;
import p115X0.C1646u;
import p117X2.AbstractC1665j;
import p117X2.C1671p;
import p117X2.C1672q;
import p117X2.C1675t;
import p172h3.C2243c;
import p204n0.C2684c;
import p211o0.AbstractC2767z;
import p211o0.C2740O;
import p211o0.C2748g;
import p211o0.C2753l;
import p211o0.InterfaceC2760s;
import p222q0.C2901b;
import p227r.AbstractC2972W;
import p227r.C2940A0;
import p227r.C2973X;
import p227r.C2981c0;

/* JADX INFO: renamed from: A.x0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0096x0 implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f433d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f434e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f435f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f436g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f437h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f438i;

    public /* synthetic */ C0096x0(C1646u c1646u, C0811c c0811c, C1636k c1636k, C0075n c0075n, InterfaceC1601c interfaceC1601c) {
        this.f433d = 1;
        this.f434e = c1646u;
        this.f435f = c0811c;
        this.f436g = c1636k;
        this.f437h = c0075n;
        this.f438i = interfaceC1601c;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        int i5 = this.f433d;
        C0891q c0891q = C0891q.f2780a;
        Object obj2 = this.f438i;
        Object obj3 = this.f437h;
        Object obj4 = this.f434e;
        Object obj5 = this.f436g;
        Object obj6 = this.f435f;
        switch (i5) {
            case 0:
                C0042V0 c0042v0 = (C0042V0) obj5;
                C1646u c1646u = (C1646u) obj4;
                C0078o0 c0078o0 = (C0078o0) obj3;
                C2740O c2740o = (C2740O) obj2;
                C0566K c0566k = (C0566K) obj;
                c0566k.m857a();
                C2901b c2901b = c0566k.f1742d;
                float fM2507g = ((C0818j) obj6).f2636c.m2507g();
                if (fM2507g != 0.0f) {
                    long j5 = c1646u.f5651b;
                    int i6 = C1259L.f4537c;
                    int i7 = (int) (j5 >> 32);
                    c0042v0.m57a(i7);
                    C0036S0 c0036s0M123d = c0078o0.m123d();
                    C2684c c2684cM2326c = c0036s0M123d != null ? c0036s0M123d.f161a.m2326c(i7) : new C2684c(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(c0566k.mo268G(AbstractC0100z0.f461a));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f2 = fFloor / 2;
                    float f5 = c2684cM2326c.f8558a + f2;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (c2901b.mo859c() >> 32)) - f2;
                    if (f5 > fIntBitsToFloat) {
                        f5 = fIntBitsToFloat;
                    }
                    if (f5 >= f2) {
                        f2 = f5;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f2)) + 0.5f : (float) Math.rint(f2);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(c2684cM2326c.f8559b)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(c2684cM2326c.f8561d)) & 4294967295L);
                    InterfaceC2760s interfaceC2760s = c2901b.f9184d.f9182c;
                    C2748g c2748gM4937g = c2901b.f9187g;
                    if (c2748gM4937g == null) {
                        c2748gM4937g = AbstractC2767z.m4937g();
                        c2748gM4937g.m4876n(1);
                        c2901b.f9187g = c2748gM4937g;
                    }
                    Paint paint = (Paint) c2748gM4937g.f8737c;
                    c2740o.mo4805a(fM2507g, c2901b.mo859c(), c2748gM4937g);
                    if (!AbstractC1665j.m2981a((C2753l) c2748gM4937g.f8739e, null)) {
                        c2748gM4937g.m4870h(null);
                    }
                    if (c2748gM4937g.f8736b != 3) {
                        c2748gM4937g.m4868f(3);
                    }
                    if (paint.getStrokeWidth() != fFloor) {
                        c2748gM4937g.m4875m(fFloor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (c2748gM4937g.m4864b() != 0) {
                        c2748gM4937g.m4873k(0);
                    }
                    if (c2748gM4937g.m4865c() != 0) {
                        c2748gM4937g.m4874l(0);
                    }
                    if (!paint.isFilterBitmap()) {
                        c2748gM4937g.m4871i(1);
                    }
                    interfaceC2760s.mo4841b(jFloatToRawIntBits, jFloatToRawIntBits2, c2748gM4937g);
                }
                return c0891q;
            case BuildConfig.VERSION_CODE /* 1 */:
                C0829u c0829u = (C0829u) obj;
                C0824p c0824p = ((C0811c) obj6).f2606a;
                c0829u.f2675h = (C1646u) obj4;
                c0829u.f2676i = (C1636k) obj5;
                c0829u.f2670c = (C0075n) obj3;
                c0829u.f2671d = (InterfaceC1601c) obj2;
                c0829u.f2672e = c0824p != null ? c0824p.f2646s : null;
                c0829u.f2673f = c0824p != null ? c0824p.f2647t : null;
                c0829u.f2674g = c0824p != null ? (InterfaceC0697T0) AbstractC0601k.m1032h(c0824p, AbstractC0757q0.f2369s) : null;
                return c0891q;
            default:
                C2981c0 c2981c0 = (C2981c0) obj6;
                C1675t c1675t = (C1675t) obj5;
                C1672q c1672q = (C1672q) obj4;
                C2940A0 c2940a0 = (C2940A0) obj3;
                C1671p c1671p = (C1671p) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                C2973X c2973xM5176u = C2981c0.m5176u((C2243c) c2981c0.f9443f);
                if (c2973xM5176u != null) {
                    c2981c0.m5195v(c2973xM5176u);
                    C2973X c2973xM5171a = ((C2973X) c1675t.f5710e).m5171a(c2973xM5176u);
                    c1675t.f5710e = c2973xM5171a;
                    c1672q.f5706d = c2940a0.m5149i(c2940a0.m5145e(c2973xM5171a.f9403a));
                    c1671p.f5705d = !AbstractC2972W.m5170a(r3 - fFloatValue);
                }
                return Boolean.valueOf(c2973xM5176u != null);
        }
    }

    public /* synthetic */ C0096x0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i5) {
        this.f433d = i5;
        this.f435f = obj;
        this.f436g = obj2;
        this.f434e = obj3;
        this.f437h = obj4;
        this.f438i = obj5;
    }
}
