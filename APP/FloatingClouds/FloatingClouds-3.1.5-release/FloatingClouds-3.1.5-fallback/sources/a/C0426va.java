package a;

/* JADX INFO: renamed from: a.va, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0426va implements top.mmjz.floatingclouds.plugin.IPlugin {
    public static final a.C0426va.a g = null;
    public static final android.media.AudioAttributes h = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile java.lang.reflect.Field f737a;
    public volatile java.lang.reflect.Field b;
    public volatile java.lang.reflect.Field c;
    public boolean d;
    public long e;
    public long f;

    /* JADX INFO: renamed from: a.va$a */
    public static final class a {
        public static void a(android.os.Vibrator r8, int r9) {
                r0 = 0
                r1 = 100
                int r9 = a.Oc.C(r9, r0, r1)
                r2 = 30
                if (r9 > 0) goto Lc
                goto L13
            Lc:
                r4 = 270(0x10e, double:1.334E-321)
                long r6 = (long) r9
                long r6 = r6 * r4
                long r0 = (long) r1
                long r6 = r6 / r0
                long r2 = r2 + r6
            L13:
                boolean r0 = r8.hasAmplitudeControl()
                if (r0 == 0) goto L2e
                r0 = 1
                if (r9 > 0) goto L1d
                goto L29
            L1d:
                int r1 = r9 * 254
                int r1 = r1 * r9
                int r1 = r1 / 10000
                int r1 = r1 + r0
                r9 = 255(0xff, float:3.57E-43)
                int r0 = a.Oc.C(r1, r0, r9)
            L29:
                android.os.VibrationEffect r9 = android.os.VibrationEffect.createOneShot(r2, r0)
                goto L33
            L2e:
                r9 = -1
                android.os.VibrationEffect r9 = android.os.VibrationEffect.createOneShot(r2, r9)
            L33:
                android.media.AudioAttributes r0 = a.C0426va.h
                r8.vibrate(r9, r0)
                return
        }
    }

    static {
            a.va$a r0 = new a.va$a
            r0.<init>()
            a.C0426va.g = r0
            android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
            r0.<init>()
            r1 = 4
            android.media.AudioAttributes$Builder r0 = r0.setUsage(r1)
            android.media.AudioAttributes$Builder r0 = r0.setContentType(r1)
            android.media.AudioAttributes r0 = r0.build()
            a.C0426va.h = r0
            return
    }

    public static void a(java.lang.String r1) {
            java.lang.String r0 = "[MaskedMsgVibrate] "
            java.lang.String r1 = a.C0487z.k(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            a.C0453x1.b(r1)
            return
    }

    public final void b(java.lang.Object r13, java.lang.ClassLoader r14) {
            r12 = this;
            java.lang.String r0 = "onInsert skip: dedup ("
            if (r13 != 0) goto La
            java.lang.String r13 = "onInsert skip: msgObj null"
            a(r13)
            return
        La:
            a.K3$a r1 = a.K3.f148a
            r1.getClass()
            boolean r1 = a.K3.a.l()
            if (r1 != 0) goto L1b
            java.lang.String r13 = "onInsert skip: master disabled"
            a(r13)
            return
        L1b:
            a.jc r1 = a.K3.a.i()
            boolean r1 = r1.J
            if (r1 != 0) goto L29
            java.lang.String r13 = "onInsert skip: switch off"
            a(r13)
            return
        L29:
            java.lang.String r1 = "field_talker"
            java.lang.Object r1 = a.A1.h(r13, r1)
            boolean r2 = r1 instanceof java.lang.String
            r3 = 0
            if (r2 == 0) goto L37
            java.lang.String r1 = (java.lang.String) r1
            goto L38
        L37:
            r1 = r3
        L38:
            if (r1 == 0) goto L1f1
            boolean r2 = a.Be.P(r1)
            if (r2 != 0) goto L41
            goto L42
        L41:
            r1 = r3
        L42:
            if (r1 != 0) goto L46
            goto L1f1
        L46:
            java.util.concurrent.ExecutorService r2 = a.fh.G
            boolean r2 = a.fh.a.a(r1)
            if (r2 != 0) goto L65
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "onInsert skip: not masked ("
            r13.<init>(r14)
            r13.append(r1)
            java.lang.String r14 = ")"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            a(r13)
            return
        L65:
            java.lang.reflect.Field r2 = r12.b
            r4 = 0
            if (r2 != 0) goto L6b
            goto L9f
        L6b:
            java.lang.Object r2 = r2.get(r13)     // Catch: java.lang.Throwable -> L7a
            boolean r5 = r2 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L7a
            if (r5 == 0) goto L7c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L7a
            boolean r4 = r2.booleanValue()     // Catch: java.lang.Throwable -> L7a
            goto L89
        L7a:
            r2 = move-exception
            goto L8e
        L7c:
            boolean r5 = r2 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L7a
            if (r5 == 0) goto L89
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> L7a
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L7a
            if (r2 == 0) goto L89
            r4 = 1
        L89:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L7a
            goto L92
        L8e:
            a.wd$a r2 = a.C0465xd.a(r2)
        L92:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r5 = r2 instanceof a.C0447wd.a
            if (r5 == 0) goto L99
            r2 = r4
        L99:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r4 = r2.booleanValue()
        L9f:
            if (r4 == 0) goto Lb8
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "onInsert skip: self-sent ("
            r13.<init>(r14)
            r13.append(r1)
            java.lang.String r14 = ")"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            a(r13)
            return
        Lb8:
            java.util.concurrent.ExecutorService r2 = a.fh.G
            java.lang.String r2 = "cl"
            a.C0193i9.e(r14, r2)
            a.Gb r14 = a.Gb.f99a
            r14.getClass()
            java.lang.reflect.Method r14 = a.Gb.e
            if (r14 == 0) goto L109
            java.lang.reflect.Field r14 = a.Gb.f
            if (r14 != 0) goto Lcd
            goto L109
        Lcd:
            java.lang.reflect.Method r14 = a.Gb.e     // Catch: java.lang.Throwable -> Lef
            a.C0193i9.b(r14)     // Catch: java.lang.Throwable -> Lef
            java.lang.Object r2 = a.Gb.c     // Catch: java.lang.Throwable -> Lef
            java.lang.Object[] r4 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> Lef
            java.lang.Object r14 = r14.invoke(r2, r4)     // Catch: java.lang.Throwable -> Lef
            if (r14 != 0) goto Ldf
            goto L109
        Ldf:
            java.lang.reflect.Field r2 = a.Gb.f     // Catch: java.lang.Throwable -> Lef
            a.C0193i9.b(r2)     // Catch: java.lang.Throwable -> Lef
            java.lang.Object r14 = r2.get(r14)     // Catch: java.lang.Throwable -> Lef
            boolean r2 = r14 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lef
            if (r2 == 0) goto Lf1
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> Lef
            goto Lf2
        Lef:
            r14 = move-exception
            goto Lfd
        Lf1:
            r14 = r3
        Lf2:
            java.lang.String r2 = "hidden_conv_parent"
            boolean r14 = a.C0193i9.a(r14, r2)     // Catch: java.lang.Throwable -> Lef
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch: java.lang.Throwable -> Lef
            goto L101
        Lfd:
            a.wd$a r14 = a.C0465xd.a(r14)
        L101:
            boolean r2 = r14 instanceof a.C0447wd.a
            if (r2 == 0) goto L106
            r14 = r3
        L106:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            goto L10a
        L109:
            r14 = r3
        L10a:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r2 = a.C0193i9.a(r14, r2)
            if (r2 == 0) goto L129
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "onInsert skip: not hidden, wechat will notify ("
            r13.<init>(r14)
            r13.append(r1)
            java.lang.String r14 = ")"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            a(r13)
            return
        L129:
            java.lang.String r2 = "field_msgId"
            java.lang.Object r13 = a.A1.h(r13, r2)
            boolean r2 = r13 instanceof java.lang.Long
            if (r2 == 0) goto L136
            java.lang.Long r13 = (java.lang.Long) r13
            goto L137
        L136:
            r13 = r3
        L137:
            r4 = -1
            if (r13 == 0) goto L140
            long r6 = r13.longValue()
            goto L141
        L140:
            r6 = r4
        L141:
            long r8 = java.lang.System.currentTimeMillis()
            monitor-enter(r12)
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r13 == 0) goto L17b
            long r4 = r12.e     // Catch: java.lang.Throwable -> L178
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r13 != 0) goto L17b
            long r4 = r12.f     // Catch: java.lang.Throwable -> L178
            long r4 = r8 - r4
            r10 = 1500(0x5dc, double:7.41E-321)
            int r13 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r13 >= 0) goto L17b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L178
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L178
            r13.append(r1)     // Catch: java.lang.Throwable -> L178
            java.lang.String r14 = " msgId="
            r13.append(r14)     // Catch: java.lang.Throwable -> L178
            r13.append(r6)     // Catch: java.lang.Throwable -> L178
            java.lang.String r14 = ")"
            r13.append(r14)     // Catch: java.lang.Throwable -> L178
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L178
            a(r13)     // Catch: java.lang.Throwable -> L178
            monitor-exit(r12)
            return
        L178:
            r13 = move-exception
            goto L1ef
        L17b:
            r12.e = r6     // Catch: java.lang.Throwable -> L178
            r12.f = r8     // Catch: java.lang.Throwable -> L178
            a.Wf r13 = a.Wf.f330a     // Catch: java.lang.Throwable -> L178
            monitor-exit(r12)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "onInsert TRIGGER vibrate: talker="
            r13.<init>(r0)
            r13.append(r1)
            java.lang.String r0 = " msgId="
            r13.append(r0)
            r13.append(r6)
            java.lang.String r0 = " hidden="
            r13.append(r0)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            a(r13)
            android.content.Context r13 = a.C0435w1.p
            if (r13 != 0) goto L1ad
            java.lang.String r13 = "doVibrate skip: AppContext null"
            a(r13)
            goto L1ee
        L1ad:
            a.K3$a r14 = a.K3.f148a
            r14.getClass()
            a.jc r14 = a.K3.a.i()
            int r14 = r14.K
            java.lang.String r0 = "vibrator"
            java.lang.Object r13 = r13.getSystemService(r0)     // Catch: java.lang.Throwable -> L1c6
            boolean r0 = r13 instanceof android.os.Vibrator     // Catch: java.lang.Throwable -> L1c6
            if (r0 == 0) goto L1c8
            r3 = r13
            android.os.Vibrator r3 = (android.os.Vibrator) r3     // Catch: java.lang.Throwable -> L1c6
            goto L1c8
        L1c6:
            r13 = move-exception
            goto L1d6
        L1c8:
            if (r3 != 0) goto L1cb
            goto L1ee
        L1cb:
            a.va$a r13 = a.C0426va.g     // Catch: java.lang.Throwable -> L1c6
            r13.getClass()     // Catch: java.lang.Throwable -> L1c6
            a.C0426va.a.a(r3, r14)     // Catch: java.lang.Throwable -> L1c6
            a.Wf r13 = a.Wf.f330a     // Catch: java.lang.Throwable -> L1c6
            goto L1da
        L1d6:
            a.wd$a r13 = a.C0465xd.a(r13)
        L1da:
            java.lang.Throwable r13 = a.C0447wd.a(r13)
            if (r13 == 0) goto L1ee
            java.lang.String r14 = "[MaskedMsgVibrate] vibrate fail"
            java.lang.Object[] r13 = new java.lang.Object[]{r14, r13}
            r14 = 2
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r14)
            a.C0453x1.a(r13)
        L1ee:
            return
        L1ef:
            monitor-exit(r12)
            throw r13
        L1f1:
            java.lang.String r13 = "onInsert skip: talker empty"
            a(r13)
            return
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r13) {
            r12 = this;
            java.lang.String r0 = "session"
            a.C0193i9.e(r13, r0)
            java.lang.String r0 = "handleHook started"
            a(r0)
            java.lang.ClassLoader r0 = r13.f136a
            a.fd r1 = new a.fd
            int r2 = a.B1.f21a
            r3 = 1
            r4 = -1
            if (r2 != r4) goto L35
            android.content.Context r2 = a.C0435w1.p     // Catch: java.lang.Exception -> L27
            a.C0193i9.b(r2)     // Catch: java.lang.Exception -> L27
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> L27
            java.lang.String r5 = "com.tencent.mm"
            r6 = 0
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r5, r6)     // Catch: java.lang.Exception -> L27
            int r4 = r2.versionCode     // Catch: java.lang.Exception -> L27
            goto L33
        L27:
            r2 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            a.C0453x1.a(r2)
        L33:
            a.B1.f21a = r4
        L35:
            int r2 = a.B1.f21a
            r1.<init>(r2, r0)
            a.hd r2 = a.C0179hd.f499a
            java.lang.String r4 = "F017_msg_storage"
            r2.getClass()
            a.gd r1 = a.C0179hd.a(r4, r1)
            boolean r2 = r1.f485a
            r4 = 0
            if (r2 == 0) goto L1da
            java.lang.Class<?> r2 = r1.b
            if (r2 != 0) goto L50
            goto L1da
        L50:
            java.lang.String r2 = r2.getName()
            java.lang.String r5 = "insertMethod"
            java.lang.String r5 = r1.b(r5)
            if (r5 != 0) goto L5e
            java.lang.String r5 = "H9"
        L5e:
            java.lang.String r6 = "msgInfoClass"
            java.lang.Class r6 = r1.a(r6)
            a.cd r1 = r1.d
            if (r6 == 0) goto L6d
            java.lang.String r7 = r6.getName()
            goto L6e
        L6d:
            r7 = r4
        L6e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "hook via=ENGINE path="
            r8.<init>(r9)
            r8.append(r1)
            java.lang.String r1 = " storage="
            r8.append(r1)
            r8.append(r2)
            java.lang.String r1 = " method="
            r8.append(r1)
            r8.append(r5)
            java.lang.String r1 = " msgInfo="
            r8.append(r1)
            r8.append(r7)
            java.lang.String r1 = r8.toString()
            a(r1)
            if (r6 != 0) goto L9f
            java.lang.String r13 = "msgInfoClass from Engine extras is null, skip vibrate hook"
            a(r13)
            return
        L9f:
            monitor-enter(r12)
            boolean r1 = r12.d     // Catch: java.lang.Throwable -> Leb
            if (r1 == 0) goto La7
            monitor-exit(r12)
            goto L160
        La7:
            r1 = r6
        La8:
            if (r1 == 0) goto L119
            java.lang.reflect.Field[] r7 = r1.getDeclaredFields()     // Catch: java.lang.Throwable -> Leb
            a.G1 r7 = a.C0435w1.I(r7)     // Catch: java.lang.Throwable -> Leb
        Lb2:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> Leb
            if (r8 == 0) goto L114
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> Leb
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8     // Catch: java.lang.Throwable -> Leb
            java.lang.String r9 = r8.getName()     // Catch: java.lang.Throwable -> Leb
            if (r9 == 0) goto Lb2
            int r10 = r9.hashCode()     // Catch: java.lang.Throwable -> Leb
            r11 = -8660297(0xffffffffff7bdab7, float:-3.3477186E38)
            if (r10 == r11) goto L101
            r11 = 290387262(0x114ef53e, float:1.6326106E-28)
            if (r10 == r11) goto Lee
            r11 = 696169719(0x297eb4f7, float:5.655629E-14)
            if (r10 == r11) goto Ld8
            goto Lb2
        Ld8:
            java.lang.String r10 = "field_msgId"
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> Leb
            if (r9 != 0) goto Le1
            goto Lb2
        Le1:
            java.lang.reflect.Field r9 = r12.c     // Catch: java.lang.Throwable -> Leb
            if (r9 != 0) goto Lb2
            r8.setAccessible(r3)     // Catch: java.lang.Throwable -> Leb
            r12.c = r8     // Catch: java.lang.Throwable -> Leb
            goto Lb2
        Leb:
            r13 = move-exception
            goto L1d8
        Lee:
            java.lang.String r10 = "field_talker"
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> Leb
            if (r9 != 0) goto Lf7
            goto Lb2
        Lf7:
            java.lang.reflect.Field r9 = r12.f737a     // Catch: java.lang.Throwable -> Leb
            if (r9 != 0) goto Lb2
            r8.setAccessible(r3)     // Catch: java.lang.Throwable -> Leb
            r12.f737a = r8     // Catch: java.lang.Throwable -> Leb
            goto Lb2
        L101:
            java.lang.String r10 = "field_isSend"
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> Leb
            if (r9 != 0) goto L10a
            goto Lb2
        L10a:
            java.lang.reflect.Field r9 = r12.b     // Catch: java.lang.Throwable -> Leb
            if (r9 != 0) goto Lb2
            r8.setAccessible(r3)     // Catch: java.lang.Throwable -> Leb
            r12.b = r8     // Catch: java.lang.Throwable -> Leb
            goto Lb2
        L114:
            java.lang.Class r1 = r1.getSuperclass()     // Catch: java.lang.Throwable -> Leb
            goto La8
        L119:
            r12.d = r3     // Catch: java.lang.Throwable -> Leb
            java.lang.reflect.Field r1 = r12.f737a     // Catch: java.lang.Throwable -> Leb
            if (r1 == 0) goto L124
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> Leb
            goto L125
        L124:
            r1 = r4
        L125:
            java.lang.reflect.Field r3 = r12.b     // Catch: java.lang.Throwable -> Leb
            if (r3 == 0) goto L12e
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> Leb
            goto L12f
        L12e:
            r3 = r4
        L12f:
            java.lang.reflect.Field r7 = r12.c     // Catch: java.lang.Throwable -> Leb
            if (r7 == 0) goto L138
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> Leb
            goto L139
        L138:
            r7 = r4
        L139:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Leb
            r8.<init>()     // Catch: java.lang.Throwable -> Leb
            java.lang.String r9 = "resolveFields done: talker="
            r8.append(r9)     // Catch: java.lang.Throwable -> Leb
            r8.append(r1)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r1 = " isSend="
            r8.append(r1)     // Catch: java.lang.Throwable -> Leb
            r8.append(r3)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r1 = " msgId="
            r8.append(r1)     // Catch: java.lang.Throwable -> Leb
            r8.append(r7)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Throwable -> Leb
            a(r1)     // Catch: java.lang.Throwable -> Leb
            a.Wf r1 = a.Wf.f330a     // Catch: java.lang.Throwable -> Leb
            monitor-exit(r12)
        L160:
            java.lang.Class[] r1 = new java.lang.Class[]{r6}     // Catch: java.lang.Throwable -> L16f
            a.l4 r3 = new a.l4     // Catch: java.lang.Throwable -> L16f
            r6 = 6
            r3.<init>(r12, r6, r0)     // Catch: java.lang.Throwable -> L16f
            io.github.libxposed.api.XposedInterface$HookHandle r13 = a.J8.a(r13, r2, r5, r1, r3)     // Catch: java.lang.Throwable -> L16f
            goto L174
        L16f:
            r13 = move-exception
            a.wd$a r13 = a.C0465xd.a(r13)
        L174:
            java.lang.Throwable r13 = a.C0447wd.a(r13)
            if (r13 == 0) goto L192
            java.lang.String r13 = r13.getMessage()
            java.lang.String r0 = "hook "
            java.lang.String r1 = "."
            java.lang.String r3 = " fail: "
            java.lang.StringBuilder r0 = a.C0487z.i(r0, r2, r1, r5, r3)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            a(r13)
        L192:
            java.lang.reflect.Field r13 = r12.f737a
            if (r13 == 0) goto L19b
            java.lang.String r13 = r13.getName()
            goto L19c
        L19b:
            r13 = r4
        L19c:
            java.lang.reflect.Field r0 = r12.b
            if (r0 == 0) goto L1a5
            java.lang.String r0 = r0.getName()
            goto L1a6
        L1a5:
            r0 = r4
        L1a6:
            java.lang.reflect.Field r1 = r12.c
            if (r1 == 0) goto L1ae
            java.lang.String r4 = r1.getName()
        L1ae:
            java.lang.String r1 = "hook installed ("
            java.lang.String r3 = "."
            java.lang.String r6 = ", talker="
            java.lang.StringBuilder r1 = a.C0487z.i(r1, r2, r3, r5, r6)
            r1.append(r13)
            java.lang.String r13 = " isSend="
            r1.append(r13)
            r1.append(r0)
            java.lang.String r13 = " msgId="
            r1.append(r13)
            r1.append(r4)
            java.lang.String r13 = ")"
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            a(r13)
            return
        L1d8:
            monitor-exit(r12)
            throw r13
        L1da:
            a.j6 r13 = r1.c
            if (r13 == 0) goto L1e0
            java.lang.String r4 = r13.c
        L1e0:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "F017_msg_storage resolve FAILED: "
            r13.<init>(r0)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            a(r13)
            return
    }
}
