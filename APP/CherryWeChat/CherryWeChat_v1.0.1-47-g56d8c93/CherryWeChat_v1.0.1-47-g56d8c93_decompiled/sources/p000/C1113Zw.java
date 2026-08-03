package p000;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: Zw */
/* JADX INFO: loaded from: classes.dex */
public final class C1113Zw implements InterfaceC0159Dn, Serializable {

    /* JADX INFO: renamed from: c */
    public static final AtomicReferenceFieldUpdater f3511c = AtomicReferenceFieldUpdater.newUpdater(C1113Zw.class, Object.class, "b");

    /* JADX INFO: renamed from: a */
    public volatile InterfaceC0884Ui f3512a;

    /* JADX INFO: renamed from: b */
    public volatile Object f3513b;

    @Override // p000.InterfaceC0159Dn
    public final Object getValue() {
        Object obj = this.f3513b;
        C1456gf c1456gf = C1456gf.f5166j;
        if (obj != c1456gf) {
            return obj;
        }
        InterfaceC0884Ui interfaceC0884Ui = this.f3512a;
        if (interfaceC0884Ui != null) {
            Object objMo6a = interfaceC0884Ui.mo6a();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3511c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c1456gf, objMo6a)) {
                if (atomicReferenceFieldUpdater.get(this) != c1456gf) {
                }
            }
            this.f3512a = null;
            return objMo6a;
        }
        return this.f3513b;
    }

    public final String toString() {
        return this.f3513b != C1456gf.f5166j ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
