package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ProbeNotifier {
    public static final int $stable = 0;
    private static final java.lang.String CHANNEL_ID = "dyhelper_probe";
    private static final java.lang.String CHANNEL_NAME = "书签提醒";
    public static final com.example.dyhelper.hook.comment.bookmark.ProbeNotifier INSTANCE = null;
    private static final java.lang.String TAG = "ree3495f0e85545cf";
    private static volatile android.content.Context appContext;

    static {
            com.example.dyhelper.hook.comment.bookmark.ProbeNotifier r0 = new com.example.dyhelper.hook.comment.bookmark.ProbeNotifier
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.ProbeNotifier.INSTANCE = r0
            r0 = 8
            com.example.dyhelper.hook.comment.bookmark.ProbeNotifier.$stable = r0
            return
    }

    private ProbeNotifier() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void ensureChannel() {
            r4 = this;
            java.lang.String r4 = "dyhelper_probe"
            android.content.Context r0 = com.example.dyhelper.hook.comment.bookmark.ProbeNotifier.appContext
            if (r0 != 0) goto L7
            goto L3f
        L7:
            java.lang.String r1 = "notification"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L2b
            r0.getClass()     // Catch: java.lang.Throwable -> L2b
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0     // Catch: java.lang.Throwable -> L2b
            android.app.NotificationChannel r1 = r0.getNotificationChannel(r4)     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L28
            android.app.NotificationChannel r1 = new android.app.NotificationChannel     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "书签提醒"
            r3 = 3
            r1.<init>(r4, r2, r3)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r4 = "DyHelper 评论书签和主页书签提醒"
            r1.setDescription(r4)     // Catch: java.lang.Throwable -> L2b
            r0.createNotificationChannel(r1)     // Catch: java.lang.Throwable -> L2b
        L28:
            s62 r4 = p000.s62.f9751     // Catch: java.lang.Throwable -> L2b
            goto L32
        L2b:
            r4 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r4)
            r4 = r0
        L32:
            java.lang.Throwable r4 = p000.fo1.m2190(r4)
            if (r4 == 0) goto L3f
            java.lang.String r0 = "ree3495f0e85545cf"
            java.lang.String r1 = "ensureChannel failed"
            p000.C0888ux.m5977(r0, r1, r4)
        L3f:
            return
    }

    private final void notify(int r4, java.lang.String r5, java.lang.String r6) {
            r3 = this;
            android.content.Context r0 = com.example.dyhelper.hook.comment.bookmark.ProbeNotifier.appContext
            if (r0 != 0) goto L5
            goto L76
        L5:
            r3.ensureChannel()     // Catch: java.lang.Throwable -> L62
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = r0.getPackageName()     // Catch: java.lang.Throwable -> L62
            android.content.Intent r3 = r3.getLaunchIntentForPackage(r1)     // Catch: java.lang.Throwable -> L62
            if (r3 == 0) goto L1d
            r1 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r3 = android.app.PendingIntent.getActivity(r0, r4, r3, r1)     // Catch: java.lang.Throwable -> L62
            goto L1e
        L1d:
            r3 = 0
        L1e:
            android.app.Notification$Builder r1 = new android.app.Notification$Builder     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = "dyhelper_probe"
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L62
            r2 = 17301659(0x108009b, float:2.497969E-38)
            android.app.Notification$Builder r1 = r1.setSmallIcon(r2)     // Catch: java.lang.Throwable -> L62
            android.app.Notification$Builder r5 = r1.setContentTitle(r5)     // Catch: java.lang.Throwable -> L62
            android.app.Notification$Builder r5 = r5.setContentText(r6)     // Catch: java.lang.Throwable -> L62
            android.app.Notification$BigTextStyle r1 = new android.app.Notification$BigTextStyle     // Catch: java.lang.Throwable -> L62
            r1.<init>()     // Catch: java.lang.Throwable -> L62
            android.app.Notification$BigTextStyle r6 = r1.bigText(r6)     // Catch: java.lang.Throwable -> L62
            android.app.Notification$Builder r5 = r5.setStyle(r6)     // Catch: java.lang.Throwable -> L62
            r6 = 1
            android.app.Notification$Builder r5 = r5.setAutoCancel(r6)     // Catch: java.lang.Throwable -> L62
            android.app.Notification$Builder r3 = r5.setContentIntent(r3)     // Catch: java.lang.Throwable -> L62
            android.app.Notification r3 = r3.build()     // Catch: java.lang.Throwable -> L62
            r3.getClass()     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = "notification"
            java.lang.Object r5 = r0.getSystemService(r5)     // Catch: java.lang.Throwable -> L62
            r5.getClass()     // Catch: java.lang.Throwable -> L62
            android.app.NotificationManager r5 = (android.app.NotificationManager) r5     // Catch: java.lang.Throwable -> L62
            r5.notify(r4, r3)     // Catch: java.lang.Throwable -> L62
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> L62
            goto L69
        L62:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L69:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L76
            java.lang.String r4 = "ree3495f0e85545cf"
            java.lang.String r5 = "notify failed"
            p000.C0888ux.m5977(r4, r5, r3)
        L76:
            return
    }

    public final void init(android.content.Context r2) {
            r1 = this;
            r2.getClass()
            android.content.Context r0 = r2.getApplicationContext()
            if (r0 != 0) goto La
            goto Lb
        La:
            r2 = r0
        Lb:
            com.example.dyhelper.hook.comment.bookmark.ProbeNotifier.appContext = r2
            r1.ensureChannel()
            return
    }

    public final void notifyNewCommentReply(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r4) {
            r3 = this;
            r4.getClass()
            boolean r0 = r4.getNotificationEnabled()
            if (r0 != 0) goto La
            return
        La:
            java.util.List r0 = r4.getNewReplyItems()
            java.lang.Object r0 = p000.AbstractC0984xh.m6640(r0)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r0 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem) r0
            if (r0 == 0) goto L41
            java.lang.String r1 = r0.getAuthorName()
            boolean r2 = p000.q02.m4671(r1)
            if (r2 == 0) goto L22
            java.lang.String r1 = "有人"
        L22:
            java.lang.String r0 = r0.getContent()
            r2 = 40
            java.lang.String r0 = p000.q02.m4693(r0, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "："
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L51
        L41:
            int r0 = r4.getNewReplyCount()
            r1 = 1
            if (r0 >= r1) goto L49
            r0 = r1
        L49:
            java.lang.String r1 = "新增 "
            java.lang.String r2 = " 条回复"
            java.lang.String r0 = p000.AbstractC0602nx.m4127(r1, r0, r2)
        L51:
            java.lang.String r4 = r4.getCommentId()
            int r4 = r4.hashCode()
            r1 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r1
            r1 = 13697024(0xd10000, float:1.9193619E-38)
            int r4 = r4 + r1
            java.lang.String r1 = "评论书签有新回复"
            r3.notify(r4, r1, r0)
            return
    }

    public final void notifyNewProfileAweme(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r5) {
            r4 = this;
            r5.getClass()
            boolean r0 = r5.getNotificationEnabled()
            if (r0 != 0) goto La
            return
        La:
            java.util.List r0 = r5.getNewAwemeItems()
            java.lang.Object r0 = p000.AbstractC0984xh.m6640(r0)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r0 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem) r0
            if (r0 == 0) goto L35
            java.lang.String r1 = r5.displayName()
            java.lang.String r2 = r0.getDesc()
            boolean r3 = p000.q02.m4671(r2)
            if (r3 == 0) goto L28
            java.lang.String r2 = r0.getAwemeId()
        L28:
            r0 = 40
            java.lang.String r0 = p000.q02.m4693(r2, r0)
            java.lang.String r2 = " 发布了新作品："
            java.lang.String r0 = p000.lz1.m3688(r1, r2, r0)
            goto L3f
        L35:
            java.lang.String r0 = r5.displayName()
            java.lang.String r1 = " 有新作品"
            java.lang.String r0 = p000.AbstractC0602nx.m4129(r0, r1)
        L3f:
            java.lang.String r5 = r5.uniqueKey()
            int r5 = r5.hashCode()
            r1 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r1
            r1 = 13762560(0xd20000, float:1.9285454E-38)
            int r5 = r5 + r1
            java.lang.String r1 = "主页书签有新作品"
            r4.notify(r5, r1, r0)
            return
    }
}
