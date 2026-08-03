package p000;

/* JADX INFO: renamed from: oe */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2320oe implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8166a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2414qe f8167b;

    public /* synthetic */ RunnableC2320oe(C2414qe c2414qe, int i) {
        this.f8166a = i;
        this.f8167b = c2414qe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8166a) {
            case 0:
                C2414qe c2414qe = this.f8167b;
                c2414qe.f8467b = true;
                c2414qe.f8466a = 0;
                AbstractC1208bA.m2328a(new RunnableC2320oe(c2414qe, 3));
                c2414qe.invalidate();
                break;
            case 1:
                C2414qe c2414qe2 = this.f8167b;
                c2414qe2.f8467b = false;
                c2414qe2.f8466a = 100;
                c2414qe2.setText(AbstractC0295Gu.m625r(-494548304263221L));
                c2414qe2.invalidate();
                break;
            case 2:
                C2414qe c2414qe3 = this.f8167b;
                c2414qe3.f8467b = false;
                c2414qe3.f8466a = 0;
                c2414qe3.setText(AbstractC0295Gu.m625r(-494561189165109L));
                c2414qe3.invalidate();
                break;
            default:
                C2414qe c2414qe4 = this.f8167b;
                c2414qe4.setText(c2414qe4.f8467b ? AbstractC0213Ey.m408f(new StringBuilder(), c2414qe4.f8466a, '%') : AbstractC0295Gu.m625r(-494574074066997L));
                break;
        }
    }
}
