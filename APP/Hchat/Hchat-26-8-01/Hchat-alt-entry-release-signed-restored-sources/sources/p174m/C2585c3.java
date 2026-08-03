package p174m;

import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: m.c3 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2585c3 extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f8379g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2590d3 f8380h;

    /* JADX INFO: renamed from: i */
    public int f8381i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2585c3(C2590d3 c2590d3, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f8380h = c2590d3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f8379g = obj;
        this.f8381i |= Integer.MIN_VALUE;
        return C2590d3.m6053c(this.f8380h, null, null, this);
    }
}
