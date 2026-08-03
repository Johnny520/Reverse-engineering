package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public final class DexTranslationAdvice implements com.android.dx.rop.code.TranslationAdvice {
    private static final int MIN_INVOKE_IN_ORDER = 6;
    public static final com.android.dx.rop.code.DexTranslationAdvice NO_SOURCES_IN_ORDER = null;
    public static final com.android.dx.rop.code.DexTranslationAdvice THE_ONE = null;
    private final boolean disableSourcesInOrder;

    static {
            com.android.dx.rop.code.DexTranslationAdvice r0 = new com.android.dx.rop.code.DexTranslationAdvice
            r0.<init>()
            com.android.dx.rop.code.DexTranslationAdvice.THE_ONE = r0
            com.android.dx.rop.code.DexTranslationAdvice r0 = new com.android.dx.rop.code.DexTranslationAdvice
            r1 = 1
            r0.<init>(r1)
            com.android.dx.rop.code.DexTranslationAdvice.NO_SOURCES_IN_ORDER = r0
            return
    }

    private DexTranslationAdvice() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.disableSourcesInOrder = r0
            return
    }

    private DexTranslationAdvice(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.disableSourcesInOrder = r1
            return
    }

    private int totalRopWidth(com.android.dx.rop.code.RegisterSpecList r5) {
            r4 = this;
            int r0 = r5.size()
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r0) goto L14
            com.android.dx.rop.code.RegisterSpec r3 = r5.get(r1)
            int r3 = r3.getCategory()
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L6
        L14:
            return r2
    }

    @Override // com.android.dx.rop.code.TranslationAdvice
    public int getMaxOptimalRegisterCount() {
            r1 = this;
            r0 = 16
            return r0
    }

    @Override // com.android.dx.rop.code.TranslationAdvice
    public boolean hasConstantOperation(com.android.dx.rop.code.Rop r4, com.android.dx.rop.code.RegisterSpec r5, com.android.dx.rop.code.RegisterSpec r6) {
            r3 = this;
            com.android.dx.rop.type.Type r0 = r5.getType()
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.INT
            r2 = 0
            if (r0 == r1) goto La
            return r2
        La:
            com.android.dx.rop.type.TypeBearer r0 = r6.getTypeBearer()
            boolean r0 = r0 instanceof com.android.dx.rop.cst.CstInteger
            if (r0 != 0) goto L2e
            com.android.dx.rop.type.TypeBearer r6 = r5.getTypeBearer()
            boolean r6 = r6 instanceof com.android.dx.rop.cst.CstInteger
            if (r6 == 0) goto L2d
            int r4 = r4.getOpcode()
            r6 = 15
            if (r4 != r6) goto L2d
            com.android.dx.rop.type.TypeBearer r4 = r5.getTypeBearer()
            com.android.dx.rop.cst.CstInteger r4 = (com.android.dx.rop.cst.CstInteger) r4
            boolean r4 = r4.fitsIn16Bits()
            return r4
        L2d:
            return r2
        L2e:
            com.android.dx.rop.type.TypeBearer r5 = r6.getTypeBearer()
            com.android.dx.rop.cst.CstInteger r5 = (com.android.dx.rop.cst.CstInteger) r5
            int r4 = r4.getOpcode()
            switch(r4) {
                case 14: goto L4f;
                case 15: goto L41;
                case 16: goto L4f;
                case 17: goto L4f;
                case 18: goto L4f;
                case 19: goto L3b;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L3c;
                case 24: goto L3c;
                case 25: goto L3c;
                default: goto L3b;
            }
        L3b:
            return r2
        L3c:
            boolean r4 = r5.fitsIn8Bits()
            return r4
        L41:
            int r4 = r5.getValue()
            int r4 = -r4
            com.android.dx.rop.cst.CstInteger r4 = com.android.dx.rop.cst.CstInteger.make(r4)
            boolean r4 = r4.fitsIn16Bits()
            return r4
        L4f:
            boolean r4 = r5.fitsIn16Bits()
            return r4
    }

    @Override // com.android.dx.rop.code.TranslationAdvice
    public boolean requiresSourcesInOrder(com.android.dx.rop.code.Rop r2, com.android.dx.rop.code.RegisterSpecList r3) {
            r1 = this;
            boolean r0 = r1.disableSourcesInOrder
            if (r0 != 0) goto L13
            boolean r2 = r2.isCallLike()
            if (r2 == 0) goto L13
            int r2 = r1.totalRopWidth(r3)
            r3 = 6
            if (r2 < r3) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            return r2
    }
}
