package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0968 extends Yue.AbstractC7012 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public java.util.ArrayList<Yue.AbstractC7012> f2760;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int f2761;

    public C0968(Yue.C1517 r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f2760 = r1
            r0.f24533 = r2
            r0.m5460()
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ChainRun "
            r0.append(r1)
            int r1 = r4.f24533
            if (r1 != 0) goto L11
            java.lang.String r1 = "horizontal : "
            goto L13
        L11:
            java.lang.String r1 = "vertical : "
        L13:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r1 = r4.f2760
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r1.next()
            Yue.ۥۢۥۣ۠ r2 = (Yue.AbstractC7012) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "<"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "> "
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L20
        L5e:
            return r0
    }

    @Override // Yue.AbstractC7012, Yue.InterfaceC1812
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void mo5453(Yue.InterfaceC1812 r26) {
            r25 = this;
            r0 = r25
            Yue.ۥ۟ۨۨۥ r1 = r0.f24535
            boolean r1 = r1.f5568
            if (r1 == 0) goto L43d
            Yue.ۥ۟ۨۨۥ r1 = r0.f24536
            boolean r1 = r1.f5568
            if (r1 != 0) goto L10
            goto L43d
        L10:
            Yue.ۥ۟ۧ۟ۢ r1 = r0.f24529
            Yue.ۥ۟ۧ۟ۢ r1 = r1.m7529()
            if (r1 == 0) goto L23
            boolean r3 = r1 instanceof Yue.C1520
            if (r3 == 0) goto L23
            Yue.ۥۣ۟ۧ۟ r1 = (Yue.C1520) r1
            boolean r1 = r1.m7651()
            goto L24
        L23:
            r1 = 0
        L24:
            Yue.ۥ۟ۨۨۥ r3 = r0.f24536
            int r3 = r3.f5565
            Yue.ۥ۟ۨۨۥ r4 = r0.f24535
            int r4 = r4.f5565
            int r3 = r3 - r4
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r4 = r0.f2760
            int r4 = r4.size()
            r5 = 0
        L34:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L4c
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r8 = r0.f2760
            java.lang.Object r8 = r8.get(r5)
            Yue.ۥۢۥۣ۠ r8 = (Yue.AbstractC7012) r8
            Yue.ۥ۟ۧ۟ۢ r8 = r8.f24529
            int r8 = r8.m7543()
            if (r8 != r7) goto L4d
            int r5 = r5 + 1
            goto L34
        L4c:
            r5 = r6
        L4d:
            int r8 = r4 + (-1)
            r9 = r8
        L50:
            if (r9 < 0) goto L66
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r10 = r0.f2760
            java.lang.Object r10 = r10.get(r9)
            Yue.ۥۢۥۣ۠ r10 = (Yue.AbstractC7012) r10
            Yue.ۥ۟ۧ۟ۢ r10 = r10.f24529
            int r10 = r10.m7543()
            if (r10 != r7) goto L65
            int r9 = r9 + (-1)
            goto L50
        L65:
            r6 = r9
        L66:
            r9 = 0
        L67:
            r11 = 2
            if (r9 >= r11) goto L10b
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L71:
            if (r13 >= r4) goto Lfd
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r2 = r0.f2760
            java.lang.Object r2 = r2.get(r13)
            Yue.ۥۢۥۣ۠ r2 = (Yue.AbstractC7012) r2
            Yue.ۥ۟ۧ۟ۢ r11 = r2.f24529
            int r11 = r11.m7543()
            if (r11 != r7) goto L85
            goto Lf6
        L85:
            int r16 = r16 + 1
            if (r13 <= 0) goto L90
            if (r13 < r5) goto L90
            Yue.ۥ۟ۨۨۥ r11 = r2.f24535
            int r11 = r11.f5564
            int r14 = r14 + r11
        L90:
            Yue.ۥ۠۟ۡۡ r11 = r2.f24532
            int r7 = r11.f5565
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r10 = r2.f24531
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r12 = Yue.C1517.EnumC1519.f4913
            if (r10 == r12) goto L9c
            r10 = 1
            goto L9d
        L9c:
            r10 = 0
        L9d:
            if (r10 == 0) goto Lbf
            int r11 = r0.f24533
            if (r11 != 0) goto Lae
            Yue.ۥ۟ۧ۟ۢ r12 = r2.f24529
            Yue.ۥ۠ۤۦۧ r12 = r12.f4823
            Yue.ۥ۠۟ۡۡ r12 = r12.f24532
            boolean r12 = r12.f5568
            if (r12 != 0) goto Lae
            return
        Lae:
            r12 = 1
            if (r11 != r12) goto Lbc
            Yue.ۥ۟ۧ۟ۢ r11 = r2.f24529
            Yue.ۥۣۢۦۧ r11 = r11.f4824
            Yue.ۥ۠۟ۡۡ r11 = r11.f24532
            boolean r11 = r11.f5568
            if (r11 != 0) goto Lbc
            return
        Lbc:
            r19 = r7
            goto Ld5
        Lbf:
            r19 = r7
            r12 = 1
            int r7 = r2.f24528
            if (r7 != r12) goto Lce
            if (r9 != 0) goto Lce
            int r7 = r11.f5704
            int r15 = r15 + 1
        Lcc:
            r10 = 1
            goto Ld7
        Lce:
            boolean r7 = r11.f5568
            if (r7 == 0) goto Ld5
            r7 = r19
            goto Lcc
        Ld5:
            r7 = r19
        Ld7:
            if (r10 != 0) goto Leb
            int r15 = r15 + 1
            Yue.ۥ۟ۧ۟ۢ r7 = r2.f24529
            float[] r7 = r7.f4902
            int r10 = r0.f24533
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto Lec
            float r17 = r17 + r7
            goto Lec
        Leb:
            int r14 = r14 + r7
        Lec:
            if (r13 >= r8) goto Lf6
            if (r13 >= r6) goto Lf6
            Yue.ۥ۟ۨۨۥ r2 = r2.f24536
            int r2 = r2.f5564
            int r2 = -r2
            int r14 = r14 + r2
        Lf6:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L71
        Lfd:
            if (r14 < r3) goto L108
            if (r15 != 0) goto L102
            goto L108
        L102:
            int r9 = r9 + 1
            r7 = 8
            goto L67
        L108:
            r2 = r16
            goto L110
        L10b:
            r2 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L110:
            Yue.ۥ۟ۨۨۥ r7 = r0.f24535
            int r7 = r7.f5565
            if (r1 == 0) goto L11a
            Yue.ۥ۟ۨۨۥ r7 = r0.f24536
            int r7 = r7.f5565
        L11a:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r3) goto L131
            r10 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L12a
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 + r10
            goto L131
        L12a:
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 - r10
        L131:
            if (r15 <= 0) goto L23b
            int r10 = r3 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L13d:
            if (r12 >= r4) goto L1ef
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r9 = r0.f2760
            java.lang.Object r9 = r9.get(r12)
            Yue.ۥۢۥۣ۠ r9 = (Yue.AbstractC7012) r9
            r19 = r11
            Yue.ۥ۟ۧ۟ۢ r11 = r9.f24529
            int r11 = r11.m7543()
            r20 = r14
            r14 = 8
            if (r11 != r14) goto L15f
        L155:
            r23 = r1
            r24 = r2
            r21 = r7
            r22 = r10
            goto L1dd
        L15f:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r11 = r9.f24531
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r14 = Yue.C1517.EnumC1519.f4913
            if (r11 != r14) goto L155
            Yue.ۥ۠۟ۡۡ r11 = r9.f24532
            boolean r14 = r11.f5568
            if (r14 != 0) goto L155
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L182
            Yue.ۥ۟ۧ۟ۢ r14 = r9.f24529
            float[] r14 = r14.f4902
            r21 = r7
            int r7 = r0.f24533
            r7 = r14[r7]
            float r7 = r7 * r10
            float r7 = r7 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r14
            int r7 = (int) r7
            goto L186
        L182:
            r21 = r7
            r7 = r19
        L186:
            int r14 = r0.f24533
            if (r14 != 0) goto L1b0
            Yue.ۥ۟ۧ۟ۢ r14 = r9.f24529
            r22 = r10
            int r10 = r14.f4838
            int r14 = r14.f4837
            r23 = r1
            int r1 = r9.f24528
            r24 = r2
            r2 = 1
            if (r1 != r2) goto L1a2
            int r1 = r11.f5704
            int r1 = java.lang.Math.min(r7, r1)
            goto L1a3
        L1a2:
            r1 = r7
        L1a3:
            int r1 = java.lang.Math.max(r14, r1)
            if (r10 <= 0) goto L1ad
            int r1 = java.lang.Math.min(r10, r1)
        L1ad:
            if (r1 == r7) goto L1d8
            goto L1d5
        L1b0:
            r23 = r1
            r24 = r2
            r22 = r10
            Yue.ۥ۟ۧ۟ۢ r1 = r9.f24529
            int r2 = r1.f4841
            int r1 = r1.f4840
            int r10 = r9.f24528
            r14 = 1
            if (r10 != r14) goto L1c8
            int r10 = r11.f5704
            int r10 = java.lang.Math.min(r7, r10)
            goto L1c9
        L1c8:
            r10 = r7
        L1c9:
            int r1 = java.lang.Math.max(r1, r10)
            if (r2 <= 0) goto L1d3
            int r1 = java.lang.Math.min(r2, r1)
        L1d3:
            if (r1 == r7) goto L1d8
        L1d5:
            int r13 = r13 + 1
            r7 = r1
        L1d8:
            Yue.ۥ۠۟ۡۡ r1 = r9.f24532
            r1.mo8539(r7)
        L1dd:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r10 = r22
            r1 = r23
            r2 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L13d
        L1ef:
            r23 = r1
            r24 = r2
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L22c
            int r15 = r15 - r13
            r1 = 0
            r14 = 0
        L1fc:
            if (r1 >= r4) goto L22e
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r2 = r0.f2760
            java.lang.Object r2 = r2.get(r1)
            Yue.ۥۢۥۣ۠ r2 = (Yue.AbstractC7012) r2
            Yue.ۥ۟ۧ۟ۢ r7 = r2.f24529
            int r7 = r7.m7543()
            r9 = 8
            if (r7 != r9) goto L211
            goto L229
        L211:
            if (r1 <= 0) goto L21a
            if (r1 < r5) goto L21a
            Yue.ۥ۟ۨۨۥ r7 = r2.f24535
            int r7 = r7.f5564
            int r14 = r14 + r7
        L21a:
            Yue.ۥ۠۟ۡۡ r7 = r2.f24532
            int r7 = r7.f5565
            int r14 = r14 + r7
            if (r1 >= r8) goto L229
            if (r1 >= r6) goto L229
            Yue.ۥ۟ۨۨۥ r2 = r2.f24536
            int r2 = r2.f5564
            int r2 = -r2
            int r14 = r14 + r2
        L229:
            int r1 = r1 + 1
            goto L1fc
        L22c:
            r14 = r20
        L22e:
            int r1 = r0.f2761
            r2 = 2
            if (r1 != r2) goto L239
            if (r13 != 0) goto L239
            r1 = 0
            r0.f2761 = r1
            goto L245
        L239:
            r1 = 0
            goto L245
        L23b:
            r23 = r1
            r24 = r2
            r21 = r7
            r20 = r14
            r1 = 0
            r2 = 2
        L245:
            if (r14 <= r3) goto L249
            r0.f2761 = r2
        L249:
            if (r24 <= 0) goto L251
            if (r15 != 0) goto L251
            if (r5 != r6) goto L251
            r0.f2761 = r2
        L251:
            int r2 = r0.f2761
            r7 = 1
            if (r2 != r7) goto L2f6
            r9 = r24
            if (r9 <= r7) goto L25f
            int r3 = r3 - r14
            int r2 = r9 + (-1)
            int r3 = r3 / r2
            goto L266
        L25f:
            if (r9 != r7) goto L265
            int r3 = r3 - r14
            r2 = 2
            int r3 = r3 / r2
            goto L266
        L265:
            r3 = r1
        L266:
            if (r15 <= 0) goto L269
            r3 = r1
        L269:
            r2 = r1
            r7 = r21
        L26c:
            if (r2 >= r4) goto L43d
            if (r23 == 0) goto L275
            int r1 = r2 + 1
            int r1 = r4 - r1
            goto L276
        L275:
            r1 = r2
        L276:
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r9 = r0.f2760
            java.lang.Object r1 = r9.get(r1)
            Yue.ۥۢۥۣ۠ r1 = (Yue.AbstractC7012) r1
            Yue.ۥ۟ۧ۟ۢ r9 = r1.f24529
            int r9 = r9.m7543()
            r10 = 8
            if (r9 != r10) goto L293
            Yue.ۥ۟ۨۨۥ r9 = r1.f24535
            r9.mo8539(r7)
            Yue.ۥ۟ۨۨۥ r1 = r1.f24536
            r1.mo8539(r7)
            goto L2f2
        L293:
            if (r2 <= 0) goto L29a
            if (r23 == 0) goto L299
            int r7 = r7 - r3
            goto L29a
        L299:
            int r7 = r7 + r3
        L29a:
            if (r2 <= 0) goto L2ab
            if (r2 < r5) goto L2ab
            if (r23 == 0) goto L2a6
            Yue.ۥ۟ۨۨۥ r9 = r1.f24535
            int r9 = r9.f5564
            int r7 = r7 - r9
            goto L2ab
        L2a6:
            Yue.ۥ۟ۨۨۥ r9 = r1.f24535
            int r9 = r9.f5564
            int r7 = r7 + r9
        L2ab:
            if (r23 == 0) goto L2b3
            Yue.ۥ۟ۨۨۥ r9 = r1.f24536
            r9.mo8539(r7)
            goto L2b8
        L2b3:
            Yue.ۥ۟ۨۨۥ r9 = r1.f24535
            r9.mo8539(r7)
        L2b8:
            Yue.ۥ۠۟ۡۡ r9 = r1.f24532
            int r10 = r9.f5565
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r11 = r1.f24531
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r12 = Yue.C1517.EnumC1519.f4913
            if (r11 != r12) goto L2c9
            int r11 = r1.f24528
            r12 = 1
            if (r11 != r12) goto L2c9
            int r10 = r9.f5704
        L2c9:
            if (r23 == 0) goto L2cd
            int r7 = r7 - r10
            goto L2ce
        L2cd:
            int r7 = r7 + r10
        L2ce:
            if (r23 == 0) goto L2d7
            Yue.ۥ۟ۨۨۥ r9 = r1.f24535
            r9.mo8539(r7)
        L2d5:
            r9 = 1
            goto L2dd
        L2d7:
            Yue.ۥ۟ۨۨۥ r9 = r1.f24536
            r9.mo8539(r7)
            goto L2d5
        L2dd:
            r1.f24534 = r9
            if (r2 >= r8) goto L2f2
            if (r2 >= r6) goto L2f2
            if (r23 == 0) goto L2ec
            Yue.ۥ۟ۨۨۥ r1 = r1.f24536
            int r1 = r1.f5564
            int r1 = -r1
            int r7 = r7 - r1
            goto L2f2
        L2ec:
            Yue.ۥ۟ۨۨۥ r1 = r1.f24536
            int r1 = r1.f5564
            int r1 = -r1
            int r7 = r7 + r1
        L2f2:
            int r2 = r2 + 1
            goto L26c
        L2f6:
            r9 = r24
            if (r2 != 0) goto L38d
            int r3 = r3 - r14
            r2 = 1
            int r7 = r9 + 1
            int r3 = r3 / r7
            if (r15 <= 0) goto L302
            r3 = r1
        L302:
            r2 = r1
            r7 = r21
        L305:
            if (r2 >= r4) goto L43d
            if (r23 == 0) goto L30e
            int r1 = r2 + 1
            int r1 = r4 - r1
            goto L30f
        L30e:
            r1 = r2
        L30f:
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r9 = r0.f2760
            java.lang.Object r1 = r9.get(r1)
            Yue.ۥۢۥۣ۠ r1 = (Yue.AbstractC7012) r1
            Yue.ۥ۟ۧ۟ۢ r9 = r1.f24529
            int r9 = r9.m7543()
            r10 = 8
            if (r9 != r10) goto L32c
            Yue.ۥ۟ۨۨۥ r9 = r1.f24535
            r9.mo8539(r7)
            Yue.ۥ۟ۨۨۥ r1 = r1.f24536
            r1.mo8539(r7)
            goto L389
        L32c:
            if (r23 == 0) goto L330
            int r7 = r7 - r3
            goto L331
        L330:
            int r7 = r7 + r3
        L331:
            if (r2 <= 0) goto L342
            if (r2 < r5) goto L342
            if (r23 == 0) goto L33d
            Yue.ۥ۟ۨۨۥ r9 = r1.f24535
            int r9 = r9.f5564
            int r7 = r7 - r9
            goto L342
        L33d:
            Yue.ۥ۟ۨۨۥ r9 = r1.f24535
            int r9 = r9.f5564
            int r7 = r7 + r9
        L342:
            if (r23 == 0) goto L34a
            Yue.ۥ۟ۨۨۥ r9 = r1.f24536
            r9.mo8539(r7)
            goto L34f
        L34a:
            Yue.ۥ۟ۨۨۥ r9 = r1.f24535
            r9.mo8539(r7)
        L34f:
            Yue.ۥ۠۟ۡۡ r9 = r1.f24532
            int r10 = r9.f5565
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r11 = r1.f24531
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r12 = Yue.C1517.EnumC1519.f4913
            if (r11 != r12) goto L364
            int r11 = r1.f24528
            r12 = 1
            if (r11 != r12) goto L364
            int r9 = r9.f5704
            int r10 = java.lang.Math.min(r10, r9)
        L364:
            if (r23 == 0) goto L368
            int r7 = r7 - r10
            goto L369
        L368:
            int r7 = r7 + r10
        L369:
            if (r23 == 0) goto L371
            Yue.ۥ۟ۨۨۥ r9 = r1.f24535
            r9.mo8539(r7)
            goto L376
        L371:
            Yue.ۥ۟ۨۨۥ r9 = r1.f24536
            r9.mo8539(r7)
        L376:
            if (r2 >= r8) goto L389
            if (r2 >= r6) goto L389
            if (r23 == 0) goto L383
            Yue.ۥ۟ۨۨۥ r1 = r1.f24536
            int r1 = r1.f5564
            int r1 = -r1
            int r7 = r7 - r1
            goto L389
        L383:
            Yue.ۥ۟ۨۨۥ r1 = r1.f24536
            int r1 = r1.f5564
            int r1 = -r1
            int r7 = r7 + r1
        L389:
            int r2 = r2 + 1
            goto L305
        L38d:
            r7 = 2
            if (r2 != r7) goto L43d
            int r2 = r0.f24533
            if (r2 != 0) goto L39b
            Yue.ۥ۟ۧ۟ۢ r2 = r0.f24529
            float r2 = r2.m7513()
            goto L3a1
        L39b:
            Yue.ۥ۟ۧ۟ۢ r2 = r0.f24529
            float r2 = r2.m7538()
        L3a1:
            if (r23 == 0) goto L3a7
            r7 = 1065353216(0x3f800000, float:1.0)
            float r2 = r7 - r2
        L3a7:
            int r3 = r3 - r14
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            if (r2 < 0) goto L3b2
            if (r15 <= 0) goto L3b3
        L3b2:
            r2 = r1
        L3b3:
            if (r23 == 0) goto L3b8
            int r7 = r21 - r2
            goto L3ba
        L3b8:
            int r7 = r21 + r2
        L3ba:
            r2 = r1
        L3bb:
            if (r2 >= r4) goto L43d
            if (r23 == 0) goto L3c4
            int r1 = r2 + 1
            int r1 = r4 - r1
            goto L3c5
        L3c4:
            r1 = r2
        L3c5:
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r3 = r0.f2760
            java.lang.Object r1 = r3.get(r1)
            Yue.ۥۢۥۣ۠ r1 = (Yue.AbstractC7012) r1
            Yue.ۥ۟ۧ۟ۢ r3 = r1.f24529
            int r3 = r3.m7543()
            r9 = 8
            if (r3 != r9) goto L3e3
            Yue.ۥ۟ۨۨۥ r3 = r1.f24535
            r3.mo8539(r7)
            Yue.ۥ۟ۨۨۥ r1 = r1.f24536
            r1.mo8539(r7)
            r12 = 1
            goto L439
        L3e3:
            if (r2 <= 0) goto L3f4
            if (r2 < r5) goto L3f4
            if (r23 == 0) goto L3ef
            Yue.ۥ۟ۨۨۥ r3 = r1.f24535
            int r3 = r3.f5564
            int r7 = r7 - r3
            goto L3f4
        L3ef:
            Yue.ۥ۟ۨۨۥ r3 = r1.f24535
            int r3 = r3.f5564
            int r7 = r7 + r3
        L3f4:
            if (r23 == 0) goto L3fc
            Yue.ۥ۟ۨۨۥ r3 = r1.f24536
            r3.mo8539(r7)
            goto L401
        L3fc:
            Yue.ۥ۟ۨۨۥ r3 = r1.f24535
            r3.mo8539(r7)
        L401:
            Yue.ۥ۠۟ۡۡ r3 = r1.f24532
            int r10 = r3.f5565
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r11 = r1.f24531
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r12 = Yue.C1517.EnumC1519.f4913
            if (r11 != r12) goto L413
            int r11 = r1.f24528
            r12 = 1
            if (r11 != r12) goto L414
            int r10 = r3.f5704
            goto L414
        L413:
            r12 = 1
        L414:
            if (r23 == 0) goto L418
            int r7 = r7 - r10
            goto L419
        L418:
            int r7 = r7 + r10
        L419:
            if (r23 == 0) goto L421
            Yue.ۥ۟ۨۨۥ r3 = r1.f24535
            r3.mo8539(r7)
            goto L426
        L421:
            Yue.ۥ۟ۨۨۥ r3 = r1.f24536
            r3.mo8539(r7)
        L426:
            if (r2 >= r8) goto L439
            if (r2 >= r6) goto L439
            if (r23 == 0) goto L433
            Yue.ۥ۟ۨۨۥ r1 = r1.f24536
            int r1 = r1.f5564
            int r1 = -r1
            int r7 = r7 - r1
            goto L439
        L433:
            Yue.ۥ۟ۨۨۥ r1 = r1.f24536
            int r1 = r1.f5564
            int r1 = -r1
            int r7 = r7 + r1
        L439:
            int r2 = r2 + 1
            goto L3bb
        L43d:
            return
    }

    @Override // Yue.AbstractC7012
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void mo5454() {
            r5 = this;
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r0 = r5.f2760
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            Yue.ۥۢۥۣ۠ r1 = (Yue.AbstractC7012) r1
            r1.mo5454()
            goto L6
        L16:
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r0 = r5.f2760
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L20
            return
        L20:
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r2 = r5.f2760
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            Yue.ۥۢۥۣ۠ r2 = (Yue.AbstractC7012) r2
            Yue.ۥ۟ۧ۟ۢ r2 = r2.f24529
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r4 = r5.f2760
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            Yue.ۥۢۥۣ۠ r0 = (Yue.AbstractC7012) r0
            Yue.ۥ۟ۧ۟ۢ r0 = r0.f24529
            int r4 = r5.f24533
            if (r4 != 0) goto L76
            Yue.ۥ۟ۧ۟۠ r1 = r2.f4854
            Yue.ۥ۟ۧ۟۠ r0 = r0.f4856
            Yue.ۥ۟ۨۨۥ r2 = r5.m27166(r1, r3)
            int r1 = r1.m7412()
            Yue.ۥ۟ۧ۟ۢ r4 = r5.m5461()
            if (r4 == 0) goto L52
            Yue.ۥ۟ۧ۟۠ r1 = r4.f4854
            int r1 = r1.m7412()
        L52:
            if (r2 == 0) goto L59
            Yue.ۥ۟ۨۨۥ r4 = r5.f24535
            r5.m27162(r4, r2, r1)
        L59:
            Yue.ۥ۟ۨۨۥ r1 = r5.m27166(r0, r3)
            int r0 = r0.m7412()
            Yue.ۥ۟ۧ۟ۢ r2 = r5.m5462()
            if (r2 == 0) goto L6d
            Yue.ۥ۟ۧ۟۠ r0 = r2.f4856
            int r0 = r0.m7412()
        L6d:
            if (r1 == 0) goto Lb1
            Yue.ۥ۟ۨۨۥ r2 = r5.f24536
            int r0 = -r0
            r5.m27162(r2, r1, r0)
            goto Lb1
        L76:
            Yue.ۥ۟ۧ۟۠ r2 = r2.f4855
            Yue.ۥ۟ۧ۟۠ r0 = r0.f4857
            Yue.ۥ۟ۨۨۥ r3 = r5.m27166(r2, r1)
            int r2 = r2.m7412()
            Yue.ۥ۟ۧ۟ۢ r4 = r5.m5461()
            if (r4 == 0) goto L8e
            Yue.ۥ۟ۧ۟۠ r2 = r4.f4855
            int r2 = r2.m7412()
        L8e:
            if (r3 == 0) goto L95
            Yue.ۥ۟ۨۨۥ r4 = r5.f24535
            r5.m27162(r4, r3, r2)
        L95:
            Yue.ۥ۟ۨۨۥ r1 = r5.m27166(r0, r1)
            int r0 = r0.m7412()
            Yue.ۥ۟ۧ۟ۢ r2 = r5.m5462()
            if (r2 == 0) goto La9
            Yue.ۥ۟ۧ۟۠ r0 = r2.f4857
            int r0 = r0.m7412()
        La9:
            if (r1 == 0) goto Lb1
            Yue.ۥ۟ۨۨۥ r2 = r5.f24536
            int r0 = -r0
            r5.m27162(r2, r1, r0)
        Lb1:
            Yue.ۥ۟ۨۨۥ r0 = r5.f24535
            r0.f5559 = r5
            Yue.ۥ۟ۨۨۥ r0 = r5.f24536
            r0.f5559 = r5
            return
    }

    @Override // Yue.AbstractC7012
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void mo5455() {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r1 = r2.f2760
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r1 = r2.f2760
            java.lang.Object r1 = r1.get(r0)
            Yue.ۥۢۥۣ۠ r1 = (Yue.AbstractC7012) r1
            r1.mo5455()
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    @Override // Yue.AbstractC7012
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo5456() {
            r2 = this;
            r0 = 0
            r2.f24530 = r0
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r0 = r2.f2760
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            Yue.ۥۢۥۣ۠ r1 = (Yue.AbstractC7012) r1
            r1.mo5456()
            goto L9
        L19:
            return
    }

    @Override // Yue.AbstractC7012
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public long mo5457() {
            r7 = this;
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r0 = r7.f2760
            int r0 = r0.size()
            r1 = 0
            r3 = 0
        L9:
            if (r3 >= r0) goto L27
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r4 = r7.f2760
            java.lang.Object r4 = r4.get(r3)
            Yue.ۥۢۥۣ۠ r4 = (Yue.AbstractC7012) r4
            Yue.ۥ۟ۨۨۥ r5 = r4.f24535
            int r5 = r5.f5564
            long r5 = (long) r5
            long r1 = r1 + r5
            long r5 = r4.mo5457()
            long r1 = r1 + r5
            Yue.ۥ۟ۨۨۥ r4 = r4.f24536
            int r4 = r4.f5564
            long r4 = (long) r4
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto L9
        L27:
            return r1
    }

    @Override // Yue.AbstractC7012
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void mo5458() {
            r2 = this;
            Yue.ۥ۟ۨۨۥ r0 = r2.f24535
            r1 = 0
            r0.f5568 = r1
            Yue.ۥ۟ۨۨۥ r0 = r2.f24536
            r0.f5568 = r1
            return
    }

    @Override // Yue.AbstractC7012
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean mo5459() {
            r4 = this;
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r0 = r4.f2760
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1c
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r3 = r4.f2760
            java.lang.Object r3 = r3.get(r2)
            Yue.ۥۢۥۣ۠ r3 = (Yue.AbstractC7012) r3
            boolean r3 = r3.mo5459()
            if (r3 != 0) goto L19
            return r1
        L19:
            int r2 = r2 + 1
            goto L8
        L1c:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m5460() {
            r5 = this;
            Yue.ۥ۟ۧ۟ۢ r0 = r5.f24529
            int r1 = r5.f24533
            Yue.ۥ۟ۧ۟ۢ r1 = r0.m7530(r1)
        L8:
            r4 = r1
            r1 = r0
            r0 = r4
            if (r0 == 0) goto L14
            int r1 = r5.f24533
            Yue.ۥ۟ۧ۟ۢ r1 = r0.m7530(r1)
            goto L8
        L14:
            r5.f24529 = r1
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r0 = r5.f2760
            int r2 = r5.f24533
            Yue.ۥۢۥۣ۠ r2 = r1.m7535(r2)
            r0.add(r2)
            int r0 = r5.f24533
            Yue.ۥ۟ۧ۟ۢ r0 = r1.m7526(r0)
        L27:
            if (r0 == 0) goto L3b
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r1 = r5.f2760
            int r2 = r5.f24533
            Yue.ۥۢۥۣ۠ r2 = r0.m7535(r2)
            r1.add(r2)
            int r1 = r5.f24533
            Yue.ۥ۟ۧ۟ۢ r0 = r0.m7526(r1)
            goto L27
        L3b:
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r0 = r5.f2760
            java.util.Iterator r0 = r0.iterator()
        L41:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r0.next()
            Yue.ۥۢۥۣ۠ r1 = (Yue.AbstractC7012) r1
            int r3 = r5.f24533
            if (r3 != 0) goto L57
            Yue.ۥ۟ۧ۟ۢ r1 = r1.f24529
            r1.f4821 = r5
            goto L41
        L57:
            if (r3 != r2) goto L41
            Yue.ۥ۟ۧ۟ۢ r1 = r1.f24529
            r1.f4822 = r5
            goto L41
        L5e:
            int r0 = r5.f24533
            if (r0 != 0) goto L89
            Yue.ۥ۟ۧ۟ۢ r0 = r5.f24529
            Yue.ۥ۟ۧ۟ۢ r0 = r0.m7529()
            Yue.ۥۣ۟ۧ۟ r0 = (Yue.C1520) r0
            boolean r0 = r0.m7651()
            if (r0 == 0) goto L89
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r0 = r5.f2760
            int r0 = r0.size()
            if (r0 <= r2) goto L89
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r0 = r5.f2760
            int r1 = r0.size()
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            Yue.ۥۢۥۣ۠ r0 = (Yue.AbstractC7012) r0
            Yue.ۥ۟ۧ۟ۢ r0 = r0.f24529
            r5.f24529 = r0
        L89:
            int r0 = r5.f24533
            if (r0 != 0) goto L94
            Yue.ۥ۟ۧ۟ۢ r0 = r5.f24529
            int r0 = r0.m7515()
            goto L9a
        L94:
            Yue.ۥ۟ۧ۟ۢ r0 = r5.f24529
            int r0 = r0.m7540()
        L9a:
            r5.f2761 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final Yue.C1517 m5461() {
            r4 = this;
            r0 = 0
        L1:
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r1 = r4.f2760
            int r1 = r1.size()
            if (r0 >= r1) goto L21
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r1 = r4.f2760
            java.lang.Object r1 = r1.get(r0)
            Yue.ۥۢۥۣ۠ r1 = (Yue.AbstractC7012) r1
            Yue.ۥ۟ۧ۟ۢ r2 = r1.f24529
            int r2 = r2.m7543()
            r3 = 8
            if (r2 == r3) goto L1e
            Yue.ۥ۟ۧ۟ۢ r0 = r1.f24529
            return r0
        L1e:
            int r0 = r0 + 1
            goto L1
        L21:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final Yue.C1517 m5462() {
            r4 = this;
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r0 = r4.f2760
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L22
            java.util.ArrayList<Yue.ۥۢۥۣ۠> r1 = r4.f2760
            java.lang.Object r1 = r1.get(r0)
            Yue.ۥۢۥۣ۠ r1 = (Yue.AbstractC7012) r1
            Yue.ۥ۟ۧ۟ۢ r2 = r1.f24529
            int r2 = r2.m7543()
            r3 = 8
            if (r2 == r3) goto L1f
            Yue.ۥ۟ۧ۟ۢ r0 = r1.f24529
            return r0
        L1f:
            int r0 = r0 + (-1)
            goto L8
        L22:
            r0 = 0
            return r0
    }
}
