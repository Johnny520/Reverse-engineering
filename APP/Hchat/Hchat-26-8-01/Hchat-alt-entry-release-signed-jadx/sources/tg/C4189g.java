package tg;

import p099h.C1492w;
import p370yf.AbstractC6038c;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: tg.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4189g extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public C1492w f13743g;

    /* JADX INFO: renamed from: h */
    public Object f13744h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f13745i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1492w f13746j;

    /* JADX INFO: renamed from: k */
    public int f13747k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4189g(C1492w c1492w, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f13746j = c1492w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f13745i = obj;
        this.f13747k |= Integer.MIN_VALUE;
        return this.f13746j.mo1602e(null, this);
    }
}
