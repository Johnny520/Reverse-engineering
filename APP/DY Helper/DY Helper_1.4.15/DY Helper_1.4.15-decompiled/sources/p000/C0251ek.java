package p000;

/* JADX INFO: renamed from: ek */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0251ek {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f3577;

    /* JADX INFO: renamed from: β */
    public final p000.EnumC0491kx f3578;

    /* JADX INFO: renamed from: γ */
    public final java.util.List f3579;

    /* JADX INFO: renamed from: δ */
    public final boolean f3580;

    public C0251ek(java.lang.String r1, p000.EnumC0491kx r2, java.util.List r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f3577 = r1
            r0.f3578 = r2
            r0.f3579 = r3
            r0.f3580 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2f
        L3:
            boolean r0 = r3 instanceof p000.C0251ek
            if (r0 != 0) goto L8
            goto L2d
        L8:
            ek r3 = (p000.C0251ek) r3
            java.lang.String r0 = r2.f3577
            java.lang.String r1 = r3.f3577
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2d
        L15:
            kx r0 = r2.f3578
            kx r1 = r3.f3578
            if (r0 == r1) goto L1c
            goto L2d
        L1c:
            java.util.List r0 = r2.f3579
            java.util.List r1 = r3.f3579
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L27
            goto L2d
        L27:
            boolean r2 = r2.f3580
            boolean r3 = r3.f3580
            if (r2 == r3) goto L2f
        L2d:
            r2 = 0
            return r2
        L2f:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f3577
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            kx r2 = r3.f3578
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.List r0 = r3.f3579
            int r0 = p000.a12.m16(r0, r2, r1)
            boolean r3 = r3.f3580
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ExpandControlSpec(className="
            r0.<init>(r1)
            java.lang.String r1 = r2.f3577
            r0.append(r1)
            java.lang.String r1 = ", titleFieldKey="
            r0.append(r1)
            kx r1 = r2.f3578
            r0.append(r1)
            java.lang.String r1 = ", titleFieldNames="
            r0.append(r1)
            java.util.List r1 = r2.f3579
            r0.append(r1)
            java.lang.String r1 = ", allowNoArgumentRenderer="
            r0.append(r1)
            boolean r2 = r2.f3580
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
