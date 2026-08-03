package ac;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ac.s f221a = null;

    static {
            ac.s r0 = new ac.s
            r0.<init>()
            ac.s.f221a = r0
            return
    }

    public static java.util.LinkedHashSet a(byte[] r5, int r6, int r7) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            if (r7 <= 0) goto L73
            ac.k r1 = new ac.k
            r1.<init>(r5, r6)
            int r6 = r6 + r7
        Ld:
            int r5 = r1.f177h
            if (r5 >= r6) goto L69
            java.lang.Object r7 = r1.f179j
            byte[] r7 = (byte[]) r7
            int r2 = r5 + 1
            r1.f177h = r2
            r3 = r7[r5]
            int r4 = r3 >> 7
            if (r4 != 0) goto L20
            goto L61
        L20:
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r4 = r5 + 2
            r1.f177h = r4
            r2 = r7[r2]
            int r2 = r2 << 7
            r3 = r3 | r2
            int r2 = r3 >> 14
            if (r2 != 0) goto L30
            goto L61
        L30:
            r2 = r3 & 16383(0x3fff, float:2.2957E-41)
            int r3 = r5 + 3
            r1.f177h = r3
            r4 = r7[r4]
            int r4 = r4 << 14
            r2 = r2 | r4
            int r4 = r2 >> 21
            if (r4 != 0) goto L41
            r3 = r2
            goto L61
        L41:
            r4 = 2097151(0x1fffff, float:2.938734E-39)
            r2 = r2 & r4
            int r4 = r5 + 4
            r1.f177h = r4
            r3 = r7[r3]
            int r3 = r3 << 21
            r3 = r3 | r2
            int r2 = r3 >> 28
            if (r2 != 0) goto L53
            goto L61
        L53:
            r2 = 268435455(0xfffffff, float:2.5243547E-29)
            r2 = r2 & r3
            int r5 = r5 + 5
            r1.f177h = r5
            r5 = r7[r4]
            int r5 = r5 << 28
            r3 = r2 | r5
        L61:
            java.lang.String r5 = r1.w(r3)
            r0.add(r5)
            goto Ld
        L69:
            if (r5 != r6) goto L6c
            goto L73
        L6c:
            java.lang.String r5 = "Invalid String set"
            j8.o.t(r5)
            r5 = 0
            return r5
        L73:
            return r0
    }

    public static byte[] b(java.lang.Object r10) {
            java.util.Set r10 = (java.util.Set) r10
            boolean r0 = r10.isEmpty()
            r1 = 0
            if (r0 == 0) goto Lc
            byte[] r10 = new byte[r1]
            return r10
        Lc:
            int r0 = r10.size()
            int[] r2 = new int[r0]
            java.lang.String[] r3 = new java.lang.String[r0]
            java.util.Iterator r10 = r10.iterator()
            r4 = r1
            r5 = r4
        L1a:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L55
            java.lang.Object r6 = r10.next()
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L2e
            int r4 = r4 + 5
            r6 = -1
            r2[r5] = r6
            goto L52
        L2e:
            int r7 = ac.k.x(r6)
            r3[r5] = r6
            r2[r5] = r7
            int r6 = r7 >> 7
            if (r6 != 0) goto L3c
            r6 = 1
            goto L4f
        L3c:
            int r6 = r7 >> 14
            if (r6 != 0) goto L42
            r6 = 2
            goto L4f
        L42:
            int r6 = r7 >> 21
            if (r6 != 0) goto L48
            r6 = 3
            goto L4f
        L48:
            int r6 = r7 >> 28
            if (r6 != 0) goto L4e
            r6 = 4
            goto L4f
        L4e:
            r6 = 5
        L4f:
            int r6 = r6 + r7
            int r6 = r6 + r4
            r4 = r6
        L52:
            int r5 = r5 + 1
            goto L1a
        L55:
            ac.k r10 = new ac.k
            r10.<init>(r4)
        L5a:
            if (r1 >= r0) goto L87
            r4 = r2[r1]
            int r5 = r10.f177h
            r6 = r4
        L61:
            r7 = r6 & (-128(0xffffffffffffff80, float:NaN))
            java.lang.Object r8 = r10.f179j
            byte[] r8 = (byte[]) r8
            if (r7 == 0) goto L76
            int r7 = r5 + 1
            r9 = r6 & 127(0x7f, float:1.78E-43)
            r9 = r9 | 128(0x80, float:1.8E-43)
            byte r9 = (byte) r9
            r8[r5] = r9
            int r6 = r6 >>> 7
            r5 = r7
            goto L61
        L76:
            int r7 = r5 + 1
            byte r6 = (byte) r6
            r8[r5] = r6
            r10.f177h = r7
            if (r4 < 0) goto L84
            r4 = r3[r1]
            r10.G(r4)
        L84:
            int r1 = r1 + 1
            goto L5a
        L87:
            java.lang.Object r10 = r10.f179j
            byte[] r10 = (byte[]) r10
            return r10
    }
}
