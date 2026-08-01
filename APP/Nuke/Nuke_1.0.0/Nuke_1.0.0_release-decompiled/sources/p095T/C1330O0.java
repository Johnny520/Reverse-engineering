package p095T;

import p117X2.AbstractC1665j;
import p158f0.AbstractC2092x;

/* JADX INFO: renamed from: T.O0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1330O0 extends AbstractC2092x {

    /* JADX INFO: renamed from: c */
    public long f4757c;

    public C1330O0(long j5, long j6) {
        super(j5);
        this.f4757c = j6;
    }

    @Override // p158f0.AbstractC2092x
    /* JADX INFO: renamed from: a */
    public final void mo2405a(AbstractC2092x abstractC2092x) {
        AbstractC1665j.m2983c(abstractC2092x, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f4757c = ((C1330O0) abstractC2092x).f4757c;
    }

    @Override // p158f0.AbstractC2092x
    /* JADX INFO: renamed from: b */
    public final AbstractC2092x mo2406b(long j5) {
        return new C1330O0(j5, this.f4757c);
    }
}
