package p051J;

import java.util.concurrent.atomic.AtomicReference;
import p000A.C0039U;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p160f3.AbstractC2162v;
import p160f3.C2136g0;
import p160f3.InterfaceC2115S;
import p160f3.InterfaceC2160t;

/* JADX INFO: renamed from: J.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0817i extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f2632h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0818j f2633i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0817i(C0818j c0818j, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2633i = c0818j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        return ((C0817i) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        C0817i c0817i = new C0817i(this.f2633i, interfaceC1046d);
        c0817i.f2632h = obj;
        return c0817i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        boolean z5;
        AbstractC1784a.m3205S(obj);
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) this.f2632h;
        C0818j c0818j = this.f2633i;
        InterfaceC2115S interfaceC2115S = (InterfaceC2115S) c0818j.f2635b.getAndSet(null);
        AtomicReference atomicReference = c0818j.f2635b;
        C2136g0 c2136g0M3994p = AbstractC2162v.m3994p(interfaceC2160t, null, new C0039U(interfaceC2115S, c0818j, null, 5), 3);
        while (true) {
            if (atomicReference.compareAndSet(null, c2136g0M3994p)) {
                z5 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z5 = false;
                break;
            }
        }
        return Boolean.valueOf(z5);
    }
}
