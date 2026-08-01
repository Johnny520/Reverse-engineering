package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class q20 {

    /* JADX INFO: renamed from: α */
    public static final java.util.Set f8803 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.ConcurrentHashMap f8804 = null;

    /* JADX INFO: renamed from: γ */
    public static volatile long f8805;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.atomic.AtomicBoolean f8806 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.ConcurrentHashMap f8807 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            p000.q20.f8803 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.q20.f8804 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.q20.f8806 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.q20.f8807 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m4717(java.lang.ClassLoader r3) {
            java.lang.String r0 = "~791C379109EE249A17C75D97B08A46A1FBF5443CB34C0F44BBA61A1BA3C0B72730E4"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r3 = m4723(r3, r0)
            if (r3 != 0) goto Ld
            goto L33
        Ld:
            boolean r0 = p000.kn0.f6047
            if (r0 == 0) goto L1d
            int r0 = p000.kn0.f6048
            if (r0 > 0) goto L16
            goto L1d
        L16:
            int r0 = p000.kn0.f6048
            r1 = 1
            if (r0 >= r1) goto L1e
            r0 = r1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            java.lang.Object r1 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "setIntValue"
            r2 = 11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L33
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}     // Catch: java.lang.Throwable -> L33
            p000.qe0.m4870(r3, r1, r0)     // Catch: java.lang.Throwable -> L33
        L33:
            return
    }

    /* JADX INFO: renamed from: β */
    public static final boolean m4718(p000.k01 r4, java.lang.ClassLoader r5) {
            boolean r0 = p000.kn0.f6047
            if (r0 == 0) goto Lb
            int r0 = p000.kn0.f6048
            if (r0 > 0) goto L9
            goto Lb
        L9:
            r4 = 0
            return r4
        Lb:
            m4721(r5)
            java.lang.reflect.Executable r5 = r4.f5690
            boolean r0 = r5 instanceof java.lang.reflect.Method
            r1 = 0
            if (r0 == 0) goto L18
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            goto L19
        L18:
            r5 = r1
        L19:
            if (r5 == 0) goto L20
            java.lang.Class r5 = r5.getReturnType()
            goto L21
        L20:
            r5 = r1
        L21:
            java.lang.Object r5 = m4722(r5)
            r4.m3107(r5)
            java.lang.reflect.Executable r4 = r4.f5690
            boolean r5 = r4 instanceof java.lang.reflect.Method
            if (r5 == 0) goto L31
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            goto L32
        L31:
            r4 = r1
        L32:
            if (r4 == 0) goto L3f
            java.lang.Class r5 = r4.getDeclaringClass()
            if (r5 == 0) goto L3f
            java.lang.String r5 = r5.getName()
            goto L40
        L3f:
            r5 = r1
        L40:
            if (r4 == 0) goto L47
            java.lang.String r0 = r4.getName()
            goto L48
        L47:
            r0 = r1
        L48:
            java.lang.String r2 = "block_preload_method:"
            java.lang.String r3 = "#"
            java.lang.String r5 = p000.a12.m18(r2, r5, r3, r0)
            if (r4 == 0) goto L5d
            java.lang.Class r0 = r4.getDeclaringClass()
            if (r0 == 0) goto L5d
            java.lang.String r0 = r0.getName()
            goto L5e
        L5d:
            r0 = r1
        L5e:
            if (r4 == 0) goto L64
            java.lang.String r1 = r4.getName()
        L64:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = "block preload method="
            r4.<init>(r2)
            r4.append(r0)
            r4.append(r3)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            m4727(r5, r4)
            r4 = 1
            return r4
    }

    /* JADX INFO: renamed from: γ */
    public static final java.lang.String m4719(java.lang.Object[] r12) {
            r1 = 0
            if (r12 != 0) goto L4
            return r1
        L4:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r12.length
            r4 = 0
            r5 = r4
        Lc:
            if (r5 >= r3) goto L140
            r6 = r12[r5]
            if (r6 == 0) goto L13c
            boolean r0 = r6 instanceof java.lang.String
            r7 = 96
            if (r0 == 0) goto L2c
            r0 = r6
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = p000.q02.m4671(r0)
            if (r0 != 0) goto L13c
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = p000.q02.m4693(r6, r7)
            r2.add(r0)
            goto L13c
        L2c:
            boolean r0 = r6 instanceof java.lang.Object[]
            if (r0 == 0) goto L84
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r8 = r6.length
            r9 = r4
        L39:
            if (r9 >= r8) goto L47
            r10 = r6[r9]
            boolean r11 = r10 instanceof java.lang.String
            if (r11 == 0) goto L44
            r0.add(r10)
        L44:
            int r9 = r9 + 1
            goto L39
        L47:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
        L50:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L67
            java.lang.Object r8 = r0.next()
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = p000.q02.m4671(r9)
            if (r9 != 0) goto L50
            r6.add(r8)
            goto L50
        L67:
            r0 = 2
            java.util.List r0 = p000.AbstractC0984xh.m6662(r6, r0)
            java.util.Iterator r0 = r0.iterator()
        L70:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L13c
            java.lang.Object r6 = r0.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = p000.q02.m4693(r6, r7)
            r2.add(r6)
            goto L70
        L84:
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r8 = "~79C18A000CC51E6256484DBE4323D135EABA1849AB"
            java.lang.String r8 = p000.jf0.m2957(r8)
            boolean r8 = p000.x02.m6485(r0, r8, r4)
            if (r8 != 0) goto La0
            java.lang.String r8 = "X.C231"
            boolean r0 = p000.x02.m6485(r0, r8, r4)
            if (r0 == 0) goto L13c
        La0:
            java.lang.String r0 = "getVideoId"
            java.lang.String r8 = "getVideoID"
            java.lang.String r9 = "getKey"
            java.lang.String[] r0 = new java.lang.String[]{r9, r0, r8}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r8 = r0.iterator()
        Lb2:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Le5
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r0 = p000.qe0.m4869(r6, r0, r9)     // Catch: java.lang.Throwable -> Lcb
            boolean r9 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lcb
            if (r9 == 0) goto Lcd
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lcb
            goto Ld5
        Lcb:
            r0 = move-exception
            goto Lcf
        Lcd:
            r0 = r1
            goto Ld5
        Lcf:
            eo1 r9 = new eo1
            r9.<init>(r0)
            r0 = r9
        Ld5:
            boolean r9 = r0 instanceof p000.eo1
            if (r9 == 0) goto Lda
            r0 = r1
        Lda:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lb2
            boolean r9 = p000.q02.m4671(r0)
            if (r9 == 0) goto L12d
            goto Lb2
        Le5:
            java.lang.String r0 = "LIZ"
            java.lang.String r8 = "LIZIZ"
            java.lang.String r9 = "mKey"
            java.lang.String r10 = "mVideoId"
            java.lang.String r11 = "mVideoID"
            java.lang.String[] r0 = new java.lang.String[]{r9, r10, r11, r0, r8}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r8 = r0.iterator()
        Lfb:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L12c
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = p000.qe0.m4879(r6, r0)     // Catch: java.lang.Throwable -> L112
            boolean r9 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L112
            if (r9 == 0) goto L114
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L112
            goto L11c
        L112:
            r0 = move-exception
            goto L116
        L114:
            r0 = r1
            goto L11c
        L116:
            eo1 r9 = new eo1
            r9.<init>(r0)
            r0 = r9
        L11c:
            boolean r9 = r0 instanceof p000.eo1
            if (r9 == 0) goto L121
            r0 = r1
        L121:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lfb
            boolean r9 = p000.q02.m4671(r0)
            if (r9 == 0) goto L12d
            goto Lfb
        L12c:
            r0 = r1
        L12d:
            if (r0 == 0) goto L13c
            boolean r6 = p000.q02.m4671(r0)
            if (r6 != 0) goto L13c
            java.lang.String r0 = p000.q02.m4693(r0, r7)
            r2.add(r0)
        L13c:
            int r5 = r5 + 1
            goto Lc
        L140:
            boolean r12 = r2.isEmpty()
            if (r12 == 0) goto L147
            goto L159
        L147:
            r7 = 0
            r8 = 62
            java.lang.String r3 = "|"
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r12 = p000.AbstractC0984xh.m6644(r2, r3, r4, r5, r6, r7, r8)
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String r1 = p000.q02.m4693(r12, r0)
        L159:
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public static final void m4720(java.lang.ClassLoader r16, java.lang.Object[] r17) {
            r0 = r17
            if (r0 != 0) goto L6
            goto L16b
        L6:
            int r1 = p000.kn0.f6049
            java.util.concurrent.ConcurrentHashMap r2 = p000.q20.f8804
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r2.get(r3)
            r4 = 2
            java.lang.String r5 = "~79E905EDE4AF0EE2DF6A19518D472B26126585960FE2A8468D87631C161352"
            r7 = 1
            if (r3 == 0) goto L1b
        L18:
            r8 = 0
            goto L100
        L1b:
            java.lang.String r3 = p000.jf0.m2957(r5)
            r8 = r16
            java.lang.Class r3 = m4723(r8, r3)
            if (r3 != 0) goto L29
        L27:
            r3 = 0
            goto L18
        L29:
            java.lang.Object[] r3 = r3.getEnumConstants()
            if (r3 != 0) goto L30
            goto L27
        L30:
            java.lang.String r9 = "Standard"
            java.lang.String r10 = "SuperHigh"
            java.lang.String r11 = "ExtremelyHigh"
            java.lang.String r12 = "High"
            if (r1 == 0) goto L6f
            if (r1 == r7) goto L64
            if (r1 == r4) goto L55
            r13 = 3
            if (r1 == r13) goto L46
            java.util.List r13 = p000.AbstractC1021yh.m6896(r12)
            goto L7b
        L46:
            java.lang.String r13 = "FourK"
            java.lang.String r14 = "Original"
            java.lang.String r15 = "EXTREMELY_HIGH"
            java.lang.String[] r13 = new java.lang.String[]{r11, r15, r13, r14}
            java.util.List r13 = p000.AbstractC1021yh.m6897(r13)
            goto L7b
        L55:
            java.lang.String r13 = "FullHigh"
            java.lang.String r14 = "FHD"
            java.lang.String r15 = "SUPER_HIGH"
            java.lang.String[] r13 = new java.lang.String[]{r10, r15, r13, r14}
            java.util.List r13 = p000.AbstractC1021yh.m6897(r13)
            goto L7b
        L64:
            java.lang.String r13 = "HD"
            java.lang.String[] r13 = new java.lang.String[]{r12, r13}
            java.util.List r13 = p000.AbstractC1021yh.m6897(r13)
            goto L7b
        L6f:
            java.lang.String r13 = "SD"
            java.lang.String r14 = "Lower"
            java.lang.String[] r13 = new java.lang.String[]{r9, r13, r14}
            java.util.List r13 = p000.AbstractC1021yh.m6897(r13)
        L7b:
            java.util.Iterator r13 = r13.iterator()
        L7f:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Lbc
            java.lang.Object r14 = r13.next()
            java.lang.String r14 = (java.lang.String) r14
            int r15 = r3.length
            r8 = 0
        L8d:
            if (r8 >= r15) goto Lad
            r4 = r3[r8]
            boolean r6 = r4 instanceof java.lang.Enum
            if (r6 == 0) goto L99
            r6 = r4
            java.lang.Enum r6 = (java.lang.Enum) r6
            goto L9a
        L99:
            r6 = 0
        L9a:
            if (r6 == 0) goto La9
            java.lang.String r6 = r6.name()
            if (r6 == 0) goto La9
            boolean r6 = r6.equalsIgnoreCase(r14)
            if (r6 != r7) goto La9
            goto Lae
        La9:
            int r8 = r8 + 1
            r4 = 2
            goto L8d
        Lad:
            r4 = 0
        Lae:
            if (r4 == 0) goto Lba
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2.put(r3, r4)
            r3 = r4
            goto L18
        Lba:
            r4 = 2
            goto L7f
        Lbc:
            java.lang.String[] r4 = new java.lang.String[]{r9, r12, r10, r11}
            java.util.List r4 = p000.AbstractC1021yh.m6897(r4)
            int r6 = r4.size()
            int r6 = r6 - r7
            r8 = 0
            int r6 = p000.j81.m2906(r1, r8, r6)
            java.lang.Object r4 = p000.AbstractC0984xh.m6641(r6, r4)
            java.lang.String r4 = (java.lang.String) r4
            int r6 = r3.length
            r9 = r8
        Ld6:
            if (r9 >= r6) goto Lf6
            r10 = r3[r9]
            boolean r11 = r10 instanceof java.lang.Enum
            if (r11 == 0) goto Le2
            r11 = r10
            java.lang.Enum r11 = (java.lang.Enum) r11
            goto Le3
        Le2:
            r11 = 0
        Le3:
            if (r11 == 0) goto Lf3
            java.lang.String r11 = r11.name()
            if (r11 == 0) goto Lf3
            boolean r11 = r11.equalsIgnoreCase(r4)
            if (r11 != r7) goto Lf3
            r3 = r10
            goto Lf7
        Lf3:
            int r9 = r9 + 1
            goto Ld6
        Lf6:
            r3 = 0
        Lf7:
            if (r3 == 0) goto L100
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r2.put(r4, r3)
        L100:
            int r2 = p000.kn0.f6049
            if (r2 == 0) goto L115
            if (r2 == r7) goto L111
            r4 = 2
            if (r2 == r4) goto L10d
            r6 = 5242880(0x500000, double:2.590327E-317)
            goto L118
        L10d:
            r6 = 3145728(0x300000, double:1.554196E-317)
            goto L118
        L111:
            r6 = 1572864(0x180000, double:7.77098E-318)
            goto L118
        L115:
            r6 = 524288(0x80000, double:2.590327E-318)
        L118:
            int r2 = r0.length
        L119:
            if (r8 >= r2) goto L16b
            r4 = r0[r8]
            if (r4 != 0) goto L120
            goto L168
        L120:
            if (r3 == 0) goto L137
            java.lang.Class r9 = r4.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r10 = p000.jf0.m2957(r5)
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L137
            r0[r8] = r3
            goto L168
        L137:
            boolean r9 = r4 instanceof java.lang.Long
            if (r9 == 0) goto L14d
            r9 = r4
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 <= 0) goto L14d
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r0[r8] = r4
            goto L168
        L14d:
            boolean r9 = r4 instanceof java.util.List
            if (r9 == 0) goto L165
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L157:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L168
            java.lang.Object r9 = r4.next()
            m4728(r9, r3, r6, r1)
            goto L157
        L165:
            m4728(r4, r3, r6, r1)
        L168:
            int r8 = r8 + 1
            goto L119
        L16b:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static void m4721(java.lang.ClassLoader r7) {
            java.lang.String r0 = "cancelAllPreloadTasks"
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = p000.q20.f8805
            long r3 = r1 - r3
            r5 = 1500(0x5dc, double:7.41E-321)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L11
            goto L1f
        L11:
            p000.q20.f8805 = r1
            java.lang.String r1 = "~791C379109EE249A17C75D97B08A46A1FBF5443CB34C0F44BBA61A1BA3C0B72730E4"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.Class r7 = m4723(r7, r1)
            if (r7 != 0) goto L20
        L1f:
            return
        L20:
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L26
            p000.qe0.m4870(r7, r0, r2)     // Catch: java.lang.Throwable -> L26
        L26:
            java.lang.String r2 = "cancelAllWaitReqs"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L2d
            p000.qe0.m4870(r7, r2, r1)     // Catch: java.lang.Throwable -> L2d
        L2d:
            m4726(r0)
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.Object m4722(java.lang.Class r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.Class r1 = java.lang.Boolean.TYPE
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Lf
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
        Lf:
            java.lang.Class r1 = java.lang.Integer.TYPE
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L1d
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L1d:
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L2c
            r0 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L2c:
            java.lang.Class r1 = java.lang.Float.TYPE
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L3a
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
        L3a:
            java.lang.Class r1 = java.lang.Double.TYPE
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L49
            r0 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L49:
            java.lang.Class r1 = java.lang.Void.TYPE
            r2.equals(r1)
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static java.lang.Class m4723(java.lang.ClassLoader r0, java.lang.String r1) {
            java.lang.Class r0 = p000.qe0.m4876(r0, r1)     // Catch: java.lang.Throwable -> L5
            goto Lc
        L5:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        Lc:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L11
            r0 = 0
        L11:
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static void m4724(java.lang.reflect.Method r3, p000.m01 r4) {
            java.lang.String r0 = "hook "
            java.lang.String r1 = r3.toGenericString()
            java.util.Set r2 = p000.q20.f8803
            boolean r2 = r2.add(r1)
            if (r2 != 0) goto Lf
            goto L40
        Lf:
            r2 = 1
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L2a
            xq0 r2 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L2a
            r2.m6775(r3, r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L2a
            r3.append(r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2a
            m4726(r3)     // Catch: java.lang.Throwable -> L2a
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> L2a
            goto L31
        L2a:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L31:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L40
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "r74ba2c32221e54da"
            p000.AbstractC0602nx.m4121(r4, r1, r3)
        L40:
            return
    }

    /* JADX INFO: renamed from: ι */
    public static void m4725(java.lang.ClassLoader r14) {
            r14.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.q20.f8806
            r6 = 0
            r7 = 1
            boolean r0 = r0.compareAndSet(r6, r7)
            r8 = 3
            r9 = 2
            if (r0 == 0) goto L51
            java.lang.String r0 = "feed_enable_preload"
            boolean r0 = p000.ui1.m5887(r0, r6)
            p000.kn0.f6047 = r0
            java.lang.String r0 = "feed_preload_count"
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L22
            int r0 = r2.getInt(r0, r9)     // Catch: java.lang.Throwable -> L22
            goto L23
        L22:
            r0 = r9
        L23:
            r2 = 8
            int r0 = p000.j81.m2906(r0, r6, r2)
            p000.kn0.f6048 = r0
            java.lang.String r0 = "feed_preload_quality"
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L36
            int r0 = r2.getInt(r0, r7)     // Catch: java.lang.Throwable -> L36
            goto L37
        L36:
            r0 = r7
        L37:
            int r0 = p000.j81.m2906(r0, r6, r8)
            p000.kn0.f6049 = r0
            java.lang.String r0 = "feed_preload_debug_log"
            boolean r0 = p000.ui1.m5887(r0, r6)
            p000.kn0.f6050 = r0
            l20 r0 = p000.kn0.f6051
            java.util.concurrent.CopyOnWriteArrayList r2 = p000.ui1.f10853
            r2.add(r0)
            java.lang.String r0 = "Settings initialized with PrefsManager"
            m4726(r0)
        L51:
            kx r0 = p000.EnumC0491kx.f6251
            r20 r4 = new r20
            r2 = 5
            r4.<init>(r14, r2)
            t20 r5 = new t20
            r2 = 0
            r5.<init>(r14, r2)
            r3 = 1
            r1 = r14
            java.util.ArrayList r0 = p000.pd2.m4469(r0, r1, r2, r3, r4, r5)
            bm r3 = new bm
            r4 = 7
            r5 = 0
            r3.<init>(r4, r14, r5)
            java.util.Iterator r0 = r0.iterator()
        L70:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L80
            java.lang.Object r4 = r0.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            m4724(r4, r3)
            goto L70
        L80:
            kx r0 = p000.EnumC0491kx.f6252
            r20 r4 = new r20
            r3 = 4
            r4.<init>(r14, r3)
            bb r5 = new bb
            r3 = 29
            r5.<init>(r14, r3)
            r3 = 3
            r1 = r14
            java.util.ArrayList r0 = p000.pd2.m4469(r0, r1, r2, r3, r4, r5)
            java.util.Iterator r0 = r0.iterator()
        L99:
            boolean r3 = r0.hasNext()
            java.lang.Class r10 = java.lang.Void.TYPE
            java.lang.Class r11 = java.lang.Integer.TYPE
            if (r3 == 0) goto L12c
            java.lang.Object r3 = r0.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Class[] r4 = r3.getParameterTypes()
            java.lang.Class r5 = r3.getReturnType()
            java.lang.Class r12 = java.lang.Boolean.TYPE
            boolean r5 = p000.ln0.m3626(r5, r12)
            if (r5 == 0) goto Ld6
            int r5 = r4.length
            if (r5 != r9) goto Ld6
            r5 = r4[r6]
            boolean r5 = p000.ln0.m3626(r5, r11)
            if (r5 == 0) goto Ld6
            r5 = r4[r7]
            boolean r5 = p000.ln0.m3626(r5, r12)
            if (r5 == 0) goto Ld6
            f10 r4 = new f10
            r5 = 5
            r4.<init>(r5)
            m4724(r3, r4)
            goto L99
        Ld6:
            java.lang.Class r5 = r3.getReturnType()
            java.lang.String r5 = r5.getName()
            java.lang.String r13 = "android.view.View"
            boolean r5 = r5.equals(r13)
            if (r5 == 0) goto L111
            int r5 = r4.length
            if (r5 != r8) goto L111
            r5 = r4[r6]
            boolean r5 = p000.ln0.m3626(r5, r11)
            if (r5 == 0) goto L111
            r5 = r4[r7]
            java.lang.String r5 = r5.getName()
            java.lang.String r11 = "android.view.ViewGroup"
            boolean r5 = r5.equals(r11)
            if (r5 == 0) goto L111
            r5 = r4[r9]
            boolean r5 = p000.ln0.m3626(r5, r12)
            if (r5 == 0) goto L111
            f10 r4 = new f10
            r5 = 6
            r4.<init>(r5)
            m4724(r3, r4)
            goto L99
        L111:
            java.lang.Class r5 = r3.getReturnType()
            boolean r5 = p000.ln0.m3626(r5, r10)
            if (r5 == 0) goto L99
            r4.getClass()
            int r4 = r4.length
            if (r4 != 0) goto L99
            f10 r4 = new f10
            r5 = 7
            r4.<init>(r5)
            m4724(r3, r4)
            goto L99
        L12c:
            kx r0 = p000.EnumC0491kx.f6253
            r20 r4 = new r20
            r3 = 6
            r4.<init>(r14, r3)
            t20 r5 = new t20
            r3 = 1
            r5.<init>(r14, r3)
            r3 = 8
            r1 = r14
            java.util.ArrayList r0 = p000.pd2.m4469(r0, r1, r2, r3, r4, r5)
            java.util.Iterator r0 = r0.iterator()
        L145:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1cb
            java.lang.Object r3 = r0.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r4 = r3.getName()
            if (r4 == 0) goto L145
            int r5 = r4.hashCode()
            switch(r5) {
                case -1749596860: goto L1b6;
                case -1393259383: goto L1a2;
                case -1323224481: goto L18e;
                case -1161550205: goto L185;
                case -1148589626: goto L17c;
                case 556873908: goto L168;
                case 1760690519: goto L15f;
                default: goto L15e;
            }
        L15e:
            goto L145
        L15f:
            java.lang.String r5 = "addPreloadMedias"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L171
            goto L145
        L168:
            java.lang.String r5 = "insertPreloadMedia"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L171
            goto L145
        L171:
            bm r4 = new bm
            r5 = 4
            r8 = 0
            r4.<init>(r5, r14, r8)
            m4724(r3, r4)
            goto L145
        L17c:
            java.lang.String r5 = "addTask"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L1ab
            goto L145
        L185:
            java.lang.String r5 = "addPreloadModelMedia"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L1ab
            goto L145
        L18e:
            java.lang.String r5 = "startDataLoader"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L197
            goto L145
        L197:
            bm r4 = new bm
            r5 = 5
            r8 = 0
            r4.<init>(r5, r14, r8)
            m4724(r3, r4)
            goto L145
        L1a2:
            java.lang.String r5 = "addPriorityPreloadTask"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L1ab
            goto L145
        L1ab:
            bm r4 = new bm
            r5 = 6
            r8 = 0
            r4.<init>(r5, r14, r8)
            m4724(r3, r4)
            goto L145
        L1b6:
            java.lang.String r5 = "setIntValue"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L1bf
            goto L145
        L1bf:
            f10 r4 = new f10
            r5 = 9
            r4.<init>(r5)
            m4724(r3, r4)
            goto L145
        L1cb:
            kx r0 = p000.EnumC0491kx.f6254
            r20 r4 = new r20
            r3 = 3
            r4.<init>(r14, r3)
            bb r5 = new bb
            r3 = 28
            r5.<init>(r14, r3)
            r3 = 6
            r1 = r14
            java.util.ArrayList r0 = p000.pd2.m4469(r0, r1, r2, r3, r4, r5)
            java.util.Iterator r0 = r0.iterator()
        L1e4:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L227
            java.lang.Object r3 = r0.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Class[] r4 = r3.getParameterTypes()
            java.lang.Class r5 = r3.getReturnType()
            boolean r5 = p000.ln0.m3626(r5, r10)
            if (r5 == 0) goto L21c
            int r5 = r4.length
            if (r5 != r9) goto L21c
            r5 = r4[r6]
            boolean r5 = p000.ln0.m3626(r5, r11)
            if (r5 == 0) goto L21c
            r4 = r4[r7]
            boolean r4 = p000.ln0.m3626(r4, r11)
            if (r4 == 0) goto L21c
            f10 r4 = new f10
            r5 = 8
            r4.<init>(r5)
            m4724(r3, r4)
            goto L1e4
        L21c:
            bm r4 = new bm
            r5 = 3
            r8 = 0
            r4.<init>(r5, r14, r8)
            m4724(r3, r4)
            goto L1e4
        L227:
            kx r0 = p000.EnumC0491kx.f6255
            r20 r4 = new r20
            r3 = 2
            r4.<init>(r14, r3)
            bb r5 = new bb
            r3 = 27
            r5.<init>(r14, r3)
            r3 = 2
            r1 = r14
            java.util.ArrayList r0 = p000.pd2.m4469(r0, r1, r2, r3, r4, r5)
            java.util.Iterator r0 = r0.iterator()
        L240:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L257
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            xe r2 = new xe
            r3 = 5
            r4 = 0
            r2.<init>(r1, r3, r4)
            m4724(r1, r2)
            goto L240
        L257:
            java.lang.String r0 = "installed/resolved, allowDexKitScan=false"
            m4726(r0)
            return
    }

    /* JADX INFO: renamed from: κ */
    public static void m4726(java.lang.String r1) {
            boolean r0 = p000.kn0.f6050
            if (r0 == 0) goto Ld
            java.lang.String r0 = "rab6107f7528a8217"
            java.lang.String r1 = r0.concat(r1)
            p000.C0888ux.m5985(r1)
        Ld:
            return
    }

    /* JADX INFO: renamed from: λ */
    public static void m4727(java.lang.String r7, java.lang.String r8) {
            boolean r0 = p000.kn0.f6050
            if (r0 != 0) goto L5
            goto L22
        L5:
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.util.concurrent.ConcurrentHashMap r2 = p000.q20.f8807
            java.lang.Object r3 = r2.get(r7)
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 == 0) goto L18
            long r3 = r3.longValue()
            goto L1a
        L18:
            r3 = 0
        L1a:
            long r3 = r0 - r3
            r5 = 3000(0xbb8, double:1.482E-320)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L23
        L22:
            return
        L23:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r7, r0)
            java.lang.String r7 = "rab6107f7528a8217"
            java.lang.String r7 = r7.concat(r8)
            p000.C0888ux.m5985(r7)
            return
    }

    /* JADX INFO: renamed from: μ */
    public static void m4728(java.lang.Object r11, java.lang.Object r12, long r13, int r15) {
            if (r11 != 0) goto L4
            goto L1e3
        L4:
            java.lang.Class r0 = r11.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "~79C18A000CC51E6256484DBE4323D135EABA1849AB"
            java.lang.String r1 = p000.jf0.m2957(r1)
            r2 = 0
            boolean r1 = p000.x02.m6485(r0, r1, r2)
            if (r1 != 0) goto L23
            java.lang.String r1 = "X.C231"
            boolean r0 = p000.x02.m6485(r0, r1, r2)
            if (r0 != 0) goto L23
            goto L1e3
        L23:
            java.lang.String r0 = "="
            java.lang.String r1 = "."
            r3 = 1
            r4 = 0
            if (r12 == 0) goto La8
            java.lang.String r5 = "mResolution"
            p000.qe0.m4882(r5, r11, r12)     // Catch: java.lang.Throwable -> L31
            goto La8
        L31:
            java.lang.Class r5 = r11.getClass()
            jf r6 = new jf
            r6.<init>(r5, r4, r3)
            ts1 r5 = p000.e81.m1879(r6)
        L3e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto La8
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            int r7 = r6.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 != 0) goto L3e
            java.lang.Class r7 = r6.getType()
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = "~79E905EDE4AF0EE2DF6A19518D472B26126585960FE2A8468D87631C161352"
            java.lang.String r8 = p000.jf0.m2957(r8)
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L76
            java.lang.Class r7 = r6.getType()
            java.lang.Class r8 = r12.getClass()
            boolean r7 = r7.isAssignableFrom(r8)
            if (r7 == 0) goto L3e
        L76:
            r6.setAccessible(r3)     // Catch: java.lang.Throwable -> L3e
            r6.set(r11, r12)     // Catch: java.lang.Throwable -> L3e
            java.lang.Class r7 = r11.getClass()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r8.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r9 = "set resolution "
            r8.append(r9)     // Catch: java.lang.Throwable -> L3e
            r8.append(r7)     // Catch: java.lang.Throwable -> L3e
            r8.append(r1)     // Catch: java.lang.Throwable -> L3e
            r8.append(r6)     // Catch: java.lang.Throwable -> L3e
            r8.append(r0)     // Catch: java.lang.Throwable -> L3e
            r8.append(r12)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L3e
            m4726(r6)     // Catch: java.lang.Throwable -> L3e
        La8:
            java.lang.String r12 = "setPreloadSize "
            java.lang.String r5 = "getPreloadSize"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r5 = p000.qe0.m4869(r11, r5, r6)     // Catch: java.lang.Throwable -> Lb9
            boolean r6 = r5 instanceof java.lang.Number     // Catch: java.lang.Throwable -> Lb9
            if (r6 == 0) goto Lbb
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> Lb9
            goto Lbc
        Lb9:
            r5 = move-exception
            goto Lc9
        Lbb:
            r5 = r4
        Lbc:
            if (r5 == 0) goto Lc7
            long r5 = r5.longValue()     // Catch: java.lang.Throwable -> Lb9
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Lb9
            goto Lcf
        Lc7:
            r5 = r4
            goto Lcf
        Lc9:
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        Lcf:
            boolean r6 = r5 instanceof p000.eo1
            if (r6 == 0) goto Ld4
            r5 = r4
        Ld4:
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto Lec
            long r6 = r5.longValue()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto Lec
            long r5 = r5.longValue()
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 > 0) goto Lec
            goto L1c7
        Lec:
            java.lang.Object r5 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L11a
            java.lang.String r5 = "setPreloadSize"
            java.lang.Long r6 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> L11a
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L11a
            p000.qe0.m4869(r11, r5, r6)     // Catch: java.lang.Throwable -> L11a
            java.lang.Class r5 = r11.getClass()     // Catch: java.lang.Throwable -> L11a
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L11a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11a
            r6.<init>(r12)     // Catch: java.lang.Throwable -> L11a
            r6.append(r5)     // Catch: java.lang.Throwable -> L11a
            r6.append(r0)     // Catch: java.lang.Throwable -> L11a
            r6.append(r13)     // Catch: java.lang.Throwable -> L11a
            java.lang.String r12 = r6.toString()     // Catch: java.lang.Throwable -> L11a
            m4726(r12)     // Catch: java.lang.Throwable -> L11a
            goto L1c7
        L11a:
            java.lang.String r12 = "LIZJ"
            java.lang.String r0 = "LJ"
            java.lang.String r5 = "mPreloadSize"
            java.lang.String r6 = "preloadSize"
            java.lang.String[] r12 = new java.lang.String[]{r5, r6, r12, r0}
            java.util.Set r12 = p000.AbstractC0312g7.m2263(r12)
            java.lang.Class r0 = r11.getClass()
            jf r5 = new jf
            r5.<init>(r0, r4, r3)
            ts1 r0 = p000.e81.m1879(r5)
        L137:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L1c7
            java.lang.Object r5 = r0.next()
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            int r6 = r5.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 != 0) goto L137
            java.lang.String r6 = r5.getName()
            boolean r6 = r12.contains(r6)
            if (r6 == 0) goto L137
            java.lang.Class r6 = r5.getType()
            java.lang.Class r7 = java.lang.Long.TYPE
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 != 0) goto L16f
            java.lang.Class r6 = r5.getType()
            java.lang.Class<java.lang.Long> r7 = java.lang.Long.class
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 == 0) goto L137
        L16f:
            r5.setAccessible(r3)     // Catch: java.lang.Throwable -> L137
            java.lang.Object r6 = r5.get(r11)     // Catch: java.lang.Throwable -> L137
            boolean r7 = r6 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L137
            if (r7 == 0) goto L17d
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Throwable -> L137
            goto L17e
        L17d:
            r6 = r4
        L17e:
            if (r6 == 0) goto L137
            long r6 = r6.longValue()     // Catch: java.lang.Throwable -> L137
            int r8 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r8 <= 0) goto L137
            java.lang.Long r8 = java.lang.Long.valueOf(r13)     // Catch: java.lang.Throwable -> L137
            r5.set(r11, r8)     // Catch: java.lang.Throwable -> L137
            java.lang.Class r8 = r11.getClass()     // Catch: java.lang.Throwable -> L137
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L137
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L137
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L137
            r9.<init>()     // Catch: java.lang.Throwable -> L137
            java.lang.String r10 = "limit preload size "
            r9.append(r10)     // Catch: java.lang.Throwable -> L137
            r9.append(r8)     // Catch: java.lang.Throwable -> L137
            r9.append(r1)     // Catch: java.lang.Throwable -> L137
            r9.append(r5)     // Catch: java.lang.Throwable -> L137
            java.lang.String r5 = ": "
            r9.append(r5)     // Catch: java.lang.Throwable -> L137
            r9.append(r6)     // Catch: java.lang.Throwable -> L137
            java.lang.String r5 = " -> "
            r9.append(r5)     // Catch: java.lang.Throwable -> L137
            r9.append(r13)     // Catch: java.lang.Throwable -> L137
            java.lang.String r5 = r9.toString()     // Catch: java.lang.Throwable -> L137
            m4726(r5)     // Catch: java.lang.Throwable -> L137
            goto L137
        L1c7:
            if (r15 == 0) goto L1d3
            if (r15 == r3) goto L1d1
            r12 = 2
            if (r15 == r12) goto L1cf
            goto L1d4
        L1cf:
            r2 = r3
            goto L1d4
        L1d1:
            r2 = 3
            goto L1d4
        L1d3:
            r2 = 5
        L1d4:
            java.lang.Object r12 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L1e3
            java.lang.String r12 = "setPriorityLevel"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L1e3
            java.lang.Object[] r13 = new java.lang.Object[]{r13}     // Catch: java.lang.Throwable -> L1e3
            p000.qe0.m4869(r11, r12, r13)     // Catch: java.lang.Throwable -> L1e3
        L1e3:
            return
    }
}
