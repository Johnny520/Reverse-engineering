package e9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r17, android.content.Intent r18) {
            r16 = this;
            r0 = r18
            r17.getClass()
            if (r0 == 0) goto Lb7
            java.lang.String r1 = r0.getAction()
            if (r1 == 0) goto Lb7
            java.lang.String r2 = "hchat_custom_notification_talker"
            java.lang.String r2 = r0.getStringExtra(r2)
            java.lang.String r3 = ""
            if (r2 != 0) goto L19
            r9 = r3
            goto L1a
        L19:
            r9 = r2
        L1a:
            boolean r2 = og.m.t0(r9)
            if (r2 == 0) goto L22
            goto Lb7
        L22:
            java.lang.String r2 = "hchat_custom_notification_id"
            int r4 = r9.hashCode()
            int r7 = r0.getIntExtra(r2, r4)
            java.lang.String r2 = "hchat_custom_notification_reply_msg_id"
            r4 = 0
            long r11 = r0.getLongExtra(r2, r4)
            java.lang.String r2 = "hchat_custom_notification_native_msg_svr_id"
            long r13 = r0.getLongExtra(r2, r4)
            java.lang.String r2 = "hchat_custom_notification_quote_quick_reply"
            r4 = 0
            boolean r15 = r0.getBooleanExtra(r2, r4)
            java.lang.String r2 = "h.Hchat.action.CUSTOM_NOTIFICATION_REPLY"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La2
            android.os.Bundle r0 = android.app.RemoteInput.getResultsFromIntent(r0)
            if (r0 == 0) goto L66
            java.lang.String r1 = "hchat_reply_text"
            java.lang.CharSequence r0 = r0.getCharSequence(r1)
            if (r0 == 0) goto L66
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L66
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            goto L67
        L66:
            r0 = 0
        L67:
            if (r0 != 0) goto L6b
            r8 = r3
            goto L6c
        L6b:
            r8 = r0
        L6c:
            boolean r0 = og.m.t0(r8)
            if (r0 == 0) goto L73
            goto Lb7
        L73:
            android.content.BroadcastReceiver$PendingResult r10 = r16.goAsync()
            java.util.concurrent.ExecutorService r0 = e9.q.f2464e     // Catch: java.lang.Throwable -> L88
            e9.n r4 = new e9.n     // Catch: java.lang.Throwable -> L88
            r5 = r16
            r6 = r17
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r13, r15)     // Catch: java.lang.Throwable -> L88
            r0.execute(r4)     // Catch: java.lang.Throwable -> L88
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L88
            goto L8f
        L88:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L8f:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto Lb7
            r10.finish()
            java.lang.String r1 = "[Hchat:CustomNotification] 快捷回复任务提交失败: "
            java.lang.String r1 = r1.concat(r9)
            fb.v0.n(r1, r0)
            goto Lb7
        La2:
            java.lang.String r0 = "h.Hchat.action.CUSTOM_NOTIFICATION_MARK_READ"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb7
            java.util.concurrent.ExecutorService r0 = e9.q.f2463d
            e9.o r1 = new e9.o
            r2 = 0
            r6 = r17
            r1.<init>(r6, r9, r7, r2)
            r0.execute(r1)
        Lb7:
            return
    }
}
