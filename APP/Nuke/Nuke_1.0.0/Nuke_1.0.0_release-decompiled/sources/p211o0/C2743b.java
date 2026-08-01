package p211o0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import p117X2.AbstractC1665j;
import p204n0.C2684c;

/* JADX INFO: renamed from: o0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2743b implements InterfaceC2760s {

    /* JADX INFO: renamed from: a */
    public Canvas f8723a = AbstractC2744c.f8726a;

    /* JADX INFO: renamed from: b */
    public Rect f8724b;

    /* JADX INFO: renamed from: c */
    public Rect f8725c;

    @Override // p211o0.InterfaceC2760s
    /* JADX INFO: renamed from: a */
    public final void mo4840a(float f2, float f5) {
        this.f8723a.scale(f2, f5);
    }

    @Override // p211o0.InterfaceC2760s
    /* JADX INFO: renamed from: b */
    public final void mo4841b(long j5, long j6, C2748g c2748g) {
        this.f8723a.drawLine(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)), Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)), (Paint) c2748g.f8737c);
    }

    @Override // p211o0.InterfaceC2760s
    /* JADX INFO: renamed from: c */
    public final void mo4842c(C2747f c2747f, long j5, long j6, long j7, C2748g c2748g) {
        if (this.f8724b == null) {
            this.f8724b = new Rect();
            this.f8725c = new Rect();
        }
        Canvas canvas = this.f8723a;
        Bitmap bitmapM4939i = AbstractC2767z.m4939i(c2747f);
        Rect rect = this.f8724b;
        AbstractC1665j.m2982b(rect);
        int i5 = (int) (j5 >> 32);
        rect.left = i5;
        int i6 = (int) (j5 & 4294967295L);
        rect.top = i6;
        rect.right = i5 + ((int) (j6 >> 32));
        rect.bottom = i6 + ((int) (j6 & 4294967295L));
        Rect rect2 = this.f8725c;
        AbstractC1665j.m2982b(rect2);
        int i7 = (int) 0;
        rect2.left = i7;
        int i8 = (int) 0;
        rect2.top = i8;
        rect2.right = i7 + ((int) (j7 >> 32));
        rect2.bottom = i8 + ((int) (4294967295L & j7));
        canvas.drawBitmap(bitmapM4939i, rect, rect2, (Paint) c2748g.f8737c);
    }

    @Override // p211o0.InterfaceC2760s
    /* JADX INFO: renamed from: d */
    public final void mo4843d(C2747f c2747f, C2748g c2748g) {
        this.f8723a.drawBitmap(AbstractC2767z.m4939i(c2747f), Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), (Paint) c2748g.f8737c);
    }

    @Override // p211o0.InterfaceC2760s
    /* JADX INFO: renamed from: e */
    public final void mo4844e(C2750i c2750i) {
        Canvas canvas = this.f8723a;
        if (!(c2750i instanceof C2750i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(c2750i.f8742a, Region.Op.INTERSECT);
    }

    @Override // p211o0.InterfaceC2760s
    /* JADX INFO: renamed from: f */
    public final void mo4845f(float f2, float f5, float f6, float f7, int i5) {
        this.f8723a.clipRect(f2, f5, f6, f7, i5 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // p211o0.InterfaceC2760s
    /* JADX INFO: renamed from: g */
    public final void mo4846g(float f2, float f5) {
        this.f8723a.translate(f2, f5);
    }

    @Override // p211o0.InterfaceC2760s
    /* JADX INFO: renamed from: h */
    public final void mo4847h() {
        this.f8723a.rotate(45.0f);
    }

    @Override // p211o0.InterfaceC2760s
    /* JADX INFO: renamed from: i */
    public final void mo4848i(C2750i c2750i, C2748g c2748g) {
        Canvas canvas = this.f8723a;
        if (!(c2750i instanceof C2750i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(c2750i.f8742a, (Paint) c2748g.f8737c);
    }

    @Override // p211o0.InterfaceC2760s
    /* JADX INFO: renamed from: j */
    public final void mo4849j(float f2, float f5, float f6, float f7, float f8, float f9, C2748g c2748g) {
        this.f8723a.drawRoundRect(f2, f5, f6, f7, f8, f9, (Paint) c2748g.f8737c);
    }

    @Override // p211o0.InterfaceC2760s
    /* JADX INFO: renamed from: k */
    public final void mo4850k(C2684c c2684c, C2748g c2748g) {
        this.f8723a.saveLayer(c2684c.f8558a, c2684c.f8559b, c2684c.f8560c, c2684c.f8561d, (Paint) c2748g.f8737c, 31);
    }

    @Override // p211o0.InterfaceC2760s
    /* JADX INFO: renamed from: l */
    public final void mo4851l() {
        this.f8723a.restore();
    }

    @Override // p211o0.InterfaceC2760s
    /* JADX INFO: renamed from: n */
    public final void mo4852n() {
        this.f8723a.save();
    }

    @Override // p211o0.InterfaceC2760s
    /* JADX INFO: renamed from: o */
    public final void mo4853o() {
        AbstractC2767z.m4940j(this.f8723a, false);
    }

    @Override // p211o0.InterfaceC2760s
    /* JADX INFO: renamed from: p */
    public final void mo4854p(float f2, float f5, float f6, float f7, C2748g c2748g) {
        this.f8723a.drawRect(f2, f5, f6, f7, (Paint) c2748g.f8737c);
    }

    @Override // p211o0.InterfaceC2760s
    /* JADX INFO: renamed from: q */
    public final void mo4855q(float f2, long j5, C2748g c2748g) {
        this.f8723a.drawCircle(Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j5 & 4294967295L)), f2, (Paint) c2748g.f8737c);
    }

    @Override // p211o0.InterfaceC2760s
    /* JADX INFO: renamed from: r */
    public final void mo4856r(float[] fArr) {
        if (AbstractC2767z.m4944o(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        AbstractC2767z.m4945p(matrix, fArr);
        this.f8723a.concat(matrix);
    }

    @Override // p211o0.InterfaceC2760s
    /* JADX INFO: renamed from: s */
    public final void mo4857s() {
        AbstractC2767z.m4940j(this.f8723a, true);
    }
}
