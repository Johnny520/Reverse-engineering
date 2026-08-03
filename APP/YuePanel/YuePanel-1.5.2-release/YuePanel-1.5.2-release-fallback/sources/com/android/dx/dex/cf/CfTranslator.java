package com.android.dx.dex.cf;

/* JADX INFO: loaded from: classes.dex */
public class CfTranslator {
    private static final boolean DEBUG = false;


    private CfTranslator() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.android.dx.rop.cst.TypedConstant coerceConstant(com.android.dx.rop.cst.TypedConstant r3, com.android.dx.rop.type.Type r4) {
            com.android.dx.rop.type.Type r0 = r3.getType()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto Lb
            return r3
        Lb:
            int r0 = r4.getBasicType()
            r1 = 1
            if (r0 == r1) goto L5c
            r1 = 2
            if (r0 == r1) goto L51
            r1 = 3
            if (r0 == r1) goto L46
            r1 = 8
            if (r0 != r1) goto L27
            com.android.dx.rop.cst.CstInteger r3 = (com.android.dx.rop.cst.CstInteger) r3
            int r3 = r3.getValue()
            com.android.dx.rop.cst.CstShort r3 = com.android.dx.rop.cst.CstShort.make(r3)
            return r3
        L27:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "can't coerce "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " to "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L46:
            com.android.dx.rop.cst.CstInteger r3 = (com.android.dx.rop.cst.CstInteger) r3
            int r3 = r3.getValue()
            com.android.dx.rop.cst.CstChar r3 = com.android.dx.rop.cst.CstChar.make(r3)
            return r3
        L51:
            com.android.dx.rop.cst.CstInteger r3 = (com.android.dx.rop.cst.CstInteger) r3
            int r3 = r3.getValue()
            com.android.dx.rop.cst.CstByte r3 = com.android.dx.rop.cst.CstByte.make(r3)
            return r3
        L5c:
            com.android.dx.rop.cst.CstInteger r3 = (com.android.dx.rop.cst.CstInteger) r3
            int r3 = r3.getValue()
            com.android.dx.rop.cst.CstBoolean r3 = com.android.dx.rop.cst.CstBoolean.make(r3)
            return r3
    }

    private static void processFields(com.android.dx.cf.direct.DirectClassFile r8, com.android.dx.dex.file.ClassDefItem r9, com.android.dx.dex.file.DexFile r10) {
            com.android.dx.rop.cst.CstType r0 = r8.getThisClass()
            com.android.dx.cf.iface.FieldList r8 = r8.getFields()
            int r1 = r8.size()
            r2 = 0
        Ld:
            if (r2 >= r1) goto L91
            com.android.dx.cf.iface.Field r3 = r8.get(r2)
            com.android.dx.rop.cst.CstFieldRef r4 = new com.android.dx.rop.cst.CstFieldRef     // Catch: java.lang.RuntimeException -> L3a
            com.android.dx.rop.cst.CstNat r5 = r3.getNat()     // Catch: java.lang.RuntimeException -> L3a
            r4.<init>(r0, r5)     // Catch: java.lang.RuntimeException -> L3a
            int r5 = r3.getAccessFlags()     // Catch: java.lang.RuntimeException -> L3a
            boolean r6 = com.android.dx.rop.code.AccessFlags.isStatic(r5)     // Catch: java.lang.RuntimeException -> L3a
            if (r6 == 0) goto L40
            com.android.dx.rop.cst.TypedConstant r6 = r3.getConstantValue()     // Catch: java.lang.RuntimeException -> L3a
            com.android.dx.dex.file.EncodedField r7 = new com.android.dx.dex.file.EncodedField     // Catch: java.lang.RuntimeException -> L3a
            r7.<init>(r4, r5)     // Catch: java.lang.RuntimeException -> L3a
            if (r6 == 0) goto L3c
            com.android.dx.rop.type.Type r5 = r4.getType()     // Catch: java.lang.RuntimeException -> L3a
            com.android.dx.rop.cst.TypedConstant r6 = coerceConstant(r6, r5)     // Catch: java.lang.RuntimeException -> L3a
            goto L3c
        L3a:
            r8 = move-exception
            goto L63
        L3c:
            r9.addStaticField(r7, r6)     // Catch: java.lang.RuntimeException -> L3a
            goto L48
        L40:
            com.android.dx.dex.file.EncodedField r6 = new com.android.dx.dex.file.EncodedField     // Catch: java.lang.RuntimeException -> L3a
            r6.<init>(r4, r5)     // Catch: java.lang.RuntimeException -> L3a
            r9.addInstanceField(r6)     // Catch: java.lang.RuntimeException -> L3a
        L48:
            com.android.dx.cf.iface.AttributeList r5 = r3.getAttributes()     // Catch: java.lang.RuntimeException -> L3a
            com.android.dx.rop.annotation.Annotations r5 = com.android.dx.dex.cf.AttributeTranslator.getAnnotations(r5)     // Catch: java.lang.RuntimeException -> L3a
            int r6 = r5.size()     // Catch: java.lang.RuntimeException -> L3a
            if (r6 == 0) goto L59
            r9.addFieldAnnotations(r4, r5, r10)     // Catch: java.lang.RuntimeException -> L3a
        L59:
            com.android.dx.dex.file.FieldIdsSection r5 = r10.getFieldIds()     // Catch: java.lang.RuntimeException -> L3a
            r5.intern(r4)     // Catch: java.lang.RuntimeException -> L3a
            int r2 = r2 + 1
            goto Ld
        L63:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "...while processing "
            r9.append(r10)
            com.android.dx.rop.cst.CstString r10 = r3.getName()
            java.lang.String r10 = r10.toHuman()
            r9.append(r10)
            java.lang.String r10 = " "
            r9.append(r10)
            com.android.dx.rop.cst.CstString r10 = r3.getDescriptor()
            java.lang.String r10 = r10.toHuman()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.android.dex.util.ExceptionWithContext r8 = com.android.dex.util.ExceptionWithContext.withContext(r8, r9)
            throw r8
        L91:
            return
    }

    private static void processMethods(com.android.dx.command.dexer.DxContext r28, com.android.dx.cf.direct.DirectClassFile r29, com.android.dx.dex.cf.CfOptions r30, com.android.dx.dex.DexOptions r31, com.android.dx.dex.file.ClassDefItem r32, com.android.dx.dex.file.DexFile r33) {
            r0 = r28
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            com.android.dx.rop.cst.CstType r13 = r29.getThisClass()
            com.android.dx.cf.iface.MethodList r14 = r29.getMethods()
            int r15 = r14.size()
            r16 = 0
            r8 = r16
        L1a:
            if (r8 >= r15) goto L19b
            com.android.dx.cf.iface.Method r7 = r14.get(r8)
            com.android.dx.rop.cst.CstMethodRef r6 = new com.android.dx.rop.cst.CstMethodRef     // Catch: java.lang.RuntimeException -> L4e
            com.android.dx.rop.cst.CstNat r1 = r7.getNat()     // Catch: java.lang.RuntimeException -> L4e
            r6.<init>(r13, r1)     // Catch: java.lang.RuntimeException -> L4e
            int r17 = r7.getAccessFlags()     // Catch: java.lang.RuntimeException -> L4e
            boolean r5 = com.android.dx.rop.code.AccessFlags.isStatic(r17)     // Catch: java.lang.RuntimeException -> L4e
            boolean r18 = com.android.dx.rop.code.AccessFlags.isPrivate(r17)     // Catch: java.lang.RuntimeException -> L4e
            boolean r19 = com.android.dx.rop.code.AccessFlags.isNative(r17)     // Catch: java.lang.RuntimeException -> L4e
            boolean r1 = com.android.dx.rop.code.AccessFlags.isAbstract(r17)     // Catch: java.lang.RuntimeException -> L4e
            boolean r2 = r6.isInstanceInit()     // Catch: java.lang.RuntimeException -> L4e
            r3 = 1
            if (r2 != 0) goto L53
            boolean r2 = r6.isClassInit()     // Catch: java.lang.RuntimeException -> L4e
            if (r2 == 0) goto L4b
            goto L53
        L4b:
            r20 = r16
            goto L55
        L4e:
            r0 = move-exception
            r25 = r7
            goto L16d
        L53:
            r20 = r3
        L55:
            if (r19 != 0) goto L59
            if (r1 == 0) goto L66
        L59:
            r27 = r5
            r0 = r6
            r25 = r7
            r22 = r8
            r21 = r15
            r15 = r29
            goto L10c
        L66:
            com.android.dx.cf.code.ConcreteMethod r1 = new com.android.dx.cf.code.ConcreteMethod     // Catch: java.lang.RuntimeException -> L4e
            int r4 = r9.positionInfo     // Catch: java.lang.RuntimeException -> L4e
            if (r4 == r3) goto L6d
            goto L6f
        L6d:
            r3 = r16
        L6f:
            boolean r4 = r9.localInfo     // Catch: java.lang.RuntimeException -> L4e
            r21 = r15
            r15 = r29
            r1.<init>(r7, r15, r3, r4)     // Catch: java.lang.RuntimeException -> L4e
            com.android.dx.rop.code.DexTranslationAdvice r3 = com.android.dx.rop.code.DexTranslationAdvice.THE_ONE     // Catch: java.lang.RuntimeException -> L4e
            com.android.dx.rop.code.RopMethod r4 = com.android.dx.cf.code.Ropper.convert(r1, r3, r14, r10)     // Catch: java.lang.RuntimeException -> L4e
            r22 = r8
            int r8 = r6.getParameterWordCount(r5)     // Catch: java.lang.RuntimeException -> L4e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L4e
            r2.<init>()     // Catch: java.lang.RuntimeException -> L4e
            com.android.dx.rop.type.Type r24 = r13.getClassType()     // Catch: java.lang.RuntimeException -> L4e
            r25 = r6
            java.lang.String r6 = r24.getDescriptor()     // Catch: java.lang.RuntimeException -> L4e
            r2.append(r6)     // Catch: java.lang.RuntimeException -> L4e
            java.lang.String r6 = "."
            r2.append(r6)     // Catch: java.lang.RuntimeException -> L4e
            com.android.dx.rop.cst.CstString r6 = r7.getName()     // Catch: java.lang.RuntimeException -> L4e
            java.lang.String r6 = r6.getString()     // Catch: java.lang.RuntimeException -> L4e
            r2.append(r6)     // Catch: java.lang.RuntimeException -> L4e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.RuntimeException -> L4e
            boolean r6 = r9.optimize     // Catch: java.lang.RuntimeException -> L4e
            if (r6 == 0) goto Lc8
            com.android.dx.dex.cf.OptimizerOptions r6 = r0.optimizerOptions     // Catch: java.lang.RuntimeException -> L4e
            boolean r2 = r6.shouldOptimize(r2)     // Catch: java.lang.RuntimeException -> L4e
            if (r2 == 0) goto Lc8
            boolean r2 = r9.localInfo     // Catch: java.lang.RuntimeException -> L4e
            com.android.dx.rop.code.RopMethod r2 = com.android.dx.ssa.Optimizer.optimize(r4, r8, r5, r2, r3)     // Catch: java.lang.RuntimeException -> L4e
            boolean r3 = r9.statistics     // Catch: java.lang.RuntimeException -> L4e
            if (r3 == 0) goto Lc5
            com.android.dx.dex.cf.CodeStatistics r3 = r0.codeStatistics     // Catch: java.lang.RuntimeException -> L4e
            r3.updateRopStatistics(r4, r2)     // Catch: java.lang.RuntimeException -> L4e
        Lc5:
            r6 = r4
            r4 = r2
            goto Lc9
        Lc8:
            r6 = 0
        Lc9:
            boolean r2 = r9.localInfo     // Catch: java.lang.RuntimeException -> L4e
            if (r2 == 0) goto Ld3
            com.android.dx.rop.code.LocalVariableInfo r2 = com.android.dx.rop.code.LocalVariableExtractor.extract(r4)     // Catch: java.lang.RuntimeException -> L4e
            r3 = r2
            goto Ld4
        Ld3:
            r3 = 0
        Ld4:
            int r2 = r9.positionInfo     // Catch: java.lang.RuntimeException -> L4e
            com.android.dx.dex.code.DalvCode r23 = com.android.dx.dex.code.RopTranslator.translate(r4, r2, r3, r8, r10)     // Catch: java.lang.RuntimeException -> L4e
            boolean r2 = r9.statistics     // Catch: java.lang.RuntimeException -> L4e
            if (r2 == 0) goto L103
            if (r6 == 0) goto L103
            com.android.dx.cf.code.BytecodeArray r1 = r1.getCode()     // Catch: java.lang.RuntimeException -> L4e
            int r24 = r1.size()     // Catch: java.lang.RuntimeException -> L4e
            r1 = r28
            r2 = r30
            r26 = r3
            r3 = r31
            r27 = r5
            r5 = r6
            r0 = r25
            r6 = r26
            r25 = r7
            r7 = r8
            r8 = r24
            updateDexStatistics(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L100
            goto L109
        L100:
            r0 = move-exception
            goto L16d
        L103:
            r27 = r5
            r0 = r25
            r25 = r7
        L109:
            r2 = r23
            goto L10d
        L10c:
            r2 = 0
        L10d:
            boolean r1 = com.android.dx.rop.code.AccessFlags.isSynchronized(r17)     // Catch: java.lang.RuntimeException -> L100
            if (r1 == 0) goto L11b
            r1 = 131072(0x20000, float:1.83671E-40)
            r17 = r17 | r1
            if (r19 != 0) goto L11b
            r17 = r17 & (-33)
        L11b:
            if (r20 == 0) goto L121
            r1 = 65536(0x10000, float:9.1835E-41)
            r17 = r17 | r1
        L121:
            r1 = r17
            com.android.dx.rop.type.TypeList r3 = com.android.dx.dex.cf.AttributeTranslator.getExceptions(r25)     // Catch: java.lang.RuntimeException -> L100
            com.android.dx.dex.file.EncodedMethod r4 = new com.android.dx.dex.file.EncodedMethod     // Catch: java.lang.RuntimeException -> L100
            r4.<init>(r0, r1, r2, r3)     // Catch: java.lang.RuntimeException -> L100
            boolean r1 = r0.isInstanceInit()     // Catch: java.lang.RuntimeException -> L100
            if (r1 != 0) goto L141
            boolean r1 = r0.isClassInit()     // Catch: java.lang.RuntimeException -> L100
            if (r1 != 0) goto L141
            if (r27 != 0) goto L141
            if (r18 == 0) goto L13d
            goto L141
        L13d:
            r11.addVirtualMethod(r4)     // Catch: java.lang.RuntimeException -> L100
            goto L144
        L141:
            r11.addDirectMethod(r4)     // Catch: java.lang.RuntimeException -> L100
        L144:
            com.android.dx.rop.annotation.Annotations r1 = com.android.dx.dex.cf.AttributeTranslator.getMethodAnnotations(r25)     // Catch: java.lang.RuntimeException -> L100
            int r2 = r1.size()     // Catch: java.lang.RuntimeException -> L100
            if (r2 == 0) goto L151
            r11.addMethodAnnotations(r0, r1, r12)     // Catch: java.lang.RuntimeException -> L100
        L151:
            com.android.dx.rop.annotation.AnnotationsList r1 = com.android.dx.dex.cf.AttributeTranslator.getParameterAnnotations(r25)     // Catch: java.lang.RuntimeException -> L100
            int r2 = r1.size()     // Catch: java.lang.RuntimeException -> L100
            if (r2 == 0) goto L15e
            r11.addParameterAnnotations(r0, r1, r12)     // Catch: java.lang.RuntimeException -> L100
        L15e:
            com.android.dx.dex.file.MethodIdsSection r1 = r33.getMethodIds()     // Catch: java.lang.RuntimeException -> L100
            r1.intern(r0)     // Catch: java.lang.RuntimeException -> L100
            int r8 = r22 + 1
            r0 = r28
            r15 = r21
            goto L1a
        L16d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "...while processing "
            r1.append(r2)
            com.android.dx.rop.cst.CstString r2 = r25.getName()
            java.lang.String r2 = r2.toHuman()
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            com.android.dx.rop.cst.CstString r2 = r25.getDescriptor()
            java.lang.String r2 = r2.toHuman()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.android.dex.util.ExceptionWithContext r0 = com.android.dex.util.ExceptionWithContext.withContext(r0, r1)
            throw r0
        L19b:
            return
    }

    public static com.android.dx.dex.file.ClassDefItem translate(com.android.dx.command.dexer.DxContext r0, com.android.dx.cf.direct.DirectClassFile r1, byte[] r2, com.android.dx.dex.cf.CfOptions r3, com.android.dx.dex.DexOptions r4, com.android.dx.dex.file.DexFile r5) {
            com.android.dx.dex.file.ClassDefItem r0 = translate0(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.RuntimeException -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "...while processing "
            r2.append(r3)
            java.lang.String r1 = r1.getFilePath()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.android.dex.util.ExceptionWithContext r0 = com.android.dex.util.ExceptionWithContext.withContext(r0, r1)
            throw r0
    }

    private static com.android.dx.dex.file.ClassDefItem translate0(com.android.dx.command.dexer.DxContext r14, com.android.dx.cf.direct.DirectClassFile r15, byte[] r16, com.android.dx.dex.cf.CfOptions r17, com.android.dx.dex.DexOptions r18, com.android.dx.dex.file.DexFile r19) {
            r6 = r15
            r2 = r17
            r0 = r14
            r5 = r19
            com.android.dx.dex.cf.OptimizerOptions r1 = r0.optimizerOptions
            java.lang.String r3 = r2.optimizeListFile
            java.lang.String r4 = r2.dontOptimizeListFile
            r1.loadOptimizeLists(r3, r4)
            com.android.dx.rop.cst.CstType r8 = r15.getThisClass()
            int r1 = r15.getAccessFlags()
            r9 = r1 & (-33)
            int r1 = r2.positionInfo
            r3 = 1
            if (r1 != r3) goto L21
            r1 = 0
        L1f:
            r12 = r1
            goto L26
        L21:
            com.android.dx.rop.cst.CstString r1 = r15.getSourceFile()
            goto L1f
        L26:
            com.android.dx.dex.file.ClassDefItem r13 = new com.android.dx.dex.file.ClassDefItem
            com.android.dx.rop.cst.CstType r10 = r15.getSuperclass()
            com.android.dx.rop.type.TypeList r11 = r15.getInterfaces()
            r7 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            com.android.dx.rop.annotation.Annotations r1 = com.android.dx.dex.cf.AttributeTranslator.getClassAnnotations(r15, r2)
            int r3 = r1.size()
            if (r3 == 0) goto L41
            r13.setClassAnnotations(r1, r5)
        L41:
            com.android.dx.dex.file.FieldIdsSection r7 = r19.getFieldIds()
            com.android.dx.dex.file.MethodIdsSection r8 = r19.getMethodIds()
            com.android.dx.dex.file.MethodHandlesSection r9 = r19.getMethodHandles()
            com.android.dx.dex.file.CallSiteIdsSection r10 = r19.getCallSiteIds()
            processFields(r15, r13, r5)
            r0 = r14
            r1 = r15
            r2 = r17
            r3 = r18
            r4 = r13
            r5 = r19
            processMethods(r0, r1, r2, r3, r4, r5)
            com.android.dx.rop.cst.ConstantPool r0 = r15.getConstantPool()
            int r1 = r0.size()
            r2 = 0
        L69:
            if (r2 >= r1) goto Lf2
            com.android.dx.rop.cst.Constant r3 = r0.getOrNull(r2)
            boolean r4 = r3 instanceof com.android.dx.rop.cst.CstMethodRef
            if (r4 == 0) goto L7a
            com.android.dx.rop.cst.CstBaseMethodRef r3 = (com.android.dx.rop.cst.CstBaseMethodRef) r3
            r8.intern(r3)
            goto Lee
        L7a:
            boolean r4 = r3 instanceof com.android.dx.rop.cst.CstInterfaceMethodRef
            if (r4 == 0) goto L88
            com.android.dx.rop.cst.CstInterfaceMethodRef r3 = (com.android.dx.rop.cst.CstInterfaceMethodRef) r3
            com.android.dx.rop.cst.CstMethodRef r3 = r3.toMethodRef()
            r8.intern(r3)
            goto Lee
        L88:
            boolean r4 = r3 instanceof com.android.dx.rop.cst.CstFieldRef
            if (r4 == 0) goto L92
            com.android.dx.rop.cst.CstFieldRef r3 = (com.android.dx.rop.cst.CstFieldRef) r3
            r7.intern(r3)
            goto Lee
        L92:
            boolean r4 = r3 instanceof com.android.dx.rop.cst.CstEnumRef
            if (r4 == 0) goto La0
            com.android.dx.rop.cst.CstEnumRef r3 = (com.android.dx.rop.cst.CstEnumRef) r3
            com.android.dx.rop.cst.CstFieldRef r3 = r3.getFieldRef()
            r7.intern(r3)
            goto Lee
        La0:
            boolean r4 = r3 instanceof com.android.dx.rop.cst.CstMethodHandle
            if (r4 == 0) goto Laa
            com.android.dx.rop.cst.CstMethodHandle r3 = (com.android.dx.rop.cst.CstMethodHandle) r3
            r9.intern(r3)
            goto Lee
        Laa:
            boolean r4 = r3 instanceof com.android.dx.rop.cst.CstInvokeDynamic
            if (r4 == 0) goto Lee
            com.android.dx.rop.cst.CstInvokeDynamic r3 = (com.android.dx.rop.cst.CstInvokeDynamic) r3
            int r4 = r3.getBootstrapMethodIndex()
            com.android.dx.cf.code.BootstrapMethodsList r5 = r15.getBootstrapMethods()
            com.android.dx.cf.code.BootstrapMethodsList$Item r4 = r5.get(r4)
            com.android.dx.rop.cst.CstMethodHandle r5 = r4.getBootstrapMethodHandle()
            com.android.dx.rop.cst.CstNat r11 = r3.getNat()
            com.android.dx.cf.code.BootstrapMethodArgumentsList r4 = r4.getBootstrapMethodArguments()
            com.android.dx.rop.cst.CstCallSite r4 = com.android.dx.rop.cst.CstCallSite.make(r5, r11, r4)
            com.android.dx.rop.cst.CstType r5 = r15.getThisClass()
            r3.setDeclaringClass(r5)
            r3.setCallSite(r4)
            java.util.List r3 = r3.getReferences()
            java.util.Iterator r3 = r3.iterator()
        Lde:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lee
            java.lang.Object r4 = r3.next()
            com.android.dx.rop.cst.CstCallSiteRef r4 = (com.android.dx.rop.cst.CstCallSiteRef) r4
            r10.intern(r4)
            goto Lde
        Lee:
            int r2 = r2 + 1
            goto L69
        Lf2:
            return r13
    }

    private static void updateDexStatistics(com.android.dx.command.dexer.DxContext r1, com.android.dx.dex.cf.CfOptions r2, com.android.dx.dex.DexOptions r3, com.android.dx.rop.code.RopMethod r4, com.android.dx.rop.code.RopMethod r5, com.android.dx.rop.code.LocalVariableInfo r6, int r7, int r8) {
            int r0 = r2.positionInfo
            com.android.dx.dex.code.DalvCode r4 = com.android.dx.dex.code.RopTranslator.translate(r4, r0, r6, r7, r3)
            int r2 = r2.positionInfo
            com.android.dx.dex.code.DalvCode r2 = com.android.dx.dex.code.RopTranslator.translate(r5, r2, r6, r7, r3)
            com.android.dx.dex.cf.CfTranslator$1 r3 = new com.android.dx.dex.cf.CfTranslator$1
            r3.<init>()
            r4.assignIndices(r3)
            r2.assignIndices(r3)
            com.android.dx.dex.cf.CodeStatistics r3 = r1.codeStatistics
            r3.updateDexStatistics(r2, r4)
            com.android.dx.dex.cf.CodeStatistics r1 = r1.codeStatistics
            r1.updateOriginalByteCount(r8)
            return
    }
}
