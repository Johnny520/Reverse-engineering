package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import p112.C7327;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1595 implements InterfaceC1601 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Rect f4687;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Rect f4688;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Canvas f4689 = AbstractC1594.f4686;

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo2667() {
        this.f4689.save();
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2668(C7327 c7327, C1609 c1609) {
        this.f4689.saveLayer(c7327.f19545, c7327.f19544, c7327.f19543, c7327.f19542, (Paint) c1609.f4715, 31);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2669(C1610 c1610, C1609 c1609) {
        this.f4689.drawBitmap(AbstractC1581.m2888(c1610), Float.intBitsToFloat(0), Float.intBitsToFloat(0), (Paint) c1609.f4715);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo2670(float f) {
        this.f4689.rotate(f);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo2671(float f, float f2) {
        this.f4689.scale(f, f2);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2672(C1614 c1614) {
        Canvas canvas = this.f4689;
        if (c1614 instanceof C1614) {
            canvas.clipPath(c1614.f4724, Region.Op.INTERSECT);
        } else {
            C5919.m11247("Unable to obtain android.graphics.Path");
        }
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo2673(float f, float f2, float f3, float f4, float f5, float f6, C1609 c1609) {
        this.f4689.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) c1609.f4715);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo2674() {
        AbstractC1581.m2881(this.f4689, true);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo2675(float f, float f2) {
        this.f4689.translate(f, f2);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo2676(float f, float f2, float f3, float f4, int i) {
        this.f4689.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo2677(float f, long j, C1609 c1609) {
        this.f4689.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) c1609.f4715);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo2678(C1614 c1614, C1609 c1609) {
        Canvas canvas = this.f4689;
        if (c1614 instanceof C1614) {
            canvas.drawPath(c1614.f4724, AbstractC1581.m2884(c1609));
        } else {
            C5919.m11247("Unable to obtain android.graphics.Path");
        }
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo2679() {
        this.f4689.restore();
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo2680(float f, float f2, float f3, float f4, float f5, float f6, C1609 c1609) {
        this.f4689.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) c1609.f4715);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo2681() {
        AbstractC1581.m2881(this.f4689, false);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo2682(float f, float f2, float f3, float f4, C1609 c1609) {
        this.f4689.drawRect(f, f2, f3, f4, AbstractC1581.m2884(c1609));
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo2683(C1610 c1610, long j, long j2, long j3, C1609 c1609) {
        if (this.f4688 == null) {
            this.f4688 = new Rect();
            this.f4687 = new Rect();
        }
        Canvas canvas = this.f4689;
        Bitmap bitmapM2888 = AbstractC1581.m2888(c1610);
        Rect rect = this.f4688;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.f4687;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapM2888, rect, rect2, (Paint) c1609.f4715);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo2684(float[] fArr) {
        if (AbstractC1581.m2876(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        AbstractC1581.m2875(matrix, fArr);
        this.f4689.concat(matrix);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo2685(long j, long j2, C1609 c1609) {
        this.f4689.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) c1609.f4715);
    }
}
