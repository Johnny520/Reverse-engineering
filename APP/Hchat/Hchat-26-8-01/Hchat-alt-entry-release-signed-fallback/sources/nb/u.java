package nb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f9310b;

    public /* synthetic */ u(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f9309a = r2
            r0.f9310b = r1
            r0.<init>()
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r5, android.content.Intent r6) {
            r4 = this;
            int r5 = r4.f9309a
            switch(r5) {
                case 0: goto L37;
                default: goto L5;
            }
        L5:
            if (r6 == 0) goto Lc
            java.lang.String r5 = r6.getAction()
            goto Ld
        Lc:
            r5 = 0
        Ld:
            java.lang.String r0 = "h.Hchat.action.EXACT_TASK"
            boolean r5 = gg.l.a(r5, r0)
            if (r5 != 0) goto L16
            goto L36
        L16:
            java.lang.String r5 = "h.Hchat.extra.EXACT_TASK_KEY"
            java.lang.String r5 = r6.getStringExtra(r5)
            if (r5 != 0) goto L20
            java.lang.String r5 = ""
        L20:
            int r0 = r5.length()
            if (r0 != 0) goto L27
            goto L36
        L27:
            java.lang.Object r0 = r4.f9310b
            o8.j r0 = (o8.j) r0
            java.lang.String r1 = "h.Hchat.extra.EXACT_TASK_TOKEN"
            r2 = -9223372036854775808
            long r1 = r6.getLongExtra(r1, r2)
            r0.b(r1, r5)
        L36:
            return
        L37:
            java.lang.Object r5 = r4.f9310b
            nb.w r5 = (nb.w) r5
            r0 = 0
            if (r6 == 0) goto L43
            java.lang.String r1 = r6.getAction()
            goto L44
        L43:
            r1 = r0
        L44:
            java.lang.String r2 = "android.media.VOLUME_CHANGED_ACTION"
            boolean r1 = gg.l.a(r1, r2)
            if (r1 != 0) goto L4d
            goto L83
        L4d:
            java.lang.String r1 = "android.media.EXTRA_VOLUME_STREAM_TYPE"
            r2 = -1
            int r1 = r6.getIntExtra(r1, r2)
            r3 = 3
            if (r1 == r3) goto L58
            goto L83
        L58:
            java.lang.String r1 = "android.media.EXTRA_VOLUME_STREAM_VALUE"
            int r1 = r6.getIntExtra(r1, r2)
            java.lang.String r3 = "android.media.EXTRA_PREV_VOLUME_STREAM_VALUE"
            int r6 = r6.getIntExtra(r3, r2)
            if (r1 < 0) goto L83
            if (r6 < 0) goto L83
            if (r1 != r6) goto L6b
            goto L83
        L6b:
            java.lang.Integer r2 = r5.f9334x
            if (r2 != 0) goto L70
            goto L79
        L70:
            int r2 = r2.intValue()
            if (r2 != r1) goto L79
            r5.f9334x = r0
            goto L83
        L79:
            android.os.Handler r0 = r5.f9312b
            nb.t r2 = new nb.t
            r2.<init>(r1, r6, r5)
            r0.post(r2)
        L83:
            return
    }
}
