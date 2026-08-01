package p000;

/* JADX INFO: renamed from: jk */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0434jk {

    /* JADX INFO: renamed from: α */
    public final java.lang.Object f5491;

    /* JADX INFO: renamed from: β */
    public final java.util.ArrayList f5492;

    /* JADX INFO: renamed from: γ */
    public final java.util.ArrayList f5493;

    /* JADX INFO: renamed from: δ */
    public final java.util.ArrayList f5494;

    /* JADX INFO: renamed from: ε */
    public final java.util.ArrayList f5495;

    public C0434jk(java.util.List r1, java.util.ArrayList r2, java.util.ArrayList r3, java.util.ArrayList r4, java.util.ArrayList r5) {
            r0 = this;
            r0.<init>()
            r0.f5491 = r1
            r0.f5492 = r2
            r0.f5493 = r3
            r0.f5494 = r4
            r0.f5495 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L42
        L3:
            boolean r0 = r3 instanceof p000.C0434jk
            if (r0 != 0) goto L8
            goto L40
        L8:
            jk r3 = (p000.C0434jk) r3
            java.lang.Object r0 = r2.f5491
            java.lang.Object r1 = r3.f5491
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L40
        L15:
            java.util.ArrayList r0 = r2.f5492
            java.util.ArrayList r1 = r3.f5492
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L40
        L20:
            java.util.ArrayList r0 = r2.f5493
            java.util.ArrayList r1 = r3.f5493
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L40
        L2b:
            java.util.ArrayList r0 = r2.f5494
            java.util.ArrayList r1 = r3.f5494
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L40
        L36:
            java.util.ArrayList r2 = r2.f5495
            java.util.ArrayList r3 = r3.f5495
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L42
        L40:
            r2 = 0
            return r2
        L42:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.f5491
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.ArrayList r1 = r2.f5492
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.ArrayList r0 = r2.f5493
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.ArrayList r1 = r2.f5494
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.ArrayList r2 = r2.f5495
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ResolvedTargets(components="
            r0.<init>(r1)
            java.lang.Object r1 = r2.f5491
            r0.append(r1)
            java.lang.String r1 = ", holders="
            r0.append(r1)
            java.util.ArrayList r1 = r2.f5492
            r0.append(r1)
            java.lang.String r1 = ", expandControls="
            r0.append(r1)
            java.util.ArrayList r1 = r2.f5493
            r0.append(r1)
            java.lang.String r1 = ", diggViews="
            r0.append(r1)
            java.util.ArrayList r1 = r2.f5494
            r0.append(r1)
            java.lang.String r1 = ", buryViews="
            r0.append(r1)
            java.util.ArrayList r2 = r2.f5495
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
