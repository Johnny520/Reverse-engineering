package p000;

/* JADX INFO: renamed from: т */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1120 extends p000.AbstractC1118 {

    /* JADX INFO: renamed from: ε */
    public static p000.C1120 f13461;

    /* JADX INFO: renamed from: ζ */
    public static final p000.rn1 f13462 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.rn1 f13463 = null;

    /* JADX INFO: renamed from: γ */
    public p000.m32 f13464;

    /* JADX INFO: renamed from: δ */
    public p000.bs1 f13465;

    static {
            rn1 r0 = p000.rn1.f9421
            p000.C1120.f13462 = r0
            rn1 r0 = p000.rn1.f9420
            p000.C1120.f13463 = r0
            return
    }

    /* JADX INFO: renamed from: Α */
    public final int m7313(int r5, p000.rn1 r6) {
            r4 = this;
            m32 r0 = r4.f13464
            r1 = 0
            java.lang.String r2 = "layoutResult"
            if (r0 == 0) goto L50
            int r0 = r0.m3722(r5)
            m32 r3 = r4.f13464
            if (r3 == 0) goto L4c
            rn1 r0 = r3.m3724(r0)
            m32 r4 = r4.f13464
            if (r6 == r0) goto L22
            if (r4 == 0) goto L1e
            int r4 = r4.m3722(r5)
            return r4
        L1e:
            p000.ln0.m3650(r2)
            throw r1
        L22:
            if (r4 == 0) goto L48
            g11 r4 = r4.f6924
            r4.m2228(r5)
            java.lang.Object r4 = r4.f4209
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r6 = p000.AbstractC0073bd.m883(r5, r4)
            java.lang.Object r4 = r4.get(r6)
            m91 r4 = (p000.m91) r4
            s2 r6 = r4.f7033
            int r0 = r4.f7036
            int r5 = r5 - r0
            k32 r6 = r6.f9684
            int r5 = r6.m3152(r5)
            int r4 = r4.f7034
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            return r5
        L48:
            p000.ln0.m3650(r2)
            throw r1
        L4c:
            p000.ln0.m3650(r2)
            throw r1
        L50:
            p000.ln0.m3650(r2)
            throw r1
    }

    @Override // p000.AbstractC1118
    /* JADX INFO: renamed from: ζ */
    public final int[] mo7303(int r6) {
            r5 = this;
            java.lang.String r0 = r5.m7306()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto Ld
            goto L8d
        Ld:
            java.lang.String r0 = r5.m7306()
            int r0 = r0.length()
            if (r6 < r0) goto L19
            goto L8d
        L19:
            bs1 r0 = r5.f13465     // Catch: java.lang.IllegalStateException -> L8d
            if (r0 == 0) goto L87
            ml1 r0 = r0.m1012()     // Catch: java.lang.IllegalStateException -> L8d
            float r2 = r0.f7203     // Catch: java.lang.IllegalStateException -> L8d
            float r0 = r0.f7201     // Catch: java.lang.IllegalStateException -> L8d
            float r2 = r2 - r0
            int r0 = java.lang.Math.round(r2)     // Catch: java.lang.IllegalStateException -> L8d
            if (r6 <= 0) goto L2d
            goto L2e
        L2d:
            r6 = 0
        L2e:
            m32 r2 = r5.f13464
            java.lang.String r3 = "layoutResult"
            if (r2 == 0) goto L83
            int r2 = r2.m3720(r6)
            m32 r4 = r5.f13464
            if (r4 == 0) goto L7f
            float r2 = r4.m3723(r2)
            float r0 = (float) r0
            float r2 = r2 + r0
            m32 r0 = r5.f13464
            if (r0 == 0) goto L7b
            g11 r4 = r0.f6924
            int r4 = r4.f4206
            int r4 = r4 + (-1)
            float r0 = r0.m3723(r4)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            m32 r4 = r5.f13464
            if (r0 >= 0) goto L63
            if (r4 == 0) goto L5f
            int r0 = r4.m3721(r2)
        L5c:
            int r0 = r0 + (-1)
            goto L6a
        L5f:
            p000.ln0.m3650(r3)
            throw r1
        L63:
            if (r4 == 0) goto L77
            g11 r0 = r4.f6924
            int r0 = r0.f4206
            goto L5c
        L6a:
            rn1 r1 = p000.C1120.f13463
            int r0 = r5.m7313(r0, r1)
            int r0 = r0 + 1
            int[] r5 = r5.m7305(r6, r0)
            return r5
        L77:
            p000.ln0.m3650(r3)
            throw r1
        L7b:
            p000.ln0.m3650(r3)
            throw r1
        L7f:
            p000.ln0.m3650(r3)
            throw r1
        L83:
            p000.ln0.m3650(r3)
            throw r1
        L87:
            java.lang.String r5 = "node"
            p000.ln0.m3650(r5)     // Catch: java.lang.IllegalStateException -> L8d
            throw r1     // Catch: java.lang.IllegalStateException -> L8d
        L8d:
            return r1
    }

    @Override // p000.AbstractC1118
    /* JADX INFO: renamed from: ψ */
    public final int[] mo7307(int r6) {
            r5 = this;
            java.lang.String r0 = r5.m7306()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto Lc
            return r1
        Lc:
            if (r6 > 0) goto Lf
            return r1
        Lf:
            bs1 r0 = r5.f13465     // Catch: java.lang.IllegalStateException -> L7a
            if (r0 == 0) goto L74
            ml1 r0 = r0.m1012()     // Catch: java.lang.IllegalStateException -> L7a
            float r2 = r0.f7203     // Catch: java.lang.IllegalStateException -> L7a
            float r0 = r0.f7201     // Catch: java.lang.IllegalStateException -> L7a
            float r2 = r2 - r0
            int r0 = java.lang.Math.round(r2)     // Catch: java.lang.IllegalStateException -> L7a
            java.lang.String r2 = r5.m7306()
            int r2 = r2.length()
            if (r2 <= r6) goto L2b
            goto L2c
        L2b:
            r6 = r2
        L2c:
            m32 r2 = r5.f13464
            java.lang.String r3 = "layoutResult"
            if (r2 == 0) goto L70
            int r2 = r2.m3720(r6)
            m32 r4 = r5.f13464
            if (r4 == 0) goto L6c
            float r4 = r4.m3723(r2)
            float r0 = (float) r0
            float r4 = r4 - r0
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L52
            m32 r0 = r5.f13464
            if (r0 == 0) goto L4e
            int r0 = r0.m3721(r4)
            goto L53
        L4e:
            p000.ln0.m3650(r3)
            throw r1
        L52:
            r0 = 0
        L53:
            java.lang.String r1 = r5.m7306()
            int r1 = r1.length()
            if (r6 != r1) goto L61
            if (r0 >= r2) goto L61
            int r0 = r0 + 1
        L61:
            rn1 r1 = p000.C1120.f13462
            int r0 = r5.m7313(r0, r1)
            int[] r5 = r5.m7305(r0, r6)
            return r5
        L6c:
            p000.ln0.m3650(r3)
            throw r1
        L70:
            p000.ln0.m3650(r3)
            throw r1
        L74:
            java.lang.String r5 = "node"
            p000.ln0.m3650(r5)     // Catch: java.lang.IllegalStateException -> L7a
            throw r1     // Catch: java.lang.IllegalStateException -> L7a
        L7a:
            return r1
    }
}
