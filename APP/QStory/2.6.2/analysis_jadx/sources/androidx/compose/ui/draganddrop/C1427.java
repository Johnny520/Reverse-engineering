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
import p052.InterfaceC6557;
import p205.C7894;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.ui.draganddrop.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1427 extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6557 f4103;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f4104;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7894 f4105;

    public C1427(C7894 c7894, long j, InterfaceC6557 interfaceC6557) {
        this.f4105 = c7894;
        this.f4104 = j;
        this.f4103 = interfaceC6557;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        C1507 c1507 = new C1507();
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        Canvas canvas2 = AbstractC1594.f4686;
        C1595 c1595 = new C1595();
        c1595.f4689 = canvas;
        C1508 c1508 = c1507.f4285;
        InterfaceC7895 interfaceC7895 = c1508.f4289;
        LayoutDirection layoutDirection2 = c1508.f4288;
        InterfaceC1601 interfaceC1601 = c1508.f4287;
        long j = c1508.f4286;
        c1508.f4289 = this.f4105;
        c1508.f4288 = layoutDirection;
        c1508.f4287 = c1595;
        c1508.f4286 = this.f4104;
        c1595.mo2667();
        this.f4103.invoke(c1507);
        c1595.mo2679();
        c1508.f4289 = interfaceC7895;
        c1508.f4288 = layoutDirection2;
        c1508.f4287 = interfaceC1601;
        c1508.f4286 = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.f4104;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        C7894 c7894 = this.f4105;
        point.set(c7894.mo1333(fIntBitsToFloat / c7894.mo1246()), c7894.mo1333(Float.intBitsToFloat((int) (j & 4294967295L)) / c7894.mo1246()));
        point2.set(point.x / 2, point.y / 2);
    }
}
