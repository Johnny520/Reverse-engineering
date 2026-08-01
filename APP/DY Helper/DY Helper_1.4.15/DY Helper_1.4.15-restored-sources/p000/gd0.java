package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gd0 implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4328;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f4329;

    public /* synthetic */ gd0(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f4328 = r1
            r0.f4329 = r2
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r5, int r6) {
            r4 = this;
            int r5 = r4.f4328
            r0 = 0
            java.lang.Object r4 = r4.f4329
            switch(r5) {
                case 0: goto L86;
                case 1: goto L1f;
                case 2: goto L19;
                case 3: goto L13;
                case 4: goto Le;
                default: goto L8;
            }
        L8:
            z61 r4 = (p000.z61) r4
            r4.invoke()
            return
        Le:
            sm1 r4 = (p000.sm1) r4
            r4.f9967 = r6
            return
        L13:
            z71 r4 = (p000.z71) r4
            r4.invoke()
            return
        L19:
            z71 r4 = (p000.z71) r4
            r4.invoke()
            return
        L1f:
            li0 r4 = (p000.li0) r4
            boolean r5 = r4.f6648
            if (r5 != 0) goto L85
            boolean r5 = r4.f6649
            if (r5 == 0) goto L2a
            goto L85
        L2a:
            r5 = 1
            r4.f6649 = r5
            r4.m3573(r5)
            vj0 r6 = p000.vj0.f11310
            java.lang.ClassLoader r6 = r4.f6660
            ji0 r1 = new ji0
            r1.<init>(r4)
            r6.getClass()
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.vj0.f11311
            boolean r5 = r2.compareAndSet(r0, r5)
            if (r5 != 0) goto L46
            r5 = r0
            goto L73
        L46:
            java.util.concurrent.ExecutorService r5 = p000.vj0.f11312     // Catch: java.lang.Throwable -> L53
            ii0 r3 = new ii0     // Catch: java.lang.Throwable -> L53
            r3.<init>(r1, r6)     // Catch: java.lang.Throwable -> L53
            r5.execute(r3)     // Catch: java.lang.Throwable -> L53
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L53
            goto L5a
        L53:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L5a:
            java.lang.Throwable r6 = p000.fo1.m2190(r5)
            if (r6 != 0) goto L61
            goto L6d
        L61:
            r2.set(r0)
            java.lang.String r5 = "r52bdfd08354d522"
            java.lang.String r1 = "互动消息清理任务提交失败"
            p000.C0888ux.m5977(r5, r1, r6)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L6d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
        L73:
            if (r5 != 0) goto L85
            r4.f6649 = r0
            r4.m3573(r0)
            android.app.Activity r4 = r4.f6659
            java.lang.String r5 = "已有互动消息清理任务正在运行"
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r5, r0)
            r4.show()
        L85:
            return
        L86:
            nd0 r4 = (p000.nd0) r4
            be0 r5 = p000.be0.f1670
            monitor-enter(r5)
            r5.m937()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r6 = p000.be0.m929()     // Catch: java.lang.Throwable -> L9c
            int r6 = r6.length()     // Catch: java.lang.Throwable -> L9c
            if (r6 != 0) goto L9e
            yd0 r6 = p000.yd0.f12584     // Catch: java.lang.Throwable -> L9c
            monitor-exit(r5)
            goto Lbc
        L9c:
            r4 = move-exception
            goto Le5
        L9e:
            java.util.List r6 = r5.m943()     // Catch: java.lang.Throwable -> L9c
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L9c
            if (r6 == 0) goto Lac
            yd0 r6 = p000.yd0.f12583     // Catch: java.lang.Throwable -> L9c
            monitor-exit(r5)
            goto Lbc
        Lac:
            jz r6 = p000.C0450jz.f5672     // Catch: java.lang.Throwable -> L9c
            java.lang.String r1 = "clear"
            boolean r6 = r5.m942(r1, r6)     // Catch: java.lang.Throwable -> L9c
            if (r6 == 0) goto Lb9
            yd0 r6 = p000.yd0.f12582     // Catch: java.lang.Throwable -> L9c
            goto Lbb
        Lb9:
            yd0 r6 = p000.yd0.f12586     // Catch: java.lang.Throwable -> L9c
        Lbb:
            monitor-exit(r5)
        Lbc:
            int r5 = r6.ordinal()
            r6 = 3
            if (r5 == r6) goto Ld6
            r6 = 7
            if (r5 == r6) goto Lca
            r4.m4030()
            goto Le4
        Lca:
            android.app.Activity r4 = r4.f7534
            java.lang.String r5 = "隐藏名单保存失败"
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r5, r0)
            r4.show()
            goto Le4
        Ld6:
            r4.m4030()
            android.app.Activity r4 = r4.f7534
            java.lang.String r5 = "已全部恢复"
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r5, r0)
            r4.show()
        Le4:
            return
        Le5:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9c
            throw r4
    }
}
