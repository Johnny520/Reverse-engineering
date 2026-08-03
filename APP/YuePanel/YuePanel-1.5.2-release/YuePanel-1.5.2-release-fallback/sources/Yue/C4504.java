package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۢۦ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C4504 implements Yue.InterfaceC4423 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.Context f14381;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final android.app.Notification.Builder f14382;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.C4434.C4463 f14383;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.widget.RemoteViews f14384;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.widget.RemoteViews f14385;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final java.util.List<android.os.Bundle> f14386;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final android.os.Bundle f14387;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f14388;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public android.widget.RemoteViews f14389;

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ۠$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(20)
    public static class C4505 {
        public C4505() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.app.Notification.Builder m17874(android.app.Notification.Builder r0, android.app.Notification.Action r1) {
                android.app.Notification$Builder r0 = r0.addAction(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.app.Notification.Action.Builder m17875(android.app.Notification.Action.Builder r0, android.os.Bundle r1) {
                android.app.Notification$Action$Builder r0 = r0.addExtras(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static android.app.Notification.Action.Builder m17876(android.app.Notification.Action.Builder r0, android.app.RemoteInput r1) {
                android.app.Notification$Action$Builder r0 = r0.addRemoteInput(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static android.app.Notification.Action m17877(android.app.Notification.Action.Builder r0) {
                android.app.Notification$Action r0 = r0.build()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static android.app.Notification.Action.Builder m17878(int r1, java.lang.CharSequence r2, android.app.PendingIntent r3) {
                android.app.Notification$Action$Builder r0 = new android.app.Notification$Action$Builder
                r0.<init>(r1, r2, r3)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static java.lang.String m17879(android.app.Notification r0) {
                java.lang.String r0 = r0.getGroup()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static android.app.Notification.Builder m17880(android.app.Notification.Builder r0, java.lang.String r1) {
                android.app.Notification$Builder r0 = r0.setGroup(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static android.app.Notification.Builder m17881(android.app.Notification.Builder r0, boolean r1) {
                android.app.Notification$Builder r0 = r0.setGroupSummary(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static android.app.Notification.Builder m17882(android.app.Notification.Builder r0, boolean r1) {
                android.app.Notification$Builder r0 = r0.setLocalOnly(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static android.app.Notification.Builder m17883(android.app.Notification.Builder r0, java.lang.String r1) {
                android.app.Notification$Builder r0 = r0.setSortKey(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ۠$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C4506 {
        public C4506() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.app.Notification.Builder m17884(android.app.Notification.Builder r0, java.lang.String r1) {
                android.app.Notification$Builder r0 = r0.addPerson(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.app.Notification.Builder m17885(android.app.Notification.Builder r0, java.lang.String r1) {
                android.app.Notification$Builder r0 = r0.setCategory(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static android.app.Notification.Builder m17886(android.app.Notification.Builder r0, int r1) {
                android.app.Notification$Builder r0 = r0.setColor(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static android.app.Notification.Builder m17887(android.app.Notification.Builder r0, android.app.Notification r1) {
                android.app.Notification$Builder r0 = r0.setPublicVersion(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static android.app.Notification.Builder m17888(android.app.Notification.Builder r0, android.net.Uri r1, java.lang.Object r2) {
                android.media.AudioAttributes r2 = (android.media.AudioAttributes) r2
                android.app.Notification$Builder r0 = r0.setSound(r1, r2)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static android.app.Notification.Builder m17889(android.app.Notification.Builder r0, int r1) {
                android.app.Notification$Builder r0 = r0.setVisibility(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ۠$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static class C4507 {
        public C4507() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.app.Notification.Action.Builder m17890(android.graphics.drawable.Icon r1, java.lang.CharSequence r2, android.app.PendingIntent r3) {
                android.app.Notification$Action$Builder r0 = new android.app.Notification$Action$Builder
                r0.<init>(r1, r2, r3)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.app.Notification.Builder m17891(android.app.Notification.Builder r0, android.graphics.drawable.Icon r1) {
                android.app.Notification$Builder r0 = r0.setLargeIcon(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static android.app.Notification.Builder m17892(android.app.Notification.Builder r0, java.lang.Object r1) {
                android.graphics.drawable.Icon r1 = (android.graphics.drawable.Icon) r1
                android.app.Notification$Builder r0 = r0.setSmallIcon(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ۠$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C4508 {
        public C4508() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.app.Notification.Action.Builder m17893(android.app.Notification.Action.Builder r0, boolean r1) {
                android.app.Notification$Action$Builder r0 = r0.setAllowGeneratedReplies(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.app.Notification.Builder m17894(android.app.Notification.Builder r0, android.widget.RemoteViews r1) {
                android.app.Notification$Builder r0 = r0.setCustomBigContentView(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static android.app.Notification.Builder m17895(android.app.Notification.Builder r0, android.widget.RemoteViews r1) {
                android.app.Notification$Builder r0 = r0.setCustomContentView(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static android.app.Notification.Builder m17896(android.app.Notification.Builder r0, android.widget.RemoteViews r1) {
                android.app.Notification$Builder r0 = r0.setCustomHeadsUpContentView(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static android.app.Notification.Builder m17897(android.app.Notification.Builder r0, java.lang.CharSequence[] r1) {
                android.app.Notification$Builder r0 = r0.setRemoteInputHistory(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ۠$ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(26)
    public static class C4509 {
        public C4509() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.app.Notification.Builder m17898(android.content.Context r1, java.lang.String r2) {
                android.app.Notification$Builder r0 = new android.app.Notification$Builder
                r0.<init>(r1, r2)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.app.Notification.Builder m17899(android.app.Notification.Builder r0, int r1) {
                android.app.Notification$Builder r0 = r0.setBadgeIconType(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static android.app.Notification.Builder m17900(android.app.Notification.Builder r0, boolean r1) {
                android.app.Notification$Builder r0 = r0.setColorized(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static android.app.Notification.Builder m17901(android.app.Notification.Builder r0, int r1) {
                android.app.Notification$Builder r0 = r0.setGroupAlertBehavior(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static android.app.Notification.Builder m17902(android.app.Notification.Builder r0, java.lang.CharSequence r1) {
                android.app.Notification$Builder r0 = r0.setSettingsText(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static android.app.Notification.Builder m17903(android.app.Notification.Builder r0, java.lang.String r1) {
                android.app.Notification$Builder r0 = r0.setShortcutId(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static android.app.Notification.Builder m17904(android.app.Notification.Builder r0, long r1) {
                android.app.Notification$Builder r0 = r0.setTimeoutAfter(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ۠$ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C4510 {
        public C4510() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.app.Notification.Builder m17905(android.app.Notification.Builder r0, android.app.Person r1) {
                android.app.Notification$Builder r0 = r0.addPerson(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.app.Notification.Action.Builder m17906(android.app.Notification.Action.Builder r0, int r1) {
                android.app.Notification$Action$Builder r0 = r0.setSemanticAction(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ۠$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C4511 {
        public C4511() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.app.Notification.Builder m17907(android.app.Notification.Builder r0, boolean r1) {
                android.app.Notification$Builder r0 = r0.setAllowSystemGeneratedContextualActions(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.app.Notification.Builder m17908(android.app.Notification.Builder r0, android.app.Notification.BubbleMetadata r1) {
                android.app.Notification$Builder r0 = r0.setBubbleMetadata(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static android.app.Notification.Action.Builder m17909(android.app.Notification.Action.Builder r0, boolean r1) {
                android.app.Notification$Action$Builder r0 = r0.setContextual(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static android.app.Notification.Builder m17910(android.app.Notification.Builder r0, java.lang.Object r1) {
                android.content.LocusId r1 = (android.content.LocusId) r1
                android.app.Notification$Builder r0 = r0.setLocusId(r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۢۦ۠$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC5336(31)
    public static class C4512 {
        public C4512() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.app.Notification.Action.Builder m17911(android.app.Notification.Action.Builder r0, boolean r1) {
                android.app.Notification$Action$Builder r0 = r0.setAuthenticationRequired(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.app.Notification.Builder m17912(android.app.Notification.Builder r0, int r1) {
                android.app.Notification$Builder r0 = r0.setForegroundServiceBehavior(r1)
                return r0
        }
    }

    public C4504(Yue.C4434.C4463 r14) {
            r13 = this;
            r13.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13.f14386 = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r13.f14387 = r0
            r13.f14383 = r14
            android.content.Context r0 = r14.f14197
            r13.f14381 = r0
            java.lang.String r1 = r14.f14234
            android.app.Notification$Builder r1 = Yue.C4504.C4509.m17898(r0, r1)
            r13.f14382 = r1
            android.app.Notification r2 = r14.f14243
            long r3 = r2.when
            android.app.Notification$Builder r3 = r1.setWhen(r3)
            int r4 = r2.icon
            int r5 = r2.iconLevel
            android.app.Notification$Builder r3 = r3.setSmallIcon(r4, r5)
            android.widget.RemoteViews r4 = r2.contentView
            android.app.Notification$Builder r3 = r3.setContent(r4)
            java.lang.CharSequence r4 = r2.tickerText
            android.widget.RemoteViews r5 = r14.f14205
            android.app.Notification$Builder r3 = r3.setTicker(r4, r5)
            long[] r4 = r2.vibrate
            android.app.Notification$Builder r3 = r3.setVibrate(r4)
            int r4 = r2.ledARGB
            int r5 = r2.ledOnMS
            int r6 = r2.ledOffMS
            android.app.Notification$Builder r3 = r3.setLights(r4, r5, r6)
            int r4 = r2.flags
            r5 = 2
            r4 = r4 & r5
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L57
            r4 = r6
            goto L58
        L57:
            r4 = r7
        L58:
            android.app.Notification$Builder r3 = r3.setOngoing(r4)
            int r4 = r2.flags
            r4 = r4 & 8
            if (r4 == 0) goto L64
            r4 = r6
            goto L65
        L64:
            r4 = r7
        L65:
            android.app.Notification$Builder r3 = r3.setOnlyAlertOnce(r4)
            int r4 = r2.flags
            r4 = r4 & 16
            if (r4 == 0) goto L71
            r4 = r6
            goto L72
        L71:
            r4 = r7
        L72:
            android.app.Notification$Builder r3 = r3.setAutoCancel(r4)
            int r4 = r2.defaults
            android.app.Notification$Builder r3 = r3.setDefaults(r4)
            java.lang.CharSequence r4 = r14.f14201
            android.app.Notification$Builder r3 = r3.setContentTitle(r4)
            java.lang.CharSequence r4 = r14.f14202
            android.app.Notification$Builder r3 = r3.setContentText(r4)
            java.lang.CharSequence r4 = r14.f14207
            android.app.Notification$Builder r3 = r3.setContentInfo(r4)
            android.app.PendingIntent r4 = r14.f14203
            android.app.Notification$Builder r3 = r3.setContentIntent(r4)
            android.app.PendingIntent r4 = r2.deleteIntent
            android.app.Notification$Builder r3 = r3.setDeleteIntent(r4)
            android.app.PendingIntent r4 = r14.f14204
            int r8 = r2.flags
            r8 = r8 & 128(0x80, float:1.8E-43)
            if (r8 == 0) goto La4
            r8 = r6
            goto La5
        La4:
            r8 = r7
        La5:
            android.app.Notification$Builder r3 = r3.setFullScreenIntent(r4, r8)
            int r4 = r14.f14208
            android.app.Notification$Builder r3 = r3.setNumber(r4)
            int r4 = r14.f14217
            int r8 = r14.f14218
            boolean r9 = r14.f14219
            r3.setProgress(r4, r8, r9)
            androidx.core.graphics.drawable.IconCompat r3 = r14.f14206
            r4 = 0
            if (r3 != 0) goto Lbf
            r0 = r4
            goto Lc3
        Lbf:
            android.graphics.drawable.Icon r0 = r3.m28864(r0)
        Lc3:
            Yue.C4504.C4507.m17891(r1, r0)
            java.lang.CharSequence r0 = r14.f14214
            android.app.Notification$Builder r0 = r1.setSubText(r0)
            boolean r1 = r14.f14211
            android.app.Notification$Builder r0 = r0.setUsesChronometer(r1)
            int r1 = r14.f14209
            r0.setPriority(r1)
            Yue.ۥۡۢۦ$ۥ۟۟۠ۨ r0 = r14.f14213
            boolean r1 = r0 instanceof Yue.C4434.C4467
            if (r1 == 0) goto Lf7
            Yue.ۥۡۢۦ$ۥ۟۟۠ r0 = (Yue.C4434.C4467) r0
            java.util.ArrayList r0 = r0.m17667()
            java.util.Iterator r0 = r0.iterator()
        Le7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L10d
            java.lang.Object r1 = r0.next()
            Yue.ۥۡۢۦ$ۥ۟ r1 = (Yue.C4434.C4436) r1
            r13.m17869(r1)
            goto Le7
        Lf7:
            java.util.ArrayList<Yue.ۥۡۢۦ$ۥ۟> r0 = r14.f14198
            java.util.Iterator r0 = r0.iterator()
        Lfd:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L10d
            java.lang.Object r1 = r0.next()
            Yue.ۥۡۢۦ$ۥ۟ r1 = (Yue.C4434.C4436) r1
            r13.m17869(r1)
            goto Lfd
        L10d:
            android.os.Bundle r0 = r14.f14227
            if (r0 == 0) goto L116
            android.os.Bundle r1 = r13.f14387
            r1.putAll(r0)
        L116:
            int r0 = android.os.Build.VERSION.SDK_INT
            android.widget.RemoteViews r1 = r14.f14231
            r13.f14384 = r1
            android.widget.RemoteViews r1 = r14.f14232
            r13.f14385 = r1
            android.app.Notification$Builder r1 = r13.f14382
            boolean r3 = r14.f14210
            r1.setShowWhen(r3)
            android.app.Notification$Builder r1 = r13.f14382
            boolean r3 = r14.f14223
            Yue.C4504.C4505.m17882(r1, r3)
            android.app.Notification$Builder r1 = r13.f14382
            java.lang.String r3 = r14.f14220
            Yue.C4504.C4505.m17880(r1, r3)
            android.app.Notification$Builder r1 = r13.f14382
            java.lang.String r3 = r14.f14222
            Yue.C4504.C4505.m17883(r1, r3)
            android.app.Notification$Builder r1 = r13.f14382
            boolean r3 = r14.f14221
            Yue.C4504.C4505.m17881(r1, r3)
            int r1 = r14.f14239
            r13.f14388 = r1
            android.app.Notification$Builder r1 = r13.f14382
            java.lang.String r3 = r14.f14226
            Yue.C4504.C4506.m17885(r1, r3)
            android.app.Notification$Builder r1 = r13.f14382
            int r3 = r14.f14228
            Yue.C4504.C4506.m17886(r1, r3)
            android.app.Notification$Builder r1 = r13.f14382
            int r3 = r14.f14229
            Yue.C4504.C4506.m17889(r1, r3)
            android.app.Notification$Builder r1 = r13.f14382
            android.app.Notification r3 = r14.f14230
            Yue.C4504.C4506.m17887(r1, r3)
            android.app.Notification$Builder r1 = r13.f14382
            android.net.Uri r3 = r2.sound
            android.media.AudioAttributes r8 = r2.audioAttributes
            Yue.C4504.C4506.m17888(r1, r3, r8)
            r1 = 28
            if (r0 >= r1) goto L17d
            java.util.ArrayList<Yue.ۥۡۤ۠ۥ> r0 = r14.f14199
            java.util.List r0 = m17868(r0)
            java.util.ArrayList<java.lang.String> r3 = r14.f14246
            java.util.List r0 = m17867(r0, r3)
            goto L17f
        L17d:
            java.util.ArrayList<java.lang.String> r0 = r14.f14246
        L17f:
            if (r0 == 0) goto L19d
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L19d
            java.util.Iterator r0 = r0.iterator()
        L18b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L19d
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            android.app.Notification$Builder r8 = r13.f14382
            Yue.C4504.C4506.m17884(r8, r3)
            goto L18b
        L19d:
            android.widget.RemoteViews r0 = r14.f14233
            r13.f14389 = r0
            java.util.ArrayList<Yue.ۥۡۢۦ$ۥ۟> r0 = r14.f14200
            int r0 = r0.size()
            if (r0 <= 0) goto L1f7
            android.os.Bundle r0 = r14.m17586()
            java.lang.String r3 = "android.car.EXTENSIONS"
            android.os.Bundle r0 = r0.getBundle(r3)
            if (r0 != 0) goto L1ba
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L1ba:
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r0)
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            r10 = r7
        L1c5:
            java.util.ArrayList<Yue.ۥۡۢۦ$ۥ۟> r11 = r14.f14200
            int r11 = r11.size()
            if (r10 >= r11) goto L1e3
            java.lang.String r11 = java.lang.Integer.toString(r10)
            java.util.ArrayList<Yue.ۥۡۢۦ$ۥ۟> r12 = r14.f14200
            java.lang.Object r12 = r12.get(r10)
            Yue.ۥۡۢۦ$ۥ۟ r12 = (Yue.C4434.C4436) r12
            android.os.Bundle r12 = Yue.C4514.m17922(r12)
            r9.putBundle(r11, r12)
            int r10 = r10 + 1
            goto L1c5
        L1e3:
            java.lang.String r10 = "invisible_actions"
            r0.putBundle(r10, r9)
            r8.putBundle(r10, r9)
            android.os.Bundle r9 = r14.m17586()
            r9.putBundle(r3, r0)
            android.os.Bundle r0 = r13.f14387
            r0.putBundle(r3, r8)
        L1f7:
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Object r3 = r14.f14245
            if (r3 == 0) goto L202
            android.app.Notification$Builder r8 = r13.f14382
            Yue.C4504.C4507.m17892(r8, r3)
        L202:
            android.app.Notification$Builder r3 = r13.f14382
            android.os.Bundle r8 = r14.f14227
            r3.setExtras(r8)
            android.app.Notification$Builder r3 = r13.f14382
            java.lang.CharSequence[] r8 = r14.f14216
            Yue.C4504.C4508.m17897(r3, r8)
            android.widget.RemoteViews r3 = r14.f14231
            if (r3 == 0) goto L219
            android.app.Notification$Builder r8 = r13.f14382
            Yue.C4504.C4508.m17895(r8, r3)
        L219:
            android.widget.RemoteViews r3 = r14.f14232
            if (r3 == 0) goto L222
            android.app.Notification$Builder r8 = r13.f14382
            Yue.C4504.C4508.m17894(r8, r3)
        L222:
            android.widget.RemoteViews r3 = r14.f14233
            if (r3 == 0) goto L22b
            android.app.Notification$Builder r8 = r13.f14382
            Yue.C4504.C4508.m17896(r8, r3)
        L22b:
            android.app.Notification$Builder r3 = r13.f14382
            int r8 = r14.f14235
            Yue.C4504.C4509.m17899(r3, r8)
            android.app.Notification$Builder r3 = r13.f14382
            java.lang.CharSequence r8 = r14.f14215
            Yue.C4504.C4509.m17902(r3, r8)
            android.app.Notification$Builder r3 = r13.f14382
            java.lang.String r8 = r14.f14236
            Yue.C4504.C4509.m17903(r3, r8)
            android.app.Notification$Builder r3 = r13.f14382
            long r8 = r14.f14238
            Yue.C4504.C4509.m17904(r3, r8)
            android.app.Notification$Builder r3 = r13.f14382
            int r8 = r14.f14239
            Yue.C4504.C4509.m17901(r3, r8)
            boolean r3 = r14.f14225
            if (r3 == 0) goto L259
            android.app.Notification$Builder r3 = r13.f14382
            boolean r8 = r14.f14224
            Yue.C4504.C4509.m17900(r3, r8)
        L259:
            java.lang.String r3 = r14.f14234
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L272
            android.app.Notification$Builder r3 = r13.f14382
            android.app.Notification$Builder r3 = r3.setSound(r4)
            android.app.Notification$Builder r3 = r3.setDefaults(r7)
            android.app.Notification$Builder r3 = r3.setLights(r7, r7, r7)
            r3.setVibrate(r4)
        L272:
            if (r0 < r1) goto L290
            java.util.ArrayList<Yue.ۥۡۤ۠ۥ> r0 = r14.f14199
            java.util.Iterator r0 = r0.iterator()
        L27a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L290
            java.lang.Object r1 = r0.next()
            Yue.ۥۡۤ۠ۥ r1 = (Yue.C4758) r1
            android.app.Notification$Builder r3 = r13.f14382
            android.app.Person r1 = r1.m18965()
            Yue.C4504.C4510.m17905(r3, r1)
            goto L27a
        L290:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L2b5
            android.app.Notification$Builder r1 = r13.f14382
            boolean r3 = r14.f14241
            Yue.C4504.C4511.m17907(r1, r3)
            android.app.Notification$Builder r1 = r13.f14382
            Yue.ۥۡۢۦ$ۥ۟۟۟ۧ r3 = r14.f14242
            android.app.Notification$BubbleMetadata r3 = Yue.C4434.C4459.m17542(r3)
            Yue.C4504.C4511.m17908(r1, r3)
            Yue.ۥ۠ۨۡ۠ r1 = r14.f14237
            if (r1 == 0) goto L2b5
            android.app.Notification$Builder r3 = r13.f14382
            android.content.LocusId r1 = r1.m15226()
            Yue.C4504.C4511.m17910(r3, r1)
        L2b5:
            r1 = 31
            if (r0 < r1) goto L2c2
            int r0 = r14.f14240
            if (r0 == 0) goto L2c2
            android.app.Notification$Builder r1 = r13.f14382
            Yue.C4504.C4512.m17912(r1, r0)
        L2c2:
            boolean r14 = r14.f14244
            if (r14 == 0) goto L2fe
            Yue.ۥۡۢۦ$ۥ۟۟۟ۨ r14 = r13.f14383
            boolean r14 = r14.f14221
            if (r14 == 0) goto L2cf
            r13.f14388 = r5
            goto L2d1
        L2cf:
            r13.f14388 = r6
        L2d1:
            android.app.Notification$Builder r14 = r13.f14382
            r14.setVibrate(r4)
            android.app.Notification$Builder r14 = r13.f14382
            r14.setSound(r4)
            int r14 = r2.defaults
            r14 = r14 & (-4)
            r2.defaults = r14
            android.app.Notification$Builder r0 = r13.f14382
            r0.setDefaults(r14)
            Yue.ۥۡۢۦ$ۥ۟۟۟ۨ r14 = r13.f14383
            java.lang.String r14 = r14.f14220
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 == 0) goto L2f7
            android.app.Notification$Builder r14 = r13.f14382
            java.lang.String r0 = "silent"
            Yue.C4504.C4505.m17880(r14, r0)
        L2f7:
            android.app.Notification$Builder r14 = r13.f14382
            int r0 = r13.f14388
            Yue.C4504.C4509.m17901(r14, r0)
        L2fe:
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static java.util.List<java.lang.String> m17867(@Yue.InterfaceC4544 java.util.List<java.lang.String> r3, @Yue.InterfaceC4544 java.util.List<java.lang.String> r4) {
            if (r3 != 0) goto L3
            return r4
        L3:
            if (r4 != 0) goto L6
            return r3
        L6:
            Yue.ۥ۟ۡۨۦ r0 = new Yue.ۥ۟ۡۨۦ
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            r0.addAll(r3)
            r0.addAll(r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            return r3
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static java.util.List<java.lang.String> m17868(@Yue.InterfaceC4544 java.util.List<Yue.C4758> r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r2.next()
            Yue.ۥۡۤ۠ۥ r1 = (Yue.C4758) r1
            java.lang.String r1 = r1.m18964()
            r0.add(r1)
            goto L11
        L25:
            return r0
    }

    @Override // Yue.InterfaceC4423
    /* JADX INFO: renamed from: ۥ */
    public android.app.Notification.Builder mo17333() {
            r1 = this;
            android.app.Notification$Builder r0 = r1.f14382
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m17869(Yue.C4434.C4436 r6) {
            r5 = this;
            androidx.core.graphics.drawable.IconCompat r0 = r6.m17454()
            if (r0 == 0) goto Lb
            android.graphics.drawable.Icon r0 = r0.m28863()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            java.lang.CharSequence r1 = r6.m17458()
            android.app.PendingIntent r2 = r6.m17449()
            android.app.Notification$Action$Builder r0 = Yue.C4504.C4507.m17890(r0, r1, r2)
            Yue.ۥۡۦۣۨ[] r1 = r6.m17455()
            if (r1 == 0) goto L32
            Yue.ۥۡۦۣۨ[] r1 = r6.m17455()
            android.app.RemoteInput[] r1 = Yue.C5300.m20032(r1)
            int r2 = r1.length
            r3 = 0
        L28:
            if (r3 >= r2) goto L32
            r4 = r1[r3]
            Yue.C4504.C4505.m17876(r0, r4)
            int r3 = r3 + 1
            goto L28
        L32:
            android.os.Bundle r1 = r6.m17452()
            if (r1 == 0) goto L42
            android.os.Bundle r1 = new android.os.Bundle
            android.os.Bundle r2 = r6.m17452()
            r1.<init>(r2)
            goto L47
        L42:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
        L47:
            java.lang.String r2 = "android.support.allowGeneratedReplies"
            boolean r3 = r6.m17450()
            r1.putBoolean(r2, r3)
            int r2 = android.os.Build.VERSION.SDK_INT
            boolean r3 = r6.m17450()
            Yue.C4504.C4508.m17893(r0, r3)
            java.lang.String r3 = "android.support.action.semanticAction"
            int r4 = r6.m17456()
            r1.putInt(r3, r4)
            r3 = 28
            if (r2 < r3) goto L6d
            int r3 = r6.m17456()
            Yue.C4504.C4510.m17906(r0, r3)
        L6d:
            r3 = 29
            if (r2 < r3) goto L78
            boolean r3 = r6.m17460()
            Yue.C4504.C4511.m17909(r0, r3)
        L78:
            r3 = 31
            if (r2 < r3) goto L83
            boolean r2 = r6.m17459()
            Yue.C4504.C4512.m17911(r0, r2)
        L83:
            java.lang.String r2 = "android.support.action.showsUserInterface"
            boolean r6 = r6.m17457()
            r1.putBoolean(r2, r6)
            Yue.C4504.C4505.m17875(r0, r1)
            android.app.Notification$Builder r6 = r5.f14382
            android.app.Notification$Action r0 = Yue.C4504.C4505.m17877(r0)
            Yue.C4504.C4505.m17874(r6, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.app.Notification m17870() {
            r3 = this;
            Yue.ۥۡۢۦ$ۥ۟۟۟ۨ r0 = r3.f14383
            Yue.ۥۡۢۦ$ۥ۟۟۠ۨ r0 = r0.f14213
            if (r0 == 0) goto L9
            r0.mo17521(r3)
        L9:
            if (r0 == 0) goto L10
            android.widget.RemoteViews r1 = r0.mo17736(r3)
            goto L11
        L10:
            r1 = 0
        L11:
            android.app.Notification r2 = r3.m17871()
            if (r1 == 0) goto L1a
            r2.contentView = r1
            goto L22
        L1a:
            Yue.ۥۡۢۦ$ۥ۟۟۟ۨ r1 = r3.f14383
            android.widget.RemoteViews r1 = r1.f14231
            if (r1 == 0) goto L22
            r2.contentView = r1
        L22:
            if (r0 == 0) goto L2c
            android.widget.RemoteViews r1 = r0.mo17735(r3)
            if (r1 == 0) goto L2c
            r2.bigContentView = r1
        L2c:
            if (r0 == 0) goto L3a
            Yue.ۥۡۢۦ$ۥ۟۟۟ۨ r1 = r3.f14383
            Yue.ۥۡۢۦ$ۥ۟۟۠ۨ r1 = r1.f14213
            android.widget.RemoteViews r1 = r1.mo17737(r3)
            if (r1 == 0) goto L3a
            r2.headsUpContentView = r1
        L3a:
            if (r0 == 0) goto L45
            android.os.Bundle r1 = Yue.C4434.m17427(r2)
            if (r1 == 0) goto L45
            r0.mo17537(r1)
        L45:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.app.Notification m17871() {
            r1 = this;
            android.app.Notification$Builder r0 = r1.f14382
            android.app.Notification r0 = r0.build()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public android.content.Context m17872() {
            r1 = this;
            android.content.Context r0 = r1.f14381
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m17873(android.app.Notification r2) {
            r1 = this;
            r0 = 0
            r2.sound = r0
            r2.vibrate = r0
            int r0 = r2.defaults
            r0 = r0 & (-4)
            r2.defaults = r0
            return
    }
}
