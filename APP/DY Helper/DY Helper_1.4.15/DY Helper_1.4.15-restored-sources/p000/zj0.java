package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class zj0 {

    /* JADX INFO: renamed from: α */
    public static final p000.zj0 f13118 = null;

    /* JADX INFO: renamed from: β */
    public static volatile java.lang.ref.WeakReference f13119;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f13120 = null;

    /* JADX INFO: renamed from: δ */
    public static volatile java.lang.ClassLoader f13121;

    /* JADX INFO: renamed from: ε */
    public static volatile java.lang.ref.WeakReference f13122;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.concurrent.atomic.AtomicBoolean f13123 = null;

    /* JADX INFO: renamed from: η */
    public static final java.util.concurrent.atomic.AtomicBoolean f13124 = null;

    /* JADX INFO: renamed from: θ */
    public static final java.util.concurrent.atomic.AtomicBoolean f13125 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.h22 f13126 = null;

    /* JADX INFO: renamed from: κ */
    public static final int[] f13127 = null;

    /* JADX INFO: renamed from: λ */
    public static final java.lang.String[] f13128 = null;

    static {
            zj0 r0 = new zj0
            r0.<init>()
            p000.zj0.f13118 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.zj0.f13120 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.zj0.f13123 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.zj0.f13124 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.zj0.f13125 = r0
            o7 r0 = new o7
            r1 = 28
            r0.<init>(r1)
            h22 r1 = new h22
            r1.<init>(r0)
            p000.zj0.f13126 = r1
            r0 = 17
            int[] r0 = new int[r0]
            r0 = {x004e: FILL_ARRAY_DATA , data: [1, 2, 3, 4, 5, 6, 7, 8, 9, 42, 50, 51, 52, 53, 99, 501, 9901} // fill-array
            p000.zj0.f13127 = r0
            java.lang.String r0 = "~79504AF3D2914B0617A99E1CFF7635F71B1D318AD2ED0F06920675D78278AC2B9B172F97EAB05791E23028D75CAFEBBC86"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~795CFE82BF8D864C285649BA56CE33B4C18838459A84C50FE419E35FE204466F8D2561AAF8AA290694109CAA750A811D72F9"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            p000.zj0.f13128 = r0
            return
    }

    /* JADX INFO: renamed from: Α */
    public static java.lang.Object m7132(java.lang.Object r10) {
            r1 = 0
            if (r10 != 0) goto L5
            goto Lc8
        L5:
            boolean r0 = m7150(r10)
            if (r0 == 0) goto Lc
            return r10
        Lc:
            r2 = 1
            java.lang.Class r0 = r10.getClass()     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "getValue"
            r4 = 0
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L26
            java.lang.reflect.Method r0 = m7145(r0, r3, r4)     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L1e
            r0 = r1
            goto L2d
        L1e:
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L26
            java.lang.Object r0 = r0.invoke(r10, r1)     // Catch: java.lang.Throwable -> L26
            goto L2d
        L26:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L2d:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L32
            r0 = r1
        L32:
            boolean r3 = m7150(r0)
            if (r3 == 0) goto L39
            return r0
        L39:
            java.lang.String r8 = "LIZIZ"
            java.lang.String r9 = "LIZJ"
            java.lang.String r4 = "getConversationListModel"
            java.lang.String r5 = "conversationListModel"
            java.lang.String r6 = "getConvListModel"
            java.lang.String r7 = "LIZ"
            java.lang.String[] r0 = new java.lang.String[]{r4, r5, r6, r7, r8, r9}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            java.lang.Class r3 = r10.getClass()
            java.util.ArrayList r3 = m7141(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L5e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L79
            java.lang.Object r5 = r3.next()
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.Class[] r6 = r6.getParameterTypes()
            r6.getClass()
            int r6 = r6.length
            if (r6 != 0) goto L5e
            r4.add(r5)
            goto L5e
        L79:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r4.iterator()
        L82:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Laa
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r7 = r6.getName()
            boolean r7 = r0.contains(r7)
            if (r7 != 0) goto La6
            java.lang.Class r6 = r6.getReturnType()
            r6.getClass()
            boolean r6 = m7156(r6)
            if (r6 == 0) goto L82
        La6:
            r3.add(r5)
            goto L82
        Laa:
            java.util.Iterator r0 = r3.iterator()
        Lae:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lc8
            java.lang.Object r3 = r0.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r3 = r3.invoke(r10, r1)     // Catch: java.lang.Throwable -> Lae
            boolean r4 = m7150(r3)     // Catch: java.lang.Throwable -> Lae
            if (r4 == 0) goto Lae
            return r3
        Lc8:
            return r1
    }

    /* JADX INFO: renamed from: Β */
    public static java.lang.Object m7133(java.lang.ClassLoader r7) {
            r0 = 0
            java.lang.String r1 = "~794CAD4569E61E2D43B867359EB6123EE8F803FCDE2CE5CBCC8F2E17EC0A94ED7DDF376B1F1CCFFF57998EAEE9C317A38A8FB63CCDD0"
            java.lang.String r1 = p000.jf0.m2957(r1)     // Catch: java.lang.Throwable -> L7e
            r2 = 0
            java.lang.Class r7 = java.lang.Class.forName(r1, r2, r7)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = "LJFF"
            java.lang.String r3 = "LIZ"
            java.lang.String r4 = "LIZIZ"
            java.lang.String[] r1 = new java.lang.String[]{r1, r3, r4}     // Catch: java.lang.Throwable -> L7e
            r3 = r2
        L17:
            r4 = 3
            if (r3 >= r4) goto L83
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L7e
            r7.getClass()     // Catch: java.lang.Throwable -> L7e
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L7e
            java.lang.reflect.Method r5 = m7145(r7, r4, r5)     // Catch: java.lang.Throwable -> L7e
            if (r5 != 0) goto L28
            goto L80
        L28:
            int r6 = r5.getModifiers()     // Catch: java.lang.Throwable -> L7e
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)     // Catch: java.lang.Throwable -> L7e
            if (r6 == 0) goto L80
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L7e
            r6.getClass()     // Catch: java.lang.Throwable -> L7e
            int r6 = r6.length     // Catch: java.lang.Throwable -> L7e
            if (r6 != 0) goto L80
            r6 = 1
            r5.setAccessible(r6)     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r5 = r5.invoke(r0, r0)     // Catch: java.lang.Throwable -> L7e
            boolean r6 = m7153(r5)     // Catch: java.lang.Throwable -> L7e
            if (r6 == 0) goto L80
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L7e
            r5.getClass()     // Catch: java.lang.Throwable -> L7e
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L7e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e
            r2.<init>()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r3 = "DYHelperIMMarkAllReadHelper: 获取 NoticeCountService 成功: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L7e
            r2.append(r7)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r7 = "."
            r2.append(r7)     // Catch: java.lang.Throwable -> L7e
            r2.append(r4)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r7 = "() -> "
            r2.append(r7)     // Catch: java.lang.Throwable -> L7e
            r2.append(r1)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L7e
            p000.C0888ux.m5985(r7)     // Catch: java.lang.Throwable -> L7e
            return r5
        L7e:
            r7 = move-exception
            goto L85
        L80:
            int r3 = r3 + 1
            goto L17
        L83:
            r1 = r0
            goto L8a
        L85:
            eo1 r1 = new eo1
            r1.<init>(r7)
        L8a:
            if (r1 == 0) goto L8d
            goto L8e
        L8d:
            r0 = r1
        L8e:
            return r0
    }

    /* JADX INFO: renamed from: Γ */
    public static void m7134(p000.a80 r3, p000.yj0 r4) {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L12
            r3.invoke(r4)
            return
        L12:
            h22 r0 = p000.zj0.f13126
            java.lang.Object r0 = r0.getValue()
            android.os.Handler r0 = (android.os.Handler) r0
            ii0 r1 = new ii0
            r2 = 3
            r1.<init>(r3, r2, r4)
            r0.post(r1)
            return
    }

    /* JADX INFO: renamed from: Δ */
    public static java.lang.String m7135(java.lang.reflect.Method r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 35
            r0.append(r1)
            java.lang.String r1 = r6.getName()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.lang.Class[] r1 = r6.getParameterTypes()
            r1.getClass()
            fj0 r2 = new fj0
            r3 = 8
            r2.<init>(r3)
            r3 = 30
            java.lang.String r4 = ","
            r5 = 0
            java.lang.String r1 = p000.AbstractC0312g7.m2256(r1, r4, r5, r2, r3)
            java.lang.String r2 = "):"
            java.lang.String r6 = p000.lz1.m3692(r0, r1, r2, r6)
            return r6
    }

    /* JADX INFO: renamed from: Ε */
    public static void m7136(java.lang.ClassLoader r14, boolean r15) {
            s62 r1 = p000.s62.f9751
            r2 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            m7147(r14)
            java.lang.Class r9 = java.lang.Integer.TYPE
            r10 = 0
            if (r15 == 0) goto L31
            java.lang.Object r0 = m7133(r14)
            if (r0 == 0) goto L16
            goto L17
        L16:
            r0 = r10
        L17:
            if (r0 != 0) goto L1a
            goto L31
        L1a:
            java.lang.String r3 = "cleanNoticeUnreadRedDot"
            m7148(r0, r3)     // Catch: java.lang.Throwable -> L1f
        L1f:
            java.lang.String r3 = "clearNoticeCountMessage"
            m7148(r0, r3)     // Catch: java.lang.Throwable -> L24
        L24:
            r9.getClass()
            java.lang.String r3 = "updateUnreadOnShow"
            m7149(r0, r3)
            java.lang.String r3 = "saveUnreadCountForFirstFrame"
            m7149(r0, r3)
        L31:
            r0 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.ref.WeakReference r0 = p000.zj0.f13119
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r0.get()
            goto L40
        L3f:
            r0 = r10
        L40:
            boolean r5 = m7151(r0)
            if (r5 == 0) goto L47
            goto L4c
        L47:
            if (r0 == 0) goto L4b
            p000.zj0.f13119 = r10
        L4b:
            r0 = r10
        L4c:
            r11 = 1
            if (r0 != 0) goto L52
        L4f:
            r3 = r2
            goto Lf7
        L52:
            java.lang.Class r5 = r0.getClass()
            java.lang.Object r6 = p000.C0666ox.f8297
            kx r6 = p000.EnumC0491kx.f6237
            java.util.List r6 = p000.C0666ox.m4323(r6, r14)
            if (r6 == 0) goto L8c
            java.util.Iterator r6 = r6.iterator()
        L64:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L82
            java.lang.Object r7 = r6.next()
            r8 = r7
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            boolean r12 = m7152(r8)
            if (r12 == 0) goto L64
            java.lang.Class r8 = r8.getDeclaringClass()
            boolean r8 = r8.isAssignableFrom(r5)
            if (r8 == 0) goto L64
            goto L83
        L82:
            r7 = r10
        L83:
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            if (r7 == 0) goto L8c
            r7.setAccessible(r11)
        L8a:
            r12 = r7
            goto Lae
        L8c:
            java.lang.Class[] r6 = m7158()
            r7 = 6
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.Class[] r6 = (java.lang.Class[]) r6
            java.lang.String r7 = "LJIIL"
            java.lang.reflect.Method r7 = m7145(r5, r7, r6)
            if (r7 == 0) goto La3
            r7.setAccessible(r11)
            goto L8a
        La3:
            java.lang.reflect.Method r7 = m7144(r5)
            if (r7 == 0) goto Lad
            r7.setAccessible(r11)
            goto L8a
        Lad:
            r12 = r10
        Lae:
            if (r12 != 0) goto Lb1
            goto L4f
        Lb1:
            r12.setAccessible(r11)     // Catch: java.lang.Throwable -> Lcf
            r5 = -1001(0xfffffffffffffc17, float:NaN)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lcf
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lcf
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> Lcf
            java.lang.Boolean r8 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Lcf
            r5 = r3
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8}     // Catch: java.lang.Throwable -> Lcf
            r12.invoke(r0, r3)     // Catch: java.lang.Throwable -> Lcf
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lcf
            goto Ld6
        Lcf:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        Ld6:
            java.lang.Throwable r3 = p000.fo1.m2190(r0)
            if (r3 == 0) goto Le9
            java.lang.Throwable r3 = m7138(r3)
            java.lang.String r3 = r3.getMessage()
            java.lang.String r5 = "DYHelperIMMarkAllReadHelper: 调用消息底栏官方同步入口失败 reason=mark_all_read: "
            p000.AbstractC0602nx.m4142(r5, r3)
        Le9:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r5 = r0 instanceof p000.eo1
            if (r5 == 0) goto Lf0
            r0 = r3
        Lf0:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = r0
        Lf7:
            if (r15 == 0) goto L311
            java.lang.String r0 = "~7918AA8387C201967A78D8C508850873CE3917C7649E64AEFEF68349924683F73255C4"
            java.lang.String r0 = p000.jf0.m2957(r0)     // Catch: java.lang.Throwable -> L144
            java.lang.Class r0 = java.lang.Class.forName(r0, r2, r14)     // Catch: java.lang.Throwable -> L144
            r0.getClass()     // Catch: java.lang.Throwable -> L144
            java.lang.String r5 = "get"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L144
            java.lang.reflect.Method r0 = m7145(r0, r5, r6)     // Catch: java.lang.Throwable -> L144
            if (r0 != 0) goto L111
            goto L142
        L111:
            r0.setAccessible(r11)     // Catch: java.lang.Throwable -> L144
            java.lang.Object r0 = r0.invoke(r10, r10)     // Catch: java.lang.Throwable -> L144
            if (r0 != 0) goto L11b
            goto L142
        L11b:
            java.lang.String r5 = "getMiscService"
            java.lang.Object r0 = m7148(r0, r5)     // Catch: java.lang.Throwable -> L144
            if (r0 != 0) goto L124
            goto L142
        L124:
            java.lang.Class r5 = r0.getClass()     // Catch: java.lang.Throwable -> L144
            java.lang.String r6 = "setUnReadNotification"
            r9.getClass()     // Catch: java.lang.Throwable -> L144
            java.lang.Class[] r7 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> L144
            java.lang.reflect.Method r5 = m7145(r5, r6, r7)     // Catch: java.lang.Throwable -> L144
            if (r5 != 0) goto L138
            goto L142
        L138:
            r5.setAccessible(r11)     // Catch: java.lang.Throwable -> L144
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L144
            r5.invoke(r0, r4)     // Catch: java.lang.Throwable -> L144
        L142:
            r4 = r1
            goto L14a
        L144:
            r0 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r0)
        L14a:
            java.lang.Throwable r0 = p000.fo1.m2190(r4)
            if (r0 == 0) goto L15d
            java.lang.Throwable r0 = m7138(r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "DYHelperIMMarkAllReadHelper: IMProxy.setUnReadNotification(0) 失败: "
            p000.AbstractC0602nx.m4142(r4, r0)
        L15d:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.lang.Object r4 = p000.C0666ox.f8297
            kx r4 = p000.EnumC0491kx.f6238
            java.util.List r4 = p000.C0666ox.m4323(r4, r14)
            if (r4 == 0) goto L180
            java.util.Iterator r4 = r4.iterator()
        L170:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L180
            java.lang.Object r5 = r4.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r0.add(r5)
            goto L170
        L180:
            java.lang.String r4 = "X.C1D2R"
            java.lang.Class r4 = java.lang.Class.forName(r4, r2, r14)     // Catch: java.lang.Throwable -> L196
            r4.getClass()     // Catch: java.lang.Throwable -> L196
            java.lang.String r5 = "LIZIZ"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L196
            java.lang.reflect.Method r4 = m7145(r4, r5, r6)     // Catch: java.lang.Throwable -> L196
            if (r4 == 0) goto L196
            r0.add(r4)     // Catch: java.lang.Throwable -> L196
        L196:
            f7 r4 = new f7
            r4.<init>(r11, r0)
            fj0 r0 = new fj0
            r5 = 15
            r0.<init>(r5)
            y30 r5 = new y30
            r5.<init>(r4, r11, r0)
            fj0 r0 = new fj0
            r4 = 16
            r0.<init>(r4)
            bu r4 = new bu
            java.util.Iterator r5 = r5.iterator()
            r4.<init>(r5, r0)
        L1b7:
            boolean r0 = r4.hasNext()
            java.lang.String r5 = ": "
            java.lang.String r6 = "~796C0BCB62BCE6FE82C87A254D6EEBA7FF748413BC384A31402FE9BA9F30948A670001E2D4808D3133D3F257606C724B89E9F07FB88FFFB404014B46C523"
            if (r0 == 0) goto L246
            java.lang.Object r0 = r4.next()
            r7 = r0
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            r7.setAccessible(r11)     // Catch: java.lang.Throwable -> L215
            java.lang.Object r8 = r7.invoke(r10, r10)     // Catch: java.lang.Throwable -> L215
            java.lang.Class r0 = r7.getReturnType()     // Catch: java.lang.Throwable -> L215
            if (r8 != 0) goto L1d7
            r0 = r2
            goto L210
        L1d7:
            if (r0 == 0) goto L1de
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L215
            goto L1df
        L1de:
            r0 = r10
        L1df:
            java.lang.String r12 = p000.jf0.m2957(r6)     // Catch: java.lang.Throwable -> L215
            boolean r0 = p000.ln0.m3626(r0, r12)     // Catch: java.lang.Throwable -> L215
            if (r0 == 0) goto L1eb
            r0 = r11
            goto L210
        L1eb:
            java.lang.String r0 = p000.jf0.m2957(r6)     // Catch: java.lang.Throwable -> L1fc
            java.lang.Class r0 = java.lang.Class.forName(r0, r2, r14)     // Catch: java.lang.Throwable -> L1fc
            boolean r0 = r0.isInstance(r8)     // Catch: java.lang.Throwable -> L1fc
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L1fc
            goto L203
        L1fc:
            r0 = move-exception
            eo1 r12 = new eo1     // Catch: java.lang.Throwable -> L215
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L215
            r0 = r12
        L203:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L215
            boolean r13 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L215
            if (r13 == 0) goto L20a
            r0 = r12
        L20a:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L215
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L215
        L210:
            if (r0 == 0) goto L213
            goto L247
        L213:
            r6 = r1
            goto L21b
        L215:
            r0 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r0)
        L21b:
            java.lang.Throwable r0 = p000.fo1.m2190(r6)
            if (r0 == 0) goto L1b7
            java.lang.String r6 = m7135(r7)
            java.lang.Throwable r0 = m7138(r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "DYHelperIMMarkAllReadHelper: 获取首页底栏能力失败 "
            r7.<init>(r8)
            r7.append(r6)
            r7.append(r5)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            p000.C0888ux.m5985(r0)
            goto L1b7
        L246:
            r8 = r10
        L247:
            if (r8 != 0) goto L24b
            goto L311
        L24b:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.lang.Object r1 = p000.C0666ox.f8297
            kx r1 = p000.EnumC0491kx.f6239
            java.util.List r1 = p000.C0666ox.m4323(r1, r14)
            if (r1 == 0) goto L26e
            java.util.Iterator r1 = r1.iterator()
        L25e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L26e
            java.lang.Object r4 = r1.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r0.add(r4)
            goto L25e
        L26e:
            java.lang.String r1 = p000.jf0.m2957(r6)     // Catch: java.lang.Throwable -> L29b
            java.lang.Class r1 = java.lang.Class.forName(r1, r2, r14)     // Catch: java.lang.Throwable -> L29b
            java.lang.String r4 = "X.C2252171Cxw"
            java.lang.Class r14 = java.lang.Class.forName(r4, r2, r14)     // Catch: java.lang.Throwable -> L29b
            r14.getClass()     // Catch: java.lang.Throwable -> L29b
            java.lang.String r4 = "LIZ"
            r1.getClass()     // Catch: java.lang.Throwable -> L29b
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r9.getClass()     // Catch: java.lang.Throwable -> L29b
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L29b
            r7.getClass()     // Catch: java.lang.Throwable -> L29b
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r6, r9, r7, r9}     // Catch: java.lang.Throwable -> L29b
            java.lang.reflect.Method r14 = m7145(r14, r4, r1)     // Catch: java.lang.Throwable -> L29b
            if (r14 == 0) goto L29b
            r0.add(r14)     // Catch: java.lang.Throwable -> L29b
        L29b:
            f7 r14 = new f7
            r14.<init>(r11, r0)
            fj0 r0 = new fj0
            r1 = 7
            r0.<init>(r1)
            y30 r1 = new y30
            r1.<init>(r14, r11, r0)
            fj0 r14 = new fj0
            r0 = 12
            r14.<init>(r0)
            bu r4 = new bu
            java.util.Iterator r0 = r1.iterator()
            r4.<init>(r0, r14)
        L2bb:
            boolean r14 = r4.hasNext()
            if (r14 == 0) goto L311
            java.lang.Object r14 = r4.next()
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            r14.setAccessible(r11)     // Catch: java.lang.Throwable -> L2e1
            java.lang.String r0 = "homepage_notification"
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L2e1
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2e1
            r7 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L2e1
            java.lang.Object[] r0 = new java.lang.Object[]{r8, r0, r1, r6, r7}     // Catch: java.lang.Throwable -> L2e1
            r14.invoke(r10, r0)     // Catch: java.lang.Throwable -> L2e1
            r2 = r11
            goto L311
        L2e1:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            java.lang.Throwable r0 = p000.fo1.m2190(r1)
            if (r0 == 0) goto L2bb
            java.lang.String r14 = m7135(r14)
            java.lang.Throwable r0 = m7138(r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r6 = "DYHelperIMMarkAllReadHelper: 清理首页消息底栏红点失败 "
            r1.<init>(r6)
            r1.append(r14)
            r1.append(r5)
            r1.append(r0)
            java.lang.String r14 = r1.toString()
            p000.C0888ux.m5985(r14)
            goto L2bb
        L311:
            if (r3 != 0) goto L315
            if (r2 == 0) goto L336
        L315:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "DYHelperIMMarkAllReadHelper: 已同步消息底栏未读显示 reason=mark_all_read helper="
            r14.<init>(r0)
            r14.append(r3)
            java.lang.String r0 = " forceZero="
            r14.append(r0)
            r14.append(r15)
            java.lang.String r15 = " hide="
            r14.append(r15)
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            p000.C0888ux.m5985(r14)
        L336:
            return
    }

    /* JADX INFO: renamed from: Ζ */
    public static java.lang.Object m7137(java.lang.Class r11, java.util.ArrayList r12) {
            java.lang.String r4 = "getInstance"
            java.lang.String r5 = "getConversationListModel"
            java.lang.String r0 = "LIZ"
            java.lang.String r1 = "LIZIZ"
            java.lang.String r2 = "LIZJ"
            java.lang.String r3 = "inst"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            java.util.Set r1 = p000.AbstractC0312g7.m2263(r0)
            java.util.ArrayList r0 = m7141(r11)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L41
            java.lang.Object r4 = r0.next()
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.String r5 = m7135(r5)
            boolean r5 = r2.add(r5)
            if (r5 == 0) goto L26
            r3.add(r4)
            goto L26
        L41:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r3.iterator()
        L4a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L79
            java.lang.Object r4 = r2.next()
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            int r6 = r5.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 == 0) goto L4a
            java.lang.Class[] r6 = r5.getParameterTypes()
            r6.getClass()
            int r6 = r6.length
            if (r6 != 0) goto L4a
            java.lang.String r5 = r5.getName()
            boolean r5 = r1.contains(r5)
            if (r5 == 0) goto L4a
            r0.add(r4)
            goto L4a
        L79:
            java.util.Iterator r2 = r0.iterator()
        L7d:
            boolean r0 = r2.hasNext()
            java.lang.String r4 = " "
            java.lang.String r5 = "#"
            java.lang.String r6 = ""
            r7 = 1
            r8 = 0
            if (r0 == 0) goto Ldc
            java.lang.Object r0 = r2.next()
            r9 = r0
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            r9.setAccessible(r7)     // Catch: java.lang.Throwable -> La0
            java.lang.Object r0 = r9.invoke(r8, r8)     // Catch: java.lang.Throwable -> La0
            java.lang.Object r0 = m7132(r0)     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto La6
            return r0
        La0:
            r0 = move-exception
            eo1 r8 = new eo1
            r8.<init>(r0)
        La6:
            java.lang.Throwable r0 = p000.fo1.m2190(r8)
            if (r0 == 0) goto L7d
            java.lang.String r7 = r11.getName()
            java.lang.String r8 = r9.getName()
            java.lang.Throwable r0 = m7138(r0)
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto Lbf
            goto Lc0
        Lbf:
            r6 = r0
        Lc0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r5)
            r0.append(r8)
            r0.append(r4)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r12.add(r0)
            goto L7d
        Ldc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r3.iterator()
        Le5:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L117
            java.lang.Object r3 = r2.next()
            r9 = r3
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            int r10 = r9.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isStatic(r10)
            if (r10 == 0) goto Le5
            java.lang.Class[] r10 = r9.getParameterTypes()
            r10.getClass()
            int r10 = r10.length
            if (r10 != 0) goto Le5
            java.lang.Class r9 = r9.getReturnType()
            r9.getClass()
            boolean r9 = m7156(r9)
            if (r9 == 0) goto Le5
            r0.add(r3)
            goto Le5
        L117:
            java.util.Iterator r2 = r0.iterator()
        L11b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L173
            java.lang.Object r0 = r2.next()
            r3 = r0
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            r3.setAccessible(r7)     // Catch: java.lang.Throwable -> L138
            java.lang.Object r0 = r3.invoke(r8, r8)     // Catch: java.lang.Throwable -> L138
            java.lang.Object r0 = m7132(r0)     // Catch: java.lang.Throwable -> L138
            if (r0 == 0) goto L136
            return r0
        L136:
            r9 = r8
            goto L13e
        L138:
            r0 = move-exception
            eo1 r9 = new eo1
            r9.<init>(r0)
        L13e:
            java.lang.Throwable r0 = p000.fo1.m2190(r9)
            if (r0 == 0) goto L11b
            java.lang.String r9 = r11.getName()
            java.lang.String r3 = r3.getName()
            java.lang.Throwable r0 = m7138(r0)
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L157
            r0 = r6
        L157:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r5)
            r10.append(r3)
            r10.append(r4)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            r12.add(r0)
            goto L11b
        L173:
            java.lang.String r12 = "Companion"
            r2 = r11
        L176:
            if (r2 == 0) goto L193
            java.lang.reflect.Field r0 = r2.getDeclaredField(r12)     // Catch: java.lang.Throwable -> L17d
            goto L184
        L17d:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L184:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L189
            r0 = r8
        L189:
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            if (r0 == 0) goto L18e
            goto L194
        L18e:
            java.lang.Class r2 = r2.getSuperclass()
            goto L176
        L193:
            r0 = r8
        L194:
            if (r0 != 0) goto L198
            r12 = r8
            goto L19f
        L198:
            r0.setAccessible(r7)
            java.lang.Object r12 = r0.get(r8)
        L19f:
            if (r12 == 0) goto L1f5
            java.lang.Class r0 = r12.getClass()
            java.util.ArrayList r0 = m7141(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1b2:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1d7
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.Class[] r5 = r4.getParameterTypes()
            r5.getClass()
            int r5 = r5.length
            if (r5 != 0) goto L1b2
            java.lang.String r4 = r4.getName()
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L1b2
            r2.add(r3)
            goto L1b2
        L1d7:
            java.util.Iterator r0 = r2.iterator()
        L1db:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f5
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.setAccessible(r7)     // Catch: java.lang.Throwable -> L1db
            java.lang.Object r1 = r1.invoke(r12, r8)     // Catch: java.lang.Throwable -> L1db
            java.lang.Object r1 = m7132(r1)     // Catch: java.lang.Throwable -> L1db
            if (r1 == 0) goto L1db
            return r1
        L1f5:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L1fa:
            if (r11 == 0) goto L201
            java.lang.Class r11 = p000.lz1.m3684(r11, r12)
            goto L1fa
        L201:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r12.iterator()
        L20a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L256
            java.lang.Object r0 = r12.next()
            r1 = r0
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            int r2 = r1.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 == 0) goto L20a
            java.lang.Class r2 = r1.getType()
            r2.getClass()
            boolean r2 = m7156(r2)
            if (r2 != 0) goto L252
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = "LIZ"
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L252
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = "LIZIZ"
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L252
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "INSTANCE"
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L20a
        L252:
            r11.add(r0)
            goto L20a
        L256:
            java.util.Iterator r11 = r11.iterator()
        L25a:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L274
            java.lang.Object r12 = r11.next()
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            r12.setAccessible(r7)     // Catch: java.lang.Throwable -> L25a
            java.lang.Object r12 = r12.get(r8)     // Catch: java.lang.Throwable -> L25a
            java.lang.Object r12 = m7132(r12)     // Catch: java.lang.Throwable -> L25a
            if (r12 == 0) goto L25a
            return r12
        L274:
            return r8
    }

    /* JADX INFO: renamed from: Η */
    public static java.lang.Throwable m7138(java.lang.Throwable r2) {
        L0:
            boolean r0 = r2 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto L15
            r0 = r2
            java.lang.reflect.InvocationTargetException r0 = (java.lang.reflect.InvocationTargetException) r0
            java.lang.Throwable r1 = r0.getTargetException()
            if (r1 == 0) goto L15
            java.lang.Throwable r2 = r0.getTargetException()
            r2.getClass()
            goto L0
        L15:
            return r2
    }

    /* JADX INFO: renamed from: α */
    public static final boolean m7139(p000.zj0 r2, java.lang.reflect.Method r3) {
            r2.getClass()
            java.lang.Class[] r2 = r3.getParameterTypes()
            java.lang.Class r3 = r3.getReturnType()
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r3 = p000.ln0.m3626(r3, r0)
            r0 = 0
            if (r3 == 0) goto L2e
            int r3 = r2.length
            r1 = 2
            if (r3 != r1) goto L2e
            r3 = r2[r0]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r3 = p000.ln0.m3626(r3, r1)
            if (r3 == 0) goto L2e
            r3 = 1
            r2 = r2[r3]
            java.lang.Class<int[]> r1 = int[].class
            boolean r2 = p000.ln0.m3626(r2, r1)
            if (r2 == 0) goto L2e
            return r3
        L2e:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static final java.util.ArrayList m7140(org.luckypray.dexkit.result.MethodDataList r11, java.lang.ClassLoader r12) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L9:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L84
            java.lang.Object r1 = r11.next()
            r2 = 0
            if (r1 != 0) goto L17
            goto L6e
        L17:
            java.lang.Class r3 = r1.getClass()     // Catch: java.lang.Throwable -> L4c
            java.lang.reflect.Method[] r3 = r3.getMethods()     // Catch: java.lang.Throwable -> L4c
            r3.getClass()     // Catch: java.lang.Throwable -> L4c
            int r4 = r3.length     // Catch: java.lang.Throwable -> L4c
            r5 = 0
            r6 = r5
        L25:
            r7 = 1
            if (r6 >= r4) goto L51
            r8 = r3[r6]     // Catch: java.lang.Throwable -> L4c
            java.lang.String r9 = r8.getName()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r10 = "getMethodInstance"
            boolean r9 = p000.ln0.m3626(r9, r10)     // Catch: java.lang.Throwable -> L4c
            if (r9 == 0) goto L4e
            java.lang.Class[] r9 = r8.getParameterTypes()     // Catch: java.lang.Throwable -> L4c
            int r9 = r9.length     // Catch: java.lang.Throwable -> L4c
            if (r9 != r7) goto L4e
            java.lang.Class[] r9 = r8.getParameterTypes()     // Catch: java.lang.Throwable -> L4c
            r9 = r9[r5]     // Catch: java.lang.Throwable -> L4c
            java.lang.Class<java.lang.ClassLoader> r10 = java.lang.ClassLoader.class
            boolean r9 = p000.ln0.m3626(r9, r10)     // Catch: java.lang.Throwable -> L4c
            if (r9 == 0) goto L4e
            goto L52
        L4c:
            r1 = move-exception
            goto L70
        L4e:
            int r6 = r6 + 1
            goto L25
        L51:
            r8 = r2
        L52:
            if (r8 != 0) goto L55
            goto L6e
        L55:
            r8.setAccessible(r7)     // Catch: java.lang.Throwable -> L4c
            java.lang.Object[] r3 = new java.lang.Object[]{r12}     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r8.invoke(r1, r3)     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r1 instanceof java.lang.reflect.Method     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L67
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L4c
            goto L68
        L67:
            r1 = r2
        L68:
            if (r1 == 0) goto L6e
            r1.setAccessible(r7)     // Catch: java.lang.Throwable -> L4c
            goto L76
        L6e:
            r1 = r2
            goto L76
        L70:
            eo1 r3 = new eo1
            r3.<init>(r1)
            r1 = r3
        L76:
            boolean r3 = r1 instanceof p000.eo1
            if (r3 == 0) goto L7b
            goto L7c
        L7b:
            r2 = r1
        L7c:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto L9
            r0.add(r2)
            goto L9
        L84:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static java.util.ArrayList m7141(java.lang.Class r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r4
        L6:
            if (r1 == 0) goto L17
            java.lang.reflect.Method[] r2 = r1.getDeclaredMethods()
            r2.getClass()
            p000.AbstractC0984xh.m6659(r0, r2)
            java.lang.Class r1 = r1.getSuperclass()
            goto L6
        L17:
            java.lang.reflect.Method[] r4 = r4.getMethods()
            r4.getClass()
            p000.AbstractC0984xh.m6659(r0, r4)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r3 = m7135(r3)
            boolean r3 = r4.add(r3)
            if (r3 == 0) goto L2f
            r1.add(r2)
            goto L2f
        L4a:
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public static void m7142(java.lang.Object r2, java.lang.String r3) {
            boolean r0 = m7150(r2)
            if (r0 != 0) goto L7
            goto L13
        L7:
            java.lang.ref.WeakReference r0 = p000.zj0.f13122
            if (r0 == 0) goto L10
            java.lang.Object r0 = r0.get()
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 != r2) goto L14
        L13:
            return
        L14:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            p000.zj0.f13122 = r0
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DYHelperIMMarkAllReadHelper: 捕获 ConversationListModel 实例: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " -> "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            p000.C0888ux.m5985(r2)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.reflect.Method m7143(java.lang.Class[] r6, java.lang.String r7, java.lang.Class... r8) {
            int r0 = r6.length
            r1 = 0
        L2:
            r2 = 0
            if (r1 >= r0) goto L3d
            r3 = r6[r1]
            int r4 = r8.length     // Catch: java.lang.Throwable -> L13
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r8, r4)     // Catch: java.lang.Throwable -> L13
            java.lang.Class[] r4 = (java.lang.Class[]) r4     // Catch: java.lang.Throwable -> L13
            java.lang.reflect.Method r4 = r3.getDeclaredMethod(r7, r4)     // Catch: java.lang.Throwable -> L13
            goto L1a
        L13:
            r4 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L1a:
            boolean r5 = r4 instanceof p000.eo1
            if (r5 == 0) goto L1f
            goto L20
        L1f:
            r2 = r4
        L20:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto L25
            return r2
        L25:
            java.lang.Class[] r2 = r3.getInterfaces()
            r2.getClass()
            int r3 = r8.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r8, r3)
            java.lang.Class[] r3 = (java.lang.Class[]) r3
            java.lang.reflect.Method r2 = m7143(r2, r7, r3)
            if (r2 == 0) goto L3a
            return r2
        L3a:
            int r1 = r1 + 1
            goto L2
        L3d:
            return r2
    }

    /* JADX INFO: renamed from: η */
    public static java.lang.reflect.Method m7144(java.lang.Class r2) {
            java.util.ArrayList r2 = m7141(r2)
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r2.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = m7152(r1)
            if (r1 == 0) goto L8
            goto L1d
        L1c:
            r0 = 0
        L1d:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static java.lang.reflect.Method m7145(java.lang.Class r3, java.lang.String r4, java.lang.Class... r5) {
            int r0 = r5.length     // Catch: java.lang.Throwable -> Lc
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r5, r0)     // Catch: java.lang.Throwable -> Lc
            java.lang.Class[] r0 = (java.lang.Class[]) r0     // Catch: java.lang.Throwable -> Lc
            java.lang.reflect.Method r0 = r3.getMethod(r4, r0)     // Catch: java.lang.Throwable -> Lc
            goto L13
        Lc:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L13:
            boolean r1 = r0 instanceof p000.eo1
            r2 = 0
            if (r1 == 0) goto L19
            r0 = r2
        L19:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto L1e
            return r0
        L1e:
            if (r3 == 0) goto L57
            int r0 = r5.length     // Catch: java.lang.Throwable -> L2c
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r5, r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.Class[] r0 = (java.lang.Class[]) r0     // Catch: java.lang.Throwable -> L2c
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r4, r0)     // Catch: java.lang.Throwable -> L2c
            goto L33
        L2c:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L33:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L38
            r0 = r2
        L38:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto L3d
            return r0
        L3d:
            java.lang.Class[] r0 = r3.getInterfaces()
            r0.getClass()
            int r1 = r5.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r1)
            java.lang.Class[] r1 = (java.lang.Class[]) r1
            java.lang.reflect.Method r0 = m7143(r0, r4, r1)
            if (r0 == 0) goto L52
            return r0
        L52:
            java.lang.Class r3 = r3.getSuperclass()
            goto L1e
        L57:
            return r2
    }

    /* JADX INFO: renamed from: ι */
    public static final void m7146(java.util.LinkedHashMap r5, java.lang.Object r6) {
            boolean r0 = r6 instanceof java.util.Map
            if (r0 != 0) goto L6
            goto L71
        L6:
            java.util.Map r6 = (java.util.Map) r6
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L10:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            boolean r2 = r1 instanceof java.lang.Number
            r3 = 0
            if (r2 == 0) goto L2d
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2
            goto L2e
        L2d:
            r2 = r3
        L2e:
            r4 = 10
            if (r2 == 0) goto L3b
            int r1 = r2.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L49
        L3b:
            if (r1 == 0) goto L48
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L48
            java.lang.Integer r1 = p000.x02.m6487(r1, r4)
            goto L49
        L48:
            r1 = r3
        L49:
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 == 0) goto L51
            r2 = r0
            java.lang.Number r2 = (java.lang.Number) r2
            goto L52
        L51:
            r2 = r3
        L52:
            if (r2 == 0) goto L5d
            int r0 = r2.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L69
        L5d:
            if (r0 == 0) goto L69
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L69
            java.lang.Integer r3 = p000.x02.m6487(r0, r4)
        L69:
            if (r1 == 0) goto L10
            if (r3 == 0) goto L10
            r5.put(r1, r3)
            goto L10
        L71:
            return
    }

    /* JADX INFO: renamed from: λ */
    public static void m7147(java.lang.ClassLoader r9) {
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.zj0.f13120
            r1 = 0
            r2 = 1
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 != 0) goto Lc
            goto Ld2
        Lc:
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.lang.String r4 = "~796422A8818C0EADCA9A33DA50D2E82D10279E237AB2D2E13465F36685DE700F208610F00484FDC242593DAB7C63FD6BF226A9E1C77A5F232FB29534"
            java.lang.String r4 = p000.jf0.m2957(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.Class r4 = java.lang.Class.forName(r4, r1, r9)     // Catch: java.lang.Throwable -> L1c
            goto L23
        L1c:
            r4 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L23:
            boolean r5 = r4 instanceof p000.eo1
            if (r5 == 0) goto L28
            r4 = 0
        L28:
            java.lang.Class r4 = (java.lang.Class) r4
            if (r4 == 0) goto L2f
            r3.add(r4)
        L2f:
            java.lang.Object r4 = p000.C0666ox.f8297
            kx r4 = p000.EnumC0491kx.f6237
            java.util.List r9 = p000.C0666ox.m4323(r4, r9)
            if (r9 == 0) goto L51
            java.util.Iterator r9 = r9.iterator()
        L3d:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L51
            java.lang.Object r4 = r9.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.Class r4 = r4.getDeclaringClass()
            r3.add(r4)
            goto L3d
        L51:
            boolean r9 = r3.isEmpty()
            if (r9 == 0) goto L5b
            r0.set(r1)
            return
        L5b:
            java.util.Iterator r9 = r3.iterator()
            r3 = r1
        L60:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto Lcd
            java.lang.Object r4 = r9.next()
            java.lang.Class r4 = (java.lang.Class) r4
            xq0 r5 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L96
            oj0 r6 = new oj0     // Catch: java.lang.Throwable -> L96
            r7 = 2
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L96
            r5.m6773(r4, r6)     // Catch: java.lang.Throwable -> L96
            java.lang.String r3 = r4.getName()     // Catch: java.lang.Throwable -> L93
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r5.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = "DYHelperIMMarkAllReadHelper: 已 Hook 消息底栏 Helper 构造函数: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L93
            r5.append(r3)     // Catch: java.lang.Throwable -> L93
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L93
            p000.C0888ux.m5985(r3)     // Catch: java.lang.Throwable -> L93
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> L93
            r5 = r2
            goto La0
        L93:
            r3 = move-exception
            r5 = r2
            goto L9a
        L96:
            r5 = move-exception
            r8 = r5
            r5 = r3
            r3 = r8
        L9a:
            eo1 r6 = new eo1
            r6.<init>(r3)
            r3 = r6
        La0:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto Lcb
            java.lang.String r4 = r4.getName()
            java.lang.Throwable r3 = m7138(r3)
            java.lang.String r3 = r3.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "DYHelperIMMarkAllReadHelper: Hook 消息底栏 Helper 构造函数失败 "
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r4 = ": "
            r6.append(r4)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            p000.C0888ux.m5985(r3)
        Lcb:
            r3 = r5
            goto L60
        Lcd:
            if (r3 != 0) goto Ld2
            r0.set(r1)
        Ld2:
            return
    }

    /* JADX INFO: renamed from: μ */
    public static java.lang.Object m7148(java.lang.Object r2, java.lang.String r3) {
            java.lang.Class r0 = r2.getClass()
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.reflect.Method r3 = m7145(r0, r3, r1)
            r0 = 0
            if (r3 != 0) goto Lf
            return r0
        Lf:
            r1 = 1
            r3.setAccessible(r1)
            java.lang.Object r2 = r3.invoke(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ν */
    public static void m7149(java.lang.Object r3, java.lang.String r4) {
            java.lang.Class r0 = java.lang.Integer.TYPE
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Class r2 = r3.getClass()     // Catch: java.lang.Throwable -> L21
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> L21
            java.lang.reflect.Method r4 = m7145(r2, r4, r0)     // Catch: java.lang.Throwable -> L21
            if (r4 != 0) goto L16
            goto L21
        L16:
            r0 = 1
            r4.setAccessible(r0)     // Catch: java.lang.Throwable -> L21
            java.lang.Object[] r0 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L21
            r4.invoke(r3, r0)     // Catch: java.lang.Throwable -> L21
        L21:
            return
    }

    /* JADX INFO: renamed from: ξ */
    public static boolean m7150(java.lang.Object r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.lang.ClassLoader r1 = p000.zj0.f13121
            r2 = 0
            if (r1 == 0) goto L23
            java.lang.String r3 = "~795CFE82BF8D864C285649BA56CE33B4C18838459A84C50FE419E35FE204466F8D2561AAF8AA290694109CAA750A811D72F9"
            java.lang.String r3 = p000.jf0.m2957(r3)     // Catch: java.lang.Throwable -> L14
            java.lang.Class r1 = java.lang.Class.forName(r3, r0, r1)     // Catch: java.lang.Throwable -> L14
            goto L1b
        L14:
            r1 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r1)
            r1 = r3
        L1b:
            boolean r3 = r1 instanceof p000.eo1
            if (r3 == 0) goto L20
            goto L21
        L20:
            r2 = r1
        L21:
            java.lang.Class r2 = (java.lang.Class) r2
        L23:
            r1 = 1
            if (r2 == 0) goto L2d
            boolean r2 = r2.isInstance(r5)
            if (r2 != r1) goto L2d
            goto L3b
        L2d:
            java.lang.Class r2 = r5.getClass()
            java.lang.String r3 = "markAllConversationRead"
            java.lang.Class[] r4 = new java.lang.Class[r0]
            java.lang.reflect.Method r2 = m7145(r2, r3, r4)
            if (r2 == 0) goto L3c
        L3b:
            return r1
        L3c:
            java.lang.Class r2 = r5.getClass()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}
            java.lang.String r4 = "markConversationRead"
            java.lang.reflect.Method r2 = m7145(r2, r4, r3)
            if (r2 == 0) goto L6b
            java.lang.Class r2 = r5.getClass()
            java.lang.String r3 = "getAllConversationSync"
            java.lang.Class[] r4 = new java.lang.Class[r0]
            java.lang.reflect.Method r2 = m7145(r2, r3, r4)
            if (r2 != 0) goto L6a
            java.lang.Class r5 = r5.getClass()
            java.lang.String r2 = "getAllConversationSyncNoSort"
            java.lang.Class[] r3 = new java.lang.Class[r0]
            java.lang.reflect.Method r5 = m7145(r5, r2, r3)
            if (r5 == 0) goto L6b
        L6a:
            r0 = r1
        L6b:
            return r0
    }

    /* JADX INFO: renamed from: ο */
    public static boolean m7151(java.lang.Object r2) {
            if (r2 != 0) goto L3
            goto L24
        L3:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "~796422A8818C0EADCA9A33DA50D2E82D10279E237AB2D2E13465F36685DE700F208610F00484FDC242593DAB7C63FD6BF226A9E1C77A5F232FB29534"
            java.lang.String r1 = p000.jf0.m2957(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            goto L22
        L18:
            java.lang.Class r2 = r2.getClass()
            java.lang.reflect.Method r2 = m7144(r2)
            if (r2 == 0) goto L24
        L22:
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: π */
    public static boolean m7152(java.lang.reflect.Method r2) {
            java.lang.Class r0 = r2.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L1c
            java.lang.Class[] r2 = r2.getParameterTypes()
            java.lang.Class[] r0 = m7158()
            boolean r2 = java.util.Arrays.equals(r2, r0)
            if (r2 == 0) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ρ */
    public static boolean m7153(java.lang.Object r7) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            r1 = 1
            java.lang.String r2 = "~796422A8818C0EADCA9A33DA50D2E82D10279E237AB2D2E13462F13C8FD278512E981CB013C5C5C9450412A36D5EFF6CF526A8C7D6454A342B959326"
            java.lang.String r2 = p000.jf0.m2957(r2)     // Catch: java.lang.Throwable -> L1e
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.Throwable -> L1e
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L1e
            java.lang.Class r2 = java.lang.Class.forName(r2, r0, r3)     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r2.isInstance(r7)     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L1e
            return r1
        L1e:
            java.lang.Class r2 = r7.getClass()
            java.lang.String r3 = "clearUnreadCount"
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class<int[]> r5 = int[].class
            java.lang.Class[] r6 = new java.lang.Class[]{r4, r5}
            java.lang.reflect.Method r2 = m7145(r2, r3, r6)
            if (r2 != 0) goto L60
            java.lang.Class r2 = r7.getClass()
            java.lang.String r3 = "LJJLIIIIJ"
            java.lang.Class[] r4 = new java.lang.Class[]{r4}
            java.lang.reflect.Method r2 = m7145(r2, r3, r4)
            if (r2 != 0) goto L60
            java.lang.Class r2 = r7.getClass()
            java.lang.String r3 = "LIZIZ"
            java.lang.Class[] r4 = new java.lang.Class[r0]
            java.lang.reflect.Method r2 = m7145(r2, r3, r4)
            if (r2 != 0) goto L60
            java.lang.Class r7 = r7.getClass()
            java.lang.String r2 = "getNoticeCountByGroupArray"
            java.lang.Class[] r3 = new java.lang.Class[]{r5}
            java.lang.reflect.Method r7 = m7145(r7, r2, r3)
            if (r7 == 0) goto L61
        L60:
            r0 = r1
        L61:
            return r0
    }

    /* JADX INFO: renamed from: σ */
    public static boolean m7154(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r4 = p000.ln0.m3626(r4, r1)
            r1 = 0
            if (r4 == 0) goto L34
            int r4 = r0.length
            r2 = 3
            if (r4 != r2) goto L34
            r4 = r0[r1]
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r4 = p000.ln0.m3626(r4, r2)
            if (r4 == 0) goto L34
            r4 = 1
            r3 = r0[r4]
            boolean r2 = p000.ln0.m3626(r3, r2)
            if (r2 == 0) goto L34
            r2 = 2
            r0 = r0[r2]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 == 0) goto L34
            return r4
        L34:
            return r1
    }

    /* JADX INFO: renamed from: τ */
    public static boolean m7155(java.lang.reflect.Method r3) {
            java.lang.Class[] r0 = r3.getParameterTypes()
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            java.lang.Class r3 = r3.getReturnType()
            boolean r3 = r1.isAssignableFrom(r3)
            r1 = 0
            if (r3 == 0) goto L27
            r0.getClass()
            int r3 = r0.length
            r2 = 1
            if (r3 != 0) goto L19
            goto L26
        L19:
            int r3 = r0.length
            if (r3 != r2) goto L27
            r3 = r0[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r3 = p000.ln0.m3626(r3, r0)
            if (r3 == 0) goto L27
        L26:
            return r2
        L27:
            return r1
    }

    /* JADX INFO: renamed from: υ */
    public static boolean m7156(java.lang.Class r1) {
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = "~795CFE82BF8D864C285649BA56CE33B4C18838459A84C50FE419E35FE204466F8D2561AAF8AA290694109CAA750A811D72F9"
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1f
            java.lang.String r0 = "~79504AF3D2914B0617A99E1CFF7635F71B1D318AD2ED0F06920675D78278AC2B9B172F97EAB05791E23028D75CAFEBBC86"
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1d
            goto L1f
        L1d:
            r1 = 0
            return r1
        L1f:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: χ */
    public static java.lang.String m7157(java.lang.ClassLoader r24) {
            r1 = r24
            kx r2 = p000.EnumC0491kx.f6281
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r4 = "DYHelper_markAllInteractiveNoticeRead"
            java.lang.Class r5 = java.lang.Integer.TYPE
            s62 r6 = p000.s62.f9751
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            kx r0 = p000.EnumC0491kx.f6279
            t20 r9 = new t20
            r10 = 8
            r9.<init>(r1, r10)
            java.lang.String r10 = "适配互动消息服务入口"
            java.util.List r0 = p000.C0966x.m6445(r0, r1, r10, r9)
            java.util.Iterator r9 = r0.iterator()
        L24:
            boolean r0 = r9.hasNext()
            r10 = 1
            r11 = 0
            if (r0 == 0) goto L99
            java.lang.Object r0 = r9.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            int r12 = r0.getModifiers()     // Catch: java.lang.Throwable -> L7c
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)     // Catch: java.lang.Throwable -> L7c
            if (r12 == 0) goto L24
            java.lang.Class[] r12 = r0.getParameterTypes()     // Catch: java.lang.Throwable -> L7c
            r12.getClass()     // Catch: java.lang.Throwable -> L7c
            int r12 = r12.length     // Catch: java.lang.Throwable -> L7c
            if (r12 != 0) goto L24
            r0.setAccessible(r10)     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r12 = r0.invoke(r11, r11)     // Catch: java.lang.Throwable -> L7c
            boolean r13 = m7153(r12)     // Catch: java.lang.Throwable -> L7c
            if (r13 == 0) goto L7e
            java.lang.String r0 = m7135(r0)     // Catch: java.lang.Throwable -> L7c
            java.lang.Class r13 = r12.getClass()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r13 = r13.getName()     // Catch: java.lang.Throwable -> L7c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c
            r14.<init>()     // Catch: java.lang.Throwable -> L7c
            java.lang.String r15 = "DYHelperIMMarkAllReadHelper: 获取 NoticeCountService 成功: DexKit:"
            r14.append(r15)     // Catch: java.lang.Throwable -> L7c
            r14.append(r0)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = " -> "
            r14.append(r0)     // Catch: java.lang.Throwable -> L7c
            r14.append(r13)     // Catch: java.lang.Throwable -> L7c
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Throwable -> L7c
            p000.C0888ux.m5985(r0)     // Catch: java.lang.Throwable -> L7c
            goto La1
        L7c:
            r0 = move-exception
            goto L80
        L7e:
            r10 = r6
            goto L85
        L80:
            eo1 r10 = new eo1
            r10.<init>(r0)
        L85:
            java.lang.Throwable r0 = p000.fo1.m2190(r10)
            if (r0 == 0) goto L24
            java.lang.Throwable r0 = m7138(r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.String r10 = "DYHelperIMMarkAllReadHelper: DexKit NoticeCountService provider 调用失败: "
            p000.AbstractC0602nx.m4142(r10, r0)
            goto L24
        L99:
            java.lang.Object r12 = m7133(r1)
            if (r12 == 0) goto La0
            goto La1
        La0:
            r12 = r11
        La1:
            if (r12 == 0) goto L65d
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            java.lang.Class r0 = r12.getClass()     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r13 = "getNoticeUnReadMap"
            java.lang.Class[] r14 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> Lc7
            java.lang.reflect.Method r0 = m7145(r0, r13, r14)     // Catch: java.lang.Throwable -> Lc7
            if (r0 != 0) goto Lb9
            goto Lc7
        Lb9:
            r0.setAccessible(r10)     // Catch: java.lang.Throwable -> Lc7
            java.lang.Object[] r13 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> Lc7
            java.lang.Object r0 = r0.invoke(r12, r13)     // Catch: java.lang.Throwable -> Lc7
            m7146(r9, r0)     // Catch: java.lang.Throwable -> Lc7
        Lc7:
            java.lang.ClassLoader r0 = p000.zj0.f13121
            if (r0 != 0) goto Ld3
            java.lang.Class r0 = r12.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
        Ld3:
            java.lang.String r13 = ": "
            if (r0 == 0) goto L172
            kx r14 = p000.EnumC0491kx.f6282
            t20 r15 = new t20
            r7 = 9
            r15.<init>(r0, r7)
            java.lang.String r7 = "适配互动消息未读分组入口"
            java.util.List r0 = p000.C0966x.m6445(r14, r0, r7, r15)
            f7 r7 = new f7
            r14 = 1
            r7.<init>(r14, r0)
            ef r0 = new ef
            r14 = 10
            r0.<init>(r14, r12)
            y30 r14 = new y30
            r14.<init>(r7, r10, r0)
            fj0 r0 = new fj0
            r7 = 9
            r0.<init>(r7)
            y30 r7 = new y30
            r7.<init>(r14, r10, r0)
            fj0 r0 = new fj0
            r14 = 10
            r0.<init>(r14)
            bu r14 = new bu
            java.util.Iterator r7 = r7.iterator()
            r14.<init>(r7, r0)
        L114:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L172
            java.lang.Object r0 = r14.next()
            r7 = r0
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            r7.setAccessible(r10)     // Catch: java.lang.Throwable -> L133
            java.lang.Class[] r0 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L133
            r0.getClass()     // Catch: java.lang.Throwable -> L133
            int r0 = r0.length     // Catch: java.lang.Throwable -> L133
            if (r0 != 0) goto L135
            java.lang.Object r0 = r7.invoke(r12, r11)     // Catch: java.lang.Throwable -> L133
            goto L13d
        L133:
            r0 = move-exception
            goto L142
        L135:
            java.lang.Object[] r0 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L133
            java.lang.Object r0 = r7.invoke(r12, r0)     // Catch: java.lang.Throwable -> L133
        L13d:
            m7146(r9, r0)     // Catch: java.lang.Throwable -> L133
            r15 = r6
            goto L147
        L142:
            eo1 r15 = new eo1
            r15.<init>(r0)
        L147:
            java.lang.Throwable r0 = p000.fo1.m2190(r15)
            if (r0 == 0) goto L170
            java.lang.String r7 = m7135(r7)
            java.lang.Throwable r0 = m7138(r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r11 = "DYHelperIMMarkAllReadHelper: NoticeCountService.unreadMap 失败 "
            r15.<init>(r11)
            r15.append(r7)
            r15.append(r13)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            p000.C0888ux.m5985(r0)
        L170:
            r11 = 0
            goto L114
        L172:
            java.lang.String r0 = "getNoticeUnReadCountInUseArray"
            java.lang.String r7 = "getImUnreadGroupAndCount"
            java.lang.String[] r0 = new java.lang.String[]{r0, r7}
            r7 = 0
        L17b:
            r11 = 2
            if (r7 >= r11) goto L18a
            r11 = r0[r7]
            java.lang.Object r11 = m7148(r12, r11)     // Catch: java.lang.Throwable -> L187
            m7146(r9, r11)     // Catch: java.lang.Throwable -> L187
        L187:
            int r7 = r7 + 1
            goto L17b
        L18a:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r7 = r9.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L197:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto L1bb
            java.lang.Object r14 = r7.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r15 = r14.getValue()
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            if (r15 <= 0) goto L197
            java.lang.Object r15 = r14.getKey()
            java.lang.Object r14 = r14.getValue()
            r0.put(r15, r14)
            goto L197
        L1bb:
            java.util.Set r0 = r0.keySet()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L1cd
            int[] r0 = p000.zj0.f13127
            java.util.List r0 = p000.AbstractC0312g7.m2261(r0)
        L1cd:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = p000.AbstractC0984xh.m6670(r0)
            java.util.List r0 = p000.AbstractC0984xh.m6666(r0)
            java.util.List r7 = p000.AbstractC0984xh.m6657(r0)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L1e4
            java.lang.String r0 = "互动消息暂无未读"
            return r0
        L1e4:
            java.util.ArrayList r0 = p000.AbstractC0984xh.m6650(r8, r7)
            java.util.Set r0 = p000.AbstractC0984xh.m6670(r0)
            java.util.List r0 = p000.AbstractC0984xh.m6666(r0)
            java.util.List r14 = p000.AbstractC0984xh.m6657(r0)
            java.lang.Class r15 = java.lang.Boolean.TYPE
            java.lang.String r17 = "~79504AF3C39B11021DAC8210F33C72EF521D7099C0A60F0CD80D768DA874A7739F1535D8D0B64C96CD3C16C27FA1E8BC98"
            java.lang.Class<int[]> r11 = int[].class
            int[] r10 = p000.AbstractC0984xh.m6665(r14)
            java.lang.Class r0 = r12.getClass()     // Catch: java.lang.Throwable -> L227
            r19 = r6
            java.lang.String r6 = "clearUnreadCount"
            r20 = r7
            java.lang.Class[] r7 = new java.lang.Class[]{r3, r11}     // Catch: java.lang.Throwable -> L221
            java.lang.reflect.Method r0 = m7145(r0, r6, r7)     // Catch: java.lang.Throwable -> L221
            if (r0 != 0) goto L213
            goto L21e
        L213:
            r6 = 1
            r0.setAccessible(r6)     // Catch: java.lang.Throwable -> L221
            java.lang.Object[] r6 = new java.lang.Object[]{r4, r10}     // Catch: java.lang.Throwable -> L221
            r0.invoke(r12, r6)     // Catch: java.lang.Throwable -> L221
        L21e:
            r6 = r19
            goto L230
        L221:
            r0 = move-exception
            goto L22b
        L223:
            r0 = move-exception
        L224:
            r20 = r7
            goto L22b
        L227:
            r0 = move-exception
            r19 = r6
            goto L224
        L22b:
            eo1 r6 = new eo1
            r6.<init>(r0)
        L230:
            java.lang.Throwable r0 = p000.fo1.m2190(r6)
            if (r0 == 0) goto L243
            java.lang.Throwable r0 = m7138(r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.String r6 = "DYHelperIMMarkAllReadHelper: NoticeCountService.clearUnreadCount 失败: "
            p000.AbstractC0602nx.m4142(r6, r0)
        L243:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kx r6 = p000.EnumC0491kx.f6280
            t20 r7 = new t20
            r21 = r14
            r14 = 7
            r7.<init>(r1, r14)
            java.lang.String r14 = "适配互动消息清未读入口"
            java.util.List r6 = p000.C0966x.m6445(r6, r1, r14, r7)
            p000.AbstractC0984xh.m6660(r0, r6)
            java.lang.String r6 = p000.jf0.m2957(r17)     // Catch: java.lang.Throwable -> L276
            r7 = 0
            java.lang.Class r6 = java.lang.Class.forName(r6, r7, r1)     // Catch: java.lang.Throwable -> L276
            r6.getClass()     // Catch: java.lang.Throwable -> L276
            java.lang.String r7 = "LIZ"
            java.lang.Class[] r14 = new java.lang.Class[]{r3, r11}     // Catch: java.lang.Throwable -> L276
            java.lang.reflect.Method r6 = m7145(r6, r7, r14)     // Catch: java.lang.Throwable -> L276
            if (r6 == 0) goto L276
            r0.add(r6)     // Catch: java.lang.Throwable -> L276
        L276:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r0.iterator()
        L284:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L2a4
            java.lang.Object r14 = r0.next()
            r22 = r14
            java.lang.reflect.Method r22 = (java.lang.reflect.Method) r22
            r23 = r0
            java.lang.String r0 = m7135(r22)
            boolean r0 = r6.add(r0)
            if (r0 == 0) goto L2a1
            r7.add(r14)
        L2a1:
            r0 = r23
            goto L284
        L2a4:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r7.iterator()
        L2ad:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L2f6
            java.lang.Object r7 = r6.next()
            r14 = r7
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            int r22 = r14.getModifiers()
            boolean r22 = java.lang.reflect.Modifier.isStatic(r22)
            if (r22 == 0) goto L2f2
            r22 = r6
            java.lang.Class[] r6 = r14.getParameterTypes()
            int r6 = r6.length
            r23 = r14
            r14 = 2
            if (r6 != r14) goto L2ef
            java.lang.Class[] r6 = r23.getParameterTypes()
            r16 = 0
            r6 = r6[r16]
            boolean r6 = p000.ln0.m3626(r6, r3)
            if (r6 == 0) goto L2ef
            java.lang.Class[] r6 = r23.getParameterTypes()
            r18 = 1
            r6 = r6[r18]
            boolean r6 = p000.ln0.m3626(r6, r11)
            if (r6 == 0) goto L2ef
            r0.add(r7)
        L2ef:
            r6 = r22
            goto L2ad
        L2f2:
            r22 = r6
            r14 = 2
            goto L2ef
        L2f6:
            java.util.Iterator r3 = r0.iterator()
        L2fa:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L346
            java.lang.Object r0 = r3.next()
            r6 = r0
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            r7 = 1
            r6.setAccessible(r7)     // Catch: java.lang.Throwable -> L315
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r10}     // Catch: java.lang.Throwable -> L315
            r7 = 0
            java.lang.Object r0 = r6.invoke(r7, r0)     // Catch: java.lang.Throwable -> L315
            goto L31c
        L315:
            r0 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r0)
            r0 = r7
        L31c:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L2fa
            java.lang.String r6 = m7135(r6)
            java.lang.Throwable r0 = m7138(r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r11 = "DYHelperIMMarkAllReadHelper: NoticeManager.clearUnread 调用失败 "
            r7.<init>(r11)
            r7.append(r6)
            r7.append(r13)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            p000.C0888ux.m5985(r0)
            goto L2fa
        L346:
            java.lang.Class r0 = r12.getClass()     // Catch: java.lang.Throwable -> L383
            java.lang.String r3 = "setNoticeUnReadCount"
            r5.getClass()     // Catch: java.lang.Throwable -> L383
            r15.getClass()     // Catch: java.lang.Throwable -> L383
            java.lang.Class[] r4 = new java.lang.Class[]{r5, r5, r15}     // Catch: java.lang.Throwable -> L383
            java.lang.reflect.Method r0 = m7145(r0, r3, r4)     // Catch: java.lang.Throwable -> L383
            if (r0 != 0) goto L35d
            goto L385
        L35d:
            r6 = 1
            r0.setAccessible(r6)     // Catch: java.lang.Throwable -> L383
            java.util.Iterator r3 = r21.iterator()     // Catch: java.lang.Throwable -> L383
        L365:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L383
            if (r4 == 0) goto L385
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L383
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Throwable -> L383
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L383
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L383
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L383
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r8, r6}     // Catch: java.lang.Throwable -> L383
            r0.invoke(r12, r4)     // Catch: java.lang.Throwable -> L383
            goto L365
        L383:
            r0 = move-exception
            goto L388
        L385:
            r3 = r19
            goto L38d
        L388:
            eo1 r3 = new eo1
            r3.<init>(r0)
        L38d:
            java.lang.Throwable r0 = p000.fo1.m2190(r3)
            if (r0 == 0) goto L3a0
            java.lang.Throwable r0 = m7138(r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "DYHelperIMMarkAllReadHelper: NoticeCountService.setNoticeUnReadCount 失败: "
            p000.AbstractC0602nx.m4142(r3, r0)
        L3a0:
            t20 r0 = new t20
            r3 = 5
            r0.<init>(r1, r3)
            java.lang.String r3 = "适配互动消息数字清零入口"
            java.util.List r0 = p000.C0966x.m6445(r2, r1, r3, r0)
            f7 r4 = new f7
            r6 = 1
            r4.<init>(r6, r0)
            fj0 r0 = new fj0
            r6 = 11
            r0.<init>(r6)
            y30 r6 = new y30
            r7 = 1
            r6.<init>(r4, r7, r0)
            ef r0 = new ef
            r4 = 11
            r0.<init>(r4, r12)
            y30 r4 = new y30
            r4.<init>(r6, r7, r0)
            fj0 r0 = new fj0
            r6 = 13
            r0.<init>(r6)
            y30 r6 = new y30
            r6.<init>(r4, r7, r0)
            fj0 r0 = new fj0
            r4 = 14
            r0.<init>(r4)
            bu r4 = new bu
            java.util.Iterator r6 = r6.iterator()
            r4.<init>(r6, r0)
        L3e7:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L44e
            java.lang.Object r0 = r4.next()
            r6 = r0
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            r7 = 1
            r6.setAccessible(r7)     // Catch: java.lang.Throwable -> L41a
            java.util.Iterator r0 = r21.iterator()     // Catch: java.lang.Throwable -> L41a
        L3fc:
            boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L41a
            if (r7 == 0) goto L41c
            java.lang.Object r7 = r0.next()     // Catch: java.lang.Throwable -> L41a
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> L41a
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L41a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L41a
            java.lang.Boolean r10 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L41a
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r8, r10}     // Catch: java.lang.Throwable -> L41a
            r6.invoke(r12, r7)     // Catch: java.lang.Throwable -> L41a
            goto L3fc
        L41a:
            r0 = move-exception
            goto L41f
        L41c:
            r7 = r19
            goto L424
        L41f:
            eo1 r7 = new eo1
            r7.<init>(r0)
        L424:
            java.lang.Throwable r0 = p000.fo1.m2190(r7)
            if (r0 == 0) goto L3e7
            java.lang.String r6 = m7135(r6)
            java.lang.Throwable r0 = m7138(r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r10 = "DYHelperIMMarkAllReadHelper: NoticeCountService.setUnread fallback 失败 "
            r7.<init>(r10)
            r7.append(r6)
            r7.append(r13)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            p000.C0888ux.m5985(r0)
            goto L3e7
        L44e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            t20 r4 = new t20
            r6 = 5
            r4.<init>(r1, r6)
            java.util.List r2 = p000.C0966x.m6445(r2, r1, r3, r4)
            p000.AbstractC0984xh.m6660(r0, r2)
            java.lang.String r2 = p000.jf0.m2957(r17)     // Catch: java.lang.Throwable -> L482
            r7 = 0
            java.lang.Class r1 = java.lang.Class.forName(r2, r7, r1)     // Catch: java.lang.Throwable -> L483
            r1.getClass()     // Catch: java.lang.Throwable -> L483
            java.lang.String r2 = "LJIIJ"
            r5.getClass()     // Catch: java.lang.Throwable -> L483
            r15.getClass()     // Catch: java.lang.Throwable -> L483
            java.lang.Class[] r3 = new java.lang.Class[]{r5, r5, r15}     // Catch: java.lang.Throwable -> L483
            java.lang.reflect.Method r1 = m7145(r1, r2, r3)     // Catch: java.lang.Throwable -> L483
            if (r1 == 0) goto L483
            r0.add(r1)     // Catch: java.lang.Throwable -> L483
            goto L483
        L482:
            r7 = 0
        L483:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L491:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L4ac
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r4 = m7135(r4)
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L491
            r2.add(r3)
            goto L491
        L4ac:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r2.iterator()
        L4b5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4d6
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 == 0) goto L4b5
            boolean r3 = m7154(r3)
            if (r3 == 0) goto L4b5
            r0.add(r2)
            goto L4b5
        L4d6:
            java.util.Iterator r1 = r0.iterator()
        L4da:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L542
            java.lang.Object r0 = r1.next()
            r2 = r0
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r6 = 1
            r2.setAccessible(r6)     // Catch: java.lang.Throwable -> L50e
            java.util.Iterator r0 = r21.iterator()     // Catch: java.lang.Throwable -> L50e
        L4ef:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L50e
            if (r3 == 0) goto L510
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L50e
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L50e
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L50e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L50e
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L50e
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r8, r4}     // Catch: java.lang.Throwable -> L50e
            r4 = 0
            r2.invoke(r4, r3)     // Catch: java.lang.Throwable -> L50e
            goto L4ef
        L50e:
            r0 = move-exception
            goto L513
        L510:
            r3 = r19
            goto L518
        L513:
            eo1 r3 = new eo1
            r3.<init>(r0)
        L518:
            java.lang.Throwable r0 = p000.fo1.m2190(r3)
            if (r0 == 0) goto L4da
            java.lang.String r2 = m7135(r2)
            java.lang.Throwable r0 = m7138(r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "DYHelperIMMarkAllReadHelper: NoticeManager.setNoticeUnReadCount 调用失败 "
            r3.<init>(r4)
            r3.append(r2)
            r3.append(r13)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            p000.C0888ux.m5985(r0)
            goto L4da
        L542:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r20.iterator()
        L54b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L562
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 == 0) goto L54b
            r1.add(r2)
            goto L54b
        L562:
            java.util.Iterator r2 = r1.iterator()
        L566:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L61f
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r9.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L588
            int r0 = r0.intValue()
            r4 = r0
            goto L589
        L588:
            r4 = r7
        L589:
            java.lang.Class r0 = r12.getClass()     // Catch: java.lang.Throwable -> L5f0
            java.lang.String r6 = "markAsRead"
            r5.getClass()     // Catch: java.lang.Throwable -> L5f0
            java.lang.Class[] r8 = new java.lang.Class[]{r5, r5}     // Catch: java.lang.Throwable -> L5f0
            java.lang.reflect.Method r0 = m7145(r0, r6, r8)     // Catch: java.lang.Throwable -> L5f0
            if (r0 != 0) goto L59f
        L59c:
            r6 = 1
        L59d:
            r8 = 0
            goto L5ed
        L59f:
            r6 = 1
            r0.setAccessible(r6)     // Catch: java.lang.Throwable -> L5f4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L5f0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L5f0
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r8}     // Catch: java.lang.Throwable -> L5f0
            java.lang.Object r0 = r0.invoke(r12, r6)     // Catch: java.lang.Throwable -> L5f0
            if (r0 != 0) goto L5b6
            goto L59c
        L5b6:
            java.lang.Class r6 = r0.getClass()     // Catch: java.lang.Throwable -> L59c
            java.lang.reflect.Method[] r6 = r6.getMethods()     // Catch: java.lang.Throwable -> L59c
            r6.getClass()     // Catch: java.lang.Throwable -> L59c
            int r8 = r6.length     // Catch: java.lang.Throwable -> L59c
            r10 = r7
        L5c3:
            if (r10 >= r8) goto L5e1
            r11 = r6[r10]     // Catch: java.lang.Throwable -> L59c
            java.lang.String r13 = r11.getName()     // Catch: java.lang.Throwable -> L59c
            java.lang.String r14 = "subscribe"
            boolean r13 = p000.ln0.m3626(r13, r14)     // Catch: java.lang.Throwable -> L59c
            if (r13 == 0) goto L5de
            java.lang.Class[] r13 = r11.getParameterTypes()     // Catch: java.lang.Throwable -> L59c
            r13.getClass()     // Catch: java.lang.Throwable -> L59c
            int r13 = r13.length     // Catch: java.lang.Throwable -> L59c
            if (r13 != 0) goto L5de
            goto L5e2
        L5de:
            int r10 = r10 + 1
            goto L5c3
        L5e1:
            r11 = 0
        L5e2:
            if (r11 != 0) goto L5e5
            goto L59c
        L5e5:
            r6 = 1
            r11.setAccessible(r6)     // Catch: java.lang.Throwable -> L59d
            r8 = 0
            r11.invoke(r0, r8)     // Catch: java.lang.Throwable -> L5ed
        L5ed:
            r10 = r19
            goto L5fb
        L5f0:
            r0 = move-exception
            r6 = 1
        L5f2:
            r8 = 0
            goto L5f6
        L5f4:
            r0 = move-exception
            goto L5f2
        L5f6:
            eo1 r10 = new eo1
            r10.<init>(r0)
        L5fb:
            java.lang.Throwable r0 = p000.fo1.m2190(r10)
            if (r0 == 0) goto L566
            java.lang.Throwable r0 = m7138(r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.String r10 = ","
            java.lang.String r11 = ") 失败: "
            java.lang.String r13 = "DYHelperIMMarkAllReadHelper: NoticeCountService.markAsRead("
            java.lang.StringBuilder r3 = p000.AbstractC0602nx.m4136(r13, r3, r10, r4, r11)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            p000.C0888ux.m5985(r0)
            goto L566
        L61f:
            java.lang.String r0 = "cleanNoticeUnreadRedDot"
            m7148(r12, r0)     // Catch: java.lang.Throwable -> L624
        L624:
            java.lang.String r0 = "clearNoticeCountMessage"
            m7148(r12, r0)     // Catch: java.lang.Throwable -> L629
        L629:
            r5.getClass()
            java.lang.String r0 = "updateUnreadOnShow"
            m7149(r12, r0)
            java.lang.String r0 = "saveUnreadCountForFirstFrame"
            m7149(r12, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "DYHelperIMMarkAllReadHelper: 已处理互动消息已读 groups="
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p000.C0888ux.m5985(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L65a
            int r0 = r1.size()
            java.lang.String r1 = "已提交互动消息已读("
            java.lang.String r2 = "组)"
            java.lang.String r0 = p000.AbstractC0602nx.m4127(r1, r0, r2)
            goto L65c
        L65a:
            java.lang.String r0 = "已清除互动消息红点"
        L65c:
            return r0
        L65d:
            java.lang.String r0 = "无法获取 NoticeCountService"
            p000.C1080.m7279(r0)
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ω */
    public static java.lang.Class[] m7158() {
            java.lang.Class r0 = java.lang.Integer.TYPE
            r0.getClass()
            java.lang.Class r4 = java.lang.Long.TYPE
            r4.getClass()
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r5.getClass()
            r1 = r0
            r2 = r0
            r3 = r0
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1, r2, r3, r4, r5}
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public final p000.yj0 m7159(java.lang.ClassLoader r10, boolean r11, int r12, java.util.Set r13) {
            r9 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r11 ^ 1
            java.lang.String r9 = r9.m7161(r10, r12, r13)     // Catch: java.lang.Throwable -> Lc
            goto L14
        Lc:
            r0 = move-exception
            r9 = r0
            eo1 r13 = new eo1
            r13.<init>(r9)
            r9 = r13
        L14:
            boolean r13 = r9 instanceof p000.eo1
            r3 = 0
            r4 = 1
            if (r13 != 0) goto L23
            r13 = r9
            java.lang.String r13 = (java.lang.String) r13
            r1.add(r13)
            r13 = r4
        L21:
            r5 = r13
            goto L25
        L23:
            r13 = r3
            goto L21
        L25:
            java.lang.Throwable r9 = p000.fo1.m2190(r9)
            r8 = 0
            if (r9 == 0) goto L51
            java.lang.Throwable r9 = m7138(r9)
            java.lang.String r0 = r9.getMessage()
            if (r0 != 0) goto L3e
            java.lang.Class r0 = r9.getClass()
            java.lang.String r0 = r0.getSimpleName()
        L3e:
            java.lang.String r6 = "私信已读失败："
            java.lang.String r0 = r6.concat(r0)
            r1.add(r0)
            java.lang.String r0 = r9.getMessage()
            java.lang.String r6 = "DYHelperIMMarkAllReadHelper: 私信一键已读失败: "
            p000.AbstractC0602nx.m4142(r6, r0)
            goto L52
        L51:
            r9 = r8
        L52:
            if (r11 == 0) goto L96
            java.lang.String r0 = m7157(r10)     // Catch: java.lang.Throwable -> L59
            goto L60
        L59:
            r0 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r0)
            r0 = r6
        L60:
            boolean r6 = r0 instanceof p000.eo1
            if (r6 != 0) goto L6c
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13
            r1.add(r13)
            r13 = r4
            r2 = r13
        L6c:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L96
            java.lang.Throwable r9 = m7138(r0)
            java.lang.String r0 = r9.getMessage()
            if (r0 != 0) goto L84
            java.lang.Class r0 = r9.getClass()
            java.lang.String r0 = r0.getSimpleName()
        L84:
            java.lang.String r6 = "互动消息已读失败："
            java.lang.String r0 = r6.concat(r0)
            r1.add(r0)
            java.lang.String r0 = r9.getMessage()
            java.lang.String r6 = "DYHelperIMMarkAllReadHelper: 互动消息一键已读失败: "
            p000.AbstractC0602nx.m4142(r6, r0)
        L96:
            if (r13 == 0) goto Ld5
            if (r12 != 0) goto La1
            if (r11 == 0) goto La1
            if (r5 == 0) goto La1
            if (r2 == 0) goto La1
            r3 = r4
        La1:
            h22 r11 = p000.zj0.f13126
            java.lang.Object r12 = r11.getValue()
            android.os.Handler r12 = (android.os.Handler) r12
            jg r0 = new jg
            r2 = 2
            r0.<init>(r10, r3, r2)
            r4 = 0
            r12.postDelayed(r0, r4)
            java.lang.Object r12 = r11.getValue()
            android.os.Handler r12 = (android.os.Handler) r12
            jg r0 = new jg
            r0.<init>(r10, r3, r2)
            r4 = 350(0x15e, double:1.73E-321)
            r12.postDelayed(r0, r4)
            java.lang.Object r11 = r11.getValue()
            android.os.Handler r11 = (android.os.Handler) r11
            jg r12 = new jg
            r0 = 2
            r12.<init>(r10, r3, r0)
            r2 = 1200(0x4b0, double:5.93E-321)
            r11.postDelayed(r12, r2)
        Ld5:
            r6 = 0
            r7 = 62
            java.lang.String r2 = "；"
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.String r10 = p000.AbstractC0984xh.m6644(r1, r2, r3, r4, r5, r6, r7)
            boolean r11 = p000.q02.m4671(r10)
            if (r11 == 0) goto Lee
            if (r13 == 0) goto Lec
            java.lang.String r10 = "已提交一键已读请求"
            goto Lee
        Lec:
            java.lang.String r10 = "没有可处理的消息"
        Lee:
            if (r13 == 0) goto Lf1
            goto Lf2
        Lf1:
            r8 = r9
        Lf2:
            yj0 r9 = new yj0
            r9.<init>(r13, r10, r8)
            return r9
    }

    /* JADX INFO: renamed from: κ */
    public final void m7160(java.lang.ClassLoader r9) {
            r8 = this;
            r0 = 1
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.zj0.f13125
            r2 = 0
            boolean r0 = r1.compareAndSet(r2, r0)
            if (r0 != 0) goto Lc
            goto L88
        Lc:
            java.lang.String[] r0 = p000.zj0.f13128     // Catch: java.lang.Throwable -> L2d
            int r3 = r0.length     // Catch: java.lang.Throwable -> L2d
            r4 = r2
        L10:
            r5 = 0
            if (r4 >= r3) goto L2f
            r6 = r0[r4]     // Catch: java.lang.Throwable -> L2d
            java.lang.Class r6 = java.lang.Class.forName(r6, r2, r9)     // Catch: java.lang.Throwable -> L1a
            goto L21
        L1a:
            r6 = move-exception
            eo1 r7 = new eo1     // Catch: java.lang.Throwable -> L2d
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L2d
            r6 = r7
        L21:
            boolean r7 = r6 instanceof p000.eo1     // Catch: java.lang.Throwable -> L2d
            if (r7 == 0) goto L26
            r6 = r5
        L26:
            java.lang.Class r6 = (java.lang.Class) r6     // Catch: java.lang.Throwable -> L2d
            if (r6 != 0) goto L30
            int r4 = r4 + 1
            goto L10
        L2d:
            r8 = move-exception
            goto L6c
        L2f:
            r6 = r5
        L30:
            if (r6 == 0) goto L64
            boolean r9 = r6.isInterface()     // Catch: java.lang.Throwable -> L2d
            if (r9 != 0) goto L39
            r5 = r6
        L39:
            if (r5 == 0) goto L64
            xq0 r9 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L2d
            oj0 r0 = new oj0     // Catch: java.lang.Throwable -> L2d
            r3 = 1
            r0.<init>(r3, r8)     // Catch: java.lang.Throwable -> L2d
            r9.m6773(r5, r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r8 = r5.getName()     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r9.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = "DYHelperIMMarkAllReadHelper: 已 Hook "
            r9.append(r0)     // Catch: java.lang.Throwable -> L2d
            r9.append(r8)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r8 = " 构造函数"
            r9.append(r8)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r8 = r9.toString()     // Catch: java.lang.Throwable -> L2d
            p000.C0888ux.m5985(r8)     // Catch: java.lang.Throwable -> L2d
            goto L69
        L64:
            java.lang.String r8 = "DYHelperIMMarkAllReadHelper: ConversationListModel concrete class optional missing on host 39.0"
            p000.C0888ux.m5985(r8)     // Catch: java.lang.Throwable -> L2d
        L69:
            s62 r8 = p000.s62.f9751     // Catch: java.lang.Throwable -> L2d
            goto L72
        L6c:
            eo1 r9 = new eo1
            r9.<init>(r8)
            r8 = r9
        L72:
            java.lang.Throwable r8 = p000.fo1.m2190(r8)
            if (r8 == 0) goto L88
            r1.set(r2)
            java.lang.Throwable r8 = m7138(r8)
            java.lang.String r8 = r8.getMessage()
            java.lang.String r9 = "DYHelperIMMarkAllReadHelper: Hook ConversationListModel 构造函数失败: "
            p000.AbstractC0602nx.m4142(r9, r8)
        L88:
            return
    }

    /* JADX INFO: renamed from: φ */
    public final java.lang.String m7161(java.lang.ClassLoader r11, int r12, java.util.Set r13) {
            r10 = this;
            java.lang.ref.WeakReference r0 = p000.zj0.f13122
            r1 = 0
            if (r0 == 0) goto La
            java.lang.Object r0 = r0.get()
            goto Lb
        La:
            r0 = r1
        Lb:
            boolean r2 = m7150(r0)
            if (r2 == 0) goto L12
            goto L17
        L12:
            if (r0 == 0) goto L16
            p000.zj0.f13122 = r1
        L16:
            r0 = r1
        L17:
            r2 = 0
            if (r0 == 0) goto L2e
            java.lang.Class r10 = r0.getClass()
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "DYHelperIMMarkAllReadHelper: 使用已捕获的 ConversationListModel: "
            java.lang.String r10 = r11.concat(r10)
            p000.C0888ux.m5985(r10)
        L2b:
            r10 = r0
            goto L108
        L2e:
            r10.m7160(r11)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.concurrent.atomic.AtomicReference r10 = p000.ry1.f9578
            java.lang.Object r10 = r10.get()
            if (r10 != 0) goto L40
        L3e:
            r0 = r1
            goto L76
        L40:
            java.lang.String r0 = "getIIMSdkModelService"
            java.lang.Object r10 = m7148(r10, r0)     // Catch: java.lang.Throwable -> L47
            goto L4f
        L47:
            r0 = move-exception
            r10 = r0
            eo1 r0 = new eo1
            r0.<init>(r10)
            r10 = r0
        L4f:
            boolean r0 = r10 instanceof p000.eo1
            if (r0 == 0) goto L54
            r10 = r1
        L54:
            if (r10 != 0) goto L57
            goto L3e
        L57:
            java.lang.String r0 = "getConversationListModel"
            java.lang.Object r10 = m7148(r10, r0)     // Catch: java.lang.Throwable -> L5e
            goto L66
        L5e:
            r0 = move-exception
            r10 = r0
            eo1 r0 = new eo1
            r0.<init>(r10)
            r10 = r0
        L66:
            boolean r0 = r10 instanceof p000.eo1
            if (r0 == 0) goto L6b
            r10 = r1
        L6b:
            if (r10 == 0) goto L74
            boolean r0 = m7150(r10)
            if (r0 == 0) goto L74
            goto L75
        L74:
            r10 = r1
        L75:
            r0 = r10
        L76:
            if (r0 == 0) goto L7e
            java.lang.String r10 = "imsdk-context"
            m7142(r0, r10)
            goto L2b
        L7e:
            java.lang.String[] r10 = p000.zj0.f13128
            int r4 = r10.length
            r5 = r2
        L82:
            if (r5 >= r4) goto Led
            r6 = r10[r5]
            java.lang.Class r0 = java.lang.Class.forName(r6, r2, r11)     // Catch: java.lang.Throwable -> La8
            r0.getClass()     // Catch: java.lang.Throwable -> La8
            java.lang.Object r0 = m7137(r0, r3)     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto Laa
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La8
            r7.<init>()     // Catch: java.lang.Throwable -> La8
            java.lang.String r8 = "known:"
            r7.append(r8)     // Catch: java.lang.Throwable -> La8
            r7.append(r6)     // Catch: java.lang.Throwable -> La8
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> La8
            m7142(r0, r7)     // Catch: java.lang.Throwable -> La8
            goto L2b
        La8:
            r0 = move-exception
            goto Lac
        Laa:
            r7 = r1
            goto Lb1
        Lac:
            eo1 r7 = new eo1
            r7.<init>(r0)
        Lb1:
            java.lang.Throwable r0 = p000.fo1.m2190(r7)
            if (r0 == 0) goto Lea
            java.lang.Throwable r0 = m7138(r0)
            java.lang.Class r7 = r0.getClass()
            java.lang.String r7 = r7.getSimpleName()
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto Lcb
            java.lang.String r0 = ""
        Lcb:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            java.lang.String r6 = " "
            r8.append(r6)
            r8.append(r7)
            java.lang.String r6 = ":"
            r8.append(r6)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r3.add(r0)
        Lea:
            int r5 = r5 + 1
            goto L82
        Led:
            java.lang.ref.WeakReference r10 = p000.zj0.f13122
            if (r10 == 0) goto Lf6
            java.lang.Object r10 = r10.get()
            goto Lf7
        Lf6:
            r10 = r1
        Lf7:
            boolean r11 = m7150(r10)
            if (r11 == 0) goto Lff
            r0 = r10
            goto L104
        Lff:
            if (r10 == 0) goto L103
            p000.zj0.f13122 = r1
        L103:
            r0 = r1
        L104:
            if (r0 == 0) goto L242
            goto L2b
        L108:
            r11 = 1
            if (r12 != 0) goto L136
            java.lang.Class r0 = r10.getClass()
            java.lang.String r3 = "markAllConversationRead"
            java.lang.Class[] r4 = new java.lang.Class[r2]
            java.lang.reflect.Method r0 = m7145(r0, r3, r4)
            if (r0 == 0) goto L131
            r0.setAccessible(r11)
            r0.invoke(r10, r1)
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "DYHelperIMMarkAllReadHelper: 已调用 "
            java.lang.String r12 = ".markAllConversationRead()"
            p000.AbstractC0602nx.m4121(r11, r10, r12)
            java.lang.String r10 = "已提交全部私信会话已读"
            return r10
        L131:
            java.lang.String r0 = "DYHelperIMMarkAllReadHelper: 未找到 markAllConversationRead，降级逐会话已读"
            p000.C0888ux.m5985(r0)
        L136:
            java.lang.String r0 = "S2"
            java.lang.String r3 = "y3"
            java.lang.String r4 = "getAllConversationSyncNoSort"
            java.lang.String r5 = "getAllConversationSync"
            java.lang.String[] r3 = new java.lang.String[]{r4, r5, r0, r3}
            r4 = r2
        L143:
            r0 = 4
            if (r4 >= r0) goto L17c
            r0 = r3[r4]
            java.lang.Object r0 = m7148(r10, r0)     // Catch: java.lang.Throwable -> L14d
            goto L154
        L14d:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L154:
            boolean r5 = r0 instanceof p000.eo1
            if (r5 == 0) goto L159
            r0 = r1
        L159:
            if (r0 != 0) goto L15d
        L15b:
            r0 = r1
            goto L176
        L15d:
            boolean r5 = r0 instanceof java.lang.Iterable
            if (r5 == 0) goto L164
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            goto L176
        L164:
            boolean r5 = r0 instanceof java.lang.Object[]
            if (r5 == 0) goto L15b
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r5 = r0.length
            if (r5 != 0) goto L170
            jz r0 = p000.C0450jz.f5672
            goto L176
        L170:
            e7 r5 = new e7
            r5.<init>(r2, r0)
            r0 = r5
        L176:
            if (r0 == 0) goto L179
            goto L17d
        L179:
            int r4 = r4 + 1
            goto L143
        L17c:
            r0 = r1
        L17d:
            if (r0 != 0) goto L181
            goto L234
        L181:
            java.lang.Class r3 = r10.getClass()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4}
            java.lang.String r5 = "markConversationRead"
            java.lang.reflect.Method r3 = m7145(r3, r5, r4)
            if (r3 != 0) goto L195
            goto L234
        L195:
            r3.setAccessible(r11)
            java.util.Iterator r4 = r0.iterator()
            r5 = r2
        L19d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L233
            java.lang.Object r0 = r4.next()
            java.util.concurrent.ConcurrentHashMap r6 = p000.ck0.f2176
            if (r0 != 0) goto L1ad
        L1ab:
            r6 = r2
            goto L1c1
        L1ad:
            if (r12 == 0) goto L1b4
            if (r12 == r11) goto L1bd
            r6 = 2
            if (r12 == r6) goto L1b6
        L1b4:
            r6 = r11
            goto L1c1
        L1b6:
            boolean r6 = p000.ck0.m1243(r0, r13)
            if (r6 != 0) goto L1ab
            goto L1b4
        L1bd:
            boolean r6 = p000.ck0.m1243(r0, r13)
        L1c1:
            if (r6 == 0) goto L19d
            if (r0 != 0) goto L1c7
        L1c5:
            r0 = r1
            goto L1db
        L1c7:
            java.lang.String r6 = "getConversationId"
            java.lang.Object r0 = m7148(r0, r6)     // Catch: java.lang.Throwable -> L1d4
            boolean r6 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L1d4
            if (r6 == 0) goto L1c5
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1d4
            goto L1db
        L1d4:
            r0 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r0)
            r0 = r6
        L1db:
            boolean r6 = r0 instanceof p000.eo1
            if (r6 == 0) goto L1e0
            r0 = r1
        L1e0:
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L1ee
            boolean r0 = p000.q02.m4671(r6)
            if (r0 == 0) goto L1ec
            goto L1ee
        L1ec:
            r0 = r2
            goto L1ef
        L1ee:
            r0 = r11
        L1ef:
            if (r0 != 0) goto L19d
            java.lang.Object[] r0 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L203
            r3.invoke(r10, r0)     // Catch: java.lang.Throwable -> L203
            int r7 = r5 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L200
            r5 = r7
            goto L20a
        L200:
            r0 = move-exception
            r5 = r7
            goto L204
        L203:
            r0 = move-exception
        L204:
            eo1 r7 = new eo1
            r7.<init>(r0)
            r0 = r7
        L20a:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L19d
            java.lang.Throwable r0 = m7138(r0)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "DYHelperIMMarkAllReadHelper: markConversationRead("
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = ") 失败: "
            r7.append(r6)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            p000.C0888ux.m5985(r0)
            goto L19d
        L233:
            r2 = r5
        L234:
            if (r2 <= 0) goto L23f
            java.lang.String r10 = "已提交 "
            java.lang.String r11 = " 个私信会话已读"
            java.lang.String r10 = p000.AbstractC0602nx.m4127(r10, r2, r11)
            goto L241
        L23f:
            java.lang.String r10 = "没有匹配的私信会话"
        L241:
            return r10
        L242:
            r8 = 0
            r9 = 62
            java.lang.String r4 = "；"
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r10 = p000.AbstractC0984xh.m6644(r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r11 = "无法获取 ConversationListModel 实例；已移除不存在的 Provider 扫描，当前使用构造函数 Hook 捕获实例。请先进入私信页或等待 IM SDK 初始化完成；"
            java.lang.String r10 = r11.concat(r10)
            p000.C1080.m7279(r10)
            return r1
    }

    /* JADX INFO: renamed from: ψ */
    public final void m7162(android.app.Activity r5, p000.a80 r6) {
            r4 = this;
            r5.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.zj0.f13123
            r1 = 1
            r2 = 0
            boolean r1 = r0.compareAndSet(r2, r1)
            r3 = 0
            if (r1 != 0) goto L19
            yj0 r4 = new yj0
            java.lang.String r5 = "一键已读正在执行，请稍候"
            r4.<init>(r2, r5, r3)
            m7134(r6, r4)
            return
        L19:
            java.lang.ClassLoader r1 = p000.zj0.f13121
            if (r1 != 0) goto L2f
            java.lang.Class r5 = r5.getClass()
            java.lang.ClassLoader r1 = r5.getClassLoader()
            if (r1 != 0) goto L2f
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r1 = r5.getContextClassLoader()
        L2f:
            if (r1 != 0) goto L3f
            r0.set(r2)
            yj0 r4 = new yj0
            java.lang.String r5 = "获取抖音 ClassLoader 失败"
            r4.<init>(r2, r5, r3)
            m7134(r6, r4)
            return
        L3f:
            r4.m7160(r1)
            java.lang.Thread r4 = new java.lang.Thread
            ii0 r5 = new ii0
            r0 = 2
            r5.<init>(r1, r0, r6)
            java.lang.String r6 = "rf687268eb18bbe5d"
            r4.<init>(r5, r6)
            r4.start()
            return
    }
}
