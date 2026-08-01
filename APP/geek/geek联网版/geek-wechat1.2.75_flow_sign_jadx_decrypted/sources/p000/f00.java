package p000;

/* JADX INFO: loaded from: classes.dex */
public final class f00 {

    /* JADX INFO: renamed from: a */
    public int f1705a;

    /* JADX INFO: renamed from: b */
    public int f1706b;

    /* JADX INFO: renamed from: c */
    public int f1707c;

    /* JADX INFO: renamed from: d */
    public int f1708d;

    /* JADX INFO: renamed from: e */
    public int f1709e;

    /* JADX INFO: renamed from: f */
    public boolean f1710f;

    /* JADX INFO: renamed from: g */
    public boolean f1711g;

    /* JADX INFO: renamed from: h */
    public boolean f1712h;

    /* JADX INFO: renamed from: i */
    public boolean f1713i;

    /* JADX INFO: renamed from: j */
    public boolean f1714j;

    /* JADX INFO: renamed from: k */
    public boolean f1715k;

    /* JADX INFO: renamed from: l */
    public int f1716l;

    /* JADX INFO: renamed from: m */
    public long f1717m;

    /* JADX INFO: renamed from: n */
    public int f1718n;

    /* JADX INFO: renamed from: a */
    public final void m1067a(int i) {
        if ((this.f1708d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f1708d));
    }

    /* JADX INFO: renamed from: b */
    public final int m1068b() {
        return this.f1711g ? this.f1706b - this.f1707c : this.f1709e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f1705a + ", mData=null, mItemCount=" + this.f1709e + ", mIsMeasuring=" + this.f1713i + ", mPreviousLayoutItemCount=" + this.f1706b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1707c + ", mStructureChanged=" + this.f1710f + ", mInPreLayout=" + this.f1711g + ", mRunSimpleAnimations=" + this.f1714j + ", mRunPredictiveAnimations=" + this.f1715k + '}';
    }
}
