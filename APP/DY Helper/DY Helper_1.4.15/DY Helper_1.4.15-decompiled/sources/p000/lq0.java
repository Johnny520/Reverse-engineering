package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class lq0 {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f6736;

    /* JADX INFO: renamed from: β */
    public int f6737;

    /* JADX INFO: renamed from: γ */
    public int f6738;

    /* JADX INFO: renamed from: δ */
    public int f6739;

    /* JADX INFO: renamed from: ε */
    public int f6740;

    /* JADX INFO: renamed from: ζ */
    public int f6741;

    /* JADX INFO: renamed from: η */
    public int f6742;

    /* JADX INFO: renamed from: θ */
    public boolean f6743;

    /* JADX INFO: renamed from: ι */
    public boolean f6744;

    public /* synthetic */ lq0(int r1) {
            r0 = this;
            r0.f6736 = r1
            r0.<init>()
            return
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f6736
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LayoutState{mAvailable="
            r0.<init>(r1)
            int r1 = r2.f6737
            r0.append(r1)
            java.lang.String r1 = ", mCurrentPosition="
            r0.append(r1)
            int r1 = r2.f6738
            r0.append(r1)
            java.lang.String r1 = ", mItemDirection="
            r0.append(r1)
            int r1 = r2.f6739
            r0.append(r1)
            java.lang.String r1 = ", mLayoutDirection="
            r0.append(r1)
            int r1 = r2.f6740
            r0.append(r1)
            java.lang.String r1 = ", mStartLine="
            r0.append(r1)
            int r1 = r2.f6741
            r0.append(r1)
            java.lang.String r1 = ", mEndLine="
            r0.append(r1)
            int r2 = r2.f6742
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: α */
    public void m3655(int r3, int r4) {
            r2 = this;
            r2.f6739 = r3
            r2.f6740 = r4
            r0 = 1
            r2.f6744 = r0
            boolean r0 = r2.f6743
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L16
            if (r4 == r1) goto L11
            r2.f6737 = r4
        L11:
            if (r3 == r1) goto L1e
            r2.f6738 = r3
            return
        L16:
            if (r3 == r1) goto L1a
            r2.f6737 = r3
        L1a:
            if (r4 == r1) goto L1e
            r2.f6738 = r4
        L1e:
            return
    }
}
