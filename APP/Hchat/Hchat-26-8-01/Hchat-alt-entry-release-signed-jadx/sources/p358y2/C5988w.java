package p358y2;

import gg.AbstractC1417m;
import gg.C1424t;
import p085fg.InterfaceC1220a;
import p276sf.C3967n;
import p293u2.C4241k;

/* JADX INFO: renamed from: y2.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5988w extends AbstractC1417m implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1424t f24318g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5989x f24319h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C4241k f24320i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f24321j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long f24322k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5988w(C1424t c1424t, C5989x c5989x, C4241k c4241k, long j3, long j4) {
        super(0);
        this.f24318g = c1424t;
        this.f24319h = c5989x;
        this.f24320i = c4241k;
        this.f24321j = j3;
        this.f24322k = j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        C5989x c5989x = this.f24319h;
        this.f24318g.f4737g = c5989x.getPositionProvider().mo600e(this.f24320i, this.f24321j, c5989x.getParentLayoutDirection(), this.f24322k);
        return C3967n.f12976a;
    }
}
