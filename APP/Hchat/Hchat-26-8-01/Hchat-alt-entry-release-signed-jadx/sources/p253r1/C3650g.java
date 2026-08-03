package p253r1;

import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: r1.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3650g extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public long f11835g;

    /* JADX INFO: renamed from: h */
    public long f11836h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f11837i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C3652i f11838j;

    /* JADX INFO: renamed from: k */
    public int f11839k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3650g(C3652i c3652i, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f11838j = c3652i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f11837i = obj;
        this.f11839k |= Integer.MIN_VALUE;
        return this.f11838j.mo1583m0(0L, 0L, this);
    }
}
