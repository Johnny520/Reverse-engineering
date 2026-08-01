package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class p30 extends p000.AbstractC1095 {

    /* JADX INFO: renamed from: η */
    public final java.util.ArrayDeque f8403;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.C0188cu f8404;

    public p30(p000.C0188cu r3) {
            r2 = this;
            r2.<init>()
            r2.f8404 = r3
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.f8403 = r0
            java.lang.Object r3 = r3.f2750
            java.io.File r3 = (java.io.File) r3
            boolean r1 = r3.isDirectory()
            if (r1 == 0) goto L1e
            l30 r2 = r2.m4380(r3)
            r0.push(r2)
            return
        L1e:
            boolean r1 = r3.isFile()
            if (r1 == 0) goto L2d
            n30 r2 = new n30
            r2.<init>(r3)
            r0.push(r2)
            return
        L2d:
            r3 = 2
            r2.f13415 = r3
            return
    }

    @Override // p000.AbstractC1095
    /* JADX INFO: renamed from: α */
    public final void mo1025() {
            r4 = this;
        L0:
            java.util.ArrayDeque r0 = r4.f8403
            java.lang.Object r1 = r0.peek()
            q30 r1 = (p000.q30) r1
            if (r1 != 0) goto Lc
            r0 = 0
            goto L37
        Lc:
            java.io.File r2 = r1.mo3718()
            if (r2 != 0) goto L16
            r0.pop()
            goto L0
        L16:
            java.io.File r1 = r1.f8817
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L36
            boolean r1 = r2.isDirectory()
            if (r1 == 0) goto L36
            int r1 = r0.size()
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 < r3) goto L2e
            goto L36
        L2e:
            l30 r1 = r4.m4380(r2)
            r0.push(r1)
            goto L0
        L36:
            r0 = r2
        L37:
            if (r0 == 0) goto L3f
            r4.f13416 = r0
            r0 = 1
            r4.f13415 = r0
            return
        L3f:
            r0 = 2
            r4.f13415 = r0
            return
    }

    /* JADX INFO: renamed from: β */
    public final p000.l30 m4380(java.io.File r2) {
            r1 = this;
            cu r1 = r1.f8404
            java.lang.Object r1 = r1.f2751
            r30 r1 = (p000.r30) r1
            int r1 = r1.ordinal()
            if (r1 == 0) goto L1a
            r0 = 1
            if (r1 != r0) goto L15
            m30 r1 = new m30
            r1.<init>(r2)
            return r1
        L15:
            p000.C1080.m7272()
            r1 = 0
            return r1
        L1a:
            o30 r1 = new o30
            r1.<init>(r2)
            return r1
    }
}
