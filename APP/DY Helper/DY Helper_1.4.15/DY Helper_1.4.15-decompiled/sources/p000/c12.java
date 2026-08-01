package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class c12 implements p000.ss1, p000.InterfaceC0850tw {

    /* JADX INFO: renamed from: α */
    public final p000.ss1 f1932;

    /* JADX INFO: renamed from: β */
    public final int f1933;

    /* JADX INFO: renamed from: γ */
    public final int f1934;

    public c12(p000.ss1 r1, int r2, int r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f1932 = r1
            r0.f1933 = r2
            r0.f1934 = r3
            if (r2 < 0) goto L2b
            if (r3 < 0) goto L20
            if (r3 < r2) goto L13
            return
        L13:
            java.lang.String r0 = "endIndex should be not less than startIndex, but was "
            java.lang.String r1 = " < "
            java.lang.String r0 = p000.AbstractC0602nx.m4125(r3, r2, r0, r1)
            p000.C1080.m7266(r0)
            r0 = 0
            throw r0
        L20:
            java.lang.String r0 = "endIndex should be non-negative, but is "
            java.lang.String r0 = p000.a12.m17(r0, r3)
            p000.C1080.m7266(r0)
            r0 = 0
            throw r0
        L2b:
            java.lang.String r0 = "startIndex should be non-negative, but is "
            java.lang.String r0 = p000.a12.m17(r0, r2)
            p000.C1080.m7266(r0)
            r0 = 0
            throw r0
    }

    @Override // p000.ss1
    public final java.util.Iterator iterator() {
            r1 = this;
            f90 r0 = new f90
            r0.<init>(r1)
            return r0
    }

    @Override // p000.InterfaceC0850tw
    /* JADX INFO: renamed from: α */
    public final p000.ss1 mo1105(int r3) {
            r2 = this;
            int r0 = r2.f1934
            int r1 = r2.f1933
            int r0 = r0 - r1
            if (r3 < r0) goto L8
            return r2
        L8:
            c12 r0 = new c12
            ss1 r2 = r2.f1932
            int r3 = r3 + r1
            r0.<init>(r2, r1, r3)
            return r0
    }

    @Override // p000.InterfaceC0850tw
    /* JADX INFO: renamed from: β */
    public final p000.ss1 mo1106(int r4) {
            r3 = this;
            int r0 = r3.f1934
            int r1 = r3.f1933
            int r2 = r0 - r1
            if (r4 < r2) goto Lb
            mz r3 = p000.C0567mz.f7331
            return r3
        Lb:
            c12 r2 = new c12
            ss1 r3 = r3.f1932
            int r1 = r1 + r4
            r2.<init>(r3, r1, r0)
            return r2
    }
}
