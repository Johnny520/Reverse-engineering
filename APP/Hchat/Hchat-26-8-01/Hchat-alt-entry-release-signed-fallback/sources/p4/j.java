package p4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f8.i f10121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10122e;

    public j(int r2, int r3, int r4, f8.i r5, boolean r6) {
            r1 = this;
            r1.<init>()
            boolean r0 = a7.a.A(r2)
            if (r0 == 0) goto L37
            boolean r0 = a7.a.A(r3)
            if (r0 == 0) goto L30
            boolean r0 = a7.a.A(r4)
            if (r0 == 0) goto L29
            if (r5 == 0) goto L22
            r1.f10118a = r2
            r1.f10119b = r3
            r1.f10120c = r4
            r1.f10121d = r5
            r1.f10122e = r6
            return
        L22:
            java.lang.String r2 = "format == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
        L29:
            java.lang.String r2 = "bogus nextOpcode"
            j8.o.t(r2)
            r2 = 0
            throw r2
        L30:
            java.lang.String r2 = "bogus family"
            j8.o.t(r2)
            r2 = 0
            throw r2
        L37:
            java.lang.String r2 = "bogus opcode"
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    public final java.lang.String a() {
            r3 = this;
            int r0 = r3.f10118a
            int r1 = r0 + 1
            j8.x[] r2 = s4.a.f12363a     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld
            r1 = r2[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld
            if (r1 == 0) goto Ld
            java.lang.String r0 = r1.f6839b
            return r0
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            char r2 = (char) r0
            if (r0 != r2) goto L17
            java.lang.String r0 = a.a.X0(r0)
            goto L1b
        L17:
            java.lang.String r0 = a.a.Y0(r0)
        L1b:
            java.lang.String r2 = "bogus opcode: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.a()
            return r0
    }
}
