package p348xb;

import p370yf.AbstractC6038c;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: xb.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5759e extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f23438g;

    /* JADX INFO: renamed from: h */
    public int f23439h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C5760f f23440i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5759e(C5760f c5760f, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f23440i = c5760f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f23438g = obj;
        this.f23439h |= Integer.MIN_VALUE;
        return this.f23440i.mo1602e(null, this);
    }
}
