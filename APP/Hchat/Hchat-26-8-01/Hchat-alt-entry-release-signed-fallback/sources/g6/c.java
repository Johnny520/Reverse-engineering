package g6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.nio.ByteBuffer f4332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g6.a f4335e;

    public c() {
            r1 = this;
            r1.<init>()
            g6.a r0 = g6.a.a()
            r1.f4335e = r0
            return
    }

    public final int a(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.f4332b
            int r0 = r0.getInt(r2)
            int r0 = r0 + r2
            return r0
    }

    public final int b(int r3) {
            r2 = this;
            int r0 = r2.f4334d
            if (r3 >= r0) goto Le
            java.nio.ByteBuffer r0 = r2.f4332b
            int r1 = r2.f4333c
            int r1 = r1 + r3
            short r3 = r0.getShort(r1)
            return r3
        Le:
            r3 = 0
            return r3
    }

    public final void c(int r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.f4332b = r2
            if (r2 == 0) goto L16
            r0.f4331a = r1
            int r2 = r2.getInt(r1)
            int r1 = r1 - r2
            r0.f4333c = r1
            java.nio.ByteBuffer r2 = r0.f4332b
            short r1 = r2.getShort(r1)
            r0.f4334d = r1
            return
        L16:
            r1 = 0
            r0.f4331a = r1
            r0.f4333c = r1
            r0.f4334d = r1
            return
    }

    public final java.lang.String d(int r14) {
            r13 = this;
            java.nio.ByteBuffer r0 = r13.f4332b
            int r1 = r0.getInt(r14)
            int r1 = r1 + r14
            int r14 = r0.getInt(r1)
            int r1 = r1 + 4
            g6.a r2 = r13.f4335e
            r2.getClass()
            boolean r2 = r0.hasArray()
            r3 = -16
            r4 = -32
            java.lang.String r5 = "Invalid UTF-8"
            r6 = 0
            if (r2 == 0) goto Ld2
            byte[] r2 = r0.array()
            int r0 = r0.arrayOffset()
            int r0 = r0 + r1
            r1 = r0 | r14
            int r7 = r2.length
            int r7 = r7 - r0
            int r7 = r7 - r14
            r1 = r1 | r7
            if (r1 < 0) goto Lb5
            int r1 = r0 + r14
            char[] r11 = new char[r14]
            r14 = r6
        L35:
            if (r0 >= r1) goto L44
            r7 = r2[r0]
            if (r7 < 0) goto L44
            int r0 = r0 + 1
            int r8 = r14 + 1
            char r7 = (char) r7
            r11[r14] = r7
            r14 = r8
            goto L35
        L44:
            r12 = r14
        L45:
            if (r0 >= r1) goto Laf
            int r14 = r0 + 1
            r7 = r2[r0]
            if (r7 < 0) goto L64
            int r0 = r12 + 1
            char r7 = (char) r7
            r11[r12] = r7
        L52:
            if (r14 >= r1) goto L61
            r7 = r2[r14]
            if (r7 < 0) goto L61
            int r14 = r14 + 1
            int r8 = r0 + 1
            char r7 = (char) r7
            r11[r0] = r7
            r0 = r8
            goto L52
        L61:
            r12 = r0
            r0 = r14
            goto L45
        L64:
            if (r7 >= r4) goto L78
            if (r14 >= r1) goto L73
            int r0 = r0 + 2
            r14 = r2[r14]
            int r8 = r12 + 1
            ig.a.F(r7, r14, r11, r12)
            r12 = r8
            goto L45
        L73:
            j8.o.t(r5)
            r14 = 0
            return r14
        L78:
            if (r7 >= r3) goto L92
            int r8 = r1 + (-1)
            if (r14 >= r8) goto L8d
            int r8 = r0 + 2
            r14 = r2[r14]
            int r0 = r0 + 3
            r8 = r2[r8]
            int r9 = r12 + 1
            ig.a.E(r7, r14, r8, r11, r12)
            r12 = r9
            goto L45
        L8d:
            j8.o.t(r5)
            r14 = 0
            return r14
        L92:
            int r8 = r1 + (-2)
            if (r14 >= r8) goto Laa
            int r8 = r0 + 2
            r14 = r2[r14]
            int r9 = r0 + 3
            r8 = r2[r8]
            int r0 = r0 + 4
            r10 = r2[r9]
            r9 = r8
            r8 = r14
            ig.a.D(r7, r8, r9, r10, r11, r12)
            int r12 = r12 + 2
            goto L45
        Laa:
            j8.o.t(r5)
            r14 = 0
            return r14
        Laf:
            java.lang.String r14 = new java.lang.String
            r14.<init>(r11, r6, r12)
            return r14
        Lb5:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            int r2 = r2.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r14 = new java.lang.Object[]{r2, r0, r14}
            java.lang.String r0 = "buffer length=%d, index=%d, size=%d"
            java.lang.String r14 = java.lang.String.format(r0, r14)
            r1.<init>(r14)
            throw r1
        Ld2:
            r2 = r1 | r14
            int r7 = r0.limit()
            int r7 = r7 - r1
            int r7 = r7 - r14
            r2 = r2 | r7
            if (r2 < 0) goto L174
            int r2 = r1 + r14
            char[] r11 = new char[r14]
            r14 = r6
        Le2:
            if (r1 >= r2) goto Lf3
            byte r7 = r0.get(r1)
            if (r7 < 0) goto Lf3
            int r1 = r1 + 1
            int r8 = r14 + 1
            char r7 = (char) r7
            r11[r14] = r7
            r14 = r8
            goto Le2
        Lf3:
            r12 = r14
        Lf4:
            if (r1 >= r2) goto L16e
            int r14 = r1 + 1
            byte r7 = r0.get(r1)
            if (r7 < 0) goto L117
            int r1 = r12 + 1
            char r7 = (char) r7
            r11[r12] = r7
        L103:
            if (r14 >= r2) goto L114
            byte r7 = r0.get(r14)
            if (r7 < 0) goto L114
            int r14 = r14 + 1
            int r8 = r1 + 1
            char r7 = (char) r7
            r11[r1] = r7
            r1 = r8
            goto L103
        L114:
            r12 = r1
            r1 = r14
            goto Lf4
        L117:
            if (r7 >= r4) goto L12d
            if (r14 >= r2) goto L128
            int r1 = r1 + 2
            byte r14 = r0.get(r14)
            int r8 = r12 + 1
            ig.a.F(r7, r14, r11, r12)
            r12 = r8
            goto Lf4
        L128:
            j8.o.t(r5)
            r14 = 0
            return r14
        L12d:
            if (r7 >= r3) goto L14b
            int r8 = r2 + (-1)
            if (r14 >= r8) goto L146
            int r8 = r1 + 2
            byte r14 = r0.get(r14)
            int r1 = r1 + 3
            byte r8 = r0.get(r8)
            int r9 = r12 + 1
            ig.a.E(r7, r14, r8, r11, r12)
            r12 = r9
            goto Lf4
        L146:
            j8.o.t(r5)
            r14 = 0
            return r14
        L14b:
            int r8 = r2 + (-2)
            if (r14 >= r8) goto L169
            int r8 = r1 + 2
            byte r14 = r0.get(r14)
            int r9 = r1 + 3
            byte r8 = r0.get(r8)
            int r1 = r1 + 4
            byte r10 = r0.get(r9)
            r9 = r8
            r8 = r14
            ig.a.D(r7, r8, r9, r10, r11, r12)
            int r12 = r12 + 2
            goto Lf4
        L169:
            j8.o.t(r5)
            r14 = 0
            return r14
        L16e:
            java.lang.String r14 = new java.lang.String
            r14.<init>(r11, r6, r12)
            return r14
        L174:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            int r0 = r0.limit()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r14 = new java.lang.Object[]{r0, r1, r14}
            java.lang.String r0 = "buffer limit=%d, index=%d, limit=%d"
            java.lang.String r14 = java.lang.String.format(r0, r14)
            r2.<init>(r14)
            throw r2
    }

    public final int e(int r2) {
            r1 = this;
            int r0 = r1.f4331a
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = r1.f4332b
            int r0 = r0.getInt(r2)
            int r0 = r0 + r2
            int r0 = r0 + 4
            return r0
    }

    public final int f(int r2) {
            r1 = this;
            int r0 = r1.f4331a
            int r2 = r2 + r0
            java.nio.ByteBuffer r0 = r1.f4332b
            int r0 = r0.getInt(r2)
            int r0 = r0 + r2
            java.nio.ByteBuffer r2 = r1.f4332b
            int r2 = r2.getInt(r0)
            return r2
    }
}
