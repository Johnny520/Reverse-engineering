package p095T;

import p117X2.AbstractC1665j;
import p158f0.AbstractC2092x;

/* JADX INFO: renamed from: T.M0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1326M0 extends AbstractC2092x {

    /* JADX INFO: renamed from: c */
    public float f4751c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1326M0(float f2, long j5) {
        super(j5);
        this.f4751c = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2092x
    /* JADX INFO: renamed from: a */
    public final void mo2405a(AbstractC2092x abstractC2092x) {
        AbstractC1665j.m2983c(abstractC2092x, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f4751c = ((C1326M0) abstractC2092x).f4751c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2092x
    /* JADX INFO: renamed from: b */
    public final AbstractC2092x mo2406b(long j5) {
        return new C1326M0(this.f4751c, j5);
    }
}
