package p8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f10426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f10427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f10429d;

    public v(java.lang.String r1, java.lang.String r2, int r3, java.util.ArrayList r4) {
            r0 = this;
            r0.<init>()
            r0.f10426a = r1
            r0.f10427b = r2
            r0.f10428c = r3
            r0.f10429d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof p8.v
            if (r0 != 0) goto L8
            goto L31
        L8:
            p8.v r3 = (p8.v) r3
            java.lang.String r0 = r2.f10426a
            java.lang.String r1 = r3.f10426a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            java.lang.String r0 = r2.f10427b
            java.lang.String r1 = r3.f10427b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L31
        L20:
            int r0 = r2.f10428c
            int r1 = r3.f10428c
            if (r0 == r1) goto L27
            goto L31
        L27:
            java.util.ArrayList r0 = r2.f10429d
            java.util.ArrayList r3 = r3.f10429d
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L33
        L31:
            r3 = 0
            return r3
        L33:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f10426a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f10427b
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r3.f10428c
            int r0 = eh.a.e(r2, r0, r1)
            java.util.ArrayList r1 = r3.f10429d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", text="
            java.lang.String r1 = ", type="
            java.lang.String r2 = "SnsForwardSnapshot(id="
            java.lang.String r3 = r5.f10426a
            java.lang.String r4 = r5.f10427b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            int r1 = r5.f10428c
            r0.append(r1)
            java.lang.String r1 = ", media="
            r0.append(r1)
            java.util.ArrayList r1 = r5.f10429d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
