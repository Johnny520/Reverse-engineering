package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements java.util.Comparator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1207g;

    public /* synthetic */ h1(int r1) {
            r0 = this;
            r0.f1207g = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f1207g
            switch(r0) {
                case 0: goto L33;
                case 1: goto L22;
                default: goto L5;
            }
        L5:
            tf.w r2 = (tf.w) r2
            java.lang.Object r2 = r2.f13171b
            c9.a r2 = (c9.a) r2
            int r2 = r2.f1084d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            tf.w r3 = (tf.w) r3
            java.lang.Object r3 = r3.f13171b
            c9.a r3 = (c9.a) r3
            int r3 = r3.f1084d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r2 = r2.compareTo(r3)
            return r2
        L22:
            sf.e r2 = (sf.e) r2
            java.lang.Object r2 = r2.f12418g
            java.lang.Integer r2 = (java.lang.Integer) r2
            sf.e r3 = (sf.e) r3
            java.lang.Object r3 = r3.f12418g
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r2 = a7.a.m(r2, r3)
            return r2
        L33:
            c9.a r2 = (c9.a) r2
            int r2 = r2.f1084d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            c9.a r3 = (c9.a) r3
            int r3 = r3.f1084d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r2 = r2.compareTo(r3)
            return r2
    }
}
