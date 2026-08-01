package p000;

/* JADX INFO: renamed from: vr */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0920vr implements java.util.Iterator, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public int f11365;

    /* JADX INFO: renamed from: ζ */
    public int f11366;

    /* JADX INFO: renamed from: η */
    public int f11367;

    /* JADX INFO: renamed from: θ */
    public p000.xm0 f11368;

    /* JADX INFO: renamed from: ι */
    public int f11369;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ p000.C0957wr f11370;

    public C0920vr(p000.C0957wr r2) {
            r1 = this;
            r1.<init>()
            r1.f11370 = r2
            r0 = -1
            r1.f11365 = r0
            java.lang.CharSequence r2 = r2.f11802
            int r2 = r2.length()
            r0 = 0
            int r2 = p000.j81.m2906(r0, r0, r2)
            r1.f11366 = r2
            r1.f11367 = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f11365
            r1 = -1
            if (r0 != r1) goto L8
            r2.m6274()
        L8:
            int r2 = r2.f11365
            r0 = 1
            if (r2 != r0) goto Le
            return r0
        Le:
            r2 = 0
            return r2
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f11365
            r1 = -1
            if (r0 != r1) goto L8
            r3.m6274()
        L8:
            int r0 = r3.f11365
            if (r0 == 0) goto L17
            xm0 r0 = r3.f11368
            r0.getClass()
            r2 = 0
            r3.f11368 = r2
            r3.f11365 = r1
            return r0
        L17:
            p000.C1080.m7277()
            r3 = 0
            return r3
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: α */
    public final void m6274() {
            r8 = this;
            wr r0 = r8.f11370
            java.lang.CharSequence r1 = r0.f11802
            int r2 = r8.f11367
            r3 = 0
            if (r2 >= 0) goto Lf
            r8.f11365 = r3
            r0 = 0
            r8.f11368 = r0
            return
        Lf:
            int r4 = r0.f11803
            r5 = -1
            r6 = 1
            if (r4 <= 0) goto L1c
            int r7 = r8.f11369
            int r7 = r7 + r6
            r8.f11369 = r7
            if (r7 >= r4) goto L22
        L1c:
            int r4 = r1.length()
            if (r2 <= r4) goto L36
        L22:
            xm0 r0 = new xm0
            int r2 = r8.f11366
            r1.getClass()
            int r1 = r1.length()
            int r1 = r1 - r6
            r0.<init>(r2, r1, r6)
            r8.f11368 = r0
            r8.f11367 = r5
            goto L7b
        L36:
            e80 r0 = r0.f11804
            int r2 = r8.f11367
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.invoke(r1, r2)
            l91 r0 = (p000.l91) r0
            if (r0 != 0) goto L5a
            xm0 r0 = new xm0
            int r2 = r8.f11366
            r1.getClass()
            int r1 = r1.length()
            int r1 = r1 - r6
            r0.<init>(r2, r1, r6)
            r8.f11368 = r0
            r8.f11367 = r5
            goto L7b
        L5a:
            java.lang.Object r1 = r0.f6502
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.f6503
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r2 = r8.f11366
            xm0 r2 = p000.j81.m2893(r2, r1)
            r8.f11368 = r2
            int r1 = r1 + r0
            r8.f11366 = r1
            if (r0 != 0) goto L78
            r3 = r6
        L78:
            int r1 = r1 + r3
            r8.f11367 = r1
        L7b:
            r8.f11365 = r6
            return
    }
}
