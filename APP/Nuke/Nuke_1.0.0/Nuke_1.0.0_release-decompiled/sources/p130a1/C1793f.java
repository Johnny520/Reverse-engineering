package p130a1;

import android.graphics.Paint;
import android.text.TextPaint;
import p027E4.C0330q;
import p095T.C1311F;
import p117X2.AbstractC1665j;
import p147d1.C1962l;
import p204n0.C2686e;
import p211o0.AbstractC2758q;
import p211o0.AbstractC2767z;
import p211o0.C2737L;
import p211o0.C2748g;
import p211o0.C2762u;
import p222q0.AbstractC2902c;
import p222q0.C2905f;
import p222q0.C2906g;

/* JADX INFO: renamed from: a1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1793f extends TextPaint {

    /* JADX INFO: renamed from: a */
    public C2748g f6120a;

    /* JADX INFO: renamed from: b */
    public C1962l f6121b;

    /* JADX INFO: renamed from: c */
    public int f6122c;

    /* JADX INFO: renamed from: d */
    public C2737L f6123d;

    /* JADX INFO: renamed from: e */
    public C2762u f6124e;

    /* JADX INFO: renamed from: f */
    public AbstractC2758q f6125f;

    /* JADX INFO: renamed from: g */
    public C1311F f6126g;

    /* JADX INFO: renamed from: h */
    public C2686e f6127h;

    /* JADX INFO: renamed from: i */
    public AbstractC2902c f6128i;

    /* JADX INFO: renamed from: a */
    public final C2748g m3260a() {
        C2748g c2748g = this.f6120a;
        if (c2748g != null) {
            return c2748g;
        }
        C2748g c2748g2 = new C2748g(this);
        this.f6120a = c2748g2;
        return c2748g2;
    }

    /* JADX INFO: renamed from: b */
    public final void m3261b(int i5) {
        if (i5 == this.f6122c) {
            return;
        }
        m3260a().m4868f(i5);
        this.f6122c = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3262c(final p211o0.AbstractC2758q r6, final long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.f6126g = r0
            r5.f6125f = r0
            r5.f6127h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof p211o0.C2740O
            if (r1 == 0) goto L1d
            o0.O r6 = (p211o0.C2740O) r6
            long r6 = r6.f8719a
            long r6 = com.bumptech.glide.AbstractC1925g.m3518A(r9, r6)
            r5.m3263d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof p211o0.AbstractC2736K
            if (r1 == 0) goto L71
            o0.q r1 = r5.f6125f
            boolean r1 = p117X2.AbstractC1665j.m2981a(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            n0.e r1 = r5.f6127h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.f8570a
            boolean r1 = p204n0.C2686e.m4661a(r3, r7)
        L36:
            if (r1 != 0) goto L58
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            r2 = 1
        L42:
            if (r2 == 0) goto L58
            r5.f6125f = r6
            n0.e r1 = new n0.e
            r1.<init>(r7)
            r5.f6127h = r1
            a1.e r1 = new a1.e
            r1.<init>()
            T.F r6 = p095T.AbstractC1385s.m2624n(r1)
            r5.f6126g = r6
        L58:
            o0.g r6 = r5.m3260a()
            T.F r7 = r5.f6126g
            if (r7 == 0) goto L67
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L68
        L67:
            r7 = r0
        L68:
            r6.m4872j(r7)
            r5.f6124e = r0
            p130a1.AbstractC1796i.m3269c(r5, r9)
            return
        L71:
            E4.q r6 = new E4.q
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p130a1.C1793f.m3262c(o0.q, long, float):void");
    }

    /* JADX INFO: renamed from: d */
    public final void m3263d(long j5) {
        C2762u c2762u = this.f6124e;
        if (c2762u == null ? false : C2762u.m4921c(c2762u.f8764a, j5)) {
            return;
        }
        if (j5 != 16) {
            this.f6124e = new C2762u(j5);
            setColor(AbstractC2767z.m4952w(j5));
            this.f6126g = null;
            this.f6125f = null;
            this.f6127h = null;
            setShader(null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3264e(AbstractC2902c abstractC2902c) {
        if (abstractC2902c == null || AbstractC1665j.m2981a(this.f6128i, abstractC2902c)) {
            return;
        }
        this.f6128i = abstractC2902c;
        if (abstractC2902c.equals(C2905f.f9190b)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(abstractC2902c instanceof C2906g)) {
            throw new C0330q();
        }
        m3260a().m4876n(1);
        C2906g c2906g = (C2906g) abstractC2902c;
        m3260a().m4875m(c2906g.f9191b);
        C2748g c2748gM3260a = m3260a();
        ((Paint) c2748gM3260a.f8737c).setStrokeMiter(c2906g.f9192c);
        m3260a().m4874l(c2906g.f9194e);
        m3260a().m4873k(c2906g.f9193d);
        ((Paint) m3260a().f8737c).setPathEffect(null);
    }

    /* JADX INFO: renamed from: f */
    public final void m3265f(C2737L c2737l) {
        if (c2737l == null || AbstractC1665j.m2981a(this.f6123d, c2737l)) {
            return;
        }
        this.f6123d = c2737l;
        if (c2737l.equals(C2737L.f8703d)) {
            clearShadowLayer();
            return;
        }
        C2737L c2737l2 = this.f6123d;
        float f2 = c2737l2.f8706c;
        if (f2 == 0.0f) {
            f2 = Float.MIN_VALUE;
        }
        setShadowLayer(f2, Float.intBitsToFloat((int) (c2737l2.f8705b >> 32)), Float.intBitsToFloat((int) (this.f6123d.f8705b & 4294967295L)), AbstractC2767z.m4952w(this.f6123d.f8704a));
    }

    /* JADX INFO: renamed from: g */
    public final void m3266g(C1962l c1962l) {
        if (c1962l == null || AbstractC1665j.m2981a(this.f6121b, c1962l)) {
            return;
        }
        this.f6121b = c1962l;
        int i5 = c1962l.f6643a;
        setUnderlineText((i5 | 1) == i5);
        int i6 = this.f6121b.f6643a;
        setStrikeThruText((i6 | 2) == i6);
    }
}
