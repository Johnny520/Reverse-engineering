package p000;

/* JADX INFO: renamed from: f9 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0277f9 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f3826;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ android.app.Activity f3827;

    public /* synthetic */ C0277f9(android.app.Activity r1, int r2) {
            r0 = this;
            r0.f3826 = r2
            r0.f3827 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f3826
            java.lang.String r1 = "当前作品作者信息不足"
            java.lang.String r2 = "已添加作品书签"
            r3 = 20
            r4 = 0
            r5 = 0
            r6 = 1
            s62 r7 = p000.s62.f9751
            android.app.Activity r10 = r10.f3827
            switch(r0) {
                case 0: goto L395;
                case 1: goto L381;
                case 2: goto L371;
                case 3: goto L358;
                case 4: goto L34d;
                case 5: goto L332;
                case 6: goto L327;
                case 7: goto L31c;
                case 8: goto L301;
                case 9: goto L2ec;
                case 10: goto L2b5;
                case 11: goto L26c;
                case 12: goto L261;
                case 13: goto L19c;
                case 14: goto L191;
                case 15: goto L182;
                case 16: goto L177;
                case 17: goto L16c;
                case 18: goto L12a;
                case 19: goto Lb1;
                case 20: goto La6;
                case 21: goto L91;
                case 22: goto L76;
                case 23: goto L6b;
                case 24: goto L60;
                case 25: goto L55;
                case 26: goto L43;
                case 27: goto L38;
                case 28: goto L1d;
                default: goto L12;
            }
        L12:
            f8 r11 = (p000.C0276f8) r11
            r11.getClass()
            q71 r0 = p000.q71.f8896
            p000.q71.m4795(r11, r10)
            return r7
        L1d:
            kf1 r11 = (p000.kf1) r11
            r11.getClass()
            q71 r0 = p000.q71.f8896
            java.lang.String r0 = r11.f5895
            int r1 = r11.f5890
            int r11 = r11.f5894
            if (r11 != 0) goto L2f
            if (r1 < r6) goto L2f
            goto L30
        L2f:
            r5 = r6
        L30:
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r0, r5)
            r10.show()
            return r7
        L38:
            f8 r11 = (p000.C0276f8) r11
            r11.getClass()
            q71 r0 = p000.q71.f8896
            p000.q71.m4795(r11, r10)
            return r7
        L43:
            yj0 r11 = (p000.yj0) r11
            r11.getClass()
            java.lang.String r0 = r11.f12647
            boolean r11 = r11.f12646
            r11 = r11 ^ r6
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r0, r11)
            r10.show()
            return r7
        L55:
            f8 r11 = (p000.C0276f8) r11
            r11.getClass()
            qy0 r0 = p000.qy0.f9157
            p000.qy0.m4989(r11, r10)
            return r7
        L60:
            f8 r11 = (p000.C0276f8) r11
            r11.getClass()
            q71 r0 = p000.q71.f8896
            p000.q71.m4795(r11, r10)
            return r7
        L6b:
            f8 r11 = (p000.C0276f8) r11
            r11.getClass()
            qy0 r0 = p000.qy0.f9157
            p000.qy0.m4989(r11, r10)
            return r7
        L76:
            qe1 r11 = (p000.qe1) r11
            r11.getClass()
            q71 r0 = p000.q71.f8896
            java.lang.String r0 = r11.f8989
            int r1 = r11.f8985
            int r11 = r11.f8988
            if (r11 != 0) goto L88
            if (r1 < r6) goto L88
            goto L89
        L88:
            r5 = r6
        L89:
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r0, r5)
            r10.show()
            return r7
        L91:
            hf1 r11 = (p000.hf1) r11
            r11.getClass()
            java.lang.String r0 = r11.f4724
            int r11 = r11.f4723
            if (r11 != 0) goto L9d
            goto L9e
        L9d:
            r5 = r6
        L9e:
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r0, r5)
            r10.show()
            return r7
        La6:
            f8 r11 = (p000.C0276f8) r11
            r11.getClass()
            qy0 r0 = p000.qy0.f9157
            p000.qy0.m4989(r11, r10)
            return r7
        Lb1:
            f8 r11 = (p000.C0276f8) r11
            r11.getClass()
            q71 r0 = p000.q71.f8896
            boolean r0 = r11.m2053()
            java.lang.String r1 = r11.f3799
            if (r0 != 0) goto Lc4
            p000.q71.m4795(r11, r10)
            goto L129
        Lc4:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            p000.q71.m4789(r0, r1)
            java.lang.String r1 = p000.q71.m4798(r1)
            java.lang.String r2 = "https://www.douyin.com/video/"
            if (r1 == 0) goto Ldb
            java.lang.String r1 = r2.concat(r1)
            p000.q71.m4789(r0, r1)
        Ldb:
            java.lang.String r1 = r11.f3800
            if (r1 == 0) goto Lfa
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto Lfa
            boolean r6 = p000.q02.m4671(r1)
            if (r6 != 0) goto Lf0
            goto Lf1
        Lf0:
            r1 = r4
        Lf1:
            if (r1 == 0) goto Lfa
            java.lang.String r1 = r2.concat(r1)
            p000.q71.m4789(r0, r1)
        Lfa:
            java.util.List r0 = p000.AbstractC0984xh.m6666(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L113
            java.lang.String r0 = "未识别到分享链接，改用普通视频下载"
            android.widget.Toast r0 = android.widget.Toast.makeText(r10, r0, r5)
            r0.show()
            qy0 r0 = p000.qy0.f9157
            r0.m5026(r10, r11, r4)
            goto L129
        L113:
            java.lang.String r1 = "正在解析原画质..."
            android.widget.Toast r1 = android.widget.Toast.makeText(r10, r1, r5)
            r1.show()
            java.lang.Thread r1 = new java.lang.Thread
            e9 r2 = new e9
            r2.<init>(r10, r0, r11, r3)
            r1.<init>(r2)
            r1.start()
        L129:
            return r7
        L12a:
            f8 r11 = (p000.C0276f8) r11
            r11.getClass()
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.INSTANCE
            android.content.Context r1 = r10.getApplicationContext()
            if (r1 != 0) goto L138
            r1 = r10
        L138:
            r0.init(r1)
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord$Companion r1 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord.Companion
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r11 = r1.fromAwemeInfo(r11)
            if (r11 != 0) goto L14d
            java.lang.String r11 = "未识别到当前作品，暂时无法添加书签"
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r11, r5)
            r10.show()
            goto L16b
        L14d:
            java.lang.String r1 = r11.getAwemeId()
            boolean r1 = r0.isBookmarked(r1)
            if (r1 == 0) goto L161
            java.lang.String r11 = "当前作品已添加书签"
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r11, r5)
            r10.show()
            goto L16b
        L161:
            r0.add(r11)
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r2, r5)
            r10.show()
        L16b:
            return r7
        L16c:
            f8 r11 = (p000.C0276f8) r11
            r11.getClass()
            qy0 r0 = p000.qy0.f9157
            p000.qy0.m4989(r11, r10)
            return r7
        L177:
            f8 r11 = (p000.C0276f8) r11
            r11.getClass()
            qy0 r0 = p000.qy0.f9157
            r0.m5018(r11, r10)
            return r7
        L182:
            mg1 r11 = (p000.mg1) r11
            r11.getClass()
            java.lang.String r11 = r11.f7129
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r11, r6)
            r10.show()
            return r7
        L191:
            f8 r11 = (p000.C0276f8) r11
            r11.getClass()
            q71 r0 = p000.q71.f8896
            p000.q71.m4791(r11, r10)
            return r7
        L19c:
            f8 r11 = (p000.C0276f8) r11
            r11.getClass()
            q71 r0 = p000.q71.f8896
            android.widget.LinearLayout r0 = p000.AbstractC0602nx.m4123(r10, r6)
            int r1 = p000.q71.m4796(r10, r3)
            r2 = 12
            int r2 = p000.q71.m4796(r10, r2)
            int r3 = p000.q71.m4796(r10, r3)
            r8 = 2
            int r9 = p000.q71.m4796(r10, r8)
            r0.setPadding(r1, r2, r3, r9)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r10)
            java.lang.String r2 = "输入 UID 或 SecUID，任填一个即可打开主页"
            r1.setText(r2)
            r2 = 1094713344(0x41400000, float:12.0)
            r1.setTextSize(r2)
            r2 = -7829368(0xffffffffff888888, float:NaN)
            r1.setTextColor(r2)
            r2 = 10
            int r2 = p000.q71.m4796(r10, r2)
            r1.setPadding(r5, r5, r5, r2)
            android.widget.EditText r2 = new android.widget.EditText
            r2.<init>(r10)
            java.lang.String r3 = "UID"
            r2.setHint(r3)
            r2.setSingleLine(r6)
            r2.setInputType(r6)
            java.lang.String r3 = r11.f3801
            if (r3 == 0) goto L1f8
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            goto L1f9
        L1f8:
            r3 = r4
        L1f9:
            java.lang.String r5 = ""
            if (r3 != 0) goto L1fe
            r3 = r5
        L1fe:
            r2.setText(r3)
            r2.selectAll()
            android.widget.EditText r3 = new android.widget.EditText
            r3.<init>(r10)
            java.lang.String r9 = "SecUID"
            r3.setHint(r9)
            r3.setSingleLine(r6)
            r3.setInputType(r6)
            java.lang.String r6 = r11.f3802
            if (r6 == 0) goto L221
            java.lang.CharSequence r6 = p000.q02.m4660(r6)
            java.lang.String r6 = r6.toString()
            goto L222
        L221:
            r6 = r4
        L222:
            if (r6 != 0) goto L225
            goto L226
        L225:
            r5 = r6
        L226:
            r3.setText(r5)
            r0.addView(r1)
            r0.addView(r2)
            r0.addView(r3)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r10)
            java.lang.String r5 = "打开个人主页"
            android.app.AlertDialog$Builder r1 = r1.setTitle(r5)
            android.app.AlertDialog$Builder r0 = r1.setView(r0)
            l90 r1 = new l90
            r1.<init>(r2, r3, r10, r11)
            java.lang.String r2 = "打开"
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r2, r1)
            bc0 r1 = new bc0
            r1.<init>(r11, r8, r10)
            java.lang.String r10 = "复制当前ID"
            android.app.AlertDialog$Builder r10 = r0.setNeutralButton(r10, r1)
            java.lang.String r11 = "取消"
            android.app.AlertDialog$Builder r10 = r10.setNegativeButton(r11, r4)
            r10.show()
            return r7
        L261:
            f8 r11 = (p000.C0276f8) r11
            r11.getClass()
            q71 r0 = p000.q71.f8896
            p000.q71.m4795(r11, r10)
            return r7
        L26c:
            f8 r11 = (p000.C0276f8) r11
            r11.getClass()
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkStore.INSTANCE
            android.content.Context r1 = r10.getApplicationContext()
            if (r1 != 0) goto L27a
            r1 = r10
        L27a:
            r0.init(r1)
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord$Companion r1 = com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord.Companion
            com.example.dyhelper.hook.comment.bookmark.VideoBookmarkRecord r11 = r1.fromAwemeInfo(r11)
            if (r11 != 0) goto L28f
            java.lang.String r11 = "未识别到当前作品，暂时无法收藏"
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r11, r5)
            r10.show()
            goto L2b4
        L28f:
            java.lang.String r1 = r11.getAwemeId()
            boolean r1 = r0.isBookmarked(r1)
            if (r1 == 0) goto L2aa
            java.lang.String r11 = r11.getAwemeId()
            r0.remove(r11)
            java.lang.String r11 = "已取消作品书签"
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r11, r5)
            r10.show()
            goto L2b4
        L2aa:
            r0.add(r11)
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r2, r5)
            r10.show()
        L2b4:
            return r7
        L2b5:
            f8 r11 = (p000.C0276f8) r11
            r11.getClass()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord$Companion r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord.Companion
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r11 = r0.fromAwemeInfo(r11)
            if (r11 != 0) goto L2ca
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r1, r5)
            r10.show()
            goto L2eb
        L2ca:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.INSTANCE
            android.content.Context r1 = r10.getApplicationContext()
            if (r1 != 0) goto L2d3
            r1 = r10
        L2d3:
            r0.init(r1)
            boolean r0 = r0.isBookmarked(r11)
            if (r0 == 0) goto L2e6
            java.lang.String r11 = "该作者主页已添加书签"
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r11, r5)
            r10.show()
            goto L2eb
        L2e6:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.INSTANCE
            r0.toggleProfileBookmark(r10, r11)
        L2eb:
            return r7
        L2ec:
            zf1 r11 = (p000.zf1) r11
            r11.getClass()
            java.lang.String r0 = r11.f13085
            int r11 = r11.f13084
            if (r11 != 0) goto L2f8
            goto L2f9
        L2f8:
            r5 = r6
        L2f9:
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r0, r5)
            r10.show()
            return r7
        L301:
            f8 r11 = (p000.C0276f8) r11
            r11.getClass()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord$Companion r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord.Companion
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r11 = r0.fromAwemeInfo(r11)
            if (r11 != 0) goto L316
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r1, r5)
            r10.show()
            goto L31b
        L316:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.INSTANCE
            r0.toggleProfileBookmark(r10, r11)
        L31b:
            return r7
        L31c:
            f8 r11 = (p000.C0276f8) r11
            r11.getClass()
            q71 r0 = p000.q71.f8896
            p000.q71.m4795(r11, r10)
            return r7
        L327:
            f8 r11 = (p000.C0276f8) r11
            r11.getClass()
            q71 r0 = p000.q71.f8896
            p000.q71.m4791(r11, r10)
            return r7
        L332:
            mg1 r11 = (p000.mg1) r11
            r11.getClass()
            q71 r0 = p000.q71.f8896
            java.lang.String r0 = r11.f7129
            int r1 = r11.f7125
            int r11 = r11.f7127
            if (r11 != 0) goto L344
            if (r1 < r6) goto L344
            goto L345
        L344:
            r5 = r6
        L345:
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r0, r5)
            r10.show()
            return r7
        L34d:
            java.lang.String r11 = (java.lang.String) r11
            r11.getClass()
            q71 r0 = p000.q71.f8896
            p000.q71.m4797(r10, r11)
            return r7
        L358:
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            float r11 = (float) r11
            android.content.res.Resources r10 = r10.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = android.util.TypedValue.applyDimension(r6, r11, r10)
        L36b:
            int r10 = (int) r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            return r10
        L371:
            yj0 r11 = (p000.yj0) r11
            r11.getClass()
            w1 r0 = new w1
            r1 = 16
            r0.<init>(r10, r1, r11)
            r10.runOnUiThread(r0)
            return r7
        L381:
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            float r11 = (float) r11
            android.content.res.Resources r10 = r10.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = android.util.TypedValue.applyDimension(r6, r11, r10)
            goto L36b
        L395:
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            float r11 = (float) r11
            android.content.res.Resources r10 = r10.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = android.util.TypedValue.applyDimension(r6, r11, r10)
            goto L36b
    }
}
