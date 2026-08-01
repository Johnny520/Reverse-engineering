package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class BookmarkManagerDialog {
    public static final int $stable = 0;
    public static final com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog INSTANCE = null;
    public static final int TAB_COMMENT = 0;
    public static final int TAB_PROFILE = 1;
    public static final int TAB_VIDEO = 2;
    private static final java.lang.String TAG = "rb371d3ea6408f4c8";
    private static int currentTab;
    private static volatile android.app.AlertDialog dialog;

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class CommentBookmarkAdapter extends android.widget.BaseAdapter {
        private final android.app.Activity activity;
        private final java.util.ArrayList<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> data;
        private p000.p70 onChanged;

        public CommentBookmarkAdapter(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                r0.<init>()
                r0.activity = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.data = r1
                return
        }

        private static final void getView$lambda$10$lambda$9(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r0, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r1, android.view.View r2) {
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore r2 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.INSTANCE
                java.lang.String r0 = r0.getCommentId()
                r2.markRead(r0)
                p70 r0 = r1.onChanged
                if (r0 == 0) goto L10
                r0.invoke()
            L10:
                return
        }

        private static final void getView$lambda$11(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r1, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r2, android.view.View r3) {
                com.example.dyhelper.hook.comment.bookmark.BookmarkNativeJump r3 = com.example.dyhelper.hook.comment.bookmark.BookmarkNativeJump.INSTANCE
                android.app.Activity r1 = r1.activity
                java.lang.ClassLoader r0 = r1.getClassLoader()
                r0.getClass()
                r3.jump(r1, r0, r2)
                return
        }

        private static final void getView$lambda$8$lambda$7(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r3, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r4, android.view.View r5) {
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkListDialog r5 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkListDialog.INSTANCE
                android.app.Activity r0 = r3.activity
                com.example.dyhelper.hook.comment.bookmark.κ r1 = new com.example.dyhelper.hook.comment.bookmark.κ
                r2 = 0
                r1.<init>(r3, r2)
                r5.showNewReplyDetailDialog(r0, r4, r1)
                return
        }

        private static final p000.s62 getView$lambda$8$lambda$7$lambda$6(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r0) {
                p70 r0 = r0.onChanged
                if (r0 == 0) goto L7
                r0.invoke()
            L7:
                s62 r0 = p000.s62.f9751
                return r0
        }

        /* JADX INFO: renamed from: α */
        public static /* synthetic */ p000.s62 m1383(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r0) {
                s62 r0 = getView$lambda$8$lambda$7$lambda$6(r0)
                return r0
        }

        /* JADX INFO: renamed from: β */
        public static /* synthetic */ void m1384(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r0, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r1, android.view.View r2) {
                getView$lambda$10$lambda$9(r1, r0, r2)
                return
        }

        /* JADX INFO: renamed from: γ */
        public static /* synthetic */ void m1385(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r0, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r1, android.view.View r2) {
                getView$lambda$8$lambda$7(r0, r1, r2)
                return
        }

        /* JADX INFO: renamed from: δ */
        public static /* synthetic */ void m1386(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r0, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r1, android.view.View r2) {
                getView$lambda$11(r0, r1, r2)
                return
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r0 = this;
                java.util.ArrayList<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> r0 = r0.data
                int r0 = r0.size()
                return r0
        }

        @Override // android.widget.Adapter
        public com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord getItem(int r1) {
                r0 = this;
                java.util.ArrayList<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> r0 = r0.data
                java.lang.Object r0 = p000.AbstractC0984xh.m6641(r1, r0)
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r0 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord) r0
                return r0
        }

        @Override // android.widget.Adapter
        public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
                r0 = this;
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r0 = r0.getItem(r1)
                return r0
        }

        @Override // android.widget.Adapter
        public long getItemId(int r1) {
                r0 = this;
                long r0 = (long) r1
                return r0
        }

        public final p000.p70 getOnChanged() {
                r0 = this;
                p70 r0 = r0.onChanged
                return r0
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
                r11 = this;
                r0 = 0
                if (r13 != 0) goto L12
                x01 r13 = p000.x01.f11964
                android.app.Activity r1 = r11.activity
                android.view.LayoutInflater r13 = r13.m6477(r1)
                r1 = 2131492939(0x7f0c004b, float:1.8609344E38)
                android.view.View r13 = r13.inflate(r1, r14, r0)
            L12:
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r12 = r11.getItem(r12)
                if (r12 != 0) goto L1c
                r13.getClass()
                return r13
            L1c:
                boolean r14 = r12.getHasNewReplies()
                if (r14 != 0) goto L2f
                java.util.List r14 = r12.getNewReplyItems()
                boolean r14 = r14.isEmpty()
                if (r14 != 0) goto L2d
                goto L2f
            L2d:
                r14 = r0
                goto L30
            L2f:
                r14 = 1
            L30:
                android.app.Activity r1 = r11.activity
                xx r1 = p000.jx0.m3049(r1)
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkListDialog r2 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkListDialog.INSTANCE
                r13.getClass()
                r2.applyBookmarkItemTheme(r13, r1, r14)
                r2 = 2131297054(0x7f09031e, float:1.8212042E38)
                android.view.View r2 = r13.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                java.lang.String r3 = r12.getAuthorName()
                boolean r4 = p000.q02.m4671(r3)
                if (r4 == 0) goto L53
                java.lang.String r3 = "未知用户"
            L53:
                r2.setText(r3)
                r2 = 2131297064(0x7f090328, float:1.8212062E38)
                android.view.View r2 = r13.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                java.lang.String r3 = r12.getContent()
                boolean r4 = p000.q02.m4671(r3)
                if (r4 == 0) goto L6d
                java.lang.String r3 = r12.getCommentId()
            L6d:
                r2.setText(r3)
                r2 = 2131297141(0x7f090375, float:1.8212219E38)
                android.view.View r2 = r13.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                java.lang.String r3 = r12.getUserTag()
                boolean r4 = p000.q02.m4671(r3)
                if (r4 == 0) goto L85
                java.lang.String r3 = "默认"
            L85:
                r2.setText(r3)
                r2 = 2131297109(0x7f090355, float:1.8212154E38)
                android.view.View r2 = r13.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                java.lang.String r3 = r12.getRemark()
                boolean r3 = p000.q02.m4671(r3)
                r4 = 8
                if (r3 != 0) goto Lb6
                r2.setVisibility(r0)
                java.lang.String r3 = r12.getRemark()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "备注："
                r5.<init>(r6)
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                r2.setText(r3)
                goto Lb9
            Lb6:
                r2.setVisibility(r4)
            Lb9:
                r2 = 2131297138(0x7f090372, float:1.8212212E38)
                android.view.View r2 = r13.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                if (r14 == 0) goto Ld5
                int r3 = r12.getNewReplyCount()
                if (r3 <= 0) goto Ld5
                int r3 = r12.getNewReplyCount()
                java.lang.String r5 = "新回复 +"
                java.lang.String r3 = p000.a12.m17(r5, r3)
                goto Ldc
            Ld5:
                if (r14 == 0) goto Lda
                java.lang.String r3 = "有新回复"
                goto Ldc
            Lda:
                java.lang.String r3 = "已关注"
            Ldc:
                r2.setText(r3)
                if (r14 == 0) goto Le4
                java.lang.String r1 = r1.f12366
                goto Le6
            Le4:
                java.lang.String r1 = r1.f12360
            Le6:
                r3 = 2131297097(0x7f090349, float:1.821213E38)
                android.view.View r1 = p000.lz1.m3682(r1, r2, r13, r3)
                android.widget.TextView r1 = (android.widget.TextView) r1
                if (r14 == 0) goto Lf4
                java.lang.String r2 = "点击查看新回复"
                goto Lf6
            Lf4:
                java.lang.String r2 = "长按删除"
            Lf6:
                r1.setText(r2)
                r1 = 2131297103(0x7f09034f, float:1.8212141E38)
                android.view.View r1 = r13.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                java.util.List r2 = r12.getNewReplyItems()
                java.util.Iterator r2 = r2.iterator()
                boolean r3 = r2.hasNext()
                if (r3 != 0) goto L112
                r2 = 0
                goto L13d
            L112:
                java.lang.Object r3 = r2.next()
                boolean r5 = r2.hasNext()
                if (r5 != 0) goto L11e
            L11c:
                r2 = r3
                goto L13d
            L11e:
                r5 = r3
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r5 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem) r5
                long r5 = r5.getCreateTime()
            L125:
                java.lang.Object r7 = r2.next()
                r8 = r7
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r8 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem) r8
                long r8 = r8.getCreateTime()
                int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r10 >= 0) goto L136
                r3 = r7
                r5 = r8
            L136:
                boolean r7 = r2.hasNext()
                if (r7 != 0) goto L125
                goto L11c
            L13d:
                com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r2 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem) r2
                if (r2 == 0) goto L166
                r1.setVisibility(r0)
                java.lang.String r3 = r2.getAuthorName()
                java.lang.String r2 = r2.getContent()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "新回复："
                r5.<init>(r6)
                r5.append(r3)
                java.lang.String r3 = "："
                r5.append(r3)
                r5.append(r2)
                java.lang.String r2 = r5.toString()
                r1.setText(r2)
                goto L193
            L166:
                boolean r2 = r12.getHasNewReplies()
                if (r2 == 0) goto L190
                int r2 = r12.getNewReplyCount()
                if (r2 <= 0) goto L190
                r1.setVisibility(r0)
                int r2 = r12.getNewReplyCount()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r5 = "检测到 "
                r3.<init>(r5)
                r3.append(r2)
                java.lang.String r2 = " 条新回复"
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r1.setText(r2)
                goto L193
            L190:
                r1.setVisibility(r4)
            L193:
                r1 = 2131296365(0x7f09006d, float:1.8210645E38)
                android.view.View r1 = r13.findViewById(r1)
                android.widget.Button r1 = (android.widget.Button) r1
                if (r14 == 0) goto L1a0
                r2 = r0
                goto L1a1
            L1a0:
                r2 = r4
            L1a1:
                r1.setVisibility(r2)
                com.example.dyhelper.hook.comment.bookmark.ι r2 = new com.example.dyhelper.hook.comment.bookmark.ι
                r2.<init>(r11, r12, r0)
                r1.setOnClickListener(r2)
                r1 = 2131296354(0x7f090062, float:1.8210622E38)
                android.view.View r1 = r13.findViewById(r1)
                android.widget.Button r1 = (android.widget.Button) r1
                if (r14 == 0) goto L1b8
                goto L1b9
            L1b8:
                r0 = r4
            L1b9:
                r1.setVisibility(r0)
                com.example.dyhelper.hook.comment.bookmark.ι r14 = new com.example.dyhelper.hook.comment.bookmark.ι
                r14.<init>(r12, r11)
                r1.setOnClickListener(r14)
                r14 = 2131296353(0x7f090061, float:1.821062E38)
                android.view.View r14 = r13.findViewById(r14)
                android.widget.Button r14 = (android.widget.Button) r14
                com.example.dyhelper.hook.comment.bookmark.ι r0 = new com.example.dyhelper.hook.comment.bookmark.ι
                r1 = 2
                r0.<init>(r11, r12, r1)
                r14.setOnClickListener(r0)
                return r13
        }

        public final void setData(java.util.List<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> r4) {
                r3 = this;
                r4.getClass()
                java.util.ArrayList<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> r0 = r3.data
                r0.clear()
                java.util.ArrayList<com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord> r0 = r3.data
                com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$CommentBookmarkAdapter$setData$$inlined$compareByDescending$1 r1 = new com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$CommentBookmarkAdapter$setData$$inlined$compareByDescending$1
                r1.<init>()
                com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$CommentBookmarkAdapter$setData$$inlined$thenByDescending$1 r2 = new com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$CommentBookmarkAdapter$setData$$inlined$thenByDescending$1
                r2.<init>(r1)
                java.util.List r4 = p000.AbstractC0984xh.m6658(r4, r2)
                r0.addAll(r4)
                r3.notifyDataSetChanged()
                return
        }

        public final void setOnChanged(p000.p70 r1) {
                r0 = this;
                r0.onChanged = r1
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class ProfileBookmarkAdapter extends android.widget.BaseAdapter {
        private final android.app.Activity activity;
        private final java.util.ArrayList<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord> data;
        private p000.p70 onChanged;

        public ProfileBookmarkAdapter(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                r0.<init>()
                r0.activity = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.data = r1
                return
        }

        private static final void getView$lambda$10$lambda$9(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r1, android.view.View r2) {
                com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore r2 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.INSTANCE
                java.lang.String r0 = r0.uniqueKey()
                r2.markRead(r0)
                p70 r0 = r1.onChanged
                if (r0 == 0) goto L10
                r0.invoke()
            L10:
                return
        }

        private static final void getView$lambda$11(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r1, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r2, android.view.View r3) {
                com.example.dyhelper.hook.comment.bookmark.BookmarkNativeJump r3 = com.example.dyhelper.hook.comment.bookmark.BookmarkNativeJump.INSTANCE
                android.app.Activity r0 = r1.activity
                boolean r2 = r3.jumpToProfile(r0, r2)
                android.app.Activity r1 = r1.activity
                r3 = 0
                if (r2 == 0) goto L17
                java.lang.String r2 = "正在打开主页..."
                android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r3)
                r1.show()
                return
            L17:
                java.lang.String r2 = "跳转失败"
                android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r3)
                r1.show()
                return
        }

        private static final void getView$lambda$8$lambda$7(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r3, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r4, android.view.View r5) {
                com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r5 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.INSTANCE
                android.app.Activity r0 = r3.activity
                com.example.dyhelper.hook.comment.bookmark.κ r1 = new com.example.dyhelper.hook.comment.bookmark.κ
                r2 = 1
                r1.<init>(r3, r2)
                com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.access$showNewAwemeDetailDialog(r5, r0, r4, r1)
                return
        }

        private static final p000.s62 getView$lambda$8$lambda$7$lambda$6(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r0) {
                p70 r0 = r0.onChanged
                if (r0 == 0) goto L7
                r0.invoke()
            L7:
                s62 r0 = p000.s62.f9751
                return r0
        }

        /* JADX INFO: renamed from: α */
        public static /* synthetic */ void m1387(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r0, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1, android.view.View r2) {
                getView$lambda$11(r0, r1, r2)
                return
        }

        /* JADX INFO: renamed from: β */
        public static /* synthetic */ p000.s62 m1388(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r0) {
                s62 r0 = getView$lambda$8$lambda$7$lambda$6(r0)
                return r0
        }

        /* JADX INFO: renamed from: γ */
        public static /* synthetic */ void m1389(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r0, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1, android.view.View r2) {
                getView$lambda$8$lambda$7(r0, r1, r2)
                return
        }

        /* JADX INFO: renamed from: δ */
        public static /* synthetic */ void m1390(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r0, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1, android.view.View r2) {
                getView$lambda$10$lambda$9(r1, r0, r2)
                return
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r0 = this;
                java.util.ArrayList<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord> r0 = r0.data
                int r0 = r0.size()
                return r0
        }

        @Override // android.widget.Adapter
        public com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord getItem(int r1) {
                r0 = this;
                java.util.ArrayList<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord> r0 = r0.data
                java.lang.Object r0 = p000.AbstractC0984xh.m6641(r1, r0)
                com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord) r0
                return r0
        }

        @Override // android.widget.Adapter
        public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
                r0 = this;
                com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0 = r0.getItem(r1)
                return r0
        }

        @Override // android.widget.Adapter
        public long getItemId(int r1) {
                r0 = this;
                long r0 = (long) r1
                return r0
        }

        public final p000.p70 getOnChanged() {
                r0 = this;
                p70 r0 = r0.onChanged
                return r0
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
                r11 = this;
                r0 = 0
                if (r13 != 0) goto L12
                x01 r13 = p000.x01.f11964
                android.app.Activity r1 = r11.activity
                android.view.LayoutInflater r13 = r13.m6477(r1)
                r1 = 2131492953(0x7f0c0059, float:1.8609372E38)
                android.view.View r13 = r13.inflate(r1, r14, r0)
            L12:
                com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r12 = r11.getItem(r12)
                if (r12 != 0) goto L1c
                r13.getClass()
                return r13
            L1c:
                android.app.Activity r14 = r11.activity
                xx r14 = p000.jx0.m3049(r14)
                boolean r1 = r12.getHasNewAweme()
                com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r2 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.INSTANCE
                r13.getClass()
                com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.access$applyProfileItemTheme(r2, r13, r14, r1)
                r2 = 2131297104(0x7f090350, float:1.8212143E38)
                android.view.View r2 = r13.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                java.lang.String r3 = r12.displayName()
                r2.setText(r3)
                r2 = 2131297141(0x7f090375, float:1.8212219E38)
                android.view.View r2 = r13.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                java.lang.String r3 = r12.getGroup()
                boolean r4 = p000.q02.m4671(r3)
                if (r4 == 0) goto L53
                java.lang.String r3 = "默认"
            L53:
                r2.setText(r3)
                r2 = 2131297109(0x7f090355, float:1.8212154E38)
                android.view.View r2 = r13.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                java.lang.String r3 = r12.getRemark()
                boolean r3 = p000.q02.m4671(r3)
                r4 = 8
                if (r3 != 0) goto L84
                r2.setVisibility(r0)
                java.lang.String r3 = r12.getRemark()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "备注："
                r5.<init>(r6)
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                r2.setText(r3)
                goto L87
            L84:
                r2.setVisibility(r4)
            L87:
                r2 = 2131297112(0x7f090358, float:1.821216E38)
                android.view.View r2 = r13.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                java.lang.String r3 = r12.getSignature()
                boolean r5 = p000.q02.m4671(r3)
                if (r5 == 0) goto L9c
                java.lang.String r3 = "暂无签名"
            L9c:
                r2.setText(r3)
                r2 = 2131297138(0x7f090372, float:1.8212212E38)
                android.view.View r2 = r13.findViewById(r2)
                android.widget.TextView r2 = (android.widget.TextView) r2
                if (r1 == 0) goto Lb5
                int r3 = r12.getNewAwemeCount()
                java.lang.String r5 = "新作品 +"
                java.lang.String r3 = p000.a12.m17(r5, r3)
                goto Lb7
            Lb5:
                java.lang.String r3 = "已关注"
            Lb7:
                r2.setText(r3)
                if (r1 == 0) goto Lbf
                java.lang.String r14 = r14.f12366
                goto Lc1
            Lbf:
                java.lang.String r14 = r14.f12360
            Lc1:
                r3 = 2131297097(0x7f090349, float:1.821213E38)
                android.view.View r14 = p000.lz1.m3682(r14, r2, r13, r3)
                android.widget.TextView r14 = (android.widget.TextView) r14
                if (r1 == 0) goto Lcf
                java.lang.String r2 = "点击查看作品"
                goto Ld1
            Lcf:
                java.lang.String r2 = "长按取消关注"
            Ld1:
                r14.setText(r2)
                r14 = 2131297100(0x7f09034c, float:1.8212135E38)
                android.view.View r14 = r13.findViewById(r14)
                android.widget.TextView r14 = (android.widget.TextView) r14
                java.util.List r2 = r12.getNewAwemeItems()
                java.util.Iterator r2 = r2.iterator()
                boolean r3 = r2.hasNext()
                if (r3 != 0) goto Led
                r2 = 0
                goto L118
            Led:
                java.lang.Object r3 = r2.next()
                boolean r5 = r2.hasNext()
                if (r5 != 0) goto Lf9
            Lf7:
                r2 = r3
                goto L118
            Lf9:
                r5 = r3
                com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r5 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem) r5
                long r5 = r5.getCreateTime()
            L100:
                java.lang.Object r7 = r2.next()
                r8 = r7
                com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r8 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem) r8
                long r8 = r8.getCreateTime()
                int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r10 >= 0) goto L111
                r3 = r7
                r5 = r8
            L111:
                boolean r7 = r2.hasNext()
                if (r7 != 0) goto L100
                goto Lf7
            L118:
                com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r2 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem) r2
                if (r2 == 0) goto L13d
                r14.setVisibility(r0)
                java.lang.String r2 = r2.getDesc()
                boolean r3 = p000.q02.m4671(r2)
                if (r3 == 0) goto L12b
                java.lang.String r2 = "[无描述]"
            L12b:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r5 = "新作品："
                r3.<init>(r5)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r14.setText(r2)
                goto L140
            L13d:
                r14.setVisibility(r4)
            L140:
                r14 = 2131296364(0x7f09006c, float:1.8210643E38)
                android.view.View r14 = r13.findViewById(r14)
                android.widget.Button r14 = (android.widget.Button) r14
                if (r1 == 0) goto L14d
                r2 = r0
                goto L14e
            L14d:
                r2 = r4
            L14e:
                r14.setVisibility(r2)
                com.example.dyhelper.hook.comment.bookmark.λ r2 = new com.example.dyhelper.hook.comment.bookmark.λ
                r2.<init>(r11, r12, r0)
                r14.setOnClickListener(r2)
                r14 = 2131296354(0x7f090062, float:1.8210622E38)
                android.view.View r14 = r13.findViewById(r14)
                android.widget.Button r14 = (android.widget.Button) r14
                if (r1 == 0) goto L165
                goto L166
            L165:
                r0 = r4
            L166:
                r14.setVisibility(r0)
                com.example.dyhelper.hook.comment.bookmark.λ r0 = new com.example.dyhelper.hook.comment.bookmark.λ
                r0.<init>(r12, r11)
                r14.setOnClickListener(r0)
                r14 = 2131296353(0x7f090061, float:1.821062E38)
                android.view.View r14 = r13.findViewById(r14)
                android.widget.Button r14 = (android.widget.Button) r14
                com.example.dyhelper.hook.comment.bookmark.λ r0 = new com.example.dyhelper.hook.comment.bookmark.λ
                r1 = 2
                r0.<init>(r11, r12, r1)
                r14.setOnClickListener(r0)
                return r13
        }

        public final void setData(java.util.List<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord> r4) {
                r3 = this;
                r4.getClass()
                java.util.ArrayList<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord> r0 = r3.data
                r0.clear()
                java.util.ArrayList<com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord> r0 = r3.data
                com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$ProfileBookmarkAdapter$setData$$inlined$compareByDescending$1 r1 = new com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$ProfileBookmarkAdapter$setData$$inlined$compareByDescending$1
                r1.<init>()
                com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$ProfileBookmarkAdapter$setData$$inlined$thenByDescending$1 r2 = new com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$ProfileBookmarkAdapter$setData$$inlined$thenByDescending$1
                r2.<init>(r1)
                java.util.List r4 = p000.AbstractC0984xh.m6658(r4, r2)
                r0.addAll(r4)
                r3.notifyDataSetChanged()
                return
        }

        public final void setOnChanged(p000.p70 r1) {
                r0 = this;
                r0.onChanged = r1
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
    public static final class VideoBookmarkAdapter extends android.widget.BaseAdapter {
        private final android.app.Activity activity;
        private final java.util.ArrayList<com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord> data;
        private p000.p70 onChanged;

        public VideoBookmarkAdapter(android.app.Activity r1) {
                r0 = this;
                r1.getClass()
                r0.<init>()
                r0.activity = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.data = r1
                return
        }

        private static final void getView$lambda$1(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r0, com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r1, android.view.View r2) {
                com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r2 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.INSTANCE
                android.app.Activity r0 = r0.activity
                com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.access$jumpToVideo(r2, r0, r1)
                return
        }

        private static final void getView$lambda$2(com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r0, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r1, android.view.View r2) {
                com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore r2 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.INSTANCE
                java.lang.String r0 = r0.getAwemeId()
                r2.remove(r0)
                p70 r0 = r1.onChanged
                if (r0 == 0) goto L10
                r0.invoke()
            L10:
                android.app.Activity r0 = r1.activity
                java.lang.String r1 = "已删除作品书签"
                r2 = 0
                android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
                r0.show()
                return
        }

        /* JADX INFO: renamed from: α */
        public static /* synthetic */ void m1391(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r0, com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r1, android.view.View r2) {
                getView$lambda$2(r1, r0, r2)
                return
        }

        /* JADX INFO: renamed from: β */
        public static /* synthetic */ void m1392(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r0, com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r1, android.view.View r2) {
                getView$lambda$1(r0, r1, r2)
                return
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r0 = this;
                java.util.ArrayList<com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord> r0 = r0.data
                int r0 = r0.size()
                return r0
        }

        @Override // android.widget.Adapter
        public com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord getItem(int r1) {
                r0 = this;
                java.util.ArrayList<com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord> r0 = r0.data
                java.lang.Object r0 = p000.AbstractC0984xh.m6641(r1, r0)
                com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r0 = (com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord) r0
                return r0
        }

        @Override // android.widget.Adapter
        public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
                r0 = this;
                com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r0 = r0.getItem(r1)
                return r0
        }

        @Override // android.widget.Adapter
        public long getItemId(int r1) {
                r0 = this;
                long r0 = (long) r1
                return r0
        }

        public final p000.p70 getOnChanged() {
                r0 = this;
                p70 r0 = r0.onChanged
                return r0
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
                r5 = this;
                if (r7 != 0) goto L12
                x01 r7 = p000.x01.f11964
                android.app.Activity r0 = r5.activity
                android.view.LayoutInflater r7 = r7.m6477(r0)
                r0 = 2131492959(0x7f0c005f, float:1.8609385E38)
                r1 = 0
                android.view.View r7 = r7.inflate(r0, r8, r1)
            L12:
                com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r6 = r5.getItem(r6)
                if (r6 != 0) goto L1c
                r7.getClass()
                return r7
            L1c:
                android.app.Activity r8 = r5.activity
                xx r8 = p000.jx0.m3049(r8)
                com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r0 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.INSTANCE
                r7.getClass()
                com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.access$applyVideoItemTheme(r0, r7, r8)
                r8 = 2131296774(0x7f090206, float:1.8211474E38)
                android.view.View r8 = r7.findViewById(r8)
                android.widget.ImageView r8 = (android.widget.ImageView) r8
                int r1 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.access$resolveWorkIcon(r0, r6)
                r8.setImageResource(r1)
                r1 = 28
                int r2 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.access$dp(r0, r1)
                r3 = 42
                int r4 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.access$dp(r0, r3)
                int r1 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.access$dp(r0, r1)
                int r3 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.access$dp(r0, r3)
                r8.setPadding(r2, r4, r1, r3)
                android.app.Activity r1 = r5.activity
                java.lang.String r2 = r6.getCoverUrl()
                com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.access$loadCoverAsync(r0, r1, r2, r8)
                r8 = 2131297142(0x7f090376, float:1.821222E38)
                android.view.View r8 = r7.findViewById(r8)
                android.widget.TextView r8 = (android.widget.TextView) r8
                java.lang.String r1 = r6.displayTitle()
                r8.setText(r1)
                r8 = 2131297054(0x7f09031e, float:1.8212042E38)
                android.view.View r8 = r7.findViewById(r8)
                android.widget.TextView r8 = (android.widget.TextView) r8
                java.lang.String r1 = r6.displayAuthor()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "@"
                r2.<init>(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r8.setText(r1)
                r8 = 2131297069(0x7f09032d, float:1.8212073E38)
                android.view.View r8 = r7.findViewById(r8)
                android.widget.TextView r8 = (android.widget.TextView) r8
                long r1 = r6.getDiggCount()
                java.lang.String r1 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.access$formatCount(r0, r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "赞 "
                r2.<init>(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r8.setText(r1)
                r8 = 2131297061(0x7f090325, float:1.8212056E38)
                android.view.View r8 = r7.findViewById(r8)
                android.widget.TextView r8 = (android.widget.TextView) r8
                long r1 = r6.getCommentCount()
                java.lang.String r1 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.access$formatCount(r0, r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "评 "
                r2.<init>(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r8.setText(r1)
                r8 = 2131297060(0x7f090324, float:1.8212054E38)
                android.view.View r8 = r7.findViewById(r8)
                android.widget.TextView r8 = (android.widget.TextView) r8
                long r1 = r6.getCollectCount()
                java.lang.String r0 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.access$formatCount(r0, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "藏 "
                r1.<init>(r2)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r8.setText(r0)
                r8 = 2131297097(0x7f090349, float:1.821213E38)
                android.view.View r8 = r7.findViewById(r8)
                android.widget.TextView r8 = (android.widget.TextView) r8
                java.lang.String r0 = "点击跳转，长按删除"
                r8.setText(r0)
                r8 = 2131296353(0x7f090061, float:1.821062E38)
                android.view.View r8 = r7.findViewById(r8)
                android.widget.Button r8 = (android.widget.Button) r8
                com.example.dyhelper.hook.comment.bookmark.μ r0 = new com.example.dyhelper.hook.comment.bookmark.μ
                r0.<init>(r5, r6)
                r8.setOnClickListener(r0)
                r8 = 2131296346(0x7f09005a, float:1.8210606E38)
                android.view.View r8 = r7.findViewById(r8)
                android.widget.Button r8 = (android.widget.Button) r8
                com.example.dyhelper.hook.comment.bookmark.μ r0 = new com.example.dyhelper.hook.comment.bookmark.μ
                r0.<init>(r6, r5)
                r8.setOnClickListener(r0)
                return r7
        }

        public final void setData(java.util.List<com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord> r3) {
                r2 = this;
                r3.getClass()
                java.util.ArrayList<com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord> r0 = r2.data
                r0.clear()
                java.util.ArrayList<com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord> r0 = r2.data
                com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$VideoBookmarkAdapter$setData$$inlined$sortedByDescending$1 r1 = new com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$VideoBookmarkAdapter$setData$$inlined$sortedByDescending$1
                r1.<init>()
                java.util.List r3 = p000.AbstractC0984xh.m6658(r3, r1)
                r0.addAll(r3)
                r2.notifyDataSetChanged()
                return
        }

        public final void setOnChanged(p000.p70 r1) {
                r0 = this;
                r0.onChanged = r1
                return
        }
    }

    static {
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r0 = new com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.INSTANCE = r0
            r0 = 8
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.$stable = r0
            return
    }

    private BookmarkManagerDialog() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ void access$applyProfileItemTheme(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r0, android.view.View r1, p000.C1000xx r2, boolean r3) {
            r0.applyProfileItemTheme(r1, r2, r3)
            return
    }

    public static final /* synthetic */ void access$applyVideoItemTheme(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r0, android.view.View r1, p000.C1000xx r2) {
            r0.applyVideoItemTheme(r1, r2)
            return
    }

    public static final /* synthetic */ int access$dp(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r0, int r1) {
            int r0 = r0.m1354dp(r1)
            return r0
    }

    public static final /* synthetic */ java.lang.String access$formatCount(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r0, long r1) {
            java.lang.String r0 = r0.formatCount(r1)
            return r0
    }

    public static final /* synthetic */ void access$jumpToVideo(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r0, android.app.Activity r1, com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r2) {
            r0.jumpToVideo(r1, r2)
            return
    }

    public static final /* synthetic */ void access$loadCoverAsync(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r0, android.app.Activity r1, java.lang.String r2, android.widget.ImageView r3) {
            r0.loadCoverAsync(r1, r2, r3)
            return
    }

    public static final /* synthetic */ int access$resolveWorkIcon(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r0, com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r1) {
            int r0 = r0.resolveWorkIcon(r1)
            return r0
    }

    public static final /* synthetic */ void access$showNewAwemeDetailDialog(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r0, android.app.Activity r1, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r2, p000.p70 r3) {
            r0.showNewAwemeDetailDialog(r1, r2, r3)
            return
    }

    private final void addAwemeItemView(android.widget.LinearLayout r11, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r12, boolean r13, p000.C1000xx r14) {
            r10 = this;
            android.content.Context r10 = r11.getContext()
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r10)
            r1 = 1
            r0.setOrientation(r1)
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r2 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.INSTANCE
            r3 = 12
            int r4 = r2.m1354dp(r3)
            r5 = 10
            int r6 = r2.m1354dp(r5)
            int r3 = r2.m1354dp(r3)
            int r5 = r2.m1354dp(r5)
            r0.setPadding(r4, r6, r3, r5)
            java.lang.String r3 = r14.f12352
            int r3 = android.graphics.Color.parseColor(r3)
            r0.setBackgroundColor(r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r10)
            java.lang.String r4 = r12.getDesc()
            boolean r5 = p000.q02.m4671(r4)
            if (r5 == 0) goto L40
            java.lang.String r4 = "[无描述]"
        L40:
            r3.setText(r4)
            r4 = 1095761920(0x41500000, float:13.0)
            r3.setTextSize(r4)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT_BOLD
            r3.setTypeface(r4)
            java.lang.String r4 = r14.f12355
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setTextColor(r4)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r10)
            java.util.Date r5 = new java.util.Date
            long r6 = r12.getCreateTime()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            r5.<init>(r6)
            java.text.SimpleDateFormat r12 = new java.text.SimpleDateFormat
            java.lang.String r6 = "yyyy-MM-dd HH:mm"
            java.util.Locale r7 = java.util.Locale.getDefault()
            r12.<init>(r6, r7)
            java.lang.String r12 = r12.format(r5)
            r4.setText(r12)
            r12 = 1093664768(0x41300000, float:11.0)
            r4.setTextSize(r12)
            java.lang.String r12 = r14.f12356
            int r12 = android.graphics.Color.parseColor(r12)
            r4.setTextColor(r12)
            r12 = 4
            int r12 = r2.m1354dp(r12)
            r2 = 0
            r4.setPadding(r2, r12, r2, r2)
            r0.addView(r3)
            r0.addView(r4)
            r11.addView(r0)
            if (r13 == 0) goto Lb5
            android.view.View r12 = new android.view.View
            r12.<init>(r10)
            java.lang.String r10 = r14.f12353
            int r10 = android.graphics.Color.parseColor(r10)
            r12.setBackgroundColor(r10)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r13 = -1
            r10.<init>(r13, r1)
            r12.setLayoutParams(r10)
            r11.addView(r12)
        Lb5:
            return
    }

    private final void applyButtonTheme(android.app.Activity r3, android.view.View r4, p000.C1000xx r5) {
            r2 = this;
            r2 = 2131296358(0x7f090066, float:1.821063E38)
            android.view.View r2 = r4.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r0 = 1
            applyButtonTheme$styleButton(r3, r5, r2, r0)
            r2 = 2131296342(0x7f090056, float:1.8210598E38)
            android.view.View r2 = r4.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r1 = 0
            applyButtonTheme$styleButton(r3, r5, r2, r1)
            r2 = 2131296349(0x7f09005d, float:1.8210612E38)
            android.view.View r2 = r4.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            applyButtonTheme$styleButton(r3, r5, r2, r0)
            r2 = 2131296348(0x7f09005c, float:1.821061E38)
            android.view.View r2 = r4.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            applyButtonTheme$styleButton(r3, r5, r2, r1)
            r2 = 2131296347(0x7f09005b, float:1.8210608E38)
            android.view.View r2 = r4.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            applyButtonTheme$styleButton(r3, r5, r2, r1)
            return
    }

    private static final void applyButtonTheme$styleButton(android.app.Activity r1, p000.C1000xx r2, android.widget.Button r3, boolean r4) {
            if (r3 != 0) goto L3
            return
        L3:
            r0 = 0
            r3.setAllCaps(r0)
            r0 = 12
            if (r4 == 0) goto L1b
            r4 = -1
            r3.setTextColor(r4)
            java.lang.String r4 = r2.f12348
            java.lang.String r2 = r2.f12358
            android.graphics.drawable.RippleDrawable r1 = p000.jx0.m3059(r0, r1, r4, r2)
            r3.setBackground(r1)
            return
        L1b:
            java.lang.String r4 = r2.f12355
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setTextColor(r4)
            java.lang.String r4 = r2.f12348
            java.lang.String r2 = r2.f12371
            android.graphics.drawable.RippleDrawable r1 = p000.jx0.m3059(r0, r1, r4, r2)
            r3.setBackground(r1)
            return
    }

    private final void applyContainerBackgrounds(android.app.Activity r4, android.view.View r5, android.view.View r6, p000.C1000xx r7) {
            r3 = this;
            if (r6 == r5) goto L21
            boolean r0 = r6 instanceof android.widget.ListView
            if (r0 != 0) goto L13
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L21
            r0 = r6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L21
        L13:
            r0 = r6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            java.lang.String r1 = r7.f12352
            r2 = 12
            android.graphics.drawable.GradientDrawable r1 = p000.jx0.m3062(r2, r4, r1)
            r0.setBackground(r1)
        L21:
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L3b
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r0 = r6.getChildCount()
            r1 = 0
        L2c:
            if (r1 >= r0) goto L3b
            android.view.View r2 = r6.getChildAt(r1)
            r2.getClass()
            r3.applyContainerBackgrounds(r4, r5, r2, r7)
            int r1 = r1 + 1
            goto L2c
        L3b:
            return
    }

    private final void applyDialogTheme(android.app.Activity r3, android.view.View r4) {
            r2 = this;
            xx r0 = p000.jx0.m3049(r3)
            java.lang.String r1 = r0.f12351
            int r1 = android.graphics.Color.parseColor(r1)
            r4.setBackgroundColor(r1)
            r2.applyContainerBackgrounds(r3, r4, r4, r0)
            r2.applyTextColors(r4, r0)
            r2.applyListViewTheme(r4, r0)
            r2.applyButtonTheme(r3, r4, r0)
            return
    }

    private final void applyListViewTheme(android.view.View r3, p000.C1000xx r4) {
            r2 = this;
            r2 = 2131296780(0x7f09020c, float:1.8211486E38)
            android.view.View r2 = r3.findViewById(r2)
            android.widget.ListView r2 = (android.widget.ListView) r2
            if (r2 != 0) goto Lc
            return
        Lc:
            android.content.Context r3 = r2.getContext()
            r3.getClass()
            java.lang.String r0 = r4.f12352
            r1 = 12
            android.graphics.drawable.GradientDrawable r3 = p000.jx0.m3062(r1, r3, r0)
            r2.setBackground(r3)
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            java.lang.String r0 = r4.f12353
            int r0 = android.graphics.Color.parseColor(r0)
            r3.<init>(r0)
            r2.setDivider(r3)
            r3 = 1
            r2.setDividerHeight(r3)
            java.lang.String r3 = r4.f12348
            android.graphics.drawable.RippleDrawable r3 = p000.jx0.m3034(r3)
            r2.setSelector(r3)
            return
    }

    private final void applyProfileItemTheme(android.view.View r10, p000.C1000xx r11, boolean r12) {
            r9 = this;
            java.lang.String r9 = r11.f12352
            java.lang.String r0 = r11.f12360
            java.lang.String r1 = r11.f12366
            java.lang.String r2 = r11.f12357
            java.lang.String r3 = r11.f12348
            int r9 = android.graphics.Color.parseColor(r9)
            r10.setBackgroundColor(r9)
            r9 = 2131297104(0x7f090350, float:1.8212143E38)
            android.view.View r9 = r10.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.String r4 = r11.f12355
            r5 = 2131297112(0x7f090358, float:1.821216E38)
            android.view.View r9 = p000.lz1.m3682(r4, r9, r10, r5)
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.String r5 = r11.f12356
            r6 = 2131297141(0x7f090375, float:1.8212219E38)
            android.view.View r9 = p000.lz1.m3682(r5, r9, r10, r6)
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L4d
            java.lang.String r6 = r11.f12358
            int r6 = android.graphics.Color.parseColor(r6)
            r9.setTextColor(r6)
            android.content.Context r6 = r9.getContext()
            r6.getClass()
            java.lang.String r7 = r11.f12359
            r8 = 99
            android.graphics.drawable.GradientDrawable r6 = p000.jx0.m3062(r8, r6, r7)
            r9.setBackground(r6)
        L4d:
            r9 = 2131297109(0x7f090355, float:1.8212154E38)
            android.view.View r9 = r10.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto L5f
            int r6 = android.graphics.Color.parseColor(r2)
            r9.setTextColor(r6)
        L5f:
            r9 = 2131297138(0x7f090372, float:1.8212212E38)
            android.view.View r9 = r10.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r12 == 0) goto L6c
            r6 = r1
            goto L6d
        L6c:
            r6 = r0
        L6d:
            r7 = 2131297097(0x7f090349, float:1.821213E38)
            android.view.View r9 = p000.lz1.m3682(r6, r9, r10, r7)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r6 = 2131297100(0x7f09034c, float:1.8212135E38)
            android.view.View r9 = p000.lz1.m3682(r2, r9, r10, r6)
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r12 == 0) goto L82
            r5 = r4
        L82:
            r12 = 2131296364(0x7f09006c, float:1.8210643E38)
            android.view.View r9 = p000.lz1.m3682(r5, r9, r10, r12)
            android.widget.Button r9 = (android.widget.Button) r9
            r12 = -1
            r9.setTextColor(r12)
            android.content.Context r2 = r9.getContext()
            r2.getClass()
            r5 = 10
            android.graphics.drawable.RippleDrawable r1 = p000.jx0.m3059(r5, r2, r3, r1)
            r9.setBackground(r1)
            r9 = 2131296354(0x7f090062, float:1.8210622E38)
            android.view.View r9 = r10.findViewById(r9)
            android.widget.Button r9 = (android.widget.Button) r9
            r9.setTextColor(r12)
            android.content.Context r12 = r9.getContext()
            r12.getClass()
            android.graphics.drawable.RippleDrawable r12 = p000.jx0.m3059(r5, r12, r3, r0)
            r9.setBackground(r12)
            r9 = 2131296353(0x7f090061, float:1.821062E38)
            android.view.View r9 = r10.findViewById(r9)
            android.widget.Button r9 = (android.widget.Button) r9
            int r10 = android.graphics.Color.parseColor(r4)
            r9.setTextColor(r10)
            android.content.Context r10 = r9.getContext()
            r10.getClass()
            java.lang.String r11 = r11.f12371
            android.graphics.drawable.RippleDrawable r10 = p000.jx0.m3059(r5, r10, r3, r11)
            r9.setBackground(r10)
            return
    }

    private final void applyTextColors(android.view.View r4, p000.C1000xx r5) {
            r3 = this;
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L46
            boolean r0 = r4 instanceof android.widget.Button
            if (r0 != 0) goto L46
            r0 = r4
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = r0.getId()
            r2 = 2131297058(0x7f090322, float:1.821205E38)
            if (r1 != r2) goto L17
            java.lang.String r1 = r5.f12366
            goto L3f
        L17:
            r2 = 2131297065(0x7f090329, float:1.8212064E38)
            if (r1 != r2) goto L1f
            java.lang.String r1 = r5.f12360
            goto L3f
        L1f:
            r2 = 2131297101(0x7f09034d, float:1.8212137E38)
            if (r1 != r2) goto L27
            java.lang.String r1 = r5.f12366
            goto L3f
        L27:
            r2 = 2131297072(0x7f090330, float:1.8212079E38)
            if (r1 == r2) goto L3d
            r2 = 2131297073(0x7f090331, float:1.821208E38)
            if (r1 != r2) goto L32
            goto L3d
        L32:
            r2 = 2131297105(0x7f090351, float:1.8212146E38)
            if (r1 != r2) goto L3a
            java.lang.String r1 = r5.f12356
            goto L3f
        L3a:
            java.lang.String r1 = r5.f12355
            goto L3f
        L3d:
            java.lang.String r1 = r5.f12357
        L3f:
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
        L46:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L60
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r1 = 0
        L51:
            if (r1 >= r0) goto L60
            android.view.View r2 = r4.getChildAt(r1)
            r2.getClass()
            r3.applyTextColors(r2, r5)
            int r1 = r1 + 1
            goto L51
        L60:
            return
    }

    private final void applyVideoItemTheme(android.view.View r7, p000.C1000xx r8) {
            r6 = this;
            java.lang.String r6 = r8.f12352
            int r6 = android.graphics.Color.parseColor(r6)
            r7.setBackgroundColor(r6)
            r6 = 2131297142(0x7f090376, float:1.821222E38)
            android.view.View r6 = r7.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r0 = r8.f12355
            r1 = 2131297054(0x7f09031e, float:1.8212042E38)
            android.view.View r6 = p000.lz1.m3682(r0, r6, r7, r1)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r1 = r8.f12356
            r2 = 2131297069(0x7f09032d, float:1.8212073E38)
            android.view.View r6 = p000.lz1.m3682(r1, r6, r7, r2)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r1 = r8.f12357
            r2 = 2131297061(0x7f090325, float:1.8212056E38)
            android.view.View r6 = p000.lz1.m3682(r1, r6, r7, r2)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r2 = 2131297060(0x7f090324, float:1.8212054E38)
            android.view.View r6 = p000.lz1.m3682(r1, r6, r7, r2)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r2 = 2131297097(0x7f090349, float:1.821213E38)
            android.view.View r6 = p000.lz1.m3682(r1, r6, r7, r2)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r2 = 2131296774(0x7f090206, float:1.8211474E38)
            android.view.View r6 = p000.lz1.m3682(r1, r6, r7, r2)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            android.content.Context r2 = r6.getContext()
            r2.getClass()
            java.lang.String r3 = r8.f12371
            r4 = 8
            android.graphics.drawable.GradientDrawable r2 = p000.jx0.m3062(r4, r2, r3)
            r6.setBackground(r2)
            int r1 = android.graphics.Color.parseColor(r1)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r6.setImageTintList(r1)
            r6 = 2131296353(0x7f090061, float:1.821062E38)
            android.view.View r6 = r7.findViewById(r6)
            android.widget.Button r6 = (android.widget.Button) r6
            r1 = 0
            r6.setAllCaps(r1)
            r2 = -1
            r6.setTextColor(r2)
            android.content.Context r2 = r6.getContext()
            r2.getClass()
            java.lang.String r4 = r8.f12348
            java.lang.String r8 = r8.f12358
            r5 = 10
            android.graphics.drawable.RippleDrawable r8 = p000.jx0.m3059(r5, r2, r4, r8)
            r6.setBackground(r8)
            r6 = 2131296346(0x7f09005a, float:1.8210606E38)
            android.view.View r6 = r7.findViewById(r6)
            android.widget.Button r6 = (android.widget.Button) r6
            r6.setAllCaps(r1)
            int r7 = android.graphics.Color.parseColor(r0)
            r6.setTextColor(r7)
            android.content.Context r7 = r6.getContext()
            r7.getClass()
            android.graphics.drawable.RippleDrawable r7 = p000.jx0.m3059(r5, r7, r4, r3)
            r6.setBackground(r7)
            return
    }

    /* JADX INFO: renamed from: dp */
    private final int m1354dp(int r1) {
            r0 = this;
            float r0 = (float) r1
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
    }

    private final java.lang.String formatCount(long r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L9
            java.lang.String r2 = "-"
            return r2
        L9:
            r0 = 100000000(0x5f5e100, double:4.94065646E-316)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L22
            double r3 = (double) r3
            r0 = 4726483295884279808(0x4197d78400000000, double:1.0E8)
            double r3 = r3 / r0
            java.lang.String r2 = r2.trimCount(r3)
            java.lang.String r3 = "亿"
            java.lang.String r2 = p000.AbstractC0602nx.m4129(r2, r3)
            return r2
        L22:
            r0 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L3a
            double r3 = (double) r3
            r0 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r3 = r3 / r0
            java.lang.String r2 = r2.trimCount(r3)
            java.lang.String r3 = "万"
            java.lang.String r2 = p000.AbstractC0602nx.m4129(r2, r3)
            return r2
        L3a:
            java.lang.String r2 = java.lang.String.valueOf(r3)
            return r2
    }

    private final void jumpToVideo(android.app.Activity r1, com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r2) {
            r0 = this;
            com.example.dyhelper.hook.comment.bookmark.BookmarkNativeJump r0 = com.example.dyhelper.hook.comment.bookmark.BookmarkNativeJump.INSTANCE
            boolean r0 = r0.jumpToVideo(r1, r2)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "正在打开作品..."
            goto Ld
        Lb:
            java.lang.String r0 = "跳转失败，可能作品已失效"
        Ld:
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
            return
    }

    private final void loadCoverAsync(android.app.Activity r3, java.lang.String r4, android.widget.ImageView r5) {
            r2 = this;
            boolean r2 = p000.q02.m4671(r4)
            if (r2 != 0) goto L21
            java.lang.String r2 = "http"
            r0 = 1
            boolean r2 = p000.x02.m6485(r4, r2, r0)
            if (r2 != 0) goto L10
            goto L21
        L10:
            r5.setTag(r4)
            java.lang.Thread r2 = new java.lang.Thread
            ra r0 = new ra
            r1 = 0
            r0.<init>(r4, r3, r5, r1)
            r2.<init>(r0)
            r2.start()
        L21:
            return
    }

    private static final void loadCoverAsync$lambda$51(java.lang.String r10, android.app.Activity r11, android.widget.ImageView r12) {
            r0 = 30
            r1 = 0
            vx r2 = p000.C0963wx.m6411(r10, r1, r1, r0)     // Catch: java.lang.Throwable -> L12
            java.io.BufferedInputStream r0 = r2.f11459     // Catch: java.lang.Throwable -> L14
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch: java.lang.Throwable -> L14
            r2.m6283()     // Catch: java.lang.Throwable -> L12
            r8 = r0
            goto L21
        L12:
            r0 = move-exception
            goto L19
        L14:
            r0 = move-exception
            r2.m6283()     // Catch: java.lang.Throwable -> L12
            throw r0     // Catch: java.lang.Throwable -> L12
        L19:
            java.lang.String r2 = "rb371d3ea6408f4c8"
            java.lang.String r3 = "video cover load failed"
            p000.C0888ux.m5977(r2, r3, r0)
            r8 = r1
        L21:
            if (r8 == 0) goto L2f
            qa r4 = new qa
            r9 = 0
            r6 = r10
            r7 = r11
            r5 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r7.runOnUiThread(r4)
        L2f:
            return
    }

    private static final void loadCoverAsync$lambda$51$lambda$50(android.widget.ImageView r1, java.lang.String r2, android.app.Activity r3, android.graphics.Bitmap r4) {
            java.lang.Object r0 = r1.getTag()
            boolean r2 = p000.ln0.m3626(r0, r2)
            if (r2 == 0) goto L1e
            r2 = 0
            r1.setImageTintList(r2)
            r2 = 0
            r1.setPadding(r2, r2, r2, r2)
            android.graphics.drawable.BitmapDrawable r2 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r3 = r3.getResources()
            r2.<init>(r3, r4)
            r1.setImageDrawable(r2)
        L1e:
            return
    }

    private final int resolveWorkIcon(com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r3) {
            r2 = this;
            java.lang.String r2 = r3.getTypeLabel()
            java.lang.String r0 = "图文"
            r1 = 0
            boolean r2 = p000.q02.m4654(r2, r0, r1)
            if (r2 == 0) goto L11
            r2 = 17301567(0x108003f, float:2.4979432E-38)
            return r2
        L11:
            java.lang.String r2 = r3.getTypeLabel()
            java.lang.String r0 = "文字"
            boolean r2 = p000.q02.m4654(r2, r0, r1)
            if (r2 == 0) goto L21
            r2 = 17301566(0x108003e, float:2.497943E-38)
            return r2
        L21:
            java.lang.String r2 = r3.getTypeLabel()
            java.lang.String r3 = "LivePhoto"
            boolean r2 = p000.q02.m4654(r2, r3, r1)
            if (r2 == 0) goto L31
            r2 = 17301587(0x1080053, float:2.4979488E-38)
            return r2
        L31:
            r2 = 17301540(0x1080024, float:2.4979356E-38)
            return r2
    }

    public static /* synthetic */ void show$default(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r0, android.app.Activity r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.show(r1, r2)
            return
    }

    private static final void show$lambda$28(android.app.Activity r28) {
            r2 = r28
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r15 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.INSTANCE
            r1 = 0
            android.app.AlertDialog r0 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.dialog     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto L11
            r0.dismiss()     // Catch: java.lang.Throwable -> Ld
            goto L11
        Ld:
            r0 = move-exception
        Le:
            r3 = r1
            goto L220
        L11:
            x01 r0 = p000.x01.f11964     // Catch: java.lang.Throwable -> Ld
            android.view.LayoutInflater r0 = r0.m6477(r2)     // Catch: java.lang.Throwable -> Ld
            r3 = 2131492894(0x7f0c001e, float:1.8609253E38)
            r4 = 0
            android.view.View r0 = r0.inflate(r3, r4, r1)     // Catch: java.lang.Throwable -> Ld
            r3 = 2131296980(0x7f0902d4, float:1.8211892E38)
            android.view.View r3 = r0.findViewById(r3)     // Catch: java.lang.Throwable -> Ld
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch: java.lang.Throwable -> Ld
            r5 = 2131296981(0x7f0902d5, float:1.8211894E38)
            android.view.View r5 = r0.findViewById(r5)     // Catch: java.lang.Throwable -> Ld
            android.widget.TextView r5 = (android.widget.TextView) r5     // Catch: java.lang.Throwable -> Ld
            r6 = 2131296982(0x7f0902d6, float:1.8211896E38)
            android.view.View r6 = r0.findViewById(r6)     // Catch: java.lang.Throwable -> Ld
            android.widget.TextView r6 = (android.widget.TextView) r6     // Catch: java.lang.Throwable -> Ld
            r7 = 2131296780(0x7f09020c, float:1.8211486E38)
            android.view.View r7 = r0.findViewById(r7)     // Catch: java.lang.Throwable -> Ld
            android.widget.ListView r7 = (android.widget.ListView) r7     // Catch: java.lang.Throwable -> Ld
            r8 = 2131297072(0x7f090330, float:1.8212079E38)
            android.view.View r8 = r0.findViewById(r8)     // Catch: java.lang.Throwable -> Ld
            android.widget.TextView r8 = (android.widget.TextView) r8     // Catch: java.lang.Throwable -> Ld
            r9 = 2131297065(0x7f090329, float:1.8212064E38)
            android.view.View r9 = r0.findViewById(r9)     // Catch: java.lang.Throwable -> Ld
            android.widget.TextView r9 = (android.widget.TextView) r9     // Catch: java.lang.Throwable -> Ld
            r10 = 2131297101(0x7f09034d, float:1.8212137E38)
            android.view.View r10 = r0.findViewById(r10)     // Catch: java.lang.Throwable -> Ld
            android.widget.TextView r10 = (android.widget.TextView) r10     // Catch: java.lang.Throwable -> Ld
            r11 = 2131297066(0x7f09032a, float:1.8212066E38)
            android.view.View r11 = r0.findViewById(r11)     // Catch: java.lang.Throwable -> Ld
            android.widget.TextView r11 = (android.widget.TextView) r11     // Catch: java.lang.Throwable -> Ld
            r12 = 2131297102(0x7f09034e, float:1.821214E38)
            android.view.View r12 = r0.findViewById(r12)     // Catch: java.lang.Throwable -> Ld
            android.widget.TextView r12 = (android.widget.TextView) r12     // Catch: java.lang.Throwable -> Ld
            r13 = 2131297059(0x7f090323, float:1.8212052E38)
            android.view.View r13 = r0.findViewById(r13)     // Catch: java.lang.Throwable -> Ld
            android.widget.TextView r13 = (android.widget.TextView) r13     // Catch: java.lang.Throwable -> Ld
            r14 = 2131297058(0x7f090322, float:1.821205E38)
            android.view.View r14 = r0.findViewById(r14)     // Catch: java.lang.Throwable -> Ld
            android.widget.TextView r14 = (android.widget.TextView) r14     // Catch: java.lang.Throwable -> Ld
            r1 = 2131296358(0x7f090066, float:1.821063E38)
            android.view.View r1 = r0.findViewById(r1)     // Catch: java.lang.Throwable -> L1eb
            r17 = r1
            android.widget.Button r17 = (android.widget.Button) r17     // Catch: java.lang.Throwable -> L1eb
            r1 = 2131296342(0x7f090056, float:1.8210598E38)
            android.view.View r1 = r0.findViewById(r1)     // Catch: java.lang.Throwable -> L1eb
            android.widget.Button r1 = (android.widget.Button) r1     // Catch: java.lang.Throwable -> L1eb
            r15.applyDialogTheme(r2, r0)     // Catch: java.lang.Throwable -> L1eb
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore r4 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.INSTANCE     // Catch: java.lang.Throwable -> L1eb
            android.content.Context r19 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1eb
            r20 = r0
            if (r19 != 0) goto La5
            r0 = r2
            goto La7
        La5:
            r0 = r19
        La7:
            r4.init(r0)     // Catch: java.lang.Throwable -> L1eb
            r4 = r3
            r3 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            r11 = r12
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$CommentBookmarkAdapter r12 = new com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$CommentBookmarkAdapter     // Catch: java.lang.Throwable -> L1eb
            r12.<init>(r2)     // Catch: java.lang.Throwable -> L1eb
            r0 = r13
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$ProfileBookmarkAdapter r13 = new com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$ProfileBookmarkAdapter     // Catch: java.lang.Throwable -> L1eb
            r13.<init>(r2)     // Catch: java.lang.Throwable -> L1eb
            r19 = r14
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$VideoBookmarkAdapter r14 = new com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$VideoBookmarkAdapter     // Catch: java.lang.Throwable -> L1eb
            r14.<init>(r2)     // Catch: java.lang.Throwable -> L1eb
            r21 = r0
            com.example.dyhelper.hook.comment.bookmark.α r0 = new com.example.dyhelper.hook.comment.bookmark.α     // Catch: java.lang.Throwable -> L1eb
            r22 = r1
            r1 = 3
            r25 = r19
            r23 = r20
            r24 = r21
            r26 = r22
            r18 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L1eb
            r12.setOnChanged(r0)     // Catch: java.lang.Throwable -> L20d
            com.example.dyhelper.hook.comment.bookmark.α r0 = new com.example.dyhelper.hook.comment.bookmark.α     // Catch: java.lang.Throwable -> L20d
            r1 = 4
            r2 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L1eb
            r13.setOnChanged(r0)     // Catch: java.lang.Throwable -> L20d
            com.example.dyhelper.hook.comment.bookmark.α r0 = new com.example.dyhelper.hook.comment.bookmark.α     // Catch: java.lang.Throwable -> L20d
            r1 = 0
            r2 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L1eb
            r14.setOnChanged(r0)     // Catch: java.lang.Throwable -> L20d
            r1 = r6
            r6 = r3
            r3 = r4
            r4 = r5
            r5 = r1
            r1 = r8
            r8 = r7
            r7 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r1
            r1 = r28
            r2 = r15
            show$lambda$28$lambda$26$refresh(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L20a
            r15 = r4
            r4 = r3
            r3 = r6
            r6 = r5
            r5 = r15
            r15 = r12
            r12 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r15
            r15 = r2
            com.example.dyhelper.hook.comment.bookmark.β r0 = new com.example.dyhelper.hook.comment.bookmark.β     // Catch: java.lang.Throwable -> L20d
            r1 = 0
            r2 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L1eb
            r4.setOnClickListener(r0)     // Catch: java.lang.Throwable -> L20d
            com.example.dyhelper.hook.comment.bookmark.β r0 = new com.example.dyhelper.hook.comment.bookmark.β     // Catch: java.lang.Throwable -> L20d
            r1 = 1
            r2 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L1eb
            r5.setOnClickListener(r0)     // Catch: java.lang.Throwable -> L20d
            com.example.dyhelper.hook.comment.bookmark.β r0 = new com.example.dyhelper.hook.comment.bookmark.β     // Catch: java.lang.Throwable -> L20d
            r1 = 2
            r2 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L1eb
            r6.setOnClickListener(r0)     // Catch: java.lang.Throwable -> L20d
            pa r0 = new pa     // Catch: java.lang.Throwable -> L20d
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L21b
            r2 = r24
            r2.setOnClickListener(r0)     // Catch: java.lang.Throwable -> L21b
            pa r0 = new pa     // Catch: java.lang.Throwable -> L21b
            r2 = 1
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L21b
            r2 = r26
            r2.setOnClickListener(r0)     // Catch: java.lang.Throwable -> L21b
            com.example.dyhelper.hook.comment.bookmark.β r0 = new com.example.dyhelper.hook.comment.bookmark.β     // Catch: java.lang.Throwable -> L21b
            r2 = r6
            r6 = r3
            r3 = r4
            r4 = r5
            r5 = r2
            r2 = r8
            r8 = r7
            r7 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r2
            r16 = r1
            r2 = r15
            r1 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L218
            r15 = r4
            r4 = r3
            r3 = r6
            r6 = r5
            r5 = r15
            r15 = r12
            r12 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r15
            r15 = r2
            r1 = r25
            r1.setOnClickListener(r0)     // Catch: java.lang.Throwable -> L212
            com.example.dyhelper.hook.comment.bookmark.γ r0 = new com.example.dyhelper.hook.comment.bookmark.γ     // Catch: java.lang.Throwable -> L212
            r1 = r10
            r10 = r8
            r8 = r12
            r12 = r1
            r2 = r28
            r1 = r15
            r15 = r14
            r14 = r13
            r13 = r11
            r11 = r9
            r9 = r7
            r7 = r3
            r3 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L1eb
            r27 = r15
            r15 = r1
            r1 = r3
            r3 = r7
            r7 = r9
            r9 = r11
            r11 = r13
            r13 = r14
            r14 = r27
            r27 = r12
            r12 = r8
            r8 = r10
            r10 = r27
            r1.setOnClickListener(r0)     // Catch: java.lang.Throwable -> L20d
            com.example.dyhelper.hook.comment.bookmark.η r0 = new com.example.dyhelper.hook.comment.bookmark.η     // Catch: java.lang.Throwable -> L20d
            r1 = r6
            r6 = r3
            r3 = r4
            r4 = r5
            r5 = r1
            r1 = r8
            r8 = r7
            r7 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r1
            r1 = r28
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L20a
            r15 = r4
            r4 = r3
            r3 = r6
            r6 = r5
            r5 = r15
            r15 = r12
            r12 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r15
            r15 = r2
            r3.setOnItemClickListener(r0)     // Catch: java.lang.Throwable -> L20d
            com.example.dyhelper.hook.comment.bookmark.θ r0 = new com.example.dyhelper.hook.comment.bookmark.θ     // Catch: java.lang.Throwable -> L20d
            r1 = r6
            r6 = r3
            r3 = r4
            r4 = r5
            r5 = r1
            r1 = r8
            r8 = r7
            r7 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            r9 = r1
            r1 = r28
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L20a
            r2 = r1
            r3 = r6
            r3.setOnItemLongClickListener(r0)     // Catch: java.lang.Throwable -> L1eb
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder     // Catch: java.lang.Throwable -> L1eb
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1eb
            r1 = r23
            android.app.AlertDialog$Builder r0 = r0.setView(r1)     // Catch: java.lang.Throwable -> L1eb
            android.app.AlertDialog r0 = r0.create()     // Catch: java.lang.Throwable -> L1eb
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.dialog = r0     // Catch: java.lang.Throwable -> L1eb
            android.app.AlertDialog r0 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.dialog     // Catch: java.lang.Throwable -> L1eb
            if (r0 == 0) goto L1ee
            r0.show()     // Catch: java.lang.Throwable -> L1eb
            goto L1ee
        L1eb:
            r0 = move-exception
        L1ec:
            r3 = 0
            goto L220
        L1ee:
            android.app.AlertDialog r0 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.dialog     // Catch: java.lang.Throwable -> L1eb
            if (r0 == 0) goto L206
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Throwable -> L1eb
            if (r0 == 0) goto L206
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.Throwable -> L1eb
            r3 = 0
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L204
            r0.setBackgroundDrawable(r1)     // Catch: java.lang.Throwable -> L204
            s62 r4 = p000.s62.f9751     // Catch: java.lang.Throwable -> L204
            goto L225
        L204:
            r0 = move-exception
            goto L220
        L206:
            r3 = 0
            r4 = r18
            goto L225
        L20a:
            r0 = move-exception
            r2 = r1
            goto L1ec
        L20d:
            r0 = move-exception
            r3 = 0
            r2 = r28
            goto L220
        L212:
            r0 = move-exception
            r2 = r28
        L215:
            r3 = r16
            goto L220
        L218:
            r0 = move-exception
            r2 = r1
            goto L215
        L21b:
            r0 = move-exception
            r2 = r28
            goto Le
        L220:
            eo1 r4 = new eo1
            r4.<init>(r0)
        L225:
            java.lang.Throwable r0 = p000.fo1.m2190(r4)
            if (r0 == 0) goto L24b
            java.lang.String r1 = "rb371d3ea6408f4c8"
            java.lang.String r4 = "show failed"
            p000.C0888ux.m5977(r1, r4, r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "打开书签管理器失败: "
            r1.<init>(r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r3)
            r0.show()
        L24b:
            return
    }

    private static final void show$lambda$28$lambda$26$lambda$10(android.view.View r0) {
            android.app.AlertDialog r0 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.dialog
            if (r0 == 0) goto L7
            r0.dismiss()
        L7:
            return
    }

    private static final void show$lambda$28$lambda$26$lambda$12(android.app.Activity r17, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r18, android.widget.TextView r19, android.widget.TextView r20, android.widget.TextView r21, android.widget.ListView r22, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r23, android.widget.TextView r24, android.widget.TextView r25, android.widget.TextView r26, android.widget.TextView r27, android.widget.TextView r28, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r29, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r30, android.view.View r31) {
            int r0 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.currentTab
            if (r0 == 0) goto Ld
            r1 = 1
            if (r0 == r1) goto La
            java.lang.String r0 = "清空作品书签"
            goto Lf
        La:
            java.lang.String r0 = "清空主页书签"
            goto Lf
        Ld:
            java.lang.String r0 = "清空评论书签"
        Lf:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r3 = r17
            r1.<init>(r3)
            android.app.AlertDialog$Builder r0 = r1.setTitle(r0)
            java.lang.String r1 = "确定要清空当前列表全部记录吗？"
            android.app.AlertDialog$Builder r0 = r0.setMessage(r1)
            java.lang.String r1 = "取消"
            r2 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r2)
            com.example.dyhelper.hook.comment.bookmark.ε r2 = new com.example.dyhelper.hook.comment.bookmark.ε
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            r15 = r29
            r16 = r30
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r1 = "清空"
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            r0.show()
            return
    }

    private static final void show$lambda$28$lambda$26$lambda$12$lambda$11(android.app.Activity r2, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.TextView r6, android.widget.ListView r7, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, android.widget.TextView r12, android.widget.TextView r13, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r14, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r15, android.content.DialogInterface r16, int r17) {
            int r0 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.currentTab
            if (r0 == 0) goto L13
            r1 = 1
            if (r0 == r1) goto Ld
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.INSTANCE
            r0.clear()
            goto L18
        Ld:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.INSTANCE
            r0.clear()
            goto L18
        L13:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.INSTANCE
            r0.clear()
        L18:
            show$lambda$28$lambda$26$refresh(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r3 = "已清空"
            r4 = 0
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r4)
            r2.show()
            return
    }

    private static final void show$lambda$28$lambda$26$lambda$17(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r19, android.app.Activity r20, android.widget.Button r21, android.widget.TextView r22, android.widget.TextView r23, android.widget.TextView r24, android.widget.ListView r25, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r26, android.widget.TextView r27, android.widget.TextView r28, android.widget.TextView r29, android.widget.TextView r30, android.widget.TextView r31, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r32, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r33, android.view.View r34) {
            r2 = r20
            r1 = r21
            r15 = 1
            r3 = 0
            boolean r0 = p000.AbstractC0976x9.m6538()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L14
            boolean r0 = com.example.dyhelper.beta.BetaNativeBridge.m1284()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L14
            r0 = r15
            goto L15
        L14:
            r0 = r3
        L15:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L1a
            goto L21
        L1a:
            r0 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        L21:
            java.lang.Throwable r4 = p000.fo1.m2190(r0)
            if (r4 != 0) goto L28
            goto L2a
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L2a:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3c
            java.lang.String r0 = "主动查询功能仅限内测用户使用"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r3)
            r0.show()
            return
        L3c:
            r1.setEnabled(r3)
            java.lang.String r0 = "查询中..."
            r1.setText(r0)
            int r0 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.currentTab
            if (r0 != 0) goto L75
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.INSTANCE
            r3 = r0
            com.example.dyhelper.hook.comment.bookmark.ζ r0 = new com.example.dyhelper.hook.comment.bookmark.ζ
            r16 = 0
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r11 = r29
            r12 = r30
            r13 = r31
            r14 = r32
            r15 = r33
            r17 = r3
            r3 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r3 = r17
            r3.queryAll(r2, r0)
            goto Ld8
        L75:
            if (r0 != r15) goto La5
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.INSTANCE
            r1 = r0
            com.example.dyhelper.hook.comment.bookmark.ζ r0 = new com.example.dyhelper.hook.comment.bookmark.ζ
            r16 = 1
            r3 = r19
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r11 = r29
            r12 = r30
            r13 = r31
            r14 = r32
            r15 = r33
            r18 = r1
            r1 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r18
            r1.queryAll(r2, r0)
            goto Ld8
        La5:
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r14 = r33
            r1 = r2
            r2 = r19
            show$lambda$28$lambda$26$refresh(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r2 = r1
            r1 = r21
            r1.setEnabled(r15)
            java.lang.String r0 = "主动查询"
            r1.setText(r0)
            java.lang.String r0 = "作品书签无需主动查询"
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r1)
            r0.show()
        Ld8:
            return
    }

    private static final p000.s62 show$lambda$28$lambda$26$lambda$17$lambda$15(android.widget.Button r0, android.app.Activity r1, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.ListView r6, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, android.widget.TextView r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r13, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r14, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.Summary r15) {
            r15.getClass()
            show$lambda$28$lambda$26$refresh(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = 1
            r0.setEnabled(r1)
            java.lang.String r1 = "主动查询"
            r0.setText(r1)
            s62 r0 = p000.s62.f9751
            return r0
    }

    private static final p000.s62 show$lambda$28$lambda$26$lambda$17$lambda$16(android.widget.Button r0, android.app.Activity r1, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.ListView r6, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, android.widget.TextView r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r13, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r14, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.Summary r15) {
            r15.getClass()
            show$lambda$28$lambda$26$refresh(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = 1
            r0.setEnabled(r1)
            java.lang.String r1 = "主动查询"
            r0.setText(r1)
            s62 r0 = p000.s62.f9751
            return r0
    }

    private static final void show$lambda$28$lambda$26$lambda$20(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r19, android.app.Activity r20, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r21, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r22, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r23, android.widget.TextView r24, android.widget.TextView r25, android.widget.TextView r26, android.widget.ListView r27, android.widget.TextView r28, android.widget.TextView r29, android.widget.TextView r30, android.widget.TextView r31, android.widget.TextView r32, android.widget.AdapterView r33, android.view.View r34, int r35, long r36) {
            r2 = r20
            r0 = r35
            int r1 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.currentTab
            r3 = 0
            if (r1 != 0) goto L5c
            r12 = r19
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r0 = r12.getItem(r0)
            if (r0 != 0) goto L13
            goto Laa
        L13:
            boolean r1 = r0.getHasNewReplies()
            if (r1 != 0) goto L2e
            java.util.List r1 = r0.getNewReplyItems()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L24
            goto L2e
        L24:
            java.lang.String r0 = "暂无新的回复内容"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r3)
            r0.show()
            return
        L2e:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkListDialog r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkListDialog.INSTANCE
            r3 = r0
            com.example.dyhelper.hook.comment.bookmark.α r0 = new com.example.dyhelper.hook.comment.bookmark.α
            r4 = r1
            r1 = 1
            r13 = r21
            r15 = r22
            r14 = r23
            r5 = r25
            r6 = r26
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r16 = r3
            r17 = r4
            r4 = r24
            r3 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r3 = r16
            r4 = r17
            r4.showNewReplyDetailDialog(r2, r3, r0)
            return
        L5c:
            r4 = 1
            if (r1 != r4) goto La0
            r13 = r21
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0 = r13.getItem(r0)
            if (r0 != 0) goto L68
            goto Laa
        L68:
            boolean r1 = r0.getHasNewAweme()
            if (r1 == 0) goto L96
            r1 = r0
            com.example.dyhelper.hook.comment.bookmark.α r0 = new com.example.dyhelper.hook.comment.bookmark.α
            r3 = r1
            r1 = 2
            r12 = r19
            r15 = r22
            r14 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r18 = r3
            r3 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r18
            r15.showNewAwemeDetailDialog(r2, r1, r0)
            return
        L96:
            java.lang.String r0 = "暂无新的作品"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r3)
            r0.show()
            return
        La0:
            r15 = r22
            r14 = r23
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r0 = r14.getItem(r0)
            if (r0 != 0) goto Lab
        Laa:
            return
        Lab:
            r15.jumpToVideo(r2, r0)
            return
    }

    private static final p000.s62 show$lambda$28$lambda$26$lambda$20$lambda$18(android.app.Activity r0, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r1, android.widget.TextView r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.ListView r5, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r6, android.widget.TextView r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r13) {
            show$lambda$28$lambda$26$refresh(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            s62 r0 = p000.s62.f9751
            return r0
    }

    private static final p000.s62 show$lambda$28$lambda$26$lambda$20$lambda$19(android.app.Activity r0, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r1, android.widget.TextView r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.ListView r5, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r6, android.widget.TextView r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r13) {
            show$lambda$28$lambda$26$refresh(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            s62 r0 = p000.s62.f9751
            return r0
    }

    private static final boolean show$lambda$28$lambda$26$lambda$25(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r24, android.app.Activity r25, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r26, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r27, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r28, android.widget.TextView r29, android.widget.TextView r30, android.widget.TextView r31, android.widget.ListView r32, android.widget.TextView r33, android.widget.TextView r34, android.widget.TextView r35, android.widget.TextView r36, android.widget.TextView r37, android.widget.AdapterView r38, android.view.View r39, int r40, long r41) {
            r2 = r25
            r0 = r40
            int r1 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.currentTab
            java.lang.String r3 = "删除"
            r4 = 0
            java.lang.String r5 = "取消"
            r6 = 1
            if (r1 != 0) goto L6c
            r8 = r24
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r1 = r8.getItem(r0)
            if (r1 != 0) goto L1a
            r19 = r6
            goto Ld1
        L1a:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r2)
            java.lang.String r7 = "删除书签"
            android.app.AlertDialog$Builder r0 = r0.setTitle(r7)
            java.lang.String r7 = r1.getContent()
            boolean r9 = p000.q02.m4671(r7)
            if (r9 == 0) goto L33
            java.lang.String r7 = r1.getCommentId()
        L33:
            android.app.AlertDialog$Builder r0 = r0.setMessage(r7)
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r5, r4)
            r4 = r0
            com.example.dyhelper.hook.comment.bookmark.δ r0 = new com.example.dyhelper.hook.comment.bookmark.δ
            r16 = 0
            r14 = r26
            r15 = r27
            r5 = r30
            r6 = r31
            r7 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r36
            r13 = r37
            r18 = r3
            r17 = r4
            r3 = r28
            r4 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4 = r17
            r2 = r18
            android.app.AlertDialog$Builder r0 = r4.setPositiveButton(r2, r0)
            r0.show()
            r3 = 1
            return r3
        L6c:
            r18 = r3
            r3 = r6
            if (r1 != r3) goto Lc5
            r14 = r26
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1 = r14.getItem(r0)
            if (r1 != 0) goto L7c
            r19 = r3
            goto Ld1
        L7c:
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r2)
            java.lang.String r6 = "取消主页书签"
            android.app.AlertDialog$Builder r0 = r0.setTitle(r6)
            java.lang.String r6 = r1.displayName()
            android.app.AlertDialog$Builder r0 = r0.setMessage(r6)
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r5, r4)
            r4 = r0
            com.example.dyhelper.hook.comment.bookmark.δ r0 = new com.example.dyhelper.hook.comment.bookmark.δ
            r16 = 1
            r8 = r24
            r15 = r27
            r5 = r30
            r6 = r31
            r7 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r36
            r13 = r37
            r19 = r3
            r20 = r4
            r21 = r18
            r3 = r28
            r4 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4 = r20
            r1 = r21
            android.app.AlertDialog$Builder r0 = r4.setPositiveButton(r1, r0)
            r0.show()
            return r19
        Lc5:
            r15 = r27
            r19 = r3
            r1 = r18
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r0 = r15.getItem(r0)
            if (r0 != 0) goto Ld2
        Ld1:
            return r19
        Ld2:
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
            r3.<init>(r2)
            java.lang.String r6 = "删除作品书签"
            android.app.AlertDialog$Builder r3 = r3.setTitle(r6)
            java.lang.String r6 = r0.displayTitle()
            android.app.AlertDialog$Builder r3 = r3.setMessage(r6)
            android.app.AlertDialog$Builder r3 = r3.setNegativeButton(r5, r4)
            r18 = r1
            r1 = r0
            com.example.dyhelper.hook.comment.bookmark.δ r0 = new com.example.dyhelper.hook.comment.bookmark.δ
            r16 = 2
            r8 = r24
            r14 = r26
            r4 = r29
            r5 = r30
            r6 = r31
            r7 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r36
            r13 = r37
            r22 = r3
            r23 = r18
            r3 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r0
            r0 = r22
            r2 = r23
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r2, r1)
            r0.show()
            return r19
    }

    private static final void show$lambda$28$lambda$26$lambda$25$lambda$22(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r1, android.app.Activity r2, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.TextView r6, android.widget.ListView r7, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, android.widget.TextView r12, android.widget.TextView r13, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r14, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r15, android.content.DialogInterface r16, int r17) {
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.INSTANCE
            java.lang.String r1 = r1.getCommentId()
            r0.remove(r1)
            show$lambda$28$lambda$26$refresh(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
    }

    private static final void show$lambda$28$lambda$26$lambda$25$lambda$23(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1, android.app.Activity r2, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.TextView r6, android.widget.ListView r7, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, android.widget.TextView r12, android.widget.TextView r13, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r14, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r15, android.content.DialogInterface r16, int r17) {
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.INSTANCE
            java.lang.String r1 = r1.uniqueKey()
            r0.remove(r1)
            show$lambda$28$lambda$26$refresh(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
    }

    private static final void show$lambda$28$lambda$26$lambda$25$lambda$24(com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r1, android.app.Activity r2, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.TextView r6, android.widget.ListView r7, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, android.widget.TextView r12, android.widget.TextView r13, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r14, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r15, android.content.DialogInterface r16, int r17) {
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.INSTANCE
            java.lang.String r1 = r1.getAwemeId()
            r0.remove(r1)
            show$lambda$28$lambda$26$refresh(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
    }

    private static final p000.s62 show$lambda$28$lambda$26$lambda$3(android.app.Activity r0, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r1, android.widget.TextView r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.ListView r5, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r6, android.widget.TextView r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r13) {
            show$lambda$28$lambda$26$refresh(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            s62 r0 = p000.s62.f9751
            return r0
    }

    private static final p000.s62 show$lambda$28$lambda$26$lambda$4(android.app.Activity r0, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r1, android.widget.TextView r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.ListView r5, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r6, android.widget.TextView r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r13) {
            show$lambda$28$lambda$26$refresh(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            s62 r0 = p000.s62.f9751
            return r0
    }

    private static final p000.s62 show$lambda$28$lambda$26$lambda$5(android.app.Activity r0, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r1, android.widget.TextView r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.ListView r5, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r6, android.widget.TextView r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r13) {
            show$lambda$28$lambda$26$refresh(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            s62 r0 = p000.s62.f9751
            return r0
    }

    private static final void show$lambda$28$lambda$26$lambda$6(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r1, android.app.Activity r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.ListView r6, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, android.widget.TextView r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r13, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r14, android.view.View r15) {
            int r15 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.currentTab
            if (r15 == 0) goto Ld
            r15 = 0
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.currentTab = r15
            r0 = r2
            r2 = r1
            r1 = r0
            show$lambda$28$lambda$26$refresh(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        Ld:
            return
    }

    private static final void show$lambda$28$lambda$26$lambda$7(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r16, android.app.Activity r17, android.widget.TextView r18, android.widget.TextView r19, android.widget.TextView r20, android.widget.ListView r21, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r22, android.widget.TextView r23, android.widget.TextView r24, android.widget.TextView r25, android.widget.TextView r26, android.widget.TextView r27, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r28, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r29, android.view.View r30) {
            int r0 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.currentTab
            r1 = 1
            if (r0 == r1) goto L26
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.currentTab = r1
            r3 = r16
            r2 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            r15 = r29
            show$lambda$28$lambda$26$refresh(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L26:
            return
    }

    private static final void show$lambda$28$lambda$26$lambda$8(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r16, android.app.Activity r17, android.widget.TextView r18, android.widget.TextView r19, android.widget.TextView r20, android.widget.ListView r21, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r22, android.widget.TextView r23, android.widget.TextView r24, android.widget.TextView r25, android.widget.TextView r26, android.widget.TextView r27, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r28, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r29, android.view.View r30) {
            int r0 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.currentTab
            r1 = 2
            if (r0 == r1) goto L26
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.currentTab = r1
            r3 = r16
            r2 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            r15 = r29
            show$lambda$28$lambda$26$refresh(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L26:
            return
    }

    private static final void show$lambda$28$lambda$26$lambda$9(android.view.View r0) {
            android.app.AlertDialog r0 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.dialog
            if (r0 == 0) goto L7
            r0.dismiss()
        L7:
            return
    }

    private static final void show$lambda$28$lambda$26$refresh(android.app.Activity r14, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r15, android.widget.TextView r16, android.widget.TextView r17, android.widget.TextView r18, android.widget.ListView r19, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r20, android.widget.TextView r21, android.widget.TextView r22, android.widget.TextView r23, android.widget.TextView r24, android.widget.TextView r25, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r26, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r27) {
            r1 = r19
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            xx r9 = p000.jx0.m3049(r14)
            r16.getClass()
            int r10 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.currentTab
            r11 = 1
            r12 = 0
            if (r10 != 0) goto L21
            r13 = r11
        L1e:
            r10 = r16
            goto L23
        L21:
            r13 = r12
            goto L1e
        L23:
            r15.updateTabStyle(r14, r10, r13, r9)
            r17.getClass()
            int r10 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.currentTab
            if (r10 != r11) goto L31
            r13 = r11
        L2e:
            r10 = r17
            goto L33
        L31:
            r13 = r12
            goto L2e
        L33:
            r15.updateTabStyle(r14, r10, r13, r9)
            r18.getClass()
            int r10 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.currentTab
            r13 = 2
            if (r10 != r13) goto L42
            r13 = r11
        L3f:
            r10 = r18
            goto L44
        L42:
            r13 = r12
            goto L3f
        L44:
            r15.updateTabStyle(r14, r10, r13, r9)
            int r14 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.currentTab
            r0 = 0
            r9 = 8
            if (r14 == 0) goto L110
            if (r14 == r11) goto Lb2
            r1.setAdapter(r8)
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore r14 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.INSTANCE
            java.util.List r14 = r14.all()
            r8.setData(r14)
            boolean r1 = r14.isEmpty()
            if (r1 == 0) goto L63
            r9 = r12
        L63:
            r2.setVisibility(r9)
            java.lang.String r1 = "暂无作品书签\n在视频流操作菜单点击“作品书签”即可保存"
            r2.setText(r1)
            int r1 = r14.size()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.setText(r1)
            java.lang.String r1 = "作品书签"
            r4.setText(r1)
            boolean r1 = r14.isEmpty()
            if (r1 == 0) goto L82
            goto La5
        L82:
            java.util.Iterator r14 = r14.iterator()
        L86:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto La5
            java.lang.Object r1 = r14.next()
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r1 = (com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord) r1
            java.lang.String r1 = r1.getCoverUrl()
            boolean r1 = p000.q02.m4671(r1)
            if (r1 != 0) goto L86
            int r12 = r12 + 1
            if (r12 < 0) goto La1
            goto L86
        La1:
            p000.AbstractC1021yh.m6916()
            throw r0
        La5:
            java.lang.String r14 = java.lang.String.valueOf(r12)
            r5.setText(r14)
            java.lang.String r14 = "有封面"
            r6.setText(r14)
            return
        Lb2:
            r1.setAdapter(r7)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore r14 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.INSTANCE
            java.util.List r14 = r14.all()
            r7.setData(r14)
            boolean r1 = r14.isEmpty()
            if (r1 == 0) goto Lc5
            r9 = r12
        Lc5:
            r2.setVisibility(r9)
            java.lang.String r1 = "暂无主页书签记录\n在主页右上角或侧边栏点击“主页书签”即可关注新作品"
            r2.setText(r1)
            int r1 = r14.size()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.setText(r1)
            java.lang.String r1 = "关注主页"
            r4.setText(r1)
            boolean r1 = r14.isEmpty()
            if (r1 == 0) goto Le4
            goto L103
        Le4:
            java.util.Iterator r14 = r14.iterator()
        Le8:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L103
            java.lang.Object r1 = r14.next()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord) r1
            boolean r1 = r1.getHasNewAweme()
            if (r1 == 0) goto Le8
            int r12 = r12 + 1
            if (r12 < 0) goto Lff
            goto Le8
        Lff:
            p000.AbstractC1021yh.m6916()
            throw r0
        L103:
            java.lang.String r14 = java.lang.String.valueOf(r12)
            r5.setText(r14)
            java.lang.String r14 = "有新作品"
            r6.setText(r14)
            return
        L110:
            r19.setAdapter(r20)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore r14 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.INSTANCE
            java.util.List r14 = r14.all()
            r1 = r20
            r1.setData(r14)
            boolean r1 = r14.isEmpty()
            if (r1 == 0) goto L125
            r9 = r12
        L125:
            r2.setVisibility(r9)
            java.lang.String r1 = "暂无评论书签记录\n在评论菜单点击“书签”即可关注回复"
            r2.setText(r1)
            int r1 = r14.size()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.setText(r1)
            java.lang.String r1 = "总书签"
            r4.setText(r1)
            boolean r1 = r14.isEmpty()
            if (r1 == 0) goto L144
            goto L16d
        L144:
            java.util.Iterator r14 = r14.iterator()
        L148:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L16d
            java.lang.Object r1 = r14.next()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r1 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord) r1
            boolean r2 = r1.getHasNewReplies()
            if (r2 != 0) goto L164
            java.util.List r1 = r1.getNewReplyItems()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L148
        L164:
            int r12 = r12 + 1
            if (r12 < 0) goto L169
            goto L148
        L169:
            p000.AbstractC1021yh.m6916()
            throw r0
        L16d:
            java.lang.String r14 = java.lang.String.valueOf(r12)
            r5.setText(r14)
            java.lang.String r14 = "有新回复"
            r6.setText(r14)
            return
    }

    private final void showNewAwemeDetailDialog(android.app.Activity r2, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r3, p000.p70 r4) {
            r1 = this;
            e9 r1 = new e9
            r0 = 2
            r1.<init>(r2, r3, r4, r0)
            r2.runOnUiThread(r1)
            return
    }

    private static final void showNewAwemeDetailDialog$lambda$37(android.app.Activity r12, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r13, p000.p70 r14) {
            x01 r0 = p000.x01.f11964
            android.view.LayoutInflater r0 = r0.m6477(r12)
            r1 = 2131492898(0x7f0c0022, float:1.860926E38)
            r2 = 0
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r2, r3)
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r1 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.INSTANCE
            r0.getClass()
            r1.applyDialogTheme(r12, r0)
            r1 = 2131297068(0x7f09032c, float:1.821207E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.util.List r4 = r13.getNewAwemeItems()
            int r4 = r4.size()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "新增作品（"
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = "）"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r1.setText(r4)
            r1 = 2131297105(0x7f090351, float:1.8212146E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r4 = r13.displayName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "主页："
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r1.setText(r4)
            r1 = 2131296502(0x7f0900f6, float:1.8210922E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.removeAllViews()
            java.util.List r4 = r13.getNewAwemeItems()
            boolean r4 = r4.isEmpty()
            r5 = 1
            r6 = 2131297073(0x7f090331, float:1.821208E38)
            if (r4 == 0) goto L85
            android.view.View r1 = r0.findViewById(r6)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setVisibility(r3)
            java.lang.String r2 = "暂未获取到具体作品内容。"
            r1.setText(r2)
            goto Lce
        L85:
            android.view.View r4 = r0.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r6 = 8
            r4.setVisibility(r6)
            xx r4 = p000.jx0.m3049(r12)
            java.util.List r6 = r13.getNewAwemeItems()
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$showNewAwemeDetailDialog$lambda$37$$inlined$sortedByDescending$1 r7 = new com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog$showNewAwemeDetailDialog$lambda$37$$inlined$sortedByDescending$1
            r7.<init>()
            java.util.List r6 = p000.AbstractC0984xh.m6658(r6, r7)
            java.util.Iterator r6 = r6.iterator()
            r7 = r3
        La6:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lce
            java.lang.Object r8 = r6.next()
            int r9 = r7 + 1
            if (r7 < 0) goto Lca
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem r8 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAwemeItem) r8
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r10 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.INSTANCE
            java.util.List r11 = r13.getNewAwemeItems()
            int r11 = p000.AbstractC1021yh.m6858(r11)
            if (r7 == r11) goto Lc4
            r7 = r5
            goto Lc5
        Lc4:
            r7 = r3
        Lc5:
            r10.addAwemeItemView(r1, r8, r7, r4)
            r7 = r9
            goto La6
        Lca:
            p000.AbstractC1021yh.m6917()
            throw r2
        Lce:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r12)
            android.app.AlertDialog$Builder r1 = r1.setView(r0)
            android.app.AlertDialog r1 = r1.create()
            r2 = 2131297067(0x7f09032b, float:1.8212068E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            sa r4 = new sa
            r4.<init>(r1, r3)
            r2.setOnClickListener(r4)
            r2 = 2131296347(0x7f09005b, float:1.8210608E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            sa r4 = new sa
            r4.<init>(r1, r5)
            r2.setOnClickListener(r4)
            r2 = 2131296349(0x7f09005d, float:1.8210612E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            c9 r4 = new c9
            r4.<init>(r13, r14, r1, r5)
            r2.setOnClickListener(r4)
            r14 = 2131296348(0x7f09005c, float:1.821061E38)
            android.view.View r14 = r0.findViewById(r14)
            android.widget.Button r14 = (android.widget.Button) r14
            java.lang.String r0 = "进主页"
            r14.setText(r0)
            c9 r0 = new c9
            r2 = 2
            r0.<init>(r12, r13, r1, r2)
            r14.setOnClickListener(r0)
            r1.show()
            android.view.Window r12 = r1.getWindow()
            if (r12 == 0) goto L136
            android.graphics.drawable.ColorDrawable r13 = new android.graphics.drawable.ColorDrawable
            r13.<init>(r3)
            r12.setBackgroundDrawable(r13)
        L136:
            return
    }

    private static final void showNewAwemeDetailDialog$lambda$37$lambda$32(android.app.AlertDialog r0, android.view.View r1) {
            r0.dismiss()
            return
    }

    private static final void showNewAwemeDetailDialog$lambda$37$lambda$33(android.app.AlertDialog r0, android.view.View r1) {
            r0.dismiss()
            return
    }

    private static final void showNewAwemeDetailDialog$lambda$37$lambda$34(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0, p000.p70 r1, android.app.AlertDialog r2, android.view.View r3) {
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore r3 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.INSTANCE
            java.lang.String r0 = r0.uniqueKey()
            r3.markRead(r0)
            r1.invoke()
            r2.dismiss()
            return
    }

    private static final void showNewAwemeDetailDialog$lambda$37$lambda$36$lambda$35(android.app.Activity r0, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1, android.app.AlertDialog r2, android.view.View r3) {
            com.example.dyhelper.hook.comment.bookmark.BookmarkNativeJump r3 = com.example.dyhelper.hook.comment.bookmark.BookmarkNativeJump.INSTANCE
            boolean r1 = r3.jumpToProfile(r0, r1)
            if (r1 == 0) goto Lc
            r2.dismiss()
            return
        Lc:
            java.lang.String r1 = "跳转失败"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            return
    }

    private final java.lang.String trimCount(double r1) {
            r0 = this;
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r2 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r2 = "%.1f"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            java.lang.String r1 = ".0"
            java.lang.String r0 = p000.q02.m4679(r0, r1)
            return r0
    }

    private final void updateTabStyle(android.app.Activity r1, android.widget.TextView r2, boolean r3, p000.C1000xx r4) {
            r0 = this;
            if (r3 == 0) goto L17
            r0 = -1
            r2.setTextColor(r0)
            java.lang.String r0 = r4.f12360
            r3 = 8
            android.graphics.drawable.GradientDrawable r0 = p000.jx0.m3062(r3, r1, r0)
            r2.setBackground(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r2.setTypeface(r0)
            return
        L17:
            java.lang.String r0 = r4.f12356
            int r0 = android.graphics.Color.parseColor(r0)
            r2.setTextColor(r0)
            r0 = 0
            r2.setBackground(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT
            r2.setTypeface(r0)
            return
    }

    /* JADX INFO: renamed from: Α */
    public static /* synthetic */ void m1355(android.app.Activity r1, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.ListView r6, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, android.widget.TextView r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r13, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r14, android.view.View r15) {
            r0 = r2
            r2 = r1
            r1 = r0
            show$lambda$28$lambda$26$lambda$6(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
    }

    /* JADX INFO: renamed from: Β */
    public static /* synthetic */ p000.s62 m1356(android.app.Activity r0, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r1, android.widget.TextView r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.ListView r5, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r6, android.widget.TextView r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r13) {
            s62 r0 = show$lambda$28$lambda$26$lambda$3(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
    }

    /* JADX INFO: renamed from: Γ */
    public static /* synthetic */ p000.s62 m1357(android.app.Activity r0, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r1, android.widget.TextView r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.ListView r5, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r6, android.widget.TextView r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r13) {
            s62 r0 = show$lambda$28$lambda$26$lambda$5(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
    }

    /* JADX INFO: renamed from: Δ */
    public static /* synthetic */ void m1358(android.app.Activity r0, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1, android.app.AlertDialog r2, android.view.View r3) {
            showNewAwemeDetailDialog$lambda$37$lambda$36$lambda$35(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: α */
    public static /* synthetic */ void m1359(android.app.Activity r1, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.ListView r6, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, android.widget.TextView r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r13, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r14, android.view.View r15) {
            r0 = r2
            r2 = r1
            r1 = r0
            show$lambda$28$lambda$26$lambda$7(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
    }

    /* JADX INFO: renamed from: β */
    public static /* synthetic */ boolean m1360(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r0, android.app.Activity r1, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r2, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r3, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r4, android.widget.TextView r5, android.widget.TextView r6, android.widget.TextView r7, android.widget.ListView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, android.widget.TextView r12, android.widget.TextView r13, android.widget.AdapterView r14, android.view.View r15, int r16, long r17) {
            boolean r0 = show$lambda$28$lambda$26$lambda$25(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static /* synthetic */ void m1361(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r0, android.app.Activity r1, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.ListView r6, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, android.widget.TextView r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r13, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r14, android.content.DialogInterface r15, int r16) {
            show$lambda$28$lambda$26$lambda$25$lambda$22(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
    }

    /* JADX INFO: renamed from: δ */
    public static /* synthetic */ void m1362(android.app.AlertDialog r0, android.view.View r1) {
            showNewAwemeDetailDialog$lambda$37$lambda$32(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ε */
    public static /* synthetic */ p000.s62 m1363(android.app.Activity r0, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r1, android.widget.TextView r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.ListView r5, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r6, android.widget.TextView r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r13) {
            s62 r0 = show$lambda$28$lambda$26$lambda$4(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static /* synthetic */ void m1364(android.widget.ImageView r0, java.lang.String r1, android.app.Activity r2, android.graphics.Bitmap r3) {
            loadCoverAsync$lambda$51$lambda$50(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: η */
    public static /* synthetic */ void m1365(android.view.View r0) {
            show$lambda$28$lambda$26$lambda$10(r0)
            return
    }

    /* JADX INFO: renamed from: θ */
    public static /* synthetic */ void m1366(android.app.Activity r0, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r1, android.widget.TextView r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.ListView r5, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r6, android.widget.TextView r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r13, android.content.DialogInterface r14, int r15) {
            show$lambda$28$lambda$26$lambda$12$lambda$11(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
    }

    /* JADX INFO: renamed from: ι */
    public static /* synthetic */ void m1367(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0, p000.p70 r1, android.app.AlertDialog r2, android.view.View r3) {
            showNewAwemeDetailDialog$lambda$37$lambda$34(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: κ */
    public static /* synthetic */ void m1368(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r19, android.app.Activity r20, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r21, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r22, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r23, android.widget.TextView r24, android.widget.TextView r25, android.widget.TextView r26, android.widget.ListView r27, android.widget.TextView r28, android.widget.TextView r29, android.widget.TextView r30, android.widget.TextView r31, android.widget.TextView r32, android.widget.AdapterView r33, android.view.View r34, int r35, long r36) {
            r0 = r19
            r1 = r20
            r2 = r21
            r4 = r22
            r3 = r23
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r14 = r33
            r15 = r34
            r16 = r35
            r17 = r36
            show$lambda$28$lambda$26$lambda$20(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
    }

    /* JADX INFO: renamed from: λ */
    public static /* synthetic */ void m1369(com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r0, android.app.Activity r1, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.ListView r6, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, android.widget.TextView r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r13, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r14, android.content.DialogInterface r15, int r16) {
            show$lambda$28$lambda$26$lambda$25$lambda$24(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
    }

    /* JADX INFO: renamed from: μ */
    public static /* synthetic */ p000.s62 m1370(android.widget.Button r0, android.app.Activity r1, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.ListView r6, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, android.widget.TextView r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r13, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r14, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkActiveQuery.Summary r15) {
            s62 r0 = show$lambda$28$lambda$26$lambda$17$lambda$15(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
    }

    /* JADX INFO: renamed from: ν */
    public static /* synthetic */ void m1371(android.app.Activity r1, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.ListView r6, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, android.widget.TextView r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r13, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r14, android.view.View r15) {
            r0 = r2
            r2 = r1
            r1 = r0
            show$lambda$28$lambda$26$lambda$8(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
    }

    /* JADX INFO: renamed from: ξ */
    public static /* synthetic */ void m1372(android.app.Activity r0, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1, p000.p70 r2) {
            showNewAwemeDetailDialog$lambda$37(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: ο */
    public static /* synthetic */ void m1373(android.app.Activity r0, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r1, android.widget.TextView r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.ListView r5, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r6, android.widget.TextView r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r13, android.view.View r14) {
            show$lambda$28$lambda$26$lambda$12(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
    }

    /* JADX INFO: renamed from: π */
    public static /* synthetic */ void m1374(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0, android.app.Activity r1, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.ListView r6, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, android.widget.TextView r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r13, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r14, android.content.DialogInterface r15, int r16) {
            show$lambda$28$lambda$26$lambda$25$lambda$23(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
    }

    /* JADX INFO: renamed from: ρ */
    public static /* synthetic */ p000.s62 m1375(android.widget.Button r0, android.app.Activity r1, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.ListView r6, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, android.widget.TextView r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r13, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r14, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.Summary r15) {
            s62 r0 = show$lambda$28$lambda$26$lambda$17$lambda$16(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
    }

    /* JADX INFO: renamed from: σ */
    public static /* synthetic */ void m1376(android.app.AlertDialog r0, android.view.View r1) {
            showNewAwemeDetailDialog$lambda$37$lambda$33(r0, r1)
            return
    }

    /* JADX INFO: renamed from: τ */
    public static /* synthetic */ void m1377(android.view.View r0) {
            show$lambda$28$lambda$26$lambda$9(r0)
            return
    }

    /* JADX INFO: renamed from: υ */
    public static /* synthetic */ p000.s62 m1378(android.app.Activity r0, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r1, android.widget.TextView r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.ListView r5, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r6, android.widget.TextView r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r13) {
            s62 r0 = show$lambda$28$lambda$26$lambda$20$lambda$18(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
    }

    /* JADX INFO: renamed from: φ */
    public static /* synthetic */ void m1379(android.app.Activity r0) {
            show$lambda$28(r0)
            return
    }

    /* JADX INFO: renamed from: χ */
    public static /* synthetic */ void m1380(java.lang.String r0, android.app.Activity r1, android.widget.ImageView r2) {
            loadCoverAsync$lambda$51(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: ψ */
    public static /* synthetic */ p000.s62 m1381(android.app.Activity r0, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r1, android.widget.TextView r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.ListView r5, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r6, android.widget.TextView r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r13) {
            s62 r0 = show$lambda$28$lambda$26$lambda$20$lambda$19(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
    }

    /* JADX INFO: renamed from: ω */
    public static /* synthetic */ void m1382(com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r0, android.app.Activity r1, android.widget.Button r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.ListView r6, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.CommentBookmarkAdapter r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, android.widget.TextView r12, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.ProfileBookmarkAdapter r13, com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.VideoBookmarkAdapter r14, android.view.View r15) {
            show$lambda$28$lambda$26$lambda$17(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
    }

    public final void show(android.app.Activity r1, int r2) {
            r0 = this;
            r1.getClass()
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.currentTab = r2
            n9 r0 = new n9
            r2 = 2
            r0.<init>(r1, r2)
            r1.runOnUiThread(r0)
            return
    }
}
