package me;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd.s f8890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f8891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f8892c;

    public f(qd.s r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 3
            r0.<init>(r1)
            r2.f8891b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r2.f8892c = r0
            r2.f8890a = r3
            return
    }

    public final java.lang.String toString() {
            r6 = this;
            qd.s r0 = r6.f8890a
            if (r0 != 0) goto L7
            java.lang.String r0 = "-"
            goto Lb
        L7:
            java.lang.String r0 = r0.o()
        Lb:
            java.util.ArrayList r1 = r6.f8891b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.util.ArrayList r2 = r6.f8892c
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = ", a:"
            java.lang.String r4 = ", u:"
            java.lang.String r5 = "{"
            java.lang.StringBuilder r0 = bc.e.p(r5, r0, r3, r1, r4)
            java.lang.String r1 = "}"
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
