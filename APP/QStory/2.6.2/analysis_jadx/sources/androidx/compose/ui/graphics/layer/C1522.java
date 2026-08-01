package androidx.compose.ui.graphics.layer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.AbstractC1594;
import androidx.compose.ui.graphics.C1595;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.C1602;
import androidx.compose.ui.graphics.C1606;
import androidx.compose.ui.graphics.C1607;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.drawscope.C1507;
import androidx.compose.ui.unit.LayoutDirection;
import p052.InterfaceC6557;
import p113.AbstractC7331;
import p205.C7905;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1522 implements InterfaceC1514 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C1523 f4387 = new C1523();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public C1606 f4388;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public float f4389;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public float f4390;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Rect f4391;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Resources f4392;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1519 f4393;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1602 f4394;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC7331 f4395;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public float f4396;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public float f4397;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public long f4398;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public long f4399;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public float f4400;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public float f4401;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f4402;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f4403;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f4404;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f4405;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f4406;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float f4407;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f4408;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Paint f4409;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f4410;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f4411;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f4412;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public long f4413;

    public C1522(AbstractC7331 abstractC7331) {
        C1602 c1602 = new C1602();
        C1507 c1507 = new C1507();
        this.f4395 = abstractC7331;
        this.f4394 = c1602;
        C1519 c1519 = new C1519(abstractC7331, c1602, c1507);
        this.f4393 = c1519;
        this.f4392 = abstractC7331.getResources();
        this.f4391 = new Rect();
        abstractC7331.addView(c1519);
        c1519.setClipBounds(null);
        this.f4413 = 0L;
        View.generateViewId();
        this.f4402 = 3;
        this.f4406 = 0;
        this.f4407 = 1.0f;
        this.f4405 = 1.0f;
        this.f4397 = 1.0f;
        long j = C1599.f4695;
        this.f4398 = j;
        this.f4399 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m2794() {
        int i = this.f4406;
        if (i != 1 && this.f4402 == 3) {
            m2795(i);
        } else {
            m2795(1);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final void mo2707(InterfaceC1601 interfaceC1601) {
        Rect rect;
        boolean z = this.f4410;
        C1519 c1519 = this.f4393;
        if (z) {
            if ((this.f4403 || c1519.getClipToOutline()) && !this.f4411) {
                rect = this.f4391;
                rect.left = 0;
                rect.top = 0;
                rect.right = c1519.getWidth();
                rect.bottom = c1519.getHeight();
            } else {
                rect = null;
            }
            c1519.setClipBounds(rect);
        }
        if (AbstractC1594.m2905(interfaceC1601).isHardwareAccelerated()) {
            this.f4395.m12509(interfaceC1601, c1519, c1519.getDrawingTime());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m2795(int i) {
        C1519 c1519 = this.f4393;
        boolean z = true;
        if (i == 1) {
            c1519.setLayerType(2, this.f4409);
        } else {
            Paint paint = this.f4409;
            if (i == 2) {
                c1519.setLayerType(0, paint);
                z = false;
            } else {
                c1519.setLayerType(0, paint);
            }
        }
        c1519.setCanUseCompositingLayer$ui_graphics(z);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final float mo2709() {
        return this.f4397;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final void mo2710(InterfaceC7895 interfaceC7895, LayoutDirection layoutDirection, C1516 c1516, InterfaceC6557 interfaceC6557) {
        C1519 c1519 = this.f4393;
        ViewParent parent = c1519.getParent();
        AbstractC7331 abstractC7331 = this.f4395;
        if (parent == null) {
            abstractC7331.addView(c1519);
        }
        c1519.f4382 = interfaceC7895;
        c1519.f4379 = layoutDirection;
        c1519.f4380 = interfaceC6557;
        c1519.f4376 = c1516;
        if (c1519.isAttachedToWindow()) {
            c1519.setVisibility(4);
            c1519.setVisibility(0);
            try {
                C1602 c1602 = this.f4394;
                C1523 c1523 = f4387;
                C1595 c1595 = c1602.f4702;
                Canvas canvas = c1595.f4689;
                c1595.f4689 = c1523;
                abstractC7331.m12509(c1595, c1519, c1519.getDrawingTime());
                c1602.f4702.f4689 = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final int mo2711() {
        return this.f4402;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final void mo2712(float f) {
        this.f4390 = f;
        this.f4393.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo2713() {
        this.f4393.setRotation(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo2714(int i) {
        this.f4406 = i;
        m2794();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final float mo2715() {
        return this.f4390;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo2716(boolean z) {
        boolean z2 = false;
        this.f4403 = z && !this.f4411;
        this.f4410 = true;
        if (z && this.f4411) {
            z2 = true;
        }
        this.f4393.setClipToOutline(z2);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final float mo2717() {
        return this.f4396;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final float mo2718() {
        return this.f4393.getCameraDistance() / this.f4392.getDisplayMetrics().densityDpi;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final void mo2719(C1606 c1606) {
        this.f4388 = c1606;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f4393.setRenderEffect(c1606 != null ? c1606.m2948() : null);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final float mo2720() {
        return this.f4401;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final void mo2721(float f) {
        this.f4393.setCameraDistance(f * this.f4392.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final Matrix mo2722() {
        return this.f4393.getMatrix();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo2723(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4399 = j;
            this.f4393.setOutlineSpotShadowColor(AbstractC1581.m2863(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo2724(float f) {
        this.f4396 = f;
        this.f4393.setTranslationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo2725(float f) {
        this.f4400 = f;
        this.f4393.setTranslationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C1606 mo2726() {
        return this.f4388;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2727(float f) {
        this.f4401 = f;
        this.f4393.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final float mo2728() {
        return this.f4405;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo2729(float f) {
        this.f4389 = f;
        this.f4393.setRotationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo2730() {
        return this.f4407;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final float mo2731() {
        return this.f4400;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo2732(float f) {
        this.f4407 = f;
        this.f4393.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo2733() {
        Paint paint = this.f4409;
        if (paint == null) {
            paint = new Paint();
            this.f4409 = paint;
        }
        paint.setColorFilter(null);
        m2794();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo2734(float f) {
        this.f4405 = f;
        this.f4393.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final long mo2735() {
        return this.f4399;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo2736(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4398 = j;
            this.f4393.setOutlineAmbientShadowColor(AbstractC1581.m2863(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final float mo2737() {
        return this.f4389;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo2738(int i, int i2, long j) {
        boolean zM13329 = C7905.m13329(this.f4413, j);
        C1519 c1519 = this.f4393;
        if (zM13329) {
            int i3 = this.f4408;
            if (i3 != i) {
                c1519.offsetLeftAndRight(i - i3);
            }
            int i4 = this.f4412;
            if (i4 != i2) {
                c1519.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.f4403 || c1519.getClipToOutline()) {
                this.f4410 = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            c1519.layout(i, i2, i + i5, i2 + i6);
            this.f4413 = j;
            if (this.f4404) {
                c1519.setPivotX(i5 / 2.0f);
                c1519.setPivotY(i6 / 2.0f);
            }
        }
        this.f4408 = i;
        this.f4412 = i2;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo2739(long j) {
        long j2 = 9223372034707292159L & j;
        C1519 c1519 = this.f4393;
        if (j2 != 9205357640488583168L) {
            this.f4404 = false;
            c1519.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            c1519.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                c1519.resetPivot();
                return;
            }
            this.f4404 = true;
            c1519.setPivotX(((int) (this.f4413 >> 32)) / 2.0f);
            c1519.setPivotY(((int) (this.f4413 & 4294967295L)) / 2.0f);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final long mo2740() {
        return this.f4398;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final float mo2742() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo2743(int i) {
        this.f4402 = i;
        Paint paint = this.f4409;
        if (paint == null) {
            paint = new Paint();
            this.f4409 = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(AbstractC1581.m2860(i)));
        m2794();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo2744(Outline outline, long j) {
        C1519 c1519 = this.f4393;
        c1519.f4377 = outline;
        c1519.invalidateOutline();
        if ((this.f4403 || c1519.getClipToOutline()) && outline != null) {
            c1519.setClipToOutline(true);
            if (this.f4403) {
                this.f4403 = false;
                this.f4410 = true;
            }
        }
        this.f4411 = outline != null;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final C1607 mo2745() {
        return null;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo2746(float f) {
        this.f4397 = f;
        this.f4393.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo2747() {
        this.f4395.removeViewInLayout(this.f4393);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final int mo2748() {
        return this.f4406;
    }
}
