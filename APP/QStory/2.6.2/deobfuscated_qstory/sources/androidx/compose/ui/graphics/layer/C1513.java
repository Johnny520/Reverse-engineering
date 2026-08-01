package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.appcompat.app.C0108;
import androidx.compose.ui.graphics.AbstractC1581;
import androidx.compose.ui.graphics.AbstractC1594;
import androidx.compose.ui.graphics.C1595;
import androidx.compose.ui.graphics.C1599;
import androidx.compose.ui.graphics.C1602;
import androidx.compose.ui.graphics.C1606;
import androidx.compose.ui.graphics.C1607;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.drawscope.C1507;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.concurrent.atomic.AtomicBoolean;
import p052.InterfaceC6557;
import p205.C7905;
import p205.InterfaceC7895;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1513 implements InterfaceC1514 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final AtomicBoolean f4319 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public C1606 f4320;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f4321;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f4322;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Paint f4323;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f4324;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final RenderNode f4325;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1507 f4326;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1602 f4327;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f4328;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f4329;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public float f4330;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f4331;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public float f4332;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public float f4333;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public float f4334;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f4335;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float f4336;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f4337;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public float f4338;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float f4339;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f4340;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Matrix f4341;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f4342;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public float f4343;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public long f4344;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f4345;

    public C1513(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, C1602 c1602, C1507 c1507) {
        this.f4327 = c1602;
        this.f4326 = c1507;
        RenderNode renderNodeCreate = RenderNode.create("Compose", viewTreeObserverOnGlobalLayoutListenerC1884);
        this.f4325 = renderNodeCreate;
        this.f4324 = 0L;
        this.f4344 = 0L;
        if (f4319.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                AbstractC1520.m2791(renderNodeCreate, AbstractC1520.m2793(renderNodeCreate));
                AbstractC1520.m2790(renderNodeCreate, AbstractC1520.m2792(renderNodeCreate));
            }
            AbstractC1517.m2789(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        m2780(0);
        this.f4345 = 0;
        this.f4342 = 3;
        this.f4343 = 1.0f;
        this.f4334 = 1.0f;
        this.f4338 = 1.0f;
        long j = C1599.f4695;
        this.f4329 = j;
        this.f4328 = j;
        this.f4330 = 8.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m2779() {
        int i = this.f4345;
        if (i != 1 && this.f4342 == 3) {
            m2780(i);
        } else {
            m2780(1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m2780(int i) {
        RenderNode renderNode = this.f4325;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f4323);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f4323);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f4323);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final void mo2707(InterfaceC1601 interfaceC1601) {
        DisplayListCanvas displayListCanvasM2905 = AbstractC1594.m2905(interfaceC1601);
        displayListCanvasM2905.getClass();
        displayListCanvasM2905.drawRenderNode(this.f4325);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m2781() {
        boolean z = this.f4331;
        boolean z2 = false;
        boolean z3 = z && !this.f4340;
        if (z && this.f4340) {
            z2 = true;
        }
        if (z3 != this.f4322) {
            this.f4322 = z3;
            this.f4325.setClipToBounds(z3);
        }
        if (z2 != this.f4321) {
            this.f4321 = z2;
            this.f4325.setClipToOutline(z2);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final float mo2709() {
        return this.f4338;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final void mo2710(InterfaceC7895 interfaceC7895, LayoutDirection layoutDirection, C1516 c1516, InterfaceC6557 interfaceC6557) {
        Canvas canvasStart = this.f4325.start(Math.max((int) (this.f4324 >> 32), (int) (this.f4344 >> 32)), Math.max((int) (this.f4324 & 4294967295L), (int) (this.f4344 & 4294967295L)));
        try {
            C1595 c1595 = this.f4327.f4702;
            Canvas canvas = c1595.f4689;
            c1595.f4689 = canvasStart;
            C1507 c1507 = this.f4326;
            C0108 c0108 = c1507.f4283;
            long jM13654 = AbstractC8189.m13654(this.f4324);
            InterfaceC7895 interfaceC7895M388 = c0108.m388();
            LayoutDirection layoutDirectionM369 = c0108.m369();
            InterfaceC1601 interfaceC1601M385 = c0108.m385();
            long jM367 = c0108.m367();
            C1516 c15162 = (C1516) c0108.f320;
            c0108.m363(interfaceC7895);
            c0108.m359(layoutDirection);
            c0108.m364(c1595);
            c0108.m360(jM13654);
            c0108.f320 = c1516;
            c1595.mo2667();
            try {
                interfaceC6557.invoke(c1507);
                c1595.mo2679();
                c0108.m363(interfaceC7895M388);
                c0108.m359(layoutDirectionM369);
                c0108.m364(interfaceC1601M385);
                c0108.m360(jM367);
                c0108.f320 = c15162;
                c1595.f4689 = canvas;
            } catch (Throwable th) {
                c1595.mo2679();
                C0108 c01082 = c1507.f4283;
                c01082.m363(interfaceC7895M388);
                c01082.m359(layoutDirectionM369);
                c01082.m364(interfaceC1601M385);
                c01082.m360(jM367);
                c01082.f320 = c15162;
                throw th;
            }
        } finally {
            this.f4325.end(canvasStart);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final int mo2711() {
        return this.f4342;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final void mo2712(float f) {
        this.f4332 = f;
        this.f4325.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo2713() {
        this.f4325.setRotation(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo2714(int i) {
        this.f4345 = i;
        m2779();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final float mo2715() {
        return this.f4332;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo2716(boolean z) {
        this.f4331 = z;
        m2781();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final float mo2717() {
        return this.f4339;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final float mo2718() {
        return this.f4330;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final void mo2719(C1606 c1606) {
        this.f4320 = c1606;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final float mo2720() {
        return this.f4337;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final void mo2721(float f) {
        this.f4330 = f;
        this.f4325.setCameraDistance(-f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final Matrix mo2722() {
        Matrix matrix = this.f4341;
        if (matrix == null) {
            matrix = new Matrix();
            this.f4341 = matrix;
        }
        this.f4325.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo2723(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4328 = j;
            AbstractC1520.m2790(this.f4325, AbstractC1581.m2863(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo2724(float f) {
        this.f4339 = f;
        this.f4325.setTranslationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo2725(float f) {
        this.f4336 = f;
        this.f4325.setTranslationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C1606 mo2726() {
        return this.f4320;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2727(float f) {
        this.f4337 = f;
        this.f4325.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final float mo2728() {
        return this.f4334;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo2729(float f) {
        this.f4333 = f;
        this.f4325.setRotationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo2730() {
        return this.f4343;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final float mo2731() {
        return this.f4336;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo2732(float f) {
        this.f4343 = f;
        this.f4325.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo2733() {
        m2779();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo2734(float f) {
        this.f4334 = f;
        this.f4325.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final long mo2735() {
        return this.f4328;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo2736(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4329 = j;
            AbstractC1520.m2791(this.f4325, AbstractC1581.m2863(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final float mo2737() {
        return this.f4333;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo2738(int i, int i2, long j) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.f4325.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (C7905.m13329(this.f4324, j)) {
            return;
        }
        if (this.f4335) {
            this.f4325.setPivotX(i3 / 2.0f);
            this.f4325.setPivotY(i4 / 2.0f);
        }
        this.f4324 = j;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo2739(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.f4335 = true;
            this.f4325.setPivotX(((int) (this.f4324 >> 32)) / 2.0f);
            this.f4325.setPivotY(((int) (4294967295L & this.f4324)) / 2.0f);
        } else {
            this.f4335 = false;
            this.f4325.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f4325.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final long mo2740() {
        return this.f4329;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo2741() {
        return this.f4325.isValid();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final float mo2742() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo2743(int i) {
        if (this.f4342 == i) {
            return;
        }
        this.f4342 = i;
        Paint paint = this.f4323;
        if (paint == null) {
            paint = new Paint();
            this.f4323 = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(AbstractC1581.m2860(i)));
        m2779();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo2744(Outline outline, long j) {
        this.f4344 = j;
        this.f4325.setOutline(outline);
        this.f4340 = outline != null;
        m2781();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final C1607 mo2745() {
        return null;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo2746(float f) {
        this.f4338 = f;
        this.f4325.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo2747() {
        AbstractC1517.m2789(this.f4325);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final int mo2748() {
        return this.f4345;
    }
}
