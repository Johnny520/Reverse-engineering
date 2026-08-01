package p000;

/* JADX INFO: renamed from: ak */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0021ak {

    /* JADX INFO: renamed from: α */
    public final p000.EnumC1060zj f291;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f292;

    /* JADX INFO: renamed from: γ */
    public final p000.EnumC0491kx f293;

    /* JADX INFO: renamed from: δ */
    public final java.util.List f294;

    /* JADX INFO: renamed from: ε */
    public final java.util.Set f295;

    /* JADX INFO: renamed from: ζ */
    public final java.util.List f296;

    /* JADX INFO: renamed from: η */
    public final p000.EnumC0491kx f297;

    /* JADX INFO: renamed from: θ */
    public final p000.EnumC0491kx f298;

    public C0021ak(p000.EnumC1060zj r3, java.lang.String r4, p000.EnumC0491kx r5, java.util.List r6, java.util.Set r7, java.util.List r8, p000.EnumC0491kx r9, int r10) {
            r2 = this;
            r0 = r10 & 8
            jz r1 = p000.C0450jz.f5672
            if (r0 == 0) goto L7
            r6 = r1
        L7:
            r0 = r10 & 32
            if (r0 == 0) goto Lc
            r8 = r1
        Lc:
            r0 = r10 & 64
            r1 = 0
            if (r0 == 0) goto L12
            r9 = r1
        L12:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L17
            goto L19
        L17:
            kx r1 = p000.EnumC0491kx.f6165
        L19:
            r5.getClass()
            r2.<init>()
            r2.f291 = r3
            r2.f292 = r4
            r2.f293 = r5
            r2.f294 = r6
            r2.f295 = r7
            r2.f296 = r8
            r2.f297 = r9
            r2.f298 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L53
        L3:
            boolean r0 = r3 instanceof p000.C0021ak
            if (r0 != 0) goto L8
            goto L51
        L8:
            ak r3 = (p000.C0021ak) r3
            zj r0 = r2.f291
            zj r1 = r3.f291
            if (r0 == r1) goto L11
            goto L51
        L11:
            java.lang.String r0 = r2.f292
            java.lang.String r1 = r3.f292
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L51
        L1c:
            kx r0 = r2.f293
            kx r1 = r3.f293
            if (r0 == r1) goto L23
            goto L51
        L23:
            java.util.List r0 = r2.f294
            java.util.List r1 = r3.f294
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            goto L51
        L2e:
            java.util.Set r0 = r2.f295
            java.util.Set r1 = r3.f295
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L39
            goto L51
        L39:
            java.util.List r0 = r2.f296
            java.util.List r1 = r3.f296
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L44
            goto L51
        L44:
            kx r0 = r2.f297
            kx r1 = r3.f297
            if (r0 == r1) goto L4b
            goto L51
        L4b:
            kx r2 = r2.f298
            kx r3 = r3.f298
            if (r2 == r3) goto L53
        L51:
            r2 = 0
            return r2
        L53:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            zj r0 = r4.f291
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f292
            int r0 = p000.a12.m15(r0, r1, r2)
            kx r2 = r4.f293
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.List r0 = r4.f294
            int r0 = p000.a12.m16(r0, r2, r1)
            java.util.Set r2 = r4.f295
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.List r0 = r4.f296
            int r0 = p000.a12.m16(r0, r2, r1)
            r2 = 0
            kx r3 = r4.f297
            if (r3 != 0) goto L32
            r3 = r2
            goto L36
        L32:
            int r3 = r3.hashCode()
        L36:
            int r0 = r0 + r3
            int r0 = r0 * r1
            kx r4 = r4.f298
            if (r4 != 0) goto L3d
            goto L41
        L3d:
            int r2 = r4.hashCode()
        L41:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ComponentSpec(kind="
            r0.<init>(r1)
            zj r1 = r2.f291
            r0.append(r1)
            java.lang.String r1 = ", className="
            r0.append(r1)
            java.lang.String r1 = r2.f292
            r0.append(r1)
            java.lang.String r1 = ", fieldKey="
            r0.append(r1)
            kx r1 = r2.f293
            r0.append(r1)
            java.lang.String r1 = ", fieldNames="
            r0.append(r1)
            java.util.List r1 = r2.f294
            r0.append(r1)
            java.lang.String r1 = ", acceptedFieldTypes="
            r0.append(r1)
            java.util.Set r1 = r2.f295
            r0.append(r1)
            java.lang.String r1 = ", associatedViewSpecs="
            r0.append(r1)
            java.util.List r1 = r2.f296
            r0.append(r1)
            java.lang.String r1 = ", iconFieldKey="
            r0.append(r1)
            kx r1 = r2.f297
            r0.append(r1)
            java.lang.String r1 = ", countFieldKey="
            r0.append(r1)
            kx r2 = r2.f298
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
