package p204o1;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p265s1.AbstractC7072f0;
import p265s1.InterfaceC7088i1;
import p290u1.C8482a;

/* JADX INFO: renamed from: o1.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5620b extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3175e f17602a;

    /* JADX INFO: renamed from: b */
    public final long f17603b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0184l f17604c;

    public C5620b(InterfaceC3175e interfaceC3175e, long j10, InterfaceC0184l interfaceC0184l) {
        this.f17602a = interfaceC3175e;
        this.f17603b = j10;
        this.f17604c = interfaceC0184l;
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(Canvas canvas) {
        C8482a c8482a = new C8482a();
        InterfaceC3175e interfaceC3175e = this.f17602a;
        long j10 = this.f17603b;
        EnumC3191u enumC3191u = EnumC3191u.f8484q;
        InterfaceC7088i1 interfaceC7088i1M27860b = AbstractC7072f0.m27860b(canvas);
        InterfaceC0184l interfaceC0184l = this.f17604c;
        C8482a.a aVarM32613x = c8482a.m32613x();
        InterfaceC3175e interfaceC3175eM32615a = aVarM32613x.m32615a();
        EnumC3191u enumC3191uM32616b = aVarM32613x.m32616b();
        InterfaceC7088i1 interfaceC7088i1M32617c = aVarM32613x.m32617c();
        long jM32618d = aVarM32613x.m32618d();
        C8482a.a aVarM32613x2 = c8482a.m32613x();
        aVarM32613x2.m32624j(interfaceC3175e);
        aVarM32613x2.m32625k(enumC3191u);
        aVarM32613x2.m32623i(interfaceC7088i1M27860b);
        aVarM32613x2.m32626l(j10);
        interfaceC7088i1M27860b.mo27841n();
        interfaceC0184l.mo27m(c8482a);
        interfaceC7088i1M27860b.mo27847w();
        C8482a.a aVarM32613x3 = c8482a.m32613x();
        aVarM32613x3.m32624j(interfaceC3175eM32615a);
        aVarM32613x3.m32625k(enumC3191uM32616b);
        aVarM32613x3.m32623i(interfaceC7088i1M32617c);
        aVarM32613x3.m32626l(jM32618d);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(Point point, Point point2) {
        InterfaceC3175e interfaceC3175e = this.f17602a;
        point.set(interfaceC3175e.mo1236x1(interfaceC3175e.mo1227R0(Float.intBitsToFloat((int) (this.f17603b >> 32)))), interfaceC3175e.mo1236x1(interfaceC3175e.mo1227R0(Float.intBitsToFloat((int) (this.f17603b & 4294967295L)))));
        point2.set(point.x / 2, point.y / 2);
    }

    public /* synthetic */ C5620b(InterfaceC3175e interfaceC3175e, long j10, InterfaceC0184l interfaceC0184l, AbstractC1043k abstractC1043k) {
        this(interfaceC3175e, j10, interfaceC0184l);
    }
}
