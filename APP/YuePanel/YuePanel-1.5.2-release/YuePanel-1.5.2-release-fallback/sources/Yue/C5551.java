package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n+ 2 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n63#2,12:141\n63#2,12:153\n104#2,2:165\n106#2,26:168\n135#2,5:194\n142#2:199\n145#2,3:200\n63#2,8:203\n148#2,8:211\n71#2,4:219\n156#2:223\n63#2,12:224\n160#2:236\n85#2,10:237\n161#2,9:247\n95#2,4:256\n170#2,2:260\n179#2,4:262\n85#2,10:266\n183#2,3:276\n95#2,4:279\n186#2:283\n195#2,8:284\n85#2,10:292\n203#2,3:302\n95#2,4:305\n206#2:309\n215#2,5:310\n85#2,10:315\n220#2,3:325\n95#2,4:328\n223#2:332\n226#2,4:333\n234#2,6:337\n63#2,8:343\n240#2,7:351\n71#2,4:358\n247#2,2:362\n1#3:167\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/SegmentedByteString\n*L\n54#1:141,12\n66#1:153,12\n78#1:165,2\n78#1:168,26\n80#1:194,5\n82#1:199\n84#1:200,3\n84#1:203,8\n84#1:211,8\n84#1:219,4\n84#1:223\n90#1:224,12\n96#1:236\n96#1:237,10\n96#1:247,9\n96#1:256,4\n96#1:260,2\n103#1:262,4\n103#1:266,10\n103#1:276,3\n103#1:279,4\n103#1:283\n110#1:284,8\n110#1:292,10\n110#1:302,3\n110#1:305,4\n110#1:309\n117#1:310,5\n117#1:315,10\n117#1:325,3\n117#1:328,4\n117#1:332\n131#1:333,4\n133#1:337,6\n133#1:343,8\n133#1:351,7\n133#1:358,4\n133#1:362,2\n78#1:167\n*E\n"})
public final class C5551 extends Yue.C0879 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final transient byte[][] f20505;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final transient int[] f20506;

    public C5551(@Yue.InterfaceC4418 byte[][] r2, @Yue.InterfaceC4418 int[] r3) {
            r1 = this;
            java.lang.String r0 = "segments"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "directory"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥۣ۟ۥۤ r0 = Yue.C0879.f2558
            byte[] r0 = r0.m5067()
            r1.<init>(r0)
            r1.f20505 = r2
            r1.f20506 = r3
            return
    }

    @Override // Yue.C0879
    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            goto L21
        L4:
            boolean r1 = r5 instanceof Yue.C0879
            r2 = 0
            if (r1 == 0) goto L20
            Yue.ۥۣ۟ۥۤ r5 = (Yue.C0879) r5
            int r1 = r5.m5095()
            int r3 = r4.m5095()
            if (r1 != r3) goto L20
            int r1 = r4.m5095()
            boolean r5 = r4.mo5087(r2, r5, r2, r1)
            if (r5 == 0) goto L20
            goto L21
        L20:
            r0 = r2
        L21:
            return r0
    }

    @Override // Yue.C0879
    public int hashCode() {
            r8 = this;
            int r0 = r8.m5068()
            if (r0 == 0) goto L7
            goto L3a
        L7:
            byte[][] r0 = r8.m20831()
            int r0 = r0.length
            r1 = 0
            r2 = 1
            r3 = r1
        Lf:
            if (r1 >= r0) goto L36
            int[] r4 = r8.m20830()
            int r5 = r0 + r1
            r4 = r4[r5]
            int[] r5 = r8.m20830()
            r5 = r5[r1]
            byte[][] r6 = r8.m20831()
            r6 = r6[r1]
            int r3 = r5 - r3
            int r3 = r3 + r4
        L28:
            if (r4 >= r3) goto L32
            int r2 = r2 * 31
            r7 = r6[r4]
            int r2 = r2 + r7
            int r4 = r4 + 1
            goto L28
        L32:
            int r1 = r1 + 1
            r3 = r5
            goto Lf
        L36:
            r8.m5090(r2)
            r0 = r2
        L3a:
            return r0
    }

    @Override // Yue.C0879
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            Yue.ۥۣ۟ۥۤ r0 = r1.m20832()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.C0879
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public java.nio.ByteBuffer mo5058() {
            r2 = this;
            byte[] r0 = r2.mo5104()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            java.lang.String r1 = "asReadOnlyBuffer(...)"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    @Override // Yue.C0879
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public java.lang.String mo5059() {
            r1 = this;
            Yue.ۥۣ۟ۥۤ r0 = r1.m20832()
            java.lang.String r0 = r0.mo5059()
            return r0
    }

    @Override // Yue.C0879
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public java.lang.String mo5060() {
            r1 = this;
            Yue.ۥۣ۟ۥۤ r0 = r1.m20832()
            java.lang.String r0 = r0.mo5060()
            return r0
    }

    @Override // Yue.C0879
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo5062(int r12, @Yue.InterfaceC4418 byte[] r13, int r14, int r15) {
            r11 = this;
            java.lang.String r0 = "target"
            Yue.C3329.m13906(r13, r0)
            int r0 = r11.m5095()
            long r1 = (long) r0
            long r3 = (long) r12
            long r9 = (long) r15
            r5 = r9
            Yue.C0018.m264(r1, r3, r5)
            int r0 = r13.length
            long r5 = (long) r0
            long r7 = (long) r14
            Yue.C0018.m264(r5, r7, r9)
            int r15 = r15 + r12
            int r0 = Yue.C0017.m259(r11, r12)
        L1b:
            if (r12 >= r15) goto L55
            if (r0 != 0) goto L21
            r1 = 0
            goto L29
        L21:
            int[] r1 = r11.m20830()
            int r2 = r0 + (-1)
            r1 = r1[r2]
        L29:
            int[] r2 = r11.m20830()
            r2 = r2[r0]
            int r2 = r2 - r1
            int[] r3 = r11.m20830()
            byte[][] r4 = r11.m20831()
            int r4 = r4.length
            int r4 = r4 + r0
            r3 = r3[r4]
            int r2 = r2 + r1
            int r2 = java.lang.Math.min(r15, r2)
            int r2 = r2 - r12
            int r1 = r12 - r1
            int r3 = r3 + r1
            byte[][] r1 = r11.m20831()
            r1 = r1[r0]
            int r4 = r3 + r2
            Yue.C0586.m2170(r1, r13, r14, r3, r4)
            int r14 = r14 + r2
            int r12 = r12 + r2
            int r0 = r0 + 1
            goto L1b
        L55:
            return
    }

    @Override // Yue.C0879
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public Yue.C0879 mo5063(@Yue.InterfaceC4418 java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "algorithm"
            Yue.C3329.m13906(r7, r0)
            java.security.MessageDigest r7 = java.security.MessageDigest.getInstance(r7)
            byte[][] r0 = r6.m20831()
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L10:
            if (r1 >= r0) goto L2f
            int[] r3 = r6.m20830()
            int r4 = r0 + r1
            r3 = r3[r4]
            int[] r4 = r6.m20830()
            r4 = r4[r1]
            byte[][] r5 = r6.m20831()
            r5 = r5[r1]
            int r2 = r4 - r2
            r7.update(r5, r3, r2)
            int r1 = r1 + 1
            r2 = r4
            goto L10
        L2f:
            byte[] r7 = r7.digest()
            Yue.ۥۣ۟ۥۤ r0 = new Yue.ۥۣ۟ۥۤ
            Yue.C3329.m13903(r7)
            r0.<init>(r7)
            return r0
    }

    @Override // Yue.C0879
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public int mo5069() {
            r2 = this;
            int[] r0 = r2.m20830()
            byte[][] r1 = r2.m20831()
            int r1 = r1.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            return r0
    }

    @Override // Yue.C0879
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public java.lang.String mo5071() {
            r1 = this;
            Yue.ۥۣ۟ۥۤ r0 = r1.m20832()
            java.lang.String r0 = r0.mo5071()
            return r0
    }

    @Override // Yue.C0879
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public Yue.C0879 mo5072(@Yue.InterfaceC4418 java.lang.String r6, @Yue.InterfaceC4418 Yue.C0879 r7) {
            r5 = this;
            java.lang.String r0 = "algorithm"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "key"
            Yue.C3329.m13906(r7, r0)
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r6)     // Catch: java.security.InvalidKeyException -> L40
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L40
            byte[] r7 = r7.mo5104()     // Catch: java.security.InvalidKeyException -> L40
            r1.<init>(r7, r6)     // Catch: java.security.InvalidKeyException -> L40
            r0.init(r1)     // Catch: java.security.InvalidKeyException -> L40
            byte[][] r6 = r5.m20831()     // Catch: java.security.InvalidKeyException -> L40
            int r6 = r6.length     // Catch: java.security.InvalidKeyException -> L40
            r7 = 0
            r1 = r7
        L21:
            if (r7 >= r6) goto L42
            int[] r2 = r5.m20830()     // Catch: java.security.InvalidKeyException -> L40
            int r3 = r6 + r7
            r2 = r2[r3]     // Catch: java.security.InvalidKeyException -> L40
            int[] r3 = r5.m20830()     // Catch: java.security.InvalidKeyException -> L40
            r3 = r3[r7]     // Catch: java.security.InvalidKeyException -> L40
            byte[][] r4 = r5.m20831()     // Catch: java.security.InvalidKeyException -> L40
            r4 = r4[r7]     // Catch: java.security.InvalidKeyException -> L40
            int r1 = r3 - r1
            r0.update(r4, r2, r1)     // Catch: java.security.InvalidKeyException -> L40
            int r7 = r7 + 1
            r1 = r3
            goto L21
        L40:
            r6 = move-exception
            goto L51
        L42:
            Yue.ۥۣ۟ۥۤ r6 = new Yue.ۥۣ۟ۥۤ     // Catch: java.security.InvalidKeyException -> L40
            byte[] r7 = r0.doFinal()     // Catch: java.security.InvalidKeyException -> L40
            java.lang.String r0 = "doFinal(...)"
            Yue.C3329.m13905(r7, r0)     // Catch: java.security.InvalidKeyException -> L40
            r6.<init>(r7)     // Catch: java.security.InvalidKeyException -> L40
            return r6
        L51:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r6)
            throw r7
    }

    @Override // Yue.C0879
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public int mo5079(@Yue.InterfaceC4418 byte[] r2, int r3) {
            r1 = this;
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۣ۟ۥۤ r0 = r1.m20832()
            int r2 = r0.mo5079(r2, r3)
            return r2
    }

    @Override // Yue.C0879
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public byte[] mo5080() {
            r1 = this;
            byte[] r0 = r1.mo5104()
            return r0
    }

    @Override // Yue.C0879
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public byte mo5081(int r8) {
            r7 = this;
            int[] r0 = r7.m20830()
            byte[][] r1 = r7.m20831()
            int r1 = r1.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            long r1 = (long) r0
            long r3 = (long) r8
            r5 = 1
            Yue.C0018.m264(r1, r3, r5)
            int r0 = Yue.C0017.m259(r7, r8)
            if (r0 != 0) goto L1c
            r1 = 0
            goto L24
        L1c:
            int[] r1 = r7.m20830()
            int r2 = r0 + (-1)
            r1 = r1[r2]
        L24:
            int[] r2 = r7.m20830()
            byte[][] r3 = r7.m20831()
            int r3 = r3.length
            int r3 = r3 + r0
            r2 = r2[r3]
            byte[][] r3 = r7.m20831()
            r0 = r3[r0]
            int r8 = r8 - r1
            int r8 = r8 + r2
            r8 = r0[r8]
            return r8
    }

    @Override // Yue.C0879
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
    public int mo5085(@Yue.InterfaceC4418 byte[] r2, int r3) {
            r1 = this;
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۣ۟ۥۤ r0 = r1.m20832()
            int r2 = r0.mo5085(r2, r3)
            return r2
    }

    @Override // Yue.C0879
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public boolean mo5087(int r7, @Yue.InterfaceC4418 Yue.C0879 r8, int r9, int r10) {
            r6 = this;
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r8, r0)
            r0 = 0
            if (r7 < 0) goto L52
            int r1 = r6.m5095()
            int r1 = r1 - r10
            if (r7 <= r1) goto L10
            goto L52
        L10:
            int r10 = r10 + r7
            int r1 = Yue.C0017.m259(r6, r7)
        L15:
            if (r7 >= r10) goto L51
            if (r1 != 0) goto L1b
            r2 = r0
            goto L23
        L1b:
            int[] r2 = r6.m20830()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L23:
            int[] r3 = r6.m20830()
            r3 = r3[r1]
            int r3 = r3 - r2
            int[] r4 = r6.m20830()
            byte[][] r5 = r6.m20831()
            int r5 = r5.length
            int r5 = r5 + r1
            r4 = r4[r5]
            int r3 = r3 + r2
            int r3 = java.lang.Math.min(r10, r3)
            int r3 = r3 - r7
            int r2 = r7 - r2
            int r4 = r4 + r2
            byte[][] r2 = r6.m20831()
            r2 = r2[r1]
            boolean r2 = r8.mo5088(r9, r2, r4, r3)
            if (r2 != 0) goto L4c
            goto L52
        L4c:
            int r9 = r9 + r3
            int r7 = r7 + r3
            int r1 = r1 + 1
            goto L15
        L51:
            r0 = 1
        L52:
            return r0
    }

    @Override // Yue.C0879
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public boolean mo5088(int r7, @Yue.InterfaceC4418 byte[] r8, int r9, int r10) {
            r6 = this;
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r8, r0)
            r0 = 0
            if (r7 < 0) goto L58
            int r1 = r6.m5095()
            int r1 = r1 - r10
            if (r7 > r1) goto L58
            if (r9 < 0) goto L58
            int r1 = r8.length
            int r1 = r1 - r10
            if (r9 <= r1) goto L16
            goto L58
        L16:
            int r10 = r10 + r7
            int r1 = Yue.C0017.m259(r6, r7)
        L1b:
            if (r7 >= r10) goto L57
            if (r1 != 0) goto L21
            r2 = r0
            goto L29
        L21:
            int[] r2 = r6.m20830()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L29:
            int[] r3 = r6.m20830()
            r3 = r3[r1]
            int r3 = r3 - r2
            int[] r4 = r6.m20830()
            byte[][] r5 = r6.m20831()
            int r5 = r5.length
            int r5 = r5 + r1
            r4 = r4[r5]
            int r3 = r3 + r2
            int r3 = java.lang.Math.min(r10, r3)
            int r3 = r3 - r7
            int r2 = r7 - r2
            int r4 = r4 + r2
            byte[][] r2 = r6.m20831()
            r2 = r2[r1]
            boolean r2 = Yue.C0018.m263(r2, r4, r8, r9, r3)
            if (r2 != 0) goto L52
            goto L58
        L52:
            int r9 = r9 + r3
            int r7 = r7 + r3
            int r1 = r1 + 1
            goto L1b
        L57:
            r0 = 1
        L58:
            return r0
    }

    @Override // Yue.C0879
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public java.lang.String mo5098(@Yue.InterfaceC4418 java.nio.charset.Charset r2) {
            r1 = this;
            java.lang.String r0 = "charset"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۣ۟ۥۤ r0 = r1.m20832()
            java.lang.String r2 = r0.mo5098(r2)
            return r2
    }

    @Override // Yue.C0879
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public Yue.C0879 mo5101(int r11, int r12) {
            r10 = this;
            int r12 = Yue.C0018.m271(r10, r12)
            if (r11 < 0) goto Lc9
            int r0 = r10.m5095()
            java.lang.String r1 = "endIndex="
            if (r12 > r0) goto L9f
            int r0 = r12 - r11
            if (r0 < 0) goto L7e
            if (r11 != 0) goto L1c
            int r1 = r10.m5095()
            if (r12 != r1) goto L1c
            r11 = r10
            goto L7d
        L1c:
            if (r11 != r12) goto L21
            Yue.ۥۣ۟ۥۤ r11 = Yue.C0879.f2558
            goto L7d
        L21:
            int r1 = Yue.C0017.m259(r10, r11)
            int r12 = r12 + (-1)
            int r12 = Yue.C0017.m259(r10, r12)
            byte[][] r2 = r10.m20831()
            int r3 = r12 + 1
            java.lang.Object[] r2 = Yue.C0586.m2212(r2, r1, r3)
            byte[][] r2 = (byte[][]) r2
            int r3 = r2.length
            int r3 = r3 * 2
            int[] r3 = new int[r3]
            r4 = 0
            if (r1 > r12) goto L66
            r6 = r1
            r5 = r4
        L41:
            int[] r7 = r10.m20830()
            r7 = r7[r6]
            int r7 = r7 - r11
            int r7 = java.lang.Math.min(r7, r0)
            r3[r5] = r7
            int r7 = r5 + 1
            int r8 = r2.length
            int r5 = r5 + r8
            int[] r8 = r10.m20830()
            byte[][] r9 = r10.m20831()
            int r9 = r9.length
            int r9 = r9 + r6
            r8 = r8[r9]
            r3[r5] = r8
            if (r6 == r12) goto L66
            int r6 = r6 + 1
            r5 = r7
            goto L41
        L66:
            if (r1 != 0) goto L69
            goto L71
        L69:
            int[] r12 = r10.m20830()
            int r1 = r1 + (-1)
            r4 = r12[r1]
        L71:
            int r12 = r2.length
            r0 = r3[r12]
            int r11 = r11 - r4
            int r0 = r0 + r11
            r3[r12] = r0
            Yue.ۥۡۧۨۢ r11 = new Yue.ۥۡۧۨۢ
            r11.<init>(r2, r3)
        L7d:
            return r11
        L7e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = " < beginIndex="
            r0.append(r12)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        L9f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r11.append(r12)
            java.lang.String r12 = " > length("
            r11.append(r12)
            int r12 = r10.m5095()
            r11.append(r12)
            r12 = 41
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
        Lc9:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "beginIndex="
            r12.append(r0)
            r12.append(r11)
            java.lang.String r11 = " < 0"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
    }

    @Override // Yue.C0879
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۥ */
    public Yue.C0879 mo5102() {
            r1 = this;
            Yue.ۥۣ۟ۥۤ r0 = r1.m20832()
            Yue.ۥۣ۟ۥۤ r0 = r0.mo5102()
            return r0
    }

    @Override // Yue.C0879
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟ */
    public Yue.C0879 mo5103() {
            r1 = this;
            Yue.ۥۣ۟ۥۤ r0 = r1.m20832()
            Yue.ۥۣ۟ۥۤ r0 = r0.mo5103()
            return r0
    }

    @Override // Yue.C0879
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠ */
    public byte[] mo5104() {
            r9 = this;
            int r0 = r9.m5095()
            byte[] r0 = new byte[r0]
            byte[][] r1 = r9.m20831()
            int r1 = r1.length
            r2 = 0
            r3 = r2
            r4 = r3
        Le:
            if (r2 >= r1) goto L30
            int[] r5 = r9.m20830()
            int r6 = r1 + r2
            r5 = r5[r6]
            int[] r6 = r9.m20830()
            r6 = r6[r2]
            byte[][] r7 = r9.m20831()
            r7 = r7[r2]
            int r3 = r6 - r3
            int r8 = r5 + r3
            Yue.C0586.m2170(r7, r0, r4, r5, r8)
            int r4 = r4 + r3
            int r2 = r2 + 1
            r3 = r6
            goto Le
        L30:
            return r0
    }

    @Override // Yue.C0879
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ */
    public void mo5106(@Yue.InterfaceC4418 java.io.OutputStream r7) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "out"
            Yue.C3329.m13906(r7, r0)
            byte[][] r0 = r6.m20831()
            int r0 = r0.length
            r1 = 0
            r2 = r1
        Lc:
            if (r1 >= r0) goto L2b
            int[] r3 = r6.m20830()
            int r4 = r0 + r1
            r3 = r3[r4]
            int[] r4 = r6.m20830()
            r4 = r4[r1]
            byte[][] r5 = r6.m20831()
            r5 = r5[r1]
            int r2 = r4 - r2
            r7.write(r5, r3, r2)
            int r1 = r1 + 1
            r2 = r4
            goto Lc
        L2b:
            return
    }

    @Override // Yue.C0879
    /* JADX INFO: renamed from: ۥ۟۟ۥۣ */
    public void mo5107(@Yue.InterfaceC4418 Yue.C0843 r12, int r13, int r14) {
            r11 = this;
            java.lang.String r0 = "buffer"
            Yue.C3329.m13906(r12, r0)
            int r0 = r13 + r14
            int r1 = Yue.C0017.m259(r11, r13)
        Lb:
            if (r13 >= r0) goto L60
            if (r1 != 0) goto L11
            r2 = 0
            goto L19
        L11:
            int[] r2 = r11.m20830()
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L19:
            int[] r3 = r11.m20830()
            r3 = r3[r1]
            int r3 = r3 - r2
            int[] r4 = r11.m20830()
            byte[][] r5 = r11.m20831()
            int r5 = r5.length
            int r5 = r5 + r1
            r4 = r4[r5]
            int r3 = r3 + r2
            int r3 = java.lang.Math.min(r0, r3)
            int r3 = r3 - r13
            int r2 = r13 - r2
            int r7 = r4 + r2
            byte[][] r2 = r11.m20831()
            r6 = r2[r1]
            Yue.ۥۡۧۨ r2 = new Yue.ۥۡۧۨ
            int r8 = r7 + r3
            r9 = 1
            r10 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            Yue.ۥۡۧۨ r4 = r12.f2378
            if (r4 != 0) goto L51
            r2.f20496 = r2
            r2.f20495 = r2
            r12.f2378 = r2
            goto L5c
        L51:
            Yue.C3329.m13903(r4)
            Yue.ۥۡۧۨ r4 = r4.f20496
            Yue.C3329.m13903(r4)
            r4.m20805(r2)
        L5c:
            int r13 = r13 + r3
            int r1 = r1 + 1
            goto Lb
        L60:
            long r0 = r12.m4889()
            long r13 = (long) r14
            long r0 = r0 + r13
            r12.m4885(r0)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public final int[] m20830() {
            r1 = this;
            int[] r0 = r1.f20506
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public final byte[][] m20831() {
            r1 = this;
            byte[][] r0 = r1.f20505
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public final Yue.C0879 m20832() {
            r2 = this;
            Yue.ۥۣ۟ۥۤ r0 = new Yue.ۥۣ۟ۥۤ
            byte[] r1 = r2.mo5104()
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public final java.lang.Object m20833() {
            r2 = this;
            Yue.ۥۣ۟ۥۤ r0 = r2.m20832()
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Object"
            Yue.C3329.m13904(r0, r1)
            return r0
    }
}
