package p000;

/* JADX INFO: renamed from: e7 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0156e7 extends u00 {

    /* JADX INFO: renamed from: k */
    public ak1 f2331k;

    /* JADX INFO: renamed from: l */
    public C0319in f2332l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f2333m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC0267h7 f2334n;

    /* JADX INFO: renamed from: o */
    public int f2335o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0156e7(ViewOnAttachStateChangeListenerC0267h7 viewOnAttachStateChangeListenerC0267h7, u00 u00Var) {
        super(u00Var);
        this.f2334n = viewOnAttachStateChangeListenerC0267h7;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        this.f2333m = obj;
        this.f2335o |= Integer.MIN_VALUE;
        return this.f2334n.m2099e(this);
    }
}
