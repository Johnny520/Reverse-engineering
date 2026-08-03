package r7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends r7.s {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public r7.n f11574t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public r7.o f11575u;

    @Override // r7.s
    public final int S(r7.s r8) {
            r7 = this;
            boolean r0 = r8 instanceof r7.o
            if (r0 != 0) goto L6
            r8 = -1
            return r8
        L6:
            r0 = 0
            if (r8 != r7) goto Lb
            goto Ld0
        Lb:
            r1 = r8
            r7.o r1 = (r7.o) r1
            r7.n r2 = r7.f11574t
            if (r2 != 0) goto L14
            r2 = r0
            goto L16
        L14:
            int r2 = r2.f11560n
        L16:
            r7.n r3 = r1.f11574t
            if (r3 != 0) goto L1c
            r3 = r0
            goto L1e
        L1c:
            int r3 = r3.f11560n
        L1e:
            r4 = 1
            if (r2 != 0) goto L23
            r5 = r4
            goto L24
        L23:
            r5 = r0
        L24:
            if (r3 != 0) goto L28
            r6 = r4
            goto L29
        L28:
            r6 = r0
        L29:
            int r5 = y7.a.d(r5, r6)
            if (r5 == 0) goto L30
            return r5
        L30:
            int r2 = y7.a.e(r2, r3)
            if (r2 == 0) goto L37
            return r2
        L37:
            r7.u r2 = r1.f11583q
            if (r2 == 0) goto L47
            o7.b r2 = r2.f11587m
            z7.c r2 = r2.f9563k
            int r2 = r2.size()
            if (r2 == 0) goto L47
            r2 = r4
            goto L48
        L47:
            r2 = r0
        L48:
            r7.u r3 = r7.f11583q
            if (r3 == 0) goto L58
            o7.b r3 = r3.f11587m
            z7.c r3 = r3.f9563k
            int r3 = r3.size()
            if (r3 == 0) goto L58
            r3 = r4
            goto L59
        L58:
            r3 = r0
        L59:
            int r2 = y7.a.d(r2, r3)
            if (r2 == 0) goto L60
            return r2
        L60:
            java.lang.String r2 = r7.Y()
            java.lang.String r8 = r8.Y()
            int r8 = y7.a.c(r2, r8)
            if (r8 == 0) goto L6f
            return r8
        L6f:
            r7.o r8 = r1.f11575u
            r2 = 0
            if (r8 == 0) goto L7b
            k7.a r3 = r8.f7389h
            if (r3 != 0) goto L7b
            r1.f11575u = r2
            r8 = r2
        L7b:
            if (r8 == 0) goto L7f
            r8 = r4
            goto L80
        L7f:
            r8 = r0
        L80:
            r7.o r3 = r7.f11575u
            if (r3 == 0) goto L8b
            k7.a r5 = r3.f7389h
            if (r5 != 0) goto L8b
            r7.f11575u = r2
            r3 = r2
        L8b:
            if (r3 == 0) goto L8e
            goto L8f
        L8e:
            r4 = r0
        L8f:
            int r8 = y7.a.d(r8, r4)
            if (r8 == 0) goto L96
            return r8
        L96:
            int r8 = r1.X()
            int r3 = r7.X()
            int r8 = y7.a.b(r8, r3)
            if (r8 == 0) goto La5
            return r8
        La5:
            r7.o r8 = r7.f11575u
            if (r8 == 0) goto Lb0
            k7.a r3 = r8.f7389h
            if (r3 != 0) goto Lb0
            r7.f11575u = r2
            r8 = r2
        Lb0:
            if (r8 == 0) goto Lb7
            java.lang.String r8 = r8.Y()
            goto Lb8
        Lb7:
            r8 = r2
        Lb8:
            r7.o r3 = r1.f11575u
            if (r3 == 0) goto Lc3
            k7.a r4 = r3.f7389h
            if (r4 != 0) goto Lc3
            r1.f11575u = r2
            r3 = r2
        Lc3:
            if (r3 == 0) goto Lc9
            java.lang.String r2 = r3.Y()
        Lc9:
            int r8 = y7.a.c(r8, r2)
            if (r8 == 0) goto Ld0
            return r8
        Ld0:
            return r0
    }

    @Override // r7.s
    public final void W() {
            r0 = this;
            return
    }

    @Override // r7.s
    public final int X() {
            r2 = this;
            java.lang.Object r0 = r2.f11582p
            int r0 = y7.a.j(r0)
            r7.n r1 = r2.f11574t
            if (r1 == 0) goto L12
            boolean r1 = r1.O()
            if (r1 == 0) goto L12
            int r0 = r0 + 1
        L12:
            return r0
    }

    @Override // r7.s, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            r7.s r1 = (r7.s) r1
            int r1 = r0.S(r1)
            return r1
    }
}
