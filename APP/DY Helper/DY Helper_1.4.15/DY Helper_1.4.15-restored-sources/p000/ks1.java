package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ks1 {

    /* JADX INFO: renamed from: α */
    public static final java.util.Comparator[] f6110 = null;

    /* JADX INFO: renamed from: β */
    public static final p000.C0873ui f6111 = null;

    static {
            r0 = 2
            java.util.Comparator[] r1 = new java.util.Comparator[r0]
            r2 = 0
        L4:
            if (r2 >= r0) goto L1d
            if (r2 != 0) goto Lb
            d50 r3 = p000.d50.f2890
            goto Ld
        Lb:
            d50 r3 = p000.d50.f2888
        Ld:
            jd1 r4 = new jd1
            r4.<init>(r3)
            jd1 r3 = new jd1
            r5 = 3
            r3.<init>(r5, r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L4
        L1d:
            p000.ks1.f6110 = r1
            ui r0 = p000.C0873ui.f10820
            p000.ks1.f6111 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m3412(p000.bs1 r3, java.util.ArrayList r4, p000.C0060b0 r5, p000.C0060b0 r6, p000.n11 r7) {
            xr1 r0 = r3.f1824
            is1 r1 = p000.fs1.f4110
            b21 r0 = r0.f12268
            java.lang.Object r0 = r0.m695(r1)
            if (r0 != 0) goto Le
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        Le:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L22
            java.lang.Object r1 = r6.invoke(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L31
        L22:
            java.lang.Object r1 = r5.invoke(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L31
            r4.add(r3)
        L31:
            r1 = 7
            if (r0 == 0) goto L42
            int r4 = r3.f1826
            java.util.List r0 = p000.bs1.m1005(r1, r3)
            java.util.ArrayList r3 = m3413(r3, r5, r6, r0)
            r7.m3942(r4, r3)
            return
        L42:
            java.util.List r3 = p000.bs1.m1005(r1, r3)
            int r0 = r3.size()
            r1 = 0
        L4b:
            if (r1 >= r0) goto L59
            java.lang.Object r2 = r3.get(r1)
            bs1 r2 = (p000.bs1) r2
            m3412(r2, r4, r5, r6, r7)
            int r1 = r1 + 1
            goto L4b
        L59:
            return
    }

    /* JADX INFO: renamed from: β */
    public static final java.util.ArrayList m3413(p000.bs1 r17, p000.C0060b0 r18, p000.C0060b0 r19, java.util.List r20) {
            r0 = r19
            n11 r1 = p000.tm0.f10413
            n11 r1 = new n11
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r20.size()
            r5 = 0
        L13:
            if (r5 >= r3) goto L25
            r6 = r20
            java.lang.Object r7 = r6.get(r5)
            bs1 r7 = (p000.bs1) r7
            r8 = r18
            m3412(r7, r2, r8, r0, r1)
            int r5 = r5 + 1
            goto L13
        L25:
            r5 = r17
            yp0 r3 = r5.f1823
            np0 r3 = r3.f12727
            np0 r5 = p000.np0.f7702
            r6 = 1
            if (r3 != r5) goto L32
            r3 = r6
            goto L33
        L32:
            r3 = 0
        L33:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r7 = r2.size()
            r8 = 2
            int r7 = r7 / r8
            r5.<init>(r7)
            int r7 = r2.size()
            int r7 = r7 - r6
            if (r7 < 0) goto Lf7
            r9 = 0
        L46:
            java.lang.Object r10 = r2.get(r9)
            bs1 r10 = (p000.bs1) r10
            if (r9 == 0) goto Ld8
            ml1 r11 = r10.m1013()
            float r11 = r11.f7201
            ml1 r12 = r10.m1013()
            float r12 = r12.f7203
            int r13 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r13 < 0) goto L60
            r13 = r6
            goto L61
        L60:
            r13 = 0
        L61:
            int r14 = r5.size()
            int r14 = r14 - r6
            if (r14 < 0) goto Ld8
            r15 = 0
        L69:
            java.lang.Object r16 = r5.get(r15)
            r4 = r16
            l91 r4 = (p000.l91) r4
            java.lang.Object r4 = r4.f6502
            ml1 r4 = (p000.ml1) r4
            r17 = r6
            float r6 = r4.f7201
            float r8 = r4.f7203
            int r16 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r16 < 0) goto L82
            r16 = r17
            goto L84
        L82:
            r16 = 0
        L84:
            if (r13 != 0) goto Ld0
            if (r16 != 0) goto Ld0
            float r6 = java.lang.Math.max(r11, r6)
            float r16 = java.lang.Math.min(r12, r8)
            int r6 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r6 >= 0) goto Ld0
            ml1 r6 = new ml1
            float r13 = r4.f7200
            r14 = 0
            float r13 = java.lang.Math.max(r13, r14)
            float r14 = r4.f7201
            float r11 = java.lang.Math.max(r14, r11)
            float r4 = r4.f7202
            r14 = 2139095040(0x7f800000, float:Infinity)
            float r4 = java.lang.Math.min(r4, r14)
            float r8 = java.lang.Math.min(r8, r12)
            r6.<init>(r13, r11, r4, r8)
            l91 r4 = new l91
            java.lang.Object r8 = r5.get(r15)
            l91 r8 = (p000.l91) r8
            java.lang.Object r8 = r8.f6503
            r4.<init>(r6, r8)
            r5.set(r15, r4)
            java.lang.Object r4 = r5.get(r15)
            l91 r4 = (p000.l91) r4
            java.lang.Object r4 = r4.f6503
            java.util.List r4 = (java.util.List) r4
            r4.add(r10)
            goto Lee
        Ld0:
            if (r15 == r14) goto Lda
            int r15 = r15 + 1
            r8 = 2
            r6 = r17
            goto L69
        Ld8:
            r17 = r6
        Lda:
            ml1 r4 = r10.m1013()
            l91 r6 = new l91
            bs1[] r8 = new p000.bs1[]{r10}
            java.util.ArrayList r8 = p000.AbstractC1021yh.m6899(r8)
            r6.<init>(r4, r8)
            r5.add(r6)
        Lee:
            if (r9 == r7) goto Lf9
            int r9 = r9 + 1
            r8 = 2
            r6 = r17
            goto L46
        Lf7:
            r17 = r6
        Lf9:
            d50 r2 = p000.d50.f2891
            p000.AbstractC0019ai.m168(r5, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Comparator[] r4 = p000.ks1.f6110
            r3 = r3 ^ 1
            r3 = r4[r3]
            int r4 = r5.size()
            r6 = 0
        L10e:
            if (r6 >= r4) goto L127
            java.lang.Object r7 = r5.get(r6)
            l91 r7 = (p000.l91) r7
            java.lang.Object r8 = r7.f6503
            java.util.List r8 = (java.util.List) r8
            p000.AbstractC0019ai.m168(r8, r3)
            java.lang.Object r7 = r7.f6503
            java.util.Collection r7 = (java.util.Collection) r7
            r2.addAll(r7)
            int r6 = r6 + 1
            goto L10e
        L127:
            lm r3 = new lm
            ui r4 = p000.ks1.f6111
            r5 = 2
            r3.<init>(r5, r4)
            p000.AbstractC0019ai.m168(r2, r3)
            r4 = 0
        L133:
            int r3 = r2.size()
            int r3 = r3 + (-1)
            if (r4 > r3) goto L16d
            java.lang.Object r3 = r2.get(r4)
            bs1 r3 = (p000.bs1) r3
            int r3 = r3.f1826
            java.lang.Object r3 = r1.m5525(r3)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L16a
            java.lang.Object r5 = r2.get(r4)
            java.lang.Object r5 = r0.invoke(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L15f
            r2.remove(r4)
            goto L161
        L15f:
            int r4 = r4 + 1
        L161:
            r2.addAll(r4, r3)
            int r3 = r3.size()
            int r4 = r4 + r3
            goto L133
        L16a:
            int r4 = r4 + 1
            goto L133
        L16d:
            return r2
    }
}
