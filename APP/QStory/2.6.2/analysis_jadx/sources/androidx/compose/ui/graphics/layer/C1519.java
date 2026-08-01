package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import androidx.appcompat.app.C0108;
import androidx.compose.ui.graphics.C1595;
import androidx.compose.ui.graphics.C1602;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.drawscope.AbstractC1505;
import androidx.compose.ui.graphics.drawscope.C1507;
import androidx.compose.ui.unit.LayoutDirection;
import p052.InterfaceC6557;
import p113.AbstractC7331;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1519 extends View {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C1521 f4375 = new C1521(0);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C1516 f4376;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Outline f4377;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f4378;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public LayoutDirection f4379;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public InterfaceC6557 f4380;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f4381;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC7895 f4382;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1602 f4383;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1507 f4384;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC7331 f4385;

    public C1519(AbstractC7331 abstractC7331, C1602 c1602, C1507 c1507) {
        super(abstractC7331.getContext());
        this.f4385 = abstractC7331;
        this.f4383 = c1602;
        this.f4384 = c1507;
        setOutlineProvider(f4375);
        this.f4381 = true;
        this.f4382 = AbstractC1505.f4281;
        this.f4379 = LayoutDirection.Ltr;
        InterfaceC1514.f4346.getClass();
        this.f4380 = C1515.f4347;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C1602 c1602 = this.f4383;
        C1595 c1595 = c1602.f4702;
        Canvas canvas2 = c1595.f4689;
        c1595.f4689 = canvas;
        InterfaceC7895 interfaceC7895 = this.f4382;
        LayoutDirection layoutDirection = this.f4379;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        C1516 c1516 = this.f4376;
        InterfaceC6557 interfaceC6557 = this.f4380;
        C1507 c1507 = this.f4384;
        InterfaceC7895 interfaceC7895M388 = c1507.mo2696().m388();
        LayoutDirection layoutDirectionM369 = c1507.mo2696().m369();
        InterfaceC1601 interfaceC1601M385 = c1507.mo2696().m385();
        long jM367 = c1507.mo2696().m367();
        C1516 c15162 = (C1516) c1507.mo2696().f320;
        C0108 c0108Mo2696 = c1507.mo2696();
        c0108Mo2696.m363(interfaceC7895);
        c0108Mo2696.m359(layoutDirection);
        c0108Mo2696.m364(c1595);
        c0108Mo2696.m360(jFloatToRawIntBits);
        c0108Mo2696.f320 = c1516;
        c1595.mo2667();
        try {
            interfaceC6557.invoke(c1507);
            c1595.mo2679();
            C0108 c0108Mo26962 = c1507.mo2696();
            c0108Mo26962.m363(interfaceC7895M388);
            c0108Mo26962.m359(layoutDirectionM369);
            c0108Mo26962.m364(interfaceC1601M385);
            c0108Mo26962.m360(jM367);
            c0108Mo26962.f320 = c15162;
            c1602.f4702.f4689 = canvas2;
            this.f4378 = false;
        } catch (Throwable th) {
            c1595.mo2679();
            C0108 c0108Mo26963 = c1507.mo2696();
            c0108Mo26963.m363(interfaceC7895M388);
            c0108Mo26963.m359(layoutDirectionM369);
            c0108Mo26963.m364(interfaceC1601M385);
            c0108Mo26963.m360(jM367);
            c0108Mo26963.f320 = c15162;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f4381;
    }

    public final C1602 getCanvasHolder() {
        return this.f4383;
    }

    public final View getOwnerView() {
        return this.f4385;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f4381;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f4378) {
            return;
        }
        this.f4378 = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.f4381 != z) {
            this.f4381 = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.f4378 = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
