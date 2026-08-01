package p181j0;

import p084Q2.AbstractC1178c;
import p172h3.C2242b;

/* JADX INFO: renamed from: j0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2367b extends AbstractC1178c {

    /* JADX INFO: renamed from: g */
    public C2242b f7676g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f7677h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC2369d f7678i;

    /* JADX INFO: renamed from: j */
    public int f7679j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2367b(ViewOnAttachStateChangeListenerC2369d viewOnAttachStateChangeListenerC2369d, AbstractC1178c abstractC1178c) {
        super(abstractC1178c);
        this.f7678i = viewOnAttachStateChangeListenerC2369d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        this.f7677h = obj;
        this.f7679j |= Integer.MIN_VALUE;
        return this.f7678i.m4218a(this);
    }
}
