package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class we0 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11688;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.z81 f11689;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ boolean f11690;

    public /* synthetic */ we0(p000.z81 r1, boolean r2, int r3) {
            r0 = this;
            r0.f11688 = r3
            r0.f11689 = r1
            r0.f11690 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ we0(boolean r1, p000.z81 r2, int r3) {
            r0 = this;
            r0.f11688 = r3
            r0.f11690 = r1
            r0.f11689 = r2
            r0.<init>()
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r37 = this;
            r0 = r37
            int r1 = r0.f11688
            r2 = 21
            r3 = 22
            r4 = 1
            r5 = 0
            s62 r6 = p000.s62.f9751
            boolean r7 = r0.f11690
            z81 r8 = r0.f11689
            switch(r1) {
                case 0: goto L497;
                case 1: goto L493;
                case 2: goto L416;
                case 3: goto L1d;
                case 4: goto L19;
                default: goto L13;
            }
        L13:
            java.lang.ClassLoader r0 = r8.f13011
            p000.C0966x.m6449(r0, r7)
            return r6
        L19:
            p000.v71.m6040(r8, r7)
            return r6
        L1d:
            if (r7 == 0) goto L28
            m82 r0 = p000.m82.f7014
            java.lang.ClassLoader r1 = r8.f13011
            r0.m3797(r1)
            goto L415
        L28:
            java.lang.String[] r0 = p000.n82.f7460
            java.lang.String r1 = "setSpeed"
            java.lang.String r7 = ": "
            java.lang.String r0 = "video_speed_hook_enabled"
            boolean r0 = p000.ui1.m5887(r0, r5)     // Catch: java.lang.Throwable -> L35
            goto L36
        L35:
            r0 = r4
        L36:
            r9 = 4
            java.lang.String r10 = "rfe847aaa60ab2d90"
            r11 = 0
            if (r0 != 0) goto L43
            java.lang.String r0 = "VideoSpeedHook disabled by prefs"
            p000.C0888ux.m5988(r10, r0, r11, r9, r11)
            goto L415
        L43:
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = "~791C379118E47E8B07D05A90B0CB4AAAEFB24B3BF0773879FC833D3987C0B1293BF3"
            java.lang.String r0 = p000.jf0.m2957(r0)     // Catch: java.lang.Throwable -> L74
            java.lang.ClassLoader r12 = r8.f13011     // Catch: java.lang.Throwable -> L74
            java.lang.Class r0 = p000.qe0.m4877(r12, r0)     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L54
            goto L8a
        L54:
            xq0 r12 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L60
            java.lang.String r13 = "getIntValue"
            py1 r14 = new py1     // Catch: java.lang.Throwable -> L60
            r14.<init>(r3)     // Catch: java.lang.Throwable -> L60
            r12.m6774(r0, r13, r14)     // Catch: java.lang.Throwable -> L60
        L60:
            xq0 r3 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L6e
            java.lang.String r12 = "getBooleanValue"
            py1 r13 = new py1     // Catch: java.lang.Throwable -> L6e
            r14 = 23
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L6e
            r3.m6774(r0, r12, r13)     // Catch: java.lang.Throwable -> L6e
        L6e:
            java.lang.String r0 = "✅ ABManager fallback installed"
            p000.C0888ux.m5988(r10, r0, r11, r9, r11)     // Catch: java.lang.Throwable -> L74
            goto L8a
        L74:
            r0 = move-exception
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r12 = "ABManager fallback ERR: "
            java.lang.String r0 = p000.a12.m18(r12, r3, r7, r0)
            p000.C0888ux.m5988(r10, r0, r11, r9, r11)
        L8a:
            java.lang.String[] r3 = p000.n82.f7460     // Catch: java.lang.Throwable -> Lac
            int r12 = r3.length     // Catch: java.lang.Throwable -> Lac
            r13 = r5
        L8e:
            if (r13 >= r12) goto Lae
            r0 = r3[r13]     // Catch: java.lang.Throwable -> Lac
            java.lang.ClassLoader r14 = r8.f13011     // Catch: java.lang.Throwable -> L99
            java.lang.Class r0 = java.lang.Class.forName(r0, r5, r14)     // Catch: java.lang.Throwable -> L99
            goto La0
        L99:
            r0 = move-exception
            eo1 r14 = new eo1     // Catch: java.lang.Throwable -> Lac
            r14.<init>(r0)     // Catch: java.lang.Throwable -> Lac
            r0 = r14
        La0:
            boolean r14 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> Lac
            if (r14 == 0) goto La5
            r0 = r11
        La5:
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> Lac
            if (r0 != 0) goto Laf
            int r13 = r13 + 1
            goto L8e
        Lac:
            r0 = move-exception
            goto Lfd
        Lae:
            r0 = r11
        Laf:
            if (r0 != 0) goto Lb7
            java.lang.String r0 = "AbilityAb optional missing on host 39.0"
            p000.C0888ux.m5988(r10, r0, r11, r9, r11)     // Catch: java.lang.Throwable -> Lac
            goto L112
        Lb7:
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> Lac
            r0.getClass()     // Catch: java.lang.Throwable -> Lac
            int r3 = r0.length     // Catch: java.lang.Throwable -> Lac
            r12 = r5
            r13 = r12
        Lc1:
            if (r12 >= r3) goto Lef
            r14 = r0[r12]     // Catch: java.lang.Throwable -> Lac
            java.lang.String r15 = r14.getName()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r5 = "LIZJ"
            boolean r5 = p000.ln0.m3626(r15, r5)     // Catch: java.lang.Throwable -> Lac
            if (r5 == 0) goto Leb
            java.lang.Class r5 = r14.getReturnType()     // Catch: java.lang.Throwable -> Lac
            java.lang.Class r15 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lac
            boolean r5 = p000.ln0.m3626(r5, r15)     // Catch: java.lang.Throwable -> Lac
            if (r5 == 0) goto Leb
            r14.setAccessible(r4)     // Catch: java.lang.Throwable -> Lac
            xq0 r5 = p000.xq0.f12253     // Catch: java.lang.Throwable -> Lac
            py1 r13 = new py1     // Catch: java.lang.Throwable -> Lac
            r13.<init>(r2)     // Catch: java.lang.Throwable -> Lac
            r5.m6775(r14, r13)     // Catch: java.lang.Throwable -> Lac
            r13 = r4
        Leb:
            int r12 = r12 + 1
            r5 = 0
            goto Lc1
        Lef:
            if (r13 == 0) goto Lf7
            java.lang.String r0 = "✅ AbilityAb.LIZJ=true (safe method hook)"
            p000.C0888ux.m5988(r10, r0, r11, r9, r11)     // Catch: java.lang.Throwable -> Lac
            goto L112
        Lf7:
            java.lang.String r0 = "⚠️ AbilityAb.LIZJ method not found, using ABManager fallback"
            p000.C0888ux.m5988(r10, r0, r11, r9, r11)     // Catch: java.lang.Throwable -> Lac
            goto L112
        Lfd:
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "AbilityAb safe hook ERR: "
            java.lang.String r0 = p000.a12.m18(r3, r2, r7, r0)
            p000.C0888ux.m5988(r10, r0, r11, r9, r11)
        L112:
            java.lang.String[] r2 = p000.n82.f7461     // Catch: java.lang.Throwable -> L135
            int r3 = r2.length     // Catch: java.lang.Throwable -> L135
            r5 = 0
        L116:
            if (r5 >= r3) goto L137
            r0 = r2[r5]     // Catch: java.lang.Throwable -> L135
            java.lang.ClassLoader r12 = r8.f13011     // Catch: java.lang.Throwable -> L122
            r13 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0, r13, r12)     // Catch: java.lang.Throwable -> L122
            goto L129
        L122:
            r0 = move-exception
            eo1 r12 = new eo1     // Catch: java.lang.Throwable -> L135
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L135
            r0 = r12
        L129:
            boolean r12 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L135
            if (r12 == 0) goto L12e
            r0 = r11
        L12e:
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.Throwable -> L135
            if (r0 != 0) goto L138
            int r5 = r5 + 1
            goto L116
        L135:
            r0 = move-exception
            goto L199
        L137:
            r0 = r11
        L138:
            if (r0 != 0) goto L140
            java.lang.String r0 = "speed option config optional missing on host 39.0"
            p000.C0888ux.m5988(r10, r0, r11, r9, r11)     // Catch: java.lang.Throwable -> L135
            goto L1ae
        L140:
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> L135
            r0.getClass()     // Catch: java.lang.Throwable -> L135
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L135
            r2.<init>()     // Catch: java.lang.Throwable -> L135
            int r3 = r0.length     // Catch: java.lang.Throwable -> L135
            r5 = 0
        L14e:
            if (r5 >= r3) goto L161
            r12 = r0[r5]     // Catch: java.lang.Throwable -> L135
            r12.getClass()     // Catch: java.lang.Throwable -> L135
            boolean r13 = p000.n82.m4015(r12)     // Catch: java.lang.Throwable -> L135
            if (r13 == 0) goto L15e
            r2.add(r12)     // Catch: java.lang.Throwable -> L135
        L15e:
            int r5 = r5 + 1
            goto L14e
        L161:
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L135
            r2 = 0
        L166:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L135
            if (r3 == 0) goto L184
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L135
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L135
            r3.setAccessible(r4)     // Catch: java.lang.Throwable -> L135
            xq0 r5 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L135
            py1 r12 = new py1     // Catch: java.lang.Throwable -> L135
            r13 = 24
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L135
            r5.m6775(r3, r12)     // Catch: java.lang.Throwable -> L135
            int r2 = r2 + 1
            goto L166
        L184:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L135
            r0.<init>()     // Catch: java.lang.Throwable -> L135
            java.lang.String r3 = "✅ DSpeedOptionConfig speed options hook OK count="
            r0.append(r3)     // Catch: java.lang.Throwable -> L135
            r0.append(r2)     // Catch: java.lang.Throwable -> L135
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L135
            p000.C0888ux.m5988(r10, r0, r11, r9, r11)     // Catch: java.lang.Throwable -> L135
            goto L1ae
        L199:
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "DSpeedOptionConfig ERR: "
            java.lang.String r0 = p000.a12.m18(r3, r2, r7, r0)
            p000.C0888ux.m5988(r10, r0, r11, r9, r11)
        L1ae:
            java.lang.String r0 = "X.C1131250fQ2"
            java.lang.ClassLoader r2 = r8.f13011     // Catch: java.lang.Throwable -> L210
            r13 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0, r13, r2)     // Catch: java.lang.Throwable -> L210
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()     // Catch: java.lang.Throwable -> L210
            r0.getClass()     // Catch: java.lang.Throwable -> L210
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L210
            r2.<init>()     // Catch: java.lang.Throwable -> L210
            int r3 = r0.length     // Catch: java.lang.Throwable -> L210
            r5 = 0
        L1c5:
            if (r5 >= r3) goto L1d8
            r7 = r0[r5]     // Catch: java.lang.Throwable -> L210
            r7.getClass()     // Catch: java.lang.Throwable -> L210
            boolean r12 = p000.n82.m4015(r7)     // Catch: java.lang.Throwable -> L210
            if (r12 == 0) goto L1d5
            r2.add(r7)     // Catch: java.lang.Throwable -> L210
        L1d5:
            int r5 = r5 + 1
            goto L1c5
        L1d8:
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L210
            r13 = 0
        L1dd:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L210
            if (r2 == 0) goto L1fc
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L210
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L210
            r2.setAccessible(r4)     // Catch: java.lang.Throwable -> L210
            xq0 r3 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L210
            xe r5 = new xe     // Catch: java.lang.Throwable -> L210
            r7 = 13
            r12 = 0
            r5.<init>(r2, r7, r12)     // Catch: java.lang.Throwable -> L210
            r3.m6775(r2, r5)     // Catch: java.lang.Throwable -> L210
            int r13 = r13 + 1
            goto L1dd
        L1fc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L210
            r0.<init>()     // Catch: java.lang.Throwable -> L210
            java.lang.String r2 = "✅ C1131250fQ2 speed options hook OK count="
            r0.append(r2)     // Catch: java.lang.Throwable -> L210
            r0.append(r13)     // Catch: java.lang.Throwable -> L210
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L210
            p000.C0888ux.m5988(r10, r0, r11, r9, r11)     // Catch: java.lang.Throwable -> L210
        L210:
            p000.n82.m4014(r8)
            java.lang.Class r2 = java.lang.Float.TYPE
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L239
            java.lang.String r0 = "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B532A4FB444E45EFE5413F312250C3EB77D079E4AFD3F67A87735342D1C21387EB"
            java.lang.String r0 = p000.jf0.m2957(r0)     // Catch: java.lang.Throwable -> L239
            java.lang.ClassLoader r3 = r8.f13011     // Catch: java.lang.Throwable -> L239
            java.lang.Class r0 = p000.qe0.m4877(r3, r0)     // Catch: java.lang.Throwable -> L239
            if (r0 == 0) goto L247
            py1 r3 = new py1     // Catch: java.lang.Throwable -> L239
            r4 = 26
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L239
            java.lang.Object[] r3 = new java.lang.Object[]{r2, r3}     // Catch: java.lang.Throwable -> L239
            p000.qe0.m4873(r0, r1, r3)     // Catch: java.lang.Throwable -> L239
            java.lang.String r0 = "✅ Probe FeedPlayerWrapper.setSpeed"
            p000.C0888ux.m5988(r10, r0, r11, r9, r11)     // Catch: java.lang.Throwable -> L239
            goto L247
        L239:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "Probe FeedPlayerWrapper ERR: "
            java.lang.String r0 = p000.lz1.m3687(r3, r0)
            p000.C0888ux.m5988(r10, r0, r11, r9, r11)
        L247:
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L26b
            java.lang.String r0 = "~795CFE82AE87DC48225355B65A8474AC8888795688CFC505AE0AE615CE280772922D63B5F8A7251BD40F9CB4512B8F0072E7"
            java.lang.String r0 = p000.jf0.m2957(r0)     // Catch: java.lang.Throwable -> L26b
            java.lang.ClassLoader r3 = r8.f13011     // Catch: java.lang.Throwable -> L26b
            java.lang.Class r0 = p000.qe0.m4877(r3, r0)     // Catch: java.lang.Throwable -> L26b
            if (r0 == 0) goto L279
            py1 r3 = new py1     // Catch: java.lang.Throwable -> L26b
            r4 = 27
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L26b
            java.lang.Object[] r3 = new java.lang.Object[]{r2, r3}     // Catch: java.lang.Throwable -> L26b
            p000.qe0.m4873(r0, r1, r3)     // Catch: java.lang.Throwable -> L26b
            java.lang.String r0 = "✅ Probe SimPlayer.setSpeed"
            p000.C0888ux.m5988(r10, r0, r11, r9, r11)     // Catch: java.lang.Throwable -> L26b
            goto L279
        L26b:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "Probe SimPlayer ERR: "
            java.lang.String r0 = p000.lz1.m3687(r3, r0)
            p000.C0888ux.m5988(r10, r0, r11, r9, r11)
        L279:
            java.lang.String r35 = "X.C1GU8"
            java.lang.String r36 = "X.C1GU9"
            java.lang.String r12 = "X.C1GTT"
            java.lang.String r13 = "X.C1GTS"
            java.lang.String r14 = "X.C1GTR"
            java.lang.String r15 = "X.C1GTQ"
            java.lang.String r16 = "X.C1GTP"
            java.lang.String r17 = "X.C1GTO"
            java.lang.String r18 = "X.C1GTN"
            java.lang.String r19 = "X.C1GTM"
            java.lang.String r20 = "X.C1GTL"
            java.lang.String r21 = "X.C1GTK"
            java.lang.String r22 = "X.C1GTJ"
            java.lang.String r23 = "X.C1GTI"
            java.lang.String r24 = "X.C1GTH"
            java.lang.String r25 = "X.C1GTG"
            java.lang.String r26 = "X.C1GTF"
            java.lang.String r27 = "X.C1GU0"
            java.lang.String r28 = "X.C1GU1"
            java.lang.String r29 = "X.C1GU2"
            java.lang.String r30 = "X.C1GU3"
            java.lang.String r31 = "X.C1GU4"
            java.lang.String r32 = "X.C1GU5"
            java.lang.String r33 = "X.C1GU6"
            java.lang.String r34 = "X.C1GU7"
            java.lang.String[] r0 = new java.lang.String[]{r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L2b7:
            boolean r3 = r0.hasNext()
            java.lang.String r4 = "✅ Probe "
            if (r3 == 0) goto L2fd
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L2b7
            java.lang.ClassLoader r5 = r8.f13011     // Catch: java.lang.Throwable -> L2b7
            java.lang.Class r5 = p000.qe0.m4877(r5, r3)     // Catch: java.lang.Throwable -> L2b7
            if (r5 != 0) goto L2d0
            goto L2b7
        L2d0:
            java.lang.String r7 = "setPlaySpeed"
            java.lang.Class[] r12 = new java.lang.Class[]{r2}
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r7, r12)
            xq0 r7 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L2b7
            r5.getClass()     // Catch: java.lang.Throwable -> L2b7
            bt r12 = new bt     // Catch: java.lang.Throwable -> L2b7
            r13 = 3
            r12.<init>(r3, r13)     // Catch: java.lang.Throwable -> L2b7
            r7.m6775(r5, r12)     // Catch: java.lang.Throwable -> L2b7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b7
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L2b7
            r5.append(r3)     // Catch: java.lang.Throwable -> L2b7
            java.lang.String r3 = ".setPlaySpeed"
            r5.append(r3)     // Catch: java.lang.Throwable -> L2b7
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L2b7
            p000.C0888ux.m5988(r10, r3, r11, r9, r11)     // Catch: java.lang.Throwable -> L2b7
            goto L2b7
        L2fd:
            java.lang.String r0 = "~793C911F02B4DC50C7A540827E13BF2EE460C1D7866986C60E01C6BDB0E2B70E7431B64B4D80F270F827"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r2 = "com.google.android.exoplayer2.PlaybackParameters"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L311:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L345
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L311
            java.lang.ClassLoader r3 = r8.f13011     // Catch: java.lang.Throwable -> L311
            java.lang.Class r3 = p000.qe0.m4877(r3, r2)     // Catch: java.lang.Throwable -> L311
            if (r3 != 0) goto L328
            goto L311
        L328:
            xq0 r5 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L311
            bt r7 = new bt     // Catch: java.lang.Throwable -> L311
            r7.<init>(r2, r9)     // Catch: java.lang.Throwable -> L311
            r5.m6773(r3, r7)     // Catch: java.lang.Throwable -> L311
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L311
            r3.<init>()     // Catch: java.lang.Throwable -> L311
            r3.append(r4)     // Catch: java.lang.Throwable -> L311
            r3.append(r2)     // Catch: java.lang.Throwable -> L311
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L311
            p000.C0888ux.m5988(r10, r2, r11, r9, r11)     // Catch: java.lang.Throwable -> L311
            goto L311
        L345:
            java.lang.String r2 = "~7908F94440A3C3FF1093F148DDFD25ECA65A2F6D3C7D5B2BE16B4D0599404E3FFA8D8123B7F37C"
            java.lang.String r0 = p000.jf0.m2957(r2)
            java.lang.String r3 = "tv.danmaku.ijk.media.player.IjkMediaPlayer"
            java.lang.String r5 = "com.google.android.exoplayer2.ExoPlayerImpl"
            java.lang.String r7 = "com.google.android.exoplayer2.SimpleExoPlayer"
            java.lang.String[] r0 = new java.lang.String[]{r5, r7, r0, r3}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L35d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L399
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L35d
            java.lang.ClassLoader r5 = r8.f13011     // Catch: java.lang.Throwable -> L35d
            java.lang.Class r5 = p000.qe0.m4877(r5, r3)     // Catch: java.lang.Throwable -> L35d
            if (r5 != 0) goto L374
            goto L35d
        L374:
            xq0 r7 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L35d
            java.lang.String r12 = "setPlaybackParameters"
            bt r13 = new bt     // Catch: java.lang.Throwable -> L35d
            r14 = 5
            r13.<init>(r3, r14)     // Catch: java.lang.Throwable -> L35d
            r7.m6774(r5, r12, r13)     // Catch: java.lang.Throwable -> L35d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35d
            r5.<init>()     // Catch: java.lang.Throwable -> L35d
            r5.append(r4)     // Catch: java.lang.Throwable -> L35d
            r5.append(r3)     // Catch: java.lang.Throwable -> L35d
            java.lang.String r3 = ".setPlaybackParameters"
            r5.append(r3)     // Catch: java.lang.Throwable -> L35d
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L35d
            p000.C0888ux.m5988(r10, r3, r11, r9, r11)     // Catch: java.lang.Throwable -> L35d
            goto L35d
        L399:
            java.lang.Class<java.lang.ClassLoader> r0 = java.lang.ClassLoader.class
            java.lang.String r3 = "loadClass"
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            py1 r5 = new py1     // Catch: java.lang.Throwable -> L3b3
            r7 = 28
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L3b3
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}     // Catch: java.lang.Throwable -> L3b3
            p000.qe0.m4873(r0, r3, r4)     // Catch: java.lang.Throwable -> L3b3
            java.lang.String r0 = "✅ Probe ClassLoader.loadClass (with dedup)"
            p000.C0888ux.m5988(r10, r0, r11, r9, r11)     // Catch: java.lang.Throwable -> L3b3
            goto L3c1
        L3b3:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "Probe ClassLoader ERR: "
            java.lang.String r0 = p000.lz1.m3687(r3, r0)
            p000.C0888ux.m5988(r10, r0, r11, r9, r11)
        L3c1:
            java.lang.String r0 = p000.jf0.m2957(r2)     // Catch: java.lang.Throwable -> L415
            java.lang.String r2 = "~792CC2D8D4DF443DA74B7503A721D5A1984EBA79CD86B55E128005B785C87E89A5CAFFBCA026238D02932E878F8E"
            java.lang.String r2 = p000.jf0.m2957(r2)     // Catch: java.lang.Throwable -> L415
            java.lang.String[] r0 = new java.lang.String[]{r0, r2}     // Catch: java.lang.Throwable -> L415
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)     // Catch: java.lang.Throwable -> L415
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L415
        L3d7:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L415
            if (r2 == 0) goto L415
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L415
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L415
            java.lang.Object r3 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L415
            java.lang.ClassLoader r3 = r8.f13011     // Catch: java.lang.Throwable -> L415
            java.lang.Class r2 = p000.qe0.m4877(r3, r2)     // Catch: java.lang.Throwable -> L415
            if (r2 != 0) goto L3ee
            goto L3d7
        L3ee:
            java.lang.String r3 = "setPlaybackSpeed"
            java.lang.String[] r3 = new java.lang.String[]{r1, r3}     // Catch: java.lang.Throwable -> L415
            java.util.List r3 = p000.AbstractC1021yh.m6897(r3)     // Catch: java.lang.Throwable -> L415
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L415
        L3fc:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L415
            if (r4 == 0) goto L3d7
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L415
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L415
            xq0 r5 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L3fc
            py1 r7 = new py1     // Catch: java.lang.Throwable -> L3fc
            r9 = 25
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L3fc
            r5.m6774(r2, r4, r7)     // Catch: java.lang.Throwable -> L3fc
            goto L3fc
        L415:
            return r6
        L416:
            if (r7 == 0) goto L457
            hb2 r0 = p000.hb2.f4680
            ib2 r0 = p000.ib2.f4981
            java.lang.ClassLoader r1 = r8.f13011
            r1.getClass()
            r0.m2735(r1)
            java.lang.ClassLoader r0 = r8.f13011     // Catch: java.lang.Throwable -> L42b
            p000.hb2.m2483(r0)     // Catch: java.lang.Throwable -> L42b
            r1 = r6
            goto L431
        L42b:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
        L431:
            java.lang.Throwable r0 = p000.fo1.m2190(r1)
            java.lang.String r1 = "re4b6c41332ef57c6"
            if (r0 == 0) goto L43e
            java.lang.String r2 = "39.6+ 评论语音替换 Hook 安装失败，已保留宿主原发送"
            p000.C0888ux.m5977(r1, r2, r0)
        L43e:
            java.lang.ClassLoader r0 = r8.f13011     // Catch: java.lang.Throwable -> L445
            p000.hb2.m2485(r0)     // Catch: java.lang.Throwable -> L445
            r2 = r6
            goto L44b
        L445:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
        L44b:
            java.lang.Throwable r0 = p000.fo1.m2190(r2)
            if (r0 == 0) goto L492
            java.lang.String r2 = "39.6+ 私信语音替换 Hook 安装失败，已保留宿主原发送"
            p000.C0888ux.m5977(r1, r2, r0)
            goto L492
        L457:
            ib2 r0 = p000.ib2.f4981
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.ib2.f4983
            r13 = 0
            boolean r1 = r1.compareAndSet(r13, r4)
            if (r1 != 0) goto L463
            goto L477
        L463:
            java.util.concurrent.ConcurrentHashMap r1 = p000.C0777rx.f9562
            j72 r1 = new j72
            r1.<init>(r2)
            java.lang.String r2 = "voice_replace_hook"
            p000.C0777rx.m5178(r2, r1)
            j72 r1 = new j72
            r1.<init>(r3)
            p000.C0777rx.m5177(r2, r1)
        L477:
            java.lang.ClassLoader r1 = r8.f13011
            r0.m2739(r1)
            java.lang.ClassLoader r1 = r8.f13011
            r0.m2738(r1)
            java.lang.ClassLoader r1 = r8.f13011
            r0.m2736(r1)
            java.lang.ClassLoader r1 = r8.f13011
            r0.m2737(r1)
            java.lang.String r0 = "rb360b99c73f2f647"
            java.lang.String r1 = "voice replace hook installed"
            p000.C0888ux.m5975(r0, r1)
        L492:
            return r6
        L493:
            p000.v71.m6040(r8, r7)
            return r6
        L497:
            java.lang.ClassLoader r0 = r8.f13011
            p000.C0966x.m6449(r0, r7)
            return r6
    }
}
