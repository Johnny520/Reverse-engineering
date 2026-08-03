package p4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p4.j f10114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u4.t f10115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u4.p f10116d;

    public h(p4.j r2, u4.t r3, u4.p r4) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L21
            if (r3 == 0) goto L1a
            if (r4 == 0) goto L13
            r0 = -1
            r1.f10113a = r0
            r1.f10114b = r2
            r1.f10115c = r3
            r1.f10116d = r4
            return
        L13:
            java.lang.String r2 = "registers == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
        L1a:
            java.lang.String r2 = "position == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
        L21:
            java.lang.String r2 = "opcode == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
    }

    public static p4.z h(u4.t r5, u4.o r6, u4.o r7) {
            int r0 = r6.j()
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            w4.d r0 = r6.f13401h
            w4.c r0 = r0.getType()
            boolean r0 = r0.t()
            int r2 = r6.f13400g
            int r3 = r7.f13400g
            r3 = r3 | r2
            r4 = 16
            if (r3 >= r4) goto L29
            if (r0 == 0) goto L21
            p4.j r0 = p4.k.f10159j
            goto L46
        L21:
            if (r1 == 0) goto L26
            p4.j r0 = p4.k.f10135d
            goto L46
        L26:
            p4.j r0 = p4.k.f10147g
            goto L46
        L29:
            r3 = 256(0x100, float:3.59E-43)
            if (r2 >= r3) goto L3a
            if (r0 == 0) goto L32
            p4.j r0 = p4.k.f10163k
            goto L46
        L32:
            if (r1 == 0) goto L37
            p4.j r0 = p4.k.f10139e
            goto L46
        L37:
            p4.j r0 = p4.k.f10151h
            goto L46
        L3a:
            if (r0 == 0) goto L3f
            p4.j r0 = p4.k.f10167l
            goto L46
        L3f:
            if (r1 == 0) goto L44
            p4.j r0 = p4.k.f10143f
            goto L46
        L44:
            p4.j r0 = p4.k.f10155i
        L46:
            p4.z r1 = new p4.z
            u4.p r6 = u4.p.q(r6, r7)
            r1.<init>(r0, r5, r6)
            return r1
    }

    public abstract java.lang.String a();

    public abstract int b();

    public java.lang.String c() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Not supported."
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String d() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Not supported."
            r0.<init>(r1)
            throw r0
    }

    public final int e() {
            r1 = this;
            int r0 = r1.f10113a
            if (r0 < 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "address not yet known"
            bsh.j.g(r0)
            r0 = 0
            return r0
    }

    public final java.lang.String f() {
            r2 = this;
            int r0 = r2.f10113a
            r1 = -1
            if (r0 == r1) goto L14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "%04x"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
        L14:
            int r0 = java.lang.System.identityHashCode(r2)
            java.lang.String r0 = a.a.Y0(r0)
            return r0
    }

    public abstract java.lang.String g();

    public abstract p4.h i(p4.j r1);

    public abstract p4.h j(int r1);

    public abstract p4.h k(u4.p r1);

    public abstract void l(z4.d r1);

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.lang.String r1 = r6.f()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            u4.t r2 = r6.f10115c
            r0.append(r2)
            java.lang.String r2 = ": "
            r0.append(r2)
            p4.j r2 = r6.f10114b
            java.lang.String r2 = r2.a()
            r0.append(r2)
            u4.p r2 = r6.f10116d
            java.lang.Object[] r3 = r2.f22543h
            int r3 = r3.length
            if (r3 == 0) goto L39
            java.lang.String r3 = " "
            r4 = 0
            r5 = 1
            java.lang.String r2 = r2.n(r3, r4, r5)
            r0.append(r2)
            goto L3a
        L39:
            r5 = 0
        L3a:
            java.lang.String r2 = r6.a()
            if (r2 == 0) goto L4d
            if (r5 == 0) goto L47
            r3 = 44
            r0.append(r3)
        L47:
            r0.append(r1)
            r0.append(r2)
        L4d:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
