package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ib2 {

    /* JADX INFO: renamed from: α */
    public static final p000.ib2 f4981 = null;

    /* JADX INFO: renamed from: β */
    public static final android.os.Handler f4982 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f4983 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.atomic.AtomicBoolean f4984 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.atomic.AtomicBoolean f4985 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f4986 = null;

    /* JADX INFO: renamed from: η */
    public static final java.util.concurrent.ConcurrentHashMap f4987 = null;

    /* JADX INFO: renamed from: θ */
    public static final java.util.concurrent.ConcurrentHashMap f4988 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.C0271f3 f4989 = null;

    static {
            ib2 r0 = new ib2
            r0.<init>()
            p000.ib2.f4981 = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.ib2.f4982 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.ib2.f4983 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.ib2.f4984 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.ib2.f4985 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.ib2.f4986 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.ib2.f4987 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.ib2.f4988 = r0
            f3 r0 = new f3
            r1 = 3
            r0.<init>(r1)
            p000.ib2.f4989 = r0
            return
    }

    /* JADX INFO: renamed from: Α */
    public static long m2702(java.io.File r5) {
            r0 = 0
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> L2e
            r2.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L23
            r2.setDataSource(r5)     // Catch: java.lang.Throwable -> L23
            r5 = 9
            java.lang.String r5 = r2.extractMetadata(r5)     // Catch: java.lang.Throwable -> L23
            if (r5 == 0) goto L25
            r3 = 10
            java.lang.Long r5 = p000.x02.m6489(r5, r3)     // Catch: java.lang.Throwable -> L23
            if (r5 == 0) goto L25
            long r3 = r5.longValue()     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            r5 = move-exception
            goto L30
        L25:
            r3 = r0
        L26:
            r2.release()     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r5 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L2e
            goto L3a
        L2e:
            r5 = move-exception
            goto L34
        L30:
            r2.release()     // Catch: java.lang.Throwable -> L2e
            throw r5     // Catch: java.lang.Throwable -> L2e
        L34:
            eo1 r2 = new eo1
            r2.<init>(r5)
            r5 = r2
        L3a:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r1 = r5 instanceof p000.eo1
            if (r1 == 0) goto L43
            r5 = r0
        L43:
            java.lang.Number r5 = (java.lang.Number) r5
            long r0 = r5.longValue()
            return r0
    }

    /* JADX INFO: renamed from: Β */
    public static p000.ab2 m2703(java.lang.Object r12) {
            java.lang.Class r0 = r12.getClass()
            bb2 r1 = m2723(r0)
            r2 = 0
            if (r1 != 0) goto Lc
            goto L2d
        Lc:
            java.lang.reflect.Field r0 = r1.f1623     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.get(r12)     // Catch: java.lang.Throwable -> L19
            boolean r3 = r0 instanceof java.io.File     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L1b
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Throwable -> L19
            goto L23
        L19:
            r0 = move-exception
            goto L1d
        L1b:
            r0 = r2
            goto L23
        L1d:
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L23:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L28
            r0 = r2
        L28:
            r8 = r0
            java.io.File r8 = (java.io.File) r8
            if (r8 != 0) goto L2e
        L2d:
            return r2
        L2e:
            java.lang.reflect.Field r0 = r1.f1624     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L39
            java.lang.Object r0 = r0.get(r12)     // Catch: java.lang.Throwable -> L37
            goto L3a
        L37:
            r0 = move-exception
            goto L43
        L39:
            r0 = r2
        L3a:
            boolean r3 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L41
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L37
            goto L49
        L41:
            r0 = r2
            goto L49
        L43:
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L49:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L4e
            r0 = r2
        L4e:
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L58
            long r3 = r0.longValue()
        L56:
            r9 = r3
            goto L5b
        L58:
            r3 = 0
            goto L56
        L5b:
            java.lang.reflect.Field r0 = r1.f1625     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L66
            java.lang.Object r0 = r0.get(r12)     // Catch: java.lang.Throwable -> L64
            goto L67
        L64:
            r0 = move-exception
            goto L70
        L66:
            r0 = r2
        L67:
            boolean r3 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L6e
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L64
            goto L76
        L6e:
            r0 = r2
            goto L76
        L70:
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L76:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L7b
            goto L7c
        L7b:
            r2 = r0
        L7c:
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L82
            jz r2 = p000.C0450jz.f5672
        L82:
            r11 = r2
            ab2 r3 = new ab2
            java.lang.reflect.Field r5 = r1.f1623
            java.lang.reflect.Field r6 = r1.f1624
            java.lang.reflect.Field r7 = r1.f1625
            r4 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r11)
            return r3
    }

    /* JADX INFO: renamed from: Γ */
    public static void m2704(java.io.File r6, java.io.File r7) {
            boolean r0 = r6.exists()
            if (r0 == 0) goto L9e
            long r0 = r6.length()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L9e
            java.io.File r0 = new java.io.File
            java.io.File r1 = r7.getParentFile()
            if (r1 != 0) goto L1c
            java.io.File r1 = r6.getParentFile()
        L1c:
            java.lang.String r4 = r7.getName()
            java.lang.String r5 = ".dyhelper.bak"
            java.lang.String r4 = p000.AbstractC0602nx.m4129(r4, r5)
            r0.<init>(r1, r4)
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L32
            r0.delete()     // Catch: java.lang.Throwable -> L32
        L32:
            boolean r1 = r7.exists()
            if (r1 == 0) goto L42
            boolean r1 = r7.renameTo(r0)
            if (r1 != 0) goto L43
            r7.delete()
            goto L43
        L42:
            r1 = 0
        L43:
            boolean r4 = r6.renameTo(r7)
            if (r4 != 0) goto L4f
            p000.s30.m5361(r6, r7)
            r6.delete()
        L4f:
            boolean r6 = r7.exists()
            if (r6 == 0) goto L8d
            long r4 = r7.length()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L5e
            goto L8d
        L5e:
            boolean r6 = r0.exists()     // Catch: java.lang.Throwable -> L67
            if (r6 == 0) goto L67
            r0.delete()     // Catch: java.lang.Throwable -> L67
        L67:
            java.lang.String r6 = r7.getAbsolutePath()
            long r0 = r7.length()
            long r2 = m2702(r7)
            java.lang.String r7 = "comment original voice file overwritten path="
            java.lang.String r4 = ", size="
            java.lang.StringBuilder r6 = p000.AbstractC0602nx.m4137(r7, r6, r0, r4)
            java.lang.String r7 = ", metaDuration="
            r6.append(r7)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "rb360b99c73f2f647"
            p000.C0888ux.m5975(r7, r6)
            return
        L8d:
            if (r1 == 0) goto L98
            boolean r6 = r0.exists()
            if (r6 == 0) goto L98
            r0.renameTo(r7)
        L98:
            java.lang.String r6 = "覆盖原始评论语音失败"
            p000.C1080.m7279(r6)
            return
        L9e:
            java.lang.String r6 = "替换语音临时文件无效"
            p000.C1080.m7279(r6)
            return
    }

    /* JADX INFO: renamed from: Δ */
    public static java.util.List m2705(p000.ib2 r21, java.lang.ClassLoader r22) {
            r0 = r21
            r1 = r22
            java.lang.Object r2 = p000.C0666ox.f8297
            kx r2 = p000.EnumC0491kx.f6288
            java.util.List r2 = p000.C0666ox.m4323(r2, r1)
            java.lang.String r4 = "):"
            java.lang.String r5 = "("
            java.lang.String r6 = "#"
            r7 = 1
            if (r2 == 0) goto Lc9
            boolean r8 = r2.isEmpty()
            if (r8 == 0) goto L1d
            goto Lc9
        L1d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
        L26:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L3d
            java.lang.Object r8 = r2.next()
            r9 = r8
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            boolean r9 = m2729(r9)
            if (r9 == 0) goto L26
            r1.add(r8)
            goto L26
        L3d:
            qy1 r2 = new qy1
            r8 = 11
            r2.<init>(r0, r8)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r1, r2)
            java.util.Iterator r1 = r0.iterator()
        L4c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r2.setAccessible(r7)
            goto L4c
        L5c:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L6a:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto Lc8
            java.lang.Object r8 = r0.next()
            r9 = r8
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.String r10 = p000.lz1.m3694(r9)
            java.lang.String r11 = r9.getName()
            java.lang.String r12 = p000.lz1.m3690(r11, r9)
            java.lang.Class[] r13 = r9.getParameterTypes()
            r13.getClass()
            java.util.ArrayList r14 = new java.util.ArrayList
            int r15 = r13.length
            r14.<init>(r15)
            int r15 = r13.length
            r3 = 0
        L92:
            if (r3 >= r15) goto L9f
            r21 = r0
            r0 = r13[r3]
            int r3 = p000.lz1.m3679(r0, r14, r3, r7)
            r0 = r21
            goto L92
        L9f:
            r21 = r0
            int r0 = r9.getModifiers()
            java.lang.reflect.Modifier.isStatic(r0)
            r19 = 0
            r20 = 62
            java.lang.String r15 = ","
            r16 = 0
            r17 = 0
            r18 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r14, r15, r16, r17, r18, r19, r20)
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4138(r10, r6, r11, r5, r0)
            boolean r0 = p000.lz1.m3673(r0, r4, r12, r1)
            if (r0 == 0) goto Lc5
            r2.add(r8)
        Lc5:
            r0 = r21
            goto L6a
        Lc8:
            return r2
        Lc9:
            java.lang.String r2 = "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B62006CE4037E2C5D21B11231425EB6B3F9FD879B1DF4B587D2ECCD25FD89B97692FDF6367CB59934F5A507881932ED312579"
            java.lang.String r2 = p000.jf0.m2957(r2)
            java.lang.String r3 = "~78ABF9C3EBB978C766D1EEE85DA4659DFA297141942A5334E9FFCE7ECA2DA6EE95D1E1C9D4E5924F6B52F2A316EB620663A06FDEEEB5A62DE86A34E6B3DE9292C4969A9785D875429A6DFA35747485"
            java.lang.String r3 = p000.jf0.m2957(r3)
            java.lang.String r8 = "~78CB965E478A78D38827E0D26879E5129ED28BC0948C0FBC37EEE6CBB3E95B8A4AC1363A6DDE54331B5A47A070A6589A6520FAB8DF66D7EBF463C6CCECF5668CF5BFAF654DDBA3604FF390D96AB8F3A901AF006B220BE9"
            java.lang.String r8 = p000.jf0.m2957(r8)
            java.lang.String[] r2 = new java.lang.String[]{r2, r3, r8}
            java.util.List r2 = p000.AbstractC1021yh.m6897(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        Lec:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L102
            java.lang.Object r8 = r2.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Class r8 = p000.qe0.m4877(r1, r8)
            if (r8 == 0) goto Lec
            r3.add(r8)
            goto Lec
        L102:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r3.iterator()
        L10b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L158
            java.lang.Object r3 = r2.next()
            java.lang.Class r3 = (java.lang.Class) r3
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.reflect.Method[] r9 = r3.getDeclaredMethods()
            r9.getClass()
            p000.AbstractC0984xh.m6659(r8, r9)
            java.util.ArrayList r3 = m2719(r3)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r3 = r3.iterator()
        L133:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L151
            java.lang.Object r10 = r3.next()
            java.lang.Class r10 = (java.lang.Class) r10
            java.lang.reflect.Method[] r10 = r10.getDeclaredMethods()
            r10.getClass()
            java.util.List r10 = java.util.Arrays.asList(r10)
            r10.getClass()
            p000.AbstractC0984xh.m6660(r9, r10)
            goto L133
        L151:
            p000.AbstractC0984xh.m6660(r8, r9)
            p000.AbstractC0984xh.m6660(r1, r8)
            goto L10b
        L158:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L161:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L178
            java.lang.Object r3 = r1.next()
            r8 = r3
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            boolean r8 = m2729(r8)
            if (r8 == 0) goto L161
            r2.add(r3)
            goto L161
        L178:
            qy1 r1 = new qy1
            r3 = 9
            r1.<init>(r0, r3)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r2, r1)
            java.util.Iterator r1 = r0.iterator()
        L187:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L197
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r2.setAccessible(r7)
            goto L187
        L197:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1a5:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L202
            java.lang.Object r3 = r0.next()
            r8 = r3
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.String r9 = p000.lz1.m3694(r8)
            java.lang.String r10 = r8.getName()
            java.lang.String r11 = p000.lz1.m3690(r10, r8)
            java.lang.Class[] r12 = r8.getParameterTypes()
            r12.getClass()
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = r12.length
            r13.<init>(r14)
            int r14 = r12.length
            r15 = 0
        L1cd:
            if (r15 >= r14) goto L1da
            r21 = r0
            r0 = r12[r15]
            int r15 = p000.lz1.m3679(r0, r13, r15, r7)
            r0 = r21
            goto L1cd
        L1da:
            r21 = r0
            int r0 = r8.getModifiers()
            java.lang.reflect.Modifier.isStatic(r0)
            r18 = 0
            r19 = 62
            java.lang.String r14 = ","
            r15 = 0
            r16 = 0
            r17 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r13, r14, r15, r16, r17, r18, r19)
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4138(r9, r6, r10, r5, r0)
            boolean r0 = p000.lz1.m3673(r0, r4, r11, r1)
            if (r0 == 0) goto L1ff
            r2.add(r3)
        L1ff:
            r0 = r21
            goto L1a5
        L202:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L209
            return r2
        L209:
            jz r0 = p000.C0450jz.f5672
            return r0
    }

    /* JADX INFO: renamed from: Ζ */
    public static p000.da1 m2706(int r3) {
            r0 = 1
            if (r3 == r0) goto L38
            r0 = 2
            if (r3 == r0) goto L38
            r0 = 3
            if (r3 == r0) goto L35
            r0 = 4
            if (r3 == r0) goto L32
            r0 = 21
            if (r3 == r0) goto L2f
            r0 = 22
            if (r3 != r0) goto L17
            da1 r3 = p000.da1.f3014
            return r3
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "不支持的 PCM 编码: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L2f:
            da1 r3 = p000.da1.f3013
            return r3
        L32:
            da1 r3 = p000.da1.f3015
            return r3
        L35:
            da1 r3 = p000.da1.f3011
            return r3
        L38:
            da1 r3 = p000.da1.f3012
            return r3
    }

    /* JADX INFO: renamed from: Η */
    public static void m2707(java.util.ArrayList r7) {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r7.iterator()
        L13:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2c
            java.lang.Object r4 = r3.next()
            r5 = r4
            qa2 r5 = (p000.qa2) r5
            java.lang.String r5 = r5.f8945
            boolean r5 = r1.add(r5)
            if (r5 == 0) goto L13
            r2.add(r4)
            goto L13
        L2c:
            java.util.Iterator r1 = r2.iterator()
        L30:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L61
            java.lang.Object r2 = r1.next()
            qa2 r2 = (p000.qa2) r2
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "id"
            java.lang.String r5 = r2.f8943
            r3.put(r4, r5)
            java.lang.String r4 = "name"
            java.lang.String r5 = r2.f8944
            r3.put(r4, r5)
            java.lang.String r4 = "uri"
            java.lang.String r5 = r2.f8945
            r3.put(r4, r5)
            java.lang.String r4 = "durationMs"
            long r5 = r2.f8946
            r3.put(r4, r5)
            r0.put(r3)
            goto L30
        L61:
            java.lang.Object r1 = p000.ui1.f10844
            java.lang.String r0 = r0.toString()
            r0.getClass()
            java.lang.String r1 = "voice_replace_audio_list"
            p000.ui1.m5875(r1, r0)
            java.lang.Object r7 = p000.AbstractC0984xh.m6640(r7)
            qa2 r7 = (p000.qa2) r7
            java.lang.String r0 = "voice_replace_mp3_name"
            java.lang.String r1 = "voice_replace_mp3_uri"
            if (r7 == 0) goto L86
            java.lang.String r2 = r7.f8945
            p000.ui1.m5875(r1, r2)
            java.lang.String r7 = r7.f8944
            p000.ui1.m5875(r0, r7)
            return
        L86:
            p000.ui1.m5876(r1)
            p000.ui1.m5876(r0)
            return
    }

    /* JADX INFO: renamed from: Θ */
    public static int m2708(java.lang.reflect.Method r7) {
            java.lang.Class r0 = r7.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.Class r1 = r7.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r1 = p000.ln0.m3626(r1, r2)
            r2 = 0
            if (r1 == 0) goto L18
            r1 = 200(0xc8, float:2.8E-43)
            goto L19
        L18:
            r1 = r2
        L19:
            java.lang.Class[] r3 = r7.getParameterTypes()
            r3.getClass()
            int r4 = r3.length
            r5 = r2
        L22:
            if (r5 >= r4) goto L32
            r6 = r3[r5]
            bb2 r6 = m2723(r6)
            if (r6 == 0) goto L2f
            int r1 = r1 + 600
            goto L32
        L2f:
            int r5 = r5 + 1
            goto L22
        L32:
            java.lang.Class[] r3 = r7.getParameterTypes()
            int r3 = r3.length
            r4 = 1
            if (r4 > r3) goto L3f
            r4 = 4
            if (r3 >= r4) goto L3f
            int r1 = r1 + 200
        L3f:
            java.lang.String r3 = "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B62006CE4037E2C5D21B11231425EB6B3F9FD879B1DF4B587D2ECCD25FD89B97692FDF6367CB59934F5A507881932ED312579"
            java.lang.String r3 = p000.jf0.m2957(r3)
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L4d
            int r1 = r1 + 1000
        L4d:
            java.lang.String r3 = "~792076A9A8C9D37392B1BEA902D394F25696F0B296E3734A648C9033FB98898FC7E4AEBAAB2A51156B9784EA8E"
            java.lang.String r3 = p000.jf0.m2957(r3)
            boolean r3 = p000.x02.m6485(r0, r3, r2)
            if (r3 == 0) goto L5b
            int r1 = r1 + 500
        L5b:
            java.lang.String r3 = "AudioRecordPanelFragment"
            boolean r3 = p000.q02.m4654(r0, r3, r2)
            if (r3 == 0) goto L65
            int r1 = r1 + 500
        L65:
            java.lang.String r3 = "AudioCommentRecording"
            boolean r0 = p000.q02.m4654(r0, r3, r2)
            if (r0 == 0) goto L6f
            int r1 = r1 + 300
        L6f:
            java.lang.Class[] r0 = r7.getParameterTypes()
            r0.getClass()
            int r3 = r0.length
        L77:
            if (r2 >= r3) goto L91
            r4 = r0[r2]
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "~78B71E7541C477E838C50BCD302E054C40CC02248AA0B9F3FD7D96E48E5395705804FE3D36452620E7FC53FD8B9A95157A99FAA773CE660D7C7738560C6110F6C94E186A484AA44D"
            java.lang.String r5 = p000.jf0.m2957(r5)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L8e
            int r1 = r1 + 300
            goto L91
        L8e:
            int r2 = r2 + 1
            goto L77
        L91:
            int r7 = r7.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 != 0) goto L9d
            int r1 = r1 + 100
        L9d:
            return r1
    }

    /* JADX INFO: renamed from: Ι */
    public static int m2709(java.lang.reflect.Method r7) {
            java.lang.Class r0 = r7.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.Class r1 = r7.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r1 = p000.ln0.m3626(r1, r2)
            r2 = 0
            if (r1 == 0) goto L18
            r1 = 300(0x12c, float:4.2E-43)
            goto L19
        L18:
            r1 = r2
        L19:
            java.lang.Class[] r3 = r7.getParameterTypes()
            r3.getClass()
            int r4 = r3.length
            r5 = r2
        L22:
            if (r5 >= r4) goto L32
            r6 = r3[r5]
            bb2 r6 = m2723(r6)
            if (r6 == 0) goto L2f
            int r1 = r1 + 800
            goto L32
        L2f:
            int r5 = r5 + 1
            goto L22
        L32:
            java.lang.Class[] r3 = r7.getParameterTypes()
            r3.getClass()
            java.lang.Object r3 = p000.AbstractC0312g7.m2250(r3)
            java.lang.Class r3 = (java.lang.Class) r3
            if (r3 == 0) goto L46
            java.lang.String r3 = r3.getName()
            goto L47
        L46:
            r3 = 0
        L47:
            java.lang.String r4 = "~789F9198A9AE6768B1E75F22FE4AFF5FB8139FFB2E3E8ED9059A4B8CF38A7C966955DCB17D901708EC38BEC31F5673DC6814DF5F607943847446CE2B584C33D3A13A"
            java.lang.String r4 = p000.jf0.m2957(r4)
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 == 0) goto L55
            int r1 = r1 + 300
        L55:
            java.lang.String r3 = "~79E5B19C89B3C3BDFA87D5FC28F4667EC8FACC5D1EBC6A59BA9DEDCE"
            java.lang.String r3 = p000.jf0.m2957(r3)
            boolean r2 = p000.x02.m6485(r0, r3, r2)
            if (r2 == 0) goto L63
            int r1 = r1 + 400
        L63:
            java.lang.String r2 = "audio"
            r3 = 1
            boolean r2 = p000.q02.m4654(r0, r2, r3)
            if (r2 == 0) goto L6e
            int r1 = r1 + 300
        L6e:
            java.lang.String r2 = "~78B71E7541C477E838C50BCD302E054C40CC02248AA0B9F3FD7794A78143886D1800F82A71492D2EFEBF50F69EC092027CD8E9B672D52762657C36503D2A32ECDF4324524659B85D"
            java.lang.String r2 = p000.jf0.m2957(r2)
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L7c
            int r1 = r1 + 300
        L7c:
            java.lang.String r2 = "~796C0BCB62BCE6FE82C87A254D6EEBA7FF748413BC384A314027F4FDD0319181261306E8D79B9D665CEFDE51625B554792EFFB41899CEB9C050D6E42C136"
            java.lang.String r2 = p000.jf0.m2957(r2)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8a
            int r1 = r1 + 200
        L8a:
            int r0 = r7.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L96
            int r1 = r1 + 100
        L96:
            int r0 = r7.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto La2
            int r1 = r1 + 200
        La2:
            java.lang.Class r7 = r7.getDeclaringClass()
            boolean r7 = r7.isInterface()
            if (r7 != 0) goto Lae
            int r1 = r1 + 200
        Lae:
            return r1
    }

    /* JADX INFO: renamed from: Κ */
    public static final void m2710(p000.um1 r0, p000.pa2 r1, android.widget.TextView r2, android.widget.TextView r3, java.util.List r4) {
            r0.f10912 = r4
            r4.getClass()
            r1.f8477 = r4
            r1.notifyDataSetChanged()
            java.lang.Object r1 = r0.f10912
            java.util.List r1 = (java.util.List) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L16
            r1 = 0
            goto L18
        L16:
            r1 = 8
        L18:
            r2.setVisibility(r1)
            java.lang.Object r0 = r0.f10912
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " 个"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.setText(r0)
            return
    }

    /* JADX INFO: renamed from: Λ */
    public static void m2711(android.widget.Button r4) {
            android.content.Context r0 = r4.getContext()
            r0.getClass()
            xx r0 = p000.jx0.m3049(r0)
            java.lang.String r1 = r0.f12348
            r2 = 0
            r4.setAllCaps(r2)
            r4.setIncludeFontPadding(r2)
            r4.setMinWidth(r2)
            r4.setMinHeight(r2)
            java.lang.String r2 = r0.f12355
            int r2 = android.graphics.Color.parseColor(r2)
            r4.setTextColor(r2)
            android.content.Context r2 = r4.getContext()
            r2.getClass()
            java.lang.String r0 = r0.f12371
            r3 = 10
            android.graphics.drawable.RippleDrawable r0 = p000.jx0.m3059(r3, r2, r1, r0)
            r4.setBackground(r0)
            return
    }

    /* JADX INFO: renamed from: Μ */
    public static void m2712(android.widget.ProgressBar r1, p000.C1000xx r2) {
            java.lang.String r0 = r2.f12358
            int r0 = android.graphics.Color.parseColor(r0)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r0.getClass()
            java.lang.String r2 = r2.f12371
            int r2 = android.graphics.Color.parseColor(r2)
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r2.getClass()
            r1.setProgressTintList(r0)
            r1.setProgressBackgroundTintList(r2)
            r1.setIndeterminateTintList(r0)
            return
    }

    /* JADX INFO: renamed from: Ν */
    public static void m2713(android.media.MediaExtractor r42, android.media.MediaCodec r43, android.media.MediaCodec r44, android.media.MediaMuxer r45, long r46, int r48, int r49, p000.da1 r50, p000.e80 r51) {
            r1 = r43
            r2 = r44
            r0 = r45
            r10 = r49
            android.media.MediaCodec$BufferInfo r11 = new android.media.MediaCodec$BufferInfo
            r11.<init>()
            android.media.MediaCodec$BufferInfo r12 = new android.media.MediaCodec$BufferInfo
            r12.<init>()
            int r13 = r10 * 2
            if (r48 <= 0) goto L342
            r14 = 1
            if (r14 > r10) goto L33c
            r3 = 3
            if (r10 >= r3) goto L33c
            w6 r15 = new w6
            r15.<init>()
            long r16 = android.os.SystemClock.elapsedRealtime()
            r3 = -1
            r4 = 0
            r18 = r50
            r21 = r3
            r7 = r4
            r8 = r7
            r19 = r8
            r20 = r19
            r22 = r20
            r23 = 0
            r25 = 0
        L37:
            if (r7 != 0) goto L33b
            long r27 = android.os.SystemClock.elapsedRealtime()
            long r27 = r27 - r16
            r29 = 60000(0xea60, double:2.9644E-319)
            int r27 = (r27 > r29 ? 1 : (r27 == r29 ? 0 : -1))
            if (r27 > 0) goto L336
            r27 = r21
            r21 = r7
            r7 = r27
            r27 = r8
            r8 = r14
        L4f:
            r14 = -2
            r50 = r8
            r8 = 1000(0x3e8, double:4.94E-321)
            r5 = 2
            if (r50 == 0) goto Lc0
            int r6 = r2.dequeueOutputBuffer(r12, r8)
            if (r6 != r3) goto L60
            r8 = r4
        L5e:
            r14 = 1
            goto L4f
        L60:
            if (r6 != r14) goto L7b
            if (r27 != 0) goto L75
            android.media.MediaFormat r5 = r2.getOutputFormat()
            int r7 = r0.addTrack(r5)
            r0.start()
            r8 = r50
            r14 = 1
            r27 = 1
            goto L4f
        L75:
            java.lang.String r0 = "编码器输出格式重复变化"
            p000.C1080.m7279(r0)
            return
        L7b:
            if (r6 < 0) goto Lbd
            java.nio.ByteBuffer r8 = r2.getOutputBuffer(r6)
            int r9 = r12.flags
            r5 = r5 & r9
            if (r5 == 0) goto L88
            r12.size = r4
        L88:
            int r5 = r12.size
            if (r5 <= 0) goto La7
            if (r8 == 0) goto La7
            if (r27 == 0) goto La1
            int r5 = r12.offset
            r8.position(r5)
            int r5 = r12.offset
            int r9 = r12.size
            int r5 = r5 + r9
            r8.limit(r5)
            r0.writeSampleData(r7, r8, r12)
            goto La7
        La1:
            java.lang.String r0 = "Muxer 尚未启动"
            p000.C1080.m7279(r0)
            return
        La7:
            int r5 = r12.flags
            r5 = r5 & 4
            if (r5 == 0) goto Lb0
            r21 = 1
            goto Lb2
        Lb0:
            r21 = r4
        Lb2:
            r2.releaseOutputBuffer(r6, r4)
            if (r21 == 0) goto Lbd
            if (r27 == 0) goto L33b
            r0.stop()
            return
        Lbd:
            r8 = r50
            goto L5e
        Lc0:
            boolean r6 = r15.isEmpty()
            r31 = 1000000(0xf4240, double:4.940656E-318)
            java.lang.String r9 = ", frame="
            if (r6 != 0) goto L17f
            if (r20 != 0) goto L17f
            r3 = 0
            int r5 = r2.dequeueInputBuffer(r3)
            if (r5 < 0) goto L175
            java.nio.ByteBuffer r3 = r2.getInputBuffer(r5)
            if (r3 == 0) goto L16f
            r3.clear()
            boolean r4 = r15.isEmpty()
            if (r4 != 0) goto L167
            java.lang.Object[] r4 = r15.f11579
            int r6 = r15.f11578
            r4 = r4[r6]
            xa2 r4 = (p000.xa2) r4
            byte[] r6 = r4.f12096
            byte[] r14 = r4.f12096
            int r6 = r6.length
            int r8 = r4.f12097
            int r6 = r6 - r8
            int r8 = r3.remaining()
            if (r6 <= 0) goto L15d
            int r36 = r6 % r13
            if (r36 != 0) goto L15d
            int r6 = java.lang.Math.min(r6, r8)
            int r36 = r6 % r13
            int r6 = r6 - r36
            if (r6 <= 0) goto L14f
            r8 = r48
            long r9 = (long) r8
            long r36 = r25 / r9
            long r38 = r25 % r9
            long r36 = r36 * r31
            long r38 = r38 * r31
            long r38 = r38 / r9
            long r38 = r38 + r36
            int r9 = r6 / r13
            long r9 = (long) r9
            long r25 = r25 + r9
            int r9 = r4.f12097
            r3.put(r14, r9, r6)
            r3 = r4
            r4 = 0
            r8 = 0
            r9 = r3
            r3 = r5
            r5 = r6
            r30 = r7
            r29 = r11
            r6 = r38
            r10 = 0
            r35 = 0
            r2.queueInputBuffer(r3, r4, r5, r6, r8)
            int r3 = r9.f12097
            int r3 = r3 + r5
            r9.f12097 = r3
            int r4 = r14.length
            int r4 = r4 - r3
            if (r4 != 0) goto L140
            r15.removeFirst()
        L140:
            r10 = r49
            r11 = r29
            r7 = r30
            r4 = r35
            r3 = -1
            r5 = 2
            r8 = 1000(0x3e8, double:4.94E-321)
            r14 = -2
            goto Lc0
        L14f:
            r36 = r8
            java.lang.String r0 = "编码器输入缓冲区不足一个 PCM 帧: capacity="
            r1 = r36
            java.lang.String r0 = p000.AbstractC0602nx.m4125(r1, r13, r0, r9)
            p000.C1080.m7266(r0)
            return
        L15d:
            java.lang.String r0 = "待编码 PCM 不是完整声道帧: bytes="
            java.lang.String r0 = p000.AbstractC0602nx.m4125(r6, r13, r0, r9)
            p000.C1080.m7266(r0)
            return
        L167:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ArrayDeque is empty."
            r0.<init>(r1)
            throw r0
        L16f:
            java.lang.String r0 = "编码器输入缓冲区为空"
            p000.C1080.m7279(r0)
            return
        L175:
            r14 = r48
            r30 = r7
            r29 = r11
            r35 = 0
            r10 = r3
            goto L189
        L17f:
            r14 = r48
            r35 = r4
            r30 = r7
            r29 = r11
            r10 = 0
        L189:
            if (r19 == 0) goto L1b3
            boolean r3 = r15.isEmpty()
            if (r3 == 0) goto L1b3
            if (r20 != 0) goto L1b3
            int r3 = r2.dequeueInputBuffer(r10)
            if (r3 < 0) goto L1b3
            long r4 = (long) r14
            long r6 = r25 / r4
            long r33 = r25 % r4
            long r6 = r6 * r31
            long r33 = r33 * r31
            long r33 = r33 / r4
            long r6 = r33 + r6
            r8 = 4
            r4 = 0
            r5 = 0
            r31 = r10
            r10 = r35
            r2.queueInputBuffer(r3, r4, r5, r6, r8)
            r20 = 1
            goto L1b7
        L1b3:
            r31 = r10
            r10 = r35
        L1b7:
            boolean r2 = r15.isEmpty()
            if (r2 == 0) goto L1bf
            if (r19 == 0) goto L1ca
        L1bf:
            r8 = r42
            r7 = r10
            r5 = r23
            r3 = r29
            r10 = r49
            goto L326
        L1ca:
            if (r22 != 0) goto L23c
            r2 = 1000(0x3e8, double:4.94E-321)
            int r4 = r1.dequeueInputBuffer(r2)
            if (r4 < 0) goto L236
            java.nio.ByteBuffer r5 = r1.getInputBuffer(r4)
            r8 = r42
            if (r5 == 0) goto L1e5
            int r5 = r8.readSampleData(r5, r10)
            r40 = r2
            r2 = r4
            r4 = r5
            goto L1e9
        L1e5:
            r40 = r2
            r2 = r4
            r4 = -1
        L1e9:
            long r5 = r8.getSampleTime()
            int r3 = (r5 > r31 ? 1 : (r5 == r31 ? 0 : -1))
            if (r3 >= 0) goto L1f3
            r5 = r31
        L1f3:
            if (r4 < 0) goto L1f9
            int r3 = (r5 > r46 ? 1 : (r5 == r46 ? 0 : -1))
            if (r3 < 0) goto L1fc
        L1f9:
            r10 = r40
            goto L229
        L1fc:
            r23 = 90
            long r23 = r23 * r5
            long r10 = r23 / r46
            int r3 = (int) r10
            r7 = 5
            r10 = 95
            int r3 = p000.j81.m2906(r3, r7, r10)
            en0 r7 = new en0
            r10 = 2
            r11 = r51
            r7.<init>(r3, r10, r11)
            android.os.Handler r3 = p000.ib2.f4982
            r3.post(r7)
            r3 = 0
            int r7 = r8.getSampleFlags()
            r10 = r40
            r1.queueInputBuffer(r2, r3, r4, r5, r7)
            r8.advance()
            r1 = r43
        L226:
            r23 = r5
            goto L23f
        L229:
            r4 = 0
            r7 = 4
            r3 = 0
            r1 = r43
            r5 = r23
            r1.queueInputBuffer(r2, r3, r4, r5, r7)
            r22 = 1
            goto L23f
        L236:
            r10 = r2
        L237:
            r8 = r42
            r5 = r23
            goto L226
        L23c:
            r10 = 1000(0x3e8, double:4.94E-321)
            goto L237
        L23f:
            r4 = r19 ^ 1
            r2 = r18
        L243:
            if (r4 == 0) goto L313
            r3 = r29
            int r5 = r1.dequeueOutputBuffer(r3, r10)
            r7 = -1
            if (r5 != r7) goto L252
            r29 = r3
            r4 = 0
            goto L243
        L252:
            r6 = -2
            if (r5 != r6) goto L2aa
            android.media.MediaFormat r2 = r1.getOutputFormat()
            r2.getClass()
            java.lang.String r5 = "sample-rate"
            int r5 = r2.getInteger(r5)
            java.lang.String r6 = "channel-count"
            int r6 = r2.getInteger(r6)
            java.lang.String r7 = " output="
            if (r5 != r14) goto L2a0
            r10 = r49
            if (r6 != r10) goto L296
            java.lang.String r5 = "pcm-encoding"
            r11 = 2
            int r2 = r2.getInteger(r5, r11)
            da1 r2 = m2706(r2)
            java.lang.String r5 = " channels="
            java.lang.String r6 = " encoding="
            java.lang.String r7 = "decoder PCM format sampleRate="
            java.lang.StringBuilder r5 = p000.AbstractC0602nx.m4136(r7, r14, r5, r10, r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "rb360b99c73f2f647"
            p000.C0888ux.m5975(r6, r5)
        L291:
            r29 = r3
        L293:
            r10 = 1000(0x3e8, double:4.94E-321)
            goto L243
        L296:
            java.lang.String r0 = "解码声道数变化，拒绝错误声道转码: input="
            java.lang.String r0 = p000.AbstractC0602nx.m4125(r10, r6, r0, r7)
            p000.C1080.m7266(r0)
            return
        L2a0:
            java.lang.String r0 = "解码采样率变化，拒绝错误速率转码: input="
            java.lang.String r0 = p000.AbstractC0602nx.m4125(r14, r5, r0, r7)
            p000.C1080.m7266(r0)
            return
        L2aa:
            r10 = r49
            r11 = 2
            if (r5 < 0) goto L291
            java.nio.ByteBuffer r6 = r1.getOutputBuffer(r5)     // Catch: java.lang.Throwable -> L2ce
            int r7 = r3.size     // Catch: java.lang.Throwable -> L2ce
            if (r7 <= 0) goto L2f3
            if (r6 == 0) goto L2f3
            byte[] r6 = m2721(r6, r3, r2)     // Catch: java.lang.Throwable -> L2ce
            int r7 = r6.length     // Catch: java.lang.Throwable -> L2ce
            int r7 = r7 % r13
            if (r7 != 0) goto L2d1
            int r7 = r6.length     // Catch: java.lang.Throwable -> L2ce
            if (r7 != 0) goto L2c5
            goto L2f3
        L2c5:
            xa2 r7 = new xa2     // Catch: java.lang.Throwable -> L2ce
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L2ce
            r15.addLast(r7)     // Catch: java.lang.Throwable -> L2ce
            goto L2f3
        L2ce:
            r0 = move-exception
            r7 = 0
            goto L30f
        L2d1:
            int r0 = r6.length     // Catch: java.lang.Throwable -> L2ce
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2ce
            r2.<init>()     // Catch: java.lang.Throwable -> L2ce
            java.lang.String r3 = "解码 PCM 不是完整声道帧: bytes="
            r2.append(r3)     // Catch: java.lang.Throwable -> L2ce
            r2.append(r0)     // Catch: java.lang.Throwable -> L2ce
            r2.append(r9)     // Catch: java.lang.Throwable -> L2ce
            r2.append(r13)     // Catch: java.lang.Throwable -> L2ce
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L2ce
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2ce
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2ce
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2ce
            throw r2     // Catch: java.lang.Throwable -> L2ce
        L2f3:
            int r6 = r3.flags     // Catch: java.lang.Throwable -> L2ce
            r6 = r6 & 4
            if (r6 == 0) goto L2fd
            r19 = 1
        L2fb:
            r6 = 0
            goto L300
        L2fd:
            r19 = 0
            goto L2fb
        L300:
            r1.releaseOutputBuffer(r5, r6)
            if (r19 != 0) goto L30b
            boolean r5 = r15.isEmpty()
            if (r5 != 0) goto L291
        L30b:
            r29 = r3
            r4 = 0
            goto L293
        L30f:
            r1.releaseOutputBuffer(r5, r7)
            throw r0
        L313:
            r10 = r49
            r18 = r2
            r7 = r21
            r8 = r27
            r11 = r29
            r21 = r30
            r3 = -1
            r4 = 0
            r14 = 1
            r2 = r44
            goto L37
        L326:
            r2 = r44
            r11 = r3
            r23 = r5
            r4 = r7
            r7 = r21
            r8 = r27
            r21 = r30
            r3 = -1
            r14 = 1
            goto L37
        L336:
            java.lang.String r0 = "音频转码超时"
            p000.C1080.m7279(r0)
        L33b:
            return
        L33c:
            java.lang.String r0 = "仅支持单声道或双声道 PCM"
            p000.C1080.m7275(r0)
            return
        L342:
            java.lang.String r0 = "采样率必须为正数"
            p000.C1080.m7275(r0)
            return
    }

    /* JADX INFO: renamed from: Ξ */
    public static void m2714(android.content.Context r17, android.net.Uri r18, java.io.File r19, long r20, java.lang.String r22, p000.e80 r23) {
            r0 = r20
            r2 = r22
            r12 = r23
            java.lang.String r3 = "audio/mp4a-latm"
            java.lang.String r13 = "rb360b99c73f2f647"
            boolean r4 = r19.exists()     // Catch: java.lang.Throwable -> L13
            if (r4 == 0) goto L13
            r19.delete()     // Catch: java.lang.Throwable -> L13
        L13:
            r4 = 0
            android.media.MediaExtractor r5 = new android.media.MediaExtractor     // Catch: java.lang.Throwable -> L1ee
            r5.<init>()     // Catch: java.lang.Throwable -> L1ee
            r6 = r17
            r7 = r18
            r5.setDataSource(r6, r7, r4)     // Catch: java.lang.Throwable -> L1ee
            int r6 = r5.getTrackCount()     // Catch: java.lang.Throwable -> L199
            r7 = 0
            xm0 r6 = p000.j81.m2893(r7, r6)     // Catch: java.lang.Throwable -> L199
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L199
        L2d:
            r8 = r6
            wm0 r8 = (p000.wm0) r8     // Catch: java.lang.Throwable -> L199
            boolean r8 = r8.f11765     // Catch: java.lang.Throwable -> L199
            java.lang.String r9 = "mime"
            r10 = 1
            if (r8 == 0) goto L5f
            r8 = r6
            wm0 r8 = (p000.wm0) r8     // Catch: java.lang.Throwable -> L58
            java.lang.Object r8 = r8.next()     // Catch: java.lang.Throwable -> L58
            r11 = r8
            java.lang.Number r11 = (java.lang.Number) r11     // Catch: java.lang.Throwable -> L58
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L58
            android.media.MediaFormat r11 = r5.getTrackFormat(r11)     // Catch: java.lang.Throwable -> L58
            java.lang.String r11 = r11.getString(r9)     // Catch: java.lang.Throwable -> L58
            if (r11 == 0) goto L2d
            java.lang.String r14 = "audio/"
            boolean r11 = p000.x02.m6485(r11, r14, r7)     // Catch: java.lang.Throwable -> L58
            if (r11 != r10) goto L2d
            goto L60
        L58:
            r0 = move-exception
            r6 = r4
            r10 = r6
            r4 = r5
            r5 = r10
            goto L1f2
        L5f:
            r8 = r4
        L60:
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Throwable -> L199
            if (r8 == 0) goto L1e4
            int r6 = r8.intValue()     // Catch: java.lang.Throwable -> L199
            r5.selectTrack(r6)     // Catch: java.lang.Throwable -> L199
            android.media.MediaFormat r6 = r5.getTrackFormat(r6)     // Catch: java.lang.Throwable -> L199
            r6.getClass()     // Catch: java.lang.Throwable -> L199
            java.lang.String r8 = r6.getString(r9)     // Catch: java.lang.Throwable -> L199
            if (r8 == 0) goto L1da
            java.lang.String r9 = "sample-rate"
            int r9 = r6.getInteger(r9)     // Catch: java.lang.Throwable -> L199
            java.lang.String r11 = "channel-count"
            int r11 = r6.getInteger(r11)     // Catch: java.lang.Throwable -> L199
            r14 = 8000(0x1f40, float:1.121E-41)
            if (r9 < r14) goto L1bd
            if (r10 > r11) goto L19d
            r14 = 3
            if (r11 >= r14) goto L19d
            java.lang.String r14 = "pcm-encoding"
            r15 = 2
            int r14 = r6.getInteger(r14, r15)     // Catch: java.lang.Throwable -> L199
            da1 r14 = m2706(r14)     // Catch: java.lang.Throwable -> L199
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L199
            r10.<init>()     // Catch: java.lang.Throwable -> L199
            java.lang.String r15 = "start transcode "
            r10.append(r15)     // Catch: java.lang.Throwable -> L199
            r10.append(r2)     // Catch: java.lang.Throwable -> L199
            java.lang.String r15 = " voice mime="
            r10.append(r15)     // Catch: java.lang.Throwable -> L199
            r10.append(r8)     // Catch: java.lang.Throwable -> L199
            java.lang.String r15 = " sampleRate="
            r10.append(r15)     // Catch: java.lang.Throwable -> L199
            r10.append(r9)     // Catch: java.lang.Throwable -> L199
            java.lang.String r15 = " channels="
            r10.append(r15)     // Catch: java.lang.Throwable -> L199
            r10.append(r11)     // Catch: java.lang.Throwable -> L199
            java.lang.String r15 = " pcm="
            r10.append(r15)     // Catch: java.lang.Throwable -> L199
            r10.append(r14)     // Catch: java.lang.Throwable -> L199
            java.lang.String r15 = " maxDuration="
            r10.append(r15)     // Catch: java.lang.Throwable -> L199
            r10.append(r0)     // Catch: java.lang.Throwable -> L199
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L199
            p000.C0888ux.m5975(r13, r10)     // Catch: java.lang.Throwable -> L199
            android.os.Handler r15 = p000.ib2.f4982     // Catch: java.lang.Throwable -> L199
            ma2 r10 = new ma2     // Catch: java.lang.Throwable -> L199
            r4 = 0
            r10.<init>(r4, r12)     // Catch: java.lang.Throwable -> L18d
            r15.post(r10)     // Catch: java.lang.Throwable -> L18d
            android.media.MediaCodec r4 = android.media.MediaCodec.createDecoderByType(r8)     // Catch: java.lang.Throwable -> L18d
            r8 = 0
            r4.configure(r6, r8, r8, r7)     // Catch: java.lang.Throwable -> L195
            r4.start()     // Catch: java.lang.Throwable -> L18d
            android.media.MediaFormat r6 = android.media.MediaFormat.createAudioFormat(r3, r9, r11)     // Catch: java.lang.Throwable -> L189
            java.lang.String r8 = "aac-profile"
            r10 = 2
            r6.setInteger(r8, r10)     // Catch: java.lang.Throwable -> L189
            java.lang.String r8 = "bitrate"
            r10 = 96000(0x17700, float:1.34525E-40)
            r6.setInteger(r8, r10)     // Catch: java.lang.Throwable -> L189
            java.lang.String r8 = "max-input-size"
            r10 = 16384(0x4000, float:2.2959E-41)
            r6.setInteger(r8, r10)     // Catch: java.lang.Throwable -> L189
            android.media.MediaCodec r3 = android.media.MediaCodec.createEncoderByType(r3)     // Catch: java.lang.Throwable -> L189
            r8 = 1
            r10 = 0
            r3.configure(r6, r10, r10, r8)     // Catch: java.lang.Throwable -> L184
            r3.start()     // Catch: java.lang.Throwable -> L184
            android.media.MediaMuxer r6 = new android.media.MediaMuxer     // Catch: java.lang.Throwable -> L17c
            java.lang.String r8 = r19.getAbsolutePath()     // Catch: java.lang.Throwable -> L17c
            r6.<init>(r8, r7)     // Catch: java.lang.Throwable -> L17c
            r7 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r0
            r10 = r5
            r5 = r3
            r3 = r10
            r10 = r11
            r11 = r14
            m2713(r3, r4, r5, r6, r7, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L177
            java.lang.String r0 = r19.getAbsolutePath()     // Catch: java.lang.Throwable -> L177
            long r7 = r19.length()     // Catch: java.lang.Throwable -> L177
            long r9 = m2702(r19)     // Catch: java.lang.Throwable -> L177
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L177
            r1.<init>()     // Catch: java.lang.Throwable -> L177
            java.lang.String r11 = "finish transcode "
            r1.append(r11)     // Catch: java.lang.Throwable -> L177
            r1.append(r2)     // Catch: java.lang.Throwable -> L177
            java.lang.String r2 = " voice file="
            r1.append(r2)     // Catch: java.lang.Throwable -> L177
            r1.append(r0)     // Catch: java.lang.Throwable -> L177
            java.lang.String r0 = ", size="
            r1.append(r0)     // Catch: java.lang.Throwable -> L177
            r1.append(r7)     // Catch: java.lang.Throwable -> L177
            java.lang.String r0 = ", metaDuration="
            r1.append(r0)     // Catch: java.lang.Throwable -> L177
            r1.append(r9)     // Catch: java.lang.Throwable -> L177
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L177
            p000.C0888ux.m5975(r13, r0)     // Catch: java.lang.Throwable -> L177
            ma2 r0 = new ma2     // Catch: java.lang.Throwable -> L177
            r1 = 1
            r0.<init>(r1, r12)     // Catch: java.lang.Throwable -> L177
            r15.post(r0)     // Catch: java.lang.Throwable -> L177
            r3.release()     // Catch: java.lang.Throwable -> L167
        L167:
            r4.stop()     // Catch: java.lang.Throwable -> L16a
        L16a:
            r4.release()     // Catch: java.lang.Throwable -> L16d
        L16d:
            r5.stop()     // Catch: java.lang.Throwable -> L170
        L170:
            r5.release()     // Catch: java.lang.Throwable -> L173
        L173:
            r6.release()     // Catch: java.lang.Throwable -> L176
        L176:
            return
        L177:
            r0 = move-exception
        L178:
            r10 = r4
            r4 = r3
            goto L1f2
        L17c:
            r0 = move-exception
            r16 = r5
            r5 = r3
            r3 = r16
            r6 = r10
            goto L178
        L184:
            r0 = move-exception
            r3 = r5
        L186:
            r5 = r10
            r6 = r5
            goto L178
        L189:
            r0 = move-exception
            r3 = r5
            r10 = 0
            goto L186
        L18d:
            r0 = move-exception
            r3 = r5
            r10 = 0
        L190:
            r4 = r3
            r5 = r10
        L192:
            r6 = r5
            goto L1f2
        L195:
            r0 = move-exception
            r3 = r5
            r10 = r8
            goto L190
        L199:
            r0 = move-exception
            r10 = r4
            r3 = r5
            goto L190
        L19d:
            r10 = r4
            r3 = r5
            r0 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1bb
            r1.<init>()     // Catch: java.lang.Throwable -> L1bb
            java.lang.String r2 = "仅支持单声道或双声道音频: channels="
            r1.append(r2)     // Catch: java.lang.Throwable -> L1bb
            r1.append(r0)     // Catch: java.lang.Throwable -> L1bb
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L1bb
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L1bb
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1bb
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1bb
            throw r1     // Catch: java.lang.Throwable -> L1bb
        L1bb:
            r0 = move-exception
            goto L190
        L1bd:
            r10 = r4
            r3 = r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1bb
            r0.<init>()     // Catch: java.lang.Throwable -> L1bb
            java.lang.String r1 = "不支持的音频采样率: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L1bb
            r0.append(r9)     // Catch: java.lang.Throwable -> L1bb
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1bb
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L1bb
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1bb
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1bb
            throw r1     // Catch: java.lang.Throwable -> L1bb
        L1da:
            r10 = r4
            r3 = r5
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1bb
            java.lang.String r1 = "音频格式未知"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1bb
            throw r0     // Catch: java.lang.Throwable -> L1bb
        L1e4:
            r10 = r4
            r3 = r5
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1bb
            java.lang.String r1 = "未找到音频轨道"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1bb
            throw r0     // Catch: java.lang.Throwable -> L1bb
        L1ee:
            r0 = move-exception
            r10 = r4
            r5 = r4
            goto L192
        L1f2:
            if (r4 == 0) goto L1f7
            r4.release()     // Catch: java.lang.Throwable -> L1f7
        L1f7:
            if (r10 == 0) goto L1fc
            r10.stop()     // Catch: java.lang.Throwable -> L1fc
        L1fc:
            if (r10 == 0) goto L201
            r10.release()     // Catch: java.lang.Throwable -> L201
        L201:
            if (r5 == 0) goto L206
            r5.stop()     // Catch: java.lang.Throwable -> L206
        L206:
            if (r5 == 0) goto L20b
            r5.release()     // Catch: java.lang.Throwable -> L20b
        L20b:
            if (r6 == 0) goto L210
            r6.release()     // Catch: java.lang.Throwable -> L210
        L210:
            throw r0
    }

    /* JADX INFO: renamed from: α */
    public static final void m2715(p000.ib2 r18, java.lang.Object r19) {
            r1 = r19
            java.lang.String r2 = ", waveHead="
            java.lang.String r3 = ", waveSize="
            java.lang.String r4 = "rb360b99c73f2f647"
            java.lang.String r5 = "apply comment event replacement path="
            java.lang.String r6 = "probe comment-event class="
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.Throwable -> L27
            ra2 r7 = m2722(r0)     // Catch: java.lang.Throwable -> L27
            if (r7 != 0) goto L18
            goto L181
        L18:
            java.lang.reflect.Field r0 = r7.f9316     // Catch: java.lang.Throwable -> L27
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L27
            boolean r8 = r0 instanceof java.io.File     // Catch: java.lang.Throwable -> L27
            r9 = 0
            if (r8 == 0) goto L2a
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Throwable -> L27
            r8 = r0
            goto L2b
        L27:
            r0 = move-exception
            goto L170
        L2a:
            r8 = r9
        L2b:
            if (r8 != 0) goto L2f
            goto L181
        L2f:
            java.lang.String r0 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L27
            r0.getClass()     // Catch: java.lang.Throwable -> L27
            java.lang.String r10 = "/comment/audio/"
            r11 = 0
            boolean r0 = p000.q02.m4654(r0, r10, r11)     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L41
            goto L181
        L41:
            java.lang.reflect.Field r0 = r7.f9317     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L4a
            goto L4d
        L4a:
            r0 = move-exception
            goto L62
        L4c:
            r0 = r9
        L4d:
            boolean r10 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L4a
            if (r10 == 0) goto L54
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L4a
            goto L55
        L54:
            r0 = r9
        L55:
            if (r0 == 0) goto L60
            long r10 = r0.longValue()     // Catch: java.lang.Throwable -> L4a
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Throwable -> L4a
            goto L68
        L60:
            r0 = r9
            goto L68
        L62:
            eo1 r10 = new eo1     // Catch: java.lang.Throwable -> L27
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L27
            r0 = r10
        L68:
            boolean r10 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L27
            if (r10 == 0) goto L6d
            r0 = r9
        L6d:
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L76
            long r10 = r0.longValue()     // Catch: java.lang.Throwable -> L27
            goto L78
        L76:
            r10 = 0
        L78:
            java.lang.reflect.Field r0 = r7.f9318     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L83
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L81
            goto L84
        L81:
            r0 = move-exception
            goto L8d
        L83:
            r0 = r9
        L84:
            boolean r12 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> L81
            if (r12 == 0) goto L8b
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L81
            goto L93
        L8b:
            r0 = r9
            goto L93
        L8d:
            eo1 r12 = new eo1     // Catch: java.lang.Throwable -> L27
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L27
            r0 = r12
        L93:
            boolean r12 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L27
            if (r12 == 0) goto L98
            goto L99
        L98:
            r9 = r0
        L99:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Throwable -> L27
            if (r9 != 0) goto L9f
            jz r9 = p000.C0450jz.f5672     // Catch: java.lang.Throwable -> L27
        L9f:
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L27
            java.lang.String r12 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L27
            boolean r13 = r8.exists()     // Catch: java.lang.Throwable -> L27
            long r14 = r8.length()     // Catch: java.lang.Throwable -> L27
            r18 = r7
            r16 = r8
            long r7 = m2702(r16)     // Catch: java.lang.Throwable -> L27
            r17 = r5
            int r5 = r9.size()     // Catch: java.lang.Throwable -> L27
            r1 = 6
            java.util.List r9 = p000.AbstractC0984xh.m6662(r9, r1)     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L27
            r1.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = ", path="
            r1.append(r0)     // Catch: java.lang.Throwable -> L27
            r1.append(r12)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = ", exists="
            r1.append(r0)     // Catch: java.lang.Throwable -> L27
            r1.append(r13)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = ", size="
            r1.append(r0)     // Catch: java.lang.Throwable -> L27
            r1.append(r14)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = ", eventDuration="
            r1.append(r0)     // Catch: java.lang.Throwable -> L27
            r1.append(r10)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = ", metaDuration="
            r1.append(r0)     // Catch: java.lang.Throwable -> L27
            r1.append(r7)     // Catch: java.lang.Throwable -> L27
            r1.append(r3)     // Catch: java.lang.Throwable -> L27
            r1.append(r5)     // Catch: java.lang.Throwable -> L27
            r1.append(r2)     // Catch: java.lang.Throwable -> L27
            r1.append(r9)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L27
            p000.C0888ux.m5975(r4, r0)     // Catch: java.lang.Throwable -> L27
            java.util.concurrent.ConcurrentHashMap r0 = p000.ib2.f4987     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r16.getAbsolutePath()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L27
            wa2 r0 = (p000.wa2) r0     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L118
            goto L181
        L118:
            r1 = r18
            java.lang.reflect.Field r5 = r1.f9317     // Catch: java.lang.Throwable -> L27
            if (r5 == 0) goto L12a
            long r6 = r0.f11645     // Catch: java.lang.Throwable -> L27
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L27
            r7 = r19
            r5.set(r7, r6)     // Catch: java.lang.Throwable -> L27
            goto L12c
        L12a:
            r7 = r19
        L12c:
            java.lang.reflect.Field r1 = r1.f9318     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L135
            java.util.List r5 = r0.f11646     // Catch: java.lang.Throwable -> L27
            r1.set(r7, r5)     // Catch: java.lang.Throwable -> L27
        L135:
            java.lang.String r1 = r16.getAbsolutePath()     // Catch: java.lang.Throwable -> L27
            long r5 = r0.f11645     // Catch: java.lang.Throwable -> L27
            java.util.List r7 = r0.f11646     // Catch: java.lang.Throwable -> L27
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L27
            java.util.List r0 = r0.f11646     // Catch: java.lang.Throwable -> L27
            r8 = 6
            java.util.List r0 = p000.AbstractC0984xh.m6662(r0, r8)     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r9 = r17
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L27
            r8.append(r1)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = ", hostDuration="
            r8.append(r1)     // Catch: java.lang.Throwable -> L27
            r8.append(r5)     // Catch: java.lang.Throwable -> L27
            r8.append(r3)     // Catch: java.lang.Throwable -> L27
            r8.append(r7)     // Catch: java.lang.Throwable -> L27
            r8.append(r2)     // Catch: java.lang.Throwable -> L27
            r8.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L27
            p000.C0888ux.m5975(r4, r0)     // Catch: java.lang.Throwable -> L27
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L27
            goto L176
        L170:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L176:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L181
            java.lang.String r1 = "handle comment audio event failed"
            p000.C0888ux.m5977(r4, r1, r0)
        L181:
            return
    }

    /* JADX INFO: renamed from: β */
    public static final void m2716(p000.ib2 r7, java.lang.Object r8) {
            if (r8 != 0) goto L4
            goto L9e
        L4:
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r0 = m2718(r0)     // Catch: java.lang.Throwable -> L5a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L5a
        L10:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L7c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L5a
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1     // Catch: java.lang.Throwable -> L5a
            int r2 = r1.getModifiers()     // Catch: java.lang.Throwable -> L5a
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)     // Catch: java.lang.Throwable -> L5a
            if (r2 != 0) goto L10
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> L2b
            goto L32
        L2b:
            r1 = move-exception
            eo1 r2 = new eo1     // Catch: java.lang.Throwable -> L5a
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L5a
            r1 = r2
        L32:
            boolean r2 = r1 instanceof p000.eo1     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto L37
            r1 = 0
        L37:
            if (r1 != 0) goto L3a
            goto L10
        L3a:
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L5a
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()     // Catch: java.lang.Throwable -> L5a
            r1.getClass()     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5a
            r2.<init>()     // Catch: java.lang.Throwable -> L5a
            int r3 = r1.length     // Catch: java.lang.Throwable -> L5a
            r4 = 0
        L4c:
            if (r4 >= r3) goto L5f
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L5a
            boolean r6 = m2730(r5)     // Catch: java.lang.Throwable -> L5a
            if (r6 == 0) goto L5c
            r2.add(r5)     // Catch: java.lang.Throwable -> L5a
            goto L5c
        L5a:
            r7 = move-exception
            goto L7f
        L5c:
            int r4 = r4 + 1
            goto L4c
        L5f:
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L5a
        L63:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto L10
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L5a
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L5a
            r2.getClass()     // Catch: java.lang.Throwable -> L5a
            ia2 r3 = new ia2     // Catch: java.lang.Throwable -> L5a
            r4 = 1
            r3.<init>(r7, r4)     // Catch: java.lang.Throwable -> L5a
            m2726(r2, r3)     // Catch: java.lang.Throwable -> L5a
            goto L63
        L7c:
            s62 r7 = p000.s62.f9751     // Catch: java.lang.Throwable -> L5a
            goto L85
        L7f:
            eo1 r0 = new eo1
            r0.<init>(r7)
            r7 = r0
        L85:
            java.lang.Throwable r7 = p000.fo1.m2190(r7)
            if (r7 == 0) goto L9e
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r0 = "install IM helper voice hook failed "
            java.lang.String r8 = r0.concat(r8)
            java.lang.String r0 = "rb360b99c73f2f647"
            p000.C0888ux.m5977(r0, r8, r7)
        L9e:
            return
    }

    /* JADX INFO: renamed from: γ */
    public static final boolean m2717(p000.ib2 r6, p000.k01 r7) {
            java.lang.Object[] r6 = r7.f5692
            r7 = 1
            if (r6 != 0) goto L6
            goto L57
        L6:
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L9:
            r3 = 0
            if (r2 >= r0) goto L16
            r4 = r6[r2]
            boolean r5 = r4 instanceof java.lang.Enum
            if (r5 == 0) goto L13
            goto L17
        L13:
            int r2 = r2 + 1
            goto L9
        L16:
            r4 = r3
        L17:
            boolean r0 = r4 instanceof java.lang.Enum
            if (r0 == 0) goto L1e
            r3 = r4
            java.lang.Enum r3 = (java.lang.Enum) r3
        L1e:
            if (r3 == 0) goto L51
            java.lang.String r6 = r3.name()
            java.lang.String r0 = "RECORD_COMPLETE"
            boolean r6 = p000.ln0.m3626(r6, r0)
            if (r6 != 0) goto L57
            java.lang.String r6 = r3.name()
            java.lang.String r0 = "COMPLETE"
            boolean r6 = p000.q02.m4654(r6, r0, r7)
            if (r6 != 0) goto L57
            java.lang.String r6 = r3.name()
            java.lang.String r0 = "FINISH"
            boolean r6 = p000.q02.m4654(r6, r0, r7)
            if (r6 != 0) goto L57
            java.lang.String r6 = r3.name()
            java.lang.String r0 = "SUCCESS"
            boolean r6 = p000.q02.m4654(r6, r0, r7)
            if (r6 == 0) goto L58
            goto L57
        L51:
            java.lang.Object r6 = m2724(r6)
            if (r6 == 0) goto L58
        L57:
            return r7
        L58:
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public static java.util.ArrayList m2718(java.lang.Class r2) {
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

    /* JADX INFO: renamed from: ε */
    public static java.util.ArrayList m2719(java.lang.Class r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            w6 r1 = new w6
            r1.<init>()
            r1.addLast(r5)
        Ld:
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L32
            java.lang.Object r5 = r1.removeFirst()
            java.lang.Class r5 = (java.lang.Class) r5
            java.lang.Class[] r5 = r5.getDeclaredClasses()
            r5.getClass()
            int r2 = r5.length
            r3 = 0
        L22:
            if (r3 >= r2) goto Ld
            r4 = r5[r3]
            r0.add(r4)
            r4.getClass()
            r1.addLast(r4)
            int r3 = r3 + 1
            goto L22
        L32:
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static p000.cb2 m2720(android.content.Context r20, p000.ya2 r21, p000.qa2 r22, java.io.File r23, long r24, java.util.List r26, p000.e80 r27) {
            r0 = r21
            java.lang.String r1 = "rb360b99c73f2f647"
            java.lang.String r2 = "audio"
            r3 = r22
            java.lang.String r3 = r3.f8945
            boolean r4 = p000.q02.m4671(r3)
            r5 = 0
            if (r4 == 0) goto L12
            return r5
        L12:
            android.net.Uri r7 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L21
            java.io.File r3 = r23.getParentFile()     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L24
            java.io.File r3 = r20.getCacheDir()     // Catch: java.lang.Throwable -> L21
            goto L24
        L21:
            r0 = move-exception
            goto L184
        L24:
            r3.mkdirs()     // Catch: java.lang.Throwable -> L21
            ya2 r4 = p000.ya2.f12541
            if (r0 != r4) goto L47
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = r23.getName()     // Catch: java.lang.Throwable -> L21
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r8.<init>()     // Catch: java.lang.Throwable -> L21
            r8.append(r6)     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = ".dyhelper.tmp.m4a"
            r8.append(r6)     // Catch: java.lang.Throwable -> L21
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L21
            r2.<init>(r3, r6)     // Catch: java.lang.Throwable -> L21
            r8 = r2
            goto L62
        L47:
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L21
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L21
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r10.<init>(r2)     // Catch: java.lang.Throwable -> L21
            r10.append(r8)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "_dyhelper.m4a"
            r10.append(r2)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = r10.toString()     // Catch: java.lang.Throwable -> L21
            r6.<init>(r3, r2)     // Catch: java.lang.Throwable -> L21
            r8 = r6
        L62:
            if (r0 != r4) goto L7c
            r7.getClass()     // Catch: java.lang.Throwable -> L21
            java.lang.String r11 = "comment"
            r9 = 29000(0x7148, double:1.4328E-319)
            r6 = r20
            r12 = r27
            m2714(r6, r7, r8, r9, r11, r12)     // Catch: java.lang.Throwable -> L21
            r2 = r23
            m2704(r8, r2)     // Catch: java.lang.Throwable -> L21
            long r6 = m2702(r2)     // Catch: java.lang.Throwable -> L21
            goto L91
        L7c:
            r2 = r23
            r7.getClass()     // Catch: java.lang.Throwable -> L21
            java.lang.String r11 = "im"
            r9 = 60000(0xea60, double:2.9644E-319)
            r6 = r20
            r12 = r27
            m2714(r6, r7, r8, r9, r11, r12)     // Catch: java.lang.Throwable -> L21
            long r6 = m2702(r8)     // Catch: java.lang.Throwable -> L21
        L91:
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L21
            r9 = 0
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 <= 0) goto L9c
            goto L9d
        L9c:
            r3 = r5
        L9d:
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r3 == 0) goto La6
        La1:
            long r9 = r3.longValue()     // Catch: java.lang.Throwable -> L21
            goto Lb4
        La6:
            java.lang.Long r3 = java.lang.Long.valueOf(r24)     // Catch: java.lang.Throwable -> L21
            int r9 = (r24 > r9 ? 1 : (r24 == r9 ? 0 : -1))
            if (r9 <= 0) goto Laf
            goto Lb0
        Laf:
            r3 = r5
        Lb0:
            if (r3 == 0) goto Lb3
            goto La1
        Lb3:
            r9 = r6
        Lb4:
            kf0 r3 = p000.kf0.f5887
            r11 = 1034147594(0x3da3d70a, float:0.08)
            r12 = 1051931443(0x3eb33333, float:0.35)
            r13 = 0
            r14 = 4
            if (r0 != r4) goto L108
            long r6 = r3.m3240(r9)     // Catch: java.lang.Throwable -> L21
            r15 = 10
            int r17 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r17 > 0) goto Lce
            r15 = 4
        Lcc:
            long r6 = r6 + r15
            goto Leb
        Lce:
            r17 = 20
            int r19 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r19 > 0) goto Ldb
            long r6 = r6 - r15
            r15 = 2
            long r6 = r6 / r15
            r15 = 14
            goto Lcc
        Ldb:
            r15 = 60
            int r15 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r15 > 0) goto Le9
            long r6 = r6 - r17
            r15 = 8
            long r6 = r6 / r15
            r15 = 19
            goto Lcc
        Le9:
            r6 = 22
        Leb:
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L21
            r7 = 22
            int r6 = p000.j81.m2906(r6, r14, r7)     // Catch: java.lang.Throwable -> L21
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L21
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L21
        Lf7:
            if (r13 >= r6) goto L142
            int r14 = r13 % 5
            float r14 = (float) r14     // Catch: java.lang.Throwable -> L21
            float r14 = r14 * r11
            float r14 = r14 + r12
            java.lang.Float r14 = java.lang.Float.valueOf(r14)     // Catch: java.lang.Throwable -> L21
            r7.add(r14)     // Catch: java.lang.Throwable -> L21
            int r13 = r13 + 1
            goto Lf7
        L108:
            boolean r15 = r26.isEmpty()     // Catch: java.lang.Throwable -> L21
            if (r15 != 0) goto L111
            r15 = r26
            goto L112
        L111:
            r15 = r5
        L112:
            if (r15 != 0) goto L141
            long r6 = r9 / r6
            r15 = 1
            int r17 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r17 >= 0) goto L11d
            r6 = r15
        L11d:
            long r14 = (long) r14     // Catch: java.lang.Throwable -> L21
            long r6 = r6 * r14
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L21
            r7 = 12
            int r6 = java.lang.Math.max(r7, r6)     // Catch: java.lang.Throwable -> L21
            r7 = 80
            if (r6 <= r7) goto L12b
            r6 = r7
        L12b:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L21
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L21
        L130:
            if (r13 >= r6) goto L142
            int r14 = r13 % 5
            float r14 = (float) r14     // Catch: java.lang.Throwable -> L21
            float r14 = r14 * r11
            float r14 = r14 + r12
            java.lang.Float r14 = java.lang.Float.valueOf(r14)     // Catch: java.lang.Throwable -> L21
            r7.add(r14)     // Catch: java.lang.Throwable -> L21
            int r13 = r13 + 1
            goto L130
        L141:
            r7 = r15
        L142:
            if (r0 != r4) goto L145
            r8 = r2
        L145:
            java.lang.String r2 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L21
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r6.<init>()     // Catch: java.lang.Throwable -> L21
            java.lang.String r11 = "voice replaced file="
            r6.append(r11)     // Catch: java.lang.Throwable -> L21
            r6.append(r2)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = ", duration="
            r6.append(r2)     // Catch: java.lang.Throwable -> L21
            r6.append(r9)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L21
            p000.C0888ux.m5975(r1, r2)     // Catch: java.lang.Throwable -> L21
            cb2 r2 = new cb2     // Catch: java.lang.Throwable -> L21
            r2.<init>(r8, r9, r7)     // Catch: java.lang.Throwable -> L21
            if (r0 != r4) goto L189
            java.util.concurrent.ConcurrentHashMap r0 = p000.ib2.f4987     // Catch: java.lang.Throwable -> L21
            java.lang.String r4 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L21
            wa2 r6 = new wa2     // Catch: java.lang.Throwable -> L21
            long r11 = r3.m3240(r9)     // Catch: java.lang.Throwable -> L21
            r6.<init>(r11, r7)     // Catch: java.lang.Throwable -> L21
            r0.put(r4, r6)     // Catch: java.lang.Throwable -> L21
            java.lang.String r0 = "comment-replacement"
            m2732(r0, r8, r9, r7)     // Catch: java.lang.Throwable -> L21
            goto L189
        L184:
            eo1 r2 = new eo1
            r2.<init>(r0)
        L189:
            java.lang.Throwable r0 = p000.fo1.m2190(r2)
            if (r0 == 0) goto L1a1
            java.lang.String r3 = "build replacement failed"
            p000.C0888ux.m5977(r1, r3, r0)
            ka2 r1 = new ka2
            r3 = 1
            r6 = r20
            r1.<init>(r6, r3, r0)
            android.os.Handler r0 = p000.ib2.f4982
            r0.post(r1)
        L1a1:
            boolean r0 = r2 instanceof p000.eo1
            if (r0 == 0) goto L1a6
            goto L1a7
        L1a6:
            r5 = r2
        L1a7:
            cb2 r5 = (p000.cb2) r5
            return r5
    }

    /* JADX INFO: renamed from: η */
    public static byte[] m2721(java.nio.ByteBuffer r6, android.media.MediaCodec.BufferInfo r7, p000.da1 r8) {
            java.nio.ByteBuffer r6 = r6.duplicate()
            int r0 = r7.offset
            r6.position(r0)
            int r0 = r7.offset
            int r7 = r7.size
            int r0 = r0 + r7
            r6.limit(r0)
            java.nio.ByteBuffer r6 = r6.duplicate()
            java.nio.ByteOrder r7 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r6 = r6.order(r7)
            int r0 = r6.remaining()
            int r1 = r8.f3017
            int r0 = r0 % r1
            if (r0 != 0) goto Ld7
            da1 r0 = p000.da1.f3012
            if (r8 != r0) goto L32
            int r7 = r6.remaining()
            byte[] r7 = new byte[r7]
            r6.get(r7)
            return r7
        L32:
            int r0 = r6.remaining()
            int r0 = r0 / r1
            int r1 = r0 * 2
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteBuffer r7 = r1.order(r7)
            r1 = 0
            r2 = r1
        L43:
            if (r2 >= r0) goto Lcf
            int r3 = r8.ordinal()
            if (r3 == 0) goto Lbd
            r4 = 1
            if (r3 == r4) goto Lb8
            r4 = 2
            if (r3 == r4) goto L95
            r4 = 3
            if (r3 == r4) goto L8e
            r4 = 4
            if (r3 != r4) goto L89
            float r3 = r6.getFloat()
            float r4 = java.lang.Math.abs(r3)
            r5 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L87
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = p000.j81.m2905(r3, r4, r5)
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            r5 = 32767(0x7fff, float:4.5916E-41)
            if (r4 < 0) goto L78
            float r4 = (float) r5
        L76:
            float r3 = r3 * r4
            goto L7b
        L78:
            r4 = 1191182336(0x47000000, float:32768.0)
            goto L76
        L7b:
            int r3 = p000.jx0.m3061(r3)
            r4 = -32768(0xffffffffffff8000, float:NaN)
            int r3 = p000.j81.m2906(r3, r4, r5)
        L85:
            short r3 = (short) r3
            goto Lc8
        L87:
            r3 = r1
            goto Lc8
        L89:
            p000.C1080.m7272()
            r6 = 0
            return r6
        L8e:
            int r3 = r6.getInt()
            int r3 = r3 >> 16
            goto L85
        L95:
            byte r3 = r6.get()
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r4 = r6.get()
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r3 = r3 | r4
            byte r4 = r6.get()
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r3 = r3 | r4
            r4 = 8388608(0x800000, float:1.1754944E-38)
            r4 = r4 & r3
            if (r4 == 0) goto Lb5
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r3 | r4
        Lb5:
            int r3 = r3 >> 8
            goto L85
        Lb8:
            short r3 = r6.getShort()
            goto Lc8
        Lbd:
            byte r3 = r6.get()
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            int r3 = r3 << 8
            goto L85
        Lc8:
            r7.putShort(r3)
            int r2 = r2 + 1
            goto L43
        Lcf:
            byte[] r6 = r7.array()
            r6.getClass()
            return r6
        Ld7:
            int r6 = r6.remaining()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "PCM 数据不是完整采样: bytes="
            r7.<init>(r0)
            r7.append(r6)
            java.lang.String r6 = ", encoding="
            r7.append(r6)
            r7.append(r8)
            java.lang.String r6 = r7.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    /* JADX INFO: renamed from: θ */
    public static p000.ra2 m2722(java.lang.Class r7) {
            java.util.ArrayList r7 = m2718(r7)
            java.util.Iterator r0 = r7.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r2 = 1
            r1.setAccessible(r2)
            goto L8
        L19:
            java.util.Iterator r0 = r7.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()
            r3 = r1
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class<java.io.File> r4 = java.io.File.class
            java.lang.Class r3 = r3.getType()
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L1d
            goto L39
        L38:
            r1 = r2
        L39:
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            if (r1 != 0) goto L3e
            goto L90
        L3e:
            java.util.Iterator r0 = r7.iterator()
        L42:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L68
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.Class r5 = r4.getType()
            java.lang.Class r6 = java.lang.Long.TYPE
            boolean r5 = p000.ln0.m3626(r5, r6)
            if (r5 != 0) goto L69
            java.lang.Class r4 = r4.getType()
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto L42
            goto L69
        L68:
            r3 = r2
        L69:
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.util.Iterator r7 = r7.iterator()
        L6f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r0 = r7.next()
            r4 = r0
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.Class<java.util.List> r5 = java.util.List.class
            java.lang.Class r4 = r4.getType()
            boolean r4 = r5.isAssignableFrom(r4)
            if (r4 == 0) goto L6f
            goto L8a
        L89:
            r0 = r2
        L8a:
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            if (r3 != 0) goto L91
            if (r0 != 0) goto L91
        L90:
            return r2
        L91:
            ra2 r7 = new ra2
            r7.<init>(r1, r3, r0)
            return r7
    }

    /* JADX INFO: renamed from: ι */
    public static p000.bb2 m2723(java.lang.Class r7) {
            r0 = 0
            if (r7 != 0) goto L4
            goto L40
        L4:
            java.util.ArrayList r7 = m2718(r7)
            java.util.Iterator r1 = r7.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            r3 = 1
            r2.setAccessible(r3)
            goto Lc
        L1d:
            java.util.Iterator r1 = r7.iterator()
        L21:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class<java.io.File> r4 = java.io.File.class
            java.lang.Class r3 = r3.getType()
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L21
            goto L3c
        L3b:
            r2 = r0
        L3c:
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            if (r2 != 0) goto L41
        L40:
            return r0
        L41:
            java.util.Iterator r1 = r7.iterator()
        L45:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.Class r5 = r4.getType()
            java.lang.Class r6 = java.lang.Long.TYPE
            boolean r5 = p000.ln0.m3626(r5, r6)
            if (r5 != 0) goto L6c
            java.lang.Class r4 = r4.getType()
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto L45
            goto L6c
        L6b:
            r3 = r0
        L6c:
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.util.Iterator r7 = r7.iterator()
        L72:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r7.next()
            r4 = r1
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.Class<java.util.List> r5 = java.util.List.class
            java.lang.Class r4 = r4.getType()
            boolean r4 = r5.isAssignableFrom(r4)
            if (r4 == 0) goto L72
            r0 = r1
        L8c:
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            bb2 r7 = new bb2
            r7.<init>(r2, r3, r0)
            return r7
    }

    /* JADX INFO: renamed from: κ */
    public static java.lang.Object m2724(java.lang.Object[] r4) {
            if (r4 != 0) goto L3
            goto L15
        L3:
            int r0 = r4.length
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            r2 = r4[r1]
            if (r2 == 0) goto L12
            ab2 r3 = m2703(r2)
            if (r3 == 0) goto L12
            return r2
        L12:
            int r1 = r1 + 1
            goto L5
        L15:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: λ */
    public static void m2725(p000.k01 r25, p000.ya2 r26, java.lang.Object r27, java.lang.String r28) {
            r1 = r25
            r2 = r26
            r3 = r28
            ab2 r4 = m2703(r27)
            java.lang.String r5 = "skip "
            java.lang.String r6 = "rb360b99c73f2f647"
            if (r4 != 0) goto L1e
            java.lang.Class r0 = r27.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = " voice replace: voice info not recognized "
            p000.AbstractC0602nx.m4144(r5, r3, r1, r0, r6)
            return
        L1e:
            long r7 = r4.f181
            java.util.List r9 = r4.f182
            java.io.File r10 = r4.f180
            ya2 r11 = p000.ya2.f12542
            if (r2 != r11) goto La2
            long r12 = android.os.SystemClock.elapsedRealtime()
            java.util.concurrent.ConcurrentHashMap r0 = p000.ib2.f4988
            java.util.Set r14 = r0.entrySet()
            java.util.Iterator r14 = r14.iterator()
        L36:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L64
            java.lang.Object r15 = r14.next()
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15
            java.lang.Object r16 = r15.getKey()
            r17 = r4
            r4 = r16
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r15 = r15.getValue()
            java.lang.Number r15 = (java.lang.Number) r15
            long r15 = r15.longValue()
            int r18 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r18 >= 0) goto L61
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            r0.remove(r4, r15)
        L61:
            r4 = r17
            goto L36
        L64:
            r17 = r4
            java.lang.String r4 = r10.getAbsolutePath()
            java.lang.Object r4 = r0.get(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto La4
            long r14 = r4.longValue()
            int r4 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r4 >= 0) goto L82
            java.lang.String r4 = r10.getAbsolutePath()
            r0.remove(r4)
            goto La4
        L82:
            java.lang.String r0 = r10.getAbsolutePath()
            int r1 = r9.size()
            java.lang.String r2 = "pass through replaced IM voice path="
            java.lang.String r3 = ", duration="
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4137(r2, r0, r7, r3)
            java.lang.String r2 = ", waveSize="
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p000.C0888ux.m5975(r6, r0)
            return
        La2:
            r17 = r4
        La4:
            java.lang.Object r4 = r1.f5691
            boolean r0 = r4 instanceof android.app.Activity
            r12 = 0
            if (r0 == 0) goto Laf
            android.app.Activity r4 = (android.app.Activity) r4
        Lad:
            r0 = r4
            goto Lff
        Laf:
            java.lang.String r0 = "getActivity"
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r0 = p000.qe0.m4869(r4, r0, r14)     // Catch: java.lang.Throwable -> Lbe
            boolean r14 = r0 instanceof android.app.Activity     // Catch: java.lang.Throwable -> Lbe
            if (r14 == 0) goto Lc0
            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Throwable -> Lbe
            goto Lc8
        Lbe:
            r0 = move-exception
            goto Lc2
        Lc0:
            r0 = 0
            goto Lc8
        Lc2:
            eo1 r14 = new eo1
            r14.<init>(r0)
            r0 = r14
        Lc8:
            boolean r14 = r0 instanceof p000.eo1
            if (r14 == 0) goto Lcd
            r0 = 0
        Lcd:
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto Ld2
            goto Lff
        Ld2:
            java.lang.String r0 = "getContext"
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch: java.lang.Throwable -> Le1
            java.lang.Object r0 = p000.qe0.m4869(r4, r0, r14)     // Catch: java.lang.Throwable -> Le1
            boolean r4 = r0 instanceof android.content.Context     // Catch: java.lang.Throwable -> Le1
            if (r4 == 0) goto Le3
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> Le1
            goto Leb
        Le1:
            r0 = move-exception
            goto Le5
        Le3:
            r0 = 0
            goto Leb
        Le5:
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        Leb:
            boolean r4 = r0 instanceof p000.eo1
            if (r4 == 0) goto Lf0
            r0 = 0
        Lf0:
            android.content.Context r0 = (android.content.Context) r0
            boolean r4 = r0 instanceof android.app.Activity
            if (r4 == 0) goto Lfa
            r4 = r0
            android.app.Activity r4 = (android.app.Activity) r4
            goto Lad
        Lfa:
            android.app.Activity r4 = p000.AbstractC0378i.m2546()
            goto Lad
        Lff:
            if (r0 != 0) goto L116
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r3)
            java.lang.String r1 = " voice replace: activity not found"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p000.C0888ux.m5975(r6, r0)
            return
        L116:
            boolean r4 = p000.AbstractC0976x9.m6538()
            if (r4 == 0) goto L236
            boolean r4 = com.example.dyhelper.beta.BetaNativeBridge.m1295()
            if (r4 == 0) goto L236
            java.lang.String r4 = "voice_replace_enabled"
            boolean r4 = p000.ui1.m5887(r4, r12)
            if (r4 != 0) goto L12c
            goto L236
        L12c:
            java.util.ArrayList r4 = m2731()
            boolean r4 = r4.isEmpty()
            java.lang.String r14 = "voice_replace_confirm_before_send"
            java.lang.String r15 = "voice_replace_mode"
            r13 = 1
            if (r4 == 0) goto L154
            android.content.SharedPreferences r4 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L144
            int r4 = r4.getInt(r15, r12)     // Catch: java.lang.Throwable -> L144
            goto L145
        L144:
            r4 = r12
        L145:
            if (r4 != 0) goto L14f
            boolean r4 = p000.ui1.m5887(r14, r13)
            if (r4 == 0) goto L14f
            r4 = r13
            goto L150
        L14f:
            r4 = r12
        L150:
            if (r4 != 0) goto L154
            goto L236
        L154:
            java.lang.String r4 = "voice_replace_scope"
            android.content.SharedPreferences r13 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L160
            int r4 = r13.getInt(r4, r12)     // Catch: java.lang.Throwable -> L160
        L15e:
            r13 = 1
            goto L162
        L160:
            r4 = r12
            goto L15e
        L162:
            if (r4 == r13) goto L16b
            r13 = 2
            if (r4 == r13) goto L168
            goto L16f
        L168:
            if (r2 != r11) goto L236
            goto L16f
        L16b:
            ya2 r4 = p000.ya2.f12541
            if (r2 != r4) goto L236
        L16f:
            java.lang.String r4 = "-original"
            java.lang.String r4 = r3.concat(r4)
            m2732(r4, r10, r7, r9)
            kf0 r13 = r2.f12544
            long r4 = r13.m3241(r7)
            r19 = r0
            android.content.SharedPreferences r0 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L189
            int r0 = r0.getInt(r15, r12)     // Catch: java.lang.Throwable -> L189
            goto L18a
        L189:
            r0 = r12
        L18a:
            if (r0 != 0) goto L194
            r0 = 1
            boolean r14 = p000.ui1.m5887(r14, r0)
            if (r14 == 0) goto L194
            r12 = r0
        L194:
            if (r12 == 0) goto L1ee
            java.lang.reflect.Executable r0 = r1.f5690
            boolean r7 = r0 instanceof java.lang.reflect.Method
            if (r7 == 0) goto L1a1
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r20 = r0
            goto L1a3
        L1a1:
            r20 = 0
        L1a3:
            if (r20 != 0) goto L1a7
            goto L235
        L1a7:
            java.lang.Object r7 = r1.f5691
            java.lang.Object[] r0 = r1.f5692
            if (r0 != 0) goto L1af
            goto L235
        L1af:
            int r8 = r0.length
            java.lang.Object[] r22 = java.util.Arrays.copyOf(r0, r8)
            r8 = 0
            r1.m3107(r8)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "show "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = " voice replace confirm"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p000.C0888ux.m5975(r6, r0)
            na2 r0 = new na2
            r3 = r17
            r1 = r19
            r6 = r20
            r8 = r22
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            r21 = r7
            v8 r18 = new v8
            r24 = 8
            r23 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r0 = r18
            android.os.Handler r1 = p000.ib2.f4982
            r1.post(r0)
            goto L235
        L1ee:
            r12 = r17
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "auto replace "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = " voice"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p000.C0888ux.m5975(r6, r0)
            java.util.ArrayList r0 = m2731()
            java.lang.Object r0 = p000.AbstractC0984xh.m6640(r0)
            r2 = r0
            qa2 r2 = (p000.qa2) r2
            if (r2 != 0) goto L214
            goto L235
        L214:
            long r4 = r13.m3241(r7)
            hu1 r7 = new hu1
            r0 = 8
            r7.<init>(r0)
            r1 = r26
            r6 = r9
            r3 = r10
            r0 = r19
            cb2 r0 = m2720(r0, r1, r2, r3, r4, r6, r7)
            r2 = r1
            if (r0 != 0) goto L22d
            goto L235
        L22d:
            r12.m55(r0, r13)
            if (r2 != r11) goto L235
            m2733(r0)
        L235:
            return
        L236:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r3)
            java.lang.String r1 = " voice replace: disabled or no audio"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p000.C0888ux.m5975(r6, r0)
            return
    }

    /* JADX INFO: renamed from: μ */
    public static void m2726(java.lang.reflect.Method r12, p000.p70 r13) {
            java.lang.String r0 = p000.lz1.m3694(r12)
            java.lang.String r1 = r12.getName()
            java.lang.String r2 = p000.lz1.m3690(r1, r12)
            java.lang.Class[] r3 = r12.getParameterTypes()
            r3.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r3.length
            r4.<init>(r5)
            int r5 = r3.length
            r6 = 0
        L1b:
            r11 = 1
            if (r6 >= r5) goto L25
            r7 = r3[r6]
            int r6 = p000.lz1.m3679(r7, r4, r6, r11)
            goto L1b
        L25:
            int r3 = r12.getModifiers()
            java.lang.reflect.Modifier.isStatic(r3)
            r9 = 0
            r10 = 62
            java.lang.String r5 = ","
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r3 = p000.AbstractC0984xh.m6644(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r4 = "("
            java.lang.String r5 = "#"
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4138(r0, r5, r1, r4, r3)
            java.lang.String r1 = "):"
            java.lang.String r1 = p000.lz1.m3691(r0, r1, r2)
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = p000.ib2.f4986
            boolean r0 = r2.add(r1)
            if (r0 != 0) goto L4f
            goto L9f
        L4f:
            r12.setAccessible(r11)     // Catch: java.lang.Throwable -> L5f
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r13 = r13.invoke()     // Catch: java.lang.Throwable -> L5f
            m01 r13 = (p000.m01) r13     // Catch: java.lang.Throwable -> L5f
            l01 r13 = r0.m6775(r12, r13)     // Catch: java.lang.Throwable -> L5f
            goto L67
        L5f:
            r0 = move-exception
            r13 = r0
            eo1 r0 = new eo1
            r0.<init>(r13)
            r13 = r0
        L67:
            boolean r0 = r13 instanceof p000.eo1
            java.lang.String r3 = "rb360b99c73f2f647"
            if (r0 != 0) goto L81
            r0 = r13
            l01 r0 = (p000.l01) r0
            java.lang.Class r0 = r12.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = r12.getName()
            java.lang.String r6 = "hooked "
            p000.AbstractC0602nx.m4144(r6, r0, r5, r4, r3)
        L81:
            java.lang.Throwable r13 = p000.fo1.m2190(r13)
            if (r13 == 0) goto L9f
            r2.remove(r1)
            java.lang.Class r0 = r12.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r12 = r12.getName()
            java.lang.String r1 = "hook failed "
            java.lang.String r12 = p000.a12.m18(r1, r0, r5, r12)
            p000.C0888ux.m5977(r3, r12, r13)
        L9f:
            return
    }

    /* JADX INFO: renamed from: σ */
    public static void m2727(java.lang.Object r3, java.lang.reflect.Method r4, java.lang.Object[] r5) {
            f3 r0 = p000.ib2.f4989
            java.lang.Object r1 = r0.get()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto Lf
            int r1 = r1.intValue()
            goto L10
        Lf:
            r1 = 0
        L10:
            int r2 = r1 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.set(r2)
            xq0 r2 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = r2.m6776(r4, r3, r5)     // Catch: java.lang.Throwable -> L20
            goto L27
        L20:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L27:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L34
            java.lang.String r4 = "rb360b99c73f2f647"
            java.lang.String r5 = "invoke original voice method failed"
            p000.C0888ux.m5977(r4, r5, r3)
        L34:
            if (r1 != 0) goto L3a
            r0.remove()
            goto L41
        L3a:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r0.set(r3)
        L41:
            return
    }

    /* JADX INFO: renamed from: τ */
    public static boolean m2728() {
            f3 r0 = p000.ib2.f4989
            java.lang.Object r0 = r0.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1 = 0
            if (r0 == 0) goto L10
            int r0 = r0.intValue()
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 <= 0) goto L15
            r0 = 1
            return r0
        L15:
            return r1
    }

    /* JADX INFO: renamed from: υ */
    public static boolean m2729(java.lang.reflect.Method r6) {
            java.lang.Class r0 = r6.getDeclaringClass()
            boolean r0 = r0.isInterface()
            r1 = 0
            if (r0 == 0) goto Ld
            goto L91
        Ld:
            int r0 = r6.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 == 0) goto L19
            goto L91
        L19:
            int r0 = r6.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isNative(r0)
            if (r0 == 0) goto L25
            goto L91
        L25:
            java.lang.Class r0 = r6.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 != 0) goto L32
            goto L91
        L32:
            java.lang.Class[] r0 = r6.getParameterTypes()
            r0.getClass()
            int r0 = r0.length
            if (r0 != 0) goto L3d
            goto L91
        L3d:
            java.lang.Class[] r0 = r6.getParameterTypes()
            int r0 = r0.length
            r2 = 3
            if (r0 <= r2) goto L46
            goto L91
        L46:
            java.lang.Class[] r0 = r6.getParameterTypes()
            int r0 = r0.length
            r2 = 2
            r3 = 1
            if (r0 != r2) goto L72
            java.lang.Class[] r0 = r6.getParameterTypes()
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = "~78B71E7541C477E838C50BCD302E054C40CC02248AA0B9F3FD7D96E48E5395705804FE3D36452620E7FC53FD8B9A95157A99FAA773CE660D7C7738560C6110F6C94E186A484AA44D"
            java.lang.String r2 = p000.jf0.m2957(r2)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L72
            java.lang.Class[] r0 = r6.getParameterTypes()
            r0 = r0[r3]
            bb2 r0 = m2723(r0)
            if (r0 == 0) goto L72
            goto L8d
        L72:
            java.lang.Class[] r0 = r6.getParameterTypes()
            r0.getClass()
            int r2 = r0.length
            r4 = r1
        L7b:
            if (r4 >= r2) goto L91
            r5 = r0[r4]
            bb2 r5 = m2723(r5)
            if (r5 == 0) goto L8e
            int r6 = m2708(r6)
            r0 = 900(0x384, float:1.261E-42)
            if (r6 < r0) goto L91
        L8d:
            return r3
        L8e:
            int r4 = r4 + 1
            goto L7b
        L91:
            return r1
    }

    /* JADX INFO: renamed from: φ */
    public static boolean m2730(java.lang.reflect.Method r6) {
            java.lang.Class r0 = r6.getDeclaringClass()
            boolean r0 = r0.isInterface()
            r1 = 0
            if (r0 == 0) goto Ld
            goto L91
        Ld:
            int r0 = r6.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 == 0) goto L19
            goto L91
        L19:
            int r0 = r6.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isNative(r0)
            if (r0 == 0) goto L25
            goto L91
        L25:
            java.lang.Class r0 = r6.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 != 0) goto L32
            goto L91
        L32:
            java.lang.Class[] r0 = r6.getParameterTypes()
            r0.getClass()
            int r0 = r0.length
            if (r0 != 0) goto L3d
            goto L91
        L3d:
            java.lang.Class[] r0 = r6.getParameterTypes()
            int r0 = r0.length
            r2 = 4
            if (r0 <= r2) goto L46
            goto L91
        L46:
            java.lang.Class[] r0 = r6.getParameterTypes()
            int r0 = r0.length
            r2 = 2
            r3 = 1
            if (r0 != r2) goto L72
            java.lang.Class[] r0 = r6.getParameterTypes()
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = "~789F9198A9AE6768B1E75F22FE4AFF5FB8139FFB2E3E8ED9059A4B8CF38A7C966955DCB17D901708EC38BEC31F5673DC6814DF5F607943847446CE2B584C33D3A13A"
            java.lang.String r2 = p000.jf0.m2957(r2)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L72
            java.lang.Class[] r0 = r6.getParameterTypes()
            r0 = r0[r3]
            bb2 r0 = m2723(r0)
            if (r0 == 0) goto L72
            goto L8d
        L72:
            java.lang.Class[] r0 = r6.getParameterTypes()
            r0.getClass()
            int r2 = r0.length
            r4 = r1
        L7b:
            if (r4 >= r2) goto L91
            r5 = r0[r4]
            bb2 r5 = m2723(r5)
            if (r5 == 0) goto L8e
            int r6 = m2709(r6)
            r0 = 800(0x320, float:1.121E-42)
            if (r6 < r0) goto L91
        L8d:
            return r3
        L8e:
            int r4 = r4 + 1
            goto L7b
        L91:
            return r1
    }

    /* JADX INFO: renamed from: χ */
    public static java.util.ArrayList m2731() {
            java.lang.String r1 = ""
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r0 = "voice_replace_audio_list"
            java.lang.String r0 = p000.ui1.m5893(r0, r1)     // Catch: java.lang.Throwable -> L54
            boolean r3 = p000.q02.m4671(r0)     // Catch: java.lang.Throwable -> L54
            if (r3 != 0) goto L69
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L54
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L54
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L54
            r4 = 0
        L1d:
            if (r4 >= r0) goto L69
            org.json.JSONObject r5 = r3.optJSONObject(r4)     // Catch: java.lang.Throwable -> L54
            if (r5 != 0) goto L26
            goto L66
        L26:
            java.lang.String r6 = "uri"
            java.lang.String r10 = r5.optString(r6)     // Catch: java.lang.Throwable -> L54
            r10.getClass()     // Catch: java.lang.Throwable -> L54
            boolean r6 = p000.q02.m4671(r10)     // Catch: java.lang.Throwable -> L54
            if (r6 != 0) goto L66
            java.lang.String r6 = "id"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L54
            boolean r7 = p000.q02.m4671(r6)     // Catch: java.lang.Throwable -> L54
            if (r7 == 0) goto L43
            r8 = r10
            goto L44
        L43:
            r8 = r6
        L44:
            java.lang.String r6 = "name"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L54
            boolean r7 = p000.q02.m4671(r6)     // Catch: java.lang.Throwable -> L54
            if (r7 == 0) goto L52
            java.lang.String r6 = "未命名音频"
        L52:
            r9 = r6
            goto L56
        L54:
            r0 = move-exception
            goto L6c
        L56:
            java.lang.String r6 = "durationMs"
            r11 = 0
            long r11 = r5.optLong(r6, r11)     // Catch: java.lang.Throwable -> L54
            qa2 r7 = new qa2     // Catch: java.lang.Throwable -> L54
            r7.<init>(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L54
            r2.add(r7)     // Catch: java.lang.Throwable -> L54
        L66:
            int r4 = r4 + 1
            goto L1d
        L69:
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L54
            goto L72
        L6c:
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L72:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L7f
            java.lang.String r3 = "rb360b99c73f2f647"
            java.lang.String r4 = "load voice audio list failed"
            p000.C0888ux.m5977(r3, r4, r0)
        L7f:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lae
            java.lang.String r0 = "voice_replace_mp3_uri"
            java.lang.String r4 = p000.ui1.m5893(r0, r1)
            boolean r0 = p000.q02.m4671(r4)
            if (r0 != 0) goto Lae
            java.lang.String r0 = "voice_replace_mp3_name"
            java.lang.String r0 = p000.ui1.m5893(r0, r1)
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto L9f
            java.lang.String r0 = "已选择 MP3"
        L9f:
            r5 = r0
            qa2 r3 = new qa2
            r7 = 0
            r6 = r4
            r3.<init>(r4, r5, r6, r7)
            r2.add(r3)
            m2707(r2)
        Lae:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
        Lbc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Ld5
            java.lang.Object r3 = r2.next()
            r4 = r3
            qa2 r4 = (p000.qa2) r4
            java.lang.String r4 = r4.f8945
            boolean r4 = r0.add(r4)
            if (r4 == 0) goto Lbc
            r1.add(r3)
            goto Lbc
        Ld5:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ψ */
    public static void m2732(java.lang.String r14, java.io.File r15, long r16, java.util.List r18) {
            java.lang.String r1 = "rb360b99c73f2f647"
            java.lang.String r2 = "probe "
            long r3 = m2702(r15)     // Catch: java.lang.Throwable -> L87
            java.lang.Class r0 = r15.getClass()     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L87
            java.lang.String r5 = r15.getAbsolutePath()     // Catch: java.lang.Throwable -> L87
            java.lang.String r6 = r15.getName()     // Catch: java.lang.Throwable -> L87
            boolean r7 = r15.exists()     // Catch: java.lang.Throwable -> L87
            long r8 = r15.length()     // Catch: java.lang.Throwable -> L87
            int r10 = r18.size()     // Catch: java.lang.Throwable -> L87
            r11 = 6
            r12 = r18
            java.util.List r11 = p000.AbstractC0984xh.m6662(r12, r11)     // Catch: java.lang.Throwable -> L87
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L87
            r12.<init>(r2)     // Catch: java.lang.Throwable -> L87
            r12.append(r14)     // Catch: java.lang.Throwable -> L87
            java.lang.String r13 = " classFile="
            r12.append(r13)     // Catch: java.lang.Throwable -> L87
            r12.append(r0)     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = ", path="
            r12.append(r0)     // Catch: java.lang.Throwable -> L87
            r12.append(r5)     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = ", name="
            r12.append(r0)     // Catch: java.lang.Throwable -> L87
            r12.append(r6)     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = ", exists="
            r12.append(r0)     // Catch: java.lang.Throwable -> L87
            r12.append(r7)     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = ", size="
            r12.append(r0)     // Catch: java.lang.Throwable -> L87
            r12.append(r8)     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = ", recordDuration="
            r12.append(r0)     // Catch: java.lang.Throwable -> L87
            r5 = r16
            r12.append(r5)     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = ", metaDuration="
            r12.append(r0)     // Catch: java.lang.Throwable -> L87
            r12.append(r3)     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = ", waveSize="
            r12.append(r0)     // Catch: java.lang.Throwable -> L87
            r12.append(r10)     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = ", waveHead="
            r12.append(r0)     // Catch: java.lang.Throwable -> L87
            r12.append(r11)     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = r12.toString()     // Catch: java.lang.Throwable -> L87
            p000.C0888ux.m5975(r1, r0)     // Catch: java.lang.Throwable -> L87
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L87
            goto L8e
        L87:
            r0 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r0)
            r0 = r3
        L8e:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto La8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r3.append(r14)
            java.lang.String r14 = " failed"
            r3.append(r14)
            java.lang.String r14 = r3.toString()
            p000.C0888ux.m5977(r1, r14, r0)
        La8:
            return
    }

    /* JADX INFO: renamed from: ω */
    public static void m2733(p000.cb2 r5) {
            java.io.File r0 = r5.f2057
            java.lang.String r0 = r0.getAbsolutePath()
            long r1 = android.os.SystemClock.elapsedRealtime()
            r3 = 30000(0x7530, double:1.4822E-319)
            long r1 = r1 + r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.util.concurrent.ConcurrentHashMap r2 = p000.ib2.f4988
            r2.put(r0, r1)
            java.io.File r0 = r5.f2057
            long r1 = r5.f2058
            java.util.List r5 = r5.f2059
            java.lang.String r3 = "im-replacement"
            m2732(r3, r0, r1, r5)
            return
    }

    /* JADX INFO: renamed from: Ε */
    public final java.util.List m2734(java.lang.ClassLoader r22) {
            r21 = this;
            r0 = r22
            java.lang.Object r1 = p000.C0666ox.f8297
            kx r1 = p000.EnumC0491kx.f6290
            java.util.List r1 = p000.C0666ox.m4323(r1, r0)
            java.lang.String r2 = "):"
            java.lang.String r3 = "("
            java.lang.String r4 = "#"
            r6 = 1
            if (r1 == 0) goto Lbc
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L1b
            goto Lbc
        L1b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L24:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L3b
            java.lang.Object r7 = r1.next()
            r8 = r7
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            boolean r8 = m2730(r8)
            if (r8 == 0) goto L24
            r0.add(r7)
            goto L24
        L3b:
            java.util.Iterator r1 = r0.iterator()
        L3f:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L4f
            java.lang.Object r7 = r1.next()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            r7.setAccessible(r6)
            goto L3f
        L4f:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r0.iterator()
        L5d:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto Lbb
            java.lang.Object r8 = r0.next()
            r9 = r8
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.String r10 = p000.lz1.m3694(r9)
            java.lang.String r11 = r9.getName()
            java.lang.String r12 = p000.lz1.m3690(r11, r9)
            java.lang.Class[] r13 = r9.getParameterTypes()
            r13.getClass()
            java.util.ArrayList r14 = new java.util.ArrayList
            int r15 = r13.length
            r14.<init>(r15)
            int r15 = r13.length
            r5 = 0
        L85:
            if (r5 >= r15) goto L92
            r21 = r0
            r0 = r13[r5]
            int r5 = p000.lz1.m3679(r0, r14, r5, r6)
            r0 = r21
            goto L85
        L92:
            r21 = r0
            int r0 = r9.getModifiers()
            java.lang.reflect.Modifier.isStatic(r0)
            r19 = 0
            r20 = 62
            java.lang.String r15 = ","
            r16 = 0
            r17 = 0
            r18 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r14, r15, r16, r17, r18, r19, r20)
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4138(r10, r4, r11, r3, r0)
            boolean r0 = p000.lz1.m3673(r0, r2, r12, r1)
            if (r0 == 0) goto Lb8
            r7.add(r8)
        Lb8:
            r0 = r21
            goto L5d
        Lbb:
            return r7
        Lbc:
            java.lang.String r1 = "~78B71E7541C477E838C50BCD302E054C40CC02248AA0B9F3FD7794A78143886D1800F82A71492D2EFEBF50F69EC092027CD8E9B672D52762657C36503D2A32ECDF4324524659B85D"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String r5 = "~78A74DB286A5B58D592E394EF41C63DE20BC788EDC43993D9FEA5AB5AF6D50AFD0F0A8F194EEE1D726145FD213361DB182A777A0AE8B08F4F88BB26292D31FE70F2128D25D9DD7C430B16F76"
            java.lang.String r5 = p000.jf0.m2957(r5)
            java.lang.String r7 = "~796C0BCB62BCE6FE82C87A254D6EEBA7FF748413BC384A314027F4FDD0319181261306E8D79B9D665CEFDE51625B554792EFFB41899CEB9C050D6E42C136"
            java.lang.String r7 = p000.jf0.m2957(r7)
            java.lang.String[] r1 = new java.lang.String[]{r1, r5, r7}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        Ldf:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto Lf5
            java.lang.Object r7 = r1.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Class r7 = p000.qe0.m4877(r0, r7)
            if (r7 == 0) goto Ldf
            r5.add(r7)
            goto Ldf
        Lf5:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r5.iterator()
        Lfe:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L14b
            java.lang.Object r5 = r1.next()
            java.lang.Class r5 = (java.lang.Class) r5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.reflect.Method[] r8 = r5.getDeclaredMethods()
            r8.getClass()
            p000.AbstractC0984xh.m6659(r7, r8)
            java.util.ArrayList r5 = m2719(r5)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r5 = r5.iterator()
        L126:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L144
            java.lang.Object r9 = r5.next()
            java.lang.Class r9 = (java.lang.Class) r9
            java.lang.reflect.Method[] r9 = r9.getDeclaredMethods()
            r9.getClass()
            java.util.List r9 = java.util.Arrays.asList(r9)
            r9.getClass()
            p000.AbstractC0984xh.m6660(r8, r9)
            goto L126
        L144:
            p000.AbstractC0984xh.m6660(r7, r8)
            p000.AbstractC0984xh.m6660(r0, r7)
            goto Lfe
        L14b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L154:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L16b
            java.lang.Object r5 = r0.next()
            r7 = r5
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            boolean r7 = m2730(r7)
            if (r7 == 0) goto L154
            r1.add(r5)
            goto L154
        L16b:
            qy1 r0 = new qy1
            r5 = 10
            r7 = r21
            r0.<init>(r7, r5)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r1, r0)
            java.util.Iterator r1 = r0.iterator()
        L17c:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L18c
            java.lang.Object r5 = r1.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r5.setAccessible(r6)
            goto L17c
        L18c:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L19a:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L1f7
            java.lang.Object r7 = r0.next()
            r8 = r7
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.String r9 = p000.lz1.m3694(r8)
            java.lang.String r10 = r8.getName()
            java.lang.String r11 = p000.lz1.m3690(r10, r8)
            java.lang.Class[] r12 = r8.getParameterTypes()
            r12.getClass()
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = r12.length
            r13.<init>(r14)
            int r14 = r12.length
            r15 = 0
        L1c2:
            if (r15 >= r14) goto L1cf
            r21 = r0
            r0 = r12[r15]
            int r15 = p000.lz1.m3679(r0, r13, r15, r6)
            r0 = r21
            goto L1c2
        L1cf:
            r21 = r0
            int r0 = r8.getModifiers()
            java.lang.reflect.Modifier.isStatic(r0)
            r18 = 0
            r19 = 62
            java.lang.String r14 = ","
            r15 = 0
            r16 = 0
            r17 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r13, r14, r15, r16, r17, r18, r19)
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4138(r9, r4, r10, r3, r0)
            boolean r0 = p000.lz1.m3673(r0, r2, r11, r1)
            if (r0 == 0) goto L1f4
            r5.add(r7)
        L1f4:
            r0 = r21
            goto L19a
        L1f7:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L1fe
            return r5
        L1fe:
            jz r0 = p000.C0450jz.f5672
            return r0
    }

    /* JADX INFO: renamed from: ν */
    public final void m2735(java.lang.ClassLoader r10) {
            r9 = this;
            java.lang.String r0 = "rb360b99c73f2f647"
            java.lang.Object r1 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F97DDE8AB94312851DBF90DE22E29AC5FA85873739BB209E3F8E8F8E"
            java.lang.String r1 = p000.jf0.m2957(r1)     // Catch: java.lang.Throwable -> L17
            java.lang.Class r10 = p000.qe0.m4877(r10, r1)     // Catch: java.lang.Throwable -> L17
            if (r10 != 0) goto L1a
            java.lang.String r9 = "comment audio event hook target not found"
            p000.C0888ux.m5975(r0, r9)     // Catch: java.lang.Throwable -> L17
            goto Lb0
        L17:
            r9 = move-exception
            goto Lb3
        L1a:
            java.lang.reflect.Method[] r10 = r10.getDeclaredMethods()     // Catch: java.lang.Throwable -> L17
            r10.getClass()     // Catch: java.lang.Throwable -> L17
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L17
            r1.<init>()     // Catch: java.lang.Throwable -> L17
            int r2 = r10.length     // Catch: java.lang.Throwable -> L17
            r3 = 0
            r4 = r3
        L29:
            r5 = 1
            if (r4 >= r2) goto L73
            r6 = r10[r4]     // Catch: java.lang.Throwable -> L17
            int r7 = r6.getModifiers()     // Catch: java.lang.Throwable -> L17
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)     // Catch: java.lang.Throwable -> L17
            if (r7 == 0) goto L70
            int r7 = r6.getModifiers()     // Catch: java.lang.Throwable -> L17
            boolean r7 = java.lang.reflect.Modifier.isAbstract(r7)     // Catch: java.lang.Throwable -> L17
            if (r7 != 0) goto L70
            int r7 = r6.getModifiers()     // Catch: java.lang.Throwable -> L17
            boolean r7 = java.lang.reflect.Modifier.isNative(r7)     // Catch: java.lang.Throwable -> L17
            if (r7 != 0) goto L70
            java.lang.Class r7 = r6.getReturnType()     // Catch: java.lang.Throwable -> L17
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L17
            boolean r7 = p000.ln0.m3626(r7, r8)     // Catch: java.lang.Throwable -> L17
            if (r7 == 0) goto L70
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L17
            int r7 = r7.length     // Catch: java.lang.Throwable -> L17
            if (r7 != r5) goto L70
            java.lang.Class[] r5 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L17
            r5 = r5[r3]     // Catch: java.lang.Throwable -> L17
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            boolean r5 = p000.ln0.m3626(r5, r7)     // Catch: java.lang.Throwable -> L17
            if (r5 == 0) goto L70
            r1.add(r6)     // Catch: java.lang.Throwable -> L17
        L70:
            int r4 = r4 + 1
            goto L29
        L73:
            java.util.Iterator r10 = r1.iterator()     // Catch: java.lang.Throwable -> L17
        L77:
            boolean r2 = r10.hasNext()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L87
            java.lang.Object r2 = r10.next()     // Catch: java.lang.Throwable -> L17
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L17
            r2.setAccessible(r5)     // Catch: java.lang.Throwable -> L17
            goto L77
        L87:
            boolean r10 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r10 == 0) goto L93
            java.lang.String r9 = "comment audio event hook method not found"
            p000.C0888ux.m5975(r0, r9)     // Catch: java.lang.Throwable -> L17
            goto Lb0
        L93:
            java.util.Iterator r10 = r1.iterator()     // Catch: java.lang.Throwable -> L17
        L97:
            boolean r1 = r10.hasNext()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto Lb0
            java.lang.Object r1 = r10.next()     // Catch: java.lang.Throwable -> L17
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L17
            r1.getClass()     // Catch: java.lang.Throwable -> L17
            ia2 r2 = new ia2     // Catch: java.lang.Throwable -> L17
            r3 = 2
            r2.<init>(r9, r3)     // Catch: java.lang.Throwable -> L17
            m2726(r1, r2)     // Catch: java.lang.Throwable -> L17
            goto L97
        Lb0:
            s62 r9 = p000.s62.f9751     // Catch: java.lang.Throwable -> L17
            goto Lb9
        Lb3:
            eo1 r10 = new eo1
            r10.<init>(r9)
            r9 = r10
        Lb9:
            java.lang.Throwable r9 = p000.fo1.m2190(r9)
            if (r9 == 0) goto Lc4
            java.lang.String r10 = "install comment audio event hook failed"
            p000.C0888ux.m5977(r0, r10, r9)
        Lc4:
            return
    }

    /* JADX INFO: renamed from: ξ */
    public final void m2736(java.lang.ClassLoader r6) {
            r5 = this;
            java.lang.String r0 = "rb360b99c73f2f647"
            java.util.List r1 = m2705(r5, r6)     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L22
            java.util.concurrent.atomic.AtomicBoolean r5 = p000.ib2.f4984     // Catch: java.lang.Throwable -> L1a
            boolean r5 = r5.get()     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L1c
            java.lang.String r5 = "legacy comment voice replace hook target not found, runtime hook active"
            p000.C0888ux.m5975(r0, r5)     // Catch: java.lang.Throwable -> L1a
            goto L3f
        L1a:
            r5 = move-exception
            goto L42
        L1c:
            java.lang.String r5 = "comment voice replace hook target not found"
            p000.C0888ux.m5975(r0, r5)     // Catch: java.lang.Throwable -> L1a
            goto L3f
        L22:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1a
        L26:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1a
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L1a
            ia2 r3 = new ia2     // Catch: java.lang.Throwable -> L1a
            r4 = 6
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L1a
            m2726(r2, r3)     // Catch: java.lang.Throwable -> L1a
            goto L26
        L3c:
            r5.m2735(r6)     // Catch: java.lang.Throwable -> L1a
        L3f:
            s62 r5 = p000.s62.f9751     // Catch: java.lang.Throwable -> L1a
            goto L48
        L42:
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L48:
            java.lang.Throwable r5 = p000.fo1.m2190(r5)
            if (r5 == 0) goto L53
            java.lang.String r6 = "install comment voice replace hook failed"
            p000.C0888ux.m5977(r0, r6, r5)
        L53:
            return
    }

    /* JADX INFO: renamed from: ο */
    public final void m2737(java.lang.ClassLoader r5) {
            r4 = this;
            java.lang.String r0 = "rb360b99c73f2f647"
            java.util.List r5 = r4.m2734(r5)     // Catch: java.lang.Throwable -> L12
            boolean r1 = r5.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.lang.String r4 = "IM voice replace hook target not found, allowDexKitScan=false"
            p000.C0888ux.m5975(r0, r4)     // Catch: java.lang.Throwable -> L12
            goto L2e
        L12:
            r4 = move-exception
            goto L31
        L14:
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L12
        L18:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L12
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L12
            ia2 r2 = new ia2     // Catch: java.lang.Throwable -> L12
            r3 = 5
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L12
            m2726(r1, r2)     // Catch: java.lang.Throwable -> L12
            goto L18
        L2e:
            s62 r4 = p000.s62.f9751     // Catch: java.lang.Throwable -> L12
            goto L37
        L31:
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L37:
            java.lang.Throwable r4 = p000.fo1.m2190(r4)
            if (r4 == 0) goto L42
            java.lang.String r5 = "install IM voice replace hook failed"
            p000.C0888ux.m5977(r0, r5, r4)
        L42:
            return
    }

    /* JADX INFO: renamed from: π */
    public final void m2738(java.lang.ClassLoader r12) {
            r11 = this;
            java.lang.String r0 = "rb360b99c73f2f647"
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.ib2.f4985
            r2 = 0
            r3 = 1
            boolean r4 = r1.compareAndSet(r2, r3)
            if (r4 != 0) goto Le
            goto Le7
        Le:
            java.lang.Object r4 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = "~78B71E7541C477E838C50BCD302E054C40CC02248AA0B9F3FD7794A78143886D1800F82A71492D2EFEBF50F69EC092027CD8E9B672D52762657C36503D2A32ECDF4324524659B85D"
            java.lang.String r4 = p000.jf0.m2957(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.Class r12 = p000.qe0.m4877(r12, r4)     // Catch: java.lang.Throwable -> L26
            if (r12 != 0) goto L29
            r1.set(r2)     // Catch: java.lang.Throwable -> L26
            java.lang.String r11 = "IM voice runtime hook target not found"
            p000.C0888ux.m5975(r0, r11)     // Catch: java.lang.Throwable -> L26
            goto Ld0
        L26:
            r11 = move-exception
            goto Ld3
        L29:
            java.lang.reflect.Constructor[] r4 = r12.getDeclaredConstructors()     // Catch: java.lang.Throwable -> L26
            r4.getClass()     // Catch: java.lang.Throwable -> L26
            int r5 = r4.length     // Catch: java.lang.Throwable -> L26
            r6 = r2
        L32:
            if (r6 >= r5) goto L3c
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L26
            r7.setAccessible(r3)     // Catch: java.lang.Throwable -> L26
            int r6 = r6 + 1
            goto L32
        L3c:
            int r5 = r4.length     // Catch: java.lang.Throwable -> L26
            r6 = r2
        L3e:
            if (r6 >= r5) goto L53
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L26
            xq0 r8 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L26
            r7.getClass()     // Catch: java.lang.Throwable -> L26
            db2 r9 = new db2     // Catch: java.lang.Throwable -> L26
            r10 = 5
            r9.<init>(r11, r10)     // Catch: java.lang.Throwable -> L26
            r8.m6775(r7, r9)     // Catch: java.lang.Throwable -> L26
            int r6 = r6 + 1
            goto L3e
        L53:
            java.lang.reflect.Method[] r12 = r12.getDeclaredMethods()     // Catch: java.lang.Throwable -> L26
            r12.getClass()     // Catch: java.lang.Throwable -> L26
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L26
            r4.<init>()     // Catch: java.lang.Throwable -> L26
            int r5 = r12.length     // Catch: java.lang.Throwable -> L26
            r6 = r2
        L61:
            if (r6 >= r5) goto L9f
            r7 = r12[r6]     // Catch: java.lang.Throwable -> L26
            int r8 = r7.getModifiers()     // Catch: java.lang.Throwable -> L26
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)     // Catch: java.lang.Throwable -> L26
            if (r8 != 0) goto L9c
            int r8 = r7.getModifiers()     // Catch: java.lang.Throwable -> L26
            boolean r8 = java.lang.reflect.Modifier.isAbstract(r8)     // Catch: java.lang.Throwable -> L26
            if (r8 != 0) goto L9c
            int r8 = r7.getModifiers()     // Catch: java.lang.Throwable -> L26
            boolean r8 = java.lang.reflect.Modifier.isNative(r8)     // Catch: java.lang.Throwable -> L26
            if (r8 != 0) goto L9c
            java.lang.Class r8 = r7.getReturnType()     // Catch: java.lang.Throwable -> L26
            java.lang.Class r9 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L26
            boolean r8 = p000.ln0.m3626(r8, r9)     // Catch: java.lang.Throwable -> L26
            if (r8 == 0) goto L9c
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> L26
            r8.getClass()     // Catch: java.lang.Throwable -> L26
            int r8 = r8.length     // Catch: java.lang.Throwable -> L26
            if (r8 != 0) goto L9c
            r4.add(r7)     // Catch: java.lang.Throwable -> L26
        L9c:
            int r6 = r6 + 1
            goto L61
        L9f:
            java.util.Iterator r12 = r4.iterator()     // Catch: java.lang.Throwable -> L26
        La3:
            boolean r5 = r12.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r5 == 0) goto Lb3
            java.lang.Object r5 = r12.next()     // Catch: java.lang.Throwable -> L26
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L26
            r5.setAccessible(r3)     // Catch: java.lang.Throwable -> L26
            goto La3
        Lb3:
            java.util.Iterator r12 = r4.iterator()     // Catch: java.lang.Throwable -> L26
        Lb7:
            boolean r3 = r12.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = r12.next()     // Catch: java.lang.Throwable -> L26
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L26
            r3.getClass()     // Catch: java.lang.Throwable -> L26
            ia2 r4 = new ia2     // Catch: java.lang.Throwable -> L26
            r5 = 4
            r4.<init>(r11, r5)     // Catch: java.lang.Throwable -> L26
            m2726(r3, r4)     // Catch: java.lang.Throwable -> L26
            goto Lb7
        Ld0:
            s62 r11 = p000.s62.f9751     // Catch: java.lang.Throwable -> L26
            goto Ld9
        Ld3:
            eo1 r12 = new eo1
            r12.<init>(r11)
            r11 = r12
        Ld9:
            java.lang.Throwable r11 = p000.fo1.m2190(r11)
            if (r11 == 0) goto Le7
            r1.set(r2)
            java.lang.String r12 = "install IM voice runtime hook failed"
            p000.C0888ux.m5977(r0, r12, r11)
        Le7:
            return
    }

    /* JADX INFO: renamed from: ρ */
    public final void m2739(java.lang.ClassLoader r10) {
            r9 = this;
            java.lang.String r0 = "rb360b99c73f2f647"
            java.lang.Object r1 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "~79285FCA4BF93B20DAE3F7561F6F9778B9C5EA825069EB9A10CF99B6A4267A188660BEE55E6E09F04B2E52048729E5"
            java.lang.String r1 = p000.jf0.m2957(r1)     // Catch: java.lang.Throwable -> L17
            java.lang.Class r10 = p000.qe0.m4877(r10, r1)     // Catch: java.lang.Throwable -> L17
            if (r10 != 0) goto L1a
            java.lang.String r9 = "voice runnable hook target not found"
            p000.C0888ux.m5975(r0, r9)     // Catch: java.lang.Throwable -> L17
            goto Lb5
        L17:
            r9 = move-exception
            goto Lb8
        L1a:
            java.lang.reflect.Method[] r10 = r10.getDeclaredMethods()     // Catch: java.lang.Throwable -> L17
            r10.getClass()     // Catch: java.lang.Throwable -> L17
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L17
            r1.<init>()     // Catch: java.lang.Throwable -> L17
            int r2 = r10.length     // Catch: java.lang.Throwable -> L17
            r3 = 0
            r4 = r3
        L29:
            r5 = 1
            if (r4 >= r2) goto L73
            r6 = r10[r4]     // Catch: java.lang.Throwable -> L17
            int r7 = r6.getModifiers()     // Catch: java.lang.Throwable -> L17
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)     // Catch: java.lang.Throwable -> L17
            if (r7 == 0) goto L70
            int r7 = r6.getModifiers()     // Catch: java.lang.Throwable -> L17
            boolean r7 = java.lang.reflect.Modifier.isAbstract(r7)     // Catch: java.lang.Throwable -> L17
            if (r7 != 0) goto L70
            int r7 = r6.getModifiers()     // Catch: java.lang.Throwable -> L17
            boolean r7 = java.lang.reflect.Modifier.isNative(r7)     // Catch: java.lang.Throwable -> L17
            if (r7 != 0) goto L70
            java.lang.Class r7 = r6.getReturnType()     // Catch: java.lang.Throwable -> L17
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L17
            boolean r7 = p000.ln0.m3626(r7, r8)     // Catch: java.lang.Throwable -> L17
            if (r7 == 0) goto L70
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L17
            int r7 = r7.length     // Catch: java.lang.Throwable -> L17
            if (r7 != r5) goto L70
            java.lang.Class<java.lang.Runnable> r5 = java.lang.Runnable.class
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L17
            r7 = r7[r3]     // Catch: java.lang.Throwable -> L17
            boolean r5 = r5.isAssignableFrom(r7)     // Catch: java.lang.Throwable -> L17
            if (r5 == 0) goto L70
            r1.add(r6)     // Catch: java.lang.Throwable -> L17
        L70:
            int r4 = r4 + 1
            goto L29
        L73:
            java.util.Iterator r10 = r1.iterator()     // Catch: java.lang.Throwable -> L17
        L77:
            boolean r2 = r10.hasNext()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L87
            java.lang.Object r2 = r10.next()     // Catch: java.lang.Throwable -> L17
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L17
            r2.setAccessible(r5)     // Catch: java.lang.Throwable -> L17
            goto L77
        L87:
            boolean r10 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r10 == 0) goto L93
            java.lang.String r9 = "voice runnable hook method not found"
            p000.C0888ux.m5975(r0, r9)     // Catch: java.lang.Throwable -> L17
            goto Lb5
        L93:
            java.util.concurrent.atomic.AtomicBoolean r10 = p000.ib2.f4984     // Catch: java.lang.Throwable -> L17
            r10.set(r5)     // Catch: java.lang.Throwable -> L17
            java.util.Iterator r10 = r1.iterator()     // Catch: java.lang.Throwable -> L17
        L9c:
            boolean r1 = r10.hasNext()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto Lb5
            java.lang.Object r1 = r10.next()     // Catch: java.lang.Throwable -> L17
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L17
            r1.getClass()     // Catch: java.lang.Throwable -> L17
            ia2 r2 = new ia2     // Catch: java.lang.Throwable -> L17
            r3 = 3
            r2.<init>(r9, r3)     // Catch: java.lang.Throwable -> L17
            m2726(r1, r2)     // Catch: java.lang.Throwable -> L17
            goto L9c
        Lb5:
            s62 r9 = p000.s62.f9751     // Catch: java.lang.Throwable -> L17
            goto Lbe
        Lb8:
            eo1 r10 = new eo1
            r10.<init>(r9)
            r9 = r10
        Lbe:
            java.lang.Throwable r9 = p000.fo1.m2190(r9)
            if (r9 == 0) goto Lc9
            java.lang.String r10 = "install voice runnable hook failed"
            p000.C0888ux.m5977(r0, r10, r9)
        Lc9:
            return
    }
}
