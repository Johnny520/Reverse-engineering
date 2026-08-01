package p197n7;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p010a9.InterfaceC0184l;
import p185m8.AbstractC5071c1;
import p185m8.AbstractC5081g0;
import p281t6.C8140d;
import p370z6.InterfaceC9878b;
import p370z6.InterfaceC9880d;

/* JADX INFO: renamed from: n7.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5498a implements InterfaceC9878b {

    /* JADX INFO: renamed from: a */
    public final List f17149a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List f17150b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final Set f17151c = AbstractC5081g0.m20562b1(AbstractC5071c1.m20503l(AbstractC5499b.m22352a(), AbstractC5505h.m22364a()));

    /* JADX INFO: renamed from: d */
    public boolean f17152d;

    @Override // p370z6.InterfaceC9878b
    /* JADX INFO: renamed from: a */
    public void mo22347a(C8140d c8140d, InterfaceC9880d interfaceC9880d, InterfaceC0184l interfaceC0184l) {
        c8140d.getClass();
        interfaceC9880d.getClass();
        interfaceC0184l.getClass();
        interfaceC0184l.mo27m(interfaceC9880d);
        this.f17149a.add(new C5504g(c8140d, interfaceC9880d));
    }

    /* JADX INFO: renamed from: b */
    public final List m22348b() {
        return this.f17150b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m22349c() {
        return this.f17152d;
    }

    /* JADX INFO: renamed from: d */
    public final Set m22350d() {
        return this.f17151c;
    }

    /* JADX INFO: renamed from: e */
    public final List m22351e() {
        return this.f17149a;
    }
}
