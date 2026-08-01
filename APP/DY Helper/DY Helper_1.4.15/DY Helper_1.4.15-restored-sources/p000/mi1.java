package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class mi1 {

    /* JADX INFO: renamed from: α */
    public static final p000.mi1 f7162 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.List f7163 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f7164 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f7165 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f7166 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f7167 = null;

    /* JADX INFO: renamed from: η */
    public static final java.util.concurrent.ConcurrentHashMap f7168 = null;

    /* JADX INFO: renamed from: θ */
    public static final java.util.concurrent.ConcurrentHashMap f7169 = null;

    /* JADX INFO: renamed from: ι */
    public static final java.util.concurrent.ConcurrentHashMap f7170 = null;

    static {
            mi1 r0 = new mi1
            r0.<init>()
            p000.mi1.f7162 = r0
            java.lang.String r0 = "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B62006CE4037E2C5D21A017285958ABF0E2F0C78C5CEBA08BD3FBC734FC89AE7092F5DC2A5A919822E5893A800A32F1302E7F"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B62006CE4037E2C5D21A017285958ABF0E2F0C78C5CEBA08BD3FBC734FC89B97692FDF6367CA0853DF9893A800A32F1302E7F"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String r2 = "~7887EB3C8DFF4D5E985E245E27C49A473730FF61BE5736C7134F804694504999EA259F6A0E69991C4321115C9095545D9C9013F8EFC3A290C121C37AEDF3899BB9592968"
            java.lang.String r2 = p000.jf0.m2957(r2)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.mi1.f7163 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.mi1.f7164 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.mi1.f7165 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.mi1.f7166 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.mi1.f7167 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.mi1.f7168 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.mi1.f7169 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.mi1.f7170 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.util.ArrayList m3830(java.lang.Class r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r6 == 0) goto L2b
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L2b
            java.lang.reflect.Field[] r1 = r6.getDeclaredFields()     // Catch: java.lang.Throwable -> L26
            r1.getClass()     // Catch: java.lang.Throwable -> L26
            int r2 = r1.length     // Catch: java.lang.Throwable -> L26
            r3 = 0
        L18:
            if (r3 >= r2) goto L26
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L26
            r5 = 1
            r4.setAccessible(r5)     // Catch: java.lang.Throwable -> L26
            r0.add(r4)     // Catch: java.lang.Throwable -> L26
            int r3 = r3 + 1
            goto L18
        L26:
            java.lang.Class r6 = r6.getSuperclass()
            goto L5
        L2b:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static java.util.ArrayList m3831(java.lang.Class r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r6 == 0) goto L2b
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L2b
            java.lang.reflect.Method[] r1 = r6.getDeclaredMethods()     // Catch: java.lang.Throwable -> L26
            r1.getClass()     // Catch: java.lang.Throwable -> L26
            int r2 = r1.length     // Catch: java.lang.Throwable -> L26
            r3 = 0
        L18:
            if (r3 >= r2) goto L26
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L26
            r5 = 1
            r4.setAccessible(r5)     // Catch: java.lang.Throwable -> L26
            r0.add(r4)     // Catch: java.lang.Throwable -> L26
            int r3 = r3 + 1
            goto L18
        L26:
            java.lang.Class r6 = r6.getSuperclass()
            goto L5
        L2b:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.String m3832(long r4) {
            java.lang.String r0 = "precise_time_format"
            java.lang.String r1 = "yyyy-MM-dd HH:mm"
            java.lang.String r0 = p000.ui1.m5893(r0, r1)
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            boolean r2 = p000.q02.m4671(r0)
            if (r2 == 0) goto L17
            r0 = r1
        L17:
            r2 = 50
            java.lang.String r0 = p000.q02.m4693(r0, r2)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L30
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L30
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L30
            java.util.Date r0 = new java.util.Date     // Catch: java.lang.Throwable -> L30
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = r2.format(r0)     // Catch: java.lang.Throwable -> L30
            goto L37
        L30:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L37:
            java.lang.Throwable r2 = p000.fo1.m2190(r0)
            if (r2 != 0) goto L3e
            goto L50
        L3e:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r2 = java.util.Locale.getDefault()
            r0.<init>(r1, r2)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r4)
            java.lang.String r0 = r0.format(r1)
        L50:
            r0.getClass()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static boolean m3833(java.lang.Class r1, java.lang.String r2) {
            java.util.ArrayList r1 = m3830(r1)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb
            goto L2b
        Lb:
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r1.next()
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            java.lang.Class r0 = r0.getType()
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lf
            r1 = 1
            return r1
        L2b:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: θ */
    public static boolean m3834(java.lang.Class r12) {
            java.util.ArrayList r0 = m3830(r12)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            int r3 = r3.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)
            if (r3 != 0) goto Ld
            r1.add(r2)
            goto Ld
        L28:
            boolean r0 = r1.isEmpty()
            r2 = 0
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 0
            if (r0 == 0) goto L34
            r5 = r4
            goto L58
        L34:
            java.util.Iterator r0 = r1.iterator()
            r5 = r4
        L39:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L58
            java.lang.Object r6 = r0.next()
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            java.lang.Class r6 = r6.getType()
            boolean r6 = p000.ln0.m3626(r6, r3)
            if (r6 == 0) goto L39
            int r5 = r5 + 1
            if (r5 < 0) goto L54
            goto L39
        L54:
            p000.AbstractC1021yh.m6916()
            throw r2
        L58:
            boolean r0 = r1.isEmpty()
            java.lang.Class r6 = java.lang.Integer.TYPE
            if (r0 == 0) goto L62
            r1 = r4
            goto L86
        L62:
            java.util.Iterator r0 = r1.iterator()
            r1 = r4
        L67:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L86
            java.lang.Object r7 = r0.next()
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            java.lang.Class r7 = r7.getType()
            boolean r7 = p000.ln0.m3626(r7, r6)
            if (r7 == 0) goto L67
            int r1 = r1 + 1
            if (r1 < 0) goto L82
            goto L67
        L82:
            p000.AbstractC1021yh.m6916()
            throw r2
        L86:
            java.lang.reflect.Constructor[] r12 = r12.getDeclaredConstructors()
            r12.getClass()
            int r0 = r12.length
            r2 = r4
        L8f:
            r7 = 2
            r8 = 1
            if (r2 >= r0) goto Lba
            r9 = r12[r2]
            java.lang.Class[] r9 = r9.getParameterTypes()
            int r10 = r9.length
            r11 = 3
            if (r10 != r11) goto Lb7
            r10 = r9[r4]
            boolean r10 = p000.ln0.m3626(r10, r3)
            if (r10 == 0) goto Lb7
            r10 = r9[r8]
            boolean r10 = p000.ln0.m3626(r10, r6)
            if (r10 == 0) goto Lb7
            r9 = r9[r7]
            boolean r9 = p000.ln0.m3626(r9, r6)
            if (r9 == 0) goto Lb7
            r12 = r8
            goto Lbb
        Lb7:
            int r2 = r2 + 1
            goto L8f
        Lba:
            r12 = r4
        Lbb:
            if (r5 != r8) goto Lc2
            if (r1 < r7) goto Lc2
            if (r12 == 0) goto Lc2
            return r8
        Lc2:
            return r4
    }

    /* JADX INFO: renamed from: ι */
    public static long m3835(long r10) {
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            goto L5b
        L7:
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 31536000000(0x757b12c00, double:1.55808542072E-313)
            long r2 = r2 + r4
            r4 = 946684800000(0xdc6acfac00, double:4.6772443712E-312)
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 > 0) goto L1f
            int r6 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r6 > 0) goto L1f
            return r10
        L1f:
            r6 = 946684800(0x386d4380, double:4.67724437E-315)
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 > 0) goto L5b
            r6 = 1000(0x3e8, double:4.94E-321)
            long r8 = r2 / r6
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 > 0) goto L5b
            long r10 = java.lang.Math.multiplyExact(r10, r6)     // Catch: java.lang.Throwable -> L37
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Throwable -> L37
            goto L3e
        L37:
            r10 = move-exception
            eo1 r11 = new eo1
            r11.<init>(r10)
            r10 = r11
        L3e:
            boolean r11 = r10 instanceof p000.eo1
            r6 = 0
            if (r11 == 0) goto L44
            r10 = r6
        L44:
            java.lang.Long r10 = (java.lang.Long) r10
            if (r10 == 0) goto L5b
            long r7 = r10.longValue()
            int r11 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r11 > 0) goto L55
            int r11 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r11 > 0) goto L55
            r6 = r10
        L55:
            if (r6 == 0) goto L5b
            long r0 = r6.longValue()
        L5b:
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public static java.lang.Class m3836(java.lang.ClassLoader r8, boolean r9) {
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6220
            java.util.List r1 = p000.C0666ox.m4321(r0, r8)
            r2 = 2000(0x7d0, float:2.803E-42)
            r3 = 0
            if (r1 == 0) goto L4b
            java.util.Iterator r1 = r1.iterator()
            boolean r4 = r1.hasNext()
            if (r4 != 0) goto L19
            r4 = r3
            goto L40
        L19:
            java.lang.Object r4 = r1.next()
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L24
            goto L40
        L24:
            r5 = r4
            java.lang.Class r5 = (java.lang.Class) r5
            int r5 = m3837(r5)
        L2b:
            java.lang.Object r6 = r1.next()
            r7 = r6
            java.lang.Class r7 = (java.lang.Class) r7
            int r7 = m3837(r7)
            if (r5 >= r7) goto L3a
            r4 = r6
            r5 = r7
        L3a:
            boolean r6 = r1.hasNext()
            if (r6 != 0) goto L2b
        L40:
            java.lang.Class r4 = (java.lang.Class) r4
            if (r4 == 0) goto L4b
            int r1 = m3837(r4)
            if (r1 < r2) goto L4b
            return r4
        L4b:
            java.util.List r1 = p000.mi1.f7163
            f7 r1 = p000.AbstractC0984xh.m6661(r1)
            t20 r4 = new t20
            r5 = 27
            r4.<init>(r8, r5)
            y30 r1 = p000.us1.m5943(r1, r4)
            x30 r4 = new x30
            r4.<init>(r1)
        L61:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L75
            java.lang.Object r1 = r4.next()
            r5 = r1
            java.lang.Class r5 = (java.lang.Class) r5
            int r5 = m3837(r5)
            if (r5 < r2) goto L61
            goto L76
        L75:
            r1 = r3
        L76:
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 == 0) goto L84
            java.lang.Object r8 = p000.C0666ox.f8297
            java.util.List r8 = p000.AbstractC1021yh.m6896(r1)
            p000.C0666ox.m4325(r0, r8)
            return r1
        L84:
            if (r9 == 0) goto Ld2
            java.lang.Object r9 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r9 = p000.C0666ox.f8305
            boolean r9 = r9.get()
            if (r9 != 0) goto L91
            goto Ld2
        L91:
            t20 r9 = new t20
            r1 = 26
            r9.<init>(r8, r1)
            java.lang.String r1 = "定位评论时间组件"
            java.util.List r8 = p000.C0666ox.m4314(r0, r8, r1, r9)
            java.util.Iterator r8 = r8.iterator()
            boolean r9 = r8.hasNext()
            if (r9 != 0) goto La9
            goto Ld0
        La9:
            java.lang.Object r3 = r8.next()
            boolean r9 = r8.hasNext()
            if (r9 != 0) goto Lb4
            goto Ld0
        Lb4:
            r9 = r3
            java.lang.Class r9 = (java.lang.Class) r9
            int r9 = m3837(r9)
        Lbb:
            java.lang.Object r0 = r8.next()
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            int r1 = m3837(r1)
            if (r9 >= r1) goto Lca
            r3 = r0
            r9 = r1
        Lca:
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto Lbb
        Ld0:
            java.lang.Class r3 = (java.lang.Class) r3
        Ld2:
            return r3
    }

    /* JADX INFO: renamed from: λ */
    public static int m3837(java.lang.Class r4) {
            java.lang.String r0 = r4.getName()
            java.lang.String r1 = "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B62006CE4037E2C5D21A017285958ABF0E2F0C78C5CEBA08BD3FBC734FC89AE7092F5DC2A5A919822E5893A800A32F1302E7F"
            java.lang.String r1 = p000.jf0.m2957(r1)
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L14
            r0 = 5000(0x1388, float:7.006E-42)
            goto L15
        L14:
            r0 = r1
        L15:
            java.lang.String r2 = r4.getName()
            java.lang.String r3 = "TimeOrRetryComponent"
            boolean r2 = p000.q02.m4654(r2, r3, r1)
            if (r2 == 0) goto L23
            int r0 = r0 + 3000
        L23:
            java.lang.String r2 = r4.getName()
            java.lang.String r3 = "~791083E064F2E9C5322A913A15390BF9216A0DF7A214FC7E8ABE8691E19B556675"
            java.lang.String r3 = p000.jf0.m2957(r3)
            boolean r1 = p000.x02.m6485(r2, r3, r1)
            if (r1 == 0) goto L35
            int r0 = r0 + 500
        L35:
            java.lang.String r1 = "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F97DDE8AB943128700B29BC878899AC8BAA78D0125812290219B8488"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.Class r2 = r4.getSuperclass()
        L3f:
            if (r2 == 0) goto L5b
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L5b
            java.lang.String r3 = r2.getName()
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L56
            int r0 = r0 + 800
            goto L5b
        L56:
            java.lang.Class r2 = r2.getSuperclass()
            goto L3f
        L5b:
            java.lang.String r1 = "~792CC2D8C5D51E39AD4E690FAB6B92B18C03F97DDE8AB943129306BB91C862D3C2CDFB95A02E64AF3D92229B8488"
            java.lang.String r1 = p000.jf0.m2957(r1)
            boolean r1 = m3833(r4, r1)
            if (r1 == 0) goto L69
            int r0 = r0 + 800
        L69:
            java.lang.String r1 = "android.widget.TextView"
            boolean r1 = m3833(r4, r1)
            if (r1 == 0) goto L73
            int r0 = r0 + 600
        L73:
            java.lang.String r1 = "~7978C51E2BF10182948ED6FF3D5888FCAAC2ED466438382620EDA9BFCFAA4095AC480344D16569A5D8EA89D0EB320675D83C27B049378E1FA69488"
            java.lang.String r1 = p000.jf0.m2957(r1)
            boolean r1 = m3833(r4, r1)
            if (r1 == 0) goto L81
            int r0 = r0 + 400
        L81:
            java.util.ArrayList r4 = m3831(r4)
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L8c
            goto Lab
        L8c:
            java.util.Iterator r4 = r4.iterator()
        L90:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto Lab
            java.lang.Object r1 = r4.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Class r1 = r1.getReturnType()
            r1.getClass()
            boolean r1 = m3834(r1)
            if (r1 == 0) goto L90
            int r0 = r0 + 800
        Lab:
            return r0
    }

    /* JADX INFO: renamed from: μ */
    public static java.lang.String m3838(java.lang.reflect.Method r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            java.lang.String r1 = r6.getName()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.Class[] r1 = r6.getParameterTypes()
            r1.getClass()
            cf1 r2 = new cf1
            r3 = 29
            r2.<init>(r3)
            r3 = 30
            java.lang.String r4 = ","
            r5 = 0
            java.lang.String r1 = p000.AbstractC0312g7.m2256(r1, r4, r5, r2, r3)
            java.lang.String r2 = "):"
            java.lang.String r6 = p000.lz1.m3692(r0, r1, r2, r6)
            return r6
    }

    /* JADX INFO: renamed from: ε */
    public final void m3839(java.lang.reflect.Method r8) {
            r7 = this;
            java.lang.String r0 = m3838(r8)
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = p000.mi1.f7167
            boolean r2 = r1.add(r0)
            if (r2 != 0) goto Ld
            goto L5a
        Ld:
            r2 = 1
            r8.setAccessible(r2)     // Catch: java.lang.Throwable -> L1f
            xq0 r2 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L1f
            ad1 r3 = new ad1     // Catch: java.lang.Throwable -> L1f
            r4 = 8
            r3.<init>(r4, r7)     // Catch: java.lang.Throwable -> L1f
            l01 r7 = r2.m6775(r8, r3)     // Catch: java.lang.Throwable -> L1f
            goto L26
        L1f:
            r7 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r7)
            r7 = r2
        L26:
            boolean r2 = r7 instanceof p000.eo1
            r3 = 4
            java.lang.String r4 = "rb95bed5e6997b6c3"
            r5 = 0
            if (r2 != 0) goto L3e
            r2 = r7
            l01 r2 = (p000.l01) r2
            java.lang.String r2 = m3838(r8)
            java.lang.String r6 = "hooked compose time formatter "
            java.lang.String r2 = r6.concat(r2)
            p000.C0888ux.m5988(r4, r2, r5, r3, r5)
        L3e:
            java.lang.Throwable r7 = p000.fo1.m2190(r7)
            if (r7 == 0) goto L5a
            r1.remove(r0)
            java.lang.String r8 = m3838(r8)
            java.lang.String r7 = r7.getMessage()
            java.lang.String r0 = "compose time formatter hook failed "
            java.lang.String r1 = ": "
            java.lang.String r7 = p000.a12.m18(r0, r8, r1, r7)
            p000.C0888ux.m5988(r4, r7, r5, r3, r5)
        L5a:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m3840(p000.ji1 r8) {
            r7 = this;
            java.lang.reflect.Method r0 = r8.f5478
            java.lang.String r1 = m3838(r0)
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = p000.mi1.f7166
            boolean r3 = r2.add(r1)
            if (r3 != 0) goto Lf
            goto L5a
        Lf:
            r3 = 1
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L1f
            xq0 r3 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L1f
            nh r4 = new nh     // Catch: java.lang.Throwable -> L1f
            r4.<init>(r7, r8)     // Catch: java.lang.Throwable -> L1f
            l01 r7 = r3.m6775(r0, r4)     // Catch: java.lang.Throwable -> L1f
            goto L26
        L1f:
            r7 = move-exception
            eo1 r8 = new eo1
            r8.<init>(r7)
            r7 = r8
        L26:
            boolean r8 = r7 instanceof p000.eo1
            r3 = 4
            java.lang.String r4 = "rb95bed5e6997b6c3"
            r5 = 0
            if (r8 != 0) goto L3e
            r8 = r7
            l01 r8 = (p000.l01) r8
            java.lang.String r8 = m3838(r0)
            java.lang.String r6 = "hooked template time "
            java.lang.String r8 = r6.concat(r8)
            p000.C0888ux.m5988(r4, r8, r5, r3, r5)
        L3e:
            java.lang.Throwable r7 = p000.fo1.m2190(r7)
            if (r7 == 0) goto L5a
            r2.remove(r1)
            java.lang.String r8 = m3838(r0)
            java.lang.String r7 = r7.getMessage()
            java.lang.String r0 = "template time hook failed "
            java.lang.String r1 = ": "
            java.lang.String r7 = p000.a12.m18(r0, r8, r1, r7)
            p000.C0888ux.m5988(r4, r7, r5, r3, r5)
        L5a:
            return
    }

    /* JADX INFO: renamed from: η */
    public final void m3841(java.lang.ClassLoader r14) {
            r13 = this;
            s62 r0 = p000.s62.f9751
            r14.getClass()
            java.lang.String r1 = "precise_time_enabled"
            r2 = 0
            boolean r1 = p000.ui1.m5887(r1, r2)
            r3 = 4
            java.lang.String r4 = "rb95bed5e6997b6c3"
            r5 = 0
            if (r1 != 0) goto L18
            java.lang.String r13 = "feature disabled, skip init"
            p000.C0888ux.m5988(r4, r13, r5, r3, r5)
            return
        L18:
            java.lang.Class r1 = m3836(r14, r2)
            if (r1 != 0) goto L25
            java.lang.String r1 = "time component class not resolved"
            p000.C0888ux.m5988(r4, r1, r5, r3, r5)
            goto L14c
        L25:
            java.lang.String r6 = r1.getName()
            java.util.concurrent.ConcurrentHashMap$KeySetView r7 = p000.mi1.f7165
            boolean r8 = r7.add(r6)
            if (r8 != 0) goto L33
            goto L14c
        L33:
            java.util.ArrayList r8 = m3831(r1)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L40:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L5b
            java.lang.Object r10 = r8.next()
            r11 = r10
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            int r11 = r11.getModifiers()
            boolean r11 = java.lang.reflect.Modifier.isStatic(r11)
            if (r11 != 0) goto L40
            r9.add(r10)
            goto L40
        L5b:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r9.iterator()
        L64:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L81
            java.lang.Object r10 = r9.next()
            r11 = r10
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            java.lang.Class r11 = r11.getReturnType()
            java.lang.Class r12 = java.lang.Void.TYPE
            boolean r11 = p000.ln0.m3626(r11, r12)
            if (r11 != 0) goto L64
            r8.add(r10)
            goto L64
        L81:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L8a:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto La8
            java.lang.Object r10 = r8.next()
            r11 = r10
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            java.lang.Class r11 = r11.getReturnType()
            r11.getClass()
            boolean r11 = m3834(r11)
            if (r11 == 0) goto L8a
            r9.add(r10)
            goto L8a
        La8:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        Lb6:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto Ld1
            java.lang.Object r11 = r9.next()
            r12 = r11
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            java.lang.String r12 = m3838(r12)
            boolean r12 = r8.add(r12)
            if (r12 == 0) goto Lb6
            r10.add(r11)
            goto Lb6
        Ld1:
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto Le8
            r7.remove(r6)
            java.lang.String r1 = r1.getName()
            java.lang.String r6 = "no render-state methods in "
            java.lang.String r1 = r6.concat(r1)
            p000.C0888ux.m5988(r4, r1, r5, r3, r5)
            goto L14c
        Le8:
            java.util.Iterator r6 = r10.iterator()
        Lec:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L12b
            java.lang.Object r7 = r6.next()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            r8 = 1
            r7.setAccessible(r8)     // Catch: java.lang.Throwable -> L10a
            xq0 r8 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L10a
            ad1 r9 = new ad1     // Catch: java.lang.Throwable -> L10a
            r11 = 9
            r9.<init>(r11)     // Catch: java.lang.Throwable -> L10a
            l01 r8 = r8.m6775(r7, r9)     // Catch: java.lang.Throwable -> L10a
            goto L111
        L10a:
            r8 = move-exception
            eo1 r9 = new eo1
            r9.<init>(r8)
            r8 = r9
        L111:
            java.lang.Throwable r8 = p000.fo1.m2190(r8)
            if (r8 == 0) goto Lec
            java.lang.String r7 = m3838(r7)
            java.lang.String r8 = r8.getMessage()
            java.lang.String r9 = "hook method failed "
            java.lang.String r11 = ": "
            java.lang.String r7 = p000.a12.m18(r9, r7, r11, r8)
            p000.C0888ux.m5988(r4, r7, r5, r3, r5)
            goto Lec
        L12b:
            java.lang.String r1 = r1.getName()
            int r6 = r10.size()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "hooked "
            r7.<init>(r8)
            r7.append(r1)
            java.lang.String r1 = ", methods="
            r7.append(r1)
            r7.append(r6)
            java.lang.String r1 = r7.toString()
            p000.C0888ux.m5988(r4, r1, r5, r3, r5)
        L14c:
            ki1 r1 = p000.ki1.f5936     // Catch: java.lang.Throwable -> L166
            java.util.ArrayList r1 = r1.m3280(r14, r2)     // Catch: java.lang.Throwable -> L166
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L166
        L156:
            boolean r6 = r1.hasNext()     // Catch: java.lang.Throwable -> L166
            if (r6 == 0) goto L168
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L166
            ji1 r6 = (p000.ji1) r6     // Catch: java.lang.Throwable -> L166
            r13.m3840(r6)     // Catch: java.lang.Throwable -> L166
            goto L156
        L166:
            r1 = move-exception
            goto L16a
        L168:
            r6 = r0
            goto L16f
        L16a:
            eo1 r6 = new eo1
            r6.<init>(r1)
        L16f:
            java.lang.Throwable r1 = p000.fo1.m2190(r6)
            if (r1 == 0) goto L182
            java.lang.String r1 = r1.getMessage()
            java.lang.String r6 = "template time target init failed: "
            java.lang.String r1 = p000.lz1.m3687(r6, r1)
            p000.C0888ux.m5988(r4, r1, r5, r3, r5)
        L182:
            ki1 r1 = p000.ki1.f5936     // Catch: java.lang.Throwable -> L19c
            java.util.List r14 = r1.m3279(r14, r2)     // Catch: java.lang.Throwable -> L19c
            java.util.Iterator r14 = r14.iterator()     // Catch: java.lang.Throwable -> L19c
        L18c:
            boolean r1 = r14.hasNext()     // Catch: java.lang.Throwable -> L19c
            if (r1 == 0) goto L1a2
            java.lang.Object r1 = r14.next()     // Catch: java.lang.Throwable -> L19c
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L19c
            r13.m3839(r1)     // Catch: java.lang.Throwable -> L19c
            goto L18c
        L19c:
            r13 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r13)
        L1a2:
            java.lang.Throwable r13 = p000.fo1.m2190(r0)
            if (r13 == 0) goto L1b5
            java.lang.String r13 = r13.getMessage()
            java.lang.String r14 = "compose time formatter init failed: "
            java.lang.String r13 = p000.lz1.m3687(r14, r13)
            p000.C0888ux.m5988(r4, r13, r5, r3, r5)
        L1b5:
            return
    }
}
