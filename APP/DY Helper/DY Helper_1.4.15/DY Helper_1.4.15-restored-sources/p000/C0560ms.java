package p000;

/* JADX INFO: renamed from: ms */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0560ms {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f7259;

    /* JADX INFO: renamed from: β */
    public java.lang.String f7260;

    /* JADX INFO: renamed from: γ */
    public p000.EnumC0597ns f7261;

    public C0560ms(java.lang.String r1, java.lang.String r2, p000.EnumC0597ns r3) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f7259 = r1
            r0.f7260 = r2
            r0.f7261 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof p000.C0560ms
            if (r0 != 0) goto L8
            goto L26
        L8:
            ms r3 = (p000.C0560ms) r3
            java.lang.String r0 = r2.f7259
            java.lang.String r1 = r3.f7259
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            java.lang.String r0 = r2.f7260
            java.lang.String r1 = r3.f7260
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L26
        L20:
            ns r2 = r2.f7261
            ns r3 = r3.f7261
            if (r2 == r3) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f7259
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f7260
            int r0 = p000.a12.m15(r0, r1, r2)
            ns r3 = r3.f7261
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.f7260
            ns r1 = r5.f7261
            java.lang.String r2 = ", text="
            java.lang.String r3 = ", status="
            java.lang.String r4 = "ProgressTask(id="
            java.lang.String r5 = r5.f7259
            java.lang.StringBuilder r5 = p000.lz1.m3695(r4, r5, r2, r0, r3)
            r5.append(r1)
            java.lang.String r0 = ")"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            return r5
    }
}
