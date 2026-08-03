package k4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f7147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8.b f7148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v4.e0 f7150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v4.d0 f7152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v4.d0 f7153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w4.e f7154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h4.u f7155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h4.u f7156j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h4.u f7157k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k4.d f7158l;

    public b(java.lang.String r4, byte[] r5) {
            r3 = this;
            g8.b r0 = new g8.b
            r1 = 3
            r2 = 0
            r0.<init>(r5, r1, r2)
            r3.<init>()
            if (r4 == 0) goto L17
            r3.f7147a = r4
            r3.f7148b = r0
            r4 = 1
            r3.f7149c = r4
            r4 = -1
            r3.f7151e = r4
            return
        L17:
            java.lang.String r4 = "filePath == null"
            bsh.j.c(r4)
            r4 = 0
            throw r4
    }

    public final void a() {
            r5 = this;
            java.lang.String r0 = r5.f7147a
            java.lang.String r1 = "...while parsing "
            r5.b()     // Catch: java.lang.RuntimeException -> L8 l4.c -> L1f
            return
        L8:
            r2 = move-exception
            l4.c r3 = new l4.c
            r4 = 0
            r3.<init>(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3.a(r0)
            throw r3
        L1f:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.a(r0)
            throw r2
    }

    public final void b() {
            r12 = this;
            g8.b r6 = r12.f7148b
            int r0 = r6.f4344c
            r2 = 10
            r7 = 0
            if (r0 < r2) goto L16c
            r0 = 6
            java.lang.String r2 = ")"
            boolean r3 = r12.f7149c
            r8 = 0
            if (r3 == 0) goto L76
            int r4 = r6.b(r8)
            r5 = -889275714(0xffffffffcafebabe, float:-8346975.0)
            if (r4 != r5) goto L57
            r4 = 4
            int r5 = r6.g(r4)
            int r9 = r6.g(r0)
            if (r5 < 0) goto L33
            r10 = 53
            if (r9 != r10) goto L2c
            if (r5 > 0) goto L33
            goto L76
        L2c:
            if (r9 >= r10) goto L33
            r5 = 45
            if (r9 < r5) goto L33
            goto L76
        L33:
            l4.c r2 = new l4.c
            int r0 = r6.g(r0)
            int r3 = r6.g(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "unsupported class file version "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = "."
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            r2.<init>(r0, r7)
            throw r2
        L57:
            l4.c r0 = new l4.c
            int r3 = r6.b(r8)
            java.lang.String r3 = a.a.Y0(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "bad class file magic ("
            r4.<init>(r5)
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r0.<init>(r2, r7)
            throw r0
        L76:
            f1.h r4 = new f1.h
            r4.<init>(r6)
            r4.s()
            java.lang.Object r5 = r4.f3059j
            v4.e0 r5 = (v4.e0) r5
            r12.f7150d = r5
            r5.f22555g = r8
            r4.s()
            int r4 = r4.f3057h
            int r5 = r6.g(r4)
            int r9 = r4 + 2
            int r9 = r6.g(r9)
            v4.e0 r10 = r12.f7150d
            v4.a r9 = r10.l(r9)
            v4.d0 r9 = (v4.d0) r9
            r12.f7152f = r9
            int r9 = r4 + 4
            int r9 = r6.g(r9)
            v4.e0 r10 = r12.f7150d
            if (r9 != 0) goto Lae
            r10.getClass()
            r9 = r7
            goto Lb2
        Lae:
            v4.a r9 = r10.l(r9)
        Lb2:
            v4.d0 r9 = (v4.d0) r9
            r12.f7153g = r9
            int r9 = r4 + 6
            int r9 = r6.g(r9)
            int r4 = r4 + 8
            if (r9 != 0) goto Lc3
            w4.b r10 = w4.b.f14847i
            goto Lcd
        Lc3:
            v4.e0 r10 = r12.f7150d
            if (r10 == 0) goto L166
            ac.k r11 = new ac.k
            r11.<init>(r6, r4, r9, r10)
            r10 = r11
        Lcd:
            r12.f7154h = r10
            int r9 = r9 * 2
            int r9 = r9 + r4
            if (r3 == 0) goto L106
            v4.d0 r3 = r12.f7152f
            w4.c r3 = r3.f14088g
            java.lang.String r3 = r3.j()
            java.lang.String r4 = ".class"
            java.lang.String r10 = r12.f7147a
            boolean r4 = r10.endsWith(r4)
            if (r4 == 0) goto Lf8
            boolean r4 = r10.startsWith(r3)
            if (r4 == 0) goto Lf8
            int r4 = r10.length()
            int r11 = r3.length()
            int r11 = r11 + r0
            if (r4 != r11) goto Lf8
            goto L106
        Lf8:
            l4.c r0 = new l4.c
            java.lang.String r4 = "class name ("
            java.lang.String r5 = ") does not match path ("
            java.lang.String r2 = bc.e.k(r4, r3, r5, r10, r2)
            r0.<init>(r2, r7)
            throw r0
        L106:
            r12.f7151e = r5
            k4.c r0 = new k4.c
            v4.d0 r2 = r12.f7152f
            k4.d r4 = r12.f7158l
            r5 = 0
            r1 = r12
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0.b()
            z4.e r2 = r0.f7165g
            h4.u r2 = (h4.u) r2
            r12.f7155i = r2
            r0.b()
            int r3 = r0.f7163e
            k4.c r0 = new k4.c
            v4.d0 r2 = r12.f7152f
            k4.d r4 = r12.f7158l
            r5 = 1
            r0.<init>(r1, r2, r3, r4, r5)
            r0.b()
            z4.e r2 = r0.f7165g
            h4.u r2 = (h4.u) r2
            r12.f7156j = r2
            r0.b()
            int r0 = r0.f7163e
            k4.a r2 = new k4.a
            k4.d r3 = r12.f7158l
            r2.<init>(r12, r8, r0, r3)
            r2.a()
            java.lang.Object r0 = r2.f7146f
            h4.u r0 = (h4.u) r0
            r12.f7157k = r0
            r0.f22555g = r8
            r2.a()
            int r0 = r2.f7143c
            int r2 = r6.f4344c
            if (r0 != r2) goto L156
            return
        L156:
            l4.c r2 = new l4.c
            java.lang.String r0 = a.a.Y0(r0)
            java.lang.String r3 = "extra bytes at end of class file, at offset "
            java.lang.String r0 = r3.concat(r0)
            r2.<init>(r0, r7)
            throw r2
        L166:
            java.lang.String r0 = "pool not yet initialized"
            j8.o.A(r0)
            return
        L16c:
            l4.c r0 = new l4.c
            java.lang.String r2 = "severely truncated class file"
            r0.<init>(r2, r7)
            throw r0
    }

    public final void c() {
            r1 = this;
            h4.u r0 = r1.f7157k
            if (r0 != 0) goto L7
            r1.a()
        L7:
            return
    }

    public final void d() {
            r2 = this;
            int r0 = r2.f7151e
            r1 = -1
            if (r0 != r1) goto L8
            r2.a()
        L8:
            return
    }
}
