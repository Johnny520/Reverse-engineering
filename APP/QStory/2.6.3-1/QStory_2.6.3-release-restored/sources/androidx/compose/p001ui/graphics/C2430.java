package androidx.compose.p001ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import p128.C8157;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2430 implements InterfaceC2436 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Rect f5033;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Rect f5034;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Canvas f5035 = AbstractC2429.f5032;

    @Override // androidx.compose.p001ui.graphics.InterfaceC2436
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo3237() {
        this.f5035.save();
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2436
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo3238(C8157 c8157, C2444 c2444) {
        this.f5035.saveLayer(c8157.f19885, c8157.f19884, c8157.f19883, c8157.f19882, (Paint) c2444.f5061, 31);
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2436
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3239(C2445 c2445, C2444 c2444) {
        this.f5035.drawBitmap(AbstractC2416.m3458(c2445), Float.intBitsToFloat(0), Float.intBitsToFloat(0), (Paint) c2444.f5061);
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2436
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo3240(float f) {
        this.f5035.rotate(f);
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2436
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo3241(float f, float f2) {
        this.f5035.scale(f, f2);
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2436
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo3242(C2449 c2449) {
        Canvas canvas = this.f5035;
        if (c2449 instanceof C2449) {
            canvas.clipPath(c2449.f5070, Region.Op.INTERSECT);
        } else {
            C6755.m11867("Unable to obtain android.graphics.Path");
        }
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2436
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo3243(float f, float f2, float f3, float f4, float f5, float f6, C2444 c2444) {
        this.f5035.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) c2444.f5061);
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2436
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo3244() {
        AbstractC2416.m3451(this.f5035, true);
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2436
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo3245(float f, float f2) {
        this.f5035.translate(f, f2);
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2436
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo3246(float f, float f2, float f3, float f4, int i) {
        this.f5035.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2436
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo3247(float f, long j, C2444 c2444) {
        this.f5035.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) c2444.f5061);
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2436
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo3248(C2449 c2449, C2444 c2444) {
        Canvas canvas = this.f5035;
        if (c2449 instanceof C2449) {
            canvas.drawPath(c2449.f5070, AbstractC2416.m3454(c2444));
        } else {
            C6755.m11867("Unable to obtain android.graphics.Path");
        }
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2436
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo3249() {
        this.f5035.restore();
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2436
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo3250(float f, float f2, float f3, float f4, float f5, float f6, C2444 c2444) {
        this.f5035.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) c2444.f5061);
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2436
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo3251() {
        AbstractC2416.m3451(this.f5035, false);
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2436
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo3252(float f, float f2, float f3, float f4, C2444 c2444) {
        this.f5035.drawRect(f, f2, f3, f4, AbstractC2416.m3454(c2444));
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2436
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo3253(C2445 c2445, long j, long j2, long j3, C2444 c2444) {
        if (this.f5034 == null) {
            this.f5034 = new Rect();
            this.f5033 = new Rect();
        }
        Canvas canvas = this.f5035;
        Bitmap bitmapM3458 = AbstractC2416.m3458(c2445);
        Rect rect = this.f5034;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.f5033;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapM3458, rect, rect2, (Paint) c2444.f5061);
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2436
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo3254(float[] fArr) {
        if (AbstractC2416.m3446(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        AbstractC2416.m3445(matrix, fArr);
        this.f5035.concat(matrix);
    }

    @Override // androidx.compose.p001ui.graphics.InterfaceC2436
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo3255(long j, long j2, C2444 c2444) {
        this.f5035.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) c2444.f5061);
    }
}
