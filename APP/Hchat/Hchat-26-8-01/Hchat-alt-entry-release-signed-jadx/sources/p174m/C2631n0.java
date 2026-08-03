package p174m;

import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: m.n0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2631n0 extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public C2572a0 f8560g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f8561h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractC2639p0 f8562i;

    /* JADX INFO: renamed from: j */
    public int f8563j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2631n0(AbstractC2639p0 abstractC2639p0, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f8562i = abstractC2639p0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f8561h = obj;
        this.f8563j |= Integer.MIN_VALUE;
        return AbstractC2639p0.m6099p1(this.f8562i, null, this);
    }
}
