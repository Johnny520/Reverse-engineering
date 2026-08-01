package p332x;

import androidx.compose.foundation.lazy.layout.InterfaceC0438y0;
import p049d9.AbstractC1927c;
import p080f9.AbstractC2368o;
import p185m8.AbstractC5081g0;
import p219p.InterfaceC5836c1;

/* JADX INFO: renamed from: x.u0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9284u0 {

    /* JADX INFO: renamed from: x.u0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0438y0, InterfaceC5836c1 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC5836c1 f31745a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC9242c1 f31746b;

        public a(InterfaceC5836c1 interfaceC5836c1, AbstractC9242c1 abstractC9242c1) {
            this.f31746b = abstractC9242c1;
            this.f31745a = interfaceC5836c1;
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0438y0
        /* JADX INFO: renamed from: a */
        public int mo1457a() {
            return this.f31746b.mo35999J();
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0438y0
        /* JADX INFO: renamed from: c */
        public int mo1458c() {
            return ((InterfaceC9269n) AbstractC5081g0.m20587u0(this.f31746b.m35994E().mo35971j())).getIndex();
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0438y0
        /* JADX INFO: renamed from: d */
        public int mo1459d(int i10, int i11) {
            return (int) (AbstractC2368o.m8587n(AbstractC9282t0.m36124a(this.f31746b) + ((long) AbstractC1927c.m6980d((((i10 - this.f31746b.m36036x()) * this.f31746b.m36001L()) - (this.f31746b.m36037y() * this.f31746b.m36001L())) + i11)), this.f31746b.m35997H(), this.f31746b.m35995F()) - AbstractC9282t0.m36124a(this.f31746b));
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0438y0
        /* JADX INFO: renamed from: e */
        public void mo1460e(int i10, int i11) {
            this.f31746b.m36026o0(i10, i11 / this.f31746b.m36001L(), true);
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0438y0
        /* JADX INFO: renamed from: f */
        public int mo1461f() {
            return this.f31746b.m35991B();
        }

        @Override // p219p.InterfaceC5836c1
        /* JADX INFO: renamed from: g */
        public float mo23523g(float f10) {
            return this.f31745a.mo23523g(f10);
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0438y0
        /* JADX INFO: renamed from: h */
        public int mo1462h() {
            return this.f31746b.m35990A();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0438y0 m36126a(AbstractC9242c1 abstractC9242c1, InterfaceC5836c1 interfaceC5836c1) {
        return new a(interfaceC5836c1, abstractC9242c1);
    }
}
