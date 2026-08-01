package p095T;

import p117X2.AbstractC1665j;
import p158f0.AbstractC2082n;
import p158f0.AbstractC2092x;

/* JADX INFO: renamed from: T.P0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1332P0 extends AbstractC2092x {

    /* JADX INFO: renamed from: c */
    public Object f4763c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1332P0(long j5, Object obj) {
        super(j5);
        this.f4763c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2092x
    /* JADX INFO: renamed from: a */
    public final void mo2405a(AbstractC2092x abstractC2092x) {
        AbstractC1665j.m2983c(abstractC2092x, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f4763c = ((C1332P0) abstractC2092x).f4763c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2092x
    /* JADX INFO: renamed from: b */
    public final AbstractC2092x mo2406b(long j5) {
        return new C1332P0(AbstractC2082n.m3834j().mo3791g(), this.f4763c);
    }
}
