package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dd implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f15685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f15686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f15687i;

    public /* synthetic */ dd(android.content.Context r2, i0.a1 r3) {
            r1 = this;
            r0 = 8
            r1.f15685g = r0
            r1.<init>()
            r1.f15687i = r3
            r1.f15686h = r2
            return
    }

    public /* synthetic */ dd(android.content.Context r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f15685g = r3
            r0.f15686h = r1
            r0.f15687i = r2
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r13 = this;
            int r0 = r13.f15685g
            switch(r0) {
                case 0: goto L3d6;
                case 1: goto L3c5;
                case 2: goto L3aa;
                case 3: goto L38b;
                case 4: goto L376;
                case 5: goto L348;
                case 6: goto L320;
                case 7: goto L30b;
                case 8: goto La3;
                default: goto L5;
            }
        L5:
            android.content.Context r0 = r13.f15686h
            i0.a1 r1 = r13.f15687i
            rb.k r2 = fb.v0.f3834a
            r3 = 0
            if (r2 == 0) goto L96
            java.lang.Object r4 = r2.f11907d
            monitor-enter(r4)
            r2.f11916m = r3     // Catch: java.lang.Throwable -> L28
            r2.f11922s = r3     // Catch: java.lang.Throwable -> L28
            long r5 = r2.f11921r     // Catch: java.lang.Throwable -> L28
            r7 = 1
            long r5 = r5 + r7
            r2.f11921r = r5     // Catch: java.lang.Throwable -> L28
            rb.h r5 = r2.f11920q     // Catch: java.lang.Throwable -> L28
            if (r5 == 0) goto L2a
            java.util.concurrent.ScheduledFuture r5 = r5.f11899c     // Catch: java.lang.Throwable -> L28
            if (r5 == 0) goto L2a
            r5.cancel(r3)     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r0 = move-exception
            goto L94
        L2a:
            r5 = 0
            r2.f11920q = r5     // Catch: java.lang.Throwable -> L28
            java.util.ArrayDeque r6 = r2.f11910g     // Catch: java.lang.Throwable -> L28
            r6.clear()     // Catch: java.lang.Throwable -> L28
            java.util.ArrayList r6 = r2.f11911h     // Catch: java.lang.Throwable -> L28
            r6.clear()     // Catch: java.lang.Throwable -> L28
            java.util.ArrayDeque r6 = r2.f11912i     // Catch: java.lang.Throwable -> L28
            r6.clear()     // Catch: java.lang.Throwable -> L28
            java.util.concurrent.ConcurrentHashMap r6 = r2.f11913j     // Catch: java.lang.Throwable -> L28
            r6.clear()     // Catch: java.lang.Throwable -> L28
            r2.f11919p = r3     // Catch: java.lang.Throwable -> L28
            r2.f11923t = r3     // Catch: java.lang.Throwable -> L28
            r2.f11924u = r3     // Catch: java.lang.Throwable -> L28
            r2.f11925v = r3     // Catch: java.lang.Throwable -> L28
            r2.f11926w = r3     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = ""
            r2.f11918o = r3     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "等待检测"
            r2.f11917n = r3     // Catch: java.lang.Throwable -> L28
            rb.l r3 = r2.f11906c     // Catch: java.lang.Throwable -> L28
            android.content.SharedPreferences r3 = r3.f11928a     // Catch: java.lang.Throwable -> L28
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = "zombie_check_pending_ids"
            android.content.SharedPreferences$Editor r3 = r3.remove(r6)     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = "zombie_check_total_count"
            android.content.SharedPreferences$Editor r3 = r3.remove(r6)     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = "zombie_check_results"
            android.content.SharedPreferences$Editor r3 = r3.remove(r6)     // Catch: java.lang.Throwable -> L28
            r3.apply()     // Catch: java.lang.Throwable -> L28
            monitor-exit(r4)
            r2.j()
            android.content.Context r2 = r2.f11905b     // Catch: java.lang.Throwable -> L8b
            java.lang.String r3 = "notification"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch: java.lang.Throwable -> L8b
            boolean r3 = r2 instanceof android.app.NotificationManager     // Catch: java.lang.Throwable -> L8b
            if (r3 == 0) goto L83
            r5 = r2
            android.app.NotificationManager r5 = (android.app.NotificationManager) r5     // Catch: java.lang.Throwable -> L8b
        L83:
            if (r5 == 0) goto L8b
            r2 = 1212373571(0x48435a43, float:200041.05)
            r5.cancel(r2)     // Catch: java.lang.Throwable -> L8b
        L8b:
            rb.a r2 = new rb.a
            r3 = 1
            java.lang.String r4 = "检测进度已重置"
            r2.<init>(r3, r4)
            goto L9d
        L94:
            monitor-exit(r4)
            throw r0
        L96:
            rb.a r2 = new rb.a
            java.lang.String r4 = "检测运行时尚未就绪"
            r2.<init>(r3, r4)
        L9d:
            wb.ho.t4(r0, r1, r2)
        La0:
            sf.n r0 = sf.n.f12433a
            return r0
        La3:
            i0.a1 r0 = r13.f15687i
            android.content.Context r1 = r13.f15686h
            java.lang.Object r2 = r0.getValue()
            rb.m r2 = (rb.m) r2
            boolean r2 = r2.f11930b
            if (r2 != 0) goto L302
            java.lang.Object r2 = r0.getValue()
            rb.m r2 = (rb.m) r2
            boolean r2 = r2.f11937i
            if (r2 == 0) goto Lbd
            goto L302
        Lbd:
            rb.k r2 = fb.v0.f3834a
            r3 = 0
            if (r2 == 0) goto L2fa
            rb.l r4 = r2.f11906c
            android.content.SharedPreferences r4 = r4.f11928a
            java.lang.String r5 = "zombie_check_enable"
            boolean r4 = r4.getBoolean(r5, r3)
            if (r4 != 0) goto Ld7
            rb.a r2 = new rb.a
            java.lang.String r4 = "请先启用僵尸粉检测"
            r2.<init>(r3, r4)
            goto L306
        Ld7:
            boolean r4 = r2.f11915l
            if (r4 == 0) goto L2f2
            rb.c r4 = r2.f11914k
            if (r4 != 0) goto Le1
            goto L2f2
        Le1:
            java.lang.Object r4 = r2.f11907d
            monitor-enter(r4)
            boolean r5 = r2.f11916m     // Catch: java.lang.Throwable -> Lf2
            if (r5 == 0) goto Lf5
            rb.a r2 = new rb.a     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r5 = "检测正在运行"
            r2.<init>(r3, r5)     // Catch: java.lang.Throwable -> Lf2
        Lef:
            monitor-exit(r4)
            goto L306
        Lf2:
            r0 = move-exception
            goto L2f0
        Lf5:
            boolean r5 = r2.f11922s     // Catch: java.lang.Throwable -> Lf2
            if (r5 == 0) goto L101
            rb.a r2 = new rb.a     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r5 = "正在批量删除好友"
            r2.<init>(r3, r5)     // Catch: java.lang.Throwable -> Lf2
            goto Lef
        L101:
            monitor-exit(r4)
            r4 = 0
            g8.i r5 = h.Hchat.hooks.api.core.WeChatApis.contacts()     // Catch: java.lang.Throwable -> L116
            if (r5 == 0) goto L110
            java.lang.String r6 = "SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE (r.encryptUsername!='' OR r.username=(SELECT value FROM userinfo WHERE id=2)) AND r.verifyFlag=0 AND (r.type & 1)!=0 AND (r.type & 8)=0 AND (r.type & 32)=0 AND r.username NOT LIKE '%chatroom'"
            java.util.ArrayList r5 = r5.U(r6, r4)     // Catch: java.lang.Throwable -> L116
            goto L111
        L110:
            r5 = r4
        L111:
            if (r5 != 0) goto L11d
            tf.t r5 = tf.t.f13167g     // Catch: java.lang.Throwable -> L116
            goto L11d
        L116:
            r5 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r5)
            r5 = r6
        L11d:
            java.lang.Throwable r6 = sf.g.b(r5)
            if (r6 != 0) goto L2e1
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = tf.n.e1(r5)
            r6.<init>(r7)
            java.util.Iterator r7 = r5.iterator()
        L132:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L144
            java.lang.Object r8 = r7.next()
            h.Hchat.hooks.api.model.WeChatContact r8 = (h.Hchat.hooks.api.model.WeChatContact) r8
            java.lang.String r8 = r8.wxId
            r6.add(r8)
            goto L132
        L144:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L14d:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L164
            java.lang.Object r8 = r6.next()
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = rb.k.g(r9)
            if (r9 == 0) goto L14d
            r7.add(r8)
            goto L14d
        L164:
            java.util.Set r6 = tf.m.U1(r7)
            rb.l r7 = r2.f11906c
            java.lang.String r8 = "zombie_check_excluded_ids"
            java.util.Set r7 = r7.c(r8)
            java.util.Iterator r5 = r5.iterator()
        L174:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L18c
            java.lang.Object r8 = r5.next()
            h.Hchat.hooks.api.model.WeChatContact r8 = (h.Hchat.hooks.api.model.WeChatContact) r8
            java.util.concurrent.ConcurrentHashMap r9 = r2.f11913j
            java.lang.String r10 = r8.wxId
            java.lang.String r8 = r8.displayName()
            r9.put(r10, r8)
            goto L174
        L18c:
            java.lang.Object r5 = r2.f11907d
            monitor-enter(r5)
            java.util.ArrayDeque r8 = r2.f11910g     // Catch: java.lang.Throwable -> L1c4
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> L1c4
            if (r8 == 0) goto L1f2
            rb.l r8 = r2.f11906c     // Catch: java.lang.Throwable -> L1c4
            java.lang.String r9 = "zombie_check_target_ids"
            java.util.Set r8 = r8.c(r9)     // Catch: java.lang.Throwable -> L1c4
            boolean r9 = r8.isEmpty()     // Catch: java.lang.Throwable -> L1c4
            if (r9 == 0) goto L1a6
            goto L1ae
        L1a6:
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> L1c4
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> L1c4
            java.util.LinkedHashSet r6 = tf.m.x1(r8, r6)     // Catch: java.lang.Throwable -> L1c4
        L1ae:
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Throwable -> L1c4
            java.util.Set r6 = tf.d0.T(r6, r7)     // Catch: java.lang.Throwable -> L1c4
            boolean r7 = r6.isEmpty()     // Catch: java.lang.Throwable -> L1c4
            if (r7 == 0) goto L1c7
            rb.a r2 = new rb.a     // Catch: java.lang.Throwable -> L1c4
            java.lang.String r4 = "没有可检测的好友"
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L1c4
        L1c1:
            monitor-exit(r5)
            goto L306
        L1c4:
            r0 = move-exception
            goto L2df
        L1c7:
            java.util.ArrayList r7 = r2.f11911h     // Catch: java.lang.Throwable -> L1c4
            r7.clear()     // Catch: java.lang.Throwable -> L1c4
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> L1c4
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L1c4
        L1d2:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L1c4
            if (r7 == 0) goto L1e9
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L1c4
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L1c4
            java.util.ArrayDeque r8 = r2.f11910g     // Catch: java.lang.Throwable -> L1c4
            rb.j r9 = new rb.j     // Catch: java.lang.Throwable -> L1c4
            r9.<init>(r7, r3)     // Catch: java.lang.Throwable -> L1c4
            r8.addLast(r9)     // Catch: java.lang.Throwable -> L1c4
            goto L1d2
        L1e9:
            java.util.ArrayDeque r6 = r2.f11910g     // Catch: java.lang.Throwable -> L1c4
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L1c4
            r2.f11919p = r6     // Catch: java.lang.Throwable -> L1c4
            goto L259
        L1f2:
            java.util.ArrayDeque r8 = r2.f11910g     // Catch: java.lang.Throwable -> L1c4
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1c4
            r9.<init>()     // Catch: java.lang.Throwable -> L1c4
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L1c4
        L1fd:
            boolean r10 = r8.hasNext()     // Catch: java.lang.Throwable -> L1c4
            if (r10 == 0) goto L21e
            java.lang.Object r10 = r8.next()     // Catch: java.lang.Throwable -> L1c4
            r11 = r10
            rb.j r11 = (rb.j) r11     // Catch: java.lang.Throwable -> L1c4
            java.lang.String r12 = r11.f11902a     // Catch: java.lang.Throwable -> L1c4
            boolean r12 = r6.contains(r12)     // Catch: java.lang.Throwable -> L1c4
            if (r12 == 0) goto L1fd
            java.lang.String r11 = r11.f11902a     // Catch: java.lang.Throwable -> L1c4
            boolean r11 = r7.contains(r11)     // Catch: java.lang.Throwable -> L1c4
            if (r11 != 0) goto L1fd
            r9.add(r10)     // Catch: java.lang.Throwable -> L1c4
            goto L1fd
        L21e:
            java.util.ArrayDeque r6 = r2.f11910g     // Catch: java.lang.Throwable -> L1c4
            r6.clear()     // Catch: java.lang.Throwable -> L1c4
            java.util.ArrayDeque r6 = r2.f11910g     // Catch: java.lang.Throwable -> L1c4
            java.util.Iterator r7 = r9.iterator()     // Catch: java.lang.Throwable -> L1c4
        L229:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L1c4
            if (r8 == 0) goto L239
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L1c4
            rb.j r8 = (rb.j) r8     // Catch: java.lang.Throwable -> L1c4
            r6.addLast(r8)     // Catch: java.lang.Throwable -> L1c4
            goto L229
        L239:
            java.util.ArrayDeque r6 = r2.f11910g     // Catch: java.lang.Throwable -> L1c4
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L1c4
            java.util.ArrayList r7 = r2.f11911h     // Catch: java.lang.Throwable -> L1c4
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L1c4
            int r6 = r6 + r7
            r2.f11919p = r6     // Catch: java.lang.Throwable -> L1c4
            java.util.ArrayDeque r6 = r2.f11910g     // Catch: java.lang.Throwable -> L1c4
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L1c4
            if (r6 == 0) goto L259
            rb.a r2 = new rb.a     // Catch: java.lang.Throwable -> L1c4
            java.lang.String r4 = "没有可继续的好友"
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L1c4
            goto L1c1
        L259:
            r6 = 1
            r2.f11916m = r6     // Catch: java.lang.Throwable -> L1c4
            java.lang.String r7 = "检测运行中"
            r2.f11917n = r7     // Catch: java.lang.Throwable -> L1c4
            java.lang.String r7 = ""
            r2.f11918o = r7     // Catch: java.lang.Throwable -> L1c4
            java.util.ArrayDeque r7 = r2.f11910g     // Catch: java.lang.Throwable -> L1c4
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L1c4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c4
            r8.<init>()     // Catch: java.lang.Throwable -> L1c4
            java.lang.String r9 = "开始检测，待检测 "
            r8.append(r9)     // Catch: java.lang.Throwable -> L1c4
            r8.append(r7)     // Catch: java.lang.Throwable -> L1c4
            java.lang.String r7 = " 位好友"
            r8.append(r7)     // Catch: java.lang.Throwable -> L1c4
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L1c4
            r2.b(r7)     // Catch: java.lang.Throwable -> L1c4
            r2.h()     // Catch: java.lang.Throwable -> L1c4
            monitor-exit(r5)
            rb.l r5 = r2.f11906c
            android.content.SharedPreferences r5 = r5.f11928a
            java.lang.String r7 = "zombie_check_keep_awake"
            boolean r5 = r5.getBoolean(r7, r3)
            if (r5 != 0) goto L294
            goto L2cf
        L294:
            android.content.Context r5 = r2.f11905b     // Catch: java.lang.Throwable -> L2a4
            java.lang.String r7 = "power"
            java.lang.Object r5 = r5.getSystemService(r7)     // Catch: java.lang.Throwable -> L2a4
            boolean r7 = r5 instanceof android.os.PowerManager     // Catch: java.lang.Throwable -> L2a4
            if (r7 == 0) goto L2a6
            r4 = r5
            android.os.PowerManager r4 = (android.os.PowerManager) r4     // Catch: java.lang.Throwable -> L2a4
            goto L2a6
        L2a4:
            r3 = move-exception
            goto L2bc
        L2a6:
            if (r4 == 0) goto L2cf
            java.lang.String r5 = "Hchat:ZombieCheck"
            android.os.PowerManager$WakeLock r4 = r4.newWakeLock(r6, r5)     // Catch: java.lang.Throwable -> L2a4
            r4.setReferenceCounted(r3)     // Catch: java.lang.Throwable -> L2a4
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            r4.acquire(r7)     // Catch: java.lang.Throwable -> L2a4
            r2.f11927x = r4     // Catch: java.lang.Throwable -> L2a4
            sf.n r3 = sf.n.f12433a     // Catch: java.lang.Throwable -> L2a4
            goto L2c2
        L2bc:
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L2c2:
            java.lang.Throwable r3 = sf.g.b(r3)
            if (r3 == 0) goto L2cf
            ia.t r4 = r2.f11904a
            java.lang.String r5 = "申请僵尸粉检测 WakeLock 失败"
            r4.invoke(r5, r3)
        L2cf:
            r2.m()
            r3 = 0
            r2.k(r3)
            rb.a r2 = new rb.a
            java.lang.String r3 = "检测已开始"
            r2.<init>(r6, r3)
            goto L306
        L2df:
            monitor-exit(r5)
            throw r0
        L2e1:
            ia.t r2 = r2.f11904a
            java.lang.String r4 = "读取好友列表失败"
            r2.invoke(r4, r6)
            rb.a r2 = new rb.a
            java.lang.String r4 = "读取好友列表失败"
            r2.<init>(r3, r4)
            goto L306
        L2f0:
            monitor-exit(r4)
            throw r0
        L2f2:
            rb.a r2 = new rb.a
            java.lang.String r4 = "检测接口尚未就绪"
            r2.<init>(r3, r4)
            goto L306
        L2fa:
            rb.a r2 = new rb.a
            java.lang.String r4 = "检测运行时尚未就绪"
            r2.<init>(r3, r4)
            goto L306
        L302:
            rb.a r2 = fb.v0.I()
        L306:
            wb.ho.t4(r1, r0, r2)
            goto La0
        L30b:
            android.content.Context r0 = r13.f15686h
            i0.a1 r1 = r13.f15687i
            java.lang.String r2 = ""
            r1.setValue(r2)
            java.lang.String r1 = "铃声已清空，保存后生效"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            goto La0
        L320:
            android.content.Context r0 = r13.f15686h
            i0.a1 r1 = r13.f15687i
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L32c
            r2 = r0
            android.app.Activity r2 = (android.app.Activity) r2
            goto L32d
        L32c:
            r2 = 0
        L32d:
            if (r2 != 0) goto L33a
            java.lang.String r1 = "当前页面无法打开文件选择器"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            goto L345
        L33a:
            wb.vq r3 = wb.vq.f19807a
            wb.q1 r4 = new wb.q1
            r5 = 4
            r4.<init>(r0, r1, r5)
            r3.c(r2, r4)
        L345:
            sf.n r0 = sf.n.f12433a
            return r0
        L348:
            android.content.Context r0 = r13.f15686h
            i0.a1 r1 = r13.f15687i
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L354
            r2 = r0
            android.app.Activity r2 = (android.app.Activity) r2
            goto L355
        L354:
            r2 = 0
        L355:
            if (r2 != 0) goto L362
            java.lang.String r1 = "当前页面无法打开铃声选择器"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            goto L373
        L362:
            wb.vq r3 = wb.vq.f19807a
            java.lang.Object r4 = r1.getValue()
            java.lang.String r4 = (java.lang.String) r4
            wb.q1 r5 = new wb.q1
            r6 = 3
            r5.<init>(r0, r1, r6)
            r3.d(r2, r4, r5)
        L373:
            sf.n r0 = sf.n.f12433a
            return r0
        L376:
            android.content.Context r0 = r13.f15686h
            i0.a1 r1 = r13.f15687i
            java.lang.String r2 = "提醒,搜一搜,收藏"
            r1.setValue(r2)
            java.lang.String r1 = "已恢复默认，保存后生效"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            goto La0
        L38b:
            android.content.Context r0 = r13.f15686h
            i0.a1 r1 = r13.f15687i
            r2 = 0
            w9.a.a(r0, r2)
            boolean r2 = w9.a.b(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.setValue(r2)
            java.lang.String r1 = "已应用"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            goto La0
        L3aa:
            android.content.Context r0 = r13.f15686h
            i0.a1 r1 = r13.f15687i
            boolean r2 = w9.a.b(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.setValue(r2)
            java.lang.String r1 = "状态已刷新"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            goto La0
        L3c5:
            android.content.Context r0 = r13.f15686h
            i0.a1 r1 = r13.f15687i
            java.lang.String r2 = "Hchat 经度"
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            wb.ho.d5(r0, r2, r1)
            goto La0
        L3d6:
            android.content.Context r0 = r13.f15686h
            i0.a1 r1 = r13.f15687i
            java.lang.String r2 = "Hchat 纬度"
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            wb.ho.d5(r0, r2, r1)
            goto La0
    }
}
