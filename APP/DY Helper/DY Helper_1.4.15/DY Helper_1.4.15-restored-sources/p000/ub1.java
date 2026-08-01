package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ub1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ android.app.AlertDialog f10681;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.um1 f10682;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.app.Activity f10683;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ android.view.View f10684;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ p000.um1 f10685;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ android.os.Handler f10686;

    public ub1(android.app.AlertDialog r1, p000.um1 r2, android.app.Activity r3, android.view.View r4, p000.um1 r5, android.os.Handler r6) {
            r0 = this;
            r0.<init>()
            r0.f10681 = r1
            r0.f10682 = r2
            r0.f10683 = r3
            r0.f10684 = r4
            r0.f10685 = r5
            r0.f10686 = r6
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            um1 r0 = r9.f10685
            android.app.Activity r1 = r9.f10683
            android.view.View r2 = r9.f10684
            android.app.AlertDialog r3 = r9.f10681
            boolean r3 = r3.isShowing()
            if (r3 != 0) goto Lf
            return
        Lf:
            java.util.concurrent.atomic.AtomicBoolean r3 = p000.jc1.f5424
            a r3 = p000.jc1.f5426
            java.lang.Object r3 = r3.f1
            ｚ r3 = (p000.C1156) r3
            long r4 = r3.f13524
            boolean r6 = r3.f13525
            java.lang.Object r7 = r3.f13526
            gc1 r7 = (p000.gc1) r7
            java.lang.Object r3 = r3.f13527
            dc1 r3 = (p000.dc1) r3
            um1 r8 = r9.f10682
            if (r6 == 0) goto L3f
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r8.f10912 = r0
            if (r7 == 0) goto L33
            p000.xn0.m6733(r1, r2, r7)
            goto L3a
        L33:
            java.lang.String r0 = "营地任务正在执行"
            java.lang.String r3 = "正在等待首个进度回调"
            p000.xn0.m6709(r1, r2, r0, r3)
        L3a:
            r0 = 1
            p000.xn0.m6722(r2, r0)
            goto L72
        L3f:
            java.lang.Object r6 = r8.f10912
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 != 0) goto L46
            goto L72
        L46:
            long r6 = r6.longValue()
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 != 0) goto L72
            java.lang.Object r6 = r0.f10912
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 != 0) goto L55
            goto L5d
        L55:
            long r6 = r6.longValue()
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L72
        L5d:
            if (r3 == 0) goto L72
            boolean r6 = p000.xn0.m6696(r1, r2, r3)
            if (r6 == 0) goto L72
            java.lang.String r3 = r3.m1696()
            p000.xn0.m6752(r1, r2, r3)
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r0.f10912 = r1
        L72:
            android.os.Handler r0 = r9.f10686
            r1 = 250(0xfa, double:1.235E-321)
            r0.postDelayed(r9, r1)
            return
    }
}
