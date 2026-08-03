package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f3859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3860d;

    public /* synthetic */ y0(java.lang.String r3, java.lang.String r4, java.util.List r5, int r6) {
            r2 = this;
            r0 = r6 & 1
            java.lang.String r1 = ""
            if (r0 == 0) goto L7
            r3 = r1
        L7:
            r0 = r6 & 2
            if (r0 == 0) goto Lc
            r4 = r1
        Lc:
            r0 = r6 & 4
            if (r0 == 0) goto L12
            tf.t r5 = tf.t.f13167g
        L12:
            r6 = r6 & 8
            if (r6 == 0) goto L18
            r6 = 0
            goto L19
        L18:
            r6 = 1
        L19:
            r2.<init>(r3, r4, r5, r6)
            return
    }

    public y0(java.lang.String r1, java.lang.String r2, java.util.List r3, boolean r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f3857a = r1
            r0.f3858b = r2
            r0.f3859c = r3
            r0.f3860d = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof fb.y0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fb.y0 r5 = (fb.y0) r5
            java.lang.String r1 = r4.f3857a
            java.lang.String r3 = r5.f3857a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f3858b
            java.lang.String r3 = r5.f3858b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.List r1 = r4.f3859c
            java.util.List r3 = r5.f3859c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            boolean r1 = r4.f3860d
            boolean r5 = r5.f3860d
            if (r1 == r5) goto L34
            return r2
        L34:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f3857a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3858b
            int r0 = eh.a.g(r0, r1, r2)
            java.util.List r2 = r3.f3859c
            int r0 = j8.b.e(r2, r0, r1)
            boolean r1 = r3.f3860d
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", reasoning="
            java.lang.String r1 = ", toolCalls="
            java.lang.String r2 = "StreamDelta(content="
            java.lang.String r3 = r5.f3857a
            java.lang.String r4 = r5.f3858b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.util.List r1 = r5.f3859c
            r0.append(r1)
            java.lang.String r1 = ", completed="
            r0.append(r1)
            boolean r1 = r5.f3860d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
