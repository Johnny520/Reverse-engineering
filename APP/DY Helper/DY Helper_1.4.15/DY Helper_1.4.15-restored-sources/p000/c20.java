package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class c20 {

    /* JADX INFO: renamed from: α */
    public final long f1935;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f1936;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f1937;

    /* JADX INFO: renamed from: δ */
    public final int f1938;

    /* JADX INFO: renamed from: ε */
    public final p000.e20 f1939;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.ref.WeakReference f1940;

    public c20(long r1, java.lang.String r3, java.lang.String r4, int r5, p000.e20 r6, java.lang.ref.WeakReference r7) {
            r0 = this;
            r4.getClass()
            r0.<init>()
            r0.f1935 = r1
            r0.f1936 = r3
            r0.f1937 = r4
            r0.f1938 = r5
            r0.f1939 = r6
            r0.f1940 = r7
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L43
        L3:
            boolean r0 = r5 instanceof p000.c20
            if (r0 != 0) goto L8
            goto L41
        L8:
            c20 r5 = (p000.c20) r5
            long r0 = r4.f1935
            long r2 = r5.f1935
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L41
        L13:
            java.lang.String r0 = r4.f1936
            java.lang.String r1 = r5.f1936
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            goto L41
        L1e:
            java.lang.String r0 = r4.f1937
            java.lang.String r1 = r5.f1937
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L29
            goto L41
        L29:
            int r0 = r4.f1938
            int r1 = r5.f1938
            if (r0 == r1) goto L30
            goto L41
        L30:
            e20 r0 = r4.f1939
            e20 r1 = r5.f1939
            if (r0 == r1) goto L37
            goto L41
        L37:
            java.lang.ref.WeakReference r4 = r4.f1940
            java.lang.ref.WeakReference r5 = r5.f1940
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L43
        L41:
            r4 = 0
            return r4
        L43:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.f1935
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f1936
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f1937
            int r0 = p000.a12.m15(r0, r1, r2)
            int r2 = r3.f1938
            int r0 = p000.a12.m14(r2, r0, r1)
            e20 r2 = r3.f1939
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.ref.WeakReference r3 = r3.f1940
            int r3 = r3.hashCode()
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DecorInjectCache(generation="
            r0.<init>(r1)
            long r1 = r3.f1935
            r0.append(r1)
            java.lang.String r1 = ", awemeId="
            r0.append(r1)
            java.lang.String r1 = r3.f1936
            r0.append(r1)
            java.lang.String r1 = ", text="
            r0.append(r1)
            java.lang.String r1 = r3.f1937
            r0.append(r1)
            java.lang.String r1 = ", styleKey="
            r0.append(r1)
            int r1 = r3.f1938
            r0.append(r1)
            java.lang.String r1 = ", mode="
            r0.append(r1)
            e20 r1 = r3.f1939
            r0.append(r1)
            java.lang.String r1 = ", containerRef="
            r0.append(r1)
            java.lang.ref.WeakReference r3 = r3.f1940
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
