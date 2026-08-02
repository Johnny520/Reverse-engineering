package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pq extends lm2 {
    public final jn e;
    public final /* synthetic */ AtomicReferenceArray f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pq(long j, pq pqVar, jn jnVar, int i) {
        super(j, pqVar, i);
        this.e = jnVar;
        this.f = new AtomicReferenceArray(ln.b * 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.lm2
    public final int g() {
        return ln.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // defpackage.lm2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i, a20 a20Var) {
        int i2 = ln.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.f.get(i * 2);
        while (true) {
            Object objL = l(i);
            boolean z2 = objL instanceof gc3;
            jn jnVar = this.e;
            if (z2 || (objL instanceof hc3)) {
                if (k(i, objL, z ? ln.j : ln.k)) {
                    n(i, null);
                    m(i, !z);
                    if (z) {
                        jnVar.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objL == ln.j || objL == ln.k) {
                    break;
                }
                if (objL != ln.g && objL != ln.f) {
                    if (objL == ln.i || objL == ln.d || objL == ln.l) {
                        return;
                    }
                    c80.u("unexpected state: ", objL);
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object l(int i) {
        return this.f.get((i * 2) + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(int i, boolean z) {
        if (z) {
            jn jnVar = this.e;
            jnVar.getClass();
            jnVar.E((this.c * ((long) ln.b)) + ((long) i));
        }
        i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n(int i, Object obj) {
        this.f.set(i * 2, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(int i, Object obj) {
        this.f.set((i * 2) + 1, obj);
    }
}
