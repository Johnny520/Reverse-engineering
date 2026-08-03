package a;

/* JADX INFO: renamed from: a.ha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0176ha implements a.D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f497a;
    public final /* synthetic */ a.C0213jc b;
    public final /* synthetic */ a.C0354ra c;

    public /* synthetic */ C0176ha(a.C0213jc r1, a.C0354ra r2, int r3) {
            r0 = this;
            r0.f497a = r3
            r0.b = r1
            r0.c = r2
            r0.<init>()
            return
    }

    public /* synthetic */ C0176ha(a.C0354ra r2, a.C0213jc r3) {
            r1 = this;
            r0 = 14
            r1.f497a = r0
            r1.<init>()
            r1.c = r2
            r1.b = r3
            return
    }

    @Override // a.D7
    public final java.lang.Object f(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f497a
            switch(r0) {
                case 0: goto L34a;
                case 1: goto L335;
                case 2: goto L31c;
                case 3: goto L303;
                case 4: goto L2ea;
                case 5: goto L2d1;
                case 6: goto L2bc;
                case 7: goto L29a;
                case 8: goto L277;
                case 9: goto L262;
                case 10: goto L23f;
                case 11: goto L22a;
                case 12: goto L215;
                case 13: goto L200;
                case 14: goto L1c0;
                case 15: goto L183;
                case 16: goto L16e;
                case 17: goto L152;
                case 18: goto L13d;
                case 19: goto L128;
                case 20: goto L113;
                case 21: goto Lad;
                case 22: goto L98;
                case 23: goto L83;
                case 24: goto L6e;
                case 25: goto L59;
                case 26: goto L44;
                case 27: goto L2f;
                case 28: goto L1a;
                default: goto L5;
            }
        L5:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            a.jc r0 = r5.b
            r0.z = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L1a:
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            a.jc r0 = r5.b
            r0.I = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L2f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            a.jc r0 = r5.b
            r0.H = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L44:
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            a.jc r0 = r5.b
            r0.G = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L59:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            a.jc r0 = r5.b
            r0.F = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L6e:
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            a.jc r0 = r5.b
            r0.K = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L83:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            a.jc r0 = r5.b
            r0.J = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L98:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            a.jc r0 = r5.b
            r0.D = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        Lad:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            a.jc r0 = r5.b
            r0.M = r6
            a.ra r1 = r5.c
            r1.getClass()
            a.C0354ra.i(r0)
            if (r6 == 0) goto L110
            a.K3$a r6 = a.K3.f148a
            r6.getClass()
            r6 = 0
            android.content.SharedPreferences r0 = a.K3.a.j()     // Catch: java.lang.Throwable -> Ld2
            java.lang.String r2 = a.K3.f     // Catch: java.lang.Throwable -> Ld2
            boolean r0 = r0.getBoolean(r2, r6)     // Catch: java.lang.Throwable -> Ld2
            goto Ld3
        Ld2:
            r0 = r6
        Ld3:
            if (r0 != 0) goto L110
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            android.app.Activity r2 = r1.f669a
            r0.<init>(r2)
            java.lang.String r2 = "屏蔽微信热更新"
            android.app.AlertDialog$Builder r0 = r0.setTitle(r2)
            java.lang.String r2 = "开启后微信热补丁将被拦截：\n\n• 代价：无法通过热补丁自修复\n• 收益：隐私Hook长期稳定"
            android.app.AlertDialog$Builder r0 = r0.setMessage(r2)
            a.g0 r2 = new a.g0
            r3 = 1
            r2.<init>(r3)
            java.lang.String r3 = "我已知晓"
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r3, r2)
            a.pa r2 = new a.pa
            r3 = 6
            r2.<init>(r1, r3)
            java.lang.String r3 = "关闭此功能"
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r3, r2)
            android.app.AlertDialog$Builder r6 = r0.setCancelable(r6)
            android.app.AlertDialog r6 = r6.create()
            if (r6 == 0) goto L110
            r6.show()
            r1.o(r6)
        L110:
            a.Wf r6 = a.Wf.f330a
            return r6
        L113:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            a.jc r0 = r5.b
            r0.r = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L128:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            a.jc r0 = r5.b
            r0.f532a = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L13d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            a.jc r0 = r5.b
            r0.p = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L152:
            a.jc r0 = r5.b
            a.ra r1 = r5.c
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0.o = r6
            r1.getClass()
            a.C0354ra.i(r0)
            a.h8 r6 = a.C0174h8.l
            if (r6 == 0) goto L16b
            r6.j()
        L16b:
            a.Wf r6 = a.Wf.f330a
            return r6
        L16e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            a.jc r0 = r5.b
            r0.n = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L183:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            a.jc r0 = r5.b
            r0.q = r6
            a.ra r1 = r5.c
            r1.getClass()
            a.C0354ra.i(r0)
            a.s4 r0 = a.C0366s4.I
            if (r0 == 0) goto L1bd
            a.Me r1 = r0.C
            java.lang.Object r1 = r1.a()
            android.os.Handler r1 = (android.os.Handler) r1
            a.n4 r2 = new a.n4
            r2.<init>(r6)
            r1.post(r2)
            android.os.Handler r6 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r6.<init>(r1)
            a.j4 r1 = new a.j4
            r2 = 2
            r1.<init>(r0, r2)
            r2 = 300(0x12c, double:1.48E-321)
            r6.postDelayed(r1, r2)
        L1bd:
            a.Wf r6 = a.Wf.f330a
            return r6
        L1c0:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            a.ra r0 = r5.c
            boolean r1 = r0.i
            if (r1 != 0) goto L1fd
            a.jc r1 = r5.b
            r1.t = r6
            a.C0354ra.i(r1)
            android.widget.Switch r6 = r0.h
            if (r6 != 0) goto L1d8
            goto L1fd
        L1d8:
            a.K3$a r1 = a.K3.f148a
            r1.getClass()
            a.jc r1 = a.K3.a.i()
            boolean r1 = r1.t
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1ef
            boolean r1 = a.C0460x8.a()
            if (r1 != 0) goto L1ef
            r1 = r3
            goto L1f0
        L1ef:
            r1 = r2
        L1f0:
            boolean r4 = r6.isChecked()
            if (r4 == r1) goto L1fd
            r0.i = r3
            r6.setChecked(r1)
            r0.i = r2
        L1fd:
            a.Wf r6 = a.Wf.f330a
            return r6
        L200:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            a.jc r0 = r5.b
            r0.s = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L215:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            a.jc r0 = r5.b
            r0.O = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L22a:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            a.jc r0 = r5.b
            r0.N = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L23f:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "it"
            a.C0193i9.e(r6, r0)
            java.lang.Integer r6 = a.C0502ze.C(r6)
            if (r6 == 0) goto L251
            int r6 = r6.intValue()
            goto L253
        L251:
            r6 = 800(0x320, float:1.121E-42)
        L253:
            a.jc r0 = r5.b
            r0.y = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L262:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            a.jc r0 = r5.b
            r0.x = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L277:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "it"
            a.C0193i9.e(r6, r0)
            java.lang.Integer r6 = a.C0502ze.C(r6)
            if (r6 == 0) goto L289
            int r6 = r6.intValue()
            goto L28b
        L289:
            r6 = 500(0x1f4, float:7.0E-43)
        L28b:
            a.jc r0 = r5.b
            r0.w = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L29a:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "it"
            a.C0193i9.e(r6, r0)
            java.lang.Integer r6 = a.C0502ze.C(r6)
            if (r6 == 0) goto L2ac
            int r6 = r6.intValue()
            goto L2ad
        L2ac:
            r6 = 3
        L2ad:
            a.jc r0 = r5.b
            r0.v = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L2bc:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            a.jc r0 = r5.b
            r0.u = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L2d1:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "it"
            a.C0193i9.e(r6, r0)
            a.jc r0 = r5.b
            r0.getClass()
            r0.V = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L2ea:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "it"
            a.C0193i9.e(r6, r0)
            a.jc r0 = r5.b
            r0.getClass()
            r0.U = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L303:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "it"
            a.C0193i9.e(r6, r0)
            a.jc r0 = r5.b
            r0.getClass()
            r0.T = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L31c:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "it"
            a.C0193i9.e(r6, r0)
            a.jc r0 = r5.b
            r0.getClass()
            r0.S = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L335:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            a.jc r0 = r5.b
            r0.R = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
        L34a:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            a.jc r0 = r5.b
            r0.L = r6
            a.ra r6 = r5.c
            r6.getClass()
            a.C0354ra.i(r0)
            a.Wf r6 = a.Wf.f330a
            return r6
    }
}
