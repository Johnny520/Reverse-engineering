package p265s1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import p121i3.C3185o;
import p172l8.C4700i0;
import p215oc.C5725t;
import p250r1.C6457g;

/* JADX INFO: renamed from: s1.e0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7067e0 implements InterfaceC7088i1 {

    /* JADX INFO: renamed from: a */
    public Canvas f23518a = AbstractC7072f0.f23543a;

    /* JADX INFO: renamed from: b */
    public Rect f23519b;

    /* JADX INFO: renamed from: c */
    public Rect f23520c;

    /* JADX INFO: renamed from: a */
    public final Canvas m27829a() {
        return this.f23518a;
    }

    @Override // p265s1.InterfaceC7088i1
    /* JADX INFO: renamed from: b */
    public void mo27830b(InterfaceC7144t2 interfaceC7144t2, int i10) {
        Canvas canvas = this.f23518a;
        if (interfaceC7144t2 instanceof C7132r0) {
            canvas.clipPath(((C7132r0) interfaceC7144t2).m28188v(), m27850z(i10));
        } else {
            C5725t.m23179a("Unable to obtain android.graphics.Path");
        }
    }

    @Override // p265s1.InterfaceC7088i1
    /* JADX INFO: renamed from: c */
    public void mo27831c(float f10, float f11, float f12, float f13, int i10) {
        this.f23518a.clipRect(f10, f11, f12, f13, m27850z(i10));
    }

    @Override // p265s1.InterfaceC7088i1
    /* JADX INFO: renamed from: d */
    public void mo27832d(float f10, float f11) {
        this.f23518a.translate(f10, f11);
    }

    @Override // p265s1.InterfaceC7088i1
    /* JADX INFO: renamed from: e */
    public void mo27833e(float f10, float f11, float f12, float f13, float f14, float f15, InterfaceC7134r2 interfaceC7134r2) {
        this.f23518a.drawRoundRect(f10, f11, f12, f13, f14, f15, interfaceC7134r2.mo28066k());
    }

    @Override // p265s1.InterfaceC7088i1
    /* JADX INFO: renamed from: f */
    public void mo27834f(float f10, float f11) {
        this.f23518a.scale(f10, f11);
    }

    @Override // p265s1.InterfaceC7088i1
    /* JADX INFO: renamed from: g */
    public void mo27835g(long j10, long j11, InterfaceC7134r2 interfaceC7134r2) {
        this.f23518a.drawLine(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), interfaceC7134r2.mo28066k());
    }

    @Override // p265s1.InterfaceC7088i1
    /* JADX INFO: renamed from: h */
    public void mo27836h(float f10) {
        this.f23518a.rotate(f10);
    }

    @Override // p265s1.InterfaceC7088i1
    /* JADX INFO: renamed from: i */
    public void mo27837i(float f10, float f11, float f12, float f13, InterfaceC7134r2 interfaceC7134r2) {
        this.f23518a.drawRect(f10, f11, f12, f13, interfaceC7134r2.mo28066k());
    }

    @Override // p265s1.InterfaceC7088i1
    /* JADX INFO: renamed from: j */
    public void mo27838j(InterfaceC7089i2 interfaceC7089i2, long j10, long j11, long j12, long j13, InterfaceC7134r2 interfaceC7134r2) {
        if (this.f23519b == null) {
            this.f23519b = new Rect();
            this.f23520c = new Rect();
        }
        Canvas canvas = this.f23518a;
        Bitmap bitmapM28014b = AbstractC7112n0.m28014b(interfaceC7089i2);
        Rect rect = this.f23519b;
        rect.getClass();
        rect.left = C3185o.m12049i(j10);
        rect.top = C3185o.m12050j(j10);
        rect.right = C3185o.m12049i(j10) + ((int) (j11 >> 32));
        rect.bottom = C3185o.m12050j(j10) + ((int) (j11 & 4294967295L));
        C4700i0 c4700i0 = C4700i0.f13910a;
        Rect rect2 = this.f23520c;
        rect2.getClass();
        rect2.left = C3185o.m12049i(j12);
        rect2.top = C3185o.m12050j(j12);
        rect2.right = C3185o.m12049i(j12) + ((int) (j13 >> 32));
        rect2.bottom = C3185o.m12050j(j12) + ((int) (j13 & 4294967295L));
        canvas.drawBitmap(bitmapM28014b, rect, rect2, interfaceC7134r2.mo28066k());
    }

    @Override // p265s1.InterfaceC7088i1
    /* JADX INFO: renamed from: k */
    public void mo27839k(InterfaceC7144t2 interfaceC7144t2, InterfaceC7134r2 interfaceC7134r2) {
        Canvas canvas = this.f23518a;
        if (interfaceC7144t2 instanceof C7132r0) {
            canvas.drawPath(((C7132r0) interfaceC7144t2).m28188v(), interfaceC7134r2.mo28066k());
        } else {
            C5725t.m23179a("Unable to obtain android.graphics.Path");
        }
    }

    @Override // p265s1.InterfaceC7088i1
    /* JADX INFO: renamed from: l */
    public void mo27840l(C6457g c6457g, InterfaceC7134r2 interfaceC7134r2) {
        this.f23518a.saveLayer(c6457g.m25583l(), c6457g.m25586o(), c6457g.m25584m(), c6457g.m25580i(), interfaceC7134r2.mo28066k(), 31);
    }

    @Override // p265s1.InterfaceC7088i1
    /* JADX INFO: renamed from: n */
    public void mo27841n() {
        this.f23518a.save();
    }

    @Override // p265s1.InterfaceC7088i1
    /* JADX INFO: renamed from: o */
    public void mo27842o() {
        C7103l1.f23602a.m27987a(this.f23518a, false);
    }

    @Override // p265s1.InterfaceC7088i1
    /* JADX INFO: renamed from: p */
    public void mo27843p(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, InterfaceC7134r2 interfaceC7134r2) {
        this.f23518a.drawArc(f10, f11, f12, f13, f14, f15, z10, interfaceC7134r2.mo28066k());
    }

    @Override // p265s1.InterfaceC7088i1
    /* JADX INFO: renamed from: q */
    public void mo27844q(float[] fArr) {
        if (AbstractC7119o2.m28053a(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        AbstractC7117o0.m28050a(matrix, fArr);
        this.f23518a.concat(matrix);
    }

    @Override // p265s1.InterfaceC7088i1
    /* JADX INFO: renamed from: s */
    public void mo27845s(InterfaceC7089i2 interfaceC7089i2, long j10, InterfaceC7134r2 interfaceC7134r2) {
        this.f23518a.drawBitmap(AbstractC7112n0.m28014b(interfaceC7089i2), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), interfaceC7134r2.mo28066k());
    }

    @Override // p265s1.InterfaceC7088i1
    /* JADX INFO: renamed from: u */
    public void mo27846u(long j10, float f10, InterfaceC7134r2 interfaceC7134r2) {
        this.f23518a.drawCircle(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), f10, interfaceC7134r2.mo28066k());
    }

    @Override // p265s1.InterfaceC7088i1
    /* JADX INFO: renamed from: w */
    public void mo27847w() {
        this.f23518a.restore();
    }

    @Override // p265s1.InterfaceC7088i1
    /* JADX INFO: renamed from: x */
    public void mo27848x() {
        C7103l1.f23602a.m27987a(this.f23518a, true);
    }

    /* JADX INFO: renamed from: y */
    public final void m27849y(Canvas canvas) {
        this.f23518a = canvas;
    }

    /* JADX INFO: renamed from: z */
    public final Region.Op m27850z(int i10) {
        return AbstractC7123p1.m28083d(i10, AbstractC7123p1.f23633a.m28084a()) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }
}
