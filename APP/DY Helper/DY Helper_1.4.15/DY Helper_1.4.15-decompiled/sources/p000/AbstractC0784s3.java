package p000;

/* JADX INFO: renamed from: s3 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0784s3 {

    /* JADX INFO: renamed from: α */
    public static final p000.pz1 f9700 = null;

    static {
            r0 = 0
            r1 = 7
            r2 = 0
            pz1 r0 = p000.AbstractC0073bd.m893(r2, r2, r0, r1)
            p000.AbstractC0784s3.f9700 = r0
            int r0 = p000.ga2.f4299
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float.floatToRawIntBits(r0)
            java.lang.Float.floatToRawIntBits(r0)
            java.lang.Float.floatToRawIntBits(r0)
            java.lang.Float.floatToRawIntBits(r0)
            return
    }

    /* JADX INFO: renamed from: α */
    public static final p000.c02 m5359(float r10, p000.pz1 r11, java.lang.String r12, p000.v80 r13) {
            pz1 r0 = p000.AbstractC0784s3.f9700
            r1 = 0
            if (r11 != r0) goto L31
            r11 = 1144115775(0x4431d23f, float:711.2851)
            r13.m6082(r11)
            r11 = 1008981770(0x3c23d70a, float:0.01)
            boolean r0 = r13.m6088(r11)
            java.lang.Object r2 = r13.m6073()
            if (r0 != 0) goto L1c
            i2 r0 = p000.C0730qn.f9051
            if (r2 != r0) goto L29
        L1c:
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r0 = 0
            r2 = 3
            pz1 r2 = p000.AbstractC0073bd.m893(r0, r0, r11, r2)
            r13.m6115(r2)
        L29:
            r11 = r2
            pz1 r11 = (p000.pz1) r11
            r13.m6100(r1)
        L2f:
            r4 = r11
            goto L3b
        L31:
            r0 = 1144225701(0x44337fa5, float:717.99445)
            r13.m6082(r0)
            r13.m6100(r1)
            goto L2f
        L3b:
            java.lang.Float r2 = java.lang.Float.valueOf(r10)
            g62 r3 = p000.AbstractC0782s1.f9652
            r8 = 24576(0x6000, float:3.4438E-41)
            r9 = 0
            r5 = 0
            r6 = r12
            r7 = r13
            c02 r10 = m5360(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
    }

    /* JADX INFO: renamed from: β */
    public static final p000.c02 m5360(java.lang.Object r7, p000.g62 r8, p000.InterfaceC0933w3 r9, java.lang.Float r10, java.lang.String r11, p000.v80 r12, int r13, int r14) {
            r11 = r14 & 8
            r13 = 0
            if (r11 == 0) goto L6
            r10 = r13
        L6:
            java.lang.Object r11 = r12.m6073()
            i2 r14 = p000.C0730qn.f9051
            if (r11 != r14) goto L15
            x91 r11 = p000.j81.m2882(r13)
            r12.m6115(r11)
        L15:
            g21 r11 = (p000.g21) r11
            java.lang.Object r0 = r12.m6073()
            if (r0 != r14) goto L25
            o3 r0 = new o3
            r0.<init>(r7, r8, r10)
            r12.m6115(r0)
        L25:
            r3 = r0
            o3 r3 = (p000.C0609o3) r3
            g21 r5 = p000.j81.m2885(r13, r12)
            if (r10 == 0) goto L47
            boolean r8 = r9 instanceof p000.pz1
            if (r8 == 0) goto L47
            r8 = r9
            pz1 r8 = (p000.pz1) r8
            java.lang.Object r0 = r8.f8765
            boolean r0 = p000.ln0.m3626(r0, r10)
            if (r0 != 0) goto L47
            float r9 = r8.f8763
            float r8 = r8.f8764
            pz1 r0 = new pz1
            r0.<init>(r9, r8, r10)
            r9 = r0
        L47:
            g21 r4 = p000.j81.m2885(r9, r12)
            java.lang.Object r8 = r12.m6073()
            if (r8 != r14) goto L5a
            r8 = -1
            r9 = 6
            wc r8 = p000.ln0.m3619(r8, r13, r9)
            r12.m6115(r8)
        L5a:
            r2 = r8
            me r2 = (p000.InterfaceC0546me) r2
            boolean r8 = r12.m6092(r2)
            boolean r9 = r12.m6092(r7)
            r8 = r8 | r9
            java.lang.Object r9 = r12.m6073()
            if (r8 != 0) goto L6e
            if (r9 != r14) goto L77
        L6e:
            p3 r9 = new p3
            r8 = 0
            r9.<init>(r2, r8, r7)
            r12.m6115(r9)
        L77:
            p70 r9 = (p000.p70) r9
            rn r7 = r12.f11148
            ke r7 = r7.f9406
            h81 r7 = r7.f5866
            g61 r8 = p000.g61.f4261
            r7.m2458(r8)
            r8 = 0
            p000.g81.m2286(r7, r8, r9)
            boolean r7 = r12.m6092(r2)
            boolean r8 = r12.m6092(r3)
            r7 = r7 | r8
            boolean r8 = r12.m6090(r4)
            r7 = r7 | r8
            boolean r8 = r12.m6090(r5)
            r7 = r7 | r8
            java.lang.Object r8 = r12.m6073()
            if (r7 != 0) goto La3
            if (r8 != r14) goto Lad
        La3:
            r3 r1 = new r3
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r12.m6115(r1)
            r8 = r1
        Lad:
            e80 r8 = (p000.e80) r8
            p000.AbstractC0978xb.m6580(r8, r12, r2)
            java.lang.Object r7 = r11.getValue()
            c02 r7 = (p000.c02) r7
            if (r7 != 0) goto Lbc
            x3 r7 = r3.f7915
        Lbc:
            return r7
    }
}
