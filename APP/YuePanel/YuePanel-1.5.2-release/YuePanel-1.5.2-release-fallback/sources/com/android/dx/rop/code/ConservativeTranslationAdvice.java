package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public final class ConservativeTranslationAdvice implements com.android.dx.rop.code.TranslationAdvice {
    public static final com.android.dx.rop.code.ConservativeTranslationAdvice THE_ONE = null;

    static {
            com.android.dx.rop.code.ConservativeTranslationAdvice r0 = new com.android.dx.rop.code.ConservativeTranslationAdvice
            r0.<init>()
            com.android.dx.rop.code.ConservativeTranslationAdvice.THE_ONE = r0
            return
    }

    private ConservativeTranslationAdvice() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.android.dx.rop.code.TranslationAdvice
    public int getMaxOptimalRegisterCount() {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
    }

    @Override // com.android.dx.rop.code.TranslationAdvice
    public boolean hasConstantOperation(com.android.dx.rop.code.Rop r1, com.android.dx.rop.code.RegisterSpec r2, com.android.dx.rop.code.RegisterSpec r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // com.android.dx.rop.code.TranslationAdvice
    public boolean requiresSourcesInOrder(com.android.dx.rop.code.Rop r1, com.android.dx.rop.code.RegisterSpecList r2) {
            r0 = this;
            r1 = 0
            return r1
    }
}
