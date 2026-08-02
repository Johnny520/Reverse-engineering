package p000;

/* JADX INFO: renamed from: ax */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0034ax extends u00 {

    /* JADX INFO: renamed from: k */
    public Object f424k;

    /* JADX INFO: renamed from: l */
    public d11 f425l;

    /* JADX INFO: renamed from: m */
    public int f426m;

    /* JADX INFO: renamed from: n */
    public int f427n;

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f428o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ ScrollCaptureCallbackC0109cx f429p;

    /* JADX INFO: renamed from: q */
    public int f430q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0034ax(ScrollCaptureCallbackC0109cx scrollCaptureCallbackC0109cx, u00 u00Var) {
        super(u00Var);
        this.f429p = scrollCaptureCallbackC0109cx;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    public final Object mo7r(Object obj) {
        this.f428o = obj;
        this.f430q |= Integer.MIN_VALUE;
        return ScrollCaptureCallbackC0109cx.m911a(this.f429p, null, null, this);
    }
}
