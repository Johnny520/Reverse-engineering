package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class oy1 {

    /* JADX INFO: renamed from: α */
    public final int f8345;

    /* JADX INFO: renamed from: β */
    public final int f8346;

    /* JADX INFO: renamed from: γ */
    public final int f8347;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f8348;

    public oy1(int r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f8345 = r1
            r0.f8346 = r2
            r0.f8347 = r3
            r0.f8348 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2b
        L3:
            boolean r0 = r3 instanceof p000.oy1
            if (r0 != 0) goto L8
            goto L29
        L8:
            oy1 r3 = (p000.oy1) r3
            int r0 = r2.f8345
            int r1 = r3.f8345
            if (r0 == r1) goto L11
            goto L29
        L11:
            int r0 = r2.f8346
            int r1 = r3.f8346
            if (r0 == r1) goto L18
            goto L29
        L18:
            int r0 = r2.f8347
            int r1 = r3.f8347
            if (r0 == r1) goto L1f
            goto L29
        L1f:
            java.lang.String r2 = r2.f8348
            java.lang.String r3 = r3.f8348
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2b
        L29:
            r2 = 0
            return r2
        L2b:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f8345
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f8346
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f8347
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r3 = r3.f8348
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", submitted="
            java.lang.String r1 = ", failed="
            java.lang.String r2 = "TaskTextSendResult(requested="
            int r3 = r5.f8345
            int r4 = r5.f8346
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            int r1 = r5.f8347
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r5 = r5.f8348
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
