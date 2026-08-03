package tg;

import p100h0.C1534l0;
import p370yf.AbstractC6038c;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: tg.j */
/* JADX INFO: loaded from: classes.dex */
public final class C4192j extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public C1534l0 f13753g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f13754h;

    /* JADX INFO: renamed from: i */
    public int f13755i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1534l0 f13756j;

    /* JADX INFO: renamed from: k */
    public Object f13757k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4192j(C1534l0 c1534l0, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f13756j = c1534l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f13754h = obj;
        this.f13755i |= Integer.MIN_VALUE;
        return this.f13756j.mo1602e(null, this);
    }
}
