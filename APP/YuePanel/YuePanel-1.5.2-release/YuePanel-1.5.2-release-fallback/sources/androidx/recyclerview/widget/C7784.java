package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7784 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f30036 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f30037 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f30038 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f30039 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f30040 = 1;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean f30041;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f30042;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f30043;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f30044;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f30045;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f30046;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f30047;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean f30048;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean f30049;

    public C7784() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f30041 = r0
            r0 = 0
            r1.f30046 = r0
            r1.f30047 = r0
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "LayoutState{mAvailable="
            r0.append(r1)
            int r1 = r2.f30042
            r0.append(r1)
            java.lang.String r1 = ", mCurrentPosition="
            r0.append(r1)
            int r1 = r2.f30043
            r0.append(r1)
            java.lang.String r1 = ", mItemDirection="
            r0.append(r1)
            int r1 = r2.f30044
            r0.append(r1)
            java.lang.String r1 = ", mLayoutDirection="
            r0.append(r1)
            int r1 = r2.f30045
            r0.append(r1)
            java.lang.String r1 = ", mStartLine="
            r0.append(r1)
            int r1 = r2.f30046
            r0.append(r1)
            java.lang.String r1 = ", mEndLine="
            r0.append(r1)
            int r1 = r2.f30047
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean m30218(androidx.recyclerview.widget.RecyclerView.C7713 r2) {
            r1 = this;
            int r0 = r1.f30043
            if (r0 < 0) goto Lc
            int r2 = r2.m29858()
            if (r0 >= r2) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.view.View m30219(androidx.recyclerview.widget.RecyclerView.C7704 r3) {
            r2 = this;
            int r0 = r2.f30043
            android.view.View r3 = r3.m29811(r0)
            int r0 = r2.f30043
            int r1 = r2.f30044
            int r0 = r0 + r1
            r2.f30043 = r0
            return r3
    }
}
