package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: renamed from: f6 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0192f6 implements InterfaceC0627qp {

    /* JADX INFO: renamed from: a */
    public Canvas f2807a = AbstractC0229g6.f3317a;

    /* JADX INFO: renamed from: b */
    public Rect f2808b;

    /* JADX INFO: renamed from: c */
    public Rect f2809c;

    @Override // p000.InterfaceC0627qp
    /* JADX INFO: renamed from: a */
    public final void mo1512a(C0122d9 c0122d9, C0611q9 c0611q9) {
        this.f2807a.drawBitmap(p40.m3727i(c0122d9), Float.intBitsToFloat(0), Float.intBitsToFloat(0), (Paint) c0611q9.f8830c);
    }

    @Override // p000.InterfaceC0627qp
    /* JADX INFO: renamed from: b */
    public final void mo1513b(float f, float f2) {
        this.f2807a.scale(f, f2);
    }

    @Override // p000.InterfaceC0627qp
    /* JADX INFO: renamed from: c */
    public final void mo1514c(float f) {
        this.f2807a.rotate(f);
    }

    @Override // p000.InterfaceC0627qp
    /* JADX INFO: renamed from: d */
    public final void mo1515d(float f, long j, C0611q9 c0611q9) {
        this.f2807a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) c0611q9.f8830c);
    }

    @Override // p000.InterfaceC0627qp
    /* JADX INFO: renamed from: e */
    public final void mo1516e(C0122d9 c0122d9, long j, long j2, long j3, C0611q9 c0611q9) {
        if (this.f2808b == null) {
            this.f2808b = new Rect();
            this.f2809c = new Rect();
        }
        Canvas canvas = this.f2807a;
        Bitmap bitmapM3727i = p40.m3727i(c0122d9);
        Rect rect = this.f2808b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.f2809c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapM3727i, rect, rect2, (Paint) c0611q9.f8830c);
    }

    @Override // p000.InterfaceC0627qp
    /* JADX INFO: renamed from: f */
    public final void mo1517f(float f, float f2, float f3, float f4, int i) {
        this.f2807a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // p000.InterfaceC0627qp
    /* JADX INFO: renamed from: g */
    public final void mo1518g(float f, float f2) {
        this.f2807a.translate(f, f2);
    }

    @Override // p000.InterfaceC0627qp
    /* JADX INFO: renamed from: h */
    public final void mo1519h(C0915y9 c0915y9, C0611q9 c0611q9) {
        Canvas canvas = this.f2807a;
        if (c0915y9 instanceof C0915y9) {
            canvas.drawPath(c0915y9.f13365a, pp0.m3925w(c0611q9));
        } else {
            c80.m676t("Unable to obtain android.graphics.Path");
        }
    }

    @Override // p000.InterfaceC0627qp
    /* JADX INFO: renamed from: i */
    public final void mo1520i() {
        this.f2807a.restore();
    }

    @Override // p000.InterfaceC0627qp
    /* JADX INFO: renamed from: j */
    public final void mo1521j(float f, float f2, float f3, float f4, float f5, float f6, C0611q9 c0611q9) {
        this.f2807a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) c0611q9.f8830c);
    }

    @Override // p000.InterfaceC0627qp
    /* JADX INFO: renamed from: l */
    public final void mo1522l() {
        this.f2807a.save();
    }

    @Override // p000.InterfaceC0627qp
    /* JADX INFO: renamed from: m */
    public final void mo1523m(long j, long j2, C0611q9 c0611q9) {
        this.f2807a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) c0611q9.f8830c);
    }

    @Override // p000.InterfaceC0627qp
    /* JADX INFO: renamed from: n */
    public final void mo1524n() {
        sp0.m4966z(this.f2807a, false);
    }

    @Override // p000.InterfaceC0627qp
    /* JADX INFO: renamed from: o */
    public final void mo1525o(o62 o62Var, C0611q9 c0611q9) {
        this.f2807a.saveLayer(o62Var.f7536a, o62Var.f7537b, o62Var.f7538c, o62Var.f7539d, (Paint) c0611q9.f8830c, 31);
    }

    @Override // p000.InterfaceC0627qp
    /* JADX INFO: renamed from: p */
    public final void mo1526p(float f, float f2, float f3, float f4, C0611q9 c0611q9) {
        this.f2807a.drawRect(f, f2, f3, f4, pp0.m3925w(c0611q9));
    }

    @Override // p000.InterfaceC0627qp
    /* JADX INFO: renamed from: q */
    public final void mo1527q(float[] fArr) {
        if (AbstractC0570p7.m3789y(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        ci0.m796U(matrix, fArr);
        this.f2807a.concat(matrix);
    }

    @Override // p000.InterfaceC0627qp
    /* JADX INFO: renamed from: r */
    public final void mo1528r() {
        sp0.m4966z(this.f2807a, true);
    }

    @Override // p000.InterfaceC0627qp
    /* JADX INFO: renamed from: s */
    public final void mo1529s(C0915y9 c0915y9) {
        Canvas canvas = this.f2807a;
        if (c0915y9 instanceof C0915y9) {
            canvas.clipPath(c0915y9.f13365a, Region.Op.INTERSECT);
        } else {
            c80.m676t("Unable to obtain android.graphics.Path");
        }
    }

    @Override // p000.InterfaceC0627qp
    /* JADX INFO: renamed from: t */
    public final void mo1530t(float f, float f2, float f3, float f4, float f5, float f6, C0611q9 c0611q9) {
        this.f2807a.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) c0611q9.f8830c);
    }
}
