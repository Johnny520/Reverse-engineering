package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class fq0 implements p000.i12 {

    /* JADX INFO: renamed from: ε */
    public p000.np0 f4063;

    /* JADX INFO: renamed from: ζ */
    public float f4064;

    /* JADX INFO: renamed from: η */
    public float f4065;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.kq0 f4066;

    public fq0(p000.kq0 r1) {
            r0 = this;
            r0.<init>()
            r0.f4066 = r1
            np0 r1 = p000.np0.f7702
            r0.f4063 = r1
            return
    }

    @Override // p000.rx0
    public final p000.np0 getLayoutDirection() {
            r0 = this;
            np0 r0 = r0.f4063
            return r0
    }

    @Override // p000.rx0
    /* JADX INFO: renamed from: Ν */
    public final p000.qx0 mo1609(int r10, int r11, java.util.Map r12, p000.a80 r13, p000.a80 r14) {
            r9 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r10 & r0
            if (r1 != 0) goto La
            r0 = r0 & r11
            if (r0 != 0) goto La
            goto L28
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Size("
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r1 = " x "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = ") is out of range. Each dimension must be between 0 and 16777215."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p000.am0.m178(r0)
        L28:
            eq0 r1 = new eq0
            kq0 r7 = r9.f4066
            r6 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: β */
    public final float mo586() {
            r0 = this;
            float r0 = r0.f4064
            return r0
    }

    @Override // p000.InterfaceC1031yr
    /* JADX INFO: renamed from: θ */
    public final float mo590() {
            r0 = this;
            float r0 = r0.f4065
            return r0
    }

    @Override // p000.rx0
    /* JADX INFO: renamed from: ν */
    public final boolean mo1610() {
            r1 = this;
            kq0 r1 = r1.f4066
            yp0 r1 = r1.f6080
            bq0 r1 = r1.f12734
            up0 r1 = r1.f1803
            up0 r0 = p000.up0.f10922
            if (r1 == r0) goto L13
            up0 r0 = p000.up0.f10920
            if (r1 != r0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    @Override // p000.i12
    /* JADX INFO: renamed from: φ */
    public final java.util.List mo1611(p000.e80 r11) {
            r10 = this;
            kq0 r10 = r10.f4066
            r10.m3406()
            yp0 r0 = r10.f6080
            bq0 r1 = r0.f12734
            up0 r1 = r1.f1803
            up0 r2 = p000.up0.f10921
            up0 r3 = p000.up0.f10919
            if (r1 == r3) goto L21
            if (r1 == r2) goto L21
            up0 r4 = p000.up0.f10920
            if (r1 == r4) goto L21
            up0 r4 = p000.up0.f10922
            if (r1 != r4) goto L1c
            goto L21
        L1c:
            java.lang.String r4 = "subcompose can only be used inside the measure or layout blocks"
            p000.am0.m178(r4)
        L21:
            b21 r4 = r10.f6085
            s62 r5 = p000.s62.f9751
            java.lang.Object r6 = r4.m695(r5)
            r7 = 1
            if (r6 != 0) goto L69
            b21 r6 = r10.f6088
            java.lang.Object r6 = r6.m699(r5)
            yp0 r6 = (p000.yp0) r6
            if (r6 == 0) goto L4f
            b21 r8 = r10.f6084
            java.lang.Object r8 = r8.m695(r6)
            dq0 r8 = (p000.dq0) r8
            int r8 = r10.f6093
            if (r8 <= 0) goto L43
            goto L48
        L43:
            java.lang.String r8 = "Check failed."
            p000.am0.m178(r8)
        L48:
            int r8 = r10.f6093
            int r8 = r8 + (-1)
            r10.f6093 = r8
            goto L66
        L4f:
            yp0 r6 = r10.m3411()
            if (r6 != 0) goto L66
            int r6 = r10.f6082
            yp0 r8 = new yp0
            r9 = 2
            r8.<init>(r9)
            r0.f12758 = r7
            r0.m6971(r6, r8)
            r6 = 0
            r0.f12758 = r6
            r6 = r8
        L66:
            r4.m701(r5, r6)
        L69:
            yp0 r6 = (p000.yp0) r6
            java.util.List r4 = r0.m7000()
            int r8 = r10.f6082
            java.lang.Object r4 = p000.AbstractC0984xh.m6641(r8, r4)
            if (r4 == r6) goto La5
            java.util.List r0 = r0.m7000()
            h21 r0 = (p000.h21) r0
            k21 r0 = r0.f4540
            int r0 = r0.m3134(r6)
            int r4 = r10.f6082
            if (r0 < r4) goto L88
            goto L9e
        L88:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r8 = "Key \""
            r4.<init>(r8)
            r4.append(r5)
            java.lang.String r5 = "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            p000.am0.m177(r4)
        L9e:
            int r4 = r10.f6082
            if (r4 == r0) goto La5
            r10.m3408(r0, r4)
        La5:
            int r0 = r10.f6082
            int r0 = r0 + r7
            r10.f6082 = r0
            an r11 = (p000.C0024an) r11
            r10.m3410(r6, r11)
            if (r1 == r3) goto Lb9
            if (r1 != r2) goto Lb4
            goto Lb9
        Lb4:
            java.util.List r10 = r6.m6998()
            return r10
        Lb9:
            bq0 r10 = r6.f12734
            ox0 r10 = r10.f1815
            java.util.List r10 = r10.m4329()
            return r10
    }
}
