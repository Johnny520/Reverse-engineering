package p174m;

import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: m.l0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2623l0 extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f8534g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC2639p0 f8535h;

    /* JADX INFO: renamed from: i */
    public int f8536i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2623l0(AbstractC2639p0 abstractC2639p0, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f8535h = abstractC2639p0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f8534g = obj;
        this.f8536i |= Integer.MIN_VALUE;
        return AbstractC2639p0.m6097n1(this.f8535h, this);
    }
}
