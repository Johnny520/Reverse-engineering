package com.android.dx.ssa;

import com.android.dx.util.BitIntSet;
import com.android.dx.util.IntSet;
import com.android.dx.util.ListIntSet;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class SetFactory {
    private static final int DOMFRONT_SET_THRESHOLD_SIZE = 3072;
    private static final int INTERFERENCE_SET_THRESHOLD_SIZE = 3072;
    private static final int LIVENESS_SET_THRESHOLD_SIZE = 3072;

    public static IntSet makeDomFrontSet(int i) {
        return i <= 3072 ? new BitIntSet(i) : new ListIntSet();
    }

    public static IntSet makeInterferenceSet(int i) {
        return i <= 3072 ? new BitIntSet(i) : new ListIntSet();
    }

    public static IntSet makeLivenessSet(int i) {
        return i <= 3072 ? new BitIntSet(i) : new ListIntSet();
    }
}
