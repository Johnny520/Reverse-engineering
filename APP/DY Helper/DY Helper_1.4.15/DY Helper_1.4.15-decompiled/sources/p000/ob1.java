package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ob1 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f8022;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f8023;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ android.view.View f8024;

    public /* synthetic */ ob1(android.app.Activity r2, android.view.View r3) {
            r1 = this;
            r0 = 0
            r1.f8022 = r0
            r1.<init>()
            r1.f8024 = r3
            r1.f8023 = r2
            return
    }

    public /* synthetic */ ob1(android.app.Activity r1, android.view.View r2, int r3) {
            r0 = this;
            r0.f8022 = r3
            r0.f8023 = r1
            r0.f8024 = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r13) {
            r12 = this;
            int r13 = r12.f8022
            r0 = 1
            android.view.View r1 = r12.f8024
            android.app.Activity r2 = r12.f8023
            switch(r13) {
                case 0: goto L5b;
                case 1: goto L34;
                case 2: goto L1c;
                case 3: goto L16;
                case 4: goto L10;
                default: goto La;
            }
        La:
            od r12 = p000.EnumC0619od.f8036
            p000.xn0.m6748(r2, r1, r12)
            return
        L10:
            od r12 = p000.EnumC0619od.f8035
            p000.xn0.m6748(r2, r1, r12)
            return
        L16:
            od r12 = p000.EnumC0619od.f8034
            p000.xn0.m6748(r2, r1, r12)
            return
        L1c:
            java.util.concurrent.atomic.AtomicBoolean r13 = p000.jc1.f5425
            r13.set(r0)
            r10 = 0
            r11 = 1
            android.app.Activity r1 = r12.f8023
            android.view.View r2 = r12.f8024
            java.lang.String r3 = "正在停止任务"
            java.lang.String r4 = "当前请求完成后将停止剩余人员与写操作"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            p000.xn0.m6734(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L34:
            boolean r12 = p000.AbstractC0976x9.m6528()
            if (r12 != 0) goto L3b
            goto L5a
        L3b:
            boolean r12 = p000.xn0.m6727(r2, r1, r0)
            if (r12 == 0) goto L42
            goto L5a
        L42:
            java.lang.String r12 = "正在刷新营地"
            java.lang.String r13 = "正在准备最新营地状态"
            p000.xn0.m6709(r2, r1, r12, r13)
            java.util.concurrent.atomic.AtomicBoolean r12 = p000.jc1.f5424
            mb1 r12 = new mb1
            r13 = 2
            r12.<init>(r2, r1, r13)
            mb1 r13 = new mb1
            r0 = 3
            r13.<init>(r2, r1, r0)
            p000.jc1.m2942(r2, r12, r13)
        L5a:
            return
        L5b:
            yd1 r12 = p000.xn0.m6700()
            p000.xn0.m6753(r1, r12)
            r2.getClass()
            ii0 r13 = new ii0
            r0 = 9
            r13.<init>(r2, r0, r12)
            r2.runOnUiThread(r13)
            return
    }
}
