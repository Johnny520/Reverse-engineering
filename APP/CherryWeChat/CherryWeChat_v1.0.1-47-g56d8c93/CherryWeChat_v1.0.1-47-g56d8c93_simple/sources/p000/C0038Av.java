package p000;

/* JADX INFO: renamed from: Av */
/* JADX INFO: loaded from: classes.dex */
public final class C0038Av {

    /* JADX INFO: renamed from: a */
    public int f76a;

    /* JADX INFO: renamed from: b */
    public int f77b;

    /* JADX INFO: renamed from: c */
    public int f78c;

    /* JADX INFO: renamed from: d */
    public int f79d;

    /* JADX INFO: renamed from: e */
    public int f80e;

    /* JADX INFO: renamed from: f */
    public boolean f81f;

    /* JADX INFO: renamed from: g */
    public boolean f82g;

    /* JADX INFO: renamed from: h */
    public boolean f83h;

    /* JADX INFO: renamed from: i */
    public boolean f84i;

    /* JADX INFO: renamed from: j */
    public boolean f85j;

    /* JADX INFO: renamed from: k */
    public boolean f86k;

    /* JADX INFO: renamed from: l */
    public int f87l;

    /* JADX INFO: renamed from: m */
    public long f88m;

    /* JADX INFO: renamed from: n */
    public int f89n;

    /* JADX INFO: renamed from: a */
    public final void m57a(int r4) {
        if ((this.f79d & r4) == 0) goto L6;
        return;
    L6:
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(r4) + " but it is " + Integer.toBinaryString(this.f79d));
    }

    /* JADX INFO: renamed from: b */
    public final int m58b() {
        if (this.f82g == false) goto L7;
        return this.f77b - this.f78c;
    L7:
        return this.f80e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f76a + ", mData=null, mItemCount=" + this.f80e + ", mIsMeasuring=" + this.f84i + ", mPreviousLayoutItemCount=" + this.f77b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f78c + ", mStructureChanged=" + this.f81f + ", mInPreLayout=" + this.f82g + ", mRunSimpleAnimations=" + this.f85j + ", mRunPredictiveAnimations=" + this.f86k + '}';
    }
}
