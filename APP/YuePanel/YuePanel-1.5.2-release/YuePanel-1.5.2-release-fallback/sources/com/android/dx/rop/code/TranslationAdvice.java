package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public interface TranslationAdvice {
    int getMaxOptimalRegisterCount();

    boolean hasConstantOperation(com.android.dx.rop.code.Rop r1, com.android.dx.rop.code.RegisterSpec r2, com.android.dx.rop.code.RegisterSpec r3);

    boolean requiresSourcesInOrder(com.android.dx.rop.code.Rop r1, com.android.dx.rop.code.RegisterSpecList r2);
}
