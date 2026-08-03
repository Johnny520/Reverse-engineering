package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3701 implements Yue.InterfaceC3703 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.util.Locale[] f11822 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.util.Locale f11823 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.util.Locale f11824 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.util.Locale f11825 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.Locale[] f11826;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final java.lang.String f11827;

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۦۦ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C3702 {
        public C3702() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.lang.String m14927(java.util.Locale r0) {
                java.lang.String r0 = r0.getScript()
                return r0
        }
    }

    static {
            r0 = 0
            java.util.Locale[] r0 = new java.util.Locale[r0]
            Yue.C3701.f11822 = r0
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r1 = "en"
            java.lang.String r2 = "XA"
            r0.<init>(r1, r2)
            Yue.C3701.f11823 = r0
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r1 = "ar"
            java.lang.String r2 = "XB"
            r0.<init>(r1, r2)
            Yue.C3701.f11824 = r0
            java.lang.String r0 = "en-Latn"
            java.util.Locale r0 = Yue.C3698.m14895(r0)
            Yue.C3701.f11825 = r0
            return
    }

    public C3701(@Yue.InterfaceC4410 java.util.Locale... r8) {
            r7 = this;
            r7.<init>()
            int r0 = r8.length
            if (r0 != 0) goto Lf
            java.util.Locale[] r8 = Yue.C3701.f11822
            r7.f11826 = r8
            java.lang.String r8 = ""
            r7.f11827 = r8
            goto L75
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            r4 = r3
        L20:
            int r5 = r8.length
            if (r4 >= r5) goto L65
            r5 = r8[r4]
            if (r5 == 0) goto L49
            boolean r6 = r1.contains(r5)
            if (r6 != 0) goto L46
            java.lang.Object r5 = r5.clone()
            java.util.Locale r5 = (java.util.Locale) r5
            r0.add(r5)
            m14919(r2, r5)
            int r6 = r8.length
            int r6 = r6 + (-1)
            if (r4 >= r6) goto L43
            r6 = 44
            r2.append(r6)
        L43:
            r1.add(r5)
        L46:
            int r4 = r4 + 1
            goto L20
        L49:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "list["
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "] is null"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L65:
            java.util.Locale[] r8 = new java.util.Locale[r3]
            java.lang.Object[] r8 = r0.toArray(r8)
            java.util.Locale[] r8 = (java.util.Locale[]) r8
            r7.f11826 = r8
            java.lang.String r8 = r2.toString()
            r7.f11827 = r8
        L75:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static java.lang.String m14916(java.util.Locale r1) {
            java.lang.String r1 = Yue.C3701.C3702.m14927(r1)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lb
            return r1
        Lb:
            java.lang.String r1 = ""
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean m14917(java.util.Locale r1) {
            java.util.Locale r0 = Yue.C3701.f11823
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L13
            java.util.Locale r0 = Yue.C3701.f11824
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = 1
        L14:
            return r1
    }

    @Yue.InterfaceC3281(from = 0, to = 1)
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static int m14918(java.util.Locale r4, java.util.Locale r5) {
            boolean r0 = r4.equals(r5)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = r4.getLanguage()
            java.lang.String r2 = r5.getLanguage()
            boolean r0 = r0.equals(r2)
            r2 = 0
            if (r0 != 0) goto L18
            return r2
        L18:
            boolean r0 = m14917(r4)
            if (r0 != 0) goto L4f
            boolean r0 = m14917(r5)
            if (r0 == 0) goto L25
            goto L4f
        L25:
            java.lang.String r0 = m14916(r4)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L46
            java.lang.String r4 = r4.getCountry()
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L45
            java.lang.String r5 = r5.getCountry()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L44
            goto L45
        L44:
            r1 = r2
        L45:
            return r1
        L46:
            java.lang.String r4 = m14916(r5)
            boolean r4 = r0.equals(r4)
            return r4
        L4f:
            return r2
    }

    @Yue.InterfaceC6959
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m14919(java.lang.StringBuilder r1, java.util.Locale r2) {
            java.lang.String r0 = r2.getLanguage()
            r1.append(r0)
            java.lang.String r0 = r2.getCountry()
            if (r0 == 0) goto L1f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1f
            r0 = 45
            r1.append(r0)
            java.lang.String r2 = r2.getCountry()
            r1.append(r2)
        L1f:
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof Yue.C3701
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥ۠ۧۦۦ r6 = (Yue.C3701) r6
            java.util.Locale[] r6 = r6.f11826
            java.util.Locale[] r1 = r5.f11826
            int r1 = r1.length
            int r3 = r6.length
            if (r1 == r3) goto L15
            return r2
        L15:
            r1 = r2
        L16:
            java.util.Locale[] r3 = r5.f11826
            int r4 = r3.length
            if (r1 >= r4) goto L29
            r3 = r3[r1]
            r4 = r6[r1]
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L26
            return r2
        L26:
            int r1 = r1 + 1
            goto L16
        L29:
            return r0
    }

    @Override // Yue.InterfaceC3703
    public java.util.Locale get(int r3) {
            r2 = this;
            if (r3 < 0) goto La
            java.util.Locale[] r0 = r2.f11826
            int r1 = r0.length
            if (r3 >= r1) goto La
            r3 = r0[r3]
            goto Lb
        La:
            r3 = 0
        Lb:
            return r3
    }

    public int hashCode() {
            r5 = this;
            java.util.Locale[] r0 = r5.f11826
            int r1 = r0.length
            r2 = 1
            r3 = 0
        L5:
            if (r3 >= r1) goto L13
            r4 = r0[r3]
            int r2 = r2 * 31
            int r4 = r4.hashCode()
            int r2 = r2 + r4
            int r3 = r3 + 1
            goto L5
        L13:
            return r2
    }

    @Override // Yue.InterfaceC3703
    public boolean isEmpty() {
            r1 = this;
            java.util.Locale[] r0 = r1.f11826
            int r0 = r0.length
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // Yue.InterfaceC3703
    public int size() {
            r1 = this;
            java.util.Locale[] r0 = r1.f11826
            int r0 = r0.length
            return r0
    }

    @Yue.InterfaceC4410
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            r1 = 0
        Lb:
            java.util.Locale[] r2 = r4.f11826
            int r3 = r2.length
            if (r1 >= r3) goto L24
            r2 = r2[r1]
            r0.append(r2)
            java.util.Locale[] r2 = r4.f11826
            int r2 = r2.length
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L21
            r2 = 44
            r0.append(r2)
        L21:
            int r1 = r1 + 1
            goto Lb
        L24:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC3703
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int mo14920(java.util.Locale r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.Locale[] r1 = r3.f11826
            int r2 = r1.length
            if (r0 >= r2) goto L12
            r1 = r1[r0]
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto Lf
            return r0
        Lf:
            int r0 = r0 + 1
            goto L1
        L12:
            r4 = -1
            return r4
    }

    @Override // Yue.InterfaceC3703
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.String mo14921() {
            r1 = this;
            java.lang.String r0 = r1.f11827
            return r0
    }

    @Override // Yue.InterfaceC3703
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.lang.Object mo14922() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC3703
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.util.Locale mo14923(@Yue.InterfaceC4410 java.lang.String[] r2) {
            r1 = this;
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0 = 0
            java.util.Locale r2 = r1.m14924(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final java.util.Locale m14924(java.util.Collection<java.lang.String> r1, boolean r2) {
            r0 = this;
            int r1 = r0.m14925(r1, r2)
            r2 = -1
            if (r1 != r2) goto L9
            r1 = 0
            goto Ld
        L9:
            java.util.Locale[] r2 = r0.f11826
            r1 = r2[r1]
        Ld:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m14925(java.util.Collection<java.lang.String> r5, boolean r6) {
            r4 = this;
            java.util.Locale[] r0 = r4.f11826
            int r1 = r0.length
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L8
            return r3
        L8:
            int r0 = r0.length
            if (r0 != 0) goto Ld
            r5 = -1
            return r5
        Ld:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == 0) goto L1e
            java.util.Locale r6 = Yue.C3701.f11825
            int r6 = r4.m14926(r6)
            if (r6 != 0) goto L1b
            return r3
        L1b:
            if (r6 >= r0) goto L1e
            goto L1f
        L1e:
            r6 = r0
        L1f:
            java.util.Iterator r5 = r5.iterator()
        L23:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r1 = Yue.C3698.m14895(r1)
            int r1 = r4.m14926(r1)
            if (r1 != 0) goto L3a
            return r3
        L3a:
            if (r1 >= r6) goto L23
            r6 = r1
            goto L23
        L3e:
            if (r6 != r0) goto L41
            return r3
        L41:
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int m14926(java.util.Locale r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.Locale[] r1 = r3.f11826
            int r2 = r1.length
            if (r0 >= r2) goto L12
            r1 = r1[r0]
            int r1 = m14918(r4, r1)
            if (r1 <= 0) goto Lf
            return r0
        Lf:
            int r0 = r0 + 1
            goto L1
        L12:
            r4 = 2147483647(0x7fffffff, float:NaN)
            return r4
    }
}
