package tg;

import java.util.concurrent.atomic.AtomicReference;
import ug.AbstractC4337b;
import ug.AbstractC4338c;
import ug.AbstractC4339d;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: tg.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4185c0 extends AbstractC4339d {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f13736a = new AtomicReference(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ug.AbstractC4339d
    /* JADX INFO: renamed from: a */
    public final boolean mo8447a(AbstractC4337b abstractC4337b) {
        AtomicReference atomicReference = this.f13736a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(AbstractC4201s.f13789b);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ug.AbstractC4339d
    /* JADX INFO: renamed from: b */
    public final InterfaceC5557c[] mo8448b(AbstractC4337b abstractC4337b) {
        this.f13736a.set(null);
        return AbstractC4338c.f14499a;
    }
}
