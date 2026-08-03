package p109hb;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: hb.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1691n implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5618g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1695r f5619h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1694q f5620i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC1691n(C1695r c1695r, C1694q c1694q, int i9) {
        this.f5618g = i9;
        this.f5619h = c1695r;
        this.f5620i = c1694q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5618g) {
            case 0:
                this.f5619h.m4330s(this.f5620i);
                break;
            case 1:
                C1695r c1695r = this.f5619h;
                ((ArrayDeque) c1695r.f5640e).addLast(this.f5620i);
                if (((C1694q) c1695r.f5641f) == null) {
                    c1695r.m4331u();
                }
                break;
            default:
                this.f5619h.m4330s(this.f5620i);
                break;
        }
    }
}
