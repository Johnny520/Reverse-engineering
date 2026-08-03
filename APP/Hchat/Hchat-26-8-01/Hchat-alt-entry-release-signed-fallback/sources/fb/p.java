package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f3696c;

    public /* synthetic */ p() {
            r2 = this;
            java.lang.String r0 = ""
            tf.t r1 = tf.t.f13167g
            r2.<init>(r0, r0, r1)
            return
    }

    public p(java.lang.String r1, java.lang.String r2, java.util.List r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.f3694a = r1
            r0.f3695b = r2
            r0.f3696c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof fb.p
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fb.p r5 = (fb.p) r5
            java.lang.String r1 = r4.f3694a
            java.lang.String r3 = r5.f3694a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f3695b
            java.lang.String r3 = r5.f3695b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.List r1 = r4.f3696c
            java.util.List r5 = r5.f3696c
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f3694a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3695b
            int r0 = eh.a.g(r0, r1, r2)
            java.util.List r1 = r3.f3696c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", reasoning="
            java.lang.String r1 = ", toolCalls="
            java.lang.String r2 = "StreamDelta(content="
            java.lang.String r3 = r5.f3694a
            java.lang.String r4 = r5.f3695b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.util.List r1 = r5.f3696c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
