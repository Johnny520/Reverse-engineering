package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class km1 {

    /* JADX INFO: renamed from: α */
    public int f6027;

    /* JADX INFO: renamed from: β */
    public int f6028;

    /* JADX INFO: renamed from: γ */
    public boolean f6029;

    /* JADX INFO: renamed from: δ */
    public boolean f6030;

    /* JADX INFO: renamed from: ε */
    public boolean f6031;

    /* JADX INFO: renamed from: ζ */
    public boolean f6032;

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "State{mTargetPosition="
            r0.<init>(r1)
            int r1 = r2.f6027
            r0.append(r1)
            java.lang.String r1 = ", mData=null, mItemCount=0, mIsMeasuring=false, mPreviousLayoutItemCount=0, mDeletedInvisibleItemCountSincePreviousLayout="
            r0.append(r1)
            int r1 = r2.f6028
            r0.append(r1)
            java.lang.String r1 = ", mStructureChanged="
            r0.append(r1)
            boolean r1 = r2.f6029
            r0.append(r1)
            java.lang.String r1 = ", mInPreLayout="
            r0.append(r1)
            boolean r1 = r2.f6030
            r0.append(r1)
            java.lang.String r1 = ", mRunSimpleAnimations="
            r0.append(r1)
            boolean r1 = r2.f6031
            r0.append(r1)
            java.lang.String r1 = ", mRunPredictiveAnimations="
            r0.append(r1)
            boolean r2 = r2.f6032
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final int m3336() {
            r2 = this;
            boolean r0 = r2.f6030
            r1 = 0
            if (r0 == 0) goto L8
            int r2 = r2.f6028
            int r1 = r1 - r2
        L8:
            return r1
    }
}
