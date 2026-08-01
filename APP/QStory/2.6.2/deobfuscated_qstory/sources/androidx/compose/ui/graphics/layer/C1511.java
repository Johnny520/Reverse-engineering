package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
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
import androidx.compose.ui.unit.LayoutDirection;
import p052.InterfaceC6557;
import p205.InterfaceC7895;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1511 implements InterfaceC1514 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f4295;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Paint f4296;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f4297;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final RenderNode f4298;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1507 f4299;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1602 f4300;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public float f4301;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public float f4302;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f4303;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public C1606 f4304;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f4305;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f4306;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public float f4307;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f4308;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f4309;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f4310;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public float f4311;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public long f4312;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f4313;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Matrix f4314;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public float f4315;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public float f4316;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f4317;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f4318;

    public C1511() {
        C1602 c1602 = new C1602();
        C1507 c1507 = new C1507();
        this.f4300 = c1602;
        this.f4299 = c1507;
        RenderNode renderNodeM2757 = AbstractC1512.m2757();
        this.f4298 = renderNodeM2757;
        this.f4297 = 0L;
        renderNodeM2757.setClipToBounds(false);
        m2706(renderNodeM2757, 0);
        this.f4317 = 1.0f;
        this.f4318 = 3;
        this.f4315 = 1.0f;
        this.f4316 = 1.0f;
        long j = C1599.f4695;
        this.f4312 = j;
        this.f4309 = j;
        this.f4301 = 8.0f;
        this.f4295 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m2705() {
        int i = this.f4295;
        if (i != 1 && this.f4318 == 3 && this.f4304 == null) {
            m2706(this.f4298, i);
        } else {
            m2706(this.f4298, 1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m2706(RenderNode renderNode, int i) {
        Paint paint = this.f4296;
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
    public final void mo2707(InterfaceC1601 interfaceC1601) {
        AbstractC1594.m2905(interfaceC1601).drawRenderNode(this.f4298);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m2708() {
        boolean z = this.f4305;
        boolean z2 = false;
        boolean z3 = z && !this.f4313;
        if (z && this.f4313) {
            z2 = true;
        }
        if (z3 != this.f4306) {
            this.f4306 = z3;
            this.f4298.setClipToBounds(z3);
        }
        if (z2 != this.f4303) {
            this.f4303 = z2;
            this.f4298.setClipToOutline(z2);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final float mo2709() {
        return this.f4316;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void mo2710(InterfaceC7895 interfaceC7895, LayoutDirection layoutDirection, C1516 c1516, InterfaceC6557 interfaceC6557) {
        C1507 c1507 = this.f4299;
        RecordingCanvas recordingCanvasBeginRecording = this.f4298.beginRecording();
        try {
            C1602 c1602 = this.f4300;
            C1595 c1595 = c1602.f4702;
            Canvas canvas = c1595.f4689;
            c1595.f4689 = recordingCanvasBeginRecording;
            C0108 c0108 = c1507.f4283;
            c0108.m363(interfaceC7895);
            c0108.m359(layoutDirection);
            c0108.f320 = c1516;
            c0108.m360(this.f4297);
            c0108.m364(c1595);
            interfaceC6557.invoke(c1507);
            c1602.f4702.f4689 = canvas;
        } finally {
            this.f4298.endRecording();
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final int mo2711() {
        return this.f4318;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void mo2712(float f) {
        this.f4310 = f;
        this.f4298.setRotationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void mo2713() {
        this.f4298.setRotationZ(0.0f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void mo2714(int i) {
        this.f4295 = i;
        m2705();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final float mo2715() {
        return this.f4310;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void mo2716(boolean z) {
        this.f4305 = z;
        m2708();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final float mo2717() {
        return this.f4308;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final float mo2718() {
        return this.f4301;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void mo2719(C1606 c1606) {
        this.f4304 = c1606;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f4298.setRenderEffect(c1606 != null ? c1606.m2948() : null);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final float mo2720() {
        return this.f4311;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void mo2721(float f) {
        this.f4301 = f;
        this.f4298.setCameraDistance(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final Matrix mo2722() {
        Matrix matrix = this.f4314;
        if (matrix == null) {
            matrix = new Matrix();
            this.f4314 = matrix;
        }
        this.f4298.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void mo2723(long j) {
        this.f4309 = j;
        this.f4298.setSpotShadowColor(AbstractC1581.m2863(j));
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void mo2724(float f) {
        this.f4308 = f;
        this.f4298.setTranslationX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo2725(float f) {
        this.f4307 = f;
        this.f4298.setTranslationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1606 mo2726() {
        return this.f4304;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo2727(float f) {
        this.f4311 = f;
        this.f4298.setElevation(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float mo2728() {
        return this.f4315;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo2729(float f) {
        this.f4302 = f;
        this.f4298.setRotationY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float mo2730() {
        return this.f4317;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final float mo2731() {
        return this.f4307;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void mo2732(float f) {
        this.f4317 = f;
        this.f4298.setAlpha(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void mo2733() {
        Paint paint = this.f4296;
        if (paint == null) {
            paint = new Paint();
            this.f4296 = paint;
        }
        paint.setColorFilter(null);
        m2705();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void mo2734(float f) {
        this.f4315 = f;
        this.f4298.setScaleX(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long mo2735() {
        return this.f4309;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void mo2736(long j) {
        this.f4312 = j;
        this.f4298.setAmbientShadowColor(AbstractC1581.m2863(j));
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final float mo2737() {
        return this.f4302;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo2738(int i, int i2, long j) {
        this.f4298.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.f4297 = AbstractC8189.m13654(j);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void mo2739(long j) {
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.f4298;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f4298.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final long mo2740() {
        return this.f4312;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean mo2741() {
        return this.f4298.hasDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float mo2742() {
        return 0.0f;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo2743(int i) {
        this.f4318 = i;
        Paint paint = this.f4296;
        if (paint == null) {
            paint = new Paint();
            this.f4296 = paint;
        }
        paint.setBlendMode(AbstractC1581.m2877(i));
        m2705();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo2744(Outline outline, long j) {
        this.f4298.setOutline(outline);
        this.f4313 = outline != null;
        m2708();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C1607 mo2745() {
        return null;
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void mo2746(float f) {
        this.f4316 = f;
        this.f4298.setScaleY(f);
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo2747() {
        this.f4298.discardDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.InterfaceC1514
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int mo2748() {
        return this.f4295;
    }
}
