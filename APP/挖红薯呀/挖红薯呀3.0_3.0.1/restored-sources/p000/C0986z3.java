package p000;

/* JADX INFO: renamed from: z3 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0986z3 extends AbstractC0358jk {

    /* JADX INFO: renamed from: g */
    public vg0 f7780g;

    /* JADX INFO: renamed from: h */
    public C0797ub f7781h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f7782i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC0078c4 f7783j;

    /* JADX INFO: renamed from: k */
    public int f7784k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0986z3(ViewOnAttachStateChangeListenerC0078c4 viewOnAttachStateChangeListenerC0078c4, AbstractC0358jk abstractC0358jk) {
        super(abstractC0358jk);
        this.f7783j = viewOnAttachStateChangeListenerC0078c4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        this.f7782i = obj;
        this.f7784k |= Integer.MIN_VALUE;
        return this.f7783j.m460d(this);
    }
}
