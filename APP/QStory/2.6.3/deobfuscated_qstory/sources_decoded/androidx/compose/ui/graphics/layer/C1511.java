package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
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
import androidx.compose.ui.unit.LayoutDirection;
import p052.InterfaceC6558;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1511 implements InterfaceC1514 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f4296;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Paint f4297;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f4298;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final RenderNode f4299;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1507 f4300;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1602 f4301;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public float f4302;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public float f4303;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f4304;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public C1606 f4305;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f4306;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f4307;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public float f4308;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f4309;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f4310;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f4311;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public float f4312;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public long f4313;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f4314;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Matrix f4315;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public float f4316;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public float f4317;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f4318;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f4319;

    public C1511() {
        C1602 c1602 = new C1602();
        C1507 c1507 = new C1507();
        this.f4301 = c1602;
        this.f4300 = c1507;
        RenderNode renderNodeM2767 = AbstractC1512.m2767();
        this.f4299 = renderNodeM2767;
        this.f4298 = 0L;
        renderNodeM2767.setClipToBounds(false);
        m2716(renderNodeM2767, 0);
        this.f4318 = 1.0f;
        this.f4319 = 3;
        this.f4316 = 1.0f;
        this.f4317 = 1.0f;
        long j = C1599.f4696;
        this.f4313 = j;
        this.f4310 = j;
        this.f4302 = 8.0f;
        this.f4296 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m2715() {
        int i = this.f4296;
        if (i != 1 && this.f4319 == 3 && this.f4305 == null) {
            m2716(this.f4299, i);
        } else {
            m2716(this.f4299, 1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m2716(RenderNode renderNode, int i) {
        Paint paint = this.f4297;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void mo2717(InterfaceC1601 interfaceC1601) {
        AbstractC1594.m2915(interfaceC1601).drawRenderNode(this.f4299);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m2718() {
        boolean z = this.f4306;
        boolean z2 = false;
        boolean z3 = z && !this.f4314;
        if (z && this.f4314) {
            z2 = true;
        }
        if (z3 != this.f4307) {
            this.f4307 = z3;
            this.f4299.setClipToBounds(z3);
        }
        if (z2 != this.f4304) {
            this.f4304 = z2;
            this.f4299.setClipToOutline(z2);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final float mo2719() {
        return this.f4317;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void mo2720(InterfaceC7896 interfaceC7896, LayoutDirection layoutDirection, C1516 c1516, InterfaceC6558 interfaceC6558) {
        C1507 c1507 = this.f4300;
        RecordingCanvas recordingCanvasBeginRecording = this.f4299.beginRecording();
        try {
            C1602 c1602 = this.f4301;
            C1595 c1595 = c1602.f4703;
            Canvas canvas = c1595.f4690;
            c1595.f4690 = recordingCanvasBeginRecording;
            C0108 c0108 = c1507.f4284;
            c0108.m364(interfaceC7896);
            c0108.m360(layoutDirection);
            c0108.f320 = c1516;
            c0108.m361(this.f4298);
            c0108.m365(c1595);
            interfaceC6558.invoke(c1507);
            c1602.f4703.f4690 = canvas;
        } finally {
            this.f4299.endRecording();
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final int mo2721() {
        return this.f4319;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void mo2722(float f) {
        this.f4311 = f;
        this.f4299.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void mo2723() {
        this.f4299.setRotationZ(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void mo2724(int i) {
        this.f4296 = i;
        m2715();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final float mo2725() {
        return this.f4311;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void mo2726(boolean z) {
        this.f4306 = z;
        m2718();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final float mo2727() {
        return this.f4309;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final float mo2728() {
        return this.f4302;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void mo2729(C1606 c1606) {
        this.f4305 = c1606;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f4299.setRenderEffect(c1606 != null ? c1606.m2958() : null);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final float mo2730() {
        return this.f4312;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void mo2731(float f) {
        this.f4302 = f;
        this.f4299.setCameraDistance(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final Matrix mo2732() {
        Matrix matrix = this.f4315;
        if (matrix == null) {
            matrix = new Matrix();
            this.f4315 = matrix;
        }
        this.f4299.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void mo2733(long j) {
        this.f4310 = j;
        this.f4299.setSpotShadowColor(AbstractC1581.m2873(j));
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void mo2734(float f) {
        this.f4309 = f;
        this.f4299.setTranslationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo2735(float f) {
        this.f4308 = f;
        this.f4299.setTranslationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1606 mo2736() {
        return this.f4305;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo2737(float f) {
        this.f4312 = f;
        this.f4299.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float mo2738() {
        return this.f4316;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo2739(float f) {
        this.f4303 = f;
        this.f4299.setRotationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float mo2740() {
        return this.f4318;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final float mo2741() {
        return this.f4308;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void mo2742(float f) {
        this.f4318 = f;
        this.f4299.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void mo2743() {
        Paint paint = this.f4297;
        if (paint == null) {
            paint = new Paint();
            this.f4297 = paint;
        }
        paint.setColorFilter(null);
        m2715();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void mo2744(float f) {
        this.f4316 = f;
        this.f4299.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long mo2745() {
        return this.f4310;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void mo2746(long j) {
        this.f4313 = j;
        this.f4299.setAmbientShadowColor(AbstractC1581.m2873(j));
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final float mo2747() {
        return this.f4303;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo2748(int i, int i2, long j) {
        this.f4299.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.f4298 = AbstractC0455.m1140(j);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void mo2749(long j) {
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.f4299;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f4299.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final long mo2750() {
        return this.f4313;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean mo2751() {
        return this.f4299.hasDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float mo2752() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo2753(int i) {
        this.f4319 = i;
        Paint paint = this.f4297;
        if (paint == null) {
            paint = new Paint();
            this.f4297 = paint;
        }
        paint.setBlendMode(AbstractC1581.m2887(i));
        m2715();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo2754(Outline outline, long j) {
        this.f4299.setOutline(outline);
        this.f4314 = outline != null;
        m2718();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C1607 mo2755() {
        return null;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void mo2756(float f) {
        this.f4317 = f;
        this.f4299.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo2757() {
        this.f4299.discardDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int mo2758() {
        return this.f4296;
    }
}
