package y0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends y0.n implements x1.v {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f21836u;

    @Override // x1.v
    public final v1.o0 j(v1.p0 r3, v1.m0 r4, long r5) {
            r2 = this;
            v1.b1 r4 = r4.Q(r5)
            int r5 = r4.f13900g
            int r6 = r4.f13901h
            f1.p r0 = new f1.p
            r1 = 6
            r0.<init>(r4, r1, r2)
            tf.u r4 = tf.u.f13168g
            v1.o0 r3 = r3.z(r5, r6, r4, r0)
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ZIndexModifier(zIndex="
            r0.<init>(r1)
            float r1 = r3.f21836u
            r2 = 41
            java.lang.String r0 = eh.a.o(r0, r1, r2)
            return r0
    }
}
