package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class x31 {

    /* JADX INFO: renamed from: α */
    public final android.content.Context f12030;

    /* JADX INFO: renamed from: β */
    public final java.util.ArrayList f12031;

    /* JADX INFO: renamed from: γ */
    public final java.util.ArrayList f12032;

    /* JADX INFO: renamed from: δ */
    public final java.util.ArrayList f12033;

    /* JADX INFO: renamed from: ε */
    public java.lang.CharSequence f12034;

    /* JADX INFO: renamed from: ζ */
    public java.lang.CharSequence f12035;

    /* JADX INFO: renamed from: η */
    public final boolean f12036;

    /* JADX INFO: renamed from: θ */
    public int f12037;

    /* JADX INFO: renamed from: ι */
    public int f12038;

    /* JADX INFO: renamed from: κ */
    public boolean f12039;

    /* JADX INFO: renamed from: λ */
    public android.os.Bundle f12040;

    /* JADX INFO: renamed from: μ */
    public final java.lang.String f12041;

    /* JADX INFO: renamed from: ν */
    public final boolean f12042;

    /* JADX INFO: renamed from: ξ */
    public final android.app.Notification f12043;

    /* JADX INFO: renamed from: ο */
    public boolean f12044;

    /* JADX INFO: renamed from: π */
    public final java.util.ArrayList f12045;

    public x31(android.content.Context r5) {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f12031 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f12032 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f12033 = r0
            r0 = 1
            r4.f12036 = r0
            android.app.Notification r1 = new android.app.Notification
            r1.<init>()
            r4.f12043 = r1
            r4.f12030 = r5
            java.lang.String r5 = "dyhelper_download"
            r4.f12041 = r5
            long r2 = java.lang.System.currentTimeMillis()
            r1.when = r2
            r5 = -1
            r1.audioStreamType = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.f12045 = r5
            r4.f12042 = r0
            return
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.CharSequence m6513(java.lang.String r2) {
            if (r2 != 0) goto L3
            return r2
        L3:
            int r0 = r2.length()
            r1 = 5120(0x1400, float:7.175E-42)
            if (r0 <= r1) goto L10
            r0 = 0
            java.lang.CharSequence r2 = r2.subSequence(r0, r1)
        L10:
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final android.app.Notification m6514() {
            r13 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.app.Notification$Builder r1 = new android.app.Notification$Builder
            android.content.Context r2 = r13.f12030
            java.lang.String r3 = r13.f12041
            r1.<init>(r2, r3)
            android.app.Notification r2 = r13.f12043
            long r4 = r2.when
            android.app.Notification$Builder r4 = r1.setWhen(r4)
            int r5 = r2.icon
            int r6 = r2.iconLevel
            android.app.Notification$Builder r4 = r4.setSmallIcon(r5, r6)
            android.widget.RemoteViews r5 = r2.contentView
            android.app.Notification$Builder r4 = r4.setContent(r5)
            java.lang.CharSequence r5 = r2.tickerText
            r6 = 0
            android.app.Notification$Builder r4 = r4.setTicker(r5, r6)
            long[] r5 = r2.vibrate
            android.app.Notification$Builder r4 = r4.setVibrate(r5)
            int r5 = r2.ledARGB
            int r7 = r2.ledOnMS
            int r8 = r2.ledOffMS
            android.app.Notification$Builder r4 = r4.setLights(r5, r7, r8)
            int r5 = r2.flags
            r5 = r5 & 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L4a
            r5 = r7
            goto L4b
        L4a:
            r5 = r8
        L4b:
            android.app.Notification$Builder r4 = r4.setOngoing(r5)
            int r5 = r2.flags
            r5 = r5 & 8
            if (r5 == 0) goto L57
            r5 = r7
            goto L58
        L57:
            r5 = r8
        L58:
            android.app.Notification$Builder r4 = r4.setOnlyAlertOnce(r5)
            int r5 = r2.flags
            r5 = r5 & 16
            if (r5 == 0) goto L64
            r5 = r7
            goto L65
        L64:
            r5 = r8
        L65:
            android.app.Notification$Builder r4 = r4.setAutoCancel(r5)
            int r5 = r2.defaults
            android.app.Notification$Builder r4 = r4.setDefaults(r5)
            java.lang.CharSequence r5 = r13.f12034
            android.app.Notification$Builder r4 = r4.setContentTitle(r5)
            java.lang.CharSequence r5 = r13.f12035
            android.app.Notification$Builder r4 = r4.setContentText(r5)
            android.app.Notification$Builder r4 = r4.setContentInfo(r6)
            android.app.Notification$Builder r4 = r4.setContentIntent(r6)
            android.app.PendingIntent r5 = r2.deleteIntent
            android.app.Notification$Builder r4 = r4.setDeleteIntent(r5)
            int r5 = r2.flags
            r5 = r5 & 128(0x80, float:1.8E-43)
            if (r5 == 0) goto L91
            r5 = r7
            goto L92
        L91:
            r5 = r8
        L92:
            android.app.Notification$Builder r4 = r4.setFullScreenIntent(r6, r5)
            android.app.Notification$Builder r4 = r4.setNumber(r8)
            int r5 = r13.f12037
            int r9 = r13.f12038
            boolean r10 = r13.f12039
            r4.setProgress(r5, r9, r10)
            r1.setLargeIcon(r6)
            android.app.Notification$Builder r4 = r1.setSubText(r6)
            android.app.Notification$Builder r4 = r4.setUsesChronometer(r8)
            r4.setPriority(r8)
            java.util.ArrayList r4 = r13.f12031
            java.util.Iterator r4 = r4.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L1e5
            android.os.Bundle r4 = r13.f12040
            if (r4 == 0) goto Lc4
            r0.putAll(r4)
        Lc4:
            boolean r4 = r13.f12036
            r1.setShowWhen(r4)
            r1.setLocalOnly(r8)
            r1.setGroup(r6)
            r1.setSortKey(r6)
            r1.setGroupSummary(r8)
            r1.setCategory(r6)
            r1.setColor(r8)
            r1.setVisibility(r8)
            r1.setPublicVersion(r6)
            android.net.Uri r4 = r2.sound
            android.media.AudioAttributes r5 = r2.audioAttributes
            r1.setSound(r4, r5)
            java.util.ArrayList r4 = r13.f12045
            if (r4 == 0) goto L106
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L106
            java.util.Iterator r4 = r4.iterator()
        Lf6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L106
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r1.addPerson(r5)
            goto Lf6
        L106:
            java.util.ArrayList r4 = r13.f12033
            int r5 = r4.size()
            if (r5 <= 0) goto L168
            android.os.Bundle r5 = r13.f12040
            if (r5 != 0) goto L119
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r13.f12040 = r5
        L119:
            android.os.Bundle r5 = r13.f12040
            java.lang.String r9 = "android.car.EXTENSIONS"
            android.os.Bundle r5 = r5.getBundle(r9)
            if (r5 != 0) goto L128
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
        L128:
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>(r5)
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            int r12 = r4.size()
            if (r12 > 0) goto L154
            java.lang.String r4 = "invisible_actions"
            r5.putBundle(r4, r11)
            r10.putBundle(r4, r11)
            android.os.Bundle r4 = r13.f12040
            if (r4 != 0) goto L14b
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r13.f12040 = r4
        L14b:
            android.os.Bundle r4 = r13.f12040
            r4.putBundle(r9, r5)
            r0.putBundle(r9, r10)
            goto L168
        L154:
            java.lang.Integer.toString(r8)
            java.lang.Object r13 = r4.get(r8)
            if (r13 == 0) goto L162
            p000.C1080.m7264()
        L160:
            r13 = 0
            return r13
        L162:
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            throw r6
        L168:
            android.os.Bundle r0 = r13.f12040
            r1.setExtras(r0)
            r1.setRemoteInputHistory(r6)
            r1.setBadgeIconType(r8)
            r1.setSettingsText(r6)
            r1.setShortcutId(r6)
            r4 = 0
            r1.setTimeoutAfter(r4)
            r1.setGroupAlertBehavior(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L196
            android.app.Notification$Builder r0 = r1.setSound(r6)
            android.app.Notification$Builder r0 = r0.setDefaults(r8)
            android.app.Notification$Builder r0 = r0.setLights(r8, r8, r8)
            r0.setVibrate(r6)
        L196:
            java.util.ArrayList r0 = r13.f12032
            java.util.Iterator r0 = r0.iterator()
            boolean r3 = r0.hasNext()
            if (r3 != 0) goto L1d9
            boolean r0 = r13.f12042
            r1.setAllowSystemGeneratedContextualActions(r0)
            r1.setBubbleMetadata(r6)
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 36
            if (r0 < r3) goto L1b3
            p000.AbstractC1127.m7351(r1)
        L1b3:
            boolean r13 = r13.f12044
            if (r13 == 0) goto L1d4
            r1.setVibrate(r6)
            r1.setSound(r6)
            int r13 = r2.defaults
            r13 = r13 & (-4)
            r2.defaults = r13
            r1.setDefaults(r13)
            boolean r13 = android.text.TextUtils.isEmpty(r6)
            if (r13 == 0) goto L1d1
            java.lang.String r13 = "silent"
            r1.setGroup(r13)
        L1d1:
            r1.setGroupAlertBehavior(r7)
        L1d4:
            android.app.Notification r13 = r1.build()
            return r13
        L1d9:
            java.lang.Object r13 = r0.next()
            r13.getClass()
            p000.C1080.m7264()
            goto L160
        L1e5:
            java.lang.Object r13 = r4.next()
            r13.getClass()
            p000.C1080.m7264()
            goto L160
    }

    /* JADX INFO: renamed from: γ */
    public final void m6515(int r2) {
            r1 = this;
            android.app.Notification r1 = r1.f12043
            int r0 = r1.flags
            r2 = r2 | r0
            r1.flags = r2
            return
    }
}
