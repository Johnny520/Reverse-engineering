package p253r1;

import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: r1.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3651h extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public long f11840g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f11841h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3652i f11842i;

    /* JADX INFO: renamed from: j */
    public int f11843j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3651h(C3652i c3652i, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f11842i = c3652i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f11841h = obj;
        this.f11843j |= Integer.MIN_VALUE;
        return this.f11842i.mo1580M(0L, this);
    }
}
