package p130a1;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import com.bumptech.glide.AbstractC1925g;
import p027E4.C0330q;
import p095T.AbstractC1385s;
import p095T.C1311F;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1665j;
import p147d1.C1962l;
import p204n0.C2686e;
import p211o0.AbstractC2736K;
import p211o0.AbstractC2758q;
import p211o0.AbstractC2767z;
import p211o0.C2737L;
import p211o0.C2740O;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m3261b(int i5) {
        if (i5 == this.f6122c) {
            return;
        }
        m3260a().m4868f(i5);
        this.f6122c = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3262c(final AbstractC2758q abstractC2758q, final long j5, float f2) {
        if (abstractC2758q == null) {
            this.f6126g = null;
            this.f6125f = null;
            this.f6127h = null;
            setShader(null);
            return;
        }
        if (abstractC2758q instanceof C2740O) {
            m3263d(AbstractC1925g.m3518A(f2, ((C2740O) abstractC2758q).f8719a));
            return;
        }
        if (!(abstractC2758q instanceof AbstractC2736K)) {
            throw new C0330q();
        }
        if (AbstractC1665j.m2981a(this.f6125f, abstractC2758q)) {
            C2686e c2686e = this.f6127h;
            if (!(c2686e == null ? false : C2686e.m4661a(c2686e.f8570a, j5))) {
            }
        } else {
            if (j5 != 9205357640488583168L) {
                this.f6125f = abstractC2758q;
                this.f6127h = new C2686e(j5);
                this.f6126g = AbstractC1385s.m2624n(new InterfaceC1599a() { // from class: a1.e
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p112W2.InterfaceC1599a
                    /* JADX INFO: renamed from: a */
                    public final Object mo6a() {
                        return ((AbstractC2736K) abstractC2758q).mo4781b(j5);
                    }
                });
            }
        }
        C2748g c2748gM3260a = m3260a();
        C1311F c1311f = this.f6126g;
        c2748gM3260a.m4872j(c1311f != null ? (Shader) c1311f.getValue() : null);
        this.f6124e = null;
        AbstractC1796i.m3269c(this, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
