package p174m;

import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: m.n1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2632n1 extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f8564g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC2636o1 f8565h;

    /* JADX INFO: renamed from: i */
    public int f8566i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2632n1(AbstractC2636o1 abstractC2636o1, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f8565h = abstractC2636o1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f8564g = obj;
        this.f8566i |= Integer.MIN_VALUE;
        return this.f8565h.m6087b(null, this);
    }
}
