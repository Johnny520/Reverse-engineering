package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class m32 {

    /* JADX INFO: renamed from: α */
    public final p000.l32 f6923;

    /* JADX INFO: renamed from: β */
    public final p000.g11 f6924;

    /* JADX INFO: renamed from: γ */
    public final long f6925;

    /* JADX INFO: renamed from: δ */
    public final float f6926;

    /* JADX INFO: renamed from: ε */
    public final float f6927;

    /* JADX INFO: renamed from: ζ */
    public final java.util.ArrayList f6928;

    public m32(p000.l32 r2, p000.g11 r3, long r4) {
            r1 = this;
            r1.<init>()
            r1.f6923 = r2
            r1.f6924 = r3
            r1.f6925 = r4
            java.lang.Object r2 = r3.f4209
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r4 = r2.isEmpty()
            r5 = 0
            if (r4 == 0) goto L16
            r4 = r5
            goto L25
        L16:
            r4 = 0
            java.lang.Object r0 = r2.get(r4)
            m91 r0 = (p000.m91) r0
            s2 r0 = r0.f7033
            k32 r0 = r0.f9684
            float r4 = r0.m3150(r4)
        L25:
            r1.f6926 = r4
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L2e
            goto L44
        L2e:
            java.lang.Object r2 = p000.AbstractC0984xh.m6645(r2)
            m91 r2 = (p000.m91) r2
            s2 r4 = r2.f7033
            k32 r4 = r4.f9684
            int r5 = r4.f5739
            int r5 = r5 + (-1)
            float r4 = r4.m3150(r5)
            float r2 = r2.f7038
            float r5 = r4 + r2
        L44:
            r1.f6927 = r5
            java.lang.Object r2 = r3.f4208
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r1.f6928 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L46
        L3:
            boolean r0 = r5 instanceof p000.m32
            if (r0 != 0) goto L8
            goto L48
        L8:
            m32 r5 = (p000.m32) r5
            l32 r0 = r5.f6923
            l32 r1 = r4.f6923
            boolean r0 = p000.ln0.m3626(r1, r0)
            if (r0 != 0) goto L15
            goto L48
        L15:
            g11 r0 = r4.f6924
            g11 r1 = r5.f6924
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L48
        L20:
            long r0 = r4.f6925
            long r2 = r5.f6925
            boolean r0 = p000.bn0.m985(r0, r2)
            if (r0 != 0) goto L2b
            goto L48
        L2b:
            float r0 = r4.f6926
            float r1 = r5.f6926
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L48
            float r0 = r4.f6927
            float r1 = r5.f6927
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L48
            java.util.ArrayList r4 = r4.f6928
            java.util.ArrayList r5 = r5.f6928
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L46
            goto L48
        L46:
            r4 = 1
            return r4
        L48:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r5 = this;
            l32 r0 = r5.f6923
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            g11 r2 = r5.f6924
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            long r3 = r5.f6925
            int r0 = p000.lz1.m3677(r2, r1, r3)
            float r2 = r5.f6926
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r2 = r5.f6927
            int r0 = p000.lz1.m3676(r2, r0, r1)
            java.util.ArrayList r5 = r5.f6928
            int r5 = r5.hashCode()
            int r5 = r5 + r0
            return r5
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextLayoutResult(layoutInput="
            r0.<init>(r1)
            l32 r1 = r3.f6923
            r0.append(r1)
            java.lang.String r1 = ", multiParagraph="
            r0.append(r1)
            g11 r1 = r3.f6924
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            long r1 = r3.f6925
            java.lang.String r1 = p000.bn0.m986(r1)
            r0.append(r1)
            java.lang.String r1 = ", firstBaseline="
            r0.append(r1)
            float r1 = r3.f6926
            r0.append(r1)
            java.lang.String r1 = ", lastBaseline="
            r0.append(r1)
            float r1 = r3.f6927
            r0.append(r1)
            java.lang.String r1 = ", placeholderRects="
            r0.append(r1)
            java.util.ArrayList r3 = r3.f6928
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: α */
    public final int m3720(int r2) {
            r1 = this;
            g11 r1 = r1.f6924
            java.lang.Object r0 = r1.f4209
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r1.f4207
            b8 r1 = (p000.C0068b8) r1
            java.lang.Object r1 = r1.f1556
            g4 r1 = (p000.C0309g4) r1
            java.lang.String r1 = r1.f4228
            int r1 = r1.length()
            if (r2 < r1) goto L1b
            int r1 = p000.AbstractC1021yh.m6858(r0)
            goto L23
        L1b:
            if (r2 >= 0) goto L1f
            r1 = 0
            goto L23
        L1f:
            int r1 = p000.AbstractC0073bd.m882(r2, r0)
        L23:
            java.lang.Object r1 = r0.get(r1)
            m91 r1 = (p000.m91) r1
            s2 r0 = r1.f7033
            int r2 = r1.m3799(r2)
            k32 r0 = r0.f9684
            android.text.Layout r0 = r0.f5738
            int r2 = r0.getLineForOffset(r2)
            int r1 = r1.f7036
            int r2 = r2 + r1
            return r2
    }

    /* JADX INFO: renamed from: β */
    public final int m3721(float r8) {
            r7 = this;
            g11 r7 = r7.f6924
            java.lang.Object r7 = r7.f4209
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 0
            if (r0 > 0) goto Ld
            goto L51
        Ld:
            java.lang.Object r0 = p000.AbstractC0984xh.m6645(r7)
            m91 r0 = (p000.m91) r0
            float r0 = r0.f7039
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1
            if (r0 < 0) goto L21
            int r0 = r7.size()
            int r1 = r0 + (-1)
            goto L51
        L21:
            int r0 = r7.size()
            int r0 = r0 - r2
            r3 = r1
        L27:
            if (r3 > r0) goto L4f
            int r4 = r3 + r0
            int r4 = r4 >>> r2
            java.lang.Object r5 = r7.get(r4)
            m91 r5 = (p000.m91) r5
            float r6 = r5.f7038
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L3a
            r5 = r2
            goto L43
        L3a:
            float r5 = r5.f7039
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 > 0) goto L42
            r5 = -1
            goto L43
        L42:
            r5 = r1
        L43:
            if (r5 >= 0) goto L48
            int r3 = r4 + 1
            goto L27
        L48:
            if (r5 <= 0) goto L4d
            int r0 = r4 + (-1)
            goto L27
        L4d:
            r1 = r4
            goto L51
        L4f:
            int r3 = r3 + r2
            int r1 = -r3
        L51:
            java.lang.Object r7 = r7.get(r1)
            m91 r7 = (p000.m91) r7
            int r0 = r7.f7035
            int r1 = r7.f7036
            int r2 = r7.f7034
            int r0 = r0 - r2
            if (r0 != 0) goto L61
            return r1
        L61:
            s2 r0 = r7.f7033
            float r7 = r7.f7038
            float r8 = r8 - r7
            k32 r7 = r0.f9684
            int r8 = (int) r8
            android.text.Layout r0 = r7.f5738
            int r7 = r7.f5740
            int r8 = r8 - r7
            int r7 = r0.getLineForVertical(r8)
            int r7 = r7 + r1
            return r7
    }

    /* JADX INFO: renamed from: γ */
    public final int m3722(int r3) {
            r2 = this;
            g11 r2 = r2.f6924
            r2.m2228(r3)
            java.lang.Object r2 = r2.f4209
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r0 = p000.AbstractC0073bd.m883(r3, r2)
            java.lang.Object r2 = r2.get(r0)
            m91 r2 = (p000.m91) r2
            s2 r0 = r2.f7033
            int r1 = r2.f7036
            int r3 = r3 - r1
            k32 r0 = r0.f9684
            android.text.Layout r0 = r0.f5738
            int r3 = r0.getLineStart(r3)
            int r2 = r2.f7034
            int r3 = r3 + r2
            return r3
    }

    /* JADX INFO: renamed from: δ */
    public final float m3723(int r3) {
            r2 = this;
            g11 r2 = r2.f6924
            r2.m2228(r3)
            java.lang.Object r2 = r2.f4209
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r0 = p000.AbstractC0073bd.m883(r3, r2)
            java.lang.Object r2 = r2.get(r0)
            m91 r2 = (p000.m91) r2
            s2 r0 = r2.f7033
            int r1 = r2.f7036
            int r3 = r3 - r1
            k32 r0 = r0.f9684
            float r3 = r0.m3153(r3)
            float r2 = r2.f7038
            float r3 = r3 + r2
            return r3
    }

    /* JADX INFO: renamed from: ε */
    public final p000.rn1 m3724(int r4) {
            r3 = this;
            g11 r3 = r3.f6924
            java.lang.Object r0 = r3.f4207
            b8 r0 = (p000.C0068b8) r0
            java.lang.Object r0 = r0.f1556
            g4 r0 = (p000.C0309g4) r0
            if (r4 < 0) goto L15
            java.lang.String r1 = r0.f4228
            int r1 = r1.length()
            if (r4 > r1) goto L15
            goto L32
        L15:
            java.lang.String r1 = "offset("
            java.lang.String r2 = ") is out of bounds [0, "
            java.lang.StringBuilder r1 = p000.a12.m19(r4, r1, r2)
            java.lang.String r0 = r0.f4228
            int r0 = r0.length()
            r1.append(r0)
            r0 = 93
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.bm0.m982(r0)
        L32:
            java.lang.Object r0 = r3.f4207
            b8 r0 = (p000.C0068b8) r0
            java.lang.Object r0 = r0.f1556
            g4 r0 = (p000.C0309g4) r0
            java.lang.String r0 = r0.f4228
            int r0 = r0.length()
            java.lang.Object r3 = r3.f4209
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r4 != r0) goto L4b
            int r0 = p000.AbstractC1021yh.m6858(r3)
            goto L4f
        L4b:
            int r0 = p000.AbstractC0073bd.m882(r4, r3)
        L4f:
            java.lang.Object r3 = r3.get(r0)
            m91 r3 = (p000.m91) r3
            s2 r0 = r3.f7033
            int r3 = r3.m3799(r4)
            k32 r4 = r0.f9684
            android.text.Layout r0 = r4.f5738
            int r3 = r0.getLineForOffset(r3)
            android.text.Layout r4 = r4.f5738
            int r3 = r4.getParagraphDirection(r3)
            r4 = 1
            if (r3 != r4) goto L6f
            rn1 r3 = p000.rn1.f9420
            return r3
        L6f:
            rn1 r3 = p000.rn1.f9421
            return r3
    }
}
