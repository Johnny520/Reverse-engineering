package androidx.compose.p001ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.p001ui.graphics.AbstractC2429;
import androidx.compose.p001ui.graphics.C2430;
import androidx.compose.p001ui.graphics.InterfaceC2436;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import androidx.compose.p001ui.graphics.drawscope.C2343;
import androidx.compose.p001ui.unit.LayoutDirection;
import p068.InterfaceC7387;
import p221.C8724;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.ui.draganddrop.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2262 extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7387 f4449;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f4450;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8724 f4451;

    public C2262(C8724 c8724, long j, InterfaceC7387 interfaceC7387) {
        this.f4451 = c8724;
        this.f4450 = j;
        this.f4449 = interfaceC7387;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        C2342 c2342 = new C2342();
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        Canvas canvas2 = AbstractC2429.f5032;
        C2430 c2430 = new C2430();
        c2430.f5035 = canvas;
        C2343 c2343 = c2342.f4631;
        InterfaceC8725 interfaceC8725 = c2343.f4635;
        LayoutDirection layoutDirection2 = c2343.f4634;
        InterfaceC2436 interfaceC2436 = c2343.f4633;
        long j = c2343.f4632;
        c2343.f4635 = this.f4451;
        c2343.f4634 = layoutDirection;
        c2343.f4633 = c2430;
        c2343.f4632 = this.f4450;
        c2430.mo3237();
        this.f4449.invoke(c2342);
        c2430.mo3249();
        c2343.f4635 = interfaceC8725;
        c2343.f4634 = layoutDirection2;
        c2343.f4633 = interfaceC2436;
        c2343.f4632 = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.f4450;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        C8724 c8724 = this.f4451;
        point.set(c8724.mo1903(fIntBitsToFloat / c8724.mo1816()), c8724.mo1903(Float.intBitsToFloat((int) (j & 4294967295L)) / c8724.mo1816()));
        point2.set(point.x / 2, point.y / 2);
    }
}
