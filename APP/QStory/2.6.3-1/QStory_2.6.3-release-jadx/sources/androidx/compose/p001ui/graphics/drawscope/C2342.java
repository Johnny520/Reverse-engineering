package androidx.compose.p001ui.graphics.drawscope;

import android.graphics.Paint;
import android.graphics.Shader;
import androidx.appcompat.app.C0955;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.AbstractC2433;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.C2442;
import androidx.compose.p001ui.graphics.C2444;
import androidx.compose.p001ui.graphics.C2445;
import androidx.compose.p001ui.graphics.C2449;
import androidx.compose.p001ui.unit.LayoutDirection;
import io.ktor.util.C5043;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.drawscope.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2342 implements InterfaceC2339 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C2444 f4628;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0955 f4629;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C2444 f4630;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2343 f4631;

    public C2342() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        C2343 c2343 = new C2343();
        c2343.f4635 = AbstractC2340.f4627;
        c2343.f4634 = layoutDirection;
        c2343.f4633 = C2338.f4626;
        c2343.f4632 = 0L;
        this.f4631 = c2343;
        this.f4629 = new C0955(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2444 m3271(C2342 c2342, long j, AbstractC2340 abstractC2340, float f, int i) {
        C2444 c2444M3272 = c2342.m3272(abstractC2340);
        Paint paint = (Paint) c2444M3272.f5061;
        if (f != 1.0f) {
            j = C2434.m3510(C2434.m3508(j) * f, j);
        }
        if (!C2434.m3509(AbstractC2416.m3442(paint.getColor()), j)) {
            c2444M3272.m3529(j);
        }
        if (((Shader) c2444M3272.f5060) != null) {
            c2444M3272.m3532(null);
        }
        if (!AbstractC5227.m9466((C2442) c2444M3272.f5059, null)) {
            c2444M3272.m3533(null);
        }
        if (c2444M3272.f5062 != i) {
            c2444M3272.m3530(i);
        }
        if (paint.isFilterBitmap()) {
            return c2444M3272;
        }
        c2444M3272.m3534(1);
        return c2444M3272;
    }

    @Override // androidx.compose.p001ui.graphics.drawscope.InterfaceC2339
    public final LayoutDirection getLayoutDirection() {
        return this.f4631.f4634;
    }

    @Override // androidx.compose.p001ui.graphics.drawscope.InterfaceC2339
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo3263(C2449 c2449, AbstractC2433 abstractC2433, float f, AbstractC2340 abstractC2340, int i) {
        this.f4631.f4633.mo3248(c2449, m3274(abstractC2433, abstractC2340, f, null, i, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2444 m3272(AbstractC2340 abstractC2340) {
        if (AbstractC5227.m9466(abstractC2340, C2345.f4640)) {
            C2444 c2444 = this.f4630;
            if (c2444 != null) {
                return c2444;
            }
            C2444 c2444M3456 = AbstractC2416.m3456();
            c2444M3456.m3528(0);
            this.f4630 = c2444M3456;
            return c2444M3456;
        }
        if (!(abstractC2340 instanceof C2344)) {
            C5043.m9170();
            return null;
        }
        C2444 c2444M34562 = this.f4628;
        if (c2444M34562 == null) {
            c2444M34562 = AbstractC2416.m3456();
            c2444M34562.m3528(1);
            this.f4628 = c2444M34562;
        }
        Paint paint = (Paint) c2444M34562.f5061;
        float strokeWidth = paint.getStrokeWidth();
        C2344 c2344 = (C2344) abstractC2340;
        float f = c2344.f4639;
        if (strokeWidth != f) {
            c2444M34562.m3527(f);
        }
        int iM3522 = c2444M34562.m3522();
        int i = c2344.f4637;
        if (iM3522 != i) {
            c2444M34562.m3526(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = c2344.f4638;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iM3521 = c2444M34562.m3521();
        int i2 = c2344.f4636;
        if (iM3521 != i2) {
            c2444M34562.m3525(i2);
        }
        if (!AbstractC5227.m9466(null, null)) {
            c2444M34562.m3531(null);
        }
        return c2444M34562;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m3273(C2445 c2445, C2442 c2442) {
        this.f4631.f4633.mo3239(c2445, m3274(null, C2345.f4640, 1.0f, c2442, 3, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2444 m3274(AbstractC2433 abstractC2433, AbstractC2340 abstractC2340, float f, C2442 c2442, int i, int i2) {
        C2444 c2444M3272 = m3272(abstractC2340);
        Paint paint = (Paint) c2444M3272.f5061;
        if (abstractC2433 != null) {
            abstractC2433.mo3411(f, mo3265(), c2444M3272);
        } else {
            if (((Shader) c2444M3272.f5060) != null) {
                c2444M3272.m3532(null);
            }
            long jM3442 = AbstractC2416.m3442(paint.getColor());
            long j = C2434.f5041;
            if (!C2434.m3509(jM3442, j)) {
                c2444M3272.m3529(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                c2444M3272.m3519(f);
            }
        }
        if (!AbstractC5227.m9466((C2442) c2444M3272.f5059, c2442)) {
            c2444M3272.m3533(c2442);
        }
        if (c2444M3272.f5062 != i) {
            c2444M3272.m3530(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return c2444M3272;
        }
        c2444M3272.m3534(i2);
        return c2444M3272;
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1816() {
        return this.f4631.f4635.mo1816();
    }

    @Override // androidx.compose.p001ui.graphics.drawscope.InterfaceC2339
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo3264(C2445 c2445, long j, long j2, long j3, float f, C2442 c2442, int i) {
        this.f4631.f4633.mo3253(c2445, j, j2, j3, m3274(null, C2345.f4640, f, c2442, 3, i));
    }

    @Override // androidx.compose.p001ui.graphics.drawscope.InterfaceC2339
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final C0955 mo3266() {
        return this.f4629;
    }

    @Override // androidx.compose.p001ui.graphics.drawscope.InterfaceC2339
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰 */
    public final void mo3267(long j, float f, float f2, long j2, long j3, AbstractC2340 abstractC2340) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.f4631.f4633.mo3250(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, m3271(this, j, abstractC2340, 1.0f, 3));
    }

    @Override // androidx.compose.p001ui.graphics.drawscope.InterfaceC2339
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public final void mo3269(long j, long j2, long j3, float f, AbstractC2340 abstractC2340, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.f4631.f4633.mo3252(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), m3271(this, j, abstractC2340, f, i));
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1817() {
        return this.f4631.f4635.mo1817();
    }

    @Override // androidx.compose.p001ui.graphics.drawscope.InterfaceC2339
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final void mo3270(float f, long j, long j2) {
        this.f4631.f4633.mo3247(f, j2, m3271(this, j, C2345.f4640, 1.0f, 3));
    }
}
