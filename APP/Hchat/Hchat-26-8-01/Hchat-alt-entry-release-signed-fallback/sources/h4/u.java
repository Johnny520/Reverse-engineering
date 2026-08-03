package h4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends z4.e {
    public h4.s o(java.lang.String r5) {
            r4 = this;
            java.lang.Object[] r0 = r4.f22543h
            int r0 = r0.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L18
            java.lang.Object r2 = r4.l(r1)
            h4.s r2 = (h4.s) r2
            java.lang.String r3 = r2.f5093a
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L15
            return r2
        L15:
            int r1 = r1 + 1
            goto L4
        L18:
            r5 = 0
            return r5
    }

    public u4.i p() {
            r1 = this;
            java.lang.Object[] r0 = r1.f22543h
            int r0 = r0.length
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.l(r0)
            u4.i r0 = (u4.i) r0
            return r0
    }
}
