package p000;

/* JADX INFO: renamed from: kl */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0473kl {

    /* JADX INFO: renamed from: α */
    public p000.C0289fl f5991;

    /* JADX INFO: renamed from: β */
    public p000.C0252el f5992;

    /* JADX INFO: renamed from: γ */
    public boolean f5993;

    /* JADX INFO: renamed from: δ */
    public final java.util.List f5994;

    /* JADX INFO: renamed from: ε */
    public boolean f5995;

    public C0473kl(p000.C0289fl r2, p000.C0252el r3) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.getClass()
            r1.<init>()
            r1.f5991 = r2
            r1.f5992 = r3
            r2 = 0
            r1.f5993 = r2
            r1.f5994 = r0
            r1.f5995 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3a
        L3:
            boolean r0 = r3 instanceof p000.C0473kl
            if (r0 != 0) goto L8
            goto L38
        L8:
            kl r3 = (p000.C0473kl) r3
            fl r0 = r2.f5991
            fl r1 = r3.f5991
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L38
        L15:
            el r0 = r2.f5992
            el r1 = r3.f5992
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L38
        L20:
            boolean r0 = r2.f5993
            boolean r1 = r3.f5993
            if (r0 == r1) goto L27
            goto L38
        L27:
            java.util.List r0 = r2.f5994
            java.util.List r1 = r3.f5994
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L32
            goto L38
        L32:
            boolean r2 = r2.f5995
            boolean r3 = r3.f5995
            if (r2 == r3) goto L3a
        L38:
            r2 = 0
            return r2
        L3a:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            fl r0 = r3.f5991
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            el r2 = r3.f5992
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.f5993
            int r0 = p000.lz1.m3678(r2, r1, r0)
            java.util.List r2 = r3.f5994
            int r0 = p000.a12.m16(r2, r0, r1)
            boolean r3 = r3.f5995
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r6 = this;
            fl r0 = r6.f5991
            el r1 = r6.f5992
            boolean r2 = r6.f5993
            boolean r3 = r6.f5995
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "TrackedState(binding="
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = ", baseline="
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = ", applied="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ", contentSpans="
            r4.append(r0)
            java.util.List r6 = r6.f5994
            r4.append(r6)
            java.lang.String r6 = ", replacedText="
            r4.append(r6)
            java.lang.String r6 = ")"
            java.lang.String r6 = p000.lz1.m3693(r4, r3, r6)
            return r6
    }
}
