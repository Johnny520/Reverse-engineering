package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hb.t f5409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f5410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c8.a f5411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j8.x f5412d;

    public j(hb.t r1, java.util.List r2, c8.a r3, j8.x r4) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f5409a = r1
            r0.f5410b = r2
            r0.f5411c = r3
            r0.f5412d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof hb.j
            if (r0 != 0) goto L8
            goto L35
        L8:
            hb.j r3 = (hb.j) r3
            hb.t r0 = r2.f5409a
            hb.t r1 = r3.f5409a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            java.util.List r0 = r2.f5410b
            java.util.List r1 = r3.f5410b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            c8.a r0 = r2.f5411c
            c8.a r1 = r3.f5411c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            j8.x r0 = r2.f5412d
            j8.x r3 = r3.f5412d
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L37
        L35:
            r3 = 0
            return r3
        L37:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r4 = this;
            hb.t r0 = r4.f5409a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r4.f5410b
            int r0 = j8.b.e(r2, r0, r1)
            r2 = 0
            c8.a r3 = r4.f5411c
            if (r3 != 0) goto L16
            r3 = r2
            goto L1a
        L16:
            int r3 = r3.hashCode()
        L1a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            j8.x r1 = r4.f5412d
            if (r1 != 0) goto L21
            goto L25
        L21:
            int r2 = r1.hashCode()
        L25:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SendJob(snapshot="
            r0.<init>(r1)
            hb.t r1 = r2.f5409a
            r0.append(r1)
            java.lang.String r1 = ", targets="
            r0.append(r1)
            java.util.List r1 = r2.f5410b
            r0.append(r1)
            java.lang.String r1 = ", emojiPayload="
            r0.append(r1)
            c8.a r1 = r2.f5411c
            r0.append(r1)
            java.lang.String r1 = ", voicePayload="
            r0.append(r1)
            j8.x r1 = r2.f5412d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
