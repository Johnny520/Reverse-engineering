package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o extends m7.b {
    @Override // m7.b, l7.a
    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "xmlns:"
            r0.<init>(r1)
            r7.f r1 = r3.f8734o
            int r1 = r1.f11560n
            r7.o r1 = r3.V(r1)
            r2 = 0
            if (r1 == 0) goto L15
            java.lang.String r1 = r1.f11578m
            goto L16
        L15:
            r1 = r2
        L16:
            r0.append(r1)
            java.lang.String r1 = "=\""
            r0.append(r1)
            r7.f r1 = r3.f8735p
            int r1 = r1.f11560n
            r7.o r1 = r3.V(r1)
            if (r1 == 0) goto L2a
            java.lang.String r2 = r1.f11578m
        L2a:
            java.lang.String r1 = "\""
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
