package o1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9499a;

    public /* synthetic */ a(int r1) {
            r0 = this;
            r0.<init>()
            r0.f9499a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof o1.a
            if (r0 != 0) goto L5
            goto Ld
        L5:
            o1.a r2 = (o1.a) r2
            int r2 = r2.f9499a
            int r0 = r1.f9499a
            if (r0 == r2) goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f9499a
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            r0 = 1
            int r1 = r2.f9499a
            if (r1 != r0) goto L8
            java.lang.String r0 = "Touch"
            return r0
        L8:
            r0 = 2
            if (r1 != r0) goto Le
            java.lang.String r0 = "Keyboard"
            return r0
        Le:
            java.lang.String r0 = "Error"
            return r0
    }
}
