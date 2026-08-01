package androidx.compose.p001ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.appcompat.app.C0955;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.graphics.AbstractC2429;
import androidx.compose.p001ui.graphics.C2430;
import androidx.compose.p001ui.graphics.C2434;
import androidx.compose.p001ui.graphics.C2437;
import androidx.compose.p001ui.graphics.C2441;
import androidx.compose.p001ui.graphics.C2442;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.p001ui.unit.LayoutDirection;
import java.util.concurrent.atomic.AtomicBoolean;
import p068.InterfaceC7387;
import p221.C8735;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2348 implements InterfaceC2349 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static final AtomicBoolean f4665 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public C2441 f4666;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f4667;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f4668;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Paint f4669;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f4670;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final RenderNode f4671;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2342 f4672;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2437 f4673;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f4674;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f4675;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public float f4676;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f4677;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public float f4678;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public float f4679;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public float f4680;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public boolean f4681;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public float f4682;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f4683;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public float f4684;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public float f4685;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f4686;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Matrix f4687;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f4688;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public float f4689;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public long f4690;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f4691;

    public C2348(ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719, C2437 c2437, C2342 c2342) {
        this.f4673 = c2437;
        this.f4672 = c2342;
        RenderNode renderNodeCreate = RenderNode.create("Compose", viewTreeObserverOnGlobalLayoutListenerC2719);
        this.f4671 = renderNodeCreate;
        this.f4670 = 0L;
        this.f4690 = 0L;
        if (f4665.getAndSet(false)) {
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
                AbstractC2355.m3361(renderNodeCreate, AbstractC2355.m3363(renderNodeCreate));
                AbstractC2355.m3360(renderNodeCreate, AbstractC2355.m3362(renderNodeCreate));
            }
            AbstractC2352.m3359(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        m3350(0);
        this.f4691 = 0;
        this.f4688 = 3;
        this.f4689 = 1.0f;
        this.f4680 = 1.0f;
        this.f4684 = 1.0f;
        long j = C2434.f5041;
        this.f4675 = j;
        this.f4674 = j;
        this.f4676 = 8.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m3349() {
        int i = this.f4691;
        if (i != 1 && this.f4688 == 3) {
            m3350(i);
        } else {
            m3350(1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m3350(int i) {
        RenderNode renderNode = this.f4671;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f4669);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f4669);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f4669);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final void mo3277(InterfaceC2436 interfaceC2436) {
        DisplayListCanvas displayListCanvasM3475 = AbstractC2429.m3475(interfaceC2436);
        displayListCanvasM3475.getClass();
        displayListCanvasM3475.drawRenderNode(this.f4671);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m3351() {
        boolean z = this.f4677;
        boolean z2 = false;
        boolean z3 = z && !this.f4686;
        if (z && this.f4686) {
            z2 = true;
        }
        if (z3 != this.f4668) {
            this.f4668 = z3;
            this.f4671.setClipToBounds(z3);
        }
        if (z2 != this.f4667) {
            this.f4667 = z2;
            this.f4671.setClipToOutline(z2);
        }
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final float mo3279() {
        return this.f4684;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final void mo3280(InterfaceC8725 interfaceC8725, LayoutDirection layoutDirection, C2351 c2351, InterfaceC7387 interfaceC7387) {
        Canvas canvasStart = this.f4671.start(Math.max((int) (this.f4670 >> 32), (int) (this.f4690 >> 32)), Math.max((int) (this.f4670 & 4294967295L), (int) (this.f4690 & 4294967295L)));
        try {
            C2430 c2430 = this.f4673.f5048;
            Canvas canvas = c2430.f5035;
            c2430.f5035 = canvasStart;
            C2342 c2342 = this.f4672;
            C0955 c0955 = c2342.f4629;
            long jM1700 = AbstractC1298.m1700(this.f4670);
            InterfaceC8725 interfaceC8725M949 = c0955.m949();
            LayoutDirection layoutDirectionM930 = c0955.m930();
            InterfaceC2436 interfaceC2436M946 = c0955.m946();
            long jM928 = c0955.m928();
            C2351 c23512 = (C2351) c0955.f665;
            c0955.m924(interfaceC8725);
            c0955.m920(layoutDirection);
            c0955.m925(c2430);
            c0955.m921(jM1700);
            c0955.f665 = c2351;
            c2430.mo3237();
            try {
                interfaceC7387.invoke(c2342);
                c2430.mo3249();
                c0955.m924(interfaceC8725M949);
                c0955.m920(layoutDirectionM930);
                c0955.m925(interfaceC2436M946);
                c0955.m921(jM928);
                c0955.f665 = c23512;
                c2430.f5035 = canvas;
            } catch (Throwable th) {
                c2430.mo3249();
                C0955 c09552 = c2342.f4629;
                c09552.m924(interfaceC8725M949);
                c09552.m920(layoutDirectionM930);
                c09552.m925(interfaceC2436M946);
                c09552.m921(jM928);
                c09552.f665 = c23512;
                throw th;
            }
        } finally {
            this.f4671.end(canvasStart);
        }
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final int mo3281() {
        return this.f4688;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final void mo3282(float f) {
        this.f4678 = f;
        this.f4671.setRotationX(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo3283() {
        this.f4671.setRotation(0.0f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo3284(int i) {
        this.f4691 = i;
        m3349();
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final float mo3285() {
        return this.f4678;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo3286(boolean z) {
        this.f4677 = z;
        m3351();
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final float mo3287() {
        return this.f4685;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final float mo3288() {
        return this.f4676;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final void mo3289(C2441 c2441) {
        this.f4666 = c2441;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final float mo3290() {
        return this.f4683;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final void mo3291(float f) {
        this.f4676 = f;
        this.f4671.setCameraDistance(-f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final Matrix mo3292() {
        Matrix matrix = this.f4687;
        if (matrix == null) {
            matrix = new Matrix();
            this.f4687 = matrix;
        }
        this.f4671.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo3293(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4674 = j;
            AbstractC2355.m3360(this.f4671, AbstractC2416.m3433(j));
        }
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo3294(float f) {
        this.f4685 = f;
        this.f4671.setTranslationX(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo3295(float f) {
        this.f4682 = f;
        this.f4671.setTranslationY(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final C2441 mo3296() {
        return this.f4666;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3297(float f) {
        this.f4683 = f;
        this.f4671.setElevation(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final float mo3298() {
        return this.f4680;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo3299(float f) {
        this.f4679 = f;
        this.f4671.setRotationY(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final float mo3300() {
        return this.f4689;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final float mo3301() {
        return this.f4682;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo3302(float f) {
        this.f4689 = f;
        this.f4671.setAlpha(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final void mo3303() {
        m3349();
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo3304(float f) {
        this.f4680 = f;
        this.f4671.setScaleX(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final long mo3305() {
        return this.f4674;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo3306(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4675 = j;
            AbstractC2355.m3361(this.f4671, AbstractC2416.m3433(j));
        }
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final float mo3307() {
        return this.f4679;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo3308(int i, int i2, long j) {
        int i3 = (int) (j >> 32);
        int i4 = (int) (4294967295L & j);
        this.f4671.setLeftTopRightBottom(i, i2, i + i3, i2 + i4);
        if (C8735.m13916(this.f4670, j)) {
            return;
        }
        if (this.f4681) {
            this.f4671.setPivotX(i3 / 2.0f);
            this.f4671.setPivotY(i4 / 2.0f);
        }
        this.f4670 = j;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo3309(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.f4681 = true;
            this.f4671.setPivotX(((int) (this.f4670 >> 32)) / 2.0f);
            this.f4671.setPivotY(((int) (4294967295L & this.f4670)) / 2.0f);
        } else {
            this.f4681 = false;
            this.f4671.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f4671.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final long mo3310() {
        return this.f4675;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final boolean mo3311() {
        return this.f4671.isValid();
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final float mo3312() {
        return 0.0f;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo3313(int i) {
        if (this.f4688 == i) {
            return;
        }
        this.f4688 = i;
        Paint paint = this.f4669;
        if (paint == null) {
            paint = new Paint();
            this.f4669 = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(AbstractC2416.m3430(i)));
        m3349();
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo3314(Outline outline, long j) {
        this.f4690 = j;
        this.f4671.setOutline(outline);
        this.f4686 = outline != null;
        m3351();
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final C2442 mo3315() {
        return null;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo3316(float f) {
        this.f4684 = f;
        this.f4671.setScaleY(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo3317() {
        AbstractC2352.m3359(this.f4671);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final int mo3318() {
        return this.f4691;
    }
}
