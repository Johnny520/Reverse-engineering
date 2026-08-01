package androidx.compose.p001ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
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
import androidx.compose.p001ui.unit.LayoutDirection;
import p068.InterfaceC7387;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2346 implements InterfaceC2349 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int f4641;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Paint f4642;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f4643;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final RenderNode f4644;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2342 f4645;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2437 f4646;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public float f4647;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public float f4648;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f4649;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public C2441 f4650;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f4651;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f4652;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public float f4653;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public float f4654;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f4655;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public float f4656;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public float f4657;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public long f4658;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f4659;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Matrix f4660;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public float f4661;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public float f4662;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public float f4663;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f4664;

    public C2346() {
        C2437 c2437 = new C2437();
        C2342 c2342 = new C2342();
        this.f4646 = c2437;
        this.f4645 = c2342;
        RenderNode renderNodeM3327 = AbstractC2347.m3327();
        this.f4644 = renderNodeM3327;
        this.f4643 = 0L;
        renderNodeM3327.setClipToBounds(false);
        m3276(renderNodeM3327, 0);
        this.f4663 = 1.0f;
        this.f4664 = 3;
        this.f4661 = 1.0f;
        this.f4662 = 1.0f;
        long j = C2434.f5041;
        this.f4658 = j;
        this.f4655 = j;
        this.f4647 = 8.0f;
        this.f4641 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m3275() {
        int i = this.f4641;
        if (i != 1 && this.f4664 == 3 && this.f4650 == null) {
            m3276(this.f4644, i);
        } else {
            m3276(this.f4644, 1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m3276(RenderNode renderNode, int i) {
        Paint paint = this.f4642;
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

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void mo3277(InterfaceC2436 interfaceC2436) {
        AbstractC2429.m3475(interfaceC2436).drawRenderNode(this.f4644);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m3278() {
        boolean z = this.f4651;
        boolean z2 = false;
        boolean z3 = z && !this.f4659;
        if (z && this.f4659) {
            z2 = true;
        }
        if (z3 != this.f4652) {
            this.f4652 = z3;
            this.f4644.setClipToBounds(z3);
        }
        if (z2 != this.f4649) {
            this.f4649 = z2;
            this.f4644.setClipToOutline(z2);
        }
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final float mo3279() {
        return this.f4662;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void mo3280(InterfaceC8725 interfaceC8725, LayoutDirection layoutDirection, C2351 c2351, InterfaceC7387 interfaceC7387) {
        C2342 c2342 = this.f4645;
        RecordingCanvas recordingCanvasBeginRecording = this.f4644.beginRecording();
        try {
            C2437 c2437 = this.f4646;
            C2430 c2430 = c2437.f5048;
            Canvas canvas = c2430.f5035;
            c2430.f5035 = recordingCanvasBeginRecording;
            C0955 c0955 = c2342.f4629;
            c0955.m924(interfaceC8725);
            c0955.m920(layoutDirection);
            c0955.f665 = c2351;
            c0955.m921(this.f4643);
            c0955.m925(c2430);
            interfaceC7387.invoke(c2342);
            c2437.f5048.f5035 = canvas;
        } finally {
            this.f4644.endRecording();
        }
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final int mo3281() {
        return this.f4664;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void mo3282(float f) {
        this.f4656 = f;
        this.f4644.setRotationX(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void mo3283() {
        this.f4644.setRotationZ(0.0f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void mo3284(int i) {
        this.f4641 = i;
        m3275();
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final float mo3285() {
        return this.f4656;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void mo3286(boolean z) {
        this.f4651 = z;
        m3278();
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final float mo3287() {
        return this.f4654;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final float mo3288() {
        return this.f4647;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void mo3289(C2441 c2441) {
        this.f4650 = c2441;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f4644.setRenderEffect(c2441 != null ? c2441.m3518() : null);
        }
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final float mo3290() {
        return this.f4657;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void mo3291(float f) {
        this.f4647 = f;
        this.f4644.setCameraDistance(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final Matrix mo3292() {
        Matrix matrix = this.f4660;
        if (matrix == null) {
            matrix = new Matrix();
            this.f4660 = matrix;
        }
        this.f4644.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void mo3293(long j) {
        this.f4655 = j;
        this.f4644.setSpotShadowColor(AbstractC2416.m3433(j));
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void mo3294(float f) {
        this.f4654 = f;
        this.f4644.setTranslationX(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo3295(float f) {
        this.f4653 = f;
        this.f4644.setTranslationY(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2441 mo3296() {
        return this.f4650;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo3297(float f) {
        this.f4657 = f;
        this.f4644.setElevation(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float mo3298() {
        return this.f4661;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo3299(float f) {
        this.f4648 = f;
        this.f4644.setRotationY(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float mo3300() {
        return this.f4663;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final float mo3301() {
        return this.f4653;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void mo3302(float f) {
        this.f4663 = f;
        this.f4644.setAlpha(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void mo3303() {
        Paint paint = this.f4642;
        if (paint == null) {
            paint = new Paint();
            this.f4642 = paint;
        }
        paint.setColorFilter(null);
        m3275();
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void mo3304(float f) {
        this.f4661 = f;
        this.f4644.setScaleX(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long mo3305() {
        return this.f4655;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void mo3306(long j) {
        this.f4658 = j;
        this.f4644.setAmbientShadowColor(AbstractC2416.m3433(j));
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final float mo3307() {
        return this.f4648;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo3308(int i, int i2, long j) {
        this.f4644.setPosition(i, i2, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i2);
        this.f4643 = AbstractC1298.m1700(j);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void mo3309(long j) {
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.f4644;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f4644.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final long mo3310() {
        return this.f4658;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final boolean mo3311() {
        return this.f4644.hasDisplayList();
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float mo3312() {
        return 0.0f;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo3313(int i) {
        this.f4664 = i;
        Paint paint = this.f4642;
        if (paint == null) {
            paint = new Paint();
            this.f4642 = paint;
        }
        paint.setBlendMode(AbstractC2416.m3447(i));
        m3275();
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo3314(Outline outline, long j) {
        this.f4644.setOutline(outline);
        this.f4659 = outline != null;
        m3278();
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C2442 mo3315() {
        return null;
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void mo3316(float f) {
        this.f4662 = f;
        this.f4644.setScaleY(f);
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo3317() {
        this.f4644.discardDisplayList();
    }

    @Override // androidx.compose.p001ui.graphics.layer.InterfaceC2349
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int mo3318() {
        return this.f4641;
    }
}
