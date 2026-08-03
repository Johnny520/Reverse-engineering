package p174m;

import p082fd.C1211h;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: m.b2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2579b2 extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public long f8364g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f8365h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1211h f8366i;

    /* JADX INFO: renamed from: j */
    public int f8367j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2579b2(C1211h c1211h, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f8366i = c1211h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f8365h = obj;
        this.f8367j |= Integer.MIN_VALUE;
        return this.f8366i.mo1583m0(0L, 0L, this);
    }
}
