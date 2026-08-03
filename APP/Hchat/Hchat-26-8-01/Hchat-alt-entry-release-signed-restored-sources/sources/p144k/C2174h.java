package p144k;

import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: k.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2174h extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public long f7231g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f7232h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2177i f7233i;

    /* JADX INFO: renamed from: j */
    public int f7234j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2174h(C2177i c2177i, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f7233i = c2177i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f7232h = obj;
        this.f7234j |= Integer.MIN_VALUE;
        return this.f7233i.mo1615a(0L, null, this);
    }
}
