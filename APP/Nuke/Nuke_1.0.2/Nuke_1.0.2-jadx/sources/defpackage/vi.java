package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vi extends n21 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(vi.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;
    public final mp l;
    public ca0 m;
    public final /* synthetic */ xi n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vi(xi xiVar, mp mpVar) {
        this.n = xiVar;
        this.l = mpVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.n21
    public final boolean k() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.n21
    public final void l(Throwable th) throws j90 {
        mp mpVar = this.l;
        if (th != null) {
            hh1 hh1VarH = mpVar.H(new ov(th, false), null);
            if (hh1VarH != null) {
                mpVar.C(hh1VarH);
                wi wiVar = (wi) o.get(this);
                if (wiVar != null) {
                    wiVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = xi.b;
        xi xiVar = this.n;
        if (atomicIntegerFieldUpdater.decrementAndGet(xiVar) == 0) {
            n60[] n60VarArr = xiVar.a;
            ArrayList arrayList = new ArrayList(n60VarArr.length);
            for (n60 n60Var : n60VarArr) {
                arrayList.add(n60Var.e());
            }
            mpVar.h(arrayList);
        }
    }
}
