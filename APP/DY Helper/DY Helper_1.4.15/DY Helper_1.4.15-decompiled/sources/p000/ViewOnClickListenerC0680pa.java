package p000;

/* JADX INFO: renamed from: pa */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0680pa implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f8462;

    public /* synthetic */ ViewOnClickListenerC0680pa(int r1) {
            r0 = this;
            r0.f8462 = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r4) {
            r3 = this;
            int r3 = r3.f8462
            r0 = 1
            switch(r3) {
                case 0: goto Lb6;
                case 1: goto Lb2;
                case 2: goto L3a;
                case 3: goto L1a;
                case 4: goto L12;
                case 5: goto Le;
                default: goto L6;
            }
        L6:
            android.app.AlertDialog r3 = p000.bv1.f1854
            if (r3 == 0) goto Ld
            r3.dismiss()
        Ld:
            return
        Le:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.m1452(r4)
            return
        L12:
            android.app.AlertDialog r3 = p000.ia0.f4971
            if (r3 == 0) goto L19
            r3.dismiss()
        L19:
            return
        L1a:
            android.os.Handler r3 = p000.C0661os.f8210
            java.lang.String r3 = "用户点击暂不重启按钮"
            p000.C0661os.m4293(r3)
            p000.C0661os.m4296()
            java.lang.Object r3 = p000.C0661os.f8206
            monitor-enter(r3)
            p000.C0661os.m4277()     // Catch: java.lang.Throwable -> L37
            p000.C0661os.m4275()     // Catch: java.lang.Throwable -> L37
            java.util.LinkedHashMap r4 = p000.C0661os.f8207     // Catch: java.lang.Throwable -> L37
            r4.clear()     // Catch: java.lang.Throwable -> L37
            monitor-exit(r3)
            p000.C0661os.m4282(r0)
            return
        L37:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L3a:
            android.os.Handler r3 = p000.C0661os.f8210
            java.lang.String r3 = "用户点击重启按钮"
            p000.C0661os.m4293(r3)
            p000.C0661os.m4296()
            p000.C0661os.m4296()     // Catch: java.lang.Exception -> La9
            java.lang.ref.WeakReference r3 = p000.C0661os.f8224     // Catch: java.lang.Exception -> La9
            r4 = 0
            if (r3 == 0) goto L53
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Exception -> La9
            android.app.Activity r3 = (android.app.Activity) r3     // Catch: java.lang.Exception -> La9
            goto L54
        L53:
            r3 = r4
        L54:
            if (r3 != 0) goto L5e
            java.lang.String r3 = "restartApp failed, no active activity"
            java.lang.String r0 = "r459ca5a644abf82d"
            p000.C0888ux.m5977(r0, r3, r4)     // Catch: java.lang.Exception -> La9
            goto Lb1
        L5e:
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: java.lang.Exception -> La9
            java.lang.String r2 = r3.getPackageName()     // Catch: java.lang.Exception -> La9
            android.content.Intent r1 = r1.getLaunchIntentForPackage(r2)     // Catch: java.lang.Exception -> La9
            if (r1 != 0) goto L74
            java.lang.String r3 = "restartApp failed, cannot get launch intent"
            java.lang.String r0 = "r459ca5a644abf82d"
            p000.C0888ux.m5977(r0, r3, r4)     // Catch: java.lang.Exception -> La9
            goto Lb1
        L74:
            r4 = 335577088(0x14008000, float:6.487592E-27)
            r1.addFlags(r4)     // Catch: java.lang.Exception -> La9
            java.lang.Object r4 = p000.C0661os.f8206     // Catch: java.lang.Exception -> La9
            monitor-enter(r4)     // Catch: java.lang.Exception -> La9
            p000.C0661os.m4277()     // Catch: java.lang.Throwable -> La6
            p000.C0661os.m4275()     // Catch: java.lang.Throwable -> La6
            java.util.LinkedHashMap r2 = p000.C0661os.f8207     // Catch: java.lang.Throwable -> La6
            r2.clear()     // Catch: java.lang.Throwable -> La6
            monitor-exit(r4)     // Catch: java.lang.Exception -> La9
            p000.C0661os.m4282(r0)     // Catch: java.lang.Exception -> La9
            r3.startActivity(r1)     // Catch: java.lang.Exception -> La9
            r3.finishAffinity()     // Catch: java.lang.Throwable -> L92
        L92:
            android.os.Handler r3 = p000.C0661os.f8210     // Catch: java.lang.Exception -> La9
            s0 r4 = new s0     // Catch: java.lang.Exception -> La9
            r0 = 15
            r4.<init>(r0)     // Catch: java.lang.Exception -> La9
            r0 = 250(0xfa, double:1.235E-321)
            r3.postDelayed(r4, r0)     // Catch: java.lang.Exception -> La9
            java.lang.String r3 = "应用重启请求已发出"
            p000.C0661os.m4293(r3)     // Catch: java.lang.Exception -> La9
            goto Lb1
        La6:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Exception -> La9
            throw r3     // Catch: java.lang.Exception -> La9
        La9:
            r3 = move-exception
            java.lang.String r4 = "restartApp failed"
            java.lang.String r0 = "r459ca5a644abf82d"
            p000.C0888ux.m5977(r0, r4, r3)
        Lb1:
            return
        Lb2:
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.m1365(r4)
            return
        Lb6:
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.m1377(r4)
            return
    }
}
