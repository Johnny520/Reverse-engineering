package p160f3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p117X2.AbstractC1665j;
import p190k3.C2462j;
import p190k3.C2467o;

/* JADX INFO: renamed from: f3.V */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2118V extends C2462j implements InterfaceC2101D, InterfaceC2112O {

    /* JADX INFO: renamed from: g */
    public C2122Z f7052g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.InterfaceC2101D
    /* JADX INFO: renamed from: a */
    public final void mo3883a() {
        C2122Z c2122zM3913j = m3913j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2122Z.f7062d;
            Object obj = atomicReferenceFieldUpdater.get(c2122zM3913j);
            if (obj instanceof AbstractC2118V) {
                if (obj != this) {
                    return;
                }
                C2103F c2103f = AbstractC2162v.f7119j;
                while (!atomicReferenceFieldUpdater.compareAndSet(c2122zM3913j, obj, c2103f)) {
                    if (atomicReferenceFieldUpdater.get(c2122zM3913j) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC2112O) || ((InterfaceC2112O) obj).mo3887d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C2462j.f7942d;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof C2467o) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                C2462j c2462j = (C2462j) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C2462j.f7944f;
                C2467o c2467o = (C2467o) atomicReferenceFieldUpdater3.get(c2462j);
                if (c2467o == null) {
                    c2467o = new C2467o(c2462j);
                    atomicReferenceFieldUpdater3.set(c2462j, c2467o);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c2467o)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                c2462j.m4391f();
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.InterfaceC2112O
    /* JADX INFO: renamed from: b */
    public final boolean mo3886b() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.InterfaceC2112O
    /* JADX INFO: renamed from: d */
    public final C2126b0 mo3887d() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC2115S getParent() {
        return m3913j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final C2122Z m3913j() {
        C2122Z c2122z = this.f7052g;
        if (c2122z != null) {
            return c2122z;
        }
        AbstractC1665j.m2991k("job");
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo3884k();

    /* JADX INFO: renamed from: l */
    public abstract void mo3885l(Throwable th);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190k3.C2462j
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC2162v.m3987i(this) + "[job@" + AbstractC2162v.m3987i(m3913j()) + ']';
    }
}
