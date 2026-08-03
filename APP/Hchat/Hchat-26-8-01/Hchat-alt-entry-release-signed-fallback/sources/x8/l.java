package x8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f21300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f21301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.List f21304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f21305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21306g;

    public /* synthetic */ l() {
            r9 = this;
            r7 = 0
            r8 = 0
            java.lang.String r1 = ""
            r3 = 0
            r5 = 0
            tf.t r6 = tf.t.f13167g
            r2 = r1
            r0 = r9
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return
    }

    public l(java.lang.String r1, java.lang.String r2, long r3, int r5, java.util.List r6, boolean r7, int r8) {
            r0 = this;
            r0.<init>()
            r0.f21300a = r1
            r0.f21301b = r2
            r0.f21302c = r3
            r0.f21303d = r5
            r0.f21304e = r6
            r0.f21305f = r7
            r0.f21306g = r8
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof x8.l
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            x8.l r8 = (x8.l) r8
            java.lang.String r1 = r7.f21300a
            java.lang.String r3 = r8.f21300a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.f21301b
            java.lang.String r3 = r8.f21301b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            long r3 = r7.f21302c
            long r5 = r8.f21302c
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L2b
            return r2
        L2b:
            int r1 = r7.f21303d
            int r3 = r8.f21303d
            if (r1 == r3) goto L32
            return r2
        L32:
            java.util.List r1 = r7.f21304e
            java.util.List r3 = r8.f21304e
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L3d
            return r2
        L3d:
            boolean r1 = r7.f21305f
            boolean r3 = r8.f21305f
            if (r1 == r3) goto L44
            return r2
        L44:
            int r1 = r7.f21306g
            int r8 = r8.f21306g
            if (r1 == r8) goto L4b
            return r2
        L4b:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f21300a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f21301b
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r4.f21302c
            int r0 = eh.a.f(r0, r1, r2)
            int r2 = r4.f21303d
            int r0 = eh.a.e(r2, r0, r1)
            java.util.List r2 = r4.f21304e
            int r0 = j8.b.e(r2, r0, r1)
            boolean r2 = r4.f21305f
            int r0 = eh.a.h(r0, r1, r2)
            int r1 = r4.f21306g
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", voicePath="
            java.lang.String r1 = ", voiceBytes="
            java.lang.String r2 = "XiaozhiReply(text="
            java.lang.String r3 = r5.f21300a
            java.lang.String r4 = r5.f21301b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            long r1 = r5.f21302c
            r0.append(r1)
            java.lang.String r1 = ", durationMs="
            r0.append(r1)
            int r1 = r5.f21303d
            r0.append(r1)
            java.lang.String r1 = ", voiceSegments="
            r0.append(r1)
            java.util.List r1 = r5.f21304e
            r0.append(r1)
            java.lang.String r1 = ", mergeVoiceSegments="
            r0.append(r1)
            boolean r1 = r5.f21305f
            r0.append(r1)
            java.lang.String r1 = ", mergedSegmentCount="
            r0.append(r1)
            int r1 = r5.f21306g
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
