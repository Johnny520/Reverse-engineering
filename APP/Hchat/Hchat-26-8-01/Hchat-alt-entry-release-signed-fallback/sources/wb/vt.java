package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f19843a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile java.lang.String f19844b;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            wb.vt.f19843a = r0
            return
    }

    public static wb.yt a(android.content.Context r10) {
            java.lang.String r0 = wb.vt.f19844b
            r1 = 0
            wb.vt.f19844b = r1
            if (r0 == 0) goto L5f
            java.util.concurrent.ConcurrentHashMap r2 = wb.vt.f19843a
            java.lang.Object r2 = r2.get(r0)
            wb.yt r2 = (wb.yt) r2
            if (r2 == 0) goto L12
            return r2
        L12:
            fb.g1 r2 = fb.g1.f3523a
            java.io.File r3 = new java.io.File
            java.io.File r10 = fb.g1.p(r10)
            java.lang.String r0 = fb.g1.m(r0)
            java.lang.String r4 = ".json"
            java.lang.String r0 = r0.concat(r4)
            r3.<init>(r10, r0)
            boolean r10 = r3.isFile()     // Catch: java.lang.Throwable -> L38
            if (r10 == 0) goto L3a
            java.nio.charset.Charset r10 = og.a.f9804a     // Catch: java.lang.Throwable -> L38
            java.lang.String r10 = dg.l.h0(r3, r10)     // Catch: java.lang.Throwable -> L38
            fb.d1 r10 = r2.c(r10)     // Catch: java.lang.Throwable -> L38
            goto L42
        L38:
            r10 = move-exception
            goto L3c
        L3a:
            r10 = r1
            goto L42
        L3c:
            sf.f r0 = new sf.f
            r0.<init>(r10)
            r10 = r0
        L42:
            boolean r0 = r10 instanceof sf.f
            if (r0 == 0) goto L48
            r10 = r1
        L48:
            fb.d1 r10 = (fb.d1) r10
            if (r10 == 0) goto L57
            fb.g1 r0 = fb.g1.f3523a
            java.util.List r0 = r10.f3487e
            boolean r0 = fb.g1.h(r0)
            if (r0 == 0) goto L57
            goto L58
        L57:
            r10 = r1
        L58:
            if (r10 == 0) goto L5e
            wb.yt r1 = d(r10)
        L5e:
            return r1
        L5f:
            fb.g1 r0 = fb.g1.f3523a
            java.util.List r10 = fb.g1.i(r10)
            java.util.Iterator r10 = r10.iterator()
        L69:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Le9
            java.lang.Object r0 = r10.next()
            r2 = r0
            fb.d1 r2 = (fb.d1) r2
            fb.c1 r3 = r2.f3497o
            r4 = 0
            if (r3 == 0) goto Le6
            boolean r5 = r3.f3454f
            if (r5 == 0) goto L80
            goto L81
        L80:
            r3 = r1
        L81:
            if (r3 == 0) goto Le6
            java.util.List r2 = r2.f3487e
            if (r2 == 0) goto L8e
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L8e
            goto Le6
        L8e:
            java.util.Iterator r2 = r2.iterator()
        L92:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto Le6
            java.lang.Object r5 = r2.next()
            fb.c r5 = (fb.c) r5
            java.lang.String r6 = r5.f3434d
            java.lang.String r7 = r3.f3449a
            boolean r6 = gg.l.a(r6, r7)
            r7 = 1
            if (r6 == 0) goto Le2
            java.lang.String r6 = r5.f3444n
            java.lang.String r8 = "interrupted"
            boolean r6 = gg.l.a(r6, r8)
            if (r6 != 0) goto Le0
            java.lang.String r6 = r5.f3444n
            java.lang.String r9 = "error"
            boolean r6 = gg.l.a(r6, r9)
            if (r6 != 0) goto Le0
            java.util.List r5 = r5.f3440j
            if (r5 == 0) goto Lc8
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto Lc8
            goto Le2
        Lc8:
            java.util.Iterator r5 = r5.iterator()
        Lcc:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Le2
            java.lang.Object r6 = r5.next()
            fb.q1 r6 = (fb.q1) r6
            java.lang.String r6 = r6.f3727g
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto Lcc
        Le0:
            r5 = r7
            goto Le3
        Le2:
            r5 = r4
        Le3:
            if (r5 == 0) goto L92
            r4 = r7
        Le6:
            if (r4 == 0) goto L69
            goto Lea
        Le9:
            r0 = r1
        Lea:
            fb.d1 r0 = (fb.d1) r0
            if (r0 == 0) goto Lf3
            wb.yt r10 = d(r0)
            return r10
        Lf3:
            return r1
    }

    public static wb.yt b() {
            fb.g1 r0 = fb.g1.f3523a
            long r4 = java.lang.System.currentTimeMillis()
            fb.d1 r1 = new fb.d1
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r0.getClass()
            java.lang.String r2 = ""
            r3 = 0
            java.lang.String r6 = "-"
            java.lang.String r2 = og.t.a0(r0, r6, r2, r3)
            r11 = 0
            r12 = 65472(0xffc0, float:9.1746E-41)
            java.lang.String r3 = "新对话"
            tf.t r8 = tf.t.f13167g
            r9 = 0
            r10 = 0
            r6 = r4
            r1.<init>(r2, r3, r4, r6, r8, r9, r10, r11, r12)
            wb.yt r0 = d(r1)
            return r0
    }

    public static java.util.ArrayList c() {
            java.util.concurrent.ConcurrentHashMap r0 = wb.vt.f19843a
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r0.next()
            wb.yt r2 = (wb.yt) r2
            r2.getClass()
            fb.d1 r2 = wb.yt.N(r2)
            r1.add(r2)
            goto L18
        L2f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L38:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L53
            java.lang.Object r2 = r1.next()
            r3 = r2
            fb.d1 r3 = (fb.d1) r3
            fb.g1 r4 = fb.g1.f3523a
            java.util.List r3 = r3.f3487e
            boolean r3 = fb.g1.h(r3)
            if (r3 == 0) goto L38
            r0.add(r2)
            goto L38
        L53:
            return r0
    }

    public static wb.yt d(fb.d1 r3) {
            r3.getClass()
            java.lang.String r0 = r3.f3483a
            nb.a r1 = new nb.a
            r2 = 27
            r1.<init>(r3, r2)
            bc.j r3 = new bc.j
            r2 = 13
            r3.<init>(r1, r2)
            java.util.concurrent.ConcurrentHashMap r1 = wb.vt.f19843a
            java.lang.Object r3 = r1.computeIfAbsent(r0, r3)
            r3.getClass()
            wb.yt r3 = (wb.yt) r3
            return r3
    }

    public static java.util.LinkedHashSet e() {
            java.util.concurrent.ConcurrentHashMap r0 = wb.vt.f19843a
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r0.next()
            r3 = r2
            wb.yt r3 = (wb.yt) r3
            boolean r3 = r3.L()
            if (r3 == 0) goto L14
            r1.add(r2)
            goto L14
        L2b:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L34:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r1.next()
            wb.yt r2 = (wb.yt) r2
            java.lang.String r2 = r2.f20473a
            r0.add(r2)
            goto L34
        L46:
            return r0
    }
}
