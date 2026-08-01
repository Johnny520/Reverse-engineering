package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class m62 {

    /* JADX INFO: renamed from: α */
    public final p000.C0087br f6981;

    /* JADX INFO: renamed from: β */
    public final p000.d60 f6982;

    /* JADX INFO: renamed from: γ */
    public final int f6983;

    /* JADX INFO: renamed from: δ */
    public final int f6984;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Object f6985;

    public m62(p000.C0087br r1, p000.d60 r2, int r3, int r4, java.lang.Object r5) {
            r0 = this;
            r0.<init>()
            r0.f6981 = r1
            r0.f6982 = r2
            r0.f6983 = r3
            r0.f6984 = r4
            r0.f6985 = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.m62
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            m62 r5 = (p000.m62) r5
            br r1 = r4.f6981
            br r3 = r5.f6981
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            d60 r1 = r4.f6982
            d60 r3 = r5.f6982
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            int r1 = r4.f6983
            int r3 = r5.f6983
            if (r1 != r3) goto L3a
            int r1 = r4.f6984
            int r3 = r5.f6984
            if (r1 != r3) goto L3a
            java.lang.Object r4 = r4.f6985
            java.lang.Object r5 = r5.f6985
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L39
            return r2
        L39:
            return r0
        L3a:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            r0 = 0
            br r1 = r4.f6981
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            r2 = 31
            int r1 = r1 * r2
            d60 r3 = r4.f6982
            int r3 = r3.f2924
            int r1 = r1 + r3
            int r1 = r1 * r2
            int r3 = r4.f6983
            int r1 = p000.a12.m14(r3, r1, r2)
            int r3 = r4.f6984
            int r1 = p000.a12.m14(r3, r1, r2)
            java.lang.Object r4 = r4.f6985
            if (r4 != 0) goto L25
            goto L29
        L25:
            int r0 = r4.hashCode()
        L29:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TypefaceRequest(fontFamily="
            r0.<init>(r1)
            br r1 = r4.f6981
            r0.append(r1)
            java.lang.String r1 = ", fontWeight="
            r0.append(r1)
            d60 r1 = r4.f6982
            r0.append(r1)
            java.lang.String r1 = ", fontStyle="
            r0.append(r1)
            java.lang.String r1 = "Invalid"
            r2 = 1
            int r3 = r4.f6983
            if (r3 != 0) goto L25
            java.lang.String r3 = "Normal"
            goto L2b
        L25:
            if (r3 != r2) goto L2a
            java.lang.String r3 = "Italic"
            goto L2b
        L2a:
            r3 = r1
        L2b:
            r0.append(r3)
            java.lang.String r3 = ", fontSynthesis="
            r0.append(r3)
            int r3 = r4.f6984
            if (r3 != 0) goto L3a
            java.lang.String r1 = "None"
            goto L4c
        L3a:
            if (r3 != r2) goto L3f
            java.lang.String r1 = "Weight"
            goto L4c
        L3f:
            r2 = 2
            if (r3 != r2) goto L45
            java.lang.String r1 = "Style"
            goto L4c
        L45:
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r3 != r2) goto L4c
            java.lang.String r1 = "All"
        L4c:
            r0.append(r1)
            java.lang.String r1 = ", resourceLoaderCacheKey="
            r0.append(r1)
            java.lang.Object r4 = r4.f6985
            r0.append(r4)
            r4 = 41
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }
}
