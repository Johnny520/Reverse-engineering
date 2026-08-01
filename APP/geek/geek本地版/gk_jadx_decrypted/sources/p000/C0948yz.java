package p000;

/* JADX INFO: renamed from: yz */
/* JADX INFO: loaded from: classes.dex */
public final class C0948yz {

    /* JADX INFO: renamed from: a */
    public int f5415a;

    /* JADX INFO: renamed from: b */
    public int f5416b;

    /* JADX INFO: renamed from: c */
    public int f5417c;

    /* JADX INFO: renamed from: d */
    public int f5418d;

    /* JADX INFO: renamed from: e */
    public int f5419e;

    /* JADX INFO: renamed from: f */
    public boolean f5420f;

    /* JADX INFO: renamed from: g */
    public boolean f5421g;

    /* JADX INFO: renamed from: h */
    public boolean f5422h;

    /* JADX INFO: renamed from: i */
    public boolean f5423i;

    /* JADX INFO: renamed from: j */
    public boolean f5424j;

    /* JADX INFO: renamed from: k */
    public boolean f5425k;

    /* JADX INFO: renamed from: l */
    public int f5426l;

    /* JADX INFO: renamed from: m */
    public long f5427m;

    /* JADX INFO: renamed from: n */
    public int f5428n;

    /* JADX INFO: renamed from: a */
    public final void m2744a(int i) {
        if ((this.f5418d & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f5418d));
    }

    /* JADX INFO: renamed from: b */
    public final int m2745b() {
        return this.f5421g ? this.f5416b - this.f5417c : this.f5419e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f5415a + ", mData=null, mItemCount=" + this.f5419e + ", mIsMeasuring=" + this.f5423i + ", mPreviousLayoutItemCount=" + this.f5416b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f5417c + ", mStructureChanged=" + this.f5420f + ", mInPreLayout=" + this.f5421g + ", mRunSimpleAnimations=" + this.f5424j + ", mRunPredictiveAnimations=" + this.f5425k + '}';
    }
}
