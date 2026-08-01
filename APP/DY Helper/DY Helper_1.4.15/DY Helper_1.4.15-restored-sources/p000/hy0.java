package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hy0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4840;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f4841;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ boolean f4842;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f4843;

    public /* synthetic */ hy0(android.app.Activity r2, boolean r3, java.lang.Throwable r4) {
            r1 = this;
            r0 = 1
            r1.f4840 = r0
            r1.<init>()
            r1.f4841 = r2
            r1.f4842 = r3
            r1.f4843 = r4
            return
    }

    public /* synthetic */ hy0(android.view.View r2, java.lang.String r3, boolean r4) {
            r1 = this;
            r0 = 3
            r1.f4840 = r0
            r1.<init>()
            r1.f4843 = r2
            r1.f4841 = r3
            r1.f4842 = r4
            return
    }

    public /* synthetic */ hy0(boolean r2, android.app.Activity r3, p000.C0673p3 r4) {
            r1 = this;
            r0 = 2
            r1.f4840 = r0
            r1.<init>()
            r1.f4842 = r2
            r1.f4841 = r3
            r1.f4843 = r4
            return
    }

    public /* synthetic */ hy0(boolean r2, java.util.ArrayList r3, android.app.Activity r4) {
            r1 = this;
            r0 = 0
            r1.f4840 = r0
            r1.<init>()
            r1.f4842 = r2
            r1.f4843 = r3
            r1.f4841 = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r6 = this;
            int r0 = r6.f4840
            r1 = 1
            boolean r2 = r6.f4842
            java.lang.Object r3 = r6.f4841
            java.lang.Object r6 = r6.f4843
            switch(r0) {
                case 0: goto L73;
                case 1: goto L46;
                case 2: goto L16;
                default: goto Lc;
            }
        Lc:
            android.view.View r6 = (android.view.View) r6
            java.lang.String r3 = (java.lang.String) r3
            dk1 r0 = p000.dk1.f3201
            p000.dk1.m1757(r6, r3, r2)
            return
        L16:
            android.app.Activity r3 = (android.app.Activity) r3
            p3 r6 = (p000.C0673p3) r6
            if (r2 == 0) goto L30
            boolean r0 = r3.isFinishing()
            if (r0 != 0) goto L30
            boolean r0 = r3.isDestroyed()
            if (r0 != 0) goto L30
            q71 r0 = p000.q71.f8896
            r0 = 12
            p000.q71.m4782(r3, r0, r6)
            goto L45
        L30:
            boolean r6 = r3.isFinishing()
            if (r6 != 0) goto L45
            boolean r6 = r3.isDestroyed()
            if (r6 != 0) goto L45
            java.lang.String r6 = "未获得目录写入授权"
            android.widget.Toast r6 = android.widget.Toast.makeText(r3, r6, r1)
            r6.show()
        L45:
            return
        L46:
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r3)
            if (r2 == 0) goto L54
            java.lang.String r1 = "动图合并失败"
            goto L56
        L54:
            java.lang.String r1 = "动图下载失败"
        L56:
            android.app.AlertDialog$Builder r0 = r0.setTitle(r1)
            java.lang.String r1 = r6.getMessage()
            if (r1 != 0) goto L64
            java.lang.String r1 = r6.toString()
        L64:
            android.app.AlertDialog$Builder r6 = r0.setMessage(r1)
            java.lang.String r0 = "确定"
            r1 = 0
            android.app.AlertDialog$Builder r6 = r6.setPositiveButton(r0, r1)
            r6.show()
            return
        L73:
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            android.app.Activity r3 = (android.app.Activity) r3
            qy0 r0 = p000.qy0.f9157
            java.lang.String r0 = " 个文件"
            if (r2 == 0) goto Lc9
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L84
            goto Lb5
        L84:
            java.util.Iterator r2 = r6.iterator()
        L88:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Lb5
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "_fallback"
            boolean r4 = p000.q02.m4654(r4, r5, r1)
            if (r4 == 0) goto L88
            int r6 = r6.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "部分动图合并失败，已降级保存原始资源: "
            r1.<init>(r2)
            r1.append(r6)
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            p000.qy0.m4991(r3, r6)
            goto Le1
        Lb5:
            java.lang.Object r6 = p000.AbstractC0984xh.m6640(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto Lbf
            java.lang.String r6 = "完成"
        Lbf:
            java.lang.String r0 = "动图已合并保存: "
            java.lang.String r6 = r0.concat(r6)
            p000.qy0.m4991(r3, r6)
            goto Le1
        Lc9:
            int r6 = r6.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "动图已保存: "
            r1.<init>(r2)
            r1.append(r6)
            r1.append(r0)
            java.lang.String r6 = r1.toString()
            p000.qy0.m4991(r3, r6)
        Le1:
            return
    }
}
