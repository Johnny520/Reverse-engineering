package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xi implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20167g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f20169i;

    public /* synthetic */ xi(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f20167g = r2
            r0.f20168h = r1
            r0.f20169i = r3
            r0.<init>()
            return
    }

    public /* synthetic */ xi(java.lang.Object r1, fg.l r2, int r3) {
            r0 = this;
            r0.f20167g = r3
            r0.f20169i = r1
            r0.f20168h = r2
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r12 = this;
            int r0 = r12.f20167g
            switch(r0) {
                case 0: goto L381;
                case 1: goto L374;
                case 2: goto L367;
                case 3: goto L351;
                case 4: goto L342;
                case 5: goto L32a;
                case 6: goto L316;
                case 7: goto L309;
                case 8: goto L2f9;
                case 9: goto L2ec;
                case 10: goto L2a2;
                case 11: goto L295;
                case 12: goto L286;
                case 13: goto L279;
                case 14: goto L26a;
                case 15: goto L25d;
                case 16: goto L24e;
                case 17: goto L214;
                case 18: goto L207;
                case 19: goto L1f8;
                case 20: goto L1b1;
                case 21: goto L1a4;
                case 22: goto L194;
                case 23: goto L187;
                case 24: goto Lda;
                case 25: goto L95;
                case 26: goto L6f;
                case 27: goto L58;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r12.f20168h
            y9.e r0 = (y9.e) r0
            java.lang.Object r1 = r12.f20169i
            y9.d r1 = (y9.d) r1
            ib.b r2 = r0.f22333b
            java.lang.String r3 = r1.f22330a
            java.lang.String r4 = r1.f22331b
            java.lang.String r3 = ib.b.a(r3, r4)
            int r4 = r3.length()
            if (r4 != 0) goto L1e
            goto L45
        L1e:
            android.content.SharedPreferences r2 = r2.f6650a
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r4 = "custom_title_"
            java.lang.String r4 = r4.concat(r3)
            android.content.SharedPreferences$Editor r2 = r2.remove(r4)
            java.lang.String r4 = "custom_color_"
            java.lang.String r4 = r4.concat(r3)
            android.content.SharedPreferences$Editor r2 = r2.remove(r4)
            java.lang.String r4 = "custom_text_color_"
            java.lang.String r3 = r4.concat(r3)
            android.content.SharedPreferences$Editor r2 = r2.remove(r3)
            r2.apply()
        L45:
            o8.j r2 = h.Hchat.hooks.api.core.WeChatApis.tasks()
            if (r2 == 0) goto L55
            rb.g r3 = new rb.g
            r4 = 22
            r3.<init>(r0, r4, r1)
            r2.e(r3)
        L55:
            sf.n r0 = sf.n.f12433a
            return r0
        L58:
            java.lang.Object r0 = r12.f20169i
            qg.t r0 = (qg.t) r0
            java.lang.Object r1 = r12.f20168h
            fg.l r1 = (fg.l) r1
            ci.c r2 = new ci.c
            r3 = 13
            r4 = 0
            r2.<init>(r1, r4, r3)
            r1 = 3
            qg.v.q(r0, r4, r2, r1)
        L6c:
            sf.n r0 = sf.n.f12433a
            return r0
        L6f:
            java.lang.Object r0 = r12.f20168h
            xa.i r0 = (xa.i) r0
            java.lang.Object r1 = r12.f20169i
            java.lang.String r1 = (java.lang.String) r1
            g8.i r2 = h.Hchat.hooks.api.core.WeChatApis.contacts()
            r3 = 0
            if (r2 == 0) goto L88
            java.lang.String r0 = r0.f21439b
            boolean r0 = r2.Q(r0, r1)
            r1 = 1
            if (r0 != r1) goto L88
            r3 = r1
        L88:
            xa.j r0 = new xa.j
            if (r3 == 0) goto L8f
            java.lang.String r1 = "好友备注已更新"
            goto L91
        L8f:
            java.lang.String r1 = "修改好友备注失败"
        L91:
            r0.<init>(r3, r1)
            return r0
        L95:
            java.lang.Object r0 = r12.f20168h
            xa.i r0 = (xa.i) r0
            java.lang.Object r1 = r12.f20169i
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            g8.i r2 = h.Hchat.hooks.api.core.WeChatApis.contacts()
            r3 = 0
            if (r2 == 0) goto Lcd
            java.lang.String r0 = r0.f21439b
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto Lba
            java.lang.String r4 = "rcontact"
            java.lang.String[] r5 = g8.i.f4369n
            java.lang.String r4 = r2.l(r4, r5)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto Lbc
        Lba:
            r0 = r3
            goto Lc9
        Lbc:
            java.lang.String r5 = ""
            java.lang.String r1 = r2.c(r5, r1)
            if (r1 != 0) goto Lc5
            goto Lba
        Lc5:
            boolean r0 = r2.b(r0, r4, r1)
        Lc9:
            r1 = 1
            if (r0 != r1) goto Lcd
            r3 = r1
        Lcd:
            xa.j r0 = new xa.j
            if (r3 == 0) goto Ld4
            java.lang.String r1 = "好友标签已更新"
            goto Ld6
        Ld4:
            java.lang.String r1 = "更新好友标签失败"
        Ld6:
            r0.<init>(r3, r1)
            return r0
        Lda:
            java.lang.Object r0 = r12.f20168h
            x0.d r0 = (x0.d) r0
            i0.h0 r0 = r0.f20826g
            l0.h r1 = r0.f5896c
            l0.g r2 = r1.d()
            r3 = 0
            r4 = r3
        Le8:
            int r5 = r1.f7681h     // Catch: java.lang.Throwable -> L115
            r6 = 0
            if (r4 >= r5) goto L154
            boolean r5 = r2.l(r4)     // Catch: java.lang.Throwable -> L115
            java.lang.Object r7 = r12.f20169i
            if (r5 == 0) goto L118
            java.lang.Object r5 = r2.n(r4)     // Catch: java.lang.Throwable -> L115
            if (r5 == r7) goto L10b
            boolean r8 = r5 instanceof i0.k0     // Catch: java.lang.Throwable -> L115
            if (r8 == 0) goto L102
            i0.k0 r5 = (i0.k0) r5     // Catch: java.lang.Throwable -> L115
            goto L103
        L102:
            r5 = r6
        L103:
            if (r5 == 0) goto L108
            i0.a2 r5 = r5.f5944a     // Catch: java.lang.Throwable -> L115
            goto L109
        L108:
            r5 = r6
        L109:
            if (r5 != r7) goto L118
        L10b:
            x0.i r3 = new x0.i     // Catch: java.lang.Throwable -> L115
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> L115
            r2.c()
            r6 = r3
            goto L15a
        L115:
            r0 = move-exception
            goto L183
        L118:
            int[] r5 = r2.f7667b     // Catch: java.lang.Throwable -> L115
            int r8 = l0.j.b(r5, r4)     // Catch: java.lang.Throwable -> L115
            int r9 = r4 + 1
            int r10 = r2.f7668c     // Catch: java.lang.Throwable -> L115
            if (r9 >= r10) goto L12b
            int r10 = r9 * 5
            int r10 = r10 + 4
            r5 = r5[r10]     // Catch: java.lang.Throwable -> L115
            goto L12d
        L12b:
            int r5 = r2.f7670e     // Catch: java.lang.Throwable -> L115
        L12d:
            int r5 = r5 - r8
            r8 = r3
        L12f:
            if (r8 >= r5) goto L158
            java.lang.Object r10 = r2.h(r4, r8)     // Catch: java.lang.Throwable -> L115
            if (r10 == r7) goto L14b
            boolean r11 = r10 instanceof i0.k0     // Catch: java.lang.Throwable -> L115
            if (r11 == 0) goto L13e
            i0.k0 r10 = (i0.k0) r10     // Catch: java.lang.Throwable -> L115
            goto L13f
        L13e:
            r10 = r6
        L13f:
            if (r10 == 0) goto L144
            i0.a2 r10 = r10.f5944a     // Catch: java.lang.Throwable -> L115
            goto L145
        L144:
            r10 = r6
        L145:
            if (r10 != r7) goto L148
            goto L14b
        L148:
            int r8 = r8 + 1
            goto L12f
        L14b:
            x0.i r6 = new x0.i     // Catch: java.lang.Throwable -> L115
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L115
            r6.<init>(r3, r4)     // Catch: java.lang.Throwable -> L115
        L154:
            r2.c()
            goto L15a
        L158:
            r4 = r9
            goto Le8
        L15a:
            if (r6 == 0) goto L179
            int r2 = r6.f20830a
            java.lang.Integer r3 = r6.f20831b
            l0.g r1 = r1.d()
            java.util.ArrayList r2 = g4.a.M(r1, r2, r3)     // Catch: java.lang.Throwable -> L174
            r1.c()
            java.util.List r1 = r0.I()
            java.util.ArrayList r1 = tf.m.F1(r2, r1)
            goto L17b
        L174:
            r0 = move-exception
            r1.c()
            throw r0
        L179:
            tf.t r1 = tf.t.f13167g
        L17b:
            x0.a r2 = new x0.a
            boolean r0 = r0.C
            r2.<init>(r1, r0)
            return r2
        L183:
            r2.c()
            throw r0
        L187:
            java.lang.Object r0 = r12.f20168h
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r12.f20169i
            wb.iv r1 = (wb.iv) r1
            r0.invoke(r1)
            goto L6c
        L194:
            java.lang.Object r0 = r12.f20168h
            fg.a r0 = (fg.a) r0
            java.lang.Object r1 = r12.f20169i
            c9.n0 r1 = (c9.n0) r1
            r0.invoke()
            r1.invoke()
            goto L6c
        L1a4:
            java.lang.Object r0 = r12.f20168h
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r12.f20169i
            java.util.Set r1 = (java.util.Set) r1
            r0.invoke(r1)
            goto L6c
        L1b1:
            java.lang.Object r0 = r12.f20168h
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "检测到微信异常"
            java.lang.Object r2 = r12.f20169i
            java.lang.String r2 = (java.lang.String) r2
            sf.n r3 = sf.n.f12433a
            java.lang.String r4 = "clipboard"
            java.lang.Object r4 = r1.getSystemService(r4)     // Catch: java.lang.Throwable -> L1cb
            boolean r5 = r4 instanceof android.content.ClipboardManager     // Catch: java.lang.Throwable -> L1cb
            if (r5 == 0) goto L1cd
            android.content.ClipboardManager r4 = (android.content.ClipboardManager) r4     // Catch: java.lang.Throwable -> L1cb
            goto L1ce
        L1cb:
            r0 = move-exception
            goto L1e1
        L1cd:
            r4 = 0
        L1ce:
            if (r4 == 0) goto L1d9
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r0, r2)     // Catch: java.lang.Throwable -> L1cb
            r4.setPrimaryClip(r0)     // Catch: java.lang.Throwable -> L1cb
            r2 = r3
            goto L1e6
        L1d9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1cb
            java.lang.String r2 = "剪贴板服务不可用"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1cb
            throw r0     // Catch: java.lang.Throwable -> L1cb
        L1e1:
            sf.f r2 = new sf.f
            r2.<init>(r0)
        L1e6:
            boolean r0 = r2 instanceof sf.f
            if (r0 != 0) goto L1ed
            java.lang.String r0 = "异常日志已复制"
            goto L1ef
        L1ed:
            java.lang.String r0 = "复制失败，请稍后重试"
        L1ef:
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
            return r3
        L1f8:
            java.lang.Object r0 = r12.f20168h
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r12.f20169i
            fb.q1 r1 = (fb.q1) r1
            java.lang.String r1 = r1.f3725e
            r0.invoke(r1)
            goto L6c
        L207:
            java.lang.Object r0 = r12.f20168h
            fb.q1 r0 = (fb.q1) r0
            java.lang.Object r1 = r12.f20169i
            i0.a1 r1 = (i0.a1) r1
            r1.setValue(r0)
            goto L6c
        L214:
            java.lang.Object r0 = r12.f20169i
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r12.f20168h
            fg.l r1 = (fg.l) r1
            int r2 = r0.size()
            int r2 = r2 + 1
            fb.r0 r3 = new fb.r0
            java.util.UUID r4 = java.util.UUID.randomUUID()
            java.lang.String r4 = r4.toString()
            r4.getClass()
            java.lang.String r5 = ""
            r6 = 0
            java.lang.String r7 = "-"
            java.lang.String r4 = og.t.a0(r4, r7, r5, r6)
            java.lang.String r5 = "MCP "
            java.lang.String r5 = eh.a.l(r2, r5)
            java.lang.String r6 = ""
            r8 = 1
            r7 = r6
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.ArrayList r0 = tf.m.G1(r0, r3)
            r1.invoke(r0)
            goto L6c
        L24e:
            java.lang.Object r0 = r12.f20168h
            fb.c r0 = (fb.c) r0
            java.lang.Object r1 = r12.f20169i
            i0.a1 r1 = (i0.a1) r1
            java.lang.String r0 = r0.f3433c
            r1.setValue(r0)
            goto L6c
        L25d:
            java.lang.Object r0 = r12.f20168h
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r12.f20169i
            fb.t0 r1 = (fb.t0) r1
            r0.invoke(r1)
            goto L6c
        L26a:
            java.lang.Object r0 = r12.f20168h
            fb.d1 r0 = (fb.d1) r0
            java.lang.Object r1 = r12.f20169i
            i0.a1 r1 = (i0.a1) r1
            java.lang.String r0 = r0.f3483a
            r1.setValue(r0)
            goto L6c
        L279:
            java.lang.Object r0 = r12.f20168h
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r12.f20169i
            fb.d1 r1 = (fb.d1) r1
            r0.invoke(r1)
            goto L6c
        L286:
            java.lang.Object r0 = r12.f20168h
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r12.f20169i
            fb.a r1 = (fb.a) r1
            java.lang.String r1 = r1.f3387b
            r0.invoke(r1)
            goto L6c
        L295:
            java.lang.Object r0 = r12.f20168h
            gb.o r0 = (gb.o) r0
            java.lang.Object r1 = r12.f20169i
            i0.a1 r1 = (i0.a1) r1
            r1.setValue(r0)
            goto L6c
        L2a2:
            java.lang.Object r0 = r12.f20168h
            eb.c0 r0 = (eb.c0) r0
            java.lang.Object r1 = r12.f20169i
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r2 = r1.getValue()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r0 = r0.f2506a
            r2.getClass()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r2)
            r3.remove(r0)
            int r0 = r3.size()
            if (r0 == 0) goto L2e5
            r2 = 1
            if (r0 == r2) goto L2c7
            goto L2e7
        L2c7:
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.util.Map r3 = java.util.Collections.singletonMap(r2, r0)
            r3.getClass()
            goto L2e7
        L2e5:
            tf.u r3 = tf.u.f13168g
        L2e7:
            r1.setValue(r3)
            goto L6c
        L2ec:
            java.lang.Object r0 = r12.f20168h
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r12.f20169i
            gb.c r1 = (gb.c) r1
            r0.invoke(r1)
            goto L6c
        L2f9:
            java.lang.Object r0 = r12.f20169i
            gb.o r0 = (gb.o) r0
            java.lang.Object r1 = r12.f20168h
            fg.l r1 = (fg.l) r1
            if (r0 == 0) goto L306
            r1.invoke(r0)
        L306:
            sf.n r0 = sf.n.f12433a
            return r0
        L309:
            java.lang.Object r0 = r12.f20168h
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r12.f20169i
            gb.h r1 = (gb.h) r1
            r0.invoke(r1)
            goto L6c
        L316:
            java.lang.Object r0 = r12.f20168h
            sf.e r0 = (sf.e) r0
            java.lang.Object r1 = r12.f20169i
            fg.p r1 = (fg.p) r1
            if (r0 == 0) goto L327
            java.lang.Object r2 = r0.f12418g
            java.lang.Object r0 = r0.f12419h
            r1.invoke(r2, r0)
        L327:
            sf.n r0 = sf.n.f12433a
            return r0
        L32a:
            java.lang.Object r0 = r12.f20168h
            wb.v3 r0 = (wb.v3) r0
            java.lang.Object r1 = r12.f20169i
            i0.a1 r1 = (i0.a1) r1
            wb.s3 r2 = new wb.s3
            wb.t3 r0 = (wb.t3) r0
            n9.a r3 = r0.f19162a
            boolean r0 = r0.f19163b
            r2.<init>(r3, r0)
            r1.setValue(r2)
            goto L6c
        L342:
            java.lang.Object r0 = r12.f20168h
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r12.f20169i
            wb.s4 r1 = (wb.s4) r1
            wb.t4 r1 = r1.f18986a
            r0.invoke(r1)
            goto L6c
        L351:
            java.lang.Object r0 = r12.f20168h
            wb.r2 r0 = (wb.r2) r0
            java.lang.Object r1 = r12.f20169i
            i0.a1 r1 = (i0.a1) r1
            wb.q2 r2 = new wb.q2
            wb.p2 r0 = (wb.p2) r0
            java.lang.String r0 = r0.f18397a
            r2.<init>(r0)
            r1.setValue(r2)
            goto L6c
        L367:
            java.lang.Object r0 = r12.f20168h
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r12.f20169i
            wb.k5 r1 = (wb.k5) r1
            r0.invoke(r1)
            goto L6c
        L374:
            java.lang.Object r0 = r12.f20168h
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r12.f20169i
            wb.a3 r1 = (wb.a3) r1
            r0.invoke(r1)
            goto L6c
        L381:
            java.lang.Object r0 = r12.f20168h
            fg.l r0 = (fg.l) r0
            java.lang.Object r1 = r12.f20169i
            wb.i2 r1 = (wb.i2) r1
            r0.invoke(r1)
            goto L6c
    }
}
