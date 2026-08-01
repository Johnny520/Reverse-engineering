package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tx0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10488;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f10489;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Throwable f10490;

    public /* synthetic */ tx0(android.app.Activity r1, java.lang.Throwable r2, int r3) {
            r0 = this;
            r0.f10488 = r3
            r0.f10489 = r1
            r0.f10490 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f10488
            java.lang.String r1 = "表情下载失败: "
            java.lang.Throwable r2 = r3.f10490
            android.app.Activity r3 = r3.f10489
            switch(r0) {
                case 0: goto L66;
                case 1: goto L50;
                case 2: goto L38;
                case 3: goto L20;
                default: goto Lb;
            }
        Lb:
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto L19
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
        L19:
            java.lang.String r1 = "测试失败: "
            r2 = 1
            p000.a12.m21(r2, r3, r1, r0)
            return
        L20:
            qy0 r0 = p000.qy0.f9157
            java.lang.String r0 = r2.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "下载失败: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.qy0.m4991(r3, r0)
            return
        L38:
            qy0 r0 = p000.qy0.f9157
            java.lang.String r0 = r2.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "音频下载失败: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.qy0.m4991(r3, r0)
            return
        L50:
            qy0 r0 = p000.qy0.f9157
            java.lang.String r0 = r2.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            p000.qy0.m4991(r3, r0)
            return
        L66:
            qy0 r0 = p000.qy0.f9157
            java.lang.String r0 = r2.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            p000.qy0.m4991(r3, r0)
            return
    }
}
