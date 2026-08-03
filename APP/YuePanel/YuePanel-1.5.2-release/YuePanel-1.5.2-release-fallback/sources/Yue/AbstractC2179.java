package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2179 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ, reason: contains not printable characters */
    public static final class C2180 extends Yue.AbstractC2179 {
        public C2180() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "*"
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                r0 = 10
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟, reason: contains not printable characters */
    public static final class C2181 extends Yue.AbstractC2179 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f6808;

        public C2181(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.f6808 = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = r2.f6808
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = "[%s]"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                r0 = 2
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                java.lang.String r1 = r0.f6808
                boolean r1 = r2.mo14514(r1)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟, reason: contains not printable characters */
    public static abstract class AbstractC2182 extends Yue.AbstractC2179 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f6809;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.lang.String f6810;

        public AbstractC2182(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                r0 = 1
                r1.<init>(r2, r3, r0)
                return
        }

        public AbstractC2182(java.lang.String r3, java.lang.String r4, boolean r5) {
                r2 = this;
                r2.<init>()
                Yue.C6657.m25632(r3)
                Yue.C6657.m25632(r4)
                java.lang.String r3 = Yue.C4415.m17327(r3)
                r2.f6809 = r3
                java.lang.String r3 = "'"
                boolean r0 = r4.startsWith(r3)
                r1 = 1
                if (r0 == 0) goto L1e
                boolean r3 = r4.endsWith(r3)
                if (r3 != 0) goto L2c
            L1e:
                java.lang.String r3 = "\""
                boolean r0 = r4.startsWith(r3)
                if (r0 == 0) goto L2e
                boolean r3 = r4.endsWith(r3)
                if (r3 == 0) goto L2e
            L2c:
                r3 = r1
                goto L2f
            L2e:
                r3 = 0
            L2f:
                if (r3 == 0) goto L3a
                int r0 = r4.length()
                int r0 = r0 - r1
                java.lang.String r4 = r4.substring(r1, r0)
            L3a:
                if (r5 == 0) goto L41
                java.lang.String r3 = Yue.C4415.m17327(r4)
                goto L45
            L41:
                java.lang.String r3 = Yue.C4415.m17328(r4, r3)
            L45:
                r2.f6810 = r3
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C2183 extends Yue.AbstractC2179 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f6811;

        public C2183(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                Yue.C6657.m25635(r1)
                java.lang.String r1 = Yue.C4415.m17326(r1)
                r0.f6811 = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = r2.f6811
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = "[^%s]"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                r0 = 6
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r2, Yue.C2104 r3) {
                r1 = this;
                Yue.ۥ۟ۢ۠ۤ r2 = r3.mo9793()
                java.util.List r2 = r2.m4275()
                java.util.Iterator r2 = r2.iterator()
            Lc:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L2a
                java.lang.Object r3 = r2.next()
                Yue.ۥ۟ۢ۠ۢ r3 = (Yue.C0646) r3
                java.lang.String r3 = r3.m4219()
                java.lang.String r3 = Yue.C4415.m17326(r3)
                java.lang.String r0 = r1.f6811
                boolean r3 = r3.startsWith(r0)
                if (r3 == 0) goto Lc
                r2 = 1
                return r2
            L2a:
                r2 = 0
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C2184 extends Yue.AbstractC2179.AbstractC2182 {
        public C2184(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = r2.f6809
                java.lang.String r1 = r2.f6810
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                java.lang.String r1 = "[%s=%s]"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                r0 = 3
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r2, Yue.C2104 r3) {
                r1 = this;
                java.lang.String r2 = r1.f6809
                boolean r2 = r3.mo14514(r2)
                if (r2 == 0) goto L1c
                java.lang.String r2 = r1.f6810
                java.lang.String r0 = r1.f6809
                java.lang.String r3 = r3.mo14513(r0)
                java.lang.String r3 = r3.trim()
                boolean r2 = r2.equalsIgnoreCase(r3)
                if (r2 == 0) goto L1c
                r2 = 1
                goto L1d
            L1c:
                r2 = 0
            L1d:
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C2185 extends Yue.AbstractC2179.AbstractC2182 {
        public C2185(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = r2.f6809
                java.lang.String r1 = r2.f6810
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                java.lang.String r1 = "[%s*=%s]"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                r0 = 6
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                java.lang.String r1 = r0.f6809
                boolean r1 = r2.mo14514(r1)
                if (r1 == 0) goto L1c
                java.lang.String r1 = r0.f6809
                java.lang.String r1 = r2.mo14513(r1)
                java.lang.String r1 = Yue.C4415.m17326(r1)
                java.lang.String r2 = r0.f6810
                boolean r1 = r1.contains(r2)
                if (r1 == 0) goto L1c
                r1 = 1
                goto L1d
            L1c:
                r1 = 0
            L1d:
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class C2186 extends Yue.AbstractC2179.AbstractC2182 {
        public C2186(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = r2.f6809
                java.lang.String r1 = r2.f6810
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                java.lang.String r1 = "[%s$=%s]"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                r0 = 4
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                java.lang.String r1 = r0.f6809
                boolean r1 = r2.mo14514(r1)
                if (r1 == 0) goto L1c
                java.lang.String r1 = r0.f6809
                java.lang.String r1 = r2.mo14513(r1)
                java.lang.String r1 = Yue.C4415.m17326(r1)
                java.lang.String r2 = r0.f6810
                boolean r1 = r1.endsWith(r2)
                if (r1 == 0) goto L1c
                r1 = 1
                goto L1d
            L1c:
                r1 = 0
            L1d:
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final class C2187 extends Yue.AbstractC2179 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f6812;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.util.regex.Pattern f6813;

        public C2187(java.lang.String r1, java.util.regex.Pattern r2) {
                r0 = this;
                r0.<init>()
                java.lang.String r1 = Yue.C4415.m17327(r1)
                r0.f6812 = r1
                r0.f6813 = r2
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = r2.f6812
                java.util.regex.Pattern r1 = r2.f6813
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                java.lang.String r1 = "[%s~=%s]"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                r0 = 8
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r2, Yue.C2104 r3) {
                r1 = this;
                java.lang.String r2 = r1.f6812
                boolean r2 = r3.mo14514(r2)
                if (r2 == 0) goto L1c
                java.util.regex.Pattern r2 = r1.f6813
                java.lang.String r0 = r1.f6812
                java.lang.String r3 = r3.mo14513(r0)
                java.util.regex.Matcher r2 = r2.matcher(r3)
                boolean r2 = r2.find()
                if (r2 == 0) goto L1c
                r2 = 1
                goto L1d
            L1c:
                r2 = 0
            L1d:
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥۣ۟۟۟, reason: contains not printable characters */
    public static final class C2188 extends Yue.AbstractC2179.AbstractC2182 {
        public C2188(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = r2.f6809
                java.lang.String r1 = r2.f6810
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                java.lang.String r1 = "[%s!=%s]"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                r0 = 3
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r2, Yue.C2104 r3) {
                r1 = this;
                java.lang.String r2 = r1.f6810
                java.lang.String r0 = r1.f6809
                java.lang.String r3 = r3.mo14513(r0)
                boolean r2 = r2.equalsIgnoreCase(r3)
                r2 = r2 ^ 1
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final class C2189 extends Yue.AbstractC2179.AbstractC2182 {
        public C2189(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = r2.f6809
                java.lang.String r1 = r2.f6810
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                java.lang.String r1 = "[%s^=%s]"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                r0 = 4
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                java.lang.String r1 = r0.f6809
                boolean r1 = r2.mo14514(r1)
                if (r1 == 0) goto L1c
                java.lang.String r1 = r0.f6809
                java.lang.String r1 = r2.mo14513(r1)
                java.lang.String r1 = Yue.C4415.m17326(r1)
                java.lang.String r2 = r0.f6810
                boolean r1 = r1.startsWith(r2)
                if (r1 == 0) goto L1c
                r1 = 1
                goto L1d
            L1c:
                r1 = 0
            L1d:
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final class C2190 extends Yue.AbstractC2179 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f6814;

        public C2190(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.f6814 = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = r2.f6814
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = ".%s"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                r0 = 6
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                java.lang.String r1 = r0.f6814
                boolean r1 = r2.m9879(r1)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final class C2191 extends Yue.AbstractC2179 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f6815;

        public C2191(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                java.lang.String r1 = Yue.C4415.m17326(r1)
                r0.f6815 = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = r2.f6815
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = ":containsData(%s)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                java.lang.String r1 = r2.m9841()
                java.lang.String r1 = Yue.C4415.m17326(r1)
                java.lang.String r2 = r0.f6815
                boolean r1 = r1.contains(r2)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final class C2192 extends Yue.AbstractC2179 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f6816;

        public C2192(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                java.lang.String r1 = Yue.C5973.m22125(r1)
                java.lang.String r1 = Yue.C4415.m17326(r1)
                r0.f6816 = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = r2.f6816
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = ":containsOwn(%s)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                java.lang.String r1 = r2.m9897()
                java.lang.String r1 = Yue.C4415.m17326(r1)
                java.lang.String r2 = r0.f6816
                boolean r1 = r1.contains(r2)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final class C2193 extends Yue.AbstractC2179 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f6817;

        public C2193(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                java.lang.String r1 = Yue.C5973.m22125(r1)
                java.lang.String r1 = Yue.C4415.m17326(r1)
                r0.f6817 = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = r2.f6817
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = ":contains(%s)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                r0 = 10
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                java.lang.String r1 = r2.m9925()
                java.lang.String r1 = Yue.C4415.m17326(r1)
                java.lang.String r2 = r0.f6817
                boolean r1 = r1.contains(r2)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠, reason: contains not printable characters */
    public static final class C2194 extends Yue.AbstractC2179 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f6818;

        public C2194(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.f6818 = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = r2.f6818
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = ":containsWholeOwnText(%s)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                java.lang.String r1 = r2.m9931()
                java.lang.String r2 = r0.f6818
                boolean r1 = r1.contains(r2)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠۟, reason: contains not printable characters */
    public static final class C2195 extends Yue.AbstractC2179 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f6819;

        public C2195(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.f6819 = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = r2.f6819
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = ":containsWholeText(%s)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                r0 = 10
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                java.lang.String r1 = r2.m9932()
                java.lang.String r2 = r0.f6819
                boolean r1 = r1.contains(r2)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠۠, reason: contains not printable characters */
    public static abstract class AbstractC2196 extends Yue.AbstractC2179 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final int f6820;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final int f6821;

        public AbstractC2196(int r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0, r2)
                return
        }

        public AbstractC2196(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.f6820 = r1
                r0.f6821 = r2
                return
        }

        public java.lang.String toString() {
                r3 = this;
                int r0 = r3.f6820
                if (r0 != 0) goto L19
                java.lang.String r0 = r3.mo10172()
                int r1 = r3.f6821
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                java.lang.String r1 = ":%s(%d)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
            L19:
                int r0 = r3.f6821
                if (r0 != 0) goto L32
                java.lang.String r0 = r3.mo10172()
                int r1 = r3.f6820
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                java.lang.String r1 = ":%s(%dn)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
            L32:
                java.lang.String r0 = r3.mo10172()
                int r1 = r3.f6820
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                int r2 = r3.f6821
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
                java.lang.String r1 = ":%s(%dn%+d)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r5, Yue.C2104 r6) {
                r4 = this;
                Yue.ۥ۠۠ۥۥ r0 = r6.m9899()
                r1 = 0
                if (r0 == 0) goto L27
                boolean r0 = r0 instanceof Yue.C1948
                if (r0 == 0) goto Lc
                goto L27
            Lc:
                int r5 = r4.mo10171(r5, r6)
                int r6 = r4.f6820
                r0 = 1
                if (r6 != 0) goto L1b
                int r6 = r4.f6821
                if (r5 != r6) goto L1a
                r1 = r0
            L1a:
                return r1
            L1b:
                int r2 = r4.f6821
                int r3 = r5 - r2
                int r3 = r3 * r6
                if (r3 < 0) goto L27
                int r5 = r5 - r2
                int r5 = r5 % r6
                if (r5 != 0) goto L27
                r1 = r0
            L27:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public abstract int mo10171(Yue.C2104 r1, Yue.C2104 r2);

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public abstract java.lang.String mo10172();
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final class C2197 extends Yue.AbstractC2179 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f6822;

        public C2197(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.f6822 = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = r2.f6822
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = "#%s"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                r0 = 2
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                java.lang.String r1 = r0.f6822
                java.lang.String r2 = r2.m9884()
                boolean r1 = r1.equals(r2)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final class C2198 extends Yue.AbstractC2179.AbstractC2199 {
        public C2198(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                int r0 = r2.f6823
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = ":eq(%d)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                int r1 = r2.m9846()
                int r2 = r0.f6823
                if (r1 != r2) goto La
                r1 = 1
                goto Lb
            La:
                r1 = 0
            Lb:
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥۣ۟۟۠, reason: contains not printable characters */
    public static abstract class AbstractC2199 extends Yue.AbstractC2179 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final int f6823;

        public AbstractC2199(int r1) {
                r0 = this;
                r0.<init>()
                r0.f6823 = r1
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final class C2200 extends Yue.AbstractC2179.AbstractC2199 {
        public C2200(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                int r0 = r2.f6823
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = ":gt(%d)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                int r1 = r2.m9846()
                int r2 = r0.f6823
                if (r1 <= r2) goto La
                r1 = 1
                goto Lb
            La:
                r1 = 0
            Lb:
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final class C2201 extends Yue.AbstractC2179.AbstractC2199 {
        public C2201(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                int r0 = r2.f6823
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = ":lt(%d)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                if (r1 == r2) goto Lc
                int r1 = r2.m9846()
                int r2 = r0.f6823
                if (r1 >= r2) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final class C2202 extends Yue.AbstractC2179 {
        public C2202() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = ":empty"
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r2, Yue.C2104 r3) {
                r1 = this;
                java.util.List r2 = r3.m17272()
                java.util.Iterator r2 = r2.iterator()
            L8:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L2d
                java.lang.Object r3 = r2.next()
                Yue.ۥۣۡۢۤ r3 = (Yue.AbstractC4398) r3
                boolean r0 = r3 instanceof Yue.C6151
                if (r0 == 0) goto L1f
                Yue.ۥۢۡ۠ۦ r3 = (Yue.C6151) r3
                boolean r2 = r3.m23015()
                return r2
            L1f:
                boolean r0 = r3 instanceof Yue.C1274
                if (r0 != 0) goto L8
                boolean r0 = r3 instanceof Yue.C7165
                if (r0 != 0) goto L8
                boolean r3 = r3 instanceof Yue.C1953
                if (r3 != 0) goto L8
                r2 = 0
                return r2
            L2d:
                r2 = 1
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final class C2203 extends Yue.AbstractC2179 {
        public C2203() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = ":first-child"
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r2, Yue.C2104 r3) {
                r1 = this;
                Yue.ۥ۠۠ۥۥ r2 = r3.m9899()
                if (r2 == 0) goto L12
                boolean r0 = r2 instanceof Yue.C1948
                if (r0 != 0) goto L12
                Yue.ۥ۠۠ۥۥ r2 = r2.m9852()
                if (r3 != r2) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final class C2204 extends Yue.AbstractC2179.C2210 {
        public C2204() {
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1)
                return
        }

        @Override // Yue.AbstractC2179.AbstractC2196
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = ":first-of-type"
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۡ, reason: contains not printable characters */
    public static final class C2205 extends Yue.AbstractC2179 {
        public C2205() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = ":last-child"
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r2, Yue.C2104 r3) {
                r1 = this;
                Yue.ۥ۠۠ۥۥ r2 = r3.m9899()
                if (r2 == 0) goto L12
                boolean r0 = r2 instanceof Yue.C1948
                if (r0 != 0) goto L12
                Yue.ۥ۠۠ۥۥ r2 = r2.m9892()
                if (r3 != r2) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final class C2206 extends Yue.AbstractC2179.C2209 {
        public C2206() {
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1)
                return
        }

        @Override // Yue.AbstractC2179.AbstractC2196
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = ":last-of-type"
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final class C2207 extends Yue.AbstractC2179.AbstractC2196 {
        public C2207(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.AbstractC2179.AbstractC2196
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public int mo10171(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                int r1 = r2.m9846()
                int r1 = r1 + 1
                return r1
        }

        @Override // Yue.AbstractC2179.AbstractC2196
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public java.lang.String mo10172() {
                r1 = this;
                java.lang.String r0 = "nth-child"
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final class C2208 extends Yue.AbstractC2179.AbstractC2196 {
        public C2208(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.AbstractC2179.AbstractC2196
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public int mo10171(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                Yue.ۥ۠۠ۥۥ r1 = r2.m9899()
                if (r1 != 0) goto L8
                r1 = 0
                return r1
            L8:
                Yue.ۥ۠۠ۥۥ r1 = r2.m9899()
                int r1 = r1.m9832()
                int r2 = r2.m9846()
                int r1 = r1 - r2
                return r1
        }

        @Override // Yue.AbstractC2179.AbstractC2196
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public java.lang.String mo10172() {
                r1 = this;
                java.lang.String r0 = "nth-last-child"
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static class C2209 extends Yue.AbstractC2179.AbstractC2196 {
        public C2209(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.AbstractC2179.AbstractC2196
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public int mo10171(Yue.C2104 r4, Yue.C2104 r5) {
                r3 = this;
                Yue.ۥ۠۠ۥۥ r4 = r5.m9899()
                r0 = 0
                if (r4 != 0) goto L8
                return r0
            L8:
                r4 = r5
            L9:
                if (r4 == 0) goto L20
                java.lang.String r1 = r4.mo9808()
                java.lang.String r2 = r5.mo9808()
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L1b
                int r0 = r0 + 1
            L1b:
                Yue.ۥ۠۠ۥۥ r4 = r4.m9894()
                goto L9
            L20:
                return r0
        }

        @Override // Yue.AbstractC2179.AbstractC2196
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public java.lang.String mo10172() {
                r1 = this;
                java.lang.String r0 = "nth-last-of-type"
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static class C2210 extends Yue.AbstractC2179.AbstractC2196 {
        public C2210(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // Yue.AbstractC2179.AbstractC2196
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public int mo10171(Yue.C2104 r7, Yue.C2104 r8) {
                r6 = this;
                Yue.ۥ۠۠ۥۥ r7 = r8.m9899()
                r0 = 0
                if (r7 != 0) goto L8
                return r0
            L8:
                int r1 = r7.mo9797()
                r2 = r0
            Ld:
                if (r0 >= r1) goto L29
                Yue.ۥۣۡۢۤ r3 = r7.m17271(r0)
                java.lang.String r4 = r3.mo9808()
                java.lang.String r5 = r8.mo9808()
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L23
                int r2 = r2 + 1
            L23:
                if (r3 != r8) goto L26
                goto L29
            L26:
                int r0 = r0 + 1
                goto Ld
            L29:
                return r2
        }

        @Override // Yue.AbstractC2179.AbstractC2196
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public java.lang.String mo10172() {
                r1 = this;
                java.lang.String r0 = "nth-of-type"
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final class C2211 extends Yue.AbstractC2179 {
        public C2211() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = ":only-child"
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                Yue.ۥ۠۠ۥۥ r1 = r2.m9899()
                if (r1 == 0) goto L16
                boolean r1 = r1 instanceof Yue.C1948
                if (r1 != 0) goto L16
                Yue.ۥ۠۠ۥۧ r1 = r2.m9919()
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L16
                r1 = 1
                goto L17
            L16:
                r1 = 0
            L17:
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final class C2212 extends Yue.AbstractC2179 {
        public C2212() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = ":only-of-type"
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r6, Yue.C2104 r7) {
                r5 = this;
                Yue.ۥ۠۠ۥۥ r6 = r7.m9899()
                r0 = 0
                if (r6 == 0) goto L2f
                boolean r1 = r6 instanceof Yue.C1948
                if (r1 == 0) goto Lc
                goto L2f
            Lc:
                Yue.ۥ۠۠ۥۥ r6 = r6.m9852()
                r1 = r0
            L11:
                r2 = 1
                if (r6 == 0) goto L2c
                java.lang.String r3 = r6.mo9808()
                java.lang.String r4 = r7.mo9808()
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L24
                int r1 = r1 + 1
            L24:
                if (r1 <= r2) goto L27
                goto L2c
            L27:
                Yue.ۥ۠۠ۥۥ r6 = r6.m9894()
                goto L11
            L2c:
                if (r1 != r2) goto L2f
                r0 = r2
            L2f:
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final class C2213 extends Yue.AbstractC2179 {
        public C2213() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = ":root"
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r2, Yue.C2104 r3) {
                r1 = this;
                boolean r0 = r2 instanceof Yue.C1948
                if (r0 == 0) goto L8
                Yue.ۥ۠۠ۥۥ r2 = r2.m9852()
            L8:
                if (r3 != r2) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final class C2214 extends Yue.AbstractC2179 {
        public C2214() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = ":matchText"
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                r0 = -1
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r6, Yue.C2104 r7) {
                r5 = this;
                boolean r6 = r7 instanceof Yue.C4985
                if (r6 == 0) goto L6
                r6 = 1
                return r6
            L6:
                java.util.List r6 = r7.m9926()
                java.util.Iterator r6 = r6.iterator()
            Le:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L40
                java.lang.Object r0 = r6.next()
                Yue.ۥۢۡ۠ۦ r0 = (Yue.C6151) r0
                Yue.ۥۡۥۤ۟ r1 = new Yue.ۥۡۥۤ۟
                java.lang.String r2 = r7.m9924()
                Yue.ۥۢ۠ۨۡ r3 = r7.m9921()
                java.lang.String r3 = r3.m22909()
                Yue.ۥۣۡۧۥ r4 = Yue.C4699.f14917
                Yue.ۥۢ۠ۨۡ r2 = Yue.C6104.m22898(r2, r3, r4)
                java.lang.String r3 = r7.mo9794()
                Yue.ۥ۟ۢ۠ۤ r4 = r7.mo9793()
                r1.<init>(r2, r3, r4)
                r0.m17296(r1)
                r1.m9818(r0)
                goto Le
            L40:
                r6 = 0
                return r6
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final class C2215 extends Yue.AbstractC2179 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.util.regex.Pattern f6824;

        public C2215(java.util.regex.Pattern r1) {
                r0 = this;
                r0.<init>()
                r0.f6824 = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.util.regex.Pattern r0 = r2.f6824
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = ":matches(%s)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                r0 = 8
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                java.util.regex.Pattern r1 = r0.f6824
                java.lang.String r2 = r2.m9925()
                java.util.regex.Matcher r1 = r1.matcher(r2)
                boolean r1 = r1.find()
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۢ, reason: contains not printable characters */
    public static final class C2216 extends Yue.AbstractC2179 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.util.regex.Pattern f6825;

        public C2216(java.util.regex.Pattern r1) {
                r0 = this;
                r0.<init>()
                r0.f6825 = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.util.regex.Pattern r0 = r2.f6825
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = ":matchesOwn(%s)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                r0 = 7
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                java.util.regex.Pattern r1 = r0.f6825
                java.lang.String r2 = r2.m9897()
                java.util.regex.Matcher r1 = r1.matcher(r2)
                boolean r1 = r1.find()
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final class C2217 extends Yue.AbstractC2179 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.util.regex.Pattern f6826;

        public C2217(java.util.regex.Pattern r1) {
                r0 = this;
                r0.<init>()
                r0.f6826 = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.util.regex.Pattern r0 = r2.f6826
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = ":matchesWholeOwnText(%s)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                r0 = 7
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                java.util.regex.Pattern r1 = r0.f6826
                java.lang.String r2 = r2.m9931()
                java.util.regex.Matcher r1 = r1.matcher(r2)
                boolean r1 = r1.find()
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final class C2218 extends Yue.AbstractC2179 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.util.regex.Pattern f6827;

        public C2218(java.util.regex.Pattern r1) {
                r0 = this;
                r0.<init>()
                r0.f6827 = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.util.regex.Pattern r0 = r2.f6827
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = ":matchesWholeText(%s)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                r0 = 8
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                java.util.regex.Pattern r1 = r0.f6827
                java.lang.String r2 = r2.m9932()
                java.util.regex.Matcher r1 = r1.matcher(r2)
                boolean r1 = r1.find()
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final class C2219 extends Yue.AbstractC2179 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f6828;

        public C2219(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.f6828 = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = r2.f6828
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = "%s"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                java.lang.String r1 = r0.f6828
                boolean r1 = r2.m17282(r1)
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final class C2220 extends Yue.AbstractC2179 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String f6829;

        public C2220(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.f6829 = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = r2.f6829
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = "%s"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                java.lang.String r1 = r2.mo9808()
                java.lang.String r2 = r0.f6829
                boolean r1 = r1.endsWith(r2)
                return r1
        }
    }

    public AbstractC2179() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ boolean m10168(Yue.AbstractC2179 r0, Yue.C2104 r1, Yue.C2104 r2) {
            boolean r0 = r0.m10170(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.util.function.Predicate<Yue.C2104> m10169(Yue.C2104 r2) {
            r1 = this;
            Yue.ۥۣ۠ۡ۠ r0 = new Yue.ۥۣ۠ۡ۠
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ */
    public int mo6686() {
            r1 = this;
            r0 = 5
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final /* synthetic */ boolean m10170(Yue.C2104 r1, Yue.C2104 r2) {
            r0 = this;
            boolean r1 = r0.mo6691(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public abstract boolean mo6691(Yue.C2104 r1, Yue.C2104 r2);

    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo6687() {
            r0 = this;
            return
    }
}
