package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class as0 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f1292;

    /* JADX INFO: renamed from: β */
    public int f1293;

    /* JADX INFO: renamed from: γ */
    public int f1294;

    /* JADX INFO: renamed from: δ */
    public boolean f1295;

    /* JADX INFO: renamed from: ε */
    public boolean f1296;

    public /* synthetic */ as0(int r1) {
            r0 = this;
            r0.f1292 = r1
            r0.<init>()
            return
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f1292
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AnchorInfo{mPosition="
            r0.<init>(r1)
            int r1 = r2.f1293
            r0.append(r1)
            java.lang.String r1 = ", mCoordinate="
            r0.append(r1)
            int r1 = r2.f1294
            r0.append(r1)
            java.lang.String r1 = ", mLayoutFromEnd="
            r0.append(r1)
            boolean r1 = r2.f1295
            r0.append(r1)
            java.lang.String r1 = ", mValid="
            r0.append(r1)
            boolean r2 = r2.f1296
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
