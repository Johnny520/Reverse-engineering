package p178i3;

import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1178c;
import p121Y1.C1753n;
import p184j3.C2397p;

/* JADX INFO: renamed from: i3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2320a extends AbstractC1178c {

    /* JADX INFO: renamed from: g */
    public C2397p f7566g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f7567h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1753n f7568i;

    /* JADX INFO: renamed from: j */
    public int f7569j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2320a(C1753n c1753n, InterfaceC1046d interfaceC1046d) {
        super(interfaceC1046d);
        this.f7568i = c1753n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        this.f7567h = obj;
        this.f7569j |= Integer.MIN_VALUE;
        return this.f7568i.mo3119i(null, this);
    }
}
