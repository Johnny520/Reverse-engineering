package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: renamed from: b3 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0041b3 implements InterfaceC0051bd {

    /* JADX INFO: renamed from: a */
    public Canvas f362a = AbstractC0077c3.f648a;

    /* JADX INFO: renamed from: b */
    public Rect f363b;

    /* JADX INFO: renamed from: c */
    public Rect f364c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0051bd
    /* JADX INFO: renamed from: a */
    public final void mo235a(float f, float f2) {
        this.f362a.scale(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0051bd
    /* JADX INFO: renamed from: b */
    public final void mo236b(float f, long j, C0877w5 c0877w5) {
        this.f362a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, c0877w5.f7002a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0051bd
    /* JADX INFO: renamed from: c */
    public final void mo237c(C0752t5 c0752t5, long j, long j2, long j3, C0877w5 c0877w5) {
        if (this.f363b == null) {
            this.f363b = new Rect();
            this.f364c = new Rect();
        }
        Canvas canvas = this.f362a;
        if (c0752t5 == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        Bitmap bitmap = c0752t5.f5913a;
        Rect rect = this.f363b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.f364c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmap, rect, rect2, c0877w5.f7002a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0051bd
    /* JADX INFO: renamed from: d */
    public final void mo238d(float f, float f2, float f3, float f4, int i) {
        this.f362a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0051bd
    /* JADX INFO: renamed from: e */
    public final void mo239e(float f, float f2) {
        this.f362a.translate(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0051bd
    /* JADX INFO: renamed from: f */
    public final void mo240f(C0118d6 c0118d6, C0877w5 c0877w5) {
        Canvas canvas = this.f362a;
        if (!(c0118d6 instanceof C0118d6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(c0118d6.f973a, c0877w5.f7002a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0051bd
    /* JADX INFO: renamed from: g */
    public final void mo241g() {
        this.f362a.restore();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0051bd
    /* JADX INFO: renamed from: h */
    public final void mo242h(float f, float f2, float f3, float f4, float f5, float f6, C0877w5 c0877w5) {
        this.f362a.drawRoundRect(f, f2, f3, f4, f5, f6, c0877w5.f7002a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0051bd
    /* JADX INFO: renamed from: i */
    public final void mo243i() {
        this.f362a.save();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0051bd
    /* JADX INFO: renamed from: j */
    public final void mo244j(long j, long j2, C0877w5 c0877w5) {
        this.f362a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), c0877w5.f7002a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0051bd
    /* JADX INFO: renamed from: k */
    public final void mo245k() {
        this.f362a.disableZ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0051bd
    /* JADX INFO: renamed from: l */
    public final void mo246l(st0 st0Var, C0877w5 c0877w5) {
        this.f362a.saveLayer(st0Var.f5832a, st0Var.f5833b, st0Var.f5834c, st0Var.f5835d, c0877w5.f7002a, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0051bd
    /* JADX INFO: renamed from: m */
    public final void mo247m(float f, float f2, float f3, float f4, C0877w5 c0877w5) {
        this.f362a.drawRect(f, f2, f3, f4, c0877w5.f7002a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0051bd
    /* JADX INFO: renamed from: n */
    public final void mo248n(float[] fArr) {
        if (w60.m4919z(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
        this.f362a.concat(matrix);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0051bd
    /* JADX INFO: renamed from: o */
    public final void mo249o() {
        this.f362a.enableZ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0051bd
    /* JADX INFO: renamed from: p */
    public final void mo250p(C0118d6 c0118d6) {
        Canvas canvas = this.f362a;
        if (!(c0118d6 instanceof C0118d6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(c0118d6.f973a, Region.Op.INTERSECT);
    }
}
