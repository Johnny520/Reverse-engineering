package ob;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f9729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f9730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f9731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9733e;

    public k(java.lang.String r1, java.lang.String r2, java.lang.String r3, float r4, boolean r5) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f9729a = r1
            r0.f9730b = r2
            r0.f9731c = r3
            r0.f9732d = r4
            r0.f9733e = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3e
        L3:
            boolean r0 = r3 instanceof ob.k
            if (r0 != 0) goto L8
            goto L3c
        L8:
            ob.k r3 = (ob.k) r3
            java.lang.String r0 = r2.f9729a
            java.lang.String r1 = r3.f9729a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L3c
        L15:
            java.lang.String r0 = r2.f9730b
            java.lang.String r1 = r3.f9730b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L3c
        L20:
            java.lang.String r0 = r2.f9731c
            java.lang.String r1 = r3.f9731c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L3c
        L2b:
            float r0 = r2.f9732d
            float r1 = r3.f9732d
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L36
            goto L3c
        L36:
            boolean r0 = r2.f9733e
            boolean r3 = r3.f9733e
            if (r0 == r3) goto L3e
        L3c:
            r3 = 0
            return r3
        L3e:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f9729a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f9730b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f9731c
            int r0 = eh.a.g(r0, r1, r2)
            float r2 = r3.f9732d
            int r0 = eh.a.d(r2, r0, r1)
            boolean r1 = r3.f9733e
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", voiceId="
            java.lang.String r1 = ", ttsVoice="
            java.lang.String r2 = "SynthesisConfig(engine="
            java.lang.String r3 = r5.f9729a
            java.lang.String r4 = r5.f9730b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f9731c
            r0.append(r1)
            java.lang.String r1 = ", speechRate="
            r0.append(r1)
            float r1 = r5.f9732d
            r0.append(r1)
            java.lang.String r1 = ", english="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r5.f9733e
            java.lang.String r0 = p.a.m(r1, r0, r2)
            return r0
    }
}
