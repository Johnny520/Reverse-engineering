package com.android.p001dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public interface TranslationAdvice {
    int getMaxOptimalRegisterCount();

    boolean hasConstantOperation(Rop rop, RegisterSpec registerSpec, RegisterSpec registerSpec2);

    boolean requiresSourcesInOrder(Rop rop, RegisterSpecList registerSpecList);
}
