package defpackage;

/* JADX INFO: renamed from: 釠夺矅釠丰浀, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1171 {

    /* JADX INFO: renamed from: 釠丰瞾釠翅洺, reason: contains not printable characters */
    public static final byte[] f5292 = null;

    static {
            r0 = 8
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [-119, 80, 78, 71, 13, 10, 26, 10} // fill-array
            defpackage.AbstractC1171.f5292 = r0
            return
    }

    /* JADX INFO: renamed from: 釠贬洺釠册浉, reason: contains not printable characters */
    public static defpackage.EnumC2324 m2251(byte[] r20) {
            r0 = r20
            r1 = -419330826608174(0xfffe829eef0961d2, double:NaN)
            int r1 = r0.length
            r2 = 4
            if (r1 >= r2) goto L11
            岵堘瞼釠丰浄 r0 = defpackage.EnumC2324.f9821
            return r0
        L11:
            int r1 = r0.length
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 >= r3) goto L1a
        L18:
            r1 = 0
            goto L2b
        L1a:
            r1 = r0[r6]
            r8 = -1
            if (r1 != r8) goto L18
            r1 = r0[r5]
            r9 = -40
            if (r1 != r9) goto L18
            r1 = r0[r4]
            if (r1 != r8) goto L18
            岵堘瞼釠丰浄 r1 = defpackage.EnumC2324.f9833
        L2b:
            if (r1 != 0) goto L432
            int r1 = r0.length
            r8 = 16
            r9 = 12
            r10 = 8
            if (r1 >= r10) goto L39
        L36:
            r1 = 0
            goto Lbf
        L39:
            int r1 = r0.length
            if (r1 >= r10) goto L3d
            goto L48
        L3d:
            r1 = r6
        L3e:
            if (r1 >= r10) goto L4c
            r11 = r0[r1]
            byte[] r12 = defpackage.AbstractC1171.f5292
            r12 = r12[r1]
            if (r11 == r12) goto L49
        L48:
            goto L36
        L49:
            int r1 = r1 + 1
            goto L3e
        L4c:
            int r1 = r0.length
            r11 = 40
            if (r1 <= r11) goto Lbd
            r11 = -419395251117614(0xfffe828fef0961d2, double:NaN)
            java.lang.String r1 = "acTL"
            int r11 = r0.length
            if (r11 >= r9) goto L5e
            goto Lbd
        L5e:
            java.nio.charset.Charset r11 = defpackage.AbstractC1422.f6219
            byte[] r1 = r1.getBytes(r11)
            r11 = -419768913272366(0xfffe8238ef0961d2, double:NaN)
            int r11 = r0.length
            r12 = 1048576(0x100000, float:1.469368E-39)
            int r11 = java.lang.Math.min(r11, r12)
            r12 = r10
        L74:
            int r13 = r12 + 8
            if (r13 > r11) goto Lbd
            r13 = r0[r12]
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 24
            int r14 = r12 + 1
            r14 = r0[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << r8
            r13 = r13 | r14
            int r14 = r12 + 2
            r14 = r0[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << r10
            r13 = r13 | r14
            int r14 = r12 + 3
            r14 = r0[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r13 = r13 | r14
            int r14 = r12 + 4
            r14 = r0[r14]
            r15 = r1[r6]
            if (r14 != r15) goto Lb8
            int r14 = r12 + 5
            r14 = r0[r14]
            r15 = r1[r5]
            if (r14 != r15) goto Lb8
            int r14 = r12 + 6
            r14 = r0[r14]
            r15 = r1[r4]
            if (r14 != r15) goto Lb8
            int r14 = r12 + 7
            r14 = r0[r14]
            r15 = r1[r3]
            if (r14 != r15) goto Lb8
            岵堘瞼釠丰浄 r1 = defpackage.EnumC2324.f9823
            goto Lbf
        Lb8:
            int r14 = r13 + 12
            int r12 = r12 + r14
            if (r13 >= 0) goto L74
        Lbd:
            岵堘瞼釠丰浄 r1 = defpackage.EnumC2324.f9829
        Lbf:
            if (r1 != 0) goto L432
            int r1 = r0.length
            r11 = 56
            r12 = 70
            r13 = 73
            r14 = 6
            r15 = 5
            if (r1 >= r14) goto Ld0
            r16 = r6
        Lce:
            r1 = 0
            goto Lf6
        Ld0:
            r1 = r0[r6]
            r16 = r6
            r6 = 71
            if (r1 != r6) goto Lce
            r1 = r0[r5]
            if (r1 != r13) goto Lce
            r1 = r0[r4]
            if (r1 != r12) goto Lce
            r1 = r0[r3]
            if (r1 != r11) goto Lce
            r1 = r0[r2]
            r6 = 55
            if (r1 == r6) goto Lee
            r6 = 57
            if (r1 != r6) goto Lce
        Lee:
            r1 = r0[r15]
            r6 = 97
            if (r1 != r6) goto Lce
            岵堘瞼釠丰浄 r1 = defpackage.EnumC2324.f9826
        Lf6:
            if (r1 != 0) goto L432
            int r1 = r0.length
            r7 = 66
            r17 = r8
            r8 = 10
            r18 = r14
            r14 = 9
            if (r1 >= r9) goto L109
            r1 = 0
            r19 = 13
            goto L161
        L109:
            r1 = r0[r16]
            r19 = 13
            r6 = 82
            if (r1 != r6) goto L160
            r1 = r0[r5]
            if (r1 != r13) goto L160
            r1 = r0[r4]
            if (r1 != r12) goto L160
            r1 = r0[r3]
            if (r1 != r12) goto L160
            r1 = r0[r10]
            r6 = 87
            if (r1 != r6) goto L160
            r1 = r0[r14]
            r6 = 69
            if (r1 != r6) goto L160
            r1 = r0[r8]
            if (r1 != r7) goto L160
            r1 = 11
            r1 = r0[r1]
            r6 = 80
            if (r1 == r6) goto L136
            goto L160
        L136:
            int r1 = r0.length
            r12 = 21
            if (r1 < r12) goto L15d
            r1 = r0[r9]
            r12 = 86
            if (r1 != r12) goto L15d
            r1 = r0[r19]
            if (r1 != r6) goto L15d
            r1 = 14
            r1 = r0[r1]
            if (r1 != r11) goto L15d
            r1 = 15
            r1 = r0[r1]
            r6 = 88
            if (r1 != r6) goto L15d
            r1 = 20
            r1 = r0[r1]
            r1 = r1 & r4
            if (r1 == 0) goto L15d
            岵堘瞼釠丰浄 r1 = defpackage.EnumC2324.f9819
            goto L161
        L15d:
            岵堘瞼釠丰浄 r1 = defpackage.EnumC2324.f9818
            goto L161
        L160:
            r1 = 0
        L161:
            if (r1 != 0) goto L432
            int r1 = r0.length
            if (r1 >= r9) goto L169
        L166:
            r1 = 0
            goto L35d
        L169:
            r1 = r0[r2]
            r6 = 102(0x66, float:1.43E-43)
            if (r1 != r6) goto L166
            r1 = r0[r15]
            r6 = 116(0x74, float:1.63E-43)
            if (r1 != r6) goto L166
            r1 = r0[r18]
            r6 = 121(0x79, float:1.7E-43)
            if (r1 != r6) goto L166
            r1 = 7
            r1 = r0[r1]
            r6 = 112(0x70, float:1.57E-43)
            if (r1 == r6) goto L183
            goto L166
        L183:
            r1 = r0[r16]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 24
            r6 = r0[r5]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r1 = r1 | r6
            r6 = r0[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << r10
            r1 = r1 | r6
            r6 = r0[r3]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r1 = r1 | r6
            int r6 = r0.length
            r11 = -419764618305070(0xfffe8239ef0961d2, double:NaN)
            if (r9 <= r6) goto L1a8
            java.lang.String r6 = ""
            goto L1af
        L1a8:
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r9 = defpackage.AbstractC1422.f6219
            r6.<init>(r0, r10, r2, r9)
        L1af:
            java.lang.String[] r6 = new java.lang.String[]{r6}
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            int r10 = defpackage.AbstractC1893.m3323(r5)
            r9.<init>(r10)
            r6 = r6[r16]
            r9.add(r6)
            int r6 = r0.length
            int r1 = java.lang.Math.min(r1, r6)
            r6 = r17
        L1c8:
            int r10 = r6 + 4
            if (r10 > r1) goto L201
            r17 = r11
            int r11 = r0.length
            if (r10 <= r11) goto L1d6
            java.lang.String r6 = ""
            goto L1de
        L1d6:
            java.lang.String r11 = new java.lang.String
            java.nio.charset.Charset r12 = defpackage.AbstractC1422.f6219
            r11.<init>(r0, r6, r2, r12)
            r6 = r11
        L1de:
            boolean r11 = defpackage.AbstractC1347.m2524(r6)
            if (r11 != 0) goto L1fd
            r11 = r16
        L1e6:
            int r12 = r6.length()
            if (r11 >= r12) goto L1fa
            char r12 = r6.charAt(r11)
            boolean r12 = java.lang.Character.isLetterOrDigit(r12)
            if (r12 != 0) goto L1f7
            goto L1fd
        L1f7:
            int r11 = r11 + 1
            goto L1e6
        L1fa:
            r9.add(r6)
        L1fd:
            r6 = r10
            r11 = r17
            goto L1c8
        L201:
            r10 = -419416725954094(0xfffe828aef0961d2, double:NaN)
            java.lang.String r1 = "avif"
            r10 = -419438200790574(0xfffe8285ef0961d2, double:NaN)
            java.lang.String r6 = "avis"
            java.lang.String[] r1 = new java.lang.String[]{r1, r6}
            java.util.Set r1 = defpackage.AbstractC0425.m1195(r1)
            r10 = -419459675627054(0xfffe8280ef0961d2, double:NaN)
            java.lang.String r6 = "avis"
            java.util.Set r6 = java.util.Collections.singleton(r6)
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L22f
            goto L26a
        L22f:
            java.util.Iterator r10 = r9.iterator()
        L233:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L26a
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = r1.contains(r11)
            if (r11 == 0) goto L233
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L24c
            goto L266
        L24c:
            java.util.Iterator r1 = r9.iterator()
        L250:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L266
            java.lang.Object r9 = r1.next()
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = r6.contains(r9)
            if (r9 == 0) goto L250
            岵堘瞼釠丰浄 r1 = defpackage.EnumC2324.f9828
            goto L35d
        L266:
            岵堘瞼釠丰浄 r1 = defpackage.EnumC2324.f9820
            goto L35d
        L26a:
            r10 = -419481150463534(0xfffe827bef0961d2, double:NaN)
            java.lang.String r1 = "heic"
            r10 = -419502625300014(0xfffe8276ef0961d2, double:NaN)
            java.lang.String r6 = "heix"
            r10 = -419524100136494(0xfffe8271ef0961d2, double:NaN)
            java.lang.String r10 = "heim"
            r11 = -419545574972974(0xfffe826cef0961d2, double:NaN)
            java.lang.String r11 = "heis"
            java.lang.String[] r1 = new java.lang.String[]{r1, r6, r10, r11}
            java.util.Set r1 = defpackage.AbstractC0425.m1195(r1)
            r10 = -419567049809454(0xfffe8267ef0961d2, double:NaN)
            java.lang.String r6 = "hevc"
            r10 = -419588524645934(0xfffe8262ef0961d2, double:NaN)
            java.lang.String r10 = "hevx"
            r11 = -419609999482414(0xfffe825def0961d2, double:NaN)
            java.lang.String r11 = "hevm"
            r17 = -419631474318894(0xfffe8258ef0961d2, double:NaN)
            java.lang.String r12 = "hevs"
            java.lang.String[] r6 = new java.lang.String[]{r6, r10, r11, r12}
            java.util.Set r6 = defpackage.AbstractC0425.m1195(r6)
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L2c9
            goto L2e3
        L2c9:
            java.util.Iterator r10 = r9.iterator()
        L2cd:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L2e3
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = r1.contains(r11)
            if (r11 == 0) goto L2cd
            岵堘瞼釠丰浄 r1 = defpackage.EnumC2324.f9825
            goto L35d
        L2e3:
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L2ea
            goto L303
        L2ea:
            java.util.Iterator r1 = r9.iterator()
        L2ee:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L303
            java.lang.Object r10 = r1.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = r6.contains(r10)
            if (r10 == 0) goto L2ee
            岵堘瞼釠丰浄 r1 = defpackage.EnumC2324.f9832
            goto L35d
        L303:
            r10 = -419652949155374(0xfffe8253ef0961d2, double:NaN)
            java.lang.String r1 = "mif1"
            java.util.Set r1 = java.util.Collections.singleton(r1)
            r10 = -419674423991854(0xfffe824eef0961d2, double:NaN)
            java.lang.String r6 = "msf1"
            java.util.Set r6 = java.util.Collections.singleton(r6)
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L324
            goto L33d
        L324:
            java.util.Iterator r10 = r9.iterator()
        L328:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L33d
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            boolean r11 = r6.contains(r11)
            if (r11 == 0) goto L328
            岵堘瞼釠丰浄 r1 = defpackage.EnumC2324.f9817
            goto L35d
        L33d:
            boolean r6 = r9.isEmpty()
            if (r6 == 0) goto L345
            goto L166
        L345:
            java.util.Iterator r6 = r9.iterator()
        L349:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L166
            java.lang.Object r9 = r6.next()
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = r1.contains(r9)
            if (r9 == 0) goto L349
            岵堘瞼釠丰浄 r1 = defpackage.EnumC2324.f9834
        L35d:
            if (r1 != 0) goto L432
            int r1 = r0.length
            r6 = 77
            if (r1 >= r4) goto L366
        L364:
            r1 = 0
            goto L370
        L366:
            r1 = r0[r16]
            if (r1 != r7) goto L364
            r1 = r0[r5]
            if (r1 != r6) goto L364
            岵堘瞼釠丰浄 r1 = defpackage.EnumC2324.f9830
        L370:
            if (r1 != 0) goto L432
            int r1 = r0.length
            if (r1 >= r2) goto L377
        L375:
            r1 = 0
            goto L399
        L377:
            r1 = r0[r16]
            r7 = 42
            if (r1 != r13) goto L389
            r9 = r0[r5]
            if (r9 != r13) goto L389
            r9 = r0[r4]
            if (r9 != r7) goto L389
            r9 = r0[r3]
            if (r9 == 0) goto L397
        L389:
            if (r1 != r6) goto L375
            r1 = r0[r5]
            if (r1 != r6) goto L375
            r1 = r0[r4]
            if (r1 != 0) goto L375
            r1 = r0[r3]
            if (r1 != r7) goto L375
        L397:
            岵堘瞼釠丰浄 r1 = defpackage.EnumC2324.f9831
        L399:
            if (r1 != 0) goto L432
            int r1 = r0.length
            if (r1 >= r2) goto L3a0
        L39e:
            r1 = 0
            goto L3b2
        L3a0:
            r1 = r0[r16]
            if (r1 != 0) goto L39e
            r1 = r0[r5]
            if (r1 != 0) goto L39e
            r1 = r0[r4]
            if (r1 != r5) goto L39e
            r1 = r0[r3]
            if (r1 != 0) goto L39e
            岵堘瞼釠丰浄 r1 = defpackage.EnumC2324.f9824
        L3b2:
            if (r1 != 0) goto L432
            int r1 = r0.length
            if (r1 >= r15) goto L3ba
        L3b7:
            r7 = 0
            goto L42c
        L3ba:
            int r1 = r0.length
            if (r1 < r3) goto L3d0
            r1 = r0[r16]
            r6 = -17
            if (r1 != r6) goto L3d0
            r1 = r0[r5]
            r6 = -69
            if (r1 != r6) goto L3d0
            r1 = r0[r4]
            r4 = -65
            if (r1 != r4) goto L3d0
            goto L3d2
        L3d0:
            r3 = r16
        L3d2:
            int r1 = r0.length
            if (r3 >= r1) goto L3eb
            r1 = r0[r3]
            r4 = 32
            if (r1 == r4) goto L3e4
            if (r1 == r14) goto L3e4
            if (r1 == r8) goto L3e4
            r4 = r19
            if (r1 != r4) goto L3eb
            goto L3e6
        L3e4:
            r4 = r19
        L3e6:
            int r3 = r3 + 1
            r19 = r4
            goto L3d2
        L3eb:
            int r1 = r0.length
            int r1 = r1 - r3
            if (r1 >= r2) goto L3f0
            goto L3b7
        L3f0:
            java.lang.String r2 = new java.lang.String
            r4 = 256(0x100, float:3.59E-43)
            int r1 = java.lang.Math.min(r1, r4)
            java.nio.charset.Charset r4 = defpackage.AbstractC1422.f6221
            r2.<init>(r0, r3, r1, r4)
            r0 = -419695898828334(0xfffe8249ef0961d2, double:NaN)
            java.lang.String r0 = "<?xml"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L42a
            r0 = -419721668632110(0xfffe8243ef0961d2, double:NaN)
            java.lang.String r0 = "<svg"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L42a
            r0 = -419743143468590(0xfffe823eef0961d2, double:NaN)
            java.lang.String r0 = "<svg"
            boolean r0 = defpackage.AbstractC1347.m2500(r2, r0, r5)
            if (r0 == 0) goto L3b7
        L42a:
            岵堘瞼釠丰浄 r7 = defpackage.EnumC2324.f9822
        L42c:
            if (r7 != 0) goto L431
            岵堘瞼釠丰浄 r0 = defpackage.EnumC2324.f9821
            return r0
        L431:
            return r7
        L432:
            return r1
    }

    /* JADX INFO: renamed from: 釠册洸釠? reason: contains not printable characters */
    public static java.lang.String m2252() {
            java.lang.Object r0 = m2267()
            if (r0 == 0) goto L33
            int r1 = defpackage.AbstractC0233.f1405
            釠夺矆釠贬矆 r0 = defpackage.AbstractC2279.m3695(r0)
            釠夺浂釠册洷 r0 = r0.m2298()
            r1 = -445182234762798(0xfffe6b1bef0961d2, double:NaN)
            java.lang.String r1 = "getCurUserId"
            r0.f4431 = r1
            java.util.List r0 = r0.mo1885()
            java.lang.Object r0 = defpackage.AbstractC1107.m2122(r0)
            釠贬瞾釠册瞾 r0 = (defpackage.C0178) r0
            if (r0 == 0) goto L33
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r0 = r0.m715(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L33
            goto L3c
        L33:
            r0 = -445238069337646(0xfffe6b0eef0961d2, double:NaN)
            java.lang.String r0 = "0"
        L3c:
            r1 = -445246659272238(0xfffe6b0cef0961d2, double:NaN)
            java.lang.String r1 = "0"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L5b
            com.tencent.mmkv.MMKV r1 = defpackage.AbstractC0902.m1871()     // Catch: java.lang.Throwable -> L5b
            r2 = -445255249206830(0xfffe6b0aef0961d2, double:NaN)
            java.lang.String r2 = "uid"     // Catch: java.lang.Throwable -> L5b
            r1.putString(r2, r0)     // Catch: java.lang.Throwable -> L5b
        L5b:
            return r0
    }

    /* JADX INFO: renamed from: 釠册洿釠贬浂, reason: contains not printable characters */
    public static java.lang.Object m2253() {
            岵€釠滇矆釠?r0 = defpackage.C1682.f7493
            java.lang.reflect.Method r0 = defpackage.AbstractC0472.f2363
            r1 = 0
            if (r0 == 0) goto Lc
            java.lang.Object r0 = r0.invoke(r1, r1)
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r2 = 0
            if (r0 != 0) goto L4c
            r3 = -447583121481262(0xfffe68ecef0961d2, double:NaN)
            java.lang.String r3 = "getIMInternalService is null"
            r4 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r6 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r4 = defpackage.AbstractC0225.m818(r4, r3, r6)
            if (r4 != 0) goto L2a
            goto L4c
        L2a:
            int r4 = r3.length()
            r5 = r2
        L2f:
            if (r5 >= r4) goto L4c
            int r6 = r5 + 2000
            if (r6 <= r4) goto L36
            r6 = r4
        L36:
            java.lang.String r5 = r3.substring(r5, r6)
            r7 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            釠册瞼釠贬瞾 r7 = defpackage.C0346.f1773
            r7.getClass()
            defpackage.C0346.m1040(r5)
            r5 = r6
            goto L2f
        L4c:
            r3 = -447707675532846(0xfffe68cfef0961d2, double:NaN)
            java.lang.String r3 = "getMessageService"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            if (r0 == 0) goto Laf
            int r5 = defpackage.AbstractC0233.f1405     // Catch: java.lang.Exception -> L8c
            釠夺矆釠贬矆 r0 = defpackage.AbstractC2279.m3695(r0)     // Catch: java.lang.Exception -> L8c
            java.lang.Object r5 = r0.f5356     // Catch: java.lang.Exception -> L8c
            釠丰矅釠贬矆 r5 = (defpackage.C1380) r5     // Catch: java.lang.Exception -> L8c
            r6 = 2
            r5.f6021 = r6     // Catch: java.lang.Exception -> L8c
            釠夺浂釠册洷 r0 = r0.m2298()     // Catch: java.lang.Exception -> L8c
            r0.m1954()     // Catch: java.lang.Exception -> L8c
            r0.f4431 = r3     // Catch: java.lang.Exception -> L8c
            r5 = -560480631823918(0xfffe023eef0961d2, double:NaN)
            java.util.List r0 = r0.mo1885()     // Catch: java.lang.Exception -> L8c
            java.lang.Object r0 = defpackage.AbstractC1107.m2124(r0)     // Catch: java.lang.Exception -> L8c
            釠贬瞾釠册瞾 r0 = (defpackage.C0178) r0     // Catch: java.lang.Exception -> L8c
            if (r0 == 0) goto Laf
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r4, r2)     // Catch: java.lang.Exception -> L8c
            java.lang.Object r0 = r0.m713(r2)     // Catch: java.lang.Exception -> L8c
            goto Lb0
        L8c:
            r0 = move-exception
            r2 = -447784984944174(0xfffe68bdef0961d2, double:NaN)
            java.lang.String r2 = "callMethod error"
            r3 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            r3 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            釠册瞼釠贬瞾 r3 = defpackage.C0346.f1773
            r3.getClass()
            defpackage.C0346.m1038(r2, r0)
            return r1
        Laf:
            r0 = r1
        Lb0:
            if (r0 != 0) goto Lb3
            return r1
        Lb3:
            return r0
    }

    /* JADX INFO: renamed from: 釠册洿岵囜洺, reason: contains not printable characters */
    public static defpackage.C1237 m2254(java.lang.String r10) {
            岵佱瞼岵堘浀 r0 = defpackage.C1237.f5542
            r1 = 0
            釠丰浉釠贬浉 r0 = r0.m3351(r10, r1)
            r2 = 34
            if (r0 == 0) goto L109
            java.util.List r3 = r0.m2477()
            釠瘁浉釠翅洺 r3 = (defpackage.C0726) r3
            r4 = 1
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.util.Locale r5 = java.util.Locale.ROOT
            r3.toLowerCase(r5)
            java.util.List r3 = r0.m2477()
            釠瘁浉釠翅洺 r3 = (defpackage.C0726) r3
            r6 = 2
            java.lang.Object r3 = r3.get(r6)
            java.lang.String r3 = (java.lang.String) r3
            r3.toLowerCase(r5)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.Object r0 = r0.f5856
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            int r5 = r0.start()
            int r0 = r0.end()
            釠贬浀岵囜矅 r0 = defpackage.AbstractC1754.m3143(r5, r0)
            int r0 = r0.f9423
        L44:
            int r0 = r0 + r4
            int r5 = r10.length()
            if (r0 >= r5) goto Lfb
            岵佱瞼岵堘浀 r5 = defpackage.C1237.f5541
            釠丰浉釠贬浉 r5 = r5.m3351(r10, r0)
            if (r5 == 0) goto Ld4
            java.lang.Object r0 = r5.f5856
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            java.lang.Object r5 = r5.f5857
            岵堘浂釠夺矅 r5 = (defpackage.C2265) r5
            釠贬矆釠瘁洺 r7 = r5.m3687(r4)
            r8 = 0
            if (r7 == 0) goto L65
            java.lang.String r7 = r7.f1331
            goto L66
        L65:
            r7 = r8
        L66:
            if (r7 != 0) goto L77
            int r5 = r0.start()
            int r0 = r0.end()
            釠贬浀岵囜矅 r0 = defpackage.AbstractC1754.m3143(r5, r0)
            int r0 = r0.f9423
            goto L44
        L77:
            釠贬矆釠瘁洺 r9 = r5.m3687(r6)
            if (r9 == 0) goto L7f
            java.lang.String r8 = r9.f1331
        L7f:
            if (r8 != 0) goto L89
            r8 = 3
            釠贬矆釠瘁洺 r5 = r5.m3687(r8)
            java.lang.String r8 = r5.f1331
            goto Lbe
        L89:
            int r5 = r8.length()
            if (r5 <= 0) goto Lbe
            char r5 = r8.charAt(r1)
            r9 = 39
            boolean r5 = defpackage.AbstractC0729.m1636(r5, r9, r1)
            if (r5 == 0) goto Lbe
            int r5 = r8.length()
            if (r5 <= 0) goto Lbe
            int r5 = defpackage.AbstractC1347.m2516(r8)
            char r5 = r8.charAt(r5)
            boolean r5 = defpackage.AbstractC0729.m1636(r5, r9, r1)
            if (r5 == 0) goto Lbe
            int r5 = r8.length()
            if (r5 <= r6) goto Lbe
            int r5 = r8.length()
            int r5 = r5 - r4
            java.lang.String r8 = r8.substring(r4, r5)
        Lbe:
            r3.add(r7)
            r3.add(r8)
            int r5 = r0.start()
            int r0 = r0.end()
            釠贬浀岵囜矅 r0 = defpackage.AbstractC1754.m3143(r5, r0)
            int r0 = r0.f9423
            goto L44
        Ld4:
            java.lang.String r0 = r10.substring(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Parameter is not formatted correctly: \""
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = "\" for: \""
            r1.append(r0)
            r1.append(r10)
            r1.append(r2)
            java.lang.String r10 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r0.<init>(r10)
            throw r0
        Lfb:
            釠丰洺釠贬洺 r0 = new 釠丰洺釠贬洺
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r1 = r3.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.<init>(r1, r10)
            return r0
        L109:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "No subtype found for: \""
            r1.<init>(r3)
            r1.append(r10)
            r1.append(r2)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
    }

    /* JADX INFO: renamed from: 釠册矆釠丰浀, reason: contains not printable characters */
    public static final java.lang.String m2255(int r10) {
            if (r10 != 0) goto L5
            java.lang.String r10 = "0"
            return r10
        L5:
            char[] r0 = defpackage.AbstractC1754.f7742
            int r1 = r10 >> 28
            r1 = r1 & 15
            char r1 = r0[r1]
            int r2 = r10 >> 24
            r2 = r2 & 15
            char r2 = r0[r2]
            int r3 = r10 >> 20
            r3 = r3 & 15
            char r3 = r0[r3]
            int r4 = r10 >> 16
            r4 = r4 & 15
            char r4 = r0[r4]
            int r5 = r10 >> 12
            r5 = r5 & 15
            char r5 = r0[r5]
            int r6 = r10 >> 8
            r6 = r6 & 15
            char r6 = r0[r6]
            int r7 = r10 >> 4
            r7 = r7 & 15
            char r7 = r0[r7]
            r10 = r10 & 15
            char r10 = r0[r10]
            r0 = 8
            char[] r8 = new char[r0]
            r9 = 0
            r8[r9] = r1
            r1 = 1
            r8[r1] = r2
            r1 = 2
            r8[r1] = r3
            r1 = 3
            r8[r1] = r4
            r1 = 4
            r8[r1] = r5
            r1 = 5
            r8[r1] = r6
            r1 = 6
            r8[r1] = r7
            r1 = 7
            r8[r1] = r10
        L51:
            if (r9 >= r0) goto L5c
            char r10 = r8[r9]
            r1 = 48
            if (r10 != r1) goto L5c
            int r9 = r9 + 1
            goto L51
        L5c:
            java.lang.String r10 = "startIndex: "
            if (r9 < 0) goto L81
            if (r9 > r0) goto L6a
            java.lang.String r10 = new java.lang.String
            int r0 = 8 - r9
            r10.<init>(r8, r9, r0)
            return r10
        L6a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r10)
            r1.append(r9)
            java.lang.String r10 = " > endIndex: 8"
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L81:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r10)
            r1.append(r9)
            java.lang.String r10 = ", endIndex: 8, size: 8"
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
    }

    /* JADX INFO: renamed from: 釠翅瞾岵堘瞾, reason: contains not printable characters */
    public static void m2256(java.lang.Object r1, java.lang.String r2) {
            if (r1 != 0) goto L5
            java.lang.String r1 = "null"
            goto Ld
        L5:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
        Ld:
            java.lang.String r0 = " cannot be cast to "
            java.lang.String r1 = defpackage.AbstractC0225.m817(r1, r0, r2)
            java.lang.ClassCastException r2 = new java.lang.ClassCastException
            r2.<init>(r1)
            java.lang.Class<釠夺矅釠丰浀> r1 = defpackage.AbstractC1171.class
            java.lang.String r1 = r1.getName()
            defpackage.AbstractC0498.m1271(r2, r1)
            throw r2
    }

    /* JADX INFO: renamed from: 釠瘁浉岵€, reason: contains not printable characters */
    public static void m2257() {
            r0 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            r2 = 0
            r3 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            r5 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            java.lang.reflect.Method r7 = defpackage.AbstractC0472.f2380     // Catch: java.lang.Exception -> L51
            r8 = 0
            if (r7 == 0) goto L19
            java.lang.Object r8 = r7.invoke(r8, r8)     // Catch: java.lang.Exception -> L51
        L19:
            java.lang.reflect.Method r7 = defpackage.AbstractC0472.f2372     // Catch: java.lang.Exception -> L51
            if (r7 != 0) goto L53
            r7 = -449739195063854(0xfffe66f6ef0961d2, double:NaN)
            java.lang.String r7 = "handlePauseVideo handlePauseMethod is null"     // Catch: java.lang.Exception -> L51
            int r8 = r7.length()     // Catch: java.lang.Exception -> L51
            if (r8 != 0) goto L34
            goto L9f
        L34:
            int r8 = r7.length()     // Catch: java.lang.Exception -> L51
            r9 = r2
        L39:
            if (r9 >= r8) goto L9f
            int r10 = r9 + 2000
            if (r10 <= r8) goto L40
            r10 = r8
        L40:
            java.lang.String r9 = r7.substring(r9, r10)     // Catch: java.lang.Exception -> L51
            釠册瞼釠贬瞾 r11 = defpackage.C0346.f1773     // Catch: java.lang.Exception -> L51
            r11.getClass()     // Catch: java.lang.Exception -> L51
            defpackage.C0346.m1040(r9)     // Catch: java.lang.Exception -> L51
            r9 = r10
            goto L39
        L51:
            r7 = move-exception
            goto L5d
        L53:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L51
            java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch: java.lang.Exception -> L51
            r7.invoke(r8, r9)     // Catch: java.lang.Exception -> L51
            return
        L5d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = -449923878657582(0xfffe66cbef0961d2, double:NaN)
            java.lang.String r9 = "鏆傚仠瑙嗛澶辫触: "
            r8.<init>(r9)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            int r3 = r7.length()
            if (r3 != 0) goto L83
            goto L9f
        L83:
            int r3 = r7.length()
        L87:
            if (r2 >= r3) goto L9f
            int r4 = r2 + 2000
            if (r4 <= r3) goto L8e
            r4 = r3
        L8e:
            java.lang.String r2 = r7.substring(r2, r4)
            釠册瞼釠贬瞾 r5 = defpackage.C0346.f1773
            r5.getClass()
            defpackage.C0346.m1040(r2)
            r2 = r4
            goto L87
        L9f:
            return
    }

    /* JADX INFO: renamed from: 釠瘁浉岵堘矆, reason: contains not printable characters */
    public static kotlin.Pair m2258(java.lang.String r10, java.lang.String r11, boolean r12) {
            r0 = -447857999388206(0xfffe68acef0961d2, double:NaN)
            r0 = -447870884290094(0xfffe68a9ef0961d2, double:NaN)
            java.lang.Object r0 = m2253()     // Catch: java.lang.Exception -> L69
            r1 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            r3 = 0
            r4 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            r6 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            if (r0 != 0) goto L6b
            r8 = -447892359126574(0xfffe68a4ef0961d2, double:NaN)
            java.lang.String r12 = "鍙戦€佸け璐? messageService is null"     // Catch: java.lang.Exception -> L69
            int r0 = r12.length()     // Catch: java.lang.Exception -> L69
            if (r0 != 0) goto L3c
            goto L58
        L3c:
            int r0 = r12.length()     // Catch: java.lang.Exception -> L69
        L40:
            if (r3 >= r0) goto L58
            int r4 = r3 + 2000
            if (r4 <= r0) goto L47
            r4 = r0
        L47:
            java.lang.String r3 = r12.substring(r3, r4)     // Catch: java.lang.Exception -> L69
            釠册瞼釠贬瞾 r5 = defpackage.C0346.f1773     // Catch: java.lang.Exception -> L69
            r5.getClass()     // Catch: java.lang.Exception -> L69
            defpackage.C0346.m1040(r3)     // Catch: java.lang.Exception -> L69
            r3 = r4
            goto L40
        L58:
            kotlin.Pair r12 = new kotlin.Pair     // Catch: java.lang.Exception -> L69
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L69
            r1 = -448016913178158(0xfffe6887ef0961d2, double:NaN)
            java.lang.String r1 = "鍙戦€佸け璐? messageService is null"     // Catch: java.lang.Exception -> L69
            r12.<init>(r0, r1)     // Catch: java.lang.Exception -> L69
            return r12
        L69:
            r12 = move-exception
            goto Lcf
        L6b:
            if (r12 == 0) goto L70
            java.lang.reflect.Method r12 = defpackage.AbstractC0472.f2383     // Catch: java.lang.Exception -> L69
            goto L72
        L70:
            java.lang.reflect.Method r12 = defpackage.AbstractC0472.f2384     // Catch: java.lang.Exception -> L69
        L72:
            if (r12 != 0) goto Lb7
            r8 = -448141467229742(0xfffe686aef0961d2, double:NaN)
            java.lang.String r12 = "鍙戦€佸け璐? method is null"     // Catch: java.lang.Exception -> L69
            int r0 = r12.length()     // Catch: java.lang.Exception -> L69
            if (r0 != 0) goto L8a
            goto La6
        L8a:
            int r0 = r12.length()     // Catch: java.lang.Exception -> L69
        L8e:
            if (r3 >= r0) goto La6
            int r4 = r3 + 2000
            if (r4 <= r0) goto L95
            r4 = r0
        L95:
            java.lang.String r3 = r12.substring(r3, r4)     // Catch: java.lang.Exception -> L69
            釠册瞼釠贬瞾 r5 = defpackage.C0346.f1773     // Catch: java.lang.Exception -> L69
            r5.getClass()     // Catch: java.lang.Exception -> L69
            defpackage.C0346.m1040(r3)     // Catch: java.lang.Exception -> L69
            r3 = r4
            goto L8e
        La6:
            kotlin.Pair r12 = new kotlin.Pair     // Catch: java.lang.Exception -> L69
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L69
            r1 = -448231661542958(0xfffe6855ef0961d2, double:NaN)
            java.lang.String r1 = "鍙戦€佸け璐? method is null"     // Catch: java.lang.Exception -> L69
            r12.<init>(r0, r1)     // Catch: java.lang.Exception -> L69
            return r12
        Lb7:
            java.lang.Object[] r1 = new java.lang.Object[]{r10, r11}     // Catch: java.lang.Exception -> L69
            r12.invoke(r0, r1)     // Catch: java.lang.Exception -> L69
            kotlin.Pair r12 = new kotlin.Pair     // Catch: java.lang.Exception -> L69
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L69
            r1 = -448321855856174(0xfffe6840ef0961d2, double:NaN)
            java.lang.String r1 = "鍙戦€佹垚鍔?     // Catch: java.lang.Exception -> L69
            r12.<init>(r0, r1)     // Catch: java.lang.Exception -> L69
            return r12
        Lcf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -448343330692654(0xfffe683bef0961d2, double:NaN)
            java.lang.String r1 = "鍙戦€佹秷鎭け璐?id = "
            r0.<init>(r1)
            r0.append(r10)
            r1 = -448399165267502(0xfffe682eef0961d2, double:NaN)
            java.lang.String r10 = ", text = "
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = r0.toString()
            r0 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            r0 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            釠册瞼釠贬瞾 r11 = defpackage.C0346.f1773
            r11.getClass()
            defpackage.C0346.m1038(r10, r12)
            kotlin.Pair r10 = new kotlin.Pair
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -448442114940462(0xfffe6824ef0961d2, double:NaN)
            java.lang.String r1 = "鍙戦€佸け璐? "
            r0.<init>(r1)
            java.lang.String r12 = r12.getMessage()
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r10.<init>(r11, r12)
            return r10
    }

    /* JADX INFO: renamed from: 釠滇洷釠滇洸, reason: contains not printable characters */
    public static java.lang.String m2259(defpackage.C1128 r19, defpackage.C1128[] r20, int r21) {
            r0 = r19
            r1 = r20
            int r2 = r0.mo2165()
            r4 = 0
        L9:
            if (r4 >= r2) goto La2
            int r5 = r4 + r2
            int r5 = r5 / 2
        Lf:
            r6 = 10
            r7 = -1
            if (r5 <= r7) goto L1d
            byte r8 = r0.mo2160(r5)
            if (r8 == r6) goto L1d
            int r5 = r5 + (-1)
            goto Lf
        L1d:
            int r8 = r5 + 1
            r9 = 1
            r10 = r9
        L21:
            int r11 = r8 + r10
            byte r12 = r0.mo2160(r11)
            if (r12 == r6) goto L2c
            int r10 = r10 + 1
            goto L21
        L2c:
            int r6 = r11 - r8
            r12 = r21
            r10 = 0
            r13 = 0
            r14 = 0
        L33:
            if (r10 == 0) goto L39
            r10 = 46
            r15 = 0
            goto L48
        L39:
            r15 = r1[r12]
            byte r15 = r15.mo2160(r13)
            byte[] r16 = defpackage.AbstractC0709.f3358
            r15 = r15 & 255(0xff, float:3.57E-43)
            r18 = r15
            r15 = r10
            r10 = r18
        L48:
            int r3 = r8 + r14
            byte r3 = r0.mo2160(r3)
            byte[] r17 = defpackage.AbstractC0709.f3358
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r10 = r10 - r3
            if (r10 != 0) goto L6f
            int r14 = r14 + 1
            int r13 = r13 + 1
            if (r14 == r6) goto L6f
            r3 = r1[r12]
            int r3 = r3.mo2165()
            if (r3 != r13) goto L6d
            int r3 = r1.length
            int r3 = r3 - r9
            if (r12 != r3) goto L68
            goto L6f
        L68:
            int r12 = r12 + 1
            r13 = r7
            r10 = r9
            goto L33
        L6d:
            r10 = r15
            goto L33
        L6f:
            if (r10 >= 0) goto L73
        L71:
            r2 = r5
            goto L9
        L73:
            if (r10 <= 0) goto L78
        L75:
            int r4 = r11 + 1
            goto L9
        L78:
            int r3 = r6 - r14
            r7 = r1[r12]
            int r7 = r7.mo2165()
            int r7 = r7 - r13
            int r12 = r12 + 1
            int r9 = r1.length
        L84:
            if (r12 >= r9) goto L90
            r10 = r1[r12]
            int r10 = r10.mo2165()
            int r7 = r7 + r10
            int r12 = r12 + 1
            goto L84
        L90:
            if (r7 >= r3) goto L93
            goto L71
        L93:
            if (r7 <= r3) goto L96
            goto L75
        L96:
            int r6 = r6 + r8
            釠夺浉釠羔浂 r0 = r0.mo2159(r8, r6)
            java.nio.charset.Charset r1 = defpackage.AbstractC1422.f6221
            java.lang.String r0 = r0.mo2156(r1)
            return r0
        La2:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: 釠夺浄釠贬瞼, reason: contains not printable characters */
    public static java.lang.Object m2260() {
            r0 = 0
            r1 = 0
            岵€釠滇矆釠?r2 = defpackage.C1682.f7493     // Catch: java.lang.Exception -> L71
            java.lang.reflect.Method r2 = defpackage.AbstractC0472.f2380     // Catch: java.lang.Exception -> L71
            if (r2 == 0) goto Ld
            java.lang.Object r2 = r2.invoke(r1, r1)     // Catch: java.lang.Exception -> L71
            goto Le
        Ld:
            r2 = r1
        Le:
            r3 = -451435707145774(0xfffe656bef0961d2, double:NaN)
            java.lang.String r3 = "getPlayerManager"     // Catch: java.lang.Exception -> L71
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L71
            if (r2 == 0) goto L73
            int r5 = defpackage.AbstractC0233.f1405     // Catch: java.lang.Exception -> L4e
            釠夺矆釠贬矆 r2 = defpackage.AbstractC2279.m3695(r2)     // Catch: java.lang.Exception -> L4e
            java.lang.Object r5 = r2.f5356     // Catch: java.lang.Exception -> L4e
            釠丰矅釠贬矆 r5 = (defpackage.C1380) r5     // Catch: java.lang.Exception -> L4e
            r6 = 2
            r5.f6021 = r6     // Catch: java.lang.Exception -> L4e
            釠夺浂釠册洷 r2 = r2.m2298()     // Catch: java.lang.Exception -> L4e
            r2.m1954()     // Catch: java.lang.Exception -> L4e
            r2.f4431 = r3     // Catch: java.lang.Exception -> L4e
            r5 = -560480631823918(0xfffe023eef0961d2, double:NaN)
            java.util.List r2 = r2.mo1885()     // Catch: java.lang.Exception -> L4e
            java.lang.Object r2 = defpackage.AbstractC1107.m2124(r2)     // Catch: java.lang.Exception -> L4e
            釠贬瞾釠册瞾 r2 = (defpackage.C0178) r2     // Catch: java.lang.Exception -> L4e
            if (r2 == 0) goto L73
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r0)     // Catch: java.lang.Exception -> L4e
            java.lang.Object r0 = r2.m713(r3)     // Catch: java.lang.Exception -> L4e
            goto L74
        L4e:
            r2 = move-exception
            r3 = -451508721589806(0xfffe655aef0961d2, double:NaN)
            java.lang.String r3 = "callMethod error"     // Catch: java.lang.Exception -> L71
            r4 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            r4 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            釠册瞼釠贬瞾 r4 = defpackage.C0346.f1773     // Catch: java.lang.Exception -> L71
            r4.getClass()     // Catch: java.lang.Exception -> L71
            defpackage.C0346.m1038(r3, r2)     // Catch: java.lang.Exception -> L71
            goto Lc9
        L71:
            r2 = move-exception
            goto L78
        L73:
            r0 = r1
        L74:
            if (r0 != 0) goto L77
            goto Lc9
        L77:
            return r0
        L78:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = -451581736033838(0xfffe6549ef0961d2, double:NaN)
            java.lang.String r4 = "鑾峰彇鎾斁鍣ㄥけ璐? "
            r3.<init>(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r3 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r3 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r3 = r2.length()
            if (r3 != 0) goto La8
            goto Lc9
        La8:
            int r3 = r2.length()
        Lac:
            if (r0 >= r3) goto Lc9
            int r4 = r0 + 2000
            if (r4 <= r3) goto Lb3
            r4 = r3
        Lb3:
            java.lang.String r0 = r2.substring(r0, r4)
            r5 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            釠册瞼釠贬瞾 r5 = defpackage.C0346.f1773
            r5.getClass()
            defpackage.C0346.m1040(r0)
            r0 = r4
            goto Lac
        Lc9:
            return r1
    }

    /* JADX INFO: renamed from: 釠丰洸岵囜矆, reason: contains not printable characters */
    public static void m2261(java.lang.Object r1) {
            if (r1 == 0) goto L11
            r0 = 2
            boolean r0 = m2272(r0, r1)
            if (r0 == 0) goto La
            goto L11
        La:
            java.lang.String r0 = "kotlin.jvm.functions.Function2"
            m2256(r1, r0)
            r1 = 0
            throw r1
        L11:
            return
    }

    /* JADX INFO: renamed from: 釠丰浄岵€釠? reason: contains not printable characters */
    public static java.lang.String m2262(java.lang.String r12) {
            java.lang.String r0 = "|"
            boolean r1 = defpackage.AbstractC1347.m2524(r0)
            r2 = 0
            if (r1 != 0) goto L8c
            java.util.List r1 = defpackage.AbstractC1347.m2512(r12)
            int r12 = r12.length()
            r1.size()
            int r3 = defpackage.AbstractC0425.m1184(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
            r5 = 0
            r6 = r5
        L23:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L77
            java.lang.Object r7 = r1.next()
            int r8 = r6 + 1
            if (r6 < 0) goto L73
            java.lang.String r7 = (java.lang.String) r7
            if (r6 == 0) goto L37
            if (r6 != r3) goto L3f
        L37:
            boolean r6 = defpackage.AbstractC1347.m2524(r7)
            if (r6 == 0) goto L3f
            r7 = r2
            goto L6c
        L3f:
            int r6 = r7.length()
            r9 = r5
        L44:
            r10 = -1
            if (r9 >= r6) goto L55
            char r11 = r7.charAt(r9)
            boolean r11 = defpackage.AbstractC0729.m1639(r11)
            if (r11 != 0) goto L52
            goto L56
        L52:
            int r9 = r9 + 1
            goto L44
        L55:
            r9 = r10
        L56:
            if (r9 != r10) goto L5a
        L58:
            r6 = r2
            goto L69
        L5a:
            boolean r6 = r7.startsWith(r0, r9)
            if (r6 == 0) goto L58
            int r6 = r0.length()
            int r6 = r6 + r9
            java.lang.String r6 = r7.substring(r6)
        L69:
            if (r6 == 0) goto L6c
            r7 = r6
        L6c:
            if (r7 == 0) goto L71
            r4.add(r7)
        L71:
            r6 = r8
            goto L23
        L73:
            defpackage.AbstractC0425.m1196()
            throw r2
        L77:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r12)
            java.lang.String r7 = ""
            java.lang.String r9 = "..."
            java.lang.String r6 = "\n"
            r10 = 0
            r8 = r7
            defpackage.AbstractC1107.m2126(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r12 = r5.toString()
            return r12
        L8c:
            java.lang.String r12 = "marginPrefix must be non-blank string."
            defpackage.C2264.m3684(r12)
            return r2
    }

    /* JADX INFO: renamed from: 釠丰浉釠滇矅, reason: contains not printable characters */
    public static final java.lang.Object m2263(defpackage.InterfaceC2145[] r9, defpackage.C0978 r10) {
            int r0 = r9.length
            if (r0 != 0) goto L6
            岵€釠夺矅 r9 = defpackage.C1698.f7558
            return r9
        L6:
            釠翅洿釠夺洺 r0 = new 釠翅洿釠夺洺
            r0.<init>(r9)
            岵堘浂釠翅浄 r1 = new 岵堘浂釠翅浄
            釠贬浉釠册瞼 r10 = defpackage.AbstractC0397.m1142(r10)
            r2 = 1
            r1.<init>(r2, r10)
            r1.m3660()
            int r10 = r9.length
            釠夺洺岵堘洷[] r3 = new defpackage.C1050[r10]
            r4 = 0
            r5 = r4
        L1d:
            if (r5 >= r10) goto L41
            r6 = r9[r5]
            r7 = r6
            釠瘁洸釠滇浀 r7 = (defpackage.AbstractC0624) r7
        L24:
            java.lang.Object r8 = r7.m1442()
            int r8 = r7.m1434(r8)
            if (r8 == 0) goto L31
            if (r8 == r2) goto L31
            goto L24
        L31:
            釠夺洺岵堘洷 r7 = new 釠夺洺岵堘洷
            r7.<init>(r0, r1)
            釠滇洸岵囜矅 r6 = defpackage.AbstractC0762.m1685(r6, r2, r7)
            r7.f4650 = r6
            r3[r5] = r7
            int r5 = r5 + 1
            goto L1d
        L41:
            岵佱洺岵佱洿 r9 = new 岵佱洺岵佱洿
            r9.<init>(r3)
        L46:
            if (r4 >= r10) goto L57
            r0 = r3[r4]
            r0.getClass()
            sun.misc.Unsafe r2 = defpackage.AbstractC0051.f569
            long r5 = defpackage.C1050.f4649
            r2.putObjectVolatile(r0, r5, r9)
            int r4 = r4 + 1
            goto L46
        L57:
            java.lang.Object r10 = r1.m3658()
            boolean r10 = r10 instanceof defpackage.InterfaceC0484
            if (r10 != 0) goto L63
            r9.m3232()
            goto L66
        L63:
            r1.m3667(r9)
        L66:
            java.lang.Object r9 = r1.m3654()
            return r9
    }

    /* JADX INFO: renamed from: 釠丰瞾釠翅洺, reason: contains not printable characters */
    public static void m2264(java.lang.StringBuilder r0, java.lang.Object r1, defpackage.InterfaceC0598 r2) {
            if (r2 == 0) goto Lc
            java.lang.Object r1 = r2.mo617(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.append(r1)
            return
        Lc:
            if (r1 != 0) goto L10
            r2 = 1
            goto L12
        L10:
            boolean r2 = r1 instanceof java.lang.CharSequence
        L12:
            if (r2 == 0) goto L1a
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.append(r1)
            return
        L1a:
            boolean r2 = r1 instanceof java.lang.Character
            if (r2 == 0) goto L28
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
            r0.append(r1)
            return
        L28:
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            return
    }

    /* JADX INFO: renamed from: 釠羔浀釠羔浄, reason: contains not printable characters */
    public static int m2265(android.content.Context r2, int r3) {
            int[] r3 = new int[]{r3}
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3)
            r0 = 0
            int r1 = r3.getResourceId(r0, r0)     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            android.content.res.ColorStateList r2 = defpackage.AbstractC2279.m3698(r2, r1)     // Catch: java.lang.Throwable -> L17
        L13:
            r3.recycle()
            goto L1e
        L17:
            r2 = move-exception
            goto L26
        L19:
            android.content.res.ColorStateList r2 = r3.getColorStateList(r0)     // Catch: java.lang.Throwable -> L17
            goto L13
        L1e:
            if (r2 == 0) goto L25
            int r2 = r2.getDefaultColor()
            return r2
        L25:
            return r0
        L26:
            r3.recycle()
            throw r2
    }

    /* JADX INFO: renamed from: 岵€釠翅瞼釠? reason: contains not printable characters */
    public static java.lang.String m2266(android.content.Context r4) {
            r0 = -447157919718958(0xfffe694fef0961d2, double:NaN)
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: java.lang.Exception -> L35
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Exception -> L35
            r2 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r4 = r1.getApplicationInfo(r4, r2)     // Catch: java.lang.Exception -> L35
            r1 = -447192279457326(0xfffe6947ef0961d2, double:NaN)
            android.os.Bundle r4 = r4.metaData     // Catch: java.lang.Exception -> L35
            if (r4 == 0) goto L37
            r1 = -447295358672430(0xfffe692fef0961d2, double:NaN)
            java.lang.String r1 = "UPDATE_VERSION_CODE"     // Catch: java.lang.Exception -> L35
            int r4 = r4.getInt(r1)     // Catch: java.lang.Exception -> L35
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L35
            goto L38
        L35:
            r4 = move-exception
            goto L40
        L37:
            r4 = r0
        L38:
            if (r4 == 0) goto L3f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L35
            return r4
        L3f:
            return r0
        L40:
            r1 = -447381258018350(0xfffe691bef0961d2, double:NaN)
            java.lang.String r1 = "getCode error"
            r2 = -514790769729070(0xfffe2bccef0961d2, double:NaN)
            r2 = -514825129467438(0xfffe2bc4ef0961d2, double:NaN)
            釠册瞼釠贬瞾 r2 = defpackage.C0346.f1773
            r2.getClass()
            defpackage.C0346.m1038(r1, r4)
            return r0
    }

    /* JADX INFO: renamed from: 岵€岵€釠瘁洺, reason: contains not printable characters */
    public static java.lang.Object m2267() {
            r0 = -444903061888558(0xfffe6b5cef0961d2, double:NaN)
            java.lang.String r0 = "com.ss.android.ugc.aweme.account.AccountProxyService"
            r1 = 3
            r2 = 0
            java.lang.Class r0 = defpackage.AbstractC0350.m1058(r0, r2, r1)
            if (r0 == 0) goto L3a
            int r1 = defpackage.AbstractC0233.f1405
            釠夺矆釠贬矆 r0 = defpackage.AbstractC2279.m3695(r0)
            釠夺浂釠册洷 r0 = r0.m2298()
            r3 = -445130695155246(0xfffe6b27ef0961d2, double:NaN)
            java.lang.String r1 = "userService"
            r0.f4431 = r1
            java.util.List r0 = r0.mo1885()
            java.lang.Object r0 = defpackage.AbstractC1107.m2122(r0)
            釠贬瞾釠册瞾 r0 = (defpackage.C0178) r0
            if (r0 == 0) goto L3a
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r0 = r0.m716(r1)
            return r0
        L3a:
            return r2
    }

    /* JADX INFO: renamed from: 岵佱矆岵囜瞾, reason: contains not printable characters */
    public static java.lang.String m2268(java.lang.String r3) {
            釠滇瞼釠贬矆 r0 = new 釠滇瞼釠贬矆
            r1 = 3
            r0.<init>(r1, r3)
            釠翅矆釠贬浉 r3 = new 釠翅矆釠贬浉
            r1 = 9
            java.lang.String r2 = "    "
            r3.<init>(r2, r1)
            釠贬浄釠丰洸 r1 = new 釠贬浄釠丰洸
            r2 = 2
            r1.<init>(r0, r3, r2)
            java.lang.String r3 = "\n"
            java.lang.String r3 = defpackage.AbstractC0591.m1391(r1, r3)
            return r3
    }

    /* JADX INFO: renamed from: 岵囜洷釠羔矅, reason: contains not printable characters */
    public static final int m2269(int r1, java.lang.String r2) {
            char r0 = r2.charAt(r1)
            int r1 = r1 + 1
            char r1 = r2.charAt(r1)
            int r2 = r0 << 7
            int r2 = r2 + r1
            return r2
    }

    /* JADX INFO: renamed from: 岵囜浂釠滇矅, reason: contains not printable characters */
    public static java.util.Set m2270(java.lang.Object r1) {
            boolean r0 = r1 instanceof defpackage.InterfaceC0958
            if (r0 == 0) goto L10
            boolean r0 = r1 instanceof defpackage.InterfaceC2142
            if (r0 == 0) goto L9
            goto L10
        L9:
            java.lang.String r0 = "kotlin.collections.MutableSet"
            m2256(r1, r0)
            r1 = 0
            throw r1
        L10:
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.ClassCastException -> L13
            return r1
        L13:
            r1 = move-exception
            java.lang.Class<釠夺矅釠丰浀> r0 = defpackage.AbstractC1171.class
            java.lang.String r0 = r0.getName()
            defpackage.AbstractC0498.m1271(r1, r0)
            throw r1
    }

    /* JADX INFO: renamed from: 岵囜浉岵佱洷, reason: contains not printable characters */
    public static final void m2271(long r4, long r6, long r8) {
            long r0 = r6 | r8
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L13
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L13
            long r0 = r4 - r6
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 < 0) goto L13
            return
        L13:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "size="
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " offset="
            r1.append(r4)
            r1.append(r6)
            java.lang.String r4 = " byteCount="
            r1.append(r4)
            r1.append(r8)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: 岵囜瞼釠册洷, reason: contains not printable characters */
    public static boolean m2272(int r3, java.lang.Object r4) {
            boolean r0 = r4 instanceof defpackage.InterfaceC0769
            r1 = 0
            if (r0 == 0) goto L33
            boolean r0 = r4 instanceof defpackage.InterfaceC1679
            r2 = 1
            if (r0 == 0) goto L11
            岵€釠滇瞼釠?r4 = (defpackage.InterfaceC1679) r4
            int r4 = r4.mo1702()
            goto L30
        L11:
            boolean r0 = r4 instanceof defpackage.InterfaceC1781
            if (r0 == 0) goto L17
            r4 = r1
            goto L30
        L17:
            boolean r0 = r4 instanceof defpackage.InterfaceC0598
            if (r0 == 0) goto L1d
            r4 = r2
            goto L30
        L1d:
            boolean r0 = r4 instanceof defpackage.InterfaceC2087
            if (r0 == 0) goto L23
            r4 = 2
            goto L30
        L23:
            boolean r0 = r4 instanceof defpackage.InterfaceC1286
            if (r0 == 0) goto L29
            r4 = 3
            goto L30
        L29:
            boolean r4 = r4 instanceof defpackage.InterfaceC0190
            if (r4 == 0) goto L2f
            r4 = 4
            goto L30
        L2f:
            r4 = -1
        L30:
            if (r4 != r3) goto L33
            return r2
        L33:
            return r1
    }

    /* JADX INFO: renamed from: 岵堘矆釠羔瞾, reason: contains not printable characters */
    public static int m2273(java.lang.Comparable r0, java.lang.Comparable r1) {
            if (r0 != r1) goto L4
            r0 = 0
            return r0
        L4:
            if (r0 != 0) goto L8
            r0 = -1
            return r0
        L8:
            if (r1 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            int r0 = r0.compareTo(r1)
            return r0
    }
}
