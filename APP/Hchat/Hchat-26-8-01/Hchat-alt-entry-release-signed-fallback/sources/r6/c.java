package r6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Class f11541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r6.b f11542b;

    public c(java.lang.Class r1, r6.b r2) {
            r0 = this;
            r0.<init>()
            r0.f11541a = r1
            r0.f11542b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof r6.c
            if (r0 != 0) goto L8
            goto L1b
        L8:
            r6.c r3 = (r6.c) r3
            java.lang.Class r0 = r2.f11541a
            java.lang.Class r1 = r3.f11541a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1b
        L15:
            r6.b r0 = r2.f11542b
            r6.b r3 = r3.f11542b
            if (r0 == r3) goto L1d
        L1b:
            r3 = 0
            return r3
        L1d:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Class r0 = r3.f11541a
            int r0 = r0.hashCode()
            int r0 = r0 * 29791
            r1 = 0
            r2 = 31
            int r0 = eh.a.h(r0, r2, r1)
            r6.b r1 = r3.f11542b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            r6.b r0 = r3.f11542b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Configuration(declaringClass="
            r1.<init>(r2)
            java.lang.Class r2 = r3.f11541a
            r1.append(r2)
            java.lang.String r2 = ", memberInstance=null, processorResolver=null, superclass=false, optional="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
