package p000;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* JADX INFO: renamed from: qb */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0613qb extends TextPaint {

    /* JADX INFO: renamed from: a */
    public C0611q9 f8863a;

    /* JADX INFO: renamed from: b */
    public gz2 f8864b;

    /* JADX INFO: renamed from: c */
    public int f8865c;

    /* JADX INFO: renamed from: d */
    public bq2 f8866d;

    /* JADX INFO: renamed from: e */
    public C0363ju f8867e;

    /* JADX INFO: renamed from: f */
    public AbstractC0024an f8868f;

    /* JADX INFO: renamed from: g */
    public n70 f8869g;

    /* JADX INFO: renamed from: h */
    public gr2 f8870h;

    /* JADX INFO: renamed from: i */
    public op0 f8871i;

    /* JADX INFO: renamed from: a */
    public final C0611q9 m4106a() {
        C0611q9 c0611q9 = this.f8863a;
        if (c0611q9 != null) {
            return c0611q9;
        }
        C0611q9 c0611q92 = new C0611q9(this);
        this.f8863a = c0611q92;
        return c0611q92;
    }

    /* JADX INFO: renamed from: b */
    public final void m4107b(int i) {
        if (i == this.f8865c) {
            return;
        }
        m4106a().m4094j(i);
        this.f8865c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4108c(final AbstractC0024an abstractC0024an, final long j, float f) {
        if (abstractC0024an == null) {
            this.f8869g = null;
            this.f8868f = null;
            this.f8870h = null;
            setShader(null);
            return;
        }
        if (abstractC0024an instanceof ft2) {
            m4109d(rp0.m4548i0(f, ((ft2) abstractC0024an).f3140a));
            return;
        }
        if (!(abstractC0024an instanceof zp2)) {
            c80.m675s();
            return;
        }
        if (t11.m5086l(this.f8868f, abstractC0024an)) {
            gr2 gr2Var = this.f8870h;
            if (!(gr2Var == null ? false : gr2.m2019a(gr2Var.f3684a, j))) {
            }
        } else {
            if (j != 9205357640488583168L) {
                this.f8868f = abstractC0024an;
                this.f8870h = new gr2(j);
                this.f8869g = op0.m3590m(new xm0() { // from class: pb
                    @Override // p000.xm0
                    /* JADX INFO: renamed from: a */
                    public final Object mo6a() {
                        return ((zp2) abstractC0024an).mo507b(j);
                    }
                });
            }
        }
        C0611q9 c0611q9M4106a = m4106a();
        n70 n70Var = this.f8869g;
        c0611q9M4106a.m4098n(n70Var != null ? (Shader) n70Var.getValue() : null);
        this.f8867e = null;
        sp0.m4943h0(this, f);
    }

    /* JADX INFO: renamed from: d */
    public final void m4109d(long j) {
        C0363ju c0363ju = this.f8867e;
        if (c0363ju == null ? false : C0363ju.m2566c(c0363ju.f5219a, j)) {
            return;
        }
        if (j != 16) {
            this.f8867e = new C0363ju(j);
            setColor(sp0.m4947j0(j));
            this.f8869g = null;
            this.f8868f = null;
            this.f8870h = null;
            setShader(null);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4110e(op0 op0Var) {
        if (op0Var == null || t11.m5086l(this.f8871i, op0Var)) {
            return;
        }
        this.f8871i = op0Var;
        if (op0Var.equals(xi0.f13041h)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(op0Var instanceof xv2)) {
            c80.m675s();
            return;
        }
        m4106a().m4102r(1);
        xv2 xv2Var = (xv2) op0Var;
        m4106a().m4101q(xv2Var.f13195h);
        C0611q9 c0611q9M4106a = m4106a();
        ((Paint) c0611q9M4106a.f8830c).setStrokeMiter(xv2Var.f13196i);
        m4106a().m4100p(xv2Var.f13198k);
        m4106a().m4099o(xv2Var.f13197j);
        ((Paint) m4106a().f8830c).setPathEffect(null);
    }

    /* JADX INFO: renamed from: f */
    public final void m4111f(bq2 bq2Var) {
        if (bq2Var == null || t11.m5086l(this.f8866d, bq2Var)) {
            return;
        }
        this.f8866d = bq2Var;
        if (bq2Var.equals(bq2.f985d)) {
            clearShadowLayer();
            return;
        }
        bq2 bq2Var2 = this.f8866d;
        float f = bq2Var2.f988c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (bq2Var2.f987b >> 32)), Float.intBitsToFloat((int) (this.f8866d.f987b & 4294967295L)), sp0.m4947j0(this.f8866d.f986a));
    }

    /* JADX INFO: renamed from: g */
    public final void m4112g(gz2 gz2Var) {
        if (gz2Var == null || t11.m5086l(this.f8864b, gz2Var)) {
            return;
        }
        this.f8864b = gz2Var;
        int i = gz2Var.f3749a;
        setUnderlineText((i | 1) == i);
        int i2 = this.f8864b.f3749a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
