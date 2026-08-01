package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yz {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public long m;
    public int n;

    public final void a(int r4) {
        if ((this.d & r4) == 0) goto L6;
        return;
    L6:
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(r4) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.g == false) goto L7;
        return this.b - this.c;
    L7:
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.c + ", mStructureChanged=" + this.f + ", mInPreLayout=" + this.g + ", mRunSimpleAnimations=" + this.j + ", mRunPredictiveAnimations=" + this.k + '}';
    }
}
