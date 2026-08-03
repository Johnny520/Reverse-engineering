package ci;

import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: ci.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0584g0 extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f1820g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0586h0 f1821h;

    /* JADX INFO: renamed from: i */
    public int f1822i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0584g0(C0586h0 c0586h0, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f1821h = c0586h0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f1820g = obj;
        this.f1822i |= Integer.MIN_VALUE;
        return this.f1821h.mo1596T(this);
    }
}
