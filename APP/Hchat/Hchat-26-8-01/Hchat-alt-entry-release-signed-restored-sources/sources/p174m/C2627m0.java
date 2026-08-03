package p174m;

import p187n.C2848b;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: m.m0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2627m0 extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public C2678z f8549g;

    /* JADX INFO: renamed from: h */
    public C2848b f8550h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f8551i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AbstractC2639p0 f8552j;

    /* JADX INFO: renamed from: k */
    public int f8553k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2627m0(AbstractC2639p0 abstractC2639p0, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f8552j = abstractC2639p0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f8551i = obj;
        this.f8553k |= Integer.MIN_VALUE;
        return AbstractC2639p0.m6098o1(this.f8552j, null, this);
    }
}
