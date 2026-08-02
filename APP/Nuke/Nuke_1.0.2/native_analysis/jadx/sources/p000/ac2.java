package p000;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ac2 implements j71, Serializable {

    /* JADX INFO: renamed from: j */
    public static final AtomicReferenceFieldUpdater f145j = AtomicReferenceFieldUpdater.newUpdater(ac2.class, Object.class, "i");

    /* JADX INFO: renamed from: h */
    public volatile xm0 f146h;

    /* JADX INFO: renamed from: i */
    public volatile Object f147i;

    @Override // p000.j71
    public final Object getValue() {
        Object obj = this.f147i;
        C0700sn c0700sn = C0700sn.f10218V;
        if (obj != c0700sn) {
            return obj;
        }
        xm0 xm0Var = this.f146h;
        if (xm0Var != null) {
            Object objMo6a = xm0Var.mo6a();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f145j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c0700sn, objMo6a)) {
                if (atomicReferenceFieldUpdater.get(this) != c0700sn) {
                }
            }
            this.f146h = null;
            return objMo6a;
        }
        return this.f147i;
    }

    public final String toString() {
        return this.f147i != C0700sn.f10218V ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
