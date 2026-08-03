package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0906 implements Yue.InterfaceC3318 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean f2652;

    public C0906(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.f2652 = r1
            return
    }

    @Override // Yue.InterfaceC3318
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ */
    public Yue.C5377 mo4781(@Yue.InterfaceC4418 Yue.InterfaceC3318.InterfaceC3319 r14) throws java.io.IOException {
            r13 = this;
            java.lang.String r0 = "Connection"
            java.lang.String r1 = "close"
            java.lang.String r2 = "chain"
            Yue.C3329.m13906(r14, r2)
            Yue.ۥۡۦ۠ۧ r14 = (Yue.C5228) r14
            Yue.ۥۣ۠ۡ۟ r2 = r14.m19753()
            Yue.C3329.m13903(r2)
            Yue.ۥۡۦۤۧ r14 = r14.m19755()
            Yue.ۥۡۦۥ r3 = r14.m20079()
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 0
            r7 = 1
            r8 = 0
            r2.m10500(r14)     // Catch: java.io.IOException -> L4d
            java.lang.String r9 = r14.m20086()     // Catch: java.io.IOException -> L4d
            boolean r9 = Yue.C3169.m13424(r9)     // Catch: java.io.IOException -> L4d
            if (r9 == 0) goto L8c
            if (r3 == 0) goto L8c
            java.lang.String r9 = "100-continue"
            java.lang.String r10 = "Expect"
            java.lang.String r10 = r14.m20082(r10)     // Catch: java.io.IOException -> L4d
            boolean r9 = Yue.C5988.m22281(r9, r10, r7)     // Catch: java.io.IOException -> L4d
            if (r9 == 0) goto L51
            r2.m10482()     // Catch: java.io.IOException -> L4d
            Yue.ۥۡۦۧ$ۥ r9 = r2.m10494(r7)     // Catch: java.io.IOException -> L4d
            r2.m10496()     // Catch: java.io.IOException -> L4a
            r10 = r6
            goto L53
        L4a:
            r3 = move-exception
            r10 = r7
            goto L9e
        L4d:
            r3 = move-exception
            r10 = r7
            r9 = r8
            goto L9e
        L51:
            r10 = r7
            r9 = r8
        L53:
            if (r9 != 0) goto L7b
            boolean r11 = r3.m20141()     // Catch: java.io.IOException -> L6a
            if (r11 == 0) goto L6c
            r2.m10482()     // Catch: java.io.IOException -> L6a
            Yue.ۥۣۢ۟ۡ r11 = r2.m10479(r14, r7)     // Catch: java.io.IOException -> L6a
            Yue.ۥۣۣ۟۟ r11 = Yue.C4603.m18379(r11)     // Catch: java.io.IOException -> L6a
            r3.mo12021(r11)     // Catch: java.io.IOException -> L6a
            goto L91
        L6a:
            r3 = move-exception
            goto L9e
        L6c:
            Yue.ۥۣۢ۟ۡ r11 = r2.m10479(r14, r6)     // Catch: java.io.IOException -> L6a
            Yue.ۥۣۣ۟۟ r11 = Yue.C4603.m18379(r11)     // Catch: java.io.IOException -> L6a
            r3.mo12021(r11)     // Catch: java.io.IOException -> L6a
            r11.close()     // Catch: java.io.IOException -> L6a
            goto L91
        L7b:
            r2.m10492()     // Catch: java.io.IOException -> L6a
            Yue.ۥۡۦ۠ۥ r11 = r2.m10484()     // Catch: java.io.IOException -> L6a
            boolean r11 = r11.m19727()     // Catch: java.io.IOException -> L6a
            if (r11 != 0) goto L91
            r2.m10491()     // Catch: java.io.IOException -> L6a
            goto L91
        L8c:
            r2.m10492()     // Catch: java.io.IOException -> L4d
            r10 = r7
            r9 = r8
        L91:
            if (r3 == 0) goto L99
            boolean r3 = r3.m20141()     // Catch: java.io.IOException -> L6a
            if (r3 != 0) goto L9c
        L99:
            r2.m10481()     // Catch: java.io.IOException -> L6a
        L9c:
            r3 = r8
            goto La8
        L9e:
            boolean r11 = r3 instanceof Yue.C1486
            if (r11 != 0) goto L1ac
            boolean r11 = r2.m10487()
            if (r11 == 0) goto L1ab
        La8:
            if (r9 != 0) goto Lbb
            Yue.ۥۡۦۧ$ۥ r9 = r2.m10494(r6)     // Catch: java.io.IOException -> Lb8
            Yue.C3329.m13903(r9)     // Catch: java.io.IOException -> Lb8
            if (r10 == 0) goto Lbb
            r2.m10496()     // Catch: java.io.IOException -> Lb8
            r10 = r6
            goto Lbb
        Lb8:
            r14 = move-exception
            goto L1a4
        Lbb:
            Yue.ۥۡۦۧ$ۥ r9 = r9.m20333(r14)     // Catch: java.io.IOException -> Lb8
            Yue.ۥۡۦ۠ۥ r11 = r2.m10484()     // Catch: java.io.IOException -> Lb8
            Yue.ۥ۠ۤۡ۠ r11 = r11.mo7318()     // Catch: java.io.IOException -> Lb8
            Yue.ۥۡۦۧ$ۥ r9 = r9.m20323(r11)     // Catch: java.io.IOException -> Lb8
            Yue.ۥۡۦۧ$ۥ r9 = r9.m20334(r4)     // Catch: java.io.IOException -> Lb8
            long r11 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> Lb8
            Yue.ۥۡۦۧ$ۥ r9 = r9.m20331(r11)     // Catch: java.io.IOException -> Lb8
            Yue.ۥۡۦۧ r9 = r9.m20305()     // Catch: java.io.IOException -> Lb8
            int r11 = r9.m20284()     // Catch: java.io.IOException -> Lb8
            boolean r12 = r13.m5248(r11)     // Catch: java.io.IOException -> Lb8
            if (r12 == 0) goto L115
            Yue.ۥۡۦۧ$ۥ r6 = r2.m10494(r6)     // Catch: java.io.IOException -> Lb8
            Yue.C3329.m13903(r6)     // Catch: java.io.IOException -> Lb8
            if (r10 == 0) goto Lf1
            r2.m10496()     // Catch: java.io.IOException -> Lb8
        Lf1:
            Yue.ۥۡۦۧ$ۥ r14 = r6.m20333(r14)     // Catch: java.io.IOException -> Lb8
            Yue.ۥۡۦ۠ۥ r6 = r2.m10484()     // Catch: java.io.IOException -> Lb8
            Yue.ۥ۠ۤۡ۠ r6 = r6.mo7318()     // Catch: java.io.IOException -> Lb8
            Yue.ۥۡۦۧ$ۥ r14 = r14.m20323(r6)     // Catch: java.io.IOException -> Lb8
            Yue.ۥۡۦۧ$ۥ r14 = r14.m20334(r4)     // Catch: java.io.IOException -> Lb8
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> Lb8
            Yue.ۥۡۦۧ$ۥ r14 = r14.m20331(r4)     // Catch: java.io.IOException -> Lb8
            Yue.ۥۡۦۧ r9 = r14.m20305()     // Catch: java.io.IOException -> Lb8
            int r11 = r9.m20284()     // Catch: java.io.IOException -> Lb8
        L115:
            r2.m10495(r9)     // Catch: java.io.IOException -> Lb8
            boolean r14 = r13.f2652     // Catch: java.io.IOException -> Lb8
            if (r14 == 0) goto L12f
            r14 = 101(0x65, float:1.42E-43)
            if (r11 != r14) goto L12f
            Yue.ۥۡۦۧ$ۥ r14 = r9.m20295()     // Catch: java.io.IOException -> Lb8
            Yue.ۥۡۦۧ۟ r4 = Yue.C6656.f23206     // Catch: java.io.IOException -> Lb8
            Yue.ۥۡۦۧ$ۥ r14 = r14.m20304(r4)     // Catch: java.io.IOException -> Lb8
            Yue.ۥۡۦۧ r14 = r14.m20305()     // Catch: java.io.IOException -> Lb8
            goto L13f
        L12f:
            Yue.ۥۡۦۧ$ۥ r14 = r9.m20295()     // Catch: java.io.IOException -> Lb8
            Yue.ۥۡۦۧ۟ r4 = r2.m10493(r9)     // Catch: java.io.IOException -> Lb8
            Yue.ۥۡۦۧ$ۥ r14 = r14.m20304(r4)     // Catch: java.io.IOException -> Lb8
            Yue.ۥۡۦۧ r14 = r14.m20305()     // Catch: java.io.IOException -> Lb8
        L13f:
            Yue.ۥۡۦۤۧ r4 = r14.m20300()     // Catch: java.io.IOException -> Lb8
            java.lang.String r4 = r4.m20082(r0)     // Catch: java.io.IOException -> Lb8
            boolean r4 = Yue.C5988.m22281(r1, r4, r7)     // Catch: java.io.IOException -> Lb8
            if (r4 != 0) goto L158
            r4 = 2
            java.lang.String r0 = Yue.C5377.m20266(r14, r0, r8, r4, r8)     // Catch: java.io.IOException -> Lb8
            boolean r0 = Yue.C5988.m22281(r1, r0, r7)     // Catch: java.io.IOException -> Lb8
            if (r0 == 0) goto L15b
        L158:
            r2.m10491()     // Catch: java.io.IOException -> Lb8
        L15b:
            r0 = 204(0xcc, float:2.86E-43)
            if (r11 == r0) goto L163
            r0 = 205(0xcd, float:2.87E-43)
            if (r11 != r0) goto L1a3
        L163:
            Yue.ۥۡۦۧ۟ r0 = r14.m20280()     // Catch: java.io.IOException -> Lb8
            if (r0 == 0) goto L16e
            long r0 = r0.mo5163()     // Catch: java.io.IOException -> Lb8
            goto L170
        L16e:
            r0 = -1
        L170:
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L1a3
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch: java.io.IOException -> Lb8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lb8
            r1.<init>()     // Catch: java.io.IOException -> Lb8
            java.lang.String r2 = "HTTP "
            r1.append(r2)     // Catch: java.io.IOException -> Lb8
            r1.append(r11)     // Catch: java.io.IOException -> Lb8
            java.lang.String r2 = " had non-zero Content-Length: "
            r1.append(r2)     // Catch: java.io.IOException -> Lb8
            Yue.ۥۡۦۧ۟ r14 = r14.m20280()     // Catch: java.io.IOException -> Lb8
            if (r14 == 0) goto L198
            long r4 = r14.mo5163()     // Catch: java.io.IOException -> Lb8
            java.lang.Long r8 = java.lang.Long.valueOf(r4)     // Catch: java.io.IOException -> Lb8
        L198:
            r1.append(r8)     // Catch: java.io.IOException -> Lb8
            java.lang.String r14 = r1.toString()     // Catch: java.io.IOException -> Lb8
            r0.<init>(r14)     // Catch: java.io.IOException -> Lb8
            throw r0     // Catch: java.io.IOException -> Lb8
        L1a3:
            return r14
        L1a4:
            if (r3 == 0) goto L1aa
            Yue.C2268.m10468(r3, r14)
            throw r3
        L1aa:
            throw r14
        L1ab:
            throw r3
        L1ac:
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m5248(int r3) {
            r2 = this;
            r0 = 100
            r1 = 1
            if (r3 != r0) goto L6
            goto L10
        L6:
            r0 = 102(0x66, float:1.43E-43)
            if (r0 > r3) goto Lf
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 >= r0) goto Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
    }
}
