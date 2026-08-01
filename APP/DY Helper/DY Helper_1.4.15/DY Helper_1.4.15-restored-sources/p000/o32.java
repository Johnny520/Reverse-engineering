package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class o32 {

    /* JADX INFO: renamed from: α */
    public final p000.ux1 f7935;

    /* JADX INFO: renamed from: β */
    public final p000.ux1 f7936;

    /* JADX INFO: renamed from: γ */
    public final p000.ux1 f7937;

    /* JADX INFO: renamed from: δ */
    public final p000.ux1 f7938;

    public o32(p000.ux1 r1, p000.ux1 r2, p000.ux1 r3, p000.ux1 r4) {
            r0 = this;
            r0.<init>()
            r0.f7935 = r1
            r0.f7936 = r2
            r0.f7937 = r3
            r0.f7938 = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L3b
            boolean r2 = r5 instanceof p000.o32
            if (r2 != 0) goto Lc
            goto L3b
        Lc:
            o32 r5 = (p000.o32) r5
            ux1 r2 = r5.f7935
            ux1 r3 = r4.f7935
            boolean r2 = p000.ln0.m3626(r3, r2)
            if (r2 != 0) goto L19
            return r1
        L19:
            ux1 r2 = r4.f7936
            ux1 r3 = r5.f7936
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L24
            return r1
        L24:
            ux1 r2 = r4.f7937
            ux1 r3 = r5.f7937
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L2f
            return r1
        L2f:
            ux1 r4 = r4.f7938
            ux1 r5 = r5.f7938
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L3a
            return r1
        L3a:
            return r0
        L3b:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            ux1 r1 = r3.f7935
            if (r1 == 0) goto La
            int r1 = r1.hashCode()
            goto Lb
        La:
            r1 = r0
        Lb:
            int r1 = r1 * 31
            ux1 r2 = r3.f7936
            if (r2 == 0) goto L16
            int r2 = r2.hashCode()
            goto L17
        L16:
            r2 = r0
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            ux1 r2 = r3.f7937
            if (r2 == 0) goto L23
            int r2 = r2.hashCode()
            goto L24
        L23:
            r2 = r0
        L24:
            int r1 = r1 + r2
            int r1 = r1 * 31
            ux1 r3 = r3.f7938
            if (r3 == 0) goto L2f
            int r0 = r3.hashCode()
        L2f:
            int r1 = r1 + r0
            return r1
    }
}
