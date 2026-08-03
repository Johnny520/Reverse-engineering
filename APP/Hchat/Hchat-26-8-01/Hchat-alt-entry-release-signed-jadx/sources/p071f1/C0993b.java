package p071f1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import p057e1.C0808c;
import p136j8.C2104o;

/* JADX INFO: renamed from: f1.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0993b implements InterfaceC1031u {

    /* JADX INFO: renamed from: a */
    public Canvas f3149a = AbstractC0995c.f3160a;

    /* JADX INFO: renamed from: b */
    public Rect f3150b;

    /* JADX INFO: renamed from: c */
    public Rect f3151c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1031u
    /* JADX INFO: renamed from: a */
    public final void mo2483a(float f3, long j3, C1005h c1005h) {
        this.f3149a.drawCircle(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), f3, (Paint) c1005h.f3182i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1031u
    /* JADX INFO: renamed from: b */
    public final void mo2484b(float f3, float f10) {
        this.f3149a.scale(f3, f10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1031u
    /* JADX INFO: renamed from: c */
    public final void mo2485c(C0808c c0808c, C1005h c1005h) {
        this.f3149a.saveLayer(c0808c.f2416a, c0808c.f2417b, c0808c.f2418c, c0808c.f2419d, AbstractC0996c0.m2515l(c1005h), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1031u
    /* JADX INFO: renamed from: d */
    public final void mo2486d(C1009j c1009j) {
        Canvas canvas = this.f3149a;
        if (c1009j instanceof C1009j) {
            canvas.clipPath(c1009j.f3191a, Region.Op.INTERSECT);
        } else {
            C2104o.m5297w("Unable to obtain android.graphics.Path");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1031u
    /* JADX INFO: renamed from: e */
    public final void mo2487e() {
        this.f3149a.save();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1031u
    /* JADX INFO: renamed from: f */
    public final void mo2488f(C1003g c1003g, long j3, C1005h c1005h) {
        this.f3149a.drawBitmap(AbstractC0996c0.m2512h(c1003g), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), (Paint) c1005h.f3182i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1031u
    /* JADX INFO: renamed from: g */
    public final void mo2489g() {
        AbstractC0996c0.m2514j(this.f3149a, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1031u
    /* JADX INFO: renamed from: h */
    public final void mo2490h(float[] fArr) {
        if (AbstractC0996c0.m2518o(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        AbstractC0996c0.m2519p(matrix, fArr);
        this.f3149a.concat(matrix);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1031u
    /* JADX INFO: renamed from: i */
    public final void mo2491i(C1003g c1003g, long j3, long j4, long j5, C1005h c1005h) {
        if (this.f3150b == null) {
            this.f3150b = new Rect();
            this.f3151c = new Rect();
        }
        Canvas canvas = this.f3149a;
        Bitmap bitmapM2512h = AbstractC0996c0.m2512h(c1003g);
        Rect rect = this.f3150b;
        rect.getClass();
        int i9 = (int) (j3 >> 32);
        rect.left = i9;
        int i10 = (int) (j3 & 4294967295L);
        rect.top = i10;
        rect.right = i9 + ((int) (j4 >> 32));
        rect.bottom = i10 + ((int) (j4 & 4294967295L));
        Rect rect2 = this.f3151c;
        rect2.getClass();
        int i11 = (int) 0;
        rect2.left = i11;
        int i12 = (int) 0;
        rect2.top = i12;
        rect2.right = i11 + ((int) (j5 >> 32));
        rect2.bottom = i12 + ((int) (4294967295L & j5));
        canvas.drawBitmap(bitmapM2512h, rect, rect2, (Paint) c1005h.f3182i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1031u
    /* JADX INFO: renamed from: j */
    public final void mo2492j(C1009j c1009j, C1005h c1005h) {
        Canvas canvas = this.f3149a;
        if (c1009j instanceof C1009j) {
            canvas.drawPath(c1009j.f3191a, AbstractC0996c0.m2515l(c1005h));
        } else {
            C2104o.m5297w("Unable to obtain android.graphics.Path");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1031u
    /* JADX INFO: renamed from: l */
    public final void mo2493l(float f3, float f10, float f11, float f12, int i9) {
        this.f3149a.clipRect(f3, f10, f11, f12, i9 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1031u
    /* JADX INFO: renamed from: m */
    public final void mo2494m(float f3, float f10) {
        this.f3149a.translate(f3, f10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1031u
    /* JADX INFO: renamed from: n */
    public final void mo2495n() {
        this.f3149a.rotate(45.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1031u
    /* JADX INFO: renamed from: o */
    public final void mo2496o(long j3, long j4, C1005h c1005h) {
        this.f3149a.drawLine(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), (Paint) c1005h.f3182i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1031u
    /* JADX INFO: renamed from: p */
    public final void mo2497p() {
        this.f3149a.restore();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1031u
    /* JADX INFO: renamed from: q */
    public final void mo2498q(float f3, float f10, float f11, float f12, float f13, float f14, C1005h c1005h) {
        this.f3149a.drawRoundRect(f3, f10, f11, f12, f13, f14, AbstractC0996c0.m2515l(c1005h));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1031u
    /* JADX INFO: renamed from: r */
    public final void mo2499r() {
        AbstractC0996c0.m2514j(this.f3149a, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1031u
    /* JADX INFO: renamed from: s */
    public final void mo2500s(float f3, float f10, float f11, float f12, C1005h c1005h) {
        this.f3149a.drawArc(f3, f10, f11, f12, -90.0f, 285.0f, false, (Paint) c1005h.f3182i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p071f1.InterfaceC1031u
    /* JADX INFO: renamed from: t */
    public final void mo2501t(float f3, float f10, float f11, float f12, C1005h c1005h) {
        this.f3149a.drawRect(f3, f10, f11, f12, AbstractC0996c0.m2515l(c1005h));
    }
}
