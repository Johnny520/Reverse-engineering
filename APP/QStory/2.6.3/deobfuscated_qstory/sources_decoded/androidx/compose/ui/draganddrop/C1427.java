package androidx.compose.ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.ui.graphics.AbstractC1594;
import androidx.compose.ui.graphics.C1595;
import androidx.compose.ui.graphics.InterfaceC1601;
import androidx.compose.ui.graphics.drawscope.C1507;
import androidx.compose.ui.graphics.drawscope.C1508;
import androidx.compose.ui.unit.LayoutDirection;
import p052.InterfaceC6558;
import p205.C7895;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.ui.draganddrop.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1427 extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6558 f4104;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f4105;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7895 f4106;

    public C1427(C7895 c7895, long j, InterfaceC6558 interfaceC6558) {
        this.f4106 = c7895;
        this.f4105 = j;
        this.f4104 = interfaceC6558;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        C1507 c1507 = new C1507();
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        Canvas canvas2 = AbstractC1594.f4687;
        C1595 c1595 = new C1595();
        c1595.f4690 = canvas;
        C1508 c1508 = c1507.f4286;
        InterfaceC7896 interfaceC7896 = c1508.f4290;
        LayoutDirection layoutDirection2 = c1508.f4289;
        InterfaceC1601 interfaceC1601 = c1508.f4288;
        long j = c1508.f4287;
        c1508.f4290 = this.f4106;
        c1508.f4289 = layoutDirection;
        c1508.f4288 = c1595;
        c1508.f4287 = this.f4105;
        c1595.mo2677();
        this.f4104.invoke(c1507);
        c1595.mo2689();
        c1508.f4290 = interfaceC7896;
        c1508.f4289 = layoutDirection2;
        c1508.f4288 = interfaceC1601;
        c1508.f4287 = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.f4105;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        C7895 c7895 = this.f4106;
        point.set(c7895.mo1343(fIntBitsToFloat / c7895.mo1256()), c7895.mo1343(Float.intBitsToFloat((int) (j & 4294967295L)) / c7895.mo1256()));
        point2.set(point.x / 2, point.y / 2);
    }
}
