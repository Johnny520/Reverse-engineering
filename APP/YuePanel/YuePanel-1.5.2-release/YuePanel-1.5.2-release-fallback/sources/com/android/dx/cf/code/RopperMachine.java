package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
final class RopperMachine extends com.android.dx.cf.code.ValueAwareMachine {
    private static final com.android.dx.rop.cst.CstType ARRAY_REFLECT_TYPE = null;
    private static final com.android.dx.rop.cst.CstMethodRef MULTIANEWARRAY_METHOD = null;
    private final com.android.dx.rop.code.TranslationAdvice advice;
    private boolean blockCanThrow;
    private com.android.dx.rop.type.TypeList catches;
    private boolean catchesUsed;
    private int extraBlockCount;
    private boolean hasJsr;
    private final java.util.ArrayList<com.android.dx.rop.code.Insn> insns;
    private final int maxLocals;
    private final com.android.dx.cf.code.ConcreteMethod method;
    private final com.android.dx.cf.iface.MethodList methods;
    private int primarySuccessorIndex;
    private com.android.dx.cf.code.ReturnAddress returnAddress;
    private com.android.dx.rop.code.Rop returnOp;
    private com.android.dx.rop.code.SourcePosition returnPosition;
    private boolean returns;
    private final com.android.dx.cf.code.Ropper ropper;

    static {
            com.android.dx.rop.cst.CstType r0 = new com.android.dx.rop.cst.CstType
            java.lang.String r1 = "java/lang/reflect/Array"
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.internClassName(r1)
            r0.<init>(r1)
            com.android.dx.cf.code.RopperMachine.ARRAY_REFLECT_TYPE = r0
            com.android.dx.rop.cst.CstMethodRef r1 = new com.android.dx.rop.cst.CstMethodRef
            com.android.dx.rop.cst.CstNat r2 = new com.android.dx.rop.cst.CstNat
            com.android.dx.rop.cst.CstString r3 = new com.android.dx.rop.cst.CstString
            java.lang.String r4 = "newInstance"
            r3.<init>(r4)
            com.android.dx.rop.cst.CstString r4 = new com.android.dx.rop.cst.CstString
            java.lang.String r5 = "(Ljava/lang/Class;[I)Ljava/lang/Object;"
            r4.<init>(r5)
            r2.<init>(r3, r4)
            r1.<init>(r0, r2)
            com.android.dx.cf.code.RopperMachine.MULTIANEWARRAY_METHOD = r1
            return
    }

    public RopperMachine(com.android.dx.cf.code.Ropper r2, com.android.dx.cf.code.ConcreteMethod r3, com.android.dx.rop.code.TranslationAdvice r4, com.android.dx.cf.iface.MethodList r5) {
            r1 = this;
            com.android.dx.rop.type.Prototype r0 = r3.getEffectiveDescriptor()
            r1.<init>(r0)
            if (r5 == 0) goto L48
            if (r2 == 0) goto L40
            if (r4 == 0) goto L38
            r1.ropper = r2
            r1.method = r3
            r1.methods = r5
            r1.advice = r4
            int r2 = r3.getMaxLocals()
            r1.maxLocals = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 25
            r2.<init>(r3)
            r1.insns = r2
            r2 = 0
            r1.catches = r2
            r3 = 0
            r1.catchesUsed = r3
            r1.returns = r3
            r4 = -1
            r1.primarySuccessorIndex = r4
            r1.extraBlockCount = r3
            r1.blockCanThrow = r3
            r1.returnOp = r2
            r1.returnPosition = r2
            return
        L38:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "advice == null"
            r2.<init>(r3)
            throw r2
        L40:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "ropper == null"
            r2.<init>(r3)
            throw r2
        L48:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "methods == null"
            r2.<init>(r3)
            throw r2
    }

    private com.android.dx.rop.code.RegisterSpecList getSources(int r7, int r8) {
            r6 = this;
            int r0 = r6.argCount()
            if (r0 != 0) goto L9
            com.android.dx.rop.code.RegisterSpecList r7 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            return r7
        L9:
            int r1 = r6.getLocalIndex()
            r2 = 1
            r3 = 0
            if (r1 < 0) goto L22
            com.android.dx.rop.code.RegisterSpecList r7 = new com.android.dx.rop.code.RegisterSpecList
            r7.<init>(r2)
            com.android.dx.rop.type.TypeBearer r8 = r6.arg(r3)
            com.android.dx.rop.code.RegisterSpec r8 = com.android.dx.rop.code.RegisterSpec.make(r1, r8)
            r7.set(r3, r8)
            goto L79
        L22:
            com.android.dx.rop.code.RegisterSpecList r1 = new com.android.dx.rop.code.RegisterSpecList
            r1.<init>(r0)
            r4 = r3
        L28:
            if (r4 >= r0) goto L3d
            com.android.dx.rop.type.TypeBearer r5 = r6.arg(r4)
            com.android.dx.rop.code.RegisterSpec r5 = com.android.dx.rop.code.RegisterSpec.make(r8, r5)
            r1.set(r4, r5)
            int r5 = r5.getCategory()
            int r8 = r8 + r5
            int r4 = r4 + 1
            goto L28
        L3d:
            r8 = 79
            java.lang.String r4 = "shouldn't happen"
            r5 = 2
            if (r7 == r8) goto L60
            r8 = 181(0xb5, float:2.54E-43)
            if (r7 == r8) goto L49
            goto L78
        L49:
            if (r0 != r5) goto L5a
            com.android.dx.rop.code.RegisterSpec r7 = r1.get(r3)
            com.android.dx.rop.code.RegisterSpec r8 = r1.get(r2)
            r1.set(r3, r8)
            r1.set(r2, r7)
            goto L78
        L5a:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            r7.<init>(r4)
            throw r7
        L60:
            r7 = 3
            if (r0 != r7) goto L7d
            com.android.dx.rop.code.RegisterSpec r7 = r1.get(r3)
            com.android.dx.rop.code.RegisterSpec r8 = r1.get(r2)
            com.android.dx.rop.code.RegisterSpec r0 = r1.get(r5)
            r1.set(r3, r0)
            r1.set(r2, r7)
            r1.set(r5, r8)
        L78:
            r7 = r1
        L79:
            r7.setImmutable()
            return r7
        L7d:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            r7.<init>(r4)
            throw r7
    }

    private int jopToRopOpcode(int r4, com.android.dx.rop.cst.Constant r5) {
            r3 = this;
            if (r4 == 0) goto L115
            r0 = 20
            if (r4 == r0) goto L113
            r1 = 21
            if (r4 == r1) goto L111
            r2 = 171(0xab, float:2.4E-43)
            if (r4 == r2) goto L10e
            r2 = 172(0xac, float:2.41E-43)
            if (r4 == r2) goto L10b
            r2 = 198(0xc6, float:2.77E-43)
            if (r4 == r2) goto L109
            r2 = 199(0xc7, float:2.79E-43)
            if (r4 == r2) goto L106
            switch(r4) {
                case 0: goto L115;
                case 18: goto L113;
                case 46: goto L103;
                case 54: goto L111;
                case 79: goto L100;
                case 96: goto Lfd;
                case 100: goto Lfa;
                case 104: goto Lf7;
                case 108: goto Lf4;
                case 112: goto Lf1;
                case 116: goto Lee;
                case 120: goto Leb;
                case 122: goto Le8;
                case 124: goto Le5;
                case 126: goto Le4;
                case 128: goto Le3;
                case 130: goto Le0;
                default: goto L1d;
            }
        L1d:
            switch(r4) {
                case 132: goto Lfd;
                case 133: goto Ldd;
                case 134: goto Ldd;
                case 135: goto Ldd;
                case 136: goto Ldd;
                case 137: goto Ldd;
                case 138: goto Ldd;
                case 139: goto Ldd;
                case 140: goto Ldd;
                case 141: goto Ldd;
                case 142: goto Ldd;
                case 143: goto Ldd;
                case 144: goto Ldd;
                case 145: goto Lda;
                case 146: goto Ld7;
                case 147: goto Ld4;
                case 148: goto Ld1;
                case 149: goto Ld1;
                case 150: goto Lce;
                case 151: goto Ld1;
                case 152: goto Lce;
                case 153: goto L109;
                case 154: goto L106;
                case 155: goto Lcb;
                case 156: goto Lc8;
                case 157: goto Lc5;
                case 158: goto Lc2;
                case 159: goto L109;
                case 160: goto L106;
                case 161: goto Lcb;
                case 162: goto Lc8;
                case 163: goto Lc5;
                case 164: goto Lc2;
                case 165: goto L109;
                case 166: goto L106;
                case 167: goto Lc0;
                default: goto L20;
            }
        L20:
            r0 = 52
            switch(r4) {
                case 177: goto L10b;
                case 178: goto Lbd;
                case 179: goto Lba;
                case 180: goto Lb7;
                case 181: goto Lb4;
                case 182: goto L6b;
                case 183: goto L4e;
                case 184: goto L4b;
                case 185: goto L48;
                case 186: goto L45;
                case 187: goto L42;
                case 188: goto L3f;
                case 189: goto L3f;
                case 190: goto L3c;
                case 191: goto L39;
                case 192: goto L36;
                case 193: goto L33;
                case 194: goto L30;
                case 195: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "shouldn't happen"
            r4.<init>(r5)
            throw r4
        L2d:
            r4 = 37
            return r4
        L30:
            r4 = 36
            return r4
        L33:
            r4 = 44
            return r4
        L36:
            r4 = 43
            return r4
        L39:
            r4 = 35
            return r4
        L3c:
            r4 = 34
            return r4
        L3f:
            r4 = 41
            return r4
        L42:
            r4 = 40
            return r4
        L45:
            r4 = 59
            return r4
        L48:
            r4 = 53
            return r4
        L4b:
            r4 = 49
            return r4
        L4e:
            com.android.dx.rop.cst.CstMethodRef r5 = (com.android.dx.rop.cst.CstMethodRef) r5
            boolean r4 = r5.isInstanceInit()
            if (r4 != 0) goto L6a
            com.android.dx.rop.cst.CstType r4 = r5.getDefiningClass()
            com.android.dx.cf.code.ConcreteMethod r5 = r3.method
            com.android.dx.rop.cst.CstType r5 = r5.getDefiningClass()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L67
            goto L6a
        L67:
            r4 = 51
            return r4
        L6a:
            return r0
        L6b:
            com.android.dx.rop.cst.CstMethodRef r5 = (com.android.dx.rop.cst.CstMethodRef) r5
            com.android.dx.rop.cst.CstType r4 = r5.getDefiningClass()
            com.android.dx.cf.code.ConcreteMethod r1 = r3.method
            com.android.dx.rop.cst.CstType r1 = r1.getDefiningClass()
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto La8
            r4 = 0
        L7e:
            com.android.dx.cf.iface.MethodList r1 = r3.methods
            int r1 = r1.size()
            if (r4 >= r1) goto La8
            com.android.dx.cf.iface.MethodList r1 = r3.methods
            com.android.dx.cf.iface.Method r1 = r1.get(r4)
            int r2 = r1.getAccessFlags()
            boolean r2 = com.android.dx.rop.code.AccessFlags.isPrivate(r2)
            if (r2 == 0) goto La5
            com.android.dx.rop.cst.CstNat r2 = r5.getNat()
            com.android.dx.rop.cst.CstNat r1 = r1.getNat()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto La5
            return r0
        La5:
            int r4 = r4 + 1
            goto L7e
        La8:
            boolean r4 = r5.isSignaturePolymorphic()
            if (r4 == 0) goto Lb1
            r4 = 58
            return r4
        Lb1:
            r4 = 50
            return r4
        Lb4:
            r4 = 47
            return r4
        Lb7:
            r4 = 45
            return r4
        Lba:
            r4 = 48
            return r4
        Lbd:
            r4 = 46
            return r4
        Lc0:
            r4 = 6
            return r4
        Lc2:
            r4 = 11
            return r4
        Lc5:
            r4 = 12
            return r4
        Lc8:
            r4 = 10
            return r4
        Lcb:
            r4 = 9
            return r4
        Lce:
            r4 = 28
            return r4
        Ld1:
            r4 = 27
            return r4
        Ld4:
            r4 = 32
            return r4
        Ld7:
            r4 = 31
            return r4
        Lda:
            r4 = 30
            return r4
        Ldd:
            r4 = 29
            return r4
        Le0:
            r4 = 22
            return r4
        Le3:
            return r1
        Le4:
            return r0
        Le5:
            r4 = 25
            return r4
        Le8:
            r4 = 24
            return r4
        Leb:
            r4 = 23
            return r4
        Lee:
            r4 = 19
            return r4
        Lf1:
            r4 = 18
            return r4
        Lf4:
            r4 = 17
            return r4
        Lf7:
            r4 = 16
            return r4
        Lfa:
            r4 = 15
            return r4
        Lfd:
            r4 = 14
            return r4
        L100:
            r4 = 39
            return r4
        L103:
            r4 = 38
            return r4
        L106:
            r4 = 8
            return r4
        L109:
            r4 = 7
            return r4
        L10b:
            r4 = 33
            return r4
        L10e:
            r4 = 13
            return r4
        L111:
            r4 = 2
            return r4
        L113:
            r4 = 5
            return r4
        L115:
            r4 = 1
            return r4
    }

    private com.android.dx.rop.code.Insn makeInvokePolymorphicInsn(com.android.dx.rop.code.Rop r7, com.android.dx.rop.code.SourcePosition r8, com.android.dx.rop.code.RegisterSpecList r9, com.android.dx.rop.type.TypeList r10, com.android.dx.rop.cst.Constant r11) {
            r6 = this;
            r5 = r11
            com.android.dx.rop.cst.CstMethodRef r5 = (com.android.dx.rop.cst.CstMethodRef) r5
            com.android.dx.rop.code.InvokePolymorphicInsn r11 = new com.android.dx.rop.code.InvokePolymorphicInsn
            r0 = r11
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r11
    }

    private void updateReturnOp(com.android.dx.rop.code.Rop r3, com.android.dx.rop.code.SourcePosition r4) {
            r2 = this;
            if (r3 == 0) goto L47
            if (r4 == 0) goto L3f
            com.android.dx.rop.code.Rop r0 = r2.returnOp
            if (r0 != 0) goto Ld
            r2.returnOp = r3
            r2.returnPosition = r4
            goto L1d
        Ld:
            if (r0 != r3) goto L1e
            int r3 = r4.getLine()
            com.android.dx.rop.code.SourcePosition r0 = r2.returnPosition
            int r0 = r0.getLine()
            if (r3 <= r0) goto L1d
            r2.returnPosition = r4
        L1d:
            return
        L1e:
            com.android.dx.cf.code.SimException r4 = new com.android.dx.cf.code.SimException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "return op mismatch: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ", "
            r0.append(r3)
            com.android.dx.rop.code.Rop r3 = r2.returnOp
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L3f:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "pos == null"
            r3.<init>(r4)
            throw r3
        L47:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "op == null"
            r3.<init>(r4)
            throw r3
    }

    public boolean canThrow() {
            r1 = this;
            boolean r0 = r1.blockCanThrow
            return r0
    }

    public int getExtraBlockCount() {
            r1 = this;
            int r0 = r1.extraBlockCount
            return r0
    }

    public java.util.ArrayList<com.android.dx.rop.code.Insn> getInsns() {
            r1 = this;
            java.util.ArrayList<com.android.dx.rop.code.Insn> r0 = r1.insns
            return r0
    }

    public int getPrimarySuccessorIndex() {
            r1 = this;
            int r0 = r1.primarySuccessorIndex
            return r0
    }

    public com.android.dx.cf.code.ReturnAddress getReturnAddress() {
            r1 = this;
            com.android.dx.cf.code.ReturnAddress r0 = r1.returnAddress
            return r0
    }

    public com.android.dx.rop.code.Rop getReturnOp() {
            r1 = this;
            com.android.dx.rop.code.Rop r0 = r1.returnOp
            return r0
    }

    public com.android.dx.rop.code.SourcePosition getReturnPosition() {
            r1 = this;
            com.android.dx.rop.code.SourcePosition r0 = r1.returnPosition
            return r0
    }

    public boolean hasJsr() {
            r1 = this;
            boolean r0 = r1.hasJsr
            return r0
    }

    public boolean hasRet() {
            r1 = this;
            com.android.dx.cf.code.ReturnAddress r0 = r1.returnAddress
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean returns() {
            r1 = this;
            boolean r0 = r1.returns
            return r0
    }

    @Override // com.android.dx.cf.code.ValueAwareMachine, com.android.dx.cf.code.Machine
    public void run(com.android.dx.cf.code.Frame r21, int r22, int r23) {
            r20 = this;
            r7 = r20
            r0 = r23
            int r1 = r7.maxLocals
            com.android.dx.cf.code.ExecutionStack r2 = r21.getStack()
            int r2 = r2.size()
            int r1 = r1 + r2
            com.android.dx.rop.code.RegisterSpecList r11 = r7.getSources(r0, r1)
            int r2 = r11.size()
            super.run(r21, r22, r23)
            com.android.dx.cf.code.ConcreteMethod r3 = r7.method
            r4 = r22
            com.android.dx.rop.code.SourcePosition r6 = r3.makeSourcePosistion(r4)
            r3 = 54
            r4 = 0
            r5 = 1
            if (r0 != r3) goto L2a
            r3 = r5
            goto L2b
        L2a:
            r3 = r4
        L2b:
            com.android.dx.rop.code.RegisterSpec r3 = r7.getLocalTarget(r3)
            int r8 = r20.resultCount()
            if (r8 != 0) goto L40
            r1 = 87
            if (r0 == r1) goto L3f
            r1 = 88
            if (r0 == r1) goto L3f
            r3 = 0
            goto L4d
        L3f:
            return
        L40:
            if (r3 == 0) goto L43
            goto L4d
        L43:
            if (r8 != r5) goto L357
            com.android.dx.rop.type.TypeBearer r3 = r7.result(r4)
            com.android.dx.rop.code.RegisterSpec r3 = com.android.dx.rop.code.RegisterSpec.make(r1, r3)
        L4d:
            if (r3 == 0) goto L51
            r1 = r3
            goto L53
        L51:
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.VOID
        L53:
            com.android.dx.rop.cst.Constant r14 = r20.getAuxCst()
            r8 = 197(0xc5, float:2.76E-43)
            if (r0 != r8) goto L14e
            r7.blockCanThrow = r5
            r0 = 6
            r7.extraBlockCount = r0
            int r0 = r3.getNextReg()
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.INT_ARRAY
            com.android.dx.rop.code.RegisterSpec r0 = com.android.dx.rop.code.RegisterSpec.make(r0, r13)
            com.android.dx.rop.code.Rop r9 = com.android.dx.rop.code.Rops.opFilledNewArray(r13, r2)
            com.android.dx.rop.code.ThrowingCstInsn r12 = new com.android.dx.rop.code.ThrowingCstInsn
            com.android.dx.rop.type.TypeList r10 = r7.catches
            com.android.dx.rop.cst.CstType r16 = com.android.dx.rop.cst.CstType.INT_ARRAY
            r8 = r12
            r17 = r10
            r10 = r6
            r15 = r12
            r12 = r17
            r17 = r13
            r13 = r16
            r8.<init>(r9, r10, r11, r12, r13)
            java.util.ArrayList<com.android.dx.rop.code.Insn> r8 = r7.insns
            r8.add(r15)
            com.android.dx.rop.code.Rop r8 = com.android.dx.rop.code.Rops.opMoveResult(r17)
            com.android.dx.rop.code.PlainInsn r9 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.RegisterSpecList r10 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            r9.<init>(r8, r6, r0, r10)
            java.util.ArrayList<com.android.dx.rop.code.Insn> r8 = r7.insns
            r8.add(r9)
            r8 = r14
            com.android.dx.rop.cst.CstType r8 = (com.android.dx.rop.cst.CstType) r8
            com.android.dx.rop.type.Type r8 = r8.getClassType()
            r9 = r4
        L9f:
            if (r9 >= r2) goto La8
            com.android.dx.rop.type.Type r8 = r8.getComponentType()
            int r9 = r9 + 1
            goto L9f
        La8:
            int r9 = r3.getReg()
            com.android.dx.rop.type.Type r10 = com.android.dx.rop.type.Type.CLASS
            com.android.dx.rop.code.RegisterSpec r9 = com.android.dx.rop.code.RegisterSpec.make(r9, r10)
            boolean r10 = r8.isPrimitive()
            if (r10 == 0) goto Lcd
            com.android.dx.rop.cst.CstFieldRef r17 = com.android.dx.rop.cst.CstFieldRef.forPrimitiveType(r8)
            com.android.dx.rop.code.ThrowingCstInsn r8 = new com.android.dx.rop.code.ThrowingCstInsn
            com.android.dx.rop.code.Rop r13 = com.android.dx.rop.code.Rops.GET_STATIC_OBJECT
            com.android.dx.rop.code.RegisterSpecList r15 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            com.android.dx.rop.type.TypeList r10 = r7.catches
            r12 = r8
            r11 = r14
            r14 = r6
            r16 = r10
            r12.<init>(r13, r14, r15, r16, r17)
            goto Le6
        Lcd:
            r11 = r14
            com.android.dx.rop.code.ThrowingCstInsn r10 = new com.android.dx.rop.code.ThrowingCstInsn
            com.android.dx.rop.code.Rop r13 = com.android.dx.rop.code.Rops.CONST_OBJECT
            com.android.dx.rop.code.RegisterSpecList r15 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            com.android.dx.rop.type.TypeList r14 = r7.catches
            com.android.dx.rop.cst.CstType r12 = new com.android.dx.rop.cst.CstType
            r12.<init>(r8)
            r8 = r12
            r12 = r10
            r16 = r14
            r14 = r6
            r17 = r8
            r12.<init>(r13, r14, r15, r16, r17)
            r8 = r10
        Le6:
            java.util.ArrayList<com.android.dx.rop.code.Insn> r10 = r7.insns
            r10.add(r8)
            com.android.dx.rop.type.Type r8 = r9.getType()
            com.android.dx.rop.code.Rop r8 = com.android.dx.rop.code.Rops.opMoveResultPseudo(r8)
            com.android.dx.rop.code.PlainInsn r10 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.RegisterSpecList r15 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            r10.<init>(r8, r6, r9, r15)
            java.util.ArrayList<com.android.dx.rop.code.Insn> r8 = r7.insns
            r8.add(r10)
            int r8 = r3.getReg()
            com.android.dx.rop.type.Type r10 = com.android.dx.rop.type.Type.OBJECT
            com.android.dx.rop.code.RegisterSpec r8 = com.android.dx.rop.code.RegisterSpec.make(r8, r10)
            com.android.dx.rop.code.ThrowingCstInsn r10 = new com.android.dx.rop.code.ThrowingCstInsn
            com.android.dx.rop.cst.CstMethodRef r18 = com.android.dx.cf.code.RopperMachine.MULTIANEWARRAY_METHOD
            com.android.dx.rop.type.Prototype r12 = r18.getPrototype()
            com.android.dx.rop.code.Rop r13 = com.android.dx.rop.code.Rops.opInvokeStatic(r12)
            com.android.dx.rop.code.RegisterSpecList r0 = com.android.dx.rop.code.RegisterSpecList.make(r9, r0)
            com.android.dx.rop.type.TypeList r9 = r7.catches
            r12 = r10
            r14 = r6
            r4 = r15
            r15 = r0
            r16 = r9
            r17 = r18
            r12.<init>(r13, r14, r15, r16, r17)
            java.util.ArrayList<com.android.dx.rop.code.Insn> r0 = r7.insns
            r0.add(r10)
            com.android.dx.rop.type.Prototype r0 = r18.getPrototype()
            com.android.dx.rop.type.Type r0 = r0.getReturnType()
            com.android.dx.rop.code.Rop r0 = com.android.dx.rop.code.Rops.opMoveResult(r0)
            com.android.dx.rop.code.PlainInsn r9 = new com.android.dx.rop.code.PlainInsn
            r9.<init>(r0, r6, r8, r4)
            java.util.ArrayList<com.android.dx.rop.code.Insn> r0 = r7.insns
            r0.add(r9)
            com.android.dx.rop.code.RegisterSpecList r0 = com.android.dx.rop.code.RegisterSpecList.make(r8)
            r4 = 192(0xc0, float:2.69E-43)
            r19 = r11
            r11 = r0
            r0 = r4
            r4 = r19
            goto L16d
        L14e:
            r4 = r14
            r8 = 168(0xa8, float:2.35E-43)
            if (r0 != r8) goto L156
            r7.hasJsr = r5
            return
        L156:
            r8 = 169(0xa9, float:2.37E-43)
            if (r0 != r8) goto L16d
            r8 = 0
            com.android.dx.rop.type.TypeBearer r0 = r7.arg(r8)     // Catch: java.lang.ClassCastException -> L164
            com.android.dx.cf.code.ReturnAddress r0 = (com.android.dx.cf.code.ReturnAddress) r0     // Catch: java.lang.ClassCastException -> L164
            r7.returnAddress = r0     // Catch: java.lang.ClassCastException -> L164
            return
        L164:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Argument to RET was not a ReturnAddress"
            r1.<init>(r2, r0)
            throw r1
        L16d:
            int r8 = r7.jopToRopOpcode(r0, r4)
            com.android.dx.rop.code.Rop r9 = com.android.dx.rop.code.Rops.ropFor(r8, r1, r11, r4)
            if (r3 == 0) goto L1ab
            boolean r10 = r9.isCallLike()
            if (r10 == 0) goto L1ab
            int r10 = r7.extraBlockCount
            int r10 = r10 + r5
            r7.extraBlockCount = r10
            int r10 = r9.getOpcode()
            r12 = 59
            if (r10 != r12) goto L192
            r14 = r4
            com.android.dx.rop.cst.CstCallSiteRef r14 = (com.android.dx.rop.cst.CstCallSiteRef) r14
            com.android.dx.rop.type.Type r10 = r14.getReturnType()
            goto L19d
        L192:
            r14 = r4
            com.android.dx.rop.cst.CstMethodRef r14 = (com.android.dx.rop.cst.CstMethodRef) r14
            com.android.dx.rop.type.Prototype r10 = r14.getPrototype()
            com.android.dx.rop.type.Type r10 = r10.getReturnType()
        L19d:
            com.android.dx.rop.code.PlainInsn r15 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r10 = com.android.dx.rop.code.Rops.opMoveResult(r10)
            com.android.dx.rop.code.RegisterSpecList r12 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            r15.<init>(r10, r6, r3, r12)
        L1a8:
            r10 = r15
            r15 = 0
            goto L1ca
        L1ab:
            if (r3 == 0) goto L1c8
            boolean r10 = r9.canThrow()
            if (r10 == 0) goto L1c8
            int r10 = r7.extraBlockCount
            int r10 = r10 + r5
            r7.extraBlockCount = r10
            com.android.dx.rop.code.PlainInsn r15 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.type.TypeBearer r10 = r3.getTypeBearer()
            com.android.dx.rop.code.Rop r10 = com.android.dx.rop.code.Rops.opMoveResultPseudo(r10)
            com.android.dx.rop.code.RegisterSpecList r12 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            r15.<init>(r10, r6, r3, r12)
            goto L1a8
        L1c8:
            r15 = r3
            r10 = 0
        L1ca:
            r3 = 41
            if (r8 != r3) goto L1d9
            com.android.dx.rop.type.Type r1 = r9.getResult()
            com.android.dx.rop.cst.CstType r1 = com.android.dx.rop.cst.CstType.intern(r1)
            r13 = r9
            r9 = r1
            goto L23f
        L1d9:
            if (r4 != 0) goto L23d
            r3 = 2
            if (r2 != r3) goto L23d
            r2 = 0
            com.android.dx.rop.code.RegisterSpec r3 = r11.get(r2)
            com.android.dx.rop.type.TypeBearer r2 = r3.getTypeBearer()
            com.android.dx.rop.code.RegisterSpec r3 = r11.get(r5)
            com.android.dx.rop.type.TypeBearer r3 = r3.getTypeBearer()
            boolean r12 = r3.isConstant()
            if (r12 != 0) goto L1fb
            boolean r12 = r2.isConstant()
            if (r12 == 0) goto L23d
        L1fb:
            com.android.dx.rop.code.TranslationAdvice r12 = r7.advice
            r13 = 0
            com.android.dx.rop.code.RegisterSpec r14 = r11.get(r13)
            com.android.dx.rop.code.RegisterSpec r13 = r11.get(r5)
            boolean r12 = r12.hasConstantOperation(r9, r14, r13)
            if (r12 == 0) goto L23d
            boolean r4 = r3.isConstant()
            if (r4 == 0) goto L22f
            r2 = r3
            com.android.dx.rop.cst.Constant r2 = (com.android.dx.rop.cst.Constant) r2
            com.android.dx.rop.code.RegisterSpecList r4 = r11.withoutLast()
            int r9 = r9.getOpcode()
            r11 = 15
            if (r9 != r11) goto L235
            com.android.dx.rop.cst.CstInteger r3 = (com.android.dx.rop.cst.CstInteger) r3
            int r2 = r3.getValue()
            int r2 = -r2
            com.android.dx.rop.cst.CstInteger r2 = com.android.dx.rop.cst.CstInteger.make(r2)
            r8 = 14
            goto L235
        L22f:
            com.android.dx.rop.cst.Constant r2 = (com.android.dx.rop.cst.Constant) r2
            com.android.dx.rop.code.RegisterSpecList r4 = r11.withoutFirst()
        L235:
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.ropFor(r8, r1, r4, r2)
            r13 = r1
            r9 = r2
            r11 = r4
            goto L23f
        L23d:
            r13 = r9
            r9 = r4
        L23f:
            com.android.dx.cf.code.SwitchList r1 = r20.getAuxCases()
            java.util.ArrayList r18 = r20.getInitValues()
            boolean r2 = r13.canThrow()
            boolean r3 = r7.blockCanThrow
            r3 = r3 | r2
            r7.blockCanThrow = r3
            if (r1 == 0) goto L280
            int r0 = r1.size()
            if (r0 != 0) goto L269
            com.android.dx.rop.code.PlainInsn r0 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r1 = com.android.dx.rop.code.Rops.GOTO
            com.android.dx.rop.code.RegisterSpecList r2 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            r3 = 0
            r0.<init>(r1, r6, r3, r2)
            r1 = 0
            r7.primarySuccessorIndex = r1
        L265:
            r8 = r5
            r3 = r6
            goto L329
        L269:
            com.android.dx.util.IntList r0 = r1.getValues()
            com.android.dx.rop.code.SwitchInsn r1 = new com.android.dx.rop.code.SwitchInsn
            r12 = r1
            r14 = r6
            r16 = r11
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            int r0 = r0.size()
            r7.primarySuccessorIndex = r0
        L27e:
            r0 = r1
            goto L265
        L280:
            r3 = 0
            r1 = 33
            if (r8 != r1) goto L2bf
            int r0 = r11.size()
            if (r0 == 0) goto L2ad
            r0 = 0
            com.android.dx.rop.code.RegisterSpec r1 = r11.get(r0)
            com.android.dx.rop.type.TypeBearer r2 = r1.getTypeBearer()
            int r4 = r1.getReg()
            if (r4 == 0) goto L2ae
            java.util.ArrayList<com.android.dx.rop.code.Insn> r4 = r7.insns
            com.android.dx.rop.code.PlainInsn r8 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r11 = com.android.dx.rop.code.Rops.opMove(r2)
            com.android.dx.rop.code.RegisterSpec r2 = com.android.dx.rop.code.RegisterSpec.make(r0, r2)
            r8.<init>(r11, r6, r2, r1)
            r4.add(r8)
            goto L2ae
        L2ad:
            r0 = 0
        L2ae:
            com.android.dx.rop.code.PlainInsn r1 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r2 = com.android.dx.rop.code.Rops.GOTO
            com.android.dx.rop.code.RegisterSpecList r4 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            r1.<init>(r2, r6, r3, r4)
            r7.primarySuccessorIndex = r0
            r7.updateReturnOp(r13, r6)
            r7.returns = r5
            goto L27e
        L2bf:
            if (r9 == 0) goto L306
            if (r2 == 0) goto L2f8
            int r0 = r13.getOpcode()
            r1 = 58
            if (r0 != r1) goto L2db
            com.android.dx.rop.type.TypeList r0 = r7.catches
            r1 = r20
            r2 = r13
            r3 = r6
            r4 = r11
            r8 = r5
            r5 = r0
            r0 = r6
            r6 = r9
            com.android.dx.rop.code.Insn r1 = r1.makeInvokePolymorphicInsn(r2, r3, r4, r5, r6)
            goto L2eb
        L2db:
            r8 = r5
            r0 = r6
            com.android.dx.rop.code.ThrowingCstInsn r1 = new com.android.dx.rop.code.ThrowingCstInsn
            com.android.dx.rop.type.TypeList r2 = r7.catches
            r12 = r1
            r14 = r0
            r15 = r11
            r16 = r2
            r17 = r9
            r12.<init>(r13, r14, r15, r16, r17)
        L2eb:
            r7.catchesUsed = r8
            com.android.dx.rop.type.TypeList r2 = r7.catches
            int r2 = r2.size()
            r7.primarySuccessorIndex = r2
        L2f5:
            r3 = r0
        L2f6:
            r0 = r1
            goto L329
        L2f8:
            r8 = r5
            r0 = r6
            com.android.dx.rop.code.PlainCstInsn r1 = new com.android.dx.rop.code.PlainCstInsn
            r12 = r1
            r14 = r0
            r16 = r11
            r17 = r9
            r12.<init>(r13, r14, r15, r16, r17)
            goto L2f5
        L306:
            r8 = r5
            r3 = r6
            if (r2 == 0) goto L324
            com.android.dx.rop.code.ThrowingInsn r1 = new com.android.dx.rop.code.ThrowingInsn
            com.android.dx.rop.type.TypeList r2 = r7.catches
            r1.<init>(r13, r3, r11, r2)
            r7.catchesUsed = r8
            r2 = 191(0xbf, float:2.68E-43)
            if (r0 != r2) goto L31b
            r0 = -1
            r7.primarySuccessorIndex = r0
            goto L2f6
        L31b:
            com.android.dx.rop.type.TypeList r0 = r7.catches
            int r0 = r0.size()
            r7.primarySuccessorIndex = r0
            goto L2f6
        L324:
            com.android.dx.rop.code.PlainInsn r0 = new com.android.dx.rop.code.PlainInsn
            r0.<init>(r13, r3, r15, r11)
        L329:
            java.util.ArrayList<com.android.dx.rop.code.Insn> r1 = r7.insns
            r1.add(r0)
            if (r10 == 0) goto L335
            java.util.ArrayList<com.android.dx.rop.code.Insn> r0 = r7.insns
            r0.add(r10)
        L335:
            if (r18 == 0) goto L356
            int r0 = r7.extraBlockCount
            int r0 = r0 + r8
            r7.extraBlockCount = r0
            com.android.dx.rop.code.FillArrayDataInsn r0 = new com.android.dx.rop.code.FillArrayDataInsn
            com.android.dx.rop.code.Rop r13 = com.android.dx.rop.code.Rops.FILL_ARRAY_DATA
            com.android.dx.rop.code.RegisterSpec r1 = r10.getResult()
            com.android.dx.rop.code.RegisterSpecList r15 = com.android.dx.rop.code.RegisterSpecList.make(r1)
            r12 = r0
            r14 = r3
            r16 = r18
            r17 = r9
            r12.<init>(r13, r14, r15, r16, r17)
            java.util.ArrayList<com.android.dx.rop.code.Insn> r1 = r7.insns
            r1.add(r0)
        L356:
            return
        L357:
            r0 = r4
            r8 = r5
            r3 = r6
            com.android.dx.cf.code.Ropper r4 = r7.ropper
            int r4 = r4.getFirstTempStackReg()
            com.android.dx.rop.code.RegisterSpec[] r5 = new com.android.dx.rop.code.RegisterSpec[r2]
            r19 = r4
            r4 = r0
            r0 = r19
        L367:
            if (r4 >= r2) goto L38d
            com.android.dx.rop.code.RegisterSpec r6 = r11.get(r4)
            com.android.dx.rop.type.TypeBearer r9 = r6.getTypeBearer()
            com.android.dx.rop.code.RegisterSpec r10 = r6.withReg(r0)
            java.util.ArrayList<com.android.dx.rop.code.Insn> r12 = r7.insns
            com.android.dx.rop.code.PlainInsn r13 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r9 = com.android.dx.rop.code.Rops.opMove(r9)
            r13.<init>(r9, r3, r10, r6)
            r12.add(r13)
            r5[r4] = r10
            int r6 = r6.getCategory()
            int r0 = r0 + r6
            int r4 = r4 + 1
            goto L367
        L38d:
            int r0 = r20.getAuxInt()
        L391:
            if (r0 == 0) goto L3ba
            r2 = r0 & 15
            int r2 = r2 - r8
            r2 = r5[r2]
            com.android.dx.rop.type.TypeBearer r4 = r2.getTypeBearer()
            java.util.ArrayList<com.android.dx.rop.code.Insn> r6 = r7.insns
            com.android.dx.rop.code.PlainInsn r9 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r10 = com.android.dx.rop.code.Rops.opMove(r4)
            com.android.dx.rop.code.RegisterSpec r11 = r2.withReg(r1)
            r9.<init>(r10, r3, r11, r2)
            r6.add(r9)
            com.android.dx.rop.type.Type r2 = r4.getType()
            int r2 = r2.getCategory()
            int r1 = r1 + r2
            int r0 = r0 >> 4
            goto L391
        L3ba:
            return
    }

    public void startBlock(com.android.dx.rop.type.TypeList r1) {
            r0 = this;
            r0.catches = r1
            java.util.ArrayList<com.android.dx.rop.code.Insn> r1 = r0.insns
            r1.clear()
            r1 = 0
            r0.catchesUsed = r1
            r0.returns = r1
            r0.primarySuccessorIndex = r1
            r0.extraBlockCount = r1
            r0.blockCanThrow = r1
            r0.hasJsr = r1
            r1 = 0
            r0.returnAddress = r1
            return
    }

    public boolean wereCatchesUsed() {
            r1 = this;
            boolean r0 = r1.catchesUsed
            return r0
    }
}
