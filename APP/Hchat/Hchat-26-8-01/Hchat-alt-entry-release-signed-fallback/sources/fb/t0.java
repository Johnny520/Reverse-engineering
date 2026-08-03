package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fb.v f3785c;

    public t0(java.lang.String r1, java.lang.String r2, fb.v r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.f3783a = r1
            r0.f3784b = r2
            r0.f3785c = r3
            return
    }

    public static fb.t0 a(fb.t0 r2, java.lang.String r3, fb.v r4, int r5) {
            java.lang.String r0 = r2.f3783a
            r1 = r5 & 2
            if (r1 == 0) goto L8
            java.lang.String r3 = r2.f3784b
        L8:
            r5 = r5 & 4
            if (r5 == 0) goto Le
            fb.v r4 = r2.f3785c
        Le:
            r2.getClass()
            r0.getClass()
            r3.getClass()
            fb.t0 r2 = new fb.t0
            r2.<init>(r0, r3, r4)
            return r2
    }

    public final fb.v b() {
            r1 = this;
            fb.v r0 = r1.f3785c
            return r0
    }

    public final java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.f3783a
            return r0
    }

    public final java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.f3784b
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof fb.t0
            if (r0 != 0) goto L8
            goto L2a
        L8:
            fb.t0 r3 = (fb.t0) r3
            java.lang.String r0 = r2.f3783a
            java.lang.String r1 = r3.f3783a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.String r0 = r2.f3784b
            java.lang.String r1 = r3.f3784b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            fb.v r0 = r2.f3785c
            fb.v r3 = r3.f3785c
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
            r3 = this;
            java.lang.String r0 = r3.f3783a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3784b
            int r0 = eh.a.g(r0, r1, r2)
            fb.v r1 = r3.f3785c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", config="
            java.lang.String r2 = "ScriptPluginAgentProfile(id="
            java.lang.String r3 = r5.f3783a
            java.lang.String r4 = r5.f3784b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            fb.v r1 = r5.f3785c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
