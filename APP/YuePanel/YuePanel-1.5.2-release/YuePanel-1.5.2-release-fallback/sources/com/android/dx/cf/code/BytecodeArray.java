package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public final class BytecodeArray {
    public static final com.android.dx.cf.code.BytecodeArray.Visitor EMPTY_VISITOR = null;
    private final com.android.dx.util.ByteArray bytes;
    private final com.android.dx.rop.cst.ConstantPool pool;

    public static class BaseVisitor implements com.android.dx.cf.code.BytecodeArray.Visitor {
        private int previousOffset;

        public BaseVisitor() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.previousOffset = r0
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public int getPreviousOffset() {
                r1 = this;
                int r0 = r1.previousOffset
                return r0
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void setPreviousOffset(int r1) {
                r0 = this;
                r0.previousOffset = r1
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitBranch(int r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitConstant(int r1, int r2, int r3, com.android.dx.rop.cst.Constant r4, int r5) {
                r0 = this;
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitInvalid(int r1, int r2, int r3) {
                r0 = this;
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitLocal(int r1, int r2, int r3, int r4, com.android.dx.rop.type.Type r5, int r6) {
                r0 = this;
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitNewarray(int r1, int r2, com.android.dx.rop.cst.CstType r3, java.util.ArrayList<com.android.dx.rop.cst.Constant> r4) {
                r0 = this;
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitNoArgs(int r1, int r2, int r3, com.android.dx.rop.type.Type r4) {
                r0 = this;
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitSwitch(int r1, int r2, int r3, com.android.dx.cf.code.SwitchList r4, int r5) {
                r0 = this;
                return
        }
    }

    public class ConstantParserVisitor extends com.android.dx.cf.code.BytecodeArray.BaseVisitor {
        com.android.dx.rop.cst.Constant cst;
        int length;
        final /* synthetic */ com.android.dx.cf.code.BytecodeArray this$0;
        int value;

        public ConstantParserVisitor(com.android.dx.cf.code.BytecodeArray r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private void clear() {
                r1 = this;
                r0 = 0
                r1.length = r0
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.BaseVisitor, com.android.dx.cf.code.BytecodeArray.Visitor
        public int getPreviousOffset() {
                r1 = this;
                r0 = -1
                return r0
        }

        @Override // com.android.dx.cf.code.BytecodeArray.BaseVisitor, com.android.dx.cf.code.BytecodeArray.Visitor
        public void setPreviousOffset(int r1) {
                r0 = this;
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.BaseVisitor, com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitBranch(int r1, int r2, int r3, int r4) {
                r0 = this;
                r0.clear()
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.BaseVisitor, com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitConstant(int r1, int r2, int r3, com.android.dx.rop.cst.Constant r4, int r5) {
                r0 = this;
                r0.cst = r4
                r0.length = r3
                r0.value = r5
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.BaseVisitor, com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitInvalid(int r1, int r2, int r3) {
                r0 = this;
                r0.clear()
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.BaseVisitor, com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitLocal(int r1, int r2, int r3, int r4, com.android.dx.rop.type.Type r5, int r6) {
                r0 = this;
                r0.clear()
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.BaseVisitor, com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitNewarray(int r1, int r2, com.android.dx.rop.cst.CstType r3, java.util.ArrayList<com.android.dx.rop.cst.Constant> r4) {
                r0 = this;
                r0.clear()
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.BaseVisitor, com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitNoArgs(int r1, int r2, int r3, com.android.dx.rop.type.Type r4) {
                r0 = this;
                r0.clear()
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.BaseVisitor, com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitSwitch(int r1, int r2, int r3, com.android.dx.cf.code.SwitchList r4, int r5) {
                r0 = this;
                r0.clear()
                return
        }
    }

    public interface Visitor {
        int getPreviousOffset();

        void setPreviousOffset(int r1);

        void visitBranch(int r1, int r2, int r3, int r4);

        void visitConstant(int r1, int r2, int r3, com.android.dx.rop.cst.Constant r4, int r5);

        void visitInvalid(int r1, int r2, int r3);

        void visitLocal(int r1, int r2, int r3, int r4, com.android.dx.rop.type.Type r5, int r6);

        void visitNewarray(int r1, int r2, com.android.dx.rop.cst.CstType r3, java.util.ArrayList<com.android.dx.rop.cst.Constant> r4);

        void visitNoArgs(int r1, int r2, int r3, com.android.dx.rop.type.Type r4);

        void visitSwitch(int r1, int r2, int r3, com.android.dx.cf.code.SwitchList r4, int r5);
    }

    static {
            com.android.dx.cf.code.BytecodeArray$BaseVisitor r0 = new com.android.dx.cf.code.BytecodeArray$BaseVisitor
            r0.<init>()
            com.android.dx.cf.code.BytecodeArray.EMPTY_VISITOR = r0
            return
    }

    public BytecodeArray(com.android.dx.util.ByteArray r1, com.android.dx.rop.cst.ConstantPool r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L14
            if (r2 == 0) goto Lc
            r0.bytes = r1
            r0.pool = r2
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "pool == null"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "bytes == null"
            r1.<init>(r2)
            throw r1
    }

    private int parseLookupswitch(int r10, com.android.dx.cf.code.BytecodeArray.Visitor r11) {
            r9 = this;
            int r0 = r10 + 4
            r0 = r0 & (-4)
            int r1 = r10 + 1
            r2 = 0
            r8 = r2
        L8:
            if (r1 >= r0) goto L17
            int r3 = r8 << 8
            com.android.dx.util.ByteArray r4 = r9.bytes
            int r4 = r4.getUnsignedByte(r1)
            r8 = r3 | r4
            int r1 = r1 + 1
            goto L8
        L17:
            com.android.dx.util.ByteArray r1 = r9.bytes
            int r1 = r1.getInt(r0)
            int r1 = r1 + r10
            com.android.dx.util.ByteArray r3 = r9.bytes
            int r4 = r0 + 4
            int r3 = r3.getInt(r4)
            int r0 = r0 + 8
            com.android.dx.cf.code.SwitchList r7 = new com.android.dx.cf.code.SwitchList
            r7.<init>(r3)
        L2d:
            if (r2 >= r3) goto L46
            com.android.dx.util.ByteArray r4 = r9.bytes
            int r4 = r4.getInt(r0)
            com.android.dx.util.ByteArray r5 = r9.bytes
            int r6 = r0 + 4
            int r5 = r5.getInt(r6)
            int r5 = r5 + r10
            int r0 = r0 + 8
            r7.add(r4, r5)
            int r2 = r2 + 1
            goto L2d
        L46:
            r7.setDefaultTarget(r1)
            r7.removeSuperfluousDefaults()
            r7.setImmutable()
            int r0 = r0 - r10
            r4 = 171(0xab, float:2.4E-43)
            r3 = r11
            r5 = r10
            r6 = r0
            r3.visitSwitch(r4, r5, r6, r7, r8)
            return r0
    }

    private int parseNewarray(int r12, com.android.dx.cf.code.BytecodeArray.Visitor r13) {
            r11 = this;
            com.android.dx.util.ByteArray r0 = r11.bytes
            int r1 = r12 + 1
            int r0 = r0.getUnsignedByte(r1)
            switch(r0) {
                case 4: goto L3b;
                case 5: goto L38;
                case 6: goto L35;
                case 7: goto L32;
                case 8: goto L2f;
                case 9: goto L2c;
                case 10: goto L29;
                case 11: goto L26;
                default: goto Lb;
            }
        Lb:
            com.android.dx.cf.code.SimException r12 = new com.android.dx.cf.code.SimException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = "bad newarray code "
            r13.append(r1)
            java.lang.String r0 = com.android.dx.util.Hex.u1(r0)
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L26:
            com.android.dx.rop.cst.CstType r1 = com.android.dx.rop.cst.CstType.LONG_ARRAY
            goto L3d
        L29:
            com.android.dx.rop.cst.CstType r1 = com.android.dx.rop.cst.CstType.INT_ARRAY
            goto L3d
        L2c:
            com.android.dx.rop.cst.CstType r1 = com.android.dx.rop.cst.CstType.SHORT_ARRAY
            goto L3d
        L2f:
            com.android.dx.rop.cst.CstType r1 = com.android.dx.rop.cst.CstType.BYTE_ARRAY
            goto L3d
        L32:
            com.android.dx.rop.cst.CstType r1 = com.android.dx.rop.cst.CstType.DOUBLE_ARRAY
            goto L3d
        L35:
            com.android.dx.rop.cst.CstType r1 = com.android.dx.rop.cst.CstType.FLOAT_ARRAY
            goto L3d
        L38:
            com.android.dx.rop.cst.CstType r1 = com.android.dx.rop.cst.CstType.CHAR_ARRAY
            goto L3d
        L3b:
            com.android.dx.rop.cst.CstType r1 = com.android.dx.rop.cst.CstType.BOOLEAN_ARRAY
        L3d:
            int r2 = r13.getPreviousOffset()
            com.android.dx.cf.code.BytecodeArray$ConstantParserVisitor r3 = new com.android.dx.cf.code.BytecodeArray$ConstantParserVisitor
            r3.<init>(r11)
            r4 = 0
            if (r2 < 0) goto L5a
            r11.parseInstruction(r2, r3)
            com.android.dx.rop.cst.Constant r5 = r3.cst
            boolean r5 = r5 instanceof com.android.dx.rop.cst.CstInteger
            if (r5 == 0) goto L5a
            int r5 = r3.length
            int r5 = r5 + r2
            if (r5 != r12) goto L5a
            int r2 = r3.value
            goto L5b
        L5a:
            r2 = r4
        L5b:
            int r5 = r12 + 2
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r2 == 0) goto Lc9
        L64:
            com.android.dx.util.ByteArray r7 = r11.bytes
            int r8 = r5 + 1
            int r7 = r7.getUnsignedByte(r5)
            r9 = 89
            if (r7 == r9) goto L71
            goto Lc9
        L71:
            r11.parseInstruction(r8, r3)
            int r7 = r3.length
            if (r7 == 0) goto Lc9
            com.android.dx.rop.cst.Constant r9 = r3.cst
            boolean r9 = r9 instanceof com.android.dx.rop.cst.CstInteger
            if (r9 == 0) goto Lc9
            int r9 = r3.value
            if (r9 == r4) goto L83
            goto Lc9
        L83:
            int r8 = r8 + r7
            r11.parseInstruction(r8, r3)
            int r7 = r3.length
            if (r7 == 0) goto Lc9
            com.android.dx.rop.cst.Constant r9 = r3.cst
            boolean r10 = r9 instanceof com.android.dx.rop.cst.CstLiteralBits
            if (r10 != 0) goto L92
            goto Lc9
        L92:
            int r8 = r8 + r7
            r6.add(r9)
            com.android.dx.util.ByteArray r7 = r11.bytes
            int r9 = r8 + 1
            int r7 = r7.getUnsignedByte(r8)
            switch(r0) {
                case 4: goto Lc0;
                case 5: goto Lbb;
                case 6: goto Lb6;
                case 7: goto Lb1;
                case 8: goto Lc0;
                case 9: goto Lac;
                case 10: goto La7;
                case 11: goto La2;
                default: goto La1;
            }
        La1:
            goto Lc9
        La2:
            r8 = 80
            if (r7 == r8) goto Lc5
            goto Lc9
        La7:
            r8 = 79
            if (r7 == r8) goto Lc5
            goto Lc9
        Lac:
            r8 = 86
            if (r7 == r8) goto Lc5
            goto Lc9
        Lb1:
            r8 = 82
            if (r7 == r8) goto Lc5
            goto Lc9
        Lb6:
            r8 = 81
            if (r7 == r8) goto Lc5
            goto Lc9
        Lbb:
            r8 = 85
            if (r7 == r8) goto Lc5
            goto Lc9
        Lc0:
            r8 = 84
            if (r7 == r8) goto Lc5
            goto Lc9
        Lc5:
            int r4 = r4 + 1
            r5 = r9
            goto L64
        Lc9:
            r0 = 2
            if (r4 < r0) goto Ld4
            if (r4 == r2) goto Lcf
            goto Ld4
        Lcf:
            int r5 = r5 - r12
            r13.visitNewarray(r12, r5, r1, r6)
            return r5
        Ld4:
            r2 = 0
            r13.visitNewarray(r12, r0, r1, r2)
            return r0
    }

    private int parseTableswitch(int r10, com.android.dx.cf.code.BytecodeArray.Visitor r11) {
            r9 = this;
            int r0 = r10 + 4
            r0 = r0 & (-4)
            int r1 = r10 + 1
            r2 = 0
            r8 = r2
        L8:
            if (r1 >= r0) goto L17
            int r3 = r8 << 8
            com.android.dx.util.ByteArray r4 = r9.bytes
            int r4 = r4.getUnsignedByte(r1)
            r8 = r3 | r4
            int r1 = r1 + 1
            goto L8
        L17:
            com.android.dx.util.ByteArray r1 = r9.bytes
            int r1 = r1.getInt(r0)
            int r1 = r1 + r10
            com.android.dx.util.ByteArray r3 = r9.bytes
            int r4 = r0 + 4
            int r3 = r3.getInt(r4)
            com.android.dx.util.ByteArray r4 = r9.bytes
            int r5 = r0 + 8
            int r4 = r4.getInt(r5)
            int r5 = r4 - r3
            int r5 = r5 + 1
            int r0 = r0 + 12
            if (r3 > r4) goto L61
            com.android.dx.cf.code.SwitchList r7 = new com.android.dx.cf.code.SwitchList
            r7.<init>(r5)
        L3b:
            if (r2 >= r5) goto L4e
            com.android.dx.util.ByteArray r4 = r9.bytes
            int r4 = r4.getInt(r0)
            int r4 = r4 + r10
            int r0 = r0 + 4
            int r6 = r3 + r2
            r7.add(r6, r4)
            int r2 = r2 + 1
            goto L3b
        L4e:
            r7.setDefaultTarget(r1)
            r7.removeSuperfluousDefaults()
            r7.setImmutable()
            int r0 = r0 - r10
            r4 = 171(0xab, float:2.4E-43)
            r3 = r11
            r5 = r10
            r6 = r0
            r3.visitSwitch(r4, r5, r6, r7, r8)
            return r0
        L61:
            com.android.dx.cf.code.SimException r10 = new com.android.dx.cf.code.SimException
            java.lang.String r11 = "low / high inversion"
            r10.<init>(r11)
            throw r10
    }

    private int parseWide(int r12, com.android.dx.cf.code.BytecodeArray.Visitor r13) {
            r11 = this;
            com.android.dx.util.ByteArray r0 = r11.bytes
            int r1 = r12 + 1
            int r3 = r0.getUnsignedByte(r1)
            com.android.dx.util.ByteArray r0 = r11.bytes
            int r1 = r12 + 2
            int r8 = r0.getUnsignedShort(r1)
            r0 = 132(0x84, float:1.85E-43)
            if (r3 == r0) goto Laa
            r0 = 169(0xa9, float:2.37E-43)
            r1 = 4
            if (r3 == r0) goto L9e
            switch(r3) {
                case 21: goto L92;
                case 22: goto L86;
                case 23: goto L7a;
                case 24: goto L6e;
                case 25: goto L62;
                default: goto L1c;
            }
        L1c:
            switch(r3) {
                case 54: goto L56;
                case 55: goto L4a;
                case 56: goto L3e;
                case 57: goto L32;
                case 58: goto L26;
                default: goto L1f;
            }
        L1f:
            r0 = 196(0xc4, float:2.75E-43)
            r1 = 1
            r13.visitInvalid(r0, r12, r1)
            return r1
        L26:
            com.android.dx.rop.type.Type r9 = com.android.dx.rop.type.Type.OBJECT
            r10 = 0
            r5 = 54
            r7 = 4
            r4 = r13
            r6 = r12
            r4.visitLocal(r5, r6, r7, r8, r9, r10)
            return r1
        L32:
            com.android.dx.rop.type.Type r9 = com.android.dx.rop.type.Type.DOUBLE
            r10 = 0
            r5 = 54
            r7 = 4
            r4 = r13
            r6 = r12
            r4.visitLocal(r5, r6, r7, r8, r9, r10)
            return r1
        L3e:
            com.android.dx.rop.type.Type r9 = com.android.dx.rop.type.Type.FLOAT
            r10 = 0
            r5 = 54
            r7 = 4
            r4 = r13
            r6 = r12
            r4.visitLocal(r5, r6, r7, r8, r9, r10)
            return r1
        L4a:
            com.android.dx.rop.type.Type r9 = com.android.dx.rop.type.Type.LONG
            r10 = 0
            r5 = 54
            r7 = 4
            r4 = r13
            r6 = r12
            r4.visitLocal(r5, r6, r7, r8, r9, r10)
            return r1
        L56:
            com.android.dx.rop.type.Type r9 = com.android.dx.rop.type.Type.INT
            r10 = 0
            r5 = 54
            r7 = 4
            r4 = r13
            r6 = r12
            r4.visitLocal(r5, r6, r7, r8, r9, r10)
            return r1
        L62:
            com.android.dx.rop.type.Type r9 = com.android.dx.rop.type.Type.OBJECT
            r10 = 0
            r5 = 21
            r7 = 4
            r4 = r13
            r6 = r12
            r4.visitLocal(r5, r6, r7, r8, r9, r10)
            return r1
        L6e:
            com.android.dx.rop.type.Type r9 = com.android.dx.rop.type.Type.DOUBLE
            r10 = 0
            r5 = 21
            r7 = 4
            r4 = r13
            r6 = r12
            r4.visitLocal(r5, r6, r7, r8, r9, r10)
            return r1
        L7a:
            com.android.dx.rop.type.Type r9 = com.android.dx.rop.type.Type.FLOAT
            r10 = 0
            r5 = 21
            r7 = 4
            r4 = r13
            r6 = r12
            r4.visitLocal(r5, r6, r7, r8, r9, r10)
            return r1
        L86:
            com.android.dx.rop.type.Type r9 = com.android.dx.rop.type.Type.LONG
            r10 = 0
            r5 = 21
            r7 = 4
            r4 = r13
            r6 = r12
            r4.visitLocal(r5, r6, r7, r8, r9, r10)
            return r1
        L92:
            com.android.dx.rop.type.Type r9 = com.android.dx.rop.type.Type.INT
            r10 = 0
            r5 = 21
            r7 = 4
            r4 = r13
            r6 = r12
            r4.visitLocal(r5, r6, r7, r8, r9, r10)
            return r1
        L9e:
            com.android.dx.rop.type.Type r7 = com.android.dx.rop.type.Type.RETURN_ADDRESS
            r0 = 0
            r5 = 4
            r2 = r13
            r4 = r12
            r6 = r8
            r8 = r0
            r2.visitLocal(r3, r4, r5, r6, r7, r8)
            return r1
        Laa:
            com.android.dx.util.ByteArray r0 = r11.bytes
            int r1 = r12 + 4
            int r0 = r0.getShort(r1)
            r5 = 6
            com.android.dx.rop.type.Type r7 = com.android.dx.rop.type.Type.INT
            r2 = r13
            r4 = r12
            r6 = r8
            r8 = r0
            r2.visitLocal(r3, r4, r5, r6, r7, r8)
            r12 = 6
            return r12
    }

    public int byteLength() {
            r1 = this;
            com.android.dx.util.ByteArray r0 = r1.bytes
            int r0 = r0.size()
            int r0 = r0 + 4
            return r0
    }

    public void forEach(com.android.dx.cf.code.BytecodeArray.Visitor r4) {
            r3 = this;
            com.android.dx.util.ByteArray r0 = r3.bytes
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto Lf
            int r2 = r3.parseInstruction(r1, r4)
            int r1 = r1 + r2
            goto L7
        Lf:
            return
    }

    public com.android.dx.util.ByteArray getBytes() {
            r1 = this;
            com.android.dx.util.ByteArray r0 = r1.bytes
            return r0
    }

    public int[] getInstructionOffsets() {
            r4 = this;
            com.android.dx.util.ByteArray r0 = r4.bytes
            int r0 = r0.size()
            int[] r1 = com.android.dx.util.Bits.makeBitSet(r0)
            r2 = 0
        Lb:
            if (r2 >= r0) goto L18
            r3 = 1
            com.android.dx.util.Bits.set(r1, r2, r3)
            r3 = 0
            int r3 = r4.parseInstruction(r2, r3)
            int r2 = r2 + r3
            goto Lb
        L18:
            return r1
    }

    public int parseInstruction(int r12, com.android.dx.cf.code.BytecodeArray.Visitor r13) {
            r11 = this;
            java.lang.String r0 = "...at bytecode offset "
            if (r13 != 0) goto L6
            com.android.dx.cf.code.BytecodeArray$Visitor r13 = com.android.dx.cf.code.BytecodeArray.EMPTY_VISITOR
        L6:
            r1 = r13
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r2 = r13.getUnsignedByte(r12)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.cf.code.ByteOps.opInfo(r2)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r13 = 0
            r7 = 5
            r3 = 172(0xac, float:2.41E-43)
            r4 = 46
            r5 = 79
            r8 = 3
            r9 = 2
            r10 = 1
            switch(r2) {
                case 0: goto L41f;
                case 1: goto L414;
                case 2: goto L409;
                case 3: goto L3fe;
                case 4: goto L3f3;
                case 5: goto L3e8;
                case 6: goto L3dd;
                case 7: goto L3d2;
                case 8: goto L3c7;
                case 9: goto L3bc;
                case 10: goto L3b1;
                case 11: goto L3a6;
                case 12: goto L39b;
                case 13: goto L390;
                case 14: goto L385;
                case 15: goto L37a;
                case 16: goto L366;
                case 17: goto L352;
                case 18: goto L330;
                case 19: goto L30e;
                case 20: goto L2f7;
                case 21: goto L2e4;
                case 22: goto L2d1;
                case 23: goto L2be;
                case 24: goto L2ab;
                case 25: goto L298;
                case 26: goto L28b;
                case 27: goto L28b;
                case 28: goto L28b;
                case 29: goto L28b;
                case 30: goto L27e;
                case 31: goto L27e;
                case 32: goto L27e;
                case 33: goto L27e;
                case 34: goto L271;
                case 35: goto L271;
                case 36: goto L271;
                case 37: goto L271;
                case 38: goto L264;
                case 39: goto L264;
                case 40: goto L264;
                case 41: goto L264;
                case 42: goto L257;
                case 43: goto L257;
                case 44: goto L257;
                case 45: goto L257;
                case 46: goto L251;
                case 47: goto L24b;
                case 48: goto L245;
                case 49: goto L23f;
                case 50: goto L239;
                case 51: goto L233;
                case 52: goto L22d;
                case 53: goto L227;
                case 54: goto L214;
                case 55: goto L201;
                case 56: goto L1ee;
                case 57: goto L1db;
                case 58: goto L1c8;
                case 59: goto L1bb;
                case 60: goto L1bb;
                case 61: goto L1bb;
                case 62: goto L1bb;
                case 63: goto L1ae;
                case 64: goto L1ae;
                case 65: goto L1ae;
                case 66: goto L1ae;
                case 67: goto L1a1;
                case 68: goto L1a1;
                case 69: goto L1a1;
                case 70: goto L1a1;
                case 71: goto L194;
                case 72: goto L194;
                case 73: goto L194;
                case 74: goto L194;
                case 75: goto L187;
                case 76: goto L187;
                case 77: goto L187;
                case 78: goto L187;
                case 79: goto L181;
                case 80: goto L17b;
                case 81: goto L175;
                case 82: goto L16f;
                case 83: goto L169;
                case 84: goto L163;
                case 85: goto L15d;
                case 86: goto L157;
                case 87: goto L151;
                case 88: goto L151;
                case 89: goto L151;
                case 90: goto L151;
                case 91: goto L151;
                case 92: goto L151;
                case 93: goto L151;
                case 94: goto L151;
                case 95: goto L151;
                case 96: goto L14b;
                case 97: goto L144;
                case 98: goto L13d;
                case 99: goto L136;
                case 100: goto L14b;
                case 101: goto L144;
                case 102: goto L13d;
                case 103: goto L136;
                case 104: goto L14b;
                case 105: goto L144;
                case 106: goto L13d;
                case 107: goto L136;
                case 108: goto L14b;
                case 109: goto L144;
                case 110: goto L13d;
                case 111: goto L136;
                case 112: goto L14b;
                case 113: goto L144;
                case 114: goto L13d;
                case 115: goto L136;
                case 116: goto L14b;
                case 117: goto L144;
                case 118: goto L13d;
                case 119: goto L136;
                case 120: goto L14b;
                case 121: goto L144;
                case 122: goto L14b;
                case 123: goto L144;
                case 124: goto L14b;
                case 125: goto L144;
                case 126: goto L14b;
                case 127: goto L144;
                case 128: goto L14b;
                case 129: goto L144;
                case 130: goto L14b;
                case 131: goto L144;
                case 132: goto L11e;
                case 133: goto L118;
                case 134: goto L112;
                case 135: goto L10c;
                case 136: goto L106;
                case 137: goto L112;
                case 138: goto L10c;
                case 139: goto L106;
                case 140: goto L118;
                case 141: goto L10c;
                case 142: goto L106;
                case 143: goto L118;
                case 144: goto L112;
                case 145: goto L106;
                case 146: goto L106;
                case 147: goto L106;
                case 148: goto L106;
                case 149: goto L106;
                case 150: goto L106;
                case 151: goto L106;
                case 152: goto L106;
                case 153: goto Lf9;
                case 154: goto Lf9;
                case 155: goto Lf9;
                case 156: goto Lf9;
                case 157: goto Lf9;
                case 158: goto Lf9;
                case 159: goto Lf9;
                case 160: goto Lf9;
                case 161: goto Lf9;
                case 162: goto Lf9;
                case 163: goto Lf9;
                case 164: goto Lf9;
                case 165: goto Lf9;
                case 166: goto Lf9;
                case 167: goto Lf9;
                case 168: goto Lf9;
                case 169: goto Le8;
                case 170: goto Le3;
                case 171: goto Lde;
                case 172: goto Ld8;
                case 173: goto Ld2;
                case 174: goto Lcc;
                case 175: goto Lc6;
                case 176: goto Lc0;
                case 177: goto Lba;
                case 178: goto La5;
                case 179: goto La5;
                case 180: goto La5;
                case 181: goto La5;
                case 182: goto La5;
                case 183: goto La5;
                case 184: goto La5;
                case 185: goto L7d;
                case 186: goto L65;
                case 187: goto La5;
                case 188: goto L60;
                case 189: goto La5;
                case 190: goto L106;
                case 191: goto Lba;
                case 192: goto La5;
                case 193: goto La5;
                case 194: goto Lba;
                case 195: goto Lba;
                case 196: goto L5b;
                case 197: goto L3e;
                case 198: goto Lf9;
                case 199: goto Lf9;
                case 200: goto L28;
                case 201: goto L28;
                default: goto L1e;
            }     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
        L1e:
            r1.visitInvalid(r2, r12, r10)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L22:
            r13 = move-exception
            goto L425
        L25:
            r13 = move-exception
            goto L441
        L28:
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r3 = r12 + 1
            int r13 = r13.getInt(r3)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r13 = r13 + r12
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L38
            r2 = 167(0xa7, float:2.34E-43)
            goto L3a
        L38:
            r2 = 168(0xa8, float:2.35E-43)
        L3a:
            r1.visitBranch(r2, r12, r7, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r7
        L3e:
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r3 = r12 + 1
            int r13 = r13.getUnsignedShort(r3)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.util.ByteArray r3 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r4 = r12 + 3
            int r6 = r3.getUnsignedByte(r4)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.cst.ConstantPool r3 = r11.pool     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.cst.Constant r5 = r3.get(r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r4 = 4
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r12 = 4
            return r12
        L5b:
            int r12 = r11.parseWide(r12, r1)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r12
        L60:
            int r12 = r11.parseNewarray(r12, r1)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r12
        L65:
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r3 = r12 + 1
            int r13 = r13.getUnsignedShort(r3)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.cst.ConstantPool r3 = r11.pool     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.cst.Constant r13 = r3.get(r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r5 = r13
            com.android.dx.rop.cst.CstInvokeDynamic r5 = (com.android.dx.rop.cst.CstInvokeDynamic) r5     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r4 = 5
            r6 = 0
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r7
        L7d:
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r3 = r12 + 1
            int r13 = r13.getUnsignedShort(r3)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.util.ByteArray r3 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r4 = r12 + 3
            int r3 = r3.getUnsignedByte(r4)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.util.ByteArray r4 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r5 = r12 + 4
            int r4 = r4.getUnsignedByte(r5)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.cst.ConstantPool r5 = r11.pool     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.cst.Constant r5 = r5.get(r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r13 = r4 << 8
            r6 = r3 | r13
            r4 = 5
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r7
        La5:
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r3 = r12 + 1
            int r13 = r13.getUnsignedShort(r3)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.cst.ConstantPool r3 = r11.pool     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.cst.Constant r5 = r3.get(r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r4 = 3
            r6 = 0
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r8
        Lba:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.VOID     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r2, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        Lc0:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.OBJECT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r3, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        Lc6:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.DOUBLE     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r3, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        Lcc:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.FLOAT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r3, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        Ld2:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.LONG     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r3, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        Ld8:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.INT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r3, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        Lde:
            int r12 = r11.parseLookupswitch(r12, r1)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r12
        Le3:
            int r12 = r11.parseTableswitch(r12, r1)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r12
        Le8:
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r3 = r12 + 1
            int r5 = r13.getUnsignedByte(r3)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.RETURN_ADDRESS     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r7 = 0
            r4 = 2
            r3 = r12
            r1.visitLocal(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r9
        Lf9:
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r3 = r12 + 1
            int r13 = r13.getShort(r3)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r13 = r13 + r12
            r1.visitBranch(r2, r12, r8, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r8
        L106:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.INT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r2, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L10c:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.DOUBLE     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r2, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L112:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.FLOAT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r2, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L118:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.LONG     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r2, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L11e:
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r3 = r12 + 1
            int r5 = r13.getUnsignedByte(r3)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r3 = r12 + 2
            int r7 = r13.getByte(r3)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.INT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r4 = 3
            r3 = r12
            r1.visitLocal(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r8
        L136:
            int r2 = r2 - r8
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.DOUBLE     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r2, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L13d:
            int r2 = r2 - r9
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.FLOAT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r2, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L144:
            int r2 = r2 - r10
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.LONG     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r2, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L14b:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.INT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r2, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L151:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.VOID     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r2, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L157:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.SHORT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r5, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L15d:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.CHAR     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r5, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L163:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.BYTE     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r5, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L169:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.OBJECT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r5, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L16f:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.DOUBLE     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r5, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L175:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.FLOAT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r5, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L17b:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.LONG     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r5, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L181:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.INT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r5, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L187:
            int r5 = r2 + (-75)
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.OBJECT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r7 = 0
            r2 = 54
            r4 = 1
            r3 = r12
            r1.visitLocal(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L194:
            int r5 = r2 + (-71)
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.DOUBLE     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r7 = 0
            r2 = 54
            r4 = 1
            r3 = r12
            r1.visitLocal(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L1a1:
            int r5 = r2 + (-67)
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.FLOAT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r7 = 0
            r2 = 54
            r4 = 1
            r3 = r12
            r1.visitLocal(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L1ae:
            int r5 = r2 + (-63)
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.LONG     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r7 = 0
            r2 = 54
            r4 = 1
            r3 = r12
            r1.visitLocal(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L1bb:
            int r5 = r2 + (-59)
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.INT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r7 = 0
            r2 = 54
            r4 = 1
            r3 = r12
            r1.visitLocal(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L1c8:
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r2 = r12 + 1
            int r5 = r13.getUnsignedByte(r2)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.OBJECT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r7 = 0
            r2 = 54
            r4 = 2
            r3 = r12
            r1.visitLocal(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r9
        L1db:
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r2 = r12 + 1
            int r5 = r13.getUnsignedByte(r2)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.DOUBLE     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r7 = 0
            r2 = 54
            r4 = 2
            r3 = r12
            r1.visitLocal(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r9
        L1ee:
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r2 = r12 + 1
            int r5 = r13.getUnsignedByte(r2)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.FLOAT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r7 = 0
            r2 = 54
            r4 = 2
            r3 = r12
            r1.visitLocal(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r9
        L201:
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r2 = r12 + 1
            int r5 = r13.getUnsignedByte(r2)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.LONG     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r7 = 0
            r2 = 54
            r4 = 2
            r3 = r12
            r1.visitLocal(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r9
        L214:
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r2 = r12 + 1
            int r5 = r13.getUnsignedByte(r2)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.INT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r7 = 0
            r2 = 54
            r4 = 2
            r3 = r12
            r1.visitLocal(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r9
        L227:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.SHORT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r4, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L22d:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.CHAR     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r4, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L233:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.BYTE     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r4, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L239:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.OBJECT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r4, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L23f:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.DOUBLE     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r4, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L245:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.FLOAT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r4, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L24b:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.LONG     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r4, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L251:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.INT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r4, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L257:
            int r5 = r2 + (-42)
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.OBJECT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r7 = 0
            r2 = 21
            r4 = 1
            r3 = r12
            r1.visitLocal(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L264:
            int r5 = r2 + (-38)
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.DOUBLE     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r7 = 0
            r2 = 21
            r4 = 1
            r3 = r12
            r1.visitLocal(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L271:
            int r5 = r2 + (-34)
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.FLOAT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r7 = 0
            r2 = 21
            r4 = 1
            r3 = r12
            r1.visitLocal(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L27e:
            int r5 = r2 + (-30)
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.LONG     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r7 = 0
            r2 = 21
            r4 = 1
            r3 = r12
            r1.visitLocal(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L28b:
            int r5 = r2 + (-26)
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.INT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r7 = 0
            r2 = 21
            r4 = 1
            r3 = r12
            r1.visitLocal(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L298:
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r2 = r12 + 1
            int r5 = r13.getUnsignedByte(r2)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.OBJECT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r7 = 0
            r2 = 21
            r4 = 2
            r3 = r12
            r1.visitLocal(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r9
        L2ab:
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r2 = r12 + 1
            int r5 = r13.getUnsignedByte(r2)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.DOUBLE     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r7 = 0
            r2 = 21
            r4 = 2
            r3 = r12
            r1.visitLocal(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r9
        L2be:
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r2 = r12 + 1
            int r5 = r13.getUnsignedByte(r2)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.FLOAT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r7 = 0
            r2 = 21
            r4 = 2
            r3 = r12
            r1.visitLocal(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r9
        L2d1:
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r2 = r12 + 1
            int r5 = r13.getUnsignedByte(r2)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.LONG     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r7 = 0
            r2 = 21
            r4 = 2
            r3 = r12
            r1.visitLocal(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r9
        L2e4:
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r2 = r12 + 1
            int r5 = r13.getUnsignedByte(r2)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.INT     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r7 = 0
            r2 = 21
            r4 = 2
            r3 = r12
            r1.visitLocal(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r9
        L2f7:
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r2 = r12 + 1
            int r13 = r13.getUnsignedShort(r2)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.cst.ConstantPool r2 = r11.pool     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.cst.Constant r5 = r2.get(r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r4 = 3
            r6 = 0
            r2 = 20
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r8
        L30e:
            com.android.dx.util.ByteArray r2 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r3 = r12 + 1
            int r2 = r2.getUnsignedShort(r3)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.cst.ConstantPool r3 = r11.pool     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.cst.Constant r5 = r3.get(r2)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            boolean r2 = r5 instanceof com.android.dx.rop.cst.CstInteger     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            if (r2 == 0) goto L327
            r13 = r5
            com.android.dx.rop.cst.CstInteger r13 = (com.android.dx.rop.cst.CstInteger) r13     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r13 = r13.getValue()     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
        L327:
            r6 = r13
            r2 = 18
            r4 = 3
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r8
        L330:
            com.android.dx.util.ByteArray r2 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r3 = r12 + 1
            int r2 = r2.getUnsignedByte(r3)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.cst.ConstantPool r3 = r11.pool     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.cst.Constant r5 = r3.get(r2)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            boolean r2 = r5 instanceof com.android.dx.rop.cst.CstInteger     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            if (r2 == 0) goto L349
            r13 = r5
            com.android.dx.rop.cst.CstInteger r13 = (com.android.dx.rop.cst.CstInteger) r13     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r13 = r13.getValue()     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
        L349:
            r6 = r13
            r2 = 18
            r4 = 2
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r9
        L352:
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r2 = r12 + 1
            int r6 = r13.getShort(r2)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.cst.CstInteger r5 = com.android.dx.rop.cst.CstInteger.make(r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r2 = 18
            r4 = 3
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r8
        L366:
            com.android.dx.util.ByteArray r13 = r11.bytes     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            int r2 = r12 + 1
            int r6 = r13.getByte(r2)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            com.android.dx.rop.cst.CstInteger r5 = com.android.dx.rop.cst.CstInteger.make(r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r2 = 18
            r4 = 2
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r9
        L37a:
            com.android.dx.rop.cst.CstDouble r5 = com.android.dx.rop.cst.CstDouble.VALUE_1     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r6 = 0
            r2 = 18
            r4 = 1
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L385:
            com.android.dx.rop.cst.CstDouble r5 = com.android.dx.rop.cst.CstDouble.VALUE_0     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r6 = 0
            r2 = 18
            r4 = 1
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L390:
            com.android.dx.rop.cst.CstFloat r5 = com.android.dx.rop.cst.CstFloat.VALUE_2     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r6 = 0
            r2 = 18
            r4 = 1
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L39b:
            com.android.dx.rop.cst.CstFloat r5 = com.android.dx.rop.cst.CstFloat.VALUE_1     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r6 = 0
            r2 = 18
            r4 = 1
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L3a6:
            com.android.dx.rop.cst.CstFloat r5 = com.android.dx.rop.cst.CstFloat.VALUE_0     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r6 = 0
            r2 = 18
            r4 = 1
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L3b1:
            com.android.dx.rop.cst.CstLong r5 = com.android.dx.rop.cst.CstLong.VALUE_1     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r6 = 0
            r2 = 18
            r4 = 1
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L3bc:
            com.android.dx.rop.cst.CstLong r5 = com.android.dx.rop.cst.CstLong.VALUE_0     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r6 = 0
            r2 = 18
            r4 = 1
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L3c7:
            com.android.dx.rop.cst.CstInteger r5 = com.android.dx.rop.cst.CstInteger.VALUE_5     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r6 = 5
            r2 = 18
            r4 = 1
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L3d2:
            com.android.dx.rop.cst.CstInteger r5 = com.android.dx.rop.cst.CstInteger.VALUE_4     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r6 = 4
            r2 = 18
            r4 = 1
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L3dd:
            com.android.dx.rop.cst.CstInteger r5 = com.android.dx.rop.cst.CstInteger.VALUE_3     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r6 = 3
            r2 = 18
            r4 = 1
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L3e8:
            com.android.dx.rop.cst.CstInteger r5 = com.android.dx.rop.cst.CstInteger.VALUE_2     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r6 = 2
            r2 = 18
            r4 = 1
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L3f3:
            com.android.dx.rop.cst.CstInteger r5 = com.android.dx.rop.cst.CstInteger.VALUE_1     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r6 = 1
            r2 = 18
            r4 = 1
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L3fe:
            com.android.dx.rop.cst.CstInteger r5 = com.android.dx.rop.cst.CstInteger.VALUE_0     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r6 = 0
            r2 = 18
            r4 = 1
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L409:
            com.android.dx.rop.cst.CstInteger r5 = com.android.dx.rop.cst.CstInteger.VALUE_M1     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r6 = -1
            r2 = 18
            r4 = 1
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L414:
            com.android.dx.rop.cst.CstKnownNull r5 = com.android.dx.rop.cst.CstKnownNull.THE_ONE     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r6 = 0
            r2 = 18
            r4 = 1
            r3 = r12
            r1.visitConstant(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L41f:
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.VOID     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            r1.visitNoArgs(r2, r12, r10, r13)     // Catch: java.lang.RuntimeException -> L22 com.android.dx.cf.code.SimException -> L25
            return r10
        L425:
            com.android.dx.cf.code.SimException r1 = new com.android.dx.cf.code.SimException
            r1.<init>(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r0)
            java.lang.String r12 = com.android.dx.util.Hex.u4(r12)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r1.addContext(r12)
            throw r1
        L441:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r12 = com.android.dx.util.Hex.u4(r12)
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r13.addContext(r12)
            throw r13
    }

    public void processWorkSet(int[] r2, com.android.dx.cf.code.BytecodeArray.Visitor r3) {
            r1 = this;
            if (r3 == 0) goto L14
        L2:
            r0 = 0
            int r0 = com.android.dx.util.Bits.findFirst(r2, r0)
            if (r0 >= 0) goto La
            return
        La:
            com.android.dx.util.Bits.clear(r2, r0)
            r1.parseInstruction(r0, r3)
            r3.setPreviousOffset(r0)
            goto L2
        L14:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "visitor == null"
            r2.<init>(r3)
            throw r2
    }

    public int size() {
            r1 = this;
            com.android.dx.util.ByteArray r0 = r1.bytes
            int r0 = r0.size()
            return r0
    }
}
