package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f18989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f18990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18991c;

    public s5(java.util.ArrayList r1, java.util.List r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f18989a = r1
            r0.f18990b = r2
            r0.f18991c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof wb.s5
            if (r0 != 0) goto L8
            goto L26
        L8:
            wb.s5 r3 = (wb.s5) r3
            java.util.ArrayList r0 = r2.f18989a
            java.util.ArrayList r1 = r3.f18989a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            java.util.List r0 = r2.f18990b
            java.util.List r1 = r3.f18990b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L26
        L20:
            boolean r0 = r2.f18991c
            boolean r3 = r3.f18991c
            if (r0 == r3) goto L28
        L26:
            r3 = 0
            return r3
        L28:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.util.ArrayList r0 = r3.f18989a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r3.f18990b
            int r0 = j8.b.e(r2, r0, r1)
            boolean r1 = r3.f18991c
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MessageBlockInitialState(templates="
            r0.<init>(r1)
            java.util.ArrayList r1 = r3.f18989a
            r0.append(r1)
            java.lang.String r1 = ", bindings="
            r0.append(r1)
            java.util.List r1 = r3.f18990b
            r0.append(r1)
            java.lang.String r1 = ", shouldPersist="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r3.f18991c
            java.lang.String r0 = p.a.m(r1, r0, r2)
            return r0
    }
}
