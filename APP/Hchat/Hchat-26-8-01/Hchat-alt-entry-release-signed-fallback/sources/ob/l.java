package ob;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f9734a;

    public l(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f9734a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof ob.l
            if (r0 != 0) goto L8
            goto L14
        L8:
            ob.l r2 = (ob.l) r2
            java.lang.String r0 = r1.f9734a
            java.lang.String r2 = r2.f9734a
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L16
        L14:
            r2 = 0
            return r2
        L16:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f9734a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "TextPayload(text="
            java.lang.String r1 = ")"
            java.lang.String r2 = r3.f9734a
            java.lang.String r0 = eh.a.n(r0, r2, r1)
            return r0
    }
}
