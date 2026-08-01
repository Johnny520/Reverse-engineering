package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class CommentBookmarkNotifier {
    public static final int $stable = 0;
    private static final java.lang.String CHANNEL_ID = "dyhelper_comment_bookmark";
    private static final java.lang.String CHANNEL_NAME = "评论书签提醒";
    public static final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNotifier INSTANCE = null;
    private static final java.lang.String TAG = "r88ffd85015f20410";
    private static volatile android.content.Context appContext;

    static {
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNotifier r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNotifier
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNotifier.INSTANCE = r0
            r0 = 8
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNotifier.$stable = r0
            return
    }

    private CommentBookmarkNotifier() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void ensureChannel() {
            r4 = this;
            java.lang.String r4 = "dyhelper_comment_bookmark"
            android.content.Context r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNotifier.appContext
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r1 = "notification"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L28
            r0.getClass()     // Catch: java.lang.Throwable -> L28
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0     // Catch: java.lang.Throwable -> L28
            android.app.NotificationChannel r1 = r0.getNotificationChannel(r4)     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L28
            android.app.NotificationChannel r1 = new android.app.NotificationChannel     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "评论书签提醒"
            r3 = 3
            r1.<init>(r4, r2, r3)     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "DyHelper 评论书签新回复提醒"
            r1.setDescription(r4)     // Catch: java.lang.Throwable -> L28
            r0.createNotificationChannel(r1)     // Catch: java.lang.Throwable -> L28
        L28:
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
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNotifier.appContext = r2
            r1.ensureChannel()
            return
    }

    public final void notifyNewReply(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r10) {
            r9 = this;
            r10.getClass()
            android.content.Context r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNotifier.appContext
            if (r0 != 0) goto L9
            goto Lfe
        L9:
            boolean r1 = r10.getNotificationEnabled()
            if (r1 != 0) goto L11
            goto Lfe
        L11:
            r9.ensureChannel()     // Catch: java.lang.Throwable -> Lea
            android.content.pm.PackageManager r9 = r0.getPackageManager()     // Catch: java.lang.Throwable -> Lea
            java.lang.String r1 = r0.getPackageName()     // Catch: java.lang.Throwable -> Lea
            android.content.Intent r9 = r9.getLaunchIntentForPackage(r1)     // Catch: java.lang.Throwable -> Lea
            if (r9 == 0) goto L31
            java.lang.String r1 = r10.getCommentId()     // Catch: java.lang.Throwable -> Lea
            int r1 = r1.hashCode()     // Catch: java.lang.Throwable -> Lea
            r2 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r9 = android.app.PendingIntent.getActivity(r0, r1, r9, r2)     // Catch: java.lang.Throwable -> Lea
            goto L32
        L31:
            r9 = 0
        L32:
            java.lang.String r1 = "你书签的评论有新回复"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lea
            r2.<init>()     // Catch: java.lang.Throwable -> Lea
            java.util.List r3 = r10.getNewReplyItems()     // Catch: java.lang.Throwable -> Lea
            java.lang.Object r3 = p000.AbstractC0984xh.m6640(r3)     // Catch: java.lang.Throwable -> Lea
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r3 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem) r3     // Catch: java.lang.Throwable -> Lea
            r4 = 1
            r5 = 36
            java.lang.String r6 = "："
            if (r3 == 0) goto L68
            java.lang.String r7 = r3.getAuthorName()     // Catch: java.lang.Throwable -> Lea
            boolean r8 = p000.q02.m4671(r7)     // Catch: java.lang.Throwable -> Lea
            if (r8 == 0) goto L56
            java.lang.String r7 = "有人"
        L56:
            r2.append(r7)     // Catch: java.lang.Throwable -> Lea
            r2.append(r6)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r3 = r3.getContent()     // Catch: java.lang.Throwable -> Lea
            java.lang.String r3 = p000.q02.m4693(r3, r5)     // Catch: java.lang.Throwable -> Lea
            r2.append(r3)     // Catch: java.lang.Throwable -> Lea
            goto L94
        L68:
            java.lang.String r3 = "新增 "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lea
            int r3 = r10.getNewReplyCount()     // Catch: java.lang.Throwable -> Lea
            if (r3 >= r4) goto L74
            r3 = r4
        L74:
            r2.append(r3)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r3 = " 条回复"
            r2.append(r3)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r3 = r10.getContent()     // Catch: java.lang.Throwable -> Lea
            boolean r3 = p000.q02.m4671(r3)     // Catch: java.lang.Throwable -> Lea
            if (r3 != 0) goto L94
            r2.append(r6)     // Catch: java.lang.Throwable -> Lea
            java.lang.String r3 = r10.getContent()     // Catch: java.lang.Throwable -> Lea
            java.lang.String r3 = p000.q02.m4693(r3, r5)     // Catch: java.lang.Throwable -> Lea
            r2.append(r3)     // Catch: java.lang.Throwable -> Lea
        L94:
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lea
            android.app.Notification$Builder r3 = new android.app.Notification$Builder     // Catch: java.lang.Throwable -> Lea
            java.lang.String r5 = "dyhelper_comment_bookmark"
            r3.<init>(r0, r5)     // Catch: java.lang.Throwable -> Lea
            r5 = 17301659(0x108009b, float:2.497969E-38)
            android.app.Notification$Builder r3 = r3.setSmallIcon(r5)     // Catch: java.lang.Throwable -> Lea
            android.app.Notification$Builder r1 = r3.setContentTitle(r1)     // Catch: java.lang.Throwable -> Lea
            android.app.Notification$Builder r1 = r1.setContentText(r2)     // Catch: java.lang.Throwable -> Lea
            android.app.Notification$BigTextStyle r3 = new android.app.Notification$BigTextStyle     // Catch: java.lang.Throwable -> Lea
            r3.<init>()     // Catch: java.lang.Throwable -> Lea
            android.app.Notification$BigTextStyle r2 = r3.bigText(r2)     // Catch: java.lang.Throwable -> Lea
            android.app.Notification$Builder r1 = r1.setStyle(r2)     // Catch: java.lang.Throwable -> Lea
            android.app.Notification$Builder r1 = r1.setAutoCancel(r4)     // Catch: java.lang.Throwable -> Lea
            android.app.Notification$Builder r9 = r1.setContentIntent(r9)     // Catch: java.lang.Throwable -> Lea
            android.app.Notification r9 = r9.build()     // Catch: java.lang.Throwable -> Lea
            r9.getClass()     // Catch: java.lang.Throwable -> Lea
            java.lang.String r1 = "notification"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> Lea
            r0.getClass()     // Catch: java.lang.Throwable -> Lea
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0     // Catch: java.lang.Throwable -> Lea
            java.lang.String r10 = r10.getCommentId()     // Catch: java.lang.Throwable -> Lea
            int r10 = r10.hashCode()     // Catch: java.lang.Throwable -> Lea
            r1 = 65535(0xffff, float:9.1834E-41)
            r10 = r10 & r1
            r1 = 13697024(0xd10000, float:1.9193619E-38)
            int r10 = r10 + r1
            r0.notify(r10, r9)     // Catch: java.lang.Throwable -> Lea
            s62 r9 = p000.s62.f9751     // Catch: java.lang.Throwable -> Lea
            goto Lf1
        Lea:
            r9 = move-exception
            eo1 r10 = new eo1
            r10.<init>(r9)
            r9 = r10
        Lf1:
            java.lang.Throwable r9 = p000.fo1.m2190(r9)
            if (r9 == 0) goto Lfe
            java.lang.String r10 = "r88ffd85015f20410"
            java.lang.String r0 = "notify failed"
            p000.C0888ux.m5977(r10, r0, r9)
        Lfe:
            return
    }
}
