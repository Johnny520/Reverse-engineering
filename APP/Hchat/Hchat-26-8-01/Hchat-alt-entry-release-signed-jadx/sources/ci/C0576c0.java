package ci;

import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: ci.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0576c0 extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public long f1771g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f1772h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0580e0 f1773i;

    /* JADX INFO: renamed from: j */
    public int f1774j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0576c0(C0580e0 c0580e0, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f1773i = c0580e0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f1772h = obj;
        this.f1774j |= Integer.MIN_VALUE;
        return this.f1773i.mo1583m0(0L, 0L, this);
    }
}
