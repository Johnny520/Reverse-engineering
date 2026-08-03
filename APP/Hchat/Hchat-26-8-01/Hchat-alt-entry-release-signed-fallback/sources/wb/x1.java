package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x1 implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wb.s0 f20077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20078i;

    public /* synthetic */ x1(wb.s0 r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f20076g = r3
            r0.f20077h = r1
            r0.f20078i = r2
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r3 = this;
            int r0 = r3.f20076g
            switch(r0) {
                case 0: goto Lb4;
                case 1: goto L88;
                case 2: goto L5d;
                case 3: goto L32;
                default: goto L5;
            }
        L5:
            i0.a1 r0 = r3.f20078i
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            wb.s0 r2 = r3.f20077h
            java.lang.String r2 = r2.f18970a
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r1 = tf.d0.S(r1, r2)
            goto L2c
        L22:
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r1 = tf.d0.V(r1, r2)
        L2c:
            r0.setValue(r1)
        L2f:
            sf.n r0 = sf.n.f12433a
            return r0
        L32:
            i0.a1 r0 = r3.f20078i
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            wb.s0 r2 = r3.f20077h
            java.lang.String r2 = r2.f18970a
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r1 = tf.d0.S(r1, r2)
            goto L59
        L4f:
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r1 = tf.d0.V(r1, r2)
        L59:
            r0.setValue(r1)
            goto L2f
        L5d:
            i0.a1 r0 = r3.f20078i
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            wb.s0 r2 = r3.f20077h
            java.lang.String r2 = r2.f18970a
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r1 = tf.d0.S(r1, r2)
            goto L84
        L7a:
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r1 = tf.d0.V(r1, r2)
        L84:
            r0.setValue(r1)
            goto L2f
        L88:
            i0.a1 r0 = r3.f20078i
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            wb.s0 r2 = r3.f20077h
            java.lang.String r2 = r2.f18970a
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto La5
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r1 = tf.d0.S(r1, r2)
            goto Laf
        La5:
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r1 = tf.d0.V(r1, r2)
        Laf:
            r0.setValue(r1)
            goto L2f
        Lb4:
            i0.a1 r0 = r3.f20078i
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            wb.s0 r2 = r3.f20077h
            java.lang.String r2 = r2.f18970a
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto Ld1
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r1 = tf.d0.S(r1, r2)
            goto Ldb
        Ld1:
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r1 = tf.d0.V(r1, r2)
        Ldb:
            r0.setValue(r1)
            goto L2f
    }
}
