package kd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7574e;

    public static java.lang.String d(java.lang.String r5) {
            r0 = 46
            int r0 = r5.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r5 = r5.substring(r0)
            xe.q r0 = xe.q.f21574b
            r0 = 36
            int r1 = r5.indexOf(r0)
            r2 = -1
            if (r1 != r2) goto L18
            return r5
        L18:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r4 = r5.length()
            r3.<init>(r4)
            r4 = 0
        L22:
            r3.append(r5, r4, r1)
            int r4 = r1 + 1
            int r1 = r5.indexOf(r0, r4)
            if (r1 != r2) goto L22
            int r0 = r5.length()
            r3.append(r5, r4, r0)
            java.lang.String r5 = r3.toString()
            return r5
    }

    public final java.lang.String a(ud.e r6) {
            r5 = this;
            boolean r0 = r6.c0()
            if (r0 == 0) goto La
            java.lang.String r0 = "Enum"
            goto L9b
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            b5.k r1 = r6.f13692o
            boolean r1 = r1.d()
            if (r1 == 0) goto L1d
            java.lang.String r1 = "Interface"
            r0.append(r1)
            goto L2a
        L1d:
            b5.k r1 = r6.f13692o
            int r1 = r1.f488b
            r1 = r1 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L2a
            java.lang.String r1 = "Abstract"
            r0.append(r1)
        L2a:
            r1 = r6
        L2b:
            if (r1 == 0) goto L92
            qd.j r1 = r1.f13693p
            if (r1 == 0) goto L4a
            java.lang.String r2 = r1.l()
            java.lang.String r3 = "android.app."
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L45
            java.lang.String r3 = "android.os."
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L4a
        L45:
            java.lang.String r1 = d(r2)
            goto L94
        L4a:
            java.util.List r2 = r6.f13694q
            java.util.Iterator r2 = r2.iterator()
        L50:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L88
            java.lang.Object r3 = r2.next()
            qd.j r3 = (qd.j) r3
            java.lang.String r3 = r3.l()
            java.lang.String r4 = "java.lang.Runnable"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L6b
            java.lang.String r1 = "Runnable"
            goto L94
        L6b:
            java.lang.String r4 = "java.util.concurrent."
            boolean r4 = r3.startsWith(r4)
            if (r4 != 0) goto L83
            java.lang.String r4 = "android.view."
            boolean r4 = r3.startsWith(r4)
            if (r4 != 0) goto L83
            java.lang.String r4 = "android.content."
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L50
        L83:
            java.lang.String r1 = d(r3)
            goto L94
        L88:
            if (r1 != 0) goto L8b
            goto L92
        L8b:
            ud.u r2 = r6.f13688k
            ud.e r1 = r2.g(r1)
            goto L2b
        L92:
            java.lang.String r1 = ""
        L94:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L9b:
            int r1 = r5.f7571b
            int r2 = r1 + 1
            r5.f7571b = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            od.a r6 = r6.f13690m
            java.lang.String r6 = r6.f9766h
            java.lang.String r6 = r5.e(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r1, r6}
            java.lang.String r0 = "%sC%04d%s"
            java.lang.String r6 = java.lang.String.format(r0, r6)
            return r6
    }

    public final java.lang.String b(ud.g r3) {
            r2 = this;
            int r0 = r2.f7572c
            int r1 = r0 + 1
            r2.f7572c = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            od.c r3 = r3.f13707l
            java.lang.String r3 = r3.f9774h
            java.lang.String r3 = r2.e(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r3}
            java.lang.String r0 = "f%d%s"
            java.lang.String r3 = java.lang.String.format(r0, r3)
            return r3
    }

    public final java.lang.String c(ud.r r4) {
            r3 = this;
            md.b r0 = md.b.f8863r
            md.f r1 = r4.f8877g
            boolean r0 = r1.b(r0)
            if (r0 == 0) goto Ld
            java.lang.String r0 = "mo"
            goto Lf
        Ld:
            java.lang.String r0 = "m"
        Lf:
            int r1 = r3.f7573d
            int r2 = r1 + 1
            r3.f7573d = r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            od.d r4 = r4.f13717k
            java.lang.String r4 = r4.f9777g
            java.lang.String r4 = r3.e(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r0, r1, r4}
            java.lang.String r0 = "%s%d%s"
            java.lang.String r4 = java.lang.String.format(r0, r4)
            return r4
    }

    public final java.lang.String e(java.lang.String r3) {
            r2 = this;
            int r0 = r3.length()
            int r1 = r2.f7574e
            if (r0 <= r1) goto L17
            int r3 = r3.hashCode()
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.String r0 = "x"
            java.lang.String r3 = wb.en.g(r0, r3)
            return r3
        L17:
            java.lang.String r3 = kd.d.e(r3)
            return r3
    }
}
