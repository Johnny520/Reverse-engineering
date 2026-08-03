package p267s1;

import p370yf.AbstractC6036a;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: s1.j0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3902j0 extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f12797g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3904k0 f12798h;

    /* JADX INFO: renamed from: i */
    public int f12799i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3902j0(C3904k0 c3904k0, AbstractC6036a abstractC6036a) {
        super(abstractC6036a);
        this.f12798h = c3904k0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f12797g = obj;
        this.f12799i |= Integer.MIN_VALUE;
        return this.f12798h.m8101E(0L, null, this);
    }
}
