package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class lc1 extends c50 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0671r f3414d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC0677r5 f3415e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0921xc f3416f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc1(AbstractC0671r abstractC0671r, ViewOnAttachStateChangeListenerC0677r5 viewOnAttachStateChangeListenerC0677r5, C0921xc c0921xc) {
        super(0);
        this.f3414d = abstractC0671r;
        this.f3415e = viewOnAttachStateChangeListenerC0677r5;
        this.f3416f = c0921xc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0298hw
    public final Object invoke() {
        ViewOnAttachStateChangeListenerC0677r5 viewOnAttachStateChangeListenerC0677r5 = this.f3415e;
        AbstractC0671r abstractC0671r = this.f3414d;
        abstractC0671r.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0677r5);
        j50.m1665o(abstractC0671r).f6285a.remove(this.f3416f);
        return na1.f4229a;
    }
}
