package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class CommentBookmarkListDialog {
    public static final int $stable = 0;
    public static final com.example.dyhelper.hook.comment.bookmark.CommentBookmarkListDialog INSTANCE = null;
    private static final java.lang.String TAG = "r81a2a562ce921cc2";
    private static volatile android.app.AlertDialog dialog;

    static {
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkListDialog r0 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkListDialog
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkListDialog.INSTANCE = r0
            r0 = 8
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkListDialog.$stable = r0
            return
    }

    private CommentBookmarkListDialog() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void addReplyItemView(android.widget.LinearLayout r8, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r9, boolean r10, p000.C1000xx r11) {
            r7 = this;
            android.content.Context r7 = r8.getContext()
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r7)
            r1 = 1
            r0.setOrientation(r1)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkListDialog r2 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkListDialog.INSTANCE
            r3 = 12
            int r4 = r2.m1413dp(r3)
            r5 = 10
            int r6 = r2.m1413dp(r5)
            int r3 = r2.m1413dp(r3)
            int r5 = r2.m1413dp(r5)
            r0.setPadding(r4, r6, r3, r5)
            java.lang.String r3 = r11.f12352
            int r3 = android.graphics.Color.parseColor(r3)
            r0.setBackgroundColor(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -2
            r5 = -1
            r3.<init>(r5, r4)
            r0.setLayoutParams(r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r7)
            java.lang.String r4 = r9.getAuthorName()
            boolean r6 = p000.q02.m4671(r4)
            if (r6 == 0) goto L4a
            java.lang.String r4 = "未知用户"
        L4a:
            r3.setText(r4)
            r4 = 1095761920(0x41500000, float:13.0)
            r3.setTextSize(r4)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT_BOLD
            r3.setTypeface(r4)
            java.lang.String r4 = r11.f12355
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setTextColor(r4)
            r3.setMaxLines(r1)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r7)
            java.lang.String r9 = r9.getContent()
            boolean r6 = p000.q02.m4671(r9)
            if (r6 == 0) goto L74
            java.lang.String r9 = "[无内容]"
        L74:
            r4.setText(r9)
            r9 = 1094713344(0x41400000, float:12.0)
            r4.setTextSize(r9)
            java.lang.String r9 = r11.f12356
            int r9 = android.graphics.Color.parseColor(r9)
            r4.setTextColor(r9)
            r9 = 4
            int r9 = r2.m1413dp(r9)
            r2 = 0
            r4.setPadding(r2, r9, r2, r2)
            r0.addView(r3)
            r0.addView(r4)
            r8.addView(r0)
            if (r10 == 0) goto Lb2
            android.view.View r9 = new android.view.View
            r9.<init>(r7)
            java.lang.String r7 = r11.f12353
            int r7 = android.graphics.Color.parseColor(r7)
            r9.setBackgroundColor(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r5, r1)
            r9.setLayoutParams(r7)
            r8.addView(r9)
        Lb2:
            return
    }

    private final void applyButtonTheme(android.app.Activity r2, android.view.View r3, p000.C1000xx r4) {
            r1 = this;
            r1 = 2131296358(0x7f090066, float:1.821063E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0 = 1
            applyButtonTheme$styleButton(r2, r4, r1, r0)
            r1 = 2131296349(0x7f09005d, float:1.8210612E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            applyButtonTheme$styleButton(r2, r4, r1, r0)
            r1 = 2131296342(0x7f090056, float:1.8210598E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r0 = 0
            applyButtonTheme$styleButton(r2, r4, r1, r0)
            r1 = 2131296348(0x7f09005c, float:1.821061E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            applyButtonTheme$styleButton(r2, r4, r1, r0)
            r1 = 2131296347(0x7f09005b, float:1.8210608E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            applyButtonTheme$styleButton(r2, r4, r1, r0)
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
            if (r6 == r5) goto L2b
            boolean r0 = r6 instanceof android.widget.ListView
            r1 = 12
            if (r0 == 0) goto L15
            r0 = r6
            android.widget.ListView r0 = (android.widget.ListView) r0
            java.lang.String r2 = r7.f12352
            android.graphics.drawable.GradientDrawable r1 = p000.jx0.m3062(r1, r4, r2)
            r0.setBackground(r1)
            goto L2b
        L15:
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2b
            r0 = r6
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            if (r2 == 0) goto L2b
            java.lang.String r2 = r7.f12352
            android.graphics.drawable.GradientDrawable r1 = p000.jx0.m3062(r1, r4, r2)
            r0.setBackground(r1)
        L2b:
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L45
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r0 = r6.getChildCount()
            r1 = 0
        L36:
            if (r1 >= r0) goto L45
            android.view.View r2 = r6.getChildAt(r1)
            r2.getClass()
            r3.applyContainerBackgrounds(r4, r5, r2, r7)
            int r1 = r1 + 1
            goto L36
        L45:
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
            r3 = 0
            r2.setCacheColorHint(r3)
            java.lang.String r3 = r4.f12348
            android.graphics.drawable.RippleDrawable r3 = p000.jx0.m3034(r3)
            r2.setSelector(r3)
            return
    }

    private final void applyTextColors(android.view.View r6, p000.C1000xx r7) {
            r5 = this;
            boolean r0 = r6 instanceof android.widget.TextView
            r1 = 0
            if (r0 == 0) goto L78
            boolean r0 = r6 instanceof android.widget.Button
            if (r0 != 0) goto L78
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r2 = r0.getText()
            if (r2 == 0) goto L17
            java.lang.String r2 = r2.toString()
            goto L18
        L17:
            r2 = 0
        L18:
            if (r2 != 0) goto L1c
            java.lang.String r2 = ""
        L1c:
            int r3 = r0.getId()
            r4 = 2131297058(0x7f090322, float:1.821205E38)
            if (r3 != r4) goto L28
            java.lang.String r2 = r7.f12366
            goto L71
        L28:
            r4 = 2131297065(0x7f090329, float:1.8212064E38)
            if (r3 != r4) goto L30
            java.lang.String r2 = r7.f12360
            goto L71
        L30:
            r4 = 2131297101(0x7f09034d, float:1.8212137E38)
            if (r3 != r4) goto L38
            java.lang.String r2 = r7.f12366
            goto L71
        L38:
            r4 = 2131297072(0x7f090330, float:1.8212079E38)
            if (r3 == r4) goto L6f
            r4 = 2131297073(0x7f090331, float:1.821208E38)
            if (r3 != r4) goto L43
            goto L6f
        L43:
            r4 = 2131297105(0x7f090351, float:1.8212146E38)
            if (r3 != r4) goto L4b
            java.lang.String r2 = r7.f12356
            goto L71
        L4b:
            java.lang.String r3 = "未读"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L56
            java.lang.String r2 = r7.f12366
            goto L71
        L56:
            java.lang.String r3 = "关闭"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L61
            java.lang.String r2 = r7.f12356
            goto L71
        L61:
            java.lang.String r3 = "DyHelper"
            boolean r2 = p000.x02.m6485(r2, r3, r1)
            if (r2 == 0) goto L6c
            java.lang.String r2 = r7.f12349
            goto L71
        L6c:
            java.lang.String r2 = r7.f12355
            goto L71
        L6f:
            java.lang.String r2 = r7.f12357
        L71:
            int r2 = android.graphics.Color.parseColor(r2)
            r0.setTextColor(r2)
        L78:
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L91
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r0 = r6.getChildCount()
        L82:
            if (r1 >= r0) goto L91
            android.view.View r2 = r6.getChildAt(r1)
            r2.getClass()
            r5.applyTextColors(r2, r7)
            int r1 = r1 + 1
            goto L82
        L91:
            return
    }

    /* JADX INFO: renamed from: dp */
    private final int m1413dp(int r1) {
            r0 = this;
            float r0 = (float) r1
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
    }

    private static final void showNewReplyDetailDialog$lambda$11(android.app.Activity r18, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r19, p000.p70 r20) {
            r2 = r18
            x01 r0 = p000.x01.f11964
            android.view.LayoutInflater r0 = r0.m6477(r2)
            r1 = 2131492898(0x7f0c0022, float:1.860926E38)
            r3 = 0
            r6 = 0
            android.view.View r0 = r0.inflate(r1, r3, r6)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkListDialog r1 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkListDialog.INSTANCE
            r0.getClass()
            r1.applyDialogTheme(r2, r0)
            r1 = 2131297068(0x7f09032c, float:1.821207E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r4 = 2131297067(0x7f09032b, float:1.8212068E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5 = 2131297105(0x7f090351, float:1.8212146E38)
            android.view.View r5 = r0.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r7 = 2131297073(0x7f090331, float:1.821208E38)
            android.view.View r7 = r0.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r8 = 2131296502(0x7f0900f6, float:1.8210922E38)
            android.view.View r8 = r0.findViewById(r8)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r9 = 2131296349(0x7f09005d, float:1.8210612E38)
            android.view.View r9 = r0.findViewById(r9)
            android.widget.Button r9 = (android.widget.Button) r9
            r10 = 2131296348(0x7f09005c, float:1.821061E38)
            android.view.View r10 = r0.findViewById(r10)
            android.widget.Button r10 = (android.widget.Button) r10
            r11 = 2131296347(0x7f09005b, float:1.8210608E38)
            android.view.View r11 = r0.findViewById(r11)
            android.widget.Button r11 = (android.widget.Button) r11
            java.util.List r12 = r19.getNewReplyItems()
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r12 = r12.iterator()
        L73:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L93
            java.lang.Object r15 = r12.next()
            r16 = r15
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r16 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem) r16
            r17 = r3
            java.lang.String r3 = r16.getReplyId()
            boolean r3 = r13.add(r3)
            if (r3 == 0) goto L90
            r14.add(r15)
        L90:
            r3 = r17
            goto L73
        L93:
            r17 = r3
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkListDialog$showNewReplyDetailDialog$lambda$11$$inlined$sortedByDescending$1 r3 = new com.example.dyhelper.hook.comment.bookmark.CommentBookmarkListDialog$showNewReplyDetailDialog$lambda$11$$inlined$sortedByDescending$1
            r3.<init>()
            java.util.List r3 = p000.AbstractC0984xh.m6658(r14, r3)
            boolean r12 = r3.isEmpty()
            if (r12 != 0) goto Lb1
            int r12 = r3.size()
            java.lang.String r13 = "新增回复（"
            java.lang.String r14 = "）"
            java.lang.String r12 = p000.AbstractC0602nx.m4127(r13, r12, r14)
            goto Lb3
        Lb1:
            java.lang.String r12 = "新增回复"
        Lb3:
            r1.setText(r12)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r12 = r19.getAuthorName()
            boolean r13 = p000.q02.m4671(r12)
            if (r13 == 0) goto Lc7
            java.lang.String r12 = "未知用户"
        Lc7:
            r1.append(r12)
            java.lang.String r12 = "："
            r1.append(r12)
            java.lang.String r12 = r19.getContent()
            boolean r13 = p000.q02.m4671(r12)
            if (r13 == 0) goto Ldd
            java.lang.String r12 = r19.getCommentId()
        Ldd:
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r5.setText(r1)
            r8.removeAllViews()
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L119
            r7.setVisibility(r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "检测到新回复"
            r1.<init>(r3)
            int r3 = r19.getNewReplyCount()
            if (r3 <= 0) goto L10c
            java.lang.String r3 = " +"
            r1.append(r3)
            int r3 = r19.getNewReplyCount()
            r1.append(r3)
        L10c:
            java.lang.String r3 = "，但暂未获取到具体回复内容。\n\n可以尝试主动查询，或跳转到视频评论区查看。"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r7.setText(r1)
            goto L150
        L119:
            r1 = 8
            r7.setVisibility(r1)
            xx r1 = p000.jx0.m3049(r2)
            java.util.Iterator r5 = r3.iterator()
            r7 = r6
        L127:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L150
            java.lang.Object r12 = r5.next()
            int r13 = r7 + 1
            if (r7 < 0) goto L14c
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem r12 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkReplyItem) r12
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkListDialog r14 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkListDialog.INSTANCE
            int r15 = r3.size()
            r16 = 1
            int r15 = r15 + (-1)
            if (r7 == r15) goto L146
            r7 = r16
            goto L147
        L146:
            r7 = r6
        L147:
            r14.addReplyItemView(r8, r12, r7, r1)
            r7 = r13
            goto L127
        L14c:
            p000.AbstractC1021yh.m6917()
            throw r17
        L150:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r2)
            android.app.AlertDialog$Builder r0 = r1.setView(r0)
            android.app.AlertDialog r5 = r0.create()
            sa r0 = new sa
            r1 = 3
            r0.<init>(r5, r1)
            r4.setOnClickListener(r0)
            sa r0 = new sa
            r1 = 4
            r0.<init>(r5, r1)
            r11.setOnClickListener(r0)
            vj r0 = new vj
            r1 = 0
            r3 = r19
            r4 = r20
            r0.<init>(r1, r2, r3, r4, r5)
            r9.setOnClickListener(r0)
            l9 r0 = new l9
            r1 = 2
            r0.<init>(r2, r1, r3)
            r10.setOnClickListener(r0)
            r5.show()
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L196
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r1.<init>(r6)
            r0.setBackgroundDrawable(r1)
        L196:
            return
    }

    private static final void showNewReplyDetailDialog$lambda$11$lambda$10(android.app.Activity r1, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r2, android.view.View r3) {
            com.example.dyhelper.hook.comment.bookmark.BookmarkNativeJump r3 = com.example.dyhelper.hook.comment.bookmark.BookmarkNativeJump.INSTANCE
            java.lang.ClassLoader r0 = r1.getClassLoader()
            r0.getClass()
            boolean r2 = r3.jump(r1, r0, r2)
            if (r2 == 0) goto L12
            java.lang.String r2 = "正在打开视频..."
            goto L14
        L12:
            java.lang.String r2 = "跳转失败，可能视频已失效"
        L14:
            r3 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r3)
            r1.show()
            return
    }

    private static final void showNewReplyDetailDialog$lambda$11$lambda$7(android.app.AlertDialog r0, android.view.View r1) {
            r0.dismiss()
            return
    }

    private static final void showNewReplyDetailDialog$lambda$11$lambda$8(android.app.AlertDialog r0, android.view.View r1) {
            r0.dismiss()
            return
    }

    private static final void showNewReplyDetailDialog$lambda$11$lambda$9(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r0, p000.p70 r1, android.app.AlertDialog r2, android.app.Activity r3, android.view.View r4) {
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore r4 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.INSTANCE
            java.lang.String r0 = r0.getCommentId()
            r4.markRead(r0)
            r1.invoke()
            r2.dismiss()
            java.lang.String r0 = "已标记为已读"
            r1 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r3, r0, r1)
            r0.show()
            return
    }

    /* JADX INFO: renamed from: α */
    public static /* synthetic */ void m1414(com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r0, p000.p70 r1, android.app.AlertDialog r2, android.app.Activity r3, android.view.View r4) {
            showNewReplyDetailDialog$lambda$11$lambda$9(r0, r1, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: β */
    public static /* synthetic */ void m1415(android.app.AlertDialog r0, android.view.View r1) {
            showNewReplyDetailDialog$lambda$11$lambda$7(r0, r1)
            return
    }

    /* JADX INFO: renamed from: γ */
    public static /* synthetic */ void m1416(android.app.AlertDialog r0, android.view.View r1) {
            showNewReplyDetailDialog$lambda$11$lambda$8(r0, r1)
            return
    }

    /* JADX INFO: renamed from: δ */
    public static /* synthetic */ void m1417(android.app.Activity r0, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r1, p000.p70 r2) {
            showNewReplyDetailDialog$lambda$11(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: ε */
    public static /* synthetic */ void m1418(android.app.Activity r0, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r1, android.view.View r2) {
            showNewReplyDetailDialog$lambda$11$lambda$10(r0, r1, r2)
            return
    }

    public final void applyBookmarkItemTheme(android.view.View r10, p000.C1000xx r11, boolean r12) {
            r9 = this;
            r10.getClass()
            r11.getClass()
            java.lang.String r9 = r11.f12357
            java.lang.String r0 = r11.f12360
            java.lang.String r1 = r11.f12366
            java.lang.String r2 = r11.f12356
            java.lang.String r3 = r11.f12348
            java.lang.String r4 = r11.f12355
            java.lang.String r5 = r11.f12352
            int r5 = android.graphics.Color.parseColor(r5)
            r10.setBackgroundColor(r5)
            r5 = 2131297054(0x7f09031e, float:1.8212042E38)
            android.view.View r5 = r10.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L2d
            int r6 = android.graphics.Color.parseColor(r4)
            r5.setTextColor(r6)
        L2d:
            r5 = 2131297064(0x7f090328, float:1.8212062E38)
            android.view.View r5 = r10.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L3f
            int r6 = android.graphics.Color.parseColor(r2)
            r5.setTextColor(r6)
        L3f:
            r5 = 2131297138(0x7f090372, float:1.8212212E38)
            android.view.View r5 = r10.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L56
            if (r12 == 0) goto L4e
            r6 = r1
            goto L4f
        L4e:
            r6 = r0
        L4f:
            int r6 = android.graphics.Color.parseColor(r6)
            r5.setTextColor(r6)
        L56:
            r5 = 2131297141(0x7f090375, float:1.8212219E38)
            android.view.View r5 = r10.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L7c
            java.lang.String r6 = r11.f12358
            int r6 = android.graphics.Color.parseColor(r6)
            r5.setTextColor(r6)
            android.content.Context r6 = r5.getContext()
            r6.getClass()
            java.lang.String r7 = r11.f12359
            r8 = 99
            android.graphics.drawable.GradientDrawable r6 = p000.jx0.m3062(r8, r6, r7)
            r5.setBackground(r6)
        L7c:
            r5 = 2131297109(0x7f090355, float:1.8212154E38)
            android.view.View r5 = r10.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L8e
            int r6 = android.graphics.Color.parseColor(r9)
            r5.setTextColor(r6)
        L8e:
            r5 = 2131297097(0x7f090349, float:1.821213E38)
            android.view.View r5 = r10.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto La0
            int r9 = android.graphics.Color.parseColor(r9)
            r5.setTextColor(r9)
        La0:
            r9 = 2131297103(0x7f09034f, float:1.8212141E38)
            android.view.View r9 = r10.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            if (r9 == 0) goto Lb5
            if (r12 == 0) goto Lae
            r2 = r4
        Lae:
            int r12 = android.graphics.Color.parseColor(r2)
            r9.setTextColor(r12)
        Lb5:
            r9 = 2131296365(0x7f09006d, float:1.8210645E38)
            android.view.View r9 = r10.findViewById(r9)
            android.widget.Button r9 = (android.widget.Button) r9
            r12 = -1
            r2 = 10
            r5 = 0
            if (r9 == 0) goto Ld8
            r9.setAllCaps(r5)
            r9.setTextColor(r12)
            android.content.Context r6 = r9.getContext()
            r6.getClass()
            android.graphics.drawable.RippleDrawable r1 = p000.jx0.m3059(r2, r6, r3, r1)
            r9.setBackground(r1)
        Ld8:
            r9 = 2131296354(0x7f090062, float:1.8210622E38)
            android.view.View r9 = r10.findViewById(r9)
            android.widget.Button r9 = (android.widget.Button) r9
            if (r9 == 0) goto Lf7
            r9.setAllCaps(r5)
            r9.setTextColor(r12)
            android.content.Context r12 = r9.getContext()
            r12.getClass()
            android.graphics.drawable.RippleDrawable r12 = p000.jx0.m3059(r2, r12, r3, r0)
            r9.setBackground(r12)
        Lf7:
            r9 = 2131296353(0x7f090061, float:1.821062E38)
            android.view.View r9 = r10.findViewById(r9)
            android.widget.Button r9 = (android.widget.Button) r9
            if (r9 == 0) goto L11c
            r9.setAllCaps(r5)
            int r10 = android.graphics.Color.parseColor(r4)
            r9.setTextColor(r10)
            android.content.Context r10 = r9.getContext()
            r10.getClass()
            java.lang.String r11 = r11.f12371
            android.graphics.drawable.RippleDrawable r10 = p000.jx0.m3059(r2, r10, r3, r11)
            r9.setBackground(r10)
        L11c:
            return
    }

    public final void applyDialogTheme(android.app.Activity r3, android.view.View r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
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

    public final void show(android.app.Activity r2) {
            r1 = this;
            r2.getClass()
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog r1 = com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.INSTANCE
            r0 = 0
            r1.show(r2, r0)
            return
    }

    public final void showNewReplyDetailDialog(android.app.Activity r2, com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r3, p000.p70 r4) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            r4.getClass()
            e9 r1 = new e9
            r0 = 8
            r1.<init>(r2, r3, r4, r0)
            r2.runOnUiThread(r1)
            return
    }
}
