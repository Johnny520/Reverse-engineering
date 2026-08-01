package p000;

/* JADX INFO: renamed from: zh */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1004zh extends AbstractC0358jk {

    /* JADX INFO: renamed from: g */
    public Object f7893g;

    /* JADX INFO: renamed from: h */
    public a30 f7894h;

    /* JADX INFO: renamed from: i */
    public int f7895i;

    /* JADX INFO: renamed from: j */
    public int f7896j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f7897k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ ScrollCaptureCallbackC0019ai f7898l;

    /* JADX INFO: renamed from: m */
    public int f7899m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004zh(ScrollCaptureCallbackC0019ai scrollCaptureCallbackC0019ai, AbstractC0358jk abstractC0358jk) {
        super(abstractC0358jk);
        this.f7898l = scrollCaptureCallbackC0019ai;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        this.f7897k = obj;
        this.f7899m |= Integer.MIN_VALUE;
        return ScrollCaptureCallbackC0019ai.m175a(this.f7898l, null, null, this);
    }
}
