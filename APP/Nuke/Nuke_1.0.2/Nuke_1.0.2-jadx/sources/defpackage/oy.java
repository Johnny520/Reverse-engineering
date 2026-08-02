package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class oy {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(oy.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(oy.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public oy(lm2 lm2Var) {
        this._prev$volatile = lm2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        b.set(this, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final oy c() {
        Object obj = a.get(this);
        if (obj == xe1.e) {
            return null;
        }
        return (oy) obj;
    }

    public abstract boolean d();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        oy oyVarC;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            oy oyVar = (oy) atomicReferenceFieldUpdater.get(this);
            while (oyVar != null && oyVar.d()) {
                oyVar = (oy) atomicReferenceFieldUpdater.get(oyVar);
            }
            oy oyVarC2 = c();
            oyVarC2.getClass();
            while (oyVarC2.d() && (oyVarC = oyVarC2.c()) != null) {
                oyVarC2 = oyVarC;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(oyVarC2);
                oy oyVar2 = ((oy) obj) == null ? null : oyVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(oyVarC2, obj, oyVar2)) {
                    if (atomicReferenceFieldUpdater.get(oyVarC2) != obj) {
                        break;
                    }
                }
            }
            if (oyVar != null) {
                a.set(oyVar, oyVarC2);
            }
            if (!oyVarC2.d() || oyVarC2.c() == null) {
                if (oyVar == null || !oyVar.d()) {
                    return;
                }
            }
        }
    }
}
