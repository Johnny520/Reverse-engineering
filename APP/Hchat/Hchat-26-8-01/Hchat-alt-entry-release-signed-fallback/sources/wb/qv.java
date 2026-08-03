package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class qv implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wb.jv f18742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f18743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18744i;

    public qv(wb.jv r1, boolean r2, i0.a1 r3) {
            r0 = this;
            r0.<init>()
            r0.f18742g = r1
            r0.f18743h = r2
            r0.f18744i = r3
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r3 = this;
            i0.a1 r0 = r3.f18744i
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            wb.jv r2 = r3.f18742g
            java.lang.String r2 = r2.f17140a
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r1 = tf.d0.S(r1, r2)
            goto L30
        L1d:
            boolean r1 = r3.f18743h
            if (r1 == 0) goto L26
            java.util.Set r1 = ac.p.N(r2)
            goto L30
        L26:
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r1 = tf.d0.V(r1, r2)
        L30:
            r0.setValue(r1)
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
