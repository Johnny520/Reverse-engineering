package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public class ValueAwareMachine extends com.android.dx.cf.code.BaseMachine {
    public ValueAwareMachine(com.android.dx.rop.type.Prototype r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.android.dx.cf.code.Machine
    public void run(com.android.dx.cf.code.Frame r3, int r4, int r5) {
            r2 = this;
            if (r5 == 0) goto L10c
            r0 = 20
            if (r5 == r0) goto L102
            r0 = 21
            r1 = 0
            if (r5 == r0) goto Lfa
            r0 = 171(0xab, float:2.4E-43)
            if (r5 == r0) goto L10c
            r0 = 172(0xac, float:2.41E-43)
            if (r5 == r0) goto L10c
            switch(r5) {
                case 0: goto L10c;
                case 18: goto L102;
                case 46: goto Lf2;
                case 54: goto Lfa;
                case 79: goto L10c;
                case 100: goto Lf2;
                case 104: goto Lf2;
                case 108: goto Lf2;
                case 112: goto Lf2;
                case 116: goto Lf2;
                case 120: goto Lf2;
                case 122: goto Lf2;
                case 124: goto Lf2;
                case 126: goto Lf2;
                case 128: goto Lf2;
                case 130: goto Lf2;
                default: goto L16;
            }
        L16:
            switch(r5) {
                case 87: goto L10c;
                case 88: goto L10c;
                case 89: goto Ldb;
                case 90: goto Ldb;
                case 91: goto Ldb;
                case 92: goto Ldb;
                case 93: goto Ldb;
                case 94: goto Ldb;
                case 95: goto Ldb;
                case 96: goto Lf2;
                default: goto L19;
            }
        L19:
            switch(r5) {
                case 132: goto Lf2;
                case 133: goto Lf2;
                case 134: goto Lf2;
                case 135: goto Lf2;
                case 136: goto Lf2;
                case 137: goto Lf2;
                case 138: goto Lf2;
                case 139: goto Lf2;
                case 140: goto Lf2;
                case 141: goto Lf2;
                case 142: goto Lf2;
                case 143: goto Lf2;
                case 144: goto Lf2;
                case 145: goto Lf2;
                case 146: goto Lf2;
                case 147: goto Lf2;
                case 148: goto Lf2;
                case 149: goto Lf2;
                case 150: goto Lf2;
                case 151: goto Lf2;
                case 152: goto Lf2;
                case 153: goto L10c;
                case 154: goto L10c;
                case 155: goto L10c;
                case 156: goto L10c;
                case 157: goto L10c;
                case 158: goto L10c;
                case 159: goto L10c;
                case 160: goto L10c;
                case 161: goto L10c;
                case 162: goto L10c;
                case 163: goto L10c;
                case 164: goto L10c;
                case 165: goto L10c;
                case 166: goto L10c;
                case 167: goto L10c;
                case 168: goto Lce;
                case 169: goto L10c;
                default: goto L1c;
            }
        L1c:
            switch(r5) {
                case 177: goto L10c;
                case 178: goto Lb8;
                case 179: goto L10c;
                case 180: goto Lb8;
                case 181: goto L10c;
                case 182: goto Lb8;
                case 183: goto L91;
                case 184: goto Lb8;
                case 185: goto Lb8;
                case 186: goto L79;
                case 187: goto L66;
                case 188: goto L57;
                case 189: goto L44;
                case 190: goto Lf2;
                case 191: goto L10c;
                case 192: goto L57;
                case 193: goto L3d;
                case 194: goto L10c;
                case 195: goto L10c;
                default: goto L1f;
            }
        L1f:
            switch(r5) {
                case 197: goto L57;
                case 198: goto L10c;
                case 199: goto L10c;
                default: goto L22;
            }
        L22:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "shouldn't happen: "
            r4.append(r0)
            java.lang.String r5 = com.android.dx.util.Hex.u1(r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L3d:
            com.android.dx.rop.type.Type r4 = com.android.dx.rop.type.Type.INT
            r2.setResult(r4)
            goto L10f
        L44:
            com.android.dx.rop.cst.Constant r4 = r2.getAuxCst()
            com.android.dx.rop.cst.CstType r4 = (com.android.dx.rop.cst.CstType) r4
            com.android.dx.rop.type.Type r4 = r4.getClassType()
            com.android.dx.rop.type.Type r4 = r4.getArrayType()
            r2.setResult(r4)
            goto L10f
        L57:
            com.android.dx.rop.cst.Constant r4 = r2.getAuxCst()
            com.android.dx.rop.cst.CstType r4 = (com.android.dx.rop.cst.CstType) r4
            com.android.dx.rop.type.Type r4 = r4.getClassType()
            r2.setResult(r4)
            goto L10f
        L66:
            com.android.dx.rop.cst.Constant r5 = r2.getAuxCst()
            com.android.dx.rop.cst.CstType r5 = (com.android.dx.rop.cst.CstType) r5
            com.android.dx.rop.type.Type r5 = r5.getClassType()
            com.android.dx.rop.type.Type r4 = r5.asUninitialized(r4)
            r2.setResult(r4)
            goto L10f
        L79:
            com.android.dx.rop.cst.Constant r4 = r2.getAuxCst()
            com.android.dx.rop.cst.CstCallSiteRef r4 = (com.android.dx.rop.cst.CstCallSiteRef) r4
            com.android.dx.rop.type.Type r4 = r4.getReturnType()
            com.android.dx.rop.type.Type r5 = com.android.dx.rop.type.Type.VOID
            if (r4 != r5) goto L8c
            r2.clearResult()
            goto L10f
        L8c:
            r2.setResult(r4)
            goto L10f
        L91:
            com.android.dx.rop.type.TypeBearer r4 = r2.arg(r1)
            com.android.dx.rop.type.Type r4 = r4.getType()
            boolean r5 = r4.isUninitialized()
            if (r5 == 0) goto La2
            r3.makeInitialized(r4)
        La2:
            com.android.dx.rop.cst.Constant r4 = r2.getAuxCst()
            com.android.dx.rop.type.TypeBearer r4 = (com.android.dx.rop.type.TypeBearer) r4
            com.android.dx.rop.type.Type r4 = r4.getType()
            com.android.dx.rop.type.Type r5 = com.android.dx.rop.type.Type.VOID
            if (r4 != r5) goto Lb4
            r2.clearResult()
            goto L10f
        Lb4:
            r2.setResult(r4)
            goto L10f
        Lb8:
            com.android.dx.rop.cst.Constant r4 = r2.getAuxCst()
            com.android.dx.rop.type.TypeBearer r4 = (com.android.dx.rop.type.TypeBearer) r4
            com.android.dx.rop.type.Type r4 = r4.getType()
            com.android.dx.rop.type.Type r5 = com.android.dx.rop.type.Type.VOID
            if (r4 != r5) goto Lca
            r2.clearResult()
            goto L10f
        Lca:
            r2.setResult(r4)
            goto L10f
        Lce:
            com.android.dx.cf.code.ReturnAddress r4 = new com.android.dx.cf.code.ReturnAddress
            int r5 = r2.getAuxTarget()
            r4.<init>(r5)
            r2.setResult(r4)
            goto L10f
        Ldb:
            r2.clearResult()
            int r4 = r2.getAuxInt()
        Le2:
            if (r4 == 0) goto L10f
            r5 = r4 & 15
            int r5 = r5 + (-1)
            com.android.dx.rop.type.TypeBearer r5 = r2.arg(r5)
            r2.addResult(r5)
            int r4 = r4 >> 4
            goto Le2
        Lf2:
            com.android.dx.rop.type.Type r4 = r2.getAuxType()
            r2.setResult(r4)
            goto L10f
        Lfa:
            com.android.dx.rop.type.TypeBearer r4 = r2.arg(r1)
            r2.setResult(r4)
            goto L10f
        L102:
            com.android.dx.rop.cst.Constant r4 = r2.getAuxCst()
            com.android.dx.rop.type.TypeBearer r4 = (com.android.dx.rop.type.TypeBearer) r4
            r2.setResult(r4)
            goto L10f
        L10c:
            r2.clearResult()
        L10f:
            r2.storeResults(r3)
            return
    }
}
