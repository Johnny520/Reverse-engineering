package p000;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;

/* JADX INFO: renamed from: uh */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0803uh extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: a */
    public final C1009zm f6224a;

    /* JADX INFO: renamed from: b */
    public final long f6225b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0742sw f6226c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0803uh(C1009zm c1009zm, long j, InterfaceC0742sw interfaceC0742sw) {
        this.f6224a = c1009zm;
        this.f6225b = j;
        this.f6226c = interfaceC0742sw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        C0125dd c0125dd = new C0125dd();
        Canvas canvas2 = AbstractC0077c3.f648a;
        C0041b3 c0041b3 = new C0041b3();
        c0041b3.f362a = canvas;
        C0087cd c0087cd = c0125dd.f1052d;
        InterfaceC0968ym interfaceC0968ym = c0087cd.f787a;
        k50 k50Var = c0087cd.f788b;
        InterfaceC0051bd interfaceC0051bd = c0087cd.f789c;
        long j = c0087cd.f790d;
        c0087cd.f787a = this.f6224a;
        c0087cd.f788b = k50.f3015d;
        c0087cd.f789c = c0041b3;
        c0087cd.f790d = this.f6225b;
        c0041b3.mo243i();
        this.f6226c.invoke(c0125dd);
        c0041b3.mo241g();
        c0087cd.f787a = interfaceC0968ym;
        c0087cd.f788b = k50Var;
        c0087cd.f789c = interfaceC0051bd;
        c0087cd.f790d = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.f6225b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        C1009zm c1009zm = this.f6224a;
        point.set(c1009zm.mo641F(fIntBitsToFloat / c1009zm.mo48b()), c1009zm.mo641F(Float.intBitsToFloat((int) (j & 4294967295L)) / c1009zm.mo48b()));
        point2.set(point.x / 2, point.y / 2);
    }
}
