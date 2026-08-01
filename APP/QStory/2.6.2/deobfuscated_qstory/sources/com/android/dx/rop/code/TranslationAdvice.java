package com.android.dx.rop.code;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface TranslationAdvice {
    int getMaxOptimalRegisterCount();

    boolean hasConstantOperation(Rop rop, RegisterSpec registerSpec, RegisterSpec registerSpec2);

    boolean requiresSourcesInOrder(Rop rop, RegisterSpecList registerSpecList);
}
