package p000;

/* JADX INFO: renamed from: u4 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0790u4 extends AbstractC0358jk {

    /* JADX INFO: renamed from: g */
    public C0797ub f6126g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f6127h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC0827v4 f6128i;

    /* JADX INFO: renamed from: j */
    public int f6129j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0790u4(ViewOnAttachStateChangeListenerC0827v4 viewOnAttachStateChangeListenerC0827v4, AbstractC0358jk abstractC0358jk) {
        super(abstractC0358jk);
        this.f6128i = viewOnAttachStateChangeListenerC0827v4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        this.f6127h = obj;
        this.f6129j |= Integer.MIN_VALUE;
        return this.f6128i.m4387d(this);
    }
}
