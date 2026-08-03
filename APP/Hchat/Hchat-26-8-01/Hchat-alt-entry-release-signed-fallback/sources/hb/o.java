package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hb.r f5440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5441i;

    public /* synthetic */ o(hb.r r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.f5439g = r3
            r0.f5440h = r1
            r0.f5441i = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r7 = this;
            int r0 = r7.f5439g
            switch(r0) {
                case 0: goto Lc0;
                default: goto L5;
            }
        L5:
            hb.r r0 = r7.f5440h
            java.lang.Object r1 = r0.f5459f
            hb.q r1 = (hb.q) r1
            r2 = 0
            if (r1 == 0) goto L11
            java.lang.String r3 = r1.f5444a
            goto L12
        L11:
            r3 = r2
        L12:
            java.lang.String r4 = r7.f5441i
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L7d
            java.lang.Object r3 = r0.f5460g
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.f5462i
            hb.o r4 = (hb.o) r4
            if (r4 == 0) goto L2b
            java.lang.Object r5 = r0.f5457d
            android.os.Handler r5 = (android.os.Handler) r5
            r5.removeCallbacks(r4)
        L2b:
            r0.f5462i = r2
            java.lang.String r4 = ""
            r0.f5460g = r4
            tf.t r4 = tf.t.f13167g
            r0.f5461h = r4
            q8.o r4 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r4 == 0) goto L40
            android.app.Activity r4 = r4.a()
            goto L41
        L40:
            r4 = r2
        L41:
            if (r4 == 0) goto L44
            goto L45
        L44:
            r4 = r2
        L45:
            if (r4 == 0) goto L62
            android.content.Intent r5 = r4.getIntent()
            if (r5 == 0) goto L54
            java.lang.String r6 = "hchat_selected_message_send_token"
            java.lang.String r5 = r5.getStringExtra(r6)
            goto L55
        L54:
            r5 = r2
        L55:
            boolean r3 = gg.l.a(r5, r3)
            if (r3 == 0) goto L5c
            goto L5d
        L5c:
            r4 = r2
        L5d:
            if (r4 == 0) goto L62
            r4.finish()
        L62:
            r0.f5459f = r2
            fg.q r2 = r1.f5447d
            if (r2 == 0) goto L79
            int r3 = r1.f5450g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r1 = r1.f5451h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r2.b(r3, r1, r4)
        L79:
            r0.u()
            goto Lbf
        L7d:
            java.lang.Object r0 = r0.f5458e
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
        L88:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lbf
            java.lang.Object r1 = r0.next()
            hb.q r1 = (hb.q) r1
            java.lang.String r2 = r1.f5444a
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L9d
            goto L88
        L9d:
            r0.remove()
            fg.q r0 = r1.f5447d
            if (r0 == 0) goto Lbf
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.ArrayList r3 = r1.f5445b
            int r3 = r3.size()
            java.util.List r1 = r1.f5446c
            int r1 = r1.size()
            int r1 = r1 * r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0.b(r2, r1, r3)
        Lbf:
            return
        Lc0:
            hb.r r0 = r7.f5440h
            java.lang.Object r1 = r0.f5460g
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r7.f5441i
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto Lcf
            goto L118
        Lcf:
            java.lang.Object r1 = r0.f5456c
            ab.b r1 = (ab.b) r1
            java.lang.String r3 = "群发助手等待微信重发完成超时"
            r4 = 0
            r1.invoke(r3, r4)
            q8.o r1 = h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r1 == 0) goto Le4
            android.app.Activity r1 = r1.a()
            goto Le5
        Le4:
            r1 = r4
        Le5:
            if (r1 == 0) goto Le8
            goto Le9
        Le8:
            r1 = r4
        Le9:
            if (r1 == 0) goto L105
            android.content.Intent r3 = r1.getIntent()
            if (r3 == 0) goto Lf8
            java.lang.String r5 = "hchat_selected_message_send_token"
            java.lang.String r3 = r3.getStringExtra(r5)
            goto Lf9
        Lf8:
            r3 = r4
        Lf9:
            boolean r2 = gg.l.a(r3, r2)
            if (r2 == 0) goto L100
            r4 = r1
        L100:
            if (r4 == 0) goto L105
            r4.finish()
        L105:
            java.lang.Object r1 = r0.f5461h
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
            java.lang.Object r2 = r0.f5459f
            hb.q r2 = (hb.q) r2
            if (r2 == 0) goto L118
            r3 = 750(0x2ee, double:3.705E-321)
            r0.a(r2, r1, r3)
        L118:
            return
    }
}
