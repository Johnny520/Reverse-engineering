package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2941 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final boolean f9546 = false;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final boolean f9547 = false;

    public C2941() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Yue.C7010 m12516(Yue.C1517 r6, int r7, java.util.ArrayList<Yue.C7010> r8, Yue.C7010 r9) {
            if (r7 != 0) goto L5
            int r0 = r6.f4907
            goto L7
        L5:
            int r0 = r6.f4908
        L7:
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L31
            if (r9 == 0) goto L11
            int r3 = r9.f24515
            if (r0 == r3) goto L31
        L11:
            r3 = r1
        L12:
            int r4 = r8.size()
            if (r3 >= r4) goto L34
            java.lang.Object r4 = r8.get(r3)
            Yue.ۥۢۥۣ۟ r4 = (Yue.C7010) r4
            int r5 = r4.m27149()
            if (r5 != r0) goto L2e
            if (r9 == 0) goto L2c
            r9.m27156(r7, r4)
            r8.remove(r9)
        L2c:
            r9 = r4
            goto L34
        L2e:
            int r3 = r3 + 1
            goto L12
        L31:
            if (r0 == r2) goto L34
            return r9
        L34:
            if (r9 != 0) goto L65
            boolean r0 = r6 instanceof Yue.C3025
            if (r0 == 0) goto L5b
            r0 = r6
            Yue.ۥ۠ۤۤۡ r0 = (Yue.C3025) r0
            int r0 = r0.m12786(r7)
            if (r0 == r2) goto L5b
            r2 = r1
        L44:
            int r3 = r8.size()
            if (r2 >= r3) goto L5b
            java.lang.Object r3 = r8.get(r2)
            Yue.ۥۢۥۣ۟ r3 = (Yue.C7010) r3
            int r4 = r3.m27149()
            if (r4 != r0) goto L58
            r9 = r3
            goto L5b
        L58:
            int r2 = r2 + 1
            goto L44
        L5b:
            if (r9 != 0) goto L62
            Yue.ۥۢۥۣ۟ r9 = new Yue.ۥۢۥۣ۟
            r9.<init>(r7)
        L62:
            r8.add(r9)
        L65:
            boolean r0 = r9.m27144(r6)
            if (r0 == 0) goto Lad
            boolean r0 = r6 instanceof Yue.C2948
            if (r0 == 0) goto L80
            r0 = r6
            Yue.ۥ۠ۤ۟ۧ r0 = (Yue.C2948) r0
            Yue.ۥ۟ۧ۟۠ r2 = r0.m12542()
            int r0 = r0.m12543()
            if (r0 != 0) goto L7d
            r1 = 1
        L7d:
            r2.m7409(r1, r8, r9)
        L80:
            if (r7 != 0) goto L93
            int r0 = r9.m27149()
            r6.f4907 = r0
            Yue.ۥ۟ۧ۟۠ r0 = r6.f4854
            r0.m7409(r7, r8, r9)
            Yue.ۥ۟ۧ۟۠ r0 = r6.f4856
            r0.m7409(r7, r8, r9)
            goto La8
        L93:
            int r0 = r9.m27149()
            r6.f4908 = r0
            Yue.ۥ۟ۧ۟۠ r0 = r6.f4855
            r0.m7409(r7, r8, r9)
            Yue.ۥ۟ۧ۟۠ r0 = r6.f4858
            r0.m7409(r7, r8, r9)
            Yue.ۥ۟ۧ۟۠ r0 = r6.f4857
            r0.m7409(r7, r8, r9)
        La8:
            Yue.ۥ۟ۧ۟۠ r6 = r6.f4861
            r6.m7409(r7, r8, r9)
        Lad:
            return r9
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C7010 m12517(java.util.ArrayList<Yue.C7010> r4, int r5) {
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            java.lang.Object r2 = r4.get(r1)
            Yue.ۥۢۥۣ۟ r2 = (Yue.C7010) r2
            int r3 = r2.f24515
            if (r5 != r3) goto L12
            return r2
        L12:
            int r1 = r1 + 1
            goto L5
        L15:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m12518(Yue.C1520 r16, Yue.C0746.InterfaceC0748 r17) {
            r0 = r16
            java.util.ArrayList r1 = r16.m27140()
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L33
            java.lang.Object r5 = r1.get(r4)
            Yue.ۥ۟ۧ۟ۢ r5 = (Yue.C1517) r5
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r6 = r16.m7516()
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r7 = r16.m7541()
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r8 = r5.m7516()
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r9 = r5.m7541()
            boolean r6 = m12519(r6, r7, r8, r9)
            if (r6 != 0) goto L2b
            return r3
        L2b:
            boolean r5 = r5 instanceof Yue.C2462
            if (r5 == 0) goto L30
            return r3
        L30:
            int r4 = r4 + 1
            goto Lc
        L33:
            Yue.ۥۡۡۡۦ r4 = r0.f4925
            if (r4 == 0) goto L3e
            long r5 = r4.f13075
            r7 = 1
            long r5 = r5 + r7
            r4.f13075 = r5
        L3e:
            r5 = r3
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L45:
            r12 = 1
            if (r5 >= r2) goto L11d
            java.lang.Object r13 = r1.get(r5)
            Yue.ۥ۟ۧ۟ۢ r13 = (Yue.C1517) r13
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r14 = r16.m7516()
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r15 = r16.m7541()
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r3 = r13.m7516()
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r4 = r13.m7541()
            boolean r3 = m12519(r14, r15, r3, r4)
            if (r3 != 0) goto L6e
            Yue.ۥ۟ۢۦۤ$ۥ r3 = r0.f4949
            int r4 = Yue.C0746.C0747.f2092
            r14 = r17
            Yue.C1520.m7625(r13, r14, r3, r4)
            goto L70
        L6e:
            r14 = r17
        L70:
            boolean r3 = r13 instanceof Yue.C2948
            if (r3 == 0) goto L97
            r4 = r13
            Yue.ۥ۠ۤ۟ۧ r4 = (Yue.C2948) r4
            int r15 = r4.m12543()
            if (r15 != 0) goto L87
            if (r8 != 0) goto L84
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L84:
            r8.add(r4)
        L87:
            int r15 = r4.m12543()
            if (r15 != r12) goto L97
            if (r6 != 0) goto L94
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L94:
            r6.add(r4)
        L97:
            boolean r4 = r13 instanceof Yue.C3025
            if (r4 == 0) goto Lda
            boolean r4 = r13 instanceof Yue.C0721
            if (r4 == 0) goto Lc3
            r4 = r13
            Yue.ۥ۟ۢۤۧ r4 = (Yue.C0721) r4
            int r15 = r4.m4473()
            if (r15 != 0) goto Lb2
            if (r7 != 0) goto Laf
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        Laf:
            r7.add(r4)
        Lb2:
            int r15 = r4.m4473()
            if (r15 != r12) goto Lda
            if (r9 != 0) goto Lbf
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        Lbf:
            r9.add(r4)
            goto Lda
        Lc3:
            r4 = r13
            Yue.ۥ۠ۤۤۡ r4 = (Yue.C3025) r4
            if (r7 != 0) goto Lcd
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        Lcd:
            r7.add(r4)
            if (r9 != 0) goto Ld7
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        Ld7:
            r9.add(r4)
        Lda:
            Yue.ۥ۟ۧ۟۠ r4 = r13.f4854
            Yue.ۥ۟ۧ۟۠ r4 = r4.f4737
            if (r4 != 0) goto Lf6
            Yue.ۥ۟ۧ۟۠ r4 = r13.f4856
            Yue.ۥ۟ۧ۟۠ r4 = r4.f4737
            if (r4 != 0) goto Lf6
            if (r3 != 0) goto Lf6
            boolean r4 = r13 instanceof Yue.C0721
            if (r4 != 0) goto Lf6
            if (r10 != 0) goto Lf3
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        Lf3:
            r10.add(r13)
        Lf6:
            Yue.ۥ۟ۧ۟۠ r4 = r13.f4855
            Yue.ۥ۟ۧ۟۠ r4 = r4.f4737
            if (r4 != 0) goto L118
            Yue.ۥ۟ۧ۟۠ r4 = r13.f4857
            Yue.ۥ۟ۧ۟۠ r4 = r4.f4737
            if (r4 != 0) goto L118
            Yue.ۥ۟ۧ۟۠ r4 = r13.f4858
            Yue.ۥ۟ۧ۟۠ r4 = r4.f4737
            if (r4 != 0) goto L118
            if (r3 != 0) goto L118
            boolean r3 = r13 instanceof Yue.C0721
            if (r3 != 0) goto L118
            if (r11 != 0) goto L115
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
        L115:
            r11.add(r13)
        L118:
            int r5 = r5 + 1
            r3 = 0
            goto L45
        L11d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r6 == 0) goto L13a
            java.util.Iterator r4 = r6.iterator()
        L128:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L13a
            java.lang.Object r5 = r4.next()
            Yue.ۥ۠ۤ۟ۧ r5 = (Yue.C2948) r5
            r6 = 0
            r13 = 0
            m12516(r5, r6, r3, r13)
            goto L128
        L13a:
            r6 = 0
            r13 = 0
            if (r7 == 0) goto L15b
            java.util.Iterator r4 = r7.iterator()
        L142:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L15b
            java.lang.Object r5 = r4.next()
            Yue.ۥ۠ۤۤۡ r5 = (Yue.C3025) r5
            Yue.ۥۢۥۣ۟ r7 = m12516(r5, r6, r3, r13)
            r5.m12785(r3, r6, r7)
            r7.m27146(r3)
            r6 = 0
            r13 = 0
            goto L142
        L15b:
            Yue.ۥ۟ۧ۟۠$ۥ۟ r4 = Yue.C1510.EnumC1512.f4743
            Yue.ۥ۟ۧ۟۠ r4 = r0.mo7500(r4)
            java.util.HashSet r5 = r4.m7410()
            if (r5 == 0) goto L183
            java.util.HashSet r4 = r4.m7410()
            java.util.Iterator r4 = r4.iterator()
        L16f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L183
            java.lang.Object r5 = r4.next()
            Yue.ۥ۟ۧ۟۠ r5 = (Yue.C1510) r5
            Yue.ۥ۟ۧ۟ۢ r5 = r5.f4735
            r6 = 0
            r7 = 0
            m12516(r5, r6, r3, r7)
            goto L16f
        L183:
            Yue.ۥ۟ۧ۟۠$ۥ۟ r4 = Yue.C1510.EnumC1512.f4745
            Yue.ۥ۟ۧ۟۠ r4 = r0.mo7500(r4)
            java.util.HashSet r5 = r4.m7410()
            if (r5 == 0) goto L1ab
            java.util.HashSet r4 = r4.m7410()
            java.util.Iterator r4 = r4.iterator()
        L197:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1ab
            java.lang.Object r5 = r4.next()
            Yue.ۥ۟ۧ۟۠ r5 = (Yue.C1510) r5
            Yue.ۥ۟ۧ۟ۢ r5 = r5.f4735
            r6 = 0
            r7 = 0
            m12516(r5, r6, r3, r7)
            goto L197
        L1ab:
            Yue.ۥ۟ۧ۟۠$ۥ۟ r4 = Yue.C1510.EnumC1512.f4748
            Yue.ۥ۟ۧ۟۠ r4 = r0.mo7500(r4)
            java.util.HashSet r5 = r4.m7410()
            if (r5 == 0) goto L1d3
            java.util.HashSet r4 = r4.m7410()
            java.util.Iterator r4 = r4.iterator()
        L1bf:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1d3
            java.lang.Object r5 = r4.next()
            Yue.ۥ۟ۧ۟۠ r5 = (Yue.C1510) r5
            Yue.ۥ۟ۧ۟ۢ r5 = r5.f4735
            r6 = 0
            r7 = 0
            m12516(r5, r6, r3, r7)
            goto L1bf
        L1d3:
            r6 = 0
            r7 = 0
            if (r10 == 0) goto L1eb
            java.util.Iterator r4 = r10.iterator()
        L1db:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1eb
            java.lang.Object r5 = r4.next()
            Yue.ۥ۟ۧ۟ۢ r5 = (Yue.C1517) r5
            m12516(r5, r6, r3, r7)
            goto L1db
        L1eb:
            if (r8 == 0) goto L201
            java.util.Iterator r4 = r8.iterator()
        L1f1:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L201
            java.lang.Object r5 = r4.next()
            Yue.ۥ۠ۤ۟ۧ r5 = (Yue.C2948) r5
            m12516(r5, r12, r3, r7)
            goto L1f1
        L201:
            if (r9 == 0) goto L21f
            java.util.Iterator r4 = r9.iterator()
        L207:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L21f
            java.lang.Object r5 = r4.next()
            Yue.ۥ۠ۤۤۡ r5 = (Yue.C3025) r5
            Yue.ۥۢۥۣ۟ r6 = m12516(r5, r12, r3, r7)
            r5.m12785(r3, r12, r6)
            r6.m27146(r3)
            r7 = 0
            goto L207
        L21f:
            Yue.ۥ۟ۧ۟۠$ۥ۟ r4 = Yue.C1510.EnumC1512.f4744
            Yue.ۥ۟ۧ۟۠ r4 = r0.mo7500(r4)
            java.util.HashSet r5 = r4.m7410()
            if (r5 == 0) goto L246
            java.util.HashSet r4 = r4.m7410()
            java.util.Iterator r4 = r4.iterator()
        L233:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L246
            java.lang.Object r5 = r4.next()
            Yue.ۥ۟ۧ۟۠ r5 = (Yue.C1510) r5
            Yue.ۥ۟ۧ۟ۢ r5 = r5.f4735
            r6 = 0
            m12516(r5, r12, r3, r6)
            goto L233
        L246:
            Yue.ۥ۟ۧ۟۠$ۥ۟ r4 = Yue.C1510.EnumC1512.f4747
            Yue.ۥ۟ۧ۟۠ r4 = r0.mo7500(r4)
            java.util.HashSet r5 = r4.m7410()
            if (r5 == 0) goto L26d
            java.util.HashSet r4 = r4.m7410()
            java.util.Iterator r4 = r4.iterator()
        L25a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L26d
            java.lang.Object r5 = r4.next()
            Yue.ۥ۟ۧ۟۠ r5 = (Yue.C1510) r5
            Yue.ۥ۟ۧ۟ۢ r5 = r5.f4735
            r6 = 0
            m12516(r5, r12, r3, r6)
            goto L25a
        L26d:
            Yue.ۥ۟ۧ۟۠$ۥ۟ r4 = Yue.C1510.EnumC1512.f4746
            Yue.ۥ۟ۧ۟۠ r4 = r0.mo7500(r4)
            java.util.HashSet r5 = r4.m7410()
            if (r5 == 0) goto L294
            java.util.HashSet r4 = r4.m7410()
            java.util.Iterator r4 = r4.iterator()
        L281:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L294
            java.lang.Object r5 = r4.next()
            Yue.ۥ۟ۧ۟۠ r5 = (Yue.C1510) r5
            Yue.ۥ۟ۧ۟ۢ r5 = r5.f4735
            r6 = 0
            m12516(r5, r12, r3, r6)
            goto L281
        L294:
            Yue.ۥ۟ۧ۟۠$ۥ۟ r4 = Yue.C1510.EnumC1512.f4748
            Yue.ۥ۟ۧ۟۠ r4 = r0.mo7500(r4)
            java.util.HashSet r5 = r4.m7410()
            if (r5 == 0) goto L2bb
            java.util.HashSet r4 = r4.m7410()
            java.util.Iterator r4 = r4.iterator()
        L2a8:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2bb
            java.lang.Object r5 = r4.next()
            Yue.ۥ۟ۧ۟۠ r5 = (Yue.C1510) r5
            Yue.ۥ۟ۧ۟ۢ r5 = r5.f4735
            r13 = 0
            m12516(r5, r12, r3, r13)
            goto L2a8
        L2bb:
            r13 = 0
            if (r11 == 0) goto L2d2
            java.util.Iterator r4 = r11.iterator()
        L2c2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2d2
            java.lang.Object r5 = r4.next()
            Yue.ۥ۟ۧ۟ۢ r5 = (Yue.C1517) r5
            m12516(r5, r12, r3, r13)
            goto L2c2
        L2d2:
            r4 = 0
        L2d3:
            if (r4 >= r2) goto L2ff
            java.lang.Object r5 = r1.get(r4)
            Yue.ۥ۟ۧ۟ۢ r5 = (Yue.C1517) r5
            boolean r6 = r5.m7563()
            if (r6 == 0) goto L2fc
            int r6 = r5.f4907
            Yue.ۥۢۥۣ۟ r6 = m12517(r3, r6)
            int r5 = r5.f4908
            Yue.ۥۢۥۣ۟ r5 = m12517(r3, r5)
            if (r6 == 0) goto L2fc
            if (r5 == 0) goto L2fc
            r7 = 0
            r6.m27156(r7, r5)
            r7 = 2
            r5.m27158(r7)
            r3.remove(r6)
        L2fc:
            int r4 = r4 + 1
            goto L2d3
        L2ff:
            int r1 = r3.size()
            if (r1 > r12) goto L307
            r1 = 0
            return r1
        L307:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = r16.m7516()
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r2 = Yue.C1517.EnumC1519.f4912
            if (r1 != r2) goto L347
            java.util.Iterator r1 = r3.iterator()
            r2 = r13
            r6 = 0
        L315:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L339
            java.lang.Object r4 = r1.next()
            Yue.ۥۢۥۣ۟ r4 = (Yue.C7010) r4
            int r5 = r4.m27150()
            if (r5 != r12) goto L328
            goto L315
        L328:
            r5 = 0
            r4.m27157(r5)
            Yue.ۥ۠ۧۡۤ r7 = r16.m7645()
            int r7 = r4.m27155(r7, r5)
            if (r7 <= r6) goto L315
            r2 = r4
            r6 = r7
            goto L315
        L339:
            if (r2 == 0) goto L347
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4911
            r0.m7593(r1)
            r0.m7618(r6)
            r2.m27157(r12)
            goto L348
        L347:
            r2 = r13
        L348:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = r16.m7541()
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r4 = Yue.C1517.EnumC1519.f4912
            if (r1 != r4) goto L38a
            java.util.Iterator r1 = r3.iterator()
            r3 = r13
            r6 = 0
        L356:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L37a
            java.lang.Object r4 = r1.next()
            Yue.ۥۢۥۣ۟ r4 = (Yue.C7010) r4
            int r5 = r4.m27150()
            if (r5 != 0) goto L369
            goto L356
        L369:
            r5 = 0
            r4.m27157(r5)
            Yue.ۥ۠ۧۡۤ r7 = r16.m7645()
            int r7 = r4.m27155(r7, r12)
            if (r7 <= r6) goto L356
            r3 = r4
            r6 = r7
            goto L356
        L37a:
            r5 = 0
            if (r3 == 0) goto L38b
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r1 = Yue.C1517.EnumC1519.f4911
            r0.m7614(r1)
            r0.m7588(r6)
            r3.m27157(r12)
            r4 = r3
            goto L38c
        L38a:
            r5 = 0
        L38b:
            r4 = r13
        L38c:
            if (r2 != 0) goto L393
            if (r4 == 0) goto L391
            goto L393
        L391:
            r3 = r5
            goto L394
        L393:
            r3 = r12
        L394:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m12519(Yue.C1517.EnumC1519 r5, Yue.C1517.EnumC1519 r6, Yue.C1517.EnumC1519 r7, Yue.C1517.EnumC1519 r8) {
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r0 = Yue.C1517.EnumC1519.f4911
            r1 = 1
            r2 = 0
            if (r7 == r0) goto L13
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r3 = Yue.C1517.EnumC1519.f4912
            if (r7 == r3) goto L13
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r4 = Yue.C1517.EnumC1519.f4914
            if (r7 != r4) goto L11
            if (r5 == r3) goto L11
            goto L13
        L11:
            r5 = r2
            goto L14
        L13:
            r5 = r1
        L14:
            if (r8 == r0) goto L23
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r7 = Yue.C1517.EnumC1519.f4912
            if (r8 == r7) goto L23
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r0 = Yue.C1517.EnumC1519.f4914
            if (r8 != r0) goto L21
            if (r6 == r7) goto L21
            goto L23
        L21:
            r6 = r2
            goto L24
        L23:
            r6 = r1
        L24:
            if (r5 != 0) goto L2a
            if (r6 == 0) goto L29
            goto L2a
        L29:
            return r2
        L2a:
            return r1
    }
}
