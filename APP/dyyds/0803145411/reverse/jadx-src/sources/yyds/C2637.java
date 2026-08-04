package yyds;

/* JADX INFO: renamed from: yyds.ᲈᛳᲇᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2637 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public int f12970;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public boolean f12971;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public long f12972;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public boolean f12973;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f12974;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public int f12975;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f12976;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f12977;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public boolean f12978;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public int f12979;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public boolean f12980;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f12981;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f12982;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f12983;

    public final String toString() {
        StringBuilder sb = new StringBuilder("State{mTargetPosition=");
        sb.append(this.f12975);
        sb.append(", mData=null, mItemCount=");
        sb.append(this.f12974);
        sb.append(", mIsMeasuring=");
        sb.append(this.f12973);
        sb.append(", mPreviousLayoutItemCount=");
        sb.append(this.f12976);
        sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb.append(this.f12981);
        sb.append(", mStructureChanged=");
        sb.append(this.f12982);
        sb.append(", mInPreLayout=");
        sb.append(this.f12977);
        sb.append(", mRunSimpleAnimations=");
        sb.append(this.f12980);
        sb.append(", mRunPredictiveAnimations=");
        return AbstractC0897.m1986(sb, this.f12978, '}');
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4741(int i) {
        if ((this.f12983 & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f12983));
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int m4742() {
        return this.f12977 ? this.f12976 - this.f12981 : this.f12974;
    }
}
