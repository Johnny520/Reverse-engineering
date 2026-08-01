package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class LongPressBookmarkActions {
    public static final int $stable = 0;
    public static final com.example.dyhelper.hook.comment.bookmark.LongPressBookmarkActions INSTANCE = null;
    private static final java.lang.String TAG = "ref399e2e1c5c8051";
    private static boolean registered;

    static {
            com.example.dyhelper.hook.comment.bookmark.LongPressBookmarkActions r0 = new com.example.dyhelper.hook.comment.bookmark.LongPressBookmarkActions
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.LongPressBookmarkActions.INSTANCE = r0
            r0 = 8
            com.example.dyhelper.hook.comment.bookmark.LongPressBookmarkActions.$stable = r0
            return
    }

    private LongPressBookmarkActions() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void handleCommentBookmarkClick(p000.ov0 r36) {
            r35 = this;
            r0 = r36
            java.lang.String r1 = "ref399e2e1c5c8051"
            android.content.Context r2 = r0.f8269
            java.lang.Object r3 = r0.f8271
            if (r2 != 0) goto Lc
            goto L128
        Lc:
            r4 = 0
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore r5 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.INSTANCE     // Catch: java.lang.Throwable -> L3e
            android.content.Context r6 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L3e
            r6.getClass()     // Catch: java.lang.Throwable -> L3e
            r5.init(r6)     // Catch: java.lang.Throwable -> L3e
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNotifier r6 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkNotifier.INSTANCE     // Catch: java.lang.Throwable -> L3e
            android.content.Context r7 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L3e
            r7.getClass()     // Catch: java.lang.Throwable -> L3e
            r6.init(r7)     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r0 = r0.f8273     // Catch: java.lang.Throwable -> L3e
            if (r0 != 0) goto L42
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE     // Catch: java.lang.Throwable -> L3e
            java.lang.Object[] r6 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r6 = r0.findCommentObject(r6)     // Catch: java.lang.Throwable -> L3e
            if (r6 != 0) goto L41
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r0 = r0.findBookmarkSourceObject(r3)     // Catch: java.lang.Throwable -> L3e
            goto L42
        L3e:
            r0 = move-exception
            goto Lfe
        L41:
            r0 = r6
        L42:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r3 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE     // Catch: java.lang.Throwable -> L3e
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r6 = r3.toRecordFromAny(r0)     // Catch: java.lang.Throwable -> L3e
            r7 = 0
            if (r6 != 0) goto L53
            if (r0 == 0) goto L52
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r6 = r3.toRecord(r0)     // Catch: java.lang.Throwable -> L3e
            goto L53
        L52:
            r6 = r7
        L53:
            if (r6 == 0) goto L5e
            java.lang.String r8 = r6.getCommentId()     // Catch: java.lang.Throwable -> L3e
            if (r8 != 0) goto L5c
            goto L5e
        L5c:
            r9 = r8
            goto L67
        L5e:
            java.lang.String r8 = r3.getCommentId(r0)     // Catch: java.lang.Throwable -> L3e
            if (r8 != 0) goto L5c
            java.lang.String r8 = ""
            goto L5c
        L67:
            boolean r0 = p000.q02.m4671(r9)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L7d
            java.lang.String r0 = "未识别到评论 ID，无法添加书签"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r4)     // Catch: java.lang.Throwable -> L3e
            r0.show()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "comment bookmark failed: empty comment id"
            r3 = 4
            p000.C0888ux.m5988(r1, r0, r7, r3, r7)     // Catch: java.lang.Throwable -> L3e
            return
        L7d:
            boolean r0 = r5.isBookmarked(r9)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L90
            r5.remove(r9)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "已取消书签"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r4)     // Catch: java.lang.Throwable -> L3e
            r0.show()     // Catch: java.lang.Throwable -> L3e
            return
        L90:
            if (r6 != 0) goto Lc4
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r8 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord     // Catch: java.lang.Throwable -> L3e
            long r20 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3e
            r33 = 2096638(0x1ffdfe, float:2.938016E-39)
            r34 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r8.<init>(r9, r10, r11, r12, r13, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch: java.lang.Throwable -> L3e
            r6 = r8
        Lc4:
            r0 = r2
        Lc5:
            boolean r3 = r0 instanceof android.content.ContextWrapper     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto Ld8
            boolean r3 = r0 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto Ld1
            r7 = r0
            android.app.Activity r7 = (android.app.Activity) r7     // Catch: java.lang.Throwable -> L3e
            goto Ld8
        Ld1:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0     // Catch: java.lang.Throwable -> L3e
            android.content.Context r0 = r0.getBaseContext()     // Catch: java.lang.Throwable -> L3e
            goto Lc5
        Ld8:
            if (r7 == 0) goto Le9
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog     // Catch: java.lang.Throwable -> L3e
            kv0 r3 = new kv0     // Catch: java.lang.Throwable -> L3e
            r5 = 0
            r3.<init>(r2, r5)     // Catch: java.lang.Throwable -> L3e
            r0.<init>(r7, r6, r3)     // Catch: java.lang.Throwable -> L3e
            r0.show()     // Catch: java.lang.Throwable -> L3e
            goto Lfb
        Le9:
            boolean r0 = r5.add(r6)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto Lf2
            java.lang.String r0 = "已添加书签，后续有新回复会提醒"
            goto Lf4
        Lf2:
            java.lang.String r0 = "该评论已添加书签"
        Lf4:
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r4)     // Catch: java.lang.Throwable -> L3e
            r0.show()     // Catch: java.lang.Throwable -> L3e
        Lfb:
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L3e
            goto L104
        Lfe:
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L104:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L128
            java.lang.String r3 = r0.getMessage()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "添加书签失败: "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r4)
            r2.show()
            java.lang.String r2 = "comment bookmark failed"
            p000.C0888ux.m5977(r1, r2, r0)
        L128:
            return
    }

    private static final p000.s62 handleCommentBookmarkClick$lambda$10$lambda$9(android.content.Context r2, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r3) {
            r3.getClass()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.INSTANCE
            r0.add(r3)
            java.lang.String r3 = r3.getUserTag()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "已添加书签 ["
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r0 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r0)
            r2.show()
            s62 r2 = p000.s62.f9751
            return r2
    }

    private final void handleCopyCommentWithoutAuthor(p000.ov0 r6) {
            r5 = this;
            android.content.Context r0 = r6.f8269
            java.lang.Object r1 = r6.f8271
            if (r0 != 0) goto L8
            goto Lbe
        L8:
            r2 = 0
            java.lang.Object r6 = r6.f8273     // Catch: java.lang.Throwable -> L22
            if (r6 != 0) goto L26
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r6 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE     // Catch: java.lang.Throwable -> L22
            java.lang.Object[] r3 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L22
            java.lang.Object r3 = r6.findBookmarkSourceObject(r3)     // Catch: java.lang.Throwable -> L22
            if (r3 != 0) goto L25
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L22
            java.lang.Object r6 = r6.findCommentObject(r1)     // Catch: java.lang.Throwable -> L22
            goto L26
        L22:
            r5 = move-exception
            goto L92
        L25:
            r6 = r3
        L26:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReflect.INSTANCE     // Catch: java.lang.Throwable -> L22
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r3 = r1.toRecordFromAny(r6)     // Catch: java.lang.Throwable -> L22
            r4 = 0
            if (r3 != 0) goto L37
            if (r6 == 0) goto L36
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r3 = r1.toRecord(r6)     // Catch: java.lang.Throwable -> L22
            goto L37
        L36:
            r3 = r4
        L37:
            if (r3 == 0) goto L3e
            java.lang.String r6 = r3.getContent()     // Catch: java.lang.Throwable -> L22
            goto L3f
        L3e:
            r6 = r4
        L3f:
            java.lang.String r1 = ""
            if (r6 != 0) goto L44
            r6 = r1
        L44:
            if (r3 == 0) goto L4b
            java.lang.String r3 = r3.getAuthorName()     // Catch: java.lang.Throwable -> L22
            goto L4c
        L4b:
            r3 = r4
        L4c:
            if (r3 != 0) goto L4f
            goto L50
        L4f:
            r1 = r3
        L50:
            java.lang.String r5 = r5.removeAuthorNamePrefix(r6, r1)     // Catch: java.lang.Throwable -> L22
            boolean r6 = p000.q02.m4671(r5)     // Catch: java.lang.Throwable -> L22
            if (r6 == 0) goto L64
            java.lang.String r5 = "未识别到评论内容"
            android.widget.Toast r5 = android.widget.Toast.makeText(r0, r5, r2)     // Catch: java.lang.Throwable -> L22
            r5.show()     // Catch: java.lang.Throwable -> L22
            return
        L64:
            java.lang.String r6 = "clipboard"
            java.lang.Object r6 = r0.getSystemService(r6)     // Catch: java.lang.Throwable -> L22
            boolean r1 = r6 instanceof android.content.ClipboardManager     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L71
            r4 = r6
            android.content.ClipboardManager r4 = (android.content.ClipboardManager) r4     // Catch: java.lang.Throwable -> L22
        L71:
            if (r4 != 0) goto L7d
            java.lang.String r5 = "无法访问剪贴板"
            android.widget.Toast r5 = android.widget.Toast.makeText(r0, r5, r2)     // Catch: java.lang.Throwable -> L22
            r5.show()     // Catch: java.lang.Throwable -> L22
            return
        L7d:
            java.lang.String r6 = "comment_content"
            android.content.ClipData r5 = android.content.ClipData.newPlainText(r6, r5)     // Catch: java.lang.Throwable -> L22
            r4.setPrimaryClip(r5)     // Catch: java.lang.Throwable -> L22
            java.lang.String r5 = "已复制评论内容"
            android.widget.Toast r5 = android.widget.Toast.makeText(r0, r5, r2)     // Catch: java.lang.Throwable -> L22
            r5.show()     // Catch: java.lang.Throwable -> L22
            s62 r5 = p000.s62.f9751     // Catch: java.lang.Throwable -> L22
            goto L98
        L92:
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L98:
            java.lang.Throwable r5 = p000.fo1.m2190(r5)
            if (r5 == 0) goto Lbe
            java.lang.String r6 = r5.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "复制评论失败: "
            r1.<init>(r3)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            android.widget.Toast r6 = android.widget.Toast.makeText(r0, r6, r2)
            r6.show()
            java.lang.String r6 = "ref399e2e1c5c8051"
            java.lang.String r0 = "copy comment failed"
            p000.C0888ux.m5977(r6, r0, r5)
        Lbe:
            return
    }

    private final void handleVideoBookmarkClick(p000.pv0 r5) {
            r4 = this;
            android.content.Context r4 = r5.f8731
            if (r4 != 0) goto L6
            goto L89
        L6:
            java.lang.Object r5 = r5.f8734
            if (r5 != 0) goto Lc
            goto L89
        Lc:
            r0 = 0
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore r1 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.INSTANCE     // Catch: java.lang.Throwable -> L31
            android.content.Context r2 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L31
            r2.getClass()     // Catch: java.lang.Throwable -> L31
            r1.init(r2)     // Catch: java.lang.Throwable -> L31
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord$Companion r2 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord.Companion     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.atomic.AtomicReference r3 = p000.b10.f1403     // Catch: java.lang.Throwable -> L31
            f8 r5 = p000.b10.m673(r5)     // Catch: java.lang.Throwable -> L31
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r5 = r2.fromAwemeInfo(r5)     // Catch: java.lang.Throwable -> L31
            if (r5 != 0) goto L33
            java.lang.String r5 = "未识别到作品信息"
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r0)     // Catch: java.lang.Throwable -> L31
            r5.show()     // Catch: java.lang.Throwable -> L31
            return
        L31:
            r5 = move-exception
            goto L5d
        L33:
            java.lang.String r2 = r5.getAwemeId()     // Catch: java.lang.Throwable -> L31
            boolean r2 = r1.isBookmarked(r2)     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L4e
            java.lang.String r5 = r5.getAwemeId()     // Catch: java.lang.Throwable -> L31
            r1.remove(r5)     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = "已删除作品书签"
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r0)     // Catch: java.lang.Throwable -> L31
            r5.show()     // Catch: java.lang.Throwable -> L31
            goto L5a
        L4e:
            r1.add(r5)     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = "已保存作品书签"
            android.widget.Toast r5 = android.widget.Toast.makeText(r4, r5, r0)     // Catch: java.lang.Throwable -> L31
            r5.show()     // Catch: java.lang.Throwable -> L31
        L5a:
            s62 r5 = p000.s62.f9751     // Catch: java.lang.Throwable -> L31
            goto L63
        L5d:
            eo1 r1 = new eo1
            r1.<init>(r5)
            r5 = r1
        L63:
            java.lang.Throwable r5 = p000.fo1.m2190(r5)
            if (r5 == 0) goto L89
            java.lang.String r1 = r5.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "保存作品书签失败: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.widget.Toast r4 = android.widget.Toast.makeText(r4, r1, r0)
            r4.show()
            java.lang.String r4 = "ref399e2e1c5c8051"
            java.lang.String r0 = "video bookmark failed"
            p000.C0888ux.m5977(r4, r0, r5)
        L89:
            return
    }

    private final void openBookmarkManager(android.content.Context r2, int r3) {
            r1 = this;
            r1 = r2
        L1:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L13
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto Lc
            android.app.Activity r1 = (android.app.Activity) r1
            goto L14
        Lc:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L1
        L13:
            r1 = 0
        L14:
            if (r1 == 0) goto L1c
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r2 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.INSTANCE
            r2.show(r1, r3)
            return
        L1c:
            if (r2 == 0) goto L28
            java.lang.String r1 = "无法打开书签管理器"
            r3 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r2, r1, r3)
            r1.show()
        L28:
            return
    }

    private final void registerBookmarkManager() {
            r9 = this;
            xv0 r9 = p000.xv0.f12327
            nv0 r0 = new nv0
            mv0 r1 = p000.mv0.f7285
            java.util.Set r4 = p000.g81.m2288(r1)
            gp0 r6 = new gp0
            r1 = 19
            r6.<init>(r1)
            r7 = 0
            r8 = 712(0x2c8, float:9.98E-43)
            java.lang.String r1 = "bookmark_manager"
            java.lang.String r2 = "书签管理"
            lv0 r3 = p000.lv0.f6810
            r5 = 15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.m6785(r0)
            return
    }

    private static final p000.s62 registerBookmarkManager$lambda$2(p000.qv0 r2) {
            r2.getClass()
            com.example.dyhelper.hook.comment.bookmark.LongPressBookmarkActions r0 = com.example.dyhelper.hook.comment.bookmark.LongPressBookmarkActions.INSTANCE
            android.content.Context r2 = r2.mo4297()
            r1 = 0
            r0.openBookmarkManager(r2, r1)
            s62 r2 = p000.s62.f9751
            return r2
    }

    private final void registerCommentBookmark() {
            r9 = this;
            xv0 r9 = p000.xv0.f12327
            nv0 r0 = new nv0
            mv0 r1 = p000.mv0.f7285
            java.util.Set r4 = p000.g81.m2288(r1)
            gp0 r6 = new gp0
            r1 = 18
            r6.<init>(r1)
            r7 = 0
            r8 = 712(0x2c8, float:9.98E-43)
            java.lang.String r1 = "comment_bookmark"
            java.lang.String r2 = "书签"
            lv0 r3 = p000.lv0.f6809
            r5 = 10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.m6785(r0)
            return
    }

    private static final p000.s62 registerCommentBookmark$lambda$1(p000.qv0 r1) {
            r1.getClass()
            boolean r0 = r1 instanceof p000.ov0
            if (r0 == 0) goto La
            ov0 r1 = (p000.ov0) r1
            goto Lb
        La:
            r1 = 0
        Lb:
            if (r1 == 0) goto L12
            com.example.dyhelper.hook.comment.bookmark.LongPressBookmarkActions r0 = com.example.dyhelper.hook.comment.bookmark.LongPressBookmarkActions.INSTANCE
            r0.handleCommentBookmarkClick(r1)
        L12:
            s62 r1 = p000.s62.f9751
            return r1
    }

    private final void registerCopyCommentContent() {
            r9 = this;
            xv0 r9 = p000.xv0.f12327
            nv0 r0 = new nv0
            mv0 r1 = p000.mv0.f7285
            java.util.Set r4 = p000.g81.m2288(r1)
            gp0 r6 = new gp0
            r1 = 22
            r6.<init>(r1)
            r7 = 0
            r8 = 712(0x2c8, float:9.98E-43)
            java.lang.String r1 = "copy_comment_without_author"
            java.lang.String r2 = "复制纯评论"
            lv0 r3 = p000.lv0.f6811
            r5 = 20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.m6785(r0)
            return
    }

    private static final p000.s62 registerCopyCommentContent$lambda$4(p000.qv0 r1) {
            r1.getClass()
            boolean r0 = r1 instanceof p000.ov0
            if (r0 == 0) goto La
            ov0 r1 = (p000.ov0) r1
            goto Lb
        La:
            r1 = 0
        Lb:
            if (r1 == 0) goto L12
            com.example.dyhelper.hook.comment.bookmark.LongPressBookmarkActions r0 = com.example.dyhelper.hook.comment.bookmark.LongPressBookmarkActions.INSTANCE
            r0.handleCopyCommentWithoutAuthor(r1)
        L12:
            s62 r1 = p000.s62.f9751
            return r1
    }

    private final void registerVideoBookmark() {
            r9 = this;
            xv0 r9 = p000.xv0.f12327
            nv0 r0 = new nv0
            mv0 r1 = p000.mv0.f7287
            mv0 r2 = p000.mv0.f7288
            mv0 r3 = p000.mv0.f7286
            mv0[] r1 = new p000.mv0[]{r3, r1, r2}
            java.util.Set r4 = p000.AbstractC0312g7.m2263(r1)
            gp0 r6 = new gp0
            r1 = 20
            r6.<init>(r1)
            gp0 r7 = new gp0
            r1 = 21
            r7.<init>(r1)
            r8 = 200(0xc8, float:2.8E-43)
            java.lang.String r1 = "video_bookmark"
            java.lang.String r2 = "作品书签"
            lv0 r3 = p000.lv0.f6810
            r5 = 30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.m6785(r0)
            return
    }

    private static final p000.s62 registerVideoBookmark$lambda$6(p000.qv0 r1) {
            r1.getClass()
            boolean r0 = r1 instanceof p000.pv0
            if (r0 == 0) goto La
            pv0 r1 = (p000.pv0) r1
            goto Lb
        La:
            r1 = 0
        Lb:
            if (r1 == 0) goto L12
            com.example.dyhelper.hook.comment.bookmark.LongPressBookmarkActions r0 = com.example.dyhelper.hook.comment.bookmark.LongPressBookmarkActions.INSTANCE
            r0.handleVideoBookmarkClick(r1)
        L12:
            s62 r1 = p000.s62.f9751
            return r1
    }

    private static final boolean registerVideoBookmark$lambda$7(p000.qv0 r2) {
            r2.getClass()
            com.example.dyhelper.hook.comment.bookmark.LongPressBookmarkActions r0 = com.example.dyhelper.hook.comment.bookmark.LongPressBookmarkActions.INSTANCE
            android.content.Context r2 = r2.mo4297()
            r1 = 2
            r0.openBookmarkManager(r2, r1)
            r2 = 1
            return r2
    }

    private final java.lang.String removeAuthorNamePrefix(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            java.lang.CharSequence r6 = p000.q02.m4660(r7)
            java.lang.String r6 = r6.toString()
            java.lang.CharSequence r7 = p000.q02.m4660(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "@"
            java.lang.String r7 = p000.q02.m4678(r7, r8)
            java.lang.CharSequence r7 = p000.q02.m4660(r7)
            java.lang.String r7 = r7.toString()
            boolean r0 = p000.q02.m4671(r7)
            if (r0 == 0) goto L25
            return r6
        L25:
            java.lang.String r8 = r8.concat(r7)
            java.lang.String[] r7 = new java.lang.String[]{r7, r8}
            java.util.List r7 = p000.AbstractC1021yh.m6897(r7)
            java.util.Set r7 = p000.AbstractC0984xh.m6670(r7)
            java.util.List r7 = p000.AbstractC0984xh.m6666(r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L42:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r7.next()
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = p000.q02.m4671(r1)
            if (r1 != 0) goto L42
            r8.add(r0)
            goto L42
        L59:
            java.util.Iterator r7 = r8.iterator()
        L5d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Ld5
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r0 = p000.ln0.m3626(r6, r8)
            java.lang.String r1 = ""
            if (r0 == 0) goto L72
            return r1
        L72:
            java.lang.String r0 = ":"
            java.lang.String r0 = p000.AbstractC0602nx.m4129(r8, r0)
            java.lang.String r2 = "："
            java.lang.String r2 = p000.AbstractC0602nx.m4129(r8, r2)
            java.lang.String r3 = " "
            java.lang.String r3 = p000.AbstractC0602nx.m4129(r8, r3)
            java.lang.String r4 = "\n"
            java.lang.String r4 = p000.AbstractC0602nx.m4129(r8, r4)
            java.lang.String r5 = "\r\n"
            java.lang.String r8 = p000.AbstractC0602nx.m4129(r8, r5)
            java.lang.String[] r8 = new java.lang.String[]{r0, r2, r3, r4, r8}
            java.util.List r8 = p000.AbstractC1021yh.m6897(r8)
            java.util.Iterator r8 = r8.iterator()
        L9c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            r2 = 0
            boolean r3 = p000.x02.m6485(r6, r0, r2)
            if (r3 == 0) goto L9c
            java.lang.String r6 = p000.q02.m4678(r6, r0)
            int r0 = r6.length()
        Lb7:
            if (r2 >= r0) goto Lcf
            char r3 = r6.charAt(r2)
            boolean r3 = p000.jx0.m3020(r3)
            if (r3 != 0) goto Lcc
            int r0 = r6.length()
            java.lang.CharSequence r6 = r6.subSequence(r2, r0)
            goto Ld0
        Lcc:
            int r2 = r2 + 1
            goto Lb7
        Lcf:
            r6 = r1
        Ld0:
            java.lang.String r6 = r6.toString()
            goto L9c
        Ld5:
            return r6
    }

    /* JADX INFO: renamed from: α */
    public static /* synthetic */ p000.s62 m1427(android.content.Context r0, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r1) {
            s62 r0 = handleCommentBookmarkClick$lambda$10$lambda$9(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static /* synthetic */ p000.s62 m1428(p000.qv0 r0) {
            s62 r0 = registerBookmarkManager$lambda$2(r0)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static /* synthetic */ p000.s62 m1429(p000.qv0 r0) {
            s62 r0 = registerVideoBookmark$lambda$6(r0)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static /* synthetic */ p000.s62 m1430(p000.qv0 r0) {
            s62 r0 = registerCommentBookmark$lambda$1(r0)
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static /* synthetic */ boolean m1431(p000.qv0 r0) {
            boolean r0 = registerVideoBookmark$lambda$7(r0)
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static /* synthetic */ p000.s62 m1432(p000.qv0 r0) {
            s62 r0 = registerCopyCommentContent$lambda$4(r0)
            return r0
    }

    public final synchronized void registerAll() {
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "comment_panel_hook_enabled"
            r1 = 0
            boolean r0 = p000.ui1.m5887(r0, r1)     // Catch: java.lang.Throwable -> L15
            r1 = 4
            r2 = 0
            if (r0 != 0) goto L17
            java.lang.String r0 = "ref399e2e1c5c8051"
            java.lang.String r3 = "disabled, skip register"
            p000.C0888ux.m5988(r0, r3, r2, r1, r2)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r4)
            return
        L15:
            r0 = move-exception
            goto L35
        L17:
            boolean r0 = com.example.dyhelper.hook.comment.bookmark.LongPressBookmarkActions.registered     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L1d
            monitor-exit(r4)
            return
        L1d:
            r0 = 1
            com.example.dyhelper.hook.comment.bookmark.LongPressBookmarkActions.registered = r0     // Catch: java.lang.Throwable -> L15
            r4.registerCommentBookmark()     // Catch: java.lang.Throwable -> L15
            r4.registerBookmarkManager()     // Catch: java.lang.Throwable -> L15
            r4.registerCopyCommentContent()     // Catch: java.lang.Throwable -> L15
            r4.registerVideoBookmark()     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = "ref399e2e1c5c8051"
            java.lang.String r3 = "register all done"
            p000.C0888ux.m5988(r0, r3, r2, r1, r2)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r4)
            return
        L35:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L15
            throw r0
    }
}
