package p004a3;

import ec.AbstractC2169p0;
import ec.AbstractC2179r2;
import ec.InterfaceC2153l0;
import ec.InterfaceC2165o0;
import ec.InterfaceC2198w1;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p059e3.AbstractC2019n;
import p228p8.AbstractC5971a;
import p228p8.C5981k;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: a3.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0050n {

    /* JADX INFO: renamed from: c */
    public static final a f93c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final int f94d = 8;

    /* JADX INFO: renamed from: e */
    public static final C0051o f95e = new C0051o();

    /* JADX INFO: renamed from: f */
    public static final InterfaceC2153l0 f96f = new b(InterfaceC2153l0.f5982f);

    /* JADX INFO: renamed from: a */
    public final C0036e f97a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2165o0 f98b;

    public C0050n(C0036e c0036e, InterfaceC5980j interfaceC5980j) {
        this.f97a = c0036e;
        this.f98b = AbstractC2169p0.m7878a(f96f.mo1651c0(AbstractC2019n.m7287a()).mo1651c0(interfaceC5980j).mo1651c0(AbstractC2179r2.m7895a((InterfaceC2198w1) interfaceC5980j.mo1654h(InterfaceC2198w1.f6022g))));
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0045i0 m166a(C0039f0 c0039f0, InterfaceC0060x interfaceC0060x, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
        c0039f0.m146c();
        return null;
    }

    /* JADX INFO: renamed from: a3.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: a3.n$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC5971a implements InterfaceC2153l0 {
        public b(InterfaceC2153l0.b bVar) {
            super(bVar);
        }

        @Override // ec.InterfaceC2153l0
        /* JADX INFO: renamed from: j0 */
        public void mo167j0(InterfaceC5980j interfaceC5980j, Throwable th) {
        }
    }

    public /* synthetic */ C0050n(C0036e c0036e, InterfaceC5980j interfaceC5980j, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? new C0036e() : c0036e, (i10 & 2) != 0 ? C5981k.f18917q : interfaceC5980j);
    }
}
