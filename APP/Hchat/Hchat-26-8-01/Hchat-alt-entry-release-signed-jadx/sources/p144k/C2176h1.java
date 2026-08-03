package p144k;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p085fg.InterfaceC1231l;
import p116i.C1745e;
import p249qg.AbstractC3603v;
import p370yf.AbstractC6044i;
import p371yg.C6046b;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: k.h1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2176h1 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f7235a = new AtomicReference(null);

    /* JADX INFO: renamed from: b */
    public final C6046b f7236b = new C6046b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m5406a(C2176h1 c2176h1, C2170f1 c2170f1) {
        AtomicReference atomicReference = c2176h1.f7235a;
        while (true) {
            C2170f1 c2170f12 = (C2170f1) atomicReference.get();
            if (c2170f12 != null && c2170f1.f7186a.compareTo(c2170f12.f7186a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(c2170f12, c2170f1)) {
                if (atomicReference.get() != c2170f12) {
                    break;
                }
            }
            if (c2170f12 != null) {
                c2170f12.f7187b.mo7485a(new C2167e1("Mutation interrupted", 0));
                return;
            }
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static Object m5407b(C2176h1 c2176h1, InterfaceC1231l interfaceC1231l, AbstractC6044i abstractC6044i) {
        c2176h1.getClass();
        return AbstractC3603v.m7551e(new C1745e(c2176h1, interfaceC1231l, (InterfaceC5557c) null), abstractC6044i);
    }
}
