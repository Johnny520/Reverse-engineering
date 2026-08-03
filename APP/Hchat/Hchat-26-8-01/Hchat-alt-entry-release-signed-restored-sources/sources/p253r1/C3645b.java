package p253r1;

import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: r1.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3645b extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f11823g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3647d f11824h;

    /* JADX INFO: renamed from: i */
    public int f11825i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3645b(C3647d c3647d, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f11824h = c3647d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f11823g = obj;
        this.f11825i |= Integer.MIN_VALUE;
        return this.f11824h.m7626a(0L, 0L, this);
    }
}
