package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k5.u f3556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k5.o f3557c;

    public i1(java.lang.String r1, k5.u r2, k5.o r3) {
            r0 = this;
            r0.<init>()
            r0.f3555a = r1
            r0.f3556b = r2
            r0.f3557c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof fb.i1
            if (r0 != 0) goto L8
            goto L2a
        L8:
            fb.i1 r3 = (fb.i1) r3
            java.lang.String r0 = r2.f3555a
            java.lang.String r1 = r3.f3555a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            k5.u r0 = r2.f3556b
            k5.u r1 = r3.f3556b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            k5.o r0 = r2.f3557c
            k5.o r3 = r3.f3557c
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L2c
        L2a:
            r3 = 0
            return r3
        L2c:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f3555a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            k5.u r1 = r2.f3556b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            k5.o r0 = r2.f3557c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LocatedClass(entryName="
            r0.<init>(r1)
            java.lang.String r1 = r2.f3555a
            r0.append(r1)
            java.lang.String r1 = ", dex="
            r0.append(r1)
            k5.u r1 = r2.f3556b
            r0.append(r1)
            java.lang.String r1 = ", classDef="
            r0.append(r1)
            k5.o r1 = r2.f3557c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
