package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Intent f1468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f1469b;

    public c0(android.content.Intent r2, java.lang.String r3, int r4) {
            r1 = this;
            r0 = r4 & 1
            if (r0 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 2
            if (r4 == 0) goto Lb
            java.lang.String r3 = ""
        Lb:
            r1.<init>()
            r1.f1468a = r2
            r1.f1469b = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof ca.c0
            if (r0 != 0) goto L8
            goto L1f
        L8:
            ca.c0 r3 = (ca.c0) r3
            android.content.Intent r0 = r2.f1468a
            android.content.Intent r1 = r3.f1468a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            java.lang.String r0 = r2.f1469b
            java.lang.String r3 = r3.f1469b
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L21
        L1f:
            r3 = 0
            return r3
        L21:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            android.content.Intent r0 = r2.f1468a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 * 31
            java.lang.String r1 = r2.f1469b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MomentsPreparation(intent="
            r0.<init>(r1)
            android.content.Intent r1 = r2.f1468a
            r0.append(r1)
            java.lang.String r1 = ", error="
            r0.append(r1)
            java.lang.String r1 = r2.f1469b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
