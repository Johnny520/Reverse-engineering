package p095T;

import p047I0.C0711a0;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1178c;
import p112W2.InterfaceC1601c;

/* JADX INFO: renamed from: T.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1368j0 extends AbstractC1178c {

    /* JADX INFO: renamed from: g */
    public InterfaceC1601c f4816g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f4817h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0711a0 f4818i;

    /* JADX INFO: renamed from: j */
    public int f4819j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1368j0(C0711a0 c0711a0, InterfaceC1046d interfaceC1046d) {
        super(interfaceC1046d);
        this.f4818i = c0711a0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        this.f4817h = obj;
        this.f4819j |= Integer.MIN_VALUE;
        return this.f4818i.m1209a(null, this);
    }
}
