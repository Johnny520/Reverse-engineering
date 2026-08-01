package p000;

/* JADX INFO: renamed from: w0 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0930w0 extends p000.p80 implements p000.p70 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11502;

    public /* synthetic */ C0930w0(int r1, java.lang.Object r2, java.lang.Class r3, java.lang.String r4, java.lang.String r5, int r6, int r7) {
            r0 = this;
            r0.f11502 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // p000.p70
    public final java.lang.Object invoke() {
            r24 = this;
            r0 = r24
            int r1 = r0.f11502
            switch(r1) {
                case 0: goto L1f9;
                case 1: goto L1de;
                case 2: goto Lb6;
                case 3: goto La6;
                case 4: goto L79;
                case 5: goto L52;
                case 6: goto L31;
                case 7: goto L27;
                case 8: goto L1d;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r0.receiver
            cn1 r0 = (p000.cn1) r0
            r0.getClass()
            android.os.Handler r0 = p000.cn1.f2214
            fb0 r1 = new fb0
            r2 = 17
            r1.<init>(r2)
            r0.post(r1)
            s62 r0 = p000.s62.f9751
            return r0
        L1d:
            java.lang.Object r0 = r0.receiver
            d51 r0 = (p000.d51) r0
            r0.m1655()
            s62 r0 = p000.s62.f9751
            return r0
        L27:
            java.lang.Object r0 = r0.receiver
            d51 r0 = (p000.d51) r0
            r0.m1655()
            s62 r0 = p000.s62.f9751
            return r0
        L31:
            java.lang.Object r0 = r0.receiver
            f01 r0 = (p000.f01) r0
            r0.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.f01.f3710
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto L43
            goto L4f
        L43:
            android.os.Handler r0 = p000.f01.f3711
            fb0 r1 = new fb0
            r2 = 11
            r1.<init>(r2)
            r0.post(r1)
        L4f:
            s62 r0 = p000.s62.f9751
            return r0
        L52:
            java.lang.Object r0 = r0.receiver
            yz0 r0 = (p000.yz0) r0
            r0.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.yz0.f12892
            r1 = 1
            r2 = 0
            boolean r1 = r0.compareAndSet(r2, r1)
            if (r1 != 0) goto L64
            goto L76
        L64:
            android.os.Handler r1 = p000.yz0.f12888
            fb0 r3 = new fb0
            r4 = 8
            r3.<init>(r4)
            boolean r1 = r1.post(r3)
            if (r1 != 0) goto L76
            r0.set(r2)
        L76:
            s62 r0 = p000.s62.f9751
            return r0
        L79:
            java.lang.Object r0 = r0.receiver
            ht0 r0 = (p000.ht0) r0
            r0.getClass()
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L89
            r0 = 1065353216(0x3f800000, float:1.0)
            goto La1
        L89:
            java.lang.String r0 = "liquid_glass_bottom_bar_scale_percent"
            r1 = 100
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L95
            int r1 = r2.getInt(r0, r1)     // Catch: java.lang.Throwable -> L95
        L95:
            r0 = 50
            r2 = 150(0x96, float:2.1E-43)
            int r0 = p000.j81.m2906(r1, r0, r2)
            float r0 = (float) r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r1
        La1:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        La6:
            java.lang.Object r0 = r0.receiver
            ht0 r0 = (p000.ht0) r0
            r0.getClass()
            boolean r0 = p000.ht0.m2531()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        Lb6:
            java.lang.Object r0 = r0.receiver
            s40 r0 = (p000.s40) r0
            c21 r1 = r0.f9708
            c21 r2 = r0.f9709
            y40 r3 = r0.f9706
            c50 r4 = r3.m6827()
            r12 = 0
            r13 = 8
            r14 = 0
            if (r4 != 0) goto L111
            java.lang.Object[] r4 = r2.f1942
            long[] r15 = r2.f1941
            r16 = 128(0x80, double:6.3E-322)
            int r5 = r15.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L1c0
            r6 = r14
            r18 = 255(0xff, double:1.26E-321)
        Ld8:
            r7 = r15[r6]
            r24 = 7
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = ~r7
            long r9 = r9 << r24
            long r9 = r9 & r7
            long r9 = r9 & r20
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 == 0) goto L10c
            int r9 = r6 - r5
            int r9 = ~r9
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = r14
        Lf3:
            if (r10 >= r9) goto L10a
            long r22 = r7 & r18
            int r11 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r11 < 0) goto Lff
            long r7 = r7 >> r13
            int r10 = r10 + 1
            goto Lf3
        Lff:
            int r0 = r6 << 3
            int r0 = r0 + r10
            r0 = r4[r0]
            p8 r0 = (p000.C0678p8) r0
            r0.m4386()
            throw r12
        L10a:
            if (r9 != r13) goto L1c0
        L10c:
            if (r6 == r5) goto L1c0
            int r6 = r6 + 1
            goto Ld8
        L111:
            r24 = 7
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            boolean r5 = r4.f8784
            if (r5 == 0) goto L1c0
            boolean r5 = r1.m1109(r4)
            if (r5 == 0) goto L129
            r4.m1138()
        L129:
            r4.m1137()
            q01 r5 = r4.f8771
            boolean r5 = r5.f8784
            if (r5 != 0) goto L137
            java.lang.String r5 = "visitAncestors called on an unattached node"
            p000.am0.m178(r5)
        L137:
            q01 r5 = r4.f8771
            yp0 r4 = p000.h62.m2445(r4)
            r6 = r14
        L13e:
            if (r4 == 0) goto L184
            k31 r7 = r4.f12733
            q01 r7 = r7.f5729
            int r7 = r7.f8774
            r7 = r7 & 5120(0x1400, float:7.175E-42)
            if (r7 == 0) goto L175
        L14a:
            if (r5 == 0) goto L175
            int r7 = r5.f8773
            r8 = r7 & 5120(0x1400, float:7.175E-42)
            if (r8 == 0) goto L172
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L158
            int r6 = r6 + 1
        L158:
            boolean r7 = r5 instanceof p000.C0678p8
            if (r7 == 0) goto L172
            boolean r7 = r2.m1109(r5)
            if (r7 != 0) goto L163
            goto L172
        L163:
            r0 = 1
            if (r6 > r0) goto L16c
            p8 r5 = (p000.C0678p8) r5
            r5.m4386()
            throw r12
        L16c:
            p8 r5 = (p000.C0678p8) r5
            r5.m4386()
            throw r12
        L172:
            q01 r5 = r5.f8775
            goto L14a
        L175:
            yp0 r4 = r4.m7005()
            if (r4 == 0) goto L182
            k31 r5 = r4.f12733
            if (r5 == 0) goto L182
            q22 r5 = r5.f5728
            goto L13e
        L182:
            r5 = r12
            goto L13e
        L184:
            java.lang.Object[] r4 = r2.f1942
            long[] r5 = r2.f1941
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L1c0
            r7 = r14
        L18e:
            r8 = r5[r7]
            long r10 = ~r8
            long r10 = r10 << r24
            long r10 = r10 & r8
            long r10 = r10 & r20
            int r10 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r10 == 0) goto L1bb
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r11 = r14
        L1a2:
            if (r11 >= r10) goto L1b9
            long r22 = r8 & r18
            int r15 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r15 < 0) goto L1ae
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L1a2
        L1ae:
            int r0 = r7 << 3
            int r0 = r0 + r11
            r0 = r4[r0]
            p8 r0 = (p000.C0678p8) r0
            r0.m4386()
            throw r12
        L1b9:
            if (r10 != r13) goto L1c0
        L1bb:
            if (r7 == r6) goto L1c0
            int r7 = r7 + 1
            goto L18e
        L1c0:
            c50 r4 = r3.m6827()
            if (r4 == 0) goto L1d0
            c50 r4 = r3.f12447
            b50 r4 = r4.m1137()
            b50 r5 = p000.b50.f1478
            if (r4 != r5) goto L1d3
        L1d0:
            r3.m6824()
        L1d3:
            r1.m1108()
            r2.m1108()
            r0.f9710 = r14
            s62 r0 = p000.s62.f9751
            return r0
        L1de:
            java.lang.Object r0 = r0.receiver
            tg r0 = (p000.C0834tg) r0
            r0.getClass()
            boolean r0 = p000.C0834tg.m5640()
            if (r0 == 0) goto L1f3
            int r0 = p000.AbstractC0871ug.f10784
            r1 = 100
            if (r0 >= r1) goto L1f3
            r0 = 1
            goto L1f4
        L1f3:
            r0 = 0
        L1f4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1f9:
            java.lang.Object r0 = r0.receiver
            android.view.View r0 = (android.view.View) r0
            r1 = 1
            r0.setImportantForContentCapture(r1)
            android.view.contentcapture.ContentCaptureSession r1 = r0.getContentCaptureSession()
            if (r1 != 0) goto L209
            r0 = 0
            goto L212
        L209:
            n5 r2 = new n5
            r3 = 8
            r4 = 0
            r2.<init>(r3, r1, r0, r4)
            r0 = r2
        L212:
            return r0
    }
}
