package a;

/* JADX INFO: renamed from: a.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0130f0 implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f464a;
    public final /* synthetic */ android.app.Activity b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0130f0(android.app.Activity r1, int r2) {
            r0 = this;
            r0.f464a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r9, int r10) {
            r8 = this;
            r9 = 0
            int r10 = r8.f464a
            switch(r10) {
                case 0: goto L87;
                default: goto L6;
            }
        L6:
            android.app.Activity r10 = r8.b
            a.m0 r0 = a.C0255m0.f569a
            r0.getClass()
            java.lang.String r0 = "restartWechat start (non-root)"
            java.lang.String r1 = "AdaptationManager"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            a.C0453x1.b(r0)
            android.content.Context r10 = r10.getApplicationContext()     // Catch: java.lang.Throwable -> L70
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
            java.lang.String r2 = "com.tencent.mm"
            java.lang.String r3 = "com.tencent.mm.ui.LauncherUI"
            r0.setClassName(r2, r3)     // Catch: java.lang.Throwable -> L70
            r2 = 335544320(0x14000000, float:6.4623485E-27)
            r0.addFlags(r2)     // Catch: java.lang.Throwable -> L70
            r2 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r10, r9, r0, r2)     // Catch: java.lang.Throwable -> L70
            java.lang.String r3 = "alarm"
            java.lang.Object r3 = r10.getSystemService(r3)     // Catch: java.lang.Throwable -> L70
            java.lang.String r4 = "null cannot be cast to non-null type android.app.AlarmManager"
            a.C0193i9.c(r3, r4)     // Catch: java.lang.Throwable -> L70
            android.app.AlarmManager r3 = (android.app.AlarmManager) r3     // Catch: java.lang.Throwable -> L70
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L70
            r6 = 1500(0x5dc, double:7.41E-321)
            long r4 = r4 + r6
            r6 = 2
            r3.set(r6, r4, r2)     // Catch: java.lang.Throwable -> L70
            r10.startActivity(r0)     // Catch: java.lang.Throwable -> L51
            a.Wf r10 = a.Wf.f330a     // Catch: java.lang.Throwable -> L51
            goto L55
        L51:
            r10 = move-exception
            a.C0465xd.a(r10)     // Catch: java.lang.Throwable -> L70
        L55:
            java.lang.String r10 = "restartWechat scheduled via AlarmManager+startActivity, killing self in 800ms"
            java.lang.Object[] r10 = new java.lang.Object[]{r1, r10}     // Catch: java.lang.Throwable -> L70
            a.C0453x1.b(r10)     // Catch: java.lang.Throwable -> L70
            android.os.Handler r10 = a.C0255m0.b     // Catch: java.lang.Throwable -> L70
            a.l0 r0 = new a.l0     // Catch: java.lang.Throwable -> L70
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L70
            r2 = 800(0x320, double:3.953E-321)
            boolean r10 = r10.postDelayed(r0, r2)     // Catch: java.lang.Throwable -> L70
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L70
            goto L75
        L70:
            r10 = move-exception
            a.wd$a r10 = a.C0465xd.a(r10)
        L75:
            java.lang.Throwable r10 = a.C0447wd.a(r10)
            if (r10 == 0) goto L86
            java.lang.String r0 = "restartWechat failed"
            java.lang.Object[] r10 = new java.lang.Object[]{r1, r0, r10}
            a.C0453x1.a(r10)
            a.C0255m0.c = r9
        L86:
            return
        L87:
            a.m0 r9 = a.C0255m0.f569a
            android.app.Activity r10 = r8.b
            r9.getClass()
            a.C0255m0.c(r10)
            return
    }
}
