package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4398 implements java.lang.Cloneable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final java.util.List<Yue.AbstractC4398> f13956 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final java.lang.String f13957 = "";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Yue.AbstractC4398 f13958;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f13959;

    /* JADX INFO: renamed from: Yue.ۥۣۡۢۤ$ۥ, reason: contains not printable characters */
    public static class C4399 implements Yue.InterfaceC4406 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.Appendable f13960;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.C1948.C1949 f13961;

        public C4399(java.lang.Appendable r1, Yue.C1948.C1949 r2) {
                r0 = this;
                r0.<init>()
                r0.f13960 = r1
                r0.f13961 = r2
                r2.m8979()
                return
        }

        @Override // Yue.InterfaceC4406
        /* JADX INFO: renamed from: ۥ */
        public void mo6058(Yue.AbstractC4398 r3, int r4) {
                r2 = this;
                java.lang.Appendable r0 = r2.f13960     // Catch: java.io.IOException -> L8
                Yue.ۥ۠۟ۧۥ$ۥ r1 = r2.f13961     // Catch: java.io.IOException -> L8
                r3.mo5131(r0, r4, r1)     // Catch: java.io.IOException -> L8
                return
            L8:
                r3 = move-exception
                Yue.ۥۡۨۢۨ r4 = new Yue.ۥۡۨۢۨ
                r4.<init>(r3)
                throw r4
        }

        @Override // Yue.InterfaceC4406
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo6059(Yue.AbstractC4398 r3, int r4) {
                r2 = this;
                java.lang.String r0 = r3.mo5130()
                java.lang.String r1 = "#text"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L1b
                java.lang.Appendable r0 = r2.f13960     // Catch: java.io.IOException -> L14
                Yue.ۥ۠۟ۧۥ$ۥ r1 = r2.f13961     // Catch: java.io.IOException -> L14
                r3.mo5132(r0, r4, r1)     // Catch: java.io.IOException -> L14
                goto L1b
            L14:
                r3 = move-exception
                Yue.ۥۡۨۢۨ r4 = new Yue.ۥۡۨۢۨ
                r4.<init>(r3)
                throw r4
            L1b:
                return
        }
    }

    static {
            java.util.List r0 = java.util.Collections.emptyList()
            Yue.AbstractC4398.f13956 = r0
            return
    }

    public AbstractC4398() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            Yue.ۥۣۡۢۤ r0 = r1.mo5129()
            return r0
    }

    public boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 != r1) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            return r1
    }

    public int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.mo8936()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ */
    public java.lang.String mo14512(java.lang.String r3) {
            r2 = this;
            Yue.C6657.m25632(r3)
            boolean r0 = r2.mo9805()
            if (r0 == 0) goto L25
            Yue.ۥ۟ۢ۠ۤ r0 = r2.mo9793()
            boolean r0 = r0.m4287(r3)
            if (r0 != 0) goto L14
            goto L25
        L14:
            java.lang.String r0 = r2.mo9794()
            Yue.ۥ۟ۢ۠ۤ r1 = r2.mo9793()
            java.lang.String r3 = r1.m4282(r3)
            java.lang.String r3 = Yue.C5973.m22129(r0, r3)
            return r3
        L25:
            java.lang.String r3 = ""
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m17267(int r8, Yue.AbstractC4398... r9) {
            r7 = this;
            Yue.C6657.m25635(r9)
            int r0 = r9.length
            if (r0 != 0) goto L7
            return
        L7:
            java.util.List r0 = r7.mo9802()
            r1 = 0
            r2 = r9[r1]
            Yue.ۥۣۡۢۤ r2 = r2.mo9809()
            if (r2 == 0) goto L59
            int r3 = r2.mo9797()
            int r4 = r9.length
            if (r3 != r4) goto L59
            java.util.List r3 = r2.mo9802()
            int r4 = r9.length
        L20:
            int r5 = r4 + (-1)
            if (r4 <= 0) goto L2f
            r4 = r9[r5]
            java.lang.Object r6 = r3.get(r5)
            if (r4 == r6) goto L2d
            goto L59
        L2d:
            r4 = r5
            goto L20
        L2f:
            int r3 = r7.mo9797()
            if (r3 != 0) goto L37
            r3 = 1
            goto L38
        L37:
            r3 = r1
        L38:
            r2.mo9801()
            java.util.List r2 = java.util.Arrays.asList(r9)
            r0.addAll(r8, r2)
            int r0 = r9.length
        L43:
            int r2 = r0 + (-1)
            if (r0 <= 0) goto L4d
            r0 = r9[r2]
            r0.f13958 = r7
            r0 = r2
            goto L43
        L4d:
            if (r3 == 0) goto L55
            r9 = r9[r1]
            int r9 = r9.f13959
            if (r9 == 0) goto L58
        L55:
            r7.m17292(r8)
        L58:
            return
        L59:
            Yue.C6657.m25630(r9)
            int r2 = r9.length
        L5d:
            if (r1 >= r2) goto L67
            r3 = r9[r1]
            r7.m17294(r3)
            int r1 = r1 + 1
            goto L5d
        L67:
            java.util.List r9 = java.util.Arrays.asList(r9)
            r0.addAll(r8, r9)
            r7.m17292(r8)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m17268(Yue.AbstractC4398... r6) {
            r5 = this;
            java.util.List r0 = r5.mo9802()
            int r1 = r6.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L1c
            r3 = r6[r2]
            r5.m17294(r3)
            r0.add(r3)
            int r4 = r0.size()
            int r4 = r4 + (-1)
            r3.m17299(r4)
            int r2 = r2 + 1
            goto L6
        L1c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m17269(int r4, java.lang.String r5) {
            r3 = this;
            Yue.C6657.m25635(r5)
            Yue.ۥۣۡۢۤ r0 = r3.f13958
            Yue.C6657.m25635(r0)
            Yue.ۥۣۡۢۤ r0 = r3.mo9809()
            boolean r0 = r0 instanceof Yue.C2104
            if (r0 == 0) goto L17
            Yue.ۥۣۡۢۤ r0 = r3.mo9809()
            Yue.ۥ۠۠ۥۥ r0 = (Yue.C2104) r0
            goto L18
        L17:
            r0 = 0
        L18:
            Yue.ۥۣۡۧۦ r1 = Yue.C4405.m17317(r3)
            java.lang.String r2 = r3.mo9794()
            java.util.List r5 = r1.m18632(r5, r0, r2)
            Yue.ۥۣۡۢۤ r0 = r3.f13958
            r1 = 0
            Yue.ۥۣۡۢۤ[] r1 = new Yue.AbstractC4398[r1]
            java.lang.Object[] r5 = r5.toArray(r1)
            Yue.ۥۣۡۢۤ[] r5 = (Yue.AbstractC4398[]) r5
            r0.m17267(r4, r5)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public Yue.AbstractC4398 mo9790(Yue.AbstractC4398 r3) {
            r2 = this;
            Yue.C6657.m25635(r3)
            Yue.ۥۣۡۢۤ r0 = r2.f13958
            Yue.C6657.m25635(r0)
            Yue.ۥۣۡۢۤ r0 = r3.f13958
            Yue.ۥۣۡۢۤ r1 = r2.f13958
            if (r0 != r1) goto L11
            r3.m17293()
        L11:
            Yue.ۥۣۡۢۤ r0 = r2.f13958
            int r1 = r2.f13959
            int r1 = r1 + 1
            Yue.ۥۣۡۢۤ[] r3 = new Yue.AbstractC4398[]{r3}
            r0.m17267(r1, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public Yue.AbstractC4398 mo9791(java.lang.String r2) {
            r1 = this;
            int r0 = r1.f13959
            int r0 = r0 + 1
            r1.m17269(r0, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public Yue.AbstractC4398 mo9792(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            Yue.ۥۣۡۧۦ r0 = Yue.C4405.m17317(r1)
            Yue.ۥۣۡۧۥ r0 = r0.m18638()
            java.lang.String r2 = r0.m18612(r2)
            Yue.ۥ۟ۢ۠ۤ r0 = r1.mo9793()
            r0.m4296(r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public java.lang.String mo14513(java.lang.String r4) {
            r3 = this;
            Yue.C6657.m25635(r4)
            boolean r0 = r3.mo9805()
            java.lang.String r1 = ""
            if (r0 != 0) goto Lc
            return r1
        Lc:
            Yue.ۥ۟ۢ۠ۤ r0 = r3.mo9793()
            java.lang.String r0 = r0.m4282(r4)
            int r2 = r0.length()
            if (r2 <= 0) goto L1b
            return r0
        L1b:
            java.lang.String r0 = "abs:"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L2d
            r0 = 4
            java.lang.String r4 = r4.substring(r0)
            java.lang.String r4 = r3.mo14512(r4)
            return r4
        L2d:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public abstract Yue.C0648 mo9793();

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m17270() {
            r1 = this;
            boolean r0 = r1.mo9805()
            if (r0 == 0) goto Lf
            Yue.ۥ۟ۢ۠ۤ r0 = r1.mo9793()
            int r0 = r0.size()
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public abstract java.lang.String mo9794();

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public Yue.AbstractC4398 mo9795(Yue.AbstractC4398 r3) {
            r2 = this;
            Yue.C6657.m25635(r3)
            Yue.ۥۣۡۢۤ r0 = r2.f13958
            Yue.C6657.m25635(r0)
            Yue.ۥۣۡۢۤ r0 = r3.f13958
            Yue.ۥۣۡۢۤ r1 = r2.f13958
            if (r0 != r1) goto L11
            r3.m17293()
        L11:
            Yue.ۥۣۡۢۤ r0 = r2.f13958
            int r1 = r2.f13959
            Yue.ۥۣۡۢۤ[] r3 = new Yue.AbstractC4398[]{r3}
            r0.m17267(r1, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public Yue.AbstractC4398 mo9796(java.lang.String r2) {
            r1 = this;
            int r0 = r1.f13959
            r1.m17269(r0, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Yue.AbstractC4398 m17271(int r2) {
            r1 = this;
            java.util.List r0 = r1.mo9802()
            java.lang.Object r2 = r0.get(r2)
            Yue.ۥۣۡۢۤ r2 = (Yue.AbstractC4398) r2
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public abstract int mo9797();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public java.util.List<Yue.AbstractC4398> m17272() {
            r3 = this;
            int r0 = r3.mo9797()
            if (r0 != 0) goto L9
            java.util.List<Yue.ۥۣۡۢۤ> r0 = Yue.AbstractC4398.f13956
            return r0
        L9:
            java.util.List r0 = r3.mo9802()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            r1.addAll(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public Yue.AbstractC4398[] m17273() {
            r2 = this;
            java.util.List r0 = r2.mo9802()
            r1 = 0
            Yue.ۥۣۡۢۤ[] r1 = new Yue.AbstractC4398[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            Yue.ۥۣۡۢۤ[] r0 = (Yue.AbstractC4398[]) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public java.util.List<Yue.AbstractC4398> m17274() {
            r3 = this;
            java.util.List r0 = r3.mo9802()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r0.next()
            Yue.ۥۣۡۢۤ r2 = (Yue.AbstractC4398) r2
            Yue.ۥۣۡۢۤ r2 = r2.mo5129()
            r1.add(r2)
            goto L11
        L25:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public Yue.AbstractC4398 mo9798() {
            r2 = this;
            boolean r0 = r2.mo9805()
            if (r0 == 0) goto L1b
            Yue.ۥ۟ۢ۠ۤ r0 = r2.mo9793()
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            r0.next()
            r0.remove()
            goto Le
        L1b:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public Yue.AbstractC4398 mo5129() {
            r7 = this;
            r0 = 0
            Yue.ۥۣۡۢۤ r0 = r7.mo9799(r0)
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r1.add(r0)
        Ld:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L37
            java.lang.Object r2 = r1.remove()
            Yue.ۥۣۡۢۤ r2 = (Yue.AbstractC4398) r2
            int r3 = r2.mo9797()
            r4 = 0
        L1e:
            if (r4 >= r3) goto Ld
            java.util.List r5 = r2.mo9802()
            java.lang.Object r6 = r5.get(r4)
            Yue.ۥۣۡۢۤ r6 = (Yue.AbstractC4398) r6
            Yue.ۥۣۡۢۤ r6 = r6.mo9799(r2)
            r5.set(r4, r6)
            r1.add(r6)
            int r4 = r4 + 1
            goto L1e
        L37:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public Yue.AbstractC4398 mo9799(Yue.AbstractC4398 r3) {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L2a
            Yue.ۥۣۡۢۤ r0 = (Yue.AbstractC4398) r0     // Catch: java.lang.CloneNotSupportedException -> L2a
            r0.f13958 = r3
            if (r3 != 0) goto Lc
            r1 = 0
            goto Le
        Lc:
            int r1 = r2.f13959
        Le:
            r0.f13959 = r1
            if (r3 != 0) goto L29
            boolean r3 = r2 instanceof Yue.C1948
            if (r3 != 0) goto L29
            Yue.ۥ۠۟ۧۥ r3 = r2.m17287()
            if (r3 == 0) goto L29
            Yue.ۥ۠۟ۧۥ r3 = r3.m8961()
            r0.f13958 = r3
            java.util.List r3 = r3.mo9802()
            r3.add(r0)
        L29:
            return r0
        L2a:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public abstract void mo9800(java.lang.String r1);

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public abstract Yue.AbstractC4398 mo9801();

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public abstract java.util.List<Yue.AbstractC4398> mo9802();

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public Yue.AbstractC4398 mo9803(Yue.InterfaceC4400 r1) {
            r0 = this;
            Yue.C6657.m25635(r1)
            Yue.C4404.m17312(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public Yue.AbstractC4398 m17275() {
            r2 = this;
            int r0 = r2.mo9797()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.util.List r0 = r2.mo9802()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            Yue.ۥۣۡۢۤ r0 = (Yue.AbstractC4398) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public Yue.AbstractC4398 mo9804(java.util.function.Consumer<? super Yue.AbstractC4398> r2) {
            r1 = this;
            Yue.C6657.m25635(r2)
            java.util.stream.Stream r0 = r1.m17284()
            r0.forEach(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final Yue.C2104 m17276(Yue.C2104 r3) {
            r2 = this;
            Yue.ۥ۠۠ۥۥ r0 = r3.m9852()
        L4:
            r1 = r0
            r0 = r3
            r3 = r1
            if (r3 == 0) goto Le
            Yue.ۥ۠۠ۥۥ r0 = r3.m9852()
            goto L4
        Le:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public boolean mo14514(java.lang.String r3) {
            r2 = this;
            Yue.C6657.m25635(r3)
            boolean r0 = r2.mo9805()
            if (r0 != 0) goto Lb
            r3 = 0
            return r3
        Lb:
            java.lang.String r0 = "abs:"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L2e
            r0 = 4
            java.lang.String r0 = r3.substring(r0)
            Yue.ۥ۟ۢ۠ۤ r1 = r2.mo9793()
            boolean r1 = r1.m4287(r0)
            if (r1 == 0) goto L2e
            java.lang.String r0 = r2.mo14512(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2e
            r3 = 1
            return r3
        L2e:
            Yue.ۥ۟ۢ۠ۤ r0 = r2.mo9793()
            boolean r3 = r0.m4287(r3)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public abstract boolean mo9805();

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public boolean m17277() {
            r1 = this;
            Yue.ۥۣۡۢۤ r0 = r1.f13958
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public boolean m17278(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L20
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto L11
            goto L20
        L11:
            java.lang.String r0 = r2.mo8936()
            Yue.ۥۣۡۢۤ r3 = (Yue.AbstractC4398) r3
            java.lang.String r3 = r3.mo8936()
            boolean r3 = r0.equals(r3)
            return r3
        L20:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public <T extends java.lang.Appendable> T mo9806(T r1) {
            r0 = this;
            r0.m17286(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public void m17279(java.lang.Appendable r2, int r3, Yue.C1948.C1949 r4) throws java.io.IOException {
            r1 = this;
            r0 = 10
            java.lang.Appendable r2 = r2.append(r0)
            int r0 = r4.m8973()
            int r3 = r3 * r0
            int r4 = r4.m8975()
            java.lang.String r3 = Yue.C5973.m22127(r3, r4)
            r2.append(r3)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final boolean m17280() {
            r4 = this;
            int r0 = r4.f13959
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            r2 = 0
            if (r0 != r1) goto L1c
            Yue.ۥۣۡۢۤ r0 = r4.m17291()
            boolean r3 = r0 instanceof Yue.C6151
            if (r3 == 0) goto L1a
            Yue.ۥۢۡ۠ۦ r0 = (Yue.C6151) r0
            boolean r0 = r0.m23015()
            if (r0 == 0) goto L1a
            goto L1b
        L1a:
            r1 = r2
        L1b:
            return r1
        L1c:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public Yue.AbstractC4398 m17281() {
            r2 = this;
            int r0 = r2.mo9797()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.util.List r1 = r2.mo9802()
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.get(r0)
            Yue.ۥۣۡۢۤ r0 = (Yue.AbstractC4398) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public boolean m17282(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.mo9808()
            boolean r2 = r0.equals(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public Yue.AbstractC4398 m17283() {
            r4 = this;
            Yue.ۥۣۡۢۤ r0 = r4.f13958
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.List r0 = r0.mo9802()
            int r2 = r4.f13959
            int r2 = r2 + 1
            int r3 = r0.size()
            if (r3 <= r2) goto L1b
            java.lang.Object r0 = r0.get(r2)
            Yue.ۥۣۡۢۤ r0 = (Yue.AbstractC4398) r0
            return r0
        L1b:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public abstract java.lang.String mo5130();

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public java.util.stream.Stream<Yue.AbstractC4398> m17284() {
            r1 = this;
            java.lang.Class<Yue.ۥۣۡۢۤ> r0 = Yue.AbstractC4398.class
            java.util.stream.Stream r0 = Yue.C4405.m17320(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public <T extends Yue.AbstractC4398> java.util.stream.Stream<T> m17285(java.lang.Class<T> r1) {
            r0 = this;
            java.util.stream.Stream r1 = Yue.C4405.m17320(r0, r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo9807() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public java.lang.String mo9808() {
            r1 = this;
            java.lang.String r0 = r1.mo5130()
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public java.lang.String mo8936() {
            r1 = this;
            java.lang.StringBuilder r0 = Yue.C5973.m22113()
            r1.m17286(r0)
            java.lang.String r0 = Yue.C5973.m22128(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m17286(java.lang.Appendable r3) {
            r2 = this;
            Yue.ۥۣۡۢۤ$ۥ r0 = new Yue.ۥۣۡۢۤ$ۥ
            Yue.ۥ۠۟ۧۥ$ۥ r1 = Yue.C4405.m17316(r2)
            r0.<init>(r3, r1)
            Yue.C4404.m17315(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    public abstract void mo5131(java.lang.Appendable r1, int r2, Yue.C1948.C1949 r3) throws java.io.IOException;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public abstract void mo5132(java.lang.Appendable r1, int r2, Yue.C1948.C1949 r3) throws java.io.IOException;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public Yue.C1948 m17287() {
            r2 = this;
            Yue.ۥۣۡۢۤ r0 = r2.mo9811()
            boolean r1 = r0 instanceof Yue.C1948
            if (r1 == 0) goto Lb
            Yue.ۥ۠۟ۧۥ r0 = (Yue.C1948) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ */
    public Yue.AbstractC4398 mo9809() {
            r1 = this;
            Yue.ۥۣۡۢۤ r0 = r1.f13958
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public boolean m17288(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            Yue.ۥۣۡۢۤ r0 = r2.f13958
            if (r0 == 0) goto L12
            boolean r1 = r0 instanceof Yue.C2104
            if (r1 == 0) goto L12
            Yue.ۥ۠۠ۥۥ r0 = (Yue.C2104) r0
            boolean r3 = r0.m9845(r3, r4)
            if (r3 == 0) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            return r3
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public boolean m17289(java.lang.String r2) {
            r1 = this;
            Yue.ۥۣۡۢۤ r0 = r1.f13958
            if (r0 == 0) goto L10
            java.lang.String r0 = r0.mo9808()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public final Yue.AbstractC4398 m17290() {
            r1 = this;
            Yue.ۥۣۡۢۤ r0 = r1.f13958
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public Yue.AbstractC4398 m17291() {
            r3 = this;
            Yue.ۥۣۡۢۤ r0 = r3.f13958
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r2 = r3.f13959
            if (r2 <= 0) goto L19
            java.util.List r0 = r0.mo9802()
            int r1 = r3.f13959
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            Yue.ۥۣۡۢۤ r0 = (Yue.AbstractC4398) r0
            return r0
        L19:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public final void m17292(int r4) {
            r3 = this;
            int r0 = r3.mo9797()
            if (r0 != 0) goto L7
            return
        L7:
            java.util.List r1 = r3.mo9802()
        Lb:
            if (r4 >= r0) goto L19
            java.lang.Object r2 = r1.get(r4)
            Yue.ۥۣۡۢۤ r2 = (Yue.AbstractC4398) r2
            r2.m17299(r4)
            int r4 = r4 + 1
            goto Lb
        L19:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public void m17293() {
            r1 = this;
            Yue.ۥۣۡۢۤ r0 = r1.f13958
            if (r0 == 0) goto L7
            r0.mo12032(r1)
        L7:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ */
    public Yue.AbstractC4398 mo9810(java.lang.String r2) {
            r1 = this;
            Yue.C6657.m25635(r2)
            boolean r0 = r1.mo9805()
            if (r0 == 0) goto L10
            Yue.ۥ۟ۢ۠ۤ r0 = r1.mo9793()
            r0.m4299(r2)
        L10:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public void mo12032(Yue.AbstractC4398 r3) {
            r2 = this;
            Yue.ۥۣۡۢۤ r0 = r3.f13958
            if (r0 != r2) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            Yue.C6657.m25628(r0)
            int r0 = r3.f13959
            java.util.List r1 = r2.mo9802()
            r1.remove(r0)
            r2.m17292(r0)
            r0 = 0
            r3.f13958 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public void m17294(Yue.AbstractC4398 r1) {
            r0 = this;
            r1.m17298(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public void m17295(Yue.AbstractC4398 r3, Yue.AbstractC4398 r4) {
            r2 = this;
            Yue.ۥۣۡۢۤ r0 = r3.f13958
            if (r0 != r2) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            Yue.C6657.m25628(r0)
            Yue.C6657.m25635(r4)
            if (r3 != r4) goto L10
            return
        L10:
            Yue.ۥۣۡۢۤ r0 = r4.f13958
            if (r0 == 0) goto L17
            r0.mo12032(r4)
        L17:
            int r0 = r3.f13959
            java.util.List r1 = r2.mo9802()
            r1.set(r0, r4)
            r4.f13958 = r2
            r4.m17299(r0)
            r4 = 0
            r3.f13958 = r4
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public void m17296(Yue.AbstractC4398 r2) {
            r1 = this;
            Yue.C6657.m25635(r2)
            Yue.ۥۣۡۢۤ r0 = r1.f13958
            Yue.C6657.m25635(r0)
            Yue.ۥۣۡۢۤ r0 = r1.f13958
            r0.m17295(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public Yue.AbstractC4398 mo9811() {
            r2 = this;
            r0 = r2
        L1:
            Yue.ۥۣۡۢۤ r1 = r0.f13958
            if (r1 == 0) goto L7
            r0 = r1
            goto L1
        L7:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public void m17297(java.lang.String r1) {
            r0 = this;
            Yue.C6657.m25635(r1)
            r0.mo9800(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public void m17298(Yue.AbstractC4398 r2) {
            r1 = this;
            Yue.C6657.m25635(r2)
            Yue.ۥۣۡۢۤ r0 = r1.f13958
            if (r0 == 0) goto La
            r0.mo12032(r1)
        La:
            r1.f13958 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public void m17299(int r1) {
            r0 = this;
            r0.f13959 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠ */
    public Yue.AbstractC4398 mo8937() {
            r1 = this;
            r0 = 0
            Yue.ۥۣۡۢۤ r0 = r1.mo9799(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public int m17300() {
            r1 = this;
            int r0 = r1.f13959
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public java.util.List<Yue.AbstractC4398> m17301() {
            r3 = this;
            Yue.ۥۣۡۢۤ r0 = r3.f13958
            if (r0 != 0) goto L9
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L9:
            java.util.List r0 = r0.mo9802()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + (-1)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r0.next()
            Yue.ۥۣۡۢۤ r2 = (Yue.AbstractC4398) r2
            if (r2 == r3) goto L1c
            r1.add(r2)
            goto L1c
        L2e:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public Yue.C5189 m17302() {
            r1 = this;
            r0 = 1
            Yue.ۥۡۥۨۦ r0 = Yue.C5189.m19473(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ */
    public Yue.AbstractC4398 mo9812(Yue.InterfaceC4406 r1) {
            r0 = this;
            Yue.C6657.m25635(r1)
            Yue.C4404.m17315(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public Yue.AbstractC4398 m17303() {
            r4 = this;
            Yue.ۥۣۡۢۤ r0 = r4.f13958
            Yue.C6657.m25635(r0)
            Yue.ۥۣۡۢۤ r0 = r4.m17275()
            Yue.ۥۣۡۢۤ r1 = r4.f13958
            int r2 = r4.f13959
            Yue.ۥۣۡۢۤ[] r3 = r4.m17273()
            r1.m17267(r2, r3)
            r4.m17293()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ */
    public Yue.AbstractC4398 mo9813(java.lang.String r5) {
            r4 = this;
            Yue.C6657.m25632(r5)
            Yue.ۥۣۡۢۤ r0 = r4.f13958
            if (r0 == 0) goto Le
            boolean r1 = r0 instanceof Yue.C2104
            if (r1 == 0) goto Le
            Yue.ۥ۠۠ۥۥ r0 = (Yue.C2104) r0
            goto L17
        Le:
            boolean r0 = r4 instanceof Yue.C2104
            if (r0 == 0) goto L16
            r0 = r4
            Yue.ۥ۠۠ۥۥ r0 = (Yue.C2104) r0
            goto L17
        L16:
            r0 = 0
        L17:
            Yue.ۥۣۡۧۦ r1 = Yue.C4405.m17317(r4)
            java.lang.String r2 = r4.mo9794()
            java.util.List r5 = r1.m18632(r5, r0, r2)
            r0 = 0
            java.lang.Object r1 = r5.get(r0)
            Yue.ۥۣۡۢۤ r1 = (Yue.AbstractC4398) r1
            boolean r2 = r1 instanceof Yue.C2104
            if (r2 != 0) goto L2f
            return r4
        L2f:
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            Yue.ۥ۠۠ۥۥ r2 = r4.m17276(r1)
            Yue.ۥۣۡۢۤ r3 = r4.f13958
            if (r3 == 0) goto L3c
            r3.m17295(r4, r1)
        L3c:
            Yue.ۥۣۡۢۤ[] r3 = new Yue.AbstractC4398[]{r4}
            r2.m17268(r3)
            int r2 = r5.size()
            if (r2 <= 0) goto L65
        L49:
            int r2 = r5.size()
            if (r0 >= r2) goto L65
            java.lang.Object r2 = r5.get(r0)
            Yue.ۥۣۡۢۤ r2 = (Yue.AbstractC4398) r2
            if (r1 != r2) goto L58
            goto L62
        L58:
            Yue.ۥۣۡۢۤ r3 = r2.f13958
            if (r3 == 0) goto L5f
            r3.mo12032(r2)
        L5f:
            r1.m9815(r2)
        L62:
            int r0 = r0 + 1
            goto L49
        L65:
            return r4
    }
}
