package com.android.p002dx.ssa;

import com.android.p002dx.util.BitIntSet;
import com.android.p002dx.util.IntSet;
import com.android.p002dx.util.ListIntSet;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
