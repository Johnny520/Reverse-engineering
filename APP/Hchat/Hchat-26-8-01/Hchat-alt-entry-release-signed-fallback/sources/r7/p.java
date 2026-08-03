package r7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends r7.b implements q7.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r7.f f11576m;

    public p(r7.f r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.f11576m = r2
            r2.f7391j = r1
            r1.f7391j = r1
            return
    }

    public final void N(int r4) {
            r3 = this;
            if (r4 >= 0) goto L3
            r4 = 0
        L3:
            int r0 = r4 * 4
            if (r0 < 0) goto Lc
            r4 = 1
            r3.M(r0, r4)
            return
        Lc:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "Huge integers size = "
            java.lang.String r2 = ", parent = "
            java.lang.StringBuilder r4 = eh.a.t(r4, r1, r2)
            k7.a r1 = r3.f7389h
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // q7.a
    public final void m(k7.a r2) {
            r1 = this;
            r7.f r0 = r1.f11576m
            if (r2 != r0) goto L9
            int r2 = r0.f11560n
            r1.N(r2)
        L9:
            return
    }

    public final java.lang.String toString() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "size="
            r0.<init>(r1)
            byte[] r1 = r8.f11553k
            int r1 = r1.length
            int r1 = r1 / 4
            r0.append(r1)
            r2 = 10
            if (r1 <= r2) goto L14
            goto L15
        L14:
            r2 = r1
        L15:
            r3 = 0
            r4 = r3
        L17:
            if (r4 >= r2) goto L42
            if (r4 != 0) goto L21
            java.lang.String r5 = " ["
            r0.append(r5)
            goto L26
        L21:
            java.lang.String r5 = ", "
            r0.append(r5)
        L26:
            r5 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r4
            if (r5 < 0) goto L3b
            byte[] r6 = r8.f11553k
            int r7 = r6.length
            int r7 = r7 / 4
            if (r5 < r7) goto L34
            goto L3b
        L34:
            int r5 = r5 * 4
            int r5 = k7.a.s(r6, r5)
            goto L3c
        L3b:
            r5 = r3
        L3c:
            r0.append(r5)
            int r4 = r4 + 1
            goto L17
        L42:
            if (r1 <= r2) goto L53
            java.lang.String r3 = ", +"
            r0.append(r3)
            int r2 = r1 - r2
            r0.append(r2)
            java.lang.String r2 = " more"
            r0.append(r2)
        L53:
            if (r1 <= 0) goto L5a
            r1 = 93
            r0.append(r1)
        L5a:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
