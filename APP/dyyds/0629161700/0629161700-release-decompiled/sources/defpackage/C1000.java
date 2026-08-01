package defpackage;

/* JADX INFO: renamed from: ᛵᲈᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1000 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public boolean f4445;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public boolean f4446;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public int f4447;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public boolean f4448;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f4449;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public long f4450;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f4451;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f4452;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public int f4453;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public boolean f4454;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public int f4455;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f4456;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean f4457;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public boolean f4458;

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "State{mTargetPosition="
            r0.<init>(r1)
            int r1 = r2.f4453
            r0.append(r1)
            java.lang.String r1 = ", mData=null, mItemCount="
            r0.append(r1)
            int r1 = r2.f4449
            r0.append(r1)
            java.lang.String r1 = ", mIsMeasuring="
            r0.append(r1)
            boolean r1 = r2.f4448
            r0.append(r1)
            java.lang.String r1 = ", mPreviousLayoutItemCount="
            r0.append(r1)
            int r1 = r2.f4456
            r0.append(r1)
            java.lang.String r1 = ", mDeletedInvisibleItemCountSincePreviousLayout="
            r0.append(r1)
            int r1 = r2.f4452
            r0.append(r1)
            java.lang.String r1 = ", mStructureChanged="
            r0.append(r1)
            boolean r1 = r2.f4457
            r0.append(r1)
            java.lang.String r1 = ", mInPreLayout="
            r0.append(r1)
            boolean r1 = r2.f4458
            r0.append(r1)
            java.lang.String r1 = ", mRunSimpleAnimations="
            r0.append(r1)
            boolean r1 = r2.f4454
            r0.append(r1)
            java.lang.String r1 = ", mRunPredictiveAnimations="
            r0.append(r1)
            boolean r2 = r2.f4446
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m1956(int r4) {
            r3 = this;
            int r0 = r3.f4451
            r0 = r0 & r4
            if (r0 == 0) goto L6
            return
        L6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = java.lang.Integer.toBinaryString(r4)
            int r3 = r3.f4451
            java.lang.String r3 = java.lang.Integer.toBinaryString(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Layout state should be one of "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " but it is "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int m1957() {
            r1 = this;
            boolean r0 = r1.f4458
            if (r0 == 0) goto La
            int r0 = r1.f4456
            int r1 = r1.f4452
            int r0 = r0 - r1
            return r0
        La:
            int r1 = r1.f4449
            return r1
    }
}
