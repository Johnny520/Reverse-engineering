package com.android.dx.cf.direct;

/* JADX INFO: loaded from: classes.dex */
public class CodeObserver implements com.android.dx.cf.code.BytecodeArray.Visitor {
    private final com.android.dx.util.ByteArray bytes;
    private final com.android.dx.cf.iface.ParseObserver observer;

    public CodeObserver(com.android.dx.util.ByteArray r1, com.android.dx.cf.iface.ParseObserver r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L14
            if (r2 == 0) goto Lc
            r0.bytes = r1
            r0.observer = r2
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "observer == null"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "bytes == null"
            r1.<init>(r2)
            throw r1
    }

    private java.lang.String header(int r4) {
            r3 = this;
            com.android.dx.util.ByteArray r0 = r3.bytes
            int r0 = r0.getUnsignedByte(r4)
            java.lang.String r1 = com.android.dx.cf.code.ByteOps.opName(r0)
            r2 = 196(0xc4, float:2.75E-43)
            if (r0 != r2) goto L2e
            com.android.dx.util.ByteArray r0 = r3.bytes
            int r2 = r4 + 1
            int r0 = r0.getUnsignedByte(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " "
            r2.append(r1)
            java.lang.String r0 = com.android.dx.cf.code.ByteOps.opName(r0)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
        L2e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = com.android.dx.util.Hex.u2(r4)
            r0.append(r4)
            java.lang.String r4 = ": "
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            return r4
    }

    private void visitLiteralDouble(int r5, int r6, int r7, long r8) {
            r4 = this;
            r5 = 1
            if (r7 == r5) goto L19
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = " #"
            r5.append(r0)
            java.lang.String r0 = com.android.dx.util.Hex.u8(r8)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            goto L1b
        L19:
            java.lang.String r5 = ""
        L1b:
            com.android.dx.cf.iface.ParseObserver r0 = r4.observer
            com.android.dx.util.ByteArray r1 = r4.bytes
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.header(r6)
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = " // "
            r2.append(r5)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r2.append(r8)
            java.lang.String r5 = r2.toString()
            r0.parsed(r1, r6, r7, r5)
            return
    }

    private void visitLiteralFloat(int r5, int r6, int r7, int r8) {
            r4 = this;
            r5 = 1
            if (r7 == r5) goto L19
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = " #"
            r5.append(r0)
            java.lang.String r0 = com.android.dx.util.Hex.u4(r8)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            goto L1b
        L19:
            java.lang.String r5 = ""
        L1b:
            com.android.dx.cf.iface.ParseObserver r0 = r4.observer
            com.android.dx.util.ByteArray r1 = r4.bytes
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.header(r6)
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = " // "
            r2.append(r5)
            float r5 = java.lang.Float.intBitsToFloat(r8)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r0.parsed(r1, r6, r7, r5)
            return
    }

    private void visitLiteralInt(int r5, int r6, int r7, int r8) {
            r4 = this;
            r5 = 1
            if (r7 != r5) goto L6
            java.lang.String r0 = " // "
            goto L8
        L6:
            java.lang.String r0 = " "
        L8:
            com.android.dx.util.ByteArray r1 = r4.bytes
            int r1 = r1.getUnsignedByte(r6)
            java.lang.String r2 = "#"
            if (r7 == r5) goto L43
            r5 = 16
            if (r1 != r5) goto L17
            goto L43
        L17:
            r5 = 17
            if (r1 != r5) goto L2f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r8 = com.android.dx.util.Hex.s2(r8)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            goto L56
        L2f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r8 = com.android.dx.util.Hex.s4(r8)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            goto L56
        L43:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r8 = com.android.dx.util.Hex.s1(r8)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
        L56:
            com.android.dx.cf.iface.ParseObserver r8 = r4.observer
            com.android.dx.util.ByteArray r1 = r4.bytes
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.header(r6)
            r2.append(r3)
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r8.parsed(r1, r6, r7, r5)
            return
    }

    private void visitLiteralLong(int r4, int r5, int r6, long r7) {
            r3 = this;
            r4 = 1
            if (r6 != r4) goto L6
            java.lang.String r0 = " // "
            goto L8
        L6:
            java.lang.String r0 = " #"
        L8:
            if (r6 != r4) goto L10
            int r4 = (int) r7
            java.lang.String r4 = com.android.dx.util.Hex.s1(r4)
            goto L14
        L10:
            java.lang.String r4 = com.android.dx.util.Hex.s8(r7)
        L14:
            com.android.dx.cf.iface.ParseObserver r7 = r3.observer
            com.android.dx.util.ByteArray r8 = r3.bytes
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.header(r5)
            r1.append(r2)
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r7.parsed(r8, r5, r6, r4)
            return
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public int getPreviousOffset() {
            r1 = this;
            r0 = -1
            return r0
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void setPreviousOffset(int r1) {
            r0 = this;
            return
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitBranch(int r4, int r5, int r6, int r7) {
            r3 = this;
            r4 = 3
            if (r6 > r4) goto L8
            java.lang.String r4 = com.android.dx.util.Hex.u2(r7)
            goto Lc
        L8:
            java.lang.String r4 = com.android.dx.util.Hex.u4(r7)
        Lc:
            com.android.dx.cf.iface.ParseObserver r7 = r3.observer
            com.android.dx.util.ByteArray r0 = r3.bytes
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.header(r5)
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r7.parsed(r0, r5, r6, r4)
            return
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitConstant(int r7, int r8, int r9, com.android.dx.rop.cst.Constant r10, int r11) {
            r6 = this;
            boolean r0 = r10 instanceof com.android.dx.rop.cst.CstKnownNull
            if (r0 == 0) goto L9
            r10 = 0
            r6.visitNoArgs(r7, r8, r9, r10)
            return
        L9:
            boolean r0 = r10 instanceof com.android.dx.rop.cst.CstInteger
            if (r0 == 0) goto L11
            r6.visitLiteralInt(r7, r8, r9, r11)
            return
        L11:
            boolean r0 = r10 instanceof com.android.dx.rop.cst.CstLong
            if (r0 == 0) goto L23
            com.android.dx.rop.cst.CstLong r10 = (com.android.dx.rop.cst.CstLong) r10
            long r4 = r10.getValue()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.visitLiteralLong(r1, r2, r3, r4)
            return
        L23:
            boolean r0 = r10 instanceof com.android.dx.rop.cst.CstFloat
            if (r0 == 0) goto L31
            com.android.dx.rop.cst.CstFloat r10 = (com.android.dx.rop.cst.CstFloat) r10
            int r10 = r10.getIntBits()
            r6.visitLiteralFloat(r7, r8, r9, r10)
            return
        L31:
            boolean r0 = r10 instanceof com.android.dx.rop.cst.CstDouble
            if (r0 == 0) goto L43
            com.android.dx.rop.cst.CstDouble r10 = (com.android.dx.rop.cst.CstDouble) r10
            long r4 = r10.getLongBits()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.visitLiteralDouble(r1, r2, r3, r4)
            return
        L43:
            if (r11 == 0) goto L73
            r0 = 197(0xc5, float:2.76E-43)
            java.lang.String r1 = ", "
            if (r7 != r0) goto L5f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r11 = com.android.dx.util.Hex.u1(r11)
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            goto L75
        L5f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r11 = com.android.dx.util.Hex.u2(r11)
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            goto L75
        L73:
            java.lang.String r7 = ""
        L75:
            com.android.dx.cf.iface.ParseObserver r11 = r6.observer
            com.android.dx.util.ByteArray r0 = r6.bytes
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r6.header(r8)
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            r1.append(r10)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r11.parsed(r0, r8, r9, r7)
            return
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitInvalid(int r3, int r4, int r5) {
            r2 = this;
            com.android.dx.cf.iface.ParseObserver r3 = r2.observer
            com.android.dx.util.ByteArray r0 = r2.bytes
            java.lang.String r1 = r2.header(r4)
            r3.parsed(r0, r4, r5, r1)
            return
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitLocal(int r5, int r6, int r7, int r8, com.android.dx.rop.type.Type r9, int r10) {
            r4 = this;
            r0 = 3
            if (r7 > r0) goto L8
            java.lang.String r8 = com.android.dx.util.Hex.u1(r8)
            goto Lc
        L8:
            java.lang.String r8 = com.android.dx.util.Hex.u2(r8)
        Lc:
            r1 = 1
            if (r7 != r1) goto L10
            goto L11
        L10:
            r1 = 0
        L11:
            r2 = 132(0x84, float:1.85E-43)
            java.lang.String r3 = ""
            if (r5 != r2) goto L34
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = ", #"
            r5.append(r2)
            if (r7 > r0) goto L28
            java.lang.String r10 = com.android.dx.util.Hex.s1(r10)
            goto L2c
        L28:
            java.lang.String r10 = com.android.dx.util.Hex.s2(r10)
        L2c:
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            goto L35
        L34:
            r5 = r3
        L35:
            boolean r9 = r9.isCategory2()
            if (r9 == 0) goto L53
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            if (r1 == 0) goto L45
            java.lang.String r10 = ","
            goto L47
        L45:
            java.lang.String r10 = " //"
        L47:
            r9.append(r10)
            java.lang.String r10 = " category-2"
            r9.append(r10)
            java.lang.String r3 = r9.toString()
        L53:
            com.android.dx.cf.iface.ParseObserver r9 = r4.observer
            com.android.dx.util.ByteArray r10 = r4.bytes
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r4.header(r6)
            r0.append(r2)
            if (r1 == 0) goto L68
            java.lang.String r1 = " // "
            goto L6a
        L68:
            java.lang.String r1 = " "
        L6a:
            r0.append(r1)
            r0.append(r8)
            r0.append(r5)
            r0.append(r3)
            java.lang.String r5 = r0.toString()
            r9.parsed(r10, r6, r7, r5)
            return
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitNewarray(int r5, int r6, com.android.dx.rop.cst.CstType r7, java.util.ArrayList<com.android.dx.rop.cst.Constant> r8) {
            r4 = this;
            r8 = 1
            if (r6 != r8) goto L6
            java.lang.String r8 = " // "
            goto L8
        L6:
            java.lang.String r8 = " "
        L8:
            com.android.dx.rop.type.Type r7 = r7.getClassType()
            com.android.dx.rop.type.Type r7 = r7.getComponentType()
            java.lang.String r7 = r7.toHuman()
            com.android.dx.cf.iface.ParseObserver r0 = r4.observer
            com.android.dx.util.ByteArray r1 = r4.bytes
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.header(r5)
            r2.append(r3)
            r2.append(r8)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r0.parsed(r1, r5, r6, r7)
            return
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitNoArgs(int r2, int r3, int r4, com.android.dx.rop.type.Type r5) {
            r1 = this;
            com.android.dx.cf.iface.ParseObserver r2 = r1.observer
            com.android.dx.util.ByteArray r5 = r1.bytes
            java.lang.String r0 = r1.header(r3)
            r2.parsed(r5, r3, r4, r0)
            return
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitSwitch(int r4, int r5, int r6, com.android.dx.cf.code.SwitchList r7, int r8) {
            r3 = this;
            int r4 = r7.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4 * 20
            int r1 = r1 + 100
            r0.<init>(r1)
            java.lang.String r1 = r3.header(r5)
            r0.append(r1)
            if (r8 == 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " // padding: "
            r1.append(r2)
            java.lang.String r8 = com.android.dx.util.Hex.u4(r8)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.append(r8)
        L2e:
            r8 = 10
            r0.append(r8)
            r1 = 0
        L34:
            if (r1 >= r4) goto L5c
            java.lang.String r2 = "  "
            r0.append(r2)
            int r2 = r7.getValue(r1)
            java.lang.String r2 = com.android.dx.util.Hex.s4(r2)
            r0.append(r2)
            java.lang.String r2 = ": "
            r0.append(r2)
            int r2 = r7.getTarget(r1)
            java.lang.String r2 = com.android.dx.util.Hex.u2(r2)
            r0.append(r2)
            r0.append(r8)
            int r1 = r1 + 1
            goto L34
        L5c:
            java.lang.String r4 = "  default: "
            r0.append(r4)
            int r4 = r7.getDefaultTarget()
            java.lang.String r4 = com.android.dx.util.Hex.u2(r4)
            r0.append(r4)
            com.android.dx.cf.iface.ParseObserver r4 = r3.observer
            com.android.dx.util.ByteArray r7 = r3.bytes
            java.lang.String r8 = r0.toString()
            r4.parsed(r7, r5, r6, r8)
            return
    }
}
