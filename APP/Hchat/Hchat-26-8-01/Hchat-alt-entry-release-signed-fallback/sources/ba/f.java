package ba;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f562a;

    public /* synthetic */ f(int r1) {
            r0 = this;
            r0.f562a = r1
            r0.<init>()
            return
    }

    public /* synthetic */ f(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f562a = r2
            r0.<init>()
            return
    }

    private final void a(de.robv.android.xposed.XC_MethodHook.MethodHookParam r10) {
            r9 = this;
            r10.getClass()
            java.lang.Object[] r0 = r10.args
            r0.getClass()
            r1 = 0
            java.lang.Object r0 = tf.l.C0(r1, r0)
            boolean r1 = r0 instanceof java.lang.Integer
            r2 = 0
            if (r1 == 0) goto L15
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L16
        L15:
            r0 = r2
        L16:
            if (r0 == 0) goto L19b
            int r0 = r0.intValue()
            r1 = 1212371547(0x4843525b, float:200009.42)
            if (r0 == r1) goto L28
            r3 = 1212371548(0x4843525c, float:200009.44)
            if (r0 == r3) goto L28
            goto L19b
        L28:
            java.lang.Object[] r3 = r10.args
            r3.getClass()
            r4 = 1
            java.lang.Object r3 = tf.l.C0(r4, r3)
            boolean r5 = r3 instanceof java.lang.Integer
            if (r5 == 0) goto L39
            java.lang.Integer r3 = (java.lang.Integer) r3
            goto L3a
        L39:
            r3 = r2
        L3a:
            if (r3 == 0) goto L19b
            int r3 = r3.intValue()
            r5 = -1
            if (r3 == r5) goto L45
            goto L19b
        L45:
            java.lang.Object[] r10 = r10.args
            r10.getClass()
            r3 = 2
            java.lang.Object r10 = tf.l.C0(r3, r10)
            boolean r3 = r10 instanceof android.content.Intent
            if (r3 == 0) goto L56
            android.content.Intent r10 = (android.content.Intent) r10
            goto L57
        L56:
            r10 = r2
        L57:
            if (r10 == 0) goto L19b
            android.app.Activity r3 = wb.d.f15584e
            if (r3 == 0) goto L19b
            android.net.Uri r5 = r10.getData()
            if (r5 == 0) goto L19b
            java.lang.String r6 = ""
            if (r0 != r1) goto L16e
            java.lang.String r0 = r5.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L74
            goto L83
        L74:
            int r10 = r10.getFlags()     // Catch: java.lang.Throwable -> L83
            r10 = r10 & r4
            if (r10 != 0) goto L7c
            goto L83
        L7c:
            android.content.ContentResolver r10 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L83
            r10.takePersistableUriPermission(r5, r4)     // Catch: java.lang.Throwable -> L83
        L83:
            wb.d r10 = wb.d.f15580a
            java.lang.String r10 = "_"
            java.lang.String r0 = "file"
            java.lang.String r1 = r5.getScheme()
            boolean r0 = r0.equalsIgnoreCase(r1)
            java.lang.String r1 = "audio_input"
            if (r0 == 0) goto Lc1
            java.lang.String r0 = r5.getPath()
            if (r0 != 0) goto L9c
            goto L9d
        L9c:
            r6 = r0
        L9d:
            boolean r0 = og.m.t0(r6)
            if (r0 != 0) goto Lc1
            boolean r0 = eh.a.y(r6)
            if (r0 == 0) goto Lc1
            java.io.File r10 = new java.io.File
            r10.<init>(r6)
            java.lang.String r10 = r10.getName()
            boolean r0 = og.m.t0(r10)
            if (r0 == 0) goto Lb9
            goto Lba
        Lb9:
            r1 = r10
        Lba:
            sf.e r2 = new sf.e
            r2.<init>(r6, r1)
            goto L160
        Lc1:
            java.lang.String r0 = wb.ho.C6(r3, r5)     // Catch: java.lang.Throwable -> L160
            if (r0 == 0) goto Lc8
            goto Ld0
        Lc8:
            java.lang.String r0 = r5.getLastPathSegment()     // Catch: java.lang.Throwable -> L160
            if (r0 == 0) goto Lcf
            goto Ld0
        Lcf:
            r0 = r1
        Ld0:
            java.lang.String r4 = "[\\\\/:*?\"<>|]"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch: java.lang.Throwable -> L160
            r4.getClass()     // Catch: java.lang.Throwable -> L160
            java.util.regex.Matcher r0 = r4.matcher(r0)     // Catch: java.lang.Throwable -> L160
            java.lang.String r0 = r0.replaceAll(r10)     // Catch: java.lang.Throwable -> L160
            r0.getClass()     // Catch: java.lang.Throwable -> L160
            java.lang.CharSequence r0 = og.m.R0(r0)     // Catch: java.lang.Throwable -> L160
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L160
            boolean r4 = og.m.t0(r0)     // Catch: java.lang.Throwable -> L160
            if (r4 == 0) goto Lf3
            goto Lf4
        Lf3:
            r1 = r0
        Lf4:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L160
            java.io.File r4 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L160
            java.lang.String r6 = "Hchat/audio_transform/input"
            r0.<init>(r4, r6)     // Catch: java.lang.Throwable -> L160
            r0.mkdirs()     // Catch: java.lang.Throwable -> L160
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L160
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L160
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L160
            r8.<init>()     // Catch: java.lang.Throwable -> L160
            r8.append(r6)     // Catch: java.lang.Throwable -> L160
            r8.append(r10)     // Catch: java.lang.Throwable -> L160
            r8.append(r1)     // Catch: java.lang.Throwable -> L160
            java.lang.String r10 = r8.toString()     // Catch: java.lang.Throwable -> L160
            r4.<init>(r0, r10)     // Catch: java.lang.Throwable -> L160
            android.content.ContentResolver r10 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L160
            java.io.InputStream r10 = r10.openInputStream(r5)     // Catch: java.lang.Throwable -> L160
            if (r10 == 0) goto L160
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L151
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L151
            g4.a.j(r10, r0)     // Catch: java.lang.Throwable -> L153
            r0.close()     // Catch: java.lang.Throwable -> L151
            r10.close()     // Catch: java.lang.Throwable -> L160
            boolean r10 = r4.isFile()     // Catch: java.lang.Throwable -> L160
            if (r10 == 0) goto L160
            long r5 = r4.length()     // Catch: java.lang.Throwable -> L160
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 > 0) goto L146
            goto L160
        L146:
            java.lang.String r10 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L160
            sf.e r0 = new sf.e     // Catch: java.lang.Throwable -> L160
            r0.<init>(r10, r1)     // Catch: java.lang.Throwable -> L160
            r2 = r0
            goto L160
        L151:
            r0 = move-exception
            goto L15a
        L153:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L155
        L155:
            r3 = move-exception
            ig.a.i(r0, r1)     // Catch: java.lang.Throwable -> L151
            throw r3     // Catch: java.lang.Throwable -> L151
        L15a:
            throw r0     // Catch: java.lang.Throwable -> L15b
        L15b:
            r1 = move-exception
            ig.a.i(r10, r0)     // Catch: java.lang.Throwable -> L160
            throw r1     // Catch: java.lang.Throwable -> L160
        L160:
            if (r2 == 0) goto L19b
            wb.la r10 = wb.d.f15582c
            if (r10 == 0) goto L19b
            java.lang.Object r0 = r2.f12418g
            java.lang.Object r1 = r2.f12419h
            r10.invoke(r0, r1)
            goto L19b
        L16e:
            java.lang.String r10 = wb.ho.C6(r3, r5)
            if (r10 == 0) goto L175
            goto L18c
        L175:
            java.lang.String r10 = r5.getLastPathSegment()
            if (r10 == 0) goto L187
            r0 = 47
            java.lang.String r10 = og.m.L0(r10, r0, r10)
            r0 = 58
            java.lang.String r2 = og.m.L0(r10, r0, r10)
        L187:
            if (r2 != 0) goto L18a
            goto L18b
        L18a:
            r6 = r2
        L18b:
            r10 = r6
        L18c:
            c9.d0 r0 = wb.d.f15583d
            if (r0 == 0) goto L19b
            boolean r1 = og.m.t0(r10)
            if (r1 == 0) goto L198
            java.lang.String r10 = "output"
        L198:
            r0.invoke(r5, r10)
        L19b:
            return
    }

    private final void b(de.robv.android.xposed.XC_MethodHook.MethodHookParam r14) {
            r13 = this;
            r14.getClass()
            java.lang.Object[] r0 = r14.args
            r0.getClass()
            r1 = 0
            java.lang.Object r0 = tf.l.C0(r1, r0)
            boolean r2 = r0 instanceof java.lang.Integer
            r3 = 0
            if (r2 == 0) goto L15
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L16
        L15:
            r0 = r3
        L16:
            if (r0 == 0) goto L1b0
            int r0 = r0.intValue()
            r2 = 1212371543(0x48435257, float:200009.36)
            if (r0 == r2) goto L23
            goto L1b0
        L23:
            java.lang.Object[] r0 = r14.args
            r0.getClass()
            r2 = 1
            java.lang.Object r0 = tf.l.C0(r2, r0)
            boolean r4 = r0 instanceof java.lang.Integer
            if (r4 == 0) goto L34
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L35
        L34:
            r0 = r3
        L35:
            if (r0 == 0) goto L1b0
            int r0 = r0.intValue()
            r4 = -1
            if (r0 == r4) goto L40
            goto L1b0
        L40:
            java.lang.Object[] r14 = r14.args
            r14.getClass()
            r0 = 2
            java.lang.Object r14 = tf.l.C0(r0, r14)
            boolean r0 = r14 instanceof android.content.Intent
            if (r0 == 0) goto L51
            android.content.Intent r14 = (android.content.Intent) r14
            goto L52
        L51:
            r14 = r3
        L52:
            if (r14 == 0) goto L1b0
            android.app.Activity r0 = wb.p.f18204d
            if (r0 == 0) goto L1b0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            android.net.Uri r5 = r14.getData()
            if (r5 == 0) goto L66
            r4.add(r5)
        L66:
            android.content.ClipData r5 = r14.getClipData()
            if (r5 == 0) goto L85
            int r6 = r5.getItemCount()
        L70:
            if (r1 < r6) goto L73
            goto L85
        L73:
            android.content.ClipData$Item r7 = r5.getItemAt(r1)     // Catch: java.lang.Throwable -> L82
            if (r7 == 0) goto L82
            android.net.Uri r7 = r7.getUri()     // Catch: java.lang.Throwable -> L82
            if (r7 == 0) goto L82
            r4.add(r7)     // Catch: java.lang.Throwable -> L82
        L82:
            int r1 = r1 + 1
            goto L70
        L85:
            java.lang.String r1 = "android.intent.extra.STREAM"
            android.os.Parcelable r1 = r14.getParcelableExtra(r1)
            boolean r5 = r1 instanceof android.net.Uri
            if (r5 == 0) goto L92
            android.net.Uri r1 = (android.net.Uri) r1
            goto L93
        L92:
            r1 = r3
        L93:
            if (r1 == 0) goto L98
            r4.add(r1)
        L98:
            java.util.Set r1 = tf.m.T1(r4)
            java.util.List r1 = tf.m.P1(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        La9:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L19b
            java.lang.Object r5 = r1.next()
            android.net.Uri r5 = (android.net.Uri) r5
            wb.p r6 = wb.p.f18201a
            java.lang.String r6 = r5.getScheme()
            java.lang.String r7 = "content"
            boolean r6 = gg.l.a(r6, r7)
            if (r6 != 0) goto Lc4
            goto Ld3
        Lc4:
            int r6 = r14.getFlags()     // Catch: java.lang.Throwable -> Ld3
            r6 = r6 & r2
            if (r6 != 0) goto Lcc
            goto Ld3
        Lcc:
            android.content.ContentResolver r6 = r0.getContentResolver()     // Catch: java.lang.Throwable -> Ld3
            r6.takePersistableUriPermission(r5, r2)     // Catch: java.lang.Throwable -> Ld3
        Ld3:
            wb.p r6 = wb.p.f18201a
            java.lang.String r6 = "_"
            java.lang.String r7 = "file"
            java.lang.String r8 = r5.getScheme()
            boolean r7 = r7.equalsIgnoreCase(r8)
            if (r7 == 0) goto Lf9
            java.lang.String r7 = r5.getPath()
            if (r7 != 0) goto Leb
            java.lang.String r7 = ""
        Leb:
            boolean r8 = og.m.t0(r7)
            if (r8 != 0) goto Lf9
            boolean r8 = eh.a.y(r7)
            if (r8 == 0) goto Lf9
            goto L194
        Lf9:
            java.lang.String r7 = wb.ho.C6(r0, r5)     // Catch: java.lang.Throwable -> L193
            java.lang.String r8 = "reply_file"
            if (r7 == 0) goto L102
            goto L10a
        L102:
            java.lang.String r7 = r5.getLastPathSegment()     // Catch: java.lang.Throwable -> L193
            if (r7 == 0) goto L109
            goto L10a
        L109:
            r7 = r8
        L10a:
            java.lang.String r9 = "[\\\\/:*?\"<>|]"
            java.util.regex.Pattern r9 = java.util.regex.Pattern.compile(r9)     // Catch: java.lang.Throwable -> L193
            r9.getClass()     // Catch: java.lang.Throwable -> L193
            java.util.regex.Matcher r7 = r9.matcher(r7)     // Catch: java.lang.Throwable -> L193
            java.lang.String r7 = r7.replaceAll(r6)     // Catch: java.lang.Throwable -> L193
            r7.getClass()     // Catch: java.lang.Throwable -> L193
            java.lang.CharSequence r7 = og.m.R0(r7)     // Catch: java.lang.Throwable -> L193
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L193
            boolean r9 = og.m.t0(r7)     // Catch: java.lang.Throwable -> L193
            if (r9 == 0) goto L12d
            goto L12e
        L12d:
            r8 = r7
        L12e:
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L193
            java.io.File r9 = r0.getFilesDir()     // Catch: java.lang.Throwable -> L193
            java.lang.String r10 = "Hchat/auto_reply"
            r7.<init>(r9, r10)     // Catch: java.lang.Throwable -> L193
            r7.mkdirs()     // Catch: java.lang.Throwable -> L193
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> L193
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L193
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L193
            r12.<init>()     // Catch: java.lang.Throwable -> L193
            r12.append(r10)     // Catch: java.lang.Throwable -> L193
            r12.append(r6)     // Catch: java.lang.Throwable -> L193
            r12.append(r8)     // Catch: java.lang.Throwable -> L193
            java.lang.String r6 = r12.toString()     // Catch: java.lang.Throwable -> L193
            r9.<init>(r7, r6)     // Catch: java.lang.Throwable -> L193
            android.content.ContentResolver r6 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L193
            java.io.InputStream r5 = r6.openInputStream(r5)     // Catch: java.lang.Throwable -> L193
            if (r5 == 0) goto L193
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L184
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L184
            g4.a.j(r5, r6)     // Catch: java.lang.Throwable -> L186
            r6.close()     // Catch: java.lang.Throwable -> L184
            r5.close()     // Catch: java.lang.Throwable -> L193
            java.lang.String r7 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L193
            boolean r5 = r9.isFile()     // Catch: java.lang.Throwable -> L193
            if (r5 == 0) goto L193
            long r5 = r9.length()     // Catch: java.lang.Throwable -> L193
            r8 = 0
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 <= 0) goto L193
            goto L194
        L184:
            r6 = move-exception
            goto L18d
        L186:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L188
        L188:
            r8 = move-exception
            ig.a.i(r6, r7)     // Catch: java.lang.Throwable -> L184
            throw r8     // Catch: java.lang.Throwable -> L184
        L18d:
            throw r6     // Catch: java.lang.Throwable -> L18e
        L18e:
            r7 = move-exception
            ig.a.i(r5, r6)     // Catch: java.lang.Throwable -> L193
            throw r7     // Catch: java.lang.Throwable -> L193
        L193:
            r7 = r3
        L194:
            if (r7 == 0) goto La9
            r4.add(r7)
            goto La9
        L19b:
            java.util.Set r14 = tf.m.T1(r4)
            java.util.List r14 = tf.m.P1(r14)
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L1b0
            wb.dj r0 = wb.p.f18203c
            if (r0 == 0) goto L1b0
            r0.invoke(r14)
        L1b0:
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r25) {
            r24 = this;
            r1 = r24
            r2 = r25
            int r0 = r1.f562a
            r6 = -1
            r8 = 1
            r10 = 0
            switch(r0) {
                case 0: goto L903;
                case 1: goto L8b7;
                case 4: goto L7ee;
                case 5: goto L5f3;
                case 7: goto L5ea;
                case 12: goto L562;
                case 14: goto L559;
                case 15: goto L50d;
                case 16: goto L47b;
                case 19: goto L446;
                case 20: goto L34d;
                case 21: goto L18;
                case 28: goto L14;
                case 29: goto L10;
                default: goto Lc;
            }
        Lc:
            super.afterHookedMethod(r25)
            return
        L10:
            r24.b(r25)
            return
        L14:
            r24.a(r25)
            return
        L18:
            r2.getClass()
            p8.j r0 = p8.j.f10380a
            java.util.concurrent.ConcurrentHashMap r6 = p8.j.f10384e
            java.util.Map r11 = p8.j.f10383d
            java.util.concurrent.ConcurrentHashMap r0 = p8.j.f10381b
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r13 = r0.iterator()
        L35:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r14 = r13.next()
            r0 = r14
            p8.i r0 = (p8.i) r0
            fg.a r0 = r0.f10377g
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L49
            goto L50
        L49:
            r0 = move-exception
            sf.f r15 = new sf.f
            r15.<init>(r0)
            r0 = r15
        L50:
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            r16 = 4
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L59
            r0 = r15
        L59:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.getClass()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L35
            r12.add(r14)
            goto L35
        L68:
            r16 = 4
            a9.h r0 = new a9.h
            r3 = 24
            r0.<init>(r3)
            c9.a0 r3 = new c9.a0
            r13 = 22
            r3.<init>(r0, r13)
            java.util.List r0 = tf.m.K1(r12, r3)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L84
            goto L34c
        L84:
            p8.l r3 = p8.j.f(r2)
            if (r3 == 0) goto L34c
            java.lang.Object[] r12 = r2.args
            if (r12 == 0) goto L34c
            java.lang.Object r12 = tf.l.C0(r10, r12)
            if (r12 == 0) goto L34c
            java.lang.Object[] r2 = r2.args
            if (r2 == 0) goto L9d
            java.lang.Object r2 = tf.l.C0(r8, r2)
            goto L9e
        L9d:
            r2 = 0
        L9e:
            boolean r13 = r2 instanceof android.view.View
            if (r13 == 0) goto La5
            android.view.View r2 = (android.view.View) r2
            goto La6
        La5:
            r2 = 0
        La6:
            r11.clear()
            r6.clear()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r14 = r0.iterator()
        Lb5:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto Lf2
            java.lang.Object r15 = r14.next()
            r0 = r15
            p8.i r0 = (p8.i) r0
            fg.l r0 = r0.f10378h     // Catch: java.lang.Throwable -> Ld0
            java.lang.Object r0 = r0.invoke(r3)     // Catch: java.lang.Throwable -> Ld0
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Ld0
            r0.getClass()     // Catch: java.lang.Throwable -> Ld0
            r17 = r8
            goto Ld9
        Ld0:
            r0 = move-exception
            r17 = r8
            sf.f r8 = new sf.f
            r8.<init>(r0)
            r0 = r8
        Ld9:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r18 = r10
            boolean r10 = r0 instanceof sf.f
            if (r10 == 0) goto Le2
            r0 = r8
        Le2:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Led
            r13.add(r15)
        Led:
            r8 = r17
            r10 = r18
            goto Lb5
        Lf2:
            r17 = r8
            r18 = r10
            java.util.Iterator r8 = r13.iterator()
        Lfa:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L34c
            java.lang.Object r0 = r8.next()
            r10 = r0
            p8.i r10 = (p8.i) r10
            p8.j r0 = p8.j.f10380a
            r10.getClass()
            int r13 = r10.f10372b
            java.lang.String r14 = "add"
            java.lang.Class<java.lang.CharSequence> r15 = java.lang.CharSequence.class
            java.lang.Class r4 = java.lang.Integer.TYPE
            java.lang.Integer r5 = java.lang.Integer.valueOf(r18)
            fg.a r0 = r10.f10375e     // Catch: java.lang.Throwable -> L123
            if (r0 == 0) goto L125
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L123
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L123
            goto L12d
        L123:
            r0 = move-exception
            goto L127
        L125:
            r0 = 0
            goto L12d
        L127:
            sf.f r9 = new sf.f
            r9.<init>(r0)
            r0 = r9
        L12d:
            boolean r9 = r0 instanceof sf.f
            if (r9 == 0) goto L133
            r0 = 0
        L133:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L140
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            goto L141
        L140:
            r0 = 0
        L141:
            if (r0 != 0) goto L145
            java.lang.String r0 = ""
        L145:
            int r9 = r0.length()
            if (r9 != 0) goto L14d
            java.lang.String r0 = r10.f10373c
        L14d:
            r9 = r0
            int r7 = r10.f10374d
            java.lang.String r10 = r10.f10376f
            android.view.MenuItem r0 = p8.j.b(r13, r12)
            if (r0 == 0) goto L15f
            r0.setTitle(r9)     // Catch: java.lang.Throwable -> L15b
        L15b:
            r21 = r2
            goto L332
        L15f:
            boolean r0 = og.m.t0(r10)
            if (r0 == 0) goto L16a
        L165:
            r21 = r2
        L167:
            r1 = r18
            goto L1a7
        L16a:
            if (r2 == 0) goto L175
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L175
        L172:
            r25 = r0
            goto L17c
        L175:
            android.app.Activity r0 = p8.j.a()
            if (r0 == 0) goto L165
            goto L172
        L17c:
            java.lang.String r0 = "raw"
            java.lang.String r1 = "drawable"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r21 = r2
            r1 = r18
        L188:
            r2 = 2
            if (r1 < r2) goto L18c
            goto L167
        L18c:
            r2 = r0[r1]
            r22 = r0
            android.content.res.Resources r0 = r25.getResources()
            r23 = r1
            java.lang.String r1 = r25.getPackageName()
            int r0 = r0.getIdentifier(r10, r2, r1)
            if (r0 == 0) goto L1a2
            r1 = r0
            goto L1a7
        L1a2:
            int r1 = r23 + 1
            r0 = r22
            goto L188
        L1a7:
            if (r1 != 0) goto L1ac
        L1a9:
            r0 = 0
            goto L20c
        L1ac:
            if (r21 == 0) goto L1b6
            android.content.Context r0 = r21.getContext()
            if (r0 == 0) goto L1b6
        L1b4:
            r2 = r0
            goto L1bd
        L1b6:
            android.app.Activity r0 = p8.j.a()
            if (r0 == 0) goto L1a9
            goto L1b4
        L1bd:
            android.content.res.Resources r0 = r2.getResources()     // Catch: java.lang.Throwable -> L1ce
            r25 = r2
            android.content.res.Resources$Theme r2 = r25.getTheme()     // Catch: java.lang.Throwable -> L1cc
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1, r2)     // Catch: java.lang.Throwable -> L1cc
            goto L1d7
        L1cc:
            r0 = move-exception
            goto L1d1
        L1ce:
            r0 = move-exception
            r25 = r2
        L1d1:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L1d7:
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto L1dd
            r0 = 0
        L1dd:
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            if (r0 == 0) goto L1e2
            goto L20c
        L1e2:
            android.content.res.Resources r0 = r25.getResources()     // Catch: java.lang.Throwable -> L1f3
            java.io.InputStream r2 = r0.openRawResource(r1)     // Catch: java.lang.Throwable -> L1f3
            android.graphics.drawable.Drawable r0 = android.graphics.drawable.Drawable.createFromStream(r2, r10)     // Catch: java.lang.Throwable -> L1f5
            r10 = 0
            ig.a.i(r2, r10)     // Catch: java.lang.Throwable -> L1f3
            goto L204
        L1f3:
            r0 = move-exception
            goto L1fe
        L1f5:
            r0 = move-exception
            r10 = 0
            r10 = r0
            throw r10     // Catch: java.lang.Throwable -> L1f9
        L1f9:
            r0 = move-exception
            ig.a.i(r2, r10)     // Catch: java.lang.Throwable -> L1f3
            throw r0     // Catch: java.lang.Throwable -> L1f3
        L1fe:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L204:
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto L20a
            r0 = 0
        L20a:
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
        L20c:
            if (r0 == 0) goto L271
            java.lang.Class r2 = r12.getClass()
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredMethods(r2)
            java.util.Iterator r2 = r2.iterator()
        L21a:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L258
            java.lang.Object r10 = r2.next()
            r22 = r10
            java.lang.reflect.Method r22 = (java.lang.reflect.Method) r22
            r25 = r2
            java.lang.Class[] r2 = r22.getParameterTypes()
            r22 = r7
            int r7 = r2.length
            r23 = r2
            r2 = 3
            if (r7 != r2) goto L253
            r2 = r23[r18]
            boolean r2 = gg.l.a(r2, r4)
            if (r2 == 0) goto L253
            r2 = r23[r17]
            boolean r2 = r15.isAssignableFrom(r2)
            if (r2 == 0) goto L253
            java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
            r20 = 2
            r7 = r23[r20]
            boolean r2 = r2.isAssignableFrom(r7)
            if (r2 == 0) goto L253
            goto L25b
        L253:
            r2 = r25
            r7 = r22
            goto L21a
        L258:
            r22 = r7
            r10 = 0
        L25b:
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r9, r0}
            boolean r2 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r10, r12, r2)
            if (r2 == 0) goto L273
            android.view.MenuItem r0 = p8.j.b(r13, r12)
            goto L332
        L271:
            r22 = r7
        L273:
            if (r1 == 0) goto L2f2
            java.lang.Class r2 = r12.getClass()
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredMethods(r2)
            java.util.Iterator r2 = r2.iterator()
        L281:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L2d8
            java.lang.Object r7 = r2.next()
            r10 = r7
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            r25 = r2
            java.lang.Class[] r2 = r10.getParameterTypes()
            java.lang.String r10 = r10.getName()
            r23 = r7
            java.lang.String r7 = "c"
            boolean r7 = gg.l.a(r10, r7)
            if (r7 == 0) goto L2d5
            int r7 = r2.length
            r10 = 5
            if (r7 != r10) goto L2d5
            r7 = r2[r18]
            boolean r7 = gg.l.a(r7, r4)
            if (r7 == 0) goto L2d5
            r7 = r2[r17]
            boolean r7 = gg.l.a(r7, r4)
            if (r7 == 0) goto L2d5
            r20 = 2
            r7 = r2[r20]
            boolean r7 = gg.l.a(r7, r4)
            if (r7 == 0) goto L2d5
            r19 = 3
            r7 = r2[r19]
            boolean r7 = r15.isAssignableFrom(r7)
            if (r7 == 0) goto L2d5
            r2 = r2[r16]
            boolean r2 = gg.l.a(r2, r4)
            if (r2 == 0) goto L2d5
            r7 = r23
            goto L2d9
        L2d5:
            r2 = r25
            goto L281
        L2d8:
            r7 = 0
        L2d9:
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[]{r5, r2, r5, r9, r4}
            boolean r2 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r7, r12, r2)
            if (r2 == 0) goto L2f2
            android.view.MenuItem r0 = p8.j.b(r13, r12)
            goto L332
        L2f2:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            java.lang.Object[] r2 = new java.lang.Object[]{r5, r2, r4, r9}
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r12, r14, r2)
            if (r2 == 0) goto L305
            goto L315
        L305:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r22)
            java.lang.Object[] r2 = new java.lang.Object[]{r5, r2, r4, r9}
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r12, r14, r2)
        L315:
            boolean r4 = r2 instanceof android.view.MenuItem
            if (r4 == 0) goto L32e
            if (r0 == 0) goto L322
            r1 = r2
            android.view.MenuItem r1 = (android.view.MenuItem) r1     // Catch: java.lang.Throwable -> L32a
            r1.setIcon(r0)     // Catch: java.lang.Throwable -> L32a
            goto L32a
        L322:
            if (r1 == 0) goto L32a
            r0 = r2
            android.view.MenuItem r0 = (android.view.MenuItem) r0     // Catch: java.lang.Throwable -> L32a
            r0.setIcon(r1)     // Catch: java.lang.Throwable -> L32a
        L32a:
            r0 = r2
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            goto L332
        L32e:
            android.view.MenuItem r0 = p8.j.b(r13, r12)
        L332:
            if (r0 == 0) goto L346
            r1 = r11
            java.util.Map r1 = (java.util.Map) r1
            r1.put(r0, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r6.put(r0, r1)
        L346:
            r1 = r24
            r2 = r21
            goto Lfa
        L34c:
            return
        L34d:
            r18 = r10
            r2.getClass()
            p8.j r1 = p8.j.f10380a
            monitor-enter(r1)
            java.lang.Object[] r0 = r2.args     // Catch: java.lang.Throwable -> L367
            if (r0 == 0) goto L442
            int r3 = r0.length     // Catch: java.lang.Throwable -> L367
            r10 = r18
        L35c:
            if (r10 >= r3) goto L371
            r4 = r0[r10]     // Catch: java.lang.Throwable -> L367
            boolean r5 = r4 instanceof android.view.MenuItem     // Catch: java.lang.Throwable -> L367
            if (r5 == 0) goto L36a
            android.view.MenuItem r4 = (android.view.MenuItem) r4     // Catch: java.lang.Throwable -> L367
            goto L36b
        L367:
            r0 = move-exception
            goto L444
        L36a:
            r4 = 0
        L36b:
            if (r4 == 0) goto L36e
            goto L372
        L36e:
            int r10 = r10 + 1
            goto L35c
        L371:
            r4 = 0
        L372:
            if (r4 == 0) goto L442
            java.util.concurrent.ConcurrentHashMap r0 = p8.j.f10381b     // Catch: java.lang.Throwable -> L367
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L367
            r0.getClass()     // Catch: java.lang.Throwable -> L367
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L367
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L367
        L383:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L367
            if (r3 == 0) goto L399
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L367
            r5 = r3
            p8.i r5 = (p8.i) r5     // Catch: java.lang.Throwable -> L367
            int r5 = r5.f10372b     // Catch: java.lang.Throwable -> L367
            int r6 = r4.getItemId()     // Catch: java.lang.Throwable -> L367
            if (r5 != r6) goto L383
            goto L39a
        L399:
            r3 = 0
        L39a:
            p8.i r3 = (p8.i) r3     // Catch: java.lang.Throwable -> L367
            if (r3 == 0) goto L440
            fg.a r0 = r3.f10377g     // Catch: java.lang.Throwable -> L367
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L3a5
            goto L3ac
        L3a5:
            r0 = move-exception
            sf.f r5 = new sf.f     // Catch: java.lang.Throwable -> L367
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L367
            r0 = r5
        L3ac:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L367
            boolean r6 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L367
            if (r6 == 0) goto L3b3
            r0 = r5
        L3b3:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L367
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L367
            if (r0 != 0) goto L3be
            monitor-exit(r1)
            goto L443
        L3be:
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L367
            java.lang.ref.WeakReference r0 = p8.j.f10387h     // Catch: java.lang.Throwable -> L367
            if (r0 == 0) goto L3cd
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L367
            android.view.MenuItem r0 = (android.view.MenuItem) r0     // Catch: java.lang.Throwable -> L367
            goto L3ce
        L3cd:
            r0 = 0
        L3ce:
            if (r0 != r4) goto L3dd
            long r7 = p8.j.f10388i     // Catch: java.lang.Throwable -> L367
            long r7 = r5 - r7
            r9 = 1500(0x5dc, double:7.41E-321)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L3dd
            monitor-exit(r1)
            goto L443
        L3dd:
            java.util.Map r0 = p8.j.f10383d     // Catch: java.lang.Throwable -> L367
            java.lang.Object r7 = r0.remove(r4)     // Catch: java.lang.Throwable -> L367
            p8.l r7 = (p8.l) r7     // Catch: java.lang.Throwable -> L367
            if (r7 == 0) goto L3e8
            goto L40d
        L3e8:
            java.util.concurrent.ConcurrentHashMap r7 = p8.j.f10384e     // Catch: java.lang.Throwable -> L367
            int r8 = r4.getItemId()     // Catch: java.lang.Throwable -> L367
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L367
            java.lang.Object r7 = r7.remove(r8)     // Catch: java.lang.Throwable -> L367
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7     // Catch: java.lang.Throwable -> L367
            if (r7 == 0) goto L402
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Throwable -> L367
            r9 = r7
            p8.l r9 = (p8.l) r9     // Catch: java.lang.Throwable -> L367
            goto L403
        L402:
            r9 = 0
        L403:
            if (r9 == 0) goto L407
            r7 = r9
            goto L40d
        L407:
            p8.l r7 = p8.j.f(r2)     // Catch: java.lang.Throwable -> L367
            if (r7 == 0) goto L43e
        L40d:
            r0.clear()     // Catch: java.lang.Throwable -> L367
            java.util.concurrent.ConcurrentHashMap r0 = p8.j.f10384e     // Catch: java.lang.Throwable -> L367
            r0.clear()     // Catch: java.lang.Throwable -> L367
            android.app.Activity r0 = p8.j.a()     // Catch: java.lang.Throwable -> L367
            if (r0 == 0) goto L43c
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L367
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L367
            p8.j.f10387h = r2     // Catch: java.lang.Throwable -> L367
            p8.j.f10388i = r5     // Catch: java.lang.Throwable -> L367
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Throwable -> L367
            if (r2 == 0) goto L43a
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Throwable -> L367
            if (r2 == 0) goto L43a
            ac.l r4 = new ac.l     // Catch: java.lang.Throwable -> L367
            r5 = 25
            r4.<init>(r0, r3, r7, r5)     // Catch: java.lang.Throwable -> L367
            r2.post(r4)     // Catch: java.lang.Throwable -> L367
        L43a:
            monitor-exit(r1)
            goto L443
        L43c:
            monitor-exit(r1)
            goto L443
        L43e:
            monitor-exit(r1)
            goto L443
        L440:
            monitor-exit(r1)
            goto L443
        L442:
            monitor-exit(r1)
        L443:
            return
        L444:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L367
            throw r0
        L446:
            r17 = r8
            r18 = r10
            r2.getClass()
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.io.StringWriter r1 = new java.io.StringWriter
            r1.<init>()
            java.io.PrintWriter r3 = new java.io.PrintWriter
            r3.<init>(r1)
            r0.printStackTrace(r3)
            r3.flush()
            java.lang.String r0 = r1.toString()
            r0.getClass()
            java.lang.String r1 = "com.tencent.mm.pluginsdk.ui.chat"
            r3 = r18
            boolean r0 = og.m.h0(r0, r1, r3)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.setResult(r0)
            return
        L47b:
            r17 = r8
            r3 = r10
            r2.getClass()
            java.lang.Object[] r0 = r2.args
            r0.getClass()
            java.lang.Object r0 = tf.l.C0(r3, r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L491
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L492
        L491:
            r0 = 0
        L492:
            if (r0 == 0) goto L50c
            java.util.concurrent.ConcurrentHashMap r1 = k9.i.f7500c
            java.lang.Object r3 = r1.get(r0)
            k9.h r3 = (k9.h) r3
            if (r3 == 0) goto L50c
            java.lang.ref.WeakReference r4 = r3.f7495a
            java.lang.Object r4 = r4.get()
            android.app.Activity r4 = (android.app.Activity) r4
            if (r4 != 0) goto L4ac
            r1.remove(r0, r3)
            goto L50c
        L4ac:
            java.lang.Object r5 = r2.thisObject
            if (r5 != r4) goto L50c
            boolean r0 = r1.remove(r0, r3)
            if (r0 != 0) goto L4b7
            goto L50c
        L4b7:
            java.lang.Object[] r0 = r2.args
            r0.getClass()
            r1 = r17
            java.lang.Object r0 = tf.l.C0(r1, r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L4c9
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L4ca
        L4c9:
            r0 = 0
        L4ca:
            if (r0 == 0) goto L50c
            int r0 = r0.intValue()
            java.lang.Object[] r1 = r2.args
            r1.getClass()
            r2 = 2
            java.lang.Object r1 = tf.l.C0(r2, r1)
            boolean r2 = r1 instanceof android.content.Intent
            if (r2 == 0) goto L4e1
            android.content.Intent r1 = (android.content.Intent) r1
            goto L4e2
        L4e1:
            r1 = 0
        L4e2:
            if (r1 == 0) goto L4e9
            android.net.Uri r9 = r1.getData()
            goto L4ea
        L4e9:
            r9 = 0
        L4ea:
            if (r0 != r6) goto L505
            if (r9 != 0) goto L4ef
            goto L505
        L4ef:
            java.lang.Thread r6 = new java.lang.Thread
            ac.l r0 = new ac.l
            r5 = 18
            r1 = r24
            r2 = r4
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.String r1 = "Hchat-FloatingShortcutIcon"
            r6.<init>(r0, r1)
            r6.start()
            goto L50c
        L505:
            wb.da r0 = r3.f7497c
            k9.e r1 = k9.e.f7492a
            r0.invoke(r1)
        L50c:
            return
        L50d:
            r2.getClass()
            java.lang.Object r0 = r2.thisObject
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L51a
            r9 = r0
            android.app.Activity r9 = (android.app.Activity) r9
            goto L51b
        L51a:
            r9 = 0
        L51b:
            if (r9 == 0) goto L558
            java.util.concurrent.ConcurrentHashMap r0 = k9.i.f7500c
            java.util.Set r0 = r0.entrySet()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L52c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L558
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            k9.h r2 = (k9.h) r2
            java.lang.ref.WeakReference r2 = r2.f7495a
            java.lang.Object r2 = r2.get()
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 == 0) goto L54a
            if (r2 != r9) goto L52c
        L54a:
            java.util.concurrent.ConcurrentHashMap r2 = k9.i.f7500c
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r2.remove(r3, r1)
            goto L52c
        L558:
            return
        L559:
            if (r2 == 0) goto L561
            java.lang.Object r0 = r2.thisObject
            if (r0 == 0) goto L561
            j8.n.f6811e = r0
        L561:
            return
        L562:
            r2.getClass()
            java.lang.Object[] r0 = r2.args
            r0.getClass()
            r3 = 0
            java.lang.Object r0 = tf.l.C0(r3, r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L576
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L577
        L576:
            r0 = 0
        L577:
            if (r0 == 0) goto L5e9
            java.util.concurrent.ConcurrentHashMap r1 = d9.f.f2098c
            java.lang.Object r0 = r1.remove(r0)
            d9.e r0 = (d9.e) r0
            if (r0 == 0) goto L5e9
            java.lang.Object[] r1 = r2.args
            r1.getClass()
            r3 = 1
            java.lang.Object r1 = tf.l.C0(r3, r1)
            boolean r3 = r1 instanceof java.lang.Integer
            if (r3 == 0) goto L594
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L595
        L594:
            r1 = 0
        L595:
            if (r1 == 0) goto L5e9
            int r1 = r1.intValue()
            java.lang.Object[] r2 = r2.args
            r2.getClass()
            r3 = 2
            java.lang.Object r2 = tf.l.C0(r3, r2)
            boolean r3 = r2 instanceof android.content.Intent
            if (r3 == 0) goto L5ac
            android.content.Intent r2 = (android.content.Intent) r2
            goto L5ad
        L5ac:
            r2 = 0
        L5ad:
            if (r2 == 0) goto L5b4
            android.net.Uri r9 = r2.getData()
            goto L5b5
        L5b4:
            r9 = 0
        L5b5:
            if (r1 != r6) goto L5e9
            if (r9 != 0) goto L5ba
            goto L5e9
        L5ba:
            android.app.Activity r1 = r0.f2092a
            java.lang.String r3 = r9.getScheme()
            java.lang.String r4 = "content"
            boolean r3 = gg.l.a(r3, r4)
            if (r3 != 0) goto L5c9
            goto L5d9
        L5c9:
            int r2 = r2.getFlags()     // Catch: java.lang.Throwable -> L5d9
            r2 = r2 & 64
            if (r2 == 0) goto L5d9
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L5d9
            r3 = 1
            r1.takePersistableUriPermission(r9, r3)     // Catch: java.lang.Throwable -> L5d9
        L5d9:
            java.lang.Thread r1 = new java.lang.Thread
            a1.d r2 = new a1.d
            r3 = 6
            r2.<init>(r0, r3, r9)
            java.lang.String r0 = "Hchat-CustomAvatarSave"
            r1.<init>(r2, r0)
            r1.start()
        L5e9:
            return
        L5ea:
            r2.getClass()
            java.lang.ThreadLocal r0 = c9.d2.f1146j
            r0.remove()
            return
        L5f3:
            r16 = 4
            r2.getClass()
            c9.d2 r0 = c9.d2.f1137a
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.Object[] r0 = r2.args
            if (r0 == 0) goto L606
            r3 = 0
            java.lang.Object r0 = tf.l.C0(r3, r0)
            goto L607
        L606:
            r0 = 0
        L607:
            boolean r3 = r0 instanceof android.view.ContextMenu
            if (r3 == 0) goto L60f
            android.view.ContextMenu r0 = (android.view.ContextMenu) r0
            r3 = r0
            goto L610
        L60f:
            r3 = 0
        L610:
            if (r3 == 0) goto L7ed
            java.lang.Object[] r0 = r2.args
            if (r0 == 0) goto L61c
            r4 = 1
            java.lang.Object r0 = tf.l.C0(r4, r0)
            goto L61d
        L61c:
            r0 = 0
        L61d:
            boolean r4 = r0 instanceof android.view.View
            if (r4 == 0) goto L624
            android.view.View r0 = (android.view.View) r0
            goto L625
        L624:
            r0 = 0
        L625:
            if (r0 == 0) goto L7ed
            android.content.Context r0 = r0.getContext()
            android.app.Activity r4 = c9.d2.l(r0)
            if (r4 == 0) goto L7ed
            java.lang.String r0 = "Hchat_conversation_groups"
            android.content.SharedPreferences r0 = ub.b.c(r4, r0)
            java.lang.String r5 = "enabled"
            r7 = 0
            boolean r0 = r0.getBoolean(r5, r7)
            if (r0 != 0) goto L642
            goto L7ed
        L642:
            java.lang.Object r0 = r2.thisObject
            if (r0 == 0) goto L6a9
            java.lang.Class r5 = r0.getClass()
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredFields(r5)
            dg.n r5 = tf.m.m1(r5)
            b4.b r8 = new b4.b
            r10 = 5
            r8.<init>(r10)
            ng.i r9 = new ng.i
            r9.<init>(r5, r7, r8)
            c9.k1 r5 = new c9.k1
            r5.<init>(r0, r7)
            ng.i r0 = ng.m.X(r9, r5)
            b4.b r5 = new b4.b
            r7 = 2
            r5.<init>(r7)
            ng.i r0 = ng.m.X(r0, r5)
            ng.h r5 = new ng.h
            r5.<init>(r0)
        L675:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L698
            java.lang.Object r0 = r5.next()
            r7 = r0
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.Class r8 = r7.getReturnType()
            java.lang.Class r9 = java.lang.Void.TYPE
            boolean r8 = gg.l.a(r8, r9)
            if (r8 == 0) goto L675
            java.lang.String r8 = "com.tencent.mm.ui.conversation."
            r9 = 0
            boolean r7 = eh.a.A(r7, r9, r8)
            if (r7 == 0) goto L675
            goto L699
        L698:
            r0 = 0
        L699:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto L6a9
            ba.f r5 = new ba.f
            r7 = 9
            r5.<init>(r7)
            boolean r0 = c9.d2.m(r0, r5)
            goto L6aa
        L6a9:
            r0 = 0
        L6aa:
            if (r0 != 0) goto L6ae
            goto L7ed
        L6ae:
            java.lang.Object r0 = r2.thisObject
            if (r0 == 0) goto L72b
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r2 = h.Hchat.hooks.api.core.WeChatApis.database()
            if (r2 == 0) goto L72b
            java.lang.Class r5 = r0.getClass()
        L6bc:
            if (r5 == 0) goto L72b
            boolean r7 = r5.equals(r1)
            if (r7 != 0) goto L72b
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredFields(r5)
            dg.n r7 = tf.m.m1(r7)
            b4.b r8 = new b4.b
            r9 = r16
            r8.<init>(r9)
            ng.i r10 = new ng.i
            r11 = 1
            r10.<init>(r7, r11, r8)
            c9.k1 r7 = new c9.k1
            r8 = 2
            r7.<init>(r0, r8)
            ng.i r7 = ng.m.X(r10, r7)
            c9.y1 r8 = c9.y1.f1443n
            ng.t r7 = ng.m.W(r7, r8)
            c9.z1 r8 = c9.z1.f1453n
            r8.getClass()
            ng.i r10 = new ng.i
            r10.<init>(r7, r11, r8)
            ng.c r7 = ng.m.S(r10)
            java.util.Iterator r7 = r7.iterator()
        L6fb:
            r8 = r7
            tf.b r8 = (tf.b) r8
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L71e
            java.lang.Object r8 = r8.next()
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = "SELECT username FROM rconversation WHERE username=? LIMIT 1"
            java.lang.String[] r12 = new java.lang.String[]{r10}
            java.lang.String r13 = "username"
            java.lang.String r11 = r2.queryFirstString(r11, r12, r13)
            boolean r10 = gg.l.a(r11, r10)
            if (r10 == 0) goto L6fb
            goto L71f
        L71e:
            r8 = 0
        L71f:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L724
            goto L72c
        L724:
            java.lang.Class r5 = r5.getSuperclass()
            r16 = r9
            goto L6bc
        L72b:
            r8 = 0
        L72c:
            if (r8 == 0) goto L7ed
            r2 = 1212368722(0x48434752, float:199965.28)
            r3.removeItem(r2)
            r7 = 0
            android.view.MenuItem r0 = r3.getItem(r7)     // Catch: java.lang.Throwable -> L743
            int r0 = r0.getGroupId()     // Catch: java.lang.Throwable -> L743
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L743
        L741:
            r7 = 0
            goto L74b
        L743:
            r0 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r0)
            r0 = r5
            goto L741
        L74b:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            boolean r9 = r0 instanceof sf.f
            if (r9 == 0) goto L754
            r0 = r5
        L754:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.String r5 = "聊天分组"
            android.view.MenuItem r0 = r3.add(r0, r2, r7, r5)
            r0.getClass()
            java.lang.Class r5 = r3.getClass()
        L767:
            if (r5 == 0) goto L7de
            boolean r7 = r5.equals(r1)
            if (r7 != 0) goto L7de
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredFields(r5)
            java.util.Iterator r7 = r7.iterator()
        L777:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L7d9
            java.lang.Object r9 = r7.next()
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            java.lang.Class<java.util.List> r10 = java.util.List.class
            java.lang.Class r11 = r9.getType()
            boolean r10 = r10.isAssignableFrom(r11)
            if (r10 != 0) goto L790
            goto L777
        L790:
            java.lang.Object r9 = h.Hchat.utils.KavaReflector.readField(r9, r3)
            boolean r10 = gg.x.e(r9)
            if (r10 == 0) goto L79d
            java.util.List r9 = (java.util.List) r9
            goto L79e
        L79d:
            r9 = 0
        L79e:
            if (r9 == 0) goto L777
            java.util.Iterator r10 = r9.iterator()
            r11 = 0
        L7a5:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L7cb
            java.lang.Object r12 = r10.next()
            if (r12 == r0) goto L7c4
            boolean r13 = r12 instanceof android.view.MenuItem
            if (r13 == 0) goto L7b8
            android.view.MenuItem r12 = (android.view.MenuItem) r12
            goto L7b9
        L7b8:
            r12 = 0
        L7b9:
            if (r12 == 0) goto L7c2
            int r12 = r12.getItemId()
            if (r12 != r2) goto L7c2
            goto L7c4
        L7c2:
            r12 = 0
            goto L7c5
        L7c4:
            r12 = 1
        L7c5:
            if (r12 == 0) goto L7c8
            goto L7cc
        L7c8:
            int r11 = r11 + 1
            goto L7a5
        L7cb:
            r11 = r6
        L7cc:
            if (r11 <= 0) goto L7d6
            java.lang.Object r10 = r9.remove(r11)     // Catch: java.lang.Throwable -> L7d6
            r12 = 0
            r9.add(r12, r10)     // Catch: java.lang.Throwable -> L7d6
        L7d6:
            if (r11 < 0) goto L777
            goto L7de
        L7d9:
            java.lang.Class r5 = r5.getSuperclass()
            goto L767
        L7de:
            java.util.Map r1 = c9.d2.f1142f
            r1.getClass()
            java.util.Map r1 = (java.util.Map) r1
            c9.r1 r2 = new c9.r1
            r2.<init>(r4, r8)
            r1.put(r0, r2)
        L7ed:
            return
        L7ee:
            r2.getClass()
            java.lang.ThreadLocal r0 = c9.d2.f1148l
            java.lang.Object r0 = r0.get()
            c9.u1 r0 = (c9.u1) r0
            if (r0 == 0) goto L8b6
            java.lang.String r1 = r0.f1394b
            boolean r3 = og.m.t0(r1)
            if (r3 != 0) goto L8b6
            boolean r3 = c9.d2.q(r1)
            if (r3 == 0) goto L80b
            goto L8b6
        L80b:
            java.lang.Object[] r2 = r2.args
            if (r2 == 0) goto L815
            r3 = 0
            java.lang.Object r2 = tf.l.C0(r3, r2)
            goto L816
        L815:
            r2 = 0
        L816:
            boolean r3 = r2 instanceof android.view.ContextMenu
            if (r3 == 0) goto L81d
            android.view.ContextMenu r2 = (android.view.ContextMenu) r2
            goto L81e
        L81d:
            r2 = 0
        L81e:
            if (r2 == 0) goto L8b6
            android.app.Activity r3 = r0.f1393a
            java.util.List r3 = c9.o2.i(r3)
            java.util.Iterator r3 = r3.iterator()
        L82a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L84b
            java.lang.Object r4 = r3.next()
            r5 = r4
            c9.a r5 = (c9.a) r5
            java.lang.String r6 = r5.f1081a
            java.lang.String r7 = r0.f1395c
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto L82a
            java.util.List r5 = r5.f1085e
            boolean r5 = r5.contains(r1)
            if (r5 == 0) goto L82a
            r9 = r4
            goto L84c
        L84b:
            r9 = 0
        L84c:
            c9.a r9 = (c9.a) r9
            if (r9 == 0) goto L8b6
            r3 = 1212368736(0x48434760, float:199965.5)
            r2.removeItem(r3)
            r4 = 1212368737(0x48434761, float:199965.52)
            r2.removeItem(r4)
            r5 = 1212368738(0x48434762, float:199965.53)
            r2.removeItem(r5)
            int r6 = r2.size()
            java.lang.String r7 = "移出"
            r12 = 0
            android.view.MenuItem r3 = r2.add(r12, r3, r6, r7)
            int r6 = r2.size()
            java.lang.String r7 = "移至"
            android.view.MenuItem r4 = r2.add(r12, r4, r6, r7)
            java.util.List r6 = r9.f1086f
            boolean r1 = r6.contains(r1)
            int r6 = r2.size()
            if (r1 == 0) goto L886
            java.lang.String r7 = "取消置顶"
            goto L888
        L886:
            java.lang.String r7 = "置顶聊天"
        L888:
            android.view.MenuItem r2 = r2.add(r12, r5, r6, r7)
            java.util.Map r5 = c9.d2.f1143g
            r5.getClass()
            java.util.Map r5 = (java.util.Map) r5
            c9.x1 r6 = new c9.x1
            c9.v1 r7 = c9.v1.f1408g
            r6.<init>(r0, r7)
            r5.put(r3, r6)
            c9.x1 r3 = new c9.x1
            c9.v1 r6 = c9.v1.f1409h
            r3.<init>(r0, r6)
            r5.put(r4, r3)
            c9.x1 r3 = new c9.x1
            if (r1 == 0) goto L8ae
            c9.v1 r1 = c9.v1.f1411j
            goto L8b0
        L8ae:
            c9.v1 r1 = c9.v1.f1410i
        L8b0:
            r3.<init>(r0, r1)
            r5.put(r2, r3)
        L8b6:
            return
        L8b7:
            r2.getClass()
            java.lang.Object r0 = r2.thisObject
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L8c4
            r9 = r0
            android.app.Activity r9 = (android.app.Activity) r9
            goto L8c5
        L8c4:
            r9 = 0
        L8c5:
            if (r9 == 0) goto L902
            java.util.concurrent.ConcurrentHashMap r0 = c9.e.f1156c
            java.util.Set r0 = r0.entrySet()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L8d6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L902
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            c9.d r2 = (c9.d) r2
            java.lang.ref.WeakReference r2 = r2.f1125a
            java.lang.Object r2 = r2.get()
            android.app.Activity r2 = (android.app.Activity) r2
            if (r2 == 0) goto L8f4
            if (r2 != r9) goto L8d6
        L8f4:
            java.util.concurrent.ConcurrentHashMap r2 = c9.e.f1156c
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r2.remove(r3, r1)
            goto L8d6
        L902:
            return
        L903:
            r2.getClass()
            java.lang.Object[] r0 = r2.args
            r0.getClass()
            r3 = 0
            java.lang.Object r0 = tf.l.C0(r3, r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L917
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L918
        L917:
            r0 = 0
        L918:
            if (r0 == 0) goto L992
            java.util.concurrent.ConcurrentHashMap r1 = ba.g.f565c
            java.lang.Object r0 = r1.remove(r0)
            ba.d r0 = (ba.d) r0
            if (r0 == 0) goto L992
            java.lang.Object[] r1 = r2.args
            r1.getClass()
            r3 = 1
            java.lang.Object r1 = tf.l.C0(r3, r1)
            boolean r3 = r1 instanceof java.lang.Integer
            if (r3 == 0) goto L935
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L936
        L935:
            r1 = 0
        L936:
            if (r1 == 0) goto L992
            int r1 = r1.intValue()
            java.lang.Object[] r2 = r2.args
            r2.getClass()
            r3 = 2
            java.lang.Object r2 = tf.l.C0(r3, r2)
            boolean r3 = r2 instanceof android.content.Intent
            if (r3 == 0) goto L94d
            android.content.Intent r2 = (android.content.Intent) r2
            goto L94e
        L94d:
            r2 = 0
        L94e:
            if (r2 == 0) goto L955
            android.net.Uri r9 = r2.getData()
            goto L956
        L955:
            r9 = 0
        L956:
            if (r1 != r6) goto L98b
            if (r9 != 0) goto L95b
            goto L98b
        L95b:
            android.app.Activity r1 = r0.f556a
            java.lang.String r3 = r9.getScheme()
            java.lang.String r4 = "content"
            boolean r3 = gg.l.a(r3, r4)
            if (r3 != 0) goto L96a
            goto L97a
        L96a:
            int r2 = r2.getFlags()     // Catch: java.lang.Throwable -> L97a
            r2 = r2 & 64
            if (r2 == 0) goto L97a
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L97a
            r3 = 1
            r1.takePersistableUriPermission(r9, r3)     // Catch: java.lang.Throwable -> L97a
        L97a:
            java.lang.Thread r1 = new java.lang.Thread
            a1.d r2 = new a1.d
            r3 = 3
            r2.<init>(r0, r3, r9)
            java.lang.String r0 = "Hchat-MessageBubbleSave"
            r1.<init>(r2, r0)
            r1.start()
            goto L992
        L98b:
            wb.dj r0 = r0.f558c
            ba.b r1 = ba.b.f552h
            r0.invoke(r1)
        L992:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r13) {
            r12 = this;
            int r0 = r12.f562a
            r1 = 2
            java.lang.String r2 = "com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI"
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r4 = 6
            java.lang.String r5 = "Hchat"
            r6 = 1
            r7 = 0
            r8 = 0
            switch(r0) {
                case 2: goto L3d4;
                case 3: goto L3a2;
                case 4: goto L10;
                case 5: goto L10;
                case 6: goto L382;
                case 7: goto L359;
                case 8: goto L332;
                case 9: goto L2f9;
                case 10: goto L291;
                case 11: goto L1b7;
                case 12: goto L10;
                case 13: goto L199;
                case 14: goto L10;
                case 15: goto L10;
                case 16: goto L10;
                case 17: goto L102;
                case 18: goto Le2;
                case 19: goto L10;
                case 20: goto L10;
                case 21: goto L10;
                case 22: goto Lcf;
                case 23: goto Lab;
                case 24: goto L92;
                case 25: goto L87;
                case 26: goto L31;
                case 27: goto L14;
                default: goto L10;
            }
        L10:
            super.beforeHookedMethod(r13)
            return
        L14:
            java.lang.Object[] r0 = r13.args
            if (r0 == 0) goto L30
            int r1 = r0.length
            r2 = 4
            if (r1 >= r2) goto L1d
            goto L30
        L1d:
            r1 = 3
            r0 = r0[r1]
            if (r0 == 0) goto L2e
            java.util.Map r1 = wa.j.f14926b
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L30
            r13.setResult(r7)
            goto L30
        L2e:
            wa.g r13 = wa.j.f14925a
        L30:
            return
        L31:
            r13.getClass()
            java.lang.Object r0 = r13.thisObject
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L3d
            android.app.Activity r0 = (android.app.Activity) r0
            goto L3e
        L3d:
            r0 = r7
        L3e:
            if (r0 == 0) goto L86
            java.lang.Object[] r1 = r13.args
            r1.getClass()
            java.lang.Object r1 = tf.l.C0(r6, r1)
            if (r1 == 0) goto L86
            java.lang.String r1 = uf.d.J(r1)
            java.lang.String r2 = "hchat_profile_id"
            boolean r1 = gg.l.a(r1, r2)
            if (r1 != 0) goto L58
            goto L86
        L58:
            va.b r1 = va.b.f14296h
            java.lang.String r1 = uf.d.K(r0, r1)
            if (r1 == 0) goto L86
            java.lang.String r2 = "clipboard"
            java.lang.Object r2 = r0.getSystemService(r2)
            boolean r3 = r2 instanceof android.content.ClipboardManager
            if (r3 == 0) goto L6d
            r7 = r2
            android.content.ClipboardManager r7 = (android.content.ClipboardManager) r7
        L6d:
            if (r7 == 0) goto L78
            java.lang.String r2 = "ID"
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r2, r1)
            r7.setPrimaryClip(r1)
        L78:
            java.lang.String r1 = "已复制ID"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r8)
            r0.show()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r13.setResult(r0)
        L86:
            return
        L87:
            r13.getClass()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r13.setResult(r0)
            return
        L92:
            java.lang.Object r0 = r13.thisObject     // Catch: java.lang.Throwable -> Laa
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> Laa
            java.lang.Object[] r13 = r13.args     // Catch: java.lang.Throwable -> Laa
            r13 = r13[r8]     // Catch: java.lang.Throwable -> Laa
            android.content.Intent r13 = (android.content.Intent) r13     // Catch: java.lang.Throwable -> Laa
            if (r13 == 0) goto Laa
            boolean r13 = r13.hasExtra(r5)     // Catch: java.lang.Throwable -> Laa
            if (r13 == 0) goto Laa
            r0.getClass()     // Catch: java.lang.Throwable -> Laa
            a7.a.S(r0, r7, r8)     // Catch: java.lang.Throwable -> Laa
        Laa:
            return
        Lab:
            java.lang.Object r13 = r13.thisObject     // Catch: java.lang.Throwable -> Lce
            android.app.Activity r13 = (android.app.Activity) r13     // Catch: java.lang.Throwable -> Lce
            android.content.Intent r0 = r13.getIntent()     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto Lce
            boolean r0 = r0.hasExtra(r5)     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto Lce
            android.os.Handler r0 = new android.os.Handler     // Catch: java.lang.Throwable -> Lce
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> Lce
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lce
            h.Hchat.crash.d r1 = new h.Hchat.crash.d     // Catch: java.lang.Throwable -> Lce
            r1.<init>(r12, r13)     // Catch: java.lang.Throwable -> Lce
            r2 = 500(0x1f4, double:2.47E-321)
            r0.postDelayed(r1, r2)     // Catch: java.lang.Throwable -> Lce
        Lce:
            return
        Lcf:
            java.lang.Object[] r0 = r13.args
            r0 = r0[r8]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = -1212373076(0xffffffffb7bca7ac, float:-2.2489425E-5)
            if (r0 != r1) goto Le1
            r13.setResult(r5)
        Le1:
            return
        Le2:
            r13.getClass()
            java.lang.Object[] r13 = r13.args
            if (r13 == 0) goto Lee
            java.lang.Object r13 = tf.l.z0(r13)
            goto Lef
        Lee:
            r13 = r7
        Lef:
            boolean r0 = r13 instanceof android.widget.Button
            if (r0 == 0) goto Lf6
            r7 = r13
            android.widget.Button r7 = (android.widget.Button) r7
        Lf6:
            if (r7 == 0) goto L101
            int r13 = r7.getVisibility()
            if (r13 == 0) goto L101
            r7.setVisibility(r8)
        L101:
            return
        L102:
            r13.getClass()
            java.lang.Object r0 = r13.thisObject
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L10e
            android.app.Activity r0 = (android.app.Activity) r0
            goto L10f
        L10e:
            r0 = r7
        L10f:
            if (r0 == 0) goto L198
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r2 = "hchat_silent_repeat"
            boolean r1 = r1.getBooleanExtra(r2, r8)
            if (r1 != 0) goto L11f
            goto L198
        L11f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r3 = "Select_Conv_User"
            java.lang.String r2 = r2.getStringExtra(r3)
            if (r2 == 0) goto L17f
            char[] r3 = new char[r6]
            r5 = 44
            r3[r8] = r5
            java.util.List r2 = og.m.F0(r2, r3, r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = tf.n.e1(r2)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L147:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L157
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            j8.b.r(r4, r3)
            goto L147
        L157:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r3.iterator()
        L160:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L17c
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            int r5 = r5.length()
            if (r5 <= 0) goto L175
            r5 = r6
            goto L176
        L175:
            r5 = r8
        L176:
            if (r5 == 0) goto L160
            r2.add(r4)
            goto L160
        L17c:
            r1.addAll(r2)
        L17f:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "SendMsgUsernames"
            r2.putStringArrayListExtra(r3, r1)
            java.lang.String r1 = "sendResult"
            r2.putExtra(r1, r8)
            r1 = -1
            r0.setResult(r1, r2)
            r0.finish()
            r13.setResult(r7)
        L198:
            return
        L199:
            r13.getClass()
            java.lang.ThreadLocal r0 = e9.q.f2471l
            java.lang.Object r0 = r0.get()
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            if (r0 == 0) goto L1b0
            java.lang.Object r0 = r0.peekLast()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r8 = gg.l.a(r0, r1)
        L1b0:
            if (r8 != 0) goto L1b3
            goto L1b6
        L1b3:
            r13.setResult(r7)
        L1b6:
            return
        L1b7:
            r13.getClass()
            c9.d2 r0 = c9.d2.f1137a
            java.lang.Object r0 = r13.thisObject
            if (r0 != 0) goto L1c1
            goto L1f9
        L1c1:
            java.lang.Class r5 = r0.getClass()
        L1c5:
            if (r5 == 0) goto L1f9
            boolean r9 = r5.equals(r3)
            if (r9 != 0) goto L1f9
            java.util.List r9 = h.Hchat.utils.KavaReflector.declaredFields(r5)
            java.util.Iterator r9 = r9.iterator()
        L1d5:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L1f4
            java.lang.Object r10 = r9.next()
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            java.lang.Class r11 = r10.getType()
            java.lang.String r11 = r11.getName()
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L1d5
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r10, r0)
            goto L1fa
        L1f4:
            java.lang.Class r5 = r5.getSuperclass()
            goto L1c5
        L1f9:
            r0 = r7
        L1fa:
            if (r0 == 0) goto L290
            c9.d2 r2 = c9.d2.f1137a
            java.lang.String r2 = c9.d2.v(r0)
            if (r2 == 0) goto L290
            java.lang.Object[] r2 = r13.args
            if (r2 == 0) goto L20d
            java.lang.Object r2 = tf.l.C0(r8, r2)
            goto L20e
        L20d:
            r2 = r7
        L20e:
            boolean r3 = r2 instanceof android.widget.AdapterView
            if (r3 == 0) goto L215
            android.widget.AdapterView r2 = (android.widget.AdapterView) r2
            goto L216
        L215:
            r2 = r7
        L216:
            if (r2 == 0) goto L290
            java.lang.Object[] r3 = r13.args
            if (r3 == 0) goto L221
            java.lang.Object r3 = tf.l.C0(r6, r3)
            goto L222
        L221:
            r3 = r7
        L222:
            boolean r5 = r3 instanceof android.view.View
            if (r5 == 0) goto L229
            android.view.View r3 = (android.view.View) r3
            goto L22a
        L229:
            r3 = r7
        L22a:
            if (r3 == 0) goto L290
            java.lang.Object[] r5 = r13.args
            if (r5 == 0) goto L235
            java.lang.Object r1 = tf.l.C0(r1, r5)
            goto L236
        L235:
            r1 = r7
        L236:
            boolean r5 = r1 instanceof java.lang.Integer
            if (r5 == 0) goto L23d
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L23e
        L23d:
            r1 = r7
        L23e:
            if (r1 == 0) goto L290
            int r1 = r1.intValue()
            java.lang.Object r1 = r2.getItemAtPosition(r1)     // Catch: java.lang.Throwable -> L249
            goto L250
        L249:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L250:
            boolean r2 = r1 instanceof sf.f
            if (r2 == 0) goto L256
            r1 = r7
        L256:
            if (r1 == 0) goto L290
            c9.d2 r2 = c9.d2.f1137a
            java.lang.String r2 = c9.d2.i(r1)
            android.content.Context r3 = r3.getContext()
            android.app.Activity r3 = c9.d2.l(r3)
            if (r3 == 0) goto L290
            r13.setResult(r7)
            if (r2 == 0) goto L27f
            boolean r13 = og.m.t0(r2)
            if (r13 == 0) goto L274
            goto L27f
        L274:
            android.os.Handler r13 = c9.d2.f1150n
            ac.l r1 = new ac.l
            r1.<init>(r3, r0, r2, r4)
            r13.post(r1)
            goto L290
        L27f:
            java.lang.Class r13 = r1.getClass()
            java.lang.String r13 = r13.getName()
            java.lang.String r0 = "[Hchat:ConversationGroup] 微信原生分组列表无法解析会话: item="
            java.lang.String r13 = r0.concat(r13)
            fb.v0.m(r13)
        L290:
            return
        L291:
            r13.getClass()
            java.lang.Object r0 = r13.thisObject
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L2f8
            java.lang.Object[] r0 = r13.args
            if (r0 == 0) goto L2ad
            java.lang.Object r0 = tf.l.C0(r8, r0)
            goto L2ae
        L2ad:
            r0 = r7
        L2ae:
            java.lang.String r1 = "Contact_User"
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2b7
            goto L2f8
        L2b7:
            java.lang.Object r0 = r13.thisObject
            java.lang.String r2 = "getActivity"
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeMethod(r0, r2, r3)
            if (r0 == 0) goto L2c4
            goto L2ce
        L2c4:
            java.lang.Object r0 = r13.thisObject
            java.lang.String r2 = "thisActivity"
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeMethod(r0, r2, r3)
        L2ce:
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L2d5
            android.app.Activity r0 = (android.app.Activity) r0
            goto L2d6
        L2d5:
            r0 = r7
        L2d6:
            if (r0 == 0) goto L2f8
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L2f8
            java.lang.String r0 = r0.getStringExtra(r1)
            if (r0 == 0) goto L2f8
            boolean r1 = c9.d2.q(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L2f3
            r7 = r0
        L2f3:
            if (r7 == 0) goto L2f8
            r13.setResult(r7)
        L2f8:
            return
        L2f9:
            r13.getClass()
            java.lang.Object[] r0 = r13.args
            if (r0 == 0) goto L305
            java.lang.Object r0 = tf.l.C0(r8, r0)
            goto L306
        L305:
            r0 = r7
        L306:
            boolean r1 = r0 instanceof android.view.MenuItem
            if (r1 == 0) goto L30d
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            goto L30e
        L30d:
            r0 = r7
        L30e:
            if (r0 == 0) goto L331
            int r1 = r0.getItemId()
            r2 = 1212368722(0x48434752, float:199965.28)
            if (r1 == r2) goto L31a
            goto L331
        L31a:
            java.util.Map r1 = c9.d2.f1142f
            java.lang.Object r0 = r1.remove(r0)
            c9.r1 r0 = (c9.r1) r0
            if (r0 == 0) goto L331
            r13.setResult(r7)
            android.os.Handler r13 = c9.d2.f1150n
            a1.a r1 = new a1.a
            r1.<init>(r0, r4)
            r13.post(r1)
        L331:
            return
        L332:
            r13.getClass()
            java.lang.ThreadLocal r0 = c9.d2.f1147k
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = c9.d2.q(r0)
            if (r0 == 0) goto L358
            java.lang.Object[] r0 = r13.args
            if (r0 == 0) goto L34c
            java.lang.Object r0 = tf.l.C0(r8, r0)
            goto L34d
        L34c:
            r0 = r7
        L34d:
            java.lang.String r1 = "@placeholder_foldgroup"
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L358
            r13.setResult(r7)
        L358:
            return
        L359:
            r13.getClass()
            java.lang.ThreadLocal r0 = c9.d2.f1146j
            r0.remove()
            java.util.Map r1 = c9.d2.f1144h
            java.lang.Object r13 = r13.thisObject
            java.lang.Object r13 = r1.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto L381
            boolean r1 = c9.d2.q(r13)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L37c
            r7 = r13
        L37c:
            if (r7 == 0) goto L381
            r0.set(r7)
        L381:
            return
        L382:
            r13.getClass()
            java.lang.Object[] r0 = r13.args
            if (r0 == 0) goto L38e
            java.lang.Object r0 = tf.l.C0(r8, r0)
            goto L38f
        L38e:
            r0 = r7
        L38f:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L396
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
        L396:
            boolean r0 = c9.d2.q(r7)
            if (r0 == 0) goto L3a1
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r13.setResult(r0)
        L3a1:
            return
        L3a2:
            r13.getClass()
            c9.d2 r0 = c9.d2.f1137a
            java.lang.Object[] r0 = r13.args
            if (r0 == 0) goto L3b0
            java.lang.Object r0 = tf.l.C0(r8, r0)
            goto L3b1
        L3b0:
            r0 = r7
        L3b1:
            boolean r1 = r0 instanceof android.view.MenuItem
            if (r1 == 0) goto L3b8
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            goto L3b9
        L3b8:
            r0 = r7
        L3b9:
            if (r0 == 0) goto L3d3
            java.util.Map r1 = c9.d2.f1143g
            java.lang.Object r0 = r1.remove(r0)
            c9.x1 r0 = (c9.x1) r0
            if (r0 == 0) goto L3d3
            r13.setResult(r7)
            android.os.Handler r13 = c9.d2.f1150n
            a1.a r1 = new a1.a
            r2 = 5
            r1.<init>(r0, r2)
            r13.post(r1)
        L3d3:
            return
        L3d4:
            r13.getClass()
            java.lang.Object[] r0 = r13.args
            if (r0 == 0) goto L3e0
            java.lang.Object r0 = tf.l.C0(r8, r0)
            goto L3e1
        L3e0:
            r0 = r7
        L3e1:
            boolean r2 = r0 instanceof android.widget.AdapterView
            if (r2 == 0) goto L3e8
            android.widget.AdapterView r0 = (android.widget.AdapterView) r0
            goto L3e9
        L3e8:
            r0 = r7
        L3e9:
            if (r0 == 0) goto L49f
            java.lang.Object[] r2 = r13.args
            if (r2 == 0) goto L3f4
            java.lang.Object r2 = tf.l.C0(r6, r2)
            goto L3f5
        L3f4:
            r2 = r7
        L3f5:
            boolean r4 = r2 instanceof android.view.View
            if (r4 == 0) goto L3fc
            android.view.View r2 = (android.view.View) r2
            goto L3fd
        L3fc:
            r2 = r7
        L3fd:
            if (r2 == 0) goto L49f
            java.lang.Object[] r4 = r13.args
            if (r4 == 0) goto L408
            java.lang.Object r1 = tf.l.C0(r1, r4)
            goto L409
        L408:
            r1 = r7
        L409:
            boolean r4 = r1 instanceof java.lang.Integer
            if (r4 == 0) goto L410
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L411
        L410:
            r1 = r7
        L411:
            if (r1 == 0) goto L49f
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.getItemAtPosition(r1)     // Catch: java.lang.Throwable -> L41c
            goto L423
        L41c:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L423:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L429
            r0 = r7
        L429:
            if (r0 == 0) goto L49f
            c9.d2 r1 = c9.d2.f1137a
            java.lang.String r1 = c9.d2.i(r0)
            if (r1 == 0) goto L43a
            boolean r4 = c9.d2.q(r1)
            if (r4 == 0) goto L43a
            goto L43b
        L43a:
            r1 = r7
        L43b:
            if (r1 == 0) goto L43e
            goto L484
        L43e:
            java.lang.Class r1 = r0.getClass()
        L442:
            if (r1 == 0) goto L483
            boolean r4 = r1.equals(r3)
            if (r4 != 0) goto L483
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r4 = r4.iterator()
        L452:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L47e
            java.lang.Object r5 = r4.next()
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            java.lang.Class r8 = r5.getType()
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            boolean r8 = gg.l.a(r8, r9)
            if (r8 == 0) goto L452
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.readField(r5, r0)
            boolean r8 = r5 instanceof java.lang.String
            if (r8 == 0) goto L475
            java.lang.String r5 = (java.lang.String) r5
            goto L476
        L475:
            r5 = r7
        L476:
            boolean r8 = c9.d2.q(r5)
            if (r8 == 0) goto L452
            r1 = r5
            goto L484
        L47e:
            java.lang.Class r1 = r1.getSuperclass()
            goto L442
        L483:
            r1 = r7
        L484:
            if (r1 == 0) goto L49f
            c9.d2 r0 = c9.d2.f1137a
            android.content.Context r0 = r2.getContext()
            android.app.Activity r0 = c9.d2.l(r0)
            if (r0 == 0) goto L49f
            r13.setResult(r7)
            android.os.Handler r13 = c9.d2.f1150n
            c9.t r2 = new c9.t
            r2.<init>(r0, r1, r6)
            r13.post(r2)
        L49f:
            return
    }
}
