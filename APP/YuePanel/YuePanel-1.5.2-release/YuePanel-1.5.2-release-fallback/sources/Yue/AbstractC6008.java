package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6008 extends Yue.AbstractC2179 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.AbstractC2179 f21781;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.ThreadLocal<java.util.IdentityHashMap<Yue.C2104, java.util.IdentityHashMap<Yue.C2104, java.lang.Boolean>>> f21782;

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠۠$ۥ, reason: contains not printable characters */
    public static class C6009 extends Yue.AbstractC6008 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final java.lang.ThreadLocal<Yue.C4402<Yue.C2104>> f21783 = null;

        static {
                Yue.ۥۣۢ۠۟ r0 = new Yue.ۥۣۢ۠۟
                r0.<init>()
                java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
                Yue.AbstractC6008.C6009.f21783 = r0
                return
        }

        public C6009(Yue.AbstractC2179 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static /* synthetic */ Yue.C4402 m22694() {
                Yue.ۥۣۡۢۦ r0 = m22695()
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ Yue.C4402 m22695() {
                Yue.ۥۣۡۢۦ r0 = new Yue.ۥۣۡۢۦ
                Yue.ۥ۠۠ۥۥ r1 = new Yue.ۥ۠۠ۥۥ
                java.lang.String r2 = "html"
                r1.<init>(r2)
                java.lang.Class<Yue.ۥ۠۠ۥۥ> r2 = Yue.C2104.class
                r0.<init>(r1, r2)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                Yue.ۥ۠ۡ۠ۤ r0 = r2.f21781
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = ":has(%s)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                Yue.ۥ۠ۡ۠ۤ r0 = r1.f21781
                int r0 = r0.mo6686()
                int r0 = r0 * 10
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r3, Yue.C2104 r4) {
                r2 = this;
                java.lang.ThreadLocal<Yue.ۥۣۡۢۦ<Yue.ۥ۠۠ۥۥ>> r3 = Yue.AbstractC6008.C6009.f21783
                java.lang.Object r3 = r3.get()
                Yue.ۥۣۡۢۦ r3 = (Yue.C4402) r3
                r3.m17310(r4)
            Lb:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L24
                Yue.ۥۣۡۢۤ r0 = r3.m17309()
                Yue.ۥ۠۠ۥۥ r0 = (Yue.C2104) r0
                if (r0 != r4) goto L1a
                goto Lb
            L1a:
                Yue.ۥ۠ۡ۠ۤ r1 = r2.f21781
                boolean r0 = r1.mo6691(r4, r0)
                if (r0 == 0) goto Lb
                r3 = 1
                return r3
            L24:
                r3 = 0
                return r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠۠$ۥ۟, reason: contains not printable characters */
    @java.lang.Deprecated
    public static class C6010 extends Yue.AbstractC6008 {
        public C6010(Yue.AbstractC2179 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                Yue.ۥ۠ۡ۠ۤ r0 = r2.f21781
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = "%s > "
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                Yue.ۥ۠ۡ۠ۤ r0 = r1.f21781
                int r0 = r0.mo6686()
                int r0 = r0 + 1
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r2, Yue.C2104 r3) {
                r1 = this;
                r0 = 0
                if (r2 != r3) goto L4
                return r0
            L4:
                Yue.ۥ۠۠ۥۥ r3 = r3.m9899()
                if (r3 == 0) goto L11
                boolean r2 = r1.m22693(r2, r3)
                if (r2 == 0) goto L11
                r0 = 1
            L11:
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠۠$ۥ۟۟, reason: contains not printable characters */
    public static class C6011 extends Yue.AbstractC2179 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.util.ArrayList<Yue.AbstractC2179> f21784;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f21785;

        public C6011(Yue.AbstractC2179 r3) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.f21784 = r0
                r1 = 2
                r2.f21785 = r1
                r0.add(r3)
                int r0 = r2.f21785
                int r3 = r3.mo6686()
                int r0 = r0 + r3
                r2.f21785 = r0
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.util.ArrayList<Yue.ۥ۠ۡ۠ۤ> r0 = r2.f21784
                java.lang.String r1 = " > "
                java.lang.String r0 = Yue.C5973.m22122(r0, r1)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                int r0 = r1.f21785
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r5, Yue.C2104 r6) {
                r4 = this;
                r0 = 0
                if (r6 != r5) goto L4
                return r0
            L4:
                java.util.ArrayList<Yue.ۥ۠ۡ۠ۤ> r1 = r4.f21784
                int r1 = r1.size()
                r2 = 1
                int r1 = r1 - r2
            Lc:
                if (r1 < 0) goto L27
                if (r6 != 0) goto L11
                return r0
            L11:
                java.util.ArrayList<Yue.ۥ۠ۡ۠ۤ> r3 = r4.f21784
                java.lang.Object r3 = r3.get(r1)
                Yue.ۥ۠ۡ۠ۤ r3 = (Yue.AbstractC2179) r3
                boolean r3 = r3.mo6691(r5, r6)
                if (r3 != 0) goto L20
                return r0
            L20:
                Yue.ۥ۠۠ۥۥ r6 = r6.m9899()
                int r1 = r1 + (-1)
                goto Lc
            L27:
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m22696(Yue.AbstractC2179 r2) {
                r1 = this;
                java.util.ArrayList<Yue.ۥ۠ۡ۠ۤ> r0 = r1.f21784
                r0.add(r2)
                int r0 = r1.f21785
                int r2 = r2.mo6686()
                int r0 = r0 + r2
                r1.f21785 = r0
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠۠$ۥ۟۟۟, reason: contains not printable characters */
    public static class C6012 extends Yue.AbstractC6008 {
        public C6012(Yue.AbstractC2179 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                Yue.ۥ۠ۡ۠ۤ r0 = r2.f21781
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = "%s + "
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                Yue.ۥ۠ۡ۠ۤ r0 = r1.f21781
                int r0 = r0.mo6686()
                int r0 = r0 + 2
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r2, Yue.C2104 r3) {
                r1 = this;
                r0 = 0
                if (r2 != r3) goto L4
                return r0
            L4:
                Yue.ۥ۠۠ۥۥ r3 = r3.m9907()
                if (r3 == 0) goto L11
                boolean r2 = r1.m22693(r2, r3)
                if (r2 == 0) goto L11
                r0 = 1
            L11:
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠۠$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C6013 extends Yue.AbstractC6008 {
        public C6013(Yue.AbstractC2179 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                Yue.ۥ۠ۡ۠ۤ r0 = r2.f21781
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = ":is(%s)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                Yue.ۥ۠ۡ۠ۤ r0 = r1.f21781
                int r0 = r0.mo6686()
                int r0 = r0 + 2
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r2, Yue.C2104 r3) {
                r1 = this;
                Yue.ۥ۠ۡ۠ۤ r0 = r1.f21781
                boolean r2 = r0.mo6691(r2, r3)
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠۠$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C6014 extends Yue.AbstractC6008 {
        public C6014(Yue.AbstractC2179 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                Yue.ۥ۠ۡ۠ۤ r0 = r2.f21781
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = ":not(%s)"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                Yue.ۥ۠ۡ۠ۤ r0 = r1.f21781
                int r0 = r0.mo6686()
                int r0 = r0 + 2
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r1, Yue.C2104 r2) {
                r0 = this;
                boolean r1 = r0.m22693(r1, r2)
                r1 = r1 ^ 1
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠۠$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C6015 extends Yue.AbstractC6008 {
        public C6015(Yue.AbstractC2179 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                Yue.ۥ۠ۡ۠ۤ r0 = r2.f21781
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = "%s "
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                Yue.ۥ۠ۡ۠ۤ r0 = r1.f21781
                int r0 = r0.mo6686()
                int r0 = r0 * 2
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r3, Yue.C2104 r4) {
                r2 = this;
                r0 = 0
                if (r3 != r4) goto L4
                return r0
            L4:
                Yue.ۥ۠۠ۥۥ r4 = r4.m9899()
            L8:
                if (r4 == 0) goto L1a
                boolean r1 = r2.m22693(r3, r4)
                if (r1 == 0) goto L12
                r3 = 1
                return r3
            L12:
                if (r4 != r3) goto L15
                goto L1a
            L15:
                Yue.ۥ۠۠ۥۥ r4 = r4.m9899()
                goto L8
            L1a:
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠۠$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static class C6016 extends Yue.AbstractC6008 {
        public C6016(Yue.AbstractC2179 r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                Yue.ۥ۠ۡ۠ۤ r0 = r2.f21781
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.String r1 = "%s ~ "
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟ */
        public int mo6686() {
                r1 = this;
                Yue.ۥ۠ۡ۠ۤ r0 = r1.f21781
                int r0 = r0.mo6686()
                int r0 = r0 * 3
                return r0
        }

        @Override // Yue.AbstractC2179
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public boolean mo6691(Yue.C2104 r4, Yue.C2104 r5) {
                r3 = this;
                r0 = 0
                if (r4 != r5) goto L4
                return r0
            L4:
                Yue.ۥ۠۠ۥۥ r1 = r5.m9853()
            L8:
                if (r1 == 0) goto L1a
                if (r1 != r5) goto Ld
                goto L1a
            Ld:
                boolean r2 = r3.m22693(r4, r1)
                if (r2 == 0) goto L15
                r4 = 1
                return r4
            L15:
                Yue.ۥ۠۠ۥۥ r1 = r1.m9894()
                goto L8
            L1a:
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠۠$ۥۣ۟۟۟, reason: contains not printable characters */
    public static class C6017 extends Yue.AbstractC2179 {
        public C6017() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = ""
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
                if (r1 != r2) goto L4
                r1 = 1
                goto L5
            L4:
                r1 = 0
            L5:
                return r1
        }
    }

    public AbstractC6008(Yue.AbstractC2179 r2) {
            r1 = this;
            r1.<init>()
            Yue.ۥۣۢ۠ r0 = new Yue.ۥۣۢ۠
            r0.<init>()
            java.lang.ThreadLocal r0 = java.lang.ThreadLocal.withInitial(r0)
            r1.f21782 = r0
            r1.f21781 = r2
            return
    }

    @Override // Yue.AbstractC2179
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo6687() {
            r1 = this;
            java.lang.ThreadLocal<java.util.IdentityHashMap<Yue.ۥ۠۠ۥۥ, java.util.IdentityHashMap<Yue.ۥ۠۠ۥۥ, java.lang.Boolean>>> r0 = r1.f21782
            java.lang.Object r0 = r0.get()
            java.util.IdentityHashMap r0 = (java.util.IdentityHashMap) r0
            r0.clear()
            super.mo6687()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m22693(Yue.C2104 r3, Yue.C2104 r4) {
            r2 = this;
            java.lang.ThreadLocal<java.util.IdentityHashMap<Yue.ۥ۠۠ۥۥ, java.util.IdentityHashMap<Yue.ۥ۠۠ۥۥ, java.lang.Boolean>>> r0 = r2.f21782
            java.lang.Object r0 = r0.get()
            java.util.IdentityHashMap r0 = (java.util.IdentityHashMap) r0
            java.lang.Object r1 = r0.get(r3)
            java.util.IdentityHashMap r1 = (java.util.IdentityHashMap) r1
            if (r1 != 0) goto L18
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            r0.put(r3, r1)
        L18:
            java.lang.Object r0 = r1.get(r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 != 0) goto L2d
            Yue.ۥ۠ۡ۠ۤ r0 = r2.f21781
            boolean r3 = r0.mo6691(r3, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.put(r4, r0)
        L2d:
            boolean r3 = r0.booleanValue()
            return r3
    }
}
