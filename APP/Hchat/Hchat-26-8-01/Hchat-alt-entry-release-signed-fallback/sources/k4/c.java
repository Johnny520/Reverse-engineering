package k4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k4.b f7159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v4.d0 f7160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k4.d f7162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f7164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z4.e f7165g;

    public c(k4.b r1, v4.d0 r2, int r3, k4.d r4, byte r5) {
            r0 = this;
            r0.<init>()
            if (r3 < 0) goto L1a
            if (r4 == 0) goto L13
            r0.f7159a = r1
            r0.f7160b = r2
            r0.f7161c = r3
            r0.f7162d = r4
            r1 = -1
            r0.f7163e = r1
            return
        L13:
            java.lang.String r1 = "attributeFactory == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
        L1a:
            java.lang.String r1 = "offset < 0"
            j8.o.t(r1)
            r1 = 0
            throw r1
    }

    public c(k4.b r7, v4.d0 r8, int r9, k4.d r10, int r11) {
            r6 = this;
            r6.f7164f = r11
            switch(r11) {
                case 1: goto L1c;
                default: goto L5;
            }
        L5:
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            h4.u r2 = new h4.u
            g8.b r1 = r7.f7148b
            int r1 = r1.g(r9)
            r2.<init>(r1)
            r6.f7165g = r2
            return
        L1c:
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            h4.u r2 = new h4.u
            g8.b r1 = r7.f7148b
            int r1 = r1.g(r9)
            r2.<init>(r1)
            r6.f7165g = r2
            return
    }

    public final java.lang.String a() {
            r1 = this;
            int r0 = r1.f7164f
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "method"
            return r0
        L8:
            java.lang.String r0 = "field"
            return r0
    }

    public final void b() {
            r16 = this;
            r1 = r16
            int r0 = r1.f7163e
            if (r0 >= 0) goto Laf
            java.lang.String r2 = "]"
            java.lang.String r3 = "s["
            java.lang.String r4 = "...while parsing "
            int r0 = r1.f7164f
            switch(r0) {
                case 0: goto L13;
                default: goto L11;
            }
        L11:
            r0 = 2
            goto L14
        L13:
            r0 = 1
        L14:
            k4.b r5 = r1.f7159a
            g8.b r6 = r5.f7148b
            int r7 = r1.f7161c
            int r6 = r6.g(r7)
            int r7 = r7 + 2
            g8.b r8 = r5.f7148b
            r5.d()
            v4.e0 r9 = r5.f7150d
            r11 = 0
        L28:
            if (r11 >= r6) goto Lad
            int r12 = r8.g(r7)     // Catch: java.lang.RuntimeException -> L69 l4.c -> L6b
            int r13 = r7 + 2
            int r13 = r8.g(r13)     // Catch: java.lang.RuntimeException -> L69 l4.c -> L6b
            int r14 = r7 + 4
            int r14 = r8.g(r14)     // Catch: java.lang.RuntimeException -> L69 l4.c -> L6b
            v4.a r13 = r9.l(r13)     // Catch: java.lang.RuntimeException -> L69 l4.c -> L6b
            v4.c0 r13 = (v4.c0) r13     // Catch: java.lang.RuntimeException -> L69 l4.c -> L6b
            v4.a r14 = r9.l(r14)     // Catch: java.lang.RuntimeException -> L69 l4.c -> L6b
            v4.c0 r14 = (v4.c0) r14     // Catch: java.lang.RuntimeException -> L69 l4.c -> L6b
            int r7 = r7 + 6
            k4.a r15 = new k4.a     // Catch: java.lang.RuntimeException -> L69 l4.c -> L6b
            k4.d r10 = r1.f7162d     // Catch: java.lang.RuntimeException -> L69 l4.c -> L6b
            r15.<init>(r5, r0, r7, r10)     // Catch: java.lang.RuntimeException -> L69 l4.c -> L6b
            r15.a()     // Catch: java.lang.RuntimeException -> L69 l4.c -> L6b
            int r7 = r15.f7143c     // Catch: java.lang.RuntimeException -> L69 l4.c -> L6b
            r15.a()     // Catch: java.lang.RuntimeException -> L69 l4.c -> L6b
            java.lang.Object r10 = r15.f7146f     // Catch: java.lang.RuntimeException -> L69 l4.c -> L6b
            h4.u r10 = (h4.u) r10     // Catch: java.lang.RuntimeException -> L69 l4.c -> L6b
            r15 = 0
            r10.f22555g = r15     // Catch: java.lang.RuntimeException -> L69 l4.c -> L6b
            v4.z r15 = new v4.z     // Catch: java.lang.RuntimeException -> L69 l4.c -> L6b
            r15.<init>(r13, r14)     // Catch: java.lang.RuntimeException -> L69 l4.c -> L6b
            r1.c(r11, r12, r15, r10)     // Catch: java.lang.RuntimeException -> L69 l4.c -> L6b
            int r11 = r11 + 1
            goto L28
        L69:
            r0 = move-exception
            goto L6d
        L6b:
            r0 = move-exception
            goto L90
        L6d:
            l4.c r5 = new l4.c
            r6 = 0
            r5.<init>(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            java.lang.String r4 = r1.a()
            r0.append(r4)
            r0.append(r3)
            r0.append(r11)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r5.a(r0)
            throw r5
        L90:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = r1.a()
            r5.append(r4)
            r5.append(r3)
            r5.append(r11)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r0.a(r2)
            throw r0
        Lad:
            r1.f7163e = r7
        Laf:
            return
    }

    public final l4.a c(int r3, int r4, v4.z r5, h4.u r6) {
            r2 = this;
            int r0 = r2.f7164f
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            l4.f r0 = new l4.f
            v4.d0 r1 = r2.f7160b
            r0.<init>(r1, r4, r5, r6)
            z4.e r4 = r2.f7165g
            h4.u r4 = (h4.u) r4
            r4.m(r3, r0)
            return r0
        L14:
            l4.d r0 = new l4.d
            v4.d0 r1 = r2.f7160b
            r0.<init>(r1, r4, r5, r6)
            z4.e r4 = r2.f7165g
            h4.u r4 = (h4.u) r4
            r4.m(r3, r0)
            return r0
    }
}
