package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ka implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17232j;

    public /* synthetic */ ka(int r2, i0.a1 r3, i0.a1 r4) {
            r1 = this;
            r0 = 2
            r1.f17229g = r0
            r1.<init>()
            r1.f17231i = r3
            r1.f17230h = r2
            r1.f17232j = r4
            return
    }

    public /* synthetic */ ka(int r1, i0.a1 r2, i0.a1 r3, int r4) {
            r0 = this;
            r0.f17229g = r4
            r0.f17230h = r1
            r0.f17231i = r2
            r0.f17232j = r3
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r4 = this;
            int r0 = r4.f17229g
            switch(r0) {
                case 0: goto L56;
                case 1: goto L22;
                default: goto L5;
            }
        L5:
            i0.a1 r0 = r4.f17231i
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r1 = tf.m.R1(r1)
            int r2 = r4.f17230h
            r1.remove(r2)
            r0.setValue(r1)
            r0 = 0
            i0.a1 r1 = r4.f17232j
            r1.setValue(r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L22:
            i0.a1 r0 = r4.f17231i
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            int r1 = a.a.b0(r1)
            int r2 = r4.f17230h
            if (r2 >= r1) goto L53
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r1 = tf.m.R1(r1)
            java.lang.Object r3 = r1.remove(r2)
            na.h r3 = (na.h) r3
            int r2 = r2 + 1
            r1.add(r2, r3)
            r0.setValue(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            i0.a1 r1 = r4.f17232j
            r1.setValue(r0)
        L53:
            sf.n r0 = sf.n.f12433a
            return r0
        L56:
            int r0 = r4.f17230h
            if (r0 <= 0) goto L7d
            i0.a1 r1 = r4.f17231i
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r2 = tf.m.R1(r2)
            java.lang.Object r3 = r2.remove(r0)
            na.h r3 = (na.h) r3
            int r0 = r0 + (-1)
            r2.add(r0, r3)
            r1.setValue(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            i0.a1 r1 = r4.f17232j
            r1.setValue(r0)
        L7d:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
