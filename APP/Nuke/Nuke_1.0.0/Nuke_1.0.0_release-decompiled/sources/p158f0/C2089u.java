package p158f0;

import p114X.AbstractC1614c;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: f0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2089u extends AbstractC2092x {

    /* JADX INFO: renamed from: c */
    public AbstractC1614c f7006c;

    /* JADX INFO: renamed from: d */
    public int f7007d;

    /* JADX INFO: renamed from: e */
    public int f7008e;

    public C2089u(long j5, AbstractC1614c abstractC1614c) {
        super(j5);
        this.f7006c = abstractC1614c;
    }

    @Override // p158f0.AbstractC2092x
    /* JADX INFO: renamed from: a */
    public final void mo2405a(AbstractC2092x abstractC2092x) {
        synchronized (AbstractC2086r.f6982a) {
            AbstractC1665j.m2983c(abstractC2092x, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.f7006c = ((C2089u) abstractC2092x).f7006c;
            this.f7007d = ((C2089u) abstractC2092x).f7007d;
            this.f7008e = ((C2089u) abstractC2092x).f7008e;
        }
    }

    @Override // p158f0.AbstractC2092x
    /* JADX INFO: renamed from: b */
    public final AbstractC2092x mo2406b(long j5) {
        return new C2089u(j5, this.f7006c);
    }
}
