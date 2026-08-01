package p000;

/* JADX INFO: renamed from: hl */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0363hl {

    /* JADX INFO: renamed from: α */
    public final boolean f4758;

    /* JADX INFO: renamed from: β */
    public final boolean f4759;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Object f4760;

    public C0363hl(boolean r1, boolean r2, java.util.Map r3) {
            r0 = this;
            r0.<init>()
            r0.f4758 = r1
            r0.f4759 = r2
            r0.f4760 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof p000.C0363hl
            if (r0 != 0) goto L8
            goto L22
        L8:
            hl r3 = (p000.C0363hl) r3
            boolean r0 = r2.f4758
            boolean r1 = r3.f4758
            if (r0 == r1) goto L11
            goto L22
        L11:
            boolean r0 = r2.f4759
            boolean r1 = r3.f4759
            if (r0 == r1) goto L18
            goto L22
        L18:
            java.lang.Object r2 = r2.f4760
            java.lang.Object r3 = r3.f4760
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L24
        L22:
            r2 = 0
            return r2
        L24:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f4758
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f4759
            int r0 = p000.lz1.m3678(r0, r1, r2)
            java.lang.Object r3 = r3.f4760
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ConfigSnapshot(enabled="
            r0.<init>(r1)
            boolean r1 = r2.f4758
            r0.append(r1)
            java.lang.String r1 = ", skipMentionColor="
            r0.append(r1)
            boolean r1 = r2.f4759
            r0.append(r1)
            java.lang.String r1 = ", styles="
            r0.append(r1)
            java.lang.Object r2 = r2.f4760
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
