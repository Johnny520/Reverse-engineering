package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jg1 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5459;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f5460;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f5461;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f5462;

    public /* synthetic */ jg1(p000.a80 r2, android.app.Activity r3, p000.C0901v9 r4) {
            r1 = this;
            r0 = 3
            r1.f5459 = r0
            r1.<init>()
            r1.f5461 = r2
            r1.f5460 = r3
            r1.f5462 = r4
            return
    }

    public /* synthetic */ jg1(android.widget.TextView r1, android.app.Activity r2, java.lang.Comparable r3, int r4) {
            r0 = this;
            r0.f5459 = r4
            r0.f5462 = r1
            r0.f5460 = r2
            r0.f5461 = r3
            r0.<init>()
            return
    }

    public /* synthetic */ jg1(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f5459 = r4
            r0.f5460 = r1
            r0.f5462 = r2
            r0.f5461 = r3
            r0.<init>()
            return
    }

    public /* synthetic */ jg1(java.lang.String r2, p000.um1 r3, android.app.Activity r4) {
            r1 = this;
            r0 = 5
            r1.f5459 = r0
            r1.<init>()
            r1.f5462 = r2
            r1.f5461 = r3
            r1.f5460 = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r11 = this;
            int r0 = r11.f5459
            java.lang.String r1 = ""
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Object r5 = r11.f5461
            java.lang.Object r6 = r11.f5462
            java.lang.Object r11 = r11.f5460
            switch(r0) {
                case 0: goto L1f6;
                case 1: goto L1ec;
                case 2: goto L1ac;
                case 3: goto L183;
                case 4: goto L15a;
                case 5: goto L127;
                case 6: goto Lf9;
                case 7: goto Led;
                case 8: goto Lca;
                default: goto L10;
            }
        L10:
            android.net.Uri r11 = (android.net.Uri) r11
            qh1 r6 = (p000.qh1) r6
            java.lang.String r5 = (java.lang.String) r5
            if (r11 != 0) goto L1d
            r6.invoke(r4)
            goto Lc9
        L1d:
            if (r5 == 0) goto L28
            boolean r0 = p000.q02.m4671(r5)
            if (r0 != 0) goto L26
            r4 = r5
        L26:
            if (r4 != 0) goto L30
        L28:
            java.lang.String r4 = r11.getLastPathSegment()
            if (r4 != 0) goto L30
            java.lang.String r4 = "已选择 MP3"
        L30:
            java.lang.Object r0 = p000.ui1.f10844
            java.lang.String r0 = r11.toString()
            r0.getClass()
            java.lang.String r2 = "voice_replace_mp3_uri"
            p000.ui1.m5875(r2, r0)
            java.lang.String r0 = "voice_replace_mp3_name"
            p000.ui1.m5875(r0, r4)
            java.lang.String r11 = r11.toString()
            r11.getClass()
            java.lang.String r0 = "uri"
            java.lang.String r2 = "voice_replace_audio_list"
            java.lang.String r1 = p000.ui1.m5893(r2, r1)     // Catch: java.lang.Throwable -> L5e
            boolean r5 = p000.q02.m4671(r1)     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L60
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L5e
            r1.<init>()     // Catch: java.lang.Throwable -> L5e
            goto L66
        L5e:
            r11 = move-exception
            goto Lb3
        L60:
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L5e
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L5e
            r1 = r5
        L66:
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L5e
            r5.<init>()     // Catch: java.lang.Throwable -> L5e
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5e
            r7.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r8 = "id"
            r7.put(r8, r11)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r8 = "name"
            r7.put(r8, r4)     // Catch: java.lang.Throwable -> L5e
            r7.put(r0, r11)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r8 = "durationMs"
            r9 = 0
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L5e
            r5.put(r7)     // Catch: java.lang.Throwable -> L5e
            int r7 = r1.length()     // Catch: java.lang.Throwable -> L5e
        L8b:
            if (r3 >= r7) goto La4
            org.json.JSONObject r8 = r1.optJSONObject(r3)     // Catch: java.lang.Throwable -> L5e
            if (r8 != 0) goto L94
            goto La1
        L94:
            java.lang.String r9 = r8.optString(r0)     // Catch: java.lang.Throwable -> L5e
            boolean r9 = p000.ln0.m3626(r9, r11)     // Catch: java.lang.Throwable -> L5e
            if (r9 != 0) goto La1
            r5.put(r8)     // Catch: java.lang.Throwable -> L5e
        La1:
            int r3 = r3 + 1
            goto L8b
        La4:
            java.lang.Object r11 = p000.ui1.f10844     // Catch: java.lang.Throwable -> L5e
            java.lang.String r11 = r5.toString()     // Catch: java.lang.Throwable -> L5e
            r11.getClass()     // Catch: java.lang.Throwable -> L5e
            p000.ui1.m5875(r2, r11)     // Catch: java.lang.Throwable -> L5e
            s62 r11 = p000.s62.f9751     // Catch: java.lang.Throwable -> L5e
            goto Lb9
        Lb3:
            eo1 r0 = new eo1
            r0.<init>(r11)
            r11 = r0
        Lb9:
            java.lang.Throwable r11 = p000.fo1.m2190(r11)
            if (r11 == 0) goto Lc6
            java.lang.String r0 = "DYHelper"
            java.lang.String r1 = "保存语音替换音频列表失败"
            p000.C0888ux.m5977(r0, r1, r11)
        Lc6:
            r6.invoke(r4)
        Lc9:
            return
        Lca:
            android.widget.TextView r6 = (android.widget.TextView) r6
            android.app.Activity r11 = (android.app.Activity) r11
            android.net.Uri r5 = (android.net.Uri) r5
            java.lang.String r0 = "下载完成，正在打开安装器"
            r6.setText(r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)
            java.lang.String r1 = "application/vnd.android.package-archive"
            r0.setDataAndType(r5, r1)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            r0.addFlags(r2)
            r11.startActivity(r0)
            return
        Led:
            android.view.View r11 = (android.view.View) r11
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r5 = (java.lang.String) r5
            o22 r0 = p000.o22.f7889
            r0.m4189(r11, r6, r5)
            return
        Lf9:
            android.widget.TextView r6 = (android.widget.TextView) r6
            android.app.Activity r11 = (android.app.Activity) r11
            java.lang.String r5 = (java.lang.String) r5
            r6.setEnabled(r2)
            boolean r0 = r11.isFinishing()
            if (r0 != 0) goto L126
            boolean r0 = r11.isDestroyed()
            if (r0 != 0) goto L126
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r11)
            java.lang.String r11 = "测试发送结果"
            android.app.AlertDialog$Builder r11 = r0.setTitle(r11)
            android.app.AlertDialog$Builder r11 = r11.setMessage(r5)
            java.lang.String r0 = "确定"
            android.app.AlertDialog$Builder r11 = r11.setPositiveButton(r0, r4)
            r11.show()
        L126:
            return
        L127:
            java.lang.String r6 = (java.lang.String) r6
            um1 r5 = (p000.um1) r5
            android.app.Activity r11 = (android.app.Activity) r11
            if (r6 == 0) goto L150
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "comment_bg_cropped_uri"
            p000.ui1.m5875(r0, r6)
            java.lang.String r0 = "comment_bg_image_uri"
            p000.ui1.m5875(r0, r1)
            java.lang.Object r0 = r5.f10912
            a80 r0 = (p000.a80) r0
            if (r0 == 0) goto L146
            java.lang.String r1 = "已选择并裁剪"
            r0.invoke(r1)
        L146:
            java.lang.String r0 = "背景图片已保存，重新打开评论区生效"
            android.widget.Toast r11 = android.widget.Toast.makeText(r11, r0, r3)
            r11.show()
            goto L159
        L150:
            java.lang.String r0 = "保存失败，请重试"
            android.widget.Toast r11 = android.widget.Toast.makeText(r11, r0, r3)
            r11.show()
        L159:
            return
        L15a:
            android.app.Activity r11 = (android.app.Activity) r11
            android.net.Uri r6 = (android.net.Uri) r6
            um1 r5 = (p000.um1) r5
            android.content.ContentResolver r0 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L17a
            java.io.InputStream r0 = r0.openInputStream(r6)     // Catch: java.lang.Throwable -> L17a
            if (r0 == 0) goto L17a
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch: java.lang.Throwable -> L173
            r0.close()     // Catch: java.lang.Throwable -> L17a
            r4 = r1
            goto L17a
        L173:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L175
        L175:
            r2 = move-exception
            p000.AbstractC0978xb.m6584(r0, r1)     // Catch: java.lang.Throwable -> L17a
            throw r2     // Catch: java.lang.Throwable -> L17a
        L17a:
            com.example.dyhelper.ui.υ r0 = new com.example.dyhelper.ui.υ
            r0.<init>(r4, r11, r5)
            r11.runOnUiThread(r0)
            return
        L183:
            a80 r5 = (p000.a80) r5
            android.app.Activity r11 = (android.app.Activity) r11
            v9 r6 = (p000.C0901v9) r6
            boolean r0 = p000.AbstractC0976x9.m6532()
            if (r0 == 0) goto L192
            java.lang.String r1 = "已通过"
            goto L194
        L192:
            java.lang.String r1 = "未通过"
        L194:
            r5.invoke(r1)
            java.lang.String r1 = r6.f11182
            android.widget.Toast r1 = android.widget.Toast.makeText(r11, r1, r3)
            r1.show()
            if (r0 == 0) goto L1ab
            java.lang.String r0 = "内测状态已更新，重新打开设置可刷新全部开关"
            android.widget.Toast r11 = android.widget.Toast.makeText(r11, r0, r3)
            r11.show()
        L1ab:
            return
        L1ac:
            android.view.View r11 = (android.view.View) r11
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            java.lang.String r0 = "PublishGestureLauncher"
            java.lang.String r1 = "[降级方案] 临时 PublishButton 延迟触发异常: "
            r2 = 4
            dk1 r3 = p000.dk1.f3201     // Catch: java.lang.Throwable -> L1c7
            java.lang.String r3 = "transient-attached"
            boolean r11 = p000.dk1.m1771(r11, r3)     // Catch: java.lang.Throwable -> L1c7
            if (r11 == 0) goto L1c9
            java.lang.String r11 = "[降级方案] 临时 PublishButton 触发成功（罕见情况）"
            p000.C0888ux.m5988(r0, r11, r4, r2, r4)     // Catch: java.lang.Throwable -> L1c7
            goto L1ce
        L1c7:
            r11 = move-exception
            goto L1d2
        L1c9:
            java.lang.String r11 = "[降级方案] 临时 PublishButton 未触发（预期行为），建议检查前序方案是否正常工作"
            p000.C0888ux.m5988(r0, r11, r4, r2, r4)     // Catch: java.lang.Throwable -> L1c7
        L1ce:
            r6.removeView(r5)     // Catch: java.lang.Throwable -> L1e6
            goto L1e6
        L1d2:
            java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> L1e7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e7
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L1e7
            r3.append(r11)     // Catch: java.lang.Throwable -> L1e7
            java.lang.String r11 = r3.toString()     // Catch: java.lang.Throwable -> L1e7
            p000.C0888ux.m5988(r0, r11, r4, r2, r4)     // Catch: java.lang.Throwable -> L1e7
            goto L1ce
        L1e6:
            return
        L1e7:
            r11 = move-exception
            r6.removeView(r5)     // Catch: java.lang.Throwable -> L1eb
        L1eb:
            throw r11
        L1ec:
            android.app.Activity r11 = (android.app.Activity) r11
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery$Summary r6 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.Summary) r6
            a80 r5 = (p000.a80) r5
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkActiveQuery.m1438(r11, r6, r5)
            return
        L1f6:
            android.app.Activity r11 = (android.app.Activity) r11
            lg1 r6 = (p000.lg1) r6
            a80 r5 = (p000.a80) r5
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.pg1.f8551
            java.lang.String r1 = "火星任务失败: "
            java.lang.String r4 = "火星生产任务异常 mode="
            mg1 r1 = p000.pg1.m4527(r11, r6)     // Catch: java.lang.Throwable -> L20a
        L206:
            r0.set(r3)
            goto L238
        L20a:
            r7 = move-exception
            java.lang.String r8 = "r86c859e3375e752"
            kg1 r6 = r6.f6623     // Catch: java.lang.Throwable -> L22d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22d
            r9.<init>(r4)     // Catch: java.lang.Throwable -> L22d
            r9.append(r6)     // Catch: java.lang.Throwable -> L22d
            java.lang.String r4 = r9.toString()     // Catch: java.lang.Throwable -> L22d
            p000.C0888ux.m5977(r8, r4, r7)     // Catch: java.lang.Throwable -> L22d
            java.lang.String r4 = r7.getMessage()     // Catch: java.lang.Throwable -> L22d
            if (r4 != 0) goto L22f
            java.lang.Class r4 = r7.getClass()     // Catch: java.lang.Throwable -> L22d
            java.lang.String r4 = r4.getSimpleName()     // Catch: java.lang.Throwable -> L22d
            goto L22f
        L22d:
            r11 = move-exception
            goto L243
        L22f:
            java.lang.String r1 = r1.concat(r4)     // Catch: java.lang.Throwable -> L22d
            mg1 r1 = p000.pg1.m4526(r1, r2)     // Catch: java.lang.Throwable -> L22d
            goto L206
        L238:
            ii0 r0 = new ii0     // Catch: java.lang.Throwable -> L242
            r2 = 16
            r0.<init>(r5, r2, r1)     // Catch: java.lang.Throwable -> L242
            r11.runOnUiThread(r0)     // Catch: java.lang.Throwable -> L242
        L242:
            return
        L243:
            r0.set(r3)
            throw r11
    }
}
