package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C5568 {

    /* JADX INFO: renamed from: Yue.ۥۡۨ۟ۡ$ۥ, reason: contains not printable characters */
    public static class C5569 extends java.lang.IllegalStateException {
        public C5569(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public C5569(java.lang.String r1, java.lang.Object... r2) {
                r0 = this;
                java.lang.String r1 = java.lang.String.format(r1, r2)
                r0.<init>(r1)
                return
        }

        public C5569(java.lang.Throwable r1, java.lang.String r2, java.lang.Object... r3) {
                r0 = this;
                java.lang.String r2 = java.lang.String.format(r2, r3)
                r0.<init>(r2, r1)
                return
        }
    }

    public C5568() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Yue.C2108 m20873(java.util.Collection<Yue.C2104> r4, java.util.Collection<Yue.C2104> r5) {
            Yue.ۥ۠۠ۥۧ r0 = new Yue.ۥ۠۠ۥۧ
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r4.next()
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            java.util.Iterator r2 = r5.iterator()
        L19:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r2.next()
            Yue.ۥ۠۠ۥۥ r3 = (Yue.C2104) r3
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L19
            goto L9
        L2c:
            r0.add(r1)
            goto L9
        L30:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C2108 m20874(Yue.AbstractC2179 r0, Yue.C2104 r1) {
            Yue.C6657.m25635(r0)
            Yue.C6657.m25635(r1)
            Yue.ۥ۠۠ۥۧ r0 = Yue.C1225.m6558(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Yue.C2108 m20875(java.lang.String r0, Yue.C2104 r1) {
            Yue.C6657.m25632(r0)
            Yue.ۥ۠ۡ۠ۤ r0 = Yue.C5000.m19434(r0)
            Yue.ۥ۠۠ۥۧ r0 = m20874(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.C2108 m20876(java.lang.String r5, java.lang.Iterable<Yue.C2104> r6) {
            Yue.C6657.m25632(r5)
            Yue.C6657.m25635(r6)
            Yue.ۥ۠ۡ۠ۤ r5 = Yue.C5000.m19434(r5)
            Yue.ۥ۠۠ۥۧ r0 = new Yue.ۥ۠۠ۥۧ
            r0.<init>()
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        L18:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r6.next()
            Yue.ۥ۠۠ۥۥ r2 = (Yue.C2104) r2
            Yue.ۥ۠۠ۥۧ r2 = m20874(r5, r2)
            java.util.Iterator r2 = r2.iterator()
        L2c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L18
            java.lang.Object r3 = r2.next()
            Yue.ۥ۠۠ۥۥ r3 = (Yue.C2104) r3
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.Object r4 = r1.put(r3, r4)
            if (r4 != 0) goto L2c
            r0.add(r3)
            goto L2c
        L44:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Yue.C2104 m20877(java.lang.String r0, Yue.C2104 r1) {
            Yue.C6657.m25632(r0)
            Yue.ۥ۠ۡ۠ۤ r0 = Yue.C5000.m19434(r0)
            Yue.ۥ۠۠ۥۥ r0 = Yue.C1225.m6559(r0, r1)
            return r0
    }
}
