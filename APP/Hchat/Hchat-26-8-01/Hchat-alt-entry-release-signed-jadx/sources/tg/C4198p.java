package tg;

import p249qg.C3564g;
import p249qg.InterfaceC3556d0;

/* JADX INFO: renamed from: tg.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4198p implements InterfaceC3556d0 {

    /* JADX INFO: renamed from: g */
    public final C4200r f13769g;

    /* JADX INFO: renamed from: h */
    public final long f13770h;

    /* JADX INFO: renamed from: i */
    public final Object f13771i;

    /* JADX INFO: renamed from: j */
    public final C3564g f13772j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4198p(C4200r c4200r, long j3, Object obj, C3564g c3564g) {
        this.f13769g = c4200r;
        this.f13770h = j3;
        this.f13771i = obj;
        this.f13772j = c3564g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3556d0
    /* JADX INFO: renamed from: a */
    public final void mo7492a() {
        C4200r c4200r = this.f13769g;
        synchronized (c4200r) {
            if (this.f13770h < c4200r.m8455n()) {
                return;
            }
            Object[] objArr = c4200r.f13783n;
            objArr.getClass();
            long j3 = this.f13770h;
            if (objArr[((int) j3) & (objArr.length - 1)] != this) {
                return;
            }
            AbstractC4201s.m8465c(objArr, j3, AbstractC4201s.f13788a);
            c4200r.m8451i();
        }
    }
}
