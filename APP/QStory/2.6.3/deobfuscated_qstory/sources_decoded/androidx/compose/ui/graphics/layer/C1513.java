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
import androidx.compose.foundation.draganddrop.AbstractC0455;
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
import p052.InterfaceC6558;
import p205.C7906;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1513 implements InterfaceC1514 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final AtomicBoolean f4320 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public C1606 f4321;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f4322;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f4323;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Paint f4324;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f4325;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final RenderNode f4326;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1507 f4327;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1602 f4328;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f4329;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f4330;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public float f4331;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f4332;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public float f4333;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public float f4334;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public float f4335;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f4336;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float f4337;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f4338;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public float f4339;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float f4340;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f4341;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Matrix f4342;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f4343;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public float f4344;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public long f4345;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f4346;

    public C1513(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, C1602 c1602, C1507 c1507) {
        this.f4328 = c1602;
        this.f4327 = c1507;
        RenderNode renderNodeCreate = RenderNode.create("Compose", viewTreeObserverOnGlobalLayoutListenerC1884);
        this.f4326 = renderNodeCreate;
        this.f4325 = 0L;
        this.f4345 = 0L;
        if (f4320.getAndSet(false)) {
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
                AbstractC1520.m2801(renderNodeCreate, AbstractC1520.m2803(renderNodeCreate));
                AbstractC1520.m2800(renderNodeCreate, AbstractC1520.m2802(renderNodeCreate));
            }
            AbstractC1517.m2799(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        m2790(0);
        this.f4346 = 0;
        this.f4343 = 3;
        this.f4344 = 1.0f;
        this.f4335 = 1.0f;
        this.f4339 = 1.0f;
        long j = C1599.f4696;
        this.f4330 = j;
        this.f4329 = j;
        this.f4331 = 8.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m2789() {
        int i = this.f4346;
        if (i != 1 && this.f4343 == 3) {
            m2790(i);
        } else {
            m2790(1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m2790(int i) {
        RenderNode renderNode = this.f4326;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f4324);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f4324);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f4324);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final void mo2717(InterfaceC1601 interfaceC1601) {
        DisplayListCanvas displayListCanvasM2915 = AbstractC1594.m2915(interfaceC1601);
        displayListCanvasM2915.getClass();
        displayListCanvasM2915.drawRenderNode(this.f4326);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m2791() {
        boolean z = this.f4332;
        boolean z2 = false;
        boolean z3 = z && !this.f4341;
        if (z && this.f4341) {
            z2 = true;
        }
        if (z3 != this.f4323) {
            this.f4323 = z3;
            this.f4326.setClipToBounds(z3);
        }
        if (z2 != this.f4322) {
            this.f4322 = z2;
            this.f4326.setClipToOutline(z2);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final float mo2719() {
        return this.f4339;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final void mo2720(InterfaceC7896 interfaceC7896, LayoutDirection layoutDirection, C1516 c1516, InterfaceC6558 interfaceC6558) {
        Canvas canvasStart = this.f4326.start(Math.max((int) (this.f4325 >> 32), (int) (this.f4345 >> 32)), Math.max((int) (this.f4325 & 4294967295L), (int) (this.f4345 & 4294967295L)));
        try {
            C1595 c1595 = this.f4328.f4703;
            Canvas canvas = c1595.f4690;
            c1595.f4690 = canvasStart;
            C1507 c1507 = this.f4327;
            C0108 c0108 = c1507.f4284;
            long jM1140 = AbstractC0455.m1140(this.f4325);
            InterfaceC7896 interfaceC7896M389 = c0108.m389();
            LayoutDirection layoutDirectionM370 = c0108.m370();
            InterfaceC1601 interfaceC1601M386 = c0108.m386();
            long jM368 = c0108.m368();
            C1516 c15162 = (C1516) c0108.f320;
            c0108.m364(interfaceC7896);
            c0108.m360(layoutDirection);
            c0108.m365(c1595);
            c0108.m361(jM1140);
            c0108.f320 = c1516;
            c1595.mo2677();
            try {
                interfaceC6558.invoke(c1507);
                c1595.mo2689();
                c0108.m364(interfaceC7896M389);
                c0108.m360(layoutDirectionM370);
                c0108.m365(interfaceC1601M386);
                c0108.m361(jM368);
                c0108.f320 = c15162;
                c1595.f4690 = canvas;
            } catch (Throwable th) {
                c1595.mo2689();
                C0108 c01082 = c1507.f4284;
                c01082.m364(interfaceC7896M389);
                c01082.m360(layoutDirectionM370);
                c01082.m365(interfaceC1601M386);
                c01082.m361(jM368);
                c01082.f320 = c15162;
                throw th;
            }
        } finally {
            this.f4326.end(canvasStart);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final int mo2721() {
        return this.f4343;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final void mo2722(float f) {
        this.f4333 = f;
        this.f4326.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo2723() {
        this.f4326.setRotation(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo2724(int i) {
        this.f4346 = i;
        m2789();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final float mo2725() {
        return this.f4333;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo2726(boolean z) {
        this.f4332 = z;
        m2791();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final float mo2727() {
        return this.f4340;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final float mo2728() {
        return this.f4331;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final void mo2729(C1606 c1606) {
        this.f4321 = c1606;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final float mo2730() {
        return this.f4338;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final void mo2731(float f) {
        this.f4331 = f;
        this.f4326.setCameraDistance(-f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final Matrix mo2732() {
        Matrix matrix = this.f4342;
        if (matrix == null) {
            matrix = new Matrix();
            this.f4342 = matrix;
        }
        this.f4326.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo2733(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4329 = j;
            AbstractC1520.m2800(this.f4326, AbstractC1581.m2873(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo2734(float f) {
        this.f4340 = f;
        this.f4326.setTranslationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo2735(float f) {
        this.f4337 = f;
        this.f4326.setTranslationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C1606 mo2736() {
        return this.f4321;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2737(float f) {
        this.f4338 = f;
        this.f4326.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final float mo2738() {
        return this.f4335;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo2739(float f) {
        this.f4334 = f;
        this.f4326.setRotationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo2740() {
        return this.f4344;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final float mo2741() {
        return this.f4337;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo2742(float f) {
        this.f4344 = f;
        this.f4326.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo2743() {
        m2789();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo2744(float f) {
        this.f4335 = f;
        this.f4326.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final long mo2745() {
        return this.f4329;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo2746(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4330 = j;
            AbstractC1520.m2801(this.f4326, AbstractC1581.m2873(j));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final float mo2747() {
        return this.f4334;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo2748(int i, int i2, long j) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.f4326.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (C7906.m13357(this.f4325, j)) {
            return;
        }
        if (this.f4336) {
            this.f4326.setPivotX(i3 / 2.0f);
            this.f4326.setPivotY(i4 / 2.0f);
        }
        this.f4325 = j;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo2749(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.f4336 = true;
            this.f4326.setPivotX(((int) (this.f4325 >> 32)) / 2.0f);
            this.f4326.setPivotY(((int) (4294967295L & this.f4325)) / 2.0f);
        } else {
            this.f4336 = false;
            this.f4326.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f4326.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final long mo2750() {
        return this.f4330;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo2751() {
        return this.f4326.isValid();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final float mo2752() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo2753(int i) {
        if (this.f4343 == i) {
            return;
        }
        this.f4343 = i;
        Paint paint = this.f4324;
        if (paint == null) {
            paint = new Paint();
            this.f4324 = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(AbstractC1581.m2870(i)));
        m2789();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo2754(Outline outline, long j) {
        this.f4345 = j;
        this.f4326.setOutline(outline);
        this.f4341 = outline != null;
        m2791();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final C1607 mo2755() {
        return null;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo2756(float f) {
        this.f4339 = f;
        this.f4326.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo2757() {
        AbstractC1517.m2799(this.f4326);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final int mo2758() {
        return this.f4346;
    }
}
