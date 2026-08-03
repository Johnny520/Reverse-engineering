package p174m;

import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: m.s1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2652s1 extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f8656g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2656t1 f8657h;

    /* JADX INFO: renamed from: i */
    public int f8658i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2652s1(C2656t1 c2656t1, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f8657h = c2656t1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f8656g = obj;
        this.f8658i |= Integer.MIN_VALUE;
        return this.f8657h.mo1596T(this);
    }
}
