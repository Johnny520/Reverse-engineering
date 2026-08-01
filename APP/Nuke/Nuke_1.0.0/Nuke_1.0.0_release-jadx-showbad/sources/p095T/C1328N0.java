package p095T;

import p117X2.AbstractC1665j;
import p158f0.AbstractC2092x;

/* JADX INFO: renamed from: T.N0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1328N0 extends AbstractC2092x {

    /* JADX INFO: renamed from: c */
    public int f4753c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1328N0(long j5, int i5) {
        super(j5);
        this.f4753c = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2092x
    /* JADX INFO: renamed from: a */
    public final void mo2405a(AbstractC2092x abstractC2092x) {
        AbstractC1665j.m2983c(abstractC2092x, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.f4753c = ((C1328N0) abstractC2092x).f4753c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2092x
    /* JADX INFO: renamed from: b */
    public final AbstractC2092x mo2406b(long j5) {
        return new C1328N0(j5, this.f4753c);
    }
}
