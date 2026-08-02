package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ac2 implements j71, Serializable {
    public static final AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(ac2.class, Object.class, "i");
    public volatile xm0 h;
    public volatile Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.j71
    public final Object getValue() {
        Object obj = this.i;
        sn snVar = sn.V;
        if (obj != snVar) {
            return obj;
        }
        xm0 xm0Var = this.h;
        if (xm0Var != null) {
            Object objA = xm0Var.a();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, snVar, objA)) {
                if (atomicReferenceFieldUpdater.get(this) != snVar) {
                }
            }
            this.h = null;
            return objA;
        }
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.i != sn.V ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
