package p058e2;

import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: e2.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0816f extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f2449g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0817g f2450h;

    /* JADX INFO: renamed from: i */
    public int f2451i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0816f(C0817g c0817g, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f2450h = c0817g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f2449g = obj;
        this.f2451i |= Integer.MIN_VALUE;
        return this.f2450h.m2065b(0.0f, this);
    }
}
