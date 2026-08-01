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
            r3 = this;
            int r0 = r3.d
            r0 = r0 & r4
            if (r0 == 0) goto L6
            return
        L6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Layout state should be one of "
            r1.<init>(r2)
            java.lang.String r4 = java.lang.Integer.toBinaryString(r4)
            r1.append(r4)
            java.lang.String r4 = " but it is "
            r1.append(r4)
            int r4 = r3.d
            java.lang.String r4 = java.lang.Integer.toBinaryString(r4)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public final int b() {
            r2 = this;
            boolean r0 = r2.g
            if (r0 == 0) goto La
            int r0 = r2.b
            int r1 = r2.c
            int r0 = r0 - r1
            return r0
        La:
            int r0 = r2.e
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "State{mTargetPosition="
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", mData=null, mItemCount="
            r0.append(r1)
            int r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", mIsMeasuring="
            r0.append(r1)
            boolean r1 = r2.i
            r0.append(r1)
            java.lang.String r1 = ", mPreviousLayoutItemCount="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", mDeletedInvisibleItemCountSincePreviousLayout="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", mStructureChanged="
            r0.append(r1)
            boolean r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", mInPreLayout="
            r0.append(r1)
            boolean r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", mRunSimpleAnimations="
            r0.append(r1)
            boolean r1 = r2.j
            r0.append(r1)
            java.lang.String r1 = ", mRunPredictiveAnimations="
            r0.append(r1)
            boolean r1 = r2.k
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
