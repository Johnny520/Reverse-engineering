package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class tu0 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f10462 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f10463 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.tu0.f10462 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.tu0.f10463 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m5741(java.lang.ClassLoader r8) {
            r8.getClass()
            java.lang.String r0 = "live_room_audience_exact_count_enabled"
            r1 = 0
            boolean r0 = p000.ui1.m5887(r0, r1)
            if (r0 != 0) goto L12
            java.lang.String r8 = "r6c8f4583fe180885"
            p000.C0888ux.m5985(r8)
            return
        L12:
            java.util.List r8 = m5745(r8, r1)
            java.util.Iterator r0 = r8.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L71
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r2 = "rc930c7bb0d439311"
            java.lang.String r3 = m5746(r1)
            java.util.concurrent.ConcurrentHashMap$KeySetView r4 = p000.tu0.f10463
            boolean r5 = r4.add(r3)
            if (r5 != 0) goto L35
            goto L1a
        L35:
            r5 = 1
            r1.setAccessible(r5)     // Catch: java.lang.Throwable -> L4f
            xq0 r5 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L4f
            oj0 r6 = new oj0     // Catch: java.lang.Throwable -> L4f
            r7 = 16
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4f
            r5.m6775(r1, r6)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = r2.concat(r3)     // Catch: java.lang.Throwable -> L4f
            p000.C0888ux.m5985(r1)     // Catch: java.lang.Throwable -> L4f
            s62 r1 = p000.s62.f9751     // Catch: java.lang.Throwable -> L4f
            goto L56
        L4f:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L56:
            java.lang.Throwable r1 = p000.fo1.m2190(r1)
            if (r1 == 0) goto L1a
            r4.remove(r3)
            java.lang.String r2 = r1.getMessage()
            java.lang.String r4 = "hook audience exact method failed "
            java.lang.String r5 = ": "
            java.lang.String r2 = p000.a12.m18(r4, r3, r5, r2)
            java.lang.String r3 = "r4ea57b3b3e3b0114"
            p000.C0888ux.m5977(r3, r2, r1)
            goto L1a
        L71:
            int r8 = r8.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "rc77e8c5da37e4ed0"
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            p000.C0888ux.m5985(r8)
            return
    }

    /* JADX INFO: renamed from: β */
    public static boolean m5742(java.lang.reflect.Method r4) {
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 == 0) goto Lc
            goto L6f
        Lc:
            java.lang.Class r0 = r4.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = "~7960BFBA1EAA71B0B732B18FE89CA2FF26F0CCD4E71A81346E342129B47B739A3B2D48C3DA9AAF9220E9711072E13CC575B2E01DD4BE17141FE081E0C3"
            java.lang.String r2 = p000.jf0.m2957(r2)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L31
            java.lang.Class r0 = r4.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = ".LiveRoomAudienceWidget"
            boolean r0 = p000.x02.m6479(r0, r2, r1)
            if (r0 != 0) goto L31
            goto L6f
        L31:
            java.lang.Class[] r0 = r4.getParameterTypes()
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r4 = p000.ln0.m3626(r4, r2)
            if (r4 == 0) goto L6f
            int r4 = r0.length
            r2 = 4
            if (r4 != r2) goto L6f
            r4 = r0[r1]
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r4 = p000.ln0.m3626(r4, r2)
            if (r4 == 0) goto L6f
            r4 = 1
            r2 = r0[r4]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 == 0) goto L6f
            r2 = 2
            r2 = r0[r2]
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 == 0) goto L6f
            r2 = 3
            r0 = r0[r2]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 == 0) goto L6f
            return r4
        L6f:
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.String m5743(java.lang.String r2) {
            java.lang.String r0 = "\u200e"
            java.lang.String r1 = ""
            java.lang.String r2 = p000.x02.m6483(r2, r0, r1)
            java.lang.String r0 = "\u200f"
            java.lang.String r2 = p000.x02.m6483(r2, r0, r1)
            java.lang.String r0 = ","
            java.lang.String r2 = p000.x02.m6483(r2, r0, r1)
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public static java.util.List m5744(java.lang.ClassLoader r5) {
            java.lang.Object r0 = p000.qe0.f8982
            java.lang.String r0 = "~7960BFBA1EAA71B0B732B18FE89CA2FF26F0CCD4E71A81346E342129B47B739A3B2D48C3DA9AAF9220E9711072E13CC575B2E01DD4BE17141FE081E0C3"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r5 = p000.qe0.m4877(r5, r0)
            if (r5 != 0) goto L11
            jz r5 = p000.C0450jz.f5672
            return r5
        L11:
            java.lang.reflect.Method[] r5 = r5.getDeclaredMethods()
            r5.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r5.length
            r2 = 0
        L1f:
            if (r2 >= r1) goto L32
            r3 = r5[r2]
            r3.getClass()
            boolean r4 = m5742(r3)
            if (r4 == 0) goto L2f
            r0.add(r3)
        L2f:
            int r2 = r2 + 1
            goto L1f
        L32:
            java.util.Iterator r5 = r0.iterator()
        L36:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L47
            java.lang.Object r1 = r5.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r2 = 1
            r1.setAccessible(r2)
            goto L36
        L47:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L55:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L73
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            r3.getClass()
            java.lang.String r3 = m5746(r3)
            boolean r3 = r5.add(r3)
            if (r3 == 0) goto L55
            r1.add(r2)
            goto L55
        L73:
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public static java.util.List m5745(java.lang.ClassLoader r7, boolean r8) {
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6236
            java.util.List r1 = p000.C0666ox.m4323(r0, r7)
            r2 = 1
            if (r1 == 0) goto L76
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L12
            goto L76
        L12:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L32
            java.lang.Object r4 = r1.next()
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r5 = m5742(r5)
            if (r5 == 0) goto L1b
            r3.add(r4)
            goto L1b
        L32:
            java.util.Iterator r1 = r3.iterator()
        L36:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L46
            java.lang.Object r4 = r1.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r4.setAccessible(r2)
            goto L36
        L46:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L54:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L6f
            java.lang.Object r5 = r3.next()
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r6 = m5746(r6)
            boolean r6 = r1.add(r6)
            if (r6 == 0) goto L54
            r4.add(r5)
            goto L54
        L6f:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L76
            return r4
        L76:
            java.util.List r1 = m5744(r7)
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto L81
            return r1
        L81:
            if (r8 != 0) goto L84
            goto L8e
        L84:
            java.lang.Object r8 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r8 = p000.C0666ox.f8305
            boolean r8 = r8.get()
            if (r8 != 0) goto L91
        L8e:
            jz r7 = p000.C0450jz.f5672
            return r7
        L91:
            t20 r8 = new t20
            r1 = 12
            r8.<init>(r7, r1)
            java.lang.String r1 = "定位直播间顶部在线人数刷新方法"
            java.util.List r7 = p000.C0666ox.m4316(r0, r7, r1, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        La7:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lbe
            java.lang.Object r0 = r7.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = m5742(r1)
            if (r1 == 0) goto La7
            r8.add(r0)
            goto La7
        Lbe:
            java.util.Iterator r7 = r8.iterator()
        Lc2:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Ld2
            java.lang.Object r0 = r7.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.setAccessible(r2)
            goto Lc2
        Ld2:
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        Le0:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Lfb
            java.lang.Object r1 = r8.next()
            r2 = r1
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.String r2 = m5746(r2)
            boolean r2 = r7.add(r2)
            if (r2 == 0) goto Le0
            r0.add(r1)
            goto Le0
        Lfb:
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.String m5746(java.lang.reflect.Method r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r5.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            java.lang.String r1 = r5.getName()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.Class[] r5 = r5.getParameterTypes()
            r5.getClass()
            gp0 r1 = new gp0
            r2 = 17
            r1.<init>(r2)
            r2 = 30
            java.lang.String r3 = ","
            r4 = 0
            java.lang.String r5 = p000.AbstractC0312g7.m2256(r5, r3, r4, r1, r2)
            java.lang.String r1 = ")"
            java.lang.String r5 = p000.lz1.m3691(r0, r5, r1)
            return r5
    }
}
