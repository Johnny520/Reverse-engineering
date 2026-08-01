package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class hb2 {

    /* JADX INFO: renamed from: α */
    public static final p000.hb2 f4680 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f4681 = null;

    static {
            hb2 r0 = new hb2
            r0.<init>()
            p000.hb2.f4680 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.hb2.f4681 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.util.ArrayList m2482(java.lang.Class r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r2 == 0) goto L14
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L14
            java.lang.Class r2 = p000.lz1.m3684(r2, r0)
            goto L5
        L14:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static void m2483(java.lang.ClassLoader r14) {
            java.lang.Object r0 = p000.qe0.f8982
            java.lang.String r0 = "~78CB965E478A78D38827E0D26879E5129ED28BC0948C0FBC37EEE6CBB3E95B8A4AC1363A6DDE54331B5A47A070A6589A6520FAB8DF66D7EBF463C6CCECF5668CF5BFAF654DDBA3604FF390D96AB8F3A901AF006B220BE9"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r14 = p000.qe0.m4877(r14, r0)
            r0 = 4
            java.lang.String r1 = "re4b6c41332ef57c6"
            r2 = 0
            if (r14 != 0) goto L18
            java.lang.String r14 = "39.6+ 评论录音模块未找到，跳过评论语音替换"
            p000.C0888ux.m5988(r1, r14, r2, r0, r2)
            return
        L18:
            km r5 = p000.C0474km.f6025
            uu1 r6 = new uu1
            ib2 r8 = p000.ib2.f4981
            r12 = 0
            r13 = 11
            r7 = 1
            java.lang.Class<ib2> r9 = p000.ib2.class
            java.lang.String r10 = "canReadHostVoiceInfo"
            java.lang.String r11 = "canReadHostVoiceInfo$app(Ljava/lang/Class;)Z"
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r11 = r6
            java.lang.reflect.Field[] r3 = r14.getDeclaredFields()
            r3.getClass()
            ss1 r3 = p000.AbstractC0312g7.m2232(r3)
            hm r4 = new hm
            r4.<init>(r0)
            y30 r6 = new y30
            r6.<init>(r3, r12, r4)
            hm r3 = new hm
            r4 = 5
            r3.<init>(r4)
            t52 r13 = new t52
            r13.<init>(r6, r3)
            ng r3 = new ng
            r9 = 0
            r10 = 4
            r4 = 1
            java.lang.Class<km> r6 = p000.C0474km.class
            java.lang.String r7 = "isScannableHostType"
            java.lang.String r8 = "isScannableHostType(Ljava/lang/Class;)Z"
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            y30 r4 = new y30
            r5 = 1
            r4.<init>(r13, r5, r3)
            java.util.List r3 = p000.us1.m5948(r4)
            java.util.List r4 = p000.AbstractC1021yh.m6896(r14)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            w6 r6 = new w6
            r6.<init>()
            r6.addLast(r14)
        L75:
            boolean r14 = r6.isEmpty()
            if (r14 != 0) goto L9a
            java.lang.Object r14 = r6.removeFirst()
            java.lang.Class r14 = (java.lang.Class) r14
            java.lang.Class[] r14 = r14.getDeclaredClasses()
            r14.getClass()
            int r7 = r14.length
            r8 = r12
        L8a:
            if (r8 >= r7) goto L75
            r9 = r14[r8]
            r5.add(r9)
            r9.getClass()
            r6.addLast(r9)
            int r8 = r8 + 1
            goto L8a
        L9a:
            java.util.ArrayList r14 = p000.AbstractC0984xh.m6651(r4, r5)
            java.util.ArrayList r14 = p000.AbstractC0984xh.m6651(r14, r3)
            java.util.Set r14 = p000.AbstractC0984xh.m6670(r14)
            java.util.List r14 = p000.AbstractC0984xh.m6666(r14)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r14 = r14.iterator()
        Lb3:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto Ld1
            java.lang.Object r4 = r14.next()
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.reflect.Method[] r4 = r4.getDeclaredMethods()
            r4.getClass()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r4.getClass()
            p000.AbstractC0984xh.m6660(r3, r4)
            goto Lb3
        Ld1:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r3 = r3.iterator()
        Lda:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lf4
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r5.getClass()
            boolean r5 = p000.j81.m2881(r5, r11)
            if (r5 == 0) goto Lda
            r14.add(r4)
            goto Lda
        Lf4:
            java.util.Set r14 = p000.AbstractC0984xh.m6670(r14)
            java.util.List r14 = p000.AbstractC0984xh.m6666(r14)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r14 = r14.iterator()
        L10a:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L125
            java.lang.Object r5 = r14.next()
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r6 = m2486(r6)
            boolean r6 = r3.add(r6)
            if (r6 == 0) goto L10a
            r4.add(r5)
            goto L10a
        L125:
            boolean r14 = r4.isEmpty()
            if (r14 == 0) goto L131
            java.lang.String r14 = "39.6+ 评论完成回调结构未命中，保留宿主原发送"
            p000.C0888ux.m5988(r1, r14, r2, r0, r2)
            return
        L131:
            java.util.Iterator r14 = r4.iterator()
        L135:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L14b
            java.lang.Object r3 = r14.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            ya2 r5 = p000.ya2.f12541
            java.lang.String r6 = "comment-390601"
            hb2 r7 = p000.hb2.f4680
            r7.m2487(r3, r5, r6)
            goto L135
        L14b:
            int r14 = r4.size()
            java.lang.String r3 = "39.6+ 评论语音替换已安装，目标数="
            java.lang.String r14 = p000.a12.m17(r3, r14)
            p000.C0888ux.m5988(r1, r14, r2, r0, r2)
            return
    }

    /* JADX INFO: renamed from: δ */
    public static int m2484(java.lang.Class r12) {
            boolean r0 = r12.isPrimitive()
            r1 = 0
            if (r0 != 0) goto L97
            boolean r0 = r12.isEnum()
            if (r0 != 0) goto L97
            java.lang.String r0 = r12.getName()
            java.lang.String r2 = "java."
            boolean r0 = p000.x02.m6485(r0, r2, r1)
            if (r0 == 0) goto L1b
            goto L97
        L1b:
            java.lang.reflect.Method[] r12 = r12.getDeclaredMethods()
            r12.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r12.length
        L28:
            if (r1 >= r2) goto L4c
            r3 = r12[r1]
            r3.getClass()
            uu1 r4 = new uu1
            ib2 r6 = p000.ib2.f4981
            r10 = 0
            r11 = 12
            r5 = 1
            java.lang.Class<ib2> r7 = p000.ib2.class
            java.lang.String r8 = "canReadHostVoiceInfo"
            java.lang.String r9 = "canReadHostVoiceInfo$app(Ljava/lang/Class;)Z"
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            boolean r4 = p000.j81.m2881(r3, r4)
            if (r4 == 0) goto L49
            r0.add(r3)
        L49:
            int r1 = r1 + 1
            goto L28
        L4c:
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L5a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L75
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r3 = m2486(r3)
            boolean r3 = r12.add(r3)
            if (r3 == 0) goto L5a
            r1.add(r2)
            goto L5a
        L75:
            java.util.Iterator r12 = r1.iterator()
        L79:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r0 = r12.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            ya2 r2 = p000.ya2.f12542
            java.lang.String r3 = "im-390601"
            hb2 r4 = p000.hb2.f4680
            r4.m2487(r0, r2, r3)
            goto L79
        L92:
            int r12 = r1.size()
            return r12
        L97:
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public static void m2485(java.lang.ClassLoader r8) {
            java.lang.Object r0 = p000.qe0.f8982
            java.lang.String r0 = "~78B71E7541C477E838C50BCD302E054C40CC02248AA0B9F3FD7794A78143886D1800F82A71492D2EFEBF50F69EC092027CD8E9B672D52762657C36503D2A32ECDF4324524659B85D"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r8 = p000.qe0.m4877(r8, r0)
            r0 = 4
            java.lang.String r1 = "re4b6c41332ef57c6"
            r2 = 0
            if (r8 != 0) goto L18
            java.lang.String r8 = "39.6+ 私信 AudioLogic 未找到，跳过私信语音替换"
            p000.C0888ux.m5988(r1, r8, r2, r0, r2)
            return
        L18:
            java.util.ArrayList r3 = m2482(r8)
            f7 r4 = new f7
            r5 = 1
            r4.<init>(r5, r3)
            j72 r3 = new j72
            r5 = 23
            r3.<init>(r5)
            y30 r5 = new y30
            r6 = 0
            r5.<init>(r4, r6, r3)
            gb2 r3 = p000.gb2.f4307
            t52 r4 = new t52
            r4.<init>(r5, r3)
            cu r3 = p000.us1.m5952(r4)
            java.util.Iterator r3 = r3.iterator()
            r4 = r6
        L3f:
            r5 = r3
            σ r5 = (p000.AbstractC1095) r5
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L54
            java.lang.Object r5 = r5.next()
            java.lang.Class r5 = (java.lang.Class) r5
            int r5 = m2484(r5)
            int r4 = r4 + r5
            goto L3f
        L54:
            xq0 r3 = p000.xq0.f12253
            fb2 r5 = new fb2
            r5.<init>(r6)
            r3.m6773(r8, r5)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r3 = "39.6+ 私信语音替换桥已安装，静态目标数="
            r8.<init>(r3)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            p000.C0888ux.m5988(r1, r8, r2, r0, r2)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.String m2486(java.lang.reflect.Method r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r5.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 35
            r0.append(r1)
            java.lang.String r1 = r5.getName()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.lang.Class[] r5 = r5.getParameterTypes()
            r5.getClass()
            j72 r1 = new j72
            r2 = 24
            r1.<init>(r2)
            r2 = 30
            java.lang.String r3 = ","
            r4 = 0
            java.lang.String r5 = p000.AbstractC0312g7.m2256(r5, r3, r4, r1, r2)
            r1 = 41
            java.lang.String r5 = p000.AbstractC0602nx.m4132(r0, r5, r1)
            return r5
    }

    /* JADX INFO: renamed from: β */
    public final void m2487(java.lang.reflect.Method r6, p000.ya2 r7, java.lang.String r8) {
            r5 = this;
            java.lang.String r0 = m2486(r6)
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = p000.hb2.f4681
            boolean r2 = r1.add(r0)
            if (r2 != 0) goto Ld
            goto L4a
        Ld:
            r2 = 1
            r6.setAccessible(r2)     // Catch: java.lang.Throwable -> L1f
            xq0 r2 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L1f
            qg r3 = new qg     // Catch: java.lang.Throwable -> L1f
            r4 = 9
            r3.<init>(r5, r7, r8, r4)     // Catch: java.lang.Throwable -> L1f
            l01 r5 = r2.m6775(r6, r3)     // Catch: java.lang.Throwable -> L1f
            goto L26
        L1f:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L26:
            boolean r6 = r5 instanceof p000.eo1
            java.lang.String r7 = "re4b6c41332ef57c6"
            if (r6 != 0) goto L38
            r6 = r5
            l01 r6 = (p000.l01) r6
            java.lang.String r6 = "已安装结构化语音完成 Hook: "
            java.lang.String r6 = r6.concat(r0)
            p000.C0888ux.m5975(r7, r6)
        L38:
            java.lang.Throwable r5 = p000.fo1.m2190(r5)
            if (r5 == 0) goto L4a
            r1.remove(r0)
            java.lang.String r6 = "结构化语音完成 Hook 安装失败: "
            java.lang.String r6 = r6.concat(r0)
            p000.C0888ux.m5977(r7, r6, r5)
        L4a:
            return
    }
}
