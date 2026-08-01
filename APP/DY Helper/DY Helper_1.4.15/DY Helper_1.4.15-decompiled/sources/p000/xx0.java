package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xx0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12374;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f12375;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.String f12376;

    public /* synthetic */ xx0(android.app.Activity r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.f12374 = r3
            r0.f12375 = r1
            r0.f12376 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ xx0(java.lang.String r1, android.app.Activity r2, int r3) {
            r0 = this;
            r0.f12374 = r3
            r0.f12376 = r1
            r0.f12375 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            int r0 = r7.f12374
            java.lang.String r1 = "DYHelper"
            java.lang.String r2 = "clipboard"
            java.lang.String r3 = "确定"
            r4 = 0
            r5 = 0
            android.app.Activity r6 = r7.f12375
            java.lang.String r7 = r7.f12376
            switch(r0) {
                case 0: goto L16c;
                case 1: goto L158;
                case 2: goto L10b;
                case 3: goto Lf3;
                case 4: goto Ldf;
                case 5: goto Lcb;
                case 6: goto Lc5;
                case 7: goto Lb1;
                case 8: goto L9d;
                case 9: goto L89;
                case 10: goto L69;
                case 11: goto L61;
                case 12: goto L58;
                case 13: goto L50;
                case 14: goto L39;
                default: goto L11;
            }
        L11:
            android.os.Handler r0 = com.example.dyhelper.p002ui.C0182.f2694
            java.util.LinkedHashMap r0 = com.example.dyhelper.p002ui.C0182.f2698
            java.lang.Object r0 = r0.remove(r7)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L22
            android.os.Handler r1 = com.example.dyhelper.p002ui.C0182.f2694
            r1.removeCallbacks(r0)
        L22:
            java.util.LinkedHashMap r0 = com.example.dyhelper.p002ui.C0182.f2697
            r0.remove(r7)
            java.util.LinkedHashSet r1 = com.example.dyhelper.p002ui.C0182.f2699
            r1.remove(r7)
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L35
            r1.clear()
        L35:
            com.example.dyhelper.p002ui.C0182.m1596(r6, r5)
            return
        L39:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r6)
            java.lang.String r1 = "续期结果"
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            android.app.AlertDialog$Builder r7 = r0.setMessage(r7)
            android.app.AlertDialog$Builder r7 = r7.setPositiveButton(r3, r4)
            r7.show()
            return
        L50:
            android.widget.Toast r7 = android.widget.Toast.makeText(r6, r7, r5)
            r7.show()
            return
        L58:
            r0 = 1
            android.widget.Toast r7 = android.widget.Toast.makeText(r6, r7, r0)
            r7.show()
            return
        L61:
            android.widget.Toast r7 = android.widget.Toast.makeText(r6, r7, r5)
            r7.show()
            return
        L69:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.wg1.f11716
            boolean r0 = r6.isFinishing()
            if (r0 == 0) goto L72
            goto L88
        L72:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r6)
            java.lang.String r1 = "文本发送测试"
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            android.app.AlertDialog$Builder r7 = r0.setMessage(r7)
            android.app.AlertDialog$Builder r7 = r7.setPositiveButton(r3, r4)
            r7.show()
        L88:
            return
        L89:
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto L9c
            boolean r0 = r6.isDestroyed()
            if (r0 != 0) goto L9c
            android.widget.Toast r7 = android.widget.Toast.makeText(r6, r7, r5)
            r7.show()
        L9c:
            return
        L9d:
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto Lb0
            boolean r0 = r6.isDestroyed()
            if (r0 != 0) goto Lb0
            android.widget.Toast r7 = android.widget.Toast.makeText(r6, r7, r5)
            r7.show()
        Lb0:
            return
        Lb1:
            boolean r0 = r6.isFinishing()
            if (r0 != 0) goto Lc4
            boolean r0 = r6.isDestroyed()
            if (r0 != 0) goto Lc4
            android.widget.Toast r7 = android.widget.Toast.makeText(r6, r7, r5)
            r7.show()
        Lc4:
            return
        Lc5:
            q71 r0 = p000.q71.f8896
            p000.q71.m4797(r6, r7)
            return
        Lcb:
            qy0 r0 = p000.qy0.f9157
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "视频已保存: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            p000.qy0.m4991(r6, r7)
            return
        Ldf:
            qy0 r0 = p000.qy0.f9157
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "音频已保存: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            p000.qy0.m4991(r6, r7)
            return
        Lf3:
            java.lang.Object r0 = r6.getSystemService(r2)
            r0.getClass()
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
            android.content.ClipData r7 = android.content.ClipData.newPlainText(r1, r7)
            r0.setPrimaryClip(r7)
            qy0 r7 = p000.qy0.f9157
            java.lang.String r7 = "链接已复制"
            p000.qy0.m4991(r6, r7)
            return
        L10b:
            qy0 r0 = p000.qy0.f9157
            if (r7 != 0) goto L115
            java.lang.String r7 = "未找到可复制的下载直链"
            p000.qy0.m4991(r6, r7)
            goto L157
        L115:
            java.lang.Object r0 = r6.getSystemService(r2)
            boolean r2 = r0 instanceof android.content.ClipboardManager
            if (r2 == 0) goto L120
            r4 = r0
            android.content.ClipboardManager r4 = (android.content.ClipboardManager) r4
        L120:
            if (r4 != 0) goto L128
            java.lang.String r7 = "复制失败：剪贴板不可用"
            p000.qy0.m4991(r6, r7)
            goto L157
        L128:
            java.lang.String r0 = "DYHelper下载直链"
            android.content.ClipData r7 = android.content.ClipData.newPlainText(r0, r7)     // Catch: java.lang.Throwable -> L134
            r4.setPrimaryClip(r7)     // Catch: java.lang.Throwable -> L134
            s62 r7 = p000.s62.f9751     // Catch: java.lang.Throwable -> L134
            goto L13b
        L134:
            r7 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r7)
            r7 = r0
        L13b:
            boolean r0 = r7 instanceof p000.eo1
            if (r0 != 0) goto L147
            r0 = r7
            s62 r0 = (p000.s62) r0
            java.lang.String r0 = "下载直链已复制"
            p000.qy0.m4991(r6, r0)
        L147:
            java.lang.Throwable r7 = p000.fo1.m2190(r7)
            if (r7 == 0) goto L157
            java.lang.String r0 = "复制作品下载直链失败"
            p000.C0888ux.m5977(r1, r0, r7)
            java.lang.String r7 = "复制下载直链失败"
            p000.qy0.m4991(r6, r7)
        L157:
            return
        L158:
            qy0 r0 = p000.qy0.f9157
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "表情已保存: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            p000.qy0.m4991(r6, r7)
            return
        L16c:
            qy0 r0 = p000.qy0.f9157
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "原画质视频已保存: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            p000.qy0.m4991(r6, r7)
            return
    }
}
