package gb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f4433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f4434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Long f4436d;

    public i(java.lang.String r1, java.lang.String r2, boolean r3, java.lang.Long r4) {
            r0 = this;
            r0.<init>()
            r0.f4433a = r1
            r0.f4434b = r2
            r0.f4435c = r3
            r0.f4436d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof gb.i
            if (r0 != 0) goto L8
            goto L31
        L8:
            gb.i r3 = (gb.i) r3
            java.lang.String r0 = r2.f4433a
            java.lang.String r1 = r3.f4433a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            java.lang.String r0 = r2.f4434b
            java.lang.String r1 = r3.f4434b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L31
        L20:
            boolean r0 = r2.f4435c
            boolean r1 = r3.f4435c
            if (r0 == r1) goto L27
            goto L31
        L27:
            java.lang.Long r0 = r2.f4436d
            java.lang.Long r3 = r3.f4436d
            boolean r3 = gg.l.a(r0, r3)
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
            java.lang.String r0 = r3.f4433a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f4434b
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r3.f4435c
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.Long r1 = r3.f4436d
            if (r1 != 0) goto L1b
            r1 = 0
            goto L1f
        L1b:
            int r1 = r1.hashCode()
        L1f:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", directoryPath="
            java.lang.String r1 = ", replacedExisting="
            java.lang.String r2 = "PluginMarketInstallResult(localPluginId="
            java.lang.String r3 = r5.f4433a
            java.lang.String r4 = r5.f4434b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            boolean r1 = r5.f4435c
            r0.append(r1)
            java.lang.String r1 = ", downloadCount="
            r0.append(r1)
            java.lang.Long r1 = r5.f4436d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
