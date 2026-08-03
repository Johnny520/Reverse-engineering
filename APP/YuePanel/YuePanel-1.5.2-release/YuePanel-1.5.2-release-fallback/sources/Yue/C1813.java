package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1813 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean f5549 = true;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.C1520 f5550;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean f5551;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f5552;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Yue.C1520 f5553;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.util.ArrayList<Yue.AbstractC7012> f5554;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public java.util.ArrayList<Yue.C5443> f5555;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Yue.C0746.InterfaceC0748 f5556;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Yue.C0746.C0747 f5557;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public java.util.ArrayList<Yue.C5443> f5558;

    public C1813(Yue.C1520 r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f5551 = r0
            r1.f5552 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5554 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5555 = r0
            r0 = 0
            r1.f5556 = r0
            Yue.ۥ۟ۢۦۤ$ۥ r0 = new Yue.ۥ۟ۢۦۤ$ۥ
            r0.<init>()
            r1.f5557 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f5558 = r0
            r1.f5550 = r2
            r1.f5553 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m8515(Yue.C1814 r9, int r10, int r11, Yue.C1814 r12, java.util.ArrayList<Yue.C5443> r13, Yue.C5443 r14) {
            r8 = this;
            Yue.ۥۢۥۣ۠ r9 = r9.f5562
            Yue.ۥۡۧ۠ۨ r0 = r9.f24530
            if (r0 != 0) goto L107
            Yue.ۥۣ۟ۧ۟ r0 = r8.f5550
            Yue.ۥ۠ۤۦۧ r1 = r0.f4823
            if (r9 == r1) goto L107
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            if (r9 != r0) goto L12
            goto L107
        L12:
            if (r14 != 0) goto L1c
            Yue.ۥۡۧ۠ۨ r14 = new Yue.ۥۡۧ۠ۨ
            r14.<init>(r9, r11)
            r13.add(r14)
        L1c:
            r9.f24530 = r14
            r14.m20540(r9)
            Yue.ۥ۟ۨۨۥ r11 = r9.f24535
            java.util.List<Yue.ۥۣ۟ۨۨ> r11 = r11.f5569
            java.util.Iterator r11 = r11.iterator()
        L29:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r0 = r11.next()
            Yue.ۥۣ۟ۨۨ r0 = (Yue.InterfaceC1812) r0
            boolean r1 = r0 instanceof Yue.C1814
            if (r1 == 0) goto L29
            r1 = r0
            Yue.ۥ۟ۨۨۥ r1 = (Yue.C1814) r1
            r3 = 0
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.m8515(r1, r2, r3, r4, r5, r6)
            goto L29
        L46:
            Yue.ۥ۟ۨۨۥ r11 = r9.f24536
            java.util.List<Yue.ۥۣ۟ۨۨ> r11 = r11.f5569
            java.util.Iterator r11 = r11.iterator()
        L4e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r11.next()
            Yue.ۥۣ۟ۨۨ r0 = (Yue.InterfaceC1812) r0
            boolean r1 = r0 instanceof Yue.C1814
            if (r1 == 0) goto L4e
            r1 = r0
            Yue.ۥ۟ۨۨۥ r1 = (Yue.C1814) r1
            r3 = 1
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.m8515(r1, r2, r3, r4, r5, r6)
            goto L4e
        L6b:
            r11 = 1
            if (r10 != r11) goto L9a
            boolean r0 = r9 instanceof Yue.C6691
            if (r0 == 0) goto L9a
            r0 = r9
            Yue.ۥۣۢۦۧ r0 = (Yue.C6691) r0
            Yue.ۥ۟ۨۨۥ r0 = r0.f23407
            java.util.List<Yue.ۥۣ۟ۨۨ> r0 = r0.f5569
            java.util.Iterator r7 = r0.iterator()
        L7d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r7.next()
            Yue.ۥۣ۟ۨۨ r0 = (Yue.InterfaceC1812) r0
            boolean r1 = r0 instanceof Yue.C1814
            if (r1 == 0) goto L7d
            r1 = r0
            Yue.ۥ۟ۨۨۥ r1 = (Yue.C1814) r1
            r3 = 2
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.m8515(r1, r2, r3, r4, r5, r6)
            goto L7d
        L9a:
            Yue.ۥ۟ۨۨۥ r0 = r9.f24535
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r0.f5570
            java.util.Iterator r7 = r0.iterator()
        La2:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lbd
            java.lang.Object r0 = r7.next()
            r1 = r0
            Yue.ۥ۟ۨۨۥ r1 = (Yue.C1814) r1
            if (r1 != r12) goto Lb3
            r14.f20191 = r11
        Lb3:
            r3 = 0
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.m8515(r1, r2, r3, r4, r5, r6)
            goto La2
        Lbd:
            Yue.ۥ۟ۨۨۥ r0 = r9.f24536
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r0.f5570
            java.util.Iterator r7 = r0.iterator()
        Lc5:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Le0
            java.lang.Object r0 = r7.next()
            r1 = r0
            Yue.ۥ۟ۨۨۥ r1 = (Yue.C1814) r1
            if (r1 != r12) goto Ld6
            r14.f20191 = r11
        Ld6:
            r3 = 1
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.m8515(r1, r2, r3, r4, r5, r6)
            goto Lc5
        Le0:
            if (r10 != r11) goto L107
            boolean r11 = r9 instanceof Yue.C6691
            if (r11 == 0) goto L107
            Yue.ۥۣۢۦۧ r9 = (Yue.C6691) r9
            Yue.ۥ۟ۨۨۥ r9 = r9.f23407
            java.util.List<Yue.ۥ۟ۨۨۥ> r9 = r9.f5570
            java.util.Iterator r9 = r9.iterator()
        Lf0:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L107
            java.lang.Object r11 = r9.next()
            r1 = r11
            Yue.ۥ۟ۨۨۥ r1 = (Yue.C1814) r1
            r3 = 2
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.m8515(r1, r2, r3, r4, r5, r6)
            goto Lf0
        L107:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m8516(Yue.C1520 r17) {
            r16 = this;
            r0 = r17
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r1 = r0.f24511
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L33c
            java.lang.Object r2 = r1.next()
            Yue.ۥ۟ۧ۟ۢ r2 = (Yue.C1517) r2
            Yue.ۥ۟ۧ۟ۢ$ۥ۟[] r4 = r2.f4865
            r5 = r4[r3]
            r10 = 1
            r4 = r4[r10]
            int r6 = r2.m7543()
            r7 = 8
            if (r6 != r7) goto L27
            r2.f4819 = r10
            goto L8
        L27:
            float r6 = r2.f4839
            r11 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            r7 = 2
            if (r6 >= 0) goto L36
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r6 = Yue.C1517.EnumC1519.f4913
            if (r5 != r6) goto L36
            r2.f4834 = r7
        L36:
            float r6 = r2.f4842
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L42
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r6 = Yue.C1517.EnumC1519.f4913
            if (r4 != r6) goto L42
            r2.f4835 = r7
        L42:
            float r6 = r2.m7509()
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r8 = 3
            if (r6 <= 0) goto L78
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r6 = Yue.C1517.EnumC1519.f4913
            if (r5 != r6) goto L5b
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r9 = Yue.C1517.EnumC1519.f4912
            if (r4 == r9) goto L58
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r9 = Yue.C1517.EnumC1519.f4911
            if (r4 != r9) goto L5b
        L58:
            r2.f4834 = r8
            goto L78
        L5b:
            if (r4 != r6) goto L68
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r9 = Yue.C1517.EnumC1519.f4912
            if (r5 == r9) goto L65
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r9 = Yue.C1517.EnumC1519.f4911
            if (r5 != r9) goto L68
        L65:
            r2.f4835 = r8
            goto L78
        L68:
            if (r5 != r6) goto L78
            if (r4 != r6) goto L78
            int r6 = r2.f4834
            if (r6 != 0) goto L72
            r2.f4834 = r8
        L72:
            int r6 = r2.f4835
            if (r6 != 0) goto L78
            r2.f4835 = r8
        L78:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r6 = Yue.C1517.EnumC1519.f4913
            if (r5 != r6) goto L8e
            int r9 = r2.f4834
            if (r9 != r10) goto L8e
            Yue.ۥ۟ۧ۟۠ r9 = r2.f4854
            Yue.ۥ۟ۧ۟۠ r9 = r9.f4737
            if (r9 == 0) goto L8c
            Yue.ۥ۟ۧ۟۠ r9 = r2.f4856
            Yue.ۥ۟ۧ۟۠ r9 = r9.f4737
            if (r9 != 0) goto L8e
        L8c:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r5 = Yue.C1517.EnumC1519.f4912
        L8e:
            r9 = r5
            if (r4 != r6) goto La3
            int r5 = r2.f4835
            if (r5 != r10) goto La3
            Yue.ۥ۟ۧ۟۠ r5 = r2.f4855
            Yue.ۥ۟ۧ۟۠ r5 = r5.f4737
            if (r5 == 0) goto La1
            Yue.ۥ۟ۧ۟۠ r5 = r2.f4857
            Yue.ۥ۟ۧ۟۠ r5 = r5.f4737
            if (r5 != 0) goto La3
        La1:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r4 = Yue.C1517.EnumC1519.f4912
        La3:
            r12 = r4
            Yue.ۥ۠ۤۦۧ r4 = r2.f4823
            r4.f24531 = r9
            int r5 = r2.f4834
            r4.f24528 = r5
            Yue.ۥۣۢۦۧ r4 = r2.f4824
            r4.f24531 = r12
            int r13 = r2.f4835
            r4.f24528 = r13
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r4 = Yue.C1517.EnumC1519.f4914
            if (r9 == r4) goto Lc0
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r14 = Yue.C1517.EnumC1519.f4911
            if (r9 == r14) goto Lc0
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r14 = Yue.C1517.EnumC1519.f4912
            if (r9 != r14) goto Lcc
        Lc0:
            if (r12 == r4) goto L2e6
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r14 = Yue.C1517.EnumC1519.f4911
            if (r12 == r14) goto L2e6
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r14 = Yue.C1517.EnumC1519.f4912
            if (r12 != r14) goto Lcc
            goto L2e6
        Lcc:
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r9 != r6) goto L199
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r15 = Yue.C1517.EnumC1519.f4912
            if (r12 == r15) goto Ld8
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r11 = Yue.C1517.EnumC1519.f4911
            if (r12 != r11) goto L199
        Ld8:
            if (r5 != r8) goto L113
            if (r12 != r15) goto Le6
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r15
            r4.m8532(r5, r6, r7, r8, r9)
        Le6:
            int r9 = r2.m7512()
            float r3 = (float) r9
            float r4 = r2.f4869
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r8 = Yue.C1517.EnumC1519.f4911
            r4 = r16
            r5 = r2
            r6 = r8
            r4.m8532(r5, r6, r7, r8, r9)
            Yue.ۥ۠ۤۦۧ r3 = r2.f4823
            Yue.ۥ۠۟ۡۡ r3 = r3.f24532
            int r4 = r2.m7544()
            r3.mo8539(r4)
            Yue.ۥۣۢۦۧ r3 = r2.f4824
            Yue.ۥ۠۟ۡۡ r3 = r3.f24532
            int r4 = r2.m7512()
            r3.mo8539(r4)
            r2.f4819 = r10
            goto L8
        L113:
            if (r5 != r10) goto L12b
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.m8532(r5, r6, r7, r8, r9)
            Yue.ۥ۠ۤۦۧ r3 = r2.f4823
            Yue.ۥ۠۟ۡۡ r3 = r3.f24532
            int r2 = r2.m7544()
            r3.f5704 = r2
            goto L8
        L12b:
            if (r5 != r7) goto L167
            Yue.ۥ۟ۧ۟ۢ$ۥ۟[] r11 = r0.f4865
            r11 = r11[r3]
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r15 = Yue.C1517.EnumC1519.f4911
            if (r11 == r15) goto L137
            if (r11 != r4) goto L199
        L137:
            float r3 = r2.f4839
            int r4 = r17.m7544()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r7 = (int) r3
            int r9 = r2.m7512()
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.m8532(r5, r6, r7, r8, r9)
            Yue.ۥ۠ۤۦۧ r3 = r2.f4823
            Yue.ۥ۠۟ۡۡ r3 = r3.f24532
            int r4 = r2.m7544()
            r3.mo8539(r4)
            Yue.ۥۣۢۦۧ r3 = r2.f4824
            Yue.ۥ۠۟ۡۡ r3 = r3.f24532
            int r4 = r2.m7512()
            r3.mo8539(r4)
            r2.f4819 = r10
            goto L8
        L167:
            Yue.ۥ۟ۧ۟۠[] r11 = r2.f4862
            r7 = r11[r3]
            Yue.ۥ۟ۧ۟۠ r7 = r7.f4737
            if (r7 == 0) goto L175
            r7 = r11[r10]
            Yue.ۥ۟ۧ۟۠ r7 = r7.f4737
            if (r7 != 0) goto L199
        L175:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r15
            r8 = r12
            r4.m8532(r5, r6, r7, r8, r9)
            Yue.ۥ۠ۤۦۧ r3 = r2.f4823
            Yue.ۥ۠۟ۡۡ r3 = r3.f24532
            int r4 = r2.m7544()
            r3.mo8539(r4)
            Yue.ۥۣۢۦۧ r3 = r2.f4824
            Yue.ۥ۠۟ۡۡ r3 = r3.f24532
            int r4 = r2.m7512()
            r3.mo8539(r4)
            r2.f4819 = r10
            goto L8
        L199:
            if (r12 != r6) goto L272
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r11 = Yue.C1517.EnumC1519.f4912
            if (r9 == r11) goto L1a3
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r7 = Yue.C1517.EnumC1519.f4911
            if (r9 != r7) goto L272
        L1a3:
            if (r13 != r8) goto L1e9
            if (r9 != r11) goto L1b1
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r11
            r4.m8532(r5, r6, r7, r8, r9)
        L1b1:
            int r7 = r2.m7544()
            float r3 = r2.f4869
            int r4 = r2.m7510()
            r5 = -1
            if (r4 != r5) goto L1c2
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L1c2:
            float r4 = (float) r7
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r8 = Yue.C1517.EnumC1519.f4911
            r4 = r16
            r5 = r2
            r6 = r8
            r4.m8532(r5, r6, r7, r8, r9)
            Yue.ۥ۠ۤۦۧ r3 = r2.f4823
            Yue.ۥ۠۟ۡۡ r3 = r3.f24532
            int r4 = r2.m7544()
            r3.mo8539(r4)
            Yue.ۥۣۢۦۧ r3 = r2.f4824
            Yue.ۥ۠۟ۡۡ r3 = r3.f24532
            int r4 = r2.m7512()
            r3.mo8539(r4)
            r2.f4819 = r10
            goto L8
        L1e9:
            if (r13 != r10) goto L202
            r7 = 0
            r3 = 0
            r4 = r16
            r5 = r2
            r6 = r9
            r8 = r11
            r9 = r3
            r4.m8532(r5, r6, r7, r8, r9)
            Yue.ۥۣۢۦۧ r3 = r2.f4824
            Yue.ۥ۠۟ۡۡ r3 = r3.f24532
            int r2 = r2.m7512()
            r3.f5704 = r2
            goto L8
        L202:
            r7 = 2
            if (r13 != r7) goto L23f
            Yue.ۥ۟ۧ۟ۢ$ۥ۟[] r7 = r0.f4865
            r7 = r7[r10]
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r8 = Yue.C1517.EnumC1519.f4911
            if (r7 == r8) goto L20f
            if (r7 != r4) goto L272
        L20f:
            float r3 = r2.f4842
            int r7 = r2.m7544()
            int r4 = r17.m7512()
            float r4 = (float) r4
            float r3 = r3 * r4
            float r3 = r3 + r14
            int r3 = (int) r3
            r4 = r16
            r5 = r2
            r6 = r9
            r9 = r3
            r4.m8532(r5, r6, r7, r8, r9)
            Yue.ۥ۠ۤۦۧ r3 = r2.f4823
            Yue.ۥ۠۟ۡۡ r3 = r3.f24532
            int r4 = r2.m7544()
            r3.mo8539(r4)
            Yue.ۥۣۢۦۧ r3 = r2.f4824
            Yue.ۥ۠۟ۡۡ r3 = r3.f24532
            int r4 = r2.m7512()
            r3.mo8539(r4)
            r2.f4819 = r10
            goto L8
        L23f:
            Yue.ۥ۟ۧ۟۠[] r4 = r2.f4862
            r7 = 2
            r15 = r4[r7]
            Yue.ۥ۟ۧ۟۠ r7 = r15.f4737
            if (r7 == 0) goto L24e
            r4 = r4[r8]
            Yue.ۥ۟ۧ۟۠ r4 = r4.f4737
            if (r4 != 0) goto L272
        L24e:
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r11
            r8 = r12
            r4.m8532(r5, r6, r7, r8, r9)
            Yue.ۥ۠ۤۦۧ r3 = r2.f4823
            Yue.ۥ۠۟ۡۡ r3 = r3.f24532
            int r4 = r2.m7544()
            r3.mo8539(r4)
            Yue.ۥۣۢۦۧ r3 = r2.f4824
            Yue.ۥ۠۟ۡۡ r3 = r3.f24532
            int r4 = r2.m7512()
            r3.mo8539(r4)
            r2.f4819 = r10
            goto L8
        L272:
            if (r9 != r6) goto L8
            if (r12 != r6) goto L8
            if (r5 == r10) goto L2c5
            if (r13 != r10) goto L27b
            goto L2c5
        L27b:
            r4 = 2
            if (r13 != r4) goto L8
            if (r5 != r4) goto L8
            Yue.ۥ۟ۧ۟ۢ$ۥ۟[] r4 = r0.f4865
            r3 = r4[r3]
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r8 = Yue.C1517.EnumC1519.f4911
            if (r3 == r8) goto L28a
            if (r3 != r8) goto L8
        L28a:
            r3 = r4[r10]
            if (r3 == r8) goto L290
            if (r3 != r8) goto L8
        L290:
            float r3 = r2.f4839
            float r4 = r2.f4842
            int r5 = r17.m7544()
            float r5 = (float) r5
            float r3 = r3 * r5
            float r3 = r3 + r14
            int r7 = (int) r3
            int r3 = r17.m7512()
            float r3 = (float) r3
            float r4 = r4 * r3
            float r4 = r4 + r14
            int r9 = (int) r4
            r4 = r16
            r5 = r2
            r6 = r8
            r4.m8532(r5, r6, r7, r8, r9)
            Yue.ۥ۠ۤۦۧ r3 = r2.f4823
            Yue.ۥ۠۟ۡۡ r3 = r3.f24532
            int r4 = r2.m7544()
            r3.mo8539(r4)
            Yue.ۥۣۢۦۧ r3 = r2.f4824
            Yue.ۥ۠۟ۡۡ r3 = r3.f24532
            int r4 = r2.m7512()
            r3.mo8539(r4)
            r2.f4819 = r10
            goto L8
        L2c5:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r8 = Yue.C1517.EnumC1519.f4912
            r7 = 0
            r9 = 0
            r4 = r16
            r5 = r2
            r6 = r8
            r4.m8532(r5, r6, r7, r8, r9)
            Yue.ۥ۠ۤۦۧ r3 = r2.f4823
            Yue.ۥ۠۟ۡۡ r3 = r3.f24532
            int r4 = r2.m7544()
            r3.f5704 = r4
            Yue.ۥۣۢۦۧ r3 = r2.f4824
            Yue.ۥ۠۟ۡۡ r3 = r3.f24532
            int r2 = r2.m7512()
            r3.f5704 = r2
            goto L8
        L2e6:
            int r3 = r2.m7544()
            if (r9 != r4) goto L2ff
            int r3 = r17.m7544()
            Yue.ۥ۟ۧ۟۠ r5 = r2.f4854
            int r5 = r5.f4738
            int r3 = r3 - r5
            Yue.ۥ۟ۧ۟۠ r5 = r2.f4856
            int r5 = r5.f4738
            int r3 = r3 - r5
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r5 = Yue.C1517.EnumC1519.f4911
            r7 = r3
            r6 = r5
            goto L301
        L2ff:
            r7 = r3
            r6 = r9
        L301:
            int r3 = r2.m7512()
            if (r12 != r4) goto L31a
            int r3 = r17.m7512()
            Yue.ۥ۟ۧ۟۠ r4 = r2.f4855
            int r4 = r4.f4738
            int r3 = r3 - r4
            Yue.ۥ۟ۧ۟۠ r4 = r2.f4857
            int r4 = r4.f4738
            int r3 = r3 - r4
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r4 = Yue.C1517.EnumC1519.f4911
            r9 = r3
            r8 = r4
            goto L31c
        L31a:
            r9 = r3
            r8 = r12
        L31c:
            r4 = r16
            r5 = r2
            r4.m8532(r5, r6, r7, r8, r9)
            Yue.ۥ۠ۤۦۧ r3 = r2.f4823
            Yue.ۥ۠۟ۡۡ r3 = r3.f24532
            int r4 = r2.m7544()
            r3.mo8539(r4)
            Yue.ۥۣۢۦۧ r3 = r2.f4824
            Yue.ۥ۠۟ۡۡ r3 = r3.f24532
            int r4 = r2.m7512()
            r3.mo8539(r4)
            r2.f4819 = r10
            goto L8
        L33c:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m8517() {
            r4 = this;
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r0 = r4.f5554
            r4.m8518(r0)
            java.util.ArrayList<Yue.ۥۡۧ۠ۨ> r0 = r4.f5558
            r0.clear()
            r0 = 0
            Yue.C5443.f20189 = r0
            Yue.ۥۣ۟ۧ۟ r1 = r4.f5550
            Yue.ۥ۠ۤۦۧ r1 = r1.f4823
            java.util.ArrayList<Yue.ۥۡۧ۠ۨ> r2 = r4.f5558
            r4.m8525(r1, r0, r2)
            Yue.ۥۣ۟ۧ۟ r1 = r4.f5550
            Yue.ۥۣۢۦۧ r1 = r1.f4824
            r2 = 1
            java.util.ArrayList<Yue.ۥۡۧ۠ۨ> r3 = r4.f5558
            r4.m8525(r1, r2, r3)
            r4.f5551 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m8518(java.util.ArrayList<Yue.AbstractC7012> r6) {
            r5 = this;
            r6.clear()
            Yue.ۥۣ۟ۧ۟ r0 = r5.f5553
            Yue.ۥ۠ۤۦۧ r0 = r0.f4823
            r0.mo5456()
            Yue.ۥۣ۟ۧ۟ r0 = r5.f5553
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            r0.mo5456()
            Yue.ۥۣ۟ۧ۟ r0 = r5.f5553
            Yue.ۥ۠ۤۦۧ r0 = r0.f4823
            r6.add(r0)
            Yue.ۥۣ۟ۧ۟ r0 = r5.f5553
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            r6.add(r0)
            Yue.ۥۣ۟ۧ۟ r0 = r5.f5553
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r0 = r0.f24511
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L96
            java.lang.Object r2 = r0.next()
            Yue.ۥ۟ۧ۟ۢ r2 = (Yue.C1517) r2
            boolean r3 = r2 instanceof Yue.C2948
            if (r3 == 0) goto L41
            Yue.ۥ۠ۤ۟ۨ r3 = new Yue.ۥ۠ۤ۟ۨ
            r3.<init>(r2)
            r6.add(r3)
            goto L28
        L41:
            boolean r3 = r2.m7553()
            if (r3 == 0) goto L60
            Yue.ۥ۟ۤ۠۠ r3 = r2.f4821
            if (r3 != 0) goto L53
            Yue.ۥ۟ۤ۠۠ r3 = new Yue.ۥ۟ۤ۠۠
            r4 = 0
            r3.<init>(r2, r4)
            r2.f4821 = r3
        L53:
            if (r1 != 0) goto L5a
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
        L5a:
            Yue.ۥ۟ۤ۠۠ r3 = r2.f4821
            r1.add(r3)
            goto L65
        L60:
            Yue.ۥ۠ۤۦۧ r3 = r2.f4823
            r6.add(r3)
        L65:
            boolean r3 = r2.m7555()
            if (r3 == 0) goto L84
            Yue.ۥ۟ۤ۠۠ r3 = r2.f4822
            if (r3 != 0) goto L77
            Yue.ۥ۟ۤ۠۠ r3 = new Yue.ۥ۟ۤ۠۠
            r4 = 1
            r3.<init>(r2, r4)
            r2.f4822 = r3
        L77:
            if (r1 != 0) goto L7e
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
        L7e:
            Yue.ۥ۟ۤ۠۠ r3 = r2.f4822
            r1.add(r3)
            goto L89
        L84:
            Yue.ۥۣۢۦۧ r3 = r2.f4824
            r6.add(r3)
        L89:
            boolean r3 = r2 instanceof Yue.C3025
            if (r3 == 0) goto L28
            Yue.ۥ۠ۤۤ۠ r3 = new Yue.ۥ۠ۤۤ۠
            r3.<init>(r2)
            r6.add(r3)
            goto L28
        L96:
            if (r1 == 0) goto L9b
            r6.addAll(r1)
        L9b:
            java.util.Iterator r0 = r6.iterator()
        L9f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Laf
            java.lang.Object r1 = r0.next()
            Yue.ۥۢۥۣ۠ r1 = (Yue.AbstractC7012) r1
            r1.mo5456()
            goto L9f
        Laf:
            java.util.Iterator r6 = r6.iterator()
        Lb3:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lca
            java.lang.Object r0 = r6.next()
            Yue.ۥۢۥۣ۠ r0 = (Yue.AbstractC7012) r0
            Yue.ۥ۟ۧ۟ۢ r1 = r0.f24529
            Yue.ۥۣ۟ۧ۟ r2 = r5.f5553
            if (r1 != r2) goto Lc6
            goto Lb3
        Lc6:
            r0.mo5454()
            goto Lb3
        Lca:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m8519(Yue.C1520 r7, int r8) {
            r6 = this;
            java.util.ArrayList<Yue.ۥۡۧ۠ۨ> r0 = r6.f5558
            int r0 = r0.size()
            r1 = 0
            r3 = 0
        L9:
            if (r3 >= r0) goto L1e
            java.util.ArrayList<Yue.ۥۡۧ۠ۨ> r4 = r6.f5558
            java.lang.Object r4 = r4.get(r3)
            Yue.ۥۡۧ۠ۨ r4 = (Yue.C5443) r4
            long r4 = r4.m20541(r7, r8)
            long r1 = java.lang.Math.max(r1, r4)
            int r3 = r3 + 1
            goto L9
        L1e:
            int r7 = (int) r1
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m8520(Yue.C1517.EnumC1519 r7, Yue.C1517.EnumC1519 r8) {
            r6 = this;
            boolean r0 = r6.f5551
            if (r0 == 0) goto L4e
            r6.m8517()
            Yue.ۥۣ۟ۧ۟ r0 = r6.f5550
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r0 = r0.f24511
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L11:
            boolean r3 = r0.hasNext()
            r4 = 1
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r0.next()
            Yue.ۥ۟ۧ۟ۢ r3 = (Yue.C1517) r3
            boolean[] r5 = r3.f4825
            r5[r1] = r4
            r5[r4] = r4
            boolean r3 = r3 instanceof Yue.C0721
            if (r3 == 0) goto L11
            r2 = r4
            goto L11
        L2a:
            if (r2 != 0) goto L4e
            java.util.ArrayList<Yue.ۥۡۧ۠ۨ> r0 = r6.f5558
            java.util.Iterator r0 = r0.iterator()
        L32:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r0.next()
            Yue.ۥۡۧ۠ۨ r2 = (Yue.C5443) r2
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r3 = Yue.C1517.EnumC1519.f4912
            if (r7 != r3) goto L44
            r5 = r4
            goto L45
        L44:
            r5 = r1
        L45:
            if (r8 != r3) goto L49
            r3 = r4
            goto L4a
        L49:
            r3 = r1
        L4a:
            r2.m20543(r5, r3)
            goto L32
        L4e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m8521(boolean r10) {
            r9 = this;
            boolean r0 = r9.f5551
            r1 = 0
            if (r0 != 0) goto L9
            boolean r0 = r9.f5552
            if (r0 == 0) goto L44
        L9:
            Yue.ۥۣ۟ۧ۟ r0 = r9.f5550
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r0 = r0.f24511
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            Yue.ۥ۟ۧ۟ۢ r2 = (Yue.C1517) r2
            r2.m7499()
            r2.f4819 = r1
            Yue.ۥ۠ۤۦۧ r3 = r2.f4823
            r3.mo5458()
            Yue.ۥۣۢۦۧ r2 = r2.f4824
            r2.mo5458()
            goto L11
        L2d:
            Yue.ۥۣ۟ۧ۟ r0 = r9.f5550
            r0.m7499()
            Yue.ۥۣ۟ۧ۟ r0 = r9.f5550
            r0.f4819 = r1
            Yue.ۥ۠ۤۦۧ r0 = r0.f4823
            r0.mo5458()
            Yue.ۥۣ۟ۧ۟ r0 = r9.f5550
            Yue.ۥۣۢۦۧ r0 = r0.f4824
            r0.mo5458()
            r9.f5552 = r1
        L44:
            Yue.ۥۣ۟ۧ۟ r0 = r9.f5553
            boolean r0 = r9.m8516(r0)
            if (r0 == 0) goto L4d
            return r1
        L4d:
            Yue.ۥۣ۟ۧ۟ r0 = r9.f5550
            r0.m7620(r1)
            Yue.ۥۣ۟ۧ۟ r0 = r9.f5550
            r0.m7621(r1)
            Yue.ۥۣ۟ۧ۟ r0 = r9.f5550
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r0 = r0.m7508(r1)
            Yue.ۥۣ۟ۧ۟ r2 = r9.f5550
            r3 = 1
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r2 = r2.m7508(r3)
            boolean r4 = r9.f5551
            if (r4 == 0) goto L6b
            r9.m8517()
        L6b:
            Yue.ۥۣ۟ۧ۟ r4 = r9.f5550
            int r4 = r4.m7545()
            Yue.ۥۣ۟ۧ۟ r5 = r9.f5550
            int r5 = r5.m7546()
            Yue.ۥۣ۟ۧ۟ r6 = r9.f5550
            Yue.ۥ۠ۤۦۧ r6 = r6.f4823
            Yue.ۥ۟ۨۨۥ r6 = r6.f24535
            r6.mo8539(r4)
            Yue.ۥۣ۟ۧ۟ r6 = r9.f5550
            Yue.ۥۣۢۦۧ r6 = r6.f4824
            Yue.ۥ۟ۨۨۥ r6 = r6.f24535
            r6.mo8539(r5)
            r9.m8533()
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r6 = Yue.C1517.EnumC1519.f4912
            if (r0 == r6) goto L92
            if (r2 != r6) goto Lf3
        L92:
            if (r10 == 0) goto Lad
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r6 = r9.f5554
            java.util.Iterator r6 = r6.iterator()
        L9a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lad
            java.lang.Object r7 = r6.next()
            Yue.ۥۢۥۣ۠ r7 = (Yue.AbstractC7012) r7
            boolean r7 = r7.mo5459()
            if (r7 != 0) goto L9a
            r10 = r1
        Lad:
            if (r10 == 0) goto Ld0
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r6 = Yue.C1517.EnumC1519.f4912
            if (r0 != r6) goto Ld0
            Yue.ۥۣ۟ۧ۟ r6 = r9.f5550
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r7 = Yue.C1517.EnumC1519.f4911
            r6.m7593(r7)
            Yue.ۥۣ۟ۧ۟ r6 = r9.f5550
            int r7 = r9.m8519(r6, r1)
            r6.m7618(r7)
            Yue.ۥۣ۟ۧ۟ r6 = r9.f5550
            Yue.ۥ۠ۤۦۧ r7 = r6.f4823
            Yue.ۥ۠۟ۡۡ r7 = r7.f24532
            int r6 = r6.m7544()
            r7.mo8539(r6)
        Ld0:
            if (r10 == 0) goto Lf3
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r10 = Yue.C1517.EnumC1519.f4912
            if (r2 != r10) goto Lf3
            Yue.ۥۣ۟ۧ۟ r10 = r9.f5550
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r6 = Yue.C1517.EnumC1519.f4911
            r10.m7614(r6)
            Yue.ۥۣ۟ۧ۟ r10 = r9.f5550
            int r6 = r9.m8519(r10, r3)
            r10.m7588(r6)
            Yue.ۥۣ۟ۧ۟ r10 = r9.f5550
            Yue.ۥۣۢۦۧ r6 = r10.f4824
            Yue.ۥ۠۟ۡۡ r6 = r6.f24532
            int r10 = r10.m7512()
            r6.mo8539(r10)
        Lf3:
            Yue.ۥۣ۟ۧ۟ r10 = r9.f5550
            Yue.ۥ۟ۧ۟ۢ$ۥ۟[] r6 = r10.f4865
            r6 = r6[r1]
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r7 = Yue.C1517.EnumC1519.f4911
            if (r6 == r7) goto L104
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r8 = Yue.C1517.EnumC1519.f4914
            if (r6 != r8) goto L102
            goto L104
        L102:
            r10 = r1
            goto L147
        L104:
            int r10 = r10.m7544()
            int r10 = r10 + r4
            Yue.ۥۣ۟ۧ۟ r6 = r9.f5550
            Yue.ۥ۠ۤۦۧ r6 = r6.f4823
            Yue.ۥ۟ۨۨۥ r6 = r6.f24536
            r6.mo8539(r10)
            Yue.ۥۣ۟ۧ۟ r6 = r9.f5550
            Yue.ۥ۠ۤۦۧ r6 = r6.f4823
            Yue.ۥ۠۟ۡۡ r6 = r6.f24532
            int r10 = r10 - r4
            r6.mo8539(r10)
            r9.m8533()
            Yue.ۥۣ۟ۧ۟ r10 = r9.f5550
            Yue.ۥ۟ۧ۟ۢ$ۥ۟[] r4 = r10.f4865
            r4 = r4[r3]
            if (r4 == r7) goto L12b
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r6 = Yue.C1517.EnumC1519.f4914
            if (r4 != r6) goto L143
        L12b:
            int r10 = r10.m7512()
            int r10 = r10 + r5
            Yue.ۥۣ۟ۧ۟ r4 = r9.f5550
            Yue.ۥۣۢۦۧ r4 = r4.f4824
            Yue.ۥ۟ۨۨۥ r4 = r4.f24536
            r4.mo8539(r10)
            Yue.ۥۣ۟ۧ۟ r4 = r9.f5550
            Yue.ۥۣۢۦۧ r4 = r4.f4824
            Yue.ۥ۠۟ۡۡ r4 = r4.f24532
            int r10 = r10 - r5
            r4.mo8539(r10)
        L143:
            r9.m8533()
            r10 = r3
        L147:
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r4 = r9.f5554
            java.util.Iterator r4 = r4.iterator()
        L14d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L168
            java.lang.Object r5 = r4.next()
            Yue.ۥۢۥۣ۠ r5 = (Yue.AbstractC7012) r5
            Yue.ۥ۟ۧ۟ۢ r6 = r5.f24529
            Yue.ۥۣ۟ۧ۟ r7 = r9.f5550
            if (r6 != r7) goto L164
            boolean r6 = r5.f24534
            if (r6 != 0) goto L164
            goto L14d
        L164:
            r5.mo5455()
            goto L14d
        L168:
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r4 = r9.f5554
            java.util.Iterator r4 = r4.iterator()
        L16e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1a4
            java.lang.Object r5 = r4.next()
            Yue.ۥۢۥۣ۠ r5 = (Yue.AbstractC7012) r5
            if (r10 != 0) goto L183
            Yue.ۥ۟ۧ۟ۢ r6 = r5.f24529
            Yue.ۥۣ۟ۧ۟ r7 = r9.f5550
            if (r6 != r7) goto L183
            goto L16e
        L183:
            Yue.ۥ۟ۨۨۥ r6 = r5.f24535
            boolean r6 = r6.f5568
            if (r6 != 0) goto L18a
            goto L1a5
        L18a:
            Yue.ۥ۟ۨۨۥ r6 = r5.f24536
            boolean r6 = r6.f5568
            if (r6 != 0) goto L195
            boolean r6 = r5 instanceof Yue.C2950
            if (r6 != 0) goto L195
            goto L1a5
        L195:
            Yue.ۥ۠۟ۡۡ r6 = r5.f24532
            boolean r6 = r6.f5568
            if (r6 != 0) goto L16e
            boolean r6 = r5 instanceof Yue.C0968
            if (r6 != 0) goto L16e
            boolean r5 = r5 instanceof Yue.C2950
            if (r5 != 0) goto L16e
            goto L1a5
        L1a4:
            r1 = r3
        L1a5:
            Yue.ۥۣ۟ۧ۟ r10 = r9.f5550
            r10.m7593(r0)
            Yue.ۥۣ۟ۧ۟ r10 = r9.f5550
            r10.m7614(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m8522(boolean r5) {
            r4 = this;
            boolean r5 = r4.f5551
            r0 = 0
            if (r5 == 0) goto L59
            Yue.ۥۣ۟ۧ۟ r5 = r4.f5550
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r5 = r5.f24511
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r5.next()
            Yue.ۥ۟ۧ۟ۢ r1 = (Yue.C1517) r1
            r1.m7499()
            r1.f4819 = r0
            Yue.ۥ۠ۤۦۧ r2 = r1.f4823
            Yue.ۥ۠۟ۡۡ r3 = r2.f24532
            r3.f5568 = r0
            r2.f24534 = r0
            r2.mo5458()
            Yue.ۥۣۢۦۧ r1 = r1.f4824
            Yue.ۥ۠۟ۡۡ r2 = r1.f24532
            r2.f5568 = r0
            r1.f24534 = r0
            r1.mo5458()
            goto Ld
        L35:
            Yue.ۥۣ۟ۧ۟ r5 = r4.f5550
            r5.m7499()
            Yue.ۥۣ۟ۧ۟ r5 = r4.f5550
            r5.f4819 = r0
            Yue.ۥ۠ۤۦۧ r5 = r5.f4823
            Yue.ۥ۠۟ۡۡ r1 = r5.f24532
            r1.f5568 = r0
            r5.f24534 = r0
            r5.mo5458()
            Yue.ۥۣ۟ۧ۟ r5 = r4.f5550
            Yue.ۥۣۢۦۧ r5 = r5.f4824
            Yue.ۥ۠۟ۡۡ r1 = r5.f24532
            r1.f5568 = r0
            r5.f24534 = r0
            r5.mo5458()
            r4.m8517()
        L59:
            Yue.ۥۣ۟ۧ۟ r5 = r4.f5553
            boolean r5 = r4.m8516(r5)
            if (r5 == 0) goto L62
            return r0
        L62:
            Yue.ۥۣ۟ۧ۟ r5 = r4.f5550
            r5.m7620(r0)
            Yue.ۥۣ۟ۧ۟ r5 = r4.f5550
            r5.m7621(r0)
            Yue.ۥۣ۟ۧ۟ r5 = r4.f5550
            Yue.ۥ۠ۤۦۧ r5 = r5.f4823
            Yue.ۥ۟ۨۨۥ r5 = r5.f24535
            r5.mo8539(r0)
            Yue.ۥۣ۟ۧ۟ r5 = r4.f5550
            Yue.ۥۣۢۦۧ r5 = r5.f4824
            Yue.ۥ۟ۨۨۥ r5 = r5.f24535
            r5.mo8539(r0)
            r5 = 1
            return r5
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m8523(boolean r10, int r11) {
            r9 = this;
            Yue.ۥۣ۟ۧ۟ r0 = r9.f5550
            r1 = 0
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r0 = r0.m7508(r1)
            Yue.ۥۣ۟ۧ۟ r2 = r9.f5550
            r3 = 1
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r2 = r2.m7508(r3)
            Yue.ۥۣ۟ۧ۟ r4 = r9.f5550
            int r4 = r4.m7545()
            Yue.ۥۣ۟ۧ۟ r5 = r9.f5550
            int r5 = r5.m7546()
            if (r10 == 0) goto L88
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r6 = Yue.C1517.EnumC1519.f4912
            if (r0 == r6) goto L22
            if (r2 != r6) goto L88
        L22:
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r6 = r9.f5554
            java.util.Iterator r6 = r6.iterator()
        L28:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L3f
            java.lang.Object r7 = r6.next()
            Yue.ۥۢۥۣ۠ r7 = (Yue.AbstractC7012) r7
            int r8 = r7.f24533
            if (r8 != r11) goto L28
            boolean r7 = r7.mo5459()
            if (r7 != 0) goto L28
            r10 = r1
        L3f:
            if (r11 != 0) goto L65
            if (r10 == 0) goto L88
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r10 = Yue.C1517.EnumC1519.f4912
            if (r0 != r10) goto L88
            Yue.ۥۣ۟ۧ۟ r10 = r9.f5550
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r6 = Yue.C1517.EnumC1519.f4911
            r10.m7593(r6)
            Yue.ۥۣ۟ۧ۟ r10 = r9.f5550
            int r6 = r9.m8519(r10, r1)
            r10.m7618(r6)
            Yue.ۥۣ۟ۧ۟ r10 = r9.f5550
            Yue.ۥ۠ۤۦۧ r6 = r10.f4823
            Yue.ۥ۠۟ۡۡ r6 = r6.f24532
            int r10 = r10.m7544()
            r6.mo8539(r10)
            goto L88
        L65:
            if (r10 == 0) goto L88
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r10 = Yue.C1517.EnumC1519.f4912
            if (r2 != r10) goto L88
            Yue.ۥۣ۟ۧ۟ r10 = r9.f5550
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r6 = Yue.C1517.EnumC1519.f4911
            r10.m7614(r6)
            Yue.ۥۣ۟ۧ۟ r10 = r9.f5550
            int r6 = r9.m8519(r10, r3)
            r10.m7588(r6)
            Yue.ۥۣ۟ۧ۟ r10 = r9.f5550
            Yue.ۥۣۢۦۧ r6 = r10.f4824
            Yue.ۥ۠۟ۡۡ r6 = r6.f24532
            int r10 = r10.m7512()
            r6.mo8539(r10)
        L88:
            if (r11 != 0) goto Lb2
            Yue.ۥۣ۟ۧ۟ r10 = r9.f5550
            Yue.ۥ۟ۧ۟ۢ$ۥ۟[] r5 = r10.f4865
            r5 = r5[r1]
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r6 = Yue.C1517.EnumC1519.f4911
            if (r5 == r6) goto L98
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r6 = Yue.C1517.EnumC1519.f4914
            if (r5 != r6) goto Lc1
        L98:
            int r10 = r10.m7544()
            int r10 = r10 + r4
            Yue.ۥۣ۟ۧ۟ r5 = r9.f5550
            Yue.ۥ۠ۤۦۧ r5 = r5.f4823
            Yue.ۥ۟ۨۨۥ r5 = r5.f24536
            r5.mo8539(r10)
            Yue.ۥۣ۟ۧ۟ r5 = r9.f5550
            Yue.ۥ۠ۤۦۧ r5 = r5.f4823
            Yue.ۥ۠۟ۡۡ r5 = r5.f24532
            int r10 = r10 - r4
            r5.mo8539(r10)
        Lb0:
            r10 = r3
            goto Ldc
        Lb2:
            Yue.ۥۣ۟ۧ۟ r10 = r9.f5550
            Yue.ۥ۟ۧ۟ۢ$ۥ۟[] r4 = r10.f4865
            r4 = r4[r3]
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r6 = Yue.C1517.EnumC1519.f4911
            if (r4 == r6) goto Lc3
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r6 = Yue.C1517.EnumC1519.f4914
            if (r4 != r6) goto Lc1
            goto Lc3
        Lc1:
            r10 = r1
            goto Ldc
        Lc3:
            int r10 = r10.m7512()
            int r10 = r10 + r5
            Yue.ۥۣ۟ۧ۟ r4 = r9.f5550
            Yue.ۥۣۢۦۧ r4 = r4.f4824
            Yue.ۥ۟ۨۨۥ r4 = r4.f24536
            r4.mo8539(r10)
            Yue.ۥۣ۟ۧ۟ r4 = r9.f5550
            Yue.ۥۣۢۦۧ r4 = r4.f4824
            Yue.ۥ۠۟ۡۡ r4 = r4.f24532
            int r10 = r10 - r5
            r4.mo8539(r10)
            goto Lb0
        Ldc:
            r9.m8533()
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r4 = r9.f5554
            java.util.Iterator r4 = r4.iterator()
        Le5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L105
            java.lang.Object r5 = r4.next()
            Yue.ۥۢۥۣ۠ r5 = (Yue.AbstractC7012) r5
            int r6 = r5.f24533
            if (r6 == r11) goto Lf6
            goto Le5
        Lf6:
            Yue.ۥ۟ۧ۟ۢ r6 = r5.f24529
            Yue.ۥۣ۟ۧ۟ r7 = r9.f5550
            if (r6 != r7) goto L101
            boolean r6 = r5.f24534
            if (r6 != 0) goto L101
            goto Le5
        L101:
            r5.mo5455()
            goto Le5
        L105:
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r4 = r9.f5554
            java.util.Iterator r4 = r4.iterator()
        L10b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L13e
            java.lang.Object r5 = r4.next()
            Yue.ۥۢۥۣ۠ r5 = (Yue.AbstractC7012) r5
            int r6 = r5.f24533
            if (r6 == r11) goto L11c
            goto L10b
        L11c:
            if (r10 != 0) goto L125
            Yue.ۥ۟ۧ۟ۢ r6 = r5.f24529
            Yue.ۥۣ۟ۧ۟ r7 = r9.f5550
            if (r6 != r7) goto L125
            goto L10b
        L125:
            Yue.ۥ۟ۨۨۥ r6 = r5.f24535
            boolean r6 = r6.f5568
            if (r6 != 0) goto L12c
            goto L13f
        L12c:
            Yue.ۥ۟ۨۨۥ r6 = r5.f24536
            boolean r6 = r6.f5568
            if (r6 != 0) goto L133
            goto L13f
        L133:
            boolean r6 = r5 instanceof Yue.C0968
            if (r6 != 0) goto L10b
            Yue.ۥ۠۟ۡۡ r5 = r5.f24532
            boolean r5 = r5.f5568
            if (r5 != 0) goto L10b
            goto L13f
        L13e:
            r1 = r3
        L13f:
            Yue.ۥۣ۟ۧ۟ r10 = r9.f5550
            r10.m7593(r0)
            Yue.ۥۣ۟ۧ۟ r10 = r9.f5550
            r10.m7614(r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m8524() {
            r4 = this;
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r0 = r4.f5554
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "digraph {\n"
        L8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r0.next()
            Yue.ۥۢۥۣ۠ r2 = (Yue.AbstractC7012) r2
            java.lang.String r1 = r4.m8527(r2, r1)
            goto L8
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "\n}\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "content:<<\n"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "\n>>"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.println(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m8525(Yue.AbstractC7012 r11, int r12, java.util.ArrayList<Yue.C5443> r13) {
            r10 = this;
            Yue.ۥ۟ۨۨۥ r0 = r11.f24535
            java.util.List<Yue.ۥۣ۟ۨۨ> r0 = r0.f5569
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r0.next()
            Yue.ۥۣ۟ۨۨ r1 = (Yue.InterfaceC1812) r1
            boolean r2 = r1 instanceof Yue.C1814
            if (r2 == 0) goto L26
            r4 = r1
            Yue.ۥ۟ۨۨۥ r4 = (Yue.C1814) r4
            Yue.ۥ۟ۨۨۥ r7 = r11.f24536
            r9 = 0
            r6 = 0
            r3 = r10
            r5 = r12
            r8 = r13
            r3.m8515(r4, r5, r6, r7, r8, r9)
            goto L8
        L26:
            boolean r2 = r1 instanceof Yue.AbstractC7012
            if (r2 == 0) goto L8
            Yue.ۥۢۥۣ۠ r1 = (Yue.AbstractC7012) r1
            Yue.ۥ۟ۨۨۥ r3 = r1.f24535
            Yue.ۥ۟ۨۨۥ r6 = r11.f24536
            r8 = 0
            r5 = 0
            r2 = r10
            r4 = r12
            r7 = r13
            r2.m8515(r3, r4, r5, r6, r7, r8)
            goto L8
        L39:
            Yue.ۥ۟ۨۨۥ r0 = r11.f24536
            java.util.List<Yue.ۥۣ۟ۨۨ> r0 = r0.f5569
            java.util.Iterator r0 = r0.iterator()
        L41:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L72
            java.lang.Object r1 = r0.next()
            Yue.ۥۣ۟ۨۨ r1 = (Yue.InterfaceC1812) r1
            boolean r2 = r1 instanceof Yue.C1814
            if (r2 == 0) goto L5f
            r4 = r1
            Yue.ۥ۟ۨۨۥ r4 = (Yue.C1814) r4
            Yue.ۥ۟ۨۨۥ r7 = r11.f24535
            r9 = 0
            r6 = 1
            r3 = r10
            r5 = r12
            r8 = r13
            r3.m8515(r4, r5, r6, r7, r8, r9)
            goto L41
        L5f:
            boolean r2 = r1 instanceof Yue.AbstractC7012
            if (r2 == 0) goto L41
            Yue.ۥۢۥۣ۠ r1 = (Yue.AbstractC7012) r1
            Yue.ۥ۟ۨۨۥ r3 = r1.f24536
            Yue.ۥ۟ۨۨۥ r6 = r11.f24535
            r8 = 0
            r5 = 1
            r2 = r10
            r4 = r12
            r7 = r13
            r2.m8515(r3, r4, r5, r6, r7, r8)
            goto L41
        L72:
            r0 = 1
            if (r12 != r0) goto L9c
            Yue.ۥۣۢۦۧ r11 = (Yue.C6691) r11
            Yue.ۥ۟ۨۨۥ r11 = r11.f23407
            java.util.List<Yue.ۥۣ۟ۨۨ> r11 = r11.f5569
            java.util.Iterator r11 = r11.iterator()
        L7f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r11.next()
            Yue.ۥۣ۟ۨۨ r0 = (Yue.InterfaceC1812) r0
            boolean r1 = r0 instanceof Yue.C1814
            if (r1 == 0) goto L7f
            r3 = r0
            Yue.ۥ۟ۨۨۥ r3 = (Yue.C1814) r3
            r6 = 0
            r8 = 0
            r5 = 2
            r2 = r10
            r4 = r12
            r7 = r13
            r2.m8515(r3, r4, r5, r6, r7, r8)
            goto L7f
        L9c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final java.lang.String m8526(Yue.C0968 r7, java.lang.String r8) {
            r6 = this;
            int r0 = r7.f24533
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "cluster_"
            r1.append(r2)
            Yue.ۥ۟ۧ۟ۢ r2 = r7.f24529
            java.lang.String r2 = r2.m7507()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            if (r0 != 0) goto L2d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "_h"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L3e
        L2d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "_v"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L3e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "subgraph "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " {\n"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r7 = r7.f2760
            java.util.Iterator r7 = r7.iterator()
            java.lang.String r2 = ""
        L5c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto Lac
            java.lang.Object r3 = r7.next()
            Yue.ۥۢۥۣ۠ r3 = (Yue.AbstractC7012) r3
            Yue.ۥ۟ۧ۟ۢ r4 = r3.f24529
            java.lang.String r4 = r4.m7507()
            if (r0 != 0) goto L82
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "_HORIZONTAL"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            goto L93
        L82:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "_VERTICAL"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
        L93:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = ";\n"
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r2 = r6.m8527(r3, r2)
            goto L5c
        Lac:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r0 = "}\n"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final java.lang.String m8527(Yue.AbstractC7012 r9, java.lang.String r10) {
            r8 = this;
            Yue.ۥ۟ۨۨۥ r0 = r9.f24535
            Yue.ۥ۟ۨۨۥ r1 = r9.f24536
            boolean r2 = r9 instanceof Yue.C3024
            if (r2 != 0) goto L28
            java.util.List<Yue.ۥۣ۟ۨۨ> r2 = r0.f5569
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L28
            java.util.List<Yue.ۥۣ۟ۨۨ> r2 = r1.f5569
            boolean r2 = r2.isEmpty()
            java.util.List<Yue.ۥ۟ۨۨۥ> r3 = r0.f5570
            boolean r3 = r3.isEmpty()
            r2 = r2 & r3
            if (r2 == 0) goto L28
            java.util.List<Yue.ۥ۟ۨۨۥ> r2 = r1.f5570
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L28
            return r10
        L28:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            java.lang.String r10 = r8.m8534(r9)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            boolean r2 = r8.m8531(r0, r1)
            java.lang.String r10 = r8.m8528(r0, r2, r10)
            java.lang.String r10 = r8.m8528(r1, r2, r10)
            boolean r3 = r9 instanceof Yue.C6691
            if (r3 == 0) goto L54
            r4 = r9
            Yue.ۥۣۢۦۧ r4 = (Yue.C6691) r4
            Yue.ۥ۟ۨۨۥ r4 = r4.f23407
            java.lang.String r10 = r8.m8528(r4, r2, r10)
        L54:
            boolean r2 = r9 instanceof Yue.C3078
            r4 = 0
            java.lang.String r5 = " -> "
            java.lang.String r6 = "\n"
            if (r2 != 0) goto L11c
            boolean r2 = r9 instanceof Yue.C0968
            if (r2 == 0) goto L6a
            r7 = r9
            Yue.ۥ۟ۤ۠۠ r7 = (Yue.C0968) r7
            int r7 = r7.f24533
            if (r7 != 0) goto L6a
            goto L11c
        L6a:
            if (r3 != 0) goto L76
            if (r2 == 0) goto L1bf
            r2 = r9
            Yue.ۥ۟ۤ۠۠ r2 = (Yue.C0968) r2
            int r2 = r2.f24533
            r3 = 1
            if (r2 != r3) goto L1bf
        L76:
            Yue.ۥ۟ۧ۟ۢ r2 = r9.f24529
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r2 = r2.m7541()
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r3 = Yue.C1517.EnumC1519.f4911
            if (r2 == r3) goto L9a
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r3 = Yue.C1517.EnumC1519.f4912
            if (r2 != r3) goto L85
            goto L9a
        L85:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r0 = Yue.C1517.EnumC1519.f4913
            if (r2 != r0) goto L1bf
            Yue.ۥ۟ۧ۟ۢ r0 = r9.f24529
            float r0 = r0.m7509()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L1bf
            Yue.ۥ۟ۧ۟ۢ r0 = r9.f24529
            r0.m7507()
            goto L1bf
        L9a:
            java.util.List<Yue.ۥ۟ۨۨۥ> r2 = r0.f5570
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Ldb
            java.util.List<Yue.ۥ۟ۨۨۥ> r2 = r1.f5570
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Ldb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r1 = r1.m8538()
            r2.append(r1)
            r2.append(r5)
            java.lang.String r0 = r0.m8538()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r0)
            java.lang.String r10 = r1.toString()
            goto L1bf
        Ldb:
            java.util.List<Yue.ۥ۟ۨۨۥ> r2 = r0.f5570
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1bf
            java.util.List<Yue.ۥ۟ۨۨۥ> r2 = r1.f5570
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L1bf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r0 = r0.m8538()
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r1.m8538()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r0)
            java.lang.String r10 = r1.toString()
            goto L1bf
        L11c:
            Yue.ۥ۟ۧ۟ۢ r2 = r9.f24529
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r2 = r2.m7516()
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r3 = Yue.C1517.EnumC1519.f4911
            if (r2 == r3) goto L140
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r3 = Yue.C1517.EnumC1519.f4912
            if (r2 != r3) goto L12b
            goto L140
        L12b:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r0 = Yue.C1517.EnumC1519.f4913
            if (r2 != r0) goto L1bf
            Yue.ۥ۟ۧ۟ۢ r0 = r9.f24529
            float r0 = r0.m7509()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L1bf
            Yue.ۥ۟ۧ۟ۢ r0 = r9.f24529
            r0.m7507()
            goto L1bf
        L140:
            java.util.List<Yue.ۥ۟ۨۨۥ> r2 = r0.f5570
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L180
            java.util.List<Yue.ۥ۟ۨۨۥ> r2 = r1.f5570
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L180
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r1 = r1.m8538()
            r2.append(r1)
            r2.append(r5)
            java.lang.String r0 = r0.m8538()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r0)
            java.lang.String r10 = r1.toString()
            goto L1bf
        L180:
            java.util.List<Yue.ۥ۟ۨۨۥ> r2 = r0.f5570
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1bf
            java.util.List<Yue.ۥ۟ۨۨۥ> r2 = r1.f5570
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L1bf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r0 = r0.m8538()
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = r1.m8538()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r0)
            java.lang.String r10 = r1.toString()
        L1bf:
            boolean r0 = r9 instanceof Yue.C0968
            if (r0 == 0) goto L1ca
            Yue.ۥ۟ۤ۠۠ r9 = (Yue.C0968) r9
            java.lang.String r9 = r8.m8526(r9, r10)
            return r9
        L1ca:
            return r10
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final java.lang.String m8528(Yue.C1814 r6, boolean r7, java.lang.String r8) {
            r5 = this;
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r6.f5570
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Le9
            java.lang.Object r1 = r0.next()
            Yue.ۥ۟ۨۨۥ r1 = (Yue.C1814) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "\n"
            r2.append(r3)
            java.lang.String r4 = r6.m8538()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = " -> "
            r4.append(r2)
            java.lang.String r1 = r1.m8538()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            int r2 = r6.f5564
            if (r2 > 0) goto L4b
            if (r7 != 0) goto L4b
            Yue.ۥۢۥۣ۠ r2 = r6.f5562
            boolean r2 = r2 instanceof Yue.C3024
            if (r2 == 0) goto Lc9
        L4b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "["
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            int r2 = r6.f5564
            if (r2 <= 0) goto L8e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "label=\""
            r2.append(r1)
            int r1 = r6.f5564
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r7 == 0) goto L8e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ","
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L8e:
            if (r7 == 0) goto La1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " style=dashed "
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        La1:
            Yue.ۥۢۥۣ۠ r2 = r6.f5562
            boolean r2 = r2 instanceof Yue.C3024
            if (r2 == 0) goto Lb8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " style=bold,color=gray "
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        Lb8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "]"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        Lc9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r1)
            java.lang.String r8 = r2.toString()
            goto L6
        Le9:
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m8529() {
            r1 = this;
            r0 = 1
            r1.f5551 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m8530() {
            r1 = this;
            r0 = 1
            r1.f5552 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final boolean m8531(Yue.C1814 r5, Yue.C1814 r6) {
            r4 = this;
            java.util.List<Yue.ۥ۟ۨۨۥ> r0 = r5.f5570
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L19
            java.lang.Object r3 = r0.next()
            Yue.ۥ۟ۨۨۥ r3 = (Yue.C1814) r3
            if (r3 == r6) goto L8
            int r2 = r2 + 1
            goto L8
        L19:
            java.util.List<Yue.ۥ۟ۨۨۥ> r6 = r6.f5570
            java.util.Iterator r6 = r6.iterator()
            r0 = r1
        L20:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r6.next()
            Yue.ۥ۟ۨۨۥ r3 = (Yue.C1814) r3
            if (r3 == r5) goto L20
            int r0 = r0 + 1
            goto L20
        L31:
            if (r2 <= 0) goto L36
            if (r0 <= 0) goto L36
            r1 = 1
        L36:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m8532(Yue.C1517 r2, Yue.C1517.EnumC1519 r3, int r4, Yue.C1517.EnumC1519 r5, int r6) {
            r1 = this;
            Yue.ۥ۟ۢۦۤ$ۥ r0 = r1.f5557
            r0.f2095 = r3
            r0.f2096 = r5
            r0.f2097 = r4
            r0.f2098 = r6
            Yue.ۥ۟ۢۦۤ$ۥ۟ r3 = r1.f5556
            r3.mo4604(r2, r0)
            Yue.ۥ۟ۢۦۤ$ۥ r3 = r1.f5557
            int r3 = r3.f2099
            r2.m7618(r3)
            Yue.ۥ۟ۢۦۤ$ۥ r3 = r1.f5557
            int r3 = r3.f2100
            r2.m7588(r3)
            Yue.ۥ۟ۢۦۤ$ۥ r3 = r1.f5557
            boolean r3 = r3.f2102
            r2.m7587(r3)
            Yue.ۥ۟ۢۦۤ$ۥ r3 = r1.f5557
            int r3 = r3.f2101
            r2.m7570(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m8533() {
            r12 = this;
            Yue.ۥۣ۟ۧ۟ r0 = r12.f5550
            java.util.ArrayList<Yue.ۥ۟ۧ۟ۢ> r0 = r0.f24511
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc9
            java.lang.Object r1 = r0.next()
            Yue.ۥ۟ۧ۟ۢ r1 = (Yue.C1517) r1
            boolean r2 = r1.f4819
            if (r2 == 0) goto L19
            goto L8
        L19:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟[] r2 = r1.f4865
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f4834
            int r4 = r1.f4835
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r6 = Yue.C1517.EnumC1519.f4912
            if (r8 == r6) goto L32
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r5 = Yue.C1517.EnumC1519.f4913
            if (r8 != r5) goto L30
            if (r2 != r9) goto L30
            goto L32
        L30:
            r2 = r3
            goto L33
        L32:
            r2 = r9
        L33:
            if (r10 == r6) goto L3b
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r5 = Yue.C1517.EnumC1519.f4913
            if (r10 != r5) goto L3c
            if (r4 != r9) goto L3c
        L3b:
            r3 = r9
        L3c:
            Yue.ۥ۠ۤۦۧ r4 = r1.f4823
            Yue.ۥ۠۟ۡۡ r4 = r4.f24532
            boolean r5 = r4.f5568
            Yue.ۥۣۢۦۧ r7 = r1.f4824
            Yue.ۥ۠۟ۡۡ r7 = r7.f24532
            boolean r11 = r7.f5568
            if (r5 == 0) goto L5b
            if (r11 == 0) goto L5b
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r6 = Yue.C1517.EnumC1519.f4911
            int r5 = r4.f5565
            int r7 = r7.f5565
            r2 = r12
            r3 = r1
            r4 = r6
            r2.m8532(r3, r4, r5, r6, r7)
            r1.f4819 = r9
            goto Lb6
        L5b:
            if (r5 == 0) goto L89
            if (r3 == 0) goto L89
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r5 = Yue.C1517.EnumC1519.f4911
            int r8 = r4.f5565
            int r7 = r7.f5565
            r2 = r12
            r3 = r1
            r4 = r5
            r5 = r8
            r2.m8532(r3, r4, r5, r6, r7)
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r2 = Yue.C1517.EnumC1519.f4913
            if (r10 != r2) goto L7b
            Yue.ۥۣۢۦۧ r2 = r1.f4824
            Yue.ۥ۠۟ۡۡ r2 = r2.f24532
            int r3 = r1.m7512()
            r2.f5704 = r3
            goto Lb6
        L7b:
            Yue.ۥۣۢۦۧ r2 = r1.f4824
            Yue.ۥ۠۟ۡۡ r2 = r2.f24532
            int r3 = r1.m7512()
            r2.mo8539(r3)
            r1.f4819 = r9
            goto Lb6
        L89:
            if (r11 == 0) goto Lb6
            if (r2 == 0) goto Lb6
            int r5 = r4.f5565
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r10 = Yue.C1517.EnumC1519.f4911
            int r7 = r7.f5565
            r2 = r12
            r3 = r1
            r4 = r6
            r6 = r10
            r2.m8532(r3, r4, r5, r6, r7)
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r2 = Yue.C1517.EnumC1519.f4913
            if (r8 != r2) goto La9
            Yue.ۥ۠ۤۦۧ r2 = r1.f4823
            Yue.ۥ۠۟ۡۡ r2 = r2.f24532
            int r3 = r1.m7544()
            r2.f5704 = r3
            goto Lb6
        La9:
            Yue.ۥ۠ۤۦۧ r2 = r1.f4823
            Yue.ۥ۠۟ۡۡ r2 = r2.f24532
            int r3 = r1.m7544()
            r2.mo8539(r3)
            r1.f4819 = r9
        Lb6:
            boolean r2 = r1.f4819
            if (r2 == 0) goto L8
            Yue.ۥۣۢۦۧ r2 = r1.f4824
            Yue.ۥ۠۟ۡۡ r2 = r2.f23408
            if (r2 == 0) goto L8
            int r1 = r1.m7502()
            r2.mo8539(r1)
            goto L8
        Lc9:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final java.lang.String m8534(Yue.AbstractC7012 r10) {
            r9 = this;
            boolean r0 = r10 instanceof Yue.C6691
            Yue.ۥ۟ۧ۟ۢ r1 = r10.f24529
            java.lang.String r1 = r1.m7507()
            Yue.ۥ۟ۧ۟ۢ r2 = r10.f24529
            if (r0 != 0) goto L11
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r2 = r2.m7516()
            goto L15
        L11:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r2 = r2.m7541()
        L15:
            Yue.ۥۡۧ۠ۨ r3 = r10.f24530
            if (r0 != 0) goto L2b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r5 = "_HORIZONTAL"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L3c
        L2b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r5 = "_VERTICAL"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L3c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = " [shape=none, label=<"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "  <TR>"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = " BGCOLOR=\"green\""
            java.lang.String r6 = "    <TD "
            if (r0 != 0) goto Lab
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            Yue.ۥ۟ۨۨۥ r7 = r10.f24535
            boolean r7 = r7.f5568
            if (r7 == 0) goto L99
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r5)
            java.lang.String r4 = r7.toString()
        L99:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = " PORT=\"LEFT\" BORDER=\"1\">L</TD>"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            goto Le0
        Lab:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            Yue.ۥ۟ۨۨۥ r7 = r10.f24535
            boolean r7 = r7.f5568
            if (r7 == 0) goto Lcf
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r5)
            java.lang.String r4 = r7.toString()
        Lcf:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = " PORT=\"TOP\" BORDER=\"1\">T</TD>"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
        Le0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = "    <TD BORDER=\"1\" "
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            Yue.ۥ۠۟ۡۡ r7 = r10.f24532
            boolean r7 = r7.f5568
            if (r7 == 0) goto L10f
            Yue.ۥ۟ۧ۟ۢ r8 = r10.f24529
            boolean r8 = r8.f4819
            if (r8 != 0) goto L10f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = " BGCOLOR=\"green\" "
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            goto L142
        L10f:
            if (r7 == 0) goto L129
            Yue.ۥ۟ۧ۟ۢ r8 = r10.f24529
            boolean r8 = r8.f4819
            if (r8 == 0) goto L129
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = " BGCOLOR=\"lightgray\" "
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            goto L142
        L129:
            if (r7 != 0) goto L142
            Yue.ۥ۟ۧ۟ۢ r7 = r10.f24529
            boolean r7 = r7.f4819
            if (r7 == 0) goto L142
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = " BGCOLOR=\"yellow\" "
            r7.append(r4)
            java.lang.String r4 = r7.toString()
        L142:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r7 = Yue.C1517.EnumC1519.f4913
            if (r2 != r7) goto L157
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = "style=\"dashed\""
            r2.append(r4)
            java.lang.String r4 = r2.toString()
        L157:
            if (r3 == 0) goto L17e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = " ["
            r2.append(r7)
            int r3 = r3.f20195
            int r3 = r3 + 1
            r2.append(r3)
            java.lang.String r3 = "/"
            r2.append(r3)
            int r3 = Yue.C5443.f20189
            r2.append(r3)
            java.lang.String r3 = "]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L180
        L17e:
            java.lang.String r2 = ""
        L180:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.String r4 = ">"
            r3.append(r4)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = " </TD>"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            if (r0 != 0) goto L1d4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            Yue.ۥ۟ۨۨۥ r10 = r10.f24536
            boolean r10 = r10.f5568
            if (r10 == 0) goto L1c2
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            r10.append(r5)
            java.lang.String r0 = r10.toString()
        L1c2:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.String r0 = " PORT=\"RIGHT\" BORDER=\"1\">R</TD>"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            goto L245
        L1d4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            boolean r1 = r10 instanceof Yue.C6691
            if (r1 == 0) goto L1ff
            r1 = r10
            Yue.ۥۣۢۦۧ r1 = (Yue.C6691) r1
            Yue.ۥ۟ۨۨۥ r1 = r1.f23407
            boolean r1 = r1.f5568
            if (r1 == 0) goto L1ff
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
        L1ff:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " PORT=\"BASELINE\" BORDER=\"1\">b</TD>"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            Yue.ۥ۟ۨۨۥ r10 = r10.f24536
            boolean r10 = r10.f5568
            if (r10 == 0) goto L234
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            r10.append(r5)
            java.lang.String r0 = r10.toString()
        L234:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            java.lang.String r0 = " PORT=\"BOTTOM\" BORDER=\"1\">B</TD>"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
        L245:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r10 = "  </TR></TABLE>"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r10 = ">];\n"
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            return r10
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m8535(Yue.C0746.InterfaceC0748 r1) {
            r0 = this;
            r0.f5556 = r1
            return
    }
}
