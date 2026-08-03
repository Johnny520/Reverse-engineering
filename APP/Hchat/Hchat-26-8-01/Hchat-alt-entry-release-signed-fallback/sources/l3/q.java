package l3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements l3.o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f7810h;

    public /* synthetic */ q(java.lang.String r1, int r2) {
            r0 = this;
            r0.f7809g = r2
            r0.f7810h = r1
            r0.<init>()
            return
    }

    @Override // l3.o
    public boolean a(java.lang.CharSequence r1, int r2, int r3, l3.u r4) {
            r0 = this;
            java.lang.CharSequence r1 = r1.subSequence(r2, r3)
            java.lang.String r2 = r0.f7810h
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L16
            int r1 = r4.f7828c
            r1 = r1 & 3
            r1 = r1 | 4
            r4.f7828c = r1
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    @Override // l3.o
    public java.lang.Object e() {
            r0 = this;
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.f7809g
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<"
            r0.<init>(r1)
            java.lang.String r1 = r3.f7810h
            r2 = 62
            java.lang.String r0 = eh.a.q(r0, r1, r2)
            return r0
    }
}
