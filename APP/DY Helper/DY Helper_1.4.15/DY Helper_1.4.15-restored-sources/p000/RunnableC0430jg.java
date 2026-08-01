package p000;

/* JADX INFO: renamed from: jg */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0430jg implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5455;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ boolean f5456;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f5457;

    public /* synthetic */ RunnableC0430jg(java.lang.Object r1, boolean r2, int r3) {
            r0 = this;
            r0.f5455 = r3
            r0.f5457 = r1
            r0.f5456 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ RunnableC0430jg(java.lang.String r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.f5455 = r0
            r1.<init>()
            r1.f5456 = r3
            r1.f5457 = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r13 = this;
            int r0 = r13.f5455
            r1 = 0
            switch(r0) {
                case 0: goto Lc0;
                case 1: goto Lab;
                case 2: goto L81;
                case 3: goto L77;
                case 4: goto L67;
                default: goto L6;
            }
        L6:
            java.lang.Object r0 = r13.f5457
            r2 = r0
            vv1 r2 = (p000.vv1) r2
            boolean r13 = r13.f5456
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f11432
            boolean r0 = r0.get()
            if (r0 == 0) goto L16
            goto L66
        L16:
            if (r13 == 0) goto L46
            nt r13 = r2.f11427
            r13.invoke()     // Catch: java.lang.Throwable -> L20
            s62 r13 = p000.s62.f9751     // Catch: java.lang.Throwable -> L20
            goto L28
        L20:
            r0 = move-exception
            r13 = r0
            eo1 r0 = new eo1
            r0.<init>(r13)
            r13 = r0
        L28:
            java.lang.Throwable r13 = p000.fo1.m2190(r13)
            if (r13 == 0) goto L35
            java.lang.String r0 = "DYHelper"
            java.lang.String r3 = "分享快捷按钮保存后刷新摘要失败"
            p000.C0888ux.m5977(r0, r3, r13)
        L35:
            android.app.Activity r13 = r2.f11426
            java.lang.String r0 = "分享面板快捷按钮已保存"
            android.widget.Toast r13 = android.widget.Toast.makeText(r13, r0, r1)
            r13.show()
            android.app.AlertDialog r13 = r2.f11444
            r13.dismiss()
            goto L66
        L46:
            java.util.concurrent.atomic.AtomicBoolean r13 = r2.f11433
            r13.set(r1)
            r2.m6279(r1)
            java.lang.Object r13 = p000.ui1.f10844
            long r3 = p000.ui1.f10851
            long r5 = r2.f11431
            int r13 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r13 == 0) goto L5b
            java.lang.String r13 = "账号配置已切换，请重新打开"
            goto L5d
        L5b:
            java.lang.String r13 = "配置写入失败，请重试"
        L5d:
            android.app.Activity r0 = r2.f11426
            android.widget.Toast r13 = android.widget.Toast.makeText(r0, r13, r1)
            r13.show()
        L66:
            return
        L67:
            java.lang.Object r0 = r13.f5457
            android.widget.Switch r0 = (android.widget.Switch) r0
            boolean r13 = r13.f5456
            boolean r1 = r0.isChecked()
            if (r1 == r13) goto L76
            r0.setChecked(r13)
        L76:
            return
        L77:
            java.lang.Object r0 = r13.f5457
            gt0 r0 = (p000.gt0) r0
            boolean r13 = r13.f5456
            r0.m2323(r13)
            return
        L81:
            java.lang.Object r0 = r13.f5457
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            boolean r13 = r13.f5456
            zj0 r1 = p000.zj0.f13118
            p000.zj0.m7136(r0, r13)     // Catch: java.lang.Throwable -> L8f
            s62 r13 = p000.s62.f9751     // Catch: java.lang.Throwable -> L8f
            goto L97
        L8f:
            r0 = move-exception
            r13 = r0
            eo1 r0 = new eo1
            r0.<init>(r13)
            r13 = r0
        L97:
            java.lang.Throwable r13 = p000.fo1.m2190(r13)
            if (r13 == 0) goto Laa
            java.lang.Throwable r13 = p000.zj0.m7138(r13)
            java.lang.String r13 = r13.getMessage()
            java.lang.String r0 = "DYHelperIMMarkAllReadHelper: 同步消息底栏未读显示失败: "
            p000.AbstractC0602nx.m4142(r0, r13)
        Laa:
            return
        Lab:
            java.lang.Object r0 = r13.f5457
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r13 = r13.f5456
            if (r13 == 0) goto Lb6
            java.lang.String r13 = "已开启清爽模式"
            goto Lb8
        Lb6:
            java.lang.String r13 = "已关闭清爽模式"
        Lb8:
            android.widget.Toast r13 = android.widget.Toast.makeText(r0, r13, r1)
            r13.show()
            return
        Lc0:
            boolean r0 = r13.f5456
            java.lang.Object r13 = r13.f5457
            r5 = r13
            java.lang.String r5 = (java.lang.String) r5
            tg r13 = p000.AbstractC0871ug.f10771
            java.lang.String r13 = "rf9ef3362bd85f5b5"
            if (r0 == 0) goto Lef
            a r2 = p000.AbstractC0871ug.f10782
            java.lang.Object r2 = r2.f1
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            if (r2 == 0) goto Ldb
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto Lef
        Ldb:
            java.lang.String r0 = "playback activity is paused: "
            java.lang.String r0 = r0.concat(r5)
            p000.C0834tg.m5654(r0)
            java.lang.String r0 = "r51633675832303e9"
            java.lang.String r0 = r0.concat(r5)
            p000.C0888ux.m5975(r13, r0)
            goto L1ae
        Lef:
            pq r2 = p000.C0696pq.f8651
            kq r2 = p000.C0696pq.m4567()
            r8 = 0
            if (r2 == 0) goto L102
            mq r2 = r2.f6079
            long r2 = r2.f7247
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6 = r2
            goto L103
        L102:
            r6 = r8
        L103:
            r2 = 1
            if (r0 == 0) goto L131
            long r3 = p000.AbstractC0871ug.f10753
            java.lang.Long r7 = p000.AbstractC0871ug.f10754
            long r9 = android.os.SystemClock.uptimeMillis()
            long r9 = r9 - r3
            r11 = -9223372036854775808
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r3 == 0) goto L12b
            r3 = 0
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 > 0) goto L12b
            r3 = 901(0x385, double:4.45E-321)
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 >= 0) goto L12b
            if (r7 == 0) goto L12b
            boolean r3 = r7.equals(r6)
            if (r3 == 0) goto L12b
            r3 = r2
            goto L12c
        L12b:
            r3 = r1
        L12c:
            p000.C0834tg.m5656()
            r7 = r3
            goto L135
        L131:
            p000.C0834tg.m5656()
            r7 = r1
        L135:
            rf r9 = p000.AbstractC0871ug.f10781
            r9.getClass()
            r3 = 1
            if (r0 != 0) goto L14b
            long r6 = r9.f9358
            long r6 = r6 + r3
            r9.f9358 = r6
            r9.f9359 = r8
            mh r0 = new mh
            r0.<init>(r8, r2)
            goto L16a
        L14b:
            java.lang.Object r0 = r9.f9359
            lh r0 = (p000.C0512lh) r0
            if (r0 == 0) goto L158
            mh r0 = new mh
            r2 = 3
            r0.<init>(r8, r2)
            goto L16a
        L158:
            lh r2 = new lh
            long r10 = r9.f9358
            long r3 = r3 + r10
            r9.f9358 = r3
            r2.<init>(r3, r5, r6, r7)
            r9.f9359 = r2
            mh r0 = new mh
            r3 = 2
            r0.<init>(r2, r3)
        L16a:
            boolean r2 = r0.f7131
            if (r2 == 0) goto L185
            ν r13 = p000.AbstractC0871ug.f10767
            if (r13 == 0) goto L177
            android.os.Handler r0 = p000.AbstractC0871ug.f10780
            r0.removeCallbacks(r13)
        L177:
            p000.AbstractC0871ug.f10767 = r8
            java.lang.String r13 = "raw playing: "
            java.lang.String r13 = r13.concat(r5)
            r0 = 12
            p000.C0834tg.m5657(r1, r13, r1, r0)
            goto L1ae
        L185:
            lh r0 = r0.f7130
            if (r0 != 0) goto L18a
            goto L1ae
        L18a:
            boolean r1 = p000.AbstractC0871ug.f10788
            if (r1 == 0) goto L19f
            boolean r1 = r0.f6634
            if (r1 != 0) goto L19f
            boolean r1 = p000.AbstractC0871ug.f10794
            if (r1 != 0) goto L19f
            java.lang.String r1 = "r675c7fc6ba263ef1"
            java.lang.String r1 = r1.concat(r5)
            p000.C0888ux.m5975(r13, r1)
        L19f:
            ν r13 = new ν
            r1 = 4
            r13.<init>(r1, r0)
            p000.AbstractC0871ug.f10767 = r13
            android.os.Handler r0 = p000.AbstractC0871ug.f10780
            r1 = 250(0xfa, double:1.235E-321)
            r0.postDelayed(r13, r1)
        L1ae:
            return
    }
}
