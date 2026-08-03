package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hb.i0 f5393b;

    public /* synthetic */ h0(hb.i0 r1, int r2) {
            r0 = this;
            r0.f5392a = r2
            r0.f5393b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r4) {
            r3 = this;
            int r0 = r3.f5392a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r4)
            return
        L9:
            r4.getClass()
            hb.i0 r0 = r3.f5393b
            android.content.SharedPreferences r0 = r0.f5403d
            java.lang.String r1 = "selected_messages_enable"
            r2 = 1
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L1a
            goto L42
        L1a:
            java.lang.Object r0 = r4.thisObject
            java.util.List r0 = k8.b.b(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L27
            goto L42
        L27:
            java.lang.Object[] r4 = r4.args
            if (r4 == 0) goto L42
            r0 = 0
            java.lang.Object r4 = tf.l.C0(r0, r4)
            if (r4 == 0) goto L42
            r0 = 1212371789(0x4843534d, float:200013.2)
            java.lang.String r1 = "群发助手[H]"
            hb.i0.a(r4, r1, r0)
            r0 = 1212371796(0x48435354, float:200013.31)
            java.lang.String r1 = "定时转发[H]"
            hb.i0.a(r4, r1, r0)
        L42:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r9) {
            r8 = this;
            int r0 = r8.f5392a
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.beforeHookedMethod(r9)
            return
        L9:
            r9.getClass()
            java.lang.Object r0 = r9.thisObject
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L16
            android.app.Activity r0 = (android.app.Activity) r0
            goto L17
        L16:
            r0 = r2
        L17:
            if (r0 == 0) goto L8d
            hb.i0 r1 = r8.f5393b
            hb.r r1 = r1.f5406g
            r1.getClass()
            android.content.Intent r3 = r0.getIntent()
            if (r3 == 0) goto L2d
            java.lang.String r4 = "hchat_selected_message_send_token"
            java.lang.String r3 = r3.getStringExtra(r4)
            goto L2e
        L2d:
            r3 = r2
        L2e:
            if (r3 != 0) goto L32
            java.lang.String r3 = ""
        L32:
            boolean r4 = og.m.t0(r3)
            if (r4 != 0) goto L8d
            java.lang.Object r4 = r1.f5460g
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L43
            goto L8d
        L43:
            java.lang.Object r3 = r1.f5459f
            hb.q r3 = (hb.q) r3
            if (r3 == 0) goto L8d
            java.lang.Object r4 = r1.f5462i
            hb.o r4 = (hb.o) r4
            if (r4 == 0) goto L56
            java.lang.Object r5 = r1.f5457d
            android.os.Handler r5 = (android.os.Handler) r5
            r5.removeCallbacks(r4)
        L56:
            r1.f5462i = r2
            java.lang.Object r4 = r1.f5461h
            java.util.List r4 = (java.util.List) r4
            int r5 = r3.f5450g
            int r6 = r4.size()
            int r6 = r6 + r5
            r3.f5450g = r6
            int r5 = r4.size()
            r6 = 750(0x2ee, double:3.705E-321)
            r1.a(r3, r5, r6)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
            java.lang.String r4 = "SendMsgUsernames"
            r1.putStringArrayListExtra(r4, r3)
            java.lang.String r3 = "sendResult"
            r4 = 0
            r1.putExtra(r3, r4)
            r3 = -1
            r0.setResult(r3, r1)
            r0.finish()
            r9.setResult(r2)
        L8d:
            return
    }
}
