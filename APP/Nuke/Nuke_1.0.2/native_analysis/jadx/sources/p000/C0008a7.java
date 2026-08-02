package p000;

/* JADX INFO: renamed from: a7 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0008a7 extends u00 {

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f98k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0045b7 f99l;

    /* JADX INFO: renamed from: m */
    public int f100m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0008a7(ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7, u00 u00Var) {
        super(u00Var);
        this.f99l = viewTreeObserverOnGlobalLayoutListenerC0045b7;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        this.f98k = obj;
        this.f100m |= Integer.MIN_VALUE;
        this.f99l.m464K(null, this);
        return k20.f5323h;
    }
}
