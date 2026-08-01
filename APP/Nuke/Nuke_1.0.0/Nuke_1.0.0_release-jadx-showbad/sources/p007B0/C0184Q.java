package p007B0;

import p084Q2.AbstractC1176a;
import p084Q2.AbstractC1178c;

/* JADX INFO: renamed from: B0.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C0184Q extends AbstractC1178c {

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f637g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0185S f638h;

    /* JADX INFO: renamed from: i */
    public int f639i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0184Q(C0185S c0185s, AbstractC1176a abstractC1176a) {
        super(abstractC1176a);
        this.f638h = c0185s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        this.f637g = obj;
        this.f639i |= Integer.MIN_VALUE;
        return this.f638h.m281l(0L, null, this);
    }
}
