package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f16966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f16967b;

    public /* synthetic */ j5() {
            r1 = this;
            tf.t r0 = tf.t.f13167g
            r1.<init>(r0, r0)
            return
    }

    public j5(java.util.List r1, java.util.List r2) {
            r0 = this;
            r0.<init>()
            r0.f16966a = r1
            r0.f16967b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof wb.j5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wb.j5 r5 = (wb.j5) r5
            java.util.List r1 = r4.f16966a
            java.util.List r3 = r5.f16966a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List r1 = r4.f16967b
            java.util.List r5 = r5.f16967b
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.util.List r0 = r2.f16966a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List r1 = r2.f16967b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MessageBlockContactData(contacts="
            r0.<init>(r1)
            java.util.List r1 = r2.f16966a
            r0.append(r1)
            java.lang.String r1 = ", labels="
            r0.append(r1)
            java.util.List r1 = r2.f16967b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
