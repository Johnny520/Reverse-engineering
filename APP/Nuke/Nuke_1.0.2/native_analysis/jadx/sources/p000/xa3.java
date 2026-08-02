package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xa3 extends w51 implements xm0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractC0526o2 f12930i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC0047b9 f12931j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ um2 f12932k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa3(AbstractC0526o2 abstractC0526o2, ViewOnAttachStateChangeListenerC0047b9 viewOnAttachStateChangeListenerC0047b9, um2 um2Var) {
        super(0);
        this.f12930i = abstractC0526o2;
        this.f12931j = viewOnAttachStateChangeListenerC0047b9;
        this.f12932k = um2Var;
    }

    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        ViewOnAttachStateChangeListenerC0047b9 viewOnAttachStateChangeListenerC0047b9 = this.f12931j;
        AbstractC0526o2 abstractC0526o2 = this.f12930i;
        abstractC0526o2.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0047b9);
        t11.m5099y(abstractC0526o2).f13705a.remove(this.f12932k);
        return a83.f116a;
    }
}
