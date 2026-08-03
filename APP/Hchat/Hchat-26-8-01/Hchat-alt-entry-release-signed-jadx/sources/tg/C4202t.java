package tg;

import p249qg.C3564g;
import ug.AbstractC4337b;
import ug.AbstractC4339d;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: tg.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4202t extends AbstractC4339d {

    /* JADX INFO: renamed from: a */
    public long f13791a;

    /* JADX INFO: renamed from: b */
    public C3564g f13792b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ug.AbstractC4339d
    /* JADX INFO: renamed from: a */
    public final boolean mo8447a(AbstractC4337b abstractC4337b) {
        C4200r c4200r = (C4200r) abstractC4337b;
        if (this.f13791a >= 0) {
            return false;
        }
        long j3 = c4200r.f13784o;
        if (j3 < c4200r.f13785p) {
            c4200r.f13785p = j3;
        }
        this.f13791a = j3;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ug.AbstractC4339d
    /* JADX INFO: renamed from: b */
    public final InterfaceC5557c[] mo8448b(AbstractC4337b abstractC4337b) {
        long j3 = this.f13791a;
        this.f13791a = -1L;
        this.f13792b = null;
        return ((C4200r) abstractC4337b).m8462u(j3);
    }
}
