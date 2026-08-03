package qc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f10856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f10857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10858c;

    public b(int[] r1, java.lang.String[] r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f10856a = r1
            r0.f10857b = r2
            r0.f10858c = r3
            return
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Catch:"
            r0.<init>(r1)
            java.lang.String[] r1 = r6.f10857b
            int r2 = r1.length
            r3 = 0
        Lb:
            java.lang.String r4 = "0x%04x"
            if (r3 >= r2) goto L34
            r5 = 32
            r0.append(r5)
            r5 = r1[r3]
            r0.append(r5)
            java.lang.String r5 = "->"
            r0.append(r5)
            int[] r5 = r6.f10856a
            r5 = r5[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r4 = java.lang.String.format(r4, r5)
            r0.append(r4)
            int r3 = r3 + 1
            goto Lb
        L34:
            r1 = -1
            int r2 = r6.f10858c
            if (r2 == r1) goto L4d
            java.lang.String r1 = " all->"
            r0.append(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r1 = java.lang.String.format(r4, r1)
            r0.append(r1)
        L4d:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
