package p047I0;

import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;

/* JADX INFO: renamed from: I0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0770x extends AbstractC1178c {

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f2416g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0772y f2417h;

    /* JADX INFO: renamed from: i */
    public int f2418i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0770x(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y, AbstractC1178c abstractC1178c) {
        super(abstractC1178c);
        this.f2417h = viewTreeObserverOnGlobalLayoutListenerC0772y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        this.f2416g = obj;
        this.f2418i |= Integer.MIN_VALUE;
        this.f2417h.m1303K(null, this);
        return EnumC1152a.f3788d;
    }
}
