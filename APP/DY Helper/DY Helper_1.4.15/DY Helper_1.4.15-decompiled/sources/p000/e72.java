package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class e72 {

    /* JADX INFO: renamed from: α */
    public static volatile long f3437;

    /* JADX INFO: renamed from: β */
    public static volatile long f3438;

    /* JADX INFO: renamed from: γ */
    public static final java.util.ArrayList f3439 = null;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            p000.e72.f3439 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m1857(java.lang.ClassLoader r8) {
            r0 = 0
            java.lang.Object r1 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = "~7918AA8387C201967A78D8C508850865C63754C97DD568BBA0F38100F54AA3F51142DA"
            java.lang.String r1 = p000.jf0.m2957(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.Class r8 = p000.qe0.m4876(r8, r1)     // Catch: java.lang.Throwable -> L55
            java.lang.reflect.Method[] r8 = r8.getDeclaredMethods()     // Catch: java.lang.Throwable -> L55
            τ r8 = p000.h62.m2434(r8)     // Catch: java.lang.Throwable -> L55
        L15:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L93
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> L55
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = r1.getName()     // Catch: java.lang.Throwable -> L55
            r2.getClass()     // Catch: java.lang.Throwable -> L55
            java.lang.String r3 = "getUserId"
            r4 = 1
            boolean r3 = p000.q02.m4654(r2, r3, r4)     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L15
            int r3 = r1.getParameterCount()     // Catch: java.lang.Throwable -> L55
            if (r3 != 0) goto L15
            int r3 = r1.getModifiers()     // Catch: java.lang.Throwable -> L55
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L15
            r1.setAccessible(r4)     // Catch: java.lang.Throwable -> L55
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L55
            boolean r3 = r1 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L55
            r4 = 0
            if (r3 == 0) goto L57
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L55
            long r6 = r1.longValue()     // Catch: java.lang.Throwable -> L55
            goto L76
        L55:
            r8 = move-exception
            goto L94
        L57:
            boolean r3 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L6c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L55
            r3 = 10
            java.lang.Long r1 = p000.x02.m6489(r1, r3)     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L6a
            long r6 = r1.longValue()     // Catch: java.lang.Throwable -> L55
            goto L76
        L6a:
            r6 = r4
            goto L76
        L6c:
            boolean r3 = r1 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L6a
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L55
            long r6 = r1.longValue()     // Catch: java.lang.Throwable -> L55
        L76:
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto L15
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r8.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = "AppLog."
            r8.append(r1)     // Catch: java.lang.Throwable -> L55
            r8.append(r2)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = "()"
            r8.append(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L55
            m1858(r6, r8)     // Catch: java.lang.Throwable -> L55
        L93:
            return
        L94:
            java.lang.String r8 = r8.getMessage()
            java.lang.String r1 = "AppLog 获取失败: "
            java.lang.String r8 = p000.lz1.m3687(r1, r8)
            r1 = 4
            java.lang.String r2 = "r3d7af71c7d5f3398"
            p000.C0888ux.m5988(r2, r8, r0, r1, r0)
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m1858(long r18, java.lang.String r20) {
            r1 = r18
            r0 = r20
            java.lang.String r3 = "🔄 检测到账号切换 oldUid="
            java.lang.String r4 = "✅ 成功获取 UID="
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 > 0) goto L10
            goto L1ac
        L10:
            java.lang.String r7 = java.lang.String.valueOf(r1)
            jz r8 = p000.C0450jz.f5672
            java.util.ArrayList r9 = p000.e72.f3439
            monitor-enter(r9)
            long r10 = p000.e72.f3437     // Catch: java.lang.Throwable -> L52
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            r13 = 0
            r14 = 1
            r15 = 4
            r16 = r5
            r5 = 0
            if (r12 == 0) goto L7c
            p000.e72.f3437 = r1     // Catch: java.lang.Throwable -> L52
            int r6 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r6 != 0) goto L55
            java.lang.String r3 = "r3d7af71c7d5f3398"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L52
            r6.append(r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = " (来源: "
            r6.append(r4)     // Catch: java.lang.Throwable -> L52
            r6.append(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = ")"
            r6.append(r4)     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L52
            p000.C0888ux.m5988(r3, r4, r5, r15, r5)     // Catch: java.lang.Throwable -> L52
            java.util.List r8 = p000.AbstractC0984xh.m6666(r9)     // Catch: java.lang.Throwable -> L52
            r9.clear()     // Catch: java.lang.Throwable -> L52
        L50:
            r3 = r14
            goto L7d
        L52:
            r0 = move-exception
            goto L1ad
        L55:
            java.lang.String r4 = "r3d7af71c7d5f3398"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L52
            r6.append(r10)     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = " newUid="
            r6.append(r3)     // Catch: java.lang.Throwable -> L52
            r6.append(r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = " (来源: "
            r6.append(r3)     // Catch: java.lang.Throwable -> L52
            r6.append(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = ")"
            r6.append(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L52
            p000.C0888ux.m5988(r4, r3, r5, r15, r5)     // Catch: java.lang.Throwable -> L52
            goto L50
        L7c:
            r3 = r13
        L7d:
            monitor-exit(r9)
            java.lang.Object r4 = p000.ui1.f10844
            java.lang.String r4 = "UserUidFetcher:"
            java.lang.String r4 = r4.concat(r0)
            p000.ui1.m5879(r7, r4)
            java.util.concurrent.atomic.AtomicBoolean r4 = p000.AbstractC0976x9.f12071
            java.lang.CharSequence r4 = p000.q02.m4660(r7)
            java.lang.String r4 = r4.toString()
            boolean r6 = p000.q02.m4671(r4)
            if (r6 != 0) goto Le2
            java.lang.String r6 = "0"
            boolean r6 = r4.equals(r6)
            if (r6 == 0) goto La2
            goto Le2
        La2:
            java.lang.String r6 = "BetaVerifier:"
            java.lang.String r6 = r6.concat(r0)
            p000.ui1.m5879(r4, r6)
            p000.AbstractC0976x9.m6533(r4, r0)
            if (r3 == 0) goto Le2
            long r9 = java.lang.System.currentTimeMillis()
            java.util.concurrent.ConcurrentHashMap r6 = p000.AbstractC0976x9.f12073
            java.lang.Object r11 = r6.get(r4)
            java.lang.Long r11 = (java.lang.Long) r11
            if (r11 == 0) goto Lc3
            long r11 = r11.longValue()
            goto Lc5
        Lc3:
            r11 = r16
        Lc5:
            int r16 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r16 <= 0) goto Ld3
            long r11 = r9 - r11
            r16 = 1800000(0x1b7740, double:8.89318E-318)
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 >= 0) goto Ld3
            goto Le2
        Ld3:
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r6.put(r4, r9)
            s9 r6 = new s9
            r6.<init>(r4, r13)
            p000.AbstractC0976x9.m6534(r4, r6)
        Le2:
            com.example.dyhelper.beta.BlacklistVerifier r4 = com.example.dyhelper.beta.BlacklistVerifier.f2226
            java.lang.String r6 = "uid-detected:"
            java.lang.String r9 = "0"
            java.lang.CharSequence r7 = p000.q02.m4660(r7)
            java.lang.String r7 = r7.toString()
            boolean r10 = p000.q02.m4671(r7)
            if (r10 != 0) goto L154
            boolean r10 = r7.equals(r9)
            if (r10 == 0) goto Lfd
            goto L154
        Lfd:
            java.lang.String r10 = com.example.dyhelper.beta.BlacklistVerifier.f2235
            com.example.dyhelper.beta.BlacklistVerifier.f2235 = r7
            java.lang.String r11 = "BlacklistVerifier:"
            java.lang.String r11 = r11.concat(r0)
            p000.ui1.m5879(r7, r11)
            boolean r10 = p000.ln0.m3626(r10, r7)
            if (r10 != 0) goto L117
            java.lang.String r10 = r6.concat(r0)
            r4.m1313(r10)
        L117:
            boolean r10 = r4.m1312()
            if (r10 == 0) goto L127
            java.lang.String r0 = r6.concat(r0)
            r4.m1308(r0)
            com.example.dyhelper.beta.BlacklistVerifier.m1305()
        L127:
            if (r3 == 0) goto L154
            java.lang.CharSequence r0 = p000.q02.m4660(r7)
            java.lang.String r0 = r0.toString()
            boolean r4 = p000.q02.m4671(r0)
            if (r4 != 0) goto L154
            boolean r4 = r0.equals(r9)
            if (r4 == 0) goto L13e
            goto L154
        L13e:
            java.util.Set r4 = com.example.dyhelper.beta.BlacklistVerifier.f2232
            boolean r4 = r4.add(r0)
            if (r4 != 0) goto L147
            goto L154
        L147:
            java.lang.Thread r4 = new java.lang.Thread
            ea r6 = new ea
            r6.<init>(r0, r13)
            r4.<init>(r6)
            r4.start()
        L154:
            if (r3 == 0) goto L17b
            tg r0 = p000.AbstractC0871ug.f10771     // Catch: java.lang.Throwable -> L163
            android.os.Handler r0 = p000.AbstractC0871ug.f10780     // Catch: java.lang.Throwable -> L163
            s0 r4 = new s0     // Catch: java.lang.Throwable -> L163
            r6 = 3
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L163
            r0.post(r4)     // Catch: java.lang.Throwable -> L163
        L163:
            p000.v71.m6042()     // Catch: java.lang.Throwable -> L166
        L166:
            o22 r0 = p000.o22.f7889     // Catch: java.lang.Throwable -> L17b
            java.lang.String r0 = ""
            p000.o22.f7883 = r0     // Catch: java.lang.Throwable -> L17b
            r6 = -1
            p000.o22.f7886 = r6     // Catch: java.lang.Throwable -> L17b
            p000.o22.m4188(r14)     // Catch: java.lang.Throwable -> L17b
            p000.o22.m4168()     // Catch: java.lang.Throwable -> L17b
            java.lang.String r0 = "account"
            p000.o22.m4165(r0)     // Catch: java.lang.Throwable -> L17b
        L17b:
            if (r3 == 0) goto L1ac
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L1ac
            java.util.Iterator r3 = r8.iterator()
        L187:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1ac
            java.lang.Object r0 = r3.next()
            a80 r0 = (p000.a80) r0
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L19b
            r0.invoke(r4)     // Catch: java.lang.Throwable -> L19b
            goto L187
        L19b:
            r0 = move-exception
            java.lang.String r4 = "r3d7af71c7d5f3398"
            java.lang.String r0 = r0.getMessage()
            java.lang.String r6 = "UID 回调异常: "
            java.lang.String r0 = p000.lz1.m3687(r6, r0)
            p000.C0888ux.m5988(r4, r0, r5, r15, r5)
            goto L187
        L1ac:
            return
        L1ad:
            monitor-exit(r9)
            throw r0
    }
}
