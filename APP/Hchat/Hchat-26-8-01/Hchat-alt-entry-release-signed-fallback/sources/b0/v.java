package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v extends gg.j implements fg.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f414n;

    public /* synthetic */ v(int r1, java.lang.Object r2, java.lang.Class r3, java.lang.String r4, java.lang.String r5, int r6, int r7, int r8) {
            r0 = this;
            r0.f414n = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r26 = this;
            r0 = r26
            int r1 = r0.f414n
            switch(r1) {
                case 0: goto L18c;
                case 1: goto L17a;
                case 2: goto L36;
                case 3: goto L27;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f4549h
            android.view.View r1 = (android.view.View) r1
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r2 < r3) goto L14
            b2.b.e(r1)
        L14:
            r3 = 29
            if (r2 < r3) goto L25
            android.view.contentcapture.ContentCaptureSession r2 = b2.a.a(r1)
            if (r2 != 0) goto L1f
            goto L25
        L1f:
            f0.n r3 = new f0.n
            r3.<init>(r2, r1)
            goto L26
        L25:
            r3 = 0
        L26:
            return r3
        L27:
            java.lang.Object r1 = r0.f4549h
            k.i0 r1 = (k.i0) r1
            d1.b0 r1 = r1.B
            boolean r1 = d1.b0.s1(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L36:
            java.lang.Object r1 = r0.f4549h
            d1.i r1 = (d1.i) r1
            f.l0 r2 = r1.f1925c
            f.l0 r3 = r1.f1926d
            d1.p r4 = r1.f1923a
            d1.b0 r5 = r4.f()
            d1.z r6 = d1.z.f1966i
            if (r5 != 0) goto L9f
            java.lang.Object[] r5 = r3.f2856b
            r16 = 128(0x80, double:6.3E-322)
            long[] r7 = r3.f2855a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L15d
            r9 = 0
            r10 = 7
            r18 = 255(0xff, double:1.26E-321)
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
        L5c:
            r11 = r7[r9]
            r13 = 8
            long r14 = ~r11
            long r14 = r14 << r10
            long r14 = r14 & r11
            long r14 = r14 & r20
            int r14 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r14 == 0) goto L96
            int r14 = r9 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            int r14 = 8 - r14
            r15 = 0
        L71:
            if (r15 >= r14) goto L91
            long r22 = r11 & r18
            int r22 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r22 >= 0) goto L89
            int r22 = r9 << 3
            int r22 = r22 + r15
            r22 = r5[r22]
            r23 = r10
            r10 = r22
            d1.g r10 = (d1.g) r10
            r10.E(r6)
            goto L8b
        L89:
            r23 = r10
        L8b:
            long r11 = r11 >> r13
            int r15 = r15 + 1
            r10 = r23
            goto L71
        L91:
            r23 = r10
            if (r14 != r13) goto L15d
            goto L98
        L96:
            r23 = r10
        L98:
            if (r9 == r8) goto L15d
            int r9 = r9 + 1
            r10 = r23
            goto L5c
        L9f:
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r23 = 7
            boolean r7 = r5.f21832t
            if (r7 == 0) goto L15d
            boolean r7 = r2.c(r5)
            if (r7 == 0) goto Lb7
            r5.q1()
        Lb7:
            d1.z r7 = r5.p1()
            y0.n r8 = r5.f21819g
            boolean r8 = r8.f21832t
            if (r8 != 0) goto Lc6
            java.lang.String r8 = "visitAncestors called on an unattached node"
            u1.a.b(r8)
        Lc6:
            y0.n r8 = r5.f21819g
            x1.f0 r5 = x1.k.w(r5)
            r9 = 0
        Lcd:
            if (r5 == 0) goto L119
            x1.b1 r10 = r5.L
            y0.n r10 = r10.f20844f
            int r10 = r10.f21822j
            r10 = r10 & 5120(0x1400, float:7.175E-42)
            if (r10 == 0) goto L10a
        Ld9:
            if (r8 == 0) goto L10a
            int r10 = r8.f21821i
            r11 = r10 & 5120(0x1400, float:7.175E-42)
            if (r11 == 0) goto L107
            r10 = r10 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto Le7
            int r9 = r9 + 1
        Le7:
            boolean r10 = r8 instanceof d1.g
            if (r10 == 0) goto L107
            boolean r10 = r3.c(r8)
            if (r10 != 0) goto Lf2
            goto L107
        Lf2:
            r10 = 1
            if (r9 > r10) goto Lfc
            r10 = r8
            d1.g r10 = (d1.g) r10
            r10.E(r7)
            goto L104
        Lfc:
            r10 = r8
            d1.g r10 = (d1.g) r10
            d1.z r11 = d1.z.f1965h
            r10.E(r11)
        L104:
            r3.l(r8)
        L107:
            y0.n r8 = r8.f21823k
            goto Ld9
        L10a:
            x1.f0 r5 = r5.u()
            if (r5 == 0) goto L117
            x1.b1 r8 = r5.L
            if (r8 == 0) goto L117
            x1.b2 r8 = r8.f20843e
            goto Lcd
        L117:
            r8 = 0
            goto Lcd
        L119:
            java.lang.Object[] r5 = r3.f2856b
            long[] r7 = r3.f2855a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L15d
            r9 = 0
        L123:
            r10 = r7[r9]
            long r14 = ~r10
            long r14 = r14 << r23
            long r14 = r14 & r10
            long r14 = r14 & r20
            int r12 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r12 == 0) goto L156
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r14 = 8 - r12
            r12 = 0
        L139:
            if (r12 >= r14) goto L151
            long r24 = r10 & r18
            int r15 = (r24 > r16 ? 1 : (r24 == r16 ? 0 : -1))
            if (r15 >= 0) goto L14b
            int r15 = r9 << 3
            int r15 = r15 + r12
            r15 = r5[r15]
            d1.g r15 = (d1.g) r15
            r15.E(r6)
        L14b:
            r13 = 8
            long r10 = r10 >> r13
            int r12 = r12 + 1
            goto L139
        L151:
            r13 = 8
            if (r14 != r13) goto L15d
            goto L158
        L156:
            r13 = 8
        L158:
            if (r9 == r8) goto L15d
            int r9 = r9 + 1
            goto L123
        L15d:
            d1.b0 r5 = r4.f()
            if (r5 == 0) goto L16b
            d1.b0 r5 = r4.f1936c
            d1.z r5 = r5.p1()
            if (r5 != r6) goto L16e
        L16b:
            r4.c()
        L16e:
            r2.b()
            r3.b()
            r2 = 0
            r1.f1927e = r2
            sf.n r1 = sf.n.f12433a
            return r1
        L17a:
            java.lang.Object r1 = r0.f4549h
            ca.f0 r1 = (ca.f0) r1
            android.content.SharedPreferences r1 = r1.f1503e
            java.lang.String r2 = "message_forward_sns_enable"
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L18c:
            java.lang.Object r1 = r0.f4549h
            d0.d r1 = (d0.d) r1
            z.c r1 = r1.j0()
            return r1
    }
}
