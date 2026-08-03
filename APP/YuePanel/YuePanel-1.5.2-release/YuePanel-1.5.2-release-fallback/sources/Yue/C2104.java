package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C2104 extends Yue.AbstractC4398 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final java.util.List<Yue.C2104> f6637 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final java.util.regex.Pattern f6638 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final java.lang.String f6639 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public Yue.C6104 f6640;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public java.lang.ref.WeakReference<java.util.List<Yue.C2104>> f6641;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public java.util.List<Yue.AbstractC4398> f6642;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public Yue.C0648 f6643;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۥۥ$ۥ, reason: contains not printable characters */
    public static final class C2105 extends Yue.AbstractC0987<Yue.AbstractC4398> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final Yue.C2104 f6644;

        public C2105(Yue.C2104 r1, int r2) {
                r0 = this;
                r0.<init>(r2)
                r0.f6644 = r1
                return
        }

        @Override // Yue.AbstractC0987
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo5499() {
                r1 = this;
                Yue.ۥ۠۠ۥۥ r0 = r1.f6644
                r0.mo9807()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۥۥ$ۥ۟, reason: contains not printable characters */
    public static class C2106 implements Yue.InterfaceC4406 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.StringBuilder f6645;

        public C2106(java.lang.StringBuilder r1) {
                r0 = this;
                r0.<init>()
                r0.f6645 = r1
                return
        }

        @Override // Yue.InterfaceC4406
        /* JADX INFO: renamed from: ۥ */
        public void mo6058(Yue.AbstractC4398 r1, int r2) {
                r0 = this;
                boolean r2 = r1 instanceof Yue.C6151
                if (r2 == 0) goto Lc
                Yue.ۥۢۡ۠ۦ r1 = (Yue.C6151) r1
                java.lang.StringBuilder r2 = r0.f6645
                Yue.C2104.m9780(r2, r1)
                goto L37
            Lc:
                boolean r2 = r1 instanceof Yue.C2104
                if (r2 == 0) goto L37
                Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
                java.lang.StringBuilder r2 = r0.f6645
                int r2 = r2.length()
                if (r2 <= 0) goto L37
                boolean r2 = r1.m9889()
                if (r2 != 0) goto L28
                java.lang.String r2 = "br"
                boolean r1 = r1.m17282(r2)
                if (r1 == 0) goto L37
            L28:
                java.lang.StringBuilder r1 = r0.f6645
                boolean r1 = Yue.C6151.m23011(r1)
                if (r1 != 0) goto L37
                java.lang.StringBuilder r1 = r0.f6645
                r2 = 32
                r1.append(r2)
            L37:
                return
        }

        @Override // Yue.InterfaceC4406
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo6059(Yue.AbstractC4398 r1, int r2) {
                r0 = this;
                boolean r2 = r1 instanceof Yue.C2104
                if (r2 == 0) goto L34
                r2 = r1
                Yue.ۥ۠۠ۥۥ r2 = (Yue.C2104) r2
                Yue.ۥۣۡۢۤ r1 = r1.m17283()
                boolean r2 = r2.m9889()
                if (r2 == 0) goto L34
                boolean r2 = r1 instanceof Yue.C6151
                if (r2 != 0) goto L25
                boolean r2 = r1 instanceof Yue.C2104
                if (r2 == 0) goto L34
                Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
                Yue.ۥۢ۠ۨۡ r1 = Yue.C2104.m9781(r1)
                boolean r1 = r1.m22900()
                if (r1 != 0) goto L34
            L25:
                java.lang.StringBuilder r1 = r0.f6645
                boolean r1 = Yue.C6151.m23011(r1)
                if (r1 != 0) goto L34
                java.lang.StringBuilder r1 = r0.f6645
                r2 = 32
                r1.append(r2)
            L34:
                return
        }
    }

    static {
            java.util.List r0 = java.util.Collections.emptyList()
            Yue.C2104.f6637 = r0
            java.lang.String r0 = "\\s+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            Yue.C2104.f6638 = r0
            java.lang.String r0 = "baseUri"
            java.lang.String r0 = Yue.C0648.m4270(r0)
            Yue.C2104.f6639 = r0
            return
    }

    public C2104(Yue.C6104 r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public C2104(Yue.C6104 r2, java.lang.String r3, Yue.C0648 r4) {
            r1 = this;
            r1.<init>()
            Yue.C6657.m25635(r2)
            java.util.List<Yue.ۥۣۡۢۤ> r0 = Yue.AbstractC4398.f13956
            r1.f6642 = r0
            r1.f6643 = r4
            r1.f6640 = r2
            if (r3 == 0) goto L13
            r1.m17297(r3)
        L13:
            return
    }

    public C2104(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "http://www.w3.org/1999/xhtml"
            Yue.ۥۣۡۧۥ r1 = Yue.C4699.f14917
            Yue.ۥۢ۠ۨۡ r3 = Yue.C6104.m22898(r3, r0, r1)
            java.lang.String r0 = ""
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public C2104(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            Yue.ۥۣۡۧۥ r0 = Yue.C4699.f14917
            Yue.ۥۢ۠ۨۡ r2 = Yue.C6104.m22898(r2, r3, r0)
            r3 = 0
            r1.<init>(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC4400.EnumC4401 m9777(java.util.concurrent.atomic.AtomicBoolean r0, Yue.AbstractC4398 r1, int r2) {
            Yue.ۥۣۡۢۥ$ۥ r0 = m9786(r0, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static /* synthetic */ void m9778(java.lang.StringBuilder r0, Yue.AbstractC4398 r1) {
            m9787(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ void m9779(java.lang.StringBuilder r0, Yue.AbstractC4398 r1, int r2) {
            m9785(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static /* synthetic */ void m9780(java.lang.StringBuilder r0, Yue.C6151 r1) {
            m9782(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static /* synthetic */ Yue.C6104 m9781(Yue.C2104 r0) {
            Yue.ۥۢ۠ۨۡ r0 = r0.f6640
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static void m9782(java.lang.StringBuilder r2, Yue.C6151 r3) {
            java.lang.String r0 = r3.m23014()
            Yue.ۥۣۡۢۤ r1 = r3.f13958
            boolean r1 = m9788(r1)
            if (r1 != 0) goto L19
            boolean r3 = r3 instanceof Yue.C0882
            if (r3 == 0) goto L11
            goto L19
        L11:
            boolean r3 = Yue.C6151.m23011(r2)
            Yue.C5973.m22112(r2, r0, r3)
            goto L1c
        L19:
            r2.append(r0)
        L1c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static void m9783(Yue.AbstractC4398 r1, java.lang.StringBuilder r2) {
            boolean r0 = r1 instanceof Yue.C6151
            if (r0 == 0) goto Le
            Yue.ۥۢۡ۠ۦ r1 = (Yue.C6151) r1
            java.lang.String r1 = r1.m23014()
            r2.append(r1)
            goto L1b
        Le:
            java.lang.String r0 = "br"
            boolean r1 = r1.m17282(r0)
            if (r1 == 0) goto L1b
            java.lang.String r1 = "\n"
            r2.append(r1)
        L1b:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۨ, reason: contains not printable characters */
    public static <E extends Yue.C2104> int m9784(Yue.C2104 r4, java.util.List<E> r5) {
            int r0 = r5.size()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L12
            java.lang.Object r3 = r5.get(r2)
            if (r3 != r4) goto Lf
            return r2
        Lf:
            int r2 = r2 + 1
            goto L6
        L12:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m9785(java.lang.StringBuilder r0, Yue.AbstractC4398 r1, int r2) {
            boolean r2 = r1 instanceof Yue.C1725
            if (r2 == 0) goto Le
            Yue.ۥ۟ۨۢۥ r1 = (Yue.C1725) r1
            java.lang.String r1 = r1.m8226()
            r0.append(r1)
            goto L29
        Le:
            boolean r2 = r1 instanceof Yue.C1274
            if (r2 == 0) goto L1c
            Yue.ۥ۟ۥۤۤ r1 = (Yue.C1274) r1
            java.lang.String r1 = r1.m6696()
            r0.append(r1)
            goto L29
        L1c:
            boolean r2 = r1 instanceof Yue.C0882
            if (r2 == 0) goto L29
            Yue.ۥۣ۟ۥۦ r1 = (Yue.C0882) r1
            java.lang.String r1 = r1.m23014()
            r0.append(r1)
        L29:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۦ, reason: contains not printable characters */
    public static /* synthetic */ Yue.InterfaceC4400.EnumC4401 m9786(java.util.concurrent.atomic.AtomicBoolean r0, Yue.AbstractC4398 r1, int r2) {
            boolean r2 = r1 instanceof Yue.C6151
            if (r2 == 0) goto L13
            Yue.ۥۢۡ۠ۦ r1 = (Yue.C6151) r1
            boolean r1 = r1.m23015()
            if (r1 != 0) goto L13
            r1 = 1
            r0.set(r1)
            Yue.ۥۣۡۢۥ$ۥ r0 = Yue.InterfaceC4400.EnumC4401.f13966
            return r0
        L13:
            Yue.ۥۣۡۢۥ$ۥ r0 = Yue.InterfaceC4400.EnumC4401.f13962
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m9787(java.lang.StringBuilder r0, Yue.AbstractC4398 r1) {
            m9783(r1, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۡ, reason: contains not printable characters */
    public static boolean m9788(Yue.AbstractC4398 r4) {
            boolean r0 = r4 instanceof Yue.C2104
            r1 = 0
            if (r0 == 0) goto L1c
            Yue.ۥ۠۠ۥۥ r4 = (Yue.C2104) r4
            r0 = r1
        L8:
            Yue.ۥۢ۠ۨۡ r2 = r4.f6640
            boolean r2 = r2.m22911()
            r3 = 1
            if (r2 == 0) goto L12
            return r3
        L12:
            Yue.ۥ۠۠ۥۥ r4 = r4.m9899()
            int r0 = r0 + r3
            r2 = 6
            if (r0 >= r2) goto L1c
            if (r4 != 0) goto L8
        L1c:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۧ, reason: contains not printable characters */
    public static java.lang.String m9789(Yue.C2104 r1, java.lang.String r2) {
        L0:
            if (r1 == 0) goto L18
            Yue.ۥ۟ۢ۠ۤ r0 = r1.f6643
            if (r0 == 0) goto L13
            boolean r0 = r0.m4286(r2)
            if (r0 == 0) goto L13
            Yue.ۥ۟ۢ۠ۤ r1 = r1.f6643
            java.lang.String r1 = r1.m4281(r2)
            return r1
        L13:
            Yue.ۥ۠۠ۥۥ r1 = r1.m9899()
            goto L0
        L18:
            java.lang.String r1 = ""
            return r1
    }

    @Override // Yue.AbstractC4398
    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            Yue.ۥ۠۠ۥۥ r0 = r1.mo8938()
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Yue.AbstractC4398 mo9790(Yue.AbstractC4398 r1) {
            r0 = this;
            Yue.ۥ۠۠ۥۥ r1 = r0.m9815(r1)
            return r1
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Yue.AbstractC4398 mo9791(java.lang.String r1) {
            r0 = this;
            Yue.ۥ۠۠ۥۥ r1 = r0.m9816(r1)
            return r1
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Yue.AbstractC4398 mo9792(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            Yue.ۥ۠۠ۥۥ r1 = r0.m9824(r1, r2)
            return r1
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public Yue.C0648 mo9793() {
            r1 = this;
            Yue.ۥ۟ۢ۠ۤ r0 = r1.f6643
            if (r0 != 0) goto Lb
            Yue.ۥ۟ۢ۠ۤ r0 = new Yue.ۥ۟ۢ۠ۤ
            r0.<init>()
            r1.f6643 = r0
        Lb:
            Yue.ۥ۟ۢ۠ۤ r0 = r1.f6643
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public java.lang.String mo9794() {
            r1 = this;
            java.lang.String r0 = Yue.C2104.f6639
            java.lang.String r0 = m9789(r1, r0)
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Yue.AbstractC4398 mo9795(Yue.AbstractC4398 r1) {
            r0 = this;
            Yue.ۥ۠۠ۥۥ r1 = r0.m9827(r1)
            return r1
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Yue.AbstractC4398 mo9796(java.lang.String r1) {
            r0 = this;
            Yue.ۥ۠۠ۥۥ r1 = r0.m9828(r1)
            return r1
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public int mo9797() {
            r1 = this;
            java.util.List<Yue.ۥۣۡۢۤ> r0 = r1.f6642
            int r0 = r0.size()
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Yue.AbstractC4398 mo9798() {
            r1 = this;
            Yue.ۥ۠۠ۥۥ r0 = r1.m9836()
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public /* bridge */ /* synthetic */ Yue.AbstractC4398 mo5129() {
            r1 = this;
            Yue.ۥ۠۠ۥۥ r0 = r1.mo8938()
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Yue.AbstractC4398 mo9799(Yue.AbstractC4398 r1) {
            r0 = this;
            Yue.ۥ۠۠ۥۥ r1 = r0.m9844(r1)
            return r1
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void mo9800(java.lang.String r3) {
            r2 = this;
            Yue.ۥ۟ۢ۠ۤ r0 = r2.mo9793()
            java.lang.String r1 = Yue.C2104.f6639
            r0.m4294(r1, r3)
            return
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Yue.AbstractC4398 mo9801() {
            r1 = this;
            Yue.ۥ۠۠ۥۥ r0 = r1.m9847()
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public java.util.List<Yue.AbstractC4398> mo9802() {
            r2 = this;
            java.util.List<Yue.ۥۣۡۢۤ> r0 = r2.f6642
            java.util.List<Yue.ۥۣۡۢۤ> r1 = Yue.AbstractC4398.f13956
            if (r0 != r1) goto Le
            Yue.ۥ۠۠ۥۥ$ۥ r0 = new Yue.ۥ۠۠ۥۥ$ۥ
            r1 = 4
            r0.<init>(r2, r1)
            r2.f6642 = r0
        Le:
            java.util.List<Yue.ۥۣۡۢۤ> r0 = r2.f6642
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Yue.AbstractC4398 mo9803(Yue.InterfaceC4400 r1) {
            r0 = this;
            Yue.ۥ۠۠ۥۥ r1 = r0.m9850(r1)
            return r1
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Yue.AbstractC4398 mo9804(java.util.function.Consumer r1) {
            r0 = this;
            Yue.ۥ۠۠ۥۥ r1 = r0.m9855(r1)
            return r1
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public boolean mo9805() {
            r1 = this;
            Yue.ۥ۟ۢ۠ۤ r0 = r1.f6643
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public <T extends java.lang.Appendable> T mo9806(T r4) {
            r3 = this;
            java.util.List<Yue.ۥۣۡۢۤ> r0 = r3.f6642
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L17
            java.util.List<Yue.ۥۣۡۢۤ> r2 = r3.f6642
            java.lang.Object r2 = r2.get(r1)
            Yue.ۥۣۡۢۤ r2 = (Yue.AbstractC4398) r2
            r2.m17286(r4)
            int r1 = r1 + 1
            goto L7
        L17:
            return r4
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public java.lang.String mo5130() {
            r1 = this;
            Yue.ۥۢ۠ۨۡ r0 = r1.f6640
            java.lang.String r0 = r0.m22901()
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void mo9807() {
            r1 = this;
            super.mo9807()
            r0 = 0
            r1.f6641 = r0
            return
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public java.lang.String mo9808() {
            r1 = this;
            Yue.ۥۢ۠ۨۡ r0 = r1.f6640
            java.lang.String r0 = r0.m22910()
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    public void mo5131(java.lang.Appendable r2, int r3, Yue.C1948.C1949 r4) throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.m9918(r4)
            if (r0 == 0) goto L1a
            boolean r0 = r2 instanceof java.lang.StringBuilder
            if (r0 == 0) goto L17
            r0 = r2
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L1a
            r1.m17279(r2, r3, r4)
            goto L1a
        L17:
            r1.m17279(r2, r3, r4)
        L1a:
            r3 = 60
            java.lang.Appendable r3 = r2.append(r3)
            java.lang.String r0 = r1.m9924()
            r3.append(r0)
            Yue.ۥ۟ۢ۠ۤ r3 = r1.f6643
            if (r3 == 0) goto L2e
            r3.m4289(r2, r4)
        L2e:
            java.util.List<Yue.ۥۣۡۢۤ> r3 = r1.f6642
            boolean r3 = r3.isEmpty()
            r0 = 62
            if (r3 == 0) goto L5a
            Yue.ۥۢ۠ۨۡ r3 = r1.f6640
            boolean r3 = r3.m22908()
            if (r3 == 0) goto L5a
            Yue.ۥ۠۟ۧۥ$ۥ$ۥ r3 = r4.m8982()
            Yue.ۥ۠۟ۧۥ$ۥ$ۥ r4 = Yue.C1948.C1949.EnumC1950.f6108
            if (r3 != r4) goto L54
            Yue.ۥۢ۠ۨۡ r3 = r1.f6640
            boolean r3 = r3.m22903()
            if (r3 == 0) goto L54
            r2.append(r0)
            goto L5d
        L54:
            java.lang.String r3 = " />"
            r2.append(r3)
            goto L5d
        L5a:
            r2.append(r0)
        L5d:
            return
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public void mo5132(java.lang.Appendable r3, int r4, Yue.C1948.C1949 r5) throws java.io.IOException {
            r2 = this;
            java.util.List<Yue.ۥۣۡۢۤ> r0 = r2.f6642
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            Yue.ۥۢ۠ۨۡ r0 = r2.f6640
            boolean r0 = r0.m22908()
            if (r0 != 0) goto L66
        L10:
            boolean r0 = r5.m8981()
            if (r0 == 0) goto L53
            java.util.List<Yue.ۥۣۡۢۤ> r0 = r2.f6642
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L53
            Yue.ۥۢ۠ۨۡ r0 = r2.f6640
            boolean r0 = r0.m22900()
            if (r0 == 0) goto L2e
            Yue.ۥۣۡۢۤ r0 = r2.f13958
            boolean r0 = m9788(r0)
            if (r0 == 0) goto L50
        L2e:
            boolean r0 = r5.m8978()
            if (r0 == 0) goto L53
            java.util.List<Yue.ۥۣۡۢۤ> r0 = r2.f6642
            int r0 = r0.size()
            r1 = 1
            if (r0 > r1) goto L50
            java.util.List<Yue.ۥۣۡۢۤ> r0 = r2.f6642
            int r0 = r0.size()
            if (r0 != r1) goto L53
            java.util.List<Yue.ۥۣۡۢۤ> r0 = r2.f6642
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            boolean r0 = r0 instanceof Yue.C2104
            if (r0 == 0) goto L53
        L50:
            r2.m17279(r3, r4, r5)
        L53:
            java.lang.String r4 = "</"
            java.lang.Appendable r3 = r3.append(r4)
            java.lang.String r4 = r2.m9924()
            java.lang.Appendable r3 = r3.append(r4)
            r4 = 62
            r3.append(r4)
        L66:
            return
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Yue.AbstractC4398 mo9809() {
            r1 = this;
            Yue.ۥ۠۠ۥۥ r0 = r1.m9899()
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Yue.AbstractC4398 mo9810(java.lang.String r1) {
            r0 = this;
            Yue.ۥ۠۠ۥۥ r1 = r0.m9909(r1)
            return r1
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Yue.AbstractC4398 mo9811() {
            r1 = this;
            Yue.ۥ۠۠ۥۥ r0 = r1.m9911()
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠ */
    public /* bridge */ /* synthetic */ Yue.AbstractC4398 mo8937() {
            r1 = this;
            Yue.ۥ۠۠ۥۥ r0 = r1.mo8939()
            return r0
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Yue.AbstractC4398 mo9812(Yue.InterfaceC4406 r1) {
            r0 = this;
            Yue.ۥ۠۠ۥۥ r1 = r0.m9928(r1)
            return r1
    }

    @Override // Yue.AbstractC4398
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ Yue.AbstractC4398 mo9813(java.lang.String r1) {
            r0 = this;
            Yue.ۥ۠۠ۥۥ r1 = r0.m9933(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public Yue.C2104 m9814(java.lang.String r2) {
            r1 = this;
            Yue.C6657.m25635(r2)
            java.util.Set r0 = r1.m9835()
            r0.add(r2)
            r1.m9834(r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public Yue.C2104 m9815(Yue.AbstractC4398 r1) {
            r0 = this;
            Yue.ۥۣۡۢۤ r1 = super.mo9790(r1)
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public Yue.C2104 m9816(java.lang.String r1) {
            r0 = this;
            Yue.ۥۣۡۢۤ r1 = super.mo9791(r1)
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public Yue.C2104 m9817(java.lang.String r3) {
            r2 = this;
            Yue.C6657.m25635(r3)
            Yue.ۥۣۡۧۦ r0 = Yue.C4405.m17317(r2)
            java.lang.String r1 = r2.mo9794()
            java.util.List r3 = r0.m18632(r3, r2, r1)
            r0 = 0
            Yue.ۥۣۡۢۤ[] r0 = new Yue.AbstractC4398[r0]
            java.lang.Object[] r3 = r3.toArray(r0)
            Yue.ۥۣۡۢۤ[] r3 = (Yue.AbstractC4398[]) r3
            r2.m17268(r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public Yue.C2104 m9818(Yue.AbstractC4398 r2) {
            r1 = this;
            Yue.C6657.m25635(r2)
            r1.m17294(r2)
            r1.mo9802()
            java.util.List<Yue.ۥۣۡۢۤ> r0 = r1.f6642
            r0.add(r2)
            java.util.List<Yue.ۥۣۡۢۤ> r0 = r1.f6642
            int r0 = r0.size()
            int r0 = r0 + (-1)
            r2.m17299(r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public Yue.C2104 m9819(java.util.Collection<? extends Yue.AbstractC4398> r2) {
            r1 = this;
            r0 = -1
            r1.m9885(r0, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public Yue.C2104 m9820(java.lang.String r2) {
            r1 = this;
            Yue.ۥۢ۠ۨۡ r0 = r1.f6640
            java.lang.String r0 = r0.m22909()
            Yue.ۥ۠۠ۥۥ r2 = r1.m9821(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public Yue.C2104 m9821(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            Yue.ۥ۠۠ۥۥ r0 = new Yue.ۥ۠۠ۥۥ
            Yue.ۥۣۡۧۦ r1 = Yue.C4405.m17317(r2)
            Yue.ۥۣۡۧۥ r1 = r1.m18638()
            Yue.ۥۢ۠ۨۡ r3 = Yue.C6104.m22898(r3, r4, r1)
            java.lang.String r4 = r2.mo9794()
            r0.<init>(r3, r4)
            r2.m9818(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public Yue.C2104 m9822(java.lang.String r2) {
            r1 = this;
            Yue.C6657.m25635(r2)
            Yue.ۥۢۡ۠ۦ r0 = new Yue.ۥۢۡ۠ۦ
            r0.<init>(r2)
            r1.m9818(r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public Yue.C2104 m9823(Yue.C2104 r1) {
            r0 = this;
            Yue.C6657.m25635(r1)
            r1.m9818(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public Yue.C2104 m9824(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            super.mo9792(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public Yue.C2104 m9825(java.lang.String r2, boolean r3) {
            r1 = this;
            Yue.ۥ۟ۢ۠ۤ r0 = r1.mo9793()
            r0.m4295(r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public Yue.C0646 m9826(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.mo9805()
            if (r0 == 0) goto Lf
            Yue.ۥ۟ۢ۠ۤ r0 = r1.mo9793()
            Yue.ۥ۟ۢ۠ۢ r2 = r0.m4276(r2)
            goto L10
        Lf:
            r2 = 0
        L10:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public Yue.C2104 m9827(Yue.AbstractC4398 r1) {
            r0 = this;
            Yue.ۥۣۡۢۤ r1 = super.mo9795(r1)
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public Yue.C2104 m9828(java.lang.String r1) {
            r0 = this;
            Yue.ۥۣۡۢۤ r1 = super.mo9796(r1)
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public Yue.C2104 m9829(int r2) {
            r1 = this;
            java.util.List r0 = r1.m9830()
            java.lang.Object r2 = r0.get(r2)
            Yue.ۥ۠۠ۥۥ r2 = (Yue.C2104) r2
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public java.util.List<Yue.C2104> m9830() {
            r5 = this;
            int r0 = r5.mo9797()
            if (r0 != 0) goto L9
            java.util.List<Yue.ۥ۠۠ۥۥ> r0 = Yue.C2104.f6637
            return r0
        L9:
            java.lang.ref.WeakReference<java.util.List<Yue.ۥ۠۠ۥۥ>> r0 = r5.f6641
            if (r0 == 0) goto L15
            java.lang.Object r0 = r0.get()
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L3f
        L15:
            java.util.List<Yue.ۥۣۡۢۤ> r0 = r5.f6642
            int r0 = r0.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        L21:
            if (r2 >= r0) goto L37
            java.util.List<Yue.ۥۣۡۢۤ> r3 = r5.f6642
            java.lang.Object r3 = r3.get(r2)
            Yue.ۥۣۡۢۤ r3 = (Yue.AbstractC4398) r3
            boolean r4 = r3 instanceof Yue.C2104
            if (r4 == 0) goto L34
            Yue.ۥ۠۠ۥۥ r3 = (Yue.C2104) r3
            r1.add(r3)
        L34:
            int r2 = r2 + 1
            goto L21
        L37:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r5.f6641 = r0
            r0 = r1
        L3f:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public Yue.C2108 m9831() {
            r2 = this;
            Yue.ۥ۠۠ۥۧ r0 = new Yue.ۥ۠۠ۥۧ
            java.util.List r1 = r2.m9830()
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public int m9832() {
            r1 = this;
            java.util.List r0 = r1.m9830()
            int r0 = r0.size()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public java.lang.String m9833() {
            r1 = this;
            java.lang.String r0 = "class"
            java.lang.String r0 = r1.mo14513(r0)
            java.lang.String r0 = r0.trim()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public Yue.C2104 m9834(java.util.Set<java.lang.String> r4) {
            r3 = this;
            Yue.C6657.m25635(r4)
            boolean r0 = r4.isEmpty()
            java.lang.String r1 = "class"
            if (r0 == 0) goto L13
            Yue.ۥ۟ۢ۠ۤ r4 = r3.mo9793()
            r4.m4298(r1)
            goto L20
        L13:
            Yue.ۥ۟ۢ۠ۤ r0 = r3.mo9793()
            java.lang.String r2 = " "
            java.lang.String r4 = Yue.C5973.m22122(r4, r2)
            r0.m4294(r1, r4)
        L20:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public java.util.Set<java.lang.String> m9835() {
            r2 = this;
            java.util.regex.Pattern r0 = Yue.C2104.f6638
            java.lang.String r1 = r2.m9833()
            java.lang.String[] r0 = r0.split(r1)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.<init>(r0)
            java.lang.String r0 = ""
            r1.remove(r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public Yue.C2104 m9836() {
            r1 = this;
            Yue.ۥ۟ۢ۠ۤ r0 = r1.f6643
            if (r0 == 0) goto L12
            super.mo9798()
            Yue.ۥ۟ۢ۠ۤ r0 = r1.f6643
            int r0 = r0.size()
            if (r0 != 0) goto L12
            r0 = 0
            r1.f6643 = r0
        L12:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۤ */
    public Yue.C2104 mo8938() {
            r1 = this;
            Yue.ۥۣۡۢۤ r0 = super.mo5129()
            Yue.ۥ۠۠ۥۥ r0 = (Yue.C2104) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public Yue.C2104 m9837(Yue.AbstractC2179 r4) {
            r3 = this;
            Yue.C6657.m25635(r4)
            Yue.ۥ۠۠ۥۥ r0 = r3.m9911()
            r1 = r3
        L8:
            boolean r2 = r4.mo6691(r0, r1)
            if (r2 == 0) goto Lf
            return r1
        Lf:
            Yue.ۥ۠۠ۥۥ r1 = r1.m9899()
            if (r1 != 0) goto L8
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public Yue.C2104 m9838(java.lang.String r1) {
            r0 = this;
            Yue.ۥ۠ۡ۠ۤ r1 = Yue.C5000.m19434(r1)
            Yue.ۥ۠۠ۥۥ r1 = r0.m9837(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public java.lang.String m9839() {
            r5 = this;
            java.lang.String r0 = r5.m9884()
            int r0 = r0.length()
            r1 = 0
            if (r0 <= 0) goto L3c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "#"
            r0.append(r2)
            java.lang.String r2 = r5.m9884()
            java.lang.String r2 = Yue.C6295.m23455(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            Yue.ۥ۠۟ۧۥ r2 = r5.m17287()
            if (r2 == 0) goto L3b
            Yue.ۥ۠۠ۥۧ r2 = r2.m9913(r0)
            int r3 = r2.size()
            r4 = 1
            if (r3 != r4) goto L3c
            java.lang.Object r2 = r2.get(r1)
            if (r2 != r5) goto L3c
        L3b:
            return r0
        L3c:
            java.lang.StringBuilder r0 = Yue.C5973.m22113()
            r2 = r5
        L41:
            if (r2 == 0) goto L53
            boolean r3 = r2 instanceof Yue.C1948
            if (r3 != 0) goto L53
            java.lang.String r3 = r2.m9840()
            r0.insert(r1, r3)
            Yue.ۥ۠۠ۥۥ r2 = r2.m9899()
            goto L41
        L53:
            java.lang.String r0 = Yue.C5973.m22128(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public final java.lang.String m9840() {
            r4 = this;
            java.lang.String r0 = r4.m9924()
            java.lang.String r0 = Yue.C6295.m23455(r0)
            java.lang.String r1 = "\\:"
            java.lang.String r2 = "|"
            java.lang.String r0 = r0.replace(r1, r2)
            java.lang.StringBuilder r1 = Yue.C5973.m22113()
            r1.append(r0)
            Yue.ۥۢ۠ۡۤ$ۥ r0 = new Yue.ۥۢ۠ۡۤ$ۥ
            java.lang.String r2 = "."
            r0.<init>(r2)
            java.util.Set r2 = r4.m9835()
            java.util.Iterator r2 = r2.iterator()
        L26:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = Yue.C6295.m23455(r3)
            r0.m22133(r3)
            goto L26
        L3a:
            java.lang.String r0 = r0.m22135()
            int r2 = r0.length()
            if (r2 <= 0) goto L4c
            r2 = 46
            r1.append(r2)
            r1.append(r0)
        L4c:
            Yue.ۥ۠۠ۥۥ r0 = r4.m9899()
            if (r0 == 0) goto L8f
            Yue.ۥ۠۠ۥۥ r0 = r4.m9899()
            boolean r0 = r0 instanceof Yue.C1948
            if (r0 == 0) goto L5b
            goto L8f
        L5b:
            r0 = 0
            java.lang.String r2 = " > "
            r1.insert(r0, r2)
            Yue.ۥ۠۠ۥۥ r0 = r4.m9899()
            java.lang.String r2 = r1.toString()
            Yue.ۥ۠۠ۥۧ r0 = r0.m9913(r2)
            int r0 = r0.size()
            r2 = 1
            if (r0 <= r2) goto L8a
            int r0 = r4.m9846()
            int r0 = r0 + r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = ":nth-child(%d)"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r1.append(r0)
        L8a:
            java.lang.String r0 = Yue.C5973.m22128(r1)
            return r0
        L8f:
            java.lang.String r0 = Yue.C5973.m22128(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public java.lang.String m9841() {
            r2 = this;
            java.lang.StringBuilder r0 = Yue.C5973.m22113()
            Yue.ۥ۠۠ۥۢ r1 = new Yue.ۥ۠۠ۥۢ
            r1.<init>(r0)
            r2.m9928(r1)
            java.lang.String r0 = Yue.C5973.m22128(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public java.util.List<Yue.C1725> m9842() {
            r1 = this;
            java.lang.Class<Yue.ۥ۟ۨۢۥ> r0 = Yue.C1725.class
            java.util.List r0 = r1.m9851(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public java.util.Map<java.lang.String, java.lang.String> m9843() {
            r1 = this;
            Yue.ۥ۟ۢ۠ۤ r0 = r1.mo9793()
            java.util.Map r0 = r0.m4279()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public Yue.C2104 m9844(Yue.AbstractC4398 r3) {
            r2 = this;
            Yue.ۥۣۡۢۤ r3 = super.mo9799(r3)
            Yue.ۥ۠۠ۥۥ r3 = (Yue.C2104) r3
            Yue.ۥ۟ۢ۠ۤ r0 = r2.f6643
            if (r0 == 0) goto Lf
            Yue.ۥ۟ۢ۠ۤ r0 = r0.m4278()
            goto L10
        Lf:
            r0 = 0
        L10:
            r3.f6643 = r0
            Yue.ۥ۠۠ۥۥ$ۥ r0 = new Yue.ۥ۠۠ۥۥ$ۥ
            java.util.List<Yue.ۥۣۡۢۤ> r1 = r2.f6642
            int r1 = r1.size()
            r0.<init>(r3, r1)
            r3.f6642 = r0
            java.util.List<Yue.ۥۣۡۢۤ> r1 = r2.f6642
            r0.addAll(r1)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public boolean m9845(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            Yue.ۥۢ۠ۨۡ r0 = r1.f6640
            java.lang.String r0 = r0.m22910()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L1a
            Yue.ۥۢ۠ۨۡ r2 = r1.f6640
            java.lang.String r2 = r2.m22909()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public int m9846() {
            r1 = this;
            Yue.ۥ۠۠ۥۥ r0 = r1.m9899()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            Yue.ۥ۠۠ۥۥ r0 = r1.m9899()
            java.util.List r0 = r0.m9830()
            int r0 = m9784(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public Yue.C2104 m9847() {
            r3 = this;
            java.util.List<Yue.ۥۣۡۢۤ> r0 = r3.f6642
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            Yue.ۥۣۡۢۤ r1 = (Yue.AbstractC4398) r1
            r2 = 0
            r1.f13958 = r2
            goto L6
        L16:
            java.util.List<Yue.ۥۣۡۢۤ> r0 = r3.f6642
            r0.clear()
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public Yue.C5189 m9848() {
            r1 = this;
            r0 = 0
            Yue.ۥۡۥۨۦ r0 = Yue.C5189.m19473(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public Yue.C2104 m9849(java.lang.String r4) {
            r3 = this;
            Yue.ۥ۠۠ۥۥ r0 = Yue.C5568.m20877(r4, r3)
            Yue.ۥ۠۠ۥۥ r1 = r3.m9899()
            if (r1 == 0) goto Ld
            java.lang.String r1 = "No elements matched the query '%s' on element '%s'."
            goto Lf
        Ld:
            java.lang.String r1 = "No elements matched the query '%s' in the document."
        Lf:
            java.lang.String r2 = r3.m9924()
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r2}
            java.lang.Object r4 = Yue.C6657.m25623(r0, r1, r4)
            Yue.ۥ۠۠ۥۥ r4 = (Yue.C2104) r4
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public Yue.C2104 m9850(Yue.InterfaceC4400 r1) {
            r0 = this;
            Yue.ۥۣۡۢۤ r1 = super.mo9803(r1)
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public final <T> java.util.List<T> m9851(java.lang.Class<T> r3) {
            r2 = this;
            java.util.List<Yue.ۥۣۡۢۤ> r0 = r2.f6642
            java.util.stream.Stream r0 = r0.stream()
            java.util.Objects.requireNonNull(r3)
            Yue.ۥ۠۠ۥ۟ r1 = new Yue.ۥ۠۠ۥ۟
            r1.<init>(r3)
            java.util.stream.Stream r0 = r0.filter(r1)
            Yue.ۥ۠۠ۥ۠ r1 = new Yue.ۥ۠۠ۥ۠
            r1.<init>(r3)
            java.util.stream.Stream r3 = r0.map(r1)
            java.util.stream.Collector r0 = java.util.stream.Collectors.toList()
            Yue.ۥ۠۠ۥۡ r1 = new Yue.ۥ۠۠ۥۡ
            r1.<init>()
            java.util.stream.Collector r0 = java.util.stream.Collectors.collectingAndThen(r0, r1)
            java.lang.Object r3 = r3.collect(r0)
            java.util.List r3 = (java.util.List) r3
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public Yue.C2104 m9852() {
            r2 = this;
            Yue.ۥۣۡۢۤ r0 = r2.m17275()
        L4:
            if (r0 == 0) goto L12
            boolean r1 = r0 instanceof Yue.C2104
            if (r1 == 0) goto Ld
            Yue.ۥ۠۠ۥۥ r0 = (Yue.C2104) r0
            return r0
        Ld:
            Yue.ۥۣۡۢۤ r0 = r0.m17283()
            goto L4
        L12:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public Yue.C2104 m9853() {
            r1 = this;
            Yue.ۥ۠۠ۥۥ r0 = r1.m9899()
            if (r0 == 0) goto Lf
            Yue.ۥ۠۠ۥۥ r0 = r1.m9899()
            Yue.ۥ۠۠ۥۥ r0 = r0.m9852()
            return r0
        Lf:
            return r1
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public Yue.C2104 m9854(java.util.function.Consumer<? super Yue.C2104> r2) {
            r1 = this;
            java.util.stream.Stream r0 = r1.m9920()
            r0.forEach(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public Yue.C2104 m9855(java.util.function.Consumer<? super Yue.AbstractC4398> r1) {
            r0 = this;
            Yue.ۥۣۡۢۤ r1 = super.mo9804(r1)
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public Yue.C2108 m9856() {
            r1 = this;
            Yue.ۥ۠ۡ۠ۤ$ۥ r0 = new Yue.ۥ۠ۡ۠ۤ$ۥ
            r0.<init>()
            Yue.ۥ۠۠ۥۧ r0 = Yue.C1225.m6558(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public Yue.C2104 m9857(java.lang.String r2) {
            r1 = this;
            Yue.C6657.m25632(r2)
            Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠ۡ r0 = new Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠ۡ
            r0.<init>(r2)
            Yue.ۥ۠۠ۥۧ r2 = Yue.C1225.m6558(r0, r1)
            int r0 = r2.size()
            if (r0 <= 0) goto L1a
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            Yue.ۥ۠۠ۥۥ r2 = (Yue.C2104) r2
            return r2
        L1a:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public Yue.C2108 m9858(java.lang.String r2) {
            r1 = this;
            Yue.C6657.m25632(r2)
            java.lang.String r2 = r2.trim()
            Yue.ۥ۠ۡ۠ۤ$ۥ۟ r0 = new Yue.ۥ۠ۡ۠ۤ$ۥ۟
            r0.<init>(r2)
            Yue.ۥ۠۠ۥۧ r2 = Yue.C1225.m6558(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    public Yue.C2108 m9859(java.lang.String r2) {
            r1 = this;
            Yue.C6657.m25632(r2)
            java.lang.String r2 = r2.trim()
            Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ r0 = new Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟
            r0.<init>(r2)
            Yue.ۥ۠۠ۥۧ r2 = Yue.C1225.m6558(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۥ, reason: contains not printable characters */
    public Yue.C2108 m9860(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟۟ r0 = new Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟۟
            r0.<init>(r2, r3)
            Yue.ۥ۠۠ۥۧ r2 = Yue.C1225.m6558(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۦ, reason: contains not printable characters */
    public Yue.C2108 m9861(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟۠ r0 = new Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟۠
            r0.<init>(r2, r3)
            Yue.ۥ۠۠ۥۧ r2 = Yue.C1225.m6558(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۧ, reason: contains not printable characters */
    public Yue.C2108 m9862(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۡ r0 = new Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۡ
            r0.<init>(r2, r3)
            Yue.ۥ۠۠ۥۧ r2 = Yue.C1225.m6558(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۨ, reason: contains not printable characters */
    public Yue.C2108 m9863(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)     // Catch: java.util.regex.PatternSyntaxException -> L9
            Yue.ۥ۠۠ۥۧ r4 = r3.m9864(r4, r5)
            return r4
        L9:
            r4 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Pattern syntax error: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5, r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ, reason: contains not printable characters */
    public Yue.C2108 m9864(java.lang.String r2, java.util.regex.Pattern r3) {
            r1 = this;
            Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۢ r0 = new Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۢ
            r0.<init>(r2, r3)
            Yue.ۥ۠۠ۥۧ r2 = Yue.C1225.m6558(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ۟, reason: contains not printable characters */
    public Yue.C2108 m9865(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            Yue.ۥ۠ۡ۠ۤ$ۥۣ۟۟۟ r0 = new Yue.ۥ۠ۡ۠ۤ$ۥۣ۟۟۟
            r0.<init>(r2, r3)
            Yue.ۥ۠۠ۥۧ r2 = Yue.C1225.m6558(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ۠, reason: contains not printable characters */
    public Yue.C2108 m9866(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۤ r0 = new Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۤ
            r0.<init>(r2, r3)
            Yue.ۥ۠۠ۥۧ r2 = Yue.C1225.m6558(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۡ, reason: contains not printable characters */
    public Yue.C2108 m9867(java.lang.String r2) {
            r1 = this;
            Yue.C6657.m25632(r2)
            Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۥ r0 = new Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۥ
            r0.<init>(r2)
            Yue.ۥ۠۠ۥۧ r2 = Yue.C1225.m6558(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۢ, reason: contains not printable characters */
    public Yue.C2108 m9868(int r2) {
            r1 = this;
            Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠ۢ r0 = new Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠ۢ
            r0.<init>(r2)
            Yue.ۥ۠۠ۥۧ r2 = Yue.C1225.m6558(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public Yue.C2108 m9869(int r2) {
            r1 = this;
            Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠ۤ r0 = new Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠ۤ
            r0.<init>(r2)
            Yue.ۥ۠۠ۥۧ r2 = Yue.C1225.m6558(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۤ, reason: contains not printable characters */
    public Yue.C2108 m9870(int r2) {
            r1 = this;
            Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠ۥ r0 = new Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۠ۥ
            r0.<init>(r2)
            Yue.ۥ۠۠ۥۧ r2 = Yue.C1225.m6558(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۥ, reason: contains not printable characters */
    public Yue.C2108 m9871(java.lang.String r2) {
            r1 = this;
            Yue.C6657.m25632(r2)
            java.lang.String r2 = Yue.C4415.m17327(r2)
            Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۢۡ r0 = new Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۢۡ
            r0.<init>(r2)
            Yue.ۥ۠۠ۥۧ r2 = Yue.C1225.m6558(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۦ, reason: contains not printable characters */
    public Yue.C2108 m9872(java.lang.String r2) {
            r1 = this;
            Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۧ r0 = new Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۧ
            r0.<init>(r2)
            Yue.ۥ۠۠ۥۧ r2 = Yue.C1225.m6558(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۧ, reason: contains not printable characters */
    public Yue.C2108 m9873(java.lang.String r2) {
            r1 = this;
            Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۨ r0 = new Yue.ۥ۠ۡ۠ۤ$ۥ۟۟۟ۨ
            r0.<init>(r2)
            Yue.ۥ۠۠ۥۧ r2 = Yue.C1225.m6558(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public Yue.C2108 m9874(java.lang.String r5) {
            r4 = this;
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)     // Catch: java.util.regex.PatternSyntaxException -> L9
            Yue.ۥ۠۠ۥۧ r5 = r4.m9875(r5)
            return r5
        L9:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Pattern syntax error: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ, reason: contains not printable characters */
    public Yue.C2108 m9875(java.util.regex.Pattern r2) {
            r1 = this;
            Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۢ r0 = new Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۢ
            r0.<init>(r2)
            Yue.ۥ۠۠ۥۧ r2 = Yue.C1225.m6558(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public Yue.C2108 m9876(java.lang.String r5) {
            r4 = this;
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)     // Catch: java.util.regex.PatternSyntaxException -> L9
            Yue.ۥ۠۠ۥۧ r5 = r4.m9877(r5)
            return r5
        L9:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Pattern syntax error: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public Yue.C2108 m9877(java.util.regex.Pattern r2) {
            r1 = this;
            Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۡۨ r0 = new Yue.ۥ۠ۡ۠ۤ$ۥ۟۟ۡۨ
            r0.<init>(r2)
            Yue.ۥ۠۠ۥۧ r2 = Yue.C1225.m6558(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۡ, reason: contains not printable characters */
    public boolean m9878() {
            r2 = this;
            java.util.List<Yue.ۥۣۡۢۤ> r0 = r2.f6642
            java.util.List<Yue.ۥۣۡۢۤ> r1 = Yue.AbstractC4398.f13956
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۢ, reason: contains not printable characters */
    public boolean m9879(java.lang.String r14) {
            r13 = this;
            Yue.ۥ۟ۢ۠ۤ r0 = r13.f6643
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "class"
            java.lang.String r0 = r0.m4282(r2)
            int r2 = r0.length()
            int r9 = r14.length()
            if (r2 == 0) goto L5c
            if (r2 >= r9) goto L19
            goto L5c
        L19:
            if (r2 != r9) goto L20
            boolean r14 = r14.equalsIgnoreCase(r0)
            return r14
        L20:
            r3 = r1
            r10 = r3
            r11 = r10
        L23:
            if (r11 >= r2) goto L4c
            char r4 = r0.charAt(r11)
            boolean r4 = java.lang.Character.isWhitespace(r4)
            r12 = 1
            if (r4 == 0) goto L45
            if (r3 == 0) goto L49
            int r3 = r11 - r10
            if (r3 != r9) goto L43
            r4 = 1
            r7 = 0
            r3 = r0
            r5 = r10
            r6 = r14
            r8 = r9
            boolean r3 = r3.regionMatches(r4, r5, r6, r7, r8)
            if (r3 == 0) goto L43
            return r12
        L43:
            r3 = r1
            goto L49
        L45:
            if (r3 != 0) goto L49
            r10 = r11
            r3 = r12
        L49:
            int r11 = r11 + 1
            goto L23
        L4c:
            if (r3 == 0) goto L5c
            int r2 = r2 - r10
            if (r2 != r9) goto L5c
            r4 = 1
            r7 = 0
            r3 = r0
            r5 = r10
            r6 = r14
            r8 = r9
            boolean r14 = r3.regionMatches(r4, r5, r6, r7, r8)
            return r14
        L5c:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public boolean m9880() {
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            Yue.ۥ۠۠ۥۤ r1 = new Yue.ۥ۠۠ۥۤ
            r1.<init>(r0)
            r2.m9850(r1)
            boolean r0 = r0.get()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۤ, reason: contains not printable characters */
    public Yue.C2104 m9881(java.lang.String r1) {
            r0 = this;
            r0.m9847()
            r0.m9817(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۥ, reason: contains not printable characters */
    public java.lang.String m9882() {
            r2 = this;
            java.lang.StringBuilder r0 = Yue.C5973.m22113()
            r2.mo9806(r0)
            java.lang.String r0 = Yue.C5973.m22128(r0)
            Yue.ۥ۠۟ۧۥ$ۥ r1 = Yue.C4405.m17316(r2)
            boolean r1 = r1.m8981()
            if (r1 == 0) goto L19
            java.lang.String r0 = r0.trim()
        L19:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۦ, reason: contains not printable characters */
    public Yue.C2104 m9883(java.lang.String r2) {
            r1 = this;
            Yue.C6657.m25635(r2)
            java.lang.String r0 = "id"
            r1.m9824(r0, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۧ, reason: contains not printable characters */
    public java.lang.String m9884() {
            r2 = this;
            Yue.ۥ۟ۢ۠ۤ r0 = r2.f6643
            if (r0 == 0) goto Lb
            java.lang.String r1 = "id"
            java.lang.String r0 = r0.m4282(r1)
            goto Ld
        Lb:
            java.lang.String r0 = ""
        Ld:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public Yue.C2104 m9885(int r4, java.util.Collection<? extends Yue.AbstractC4398> r5) {
            r3 = this;
            java.lang.String r0 = "Children collection to be inserted must not be null."
            Yue.C6657.m25636(r5, r0)
            int r0 = r3.mo9797()
            if (r4 >= 0) goto Le
            int r1 = r0 + 1
            int r4 = r4 + r1
        Le:
            r1 = 0
            if (r4 < 0) goto L15
            if (r4 > r0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = r1
        L16:
            java.lang.String r2 = "Insert position out of bounds."
            Yue.C6657.m25629(r0, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
            Yue.ۥۣۡۢۤ[] r5 = new Yue.AbstractC4398[r1]
            java.lang.Object[] r5 = r0.toArray(r5)
            Yue.ۥۣۡۢۤ[] r5 = (Yue.AbstractC4398[]) r5
            r3.m17267(r4, r5)
            return r3
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public Yue.C2104 m9886(int r3, Yue.AbstractC4398... r4) {
            r2 = this;
            java.lang.String r0 = "Children collection to be inserted must not be null."
            Yue.C6657.m25636(r4, r0)
            int r0 = r2.mo9797()
            if (r3 >= 0) goto Le
            int r1 = r0 + 1
            int r3 = r3 + r1
        Le:
            if (r3 < 0) goto L14
            if (r3 > r0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            java.lang.String r1 = "Insert position out of bounds."
            Yue.C6657.m25629(r0, r1)
            r2.m17267(r3, r4)
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public boolean m9887(Yue.AbstractC2179 r2) {
            r1 = this;
            Yue.ۥ۠۠ۥۥ r0 = r1.m9911()
            boolean r2 = r2.mo6691(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public boolean m9888(java.lang.String r1) {
            r0 = this;
            Yue.ۥ۠ۡ۠ۤ r1 = Yue.C5000.m19434(r1)
            boolean r1 = r0.m9887(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public boolean m9889() {
            r1 = this;
            Yue.ۥۢ۠ۨۡ r0 = r1.f6640
            boolean r0 = r0.m22902()
            return r0
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۠, reason: contains not printable characters */
    public final boolean m9890(Yue.C1948.C1949 r2) {
            r1 = this;
            Yue.ۥۢ۠ۨۡ r0 = r1.f6640
            boolean r0 = r0.m22902()
            if (r0 != 0) goto L25
            Yue.ۥ۠۠ۥۥ r0 = r1.m9899()
            if (r0 == 0) goto L1c
            Yue.ۥ۠۠ۥۥ r0 = r1.m9899()
            Yue.ۥۢ۠ۨۡ r0 = r0.m9921()
            boolean r0 = r0.m22900()
            if (r0 != 0) goto L25
        L1c:
            boolean r2 = r2.m8978()
            if (r2 == 0) goto L23
            goto L25
        L23:
            r2 = 0
            goto L26
        L25:
            r2 = 1
        L26:
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public final boolean m9891(Yue.C1948.C1949 r3) {
            r2 = this;
            Yue.ۥۢ۠ۨۡ r0 = r2.f6640
            boolean r0 = r0.m22906()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            Yue.ۥ۠۠ۥۥ r0 = r2.m9899()
            if (r0 == 0) goto L1a
            Yue.ۥ۠۠ۥۥ r0 = r2.m9899()
            boolean r0 = r0.m9889()
            if (r0 == 0) goto L2f
        L1a:
            boolean r0 = r2.m17280()
            if (r0 != 0) goto L2f
            boolean r3 = r3.m8978()
            if (r3 != 0) goto L2f
            java.lang.String r3 = "br"
            boolean r3 = r2.m17282(r3)
            if (r3 != 0) goto L2f
            r1 = 1
        L2f:
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۨ, reason: contains not printable characters */
    public Yue.C2104 m9892() {
            r2 = this;
            Yue.ۥۣۡۢۤ r0 = r2.m17281()
        L4:
            if (r0 == 0) goto L12
            boolean r1 = r0 instanceof Yue.C2104
            if (r1 == 0) goto Ld
            Yue.ۥ۠۠ۥۥ r0 = (Yue.C2104) r0
            return r0
        Ld:
            Yue.ۥۣۡۢۤ r0 = r0.m17291()
            goto L4
        L12:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤ, reason: contains not printable characters */
    public Yue.C2104 m9893() {
            r1 = this;
            Yue.ۥ۠۠ۥۥ r0 = r1.m9899()
            if (r0 == 0) goto Lf
            Yue.ۥ۠۠ۥۥ r0 = r1.m9899()
            Yue.ۥ۠۠ۥۥ r0 = r0.m9892()
            return r0
        Lf:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤ۟, reason: contains not printable characters */
    public Yue.C2104 m9894() {
            r2 = this;
            r0 = r2
        L1:
            Yue.ۥۣۡۢۤ r0 = r0.m17283()
            if (r0 == 0) goto Le
            boolean r1 = r0 instanceof Yue.C2104
            if (r1 == 0) goto L1
            Yue.ۥ۠۠ۥۥ r0 = (Yue.C2104) r0
            return r0
        Le:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤ۠, reason: contains not printable characters */
    public Yue.C2108 m9895() {
            r1 = this;
            r0 = 1
            Yue.ۥ۠۠ۥۧ r0 = r1.m9896(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۡ, reason: contains not printable characters */
    public final Yue.C2108 m9896(boolean r3) {
            r2 = this;
            Yue.ۥ۠۠ۥۧ r0 = new Yue.ۥ۠۠ۥۧ
            r0.<init>()
            Yue.ۥۣۡۢۤ r1 = r2.f13958
            if (r1 != 0) goto La
            return r0
        La:
            r0.add(r2)
            if (r3 == 0) goto L14
            Yue.ۥ۠۠ۥۧ r3 = r0.m9962()
            goto L18
        L14:
            Yue.ۥ۠۠ۥۧ r3 = r0.m9970()
        L18:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۢ, reason: contains not printable characters */
    public java.lang.String m9897() {
            r1 = this;
            java.lang.StringBuilder r0 = Yue.C5973.m22113()
            r1.m9898(r0)
            java.lang.String r0 = Yue.C5973.m22128(r0)
            java.lang.String r0 = r0.trim()
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public final void m9898(java.lang.StringBuilder r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.mo9797()
            if (r0 >= r1) goto L2f
            java.util.List<Yue.ۥۣۡۢۤ> r1 = r3.f6642
            java.lang.Object r1 = r1.get(r0)
            Yue.ۥۣۡۢۤ r1 = (Yue.AbstractC4398) r1
            boolean r2 = r1 instanceof Yue.C6151
            if (r2 == 0) goto L19
            Yue.ۥۢۡ۠ۦ r1 = (Yue.C6151) r1
            m9782(r4, r1)
            goto L2c
        L19:
            java.lang.String r2 = "br"
            boolean r1 = r1.m17282(r2)
            if (r1 == 0) goto L2c
            boolean r1 = Yue.C6151.m23011(r4)
            if (r1 != 0) goto L2c
            java.lang.String r1 = " "
            r4.append(r1)
        L2c:
            int r0 = r0 + 1
            goto L1
        L2f:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۤ, reason: contains not printable characters */
    public final Yue.C2104 m9899() {
            r1 = this;
            Yue.ۥۣۡۢۤ r0 = r1.f13958
            Yue.ۥ۠۠ۥۥ r0 = (Yue.C2104) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۥ, reason: contains not printable characters */
    public Yue.C2108 m9900() {
            r3 = this;
            Yue.ۥ۠۠ۥۧ r0 = new Yue.ۥ۠۠ۥۧ
            r0.<init>()
            Yue.ۥ۠۠ۥۥ r1 = r3.m9899()
        L9:
            if (r1 == 0) goto L1b
            java.lang.String r2 = "#root"
            boolean r2 = r1.m17282(r2)
            if (r2 != 0) goto L1b
            r0.add(r1)
            Yue.ۥ۠۠ۥۥ r1 = r1.m9899()
            goto L9
        L1b:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۦ, reason: contains not printable characters */
    public Yue.C2104 m9901(java.lang.String r3) {
            r2 = this;
            Yue.C6657.m25635(r3)
            Yue.ۥۣۡۧۦ r0 = Yue.C4405.m17317(r2)
            java.lang.String r1 = r2.mo9794()
            java.util.List r3 = r0.m18632(r3, r2, r1)
            r0 = 0
            Yue.ۥۣۡۢۤ[] r1 = new Yue.AbstractC4398[r0]
            java.lang.Object[] r3 = r3.toArray(r1)
            Yue.ۥۣۡۢۤ[] r3 = (Yue.AbstractC4398[]) r3
            r2.m17267(r0, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۧ, reason: contains not printable characters */
    public Yue.C2104 m9902(Yue.AbstractC4398 r2) {
            r1 = this;
            Yue.C6657.m25635(r2)
            r0 = 0
            Yue.ۥۣۡۢۤ[] r2 = new Yue.AbstractC4398[]{r2}
            r1.m17267(r0, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۨ, reason: contains not printable characters */
    public Yue.C2104 m9903(java.util.Collection<? extends Yue.AbstractC4398> r2) {
            r1 = this;
            r0 = 0
            r1.m9885(r0, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥ, reason: contains not printable characters */
    public Yue.C2104 m9904(java.lang.String r2) {
            r1 = this;
            Yue.ۥۢ۠ۨۡ r0 = r1.f6640
            java.lang.String r0 = r0.m22909()
            Yue.ۥ۠۠ۥۥ r2 = r1.m9905(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥ۟, reason: contains not printable characters */
    public Yue.C2104 m9905(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            Yue.ۥ۠۠ۥۥ r0 = new Yue.ۥ۠۠ۥۥ
            Yue.ۥۣۡۧۦ r1 = Yue.C4405.m17317(r2)
            Yue.ۥۣۡۧۥ r1 = r1.m18638()
            Yue.ۥۢ۠ۨۡ r3 = Yue.C6104.m22898(r3, r4, r1)
            java.lang.String r4 = r2.mo9794()
            r0.<init>(r3, r4)
            r2.m9902(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥ۠, reason: contains not printable characters */
    public Yue.C2104 m9906(java.lang.String r2) {
            r1 = this;
            Yue.C6657.m25635(r2)
            Yue.ۥۢۡ۠ۦ r0 = new Yue.ۥۢۡ۠ۦ
            r0.<init>(r2)
            r1.m9902(r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۢ, reason: contains not printable characters */
    public Yue.C2104 m9907() {
            r2 = this;
            r0 = r2
        L1:
            Yue.ۥۣۡۢۤ r0 = r0.m17291()
            if (r0 == 0) goto Le
            boolean r1 = r0 instanceof Yue.C2104
            if (r1 == 0) goto L1
            Yue.ۥ۠۠ۥۥ r0 = (Yue.C2104) r0
            return r0
        Le:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۣ, reason: contains not printable characters */
    public Yue.C2108 m9908() {
            r1 = this;
            r0 = 0
            Yue.ۥ۠۠ۥۧ r0 = r1.m9896(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۤ, reason: contains not printable characters */
    public Yue.C2104 m9909(java.lang.String r1) {
            r0 = this;
            Yue.ۥۣۡۢۤ r1 = super.mo9810(r1)
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۥ, reason: contains not printable characters */
    public Yue.C2104 m9910(java.lang.String r2) {
            r1 = this;
            Yue.C6657.m25635(r2)
            java.util.Set r0 = r1.m9835()
            r0.remove(r2)
            r1.m9834(r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۦ, reason: contains not printable characters */
    public Yue.C2104 m9911() {
            r1 = this;
            Yue.ۥۣۡۢۤ r0 = super.mo9811()
            Yue.ۥ۠۠ۥۥ r0 = (Yue.C2104) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۨ, reason: contains not printable characters */
    public Yue.C2108 m9912(Yue.AbstractC2179 r1) {
            r0 = this;
            Yue.ۥ۠۠ۥۧ r1 = Yue.C5568.m20874(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦ, reason: contains not printable characters */
    public Yue.C2108 m9913(java.lang.String r1) {
            r0 = this;
            Yue.ۥ۠۠ۥۧ r1 = Yue.C5568.m20875(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦ۟, reason: contains not printable characters */
    public Yue.C2104 m9914(Yue.AbstractC2179 r1) {
            r0 = this;
            Yue.ۥ۠۠ۥۥ r1 = Yue.C1225.m6559(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦ۠, reason: contains not printable characters */
    public Yue.C2104 m9915(java.lang.String r1) {
            r0 = this;
            Yue.ۥ۠۠ۥۥ r1 = Yue.C5568.m20877(r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۡ, reason: contains not printable characters */
    public Yue.C2108 m9916(java.lang.String r3) {
            r2 = this;
            Yue.ۥ۠۠ۥۧ r0 = new Yue.ۥ۠۠ۥۧ
            java.lang.Class<Yue.ۥ۠۠ۥۥ> r1 = Yue.C2104.class
            java.util.List r3 = Yue.C4405.m17318(r3, r2, r1)
            r0.<init>(r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۢ, reason: contains not printable characters */
    public <T extends Yue.AbstractC4398> java.util.List<T> m9917(java.lang.String r1, java.lang.Class<T> r2) {
            r0 = this;
            java.util.List r1 = Yue.C4405.m17318(r1, r0, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۣ */
    public Yue.C2104 mo8939() {
            r5 = this;
            java.lang.String r0 = r5.mo9794()
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto Lc
            r0 = r2
        Lc:
            Yue.ۥ۠۠ۥۥ r1 = new Yue.ۥ۠۠ۥۥ
            Yue.ۥۢ۠ۨۡ r3 = r5.f6640
            Yue.ۥ۟ۢ۠ۤ r4 = r5.f6643
            if (r4 != 0) goto L15
            goto L19
        L15:
            Yue.ۥ۟ۢ۠ۤ r2 = r4.m4278()
        L19:
            r1.<init>(r3, r0, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۤ, reason: contains not printable characters */
    public boolean m9918(Yue.C1948.C1949 r2) {
            r1 = this;
            boolean r0 = r2.m8981()
            if (r0 == 0) goto L1c
            boolean r0 = r1.m9890(r2)
            if (r0 == 0) goto L1c
            boolean r2 = r1.m9891(r2)
            if (r2 != 0) goto L1c
            Yue.ۥۣۡۢۤ r2 = r1.f13958
            boolean r2 = m9788(r2)
            if (r2 != 0) goto L1c
            r2 = 1
            goto L1d
        L1c:
            r2 = 0
        L1d:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۥ, reason: contains not printable characters */
    public Yue.C2108 m9919() {
            r3 = this;
            Yue.ۥۣۡۢۤ r0 = r3.f13958
            if (r0 != 0) goto Lb
            Yue.ۥ۠۠ۥۧ r0 = new Yue.ۥ۠۠ۥۧ
            r1 = 0
            r0.<init>(r1)
            return r0
        Lb:
            Yue.ۥ۠۠ۥۥ r0 = r3.m9899()
            java.util.List r0 = r0.m9830()
            Yue.ۥ۠۠ۥۧ r1 = new Yue.ۥ۠۠ۥۧ
            int r2 = r0.size()
            int r2 = r2 + (-1)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r0.next()
            Yue.ۥ۠۠ۥۥ r2 = (Yue.C2104) r2
            if (r2 == r3) goto L22
            r1.add(r2)
            goto L22
        L34:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۦ, reason: contains not printable characters */
    public java.util.stream.Stream<Yue.C2104> m9920() {
            r1 = this;
            java.lang.Class<Yue.ۥ۠۠ۥۥ> r0 = Yue.C2104.class
            java.util.stream.Stream r0 = Yue.C4405.m17320(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۧ, reason: contains not printable characters */
    public Yue.C6104 m9921() {
            r1 = this;
            Yue.ۥۢ۠ۨۡ r0 = r1.f6640
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۨ, reason: contains not printable characters */
    public Yue.C2104 m9922(java.lang.String r2) {
            r1 = this;
            Yue.ۥۢ۠ۨۡ r0 = r1.f6640
            java.lang.String r0 = r0.m22909()
            Yue.ۥ۠۠ۥۥ r2 = r1.m9923(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧ, reason: contains not printable characters */
    public Yue.C2104 m9923(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "tagName"
            Yue.C6657.m25634(r2, r0)
            java.lang.String r0 = "namespace"
            Yue.C6657.m25634(r3, r0)
            Yue.ۥۣۡۧۦ r0 = Yue.C4405.m17317(r1)
            Yue.ۥۣۡۧۥ r0 = r0.m18638()
            Yue.ۥۢ۠ۨۡ r2 = Yue.C6104.m22898(r2, r3, r0)
            r1.f6640 = r2
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧ۟, reason: contains not printable characters */
    public java.lang.String m9924() {
            r1 = this;
            Yue.ۥۢ۠ۨۡ r0 = r1.f6640
            java.lang.String r0 = r0.m22901()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧ۠ */
    public Yue.C2104 mo8940(java.lang.String r3) {
            r2 = this;
            Yue.C6657.m25635(r3)
            r2.m9847()
            Yue.ۥ۠۟ۧۥ r0 = r2.m17287()
            if (r0 == 0) goto L23
            Yue.ۥۣۡۧۦ r0 = r0.m8958()
            java.lang.String r1 = r2.mo9808()
            boolean r0 = r0.m18628(r1)
            if (r0 == 0) goto L23
            Yue.ۥ۟ۨۢۥ r0 = new Yue.ۥ۟ۨۢۥ
            r0.<init>(r3)
            r2.m9818(r0)
            goto L2b
        L23:
            Yue.ۥۢۡ۠ۦ r0 = new Yue.ۥۢۡ۠ۦ
            r0.<init>(r3)
            r2.m9818(r0)
        L2b:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۡ, reason: contains not printable characters */
    public java.lang.String m9925() {
            r2 = this;
            java.lang.StringBuilder r0 = Yue.C5973.m22113()
            Yue.ۥ۠۠ۥۥ$ۥ۟ r1 = new Yue.ۥ۠۠ۥۥ$ۥ۟
            r1.<init>(r0)
            Yue.C4404.m17315(r1, r2)
            java.lang.String r0 = Yue.C5973.m22128(r0)
            java.lang.String r0 = r0.trim()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۢ, reason: contains not printable characters */
    public java.util.List<Yue.C6151> m9926() {
            r1 = this;
            java.lang.Class<Yue.ۥۢۡ۠ۦ> r0 = Yue.C6151.class
            java.util.List r0 = r1.m9851(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۧ, reason: contains not printable characters */
    public Yue.C2104 m9927(java.lang.String r3) {
            r2 = this;
            Yue.C6657.m25635(r3)
            java.util.Set r0 = r2.m9835()
            boolean r1 = r0.contains(r3)
            if (r1 == 0) goto L11
            r0.remove(r3)
            goto L14
        L11:
            r0.add(r3)
        L14:
            r2.m9834(r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۤ, reason: contains not printable characters */
    public Yue.C2104 m9928(Yue.InterfaceC4406 r1) {
            r0 = this;
            Yue.ۥۣۡۢۤ r1 = super.mo9812(r1)
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۥ, reason: contains not printable characters */
    public Yue.C2104 m9929(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "textarea"
            java.lang.String r1 = "http://www.w3.org/1999/xhtml"
            boolean r0 = r2.m9845(r0, r1)
            if (r0 == 0) goto Le
            r2.mo8940(r3)
            goto L13
        Le:
            java.lang.String r0 = "value"
            r2.m9824(r0, r3)
        L13:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۦ, reason: contains not printable characters */
    public java.lang.String m9930() {
            r2 = this;
            java.lang.String r0 = "textarea"
            java.lang.String r1 = "http://www.w3.org/1999/xhtml"
            boolean r0 = r2.m9845(r0, r1)
            if (r0 == 0) goto Lf
            java.lang.String r0 = r2.m9925()
            return r0
        Lf:
            java.lang.String r0 = "value"
            java.lang.String r0 = r2.mo14513(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۧ, reason: contains not printable characters */
    public java.lang.String m9931() {
            r4 = this;
            java.lang.StringBuilder r0 = Yue.C5973.m22113()
            int r1 = r4.mo9797()
            r2 = 0
        L9:
            if (r2 >= r1) goto L19
            java.util.List<Yue.ۥۣۡۢۤ> r3 = r4.f6642
            java.lang.Object r3 = r3.get(r2)
            Yue.ۥۣۡۢۤ r3 = (Yue.AbstractC4398) r3
            m9783(r3, r0)
            int r2 = r2 + 1
            goto L9
        L19:
            java.lang.String r0 = Yue.C5973.m22128(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۨ, reason: contains not printable characters */
    public java.lang.String m9932() {
            r3 = this;
            java.lang.StringBuilder r0 = Yue.C5973.m22113()
            java.util.stream.Stream r1 = r3.m17284()
            Yue.ۥ۠۠ۥۣ r2 = new Yue.ۥ۠۠ۥۣ
            r2.<init>(r0)
            r1.forEach(r2)
            java.lang.String r0 = Yue.C5973.m22128(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨ, reason: contains not printable characters */
    public Yue.C2104 m9933(java.lang.String r1) {
            r0 = this;
            Yue.ۥۣۡۢۤ r1 = super.mo9813(r1)
            Yue.ۥ۠۠ۥۥ r1 = (Yue.C2104) r1
            return r1
    }
}
