package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final og.k f3861a = null;

    static {
            og.k r0 = new og.k
            java.lang.String r1 = "^@@\\s+-(\\d+)(?:,\\d+)?\\s+\\+\\d+(?:,\\d+)?\\s+@@.*$"
            r0.<init>(r1)
            fb.y1.f3861a = r0
            return
    }

    public static boolean a(java.util.ArrayList r3, java.util.ArrayList r4, int r5) {
            if (r5 < 0) goto L48
            int r0 = r4.size()
            int r0 = r0 + r5
            int r1 = r3.size()
            if (r0 <= r1) goto Le
            goto L48
        Le:
            lg.d r0 = a.a.X(r4)
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L20
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L20
            goto L46
        L20:
            java.util.Iterator r0 = r0.iterator()
        L24:
            r1 = r0
            lg.c r1 = (lg.c) r1
            boolean r2 = r1.f8047i
            if (r2 == 0) goto L46
            java.lang.Object r1 = r1.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r2 = r5 + r1
            java.lang.Object r2 = r3.get(r2)
            java.lang.Object r1 = r4.get(r1)
            boolean r1 = gg.l.a(r2, r1)
            if (r1 != 0) goto L24
            goto L48
        L46:
            r3 = 1
            return r3
        L48:
            r3 = 0
            return r3
    }

    public static boolean b(java.util.ArrayList r3, java.util.ArrayList r4, int r5) {
            if (r5 < 0) goto L5c
            int r0 = r4.size()
            int r0 = r0 + r5
            int r1 = r3.size()
            if (r0 <= r1) goto Le
            goto L5c
        Le:
            lg.d r0 = a.a.X(r4)
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L20
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L20
            goto L5a
        L20:
            java.util.Iterator r0 = r0.iterator()
        L24:
            r1 = r0
            lg.c r1 = (lg.c) r1
            boolean r2 = r1.f8047i
            if (r2 == 0) goto L5a
            java.lang.Object r1 = r1.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r2 = r5 + r1
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            boolean r1 = gg.l.a(r2, r1)
            if (r1 != 0) goto L24
            goto L5c
        L5a:
            r3 = 1
            return r3
        L5c:
            r3 = 0
            return r3
    }

    public static final java.lang.String c(java.util.LinkedHashMap r1, c0.f r2, java.lang.String r3) {
            boolean r0 = r1.containsKey(r3)
            if (r0 == 0) goto Ld
            java.lang.Object r1 = r1.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            return r1
        Ld:
            java.lang.Object r1 = r2.invoke(r3)
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    public static final void d(java.util.LinkedHashMap r2, java.util.LinkedHashMap r3, fb.w1 r4) {
            java.lang.String r0 = r4.f3842a
            java.lang.String r1 = r4.f3843b
            r2.put(r0, r1)
            r3.put(r0, r4)
            return
    }

    public static void e(java.lang.String r2, java.util.ArrayList r3) {
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            r1 = 32
            boolean r1 = og.m.I0(r0, r1)
            if (r1 != 0) goto L4
            r1 = 43
            boolean r1 = og.m.I0(r0, r1)
            if (r1 != 0) goto L4
            r1 = 45
            boolean r1 = og.m.I0(r0, r1)
            if (r1 != 0) goto L4
            java.lang.String r1 = "\\ No newline at end of file"
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L31
            goto L4
        L31:
            java.lang.String r3 = "补丁行必须以空格、+ 或 - 开头: "
            java.lang.String r2 = wb.en.g(r3, r2)
            j8.o.q(r2)
        L3a:
            return
    }
}
