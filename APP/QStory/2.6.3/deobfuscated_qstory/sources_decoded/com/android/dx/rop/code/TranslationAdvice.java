package com.android.dx.rop.code;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface TranslationAdvice {
    int getMaxOptimalRegisterCount();

    boolean hasConstantOperation(Rop rop, RegisterSpec registerSpec, RegisterSpec registerSpec2);

    boolean requiresSourcesInOrder(Rop rop, RegisterSpecList registerSpecList);
}
