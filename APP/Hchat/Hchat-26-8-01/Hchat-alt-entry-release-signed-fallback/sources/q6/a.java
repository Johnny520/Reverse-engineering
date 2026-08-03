package q6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r6.a {
    public final java.util.List b() {
            r3 = this;
            r6.c r0 = r3.f11543a
            if (r0 == 0) goto L15
            java.util.List r1 = x6.g.a(r3, r0)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L14
            x6.g.j(r3, r0)
            tf.t r0 = tf.t.f13167g
            return r0
        L14:
            return r1
        L15:
            java.lang.String r0 = "You must provide a configuration to resolve the member use build(configuration)."
            j8.o.t(r0)
            r0 = 0
            return r0
    }
}
