package androidx.compose.p001ui.graphics.layer;

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
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.AbstractC2429;
import androidx.compose.p001ui.graphics.C2430;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.C2437;
import androidx.compose.p001ui.graphics.C2441;
import androidx.compose.p001ui.graphics.C2442;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import androidx.compose.p001ui.unit.LayoutDirection;
import p068.InterfaceC7387;
import p129.AbstractC8161;
import p221.C8735;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2357 implements InterfaceC2349 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final C2358 f4733 = new C2358();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public C2441 f4734;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public float f4735;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public float f4736;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Rect f4737;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Resources f4738;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2354 f4739;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2437 f4740;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC8161 f4741;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public float f4742;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public float f4743;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public long f4744;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public long f4745;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public float f4746;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public float f4747;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public int f4748;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f4749;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f4750;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f4751;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f4752;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float f4753;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f4754;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Paint f4755;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public boolean f4756;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public boolean f4757;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f4758;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public long f4759;

    public C2357(AbstractC8161 abstractC8161) {
        C2437 c2437 = new C2437();
        C2342 c2342 = new C2342();
        this.f4741 = abstractC8161;
        this.f4740 = c2437;
        C2354 c2354 = new C2354(abstractC8161, c2437, c2342);
        this.f4739 = c2354;
        this.f4738 = abstractC8161.getResources();
        this.f4737 = new Rect();
        abstractC8161.addView(c2354);
        c2354.setClipBounds(null);
        this.f4759 = 0L;
        View.generateViewId();
        this.f4748 = 3;
        this.f4752 = 0;
        this.f4753 = 1.0f;
        this.f4751 = 1.0f;
        this.f4743 = 1.0f;
        long j = C2434.f5041;
        this.f4744 = j;
        this.f4745 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m3364() {
        int i = this.f4752;
        if (i != 1 && this.f4748 == 3) {
            m3365(i);
        } else {
            m3365(1);
        }
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final void mo3277(InterfaceC2436 interfaceC2436) {
        Rect rect;
        boolean z = this.f4756;
        C2354 c2354 = this.f4739;
        if (z) {
            if ((this.f4749 || c2354.getClipToOutline()) && !this.f4757) {
                rect = this.f4737;
                rect.left = 0;
                rect.top = 0;
                rect.right = c2354.getWidth();
                rect.bottom = c2354.getHeight();
            } else {
                rect = null;
            }
            c2354.setClipBounds(rect);
        }
        if (AbstractC2429.m3475(interfaceC2436).isHardwareAccelerated()) {
            this.f4741.m13095(interfaceC2436, c2354, c2354.getDrawingTime());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m3365(int i) {
        C2354 c2354 = this.f4739;
        boolean z = true;
        if (i == 1) {
            c2354.setLayerType(2, this.f4755);
        } else {
            Paint paint = this.f4755;
            if (i == 2) {
                c2354.setLayerType(0, paint);
                z = false;
            } else {
                c2354.setLayerType(0, paint);
            }
        }
        c2354.setCanUseCompositingLayer$ui_graphics(z);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final float mo3279() {
        return this.f4743;
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
    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final void mo3280(InterfaceC8725 interfaceC8725, LayoutDirection layoutDirection, C2351 c2351, InterfaceC7387 interfaceC7387) {
        C2354 c2354 = this.f4739;
        ViewParent parent = c2354.getParent();
        AbstractC8161 abstractC8161 = this.f4741;
        if (parent == null) {
            abstractC8161.addView(c2354);
        }
        c2354.f4728 = interfaceC8725;
        c2354.f4725 = layoutDirection;
        c2354.f4726 = interfaceC7387;
        c2354.f4722 = c2351;
        if (c2354.isAttachedToWindow()) {
            c2354.setVisibility(4);
            c2354.setVisibility(0);
            try {
                C2437 c2437 = this.f4740;
                C2358 c2358 = f4733;
                C2430 c2430 = c2437.f5048;
                Canvas canvas = c2430.f5035;
                c2430.f5035 = c2358;
                abstractC8161.m13095(c2430, c2354, c2354.getDrawingTime());
                c2437.f5048.f5035 = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final int mo3281() {
        return this.f4748;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final void mo3282(float f) {
        this.f4736 = f;
        this.f4739.setRotationX(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo3283() {
        this.f4739.setRotation(0.0f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo3284(int i) {
        this.f4752 = i;
        m3364();
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final float mo3285() {
        return this.f4736;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo3286(boolean z) {
        boolean z2 = false;
        this.f4749 = z && !this.f4757;
        this.f4756 = true;
        if (z && this.f4757) {
            z2 = true;
        }
        this.f4739.setClipToOutline(z2);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final float mo3287() {
        return this.f4742;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final float mo3288() {
        return this.f4739.getCameraDistance() / this.f4738.getDisplayMetrics().densityDpi;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final void mo3289(C2441 c2441) {
        this.f4734 = c2441;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f4739.setRenderEffect(c2441 != null ? c2441.m3518() : null);
        }
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final float mo3290() {
        return this.f4747;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final void mo3291(float f) {
        this.f4739.setCameraDistance(f * this.f4738.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final Matrix mo3292() {
        return this.f4739.getMatrix();
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo3293(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4745 = j;
            this.f4739.setOutlineSpotShadowColor(AbstractC2416.m3433(j));
        }
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo3294(float f) {
        this.f4742 = f;
        this.f4739.setTranslationX(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo3295(float f) {
        this.f4746 = f;
        this.f4739.setTranslationY(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C2441 mo3296() {
        return this.f4734;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3297(float f) {
        this.f4747 = f;
        this.f4739.setElevation(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final float mo3298() {
        return this.f4751;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo3299(float f) {
        this.f4735 = f;
        this.f4739.setRotationY(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo3300() {
        return this.f4753;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final float mo3301() {
        return this.f4746;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo3302(float f) {
        this.f4753 = f;
        this.f4739.setAlpha(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo3303() {
        Paint paint = this.f4755;
        if (paint == null) {
            paint = new Paint();
            this.f4755 = paint;
        }
        paint.setColorFilter(null);
        m3364();
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo3304(float f) {
        this.f4751 = f;
        this.f4739.setScaleX(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final long mo3305() {
        return this.f4745;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo3306(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4744 = j;
            this.f4739.setOutlineAmbientShadowColor(AbstractC2416.m3433(j));
        }
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final float mo3307() {
        return this.f4735;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo3308(int i, int i2, long j) {
        boolean zM13916 = C8735.m13916(this.f4759, j);
        C2354 c2354 = this.f4739;
        if (zM13916) {
            int i3 = this.f4754;
            if (i3 != i) {
                c2354.offsetLeftAndRight(i - i3);
            }
            int i4 = this.f4758;
            if (i4 != i2) {
                c2354.offsetTopAndBottom(i2 - i4);
            }
        } else {
            if (this.f4749 || c2354.getClipToOutline()) {
                this.f4756 = true;
            }
            int i5 = (int) (j >> 32);
            int i6 = (int) (4294967295L & j);
            c2354.layout(i, i2, i + i5, i2 + i6);
            this.f4759 = j;
            if (this.f4750) {
                c2354.setPivotX(i5 / 2.0f);
                c2354.setPivotY(i6 / 2.0f);
            }
        }
        this.f4754 = i;
        this.f4758 = i2;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo3309(long j) {
        long j2 = 9223372034707292159L & j;
        C2354 c2354 = this.f4739;
        if (j2 != 9205357640488583168L) {
            this.f4750 = false;
            c2354.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            c2354.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                c2354.resetPivot();
                return;
            }
            this.f4750 = true;
            c2354.setPivotX(((int) (this.f4759 >> 32)) / 2.0f);
            c2354.setPivotY(((int) (this.f4759 & 4294967295L)) / 2.0f);
        }
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final long mo3310() {
        return this.f4744;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final float mo3312() {
        return 0.0f;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo3313(int i) {
        this.f4748 = i;
        Paint paint = this.f4755;
        if (paint == null) {
            paint = new Paint();
            this.f4755 = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(AbstractC2416.m3430(i)));
        m3364();
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo3314(Outline outline, long j) {
        C2354 c2354 = this.f4739;
        c2354.f4723 = outline;
        c2354.invalidateOutline();
        if ((this.f4749 || c2354.getClipToOutline()) && outline != null) {
            c2354.setClipToOutline(true);
            if (this.f4749) {
                this.f4749 = false;
                this.f4756 = true;
            }
        }
        this.f4757 = outline != null;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final C2442 mo3315() {
        return null;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo3316(float f) {
        this.f4743 = f;
        this.f4739.setScaleY(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo3317() {
        this.f4741.removeViewInLayout(this.f4739);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final int mo3318() {
        return this.f4752;
    }
}
