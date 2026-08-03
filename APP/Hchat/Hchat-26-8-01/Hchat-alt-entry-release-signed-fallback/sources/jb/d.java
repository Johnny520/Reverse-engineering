package jb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jb.e f6857b;

    public /* synthetic */ d(jb.e r1, int r2) {
            r0 = this;
            r0.f6856a = r2
            r0.f6857b = r1
            r0.<init>()
            return
    }

    public final void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r13) {
            r12 = this;
            int r0 = r12.f6856a
            r1 = 1212368386(0x48434602, float:199960.03)
            r2 = 1212368385(0x48434601, float:199960.02)
            r3 = 0
            r4 = 0
            jb.e r5 = r12.f6857b
            r13.getClass()
            switch(r0) {
                case 0: goto L59;
                default: goto L12;
            }
        L12:
            java.lang.Object[] r13 = r13.args
            r5.getClass()
            if (r13 == 0) goto L2e
            int r0 = r13.length
        L1a:
            if (r3 >= r0) goto L26
            r6 = r13[r3]
            boolean r7 = r6 instanceof android.view.ContextMenu
            if (r7 == 0) goto L23
            goto L27
        L23:
            int r3 = r3 + 1
            goto L1a
        L26:
            r6 = r4
        L27:
            boolean r13 = r6 instanceof android.view.ContextMenu
            if (r13 == 0) goto L2e
            r4 = r6
            android.view.ContextMenu r4 = (android.view.ContextMenu) r4
        L2e:
            if (r4 == 0) goto L58
            java.lang.String r13 = "复制链接"
            r0 = 2131034118(0x7f050006, float:1.7678745E38)
            r5.a(r4, r2, r13, r0)     // Catch: java.lang.Throwable -> L43
            java.lang.String r13 = "下载视频"
            r0 = 2131034119(0x7f050007, float:1.7678747E38)
            r5.a(r4, r1, r13, r0)     // Catch: java.lang.Throwable -> L43
            sf.n r13 = sf.n.f12433a     // Catch: java.lang.Throwable -> L43
            goto L4b
        L43:
            r0 = move-exception
            r13 = r0
            sf.f r0 = new sf.f
            r0.<init>(r13)
            r13 = r0
        L4b:
            java.lang.Throwable r13 = sf.g.b(r13)
            if (r13 == 0) goto L58
            ia.t r0 = r5.f6859b
            java.lang.String r1 = "视频号菜单注入失败"
            r0.invoke(r1, r13)
        L58:
            return
        L59:
            r5.getClass()
            java.lang.Object[] r0 = r13.args
            if (r0 == 0) goto L6e
            int r6 = r0.length
            r7 = r3
        L62:
            if (r7 >= r6) goto L6e
            r8 = r0[r7]
            boolean r9 = r8 instanceof android.view.MenuItem
            if (r9 == 0) goto L6b
            goto L6f
        L6b:
            int r7 = r7 + 1
            goto L62
        L6e:
            r8 = r4
        L6f:
            boolean r0 = r8 instanceof android.view.MenuItem
            if (r0 == 0) goto L76
            android.view.MenuItem r8 = (android.view.MenuItem) r8
            goto L77
        L76:
            r8 = r4
        L77:
            if (r8 == 0) goto L223
            int r0 = r8.getItemId()
            if (r0 == r2) goto L87
            int r0 = r8.getItemId()
            if (r0 == r1) goto L87
            goto L223
        L87:
            java.lang.Object[] r0 = r13.args
            if (r0 == 0) goto L9c
            java.lang.Object r0 = tf.l.C0(r3, r0)
            if (r0 == 0) goto L9c
            boolean r1 = jb.e.e(r0)
            if (r1 == 0) goto L98
            goto L99
        L98:
            r0 = r4
        L99:
            if (r0 == 0) goto L9c
            goto Lb7
        L9c:
            java.lang.Object[] r0 = r13.args
            if (r0 == 0) goto Lb1
            int r1 = r0.length
            r6 = r3
        La2:
            if (r6 >= r1) goto Lb1
            r7 = r0[r6]
            java.lang.Object r7 = jb.e.b(r7)
            if (r7 == 0) goto Lae
            r0 = r7
            goto Lb7
        Lae:
            int r6 = r6 + 1
            goto La2
        Lb1:
            java.lang.Object r0 = r13.thisObject
            java.lang.Object r0 = jb.e.b(r0)
        Lb7:
            if (r0 == 0) goto L21b
            java.lang.String r1 = "feedObject"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r0, r1)
            if (r0 == 0) goto L118
            java.lang.String r1 = "getMediaType"
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invokeMethod(r0, r1, r6)
            boolean r6 = r1 instanceof java.lang.Number
            if (r6 == 0) goto Ld0
            java.lang.Number r1 = (java.lang.Number) r1
            goto Ld1
        Ld0:
            r1 = r4
        Ld1:
            if (r1 == 0) goto L118
            int r1 = r1.intValue()
            java.lang.String r6 = "getMediaList"
            java.lang.Object[] r7 = new java.lang.Object[r3]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeMethod(r0, r6, r7)
            boolean r6 = r0 instanceof java.util.LinkedList
            if (r6 == 0) goto Le6
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            goto Le7
        Le6:
            r0 = r4
        Le7:
            if (r0 == 0) goto L118
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lf2:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L112
            java.lang.Object r7 = r0.next()
            java.lang.String r9 = "toJSON"
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invokeMethod(r7, r9, r10)
            boolean r9 = r7 instanceof org.json.JSONObject
            if (r9 == 0) goto L10b
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            goto L10c
        L10b:
            r7 = r4
        L10c:
            if (r7 == 0) goto Lf2
            r6.add(r7)
            goto Lf2
        L112:
            jb.c r0 = new jb.c
            r0.<init>(r1, r6)
            goto L119
        L118:
            r0 = r4
        L119:
            if (r0 != 0) goto L125
            java.lang.String r0 = "未解析到视频号媒体"
            r5.k(r0)
            r13.setResult(r4)
            goto L223
        L125:
            java.util.ArrayList r1 = r0.f6855b
            int r3 = r8.getItemId()
            int r0 = r0.f6854a
            r6 = 4
            r7 = 2
            if (r3 != r2) goto L1dc
            if (r0 == r7) goto L183
            java.lang.String r2 = ""
            if (r0 == r6) goto L139
            goto L1ad
        L139:
            java.lang.Object r0 = tf.m.v1(r1)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r1 = jb.e.i(r0)
            boolean r3 = og.m.t0(r1)
            if (r3 != 0) goto L151
            java.lang.String r0 = "链接: "
            java.lang.String r0 = r0.concat(r1)
        L14f:
            r2 = r0
            goto L1ad
        L151:
            java.lang.String r1 = jb.e.d(r0)
            java.lang.String r3 = "密链: "
            java.lang.String r1 = wb.en.g(r3, r1)
            if (r0 == 0) goto L164
            java.lang.String r3 = "decodeKey"
            java.lang.String r0 = r0.optString(r3)
            goto L165
        L164:
            r0 = r4
        L165:
            if (r0 != 0) goto L168
            goto L169
        L168:
            r2 = r0
        L169:
            java.lang.String r0 = "密钥: "
            java.lang.String r0 = r0.concat(r2)
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r6 = a.a.y0(r0)
            r10 = 0
            r11 = 62
            java.lang.String r7 = "\n"
            r8 = 0
            r9 = 0
            java.lang.String r0 = tf.m.A1(r6, r7, r8, r9, r10, r11)
            goto L14f
        L183:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r1.iterator()
        L18c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a2
            java.lang.Object r1 = r0.next()
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            java.lang.String r1 = jb.e.d(r1)
            if (r1 == 0) goto L18c
            r6.add(r1)
            goto L18c
        L1a2:
            r10 = 0
            r11 = 62
            java.lang.String r7 = "\n"
            r8 = 0
            r9 = 0
            java.lang.String r2 = tf.m.A1(r6, r7, r8, r9, r10, r11)
        L1ad:
            boolean r0 = og.m.t0(r2)
            if (r0 == 0) goto L1b9
            java.lang.String r0 = "未知的媒体类型，无法复制"
            r5.k(r0)
            goto L217
        L1b9:
            r8.g r0 = r5.f6858a
            android.content.Context r0 = r0.f11620a
            java.lang.String r1 = "clipboard"
            java.lang.Object r0 = r0.getSystemService(r1)
            boolean r1 = r0 instanceof android.content.ClipboardManager
            if (r1 == 0) goto L1ca
            android.content.ClipboardManager r0 = (android.content.ClipboardManager) r0
            goto L1cb
        L1ca:
            r0 = r4
        L1cb:
            if (r0 == 0) goto L1d6
            java.lang.String r1 = "Hchat Finder Media"
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r1, r2)
            r0.setPrimaryClip(r1)
        L1d6:
            java.lang.String r0 = "已复制"
            r5.k(r0)
            goto L217
        L1dc:
            if (r0 == r7) goto L206
            if (r0 == r6) goto L1e6
            java.lang.String r0 = "未知的媒体类型，无法下载"
            r5.k(r0)
            goto L217
        L1e6:
            java.lang.Object r0 = tf.m.v1(r1)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            if (r0 != 0) goto L1f4
            java.lang.String r0 = "未找到视频"
            r5.k(r0)
            goto L217
        L1f4:
            java.lang.Thread r1 = new java.lang.Thread
            a1.d r2 = new a1.d
            r3 = 19
            r2.<init>(r5, r3, r0)
            java.lang.String r0 = "Hchat-FinderVideoDownload"
            r1.<init>(r2, r0)
            r1.start()
            goto L217
        L206:
            java.lang.Thread r0 = new java.lang.Thread
            a1.d r2 = new a1.d
            r3 = 20
            r2.<init>(r1, r3, r5)
            java.lang.String r1 = "Hchat-FinderImageDownload"
            r0.<init>(r2, r1)
            r0.start()
        L217:
            r13.setResult(r4)
            goto L223
        L21b:
            java.lang.String r0 = "未找到视频号媒体"
            r5.k(r0)
            r13.setResult(r4)
        L223:
            return
    }
}
