package p000;

/* JADX INFO: renamed from: sv */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0812sv {
    static {
            return
    }

    /* JADX INFO: renamed from: α */
    public static final java.lang.Object m5571(p000.d22 r12, long r13, p000.AbstractC0695pp r15) {
            boolean r0 = r15 instanceof p000.C0664ov
            if (r0 == 0) goto L13
            r0 = r15
            ov r0 = (p000.C0664ov) r0
            int r1 = r0.f8268
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8268 = r1
            goto L18
        L13:
            ov r0 = new ov
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f8267
            int r1 = r0.f8268
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            tm1 r12 = r0.f8266
            d22 r13 = r0.f8265
            p000.i81.m2649(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5e
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r12)
            r12 = 0
            return r12
        L34:
            p000.i81.m2649(r15)
            e22 r15 = r12.f2867
            vh1 r15 = r15.f3388
            boolean r15 = m5574(r15, r13)
            if (r15 == 0) goto L43
            goto Lc3
        L43:
            tm1 r15 = new tm1
            r15.<init>()
            r15.f10414 = r13
        L4a:
            r0.f8265 = r12
            r0.f8266 = r15
            r0.f8268 = r2
            wh1 r13 = p000.wh1.f11721
            java.lang.Object r13 = r12.m1638(r13, r0)
            cq r14 = p000.EnumC0184cq.f2716
            if (r13 != r14) goto L5b
            return r14
        L5b:
            r11 = r15
            r15 = r13
            r13 = r11
        L5e:
            vh1 r15 = (p000.vh1) r15
            java.lang.Object r14 = r15.f11293
            int r1 = r14.size()
            r4 = 0
            r5 = r4
        L68:
            if (r5 >= r1) goto L7f
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            ai1 r7 = (p000.ai1) r7
            long r7 = r7.f259
            long r9 = r13.f10414
            boolean r7 = p000.u81.m5805(r7, r9)
            if (r7 == 0) goto L7c
            goto L80
        L7c:
            int r5 = r5 + 1
            goto L68
        L7f:
            r6 = r3
        L80:
            ai1 r6 = (p000.ai1) r6
            if (r6 != 0) goto L86
            r6 = r3
            goto Lba
        L86:
            boolean r14 = p000.j81.m2902(r6)
            if (r14 == 0) goto Lae
            java.lang.Object r14 = r15.f11293
            int r15 = r14.size()
        L92:
            if (r4 >= r15) goto La3
            java.lang.Object r1 = r14.get(r4)
            r5 = r1
            ai1 r5 = (p000.ai1) r5
            boolean r5 = r5.f262
            if (r5 == 0) goto La0
            goto La4
        La0:
            int r4 = r4 + 1
            goto L92
        La3:
            r1 = r3
        La4:
            ai1 r1 = (p000.ai1) r1
            if (r1 != 0) goto La9
            goto Lba
        La9:
            long r14 = r1.f259
            r13.f10414 = r14
            goto Lc4
        Lae:
            long r14 = p000.j81.m2884(r6, r2)
            r4 = 0
            boolean r14 = p000.o41.m4203(r14, r4)
            if (r14 != 0) goto Lc4
        Lba:
            if (r6 == 0) goto Lc3
            boolean r12 = r6.m170()
            if (r12 != 0) goto Lc3
            return r6
        Lc3:
            return r3
        Lc4:
            r15 = r13
            goto L4a
    }

    /* JADX INFO: renamed from: β */
    public static final java.lang.Object m5572(p000.d22 r9, long r10, p000.AbstractC0715q8 r12) {
            boolean r0 = r12 instanceof p000.C0701pv
            if (r0 == 0) goto L13
            r0 = r12
            pv r0 = (p000.C0701pv) r0
            int r1 = r0.f8730
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8730 = r1
            goto L18
        L13:
            pv r0 = new pv
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f8729
            int r1 = r0.f8730
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            qm1 r9 = r0.f8728
            um1 r10 = r0.f8727
            ai1 r11 = r0.f8726
            p000.i81.m2649(r12)     // Catch: p000.xh1 -> Lab
            goto L9e
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r9)
            r9 = 0
            return r9
        L34:
            p000.i81.m2649(r12)
            e22 r12 = r9.f2867
            e22 r1 = r9.f2867
            vh1 r12 = r12.f3388
            boolean r12 = m5574(r12, r10)
            if (r12 == 0) goto L44
            goto Laa
        L44:
            vh1 r12 = r1.f3388
            java.lang.Object r12 = r12.f11293
            int r4 = r12.size()
            r5 = 0
        L4d:
            if (r5 >= r4) goto L62
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            ai1 r7 = (p000.ai1) r7
            long r7 = r7.f259
            boolean r7 = p000.u81.m5805(r7, r10)
            if (r7 == 0) goto L5f
            goto L63
        L5f:
            int r5 = r5 + 1
            goto L4d
        L62:
            r6 = r3
        L63:
            r11 = r6
            ai1 r11 = (p000.ai1) r11
            if (r11 != 0) goto L69
            goto Laa
        L69:
            um1 r10 = new um1
            r10.<init>()
            um1 r12 = new um1
            r12.<init>()
            r12.f10912 = r11
            r1.getClass()
            yp0 r1 = p000.h62.m2445(r1)
            g92 r1 = r1.f12728
            long r4 = r1.mo2293()
            qm1 r1 = new qm1     // Catch: p000.xh1 -> Lab
            r1.<init>()     // Catch: p000.xh1 -> Lab
            qv r6 = new qv     // Catch: p000.xh1 -> Lab
            r6.<init>(r1, r12, r10, r3)     // Catch: p000.xh1 -> Lab
            r0.f8726 = r11     // Catch: p000.xh1 -> Lab
            r0.f8727 = r10     // Catch: p000.xh1 -> Lab
            r0.f8728 = r1     // Catch: p000.xh1 -> Lab
            r0.f8730 = r2     // Catch: p000.xh1 -> Lab
            java.lang.Object r9 = r9.m1639(r4, r6, r0)     // Catch: p000.xh1 -> Lab
            cq r12 = p000.EnumC0184cq.f2716
            if (r9 != r12) goto L9d
            return r12
        L9d:
            r9 = r1
        L9e:
            boolean r9 = r9.f9050     // Catch: p000.xh1 -> Lab
            if (r9 == 0) goto Laa
            java.lang.Object r9 = r10.f10912     // Catch: p000.xh1 -> Lab
            ai1 r9 = (p000.ai1) r9     // Catch: p000.xh1 -> Lab
            if (r9 != 0) goto La9
            return r11
        La9:
            return r9
        Laa:
            return r3
        Lab:
            java.lang.Object r9 = r10.f10912
            ai1 r9 = (p000.ai1) r9
            if (r9 != 0) goto Lb2
            goto Lb3
        Lb2:
            r11 = r9
        Lb3:
            return r11
    }

    /* JADX INFO: renamed from: γ */
    public static final java.lang.Object m5573(p000.d22 r4, long r5, p000.a80 r7, p000.AbstractC0715q8 r8) {
            boolean r0 = r8 instanceof p000.C0775rv
            if (r0 == 0) goto L13
            r0 = r8
            rv r0 = (p000.C0775rv) r0
            int r1 = r0.f9524
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9524 = r1
            goto L18
        L13:
            rv r0 = new rv
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f9523
            int r1 = r0.f9524
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            a80 r4 = r0.f9522
            d22 r5 = r0.f9521
            p000.i81.m2649(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p000.C1080.m7279(r4)
            r4 = 0
            return r4
        L32:
            p000.i81.m2649(r8)
        L35:
            r0.f9521 = r4
            r0.f9522 = r7
            r0.f9524 = r2
            java.lang.Object r8 = m5571(r4, r5, r0)
            cq r5 = p000.EnumC0184cq.f2716
            if (r8 != r5) goto L44
            return r5
        L44:
            ai1 r8 = (p000.ai1) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = p000.j81.m2902(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.invoke(r8)
            long r5 = r8.f259
            goto L35
    }

    /* JADX INFO: renamed from: δ */
    public static final boolean m5574(p000.vh1 r6, long r7) {
            java.lang.Object r6 = r6.f11293
            int r0 = r6.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1d
            java.lang.Object r3 = r6.get(r2)
            r4 = r3
            ai1 r4 = (p000.ai1) r4
            long r4 = r4.f259
            boolean r4 = p000.u81.m5805(r4, r7)
            if (r4 == 0) goto L1a
            goto L1e
        L1a:
            int r2 = r2 + 1
            goto L8
        L1d:
            r3 = 0
        L1e:
            ai1 r3 = (p000.ai1) r3
            r6 = 1
            if (r3 == 0) goto L28
            boolean r7 = r3.f262
            if (r7 != r6) goto L28
            r1 = r6
        L28:
            r6 = r6 ^ r1
            return r6
    }
}
