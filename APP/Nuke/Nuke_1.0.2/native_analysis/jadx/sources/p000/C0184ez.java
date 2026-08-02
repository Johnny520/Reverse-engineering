package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ez */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0184ez implements uo2 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f2689a;

    public C0184ez(uo2 uo2Var) {
        this.f2689a = new AtomicReference(uo2Var);
    }

    @Override // p000.uo2
    public final Iterator iterator() {
        uo2 uo2Var = (uo2) this.f2689a.getAndSet(null);
        if (uo2Var != null) {
            return uo2Var.iterator();
        }
        C0676s.m4653l("This sequence can be consumed only once.");
        return null;
    }
}
