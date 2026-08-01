package com.android.p002dx.rop.code;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ConservativeTranslationAdvice implements TranslationAdvice {
    public static final ConservativeTranslationAdvice THE_ONE = new ConservativeTranslationAdvice();

    private ConservativeTranslationAdvice() {
    }

    @Override // com.android.p002dx.rop.code.TranslationAdvice
    public int getMaxOptimalRegisterCount() {
        return Integer.MAX_VALUE;
    }

    @Override // com.android.p002dx.rop.code.TranslationAdvice
    public boolean hasConstantOperation(Rop rop, RegisterSpec registerSpec, RegisterSpec registerSpec2) {
        return false;
    }

    @Override // com.android.p002dx.rop.code.TranslationAdvice
    public boolean requiresSourcesInOrder(Rop rop, RegisterSpecList registerSpecList) {
        return false;
    }
}
