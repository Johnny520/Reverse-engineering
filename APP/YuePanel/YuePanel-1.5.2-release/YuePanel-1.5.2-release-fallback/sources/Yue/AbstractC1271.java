package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۣۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1271 extends Yue.AbstractC2179 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.util.Comparator<Yue.AbstractC2179> f3861 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.ArrayList<Yue.AbstractC2179> f3862;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.util.ArrayList<Yue.AbstractC2179> f3863;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f3864;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f3865;

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۣۤ$ۥ, reason: contains not printable characters */
    public static final class C1272 extends Yue.AbstractC1271 {
        public C1272(java.util.Collection<Yue.AbstractC2179> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public C1272(Yue.AbstractC2179... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.util.ArrayList<Yue.ۥ۠ۡ۠ۤ> r0 = r2.f3862
                java.lang.String r1 = ""
                java.lang.String r0 = Yue.C5973.m22122(r0, r1)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean mo6691(Yue.C2104 r4, Yue.C2104 r5) {
                r3 = this;
                r0 = 0
                r1 = r0
            L2:
                int r2 = r3.f3864
                if (r1 >= r2) goto L18
                java.util.ArrayList<Yue.ۥ۠ۡ۠ۤ> r2 = r3.f3863
                java.lang.Object r2 = r2.get(r1)
                Yue.ۥ۠ۡ۠ۤ r2 = (Yue.AbstractC2179) r2
                boolean r2 = r2.mo6691(r4, r5)
                if (r2 != 0) goto L15
                return r0
            L15:
                int r1 = r1 + 1
                goto L2
            L18:
                r4 = 1
                return r4
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۣۤ$ۥ۟, reason: contains not printable characters */
    public static final class C1273 extends Yue.AbstractC1271 {
        public C1273() {
                r0 = this;
                r0.<init>()
                return
        }

        public C1273(java.util.Collection<Yue.AbstractC2179> r3) {
                r2 = this;
                r2.<init>()
                int r0 = r2.f3864
                r1 = 1
                if (r0 <= r1) goto L13
                java.util.ArrayList<Yue.ۥ۠ۡ۠ۤ> r0 = r2.f3862
                Yue.ۥ۟ۥۣۤ$ۥ r1 = new Yue.ۥ۟ۥۣۤ$ۥ
                r1.<init>(r3)
                r0.add(r1)
                goto L18
            L13:
                java.util.ArrayList<Yue.ۥ۠ۡ۠ۤ> r0 = r2.f3862
                r0.addAll(r3)
            L18:
                r2.m6690()
                return
        }

        public C1273(Yue.AbstractC2179... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.util.ArrayList<Yue.ۥ۠ۡ۠ۤ> r0 = r2.f3862
                java.lang.String r1 = ", "
                java.lang.String r0 = Yue.C5973.m22122(r0, r1)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r4, Yue.C2104 r5) {
                r3 = this;
                r0 = 0
                r1 = r0
            L2:
                int r2 = r3.f3864
                if (r1 >= r2) goto L19
                java.util.ArrayList<Yue.ۥ۠ۡ۠ۤ> r2 = r3.f3863
                java.lang.Object r2 = r2.get(r1)
                Yue.ۥ۠ۡ۠ۤ r2 = (Yue.AbstractC2179) r2
                boolean r2 = r2.mo6691(r4, r5)
                if (r2 == 0) goto L16
                r4 = 1
                return r4
            L16:
                int r1 = r1 + 1
                goto L2
            L19:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public void m6692(Yue.AbstractC2179 r2) {
                r1 = this;
                java.util.ArrayList<Yue.ۥ۠ۡ۠ۤ> r0 = r1.f3862
                r0.add(r2)
                r1.m6690()
                return
        }
    }

    static {
            Yue.ۥ۟ۥۤۢ r0 = new Yue.ۥ۟ۥۤۢ
            r0.<init>()
            Yue.AbstractC1271.f3861 = r0
            return
    }

    public AbstractC1271() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f3864 = r0
            r1.f3865 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3862 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3863 = r0
            return
    }

    public AbstractC1271(java.util.Collection<Yue.AbstractC2179> r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList<Yue.ۥ۠ۡ۠ۤ> r0 = r1.f3862
            r0.addAll(r2)
            r1.m6690()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ int m6684(Yue.AbstractC2179 r0, Yue.AbstractC2179 r1) {
            int r0 = m6685(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ int m6685(Yue.AbstractC2179 r0, Yue.AbstractC2179 r1) {
            int r0 = r0.mo6686()
            int r1 = r1.mo6686()
            int r0 = r0 - r1
            return r0
    }

    @Override // Yue.AbstractC2179
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int mo6686() {
            r1 = this;
            int r0 = r1.f3865
            return r0
    }

    @Override // Yue.AbstractC2179
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo6687() {
            r2 = this;
            java.util.ArrayList<Yue.ۥ۠ۡ۠ۤ> r0 = r2.f3862
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠ۡ۠ۤ r1 = (Yue.AbstractC2179) r1
            r1.mo6687()
            goto L6
        L16:
            super.mo6687()
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m6688(Yue.AbstractC2179 r3) {
            r2 = this;
            java.util.ArrayList<Yue.ۥ۠ۡ۠ۤ> r0 = r2.f3862
            int r1 = r2.f3864
            int r1 = r1 + (-1)
            r0.set(r1, r3)
            r2.m6690()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Yue.AbstractC2179 m6689() {
            r2 = this;
            int r0 = r2.f3864
            if (r0 <= 0) goto Lf
            java.util.ArrayList<Yue.ۥ۠ۡ۠ۤ> r1 = r2.f3862
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.get(r0)
            Yue.ۥ۠ۡ۠ۤ r0 = (Yue.AbstractC2179) r0
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m6690() {
            r3 = this;
            java.util.ArrayList<Yue.ۥ۠ۡ۠ۤ> r0 = r3.f3862
            int r0 = r0.size()
            r3.f3864 = r0
            r0 = 0
            r3.f3865 = r0
            java.util.ArrayList<Yue.ۥ۠ۡ۠ۤ> r0 = r3.f3862
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            Yue.ۥ۠ۡ۠ۤ r1 = (Yue.AbstractC2179) r1
            int r2 = r3.f3865
            int r1 = r1.mo6686()
            int r2 = r2 + r1
            r3.f3865 = r2
            goto L11
        L27:
            java.util.ArrayList<Yue.ۥ۠ۡ۠ۤ> r0 = r3.f3863
            r0.clear()
            java.util.ArrayList<Yue.ۥ۠ۡ۠ۤ> r0 = r3.f3863
            java.util.ArrayList<Yue.ۥ۠ۡ۠ۤ> r1 = r3.f3862
            r0.addAll(r1)
            java.util.ArrayList<Yue.ۥ۠ۡ۠ۤ> r0 = r3.f3863
            java.util.Comparator<Yue.ۥ۠ۡ۠ۤ> r1 = Yue.AbstractC1271.f3861
            java.util.Collections.sort(r0, r1)
            return
    }
}
