package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import p112.C7328;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1595 implements InterfaceC1601 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Rect f4688;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Rect f4689;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Canvas f4690 = AbstractC1594.f4687;

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo2677() {
        this.f4690.save();
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2678(C7328 c7328, C1609 c1609) {
        this.f4690.saveLayer(c7328.f19540, c7328.f19539, c7328.f19538, c7328.f19537, (Paint) c1609.f4716, 31);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2679(C1610 c1610, C1609 c1609) {
        this.f4690.drawBitmap(AbstractC1581.m2898(c1610), Float.intBitsToFloat(0), Float.intBitsToFloat(0), (Paint) c1609.f4716);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo2680(float f) {
        this.f4690.rotate(f);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo2681(float f, float f2) {
        this.f4690.scale(f, f2);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2682(C1614 c1614) {
        Canvas canvas = this.f4690;
        if (c1614 instanceof C1614) {
            canvas.clipPath(c1614.f4725, Region.Op.INTERSECT);
        } else {
            C5925.m11308("Unable to obtain android.graphics.Path");
        }
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo2683(float f, float f2, float f3, float f4, float f5, float f6, C1609 c1609) {
        this.f4690.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) c1609.f4716);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo2684() {
        AbstractC1581.m2891(this.f4690, true);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo2685(float f, float f2) {
        this.f4690.translate(f, f2);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo2686(float f, float f2, float f3, float f4, int i) {
        this.f4690.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo2687(float f, long j, C1609 c1609) {
        this.f4690.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) c1609.f4716);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo2688(C1614 c1614, C1609 c1609) {
        Canvas canvas = this.f4690;
        if (c1614 instanceof C1614) {
            canvas.drawPath(c1614.f4725, AbstractC1581.m2894(c1609));
        } else {
            C5925.m11308("Unable to obtain android.graphics.Path");
        }
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo2689() {
        this.f4690.restore();
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo2690(float f, float f2, float f3, float f4, float f5, float f6, C1609 c1609) {
        this.f4690.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) c1609.f4716);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo2691() {
        AbstractC1581.m2891(this.f4690, false);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo2692(float f, float f2, float f3, float f4, C1609 c1609) {
        this.f4690.drawRect(f, f2, f3, f4, AbstractC1581.m2894(c1609));
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo2693(C1610 c1610, long j, long j2, long j3, C1609 c1609) {
        if (this.f4689 == null) {
            this.f4689 = new Rect();
            this.f4688 = new Rect();
        }
        Canvas canvas = this.f4690;
        Bitmap bitmapM2898 = AbstractC1581.m2898(c1610);
        Rect rect = this.f4689;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.f4688;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapM2898, rect, rect2, (Paint) c1609.f4716);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo2694(float[] fArr) {
        if (AbstractC1581.m2886(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        AbstractC1581.m2885(matrix, fArr);
        this.f4690.concat(matrix);
    }

    @Override // androidx.compose.ui.graphics.InterfaceC1601
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo2695(long j, long j2, C1609 c1609) {
        this.f4690.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) c1609.f4716);
    }
}
