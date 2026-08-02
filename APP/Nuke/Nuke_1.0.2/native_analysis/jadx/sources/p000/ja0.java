package p000;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ja0 extends AbstractC0679s2 {

    /* JADX INFO: renamed from: j */
    public final Iterator f4930j;

    /* JADX INFO: renamed from: k */
    public final HashSet f4931k;

    public ja0(Iterator it, eq1 eq1Var) {
        it.getClass();
        this.f4930j = it;
        this.f4931k = new HashSet();
    }

    @Override // p000.AbstractC0679s2
    /* JADX INFO: renamed from: a */
    public final void mo2473a() {
        Object next;
        do {
            Iterator it = this.f4930j;
            if (!it.hasNext()) {
                this.f9875h = 2;
                return;
            }
            next = it.next();
        } while (!this.f4931k.add(next));
        this.f9876i = next;
        this.f9875h = 1;
    }
}
