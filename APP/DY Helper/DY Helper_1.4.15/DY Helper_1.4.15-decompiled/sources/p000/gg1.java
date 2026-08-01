package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gg1 {

    /* JADX INFO: renamed from: α */
    public final int f4365;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f4366;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Long f4367;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Object f4368;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f4369;

    /* JADX INFO: renamed from: ζ */
    public final java.util.Map f4370;

    public gg1(int r1, java.lang.String r2, java.lang.Long r3, java.util.List r4, java.lang.String r5, java.util.Map r6) {
            r0 = this;
            r0.<init>()
            r0.f4365 = r1
            r0.f4366 = r2
            r0.f4367 = r3
            r0.f4368 = r4
            r0.f4369 = r5
            r0.f4370 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L49
        L3:
            boolean r0 = r3 instanceof p000.gg1
            if (r0 != 0) goto L8
            goto L47
        L8:
            gg1 r3 = (p000.gg1) r3
            int r0 = r2.f4365
            int r1 = r3.f4365
            if (r0 == r1) goto L11
            goto L47
        L11:
            java.lang.String r0 = r2.f4366
            java.lang.String r1 = r3.f4366
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L1c
            goto L47
        L1c:
            java.lang.Long r0 = r2.f4367
            java.lang.Long r1 = r3.f4367
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L27
            goto L47
        L27:
            java.lang.Object r0 = r2.f4368
            java.lang.Object r1 = r3.f4368
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L32
            goto L47
        L32:
            java.lang.String r0 = r2.f4369
            java.lang.String r1 = r3.f4369
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L3d
            goto L47
        L3d:
            java.util.Map r2 = r2.f4370
            java.util.Map r3 = r3.f4370
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L49
        L47:
            r2 = 0
            return r2
        L49:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f4365
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            r1 = 0
            java.lang.String r2 = r3.f4366
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Long r2 = r3.f4367
            if (r2 != 0) goto L1c
            r2 = r1
            goto L20
        L1c:
            int r2 = r2.hashCode()
        L20:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Object r2 = r3.f4368
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * 31
            java.lang.String r0 = r3.f4369
            if (r0 != 0) goto L31
            goto L35
        L31:
            int r1 = r0.hashCode()
        L35:
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.util.Map r3 = r3.f4370
            int r3 = r3.hashCode()
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", statusMessage="
            java.lang.String r1 = ", balanceSpark="
            int r2 = r5.f4365
            java.lang.String r3 = "PetElfTaskListResult(statusCode="
            java.lang.String r4 = r5.f4366
            java.lang.StringBuilder r0 = p000.a12.m20(r2, r3, r0, r4, r1)
            java.lang.Long r1 = r5.f4367
            r0.append(r1)
            java.lang.String r1 = ", tasks="
            r0.append(r1)
            java.lang.Object r1 = r5.f4368
            r0.append(r1)
            java.lang.String r1 = ", taskListSource="
            r0.append(r1)
            java.lang.String r1 = r5.f4369
            r0.append(r1)
            java.lang.String r1 = ", candidateTaskCounts="
            r0.append(r1)
            java.util.Map r5 = r5.f4370
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final java.util.ArrayList m2311() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r3 = r3.f4368
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r3.next()
            tf1 r1 = (p000.tf1) r1
            r1.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            p000.tf1.m5630(r2, r1)
            p000.AbstractC0984xh.m6660(r0, r2)
            goto Lb
        L26:
            return r0
    }
}
