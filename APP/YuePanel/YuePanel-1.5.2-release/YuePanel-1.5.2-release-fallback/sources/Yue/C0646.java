package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C0646 implements java.util.Map.Entry<java.lang.String, java.lang.String>, java.lang.Cloneable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final java.lang.String[] f1628 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final java.util.regex.Pattern f1629 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final java.util.regex.Pattern f1630 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final java.util.regex.Pattern f1631 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final java.util.regex.Pattern f1632 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public java.lang.String f1633;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public java.lang.String f1634;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Yue.C0648 f1635;

    static {
            java.lang.String r28 = "truespeed"
            java.lang.String r29 = "typemustmatch"
            java.lang.String r0 = "allowfullscreen"
            java.lang.String r1 = "async"
            java.lang.String r2 = "autofocus"
            java.lang.String r3 = "checked"
            java.lang.String r4 = "compact"
            java.lang.String r5 = "declare"
            java.lang.String r6 = "default"
            java.lang.String r7 = "defer"
            java.lang.String r8 = "disabled"
            java.lang.String r9 = "formnovalidate"
            java.lang.String r10 = "hidden"
            java.lang.String r11 = "inert"
            java.lang.String r12 = "ismap"
            java.lang.String r13 = "itemscope"
            java.lang.String r14 = "multiple"
            java.lang.String r15 = "muted"
            java.lang.String r16 = "nohref"
            java.lang.String r17 = "noresize"
            java.lang.String r18 = "noshade"
            java.lang.String r19 = "novalidate"
            java.lang.String r20 = "nowrap"
            java.lang.String r21 = "open"
            java.lang.String r22 = "readonly"
            java.lang.String r23 = "required"
            java.lang.String r24 = "reversed"
            java.lang.String r25 = "seamless"
            java.lang.String r26 = "selected"
            java.lang.String r27 = "sortable"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29}
            Yue.C0646.f1628 = r0
            java.lang.String r0 = "[a-zA-Z_:][-a-zA-Z0-9_:.]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            Yue.C0646.f1629 = r0
            java.lang.String r0 = "[^-a-zA-Z0-9_:.]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            Yue.C0646.f1630 = r0
            java.lang.String r0 = "[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            Yue.C0646.f1631 = r0
            java.lang.String r0 = "[\\x00-\\x1f\\x7f-\\x9f \"'/=]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            Yue.C0646.f1632 = r0
            return
    }

    public C0646(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public C0646(java.lang.String r1, java.lang.String r2, Yue.C0648 r3) {
            r0 = this;
            r0.<init>()
            Yue.C6657.m25635(r1)
            java.lang.String r1 = r1.trim()
            Yue.C6657.m25632(r1)
            r0.f1633 = r1
            r0.f1634 = r2
            r0.f1635 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.C0646 m4211(java.lang.String r2, java.lang.String r3) {
            r0 = 1
            java.lang.String r3 = Yue.C2157.m10126(r3, r0)
            Yue.ۥ۟ۢ۠ۢ r0 = new Yue.ۥ۟ۢ۠ۢ
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static java.lang.String m4212(java.lang.String r4, Yue.C1948.C1949.EnumC1950 r5) {
            Yue.ۥ۠۟ۧۥ$ۥ$ۥ r0 = Yue.C1948.C1949.EnumC1950.f6109
            r1 = 0
            java.lang.String r2 = ""
            if (r5 != r0) goto L29
            java.util.regex.Pattern r0 = Yue.C0646.f1629
            java.util.regex.Matcher r3 = r0.matcher(r4)
            boolean r3 = r3.matches()
            if (r3 != 0) goto L29
            java.util.regex.Pattern r5 = Yue.C0646.f1630
            java.util.regex.Matcher r4 = r5.matcher(r4)
            java.lang.String r4 = r4.replaceAll(r2)
            java.util.regex.Matcher r5 = r0.matcher(r4)
            boolean r5 = r5.matches()
            if (r5 == 0) goto L28
            r1 = r4
        L28:
            return r1
        L29:
            Yue.ۥ۠۟ۧۥ$ۥ$ۥ r0 = Yue.C1948.C1949.EnumC1950.f6108
            if (r5 != r0) goto L4f
            java.util.regex.Pattern r5 = Yue.C0646.f1631
            java.util.regex.Matcher r0 = r5.matcher(r4)
            boolean r0 = r0.matches()
            if (r0 != 0) goto L4f
            java.util.regex.Pattern r0 = Yue.C0646.f1632
            java.util.regex.Matcher r4 = r0.matcher(r4)
            java.lang.String r4 = r4.replaceAll(r2)
            java.util.regex.Matcher r5 = r5.matcher(r4)
            boolean r5 = r5.matches()
            if (r5 == 0) goto L4e
            r1 = r4
        L4e:
            return r1
        L4f:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m4213(java.lang.String r1, java.lang.String r2, java.lang.Appendable r3, Yue.C1948.C1949 r4) throws java.io.IOException {
            Yue.ۥ۠۟ۧۥ$ۥ$ۥ r0 = r4.m8982()
            java.lang.String r1 = m4212(r1, r0)
            if (r1 != 0) goto Lb
            return
        Lb:
            m4214(r1, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static void m4214(java.lang.String r7, java.lang.String r8, java.lang.Appendable r9, Yue.C1948.C1949 r10) throws java.io.IOException {
            r9.append(r7)
            boolean r7 = m4217(r7, r8, r10)
            if (r7 != 0) goto L20
            java.lang.String r7 = "=\""
            r9.append(r7)
            java.lang.String r1 = Yue.C0648.m4268(r8)
            r5 = 0
            r6 = 0
            r3 = 1
            r4 = 0
            r0 = r9
            r2 = r10
            Yue.C2157.m10120(r0, r1, r2, r3, r4, r5, r6)
            r7 = 34
            r9.append(r7)
        L20:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static boolean m4215(java.lang.String r1) {
            java.lang.String[] r0 = Yue.C0646.f1628
            java.lang.String r1 = Yue.C4415.m17326(r1)
            int r1 = java.util.Arrays.binarySearch(r0, r1)
            if (r1 < 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static boolean m4216(java.lang.String r1) {
            java.lang.String r0 = "data-"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L11
            int r1 = r1.length()
            r0 = 5
            if (r1 <= r0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static boolean m4217(java.lang.String r1, java.lang.String r2, Yue.C1948.C1949 r3) {
            Yue.ۥ۠۟ۧۥ$ۥ$ۥ r3 = r3.m8982()
            Yue.ۥ۠۟ۧۥ$ۥ$ۥ r0 = Yue.C1948.C1949.EnumC1950.f6108
            if (r3 != r0) goto L1e
            if (r2 == 0) goto L1c
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L16
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L1e
        L16:
            boolean r1 = m4215(r1)
            if (r1 == 0) goto L1e
        L1c:
            r1 = 1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            return r1
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            Yue.ۥ۟ۢ۠ۢ r0 = r1.m4218()
            return r0
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L36
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L36
        L12:
            Yue.ۥ۟ۢ۠ۢ r5 = (Yue.C0646) r5
            java.lang.String r2 = r4.f1633
            if (r2 == 0) goto L21
            java.lang.String r3 = r5.f1633
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L26
            goto L25
        L21:
            java.lang.String r2 = r5.f1633
            if (r2 == 0) goto L26
        L25:
            return r1
        L26:
            java.lang.String r2 = r4.f1634
            java.lang.String r5 = r5.f1634
            if (r2 == 0) goto L31
            boolean r0 = r2.equals(r5)
            goto L35
        L31:
            if (r5 != 0) goto L34
            goto L35
        L34:
            r0 = r1
        L35:
            return r0
        L36:
            return r1
    }

    @Override // java.util.Map.Entry
    public /* bridge */ /* synthetic */ java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = r1.m4219()
            return r0
    }

    @Override // java.util.Map.Entry
    public /* bridge */ /* synthetic */ java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.m4220()
            return r0
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f1633
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.hashCode()
            goto Lb
        La:
            r0 = r1
        Lb:
            int r0 = r0 * 31
            java.lang.String r2 = r3.f1634
            if (r2 == 0) goto L15
            int r1 = r2.hashCode()
        L15:
            int r0 = r0 + r1
            return r0
    }

    @Override // java.util.Map.Entry
    public /* bridge */ /* synthetic */ java.lang.String setValue(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r0.m4226(r1)
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.m4222()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.C0646 m4218() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
            Yue.ۥ۟ۢ۠ۢ r0 = (Yue.C0646) r0     // Catch: java.lang.CloneNotSupportedException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.lang.String m4219() {
            r1 = this;
            java.lang.String r0 = r1.f1633
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public java.lang.String m4220() {
            r1 = this;
            java.lang.String r0 = r1.f1634
            java.lang.String r0 = Yue.C0648.m4268(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m4221() {
            r1 = this;
            java.lang.String r0 = r1.f1634
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public java.lang.String m4222() {
            r3 = this;
            java.lang.StringBuilder r0 = Yue.C5973.m22113()
            Yue.ۥ۠۟ۧۥ r1 = new Yue.ۥ۠۟ۧۥ     // Catch: java.io.IOException -> L17
            java.lang.String r2 = ""
            r1.<init>(r2)     // Catch: java.io.IOException -> L17
            Yue.ۥ۠۟ۧۥ$ۥ r1 = r1.m8955()     // Catch: java.io.IOException -> L17
            r3.m4223(r0, r1)     // Catch: java.io.IOException -> L17
            java.lang.String r0 = Yue.C5973.m22128(r0)
            return r0
        L17:
            r0 = move-exception
            Yue.ۥۡۨۢۨ r1 = new Yue.ۥۡۨۢۨ
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m4223(java.lang.Appendable r3, Yue.C1948.C1949 r4) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = r2.f1633
            java.lang.String r1 = r2.f1634
            m4213(r0, r1, r3, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m4224() {
            r1 = this;
            java.lang.String r0 = r1.f1633
            boolean r0 = m4216(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m4225(java.lang.String r5) {
            r4 = this;
            Yue.C6657.m25635(r5)
            java.lang.String r5 = r5.trim()
            Yue.C6657.m25632(r5)
            Yue.ۥ۟ۢ۠ۤ r0 = r4.f1635
            if (r0 == 0) goto L2e
            java.lang.String r1 = r4.f1633
            int r0 = r0.m4290(r1)
            r1 = -1
            if (r0 == r1) goto L2e
            Yue.ۥ۟ۢ۠ۤ r1 = r4.f1635
            java.lang.String[] r2 = r1.f1651
            r3 = r2[r0]
            r2[r0] = r5
            java.util.Map r0 = r1.m4283()
            if (r0 == 0) goto L2e
            java.lang.Object r1 = r0.remove(r3)
            Yue.ۥۡۥۨۦ$ۥ r1 = (Yue.C5189.C5190) r1
            r0.put(r5, r1)
        L2e:
            r4.f1633 = r5
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public java.lang.String m4226(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = r3.f1634
            Yue.ۥ۟ۢ۠ۤ r1 = r3.f1635
            if (r1 == 0) goto L1d
            java.lang.String r2 = r3.f1633
            int r1 = r1.m4290(r2)
            r2 = -1
            if (r1 == r2) goto L1d
            Yue.ۥ۟ۢ۠ۤ r0 = r3.f1635
            java.lang.String r2 = r3.f1633
            java.lang.String r0 = r0.m4281(r2)
            Yue.ۥ۟ۢ۠ۤ r2 = r3.f1635
            java.lang.Object[] r2 = r2.f1652
            r2[r1] = r4
        L1d:
            r3.f1634 = r4
            java.lang.String r4 = Yue.C0648.m4268(r0)
            return r4
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m4227(Yue.C1948.C1949 r3) {
            r2 = this;
            java.lang.String r0 = r2.f1633
            java.lang.String r1 = r2.f1634
            boolean r3 = m4217(r0, r1, r3)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Yue.C5189.C5190 m4228() {
            r2 = this;
            Yue.ۥ۟ۢ۠ۤ r0 = r2.f1635
            if (r0 != 0) goto L7
            Yue.ۥۡۥۨۦ$ۥ r0 = Yue.C5189.C5190.f19535
            return r0
        L7:
            java.lang.String r1 = r2.f1633
            Yue.ۥۡۥۨۦ$ۥ r0 = r0.m4300(r1)
            return r0
    }
}
