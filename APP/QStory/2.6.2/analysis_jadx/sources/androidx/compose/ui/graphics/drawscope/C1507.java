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
import io.ktor.util.C4210;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.drawscope.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1507 implements InterfaceC1504 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C1609 f4282;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0108 f4283;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C1609 f4284;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1508 f4285;

    public C1507() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        C1508 c1508 = new C1508();
        c1508.f4289 = AbstractC1505.f4281;
        c1508.f4288 = layoutDirection;
        c1508.f4287 = C1503.f4280;
        c1508.f4286 = 0L;
        this.f4285 = c1508;
        this.f4283 = new C0108(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C1609 m2701(C1507 c1507, long j, AbstractC1505 abstractC1505, float f, int i) {
        C1609 c1609M2702 = c1507.m2702(abstractC1505);
        Paint paint = (Paint) c1609M2702.f4715;
        if (f != 1.0f) {
            j = C1599.m2940(C1599.m2938(j) * f, j);
        }
        if (!C1599.m2939(AbstractC1581.m2872(paint.getColor()), j)) {
            c1609M2702.m2959(j);
        }
        if (((Shader) c1609M2702.f4714) != null) {
            c1609M2702.m2962(null);
        }
        if (!AbstractC4394.m8917((C1607) c1609M2702.f4713, null)) {
            c1609M2702.m2963(null);
        }
        if (c1609M2702.f4716 != i) {
            c1609M2702.m2960(i);
        }
        if (paint.isFilterBitmap()) {
            return c1609M2702;
        }
        c1609M2702.m2964(1);
        return c1609M2702;
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    public final LayoutDirection getLayoutDirection() {
        return this.f4285.f4288;
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo2693(C1614 c1614, AbstractC1598 abstractC1598, float f, AbstractC1505 abstractC1505, int i) {
        this.f4285.f4287.mo2678(c1614, m2704(abstractC1598, abstractC1505, f, null, i, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1609 m2702(AbstractC1505 abstractC1505) {
        if (AbstractC4394.m8917(abstractC1505, C1510.f4294)) {
            C1609 c1609 = this.f4284;
            if (c1609 != null) {
                return c1609;
            }
            C1609 c1609M2886 = AbstractC1581.m2886();
            c1609M2886.m2958(0);
            this.f4284 = c1609M2886;
            return c1609M2886;
        }
        if (!(abstractC1505 instanceof C1509)) {
            C4210.m8621();
            return null;
        }
        C1609 c1609M28862 = this.f4282;
        if (c1609M28862 == null) {
            c1609M28862 = AbstractC1581.m2886();
            c1609M28862.m2958(1);
            this.f4282 = c1609M28862;
        }
        Paint paint = (Paint) c1609M28862.f4715;
        float strokeWidth = paint.getStrokeWidth();
        C1509 c1509 = (C1509) abstractC1505;
        float f = c1509.f4293;
        if (strokeWidth != f) {
            c1609M28862.m2957(f);
        }
        int iM2952 = c1609M28862.m2952();
        int i = c1509.f4291;
        if (iM2952 != i) {
            c1609M28862.m2956(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f2 = c1509.f4292;
        if (strokeMiter != f2) {
            paint.setStrokeMiter(f2);
        }
        int iM2951 = c1609M28862.m2951();
        int i2 = c1509.f4290;
        if (iM2951 != i2) {
            c1609M28862.m2955(i2);
        }
        if (!AbstractC4394.m8917(null, null)) {
            c1609M28862.m2961(null);
        }
        return c1609M28862;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m2703(C1610 c1610, C1607 c1607) {
        this.f4285.f4287.mo2669(c1610, m2704(null, C1510.f4294, 1.0f, c1607, 3, 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1609 m2704(AbstractC1598 abstractC1598, AbstractC1505 abstractC1505, float f, C1607 c1607, int i, int i2) {
        C1609 c1609M2702 = m2702(abstractC1505);
        Paint paint = (Paint) c1609M2702.f4715;
        if (abstractC1598 != null) {
            abstractC1598.mo2841(f, mo2695(), c1609M2702);
        } else {
            if (((Shader) c1609M2702.f4714) != null) {
                c1609M2702.m2962(null);
            }
            long jM2872 = AbstractC1581.m2872(paint.getColor());
            long j = C1599.f4695;
            if (!C1599.m2939(jM2872, j)) {
                c1609M2702.m2959(j);
            }
            if (paint.getAlpha() / 255.0f != f) {
                c1609M2702.m2949(f);
            }
        }
        if (!AbstractC4394.m8917((C1607) c1609M2702.f4713, c1607)) {
            c1609M2702.m2963(c1607);
        }
        if (c1609M2702.f4716 != i) {
            c1609M2702.m2960(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return c1609M2702;
        }
        c1609M2702.m2964(i2);
        return c1609M2702;
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1246() {
        return this.f4285.f4289.mo1246();
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo2694(C1610 c1610, long j, long j2, long j3, float f, C1607 c1607, int i) {
        this.f4285.f4287.mo2683(c1610, j, j2, j3, m2704(null, C1510.f4294, f, c1607, 3, i));
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final C0108 mo2696() {
        return this.f4283;
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰 */
    public final void mo2697(long j, float f, float f2, long j2, long j3, AbstractC1505 abstractC1505) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.f4285.f4287.mo2680(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, m2701(this, j, abstractC1505, 1.0f, 3));
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public final void mo2699(long j, long j2, long j3, float f, AbstractC1505 abstractC1505, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.f4285.f4287.mo2682(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), m2701(this, j, abstractC1505, f, i));
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1247() {
        return this.f4285.f4289.mo1247();
    }

    @Override // androidx.compose.ui.graphics.drawscope.InterfaceC1504
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final void mo2700(float f, long j, long j2) {
        this.f4285.f4287.mo2677(f, j2, m2701(this, j, C1510.f4294, 1.0f, 3));
    }
}
