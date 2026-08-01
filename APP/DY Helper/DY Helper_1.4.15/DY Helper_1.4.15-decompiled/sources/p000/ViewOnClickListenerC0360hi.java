package p000;

/* JADX INFO: renamed from: hi */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0360hi implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4743;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f4744;

    public /* synthetic */ ViewOnClickListenerC0360hi(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f4743 = r1
            r0.f4744 = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r14) {
            r13 = this;
            int r0 = r13.f4743
            java.lang.Object r13 = r13.f4744
            switch(r0) {
                case 0: goto L228;
                case 1: goto L222;
                case 2: goto L39;
                case 3: goto L33;
                case 4: goto L2d;
                case 5: goto L25;
                case 6: goto L1f;
                case 7: goto L13;
                default: goto L7;
            }
        L7:
            um1 r13 = (p000.um1) r13
            java.lang.Object r13 = r13.f10912
            android.app.AlertDialog r13 = (android.app.AlertDialog) r13
            if (r13 == 0) goto L12
            r13.dismiss()
        L12:
            return
        L13:
            mv1 r13 = (p000.mv1) r13
            boolean r14 = r13.f7294
            if (r14 == 0) goto L1e
            p70 r13 = r13.f7295
            r13.invoke()
        L1e:
            return
        L1f:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog r13 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog) r13
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog.m1445(r14, r13)
            return
        L25:
            mw0 r13 = (p000.mw0) r13
            int r14 = com.example.dyhelper.p002ui.MainActivity.f2568
            r13.invoke()
            return
        L2d:
            fx r13 = (p000.C0301fx) r13
            r13.invoke()
            return
        L33:
            gx r13 = (p000.C0338gx) r13
            r13.invoke()
            return
        L39:
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            ql r14 = p000.C0728ql.f9031
            ol r14 = p000.C0728ql.m4928(r13)
            r0 = 0
            r1 = 0
            if (r14 == 0) goto L5a
            java.lang.String r2 = r14.f8134
            boolean r3 = p000.C0728ql.m4898(r2)
            if (r3 == 0) goto L5a
            nl r3 = new nl
            java.lang.String r2 = p000.C0728ql.m4903(r2)
            boolean r14 = r14.f8135
            r3.<init>(r2, r14)
            goto Leb
        L5a:
            android.view.ViewGroup r14 = p000.C0728ql.m4925(r13)
            if (r14 == 0) goto Lb7
            int r2 = r14.getChildCount()
            r3 = -1
            r5 = r0
            r6 = r1
        L68:
            if (r5 >= r2) goto L9e
            android.view.View r7 = r14.getChildAt(r5)
            int r8 = r7.getVisibility()
            if (r8 != 0) goto L9b
            int r8 = r7.getWidth()
            int r9 = r7.getMeasuredWidth()
            int r8 = java.lang.Math.max(r8, r9)
            if (r8 >= 0) goto L83
            r8 = r0
        L83:
            int r9 = r7.getHeight()
            int r10 = r7.getMeasuredHeight()
            int r9 = java.lang.Math.max(r9, r10)
            if (r9 >= 0) goto L92
            r9 = r0
        L92:
            long r10 = (long) r8
            long r8 = (long) r9
            long r10 = r10 * r8
            int r8 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r8 <= 0) goto L9b
            r6 = r7
            r3 = r10
        L9b:
            int r5 = r5 + 1
            goto L68
        L9e:
            if (r6 != 0) goto Lb0
            int r2 = r14.getChildCount()
            if (r2 <= 0) goto La7
            goto La8
        La7:
            r14 = r1
        La8:
            if (r14 == 0) goto Laf
            android.view.View r6 = r14.getChildAt(r0)
            goto Lb0
        Laf:
            r6 = r1
        Lb0:
            if (r6 == 0) goto Lb7
            java.lang.String r14 = p000.C0728ql.m4916(r6)
            goto Lb8
        Lb7:
            r14 = r1
        Lb8:
            if (r14 == 0) goto Lcf
            boolean r2 = p000.q02.m4671(r14)
            if (r2 == 0) goto Lc1
            goto Lcf
        Lc1:
            nl r3 = new nl
            java.lang.String r2 = p000.C0728ql.m4903(r14)
            boolean r14 = p000.C0728ql.m4929(r14)
            r3.<init>(r2, r14)
            goto Leb
        Lcf:
            java.lang.String r14 = p000.C0728ql.m4916(r13)
            if (r14 == 0) goto Lea
            boolean r2 = p000.q02.m4671(r14)
            if (r2 == 0) goto Ldc
            goto Lea
        Ldc:
            nl r3 = new nl
            java.lang.String r2 = p000.C0728ql.m4903(r14)
            boolean r14 = p000.C0728ql.m4929(r14)
            r3.<init>(r2, r14)
            goto Leb
        Lea:
            r3 = r1
        Leb:
            r14 = 1
            if (r3 != 0) goto L158
            android.view.ViewGroup r2 = p000.C0728ql.m4925(r13)
            ol r3 = p000.C0728ql.m4928(r13)
            if (r3 == 0) goto Lff
            java.lang.String r3 = r3.f8134
            boolean r3 = p000.C0728ql.m4898(r3)
            goto L100
        Lff:
            r3 = r0
        L100:
            android.os.IBinder r4 = r13.getWindowToken()
            if (r4 == 0) goto L107
            r0 = r14
        L107:
            if (r2 == 0) goto L10e
            int r2 = r2.getChildCount()
            goto L10f
        L10e:
            r2 = -1
        L10f:
            java.lang.Class r4 = r13.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "[SimilarEmoji] url unavailable after click scan attached="
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = ", candidateReady="
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = ", recyclerChildren="
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = ", container="
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = r5.toString()
            r2 = 4
            java.lang.String r3 = "r44059b78c5c3e9e3"
            p000.C0888ux.m5988(r3, r0, r1, r2, r1)
            android.content.Context r13 = r13.getContext()
            r13.getClass()
            android.os.Handler r0 = p000.C0728ql.f9032
            yi r1 = new yi
            java.lang.String r2 = "未找到表情地址"
            r1.<init>(r14, r13, r2)
            r0.post(r1)
            goto L221
        L158:
            java.lang.String r0 = r3.f7664
            p000.C0728ql.m4921(r0)
            int r2 = com.example.dyhelper.MainHook.f2222
            android.content.Context r2 = r13.getContext()
        L163:
            boolean r4 = r2 instanceof android.content.ContextWrapper
            if (r4 == 0) goto L177
            boolean r4 = r2 instanceof android.app.Activity
            if (r4 == 0) goto L170
            r1 = r2
            android.app.Activity r1 = (android.app.Activity) r1
        L16e:
            r9 = r1
            goto L17f
        L170:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            goto L163
        L177:
            boolean r4 = r2 instanceof android.app.Activity
            if (r4 == 0) goto L16e
            r1 = r2
            android.app.Activity r1 = (android.app.Activity) r1
            goto L16e
        L17f:
            if (r9 != 0) goto L196
            android.content.Context r13 = r13.getContext()
            r13.getClass()
            android.os.Handler r0 = p000.C0728ql.f9032
            yi r1 = new yi
            java.lang.String r2 = "无法获取界面上下文"
            r1.<init>(r14, r13, r2)
            r0.post(r1)
            goto L221
        L196:
            java.lang.Class r1 = r13.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            if (r1 != 0) goto L1b4
            android.content.Context r13 = r13.getContext()
            r13.getClass()
            android.os.Handler r0 = p000.C0728ql.f9032
            yi r1 = new yi
            java.lang.String r2 = "宿主图片组件不可用"
            r1.<init>(r14, r13, r2)
            r0.post(r1)
            goto L221
        L1b4:
            qy0 r13 = p000.qy0.f9157
            java.lang.String r0 = p000.C0728ql.m4903(r0)
            boolean r8 = r3.f7665
            n5 r5 = new n5
            r5.<init>(r9, r1)
            n r12 = new n
            r2 = 21
            r12.<init>(r2, r1)
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r6 = r0.toString()
            boolean r0 = p000.q02.m4671(r6)
            if (r0 == 0) goto L1dc
            java.lang.String r13 = "未找到表情下载链接"
            p000.qy0.m4991(r9, r13)
            goto L221
        L1dc:
            iu r0 = p000.AbstractC1021yh.m6915(r9)
            java.lang.String r1 = r0.f5186
            if (r1 == 0) goto L1f8
            boolean r1 = p000.q02.m4671(r1)
            if (r1 == 0) goto L1eb
            goto L1f8
        L1eb:
            boolean r0 = r0.m2799()
            if (r0 != 0) goto L1f8
            java.lang.String r0 = "DYHelper"
            java.lang.String r1 = "[DOWNLOAD-STORAGE] 当前空间无可用 SAF 授权，改用 MediaStore"
            p000.C0888ux.m5975(r0, r1)
        L1f8:
            p000.qy0.m4960(r9)
            int r10 = r13.m5031()
            boolean r11 = p000.qy0.m4988(r9)
            java.lang.String r13 = "comment_emoji_convert_format_enabled"
            boolean r7 = p000.qy0.m5009(r9, r13, r14)
            java.lang.String r13 = "下载表情"
            java.lang.String r14 = "正在连接..."
            p000.qy0.m4996(r9, r13, r14)
            java.lang.String r13 = "开始下载表情..."
            p000.qy0.m4991(r9, r13)
            wx0 r4 = new wx0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r13 = 23
            java.lang.String r14 = "dl-comment-emoji-prepare"
            p000.p91.m4411(r13, r4, r14)
        L221:
            return
        L222:
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog r13 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog) r13
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkAddDialog.m1400(r14, r13)
            return
        L228:
            ei r13 = (p000.C0249ei) r13
            r13.invoke()
            return
    }
}
