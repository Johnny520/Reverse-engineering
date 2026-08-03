package nb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f9268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f9269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f9270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9271d;

    public g0(java.util.List r3, java.lang.String r4, java.lang.String r5, boolean r6, int r7) {
            r2 = this;
            r0 = r7 & 2
            java.lang.String r1 = ""
            if (r0 == 0) goto L7
            r4 = r1
        L7:
            r0 = r7 & 4
            if (r0 == 0) goto Lc
            r5 = r1
        Lc:
            r7 = r7 & 8
            if (r7 == 0) goto L11
            r6 = 0
        L11:
            r5.getClass()
            r2.<init>()
            r2.f9268a = r3
            r2.f9269b = r4
            r2.f9270c = r5
            r2.f9271d = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof nb.g0
            if (r0 != 0) goto L8
            goto L31
        L8:
            nb.g0 r3 = (nb.g0) r3
            java.util.List r0 = r2.f9268a
            java.util.List r1 = r3.f9268a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            java.lang.String r0 = r2.f9269b
            java.lang.String r1 = r3.f9269b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L31
        L20:
            java.lang.String r0 = r2.f9270c
            java.lang.String r1 = r3.f9270c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L31
        L2b:
            boolean r0 = r2.f9271d
            boolean r3 = r3.f9271d
            if (r0 == r3) goto L33
        L31:
            r3 = 0
            return r3
        L33:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.util.List r0 = r3.f9268a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f9269b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f9270c
            int r0 = eh.a.g(r0, r1, r2)
            boolean r1 = r3.f9271d
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextSpeechVoiceLoadResult(options="
            r0.<init>(r1)
            java.util.List r1 = r2.f9268a
            r0.append(r1)
            java.lang.String r1 = ", error="
            r0.append(r1)
            java.lang.String r1 = r2.f9269b
            r0.append(r1)
            java.lang.String r1 = ", activeEnginePackage="
            r0.append(r1)
            java.lang.String r1 = r2.f9270c
            r0.append(r1)
            java.lang.String r1 = ", usedFallback="
            r0.append(r1)
            boolean r1 = r2.f9271d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
