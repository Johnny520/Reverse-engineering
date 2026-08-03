package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public final class Zeroes {
    private Zeroes() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.android.dx.rop.cst.Constant zeroFor(com.android.dx.rop.type.Type r3) {
            int r0 = r3.getBasicType()
            switch(r0) {
                case 1: goto L3a;
                case 2: goto L37;
                case 3: goto L34;
                case 4: goto L31;
                case 5: goto L2e;
                case 6: goto L2b;
                case 7: goto L28;
                case 8: goto L25;
                case 9: goto L22;
                default: goto L7;
            }
        L7:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no zero for type: "
            r1.append(r2)
            java.lang.String r3 = r3.toHuman()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L22:
            com.android.dx.rop.cst.CstKnownNull r3 = com.android.dx.rop.cst.CstKnownNull.THE_ONE
            return r3
        L25:
            com.android.dx.rop.cst.CstShort r3 = com.android.dx.rop.cst.CstShort.VALUE_0
            return r3
        L28:
            com.android.dx.rop.cst.CstLong r3 = com.android.dx.rop.cst.CstLong.VALUE_0
            return r3
        L2b:
            com.android.dx.rop.cst.CstInteger r3 = com.android.dx.rop.cst.CstInteger.VALUE_0
            return r3
        L2e:
            com.android.dx.rop.cst.CstFloat r3 = com.android.dx.rop.cst.CstFloat.VALUE_0
            return r3
        L31:
            com.android.dx.rop.cst.CstDouble r3 = com.android.dx.rop.cst.CstDouble.VALUE_0
            return r3
        L34:
            com.android.dx.rop.cst.CstChar r3 = com.android.dx.rop.cst.CstChar.VALUE_0
            return r3
        L37:
            com.android.dx.rop.cst.CstByte r3 = com.android.dx.rop.cst.CstByte.VALUE_0
            return r3
        L3a:
            com.android.dx.rop.cst.CstBoolean r3 = com.android.dx.rop.cst.CstBoolean.VALUE_FALSE
            return r3
    }
}
