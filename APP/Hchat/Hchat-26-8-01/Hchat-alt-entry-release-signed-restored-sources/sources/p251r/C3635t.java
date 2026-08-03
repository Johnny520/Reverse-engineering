package p251r;

import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: r.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3635t extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f11779g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3641z f11780h;

    /* JADX INFO: renamed from: i */
    public int f11781i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3635t(C3641z c3641z, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f11780h = c3641z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f11779g = obj;
        this.f11781i |= Integer.MIN_VALUE;
        return this.f11780h.m7619f(0, this);
    }
}
