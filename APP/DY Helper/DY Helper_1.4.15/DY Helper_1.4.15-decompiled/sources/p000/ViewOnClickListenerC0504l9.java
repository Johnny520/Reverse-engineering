package p000;

/* JADX INFO: renamed from: l9 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0504l9 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f6494;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f6495;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f6496;

    public /* synthetic */ ViewOnClickListenerC0504l9(com.example.dyhelper.p002ui.GestureAreaView r2, android.app.Activity r3) {
            r1 = this;
            r0 = 6
            r1.f6494 = r0
            r1.<init>()
            r1.f6496 = r2
            r1.f6495 = r3
            return
    }

    public /* synthetic */ ViewOnClickListenerC0504l9(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f6494 = r2
            r0.f6495 = r1
            r0.f6496 = r3
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r9) {
            r8 = this;
            int r0 = r8.f6494
            r1 = 0
            r2 = 3
            r3 = 1
            r4 = 0
            java.lang.Object r5 = r8.f6496
            java.lang.Object r8 = r8.f6495
            switch(r0) {
                case 0: goto L1b6;
                case 1: goto L19e;
                case 2: goto L196;
                case 3: goto L18a;
                case 4: goto L146;
                case 5: goto L13b;
                case 6: goto Le6;
                case 7: goto Ld8;
                case 8: goto Lc5;
                case 9: goto Lb8;
                case 10: goto La1;
                case 11: goto L88;
                case 12: goto L78;
                case 13: goto L50;
                case 14: goto L18;
                default: goto Ld;
            }
        Ld:
            va2 r8 = (p000.va2) r8
            android.app.Dialog r5 = (android.app.Dialog) r5
            r8.m6142()
            r5.dismiss()
            return
        L18:
            android.app.Activity r8 = (android.app.Activity) r8
            um1 r5 = (p000.um1) r5
            ry1 r9 = p000.ry1.f9602
            boolean r9 = p000.ry1.m5270()
            if (r9 != 0) goto L2e
            java.lang.String r9 = "请先手动发送一条消息来激活"
            android.widget.Toast r8 = android.widget.Toast.makeText(r8, r9, r3)
            r8.show()
            goto L4f
        L2e:
            java.lang.String r9 = "正在续火花..."
            android.widget.Toast r9 = android.widget.Toast.makeText(r8, r9, r4)
            r9.show()
            java.lang.Object r9 = r5.f10912
            android.app.AlertDialog r9 = (android.app.AlertDialog) r9
            if (r9 == 0) goto L40
            r9.dismiss()
        L40:
            java.lang.Thread r9 = new java.lang.Thread
            hg1 r0 = new hg1
            r1 = 11
            r0.<init>(r8, r1)
            r9.<init>(r0)
            r9.start()
        L4f:
            return
        L50:
            android.content.Context r8 = (android.content.Context) r8
            android.net.Uri r5 = (android.net.Uri) r5
            android.content.Intent r9 = new android.content.Intent     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "android.intent.action.VIEW"
            r9.<init>(r0, r5)     // Catch: java.lang.Throwable -> L61
            r8.startActivity(r9)     // Catch: java.lang.Throwable -> L61
            s62 r9 = p000.s62.f9751     // Catch: java.lang.Throwable -> L61
            goto L68
        L61:
            r9 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r9)
            r9 = r0
        L68:
            java.lang.Throwable r9 = p000.fo1.m2190(r9)
            if (r9 == 0) goto L77
            java.lang.String r9 = "无法打开群组链接"
            android.widget.Toast r8 = android.widget.Toast.makeText(r8, r9, r4)
            r8.show()
        L77:
            return
        L78:
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            android.widget.Switch r5 = (android.widget.Switch) r5
            r8.performHapticFeedback(r2)
            boolean r8 = r5.isChecked()
            r8 = r8 ^ r3
            r5.setChecked(r8)
            return
        L88:
            tm1 r8 = (p000.tm1) r8
            p70 r5 = (p000.p70) r5
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r8.f10414
            long r2 = r0 - r2
            r6 = 600(0x258, double:2.964E-321)
            int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r9 >= 0) goto L9b
            goto La0
        L9b:
            r8.f10414 = r0
            r5.invoke()
        La0:
            return
        La1:
            j71 r8 = (p000.j71) r8
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            p70 r9 = r8.f5351
            r9.invoke()
            boolean r9 = r8.f5346
            if (r9 == 0) goto Lb7
            boolean r8 = r8.f5350
            if (r8 != 0) goto Lb7
            q71 r8 = p000.q71.f8896
            p000.q71.m4794(r5)
        Lb7:
            return
        Lb8:
            android.app.Activity r8 = (android.app.Activity) r8
            android.widget.TextView r5 = (android.widget.TextView) r5
            q61 r9 = new q61
            r9.<init>(r8, r5, r4)
            p000.AbstractC1021yh.m6911(r8, r9)
            return
        Lc5:
            li0 r8 = (p000.li0) r8
            jj0 r5 = (p000.jj0) r5
            boolean r9 = r8.f6648
            if (r9 != 0) goto Ld7
            jj0 r9 = r8.f6682
            if (r9 != r5) goto Ld2
            goto Ld7
        Ld2:
            r8.f6682 = r5
            r8.m3568()
        Ld7:
            return
        Ld8:
            ub0 r8 = (p000.ub0) r8
            ic0 r5 = (p000.ic0) r5
            boolean r9 = r8.f10680
            if (r9 != 0) goto Le5
            yb0 r8 = r8.f10676
            r8.invoke(r5)
        Le5:
            return
        Le6:
            com.example.dyhelper.ui.GestureAreaView r5 = (com.example.dyhelper.p002ui.GestureAreaView) r5
            android.app.Activity r8 = (android.app.Activity) r8
            r5.m1552()
            android.app.AlertDialog r9 = p000.ia0.f4971
            if (r9 == 0) goto Lf4
            r9.dismiss()
        Lf4:
            bv1 r9 = p000.bv1.f1853
            android.os.Looper r9 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r9 = p000.ln0.m3626(r9, r0)
            if (r9 == 0) goto L10c
            android.app.AlertDialog r9 = p000.bv1.f1854
            if (r9 == 0) goto L118
            r9.dismiss()
            goto L118
        L10c:
            android.os.Handler r9 = p000.bv1.f1855
            fb0 r0 = new fb0
            r1 = 19
            r0.<init>(r1)
            r9.post(r0)
        L118:
            android.view.Window r9 = r8.getWindow()
            if (r9 == 0) goto L12f
            android.view.View r9 = r9.getDecorView()
            if (r9 == 0) goto L12f
            n9 r0 = new n9
            r1 = 16
            r0.<init>(r8, r1)
            r9.post(r0)
            goto L13a
        L12f:
            x10 r9 = p000.x10.f11972
            n9 r9 = new n9
            r0 = 5
            r9.<init>(r8, r0)
            r8.runOnUiThread(r9)
        L13a:
            return
        L13b:
            android.widget.TextView r8 = (android.widget.TextView) r8
            p70 r5 = (p000.p70) r5
            r8.performHapticFeedback(r2)
            r5.invoke()
            return
        L146:
            android.app.Activity r8 = (android.app.Activity) r8
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            java.util.concurrent.atomic.AtomicInteger r9 = p000.C0187ct.f2739
            p000.C0187ct.m1615(r4)
            java.lang.String r9 = "骰子已恢复随机模式"
            android.widget.Toast r9 = android.widget.Toast.makeText(r8, r9, r4)
            r9.show()
        L158:
            if (r5 == 0) goto L17d
            java.lang.Object r9 = r5.getTag()
            boolean r9 = r9 instanceof android.app.AlertDialog
            if (r9 == 0) goto L16f
            java.lang.Object r9 = r5.getTag()
            r9.getClass()
            android.app.AlertDialog r9 = (android.app.AlertDialog) r9
            r9.dismiss()
            goto L17d
        L16f:
            android.view.ViewParent r9 = r5.getParent()
            boolean r0 = r9 instanceof android.view.View
            if (r0 == 0) goto L17b
            android.view.View r9 = (android.view.View) r9
            r5 = r9
            goto L158
        L17b:
            r5 = r1
            goto L158
        L17d:
            r8.getClass()
            n9 r9 = new n9
            r0 = 4
            r9.<init>(r8, r0)
            r8.runOnUiThread(r9)
            return
        L18a:
            b8 r8 = (p000.C0068b8) r8
            mk r5 = (p000.C0552mk) r5
            java.lang.Object r8 = r8.f1557
            ng r8 = (p000.C0585ng) r8
            r8.invoke(r5)
            return
        L196:
            android.app.Activity r8 = (android.app.Activity) r8
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord r5 = (com.example.dyhelper.hook.comment.bookmark.CommentBookmarkRecord) r5
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkListDialog.m1418(r8, r5, r9)
            return
        L19e:
            android.content.Context r8 = (android.content.Context) r8
            cj r5 = (p000.C0115cj) r5
            fj r9 = p000.C0287fj.f3949
            java.util.concurrent.ConcurrentHashMap r9 = p000.C0287fj.f3958
            java.lang.String r0 = r5.f2154
            java.lang.Object r9 = r9.get(r0)
            cj r9 = (p000.C0115cj) r9
            if (r9 != 0) goto L1b1
            goto L1b2
        L1b1:
            r5 = r9
        L1b2:
            p000.C0287fj.m2117(r8, r5)
            return
        L1b6:
            android.app.Activity r8 = (android.app.Activity) r8
            p9 r5 = (p000.C0679p9) r5
            java.lang.String r9 = "clipboard"
            java.lang.Object r9 = r8.getSystemService(r9)
            boolean r0 = r9 instanceof android.content.ClipboardManager
            if (r0 == 0) goto L1c7
            r1 = r9
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1
        L1c7:
            if (r1 != 0) goto L1d3
            java.lang.String r9 = "复制失败：剪贴板不可用"
            android.widget.Toast r8 = android.widget.Toast.makeText(r8, r9, r4)
            r8.show()
            goto L211
        L1d3:
            java.lang.String r9 = "DYHelper公告"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L200
            java.lang.String r2 = "DYHelper 公告\n日期："
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L200
            java.lang.String r2 = r5.f8457     // Catch: java.lang.Throwable -> L200
            r0.append(r2)     // Catch: java.lang.Throwable -> L200
            java.lang.String r2 = "\n\n"
            r0.append(r2)     // Catch: java.lang.Throwable -> L200
            java.lang.String r2 = r5.f8458     // Catch: java.lang.Throwable -> L200
            r0.append(r2)     // Catch: java.lang.Throwable -> L200
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L200
            android.content.ClipData r9 = android.content.ClipData.newPlainText(r9, r0)     // Catch: java.lang.Throwable -> L200
            r1.setPrimaryClip(r9)     // Catch: java.lang.Throwable -> L200
            java.lang.String r9 = "公告已复制"
            android.widget.Toast r9 = android.widget.Toast.makeText(r8, r9, r4)     // Catch: java.lang.Throwable -> L200
            r9.show()     // Catch: java.lang.Throwable -> L200
            goto L211
        L200:
            r9 = move-exception
            java.lang.String r0 = "r24de9f070d18b34b"
            java.lang.String r1 = "复制公告到剪贴板失败"
            p000.C0888ux.m5977(r0, r1, r9)
            java.lang.String r9 = "复制失败，请稍后重试"
            android.widget.Toast r8 = android.widget.Toast.makeText(r8, r9, r4)
            r8.show()
        L211:
            return
    }
}
