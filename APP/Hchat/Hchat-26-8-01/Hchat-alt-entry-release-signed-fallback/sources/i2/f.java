package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements java.util.Comparator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6297g;

    public /* synthetic */ f(int r1) {
            r0 = this;
            r0.f6297g = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f6297g
            switch(r0) {
                case 0: goto L1a;
                default: goto L5;
            }
        L5:
            i2.e r2 = (i2.e) r2
            int r2 = r2.f6289b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            i2.e r3 = (i2.e) r3
            int r3 = r3.f6289b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r2 = r2.compareTo(r3)
            return r2
        L1a:
            i2.e r2 = (i2.e) r2
            int r2 = r2.f6289b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            i2.e r3 = (i2.e) r3
            int r3 = r3.f6289b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r2 = r2.compareTo(r3)
            return r2
    }
}
