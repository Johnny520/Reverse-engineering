package p000;

/* JADX INFO: renamed from: ti */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0836ti implements p000.InterfaceC0880up, java.io.Serializable {

    /* JADX INFO: renamed from: ε */
    public final p000.InterfaceC0880up f10384;

    /* JADX INFO: renamed from: ζ */
    public final p000.InterfaceC0806sp f10385;

    public C0836ti(p000.InterfaceC0806sp r1, p000.InterfaceC0880up r2) {
            r0 = this;
            r2.getClass()
            r1.getClass()
            r0.<init>()
            r0.f10384 = r2
            r0.f10385 = r1
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r6 == r7) goto L5e
            boolean r0 = r7 instanceof p000.C0836ti
            r1 = 0
            if (r0 == 0) goto L5d
            ti r7 = (p000.C0836ti) r7
            r0 = 2
            r2 = r7
            r3 = r0
        Lc:
            up r2 = r2.f10384
            boolean r4 = r2 instanceof p000.C0836ti
            r5 = 0
            if (r4 == 0) goto L16
            ti r2 = (p000.C0836ti) r2
            goto L17
        L16:
            r2 = r5
        L17:
            if (r2 != 0) goto L5a
            r2 = r6
        L1a:
            up r2 = r2.f10384
            boolean r4 = r2 instanceof p000.C0836ti
            if (r4 == 0) goto L23
            ti r2 = (p000.C0836ti) r2
            goto L24
        L23:
            r2 = r5
        L24:
            if (r2 != 0) goto L57
            if (r3 != r0) goto L5d
        L28:
            sp r0 = r6.f10385
            tp r2 = r0.getKey()
            sp r2 = r7.mo1785(r2)
            boolean r0 = p000.ln0.m3626(r2, r0)
            if (r0 != 0) goto L3a
            r6 = r1
            goto L54
        L3a:
            up r6 = r6.f10384
            boolean r0 = r6 instanceof p000.C0836ti
            if (r0 == 0) goto L43
            ti r6 = (p000.C0836ti) r6
            goto L28
        L43:
            r6.getClass()
            sp r6 = (p000.InterfaceC0806sp) r6
            tp r0 = r6.getKey()
            sp r7 = r7.mo1785(r0)
            boolean r6 = p000.ln0.m3626(r7, r6)
        L54:
            if (r6 == 0) goto L5d
            goto L5e
        L57:
            int r0 = r0 + 1
            goto L1a
        L5a:
            int r3 = r3 + 1
            goto Lc
        L5d:
            return r1
        L5e:
            r6 = 1
            return r6
    }

    public final int hashCode() {
            r1 = this;
            up r0 = r1.f10384
            int r0 = r0.hashCode()
            sp r1 = r1.f10385
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            ig r1 = new ig
            r2 = 5
            r1.<init>(r2)
            java.lang.String r2 = ""
            java.lang.Object r3 = r3.mo1787(r1, r2)
            java.lang.String r3 = (java.lang.String) r3
            r1 = 93
            java.lang.String r3 = p000.AbstractC0602nx.m4132(r0, r3, r1)
            return r3
    }

    @Override // p000.InterfaceC0880up
    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC0880up mo1784(p000.InterfaceC0880up r3) {
            r2 = this;
            r3.getClass()
            hz r0 = p000.C0377hz.f4846
            if (r3 != r0) goto L8
            return r2
        L8:
            ig r0 = new ig
            r1 = 6
            r0.<init>(r1)
            java.lang.Object r2 = r3.mo1787(r0, r2)
            up r2 = (p000.InterfaceC0880up) r2
            return r2
    }

    @Override // p000.InterfaceC0880up
    /* JADX INFO: renamed from: θ */
    public final p000.InterfaceC0806sp mo1785(p000.InterfaceC0843tp r2) {
            r1 = this;
            r2.getClass()
        L3:
            sp r0 = r1.f10385
            sp r0 = r0.mo1785(r2)
            if (r0 == 0) goto Lc
            return r0
        Lc:
            up r1 = r1.f10384
            boolean r0 = r1 instanceof p000.C0836ti
            if (r0 == 0) goto L15
            ti r1 = (p000.C0836ti) r1
            goto L3
        L15:
            sp r1 = r1.mo1785(r2)
            return r1
    }

    @Override // p000.InterfaceC0880up
    /* JADX INFO: renamed from: λ */
    public final java.lang.Object mo1787(p000.e80 r2, java.lang.Object r3) {
            r1 = this;
            up r0 = r1.f10384
            java.lang.Object r3 = r0.mo1787(r2, r3)
            sp r1 = r1.f10385
            java.lang.Object r1 = r2.invoke(r3, r1)
            return r1
    }

    @Override // p000.InterfaceC0880up
    /* JADX INFO: renamed from: ξ */
    public final p000.InterfaceC0880up mo1788(p000.InterfaceC0843tp r4) {
            r3 = this;
            r4.getClass()
            sp r0 = r3.f10385
            sp r1 = r0.mo1785(r4)
            up r2 = r3.f10384
            if (r1 == 0) goto Le
            return r2
        Le:
            up r4 = r2.mo1788(r4)
            if (r4 != r2) goto L15
            return r3
        L15:
            hz r3 = p000.C0377hz.f4846
            if (r4 != r3) goto L1a
            return r0
        L1a:
            ti r3 = new ti
            r3.<init>(r0, r4)
            return r3
    }
}
