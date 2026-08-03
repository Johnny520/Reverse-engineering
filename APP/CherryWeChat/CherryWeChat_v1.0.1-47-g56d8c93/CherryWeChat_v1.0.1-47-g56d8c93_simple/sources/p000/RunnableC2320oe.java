package p000;

/* JADX INFO: renamed from: oe */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2320oe implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8166a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2414qe f8167b;

    public /* synthetic */ RunnableC2320oe(C2414qe r1, int r2) {
        this.f8166a = r2;
        this.f8167b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f8166a) {
            case 0: goto L14;
            case 1: goto L12;
            case 2: goto L10;
            default: goto L4;
        };
    L4:
        C2414qe r0 = this.f8167b;
        if (r0.f8467b == false) goto L7;
        String r1 = AbstractC0213Ey.m408f(new StringBuilder(), r0.f8466a, '%');
    L8:
        r0.setText(r1);
        return;
    L7:
        r1 = AbstractC0295Gu.m625r(-494574074066997L);
        goto L8
    L10:
        C2414qe r02 = this.f8167b;
        r02.f8467b = false;
        r02.f8466a = 0;
        r02.setText(AbstractC0295Gu.m625r(-494561189165109L));
        r02.invalidate();
        return;
    L12:
        C2414qe r12 = this.f8167b;
        r12.f8467b = false;
        r12.f8466a = 100;
        r12.setText(AbstractC0295Gu.m625r(-494548304263221L));
        r12.invalidate();
        return;
    L14:
        C2414qe r13 = this.f8167b;
        r13.f8467b = true;
        r13.f8466a = 0;
        AbstractC1208bA.m2328a(new RunnableC2320oe(r13, 3));
        r13.invalidate();
    }
}
