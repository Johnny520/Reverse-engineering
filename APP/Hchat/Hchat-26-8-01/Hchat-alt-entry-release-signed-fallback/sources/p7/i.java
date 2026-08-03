package p7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends p7.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r7.f f10289r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r7.f f10290s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r7.c f10291t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final r7.c f10292u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final r7.a f10293v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r7.f f10294w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final r7.f f10295x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public q9.a f10296y;

    public i() {
            r8 = this;
            r0 = 1
            r8.<init>(r0)
            r7.f r1 = new r7.f
            r2 = 0
            r1.<init>(r2)
            r8.f10289r = r1
            r7.f r3 = new r7.f
            r3.<init>(r2)
            r8.f10290s = r3
            r7.c r4 = new r7.c
            r5 = 1
            r4.<init>(r0, r5)
            r8.f10291t = r4
            r7.c r5 = new r7.c
            r6 = 1
            r5.<init>(r0, r6)
            r8.f10292u = r5
            r7.a r0 = new r7.a
            r0.<init>(r6, r2)
            r8.f10293v = r0
            r7.f r6 = new r7.f
            r6.<init>(r2)
            r8.f10294w = r6
            r7.f r7 = new r7.f
            r7.<init>(r2)
            r8.f10295x = r7
            r8.P(r1)
            r8.P(r3)
            r8.P(r4)
            r8.P(r5)
            r8.P(r0)
            r8.P(r6)
            r8.P(r7)
            return
    }

    public final void T(boolean r8) {
            r7 = this;
            r7.c r0 = r7.f10292u
            byte[] r1 = r0.f11553k
            r2 = 0
            r1 = r1[r2]
            r3 = 1
            r1 = r1 & r3
            if (r1 == 0) goto Ld
            r1 = r3
            goto Le
        Ld:
            r1 = r2
        Le:
            if (r1 == r8) goto L11
            goto L12
        L11:
            r3 = r2
        L12:
            byte r1 = (byte) r8
            r0.P(r1)
            if (r3 == 0) goto L56
            q9.a r0 = r7.f10296y
            if (r0 == 0) goto L56
            java.lang.Object r0 = r0.f10738h
            s7.g r0 = (s7.g) r0
            z7.c r1 = r0.f9563k
            int r1 = r1.size()
            r3 = r2
        L27:
            if (r3 >= r1) goto L54
            k7.a r4 = r0.Q(r3)
            r7.s r4 = (r7.s) r4
            boolean r5 = r4.f11581o
            if (r8 == r5) goto L51
            r4.f11581o = r8
            int r5 = r4.p()
            if (r5 == 0) goto L51
            java.lang.String r5 = r4.f11578m
            r4.f11578m = r5
            byte[] r5 = r4.V(r5)
            if (r5 == 0) goto L48
            int r6 = r5.length
            if (r6 != 0) goto L4a
        L48:
            byte[] r5 = r7.b.f11552l
        L4a:
            byte[] r6 = r4.f11553k
            if (r5 != r6) goto L4f
            goto L51
        L4f:
            r4.f11553k = r5
        L51:
            int r3 = r3 + 1
            goto L27
        L54:
            r0.f12374p = r2
        L56:
            return
    }

    @Override // p7.a
    public final java.lang.String toString() {
            r4 = this;
            int r0 = r4.Q()
            r1 = 2
            if (r0 == r1) goto Lc
            java.lang.String r0 = super.toString()
            return r0
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<p7.i> r1 = p7.i.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " {strings="
            r0.append(r1)
            r7.f r1 = r4.f10289r
            r0.append(r1)
            java.lang.String r1 = ", styles="
            r0.append(r1)
            r7.f r1 = r4.f10290s
            r0.append(r1)
            java.lang.String r1 = ", utf8="
            r0.append(r1)
            r7.c r1 = r4.f10292u
            byte[] r1 = r1.f11553k
            r2 = 0
            r1 = r1[r2]
            r3 = 1
            r1 = r1 & r3
            if (r1 == 0) goto L40
            r1 = r3
            goto L41
        L40:
            r1 = r2
        L41:
            r0.append(r1)
            java.lang.String r1 = ", sorted="
            r0.append(r1)
            r7.c r1 = r4.f10291t
            byte[] r1 = r1.f11553k
            r1 = r1[r2]
            r1 = r1 & r3
            if (r1 == 0) goto L53
            r2 = r3
        L53:
            r0.append(r2)
            java.lang.String r1 = ", flagExtra="
            r0.append(r1)
            r7.a r1 = r4.f10293v
            int r1 = r1.f11551o
            short r1 = (short) r1
            java.lang.String r1 = y7.a.o(r1)
            r0.append(r1)
            java.lang.String r1 = ", offset-strings="
            r0.append(r1)
            r7.f r1 = r4.f10294w
            int r1 = r1.f11560n
            r0.append(r1)
            java.lang.String r1 = ", offset-styles="
            r0.append(r1)
            r7.f r1 = r4.f10295x
            int r1 = r1.f11560n
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }
}
