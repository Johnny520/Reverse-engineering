package p222q0;

import android.graphics.Paint;
import android.graphics.Shader;
import p000A.C0072l0;
import p027E4.C0330q;
import p117X2.AbstractC1665j;
import p153e1.EnumC2017m;
import p211o0.AbstractC2758q;
import p211o0.AbstractC2767z;
import p211o0.C2747f;
import p211o0.C2748g;
import p211o0.C2750i;
import p211o0.C2753l;
import p211o0.C2762u;
import p211o0.InterfaceC2760s;

/* JADX INFO: renamed from: q0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2901b implements InterfaceC2903d {

    /* JADX INFO: renamed from: d */
    public final C2900a f9184d;

    /* JADX INFO: renamed from: e */
    public final C0072l0 f9185e;

    /* JADX INFO: renamed from: f */
    public C2748g f9186f;

    /* JADX INFO: renamed from: g */
    public C2748g f9187g;

    public C2901b() {
        C2900a c2900a = new C2900a();
        c2900a.f9180a = AbstractC2902c.f9188a;
        c2900a.f9181b = EnumC2017m.f6742d;
        c2900a.f9182c = C2904e.f9189a;
        c2900a.f9183d = 0L;
        this.f9184d = c2900a;
        this.f9185e = new C0072l0(this);
    }

    /* JADX INFO: renamed from: a */
    public static C2748g m5096a(C2901b c2901b, long j5, AbstractC2902c abstractC2902c, int i5) {
        C2748g c2748gM5099f = c2901b.m5099f(abstractC2902c);
        Paint paint = (Paint) c2748gM5099f.f8737c;
        if (!C2762u.m4921c(AbstractC2767z.m4933c(paint.getColor()), j5)) {
            c2748gM5099f.m4869g(j5);
        }
        if (((Shader) c2748gM5099f.f8738d) != null) {
            c2748gM5099f.m4872j(null);
        }
        if (!AbstractC1665j.m2981a((C2753l) c2748gM5099f.f8739e, null)) {
            c2748gM5099f.m4870h(null);
        }
        if (c2748gM5099f.f8736b != i5) {
            c2748gM5099f.m4868f(i5);
        }
        if (paint.isFilterBitmap()) {
            return c2748gM5099f;
        }
        c2748gM5099f.m4871i(1);
        return c2748gM5099f;
    }

    @Override // p222q0.InterfaceC2903d
    /* JADX INFO: renamed from: F */
    public final void mo853F(long j5, long j6, long j7, AbstractC2902c abstractC2902c, int i5) {
        int i6 = (int) (j6 >> 32);
        int i7 = (int) (j6 & 4294967295L);
        this.f9184d.f9182c.mo4854p(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7), Float.intBitsToFloat(i6) + Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)) + Float.intBitsToFloat(i7), m5096a(this, j5, abstractC2902c, i5));
    }

    @Override // p222q0.InterfaceC2903d
    /* JADX INFO: renamed from: L */
    public final C0072l0 mo854L() {
        return this.f9185e;
    }

    @Override // p222q0.InterfaceC2903d
    /* JADX INFO: renamed from: V */
    public final void mo855V(long j5, long j6, long j7, float f2, int i5) {
        InterfaceC2760s interfaceC2760s = this.f9184d.f9182c;
        C2748g c2748gM4937g = this.f9187g;
        if (c2748gM4937g == null) {
            c2748gM4937g = AbstractC2767z.m4937g();
            c2748gM4937g.m4876n(1);
            this.f9187g = c2748gM4937g;
        }
        Paint paint = (Paint) c2748gM4937g.f8737c;
        if (!C2762u.m4921c(AbstractC2767z.m4933c(paint.getColor()), j5)) {
            c2748gM4937g.m4869g(j5);
        }
        if (((Shader) c2748gM4937g.f8738d) != null) {
            c2748gM4937g.m4872j(null);
        }
        if (!AbstractC1665j.m2981a((C2753l) c2748gM4937g.f8739e, null)) {
            c2748gM4937g.m4870h(null);
        }
        if (c2748gM4937g.f8736b != 3) {
            c2748gM4937g.m4868f(3);
        }
        if (paint.getStrokeWidth() != f2) {
            c2748gM4937g.m4875m(f2);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (c2748gM4937g.m4864b() != i5) {
            c2748gM4937g.m4873k(i5);
        }
        if (c2748gM4937g.m4865c() != 0) {
            c2748gM4937g.m4874l(0);
        }
        if (!paint.isFilterBitmap()) {
            c2748gM4937g.m4871i(1);
        }
        interfaceC2760s.mo4841b(j6, j7, c2748gM4937g);
    }

    @Override // p222q0.InterfaceC2903d
    /* JADX INFO: renamed from: a0 */
    public final void mo858a0(long j5, float f2, long j6, AbstractC2902c abstractC2902c) {
        this.f9184d.f9182c.mo4855q(f2, j6, m5096a(this, j5, abstractC2902c, 3));
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: b */
    public final float mo272b() {
        return this.f9184d.f9180a.mo272b();
    }

    /* JADX INFO: renamed from: d */
    public final C2748g m5097d(AbstractC2758q abstractC2758q, AbstractC2902c abstractC2902c, float f2, C2753l c2753l, int i5, int i6) {
        C2748g c2748gM5099f = m5099f(abstractC2902c);
        if (abstractC2758q != null) {
            abstractC2758q.mo4805a(f2, mo859c(), c2748gM5099f);
        } else {
            Paint paint = (Paint) c2748gM5099f.f8737c;
            if (((Shader) c2748gM5099f.f8738d) != null) {
                c2748gM5099f.m4872j(null);
            }
            long jM4933c = AbstractC2767z.m4933c(paint.getColor());
            long j5 = C2762u.f8757b;
            if (!C2762u.m4921c(jM4933c, j5)) {
                c2748gM5099f.m4869g(j5);
            }
            if (paint.getAlpha() / 255.0f != f2) {
                c2748gM5099f.m4867e(f2);
            }
        }
        if (!AbstractC1665j.m2981a((C2753l) c2748gM5099f.f8739e, c2753l)) {
            c2748gM5099f.m4870h(c2753l);
        }
        if (c2748gM5099f.f8736b != i5) {
            c2748gM5099f.m4868f(i5);
        }
        if (((Paint) c2748gM5099f.f8737c).isFilterBitmap() == i6) {
            return c2748gM5099f;
        }
        c2748gM5099f.m4871i(i6);
        return c2748gM5099f;
    }

    /* JADX INFO: renamed from: e */
    public final void m5098e(C2747f c2747f, C2753l c2753l) {
        this.f9184d.f9182c.mo4843d(c2747f, m5097d(null, C2905f.f9190b, 1.0f, c2753l, 3, 1));
    }

    /* JADX INFO: renamed from: f */
    public final C2748g m5099f(AbstractC2902c abstractC2902c) {
        if (AbstractC1665j.m2981a(abstractC2902c, C2905f.f9190b)) {
            C2748g c2748g = this.f9186f;
            if (c2748g != null) {
                return c2748g;
            }
            C2748g c2748gM4937g = AbstractC2767z.m4937g();
            c2748gM4937g.m4876n(0);
            this.f9186f = c2748gM4937g;
            return c2748gM4937g;
        }
        if (!(abstractC2902c instanceof C2906g)) {
            throw new C0330q();
        }
        C2748g c2748gM4937g2 = this.f9187g;
        if (c2748gM4937g2 == null) {
            c2748gM4937g2 = AbstractC2767z.m4937g();
            c2748gM4937g2.m4876n(1);
            this.f9187g = c2748gM4937g2;
        }
        Paint paint = (Paint) c2748gM4937g2.f8737c;
        float strokeWidth = paint.getStrokeWidth();
        C2906g c2906g = (C2906g) abstractC2902c;
        float f2 = c2906g.f9191b;
        if (strokeWidth != f2) {
            c2748gM4937g2.m4875m(f2);
        }
        int iM4864b = c2748gM4937g2.m4864b();
        int i5 = c2906g.f9193d;
        if (iM4864b != i5) {
            c2748gM4937g2.m4873k(i5);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f5 = c2906g.f9192c;
        if (strokeMiter != f5) {
            paint.setStrokeMiter(f5);
        }
        int iM4865c = c2748gM4937g2.m4865c();
        int i6 = c2906g.f9194e;
        if (iM4865c == i6) {
            return c2748gM4937g2;
        }
        c2748gM4937g2.m4874l(i6);
        return c2748gM4937g2;
    }

    @Override // p222q0.InterfaceC2903d
    public final EnumC2017m getLayoutDirection() {
        return this.f9184d.f9181b;
    }

    @Override // p222q0.InterfaceC2903d
    /* JADX INFO: renamed from: o */
    public final void mo862o(C2750i c2750i, long j5, AbstractC2902c abstractC2902c) {
        this.f9184d.f9182c.mo4848i(c2750i, m5096a(this, j5, abstractC2902c, 3));
    }

    @Override // p222q0.InterfaceC2903d
    /* JADX INFO: renamed from: o0 */
    public final void mo863o0(C2750i c2750i, AbstractC2758q abstractC2758q, float f2, AbstractC2902c abstractC2902c, int i5) {
        this.f9184d.f9182c.mo4848i(c2750i, m5097d(abstractC2758q, abstractC2902c, f2, null, i5, 1));
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: p */
    public final float mo282p() {
        return this.f9184d.f9180a.mo282p();
    }

    @Override // p222q0.InterfaceC2903d
    /* JADX INFO: renamed from: t */
    public final void mo864t(AbstractC2758q abstractC2758q, long j5, long j6, long j7, float f2, AbstractC2902c abstractC2902c) {
        int i5 = (int) (j5 >> 32);
        int i6 = (int) (j5 & 4294967295L);
        this.f9184d.f9182c.mo4849j(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6), Float.intBitsToFloat((int) (j6 >> 32)) + Float.intBitsToFloat(i5), Float.intBitsToFloat((int) (j6 & 4294967295L)) + Float.intBitsToFloat(i6), Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), m5097d(abstractC2758q, abstractC2902c, f2, null, 3, 1));
    }

    @Override // p222q0.InterfaceC2903d
    /* JADX INFO: renamed from: u */
    public final void mo865u(C2747f c2747f, long j5, long j6, long j7, float f2, C2753l c2753l, int i5) {
        this.f9184d.f9182c.mo4842c(c2747f, j5, j6, j7, m5097d(null, C2905f.f9190b, f2, c2753l, 3, i5));
    }
}
