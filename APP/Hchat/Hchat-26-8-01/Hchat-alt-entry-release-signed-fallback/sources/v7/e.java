package v7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends v7.i0 {
    public final java.lang.String toString() {
            r6 = this;
            boolean r0 = r6.f7390i
            if (r0 == 0) goto L7
            java.lang.String r0 = "null"
            return r0
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            byte[] r1 = r6.f11553k
            int r2 = r1.length
            int r3 = r1.length
            r4 = 0
            r5 = 2
            if (r3 >= r5) goto L16
            r1 = r4
            goto L1e
        L16:
            r3 = 65535(0xffff, float:9.1834E-41)
            short r1 = k7.a.w(r1, r4)
            r1 = r1 & r3
        L1e:
            r3 = 8
            if (r2 == r3) goto L2a
            java.lang.String r3 = "size="
            r0.append(r3)
            r0.append(r2)
        L2a:
            if (r2 == r1) goto L34
            java.lang.String r2 = " readSize="
            r0.append(r2)
            r0.append(r1)
        L34:
            byte[] r1 = r6.f11553k
            boolean r1 = k7.a.q(r1, r5, r4)
            if (r1 == 0) goto L41
            java.lang.String r1 = " complex"
            r0.append(r1)
        L41:
            byte[] r1 = r6.f11553k
            r2 = 1
            boolean r1 = k7.a.q(r1, r5, r2)
            if (r1 == 0) goto L4f
            java.lang.String r1 = " public"
            r0.append(r1)
        L4f:
            byte[] r1 = r6.f11553k
            boolean r1 = k7.a.q(r1, r5, r5)
            if (r1 == 0) goto L5c
            java.lang.String r1 = " weak"
            r0.append(r1)
        L5c:
            byte[] r1 = r6.f11553k
            r2 = 3
            boolean r1 = k7.a.q(r1, r5, r2)
            if (r1 == 0) goto L6a
            java.lang.String r1 = " compact"
            r0.append(r1)
        L6a:
            int r1 = r6.N()
            r2 = 0
            if (r1 >= 0) goto L72
            goto L87
        L72:
            k7.a r3 = r6.f7389h
        L74:
            if (r3 == 0) goto L84
            boolean r4 = r3 instanceof l7.g
            if (r4 == 0) goto L81
            l7.g r3 = (l7.g) r3
            u7.c r3 = r3.a()
            goto L85
        L81:
            k7.a r3 = r3.f7389h
            goto L74
        L84:
            r3 = r2
        L85:
            if (r3 != 0) goto L89
        L87:
            r1 = r2
            goto L8d
        L89:
            r7.s r1 = r3.V(r1)
        L8d:
            if (r1 == 0) goto L91
            java.lang.String r2 = r1.f11578m
        L91:
            if (r2 == 0) goto L9c
            java.lang.String r1 = " name="
            r0.append(r1)
            r0.append(r2)
            goto La8
        L9c:
            java.lang.String r1 = " key="
            r0.append(r1)
            int r1 = r6.N()
            r0.append(r1)
        La8:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
