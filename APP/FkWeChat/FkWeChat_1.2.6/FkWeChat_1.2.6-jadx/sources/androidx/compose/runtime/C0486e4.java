package androidx.compose.runtime;

import ec.AbstractC2210z1;
import ec.InterfaceC2153l0;
import ec.InterfaceC2165o0;
import ec.InterfaceC2198w1;
import ec.InterfaceC2208z;
import p024b9.AbstractC1043k;
import p150k1.C3917j;
import p172l8.C4700i0;
import p228p8.AbstractC5971a;
import p228p8.C5981k;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: androidx.compose.runtime.e4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0486e4 implements InterfaceC2165o0, InterfaceC0472c4 {

    /* JADX INFO: renamed from: u */
    public static final a f1329u = new a(null);

    /* JADX INFO: renamed from: v */
    public static final int f1330v = 8;

    /* JADX INFO: renamed from: w */
    public static final InterfaceC5980j f1331w = new C0509i();

    /* JADX INFO: renamed from: q */
    public final InterfaceC5980j f1332q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC5980j f1333r;

    /* JADX INFO: renamed from: s */
    public final Object f1334s = this;

    /* JADX INFO: renamed from: t */
    public volatile InterfaceC5980j f1335t;

    /* JADX INFO: renamed from: androidx.compose.runtime.e4$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC5971a implements InterfaceC2153l0 {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C3917j f1336r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ C0486e4 f1337s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC2153l0.b bVar, C3917j c3917j, C0486e4 c0486e4) {
            super(bVar);
            this.f1336r = c3917j;
            this.f1337s = c0486e4;
        }

        @Override // ec.InterfaceC2153l0
        /* JADX INFO: renamed from: j0 */
        public void mo167j0(InterfaceC5980j interfaceC5980j, Throwable th) throws Throwable {
            this.f1336r.mo15596a(th, this.f1337s);
            InterfaceC5980j interfaceC5980j2 = this.f1337s.f1333r;
            InterfaceC2153l0.b bVar = InterfaceC2153l0.f5982f;
            InterfaceC2153l0 interfaceC2153l0 = (InterfaceC2153l0) interfaceC5980j2.mo1654h(bVar);
            if (interfaceC2153l0 != null) {
                interfaceC2153l0.mo167j0(interfaceC5980j, th);
                return;
            }
            InterfaceC2153l0 interfaceC2153l02 = (InterfaceC2153l0) this.f1337s.f1332q.mo1654h(bVar);
            if (interfaceC2153l02 == null) {
                throw th;
            }
            interfaceC2153l02.mo167j0(interfaceC5980j, th);
        }
    }

    public C0486e4(InterfaceC5980j interfaceC5980j, InterfaceC5980j interfaceC5980j2) {
        this.f1332q = interfaceC5980j;
        this.f1333r = interfaceC5980j2;
    }

    @Override // androidx.compose.runtime.InterfaceC0472c4
    /* JADX INFO: renamed from: b */
    public void mo1532b() {
        m1642f();
    }

    /* JADX INFO: renamed from: f */
    public final void m1642f() {
        synchronized (this.f1334s) {
            try {
                InterfaceC5980j interfaceC5980j = this.f1335t;
                if (interfaceC5980j == null) {
                    this.f1335t = f1331w;
                } else {
                    AbstractC2210z1.m7951d(interfaceC5980j, new C0511i1());
                }
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0472c4
    /* JADX INFO: renamed from: g */
    public void mo1533g() {
        m1642f();
    }

    @Override // ec.InterfaceC2165o0
    public InterfaceC5980j getCoroutineContext() {
        InterfaceC5980j interfaceC5980jMo1651c0;
        InterfaceC5980j interfaceC5980j = this.f1335t;
        if (interfaceC5980j == null || interfaceC5980j == f1331w) {
            C3917j c3917j = (C3917j) this.f1332q.mo1654h(C3917j.f11381r);
            InterfaceC5980j bVar = c3917j != null ? new b(InterfaceC2153l0.f5982f, c3917j, this) : C5981k.f18917q;
            synchronized (this.f1334s) {
                try {
                    interfaceC5980jMo1651c0 = this.f1335t;
                    if (interfaceC5980jMo1651c0 == null) {
                        InterfaceC5980j interfaceC5980j2 = this.f1332q;
                        interfaceC5980jMo1651c0 = interfaceC5980j2.mo1651c0(AbstractC2210z1.m7948a((InterfaceC2198w1) interfaceC5980j2.mo1654h(InterfaceC2198w1.f6022g))).mo1651c0(this.f1333r).mo1651c0(bVar);
                    } else if (interfaceC5980jMo1651c0 == f1331w) {
                        InterfaceC5980j interfaceC5980j3 = this.f1332q;
                        InterfaceC2208z interfaceC2208zM7948a = AbstractC2210z1.m7948a((InterfaceC2198w1) interfaceC5980j3.mo1654h(InterfaceC2198w1.f6022g));
                        interfaceC2208zM7948a.mo7696n(new C0511i1());
                        interfaceC5980jMo1651c0 = interfaceC5980j3.mo1651c0(interfaceC2208zM7948a).mo1651c0(this.f1333r).mo1651c0(bVar);
                    }
                    this.f1335t = interfaceC5980jMo1651c0;
                    C4700i0 c4700i0 = C4700i0.f13910a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            interfaceC5980j = interfaceC5980jMo1651c0;
        }
        interfaceC5980j.getClass();
        return interfaceC5980j;
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.e4$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    @Override // androidx.compose.runtime.InterfaceC0472c4
    /* JADX INFO: renamed from: i */
    public void mo1534i() {
    }
}
