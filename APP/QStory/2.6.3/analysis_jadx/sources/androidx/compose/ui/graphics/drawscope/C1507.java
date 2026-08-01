package androidx.compose.ui.graphics.drawscope;

import android.graphics.Paint;
import android.graphics.Shader;
import androidx.appcompat.app.C0108;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.AbstractC1598;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.C1607;
import androidx.compose.ui.graphics.C1609;
import androidx.compose.ui.graphics.C1610;
import androidx.compose.ui.graphics.C1614;
import androidx.compose.ui.unit.LayoutDirection;
import io.ktor.util.C4211;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.drawscope.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1507 implements InterfaceC1504 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C1609 f4283;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0108 f4284;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C1609 f4285;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1508 f4286;

    public C1507() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        C1508 c1508 = new C1508();
        c1508.f4290 = AbstractC1505.f4282;
        c1508.f4289 = layoutDirection;
        c1508.f4288 = C1503.f4281;
        c1508.f4287 = 0L;
        this.f4286 = c1508;
        this.f4284 = new C0108(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C1609 m2711(C1507 c1507, long j, AbstractC1505 abstractC1505, float f, int i) {
        C1609 c1609M2712 = c1507.m2712(abstractC1505);
        Paint paint = (Paint) c1609M2712.f4716;
        if (f != 1.0f) {
            j = C1599.m2950(C1599.m2948(j) * f, j);
        }
        if (!C1599.m2949(AbstractC1581.m2882(paint.getColor()), j)) {
            c1609M2712.m2969(j);
        }
        if (((Shader) c1609M2712.f4715) != null) {
            c1609M2712.m2972(null);
        }
        if (!AbstractC4395.m8907((C1607) c1609M2712.f4714, null)) {
            c1609M2712.m2973(null);
        }
        if (c1609M2712.f4717 != i) {
            c1609M2712.m2970(i);
        }
        if (paint.isFilterBitmap()) {
            return c1609M2712;
        }
        c1609M2712.m2974(1);
        return c1609M2712;
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    public final LayoutDirection getLayoutDirection() {
        return this.f4286.f4289;
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo2703(C1614 c1614, AbstractC1598 abstractC1598, float f, AbstractC1505 abstractC1505, int i) {
        this.f4286.f4288.mo2688(c1614, m2714(abstractC1598, abstractC1505, f, null, i, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1609 m2712(AbstractC1505 abstractC1505) {
        if (AbstractC4395.m8907(abstractC1505, C1510.f4295)) {
            C1609 c1609 = this.f4285;
            if (c1609 != null) {
                return c1609;
            }
            C1609 c1609M2896 = AbstractC1581.m2896();
            c1609M2896.m2968(0);
            this.f4285 = c1609M2896;
            return c1609M2896;
        }
        if (!(abstractC1505 instanceof C1509)) {
            C4211.m8611();
            return null;
        }
        C1609 c1609M28962 = this.f4283;
        if (c1609M28962 == null) {
            c1609M28962 = AbstractC1581.m2896();
            c1609M28962.m2968(1);
            this.f4283 = c1609M28962;
        }
        Paint paint = (Paint) c1609M28962.f4716;
        float strokeWidth = paint.getStrokeWidth();
        C1509 c1509 = (C1509) abstractC1505;
        float f = c1509.f4294;
        if (strokeWidth != f) {
            c1609M28962.m2967(f);
        }
        int iM2962 = c1609M28962.m2962();
        int i = c1509.f4292;
        if (iM2962 != i) {
            c1609M28962.m2966(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = c1509.f4293;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iM2961 = c1609M28962.m2961();
        int i2 = c1509.f4291;
        if (iM2961 != i2) {
            c1609M28962.m2965(i2);
        }
        if (!AbstractC4395.m8907(null, null)) {
            c1609M28962.m2971(null);
        }
        return c1609M28962;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m2713(C1610 c1610, C1607 c1607) {
        this.f4286.f4288.mo2679(c1610, m2714(null, C1510.f4295, 1.0f, c1607, 3, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1609 m2714(AbstractC1598 abstractC1598, AbstractC1505 abstractC1505, float f, C1607 c1607, int i, int i2) {
        C1609 c1609M2712 = m2712(abstractC1505);
        Paint paint = (Paint) c1609M2712.f4716;
        if (abstractC1598 != null) {
            abstractC1598.mo2851(f, mo2705(), c1609M2712);
        } else {
            if (((Shader) c1609M2712.f4715) != null) {
                c1609M2712.m2972(null);
            }
            long jM2882 = AbstractC1581.m2882(paint.getColor());
            long j = C1599.f4696;
            if (!C1599.m2949(jM2882, j)) {
                c1609M2712.m2969(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                c1609M2712.m2959(f);
            }
        }
        if (!AbstractC4395.m8907((C1607) c1609M2712.f4714, c1607)) {
            c1609M2712.m2973(c1607);
        }
        if (c1609M2712.f4717 != i) {
            c1609M2712.m2970(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return c1609M2712;
        }
        c1609M2712.m2974(i2);
        return c1609M2712;
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1256() {
        return this.f4286.f4290.mo1256();
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo2704(C1610 c1610, long j, long j2, long j3, float f, C1607 c1607, int i) {
        this.f4286.f4288.mo2693(c1610, j, j2, j3, m2714(null, C1510.f4295, f, c1607, 3, i));
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final C0108 mo2706() {
        return this.f4284;
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰 */
    public final void mo2707(long j, float f, float f2, long j2, long j3, AbstractC1505 abstractC1505) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.f4286.f4288.mo2690(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, m2711(this, j, abstractC1505, 1.0f, 3));
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public final void mo2709(long j, long j2, long j3, float f, AbstractC1505 abstractC1505, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.f4286.f4288.mo2692(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), m2711(this, j, abstractC1505, f, i));
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1257() {
        return this.f4286.f4290.mo1257();
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final void mo2710(float f, long j, long j2) {
        this.f4286.f4288.mo2687(f, j2, m2711(this, j, C1510.f4295, 1.0f, 3));
    }
}
