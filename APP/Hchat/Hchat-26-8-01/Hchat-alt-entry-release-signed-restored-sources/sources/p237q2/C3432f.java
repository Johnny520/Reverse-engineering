package p237q2;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import gg.AbstractC1416l;
import okio.C3193a;
import p057e1.C0810e;
import p071f1.AbstractC0996c0;
import p071f1.AbstractC1022p0;
import p071f1.AbstractC1027s;
import p071f1.C1005h;
import p071f1.C1024q0;
import p071f1.C1030t0;
import p071f1.C1034w;
import p101h1.AbstractC1566c;
import p101h1.C1569f;
import p101h1.C1570g;
import p117i0.AbstractC1874r;
import p117i0.C1892x;
import p129ig.AbstractC2043a;
import p280t2.C4096l;

/* JADX INFO: renamed from: q2.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3432f extends TextPaint {

    /* JADX INFO: renamed from: a */
    public C1005h f11114a;

    /* JADX INFO: renamed from: b */
    public C4096l f11115b;

    /* JADX INFO: renamed from: c */
    public int f11116c;

    /* JADX INFO: renamed from: d */
    public C1024q0 f11117d;

    /* JADX INFO: renamed from: e */
    public C1034w f11118e;

    /* JADX INFO: renamed from: f */
    public AbstractC1027s f11119f;

    /* JADX INFO: renamed from: g */
    public C1892x f11120g;

    /* JADX INFO: renamed from: h */
    public C0810e f11121h;

    /* JADX INFO: renamed from: i */
    public AbstractC1566c f11122i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C1005h m7202a() {
        C1005h c1005h = this.f11114a;
        if (c1005h != null) {
            return c1005h;
        }
        C1005h c1005h2 = new C1005h(this);
        this.f11114a = c1005h2;
        return c1005h2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m7203b(int i9) {
        if (i9 == this.f11116c) {
            return;
        }
        m7202a().m2587v(i9);
        this.f11116c = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7204c(AbstractC1027s abstractC1027s, long j3, float f3) {
        if (abstractC1027s == null) {
            this.f11120g = null;
            this.f11119f = null;
            this.f11121h = null;
            setShader(null);
            return;
        }
        if (abstractC1027s instanceof C1030t0) {
            m7205d(AbstractC2043a.m5008N(((C1030t0) abstractC1027s).f3253a, f3));
            return;
        }
        if (!(abstractC1027s instanceof AbstractC1022p0)) {
            C3193a.m6822k();
            return;
        }
        if (AbstractC1416l.m3825a(this.f11119f, abstractC1027s)) {
            C0810e c0810e = this.f11121h;
            if (!(c0810e == null ? false : C0810e.m2054a(c0810e.f2428a, j3))) {
            }
        } else {
            if (j3 != 9205357640488583168L) {
                this.f11119f = abstractC1027s;
                this.f11121h = new C0810e(j3);
                this.f11120g = AbstractC1874r.m4634p(new C3431e(abstractC1027s, j3, 0));
            }
        }
        C1005h c1005hM7202a = m7202a();
        C1892x c1892x = this.f11120g;
        c1005hM7202a.m2591z(c1892x != null ? (Shader) c1892x.getValue() : null);
        this.f11118e = null;
        AbstractC3436j.m7211c(this, f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m7205d(long j3) {
        C1034w c1034w = this.f11118e;
        if (c1034w == null ? false : C1034w.m2635c(c1034w.f3265a, j3)) {
            return;
        }
        if (j3 != 16) {
            this.f11118e = new C1034w(j3);
            setColor(AbstractC0996c0.m2526w(j3));
            this.f11120g = null;
            this.f11119f = null;
            this.f11121h = null;
            setShader(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m7206e(AbstractC1566c abstractC1566c) {
        if (abstractC1566c == null || AbstractC1416l.m3825a(this.f11122i, abstractC1566c)) {
            return;
        }
        this.f11122i = abstractC1566c;
        if (abstractC1566c.equals(C1569f.f5225b)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(abstractC1566c instanceof C1570g)) {
            C3193a.m6822k();
            return;
        }
        m7202a().m2565D(1);
        C1570g c1570g = (C1570g) abstractC1566c;
        m7202a().m2564C(c1570g.f5226b);
        C1005h c1005hM7202a = m7202a();
        ((Paint) c1005hM7202a.f3182i).setStrokeMiter(c1570g.f5227c);
        m7202a().m2563B(c1570g.f5229e);
        m7202a().m2562A(c1570g.f5228d);
        ((Paint) m7202a().f3182i).setPathEffect(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m7207f(C1024q0 c1024q0) {
        if (c1024q0 == null || AbstractC1416l.m3825a(this.f11117d, c1024q0)) {
            return;
        }
        this.f11117d = c1024q0;
        if (c1024q0.equals(C1024q0.f3233d)) {
            clearShadowLayer();
            return;
        }
        C1024q0 c1024q02 = this.f11117d;
        float f3 = c1024q02.f3236c;
        if (f3 == 0.0f) {
            f3 = Float.MIN_VALUE;
        }
        setShadowLayer(f3, Float.intBitsToFloat((int) (c1024q02.f3235b >> 32)), Float.intBitsToFloat((int) (this.f11117d.f3235b & 4294967295L)), AbstractC0996c0.m2526w(this.f11117d.f3234a));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m7208g(C4096l c4096l) {
        if (c4096l == null || AbstractC1416l.m3825a(this.f11115b, c4096l)) {
            return;
        }
        this.f11115b = c4096l;
        int i9 = c4096l.f13561a;
        setUnderlineText((i9 | 1) == i9);
        int i10 = this.f11115b.f13561a;
        setStrikeThruText((i10 | 2) == i10);
    }
}
