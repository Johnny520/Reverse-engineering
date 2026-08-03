package k4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f7144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Object f7145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.lang.Object f7146f;

    public a(k4.b r2, int r3, int r4, k4.d r5) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L27
            if (r5 == 0) goto L20
            g8.b r0 = r2.f7148b
            int r0 = r0.g(r4)
            r1.f7144d = r2
            r1.f7141a = r3
            r1.f7142b = r4
            r1.f7145e = r5
            h4.u r2 = new h4.u
            r2.<init>(r0)
            r1.f7146f = r2
            r2 = -1
            r1.f7143c = r2
            return
        L20:
            java.lang.String r2 = "attributeFactory == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
        L27:
            java.lang.String r2 = "cf == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
    }

    public a(l3.t r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f7141a = r0
            r1.f7144d = r2
            r1.f7145e = r2
            return
    }

    public void a() {
            r9 = this;
            int r0 = r9.f7143c
            if (r0 >= 0) goto L64
            java.lang.String r0 = "]"
            java.lang.String r1 = "...while parsing attributes["
            java.lang.Object r2 = r9.f7146f
            h4.u r2 = (h4.u) r2
            java.lang.Object[] r3 = r2.f22543h
            int r3 = r3.length
            int r4 = r9.f7142b
            int r4 = r4 + 2
            java.lang.Object r5 = r9.f7144d
            k4.b r5 = (k4.b) r5
            r5.getClass()
            r6 = 0
        L1b:
            if (r6 >= r3) goto L62
            java.lang.Object r7 = r9.f7145e     // Catch: java.lang.RuntimeException -> L32 l4.c -> L34
            k4.d r7 = (k4.d) r7     // Catch: java.lang.RuntimeException -> L32 l4.c -> L34
            int r8 = r9.f7141a     // Catch: java.lang.RuntimeException -> L32 l4.c -> L34
            h4.s r7 = r7.a(r5, r8, r4)     // Catch: java.lang.RuntimeException -> L32 l4.c -> L34
            int r8 = r7.a()     // Catch: java.lang.RuntimeException -> L32 l4.c -> L34
            int r4 = r4 + r8
            r2.m(r6, r7)     // Catch: java.lang.RuntimeException -> L32 l4.c -> L34
            int r6 = r6 + 1
            goto L1b
        L32:
            r2 = move-exception
            goto L36
        L34:
            r2 = move-exception
            goto L4f
        L36:
            l4.c r3 = new l4.c
            r4 = 0
            r3.<init>(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r6)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3.a(r0)
            throw r3
        L4f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3.append(r6)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.a(r0)
            throw r2
        L62:
            r9.f7143c = r4
        L64:
            return
    }

    public void b() {
            r1 = this;
            r0 = 1
            r1.f7141a = r0
            java.lang.Object r0 = r1.f7144d
            l3.t r0 = (l3.t) r0
            r1.f7145e = r0
            r0 = 0
            r1.f7143c = r0
            return
    }

    public boolean c() {
            r4 = this;
            java.lang.Object r0 = r4.f7145e
            l3.t r0 = (l3.t) r0
            l3.u r0 = r0.f7824b
            m3.a r0 = r0.b()
            r1 = 6
            int r1 = r0.a(r1)
            r2 = 1
            if (r1 == 0) goto L20
            java.lang.Object r3 = r0.f8716j
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r0 = r0.f8713g
            int r1 = r1 + r0
            byte r0 = r3.get(r1)
            if (r0 == 0) goto L20
            return r2
        L20:
            int r0 = r4.f7142b
            r1 = 65039(0xfe0f, float:9.1139E-41)
            if (r0 != r1) goto L28
            return r2
        L28:
            r0 = 0
            return r0
    }
}
