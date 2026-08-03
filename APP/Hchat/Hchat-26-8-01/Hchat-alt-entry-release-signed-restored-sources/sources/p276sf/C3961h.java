package p276sf;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p085fg.InterfaceC1220a;

/* JADX INFO: renamed from: sf.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3961h implements InterfaceC3956c, Serializable {

    /* JADX INFO: renamed from: i */
    public static final AtomicReferenceFieldUpdater f12965i = AtomicReferenceFieldUpdater.newUpdater(C3961h.class, Object.class, "h");

    /* JADX INFO: renamed from: g */
    public volatile InterfaceC1220a f12966g;

    /* JADX INFO: renamed from: h */
    public volatile Object f12967h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p276sf.InterfaceC3956c
    /* JADX INFO: renamed from: a */
    public final boolean mo8178a() {
        return this.f12967h != C3966m.f12975a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p276sf.InterfaceC3956c
    public final Object getValue() {
        Object obj = this.f12967h;
        C3966m c3966m = C3966m.f12975a;
        if (obj != c3966m) {
            return obj;
        }
        InterfaceC1220a interfaceC1220a = this.f12966g;
        if (interfaceC1220a != null) {
            Object objInvoke = interfaceC1220a.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12965i;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c3966m, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c3966m) {
                }
            }
            this.f12966g = null;
            return objInvoke;
        }
        return this.f12967h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return mo8178a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
