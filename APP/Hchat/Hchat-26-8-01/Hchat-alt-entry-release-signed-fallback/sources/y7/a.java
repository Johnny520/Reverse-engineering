package y7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r4.m f22307a = null;

    static {
            r4.m r0 = new r4.m
            r1 = 5
            r0.<init>(r1)
            y7.a.f22307a = r0
            return
    }

    public static java.lang.Object a(java.lang.Object r2, r7.m r3) {
            if (r3 == 0) goto L21
            if (r3 != r2) goto L5
            goto L21
        L5:
            if (r2 != 0) goto L8
            return r3
        L8:
            java.lang.Class r0 = r2.getClass()
            java.lang.Class<y7.b> r1 = y7.b.class
            if (r0 != r1) goto L13
            y7.b r2 = (y7.b) r2
            goto L1e
        L13:
            y7.b r0 = new y7.b
            r1 = 10
            r0.<init>(r1)
            r0.add(r2)
            r2 = r0
        L1e:
            r2.add(r3)
        L21:
            return r2
    }

    public static int b(int r0, int r1) {
            if (r0 != r1) goto L4
            r0 = 0
            return r0
        L4:
            if (r0 <= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = -1
            return r0
    }

    public static int c(java.lang.Comparable r3, java.lang.Comparable r4) {
            r0 = 0
            if (r3 != r4) goto L4
            return r0
        L4:
            r1 = -1
            if (r3 != 0) goto L8
            return r1
        L8:
            r2 = 1
            if (r4 != 0) goto Lc
            return r2
        Lc:
            int r3 = r3.compareTo(r4)
            if (r3 != 0) goto L13
            return r0
        L13:
            if (r3 <= 0) goto L16
            return r2
        L16:
            return r1
    }

    public static int d(boolean r0, boolean r1) {
            if (r0 != r1) goto L4
            r0 = 0
            return r0
        L4:
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = -1
            return r0
    }

    public static int e(int r4, int r5) {
            if (r4 != r5) goto L4
            r4 = 0
            return r4
        L4:
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r4 = (long) r5
            long r4 = r4 & r2
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L13
            r4 = 1
            return r4
        L13:
            r4 = -1
            return r4
    }

    public static boolean f(java.lang.String r0) {
            if (r0 == 0) goto Lb
            int r0 = r0.length()
            if (r0 != 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public static java.util.Iterator g(java.lang.Object r2) {
            if (r2 != 0) goto L5
            z7.h r2 = z7.h.f22606g
            return r2
        L5:
            java.lang.Class r0 = r2.getClass()
            java.lang.Class<y7.b> r1 = y7.b.class
            if (r0 != r1) goto L14
            y7.b r2 = (y7.b) r2
            java.util.Iterator r2 = r2.iterator()
            return r2
        L14:
            java.util.Iterator r2 = z7.q.a(r2)
            return r2
    }

    public static java.lang.String h(java.util.Iterator r4) {
            r0 = 32
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
        Lc:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L20
            if (r2 == 0) goto L17
            r1.append(r0)
        L17:
            java.lang.Object r2 = r4.next()
            r1.append(r2)
            r2 = 1
            goto Lc
        L20:
            int r4 = r1.length()
            if (r4 == 0) goto L2b
            java.lang.String r4 = r1.toString()
            return r4
        L2b:
            java.lang.String r4 = ""
            return r4
    }

    public static java.lang.Object i(java.lang.Object r2, r7.m r3) {
            if (r3 == 0) goto L2a
            if (r2 == 0) goto L2a
            if (r3 != r2) goto L7
            goto L2a
        L7:
            java.lang.Class r0 = r2.getClass()
            java.lang.Class<y7.b> r1 = y7.b.class
            if (r0 == r1) goto L17
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L16
            goto L2a
        L16:
            return r2
        L17:
            y7.b r2 = (y7.b) r2
            r2.remove(r3)
            int r3 = r2.f22586i
            if (r3 != 0) goto L21
            goto L2a
        L21:
            r0 = 1
            if (r3 != r0) goto L29
            r3 = 0
            java.lang.Object[] r2 = r2.f22584g
            r2 = r2[r3]
        L29:
            return r2
        L2a:
            r2 = 0
            return r2
    }

    public static int j(java.lang.Object r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.Class r0 = r2.getClass()
            java.lang.Class<y7.b> r1 = y7.b.class
            if (r0 != r1) goto L11
            y7.b r2 = (y7.b) r2
            int r2 = r2.f22586i
            return r2
        L11:
            r2 = 1
            return r2
    }

    public static java.lang.String k(int r4, int r5) {
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = (long) r4
            long r0 = r0 & r2
            java.lang.String r4 = l(r5, r0)
            return r4
    }

    public static java.lang.String l(int r2, long r3) {
            java.lang.String r3 = java.lang.Long.toHexString(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "0x"
            r4.<init>(r0)
            int r0 = r3.length()
            int r2 = r2 - r0
            r0 = 0
        L11:
            if (r0 >= r2) goto L1b
            r1 = 48
            r4.append(r1)
            int r0 = r0 + 1
            goto L11
        L1b:
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            return r2
    }

    public static java.lang.String m(int r1, java.lang.String r2, long r3) {
            java.lang.String r3 = java.lang.Long.toHexString(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            if (r2 == 0) goto Le
            r4.append(r2)
        Le:
            int r2 = r3.length()
            int r1 = r1 - r2
            r2 = 0
        L14:
            if (r2 >= r1) goto L1e
            r0 = 48
            r4.append(r0)
            int r2 = r2 + 1
            goto L14
        L1e:
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            return r1
    }

    public static java.lang.String n(byte r4) {
            long r0 = (long) r4
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            r4 = 2
            java.lang.String r4 = l(r4, r0)
            return r4
    }

    public static java.lang.String o(short r4) {
            long r0 = (long) r4
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            r4 = 4
            java.lang.String r4 = l(r4, r0)
            return r4
    }

    public static java.lang.String p(int r4, java.lang.String r5) {
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = (long) r4
            long r0 = r0 & r2
            r4 = 8
            java.lang.String r4 = m(r4, r5, r0)
            return r4
    }

    public static java.lang.String q(java.lang.String r5) {
            char[] r0 = r5.toCharArray()
            r1 = 0
            r2 = r1
        L6:
            int r3 = r0.length
            if (r1 >= r3) goto L22
            char r3 = r0[r1]
            r4 = 90
            if (r3 > r4) goto L18
            r4 = 65
            if (r3 >= r4) goto L14
            goto L18
        L14:
            int r4 = r3 + 32
            char r4 = (char) r4
            goto L19
        L18:
            r4 = r3
        L19:
            if (r3 != r4) goto L1c
            goto L1f
        L1c:
            r0[r1] = r4
            r2 = 1
        L1f:
            int r1 = r1 + 1
            goto L6
        L22:
            if (r2 != 0) goto L25
            return r5
        L25:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0)
            return r5
    }
}
