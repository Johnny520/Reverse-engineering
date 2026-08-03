package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public final class SetFactory {
    private static final int DOMFRONT_SET_THRESHOLD_SIZE = 3072;
    private static final int INTERFERENCE_SET_THRESHOLD_SIZE = 3072;
    private static final int LIVENESS_SET_THRESHOLD_SIZE = 3072;

    public SetFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.android.dx.util.IntSet makeDomFrontSet(int r1) {
            r0 = 3072(0xc00, float:4.305E-42)
            if (r1 > r0) goto La
            com.android.dx.util.BitIntSet r0 = new com.android.dx.util.BitIntSet
            r0.<init>(r1)
            goto Lf
        La:
            com.android.dx.util.ListIntSet r0 = new com.android.dx.util.ListIntSet
            r0.<init>()
        Lf:
            return r0
    }

    public static com.android.dx.util.IntSet makeInterferenceSet(int r1) {
            r0 = 3072(0xc00, float:4.305E-42)
            if (r1 > r0) goto La
            com.android.dx.util.BitIntSet r0 = new com.android.dx.util.BitIntSet
            r0.<init>(r1)
            goto Lf
        La:
            com.android.dx.util.ListIntSet r0 = new com.android.dx.util.ListIntSet
            r0.<init>()
        Lf:
            return r0
    }

    public static com.android.dx.util.IntSet makeLivenessSet(int r1) {
            r0 = 3072(0xc00, float:4.305E-42)
            if (r1 > r0) goto La
            com.android.dx.util.BitIntSet r0 = new com.android.dx.util.BitIntSet
            r0.<init>(r1)
            goto Lf
        La:
            com.android.dx.util.ListIntSet r0 = new com.android.dx.util.ListIntSet
            r0.<init>()
        Lf:
            return r0
    }
}
