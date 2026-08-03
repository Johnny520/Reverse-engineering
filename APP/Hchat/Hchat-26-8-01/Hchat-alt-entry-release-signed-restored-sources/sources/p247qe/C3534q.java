package p247qe;

import androidx.lifecycle.C0100e0;
import java.util.Iterator;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p302ud.C4320p;

/* JADX INFO: renamed from: qe.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3534q extends AbstractC3516a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p247qe.AbstractC3516a
    /* JADX INFO: renamed from: a */
    public final boolean mo7413a(C0100e0 c0100e0) {
        C4320p c4320p = this.f11449a;
        AbstractC3506j abstractC3506jM546b = c0100e0.m546b(c4320p.f14397l);
        Iterator it = c4320p.f14398m.iterator();
        while (it.hasNext()) {
            if (!c0100e0.m546b((AbstractC3508l) it.next()).equals(abstractC3506jM546b)) {
                return false;
            }
        }
        return true;
    }
}
