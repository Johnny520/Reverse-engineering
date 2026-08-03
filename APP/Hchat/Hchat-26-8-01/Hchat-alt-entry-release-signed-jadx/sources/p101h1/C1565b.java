package p101h1;

import android.graphics.Paint;
import android.graphics.Shader;
import androidx.lifecycle.C0119x;
import gg.AbstractC1416l;
import okio.C3193a;
import p020b5.C0184c;
import p071f1.AbstractC0996c0;
import p071f1.AbstractC1027s;
import p071f1.C1003g;
import p071f1.C1005h;
import p071f1.C1009j;
import p071f1.C1017n;
import p071f1.C1034w;
import p071f1.InterfaceC1031u;
import p293u2.EnumC4243m;

/* JADX INFO: renamed from: h1.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1565b implements InterfaceC1567d {

    /* JADX INFO: renamed from: g */
    public final C1564a f5219g;

    /* JADX INFO: renamed from: h */
    public final C0184c f5220h;

    /* JADX INFO: renamed from: i */
    public C1005h f5221i;

    /* JADX INFO: renamed from: j */
    public C1005h f5222j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1565b() {
        C1564a c1564a = new C1564a();
        c1564a.f5215a = AbstractC1566c.f5223a;
        c1564a.f5216b = EnumC4243m.f13919g;
        c1564a.f5217c = C1568e.f5224a;
        c1564a.f5218d = 0L;
        this.f5219g = c1564a;
        C0184c c0184c = new C0184c();
        c0184c.f471c = this;
        c0184c.f469a = new C0119x(c0184c, 16);
        this.f5220h = c0184c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static C1005h m4069e(C1565b c1565b, long j3, AbstractC1566c abstractC1566c, float f3, int i9) {
        C1005h c1005hM4077m = c1565b.m4077m(abstractC1566c);
        Paint paint = (Paint) c1005hM4077m.f3182i;
        if (f3 != 1.0f) {
            j3 = C1034w.m2634b(j3, C1034w.m2636d(j3) * f3);
        }
        if (!C1034w.m2635c(AbstractC0996c0.m2507c(paint.getColor()), j3)) {
            c1005hM4077m.m2588w(j3);
        }
        if (((Shader) c1005hM4077m.f3183j) != null) {
            c1005hM4077m.m2591z(null);
        }
        if (!AbstractC1416l.m3825a((C1017n) c1005hM4077m.f3184k, null)) {
            c1005hM4077m.m2589x(null);
        }
        if (c1005hM4077m.f3181h != i9) {
            c1005hM4077m.m2587v(i9);
        }
        if (paint.isFilterBitmap()) {
            return c1005hM4077m;
        }
        c1005hM4077m.m2590y(1);
        return c1005hM4077m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p101h1.InterfaceC1567d
    /* JADX INFO: renamed from: F0 */
    public final void mo4070F0(C1009j c1009j, long j3, float f3, AbstractC1566c abstractC1566c) {
        this.f5219g.f5217c.mo2492j(c1009j, m4069e(this, j3, abstractC1566c, f3, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p101h1.InterfaceC1567d
    /* JADX INFO: renamed from: P0 */
    public final void mo4071P0(long j3, long j4, long j5, float f3, AbstractC1566c abstractC1566c, int i9) {
        int i10 = (int) (j4 >> 32);
        int i11 = (int) (j4 & 4294967295L);
        this.f5219g.f5217c.mo2501t(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j5 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (4294967295L & j5)) + Float.intBitsToFloat(i11), m4069e(this, j3, abstractC1566c, f3, i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p101h1.InterfaceC1567d
    /* JADX INFO: renamed from: V */
    public final void mo4072V(C1009j c1009j, AbstractC1027s abstractC1027s, float f3, AbstractC1566c abstractC1566c, int i9) {
        this.f5219g.f5217c.mo2492j(c1009j, m4076j(abstractC1027s, abstractC1566c, f3, null, i9, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p101h1.InterfaceC1567d
    /* JADX INFO: renamed from: W0 */
    public final void mo4073W0(C1003g c1003g, long j3, float f3, C1017n c1017n, int i9) {
        this.f5219g.f5217c.mo2488f(c1003g, j3, m4076j(null, C1569f.f5225b, f3, c1017n, i9, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p101h1.InterfaceC1567d
    /* JADX INFO: renamed from: a0 */
    public final void mo4074a0(long j3, long j4, long j5, float f3) {
        InterfaceC1031u interfaceC1031u = this.f5219g.f5217c;
        C1005h c1005hM2510f = this.f5222j;
        if (c1005hM2510f == null) {
            c1005hM2510f = AbstractC0996c0.m2510f();
            c1005hM2510f.m2565D(1);
            this.f5222j = c1005hM2510f;
        }
        Paint paint = (Paint) c1005hM2510f.f3182i;
        if (!C1034w.m2635c(AbstractC0996c0.m2507c(paint.getColor()), j3)) {
            c1005hM2510f.m2588w(j3);
        }
        if (((Shader) c1005hM2510f.f3183j) != null) {
            c1005hM2510f.m2591z(null);
        }
        if (!AbstractC1416l.m3825a((C1017n) c1005hM2510f.f3184k, null)) {
            c1005hM2510f.m2589x(null);
        }
        if (c1005hM2510f.f3181h != 3) {
            c1005hM2510f.m2587v(3);
        }
        if (paint.getStrokeWidth() != f3) {
            c1005hM2510f.m2564C(f3);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (c1005hM2510f.m2581p() != 1) {
            c1005hM2510f.m2562A(1);
        }
        if (c1005hM2510f.m2582q() != 0) {
            c1005hM2510f.m2563B(0);
        }
        if (!paint.isFilterBitmap()) {
            c1005hM2510f.m2590y(1);
        }
        interfaceC1031u.mo2496o(j4, j5, c1005hM2510f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: d */
    public final float mo1333d() {
        return this.f5219g.f5215a.mo1333d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p101h1.InterfaceC1567d
    /* JADX INFO: renamed from: d0 */
    public final void mo4075d0(AbstractC1027s abstractC1027s, long j3, long j4, float f3, AbstractC1566c abstractC1566c, int i9) {
        int i10 = (int) (j3 >> 32);
        int i11 = (int) (j3 & 4294967295L);
        this.f5219g.f5217c.mo2501t(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j4 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (4294967295L & j4)) + Float.intBitsToFloat(i11), m4076j(abstractC1027s, abstractC1566c, f3, null, i9, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p101h1.InterfaceC1567d
    public final EnumC4243m getLayoutDirection() {
        return this.f5219g.f5216b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final C1005h m4076j(AbstractC1027s abstractC1027s, AbstractC1566c abstractC1566c, float f3, C1017n c1017n, int i9, int i10) {
        C1005h c1005hM4077m = m4077m(abstractC1566c);
        Paint paint = (Paint) c1005hM4077m.f3182i;
        if (abstractC1027s != null) {
            abstractC1027s.mo2628a(f3, mo4091a(), c1005hM4077m);
        } else {
            if (((Shader) c1005hM4077m.f3183j) != null) {
                c1005hM4077m.m2591z(null);
            }
            long jM2507c = AbstractC0996c0.m2507c(paint.getColor());
            long j3 = C1034w.f3258b;
            if (!C1034w.m2635c(jM2507c, j3)) {
                c1005hM4077m.m2588w(j3);
            }
            if (paint.getAlpha() / 255.0f != f3) {
                c1005hM4077m.m2586u(f3);
            }
        }
        if (!AbstractC1416l.m3825a((C1017n) c1005hM4077m.f3184k, c1017n)) {
            c1005hM4077m.m2589x(c1017n);
        }
        if (c1005hM4077m.f3181h != i9) {
            c1005hM4077m.m2587v(i9);
        }
        if (paint.isFilterBitmap() == i10) {
            return c1005hM4077m;
        }
        c1005hM4077m.m2590y(i10);
        return c1005hM4077m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final C1005h m4077m(AbstractC1566c abstractC1566c) {
        if (AbstractC1416l.m3825a(abstractC1566c, C1569f.f5225b)) {
            C1005h c1005h = this.f5221i;
            if (c1005h != null) {
                return c1005h;
            }
            C1005h c1005hM2510f = AbstractC0996c0.m2510f();
            c1005hM2510f.m2565D(0);
            this.f5221i = c1005hM2510f;
            return c1005hM2510f;
        }
        if (!(abstractC1566c instanceof C1570g)) {
            C3193a.m6822k();
            return null;
        }
        C1005h c1005hM2510f2 = this.f5222j;
        if (c1005hM2510f2 == null) {
            c1005hM2510f2 = AbstractC0996c0.m2510f();
            c1005hM2510f2.m2565D(1);
            this.f5222j = c1005hM2510f2;
        }
        Paint paint = (Paint) c1005hM2510f2.f3182i;
        float strokeWidth = paint.getStrokeWidth();
        C1570g c1570g = (C1570g) abstractC1566c;
        float f3 = c1570g.f5226b;
        if (strokeWidth != f3) {
            c1005hM2510f2.m2564C(f3);
        }
        int iM2581p = c1005hM2510f2.m2581p();
        int i9 = c1570g.f5228d;
        if (iM2581p != i9) {
            c1005hM2510f2.m2562A(i9);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f10 = c1570g.f5227c;
        if (strokeMiter != f10) {
            paint.setStrokeMiter(f10);
        }
        int iM2582q = c1005hM2510f2.m2582q();
        int i10 = c1570g.f5229e;
        if (iM2582q == i10) {
            return c1005hM2510f2;
        }
        c1005hM2510f2.m2563B(i10);
        return c1005hM2510f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: q0 */
    public final float mo1335q0() {
        return this.f5219g.f5215a.mo1335q0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p101h1.InterfaceC1567d
    /* JADX INFO: renamed from: t0 */
    public final void mo4078t0(float f3, long j3, long j4) {
        this.f5219g.f5217c.mo2483a(f3, j4, m4069e(this, j3, C1569f.f5225b, 1.0f, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p101h1.InterfaceC1567d
    /* JADX INFO: renamed from: v0 */
    public final void mo4079v0(C1003g c1003g, long j3, long j4, long j5, float f3, C1017n c1017n, int i9) {
        this.f5219g.f5217c.mo2491i(c1003g, j3, j4, j5, m4076j(null, C1569f.f5225b, f3, c1017n, 3, i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p101h1.InterfaceC1567d
    /* JADX INFO: renamed from: x */
    public final void mo4080x(long j3, long j4, AbstractC1566c abstractC1566c) {
        int i9 = (int) 0;
        int i10 = (int) 0;
        this.f5219g.f5217c.mo2500s(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j4 >> 32)) + Float.intBitsToFloat(i9), Float.intBitsToFloat((int) (4294967295L & j4)) + Float.intBitsToFloat(i10), m4069e(this, j3, abstractC1566c, 1.0f, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p101h1.InterfaceC1567d
    /* JADX INFO: renamed from: z0 */
    public final C0184c mo4081z0() {
        return this.f5220h;
    }
}
