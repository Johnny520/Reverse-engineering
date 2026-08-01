package p000;

/* JADX INFO: renamed from: fr */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0295fr extends p000.xl1 {

    /* JADX INFO: renamed from: ε */
    public java.util.ArrayList f4068;

    /* JADX INFO: renamed from: ζ */
    public java.util.ArrayList f4069;

    /* JADX INFO: renamed from: η */
    public java.util.ArrayList f4070;

    /* JADX INFO: renamed from: θ */
    public java.util.ArrayList f4071;

    /* JADX INFO: renamed from: ι */
    public java.util.ArrayList f4072;

    /* JADX INFO: renamed from: κ */
    public java.util.ArrayList f4073;

    /* JADX INFO: renamed from: λ */
    public java.util.ArrayList f4074;

    /* JADX INFO: renamed from: μ */
    public java.util.ArrayList f4075;

    /* JADX INFO: renamed from: ν */
    public java.util.ArrayList f4076;

    /* JADX INFO: renamed from: ξ */
    public java.util.ArrayList f4077;

    /* JADX INFO: renamed from: ο */
    public java.util.ArrayList f4078;

    /* JADX INFO: renamed from: γ */
    public static void m2197(java.util.ArrayList r1) {
            int r0 = r1.size()
            int r0 = r0 + (-1)
            if (r0 >= 0) goto L9
            return
        L9:
            java.lang.ClassCastException r1 = p000.lz1.m3685(r0, r1)
            throw r1
    }

    @Override // p000.xl1
    /* JADX INFO: renamed from: α */
    public final void mo2198() {
            r8 = this;
            java.util.ArrayList r0 = r8.f4074
            java.util.ArrayList r1 = r8.f4072
            java.util.ArrayList r2 = r8.f4073
            java.util.ArrayList r3 = r8.f4071
            java.util.ArrayList r4 = r8.f4069
            java.util.ArrayList r5 = r8.f4068
            java.util.ArrayList r6 = r8.f4070
            int r7 = r6.size()
            int r7 = r7 + (-1)
            if (r7 >= 0) goto Ld8
            int r6 = r5.size()
            int r6 = r6 + (-1)
        L1c:
            if (r6 < 0) goto L34
            java.lang.Object r7 = r5.get(r6)
            if (r7 != 0) goto L30
            rk0 r7 = r8.f12206
            if (r7 != 0) goto L2e
            r5.remove(r6)
            int r6 = r6 + (-1)
            goto L1c
        L2e:
            r8 = 0
            throw r8
        L30:
            p000.C1080.m7264()
            return
        L34:
            int r5 = r4.size()
            int r5 = r5 + (-1)
            if (r5 >= 0) goto Ld3
            int r4 = r3.size()
            int r4 = r4 + (-1)
            if (r4 >= 0) goto Lce
            r3.clear()
            boolean r3 = r8.mo2199()
            if (r3 != 0) goto L4e
            return
        L4e:
            int r3 = r2.size()
            int r3 = r3 + (-1)
        L54:
            if (r3 < 0) goto L6c
            java.lang.Object r4 = r2.get(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r5 = r4.size()
            int r5 = r5 + (-1)
            if (r5 >= 0) goto L67
            int r3 = r3 + (-1)
            goto L54
        L67:
            java.lang.ClassCastException r8 = p000.lz1.m3685(r5, r4)
            throw r8
        L6c:
            int r2 = r1.size()
            int r2 = r2 + (-1)
        L72:
            if (r2 < 0) goto L8a
            java.lang.Object r3 = r1.get(r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            int r4 = r4 + (-1)
            if (r4 >= 0) goto L85
            int r2 = r2 + (-1)
            goto L72
        L85:
            java.lang.ClassCastException r8 = p000.lz1.m3685(r4, r3)
            throw r8
        L8a:
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L90:
            if (r1 < 0) goto La8
            java.lang.Object r2 = r0.get(r1)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            int r3 = r3 + (-1)
            if (r3 >= 0) goto La3
            int r1 = r1 + (-1)
            goto L90
        La3:
            java.lang.ClassCastException r8 = p000.lz1.m3685(r3, r2)
            throw r8
        La8:
            java.util.ArrayList r0 = r8.f4077
            m2197(r0)
            java.util.ArrayList r0 = r8.f4076
            m2197(r0)
            java.util.ArrayList r0 = r8.f4075
            m2197(r0)
            java.util.ArrayList r0 = r8.f4078
            m2197(r0)
            java.util.ArrayList r8 = r8.f12207
            int r0 = r8.size()
            if (r0 > 0) goto Lc8
            r8.clear()
            return
        Lc8:
            r0 = 0
            java.lang.ClassCastException r8 = p000.lz1.m3685(r0, r8)
            throw r8
        Lce:
            java.lang.ClassCastException r8 = p000.lz1.m3685(r4, r3)
            throw r8
        Ld3:
            java.lang.ClassCastException r8 = p000.lz1.m3685(r5, r4)
            throw r8
        Ld8:
            java.lang.ClassCastException r8 = p000.lz1.m3685(r7, r6)
            throw r8
    }

    @Override // p000.xl1
    /* JADX INFO: renamed from: β */
    public final boolean mo2199() {
            r1 = this;
            java.util.ArrayList r0 = r1.f4069
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.f4071
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.f4070
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.f4068
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.f4076
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.f4077
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.f4075
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.f4078
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.f4073
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r0 = r1.f4072
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5b
            java.util.ArrayList r1 = r1.f4074
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L59
            goto L5b
        L59:
            r1 = 0
            return r1
        L5b:
            r1 = 1
            return r1
    }
}
