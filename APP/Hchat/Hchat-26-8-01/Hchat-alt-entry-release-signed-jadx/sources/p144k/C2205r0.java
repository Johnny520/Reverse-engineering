package p144k;

import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: k.r0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2205r0 extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f7312g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2211t0 f7313h;

    /* JADX INFO: renamed from: i */
    public int f7314i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2205r0(C2211t0 c2211t0, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f7313h = c2211t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f7312g = obj;
        this.f7314i |= Integer.MIN_VALUE;
        return C2211t0.m5454l1(this.f7313h, this);
    }
}
