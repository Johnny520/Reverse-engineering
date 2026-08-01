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
import p052.InterfaceC6558;
import p113.AbstractC7332;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1519 extends View {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C1521 f4376 = new C1521(0);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C1516 f4377;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Outline f4378;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f4379;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public LayoutDirection f4380;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public InterfaceC6558 f4381;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f4382;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public InterfaceC7896 f4383;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1602 f4384;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1507 f4385;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC7332 f4386;

    public C1519(AbstractC7332 abstractC7332, C1602 c1602, C1507 c1507) {
        super(abstractC7332.getContext());
        this.f4386 = abstractC7332;
        this.f4384 = c1602;
        this.f4385 = c1507;
        setOutlineProvider(f4376);
        this.f4382 = true;
        this.f4383 = AbstractC1505.f4282;
        this.f4380 = LayoutDirection.Ltr;
        InterfaceC1514.f4347.getClass();
        this.f4381 = C1515.f4348;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C1602 c1602 = this.f4384;
        C1595 c1595 = c1602.f4703;
        Canvas canvas2 = c1595.f4690;
        c1595.f4690 = canvas;
        InterfaceC7896 interfaceC7896 = this.f4383;
        LayoutDirection layoutDirection = this.f4380;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        C1516 c1516 = this.f4377;
        InterfaceC6558 interfaceC6558 = this.f4381;
        C1507 c1507 = this.f4385;
        InterfaceC7896 interfaceC7896M389 = c1507.mo2706().m389();
        LayoutDirection layoutDirectionM370 = c1507.mo2706().m370();
        InterfaceC1601 interfaceC1601M386 = c1507.mo2706().m386();
        long jM368 = c1507.mo2706().m368();
        C1516 c15162 = (C1516) c1507.mo2706().f320;
        C0108 c0108Mo2706 = c1507.mo2706();
        c0108Mo2706.m364(interfaceC7896);
        c0108Mo2706.m360(layoutDirection);
        c0108Mo2706.m365(c1595);
        c0108Mo2706.m361(jFloatToRawIntBits);
        c0108Mo2706.f320 = c1516;
        c1595.mo2677();
        try {
            interfaceC6558.invoke(c1507);
            c1595.mo2689();
            C0108 c0108Mo27062 = c1507.mo2706();
            c0108Mo27062.m364(interfaceC7896M389);
            c0108Mo27062.m360(layoutDirectionM370);
            c0108Mo27062.m365(interfaceC1601M386);
            c0108Mo27062.m361(jM368);
            c0108Mo27062.f320 = c15162;
            c1602.f4703.f4690 = canvas2;
            this.f4379 = false;
        } catch (Throwable th) {
            c1595.mo2689();
            C0108 c0108Mo27063 = c1507.mo2706();
            c0108Mo27063.m364(interfaceC7896M389);
            c0108Mo27063.m360(layoutDirectionM370);
            c0108Mo27063.m365(interfaceC1601M386);
            c0108Mo27063.m361(jM368);
            c0108Mo27063.f320 = c15162;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f4382;
    }

    public final C1602 getCanvasHolder() {
        return this.f4384;
    }

    public final View getOwnerView() {
        return this.f4386;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f4382;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f4379) {
            return;
        }
        this.f4379 = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.f4382 != z) {
            this.f4382 = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.f4379 = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
