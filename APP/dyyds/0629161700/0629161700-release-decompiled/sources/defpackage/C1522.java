package defpackage;

/* JADX INFO: renamed from: ᛸᛶᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1522 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f6712;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final java.lang.String f6713;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final android.app.Notification f6714;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public int f6715;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public java.lang.CharSequence f6716;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final java.util.ArrayList f6717;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.ArrayList f6718;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.ArrayList f6719;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final android.content.Context f6720;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public android.os.Bundle f6721;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.util.ArrayList f6722;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public java.lang.CharSequence f6723;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f6724;

    public C1522(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f6722 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f6719 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f6718 = r0
            android.app.Notification r0 = new android.app.Notification
            r0.<init>()
            r1.f6714 = r0
            r1.f6720 = r2
            r1.f6713 = r3
            long r2 = java.lang.System.currentTimeMillis()
            r0.when = r2
            r2 = -1
            r0.audioStreamType = r2
            r2 = 0
            r1.f6724 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f6717 = r2
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static java.lang.CharSequence m2769(java.lang.String r2) {
            int r0 = r2.length()
            r1 = 5120(0x1400, float:7.175E-42)
            if (r0 <= r1) goto Ld
            r0 = 0
            java.lang.CharSequence r2 = r2.subSequence(r0, r1)
        Ld:
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m2770(java.lang.String r1) {
            r0 = this;
            java.lang.CharSequence r1 = m2769(r1)
            r0.f6716 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m2771(java.lang.String r2, android.app.PendingIntent r3) {
            r1 = this;
            ᲈᲁᲇᲁ r0 = new ᲈᲁᲇᲁ
            r0.<init>(r2, r3)
            java.util.ArrayList r1 = r1.f6722
            r1.add(r0)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final android.app.Notification m2772() {
            r19 = this;
            r0 = r19
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            android.app.Notification$Builder r2 = new android.app.Notification$Builder
            android.content.Context r3 = r0.f6720
            java.lang.String r4 = r0.f6713
            r2.<init>(r3, r4)
            android.app.Notification r3 = r0.f6714
            long r5 = r3.when
            android.app.Notification$Builder r5 = r2.setWhen(r5)
            int r6 = r3.icon
            int r7 = r3.iconLevel
            android.app.Notification$Builder r5 = r5.setSmallIcon(r6, r7)
            android.widget.RemoteViews r6 = r3.contentView
            android.app.Notification$Builder r5 = r5.setContent(r6)
            java.lang.CharSequence r6 = r3.tickerText
            r7 = 0
            android.app.Notification$Builder r5 = r5.setTicker(r6, r7)
            long[] r6 = r3.vibrate
            android.app.Notification$Builder r5 = r5.setVibrate(r6)
            int r6 = r3.ledARGB
            int r8 = r3.ledOnMS
            int r9 = r3.ledOffMS
            android.app.Notification$Builder r5 = r5.setLights(r6, r8, r9)
            int r6 = r3.flags
            r8 = 2
            r6 = r6 & r8
            r9 = 1
            r10 = 0
            if (r6 == 0) goto L47
            r6 = r9
            goto L48
        L47:
            r6 = r10
        L48:
            android.app.Notification$Builder r5 = r5.setOngoing(r6)
            int r6 = r3.flags
            r6 = r6 & 8
            if (r6 == 0) goto L54
            r6 = r9
            goto L55
        L54:
            r6 = r10
        L55:
            android.app.Notification$Builder r5 = r5.setOnlyAlertOnce(r6)
            int r6 = r3.flags
            r6 = r6 & 16
            if (r6 == 0) goto L61
            r6 = r9
            goto L62
        L61:
            r6 = r10
        L62:
            android.app.Notification$Builder r5 = r5.setAutoCancel(r6)
            int r6 = r3.defaults
            android.app.Notification$Builder r5 = r5.setDefaults(r6)
            java.lang.CharSequence r6 = r0.f6716
            android.app.Notification$Builder r5 = r5.setContentTitle(r6)
            java.lang.CharSequence r6 = r0.f6723
            android.app.Notification$Builder r5 = r5.setContentText(r6)
            android.app.Notification$Builder r5 = r5.setContentInfo(r7)
            android.app.Notification$Builder r5 = r5.setContentIntent(r7)
            android.app.PendingIntent r6 = r3.deleteIntent
            android.app.Notification$Builder r5 = r5.setDeleteIntent(r6)
            int r6 = r3.flags
            r6 = r6 & 128(0x80, float:1.8E-43)
            if (r6 == 0) goto L8e
            r6 = r9
            goto L8f
        L8e:
            r6 = r10
        L8f:
            android.app.Notification$Builder r5 = r5.setFullScreenIntent(r7, r6)
            android.app.Notification$Builder r5 = r5.setNumber(r10)
            int r6 = r0.f6712
            int r11 = r0.f6715
            r5.setProgress(r6, r11, r10)
            r2.setLargeIcon(r7)
            android.app.Notification$Builder r5 = r2.setSubText(r7)
            android.app.Notification$Builder r5 = r5.setUsesChronometer(r10)
            int r6 = r0.f6724
            r5.setPriority(r6)
            java.util.ArrayList r5 = r0.f6722
            java.util.Iterator r5 = r5.iterator()
        Lb4:
            boolean r6 = r5.hasNext()
            java.lang.String r11 = "android.support.allowGeneratedReplies"
            if (r6 == 0) goto L1d0
            java.lang.Object r6 = r5.next()
            ᲈᲁᲇᲁ r6 = (defpackage.C2345) r6
            androidx.core.graphics.drawable.IconCompat r12 = r6.f10106
            if (r12 != 0) goto Ld0
            int r13 = r6.f10103
            if (r13 == 0) goto Ld0
            androidx.core.graphics.drawable.IconCompat r12 = androidx.core.graphics.drawable.IconCompat.m83(r13)
            r6.f10106 = r12
        Ld0:
            android.os.Bundle r13 = r6.f10105
            android.app.Notification$Action$Builder r14 = new android.app.Notification$Action$Builder
            if (r12 == 0) goto L184
            int r15 = r12.f238
            r16 = r7
            r7 = -1
            switch(r15) {
                case -1: goto L17d;
                case 0: goto Lde;
                case 1: goto L162;
                case 2: goto L12c;
                case 3: goto L11d;
                case 4: goto L114;
                case 5: goto L10b;
                case 6: goto Le4;
                default: goto Lde;
            }
        Lde:
            java.lang.String r0 = "Unknown type"
            defpackage.C2264.m3684(r0)
            return r16
        Le4:
            if (r15 != r7) goto Lef
            java.lang.Object r7 = r12.f240
            android.graphics.drawable.Icon r7 = (android.graphics.drawable.Icon) r7
            android.net.Uri r7 = r7.getUri()
            goto L104
        Lef:
            r7 = 4
            if (r15 == r7) goto Lfc
            r7 = 6
            if (r15 != r7) goto Lf6
            goto Lfc
        Lf6:
            java.lang.String r0 = "called getUri() on "
            defpackage.C2264.m3671(r12, r0)
            return r16
        Lfc:
            java.lang.Object r7 = r12.f240
            java.lang.String r7 = (java.lang.String) r7
            android.net.Uri r7 = android.net.Uri.parse(r7)
        L104:
            android.graphics.drawable.Icon r7 = android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(r7)
        L108:
            r17 = r10
            goto L16c
        L10b:
            java.lang.Object r7 = r12.f240
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            android.graphics.drawable.Icon r7 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r7)
            goto L108
        L114:
            java.lang.Object r7 = r12.f240
            java.lang.String r7 = (java.lang.String) r7
            android.graphics.drawable.Icon r7 = android.graphics.drawable.Icon.createWithContentUri(r7)
            goto L108
        L11d:
            java.lang.Object r7 = r12.f240
            byte[] r7 = (byte[]) r7
            int r15 = r12.f235
            r17 = r10
            int r10 = r12.f241
            android.graphics.drawable.Icon r7 = android.graphics.drawable.Icon.createWithData(r7, r15, r10)
            goto L16c
        L12c:
            r17 = r10
            if (r15 != r7) goto L139
            java.lang.Object r7 = r12.f240
            android.graphics.drawable.Icon r7 = (android.graphics.drawable.Icon) r7
            java.lang.String r7 = r7.getResPackage()
            goto L155
        L139:
            if (r15 != r8) goto L15c
            java.lang.String r10 = r12.f239
            if (r10 == 0) goto L149
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L146
            goto L149
        L146:
            java.lang.String r7 = r12.f239
            goto L155
        L149:
            java.lang.Object r10 = r12.f240
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r15 = ":"
            java.lang.String[] r7 = r10.split(r15, r7)
            r7 = r7[r17]
        L155:
            int r10 = r12.f235
            android.graphics.drawable.Icon r7 = android.graphics.drawable.Icon.createWithResource(r7, r10)
            goto L16c
        L15c:
            java.lang.String r0 = "called getResPackage() on "
            defpackage.C2264.m3671(r12, r0)
            return r16
        L162:
            r17 = r10
            java.lang.Object r7 = r12.f240
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            android.graphics.drawable.Icon r7 = android.graphics.drawable.Icon.createWithBitmap(r7)
        L16c:
            android.content.res.ColorStateList r10 = r12.f242
            if (r10 == 0) goto L173
            r7.setTintList(r10)
        L173:
            android.graphics.PorterDuff$Mode r10 = r12.f233
            android.graphics.PorterDuff$Mode r12 = androidx.core.graphics.drawable.IconCompat.f232
            if (r10 == r12) goto L188
            r7.setTintMode(r10)
            goto L188
        L17d:
            r17 = r10
            java.lang.Object r7 = r12.f240
            android.graphics.drawable.Icon r7 = (android.graphics.drawable.Icon) r7
            goto L188
        L184:
            r16 = r7
            r17 = r10
        L188:
            java.lang.CharSequence r10 = r6.f10102
            android.app.PendingIntent r12 = r6.f10107
            r14.<init>(r7, r10, r12)
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>(r13)
            r7.putBoolean(r11, r9)
            r14.setAllowGeneratedReplies(r9)
            java.lang.String r10 = "android.support.action.semanticAction"
            r11 = r17
            r7.putInt(r10, r11)
            r14.setSemanticAction(r11)
            r14.setContextual(r11)
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 31
            if (r10 < r11) goto L1b0
            defpackage.AbstractC0557.m1343(r14)
        L1b0:
            r11 = 37
            if (r10 < r11) goto L1ba
            defpackage.AbstractC1829.m3225(r14)
            defpackage.AbstractC1829.m3226(r14)
        L1ba:
            java.lang.String r10 = "android.support.action.showsUserInterface"
            boolean r6 = r6.f10104
            r7.putBoolean(r10, r6)
            r14.addExtras(r7)
            android.app.Notification$Action r6 = r14.build()
            r2.addAction(r6)
            r7 = r16
            r10 = 0
            goto Lb4
        L1d0:
            r16 = r7
            android.os.Bundle r5 = r0.f6721
            if (r5 == 0) goto L1d9
            r1.putAll(r5)
        L1d9:
            r2.setShowWhen(r9)
            r5 = 0
            r2.setLocalOnly(r5)
            r6 = r16
            r2.setGroup(r6)
            r2.setSortKey(r6)
            r2.setGroupSummary(r5)
            r2.setCategory(r6)
            r2.setColor(r5)
            r2.setVisibility(r5)
            r2.setPublicVersion(r6)
            android.net.Uri r5 = r3.sound
            android.media.AudioAttributes r3 = r3.audioAttributes
            r2.setSound(r5, r3)
            java.util.ArrayList r3 = r0.f6717
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L21a
            java.util.Iterator r3 = r3.iterator()
        L20a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L21a
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            r2.addPerson(r5)
            goto L20a
        L21a:
            java.util.ArrayList r3 = r0.f6718
            int r5 = r3.size()
            if (r5 <= 0) goto L2cb
            android.os.Bundle r5 = r0.f6721
            if (r5 != 0) goto L22d
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r0.f6721 = r5
        L22d:
            java.lang.String r6 = "android.car.EXTENSIONS"
            android.os.Bundle r5 = r5.getBundle(r6)
            if (r5 != 0) goto L23a
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
        L23a:
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>(r5)
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            r10 = 0
        L245:
            int r12 = r3.size()
            if (r10 >= r12) goto L2b2
            java.lang.String r12 = java.lang.Integer.toString(r10)
            java.lang.Object r13 = r3.get(r10)
            ᲈᲁᲇᲁ r13 = (defpackage.C2345) r13
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>()
            androidx.core.graphics.drawable.IconCompat r15 = r13.f10106
            if (r15 != 0) goto L268
            int r9 = r13.f10103
            if (r9 == 0) goto L268
            androidx.core.graphics.drawable.IconCompat r15 = androidx.core.graphics.drawable.IconCompat.m83(r9)
            r13.f10106 = r15
        L268:
            android.os.Bundle r9 = r13.f10105
            if (r15 == 0) goto L273
            int r15 = r15.m84()
        L270:
            r18 = r3
            goto L275
        L273:
            r15 = 0
            goto L270
        L275:
            java.lang.String r3 = "icon"
            r14.putInt(r3, r15)
            java.lang.String r3 = "title"
            java.lang.CharSequence r15 = r13.f10102
            r14.putCharSequence(r3, r15)
            java.lang.String r3 = "actionIntent"
            android.app.PendingIntent r15 = r13.f10107
            r14.putParcelable(r3, r15)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>(r9)
            r9 = 1
            r3.putBoolean(r11, r9)
            java.lang.String r9 = "extras"
            r14.putBundle(r9, r3)
            java.lang.String r3 = "remoteInputs"
            r9 = 0
            r14.putParcelableArray(r3, r9)
            java.lang.String r3 = "showsUserInterface"
            boolean r9 = r13.f10104
            r14.putBoolean(r3, r9)
            java.lang.String r3 = "semanticAction"
            r9 = 0
            r14.putInt(r3, r9)
            r8.putBundle(r12, r14)
            int r10 = r10 + 1
            r3 = r18
            r9 = 1
            goto L245
        L2b2:
            java.lang.String r3 = "invisible_actions"
            r5.putBundle(r3, r8)
            r7.putBundle(r3, r8)
            android.os.Bundle r3 = r0.f6721
            if (r3 != 0) goto L2c5
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r0.f6721 = r3
        L2c5:
            r3.putBundle(r6, r5)
            r1.putBundle(r6, r7)
        L2cb:
            android.os.Bundle r1 = r0.f6721
            r2.setExtras(r1)
            r6 = 0
            r2.setRemoteInputHistory(r6)
            r5 = 0
            r2.setBadgeIconType(r5)
            r2.setSettingsText(r6)
            r2.setShortcutId(r6)
            r7 = 0
            r2.setTimeoutAfter(r7)
            r2.setGroupAlertBehavior(r5)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L2fb
            android.app.Notification$Builder r1 = r2.setSound(r6)
            android.app.Notification$Builder r1 = r1.setDefaults(r5)
            android.app.Notification$Builder r1 = r1.setLights(r5, r5, r5)
            r1.setVibrate(r6)
        L2fb:
            java.util.ArrayList r0 = r0.f6719
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L31c
            r9 = 1
            r2.setAllowSystemGeneratedContextualActions(r9)
            r2.setBubbleMetadata(r6)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 36
            if (r0 < r1) goto L317
            defpackage.AbstractC1388.m2555(r2)
        L317:
            android.app.Notification r0 = r2.build()
            return r0
        L31c:
            java.lang.Object r0 = r0.next()
            r0.getClass()
            defpackage.C2264.m3679()
            r16 = 0
            return r16
    }
}
