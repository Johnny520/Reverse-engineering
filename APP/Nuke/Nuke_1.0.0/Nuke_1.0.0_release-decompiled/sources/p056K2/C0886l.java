package p056K2;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p112W2.InterfaceC1599a;

/* JADX INFO: renamed from: K2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0886l implements InterfaceC0879e, Serializable {

    /* JADX INFO: renamed from: f */
    public static final AtomicReferenceFieldUpdater f2772f = AtomicReferenceFieldUpdater.newUpdater(C0886l.class, Object.class, "e");

    /* JADX INFO: renamed from: d */
    public volatile InterfaceC1599a f2773d;

    /* JADX INFO: renamed from: e */
    public volatile Object f2774e;

    @Override // p056K2.InterfaceC0879e
    public final Object getValue() {
        Object obj = this.f2774e;
        C0890p c0890p = C0890p.f2779a;
        if (obj != c0890p) {
            return obj;
        }
        InterfaceC1599a interfaceC1599a = this.f2773d;
        if (interfaceC1599a != null) {
            Object objMo6a = interfaceC1599a.mo6a();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2772f;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c0890p, objMo6a)) {
                if (atomicReferenceFieldUpdater.get(this) != c0890p) {
                }
            }
            this.f2773d = null;
            return objMo6a;
        }
        return this.f2774e;
    }

    public final String toString() {
        return this.f2774e != C0890p.f2779a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
