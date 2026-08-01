package androidx.core.app;

/* JADX INFO: loaded from: classes2.dex */
class NotificationCompatBuilder implements androidx.core.app.NotificationBuilderWithBuilderAccessor {
    private final java.util.List<android.os.Bundle> mActionExtrasList;
    private android.widget.RemoteViews mBigContentView;
    private final android.app.Notification.Builder mBuilder;
    private final androidx.core.app.NotificationCompat.Builder mBuilderCompat;
    private android.widget.RemoteViews mContentView;
    private final android.content.Context mContext;
    private final android.os.Bundle mExtras;
    private int mGroupAlertBehavior;
    private android.widget.RemoteViews mHeadsUpContentView;

    static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification build(android.app.Notification.Builder r1) {
                android.app.Notification r0 = r1.build()
                return r0
        }

        static android.app.Notification.Builder setPriority(android.app.Notification.Builder r1, int r2) {
                android.app.Notification$Builder r0 = r1.setPriority(r2)
                return r0
        }

        static android.app.Notification.Builder setSubText(android.app.Notification.Builder r1, java.lang.CharSequence r2) {
                android.app.Notification$Builder r0 = r1.setSubText(r2)
                return r0
        }

        static android.app.Notification.Builder setUsesChronometer(android.app.Notification.Builder r1, boolean r2) {
                android.app.Notification$Builder r0 = r1.setUsesChronometer(r2)
                return r0
        }
    }

    static class Api17Impl {
        private Api17Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification.Builder setShowWhen(android.app.Notification.Builder r1, boolean r2) {
                android.app.Notification$Builder r0 = r1.setShowWhen(r2)
                return r0
        }
    }

    static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification.Builder setExtras(android.app.Notification.Builder r1, android.os.Bundle r2) {
                android.app.Notification$Builder r0 = r1.setExtras(r2)
                return r0
        }
    }

    static class Api20Impl {
        private Api20Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification.Builder addAction(android.app.Notification.Builder r1, android.app.Notification.Action r2) {
                android.app.Notification$Builder r0 = r1.addAction(r2)
                return r0
        }

        static android.app.Notification.Action.Builder addExtras(android.app.Notification.Action.Builder r1, android.os.Bundle r2) {
                android.app.Notification$Action$Builder r0 = r1.addExtras(r2)
                return r0
        }

        static android.app.Notification.Action.Builder addRemoteInput(android.app.Notification.Action.Builder r1, android.app.RemoteInput r2) {
                android.app.Notification$Action$Builder r0 = r1.addRemoteInput(r2)
                return r0
        }

        static android.app.Notification.Action build(android.app.Notification.Action.Builder r1) {
                android.app.Notification$Action r0 = r1.build()
                return r0
        }

        static android.app.Notification.Action.Builder createBuilder(int r1, java.lang.CharSequence r2, android.app.PendingIntent r3) {
                android.app.Notification$Action$Builder r0 = new android.app.Notification$Action$Builder
                r0.<init>(r1, r2, r3)
                return r0
        }

        static java.lang.String getGroup(android.app.Notification r1) {
                java.lang.String r0 = r1.getGroup()
                return r0
        }

        static android.app.Notification.Builder setGroup(android.app.Notification.Builder r1, java.lang.String r2) {
                android.app.Notification$Builder r0 = r1.setGroup(r2)
                return r0
        }

        static android.app.Notification.Builder setGroupSummary(android.app.Notification.Builder r1, boolean r2) {
                android.app.Notification$Builder r0 = r1.setGroupSummary(r2)
                return r0
        }

        static android.app.Notification.Builder setLocalOnly(android.app.Notification.Builder r1, boolean r2) {
                android.app.Notification$Builder r0 = r1.setLocalOnly(r2)
                return r0
        }

        static android.app.Notification.Builder setSortKey(android.app.Notification.Builder r1, java.lang.String r2) {
                android.app.Notification$Builder r0 = r1.setSortKey(r2)
                return r0
        }
    }

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification.Builder addPerson(android.app.Notification.Builder r1, java.lang.String r2) {
                android.app.Notification$Builder r0 = r1.addPerson(r2)
                return r0
        }

        static android.app.Notification.Builder setCategory(android.app.Notification.Builder r1, java.lang.String r2) {
                android.app.Notification$Builder r0 = r1.setCategory(r2)
                return r0
        }

        static android.app.Notification.Builder setColor(android.app.Notification.Builder r1, int r2) {
                android.app.Notification$Builder r0 = r1.setColor(r2)
                return r0
        }

        static android.app.Notification.Builder setPublicVersion(android.app.Notification.Builder r1, android.app.Notification r2) {
                android.app.Notification$Builder r0 = r1.setPublicVersion(r2)
                return r0
        }

        static android.app.Notification.Builder setSound(android.app.Notification.Builder r1, android.net.Uri r2, java.lang.Object r3) {
                r0 = r3
                android.media.AudioAttributes r0 = (android.media.AudioAttributes) r0
                android.app.Notification$Builder r0 = r1.setSound(r2, r0)
                return r0
        }

        static android.app.Notification.Builder setVisibility(android.app.Notification.Builder r1, int r2) {
                android.app.Notification$Builder r0 = r1.setVisibility(r2)
                return r0
        }
    }

    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification.Action.Builder createBuilder(android.graphics.drawable.Icon r1, java.lang.CharSequence r2, android.app.PendingIntent r3) {
                android.app.Notification$Action$Builder r0 = new android.app.Notification$Action$Builder
                r0.<init>(r1, r2, r3)
                return r0
        }

        static android.app.Notification.Builder setLargeIcon(android.app.Notification.Builder r1, android.graphics.drawable.Icon r2) {
                android.app.Notification$Builder r0 = r1.setLargeIcon(r2)
                return r0
        }

        static android.app.Notification.Builder setSmallIcon(android.app.Notification.Builder r1, java.lang.Object r2) {
                r0 = r2
                android.graphics.drawable.Icon r0 = (android.graphics.drawable.Icon) r0
                android.app.Notification$Builder r0 = r1.setSmallIcon(r0)
                return r0
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification.Action.Builder setAllowGeneratedReplies(android.app.Notification.Action.Builder r1, boolean r2) {
                android.app.Notification$Action$Builder r0 = r1.setAllowGeneratedReplies(r2)
                return r0
        }

        static android.app.Notification.Builder setCustomBigContentView(android.app.Notification.Builder r1, android.widget.RemoteViews r2) {
                android.app.Notification$Builder r0 = r1.setCustomBigContentView(r2)
                return r0
        }

        static android.app.Notification.Builder setCustomContentView(android.app.Notification.Builder r1, android.widget.RemoteViews r2) {
                android.app.Notification$Builder r0 = r1.setCustomContentView(r2)
                return r0
        }

        static android.app.Notification.Builder setCustomHeadsUpContentView(android.app.Notification.Builder r1, android.widget.RemoteViews r2) {
                android.app.Notification$Builder r0 = r1.setCustomHeadsUpContentView(r2)
                return r0
        }

        static android.app.Notification.Builder setRemoteInputHistory(android.app.Notification.Builder r1, java.lang.CharSequence[] r2) {
                android.app.Notification$Builder r0 = r1.setRemoteInputHistory(r2)
                return r0
        }
    }

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification.Builder createBuilder(android.content.Context r1, java.lang.String r2) {
                android.app.Notification$Builder r0 = new android.app.Notification$Builder
                r0.<init>(r1, r2)
                return r0
        }

        static android.app.Notification.Builder setBadgeIconType(android.app.Notification.Builder r1, int r2) {
                android.app.Notification$Builder r0 = r1.setBadgeIconType(r2)
                return r0
        }

        static android.app.Notification.Builder setColorized(android.app.Notification.Builder r1, boolean r2) {
                android.app.Notification$Builder r0 = r1.setColorized(r2)
                return r0
        }

        static android.app.Notification.Builder setGroupAlertBehavior(android.app.Notification.Builder r1, int r2) {
                android.app.Notification$Builder r0 = r1.setGroupAlertBehavior(r2)
                return r0
        }

        static android.app.Notification.Builder setSettingsText(android.app.Notification.Builder r1, java.lang.CharSequence r2) {
                android.app.Notification$Builder r0 = r1.setSettingsText(r2)
                return r0
        }

        static android.app.Notification.Builder setShortcutId(android.app.Notification.Builder r1, java.lang.String r2) {
                android.app.Notification$Builder r0 = r1.setShortcutId(r2)
                return r0
        }

        static android.app.Notification.Builder setTimeoutAfter(android.app.Notification.Builder r1, long r2) {
                android.app.Notification$Builder r0 = r1.setTimeoutAfter(r2)
                return r0
        }
    }

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification.Builder addPerson(android.app.Notification.Builder r1, android.app.Person r2) {
                android.app.Notification$Builder r0 = r1.addPerson(r2)
                return r0
        }

        static android.app.Notification.Action.Builder setSemanticAction(android.app.Notification.Action.Builder r1, int r2) {
                android.app.Notification$Action$Builder r0 = r1.setSemanticAction(r2)
                return r0
        }
    }

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification.Builder setAllowSystemGeneratedContextualActions(android.app.Notification.Builder r1, boolean r2) {
                android.app.Notification$Builder r0 = r1.setAllowSystemGeneratedContextualActions(r2)
                return r0
        }

        static android.app.Notification.Builder setBubbleMetadata(android.app.Notification.Builder r1, android.app.Notification.BubbleMetadata r2) {
                android.app.Notification$Builder r0 = r1.setBubbleMetadata(r2)
                return r0
        }

        static android.app.Notification.Action.Builder setContextual(android.app.Notification.Action.Builder r1, boolean r2) {
                android.app.Notification$Action$Builder r0 = r1.setContextual(r2)
                return r0
        }

        static android.app.Notification.Builder setLocusId(android.app.Notification.Builder r1, java.lang.Object r2) {
                r0 = r2
                android.content.LocusId r0 = (android.content.LocusId) r0
                android.app.Notification$Builder r0 = r1.setLocusId(r0)
                return r0
        }
    }

    static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.Notification.Action.Builder setAuthenticationRequired(android.app.Notification.Action.Builder r1, boolean r2) {
                android.app.Notification$Action$Builder r0 = r1.setAuthenticationRequired(r2)
                return r0
        }

        static android.app.Notification.Builder setForegroundServiceBehavior(android.app.Notification.Builder r1, int r2) {
                android.app.Notification$Builder r0 = r1.setForegroundServiceBehavior(r2)
                return r0
        }
    }

    NotificationCompatBuilder(androidx.core.app.NotificationCompat.Builder r15) {
            r14 = this;
            r14.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r14.mActionExtrasList = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r14.mExtras = r0
            r14.mBuilderCompat = r15
            android.content.Context r0 = r15.mContext
            r14.mContext = r0
            android.content.Context r0 = r15.mContext
            java.lang.String r1 = r15.mChannelId
            android.app.Notification$Builder r0 = androidx.core.app.NotificationCompatBuilder.Api26Impl.createBuilder(r0, r1)
            r14.mBuilder = r0
            android.app.Notification r0 = r15.mNotification
            android.app.Notification$Builder r1 = r14.mBuilder
            long r2 = r0.when
            android.app.Notification$Builder r1 = r1.setWhen(r2)
            int r2 = r0.icon
            int r3 = r0.iconLevel
            android.app.Notification$Builder r1 = r1.setSmallIcon(r2, r3)
            android.widget.RemoteViews r2 = r0.contentView
            android.app.Notification$Builder r1 = r1.setContent(r2)
            java.lang.CharSequence r2 = r0.tickerText
            android.widget.RemoteViews r3 = r15.mTickerView
            android.app.Notification$Builder r1 = r1.setTicker(r2, r3)
            long[] r2 = r0.vibrate
            android.app.Notification$Builder r1 = r1.setVibrate(r2)
            int r2 = r0.ledARGB
            int r3 = r0.ledOnMS
            int r4 = r0.ledOffMS
            android.app.Notification$Builder r1 = r1.setLights(r2, r3, r4)
            int r2 = r0.flags
            r3 = 2
            r2 = r2 & r3
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L5c
            r2 = r4
            goto L5d
        L5c:
            r2 = r5
        L5d:
            android.app.Notification$Builder r1 = r1.setOngoing(r2)
            int r2 = r0.flags
            r2 = r2 & 8
            if (r2 == 0) goto L69
            r2 = r4
            goto L6a
        L69:
            r2 = r5
        L6a:
            android.app.Notification$Builder r1 = r1.setOnlyAlertOnce(r2)
            int r2 = r0.flags
            r2 = r2 & 16
            if (r2 == 0) goto L76
            r2 = r4
            goto L77
        L76:
            r2 = r5
        L77:
            android.app.Notification$Builder r1 = r1.setAutoCancel(r2)
            int r2 = r0.defaults
            android.app.Notification$Builder r1 = r1.setDefaults(r2)
            java.lang.CharSequence r2 = r15.mContentTitle
            android.app.Notification$Builder r1 = r1.setContentTitle(r2)
            java.lang.CharSequence r2 = r15.mContentText
            android.app.Notification$Builder r1 = r1.setContentText(r2)
            java.lang.CharSequence r2 = r15.mContentInfo
            android.app.Notification$Builder r1 = r1.setContentInfo(r2)
            android.app.PendingIntent r2 = r15.mContentIntent
            android.app.Notification$Builder r1 = r1.setContentIntent(r2)
            android.app.PendingIntent r2 = r0.deleteIntent
            android.app.Notification$Builder r1 = r1.setDeleteIntent(r2)
            android.app.PendingIntent r2 = r15.mFullScreenIntent
            int r6 = r0.flags
            r6 = r6 & 128(0x80, float:1.8E-43)
            if (r6 == 0) goto La9
            r6 = r4
            goto Laa
        La9:
            r6 = r5
        Laa:
            android.app.Notification$Builder r1 = r1.setFullScreenIntent(r2, r6)
            int r2 = r15.mNumber
            android.app.Notification$Builder r1 = r1.setNumber(r2)
            int r2 = r15.mProgressMax
            int r6 = r15.mProgress
            boolean r7 = r15.mProgressIndeterminate
            r1.setProgress(r2, r6, r7)
            android.app.Notification$Builder r1 = r14.mBuilder
            androidx.core.graphics.drawable.IconCompat r2 = r15.mLargeIcon
            r6 = 0
            if (r2 != 0) goto Lc7
            r2 = r6
            goto Lcf
        Lc7:
            androidx.core.graphics.drawable.IconCompat r2 = r15.mLargeIcon
            android.content.Context r7 = r14.mContext
            android.graphics.drawable.Icon r2 = r2.toIcon(r7)
        Lcf:
            androidx.core.app.NotificationCompatBuilder.Api23Impl.setLargeIcon(r1, r2)
            android.app.Notification$Builder r1 = r14.mBuilder
            java.lang.CharSequence r2 = r15.mSubText
            android.app.Notification$Builder r1 = androidx.core.app.NotificationCompatBuilder.Api16Impl.setSubText(r1, r2)
            boolean r2 = r15.mUseChronometer
            android.app.Notification$Builder r1 = androidx.core.app.NotificationCompatBuilder.Api16Impl.setUsesChronometer(r1, r2)
            int r2 = r15.mPriority
            androidx.core.app.NotificationCompatBuilder.Api16Impl.setPriority(r1, r2)
            androidx.core.app.NotificationCompat$Style r1 = r15.mStyle
            boolean r1 = r1 instanceof androidx.core.app.NotificationCompat.CallStyle
            if (r1 == 0) goto L10a
            androidx.core.app.NotificationCompat$Style r1 = r15.mStyle
            androidx.core.app.NotificationCompat$CallStyle r1 = (androidx.core.app.NotificationCompat.CallStyle) r1
            java.util.ArrayList r1 = r1.getActionsListWithSystemActions()
            java.util.Iterator r2 = r1.iterator()
        Lf9:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L109
            java.lang.Object r7 = r2.next()
            androidx.core.app.NotificationCompat$Action r7 = (androidx.core.app.NotificationCompat.Action) r7
            r14.addAction(r7)
            goto Lf9
        L109:
            goto L120
        L10a:
            java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r1 = r15.mActions
            java.util.Iterator r1 = r1.iterator()
        L110:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L120
            java.lang.Object r2 = r1.next()
            androidx.core.app.NotificationCompat$Action r2 = (androidx.core.app.NotificationCompat.Action) r2
            r14.addAction(r2)
            goto L110
        L120:
            android.os.Bundle r1 = r15.mExtras
            if (r1 == 0) goto L12b
            android.os.Bundle r1 = r14.mExtras
            android.os.Bundle r2 = r15.mExtras
            r1.putAll(r2)
        L12b:
            android.widget.RemoteViews r1 = r15.mContentView
            r14.mContentView = r1
            android.widget.RemoteViews r1 = r15.mBigContentView
            r14.mBigContentView = r1
            android.app.Notification$Builder r1 = r14.mBuilder
            boolean r2 = r15.mShowWhen
            androidx.core.app.NotificationCompatBuilder.Api17Impl.setShowWhen(r1, r2)
            android.app.Notification$Builder r1 = r14.mBuilder
            boolean r2 = r15.mLocalOnly
            androidx.core.app.NotificationCompatBuilder.Api20Impl.setLocalOnly(r1, r2)
            android.app.Notification$Builder r1 = r14.mBuilder
            java.lang.String r2 = r15.mGroupKey
            androidx.core.app.NotificationCompatBuilder.Api20Impl.setGroup(r1, r2)
            android.app.Notification$Builder r1 = r14.mBuilder
            java.lang.String r2 = r15.mSortKey
            androidx.core.app.NotificationCompatBuilder.Api20Impl.setSortKey(r1, r2)
            android.app.Notification$Builder r1 = r14.mBuilder
            boolean r2 = r15.mGroupSummary
            androidx.core.app.NotificationCompatBuilder.Api20Impl.setGroupSummary(r1, r2)
            int r1 = r15.mGroupAlertBehavior
            r14.mGroupAlertBehavior = r1
            android.app.Notification$Builder r1 = r14.mBuilder
            java.lang.String r2 = r15.mCategory
            androidx.core.app.NotificationCompatBuilder.Api21Impl.setCategory(r1, r2)
            android.app.Notification$Builder r1 = r14.mBuilder
            int r2 = r15.mColor
            androidx.core.app.NotificationCompatBuilder.Api21Impl.setColor(r1, r2)
            android.app.Notification$Builder r1 = r14.mBuilder
            int r2 = r15.mVisibility
            androidx.core.app.NotificationCompatBuilder.Api21Impl.setVisibility(r1, r2)
            android.app.Notification$Builder r1 = r14.mBuilder
            android.app.Notification r2 = r15.mPublicVersion
            androidx.core.app.NotificationCompatBuilder.Api21Impl.setPublicVersion(r1, r2)
            android.app.Notification$Builder r1 = r14.mBuilder
            android.net.Uri r2 = r0.sound
            android.media.AudioAttributes r7 = r0.audioAttributes
            androidx.core.app.NotificationCompatBuilder.Api21Impl.setSound(r1, r2, r7)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 >= r2) goto L198
            java.util.ArrayList<androidx.core.app.Person> r1 = r15.mPersonList
            java.util.List r1 = getPeople(r1)
            java.util.ArrayList<java.lang.String> r7 = r15.mPeople
            java.util.List r1 = combineLists(r1, r7)
            goto L19a
        L198:
            java.util.ArrayList<java.lang.String> r1 = r15.mPeople
        L19a:
            if (r1 == 0) goto L1b8
            boolean r7 = r1.isEmpty()
            if (r7 != 0) goto L1b8
            java.util.Iterator r7 = r1.iterator()
        L1a6:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L1b8
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            android.app.Notification$Builder r9 = r14.mBuilder
            androidx.core.app.NotificationCompatBuilder.Api21Impl.addPerson(r9, r8)
            goto L1a6
        L1b8:
            android.widget.RemoteViews r7 = r15.mHeadsUpContentView
            r14.mHeadsUpContentView = r7
            java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r7 = r15.mInvisibleActions
            int r7 = r7.size()
            if (r7 <= 0) goto L215
        L1c5:
            android.os.Bundle r7 = r15.getExtras()
            java.lang.String r8 = "android.car.EXTENSIONS"
            android.os.Bundle r7 = r7.getBundle(r8)
            if (r7 != 0) goto L1d7
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            r7 = r9
        L1d7:
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>(r7)
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            r11 = 0
        L1e2:
            java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r12 = r15.mInvisibleActions
            int r12 = r12.size()
            if (r11 >= r12) goto L201
        L1eb:
            java.lang.String r12 = java.lang.Integer.toString(r11)
            java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r13 = r15.mInvisibleActions
            java.lang.Object r13 = r13.get(r11)
            androidx.core.app.NotificationCompat$Action r13 = (androidx.core.app.NotificationCompat.Action) r13
            android.os.Bundle r13 = androidx.core.app.NotificationCompatJellybean.getBundleForAction(r13)
            r10.putBundle(r12, r13)
            int r11 = r11 + 1
            goto L1e2
        L201:
            java.lang.String r11 = "invisible_actions"
            r7.putBundle(r11, r10)
            r9.putBundle(r11, r10)
            android.os.Bundle r11 = r15.getExtras()
            r11.putBundle(r8, r7)
            android.os.Bundle r11 = r14.mExtras
            r11.putBundle(r8, r9)
        L215:
            java.lang.Object r1 = r15.mSmallIcon
            if (r1 == 0) goto L221
            android.app.Notification$Builder r1 = r14.mBuilder
            java.lang.Object r7 = r15.mSmallIcon
            androidx.core.app.NotificationCompatBuilder.Api23Impl.setSmallIcon(r1, r7)
        L221:
            android.app.Notification$Builder r1 = r14.mBuilder
            android.os.Bundle r7 = r15.mExtras
            androidx.core.app.NotificationCompatBuilder.Api19Impl.setExtras(r1, r7)
            android.app.Notification$Builder r1 = r14.mBuilder
            java.lang.CharSequence[] r7 = r15.mRemoteInputHistory
            androidx.core.app.NotificationCompatBuilder.Api24Impl.setRemoteInputHistory(r1, r7)
            android.widget.RemoteViews r1 = r15.mContentView
            if (r1 == 0) goto L23b
            android.app.Notification$Builder r1 = r14.mBuilder
            android.widget.RemoteViews r7 = r15.mContentView
            androidx.core.app.NotificationCompatBuilder.Api24Impl.setCustomContentView(r1, r7)
        L23b:
            android.widget.RemoteViews r1 = r15.mBigContentView
            if (r1 == 0) goto L246
            android.app.Notification$Builder r1 = r14.mBuilder
            android.widget.RemoteViews r7 = r15.mBigContentView
            androidx.core.app.NotificationCompatBuilder.Api24Impl.setCustomBigContentView(r1, r7)
        L246:
            android.widget.RemoteViews r1 = r15.mHeadsUpContentView
            if (r1 == 0) goto L251
            android.app.Notification$Builder r1 = r14.mBuilder
            android.widget.RemoteViews r7 = r15.mHeadsUpContentView
            androidx.core.app.NotificationCompatBuilder.Api24Impl.setCustomHeadsUpContentView(r1, r7)
        L251:
            android.app.Notification$Builder r1 = r14.mBuilder
            int r7 = r15.mBadgeIcon
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setBadgeIconType(r1, r7)
            android.app.Notification$Builder r1 = r14.mBuilder
            java.lang.CharSequence r7 = r15.mSettingsText
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setSettingsText(r1, r7)
            android.app.Notification$Builder r1 = r14.mBuilder
            java.lang.String r7 = r15.mShortcutId
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setShortcutId(r1, r7)
            android.app.Notification$Builder r1 = r14.mBuilder
            long r7 = r15.mTimeout
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setTimeoutAfter(r1, r7)
            android.app.Notification$Builder r1 = r14.mBuilder
            int r7 = r15.mGroupAlertBehavior
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setGroupAlertBehavior(r1, r7)
            boolean r1 = r15.mColorizedSet
            if (r1 == 0) goto L280
            android.app.Notification$Builder r1 = r14.mBuilder
            boolean r7 = r15.mColorized
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setColorized(r1, r7)
        L280:
            java.lang.String r1 = r15.mChannelId
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L299
            android.app.Notification$Builder r1 = r14.mBuilder
            android.app.Notification$Builder r1 = r1.setSound(r6)
            android.app.Notification$Builder r1 = r1.setDefaults(r5)
            android.app.Notification$Builder r1 = r1.setLights(r5, r5, r5)
            r1.setVibrate(r6)
        L299:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r2) goto L2b9
            java.util.ArrayList<androidx.core.app.Person> r1 = r15.mPersonList
            java.util.Iterator r1 = r1.iterator()
        L2a3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2b9
            java.lang.Object r2 = r1.next()
            androidx.core.app.Person r2 = (androidx.core.app.Person) r2
            android.app.Notification$Builder r5 = r14.mBuilder
            android.app.Person r7 = r2.toAndroidPerson()
            androidx.core.app.NotificationCompatBuilder.Api28Impl.addPerson(r5, r7)
            goto L2a3
        L2b9:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L2e0
            android.app.Notification$Builder r1 = r14.mBuilder
            boolean r2 = r15.mAllowSystemGeneratedContextualActions
            androidx.core.app.NotificationCompatBuilder.Api29Impl.setAllowSystemGeneratedContextualActions(r1, r2)
            android.app.Notification$Builder r1 = r14.mBuilder
            androidx.core.app.NotificationCompat$BubbleMetadata r2 = r15.mBubbleMetadata
            android.app.Notification$BubbleMetadata r2 = androidx.core.app.NotificationCompat.BubbleMetadata.toPlatform(r2)
            androidx.core.app.NotificationCompatBuilder.Api29Impl.setBubbleMetadata(r1, r2)
            androidx.core.content.LocusIdCompat r1 = r15.mLocusId
            if (r1 == 0) goto L2e0
            android.app.Notification$Builder r1 = r14.mBuilder
            androidx.core.content.LocusIdCompat r2 = r15.mLocusId
            android.content.LocusId r2 = r2.toLocusId()
            androidx.core.app.NotificationCompatBuilder.Api29Impl.setLocusId(r1, r2)
        L2e0:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 < r2) goto L2f1
            int r1 = r15.mFgsDeferBehavior
            if (r1 == 0) goto L2f1
            android.app.Notification$Builder r1 = r14.mBuilder
            int r2 = r15.mFgsDeferBehavior
            androidx.core.app.NotificationCompatBuilder.Api31Impl.setForegroundServiceBehavior(r1, r2)
        L2f1:
            boolean r1 = r15.mSilent
            if (r1 == 0) goto L336
            androidx.core.app.NotificationCompat$Builder r1 = r14.mBuilderCompat
            boolean r1 = r1.mGroupSummary
            if (r1 == 0) goto L2fe
            r14.mGroupAlertBehavior = r3
            goto L300
        L2fe:
            r14.mGroupAlertBehavior = r4
        L300:
            android.app.Notification$Builder r1 = r14.mBuilder
            r1.setVibrate(r6)
            android.app.Notification$Builder r1 = r14.mBuilder
            r1.setSound(r6)
            int r1 = r0.defaults
            r1 = r1 & (-2)
            r0.defaults = r1
            int r1 = r0.defaults
            r1 = r1 & (-3)
            r0.defaults = r1
            android.app.Notification$Builder r1 = r14.mBuilder
            int r2 = r0.defaults
            r1.setDefaults(r2)
            androidx.core.app.NotificationCompat$Builder r1 = r14.mBuilderCompat
            java.lang.String r1 = r1.mGroupKey
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L32f
            android.app.Notification$Builder r1 = r14.mBuilder
            java.lang.String r2 = "silent"
            androidx.core.app.NotificationCompatBuilder.Api20Impl.setGroup(r1, r2)
        L32f:
            android.app.Notification$Builder r1 = r14.mBuilder
            int r2 = r14.mGroupAlertBehavior
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setGroupAlertBehavior(r1, r2)
        L336:
            return
    }

    private void addAction(androidx.core.app.NotificationCompat.Action r7) {
            r6 = this;
            androidx.core.graphics.drawable.IconCompat r0 = r7.getIconCompat()
            if (r0 == 0) goto Ld
            android.graphics.drawable.Icon r1 = r0.toIcon()
            goto Le
        Ld:
            r1 = 0
        Le:
            java.lang.CharSequence r2 = r7.getTitle()
            android.app.PendingIntent r3 = r7.getActionIntent()
            android.app.Notification$Action$Builder r1 = androidx.core.app.NotificationCompatBuilder.Api23Impl.createBuilder(r1, r2, r3)
            androidx.core.app.RemoteInput[] r2 = r7.getRemoteInputs()
            if (r2 == 0) goto L35
        L21:
            androidx.core.app.RemoteInput[] r2 = r7.getRemoteInputs()
            android.app.RemoteInput[] r2 = androidx.core.app.RemoteInput.fromCompat(r2)
            int r3 = r2.length
            r4 = 0
        L2b:
            if (r4 >= r3) goto L35
            r5 = r2[r4]
            androidx.core.app.NotificationCompatBuilder.Api20Impl.addRemoteInput(r1, r5)
            int r4 = r4 + 1
            goto L2b
        L35:
            android.os.Bundle r2 = r7.getExtras()
            if (r2 == 0) goto L45
            android.os.Bundle r2 = new android.os.Bundle
            android.os.Bundle r3 = r7.getExtras()
            r2.<init>(r3)
            goto L4a
        L45:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L4a:
            boolean r3 = r7.getAllowGeneratedReplies()
            java.lang.String r4 = "android.support.allowGeneratedReplies"
            r2.putBoolean(r4, r3)
            boolean r3 = r7.getAllowGeneratedReplies()
            androidx.core.app.NotificationCompatBuilder.Api24Impl.setAllowGeneratedReplies(r1, r3)
            int r3 = r7.getSemanticAction()
            java.lang.String r4 = "android.support.action.semanticAction"
            r2.putInt(r4, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L74
            int r3 = r7.getSemanticAction()
            androidx.core.app.NotificationCompatBuilder.Api28Impl.setSemanticAction(r1, r3)
        L74:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L81
            boolean r3 = r7.isContextual()
            androidx.core.app.NotificationCompatBuilder.Api29Impl.setContextual(r1, r3)
        L81:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L8f
        L88:
            boolean r3 = r7.isAuthenticationRequired()
            androidx.core.app.NotificationCompatBuilder.Api31Impl.setAuthenticationRequired(r1, r3)
        L8f:
            boolean r3 = r7.getShowsUserInterface()
            java.lang.String r4 = "android.support.action.showsUserInterface"
            r2.putBoolean(r4, r3)
            androidx.core.app.NotificationCompatBuilder.Api20Impl.addExtras(r1, r2)
            android.app.Notification$Builder r3 = r6.mBuilder
            android.app.Notification$Action r4 = androidx.core.app.NotificationCompatBuilder.Api20Impl.build(r1)
            androidx.core.app.NotificationCompatBuilder.Api20Impl.addAction(r3, r4)
            return
    }

    private static java.util.List<java.lang.String> combineLists(java.util.List<java.lang.String> r3, java.util.List<java.lang.String> r4) {
            if (r3 != 0) goto L3
            return r4
        L3:
            if (r4 != 0) goto L6
            return r3
        L6:
            androidx.collection.ArraySet r0 = new androidx.collection.ArraySet
            int r1 = r3.size()
            int r2 = r4.size()
            int r1 = r1 + r2
            r0.<init>(r1)
            r0.addAll(r3)
            r0.addAll(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            return r1
    }

    private static java.util.List<java.lang.String> getPeople(java.util.List<androidx.core.app.Person> r4) {
            if (r4 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r1 = r4.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            androidx.core.app.Person r2 = (androidx.core.app.Person) r2
            java.lang.String r3 = r2.resolveToLegacyUri()
            r0.add(r3)
            goto L11
        L25:
            return r0
    }

    private void removeSoundAndVibration(android.app.Notification r2) {
            r1 = this;
            r0 = 0
            r2.sound = r0
            r2.vibrate = r0
            int r0 = r2.defaults
            r0 = r0 & (-2)
            r2.defaults = r0
            int r0 = r2.defaults
            r0 = r0 & (-3)
            r2.defaults = r0
            return
    }

    public android.app.Notification build() {
            r4 = this;
            androidx.core.app.NotificationCompat$Builder r0 = r4.mBuilderCompat
            androidx.core.app.NotificationCompat$Style r0 = r0.mStyle
            if (r0 == 0) goto L9
            r0.apply(r4)
        L9:
            if (r0 == 0) goto L10
            android.widget.RemoteViews r1 = r0.makeContentView(r4)
            goto L11
        L10:
            r1 = 0
        L11:
            android.app.Notification r2 = r4.buildInternal()
            if (r1 == 0) goto L1b
            r2.contentView = r1
            goto L27
        L1b:
            androidx.core.app.NotificationCompat$Builder r3 = r4.mBuilderCompat
            android.widget.RemoteViews r3 = r3.mContentView
            if (r3 == 0) goto L27
            androidx.core.app.NotificationCompat$Builder r3 = r4.mBuilderCompat
            android.widget.RemoteViews r3 = r3.mContentView
            r2.contentView = r3
        L27:
            if (r0 == 0) goto L31
            android.widget.RemoteViews r3 = r0.makeBigContentView(r4)
            if (r3 == 0) goto L31
            r2.bigContentView = r3
        L31:
            if (r0 == 0) goto L3f
            androidx.core.app.NotificationCompat$Builder r3 = r4.mBuilderCompat
            androidx.core.app.NotificationCompat$Style r3 = r3.mStyle
            android.widget.RemoteViews r3 = r3.makeHeadsUpContentView(r4)
            if (r3 == 0) goto L3f
            r2.headsUpContentView = r3
        L3f:
            if (r0 == 0) goto L4a
            android.os.Bundle r3 = androidx.core.app.NotificationCompat.getExtras(r2)
            if (r3 == 0) goto L4a
            r0.addCompatExtras(r3)
        L4a:
            return r2
    }

    protected android.app.Notification buildInternal() {
            r1 = this;
            android.app.Notification$Builder r0 = r1.mBuilder
            android.app.Notification r0 = androidx.core.app.NotificationCompatBuilder.Api16Impl.build(r0)
            return r0
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public android.app.Notification.Builder getBuilder() {
            r1 = this;
            android.app.Notification$Builder r0 = r1.mBuilder
            return r0
    }

    android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }
}
