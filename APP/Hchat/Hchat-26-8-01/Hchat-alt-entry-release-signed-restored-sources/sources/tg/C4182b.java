package tg;

import p100h0.C1534l0;
import p370yf.AbstractC6038c;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: tg.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4182b extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f13730g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1534l0 f13731h;

    /* JADX INFO: renamed from: i */
    public int f13732i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4182b(C1534l0 c1534l0, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f13731h = c1534l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f13730g = obj;
        this.f13732i |= Integer.MIN_VALUE;
        return this.f13731h.mo1602e(null, this);
    }
}
