package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class vj0 {

    /* JADX INFO: renamed from: α */
    public static final p000.vj0 f11310 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f11311 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.ExecutorService f11312 = null;

    /* JADX INFO: renamed from: δ */
    public static volatile p000.tj0 f11313;

    static {
            vj0 r0 = new vj0
            r0.<init>()
            p000.vj0.f11310 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.vj0.f11311 = r0
            aj r0 = new aj
            r1 = 12
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            p000.vj0.f11312 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.util.ArrayList m6247(java.lang.Class r2) {
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

    /* JADX INFO: renamed from: β */
    public static java.lang.String m6248(java.lang.reflect.Method r9) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.annotation.Annotation[] r1 = r9.getAnnotations()
            r1.getClass()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lf:
            r5 = 10
            if (r4 >= r2) goto L1e
            r6 = r1[r4]
            r0.append(r6)
            r0.append(r5)
            int r4 = r4 + 1
            goto Lf
        L1e:
            java.lang.annotation.Annotation[][] r9 = r9.getParameterAnnotations()
            r9.getClass()
            int r1 = r9.length
            r2 = r3
        L27:
            if (r2 >= r1) goto L42
            r4 = r9[r2]
            java.lang.annotation.Annotation[] r4 = (java.lang.annotation.Annotation[]) r4
            r4.getClass()
            int r6 = r4.length
            r7 = r3
        L32:
            if (r7 >= r6) goto L3f
            r8 = r4[r7]
            r0.append(r8)
            r0.append(r5)
            int r7 = r7 + 1
            goto L32
        L3f:
            int r2 = r2 + 1
            goto L27
        L42:
            java.lang.String r9 = r0.toString()
            return r9
    }

    /* JADX INFO: renamed from: δ */
    public static void m6249(java.lang.Object r4, java.util.LinkedHashSet r5, java.util.Set r6) {
            boolean r0 = r6.add(r4)
            if (r0 != 0) goto L8
            goto L8e
        L8:
            java.lang.String r0 = "nid"
            java.lang.Object r0 = m6259(r4, r0)
            boolean r1 = r0 instanceof java.lang.String
            r2 = 0
            if (r1 == 0) goto L16
            java.lang.String r0 = (java.lang.String) r0
            goto L17
        L16:
            r0 = r2
        L17:
            if (r0 == 0) goto L30
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L30
            boolean r1 = p000.q02.m4671(r0)
            if (r1 != 0) goto L2a
            goto L2b
        L2a:
            r0 = r2
        L2b:
            if (r0 == 0) goto L30
            r5.add(r0)
        L30:
            java.lang.String r0 = "noticeFold"
            java.lang.Object r4 = m6259(r4, r0)
            if (r4 != 0) goto L39
            goto L8e
        L39:
            boolean r0 = r6.add(r4)
            if (r0 != 0) goto L40
            goto L8e
        L40:
            java.lang.Class r0 = r4.getClass()
            java.util.ArrayList r0 = m6247(r0)
            java.util.Iterator r0 = r0.iterator()
        L4c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8e
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.Throwable -> L61
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L61
            goto L68
        L61:
            r1 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r1)
            r1 = r3
        L68:
            boolean r3 = r1 instanceof p000.eo1
            if (r3 == 0) goto L6d
            r1 = r2
        L6d:
            boolean r3 = r1 instanceof java.lang.Iterable
            if (r3 == 0) goto L74
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            goto L75
        L74:
            r1 = r2
        L75:
            if (r1 != 0) goto L78
            goto L4c
        L78:
            java.util.ArrayList r1 = p000.AbstractC0984xh.m6637(r1)
            java.util.Iterator r1 = r1.iterator()
        L80:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4c
            java.lang.Object r3 = r1.next()
            m6249(r3, r5, r6)
            goto L80
        L8e:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m6250(p000.sj0 r9, java.lang.String r10) {
            java.lang.reflect.Method r0 = r9.f9935
            java.lang.Object r9 = r9.f9933
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.Object r9 = r0.invoke(r9, r10)
            r10 = 0
            if (r9 != 0) goto L11
            goto L166
        L11:
            long r0 = java.lang.System.nanoTime()
            r2 = 20000000000(0x4a817c800, double:9.881312917E-314)
            long r0 = r0 + r2
            java.lang.Class r2 = r9.getClass()
            java.lang.reflect.Method[] r2 = r2.getMethods()
            r2.getClass()
            int r3 = r2.length
            r4 = r10
        L28:
            r5 = 0
            if (r4 >= r3) goto L47
            r6 = r2[r4]
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = "isCompleted"
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 == 0) goto L44
            java.lang.Class[] r7 = r6.getParameterTypes()
            r7.getClass()
            int r7 = r7.length
            if (r7 != 0) goto L44
            goto L48
        L44:
            int r4 = r4 + 1
            goto L28
        L47:
            r6 = r5
        L48:
            if (r6 == 0) goto L167
        L4a:
            long r2 = java.lang.System.nanoTime()
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L6c
            java.lang.Object r2 = r6.invoke(r9, r5)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L6c
            r2 = 50
            java.lang.Thread.sleep(r2)     // Catch: java.lang.InterruptedException -> L64
            goto L4a
        L64:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            r9.interrupt()
            return r10
        L6c:
            java.lang.Object r0 = r6.invoke(r9, r5)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L7a
            goto L166
        L7a:
            java.lang.Class r0 = r9.getClass()
            java.lang.reflect.Method[] r0 = r0.getMethods()
            r0.getClass()
            int r1 = r0.length
            r2 = r10
        L87:
            if (r2 >= r1) goto La5
            r3 = r0[r2]
            java.lang.String r4 = r3.getName()
            java.lang.String r6 = "isFaulted"
            boolean r4 = p000.ln0.m3626(r4, r6)
            if (r4 == 0) goto La2
            java.lang.Class[] r4 = r3.getParameterTypes()
            r4.getClass()
            int r4 = r4.length
            if (r4 != 0) goto La2
            goto La6
        La2:
            int r2 = r2 + 1
            goto L87
        La5:
            r3 = r5
        La6:
            if (r3 == 0) goto Lb3
            java.lang.Object r0 = r3.invoke(r9, r5)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p000.ln0.m3626(r0, r1)
            goto Lb4
        Lb3:
            r0 = r10
        Lb4:
            if (r0 == 0) goto Lb8
            goto L166
        Lb8:
            java.lang.Class r0 = r9.getClass()
            java.lang.reflect.Method[] r0 = r0.getMethods()
            r0.getClass()
            int r1 = r0.length
            r2 = r10
        Lc5:
            r3 = 1
            if (r2 >= r1) goto Lee
            r4 = r0[r2]
            java.lang.String r6 = r4.getName()
            java.lang.String r7 = "isCancelled"
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 == 0) goto Le7
            java.lang.Class[] r6 = r4.getParameterTypes()
            r6.getClass()
            int r6 = r6.length
            if (r6 != 0) goto Le2
            r6 = r3
            goto Le3
        Le2:
            r6 = r10
        Le3:
            if (r6 == 0) goto Le7
            r6 = r3
            goto Le8
        Le7:
            r6 = r10
        Le8:
            if (r6 == 0) goto Leb
            goto Lef
        Leb:
            int r2 = r2 + 1
            goto Lc5
        Lee:
            r4 = r5
        Lef:
            if (r4 == 0) goto Lfc
            java.lang.Object r0 = r4.invoke(r9, r5)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = p000.ln0.m3626(r0, r1)
            goto Lfd
        Lfc:
            r0 = r10
        Lfd:
            if (r0 == 0) goto L101
            goto L166
        L101:
            java.lang.Class r0 = r9.getClass()
            java.lang.reflect.Method[] r0 = r0.getMethods()
            r0.getClass()
            int r1 = r0.length
            r2 = r10
        L10e:
            if (r2 >= r1) goto L136
            r4 = r0[r2]
            java.lang.String r6 = r4.getName()
            java.lang.String r7 = "getResult"
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 == 0) goto L12f
            java.lang.Class[] r6 = r4.getParameterTypes()
            r6.getClass()
            int r6 = r6.length
            if (r6 != 0) goto L12a
            r6 = r3
            goto L12b
        L12a:
            r6 = r10
        L12b:
            if (r6 == 0) goto L12f
            r6 = r3
            goto L130
        L12f:
            r6 = r10
        L130:
            if (r6 == 0) goto L133
            goto L137
        L133:
            int r2 = r2 + 1
            goto L10e
        L136:
            r4 = r5
        L137:
            if (r4 == 0) goto L166
            java.lang.Object r9 = r4.invoke(r9, r5)
            if (r9 == 0) goto L166
            java.lang.String r0 = "status_code"
            java.lang.String r1 = "statusCode"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            ss1 r0 = p000.AbstractC0312g7.m2232(r0)
            ef r1 = new ef
            r2 = 9
            r1.<init>(r2, r9)
            y30 r9 = p000.us1.m5943(r0, r1)
            java.lang.Object r9 = p000.us1.m5953(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 != 0) goto L15f
            goto L166
        L15f:
            int r9 = r9.intValue()
            if (r9 != 0) goto L166
            return r3
        L166:
            return r10
        L167:
            java.lang.String r9 = "bolts.Task.isCompleted"
            p000.ql1.m4936(r9)
            r9 = 0
            return r9
    }

    /* JADX INFO: renamed from: ζ */
    public static boolean m6251(java.lang.reflect.Method r4) {
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r0 = r4.length
            r1 = 23
            r2 = 0
            if (r0 != r1) goto L32
            r0 = r4[r2]
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L32
            r0 = 1
            r3 = r4[r0]
            boolean r1 = p000.ln0.m3626(r3, r1)
            if (r1 == 0) goto L32
            r1 = 2
            r1 = r4[r1]
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 == 0) goto L32
            r1 = 3
            r4 = r4[r1]
            boolean r4 = p000.ln0.m3626(r4, r3)
            if (r4 == 0) goto L32
            return r0
        L32:
            return r2
    }

    /* JADX INFO: renamed from: η */
    public static boolean m6252(java.lang.reflect.Method r3) {
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 == 0) goto Lc
            goto L44
        Lc:
            java.lang.Class r0 = r3.getReturnType()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = "bolts.Task"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1d
            goto L44
        L1d:
            java.lang.Class[] r0 = r3.getParameterTypes()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 != 0) goto L2e
            goto L44
        L2e:
            java.lang.String r3 = m6248(r3)
            java.lang.String r0 = "/aweme/v1/notice/del/"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 == 0) goto L44
            java.lang.String r0 = "notice_id"
            boolean r3 = p000.q02.m4654(r3, r0, r1)
            if (r3 == 0) goto L44
            r3 = 1
            return r3
        L44:
            return r1
    }

    /* JADX INFO: renamed from: θ */
    public static boolean m6253(java.lang.reflect.Method r7) {
            int r0 = r7.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 == 0) goto Ld
            goto L106
        Ld:
            java.lang.Class r0 = r7.getReturnType()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = "com.google.common.util.concurrent.ListenableFuture"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1f
            goto L106
        L1f:
            boolean r0 = m6251(r7)
            r2 = 1
            if (r0 == 0) goto L28
            goto L105
        L28:
            java.lang.Class[] r0 = r7.getParameterTypes()
            r0.getClass()
            xm0 r0 = p000.AbstractC0312g7.m2251(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L3c:
            r4 = r0
            wm0 r4 = (p000.wm0) r4
            boolean r5 = r4.f11765
            if (r5 == 0) goto L53
            int r4 = r4.nextInt()
            vj0 r5 = p000.vj0.f11310
            java.lang.String r4 = r5.m6266(r4, r7)
            if (r4 == 0) goto L3c
            r3.add(r4)
            goto L3c
        L53:
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = p000.AbstractC1021yh.m6889(r3, r0)
            r7.<init>(r0)
            java.util.Iterator r0 = r3.iterator()
        L62:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L83
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            r3.getClass()
            java.lang.String r4 = "_"
            java.lang.String r5 = ""
            java.lang.String r3 = p000.x02.m6483(r3, r4, r5)
            r7.add(r3)
            goto L62
        L83:
            java.util.Set r7 = p000.AbstractC0984xh.m6671(r7)
            java.lang.String r0 = "maxtime"
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto L9a
            java.lang.String r0 = "maxcursor"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L98
            goto L9a
        L98:
            r0 = r1
            goto L9b
        L9a:
            r0 = r2
        L9b:
            java.lang.String r3 = "mintime"
            boolean r3 = r7.contains(r3)
            if (r3 != 0) goto Lae
            java.lang.String r3 = "mincursor"
            boolean r3 = r7.contains(r3)
            if (r3 == 0) goto Lac
            goto Lae
        Lac:
            r3 = r1
            goto Laf
        Lae:
            r3 = r2
        Laf:
            java.lang.String r4 = "count"
            boolean r4 = r7.contains(r4)
            if (r4 != 0) goto Lc2
            java.lang.String r4 = "pagesize"
            boolean r4 = r7.contains(r4)
            if (r4 == 0) goto Lc0
            goto Lc2
        Lc0:
            r4 = r1
            goto Lc3
        Lc2:
            r4 = r2
        Lc3:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r5 = r7 instanceof java.util.Collection
            if (r5 == 0) goto Ld4
            r5 = r7
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto Ld4
        Ld2:
            r7 = r1
            goto Lfd
        Ld4:
            java.util.Iterator r7 = r7.iterator()
        Ld8:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto Ld2
            java.lang.Object r5 = r7.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "group"
            boolean r6 = p000.ln0.m3626(r5, r6)
            if (r6 != 0) goto Lfc
            java.lang.String r6 = "noticegroup"
            boolean r6 = p000.ln0.m3626(r5, r6)
            if (r6 != 0) goto Lfc
            java.lang.String r6 = "noticetype"
            boolean r5 = p000.ln0.m3626(r5, r6)
            if (r5 == 0) goto Ld8
        Lfc:
            r7 = r2
        Lfd:
            if (r0 == 0) goto L106
            if (r3 == 0) goto L106
            if (r4 == 0) goto L106
            if (r7 == 0) goto L106
        L105:
            return r2
        L106:
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public static java.util.ArrayList m6254(java.lang.Object r17, java.util.List r18) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r18.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 != 0) goto L46
            java.lang.Class r4 = r3.getReturnType()
            java.lang.Class r5 = java.lang.Integer.TYPE
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto L46
            java.lang.Class[] r4 = r3.getParameterTypes()
            r4.getClass()
            int r4 = r4.length
            if (r4 != 0) goto L46
            java.lang.Class r3 = r3.getDeclaringClass()
            r4 = r17
            boolean r3 = r3.isInstance(r4)
            if (r3 == 0) goto L9
            r0.add(r2)
            goto L9
        L46:
            r4 = r17
            goto L9
        L49:
            java.util.Iterator r1 = r0.iterator()
        L4d:
            boolean r2 = r1.hasNext()
            r3 = 1
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r2.setAccessible(r3)
            goto L4d
        L5e:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L6c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lc4
            java.lang.Object r4 = r0.next()
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.String r6 = p000.lz1.m3694(r5)
            java.lang.String r7 = r5.getName()
            java.lang.String r8 = p000.lz1.m3690(r7, r5)
            java.lang.Class[] r9 = r5.getParameterTypes()
            r9.getClass()
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r9.length
            r10.<init>(r11)
            int r11 = r9.length
            r12 = 0
        L94:
            if (r12 >= r11) goto L9d
            r13 = r9[r12]
            int r12 = p000.lz1.m3679(r13, r10, r12, r3)
            goto L94
        L9d:
            int r5 = r5.getModifiers()
            java.lang.reflect.Modifier.isStatic(r5)
            r15 = 0
            r16 = 62
            java.lang.String r11 = ","
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r5 = p000.AbstractC0984xh.m6644(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r9 = "#"
            java.lang.String r10 = "("
            java.lang.StringBuilder r5 = p000.AbstractC0602nx.m4138(r6, r9, r7, r10, r5)
            java.lang.String r6 = "):"
            boolean r5 = p000.lz1.m3673(r5, r6, r8, r1)
            if (r5 == 0) goto L6c
            r2.add(r4)
            goto L6c
        Lc4:
            return r2
    }

    /* JADX INFO: renamed from: λ */
    public static java.util.List m6255(org.luckypray.dexkit.DexKitBridge r3, java.lang.ClassLoader r4, boolean r5) {
            qj0 r0 = new qj0     // Catch: java.lang.Throwable -> L38
            r1 = 1
            r0.<init>(r1, r5)     // Catch: java.lang.Throwable -> L38
            org.luckypray.dexkit.result.MethodDataList r3 = r3.findMethod(r0)     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L38
            r0.<init>()     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L38
        L13:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L38
            org.luckypray.dexkit.result.MethodData r1 = (org.luckypray.dexkit.result.MethodData) r1     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Method r1 = r1.getMethodInstance(r4)     // Catch: java.lang.Throwable -> L24
            goto L2b
        L24:
            r1 = move-exception
            eo1 r2 = new eo1     // Catch: java.lang.Throwable -> L38
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L38
            r1 = r2
        L2b:
            boolean r2 = r1 instanceof p000.eo1     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L30
            r1 = 0
        L30:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L13
            r0.add(r1)     // Catch: java.lang.Throwable -> L38
            goto L13
        L38:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
        L3e:
            java.lang.Throwable r3 = p000.fo1.m2190(r0)
            if (r3 == 0) goto L67
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "DexKit 定位互动删除接口失败 endpoint="
            r4.<init>(r1)
            r4.append(r5)
            java.lang.String r5 = " type="
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "r52bdfd08354d522"
            p000.C0888ux.m5975(r4, r3)
        L67:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L6d
            jz r0 = p000.C0450jz.f5672
        L6d:
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    /* JADX INFO: renamed from: μ */
    public static java.util.List m6256(org.luckypray.dexkit.DexKitBridge r3, java.lang.ClassLoader r4, boolean r5) {
            qj0 r0 = new qj0     // Catch: java.lang.Throwable -> L38
            r1 = 0
            r0.<init>(r1, r5)     // Catch: java.lang.Throwable -> L38
            org.luckypray.dexkit.result.MethodDataList r3 = r3.findMethod(r0)     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L38
            r0.<init>()     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L38
        L13:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L38
            org.luckypray.dexkit.result.MethodData r1 = (org.luckypray.dexkit.result.MethodData) r1     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Method r1 = r1.getMethodInstance(r4)     // Catch: java.lang.Throwable -> L24
            goto L2b
        L24:
            r1 = move-exception
            eo1 r2 = new eo1     // Catch: java.lang.Throwable -> L38
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L38
            r1 = r2
        L2b:
            boolean r2 = r1 instanceof p000.eo1     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L30
            r1 = 0
        L30:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L13
            r0.add(r1)     // Catch: java.lang.Throwable -> L38
            goto L13
        L38:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
        L3e:
            java.lang.Throwable r3 = p000.fo1.m2190(r0)
            if (r3 == 0) goto L67
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "DexKit 定位互动聚合组失败 strict="
            r4.<init>(r1)
            r4.append(r5)
            java.lang.String r5 = " type="
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "r52bdfd08354d522"
            p000.C0888ux.m5975(r4, r3)
        L67:
            boolean r3 = r0 instanceof p000.eo1
            if (r3 == 0) goto L6d
            jz r0 = p000.C0450jz.f5672
        L6d:
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    /* JADX INFO: renamed from: ν */
    public static java.lang.Object m6257(java.lang.reflect.Field r2, java.lang.Class r3) {
            r0 = 0
            if (r2 == 0) goto L2e
            int r1 = r2.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto Le
            goto L2e
        Le:
            r1 = 1
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L21
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1f
            boolean r3 = r3.isInstance(r2)     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L1f
            goto L28
        L1f:
            r2 = r0
            goto L28
        L21:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L28:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L2d
            goto L2e
        L2d:
            r0 = r2
        L2e:
            return r0
    }

    /* JADX INFO: renamed from: ξ */
    public static java.lang.Object m6258(java.lang.Object r2, java.lang.String r3) {
            java.lang.Object r0 = m6259(r2, r3)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.NoSuchFieldException r0 = new java.lang.NoSuchFieldException
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r1 = "#"
            java.lang.String r2 = p000.lz1.m3688(r2, r1, r3)
            r0.<init>(r2)
            throw r0
    }

    /* JADX INFO: renamed from: ο */
    public static java.lang.Object m6259(java.lang.Object r4, java.lang.String r5) {
            java.lang.Class r0 = r4.getClass()
            java.util.ArrayList r0 = m6247(r0)
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            r3 = r1
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.String r3 = r3.getName()
            boolean r3 = p000.ln0.m3626(r3, r5)
            if (r3 == 0) goto Lc
            goto L26
        L25:
            r1 = r2
        L26:
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            if (r1 != 0) goto L2b
            return r2
        L2b:
            r5 = 1
            r1.setAccessible(r5)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L34
            goto L3b
        L34:
            r4 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L3b:
            boolean r5 = r4 instanceof p000.eo1
            if (r5 == 0) goto L40
            goto L41
        L40:
            r2 = r4
        L41:
            return r2
    }

    /* JADX INFO: renamed from: π */
    public static long m6260(java.lang.Object r1, java.lang.String r2) {
            java.lang.Object r1 = m6258(r1, r2)
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto Lb
            java.lang.Number r1 = (java.lang.Number) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto L13
            long r1 = r1.longValue()
            return r1
        L13:
            java.lang.String r1 = "宿主字段 "
            java.lang.String r0 = " 不是 Number"
            java.lang.String r1 = p000.lz1.m3674(r1, r2, r0)
            p000.C1080.m7279(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ρ */
    public static java.util.List m6261(java.lang.Object r6) {
            java.lang.Class r6 = r6.getClass()
            java.lang.reflect.Method[] r6 = r6.getMethods()
            r6.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L12:
            if (r2 >= r1) goto L48
            r3 = r6[r2]
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "LJJJJIZL"
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto L45
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 != 0) goto L45
            java.lang.Class r4 = r3.getReturnType()
            java.lang.Class r5 = java.lang.Integer.TYPE
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto L45
            java.lang.Class[] r4 = r3.getParameterTypes()
            r4.getClass()
            int r4 = r4.length
            if (r4 != 0) goto L45
            r0.add(r3)
        L45:
            int r2 = r2 + 1
            goto L12
        L48:
            r6 = 1
            java.util.List r0 = p000.AbstractC0984xh.m6662(r0, r6)
            java.util.Iterator r1 = r0.iterator()
        L51:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L61
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r2.setAccessible(r6)
            goto L51
        L61:
            return r0
    }

    /* JADX INFO: renamed from: σ */
    public static void m6262(java.lang.ClassLoader r6) {
            java.lang.String r0 = "~7960BFBA0FA02BB4BD37AD83E4D6EDE425E18DDCF4518038363F602FB27277D72D3045CBD1C0F1AC2CEC712C69EB23AA4EB3FE0BEAAF173013EA92E0C5"
            java.lang.String r0 = p000.jf0.m2957(r0)     // Catch: java.lang.Throwable -> L55
            r1 = 0
            java.lang.Class r6 = java.lang.Class.forName(r0, r1, r6)     // Catch: java.lang.Throwable -> L55
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()     // Catch: java.lang.Throwable -> L55
            r6.getClass()     // Catch: java.lang.Throwable -> L55
            int r0 = r6.length     // Catch: java.lang.Throwable -> L55
        L13:
            r2 = 0
            if (r1 >= r0) goto L48
            r3 = r6[r1]     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = r3.getName()     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = "LIZLLL"
            boolean r4 = p000.ln0.m3626(r4, r5)     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L45
            int r4 = r3.getModifiers()     // Catch: java.lang.Throwable -> L55
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L45
            java.lang.Class[] r4 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> L55
            r4.getClass()     // Catch: java.lang.Throwable -> L55
            int r4 = r4.length     // Catch: java.lang.Throwable -> L55
            if (r4 != 0) goto L45
            java.lang.Class r4 = r3.getReturnType()     // Catch: java.lang.Throwable -> L55
            java.lang.Class r5 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L55
            boolean r4 = p000.ln0.m3626(r4, r5)     // Catch: java.lang.Throwable -> L55
            if (r4 == 0) goto L45
            goto L49
        L45:
            int r1 = r1 + 1
            goto L13
        L48:
            r3 = r2
        L49:
            if (r3 != 0) goto L4c
            goto L75
        L4c:
            r6 = 1
            r3.setAccessible(r6)     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r3.invoke(r2, r2)     // Catch: java.lang.Throwable -> L55
            goto L5c
        L55:
            r6 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r6)
            r6 = r0
        L5c:
            java.lang.Throwable r6 = p000.fo1.m2190(r6)
            if (r6 == 0) goto L75
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getSimpleName()
            java.lang.String r0 = "宿主互动消息会话刷新失败 type="
            java.lang.String r6 = r0.concat(r6)
            java.lang.String r0 = "r52bdfd08354d522"
            p000.C0888ux.m5975(r0, r6)
        L75:
            return
    }

    /* JADX INFO: renamed from: τ */
    public static int m6263(java.lang.reflect.Field r2, java.lang.Class r3) {
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto Ld
            r0 = 2000(0x7d0, float:2.803E-42)
            goto Le
        Ld:
            r0 = 0
        Le:
            int r1 = r2.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isFinal(r1)
            if (r1 == 0) goto L1a
            int r0 = r0 + 200
        L1a:
            java.lang.Class r1 = r2.getType()
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 == 0) goto L26
            int r0 = r0 + 2000
        L26:
            java.lang.Object r2 = m6257(r2, r3)
            if (r2 == 0) goto L2e
            int r0 = r0 + 5000
        L2e:
            return r0
    }

    /* JADX INFO: renamed from: υ */
    public static int m6264(java.lang.reflect.Method r5) {
            java.lang.Class r0 = r5.getReturnType()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.google.common.util.concurrent.ListenableFuture"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L13
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L14
        L13:
            r0 = 0
        L14:
            boolean r1 = m6251(r5)
            if (r1 == 0) goto L1c
            int r0 = r0 + 3000
        L1c:
            java.lang.Class[] r1 = r5.getParameterTypes()
            r1.getClass()
            xm0 r1 = p000.AbstractC0312g7.m2251(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L30:
            r3 = r1
            wm0 r3 = (p000.wm0) r3
            boolean r4 = r3.f11765
            if (r4 == 0) goto L47
            int r3 = r3.nextInt()
            vj0 r4 = p000.vj0.f11310
            java.lang.String r3 = r4.m6266(r3, r5)
            if (r3 == 0) goto L30
            r2.add(r3)
            goto L30
        L47:
            java.util.ArrayList r5 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r2, r1)
            r5.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
        L56:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L77
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r3)
            r2.getClass()
            java.lang.String r3 = "_"
            java.lang.String r4 = ""
            java.lang.String r2 = p000.x02.m6483(r2, r3, r4)
            r5.add(r2)
            goto L56
        L77:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L7e
            goto La0
        L7e:
            java.util.Iterator r1 = r5.iterator()
        L82:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La0
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "maxtime"
            boolean r3 = p000.ln0.m3626(r2, r3)
            if (r3 != 0) goto L9e
            java.lang.String r3 = "maxcursor"
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 == 0) goto L82
        L9e:
            int r0 = r0 + 500
        La0:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto La7
            goto Lc9
        La7:
            java.util.Iterator r1 = r5.iterator()
        Lab:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc9
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "mintime"
            boolean r3 = p000.ln0.m3626(r2, r3)
            if (r3 != 0) goto Lc7
            java.lang.String r3 = "mincursor"
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 == 0) goto Lab
        Lc7:
            int r0 = r0 + 500
        Lc9:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto Ld0
            goto Lf2
        Ld0:
            java.util.Iterator r1 = r5.iterator()
        Ld4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lf2
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "count"
            boolean r3 = p000.ln0.m3626(r2, r3)
            if (r3 != 0) goto Lf0
            java.lang.String r3 = "pagesize"
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 == 0) goto Ld4
        Lf0:
            int r0 = r0 + 500
        Lf2:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto Lf9
            goto L123
        Lf9:
            java.util.Iterator r5 = r5.iterator()
        Lfd:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L123
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "group"
            boolean r2 = p000.ln0.m3626(r1, r2)
            if (r2 != 0) goto L121
            java.lang.String r2 = "noticegroup"
            boolean r2 = p000.ln0.m3626(r1, r2)
            if (r2 != 0) goto L121
            java.lang.String r2 = "noticetype"
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto Lfd
        L121:
            int r0 = r0 + 500
        L123:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final p000.uj0 m6265(p000.ji0 r38, java.lang.ClassLoader r39) {
            r37 = this;
            r1 = r37
            r2 = r39
            monitor-enter(r37)
            tj0 r0 = p000.vj0.f11313     // Catch: java.lang.Throwable -> L1a
            r3 = 0
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L1d
            java.lang.ClassLoader r6 = r0.f10397     // Catch: java.lang.Throwable -> L1a
            if (r6 != r2) goto L11
            goto L12
        L11:
            r0 = r5
        L12:
            if (r0 == 0) goto L1d
            sj0 r0 = r0.f10398     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r37)
        L17:
            r1 = r0
            goto Ld6
        L1a:
            r0 = move-exception
            goto L50c
        L1d:
            jz r0 = p000.C0450jz.f5672     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r6 = p000.C0666ox.f8297     // Catch: java.lang.Throwable -> L1a
            kx r6 = p000.EnumC0491kx.f6283     // Catch: java.lang.Throwable -> L1a
            java.util.List r7 = p000.C0666ox.m4323(r6, r2)     // Catch: java.lang.Throwable -> L1a
            if (r7 != 0) goto L2a
            r7 = r0
        L2a:
            java.util.List r7 = r1.m6267(r7)     // Catch: java.lang.Throwable -> L1a
            int r8 = r7.size()     // Catch: java.lang.Throwable -> L1a
            r9 = 2
            if (r8 != r9) goto L36
            goto L37
        L36:
            r7 = r5
        L37:
            if (r7 == 0) goto L3b
            r0 = r7
            goto L54
        L3b:
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.C0666ox.f8305     // Catch: java.lang.Throwable -> L1a
            boolean r7 = r7.get()     // Catch: java.lang.Throwable -> L1a
            if (r7 != 0) goto L44
            goto L54
        L44:
            java.lang.String r0 = "定位互动消息分页与服务端删除接口"
            t20 r7 = new t20     // Catch: java.lang.Throwable -> L1a
            r8 = 4
            r7.<init>(r2, r8)     // Catch: java.lang.Throwable -> L1a
            java.util.List r0 = p000.C0666ox.m4316(r6, r2, r0, r7)     // Catch: java.lang.Throwable -> L1a
            java.util.List r0 = r1.m6267(r0)     // Catch: java.lang.Throwable -> L1a
        L54:
            java.util.List r0 = r1.m6267(r0)     // Catch: java.lang.Throwable -> L1a
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L1a
            if (r6 != r9) goto L504
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> L1a
        L62:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L1a
            if (r7 == 0) goto L4fc
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L1a
            r8 = r7
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> L1a
            boolean r8 = m6252(r8)     // Catch: java.lang.Throwable -> L1a
            if (r8 == 0) goto L4f2
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch: java.lang.Throwable -> L1a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1a
        L7b:
            boolean r6 = r0.hasNext()     // Catch: java.lang.Throwable -> L1a
            if (r6 == 0) goto L4ea
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Throwable -> L1a
            r8 = r6
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> L1a
            boolean r8 = m6253(r8)     // Catch: java.lang.Throwable -> L1a
            if (r8 == 0) goto L4e0
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> L1a
            java.lang.Class r0 = r7.getDeclaringClass()     // Catch: java.lang.Throwable -> L1a
            r0.getClass()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r8 = p000.C0666ox.f8297     // Catch: java.lang.Throwable -> L1a
            kx r8 = p000.EnumC0491kx.f6284     // Catch: java.lang.Throwable -> L1a
            java.lang.reflect.Field r9 = p000.C0666ox.m4322(r8, r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r9 = m6257(r9, r0)     // Catch: java.lang.Throwable -> L1a
            if (r9 == 0) goto La6
            goto Lbf
        La6:
            java.util.concurrent.atomic.AtomicBoolean r9 = p000.C0666ox.f8305     // Catch: java.lang.Throwable -> L1a
            boolean r9 = r9.get()     // Catch: java.lang.Throwable -> L1a
            if (r9 != 0) goto Lb0
            r9 = r5
            goto Lbf
        Lb0:
            java.lang.String r9 = "定位互动消息原生 API 客户端字段"
            rj0 r10 = new rj0     // Catch: java.lang.Throwable -> L1a
            r10.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> L1a
            java.lang.reflect.Field r8 = p000.C0666ox.m4315(r8, r2, r9, r10)     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r9 = m6257(r8, r0)     // Catch: java.lang.Throwable -> L1a
        Lbf:
            if (r9 == 0) goto L4d8
            r7.setAccessible(r4)     // Catch: java.lang.Throwable -> L1a
            r6.setAccessible(r4)     // Catch: java.lang.Throwable -> L1a
            sj0 r0 = new sj0     // Catch: java.lang.Throwable -> L1a
            r0.<init>(r9, r6, r7)     // Catch: java.lang.Throwable -> L1a
            tj0 r6 = new tj0     // Catch: java.lang.Throwable -> L1a
            r6.<init>(r2, r0)     // Catch: java.lang.Throwable -> L1a
            p000.vj0.f11313 = r6     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r37)
            goto L17
        Ld6:
            java.lang.String r0 = "com.im.platform.PlatformAbility"
            java.lang.Class r0 = java.lang.Class.forName(r0, r3, r2)
            java.lang.String r6 = "getSocialNotice"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r6, r5)
            java.lang.Object r6 = r0.invoke(r5, r5)
            if (r6 == 0) goto L4d0
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6285
            java.util.List r7 = p000.C0666ox.m4323(r0, r2)
            if (r7 != 0) goto Lf4
            jz r7 = p000.C0450jz.f5672
        Lf4:
            java.util.ArrayList r7 = m6254(r6, r7)
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto Lff
            goto L100
        Lff:
            r7 = r5
        L100:
            if (r7 == 0) goto L103
            goto L12a
        L103:
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.C0666ox.f8305
            boolean r7 = r7.get()
            if (r7 == 0) goto L126
            java.lang.String r7 = "定位互动消息动态聚合组访问器"
            ej0 r8 = new ej0
            r8.<init>(r2, r6, r4)
            java.util.List r0 = p000.C0666ox.m4316(r0, r2, r7, r8)
            java.util.ArrayList r0 = m6254(r6, r0)
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto L122
            r7 = r0
            goto L123
        L122:
            r7 = r5
        L123:
            if (r7 == 0) goto L126
            goto L12a
        L126:
            java.util.List r7 = m6261(r6)
        L12a:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L133:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L17a
            java.lang.Object r0 = r7.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.setAccessible(r4)     // Catch: java.lang.Throwable -> L14d
            java.lang.Object r0 = r0.invoke(r6, r5)     // Catch: java.lang.Throwable -> L14d
            boolean r9 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L14d
            if (r9 == 0) goto L14f
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L14d
            goto L150
        L14d:
            r0 = move-exception
            goto L15d
        L14f:
            r0 = r5
        L150:
            if (r0 == 0) goto L15b
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L14d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L14d
            goto L163
        L15b:
            r0 = r5
            goto L163
        L15d:
            eo1 r9 = new eo1
            r9.<init>(r0)
            r0 = r9
        L163:
            boolean r9 = r0 instanceof p000.eo1
            if (r9 == 0) goto L168
            r0 = r5
        L168:
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L173
            int r9 = r0.intValue()
            if (r9 <= 0) goto L173
            goto L174
        L173:
            r0 = r5
        L174:
            if (r0 == 0) goto L133
            r8.add(r0)
            goto L133
        L17a:
            java.util.Set r0 = p000.AbstractC0984xh.m6670(r8)
            java.util.List r0 = p000.AbstractC0984xh.m6666(r0)
            java.lang.Object r0 = p000.AbstractC0984xh.m6656(r0)
            r9 = r0
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L4c8
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r29 = 0
            r6 = r3
            r31 = r29
            r33 = r31
        L197:
            r7 = 80
            if (r6 >= r7) goto L4c0
            vj0 r7 = p000.vj0.f11310
            java.lang.Class r8 = java.lang.Long.TYPE
            java.lang.reflect.Method r10 = r1.f9934
            r11 = 20
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = r8
            r8 = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            r13 = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            boolean r14 = m6251(r10)
            if (r14 == 0) goto L200
            r14 = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r31)
            java.lang.Long r7 = java.lang.Long.valueOf(r33)
            java.lang.String r15 = ""
            java.lang.String r16 = ""
            java.lang.String r19 = ""
            java.lang.String r21 = ""
            r24 = 0
            r27 = 0
            r10 = 0
            r17 = 0
            r18 = r13
            r13 = r12
            r20 = r14
            r14 = r11
            r22 = r18
            r18 = r12
            r23 = r20
            r20 = r12
            r25 = r22
            r22 = r12
            r26 = r23
            r23 = r12
            r28 = r25
            r25 = r12
            r35 = r26
            r26 = r12
            r36 = r28
            r28 = r12
            r4 = r35
            r35 = r5
            r5 = r36
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28}
            r18 = r3
            goto L32e
        L200:
            r35 = r5
            r4 = r6
            r5 = r13
            java.lang.Class[] r6 = r10.getParameterTypes()
            int r6 = r6.length
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r13 = r3
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
        L212:
            if (r13 >= r6) goto L323
            r18 = r3
            java.lang.String r3 = r7.m6266(r13, r10)
            if (r3 == 0) goto L230
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r2 = r3.toLowerCase(r2)
            r2.getClass()
            java.lang.String r3 = "_"
            r19 = r6
            java.lang.String r6 = ""
            java.lang.String r2 = p000.x02.m6483(r2, r3, r6)
            goto L234
        L230:
            r19 = r6
            r2 = r35
        L234:
            if (r2 != 0) goto L238
            java.lang.String r2 = ""
        L238:
            int r3 = r2.hashCode()
            switch(r3) {
                case -1268319726: goto L29c;
                case -675420505: goto L293;
                case -118022726: goto L283;
                case 94851343: goto L275;
                case 98629247: goto L26c;
                case 654455848: goto L25c;
                case 845063729: goto L253;
                case 860381968: goto L24a;
                case 1064861727: goto L241;
                default: goto L23f;
            }
        L23f:
            goto L2a4
        L241:
            java.lang.String r3 = "mintime"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L265
            goto L2a4
        L24a:
            java.lang.String r3 = "pagesize"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L27e
            goto L2a4
        L253:
            java.lang.String r3 = "maxtime"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L28c
            goto L2a4
        L25c:
            java.lang.String r3 = "mincursor"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L265
            goto L2a4
        L265:
            java.lang.Long r2 = java.lang.Long.valueOf(r33)
            r15 = 1
            goto L317
        L26c:
            java.lang.String r3 = "group"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L314
            goto L2a4
        L275:
            java.lang.String r3 = "count"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L27e
            goto L2a4
        L27e:
            r2 = r8
            r16 = 1
            goto L317
        L283:
            java.lang.String r3 = "maxcursor"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L28c
            goto L2a4
        L28c:
            java.lang.Long r2 = java.lang.Long.valueOf(r31)
            r14 = 1
            goto L317
        L293:
            java.lang.String r3 = "noticegroup"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L314
            goto L2a4
        L29c:
            java.lang.String r3 = "noticetype"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L314
        L2a4:
            java.lang.Class[] r2 = r10.getParameterTypes()
            r2 = r2[r13]
            r2.getClass()
            java.lang.Class r3 = java.lang.Boolean.TYPE
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L2b8
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L317
        L2b8:
            java.lang.Class r3 = java.lang.Byte.TYPE
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L2c5
            java.lang.Byte r2 = java.lang.Byte.valueOf(r18)
            goto L317
        L2c5:
            java.lang.Class r3 = java.lang.Short.TYPE
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L2d2
            java.lang.Short r2 = java.lang.Short.valueOf(r18)
            goto L317
        L2d2:
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L2dc
            r2 = r12
            goto L317
        L2dc:
            boolean r3 = r2.equals(r5)
            if (r3 == 0) goto L2e7
            java.lang.Long r2 = java.lang.Long.valueOf(r29)
            goto L317
        L2e7:
            java.lang.Class r3 = java.lang.Float.TYPE
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L2f5
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L317
        L2f5:
            java.lang.Class r3 = java.lang.Double.TYPE
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L304
            r2 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            goto L317
        L304:
            java.lang.Class r3 = java.lang.Character.TYPE
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L311
            java.lang.Character r2 = java.lang.Character.valueOf(r18)
            goto L317
        L311:
            r2 = r35
            goto L317
        L314:
            r2 = r9
            r17 = 1
        L317:
            r11[r13] = r2
            int r13 = r13 + 1
            r2 = r39
            r3 = r18
            r6 = r19
            goto L212
        L323:
            r18 = r3
            if (r14 == 0) goto L4ba
            if (r15 == 0) goto L4ba
            if (r16 == 0) goto L4ba
            if (r17 == 0) goto L4ba
            r6 = r11
        L32e:
            java.lang.reflect.Method r2 = r1.f9934
            java.lang.Object r3 = r1.f9933
            int r7 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.Object r2 = r2.invoke(r3, r6)
            if (r2 == 0) goto L4b4
            java.lang.Class r3 = r2.getClass()
            java.lang.reflect.Method[] r3 = r3.getMethods()
            r3.getClass()
            int r6 = r3.length
            r7 = r18
        L34b:
            if (r7 >= r6) goto L36f
            r8 = r3[r7]
            java.lang.String r10 = r8.getName()
            java.lang.String r11 = "get"
            boolean r10 = p000.ln0.m3626(r10, r11)
            if (r10 == 0) goto L36c
            java.lang.Class[] r10 = r8.getParameterTypes()
            java.lang.Class<java.util.concurrent.TimeUnit> r11 = java.util.concurrent.TimeUnit.class
            java.lang.Class[] r11 = new java.lang.Class[]{r5, r11}
            boolean r10 = java.util.Arrays.equals(r10, r11)
            if (r10 == 0) goto L36c
            goto L371
        L36c:
            int r7 = r7 + 1
            goto L34b
        L36f:
            r8 = r35
        L371:
            if (r8 == 0) goto L4ae
            r5 = 20
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r5}
            java.lang.Object r2 = r8.invoke(r2, r3)
            if (r2 == 0) goto L4a8
            java.lang.String r3 = "items"
            java.lang.Object r3 = m6258(r2, r3)
            boolean r5 = r3 instanceof java.lang.Iterable
            if (r5 == 0) goto L392
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            goto L394
        L392:
            r3 = r35
        L394:
            if (r3 != 0) goto L398
            jz r3 = p000.C0450jz.f5672
        L398:
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            java.util.IdentityHashMap r6 = new java.util.IdentityHashMap
            r6.<init>()
            java.util.Set r6 = java.util.Collections.newSetFromMap(r6)
            java.util.ArrayList r3 = p000.AbstractC0984xh.m6637(r3)
            java.util.Iterator r3 = r3.iterator()
        L3ae:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L3bf
            java.lang.Object r7 = r3.next()
            r6.getClass()
            m6249(r7, r5, r6)
            goto L3ae
        L3bf:
            java.util.List r3 = p000.AbstractC0984xh.m6666(r5)
            java.lang.String r5 = "hasMore"
            java.lang.Object r5 = m6258(r2, r5)
            boolean r6 = r5 instanceof java.lang.Boolean
            if (r6 == 0) goto L3d0
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            goto L3d2
        L3d0:
            r5 = r35
        L3d2:
            if (r5 == 0) goto L4a2
            boolean r5 = r5.booleanValue()
            java.lang.String r6 = "maxTime"
            long r6 = m6260(r2, r6)
            java.lang.String r8 = "minTime"
            long r10 = m6260(r2, r8)
            p000.AbstractC0984xh.m6660(r0, r3)
            if (r5 != 0) goto L477
            java.util.List r2 = p000.AbstractC0984xh.m6666(r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L3fe
            m6262(r39)
            uj0 r0 = new uj0
            r3 = r18
            r0.<init>(r3, r3, r3)
            return r0
        L3fe:
            r3 = r18
            java.util.Iterator r4 = r2.iterator()
            r0 = r3
        L405:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L465
            java.lang.Object r5 = r4.next()
            int r6 = r0 + 1
            if (r0 < 0) goto L461
            java.lang.String r5 = (java.lang.String) r5
            boolean r0 = m6250(r1, r5)     // Catch: java.lang.Throwable -> L41e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L41e
            goto L425
        L41e:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L425:
            java.lang.Throwable r5 = p000.fo1.m2190(r0)
            if (r5 == 0) goto L43e
            java.lang.String r7 = "r52bdfd08354d522"
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getSimpleName()
            java.lang.String r8 = "单条互动消息服务端删除失败 type="
            java.lang.String r5 = r8.concat(r5)
            p000.C0888ux.m5975(r7, r5)
        L43e:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r7 = r0 instanceof p000.eo1
            if (r7 == 0) goto L445
            r0 = r5
        L445:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L44f
            int r3 = r3 + 1
        L44f:
            int r0 = r2.size()
            r5 = r38
            li0 r7 = r5.f5477
            ki0 r8 = new ki0
            r8.<init>(r7, r6, r0, r3)
            r7.m3571(r8)
            r0 = r6
            goto L405
        L461:
            p000.AbstractC1021yh.m6917()
            throw r35
        L465:
            m6262(r39)
            uj0 r0 = new uj0
            int r1 = r2.size()
            int r2 = r2.size()
            int r2 = r2 - r3
            r0.<init>(r1, r3, r2)
            return r0
        L477:
            r5 = r38
            r3 = r18
            int r2 = (r6 > r31 ? 1 : (r6 == r31 ? 0 : -1))
            if (r2 != 0) goto L48a
            int r2 = (r10 > r33 ? 1 : (r10 == r33 ? 0 : -1))
            if (r2 == 0) goto L484
            goto L48a
        L484:
            java.lang.String r0 = "互动消息分页游标未推进，已在删除前停止"
            p000.C1080.m7279(r0)
            return r35
        L48a:
            r2 = 79
            if (r4 == r2) goto L49c
            int r2 = r4 + 1
            r31 = r6
            r33 = r10
            r5 = r35
            r4 = 1
            r6 = r2
            r2 = r39
            goto L197
        L49c:
            java.lang.String r0 = "互动消息超过分页保护上限，未执行删除"
            p000.C1080.m7279(r0)
            return r35
        L4a2:
            java.lang.String r0 = "宿主字段 hasMore 不是 Boolean"
            p000.C1080.m7279(r0)
            return r35
        L4a8:
            java.lang.String r0 = "宿主互动消息分页响应为空"
            p000.C1080.m7279(r0)
            return r35
        L4ae:
            java.lang.String r0 = "ListenableFuture.get(long, TimeUnit)"
            p000.ql1.m4936(r0)
            return r35
        L4b4:
            java.lang.String r0 = "宿主互动消息分页请求返回空 Future"
            p000.C1080.m7279(r0)
            return r35
        L4ba:
            java.lang.String r0 = "当前抖音版本互动消息分页参数无法安全映射"
            p000.C1080.m7279(r0)
            return r35
        L4c0:
            r35 = r5
            java.lang.String r0 = "互动消息分页未正常结束"
            p000.C1080.m7279(r0)
            return r35
        L4c8:
            r35 = r5
            java.lang.String r0 = "宿主互动聚合组访问器缺失或结果不唯一"
            p000.C1080.m7279(r0)
            return r35
        L4d0:
            r35 = r5
            java.lang.String r0 = "宿主 SocialNotice 能力不可用"
            p000.C1080.m7279(r0)
            return r35
        L4d8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "当前抖音版本未找到原生互动消息 API 客户端"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1a
            throw r0     // Catch: java.lang.Throwable -> L1a
        L4e0:
            r35 = r5
            r5 = r38
            r2 = r39
            r5 = r35
            goto L7b
        L4ea:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "Collection contains no element matching the predicate."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1a
            throw r0     // Catch: java.lang.Throwable -> L1a
        L4f2:
            r35 = r5
            r5 = r38
            r2 = r39
            r5 = r35
            goto L62
        L4fc:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "Collection contains no element matching the predicate."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1a
            throw r0     // Catch: java.lang.Throwable -> L1a
        L504:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "当前抖音版本未找到原生互动消息服务端删除接口"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1a
            throw r0     // Catch: java.lang.Throwable -> L1a
        L50c:
            monitor-exit(r37)     // Catch: java.lang.Throwable -> L1a
            throw r0
    }

    /* JADX INFO: renamed from: κ */
    public final java.lang.String m6266(int r9, java.lang.reflect.Method r10) {
            r8 = this;
            java.lang.annotation.Annotation[][] r10 = r10.getParameterAnnotations()
            r10.getClass()
            java.lang.Object r9 = p000.AbstractC0312g7.m2253(r9, r10)
            java.lang.annotation.Annotation[] r9 = (java.lang.annotation.Annotation[]) r9
            r10 = 0
            if (r9 == 0) goto L43
            ss1 r9 = p000.AbstractC0312g7.m2232(r9)
            ng r0 = new ng
            r6 = 0
            r7 = 19
            r1 = 1
            java.lang.Class<vj0> r3 = p000.vj0.class
            java.lang.String r4 = "annotationValue"
            java.lang.String r5 = "annotationValue(Ljava/lang/annotation/Annotation;)Ljava/lang/String;"
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            y30 r8 = p000.us1.m5943(r9, r0)
            x30 r9 = new x30
            r9.<init>(r8)
        L2d:
            boolean r8 = r9.hasNext()
            if (r8 == 0) goto L41
            java.lang.Object r8 = r9.next()
            r0 = r8
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = p000.q02.m4671(r0)
            if (r0 != 0) goto L2d
            r10 = r8
        L41:
            java.lang.String r10 = (java.lang.String) r10
        L43:
            return r10
    }

    /* JADX INFO: renamed from: φ */
    public final java.util.List m6267(java.util.List r19) {
            r18 = this;
            f7 r0 = new f7
            r1 = 1
            r2 = r19
            r0.<init>(r1, r2)
            ng r2 = new ng
            r8 = 0
            r9 = 20
            r3 = 1
            java.lang.Class<vj0> r5 = p000.vj0.class
            java.lang.String r6 = "isNoticeDeleteMethod"
            java.lang.String r7 = "isNoticeDeleteMethod(Ljava/lang/reflect/Method;)Z"
            r4 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            y30 r1 = new y30
            r1.<init>(r0, r3, r2)
            fj0 r0 = new fj0
            r2 = 3
            r0.<init>(r2)
            cu r2 = new cu
            r4 = 0
            r2.<init>(r1, r4, r0)
            fj0 r0 = new fj0
            r1 = 4
            r0.<init>(r1)
            y30 r0 = p000.us1.m5943(r2, r0)
            fj0 r1 = new fj0
            r2 = 5
            r1.<init>(r2)
            y30 r2 = new y30
            r2.<init>(r0, r3, r1)
            uh0 r0 = new uh0
            r1 = 3
            r0.<init>(r1)
            java.util.List r1 = p000.us1.m5949(r2)
            p000.AbstractC0019ai.m168(r1, r0)
            java.util.Iterator r0 = r1.iterator()
            boolean r1 = r0.hasNext()
            jz r2 = p000.C0450jz.f5672
            if (r1 != 0) goto L5a
            r0 = r2
            goto L7c
        L5a:
            java.lang.Object r1 = r0.next()
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto L69
            java.util.List r0 = p000.AbstractC1021yh.m6896(r1)
            goto L7c
        L69:
            java.util.ArrayList r1 = p000.lz1.m3696(r1)
        L6d:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L7b
            java.lang.Object r4 = r0.next()
            r1.add(r4)
            goto L6d
        L7b:
            r0 = r1
        L7c:
            java.lang.Object r0 = p000.AbstractC0984xh.m6640(r0)
            d62 r0 = (p000.d62) r0
            if (r0 != 0) goto L85
            return r2
        L85:
            r1 = 2
            java.lang.reflect.Method[] r1 = new java.lang.reflect.Method[r1]
            java.lang.Object r2 = r0.f2926
            r4 = 0
            r1[r4] = r2
            java.lang.Object r0 = r0.f2927
            r1[r3] = r0
            java.util.List r0 = p000.AbstractC1021yh.m6897(r1)
            java.util.Iterator r1 = r0.iterator()
        L99:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La9
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r2.setAccessible(r3)
            goto L99
        La9:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lb7:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L110
            java.lang.Object r5 = r0.next()
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r7 = p000.lz1.m3694(r6)
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = p000.lz1.m3690(r8, r6)
            java.lang.Class[] r10 = r6.getParameterTypes()
            r10.getClass()
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = r10.length
            r11.<init>(r12)
            int r12 = r10.length
            r13 = r4
        Ldf:
            if (r13 >= r12) goto Le8
            r14 = r10[r13]
            int r13 = p000.lz1.m3679(r14, r11, r13, r3)
            goto Ldf
        Le8:
            int r6 = r6.getModifiers()
            java.lang.reflect.Modifier.isStatic(r6)
            r16 = 0
            r17 = 62
            java.lang.String r12 = ","
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.String r6 = p000.AbstractC0984xh.m6644(r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r10 = "#"
            java.lang.String r11 = "("
            java.lang.StringBuilder r6 = p000.AbstractC0602nx.m4138(r7, r10, r8, r11, r6)
            java.lang.String r7 = "):"
            boolean r6 = p000.lz1.m3673(r6, r7, r9, r1)
            if (r6 == 0) goto Lb7
            r2.add(r5)
            goto Lb7
        L110:
            return r2
    }
}
