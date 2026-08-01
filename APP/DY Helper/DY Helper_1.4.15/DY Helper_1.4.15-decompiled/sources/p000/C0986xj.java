package p000;

/* JADX INFO: renamed from: xj */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0986xj {

    /* JADX INFO: renamed from: α */
    public final p000.EnumC0491kx f12189;

    /* JADX INFO: renamed from: β */
    public final java.util.List f12190;

    /* JADX INFO: renamed from: γ */
    public final java.util.Set f12191;

    public C0986xj(p000.EnumC0491kx r1, java.util.List r2, java.util.Set r3) {
            r0 = this;
            r0.<init>()
            r0.f12189 = r1
            r0.f12190 = r2
            r0.f12191 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof p000.C0986xj
            if (r0 != 0) goto L8
            goto L26
        L8:
            xj r3 = (p000.C0986xj) r3
            kx r0 = r2.f12189
            kx r1 = r3.f12189
            if (r0 == r1) goto L11
            goto L26
        L11:
            java.util.List r0 = r2.f12190
            java.util.List r1 = r3.f12190
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L26
        L1c:
            java.util.Set r2 = r2.f12191
            java.util.Set r3 = r3.f12191
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            kx r0 = r3.f12189
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r3.f12190
            int r0 = p000.a12.m16(r2, r0, r1)
            java.util.Set r3 = r3.f12191
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AssociatedViewSpec(fieldKey="
            r0.<init>(r1)
            kx r1 = r2.f12189
            r0.append(r1)
            java.lang.String r1 = ", fieldNames="
            r0.append(r1)
            java.util.List r1 = r2.f12190
            r0.append(r1)
            java.lang.String r1 = ", acceptedFieldTypes="
            r0.append(r1)
            java.util.Set r2 = r2.f12191
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
