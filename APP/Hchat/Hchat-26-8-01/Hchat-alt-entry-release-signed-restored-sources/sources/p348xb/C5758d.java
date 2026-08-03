package p348xb;

import p370yf.AbstractC6038c;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: xb.d */
/* JADX INFO: loaded from: classes.dex */
public final class C5758d extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f23435g;

    /* JADX INFO: renamed from: h */
    public int f23436h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C5761g f23437i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5758d(C5761g c5761g, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f23437i = c5761g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f23435g = obj;
        this.f23436h |= Integer.MIN_VALUE;
        return this.f23437i.mo6025b(null, this);
    }
}
