package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xg0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f12163;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ boolean f12164;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f12165;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.io.Serializable f12166;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f12167;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ java.lang.Object f12168;

    public /* synthetic */ xg0(android.app.Activity r2, java.lang.String r3, boolean r4, p000.ky1 r5, p000.a80 r6) {
            r1 = this;
            r0 = 2
            r1.f12163 = r0
            r1.<init>()
            r1.f12165 = r2
            r1.f12166 = r3
            r1.f12164 = r4
            r1.f12167 = r5
            r1.f12168 = r6
            return
    }

    public /* synthetic */ xg0(android.view.View r1, java.lang.String r2, java.lang.Object r3, java.lang.String r4, boolean r5, boolean r6) {
            r0 = this;
            r6 = 0
            r0.f12163 = r6
            r0.<init>()
            r0.f12165 = r1
            r0.f12166 = r2
            r0.f12168 = r3
            r0.f12167 = r4
            r0.f12164 = r5
            return
    }

    public /* synthetic */ xg0(p000.um1 r2, p000.um1 r3, android.app.Activity r4, java.util.List r5, boolean r6) {
            r1 = this;
            r0 = 1
            r1.f12163 = r0
            r1.<init>()
            r1.f12165 = r2
            r1.f12166 = r3
            r1.f12167 = r4
            r1.f12168 = r5
            r1.f12164 = r6
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            int r0 = r7.f12163
            r1 = 0
            java.lang.String r2 = "DYHelper"
            java.lang.Object r3 = r7.f12168
            java.lang.Object r4 = r7.f12167
            boolean r5 = r7.f12164
            java.io.Serializable r6 = r7.f12166
            java.lang.Object r7 = r7.f12165
            switch(r0) {
                case 0: goto L75;
                case 1: goto L35;
                default: goto L12;
            }
        L12:
            android.app.Activity r7 = (android.app.Activity) r7
            java.lang.String r6 = (java.lang.String) r6
            ky1 r4 = (p000.ky1) r4
            a80 r3 = (p000.a80) r3
            java.lang.Object r0 = p000.pf1.f8541     // Catch: java.lang.Throwable -> L20
            p000.pf1.m4520(r7, r6, r5, r4, r3)     // Catch: java.lang.Throwable -> L20
            goto L34
        L20:
            r0 = move-exception
            java.lang.String r1 = "打开食物选择弹窗失败"
            p000.C0888ux.m5977(r2, r1, r0)
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L2e
            java.lang.String r0 = ""
        L2e:
            java.lang.String r1 = "打开食物选择弹窗失败: "
            r2 = 1
            p000.a12.m21(r2, r7, r1, r0)
        L34:
            return
        L35:
            um1 r7 = (p000.um1) r7
            um1 r6 = (p000.um1) r6
            android.app.Activity r4 = (android.app.Activity) r4
            java.util.List r3 = (java.util.List) r3
            q71 r0 = p000.q71.f8896
            f8 r0 = p000.q71.m4773()     // Catch: java.lang.Throwable -> L48
            java.util.ArrayList r0 = p000.q71.m4786(r0, r3, r5, r4)     // Catch: java.lang.Throwable -> L48
            goto L4f
        L48:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L4f:
            java.lang.Throwable r3 = p000.fo1.m2190(r0)
            if (r3 == 0) goto L5a
            java.lang.String r4 = "刷新操作面板书签状态失败"
            p000.C0888ux.m5977(r2, r4, r3)
        L5a:
            java.lang.Object r2 = r7.f10912
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L61
            r0 = r2
        L61:
            r7.f10912 = r0
            java.lang.Object r7 = r6.f10912
            if (r7 == 0) goto L6f
            a80 r7 = (p000.a80) r7
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r7.invoke(r0)
            return
        L6f:
            java.lang.String r7 = "renderUi"
            p000.ln0.m3650(r7)
            throw r1
        L75:
            android.view.View r7 = (android.view.View) r7
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r4 = (java.lang.String) r4
            r0 = 2117337100(0x7e34000c, float:5.981532E37)
            r7.setTag(r0, r1)
            r0 = 2117337090(0x7e340002, float:5.981527E37)
            java.lang.Object r0 = r7.getTag(r0)
            boolean r0 = p000.ln0.m3626(r0, r6)
            if (r0 == 0) goto L99
            boolean r0 = r7.isAttachedToWindow()
            if (r0 == 0) goto L99
            android.os.Handler r0 = p000.ah0.f229
            p000.ah0.m164(r7, r3, r4, r5, r6)
        L99:
            return
    }
}
