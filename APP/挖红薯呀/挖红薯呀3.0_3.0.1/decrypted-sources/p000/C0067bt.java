package p000;

/* JADX INFO: renamed from: bt */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0067bt extends AbstractRunnableC0140dt {

    /* JADX INFO: renamed from: f */
    public final C0884wc f582f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC0221ft f583g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0067bt(AbstractC0221ft abstractC0221ft, long j, C0884wc c0884wc) {
        super(j);
        this.f583g = abstractC0221ft;
        this.f582f = c0884wc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        this.f582f.m4982H(this.f583g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractRunnableC0140dt
    public final String toString() {
        return super.toString() + this.f582f;
    }
}
