package b9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f526b;

    public /* synthetic */ b(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f525a = r2
            r0.f526b = r1
            r0.<init>()
            return
    }

    private final void a(android.content.SharedPreferences r7, java.lang.String r8) {
            r6 = this;
            java.lang.Object r7 = r6.f526b
            ha.b0 r7 = (ha.b0) r7
            if (r8 == 0) goto L7b
            int r0 = r8.hashCode()
            r1 = -1298848381(0xffffffffb2952583, float:-1.7362941E-8)
            if (r0 == r1) goto L10
            goto L7b
        L10:
            java.lang.String r0 = "enable"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L19
            goto L7b
        L19:
            android.content.SharedPreferences r8 = r7.f5158c
            java.lang.String r0 = "enable"
            r1 = 0
            boolean r8 = r8.getBoolean(r0, r1)
            if (r8 == 0) goto L53
            boolean r0 = r7.f5164i
            if (r0 != 0) goto L53
            java.util.LinkedHashSet r0 = r7.f5161f
            monitor-enter(r0)
            java.util.LinkedHashSet r1 = r7.f5161f     // Catch: java.lang.Throwable -> L50
            r1.clear()     // Catch: java.lang.Throwable -> L50
            monitor-exit(r0)
            android.content.SharedPreferences r0 = r7.f5158c
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "enabled_at_seconds"
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r2)
            java.lang.String r1 = "notified_ids"
            java.lang.String r2 = "[]"
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
            r0.apply()
            goto L79
        L50:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L53:
            if (r8 != 0) goto L79
            java.util.LinkedHashSet r0 = r7.f5161f
            monitor-enter(r0)
            java.util.LinkedHashSet r1 = r7.f5161f     // Catch: java.lang.Throwable -> L76
            r1.clear()     // Catch: java.lang.Throwable -> L76
            monitor-exit(r0)
            android.content.SharedPreferences r0 = r7.f5158c
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "enabled_at_seconds"
            r2 = 0
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r2)
            java.lang.String r1 = "notified_ids"
            android.content.SharedPreferences$Editor r0 = r0.remove(r1)
            r0.apply()
            goto L79
        L76:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L79:
            r7.f5164i = r8
        L7b:
            return
    }

    private final void b(android.content.SharedPreferences r6, java.lang.String r7) {
            r5 = this;
            java.lang.Object r6 = r5.f526b
            u9.h r6 = (u9.h) r6
            if (r7 == 0) goto L6d
            int r0 = r7.hashCode()
            r1 = 707705159(0x2a2eb947, float:1.5518585E-13)
            if (r0 == r1) goto L10
            goto L6d
        L10:
            java.lang.String r0 = "hide_wechat_bottom_bar_enable"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L19
            goto L6d
        L19:
            android.content.SharedPreferences r7 = r6.f13556e
            java.lang.String r0 = "hide_wechat_bottom_bar_enable"
            r1 = 0
            boolean r7 = r7.getBoolean(r0, r1)
            java.util.Map r0 = r6.f13558g
            r0.getClass()
            monitor-enter(r0)
            java.util.Map r1 = r6.f13558g     // Catch: java.lang.Throwable -> L6a
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L6a
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L6a
            java.util.List r1 = tf.m.P1(r1)     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r0)
            java.util.Iterator r0 = r1.iterator()
        L39:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            r1.getClass()
            u9.f r2 = new u9.f
            r2.<init>(r6, r1, r7)
            android.os.Looper r3 = android.os.Looper.myLooper()
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L5f
            r2.invoke()
            goto L39
        L5f:
            a1.a r3 = new a1.a
            r4 = 28
            r3.<init>(r2, r4)
            r1.post(r3)
            goto L39
        L6a:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L6d:
            return
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r8, java.lang.String r9) {
            r7 = this;
            int r0 = r7.f525a
            switch(r0) {
                case 0: goto L344;
                case 1: goto L317;
                case 2: goto L257;
                case 3: goto L1ca;
                case 4: goto L10a;
                case 5: goto Led;
                case 6: goto Lbb;
                case 7: goto Lb7;
                case 8: goto L3f;
                case 9: goto L27;
                case 10: goto L23;
                default: goto L5;
            }
        L5:
            java.lang.Object r8 = r7.f526b
            xa.m r8 = (xa.m) r8
            java.lang.String r0 = "quick_contact_edit_enable"
            boolean r9 = gg.l.a(r9, r0)
            if (r9 == 0) goto L22
            boolean r9 = r8.b()
            if (r9 != 0) goto L22
            android.os.Handler r9 = r8.f21448d
            wb.cr r0 = new wb.cr
            r1 = 5
            r0.<init>(r8, r1)
            r9.post(r0)
        L22:
            return
        L23:
            r7.b(r8, r9)
            return
        L27:
            java.lang.Object r8 = r7.f526b
            ob.n r8 = (ob.n) r8
            java.lang.String r0 = "text_voice_send_enable"
            boolean r9 = gg.l.a(r9, r0)
            if (r9 == 0) goto L3e
            boolean r9 = r8.i()
            if (r9 != 0) goto L3e
            java.util.concurrent.ConcurrentHashMap r8 = r8.f9744h
            r8.clear()
        L3e:
            return
        L3f:
            java.lang.String r8 = "text_speech_enable"
            java.lang.Object r0 = r7.f526b
            nb.w r0 = (nb.w) r0
            android.os.Handler r1 = r0.f9312b
            java.lang.String r2 = "text_speech_play_voice_messages"
            if (r9 == 0) goto Lb6
            int r3 = r9.hashCode()
            switch(r3) {
                case -1669064967: goto La5;
                case -1592445789: goto L92;
                case -1443382290: goto L77;
                case -256733799: goto L5c;
                case 654627227: goto L53;
                default: goto L52;
            }
        L52:
            goto Lb6
        L53:
            java.lang.String r8 = "text_speech_tts_voice"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto Lae
            goto Lb6
        L5c:
            boolean r8 = r9.equals(r2)
            if (r8 != 0) goto L63
            goto Lb6
        L63:
            nb.z r8 = r0.y()
            boolean r8 = r8.b(r2)
            if (r8 != 0) goto Lb6
            nb.e r8 = new nb.e
            r9 = 5
            r8.<init>(r0, r9)
            r1.post(r8)
            goto Lb6
        L77:
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L7e
            goto Lb6
        L7e:
            nb.z r9 = r0.y()
            boolean r8 = r9.b(r8)
            if (r8 != 0) goto Lb6
            nb.e r8 = new nb.e
            r9 = 4
            r8.<init>(r0, r9)
            r1.post(r8)
            goto Lb6
        L92:
            java.lang.String r8 = "text_speech_volume_control"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L9b
            goto Lb6
        L9b:
            nb.e r8 = new nb.e
            r9 = 6
            r8.<init>(r0, r9)
            r1.post(r8)
            goto Lb6
        La5:
            java.lang.String r8 = "text_speech_tts_engine"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto Lae
            goto Lb6
        Lae:
            nb.e r8 = r0.f9315e
            r1.removeCallbacks(r8)
            r1.post(r8)
        Lb6:
            return
        Lb7:
            r7.a(r8, r9)
            return
        Lbb:
            java.lang.Object r8 = r7.f526b
            ha.z r8 = (ha.z) r8
            android.os.Handler r0 = r8.f5298e
            if (r9 == 0) goto Lec
            int r1 = r9.hashCode()
            r2 = -340980866(0xffffffffebad0b7e, float:-4.1839687E26)
            if (r1 == r2) goto Ldb
            r2 = 94664279(0x5a47657, float:1.5465957E-35)
            if (r1 == r2) goto Ld2
            goto Lec
        Ld2:
            java.lang.String r1 = "moments_keyword_block_enable"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto Le4
            goto Lec
        Ldb:
            java.lang.String r1 = "moments_keyword_block_keywords"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto Le4
            goto Lec
        Le4:
            a1.a r8 = r8.f5305l
            r0.removeCallbacks(r8)
            r0.post(r8)
        Lec:
            return
        Led:
            java.lang.Object r8 = r7.f526b
            ha.m r8 = (ha.m) r8
            if (r9 == 0) goto L109
            int r0 = r9.hashCode()
            r1 = -1298848381(0xffffffffb2952583, float:-1.7362941E-8)
            if (r0 == r1) goto Lfd
            goto L109
        Lfd:
            java.lang.String r0 = "enable"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L106
            goto L109
        L106:
            r8.a()
        L109:
            return
        L10a:
            java.lang.Object r8 = r7.f526b
            ha.k r8 = (ha.k) r8
            if (r9 == 0) goto L1c9
            int r0 = r9.hashCode()
            r1 = -1298848381(0xffffffffb2952583, float:-1.7362941E-8)
            if (r0 == r1) goto L11b
            goto L1c9
        L11b:
            java.lang.String r0 = "enable"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L125
            goto L1c9
        L125:
            android.content.SharedPreferences r9 = r8.f5247b
            java.lang.String r0 = "enable"
            r1 = 0
            boolean r9 = r9.getBoolean(r0, r1)
            if (r9 == 0) goto L14c
            boolean r0 = r8.f5254i
            if (r0 != 0) goto L14c
            android.content.SharedPreferences r0 = r8.f5247b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "enabled_at_seconds"
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r2)
            r0.apply()
            goto L1c7
        L14c:
            if (r9 != 0) goto L1c7
            android.content.SharedPreferences r0 = r8.f5247b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "enabled_at_seconds"
            r3 = 0
            android.content.SharedPreferences$Editor r0 = r0.putLong(r2, r3)
            r0.apply()
            java.util.concurrent.ConcurrentHashMap r0 = r8.f5253h
            java.util.Set r0 = r0.keySet()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = tf.m.P1(r0)
            java.util.concurrent.ConcurrentHashMap r2 = r8.f5253h
            java.util.Collection r2 = r2.values()
            r2.getClass()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L17d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L18d
            java.lang.Object r3 = r2.next()
            java.util.concurrent.ScheduledFuture r3 = (java.util.concurrent.ScheduledFuture) r3
            r3.cancel(r1)
            goto L17d
        L18d:
            java.util.concurrent.ConcurrentHashMap r1 = r8.f5253h
            r1.clear()
            java.lang.Object r1 = r8.f5249d
            monitor-enter(r1)
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1c0
        L199:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L1c0
            if (r2 == 0) goto L1c3
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L1c0
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L1c0
            java.util.LinkedHashMap r3 = r8.f5251f     // Catch: java.lang.Throwable -> L1c0
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L1c0
            ha.j r3 = (ha.j) r3     // Catch: java.lang.Throwable -> L1c0
            if (r3 == 0) goto L199
            long r3 = r3.f5228a     // Catch: java.lang.Throwable -> L1c0
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L199
            java.util.LinkedHashMap r3 = r8.f5251f     // Catch: java.lang.Throwable -> L1c0
            r3.remove(r2)     // Catch: java.lang.Throwable -> L1c0
            goto L199
        L1c0:
            r0 = move-exception
            r8 = r0
            goto L1c5
        L1c3:
            monitor-exit(r1)
            goto L1c7
        L1c5:
            monitor-exit(r1)
            throw r8
        L1c7:
            r8.f5254i = r9
        L1c9:
            return
        L1ca:
            java.lang.Object r8 = r7.f526b
            ha.h r8 = (ha.h) r8
            if (r9 == 0) goto L256
            int r0 = r9.hashCode()
            r1 = -1298848381(0xffffffffb2952583, float:-1.7362941E-8)
            if (r0 == r1) goto L1db
            goto L256
        L1db:
            java.lang.String r0 = "enable"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L1e5
            goto L256
        L1e5:
            android.content.SharedPreferences r9 = r8.f5214b
            java.lang.String r0 = "enable"
            r1 = 0
            boolean r9 = r9.getBoolean(r0, r1)
            java.lang.Object r1 = r8.f5217e
            monitor-enter(r1)
            boolean r0 = r8.f5222j     // Catch: java.lang.Throwable -> L234
            if (r9 != r0) goto L1f7
        L1f5:
            monitor-exit(r1)
            goto L256
        L1f7:
            long r2 = r8.f5223k     // Catch: java.lang.Throwable -> L234
            r4 = 1
            long r2 = r2 + r4
            r8.f5223k = r2     // Catch: java.lang.Throwable -> L234
            r8.f5222j = r9     // Catch: java.lang.Throwable -> L234
            java.util.concurrent.ConcurrentHashMap r0 = r8.f5221i     // Catch: java.lang.Throwable -> L234
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L234
            r0.getClass()     // Catch: java.lang.Throwable -> L234
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L234
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L234
        L20f:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L234
            if (r2 == 0) goto L229
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L234
            ha.g r2 = (ha.g) r2     // Catch: java.lang.Throwable -> L234
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.f5203e     // Catch: java.lang.Throwable -> L234
            r4 = 1
            r3.set(r4)     // Catch: java.lang.Throwable -> L234
            java.util.concurrent.ScheduledFuture r2 = r2.f5205g     // Catch: java.lang.Throwable -> L234
            if (r2 == 0) goto L20f
            r2.cancel(r4)     // Catch: java.lang.Throwable -> L234
            goto L20f
        L229:
            java.util.concurrent.ConcurrentHashMap r0 = r8.f5221i     // Catch: java.lang.Throwable -> L234
            r0.clear()     // Catch: java.lang.Throwable -> L234
            if (r9 == 0) goto L237
            r8.a()     // Catch: java.lang.Throwable -> L234
            goto L1f5
        L234:
            r0 = move-exception
            r8 = r0
            goto L254
        L237:
            android.content.SharedPreferences r9 = r8.f5214b     // Catch: java.lang.Throwable -> L234
            android.content.SharedPreferences$Editor r9 = r9.edit()     // Catch: java.lang.Throwable -> L234
            java.lang.String r0 = "enabled_at_seconds"
            r2 = 0
            android.content.SharedPreferences$Editor r9 = r9.putLong(r0, r2)     // Catch: java.lang.Throwable -> L234
            boolean r9 = r9.commit()     // Catch: java.lang.Throwable -> L234
            if (r9 != 0) goto L1f5
            ab.b r8 = r8.f5213a     // Catch: java.lang.Throwable -> L234
            java.lang.String r9 = "保存朋友圈自动转发关闭状态失败"
            r0 = 0
            r8.invoke(r9, r0)     // Catch: java.lang.Throwable -> L234
            goto L1f5
        L254:
            monitor-exit(r1)
            throw r8
        L256:
            return
        L257:
            java.lang.Object r8 = r7.f526b
            ha.d r8 = (ha.d) r8
            if (r9 == 0) goto L316
            int r0 = r9.hashCode()
            r1 = -335078557(0xffffffffec071b63, float:-6.5333726E26)
            if (r0 == r1) goto L268
            goto L316
        L268:
            java.lang.String r0 = "comment_enable"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L272
            goto L316
        L272:
            android.content.SharedPreferences r9 = r8.f5177b
            java.lang.String r0 = "comment_enable"
            r1 = 0
            boolean r9 = r9.getBoolean(r0, r1)
            if (r9 == 0) goto L299
            boolean r0 = r8.f5184i
            if (r0 != 0) goto L299
            android.content.SharedPreferences r0 = r8.f5177b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "comment_enabled_at_seconds"
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r2)
            r0.apply()
            goto L314
        L299:
            if (r9 != 0) goto L314
            android.content.SharedPreferences r0 = r8.f5177b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "comment_enabled_at_seconds"
            r3 = 0
            android.content.SharedPreferences$Editor r0 = r0.putLong(r2, r3)
            r0.apply()
            java.util.concurrent.ConcurrentHashMap r0 = r8.f5183h
            java.util.Set r0 = r0.keySet()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = tf.m.P1(r0)
            java.util.concurrent.ConcurrentHashMap r2 = r8.f5183h
            java.util.Collection r2 = r2.values()
            r2.getClass()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L2ca:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2da
            java.lang.Object r3 = r2.next()
            java.util.concurrent.ScheduledFuture r3 = (java.util.concurrent.ScheduledFuture) r3
            r3.cancel(r1)
            goto L2ca
        L2da:
            java.util.concurrent.ConcurrentHashMap r1 = r8.f5183h
            r1.clear()
            java.lang.Object r1 = r8.f5179d
            monitor-enter(r1)
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L30d
        L2e6:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L30d
            if (r2 == 0) goto L310
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L30d
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L30d
            java.util.LinkedHashMap r3 = r8.f5181f     // Catch: java.lang.Throwable -> L30d
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L30d
            ha.b r3 = (ha.b) r3     // Catch: java.lang.Throwable -> L30d
            if (r3 == 0) goto L2e6
            long r3 = r3.f5155a     // Catch: java.lang.Throwable -> L30d
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L2e6
            java.util.LinkedHashMap r3 = r8.f5181f     // Catch: java.lang.Throwable -> L30d
            r3.remove(r2)     // Catch: java.lang.Throwable -> L30d
            goto L2e6
        L30d:
            r0 = move-exception
            r8 = r0
            goto L312
        L310:
            monitor-exit(r1)
            goto L314
        L312:
            monitor-exit(r1)
            throw r8
        L314:
            r8.f5184i = r9
        L316:
            return
        L317:
            java.lang.Object r8 = r7.f526b
            r8.g r8 = (r8.g) r8
            if (r9 == 0) goto L343
            int r0 = r9.hashCode()
            r1 = -1609594047(0xffffffffa00f8b41, float:-1.2158646E-19)
            if (r0 == r1) goto L335
            r1 = -1482073914(0xffffffffa7a958c6, float:-4.700317E-15)
            if (r0 == r1) goto L32c
            goto L343
        L32c:
            java.lang.String r0 = "groups_v1"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L33e
            goto L343
        L335:
            java.lang.String r0 = "enabled"
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L33e
            goto L343
        L33e:
            android.content.Context r8 = r8.f11620a
            c9.d2.y(r8)
        L343:
            return
        L344:
            java.lang.Object r8 = r7.f526b
            r2 = r8
            b9.f r2 = (b9.f) r2
            if (r9 == 0) goto L3f0
            int r8 = r9.hashCode()
            r0 = 1230870446(0x495d97ae, float:907642.9)
            if (r8 == r0) goto L365
            r0 = 1550516034(0x5c6aff42, float:2.6458321E17)
            if (r8 == r0) goto L35b
            goto L3f0
        L35b:
            java.lang.String r8 = "chat_time_format"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L36f
            goto L3f0
        L365:
            java.lang.String r8 = "chat_time_mode"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L36f
            goto L3f0
        L36f:
            android.content.SharedPreferences r8 = r2.f539c
            java.lang.String r9 = "chat_time_mode"
            java.lang.String r0 = "original"
            java.lang.String r8 = r8.getString(r9, r0)
            java.lang.String r9 = "hidden"
            java.lang.String r1 = "custom"
            boolean r3 = gg.l.a(r8, r1)
            if (r3 == 0) goto L385
            r4 = r1
            goto L38e
        L385:
            boolean r8 = gg.l.a(r8, r9)
            if (r8 == 0) goto L38d
            r4 = r9
            goto L38e
        L38d:
            r4 = r0
        L38e:
            java.util.Map r8 = r2.f538b
            r8.getClass()
            monitor-enter(r8)
            java.util.Map r9 = r2.f538b     // Catch: java.lang.Throwable -> L3c6
            java.util.Set r9 = r9.entrySet()     // Catch: java.lang.Throwable -> L3c6
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> L3c6
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3c6
            int r1 = tf.n.e1(r9)     // Catch: java.lang.Throwable -> L3c6
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3c6
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L3c6
        L3a9:
            boolean r1 = r9.hasNext()     // Catch: java.lang.Throwable -> L3c6
            if (r1 == 0) goto L3c9
            java.lang.Object r1 = r9.next()     // Catch: java.lang.Throwable -> L3c6
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L3c6
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L3c6
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L3c6
            sf.e r5 = new sf.e     // Catch: java.lang.Throwable -> L3c6
            r5.<init>(r3, r1)     // Catch: java.lang.Throwable -> L3c6
            r0.add(r5)     // Catch: java.lang.Throwable -> L3c6
            goto L3a9
        L3c6:
            r0 = move-exception
            r9 = r0
            goto L3ee
        L3c9:
            monitor-exit(r8)
            java.util.Iterator r8 = r0.iterator()
        L3ce:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L3f0
            java.lang.Object r9 = r8.next()
            sf.e r9 = (sf.e) r9
            java.lang.Object r0 = r9.f12418g
            r1 = r0
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.Object r9 = r9.f12419h
            r3 = r9
            b9.d r3 = (b9.d) r3
            b9.c r0 = new b9.c
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            r1.post(r0)
            goto L3ce
        L3ee:
            monitor-exit(r8)
            throw r9
        L3f0:
            return
    }
}
