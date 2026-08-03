package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public class Simulator {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String LOCAL_MISMATCH_ERROR = "This is symptomatic of .class transformation tools that ignore local variable information.";
    private final com.android.dx.cf.code.BytecodeArray code;
    private final com.android.dx.dex.DexOptions dexOptions;
    private final com.android.dx.cf.code.LocalVariableList localVariables;
    private final com.android.dx.cf.code.Machine machine;
    private com.android.dx.cf.code.ConcreteMethod method;
    private final com.android.dx.cf.code.Simulator.SimVisitor visitor;

    public class SimVisitor implements com.android.dx.cf.code.BytecodeArray.Visitor {
        private com.android.dx.cf.code.Frame frame;
        private final com.android.dx.cf.code.Machine machine;
        private int previousOffset;
        final /* synthetic */ com.android.dx.cf.code.Simulator this$0;

        public SimVisitor(com.android.dx.cf.code.Simulator r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                com.android.dx.cf.code.Machine r1 = com.android.dx.cf.code.Simulator.access$000(r1)
                r0.machine = r1
                r1 = 0
                r0.frame = r1
                return
        }

        private void checkReturnType(com.android.dx.rop.type.Type r5) {
                r4 = this;
                com.android.dx.cf.code.Machine r0 = r4.machine
                com.android.dx.rop.type.Prototype r0 = r0.getPrototype()
                com.android.dx.rop.type.Type r0 = r0.getReturnType()
                boolean r1 = com.android.dx.cf.code.Merger.isPossiblyAssignableFrom(r0, r5)
                if (r1 != 0) goto L36
                com.android.dx.cf.code.Simulator r1 = r4.this$0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "return type mismatch: prototype indicates "
                r2.append(r3)
                java.lang.String r0 = r0.toHuman()
                r2.append(r0)
                java.lang.String r0 = ", but encountered type "
                r2.append(r0)
                java.lang.String r5 = r5.toHuman()
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                com.android.dx.cf.code.Simulator.access$200(r1, r5)
            L36:
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public int getPreviousOffset() {
                r1 = this;
                int r0 = r1.previousOffset
                return r0
        }

        public void setFrame(com.android.dx.cf.code.Frame r2) {
                r1 = this;
                if (r2 == 0) goto L5
                r1.frame = r2
                return
            L5:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "frame == null"
                r2.<init>(r0)
                throw r2
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void setPreviousOffset(int r1) {
                r0 = this;
                r0.previousOffset = r1
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitBranch(int r3, int r4, int r5, int r6) {
                r2 = this;
                switch(r3) {
                    case 153: goto L2e;
                    case 154: goto L2e;
                    case 155: goto L2e;
                    case 156: goto L2e;
                    case 157: goto L2e;
                    case 158: goto L2e;
                    case 159: goto L24;
                    case 160: goto L24;
                    case 161: goto L24;
                    case 162: goto L24;
                    case 163: goto L24;
                    case 164: goto L24;
                    case 165: goto L1a;
                    case 166: goto L1a;
                    case 167: goto L14;
                    case 168: goto L14;
                    default: goto L3;
                }
            L3:
                switch(r3) {
                    case 198: goto La;
                    case 199: goto La;
                    case 200: goto L14;
                    case 201: goto L14;
                    default: goto L6;
                }
            L6:
                r2.visitInvalid(r3, r4, r5)
                return
            La:
                com.android.dx.cf.code.Machine r5 = r2.machine
                com.android.dx.cf.code.Frame r0 = r2.frame
                com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.OBJECT
                r5.popArgs(r0, r1)
                goto L37
            L14:
                com.android.dx.cf.code.Machine r5 = r2.machine
                r5.clearArgs()
                goto L37
            L1a:
                com.android.dx.cf.code.Machine r5 = r2.machine
                com.android.dx.cf.code.Frame r0 = r2.frame
                com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.OBJECT
                r5.popArgs(r0, r1, r1)
                goto L37
            L24:
                com.android.dx.cf.code.Machine r5 = r2.machine
                com.android.dx.cf.code.Frame r0 = r2.frame
                com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.INT
                r5.popArgs(r0, r1, r1)
                goto L37
            L2e:
                com.android.dx.cf.code.Machine r5 = r2.machine
                com.android.dx.cf.code.Frame r0 = r2.frame
                com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.INT
                r5.popArgs(r0, r1)
            L37:
                com.android.dx.cf.code.Machine r5 = r2.machine
                r5.auxTargetArg(r6)
                com.android.dx.cf.code.Machine r5 = r2.machine
                com.android.dx.cf.code.Frame r6 = r2.frame
                r5.run(r6, r4, r3)
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitConstant(int r4, int r5, int r6, com.android.dx.rop.cst.Constant r7, int r8) {
                r3 = this;
                r6 = 18
                if (r4 == r6) goto Lb3
                r6 = 19
                if (r4 == r6) goto Lb3
                r6 = 189(0xbd, float:2.65E-43)
                if (r4 == r6) goto La9
                r6 = 197(0xc5, float:2.76E-43)
                if (r4 == r6) goto L9b
                r6 = 192(0xc0, float:2.69E-43)
                if (r4 == r6) goto L91
                r6 = 193(0xc1, float:2.7E-43)
                if (r4 == r6) goto L91
                switch(r4) {
                    case 179: goto L82;
                    case 180: goto L91;
                    case 181: goto L71;
                    case 182: goto L3a;
                    case 183: goto L3a;
                    case 184: goto L3a;
                    case 185: goto L3a;
                    case 186: goto L22;
                    default: goto L1b;
                }
            L1b:
                com.android.dx.cf.code.Machine r6 = r3.machine
                r6.clearArgs()
                goto Lc5
            L22:
                com.android.dx.cf.code.Simulator r6 = r3.this$0
                com.android.dx.cf.code.Simulator.access$700(r6, r4)
                com.android.dx.rop.cst.CstInvokeDynamic r7 = (com.android.dx.rop.cst.CstInvokeDynamic) r7
                com.android.dx.rop.type.Prototype r6 = r7.getPrototype()
                com.android.dx.cf.code.Machine r0 = r3.machine
                com.android.dx.cf.code.Frame r1 = r3.frame
                r0.popArgs(r1, r6)
                com.android.dx.rop.cst.CstCallSiteRef r7 = r7.addReference()
                goto Lc5
            L3a:
                boolean r6 = r7 instanceof com.android.dx.rop.cst.CstInterfaceMethodRef
                if (r6 == 0) goto L49
                com.android.dx.rop.cst.CstInterfaceMethodRef r7 = (com.android.dx.rop.cst.CstInterfaceMethodRef) r7
                com.android.dx.rop.cst.CstMethodRef r7 = r7.toMethodRef()
                com.android.dx.cf.code.Simulator r6 = r3.this$0
                com.android.dx.cf.code.Simulator.access$500(r6, r4, r7)
            L49:
                boolean r6 = r7 instanceof com.android.dx.rop.cst.CstMethodRef
                if (r6 == 0) goto L5b
                r6 = r7
                com.android.dx.rop.cst.CstMethodRef r6 = (com.android.dx.rop.cst.CstMethodRef) r6
                boolean r6 = r6.isSignaturePolymorphic()
                if (r6 == 0) goto L5b
                com.android.dx.cf.code.Simulator r6 = r3.this$0
                com.android.dx.cf.code.Simulator.access$600(r6, r4)
            L5b:
                r6 = 184(0xb8, float:2.58E-43)
                if (r4 != r6) goto L61
                r6 = 1
                goto L62
            L61:
                r6 = 0
            L62:
                r0 = r7
                com.android.dx.rop.cst.CstMethodRef r0 = (com.android.dx.rop.cst.CstMethodRef) r0
                com.android.dx.rop.type.Prototype r6 = r0.getPrototype(r6)
                com.android.dx.cf.code.Machine r0 = r3.machine
                com.android.dx.cf.code.Frame r1 = r3.frame
                r0.popArgs(r1, r6)
                goto Lc5
            L71:
                r6 = r7
                com.android.dx.rop.cst.CstFieldRef r6 = (com.android.dx.rop.cst.CstFieldRef) r6
                com.android.dx.rop.type.Type r6 = r6.getType()
                com.android.dx.cf.code.Machine r0 = r3.machine
                com.android.dx.cf.code.Frame r1 = r3.frame
                com.android.dx.rop.type.Type r2 = com.android.dx.rop.type.Type.OBJECT
                r0.popArgs(r1, r2, r6)
                goto Lc5
            L82:
                r6 = r7
                com.android.dx.rop.cst.CstFieldRef r6 = (com.android.dx.rop.cst.CstFieldRef) r6
                com.android.dx.rop.type.Type r6 = r6.getType()
                com.android.dx.cf.code.Machine r0 = r3.machine
                com.android.dx.cf.code.Frame r1 = r3.frame
                r0.popArgs(r1, r6)
                goto Lc5
            L91:
                com.android.dx.cf.code.Machine r6 = r3.machine
                com.android.dx.cf.code.Frame r0 = r3.frame
                com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.OBJECT
                r6.popArgs(r0, r1)
                goto Lc5
            L9b:
                com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.VOID
                com.android.dx.rop.type.Prototype r6 = com.android.dx.rop.type.Prototype.internInts(r6, r8)
                com.android.dx.cf.code.Machine r0 = r3.machine
                com.android.dx.cf.code.Frame r1 = r3.frame
                r0.popArgs(r1, r6)
                goto Lc5
            La9:
                com.android.dx.cf.code.Machine r6 = r3.machine
                com.android.dx.cf.code.Frame r0 = r3.frame
                com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.INT
                r6.popArgs(r0, r1)
                goto Lc5
            Lb3:
                boolean r6 = r7 instanceof com.android.dx.rop.cst.CstMethodHandle
                if (r6 != 0) goto Lbb
                boolean r6 = r7 instanceof com.android.dx.rop.cst.CstProtoRef
                if (r6 == 0) goto Lc0
            Lbb:
                com.android.dx.cf.code.Simulator r6 = r3.this$0
                com.android.dx.cf.code.Simulator.access$800(r6, r7)
            Lc0:
                com.android.dx.cf.code.Machine r6 = r3.machine
                r6.clearArgs()
            Lc5:
                com.android.dx.cf.code.Machine r6 = r3.machine
                r6.auxIntArg(r8)
                com.android.dx.cf.code.Machine r6 = r3.machine
                r6.auxCstArg(r7)
                com.android.dx.cf.code.Machine r6 = r3.machine
                com.android.dx.cf.code.Frame r7 = r3.frame
                r6.run(r7, r5, r4)
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitInvalid(int r2, int r3, int r4) {
                r1 = this;
                com.android.dx.cf.code.SimException r3 = new com.android.dx.cf.code.SimException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "invalid opcode "
                r4.append(r0)
                java.lang.String r2 = com.android.dx.util.Hex.u1(r2)
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                r3.<init>(r2)
                throw r3
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitLocal(int r7, int r8, int r9, int r10, com.android.dx.rop.type.Type r11, int r12) {
                r6 = this;
                r0 = 54
                if (r7 != r0) goto L7
                int r1 = r8 + r9
                goto L8
            L7:
                r1 = r8
            L8:
                com.android.dx.cf.code.Simulator r2 = r6.this$0
                com.android.dx.cf.code.LocalVariableList r2 = com.android.dx.cf.code.Simulator.access$400(r2)
                com.android.dx.cf.code.LocalVariableList$Item r1 = r2.pcAndIndexToLocal(r1, r10)
                r2 = 0
                if (r1 == 0) goto L26
                com.android.dx.rop.type.Type r3 = r1.getType()
                int r4 = r3.getBasicFrameType()
                int r5 = r11.getBasicFrameType()
                if (r4 == r5) goto L27
                r3 = r11
                r1 = r2
                goto L27
            L26:
                r3 = r11
            L27:
                r4 = 21
                if (r7 == r4) goto L79
                if (r7 == r0) goto L60
                r0 = 132(0x84, float:1.85E-43)
                if (r7 == r0) goto L39
                r12 = 169(0xa9, float:2.37E-43)
                if (r7 == r12) goto L79
                r6.visitInvalid(r7, r8, r9)
                return
            L39:
                if (r1 != 0) goto L3c
                goto L40
            L3c:
                com.android.dx.rop.code.LocalItem r2 = r1.getLocalItem()
            L40:
                com.android.dx.cf.code.Machine r9 = r6.machine
                com.android.dx.cf.code.Frame r0 = r6.frame
                r9.localArg(r0, r10)
                com.android.dx.cf.code.Machine r9 = r6.machine
                r9.localTarget(r10, r3, r2)
                com.android.dx.cf.code.Machine r9 = r6.machine
                r9.auxType(r11)
                com.android.dx.cf.code.Machine r9 = r6.machine
                r9.auxIntArg(r12)
                com.android.dx.cf.code.Machine r9 = r6.machine
                com.android.dx.rop.cst.CstInteger r10 = com.android.dx.rop.cst.CstInteger.make(r12)
                r9.auxCstArg(r10)
                goto L8f
            L60:
                if (r1 != 0) goto L63
                goto L67
            L63:
                com.android.dx.rop.code.LocalItem r2 = r1.getLocalItem()
            L67:
                com.android.dx.cf.code.Machine r9 = r6.machine
                com.android.dx.cf.code.Frame r12 = r6.frame
                r9.popArgs(r12, r11)
                com.android.dx.cf.code.Machine r9 = r6.machine
                r9.auxType(r11)
                com.android.dx.cf.code.Machine r9 = r6.machine
                r9.localTarget(r10, r3, r2)
                goto L8f
            L79:
                com.android.dx.cf.code.Machine r9 = r6.machine
                com.android.dx.cf.code.Frame r12 = r6.frame
                r9.localArg(r12, r10)
                com.android.dx.cf.code.Machine r9 = r6.machine
                if (r1 == 0) goto L86
                r10 = 1
                goto L87
            L86:
                r10 = 0
            L87:
                r9.localInfo(r10)
                com.android.dx.cf.code.Machine r9 = r6.machine
                r9.auxType(r11)
            L8f:
                com.android.dx.cf.code.Machine r9 = r6.machine
                com.android.dx.cf.code.Frame r10 = r6.frame
                r9.run(r10, r8, r7)
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitNewarray(int r3, int r4, com.android.dx.rop.cst.CstType r5, java.util.ArrayList<com.android.dx.rop.cst.Constant> r6) {
                r2 = this;
                com.android.dx.cf.code.Machine r4 = r2.machine
                com.android.dx.cf.code.Frame r0 = r2.frame
                com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.INT
                r4.popArgs(r0, r1)
                com.android.dx.cf.code.Machine r4 = r2.machine
                r4.auxInitValues(r6)
                com.android.dx.cf.code.Machine r4 = r2.machine
                r4.auxCstArg(r5)
                com.android.dx.cf.code.Machine r4 = r2.machine
                com.android.dx.cf.code.Frame r5 = r2.frame
                r6 = 188(0xbc, float:2.63E-43)
                r4.run(r5, r3, r6)
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitNoArgs(int r9, int r10, int r11, com.android.dx.rop.type.Type r12) {
                r8 = this;
                if (r9 == 0) goto L350
                r0 = 190(0xbe, float:2.66E-43)
                r1 = 0
                if (r9 == r0) goto L31c
                r0 = 191(0xbf, float:2.68E-43)
                if (r9 == r0) goto L312
                r0 = 194(0xc2, float:2.72E-43)
                if (r9 == r0) goto L312
                r0 = 195(0xc3, float:2.73E-43)
                if (r9 == r0) goto L312
                r0 = 3
                r2 = 1
                r3 = 2
                switch(r9) {
                    case 0: goto L350;
                    case 46: goto L2f1;
                    case 79: goto L2c1;
                    case 100: goto L2b8;
                    case 104: goto L2b8;
                    case 108: goto L2b8;
                    case 112: goto L2b8;
                    case 116: goto L2af;
                    case 120: goto L2a4;
                    case 122: goto L2a4;
                    case 124: goto L2a4;
                    case 126: goto L2b8;
                    case 128: goto L2b8;
                    case 130: goto L2b8;
                    case 172: goto L288;
                    case 177: goto L27c;
                    default: goto L19;
                }
            L19:
                r4 = 17
                r5 = 205106(0x32132, float:2.87415E-40)
                r6 = 12819(0x3213, float:1.7963E-41)
                r7 = 530(0x212, float:7.43E-43)
                switch(r9) {
                    case 87: goto L25e;
                    case 88: goto L223;
                    case 89: goto L200;
                    case 90: goto L1d3;
                    case 91: goto L189;
                    case 92: goto L223;
                    case 93: goto L135;
                    case 94: goto La8;
                    case 95: goto L79;
                    case 96: goto L2b8;
                    default: goto L25;
                }
            L25:
                switch(r9) {
                    case 133: goto L6e;
                    case 134: goto L6e;
                    case 135: goto L6e;
                    case 136: goto L63;
                    case 137: goto L63;
                    case 138: goto L63;
                    case 139: goto L58;
                    case 140: goto L58;
                    case 141: goto L58;
                    case 142: goto L4d;
                    case 143: goto L4d;
                    case 144: goto L4d;
                    case 145: goto L6e;
                    case 146: goto L6e;
                    case 147: goto L6e;
                    case 148: goto L42;
                    case 149: goto L37;
                    case 150: goto L37;
                    case 151: goto L2c;
                    case 152: goto L2c;
                    default: goto L28;
                }
            L28:
                r8.visitInvalid(r9, r10, r11)
                return
            L2c:
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r0 = r8.frame
                com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.DOUBLE
                r11.popArgs(r0, r1, r1)
                goto L355
            L37:
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r0 = r8.frame
                com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.FLOAT
                r11.popArgs(r0, r1, r1)
                goto L355
            L42:
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r0 = r8.frame
                com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.LONG
                r11.popArgs(r0, r1, r1)
                goto L355
            L4d:
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r0 = r8.frame
                com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.DOUBLE
                r11.popArgs(r0, r1)
                goto L355
            L58:
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r0 = r8.frame
                com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.FLOAT
                r11.popArgs(r0, r1)
                goto L355
            L63:
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r0 = r8.frame
                com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.LONG
                r11.popArgs(r0, r1)
                goto L355
            L6e:
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r0 = r8.frame
                com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.INT
                r11.popArgs(r0, r1)
                goto L355
            L79:
                com.android.dx.cf.code.Frame r11 = r8.frame
                com.android.dx.cf.code.ExecutionStack r11 = r11.getStack()
                com.android.dx.rop.type.Type r0 = r11.peekType(r1)
                boolean r0 = r0.isCategory1()
                if (r0 == 0) goto La3
                com.android.dx.rop.type.Type r11 = r11.peekType(r2)
                boolean r11 = r11.isCategory1()
                if (r11 == 0) goto La3
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r0 = r8.frame
                r11.popArgs(r0, r3)
                com.android.dx.cf.code.Machine r11 = r8.machine
                r0 = 18
                r11.auxIntArg(r0)
                goto L355
            La3:
                com.android.dx.cf.code.SimException r9 = com.android.dx.cf.code.Simulator.access$100()
                throw r9
            La8:
                com.android.dx.cf.code.Frame r11 = r8.frame
                com.android.dx.cf.code.ExecutionStack r11 = r11.getStack()
                com.android.dx.rop.type.Type r1 = r11.peekType(r1)
                boolean r1 = r1.isCategory2()
                if (r1 == 0) goto Led
                com.android.dx.rop.type.Type r1 = r11.peekType(r3)
                boolean r1 = r1.isCategory2()
                if (r1 == 0) goto Ld0
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r0 = r8.frame
                r11.popArgs(r0, r3)
                com.android.dx.cf.code.Machine r11 = r8.machine
                r11.auxIntArg(r7)
                goto L355
            Ld0:
                com.android.dx.rop.type.Type r11 = r11.peekType(r0)
                boolean r11 = r11.isCategory1()
                if (r11 == 0) goto Le8
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r1 = r8.frame
                r11.popArgs(r1, r0)
                com.android.dx.cf.code.Machine r11 = r8.machine
                r11.auxIntArg(r6)
                goto L355
            Le8:
                com.android.dx.cf.code.SimException r9 = com.android.dx.cf.code.Simulator.access$100()
                throw r9
            Led:
                com.android.dx.rop.type.Type r1 = r11.peekType(r2)
                boolean r1 = r1.isCategory1()
                if (r1 == 0) goto L130
                com.android.dx.rop.type.Type r1 = r11.peekType(r3)
                boolean r1 = r1.isCategory2()
                if (r1 == 0) goto L10f
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r1 = r8.frame
                r11.popArgs(r1, r0)
                com.android.dx.cf.code.Machine r11 = r8.machine
                r11.auxIntArg(r5)
                goto L355
            L10f:
                com.android.dx.rop.type.Type r11 = r11.peekType(r0)
                boolean r11 = r11.isCategory1()
                if (r11 == 0) goto L12b
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r0 = r8.frame
                r1 = 4
                r11.popArgs(r0, r1)
                com.android.dx.cf.code.Machine r11 = r8.machine
                r0 = 4399427(0x432143, float:6.16491E-39)
                r11.auxIntArg(r0)
                goto L355
            L12b:
                com.android.dx.cf.code.SimException r9 = com.android.dx.cf.code.Simulator.access$100()
                throw r9
            L130:
                com.android.dx.cf.code.SimException r9 = com.android.dx.cf.code.Simulator.access$100()
                throw r9
            L135:
                com.android.dx.cf.code.Frame r11 = r8.frame
                com.android.dx.cf.code.ExecutionStack r11 = r11.getStack()
                com.android.dx.rop.type.Type r1 = r11.peekType(r1)
                boolean r1 = r1.isCategory2()
                if (r1 == 0) goto L162
                com.android.dx.rop.type.Type r11 = r11.peekType(r3)
                boolean r11 = r11.isCategory2()
                if (r11 != 0) goto L15d
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r0 = r8.frame
                r11.popArgs(r0, r3)
                com.android.dx.cf.code.Machine r11 = r8.machine
                r11.auxIntArg(r7)
                goto L355
            L15d:
                com.android.dx.cf.code.SimException r9 = com.android.dx.cf.code.Simulator.access$100()
                throw r9
            L162:
                com.android.dx.rop.type.Type r1 = r11.peekType(r2)
                boolean r1 = r1.isCategory2()
                if (r1 != 0) goto L184
                com.android.dx.rop.type.Type r11 = r11.peekType(r3)
                boolean r11 = r11.isCategory2()
                if (r11 != 0) goto L184
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r1 = r8.frame
                r11.popArgs(r1, r0)
                com.android.dx.cf.code.Machine r11 = r8.machine
                r11.auxIntArg(r5)
                goto L355
            L184:
                com.android.dx.cf.code.SimException r9 = com.android.dx.cf.code.Simulator.access$100()
                throw r9
            L189:
                com.android.dx.cf.code.Frame r11 = r8.frame
                com.android.dx.cf.code.ExecutionStack r11 = r11.getStack()
                com.android.dx.rop.type.Type r1 = r11.peekType(r1)
                boolean r1 = r1.isCategory2()
                if (r1 != 0) goto L1ce
                com.android.dx.rop.type.Type r1 = r11.peekType(r2)
                boolean r1 = r1.isCategory2()
                if (r1 == 0) goto L1b1
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r0 = r8.frame
                r11.popArgs(r0, r3)
                com.android.dx.cf.code.Machine r11 = r8.machine
                r11.auxIntArg(r7)
                goto L355
            L1b1:
                com.android.dx.rop.type.Type r11 = r11.peekType(r3)
                boolean r11 = r11.isCategory1()
                if (r11 == 0) goto L1c9
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r1 = r8.frame
                r11.popArgs(r1, r0)
                com.android.dx.cf.code.Machine r11 = r8.machine
                r11.auxIntArg(r6)
                goto L355
            L1c9:
                com.android.dx.cf.code.SimException r9 = com.android.dx.cf.code.Simulator.access$100()
                throw r9
            L1ce:
                com.android.dx.cf.code.SimException r9 = com.android.dx.cf.code.Simulator.access$100()
                throw r9
            L1d3:
                com.android.dx.cf.code.Frame r11 = r8.frame
                com.android.dx.cf.code.ExecutionStack r11 = r11.getStack()
                com.android.dx.rop.type.Type r0 = r11.peekType(r1)
                boolean r0 = r0.isCategory1()
                if (r0 == 0) goto L1fb
                com.android.dx.rop.type.Type r11 = r11.peekType(r2)
                boolean r11 = r11.isCategory1()
                if (r11 == 0) goto L1fb
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r0 = r8.frame
                r11.popArgs(r0, r3)
                com.android.dx.cf.code.Machine r11 = r8.machine
                r11.auxIntArg(r7)
                goto L355
            L1fb:
                com.android.dx.cf.code.SimException r9 = com.android.dx.cf.code.Simulator.access$100()
                throw r9
            L200:
                com.android.dx.cf.code.Frame r11 = r8.frame
                com.android.dx.cf.code.ExecutionStack r11 = r11.getStack()
                com.android.dx.rop.type.Type r11 = r11.peekType(r1)
                boolean r11 = r11.isCategory2()
                if (r11 != 0) goto L21e
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r0 = r8.frame
                r11.popArgs(r0, r2)
                com.android.dx.cf.code.Machine r11 = r8.machine
                r11.auxIntArg(r4)
                goto L355
            L21e:
                com.android.dx.cf.code.SimException r9 = com.android.dx.cf.code.Simulator.access$100()
                throw r9
            L223:
                com.android.dx.cf.code.Frame r11 = r8.frame
                com.android.dx.cf.code.ExecutionStack r11 = r11.getStack()
                com.android.dx.rop.type.Type r0 = r11.peekType(r1)
                boolean r0 = r0.isCategory2()
                if (r0 == 0) goto L23b
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r0 = r8.frame
                r11.popArgs(r0, r2)
                goto L24e
            L23b:
                com.android.dx.rop.type.Type r11 = r11.peekType(r2)
                boolean r11 = r11.isCategory1()
                if (r11 == 0) goto L259
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r0 = r8.frame
                r11.popArgs(r0, r3)
                r4 = 8481(0x2121, float:1.1884E-41)
            L24e:
                r11 = 92
                if (r9 != r11) goto L355
                com.android.dx.cf.code.Machine r11 = r8.machine
                r11.auxIntArg(r4)
                goto L355
            L259:
                com.android.dx.cf.code.SimException r9 = com.android.dx.cf.code.Simulator.access$100()
                throw r9
            L25e:
                com.android.dx.cf.code.Frame r11 = r8.frame
                com.android.dx.cf.code.ExecutionStack r11 = r11.getStack()
                com.android.dx.rop.type.Type r11 = r11.peekType(r1)
                boolean r11 = r11.isCategory2()
                if (r11 != 0) goto L277
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r0 = r8.frame
                r11.popArgs(r0, r2)
                goto L355
            L277:
                com.android.dx.cf.code.SimException r9 = com.android.dx.cf.code.Simulator.access$100()
                throw r9
            L27c:
                com.android.dx.cf.code.Machine r11 = r8.machine
                r11.clearArgs()
                com.android.dx.rop.type.Type r11 = com.android.dx.rop.type.Type.VOID
                r8.checkReturnType(r11)
                goto L355
            L288:
                com.android.dx.rop.type.Type r11 = com.android.dx.rop.type.Type.OBJECT
                if (r12 != r11) goto L297
                com.android.dx.cf.code.Frame r11 = r8.frame
                com.android.dx.cf.code.ExecutionStack r11 = r11.getStack()
                com.android.dx.rop.type.Type r11 = r11.peekType(r1)
                goto L298
            L297:
                r11 = r12
            L298:
                com.android.dx.cf.code.Machine r0 = r8.machine
                com.android.dx.cf.code.Frame r1 = r8.frame
                r0.popArgs(r1, r12)
                r8.checkReturnType(r11)
                goto L355
            L2a4:
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r0 = r8.frame
                com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.INT
                r11.popArgs(r0, r12, r1)
                goto L355
            L2af:
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r0 = r8.frame
                r11.popArgs(r0, r12)
                goto L355
            L2b8:
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r0 = r8.frame
                r11.popArgs(r0, r12, r12)
                goto L355
            L2c1:
                com.android.dx.cf.code.Frame r11 = r8.frame
                com.android.dx.cf.code.ExecutionStack r11 = r11.getStack()
                boolean r1 = r12.isCategory1()
                if (r1 == 0) goto L2ce
                r0 = r3
            L2ce:
                com.android.dx.rop.type.Type r1 = r11.peekType(r0)
                boolean r11 = r11.peekLocal(r0)
                com.android.dx.rop.type.Type r0 = com.android.dx.cf.code.Simulator.access$300(r12, r1)
                if (r11 == 0) goto L2e7
                com.android.dx.rop.type.Type r11 = com.android.dx.rop.type.Type.KNOWN_NULL
                if (r0 != r11) goto L2e2
            L2e0:
                r12 = r11
                goto L2e7
            L2e2:
                com.android.dx.rop.type.Type r11 = r0.getComponentType()
                goto L2e0
            L2e7:
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r1 = r8.frame
                com.android.dx.rop.type.Type r2 = com.android.dx.rop.type.Type.INT
                r11.popArgs(r1, r0, r2, r12)
                goto L355
            L2f1:
                com.android.dx.cf.code.Frame r11 = r8.frame
                com.android.dx.cf.code.ExecutionStack r11 = r11.getStack()
                com.android.dx.rop.type.Type r11 = r11.peekType(r2)
                com.android.dx.rop.type.Type r11 = com.android.dx.cf.code.Simulator.access$300(r12, r11)
                com.android.dx.rop.type.Type r12 = com.android.dx.rop.type.Type.KNOWN_NULL
                if (r11 != r12) goto L304
                goto L308
            L304:
                com.android.dx.rop.type.Type r12 = r11.getComponentType()
            L308:
                com.android.dx.cf.code.Machine r0 = r8.machine
                com.android.dx.cf.code.Frame r1 = r8.frame
                com.android.dx.rop.type.Type r2 = com.android.dx.rop.type.Type.INT
                r0.popArgs(r1, r11, r2)
                goto L355
            L312:
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r0 = r8.frame
                com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.OBJECT
                r11.popArgs(r0, r1)
                goto L355
            L31c:
                com.android.dx.cf.code.Frame r11 = r8.frame
                com.android.dx.cf.code.ExecutionStack r11 = r11.getStack()
                com.android.dx.rop.type.Type r11 = r11.peekType(r1)
                boolean r0 = r11.isArrayOrKnownNull()
                if (r0 != 0) goto L346
                com.android.dx.cf.code.Simulator r0 = r8.this$0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "type mismatch: expected array type but encountered "
                r1.append(r2)
                java.lang.String r11 = r11.toHuman()
                r1.append(r11)
                java.lang.String r11 = r1.toString()
                com.android.dx.cf.code.Simulator.access$200(r0, r11)
            L346:
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r0 = r8.frame
                com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.OBJECT
                r11.popArgs(r0, r1)
                goto L355
            L350:
                com.android.dx.cf.code.Machine r11 = r8.machine
                r11.clearArgs()
            L355:
                com.android.dx.cf.code.Machine r11 = r8.machine
                r11.auxType(r12)
                com.android.dx.cf.code.Machine r11 = r8.machine
                com.android.dx.cf.code.Frame r12 = r8.frame
                r11.run(r12, r10, r9)
                return
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitSwitch(int r3, int r4, int r5, com.android.dx.cf.code.SwitchList r6, int r7) {
                r2 = this;
                com.android.dx.cf.code.Machine r5 = r2.machine
                com.android.dx.cf.code.Frame r0 = r2.frame
                com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.INT
                r5.popArgs(r0, r1)
                com.android.dx.cf.code.Machine r5 = r2.machine
                r5.auxIntArg(r7)
                com.android.dx.cf.code.Machine r5 = r2.machine
                r5.auxSwitchArg(r6)
                com.android.dx.cf.code.Machine r5 = r2.machine
                com.android.dx.cf.code.Frame r6 = r2.frame
                r5.run(r6, r4, r3)
                return
        }
    }

    static {
            return
    }

    public Simulator(com.android.dx.cf.code.Machine r1, com.android.dx.cf.code.ConcreteMethod r2, com.android.dx.dex.DexOptions r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L3c
            if (r2 == 0) goto L34
            if (r3 == 0) goto L2c
            r0.machine = r1
            com.android.dx.cf.code.BytecodeArray r1 = r2.getCode()
            r0.code = r1
            r0.method = r2
            com.android.dx.cf.code.LocalVariableList r1 = r2.getLocalVariables()
            r0.localVariables = r1
            com.android.dx.cf.code.Simulator$SimVisitor r1 = new com.android.dx.cf.code.Simulator$SimVisitor
            r1.<init>(r0)
            r0.visitor = r1
            r0.dexOptions = r3
            boolean r1 = r2.isDefaultOrStaticInterfaceMethod()
            if (r1 == 0) goto L2b
            r0.checkInterfaceMethodDeclaration(r2)
        L2b:
            return
        L2c:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "dexOptions == null"
            r1.<init>(r2)
            throw r1
        L34:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "method == null"
            r1.<init>(r2)
            throw r1
        L3c:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "machine == null"
            r1.<init>(r2)
            throw r1
    }

    public static /* synthetic */ com.android.dx.cf.code.Machine access$000(com.android.dx.cf.code.Simulator r0) {
            com.android.dx.cf.code.Machine r0 = r0.machine
            return r0
    }

    public static /* synthetic */ com.android.dx.cf.code.SimException access$100() {
            com.android.dx.cf.code.SimException r0 = illegalTos()
            return r0
    }

    public static /* synthetic */ void access$200(com.android.dx.cf.code.Simulator r0, java.lang.String r1) {
            r0.fail(r1)
            return
    }

    public static /* synthetic */ com.android.dx.rop.type.Type access$300(com.android.dx.rop.type.Type r0, com.android.dx.rop.type.Type r1) {
            com.android.dx.rop.type.Type r0 = requiredArrayTypeFor(r0, r1)
            return r0
    }

    public static /* synthetic */ com.android.dx.cf.code.LocalVariableList access$400(com.android.dx.cf.code.Simulator r0) {
            com.android.dx.cf.code.LocalVariableList r0 = r0.localVariables
            return r0
    }

    public static /* synthetic */ void access$500(com.android.dx.cf.code.Simulator r0, int r1, com.android.dx.rop.cst.CstMethodRef r2) {
            r0.checkInvokeInterfaceSupported(r1, r2)
            return
    }

    public static /* synthetic */ void access$600(com.android.dx.cf.code.Simulator r0, int r1) {
            r0.checkInvokeSignaturePolymorphic(r1)
            return
    }

    public static /* synthetic */ void access$700(com.android.dx.cf.code.Simulator r0, int r1) throws com.android.dx.cf.code.SimException {
            r0.checkInvokeDynamicSupported(r1)
            return
    }

    public static /* synthetic */ void access$800(com.android.dx.cf.code.Simulator r0, com.android.dx.rop.cst.Constant r1) throws com.android.dx.cf.code.SimException {
            r0.checkConstMethodHandleSupported(r1)
            return
    }

    private void checkConstMethodHandleSupported(com.android.dx.rop.cst.Constant r3) throws com.android.dx.cf.code.SimException {
            r2 = this;
            com.android.dx.dex.DexOptions r0 = r2.dexOptions
            r1 = 28
            boolean r0 = r0.apiIsSupported(r1)
            if (r0 != 0) goto L27
            java.lang.String r3 = r3.typeName()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            com.android.dx.dex.DexOptions r1 = r2.dexOptions
            int r1 = r1.minSdkVersion
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0, r1}
            java.lang.String r0 = "invalid constant type %s requires --min-sdk-version >= %d (currently %d)"
            java.lang.String r3 = java.lang.String.format(r0, r3)
            r2.fail(r3)
        L27:
            return
    }

    private void checkInterfaceMethodDeclaration(com.android.dx.cf.code.ConcreteMethod r5) {
            r4 = this;
            com.android.dx.dex.DexOptions r0 = r4.dexOptions
            r1 = 24
            boolean r0 = r0.apiIsSupported(r1)
            if (r0 != 0) goto L3e
            boolean r0 = r5.isStaticMethod()
            if (r0 == 0) goto L13
            java.lang.String r0 = "static"
            goto L15
        L13:
            java.lang.String r0 = "default"
        L15:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.android.dx.dex.DexOptions r2 = r4.dexOptions
            int r2 = r2.minSdkVersion
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.android.dx.rop.cst.CstType r3 = r5.getDefiningClass()
            java.lang.String r3 = r3.toHuman()
            com.android.dx.rop.cst.CstNat r5 = r5.getNat()
            java.lang.String r5 = r5.toHuman()
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r1, r2, r3, r5}
            java.lang.String r0 = "defining a %s interface method requires --min-sdk-version >= %d (currently %d) for interface methods: %s.%s"
            java.lang.String r5 = java.lang.String.format(r0, r5)
            r4.warn(r5)
        L3e:
            return
    }

    private void checkInvokeDynamicSupported(int r3) throws com.android.dx.cf.code.SimException {
            r2 = this;
            com.android.dx.dex.DexOptions r0 = r2.dexOptions
            r1 = 26
            boolean r0 = r0.apiIsSupported(r1)
            if (r0 != 0) goto L27
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            com.android.dx.dex.DexOptions r1 = r2.dexOptions
            int r1 = r1.minSdkVersion
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0, r1}
            java.lang.String r0 = "invalid opcode %02x - invokedynamic requires --min-sdk-version >= %d (currently %d)"
            java.lang.String r3 = java.lang.String.format(r0, r3)
            r2.fail(r3)
        L27:
            return
    }

    private void checkInvokeInterfaceSupported(int r6, com.android.dx.rop.cst.CstMethodRef r7) {
            r5 = this;
            r0 = 185(0xb9, float:2.59E-43)
            if (r6 != r0) goto L5
            return
        L5:
            com.android.dx.dex.DexOptions r0 = r5.dexOptions
            r1 = 24
            boolean r0 = r0.apiIsSupported(r1)
            if (r0 == 0) goto L10
            return
        L10:
            com.android.dx.dex.DexOptions r0 = r5.dexOptions
            boolean r2 = r0.allowAllInterfaceMethodInvokes
            r3 = 184(0xb8, float:2.58E-43)
            if (r6 != r3) goto L1f
            r4 = 21
            boolean r0 = r0.apiIsSupported(r4)
            r2 = r2 & r0
        L1f:
            if (r6 != r3) goto L24
            java.lang.String r6 = "static"
            goto L26
        L24:
            java.lang.String r6 = "default"
        L26:
            if (r2 == 0) goto L52
            com.android.dx.rop.cst.CstType r0 = r7.getDefiningClass()
            java.lang.String r0 = r0.toHuman()
            com.android.dx.rop.cst.CstNat r7 = r7.getNat()
            java.lang.String r7 = r7.toHuman()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.android.dx.dex.DexOptions r2 = r5.dexOptions
            int r2 = r2.minSdkVersion
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r0, r7, r1, r2}
            java.lang.String r7 = "invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (experimental at current API level %d)"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            r5.warn(r6)
            goto L7b
        L52:
            com.android.dx.rop.cst.CstType r0 = r7.getDefiningClass()
            java.lang.String r0 = r0.toHuman()
            com.android.dx.rop.cst.CstNat r7 = r7.getNat()
            java.lang.String r7 = r7.toHuman()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.android.dx.dex.DexOptions r2 = r5.dexOptions
            int r2 = r2.minSdkVersion
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r0, r7, r1, r2}
            java.lang.String r7 = "invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (blocked at current API level %d)"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            r5.fail(r6)
        L7b:
            return
    }

    private void checkInvokeSignaturePolymorphic(int r3) {
            r2 = this;
            com.android.dx.dex.DexOptions r0 = r2.dexOptions
            r1 = 26
            boolean r0 = r0.apiIsSupported(r1)
            if (r0 != 0) goto L24
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            com.android.dx.dex.DexOptions r0 = r2.dexOptions
            int r0 = r0.minSdkVersion
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0}
            java.lang.String r0 = "invoking a signature-polymorphic requires --min-sdk-version >= %d (currently %d)"
            java.lang.String r3 = java.lang.String.format(r0, r3)
            r2.fail(r3)
            goto L45
        L24:
            r0 = 182(0xb6, float:2.55E-43)
            if (r3 == r0) goto L45
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported signature polymorphic invocation ("
            r0.append(r1)
            java.lang.String r3 = com.android.dx.cf.code.ByteOps.opName(r3)
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.fail(r3)
        L45:
            return
    }

    private void fail(java.lang.String r3) {
            r2 = this;
            com.android.dx.cf.code.ConcreteMethod r0 = r2.method
            com.android.dx.rop.cst.CstType r0 = r0.getDefiningClass()
            java.lang.String r0 = r0.toHuman()
            com.android.dx.cf.code.ConcreteMethod r1 = r2.method
            com.android.dx.rop.cst.CstNat r1 = r1.getNat()
            java.lang.String r1 = r1.toHuman()
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r1, r3}
            java.lang.String r0 = "ERROR in %s.%s: %s"
            java.lang.String r3 = java.lang.String.format(r0, r3)
            com.android.dx.cf.code.SimException r0 = new com.android.dx.cf.code.SimException
            r0.<init>(r3)
            throw r0
    }

    private static com.android.dx.cf.code.SimException illegalTos() {
            com.android.dx.cf.code.SimException r0 = new com.android.dx.cf.code.SimException
            java.lang.String r1 = "stack mismatch: illegal top-of-stack for opcode"
            r0.<init>(r1)
            return r0
    }

    private static com.android.dx.rop.type.Type requiredArrayTypeFor(com.android.dx.rop.type.Type r1, com.android.dx.rop.type.Type r2) {
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.KNOWN_NULL
            if (r2 != r0) goto L10
            boolean r2 = r1.isReference()
            if (r2 == 0) goto Lb
            goto Lf
        Lb:
            com.android.dx.rop.type.Type r0 = r1.getArrayType()
        Lf:
            return r0
        L10:
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.OBJECT
            if (r1 != r0) goto L25
            boolean r0 = r2.isArray()
            if (r0 == 0) goto L25
            com.android.dx.rop.type.Type r0 = r2.getComponentType()
            boolean r0 = r0.isReference()
            if (r0 == 0) goto L25
            return r2
        L25:
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.BYTE
            if (r1 != r0) goto L2e
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.BOOLEAN_ARRAY
            if (r2 != r0) goto L2e
            return r0
        L2e:
            com.android.dx.rop.type.Type r1 = r1.getArrayType()
            return r1
    }

    private void warn(java.lang.String r3) {
            r2 = this;
            com.android.dx.cf.code.ConcreteMethod r0 = r2.method
            com.android.dx.rop.cst.CstType r0 = r0.getDefiningClass()
            java.lang.String r0 = r0.toHuman()
            com.android.dx.cf.code.ConcreteMethod r1 = r2.method
            com.android.dx.rop.cst.CstNat r1 = r1.getNat()
            java.lang.String r1 = r1.toHuman()
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r1, r3}
            java.lang.String r0 = "WARNING in %s.%s: %s"
            java.lang.String r3 = java.lang.String.format(r0, r3)
            com.android.dx.dex.DexOptions r0 = r2.dexOptions
            java.io.PrintStream r0 = r0.err
            r0.println(r3)
            return
    }

    public int simulate(int r2, com.android.dx.cf.code.Frame r3) {
            r1 = this;
            com.android.dx.cf.code.Simulator$SimVisitor r0 = r1.visitor
            r0.setFrame(r3)
            com.android.dx.cf.code.BytecodeArray r3 = r1.code
            com.android.dx.cf.code.Simulator$SimVisitor r0 = r1.visitor
            int r2 = r3.parseInstruction(r2, r0)
            return r2
    }

    public void simulate(com.android.dx.cf.code.ByteBlock r4, com.android.dx.cf.code.Frame r5) {
            r3 = this;
            int r0 = r4.getEnd()
            com.android.dx.cf.code.Simulator$SimVisitor r1 = r3.visitor
            r1.setFrame(r5)
            int r4 = r4.getStart()     // Catch: com.android.dx.cf.code.SimException -> L1e
        Ld:
            if (r4 >= r0) goto L20
            com.android.dx.cf.code.BytecodeArray r1 = r3.code     // Catch: com.android.dx.cf.code.SimException -> L1e
            com.android.dx.cf.code.Simulator$SimVisitor r2 = r3.visitor     // Catch: com.android.dx.cf.code.SimException -> L1e
            int r1 = r1.parseInstruction(r4, r2)     // Catch: com.android.dx.cf.code.SimException -> L1e
            com.android.dx.cf.code.Simulator$SimVisitor r2 = r3.visitor     // Catch: com.android.dx.cf.code.SimException -> L1e
            r2.setPreviousOffset(r4)     // Catch: com.android.dx.cf.code.SimException -> L1e
            int r4 = r4 + r1
            goto Ld
        L1e:
            r4 = move-exception
            goto L21
        L20:
            return
        L21:
            r5.annotate(r4)
            throw r4
    }
}
