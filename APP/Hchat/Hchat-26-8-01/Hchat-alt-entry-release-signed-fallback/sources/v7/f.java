package v7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends v7.i0 {
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
            r3 = 16
            if (r2 == r3) goto L2a
            java.lang.String r3 = "size="
            r0.append(r3)
            r0.append(r2)
        L2a:
            if (r2 == r1) goto L34
            java.lang.String r2 = ", readSize="
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
            java.lang.String r1 = ", public"
            r0.append(r1)
        L4f:
            byte[] r1 = r6.f11553k
            boolean r1 = k7.a.q(r1, r5, r5)
            if (r1 == 0) goto L5c
            java.lang.String r1 = ", weak"
            r0.append(r1)
        L5c:
            int r1 = r6.N()
            r2 = 0
            if (r1 >= 0) goto L64
            goto L79
        L64:
            k7.a r3 = r6.f7389h
        L66:
            if (r3 == 0) goto L76
            boolean r4 = r3 instanceof l7.g
            if (r4 == 0) goto L73
            l7.g r3 = (l7.g) r3
            u7.c r3 = r3.a()
            goto L77
        L73:
            k7.a r3 = r3.f7389h
            goto L66
        L76:
            r3 = r2
        L77:
            if (r3 != 0) goto L7b
        L79:
            r1 = r2
            goto L7f
        L7b:
            r7.s r1 = r3.V(r1)
        L7f:
            if (r1 == 0) goto L83
            java.lang.String r2 = r1.f11578m
        L83:
            if (r2 == 0) goto L8e
            java.lang.String r1 = ", name="
            r0.append(r1)
            r0.append(r2)
            goto L9a
        L8e:
            java.lang.String r1 = ", key="
            r0.append(r1)
            int r1 = r6.N()
            r0.append(r1)
        L9a:
            byte[] r1 = r6.f11553k
            r2 = 8
            int r1 = k7.a.s(r1, r2)
            if (r1 == 0) goto Lb6
            java.lang.String r1 = ", parentId="
            r0.append(r1)
            byte[] r1 = r6.f11553k
            int r1 = k7.a.s(r1, r2)
            java.lang.String r1 = y7.a.k(r1, r2)
            r0.append(r1)
        Lb6:
            java.lang.String r1 = ", count="
            r0.append(r1)
            byte[] r1 = r6.f11553k
            r2 = 12
            int r1 = k7.a.s(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
