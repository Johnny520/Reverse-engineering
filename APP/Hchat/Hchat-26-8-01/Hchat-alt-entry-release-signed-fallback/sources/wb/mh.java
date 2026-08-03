package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mh implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wb.e6 f17687h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17688i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17689j;

    public /* synthetic */ mh(wb.e6 r1, i0.a1 r2, i0.a1 r3, int r4) {
            r0 = this;
            r0.f17686g = r4
            r0.f17687h = r1
            r0.f17688i = r2
            r0.f17689j = r3
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f17686g
            switch(r0) {
                case 0: goto L73;
                case 1: goto L3d;
                default: goto L5;
            }
        L5:
            wb.e6 r0 = r3.f17687h
            java.lang.String r0 = r0.f15834a
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            i0.a1 r1 = r3.f17688i
            if (r4 == 0) goto L1e
            java.lang.Object r4 = r1.getValue()
            java.util.Set r4 = (java.util.Set) r4
            java.util.LinkedHashSet r4 = tf.d0.V(r4, r0)
            goto L37
        L1e:
            java.lang.String r4 = "text"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L2d
            java.lang.String r4 = ""
            i0.a1 r2 = r3.f17689j
            r2.setValue(r4)
        L2d:
            java.lang.Object r4 = r1.getValue()
            java.util.Set r4 = (java.util.Set) r4
            java.util.LinkedHashSet r4 = tf.d0.S(r4, r0)
        L37:
            r1.setValue(r4)
        L3a:
            sf.n r4 = sf.n.f12433a
            return r4
        L3d:
            wb.e6 r0 = r3.f17687h
            java.lang.String r0 = r0.f15834a
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            i0.a1 r1 = r3.f17688i
            if (r4 == 0) goto L56
            java.lang.Object r4 = r1.getValue()
            java.util.Set r4 = (java.util.Set) r4
            java.util.LinkedHashSet r4 = tf.d0.V(r4, r0)
            goto L6f
        L56:
            java.lang.String r4 = "text"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L65
            java.lang.String r4 = ""
            i0.a1 r2 = r3.f17689j
            r2.setValue(r4)
        L65:
            java.lang.Object r4 = r1.getValue()
            java.util.Set r4 = (java.util.Set) r4
            java.util.LinkedHashSet r4 = tf.d0.S(r4, r0)
        L6f:
            r1.setValue(r4)
            goto L3a
        L73:
            wb.e6 r0 = r3.f17687h
            java.lang.String r0 = r0.f15834a
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            i0.a1 r1 = r3.f17688i
            if (r4 == 0) goto L8c
            java.lang.Object r4 = r1.getValue()
            java.util.Set r4 = (java.util.Set) r4
            java.util.LinkedHashSet r4 = tf.d0.V(r4, r0)
            goto La5
        L8c:
            java.lang.String r4 = "text"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L9b
            java.lang.String r4 = ""
            i0.a1 r2 = r3.f17689j
            r2.setValue(r4)
        L9b:
            java.lang.Object r4 = r1.getValue()
            java.util.Set r4 = (java.util.Set) r4
            java.util.LinkedHashSet r4 = tf.d0.S(r4, r0)
        La5:
            r1.setValue(r4)
            goto L3a
    }
}
