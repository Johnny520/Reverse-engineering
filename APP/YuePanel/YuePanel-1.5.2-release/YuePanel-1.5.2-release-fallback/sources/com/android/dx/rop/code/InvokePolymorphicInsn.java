package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public class InvokePolymorphicInsn extends com.android.dx.rop.code.Insn {
    private static final com.android.dx.rop.cst.CstString DEFAULT_DESCRIPTOR = null;
    private static final com.android.dx.rop.cst.CstString VARHANDLE_COMPARE_AND_SET_DESCRIPTOR = null;
    private static final com.android.dx.rop.cst.CstString VARHANDLE_SET_DESCRIPTOR = null;
    private final com.android.dx.rop.cst.CstMethodRef callSiteMethod;
    private final com.android.dx.rop.cst.CstProtoRef callSiteProto;
    private final com.android.dx.rop.type.TypeList catches;
    private final com.android.dx.rop.cst.CstMethodRef polymorphicMethod;

    static {
            com.android.dx.rop.cst.CstString r0 = new com.android.dx.rop.cst.CstString
            java.lang.String r1 = "([Ljava/lang/Object;)Ljava/lang/Object;"
            r0.<init>(r1)
            com.android.dx.rop.code.InvokePolymorphicInsn.DEFAULT_DESCRIPTOR = r0
            com.android.dx.rop.cst.CstString r0 = new com.android.dx.rop.cst.CstString
            java.lang.String r1 = "([Ljava/lang/Object;)V"
            r0.<init>(r1)
            com.android.dx.rop.code.InvokePolymorphicInsn.VARHANDLE_SET_DESCRIPTOR = r0
            com.android.dx.rop.cst.CstString r0 = new com.android.dx.rop.cst.CstString
            java.lang.String r1 = "([Ljava/lang/Object;)Z"
            r0.<init>(r1)
            com.android.dx.rop.code.InvokePolymorphicInsn.VARHANDLE_COMPARE_AND_SET_DESCRIPTOR = r0
            return
    }

    public InvokePolymorphicInsn(com.android.dx.rop.code.Rop r2, com.android.dx.rop.code.SourcePosition r3, com.android.dx.rop.code.RegisterSpecList r4, com.android.dx.rop.type.TypeList r5, com.android.dx.rop.cst.CstMethodRef r6) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            int r3 = r2.getBranchingness()
            r4 = 6
            if (r3 != r4) goto L3e
            if (r5 == 0) goto L36
            r1.catches = r5
            if (r6 == 0) goto L2e
            boolean r2 = r6.isSignaturePolymorphic()
            if (r2 == 0) goto L26
            r1.callSiteMethod = r6
            com.android.dx.rop.cst.CstMethodRef r2 = makePolymorphicMethod(r6)
            r1.polymorphicMethod = r2
            com.android.dx.rop.cst.CstProtoRef r2 = makeCallSiteProto(r6)
            r1.callSiteProto = r2
            return
        L26:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "callSiteMethod is not signature polymorphic"
            r2.<init>(r3)
            throw r2
        L2e:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "callSiteMethod == null"
            r2.<init>(r3)
            throw r2
        L36:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "catches == null"
            r2.<init>(r3)
            throw r2
        L3e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "opcode with invalid branchingness: "
            r4.append(r5)
            int r2 = r2.getBranchingness()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
    }

    private static com.android.dx.rop.cst.CstProtoRef makeCallSiteProto(com.android.dx.rop.cst.CstMethodRef r2) {
            com.android.dx.rop.cst.CstProtoRef r0 = new com.android.dx.rop.cst.CstProtoRef
            r1 = 1
            com.android.dx.rop.type.Prototype r2 = r2.getPrototype(r1)
            r0.<init>(r2)
            return r0
    }

    private static com.android.dx.rop.cst.CstMethodRef makePolymorphicMethod(com.android.dx.rop.cst.CstMethodRef r5) {
            com.android.dx.rop.cst.CstType r0 = r5.getDefiningClass()
            com.android.dx.rop.cst.CstNat r1 = r5.getNat()
            com.android.dx.rop.cst.CstString r1 = r1.getName()
            com.android.dx.rop.cst.CstNat r2 = r5.getNat()
            com.android.dx.rop.cst.CstString r2 = r2.getName()
            java.lang.String r2 = r2.getString()
            com.android.dx.rop.cst.CstType r3 = com.android.dx.rop.cst.CstType.METHOD_HANDLE
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L3d
            java.lang.String r3 = "invoke"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L30
            java.lang.String r3 = "invokeExact"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L3d
        L30:
            com.android.dx.rop.cst.CstNat r5 = new com.android.dx.rop.cst.CstNat
            com.android.dx.rop.cst.CstString r2 = com.android.dx.rop.code.InvokePolymorphicInsn.DEFAULT_DESCRIPTOR
            r5.<init>(r1, r2)
            com.android.dx.rop.cst.CstMethodRef r1 = new com.android.dx.rop.cst.CstMethodRef
            r1.<init>(r0, r5)
            return r1
        L3d:
            com.android.dx.rop.cst.CstType r3 = com.android.dx.rop.cst.CstType.VAR_HANDLE
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L216
            r2.hashCode()
            r3 = -1
            int r4 = r2.hashCode()
            switch(r4) {
                case -1946504908: goto L1e1;
                case -1686727776: goto L1d6;
                case -1671098288: goto L1cb;
                case -1292078254: goto L1c0;
                case -1117944904: goto L1b5;
                case -1103072857: goto L1aa;
                case -1032914329: goto L19f;
                case -1032892181: goto L194;
                case -794517348: goto L186;
                case -567150350: goto L178;
                case -240822786: goto L16a;
                case -230706875: goto L15c;
                case -127361888: goto L14e;
                case -37641530: goto L140;
                case 102230: goto L132;
                case 113762: goto L124;
                case 93645315: goto L116;
                case 101293086: goto L108;
                case 189872914: goto Lfa;
                case 282707520: goto Lec;
                case 282724865: goto Lde;
                case 353422447: goto Ld0;
                case 470702883: goto Lc2;
                case 685319959: goto Lb4;
                case 748071969: goto La6;
                case 937077366: goto L98;
                case 1245632875: goto L8a;
                case 1352153939: goto L7c;
                case 1483964149: goto L6e;
                case 2002508693: goto L60;
                case 2013994287: goto L52;
                default: goto L50;
            }
        L50:
            goto L1eb
        L52:
            java.lang.String r4 = "weakCompareAndSetRelease"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L5c
            goto L1eb
        L5c:
            r3 = 30
            goto L1eb
        L60:
            java.lang.String r4 = "getAndSetAcquire"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L6a
            goto L1eb
        L6a:
            r3 = 29
            goto L1eb
        L6e:
            java.lang.String r4 = "compareAndExchange"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L78
            goto L1eb
        L78:
            r3 = 28
            goto L1eb
        L7c:
            java.lang.String r4 = "getAndBitwiseOr"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L86
            goto L1eb
        L86:
            r3 = 27
            goto L1eb
        L8a:
            java.lang.String r4 = "getAndBitwiseXorAcquire"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L94
            goto L1eb
        L94:
            r3 = 26
            goto L1eb
        L98:
            java.lang.String r4 = "getAndAddAcquire"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto La2
            goto L1eb
        La2:
            r3 = 25
            goto L1eb
        La6:
            java.lang.String r4 = "compareAndExchangeAcquire"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto Lb0
            goto L1eb
        Lb0:
            r3 = 24
            goto L1eb
        Lb4:
            java.lang.String r4 = "getOpaque"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto Lbe
            goto L1eb
        Lbe:
            r3 = 23
            goto L1eb
        Lc2:
            java.lang.String r4 = "setOpaque"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto Lcc
            goto L1eb
        Lcc:
            r3 = 22
            goto L1eb
        Ld0:
            java.lang.String r4 = "getAndBitwiseAndAcquire"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto Lda
            goto L1eb
        Lda:
            r3 = 21
            goto L1eb
        Lde:
            java.lang.String r4 = "getAndSet"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto Le8
            goto L1eb
        Le8:
            r3 = 20
            goto L1eb
        Lec:
            java.lang.String r4 = "getAndAdd"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto Lf6
            goto L1eb
        Lf6:
            r3 = 19
            goto L1eb
        Lfa:
            java.lang.String r4 = "getVolatile"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L104
            goto L1eb
        L104:
            r3 = 18
            goto L1eb
        L108:
            java.lang.String r4 = "setVolatile"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L112
            goto L1eb
        L112:
            r3 = 17
            goto L1eb
        L116:
            java.lang.String r4 = "getAndBitwiseOrAcquire"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L120
            goto L1eb
        L120:
            r3 = 16
            goto L1eb
        L124:
            java.lang.String r4 = "set"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L12e
            goto L1eb
        L12e:
            r3 = 15
            goto L1eb
        L132:
            java.lang.String r4 = "get"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L13c
            goto L1eb
        L13c:
            r3 = 14
            goto L1eb
        L140:
            java.lang.String r4 = "getAndSetRelease"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L14a
            goto L1eb
        L14a:
            r3 = 13
            goto L1eb
        L14e:
            java.lang.String r4 = "getAcquire"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L158
            goto L1eb
        L158:
            r3 = 12
            goto L1eb
        L15c:
            java.lang.String r4 = "setRelease"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L166
            goto L1eb
        L166:
            r3 = 11
            goto L1eb
        L16a:
            java.lang.String r4 = "weakCompareAndSetAcquire"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L174
            goto L1eb
        L174:
            r3 = 10
            goto L1eb
        L178:
            java.lang.String r4 = "weakCompareAndSetPlain"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L182
            goto L1eb
        L182:
            r3 = 9
            goto L1eb
        L186:
            java.lang.String r4 = "getAndBitwiseXorRelease"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L190
            goto L1eb
        L190:
            r3 = 8
            goto L1eb
        L194:
            java.lang.String r4 = "getAndBitwiseXor"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L19d
            goto L1eb
        L19d:
            r3 = 7
            goto L1eb
        L19f:
            java.lang.String r4 = "getAndBitwiseAnd"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L1a8
            goto L1eb
        L1a8:
            r3 = 6
            goto L1eb
        L1aa:
            java.lang.String r4 = "getAndAddRelease"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L1b3
            goto L1eb
        L1b3:
            r3 = 5
            goto L1eb
        L1b5:
            java.lang.String r4 = "weakCompareAndSet"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L1be
            goto L1eb
        L1be:
            r3 = 4
            goto L1eb
        L1c0:
            java.lang.String r4 = "compareAndExchangeRelease"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L1c9
            goto L1eb
        L1c9:
            r3 = 3
            goto L1eb
        L1cb:
            java.lang.String r4 = "compareAndSet"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L1d4
            goto L1eb
        L1d4:
            r3 = 2
            goto L1eb
        L1d6:
            java.lang.String r4 = "getAndBitwiseAndRelease"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L1df
            goto L1eb
        L1df:
            r3 = 1
            goto L1eb
        L1e1:
            java.lang.String r4 = "getAndBitwiseOrRelease"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L1ea
            goto L1eb
        L1ea:
            r3 = 0
        L1eb:
            switch(r3) {
                case 0: goto L209;
                case 1: goto L209;
                case 2: goto L1fc;
                case 3: goto L209;
                case 4: goto L1fc;
                case 5: goto L209;
                case 6: goto L209;
                case 7: goto L209;
                case 8: goto L209;
                case 9: goto L1fc;
                case 10: goto L1fc;
                case 11: goto L1ef;
                case 12: goto L209;
                case 13: goto L209;
                case 14: goto L209;
                case 15: goto L1ef;
                case 16: goto L209;
                case 17: goto L1ef;
                case 18: goto L209;
                case 19: goto L209;
                case 20: goto L209;
                case 21: goto L209;
                case 22: goto L1ef;
                case 23: goto L209;
                case 24: goto L209;
                case 25: goto L209;
                case 26: goto L209;
                case 27: goto L209;
                case 28: goto L209;
                case 29: goto L209;
                case 30: goto L1fc;
                default: goto L1ee;
            }
        L1ee:
            goto L216
        L1ef:
            com.android.dx.rop.cst.CstNat r5 = new com.android.dx.rop.cst.CstNat
            com.android.dx.rop.cst.CstString r2 = com.android.dx.rop.code.InvokePolymorphicInsn.VARHANDLE_SET_DESCRIPTOR
            r5.<init>(r1, r2)
            com.android.dx.rop.cst.CstMethodRef r1 = new com.android.dx.rop.cst.CstMethodRef
            r1.<init>(r0, r5)
            return r1
        L1fc:
            com.android.dx.rop.cst.CstNat r5 = new com.android.dx.rop.cst.CstNat
            com.android.dx.rop.cst.CstString r2 = com.android.dx.rop.code.InvokePolymorphicInsn.VARHANDLE_COMPARE_AND_SET_DESCRIPTOR
            r5.<init>(r1, r2)
            com.android.dx.rop.cst.CstMethodRef r1 = new com.android.dx.rop.cst.CstMethodRef
            r1.<init>(r0, r5)
            return r1
        L209:
            com.android.dx.rop.cst.CstNat r5 = new com.android.dx.rop.cst.CstNat
            com.android.dx.rop.cst.CstString r2 = com.android.dx.rop.code.InvokePolymorphicInsn.DEFAULT_DESCRIPTOR
            r5.<init>(r1, r2)
            com.android.dx.rop.cst.CstMethodRef r1 = new com.android.dx.rop.cst.CstMethodRef
            r1.<init>(r0, r5)
            return r1
        L216:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown signature polymorphic method: "
            r1.append(r2)
            java.lang.String r5 = r5.toHuman()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    @Override // com.android.dx.rop.code.Insn
    public void accept(com.android.dx.rop.code.Insn.Visitor r1) {
            r0 = this;
            r1.visitInvokePolymorphicInsn(r0)
            return
    }

    public com.android.dx.rop.cst.CstMethodRef getCallSiteMethod() {
            r1 = this;
            com.android.dx.rop.cst.CstMethodRef r0 = r1.callSiteMethod
            return r0
    }

    public com.android.dx.rop.cst.CstProtoRef getCallSiteProto() {
            r1 = this;
            com.android.dx.rop.cst.CstProtoRef r0 = r1.callSiteProto
            return r0
    }

    @Override // com.android.dx.rop.code.Insn
    public com.android.dx.rop.type.TypeList getCatches() {
            r1 = this;
            com.android.dx.rop.type.TypeList r0 = r1.catches
            return r0
    }

    @Override // com.android.dx.rop.code.Insn
    public java.lang.String getInlineString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.android.dx.rop.cst.CstMethodRef r1 = r3.getPolymorphicMethod()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            com.android.dx.rop.cst.CstProtoRef r2 = r3.getCallSiteProto()
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            r0.append(r1)
            com.android.dx.rop.type.TypeList r1 = r3.catches
            java.lang.String r1 = com.android.dx.rop.code.ThrowingInsn.toCatchString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public com.android.dx.rop.cst.CstMethodRef getPolymorphicMethod() {
            r1 = this;
            com.android.dx.rop.cst.CstMethodRef r0 = r1.polymorphicMethod
            return r0
    }

    @Override // com.android.dx.rop.code.Insn
    public com.android.dx.rop.code.Insn withAddedCatch(com.android.dx.rop.type.Type r8) {
            r7 = this;
            com.android.dx.rop.code.InvokePolymorphicInsn r6 = new com.android.dx.rop.code.InvokePolymorphicInsn
            com.android.dx.rop.code.Rop r1 = r7.getOpcode()
            com.android.dx.rop.code.SourcePosition r2 = r7.getPosition()
            com.android.dx.rop.code.RegisterSpecList r3 = r7.getSources()
            com.android.dx.rop.type.TypeList r0 = r7.catches
            com.android.dx.rop.type.TypeList r4 = r0.withAddedType(r8)
            com.android.dx.rop.cst.CstMethodRef r5 = r7.getCallSiteMethod()
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // com.android.dx.rop.code.Insn
    public com.android.dx.rop.code.Insn withNewRegisters(com.android.dx.rop.code.RegisterSpec r7, com.android.dx.rop.code.RegisterSpecList r8) {
            r6 = this;
            com.android.dx.rop.code.InvokePolymorphicInsn r7 = new com.android.dx.rop.code.InvokePolymorphicInsn
            com.android.dx.rop.code.Rop r1 = r6.getOpcode()
            com.android.dx.rop.code.SourcePosition r2 = r6.getPosition()
            com.android.dx.rop.type.TypeList r4 = r6.catches
            com.android.dx.rop.cst.CstMethodRef r5 = r6.getCallSiteMethod()
            r0 = r7
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // com.android.dx.rop.code.Insn
    public com.android.dx.rop.code.Insn withRegisterOffset(int r8) {
            r7 = this;
            com.android.dx.rop.code.InvokePolymorphicInsn r6 = new com.android.dx.rop.code.InvokePolymorphicInsn
            com.android.dx.rop.code.Rop r1 = r7.getOpcode()
            com.android.dx.rop.code.SourcePosition r2 = r7.getPosition()
            com.android.dx.rop.code.RegisterSpecList r0 = r7.getSources()
            com.android.dx.rop.code.RegisterSpecList r3 = r0.withOffset(r8)
            com.android.dx.rop.type.TypeList r4 = r7.catches
            com.android.dx.rop.cst.CstMethodRef r5 = r7.getCallSiteMethod()
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }
}
