package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18561a;

    public /* synthetic */ q0(int r1) {
            r0 = this;
            r0.f18561a = r1
            r0.<init>()
            return
    }

    public final void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r19) {
            r18 = this;
            r1 = r18
            r0 = r19
            int r2 = r1.f18561a
            r5 = 2
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 1
            switch(r2) {
                case 0: goto L603;
                case 1: goto L454;
                case 2: goto L377;
                case 3: goto L1c4;
                default: goto Le;
            }
        Le:
            r0.getClass()
            java.lang.Object[] r2 = r0.args
            r2.getClass()
            java.lang.Object r2 = tf.l.C0(r7, r2)
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L21
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L22
        L21:
            r2 = r8
        L22:
            if (r2 == 0) goto L1c3
            int r2 = r2.intValue()
            r3 = 1212371550(0x4843525e, float:200009.47)
            if (r2 == r3) goto L2f
            goto L1c3
        L2f:
            wb.hr r2 = wb.hr.f16681a
            monitor-enter(r2)
            wb.gr r15 = wb.hr.f16683c     // Catch: java.lang.Throwable -> L1c0
            wb.hr.f16683c = r8     // Catch: java.lang.Throwable -> L1c0
            monitor-exit(r2)
            if (r15 == 0) goto L1c3
            java.lang.Object[] r2 = r0.args
            r2.getClass()
            java.lang.Object r2 = tf.l.C0(r9, r2)
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L49
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L4a
        L49:
            r2 = r8
        L4a:
            if (r2 == 0) goto L1c3
            int r2 = r2.intValue()
            if (r2 == r6) goto L54
            goto L1c3
        L54:
            java.lang.Object[] r0 = r0.args
            r0.getClass()
            java.lang.Object r0 = tf.l.C0(r5, r0)
            boolean r2 = r0 instanceof android.content.Intent
            if (r2 == 0) goto L65
            android.content.Intent r0 = (android.content.Intent) r0
            r2 = r0
            goto L66
        L65:
            r2 = r8
        L66:
            if (r2 == 0) goto L1c3
            android.app.Activity r12 = r15.f16451a
            java.io.File r13 = r15.f16452b
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.net.Uri r0 = r2.getData()
            if (r0 == 0) goto L7a
            r3.add(r0)
        L7a:
            android.content.ClipData r4 = r2.getClipData()
            if (r4 == 0) goto Lad
            int r5 = r4.getItemCount()
            r6 = r7
        L85:
            if (r6 < r5) goto L88
            goto Lad
        L88:
            android.content.ClipData$Item r0 = r4.getItemAt(r6)     // Catch: java.lang.Throwable -> L93
            if (r0 == 0) goto L95
            android.net.Uri r0 = r0.getUri()     // Catch: java.lang.Throwable -> L93
            goto L9d
        L93:
            r0 = move-exception
            goto L97
        L95:
            r0 = r8
            goto L9d
        L97:
            sf.f r10 = new sf.f
            r10.<init>(r0)
            r0 = r10
        L9d:
            boolean r10 = r0 instanceof sf.f
            if (r10 == 0) goto La3
            r0 = r8
        La3:
            android.net.Uri r0 = (android.net.Uri) r0
            if (r0 == 0) goto Laa
            r3.add(r0)
        Laa:
            int r6 = r6 + 1
            goto L85
        Lad:
            java.util.Set r0 = tf.m.T1(r3)
            java.util.List r11 = tf.m.P1(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r11.iterator()
        Lbe:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L191
            java.lang.Object r5 = r4.next()
            r6 = r5
            android.net.Uri r6 = (android.net.Uri) r6
            wb.hr r0 = wb.hr.f16681a
            java.lang.String r0 = r6.getScheme()
            java.lang.String r8 = "content"
            boolean r0 = gg.l.a(r0, r8)
            if (r0 != 0) goto Ldc
        Ld9:
            r0 = r7
            goto L18a
        Ldc:
            android.content.ContentResolver r8 = r12.getContentResolver()
            java.util.List r0 = r8.getPersistedUriPermissions()     // Catch: java.lang.Throwable -> L111
            r0.getClass()     // Catch: java.lang.Throwable -> L111
            boolean r10 = r0.isEmpty()     // Catch: java.lang.Throwable -> L111
            if (r10 == 0) goto Lef
        Led:
            r0 = r7
            goto L113
        Lef:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L111
        Lf3:
            boolean r10 = r0.hasNext()     // Catch: java.lang.Throwable -> L111
            if (r10 == 0) goto Led
            java.lang.Object r10 = r0.next()     // Catch: java.lang.Throwable -> L111
            android.content.UriPermission r10 = (android.content.UriPermission) r10     // Catch: java.lang.Throwable -> L111
            android.net.Uri r14 = r10.getUri()     // Catch: java.lang.Throwable -> L111
            boolean r14 = gg.l.a(r14, r6)     // Catch: java.lang.Throwable -> L111
            if (r14 == 0) goto Lf3
            boolean r10 = r10.isReadPermission()     // Catch: java.lang.Throwable -> L111
            if (r10 == 0) goto Lf3
            r0 = r9
            goto L113
        L111:
            r0 = move-exception
            goto L118
        L113:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L111
            goto L11e
        L118:
            sf.f r10 = new sf.f
            r10.<init>(r0)
            r0 = r10
        L11e:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            boolean r14 = r0 instanceof sf.f
            if (r14 == 0) goto L125
            r0 = r10
        L125:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L12f
            r0 = r9
            goto L18a
        L12f:
            int r0 = r2.getFlags()
            r10 = r0 & 1
            if (r10 == 0) goto Ld9
            r0 = r0 & 64
            if (r0 != 0) goto L13c
            goto Ld9
        L13c:
            r8.takePersistableUriPermission(r6, r9)     // Catch: java.lang.Throwable -> L170
            java.util.List r0 = r8.getPersistedUriPermissions()     // Catch: java.lang.Throwable -> L170
            r0.getClass()     // Catch: java.lang.Throwable -> L170
            boolean r8 = r0.isEmpty()     // Catch: java.lang.Throwable -> L170
            if (r8 == 0) goto L14e
        L14c:
            r0 = r7
            goto L172
        L14e:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L170
        L152:
            boolean r8 = r0.hasNext()     // Catch: java.lang.Throwable -> L170
            if (r8 == 0) goto L14c
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L170
            android.content.UriPermission r8 = (android.content.UriPermission) r8     // Catch: java.lang.Throwable -> L170
            android.net.Uri r10 = r8.getUri()     // Catch: java.lang.Throwable -> L170
            boolean r10 = gg.l.a(r10, r6)     // Catch: java.lang.Throwable -> L170
            if (r10 == 0) goto L152
            boolean r8 = r8.isReadPermission()     // Catch: java.lang.Throwable -> L170
            if (r8 == 0) goto L152
            r0 = r9
            goto L172
        L170:
            r0 = move-exception
            goto L177
        L172:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L170
            goto L17d
        L177:
            sf.f r6 = new sf.f
            r6.<init>(r0)
            r0 = r6
        L17d:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r8 = r0 instanceof sf.f
            if (r8 == 0) goto L184
            r0 = r6
        L184:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L18a:
            if (r0 == 0) goto Lbe
            r3.add(r5)
            goto Lbe
        L191:
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            java.util.Iterator r0 = r3.iterator()
        L19a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1ae
            java.lang.Object r2 = r0.next()
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.String r2 = r2.toString()
            r14.add(r2)
            goto L19a
        L1ae:
            java.lang.Thread r0 = new java.lang.Thread
            ca.x r10 = new ca.x
            r16 = 17
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.lang.String r2 = "Hchat-Agent-Attachment-Copy"
            r0.<init>(r10, r2)
            r0.start()
            goto L1c3
        L1c0:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c0
            throw r0
        L1c3:
            return
        L1c4:
            r0.getClass()
            java.lang.Object[] r2 = r0.args
            r2.getClass()
            java.lang.Object r2 = tf.l.C0(r7, r2)
            boolean r10 = r2 instanceof java.lang.Integer
            if (r10 == 0) goto L1d7
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L1d8
        L1d7:
            r2 = r8
        L1d8:
            if (r2 == 0) goto L376
            int r2 = r2.intValue()
            r10 = 1212371546(0x4843525a, float:200009.4)
            if (r2 == r10) goto L1e5
            goto L376
        L1e5:
            java.lang.Object[] r2 = r0.args
            r2.getClass()
            java.lang.Object r2 = tf.l.C0(r9, r2)
            boolean r10 = r2 instanceof java.lang.Integer
            if (r10 == 0) goto L1f5
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L1f6
        L1f5:
            r2 = r8
        L1f6:
            if (r2 == 0) goto L376
            int r2 = r2.intValue()
            if (r2 == r6) goto L200
            goto L376
        L200:
            java.lang.Object[] r0 = r0.args
            r0.getClass()
            java.lang.Object r0 = tf.l.C0(r5, r0)
            boolean r2 = r0 instanceof android.content.Intent
            if (r2 == 0) goto L211
            android.content.Intent r0 = (android.content.Intent) r0
            r2 = r0
            goto L212
        L211:
            r2 = r8
        L212:
            if (r2 == 0) goto L376
            android.app.Activity r5 = wb.wq.f20023d
            if (r5 == 0) goto L376
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.net.Uri r6 = r2.getData()
            if (r6 == 0) goto L226
            r0.add(r6)
        L226:
            android.content.ClipData r6 = r2.getClipData()
            if (r6 == 0) goto L245
            int r10 = r6.getItemCount()
        L230:
            if (r7 < r10) goto L233
            goto L245
        L233:
            android.content.ClipData$Item r11 = r6.getItemAt(r7)     // Catch: java.lang.Throwable -> L242
            if (r11 == 0) goto L242
            android.net.Uri r11 = r11.getUri()     // Catch: java.lang.Throwable -> L242
            if (r11 == 0) goto L242
            r0.add(r11)     // Catch: java.lang.Throwable -> L242
        L242:
            int r7 = r7 + 1
            goto L230
        L245:
            java.lang.String r6 = "android.intent.extra.STREAM"
            android.os.Parcelable r6 = r2.getParcelableExtra(r6)
            boolean r7 = r6 instanceof android.net.Uri
            if (r7 == 0) goto L252
            android.net.Uri r6 = (android.net.Uri) r6
            goto L253
        L252:
            r6 = r8
        L253:
            if (r6 == 0) goto L258
            r0.add(r6)
        L258:
            java.util.Set r0 = tf.m.T1(r0)
            java.util.List r0 = tf.m.P1(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r0.iterator()
        L269:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L361
            java.lang.Object r0 = r7.next()
            android.net.Uri r0 = (android.net.Uri) r0
            wb.wq r10 = wb.wq.f20020a
            java.lang.String r10 = r0.getScheme()
            java.lang.String r11 = "content"
            boolean r10 = gg.l.a(r10, r11)
            if (r10 != 0) goto L284
            goto L293
        L284:
            int r10 = r2.getFlags()     // Catch: java.lang.Throwable -> L293
            r10 = r10 & r9
            if (r10 != 0) goto L28c
            goto L293
        L28c:
            android.content.ContentResolver r10 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L293
            r10.takePersistableUriPermission(r0, r9)     // Catch: java.lang.Throwable -> L293
        L293:
            wb.wq r10 = wb.wq.f20020a
            java.lang.String r10 = "_"
            java.lang.String r11 = "scheduled_task_file"
            java.lang.String r12 = "file"
            java.lang.String r13 = r0.getScheme()
            boolean r12 = r12.equalsIgnoreCase(r13)
            if (r12 == 0) goto L2bd
            java.lang.String r12 = r0.getPath()
            if (r12 != 0) goto L2ad
            java.lang.String r12 = ""
        L2ad:
            boolean r13 = og.m.t0(r12)
            if (r13 != 0) goto L2bd
            boolean r13 = eh.a.y(r12)
            if (r13 == 0) goto L2bd
            r16 = 0
            goto L35a
        L2bd:
            java.lang.String r12 = wb.ho.C6(r5, r0)     // Catch: java.lang.Throwable -> L357
            if (r12 == 0) goto L2c4
            goto L2cc
        L2c4:
            java.lang.String r12 = r0.getLastPathSegment()     // Catch: java.lang.Throwable -> L357
            if (r12 == 0) goto L2cb
            goto L2cc
        L2cb:
            r12 = r11
        L2cc:
            java.lang.String r13 = "[\\\\/:*?\"<>|]"
            java.util.regex.Pattern r13 = java.util.regex.Pattern.compile(r13)     // Catch: java.lang.Throwable -> L357
            r13.getClass()     // Catch: java.lang.Throwable -> L357
            java.util.regex.Matcher r12 = r13.matcher(r12)     // Catch: java.lang.Throwable -> L357
            java.lang.String r12 = r12.replaceAll(r10)     // Catch: java.lang.Throwable -> L357
            r12.getClass()     // Catch: java.lang.Throwable -> L357
            java.lang.CharSequence r12 = og.m.R0(r12)     // Catch: java.lang.Throwable -> L357
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L357
            boolean r13 = og.m.t0(r12)     // Catch: java.lang.Throwable -> L357
            if (r13 == 0) goto L2ef
            goto L2f0
        L2ef:
            r11 = r12
        L2f0:
            java.io.File r12 = new java.io.File     // Catch: java.lang.Throwable -> L357
            java.io.File r13 = r5.getFilesDir()     // Catch: java.lang.Throwable -> L357
            java.lang.String r14 = "Hchat/scheduled_task"
            r12.<init>(r13, r14)     // Catch: java.lang.Throwable -> L357
            r12.mkdirs()     // Catch: java.lang.Throwable -> L357
            java.io.File r13 = new java.io.File     // Catch: java.lang.Throwable -> L357
            long r14 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L357
            r16 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L359
            r3.<init>()     // Catch: java.lang.Throwable -> L359
            r3.append(r14)     // Catch: java.lang.Throwable -> L359
            r3.append(r10)     // Catch: java.lang.Throwable -> L359
            r3.append(r11)     // Catch: java.lang.Throwable -> L359
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L359
            r13.<init>(r12, r3)     // Catch: java.lang.Throwable -> L359
            android.content.ContentResolver r3 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L359
            java.io.InputStream r3 = r3.openInputStream(r0)     // Catch: java.lang.Throwable -> L359
            if (r3 == 0) goto L359
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L346
            r4.<init>(r13)     // Catch: java.lang.Throwable -> L346
            g4.a.j(r3, r4)     // Catch: java.lang.Throwable -> L349
            r4.close()     // Catch: java.lang.Throwable -> L346
            r3.close()     // Catch: java.lang.Throwable -> L359
            java.lang.String r12 = r13.getAbsolutePath()     // Catch: java.lang.Throwable -> L359
            boolean r0 = r13.isFile()     // Catch: java.lang.Throwable -> L359
            if (r0 == 0) goto L359
            long r3 = r13.length()     // Catch: java.lang.Throwable -> L359
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 <= 0) goto L359
            goto L35a
        L346:
            r0 = move-exception
            r4 = r0
            goto L351
        L349:
            r0 = move-exception
            r10 = r0
            throw r10     // Catch: java.lang.Throwable -> L34c
        L34c:
            r0 = move-exception
            ig.a.i(r4, r10)     // Catch: java.lang.Throwable -> L346
            throw r0     // Catch: java.lang.Throwable -> L346
        L351:
            throw r4     // Catch: java.lang.Throwable -> L352
        L352:
            r0 = move-exception
            ig.a.i(r3, r4)     // Catch: java.lang.Throwable -> L359
            throw r0     // Catch: java.lang.Throwable -> L359
        L357:
            r16 = 0
        L359:
            r12 = r8
        L35a:
            if (r12 == 0) goto L269
            r6.add(r12)
            goto L269
        L361:
            java.util.Set r0 = tf.m.T1(r6)
            java.util.List r0 = tf.m.P1(r0)
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L376
            fg.l r2 = wb.wq.f20022c
            if (r2 == 0) goto L376
            r2.invoke(r0)
        L376:
            return
        L377:
            r0.getClass()
            java.lang.Object[] r2 = r0.args
            r2.getClass()
            java.lang.Object r2 = tf.l.C0(r7, r2)
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L38a
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L38b
        L38a:
            r2 = r8
        L38b:
            if (r2 == 0) goto L453
            int r2 = r2.intValue()
            r3 = 1212371540(0x48435254, float:200009.31)
            if (r2 == r3) goto L39d
            r4 = 1212371541(0x48435255, float:200009.33)
            if (r2 == r4) goto L39d
            goto L453
        L39d:
            java.lang.Object[] r4 = r0.args
            r4.getClass()
            java.lang.Object r4 = tf.l.C0(r9, r4)
            boolean r10 = r4 instanceof java.lang.Integer
            if (r10 == 0) goto L3ad
            java.lang.Integer r4 = (java.lang.Integer) r4
            goto L3ae
        L3ad:
            r4 = r8
        L3ae:
            if (r4 == 0) goto L453
            int r4 = r4.intValue()
            if (r4 == r6) goto L3b8
            goto L453
        L3b8:
            java.lang.Object[] r0 = r0.args
            r0.getClass()
            java.lang.Object r0 = tf.l.C0(r5, r0)
            boolean r4 = r0 instanceof android.content.Intent
            if (r4 == 0) goto L3c8
            android.content.Intent r0 = (android.content.Intent) r0
            goto L3c9
        L3c8:
            r0 = r8
        L3c9:
            if (r0 == 0) goto L453
            wb.vq r4 = wb.vq.f19807a
            if (r2 != r3) goto L3e0
            java.lang.String r2 = "android.intent.extra.ringtone.PICKED_URI"
            android.os.Parcelable r2 = r0.getParcelableExtra(r2)
            boolean r3 = r2 instanceof android.net.Uri
            if (r3 == 0) goto L3dc
            android.net.Uri r2 = (android.net.Uri) r2
            goto L3dd
        L3dc:
            r2 = r8
        L3dd:
            if (r2 == 0) goto L3e0
            goto L41c
        L3e0:
            android.net.Uri r2 = r0.getData()
            if (r2 == 0) goto L3e7
            goto L41c
        L3e7:
            java.lang.String r2 = "android.intent.extra.STREAM"
            android.os.Parcelable r2 = r0.getParcelableExtra(r2)
            boolean r3 = r2 instanceof android.net.Uri
            if (r3 == 0) goto L3f4
            android.net.Uri r2 = (android.net.Uri) r2
            goto L3f5
        L3f4:
            r2 = r8
        L3f5:
            if (r2 == 0) goto L3f8
            goto L41c
        L3f8:
            android.content.ClipData r2 = r0.getClipData()
            if (r2 == 0) goto L410
            int r3 = r2.getItemCount()
            if (r3 > 0) goto L405
            goto L410
        L405:
            android.content.ClipData$Item r2 = r2.getItemAt(r7)     // Catch: java.lang.Throwable -> L410
            if (r2 == 0) goto L410
            android.net.Uri r2 = r2.getUri()     // Catch: java.lang.Throwable -> L410
            goto L411
        L410:
            r2 = r8
        L411:
            if (r2 == 0) goto L414
            goto L41c
        L414:
            android.os.Bundle r2 = r0.getExtras()
            android.net.Uri r2 = wb.vq.a(r2)
        L41c:
            wb.vq r3 = wb.vq.f19807a
            if (r2 == 0) goto L442
            java.lang.String r3 = r2.getScheme()
            java.lang.String r4 = "content"
            boolean r3 = gg.l.a(r3, r4)
            if (r3 != 0) goto L42d
            goto L442
        L42d:
            int r0 = r0.getFlags()     // Catch: java.lang.Throwable -> L442
            r0 = r0 & r9
            if (r0 != 0) goto L435
            goto L442
        L435:
            android.app.Activity r0 = wb.vq.f19810d     // Catch: java.lang.Throwable -> L442
            if (r0 == 0) goto L442
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L442
            if (r0 == 0) goto L442
            r0.takePersistableUriPermission(r2, r9)     // Catch: java.lang.Throwable -> L442
        L442:
            fg.l r0 = wb.vq.f19809c
            if (r0 == 0) goto L453
            if (r2 == 0) goto L44c
            java.lang.String r8 = r2.toString()
        L44c:
            if (r8 != 0) goto L450
            java.lang.String r8 = ""
        L450:
            r0.invoke(r8)
        L453:
            return
        L454:
            r16 = 0
            r0.getClass()
            java.lang.Object[] r2 = r0.args
            r2.getClass()
            java.lang.Object r2 = tf.l.C0(r7, r2)
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L469
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L46a
        L469:
            r2 = r8
        L46a:
            if (r2 == 0) goto L602
            int r2 = r2.intValue()
            r3 = 1212371542(0x48435256, float:200009.34)
            if (r2 == r3) goto L477
            goto L602
        L477:
            java.lang.Object[] r2 = r0.args
            r2.getClass()
            java.lang.Object r2 = tf.l.C0(r9, r2)
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L487
            java.lang.Integer r2 = (java.lang.Integer) r2
            goto L488
        L487:
            r2 = r8
        L488:
            if (r2 == 0) goto L602
            int r2 = r2.intValue()
            if (r2 == r6) goto L492
            goto L602
        L492:
            java.lang.Object[] r0 = r0.args
            r0.getClass()
            java.lang.Object r0 = tf.l.C0(r5, r0)
            boolean r2 = r0 instanceof android.content.Intent
            if (r2 == 0) goto L4a3
            android.content.Intent r0 = (android.content.Intent) r0
            r2 = r0
            goto L4a4
        L4a3:
            r2 = r8
        L4a4:
            if (r2 == 0) goto L602
            android.app.Activity r3 = wb.iq.f16909d
            if (r3 == 0) goto L602
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.net.Uri r4 = r2.getData()
            if (r4 == 0) goto L4b8
            r0.add(r4)
        L4b8:
            android.content.ClipData r4 = r2.getClipData()
            if (r4 == 0) goto L4d7
            int r5 = r4.getItemCount()
        L4c2:
            if (r7 < r5) goto L4c5
            goto L4d7
        L4c5:
            android.content.ClipData$Item r6 = r4.getItemAt(r7)     // Catch: java.lang.Throwable -> L4d4
            if (r6 == 0) goto L4d4
            android.net.Uri r6 = r6.getUri()     // Catch: java.lang.Throwable -> L4d4
            if (r6 == 0) goto L4d4
            r0.add(r6)     // Catch: java.lang.Throwable -> L4d4
        L4d4:
            int r7 = r7 + 1
            goto L4c2
        L4d7:
            java.lang.String r4 = "android.intent.extra.STREAM"
            android.os.Parcelable r4 = r2.getParcelableExtra(r4)
            boolean r5 = r4 instanceof android.net.Uri
            if (r5 == 0) goto L4e4
            android.net.Uri r4 = (android.net.Uri) r4
            goto L4e5
        L4e4:
            r4 = r8
        L4e5:
            if (r4 == 0) goto L4ea
            r0.add(r4)
        L4ea:
            java.util.Set r0 = tf.m.T1(r0)
            java.util.List r0 = tf.m.P1(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r0.iterator()
        L4fb:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5ed
            java.lang.Object r0 = r5.next()
            android.net.Uri r0 = (android.net.Uri) r0
            wb.iq r6 = wb.iq.f16906a
            java.lang.String r6 = r0.getScheme()
            java.lang.String r7 = "content"
            boolean r6 = gg.l.a(r6, r7)
            if (r6 != 0) goto L516
            goto L525
        L516:
            int r6 = r2.getFlags()     // Catch: java.lang.Throwable -> L525
            r6 = r6 & r9
            if (r6 != 0) goto L51e
            goto L525
        L51e:
            android.content.ContentResolver r6 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L525
            r6.takePersistableUriPermission(r0, r9)     // Catch: java.lang.Throwable -> L525
        L525:
            wb.iq r6 = wb.iq.f16906a
            java.lang.String r6 = "_"
            java.lang.String r7 = "reply_file"
            java.lang.String r10 = "file"
            java.lang.String r11 = r0.getScheme()
            boolean r10 = r10.equalsIgnoreCase(r11)
            if (r10 == 0) goto L54d
            java.lang.String r10 = r0.getPath()
            if (r10 != 0) goto L53f
            java.lang.String r10 = ""
        L53f:
            boolean r11 = og.m.t0(r10)
            if (r11 != 0) goto L54d
            boolean r11 = eh.a.y(r10)
            if (r11 == 0) goto L54d
            goto L5e6
        L54d:
            java.lang.String r10 = wb.ho.C6(r3, r0)     // Catch: java.lang.Throwable -> L5e5
            if (r10 == 0) goto L554
            goto L55c
        L554:
            java.lang.String r10 = r0.getLastPathSegment()     // Catch: java.lang.Throwable -> L5e5
            if (r10 == 0) goto L55b
            goto L55c
        L55b:
            r10 = r7
        L55c:
            java.lang.String r11 = "[\\\\/:*?\"<>|]"
            java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r11)     // Catch: java.lang.Throwable -> L5e5
            r11.getClass()     // Catch: java.lang.Throwable -> L5e5
            java.util.regex.Matcher r10 = r11.matcher(r10)     // Catch: java.lang.Throwable -> L5e5
            java.lang.String r10 = r10.replaceAll(r6)     // Catch: java.lang.Throwable -> L5e5
            r10.getClass()     // Catch: java.lang.Throwable -> L5e5
            java.lang.CharSequence r10 = og.m.R0(r10)     // Catch: java.lang.Throwable -> L5e5
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L5e5
            boolean r11 = og.m.t0(r10)     // Catch: java.lang.Throwable -> L5e5
            if (r11 == 0) goto L57f
            goto L580
        L57f:
            r7 = r10
        L580:
            java.io.File r10 = new java.io.File     // Catch: java.lang.Throwable -> L5e5
            java.io.File r11 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L5e5
            java.lang.String r12 = "Hchat/redpacket_reply"
            r10.<init>(r11, r12)     // Catch: java.lang.Throwable -> L5e5
            r10.mkdirs()     // Catch: java.lang.Throwable -> L5e5
            java.io.File r11 = new java.io.File     // Catch: java.lang.Throwable -> L5e5
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L5e5
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e5
            r14.<init>()     // Catch: java.lang.Throwable -> L5e5
            r14.append(r12)     // Catch: java.lang.Throwable -> L5e5
            r14.append(r6)     // Catch: java.lang.Throwable -> L5e5
            r14.append(r7)     // Catch: java.lang.Throwable -> L5e5
            java.lang.String r6 = r14.toString()     // Catch: java.lang.Throwable -> L5e5
            r11.<init>(r10, r6)     // Catch: java.lang.Throwable -> L5e5
            android.content.ContentResolver r6 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L5e5
            java.io.InputStream r6 = r6.openInputStream(r0)     // Catch: java.lang.Throwable -> L5e5
            if (r6 == 0) goto L5e5
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5d4
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L5d4
            g4.a.j(r6, r7)     // Catch: java.lang.Throwable -> L5d7
            r7.close()     // Catch: java.lang.Throwable -> L5d4
            r6.close()     // Catch: java.lang.Throwable -> L5e5
            java.lang.String r10 = r11.getAbsolutePath()     // Catch: java.lang.Throwable -> L5e5
            boolean r0 = r11.isFile()     // Catch: java.lang.Throwable -> L5e5
            if (r0 == 0) goto L5e5
            long r6 = r11.length()     // Catch: java.lang.Throwable -> L5e5
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 <= 0) goto L5e5
            goto L5e6
        L5d4:
            r0 = move-exception
            r7 = r0
            goto L5df
        L5d7:
            r0 = move-exception
            r10 = r0
            throw r10     // Catch: java.lang.Throwable -> L5da
        L5da:
            r0 = move-exception
            ig.a.i(r7, r10)     // Catch: java.lang.Throwable -> L5d4
            throw r0     // Catch: java.lang.Throwable -> L5d4
        L5df:
            throw r7     // Catch: java.lang.Throwable -> L5e0
        L5e0:
            r0 = move-exception
            ig.a.i(r6, r7)     // Catch: java.lang.Throwable -> L5e5
            throw r0     // Catch: java.lang.Throwable -> L5e5
        L5e5:
            r10 = r8
        L5e6:
            if (r10 == 0) goto L4fb
            r4.add(r10)
            goto L4fb
        L5ed:
            java.util.Set r0 = tf.m.T1(r4)
            java.util.List r0 = tf.m.P1(r0)
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L602
            fg.l r2 = wb.iq.f16908c
            if (r2 == 0) goto L602
            r2.invoke(r0)
        L602:
            return
        L603:
            java.lang.String r2 = "prefs"
            java.lang.String r3 = "HchatConfigBackup"
            java.lang.String r4 = "format"
            r0.getClass()
            java.lang.Object[] r10 = r0.args
            r10.getClass()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            java.lang.Object r10 = tf.l.C0(r7, r10)
            boolean r12 = r10 instanceof java.lang.Integer
            if (r12 == 0) goto L620
            java.lang.Integer r10 = (java.lang.Integer) r10
            goto L621
        L620:
            r10 = r8
        L621:
            if (r10 == 0) goto L843
            int r10 = r10.intValue()
            r12 = 1212371544(0x48435258, float:200009.38)
            if (r10 == r12) goto L633
            r13 = 1212371545(0x48435259, float:200009.39)
            if (r10 == r13) goto L633
            goto L843
        L633:
            java.lang.Object[] r13 = r0.args
            r13.getClass()
            java.lang.Object r13 = tf.l.C0(r9, r13)
            boolean r14 = r13 instanceof java.lang.Integer
            if (r14 == 0) goto L643
            java.lang.Integer r13 = (java.lang.Integer) r13
            goto L644
        L643:
            r13 = r8
        L644:
            if (r13 == 0) goto L843
            int r13 = r13.intValue()
            if (r13 == r6) goto L64e
            goto L843
        L64e:
            java.lang.Object[] r0 = r0.args
            r0.getClass()
            java.lang.Object r0 = tf.l.C0(r5, r0)
            boolean r6 = r0 instanceof android.content.Intent
            if (r6 == 0) goto L65e
            android.content.Intent r0 = (android.content.Intent) r0
            goto L65f
        L65e:
            r0 = r8
        L65f:
            if (r0 == 0) goto L843
            android.net.Uri r0 = r0.getData()
            if (r0 == 0) goto L843
            android.app.Activity r6 = wb.r0.f18749d
            if (r6 == 0) goto L843
            if (r10 != r12) goto L766
            java.util.List r8 = wb.m4.f17594a
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6c5
            r8.<init>()     // Catch: java.lang.Throwable -> L6c5
            java.util.List r10 = wb.m4.f17594a     // Catch: java.lang.Throwable -> L6c5
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L6c5
            r12 = r7
        L67b:
            boolean r13 = r10.hasNext()     // Catch: java.lang.Throwable -> L6c5
            if (r13 == 0) goto L6d6
            java.lang.Object r13 = r10.next()     // Catch: java.lang.Throwable -> L6c5
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L6c5
            android.content.SharedPreferences r14 = ub.b.c(r6, r13)     // Catch: java.lang.Throwable -> L6c5
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6c5
            r15.<init>()     // Catch: java.lang.Throwable -> L6c5
            java.util.Map r14 = r14.getAll()     // Catch: java.lang.Throwable -> L6c5
            r14.getClass()     // Catch: java.lang.Throwable -> L6c5
            java.util.Map r14 = (java.util.Map) r14     // Catch: java.lang.Throwable -> L6c5
            java.util.Set r14 = r14.entrySet()     // Catch: java.lang.Throwable -> L6c5
            java.util.Iterator r14 = r14.iterator()     // Catch: java.lang.Throwable -> L6c5
        L6a1:
            boolean r16 = r14.hasNext()     // Catch: java.lang.Throwable -> L6c5
            if (r16 == 0) goto L6ca
            java.lang.Object r16 = r14.next()     // Catch: java.lang.Throwable -> L6c5
            java.util.Map$Entry r16 = (java.util.Map.Entry) r16     // Catch: java.lang.Throwable -> L6c5
            java.lang.Object r17 = r16.getKey()     // Catch: java.lang.Throwable -> L6c5
            r7 = r17
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L6c5
            java.lang.Object r16 = r16.getValue()     // Catch: java.lang.Throwable -> L6c5
            org.json.JSONObject r5 = wb.m4.b(r16)     // Catch: java.lang.Throwable -> L6c5
            if (r5 == 0) goto L6c7
            r15.put(r7, r5)     // Catch: java.lang.Throwable -> L6c5
            int r12 = r12 + 1
            goto L6c7
        L6c5:
            r0 = move-exception
            goto L728
        L6c7:
            r5 = 2
            r7 = 0
            goto L6a1
        L6ca:
            int r5 = r15.length()     // Catch: java.lang.Throwable -> L6c5
            if (r5 <= 0) goto L6d3
            r8.put(r13, r15)     // Catch: java.lang.Throwable -> L6c5
        L6d3:
            r5 = 2
            r7 = 0
            goto L67b
        L6d6:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6c5
            r5.<init>()     // Catch: java.lang.Throwable -> L6c5
            r5.put(r4, r3)     // Catch: java.lang.Throwable -> L6c5
            java.lang.String r3 = "version"
            r5.put(r3, r9)     // Catch: java.lang.Throwable -> L6c5
            java.lang.String r3 = "appVersion"
            java.lang.String r4 = "5.5.6"
            r5.put(r3, r4)     // Catch: java.lang.Throwable -> L6c5
            java.lang.String r3 = "exportedAt"
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6c5
            r5.put(r3, r9)     // Catch: java.lang.Throwable -> L6c5
            r5.put(r2, r8)     // Catch: java.lang.Throwable -> L6c5
            android.content.ContentResolver r2 = r6.getContentResolver()     // Catch: java.lang.Throwable -> L6c5
            java.lang.String r3 = "wt"
            java.io.OutputStream r2 = r2.openOutputStream(r0, r3)     // Catch: java.lang.Throwable -> L6c5
            if (r2 == 0) goto L726
            r0 = 2
            java.lang.String r0 = r5.toString(r0)     // Catch: java.lang.Throwable -> L71e
            r0.getClass()     // Catch: java.lang.Throwable -> L71e
            java.nio.charset.Charset r3 = og.a.f9804a     // Catch: java.lang.Throwable -> L71e
            byte[] r0 = r0.getBytes(r3)     // Catch: java.lang.Throwable -> L71e
            r0.getClass()     // Catch: java.lang.Throwable -> L71e
            r2.write(r0)     // Catch: java.lang.Throwable -> L71e
            r2.close()     // Catch: java.lang.Throwable -> L6c5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L6c5
            goto L72e
        L71e:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch: java.lang.Throwable -> L721
        L721:
            r0 = move-exception
            ig.a.i(r2, r3)     // Catch: java.lang.Throwable -> L6c5
            throw r0     // Catch: java.lang.Throwable -> L6c5
        L726:
            r0 = 0
            goto L73b
        L728:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L72e:
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto L734
            goto L735
        L734:
            r11 = r0
        L735:
            java.lang.Number r11 = (java.lang.Number) r11
            int r0 = r11.intValue()
        L73b:
            if (r0 <= 0) goto L75a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "已导出 "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " 项配置"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r6, r0, r2)
            r0.show()
            goto L843
        L75a:
            r2 = 0
            java.lang.String r0 = "导出失败"
            android.widget.Toast r0 = android.widget.Toast.makeText(r6, r0, r2)
            r0.show()
            goto L843
        L766:
            java.util.List r5 = wb.m4.f17594a
            android.content.ContentResolver r5 = r6.getContentResolver()     // Catch: java.lang.Throwable -> L781
            java.io.InputStream r5 = r5.openInputStream(r0)     // Catch: java.lang.Throwable -> L781
            if (r5 == 0) goto L78c
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L784
            java.nio.charset.Charset r7 = og.a.f9804a     // Catch: java.lang.Throwable -> L784
            r0.<init>(r5, r7)     // Catch: java.lang.Throwable -> L784
            java.lang.String r8 = r9.e0.e0(r0)     // Catch: java.lang.Throwable -> L784
            r5.close()     // Catch: java.lang.Throwable -> L781
            goto L78c
        L781:
            r0 = move-exception
            goto L802
        L784:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L787
        L787:
            r0 = move-exception
            ig.a.i(r5, r2)     // Catch: java.lang.Throwable -> L781
            throw r0     // Catch: java.lang.Throwable -> L781
        L78c:
            if (r8 != 0) goto L790
            java.lang.String r8 = ""
        L790:
            boolean r0 = og.m.t0(r8)     // Catch: java.lang.Throwable -> L781
            if (r0 == 0) goto L799
        L796:
            r2 = 0
            goto L815
        L799:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L781
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L781
            java.lang.String r4 = r0.optString(r4)     // Catch: java.lang.Throwable -> L781
            boolean r3 = gg.l.a(r4, r3)     // Catch: java.lang.Throwable -> L781
            if (r3 != 0) goto L7a9
            goto L796
        L7a9:
            org.json.JSONObject r0 = r0.optJSONObject(r2)     // Catch: java.lang.Throwable -> L781
            if (r0 == 0) goto L796
            java.util.List r2 = wb.m4.f17594a     // Catch: java.lang.Throwable -> L781
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L781
            r3 = 0
        L7b6:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L781
            if (r4 == 0) goto L7fd
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L781
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L781
            org.json.JSONObject r5 = r0.optJSONObject(r4)     // Catch: java.lang.Throwable -> L781
            if (r5 == 0) goto L7b6
            android.content.SharedPreferences r4 = ub.b.c(r6, r4)     // Catch: java.lang.Throwable -> L781
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Throwable -> L781
            android.content.SharedPreferences$Editor r4 = r4.clear()     // Catch: java.lang.Throwable -> L781
            java.util.Iterator r7 = r5.keys()     // Catch: java.lang.Throwable -> L781
        L7d8:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L781
            if (r8 == 0) goto L7f9
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L781
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L781
            org.json.JSONObject r10 = r5.optJSONObject(r8)     // Catch: java.lang.Throwable -> L781
            if (r10 == 0) goto L7d8
            r4.getClass()     // Catch: java.lang.Throwable -> L781
            r8.getClass()     // Catch: java.lang.Throwable -> L781
            boolean r8 = wb.m4.a(r4, r8, r10)     // Catch: java.lang.Throwable -> L781
            if (r8 == 0) goto L7d8
            int r3 = r3 + 1
            goto L7d8
        L7f9:
            r4.commit()     // Catch: java.lang.Throwable -> L781
            goto L7b6
        L7fd:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L781
            goto L808
        L802:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L808:
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto L80e
            goto L80f
        L80e:
            r11 = r0
        L80f:
            java.lang.Number r11 = (java.lang.Number) r11
            int r2 = r11.intValue()
        L815:
            if (r2 <= 0) goto L839
            fg.a r0 = wb.r0.f18748c
            if (r0 == 0) goto L81e
            r0.invoke()
        L81e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "已导入 "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r2 = " 项配置，当前设置页已刷新"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.widget.Toast r0 = android.widget.Toast.makeText(r6, r0, r9)
            r0.show()
            goto L843
        L839:
            java.lang.String r0 = "导入失败或文件无配置"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r6, r0, r2)
            r0.show()
        L843:
            return
    }
}
