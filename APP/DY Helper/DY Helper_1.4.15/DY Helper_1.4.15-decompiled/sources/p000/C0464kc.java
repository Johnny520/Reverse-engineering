package p000;

/* JADX INFO: renamed from: kc */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0464kc {

    /* JADX INFO: renamed from: α */
    public final p000.InterfaceC1031yr f5845;

    /* JADX INFO: renamed from: β */
    public final long f5846;

    public C0464kc(p000.i12 r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f5845 = r1
            r0.f5846 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof p000.C0464kc
            if (r0 != 0) goto L8
            goto L1f
        L8:
            kc r3 = (p000.C0464kc) r3
            yr r0 = r2.f5845
            yr r1 = r3.f5845
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            long r0 = r2.f5846
            long r2 = r3.f5846
            boolean r2 = p000.C1028yo.m6947(r0, r2)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            yr r0 = r3.f5845
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r3.f5846
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BoxWithConstraintsScopeImpl(density="
            r0.<init>(r1)
            yr r1 = r3.f5845
            r0.append(r1)
            java.lang.String r1 = ", constraints="
            r0.append(r1)
            long r1 = r3.f5846
            java.lang.String r3 = p000.C1028yo.m6956(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: α */
    public final float m3184() {
            r3 = this;
            long r0 = r3.f5846
            boolean r2 = p000.C1028yo.m6948(r0)
            if (r2 == 0) goto L13
            int r0 = p000.C1028yo.m6952(r0)
            yr r3 = r3.f5845
            float r3 = r3.mo597(r0)
            return r3
        L13:
            r3 = 2139095040(0x7f800000, float:Infinity)
            return r3
    }

    /* JADX INFO: renamed from: β */
    public final float m3185() {
            r3 = this;
            long r0 = r3.f5846
            boolean r2 = p000.C1028yo.m6949(r0)
            if (r2 == 0) goto L13
            int r0 = p000.C1028yo.m6953(r0)
            yr r3 = r3.f5845
            float r3 = r3.mo597(r0)
            return r3
        L13:
            r3 = 2139095040(0x7f800000, float:Infinity)
            return r3
    }
}
