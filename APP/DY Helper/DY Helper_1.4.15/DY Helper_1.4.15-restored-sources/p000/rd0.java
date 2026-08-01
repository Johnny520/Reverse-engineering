package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class rd0 {

    /* JADX INFO: renamed from: γ */
    public static final p000.rd0 f9340 = null;

    /* JADX INFO: renamed from: α */
    public final boolean f9341;

    /* JADX INFO: renamed from: β */
    public final boolean f9342;

    static {
            rd0 r0 = new rd0
            r1 = 0
            r0.<init>(r1, r1)
            p000.rd0.f9340 = r0
            return
    }

    public rd0(boolean r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f9341 = r1
            r0.f9342 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L19
        L3:
            boolean r0 = r3 instanceof p000.rd0
            if (r0 != 0) goto L8
            goto L17
        L8:
            rd0 r3 = (p000.rd0) r3
            boolean r0 = r2.f9341
            boolean r1 = r3.f9341
            if (r0 == r1) goto L11
            goto L17
        L11:
            boolean r2 = r2.f9342
            boolean r3 = r3.f9342
            if (r2 == r3) goto L19
        L17:
            r2 = 0
            return r2
        L19:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            boolean r0 = r1.f9341
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 * 31
            boolean r1 = r1.f9342
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NestedRecentFilterResult(removeOuterRow="
            r0.<init>(r1)
            boolean r1 = r2.f9341
            r0.append(r1)
            java.lang.String r1 = ", changed="
            r0.append(r1)
            boolean r2 = r2.f9342
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
