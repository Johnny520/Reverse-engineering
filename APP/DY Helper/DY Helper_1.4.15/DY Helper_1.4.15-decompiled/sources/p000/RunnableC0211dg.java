package p000;

/* JADX INFO: renamed from: dg */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0211dg implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3123;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.view.View f3124;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.String f3125;

    public /* synthetic */ RunnableC0211dg(int r1, android.view.View r2, java.lang.String r3) {
            r0 = this;
            r0.f3123 = r1
            r0.f3124 = r2
            r0.f3125 = r3
            r0.<init>()
            return
    }

    public /* synthetic */ RunnableC0211dg(android.view.View r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.f3123 = r0
            r1.<init>()
            r1.f3125 = r3
            r1.f3124 = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f3123
            r1 = 0
            java.lang.String r2 = r3.f3125
            android.view.View r3 = r3.f3124
            switch(r0) {
                case 0: goto L2e;
                case 1: goto L28;
                case 2: goto L1d;
                case 3: goto L12;
                default: goto La;
            }
        La:
            java.lang.String r0 = "entry-guard"
            o22 r1 = p000.o22.f7889
            r1.m4191(r3, r2, r0)
            return
        L12:
            q10 r0 = p000.q10.f8786
            sm1 r0 = new sm1
            r0.<init>()
            p000.q10.m4698(r0, r2, r3, r3, r1)
            return
        L1d:
            q10 r0 = p000.q10.f8786
            sm1 r0 = new sm1
            r0.<init>()
            p000.q10.m4698(r0, r2, r3, r3, r1)
            return
        L28:
            tg r0 = p000.AbstractC0871ug.f10771
            r0.m5691(r3, r2)
            return
        L2e:
            tg r0 = p000.AbstractC0871ug.f10771
            r0.m5699(r3, r2)
            return
    }
}
