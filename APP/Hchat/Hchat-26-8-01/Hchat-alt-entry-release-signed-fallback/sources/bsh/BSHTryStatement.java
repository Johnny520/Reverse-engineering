package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHTryStatement extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;
    final int blockId;
    bsh.BSHTryWithResources tryWithResources;

    public BSHTryStatement(int r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.tryWithResources = r1
            java.util.concurrent.atomic.AtomicInteger r1 = bsh.BlockNameSpace.blockCount
            int r1 = r1.incrementAndGet()
            r0.blockId = r1
            return
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r22, bsh.Interpreter r23) {
            r21 = this;
            r1 = r21
            r6 = r22
            r8 = r23
            java.lang.String r9 = "Try with resources: autoClose"
            r10 = 0
            bsh.Node r0 = r1.jjtGetChild(r10)
            boolean r0 = r0 instanceof bsh.BSHTryWithResources
            if (r0 == 0) goto L1e
            bsh.Node r0 = r1.jjtGetChild(r10)
            bsh.BSHTryWithResources r0 = (bsh.BSHTryWithResources) r0
            r1.tryWithResources = r0
            r0.eval(r6, r8)
            r0 = 1
            goto L1f
        L1e:
            r0 = r10
        L1f:
            int r2 = r0 + 1
            bsh.Node r0 = r1.jjtGetChild(r0)
            r5 = r0
            bsh.BSHBlock r5 = (bsh.BSHBlock) r5
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            int r0 = r1.jjtGetNumChildren()
        L36:
            if (r2 >= r0) goto L53
            int r3 = r2 + 1
            bsh.Node r4 = r1.jjtGetChild(r2)
            boolean r7 = r4 instanceof bsh.BSHMultiCatch
            if (r7 == 0) goto L54
            bsh.BSHMultiCatch r4 = (bsh.BSHMultiCatch) r4
            r12.add(r4)
            int r2 = r2 + 2
            bsh.Node r3 = r1.jjtGetChild(r3)
            bsh.BSHBlock r3 = (bsh.BSHBlock) r3
            r13.add(r3)
            goto L36
        L53:
            r4 = 0
        L54:
            if (r4 == 0) goto L5a
            bsh.BSHBlock r4 = (bsh.BSHBlock) r4
            r15 = r4
            goto L5b
        L5a:
            r15 = 0
        L5b:
            int r2 = r6.depth()
            java.lang.String r0 = "Evaluate try block"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Lab bsh.EvalException -> Laf bsh.TargetError -> Lb3
            bsh.Interpreter.debug(r0)     // Catch: java.lang.Throwable -> Lab bsh.EvalException -> Laf bsh.TargetError -> Lb3
            java.lang.Object r0 = r5.eval(r6, r8)     // Catch: java.lang.Throwable -> Lab bsh.EvalException -> Laf bsh.TargetError -> Lb3 java.lang.OutOfMemoryError -> Lb7
            r2 = 0
        L6d:
            if (r2 == 0) goto L82
            java.lang.Throwable r3 = r2.getCause()
            boolean r3 = r3 instanceof bsh.TargetError
            if (r3 == 0) goto L82
            java.lang.Throwable r2 = r2.getCause()
            bsh.TargetError r2 = (bsh.TargetError) r2
            java.lang.Throwable r2 = r2.getTarget()
            goto L6d
        L82:
            bsh.BSHTryWithResources r3 = r1.tryWithResources
            if (r3 == 0) goto L187
            java.lang.Object[] r3 = new java.lang.Object[]{r9}
            bsh.Interpreter.debug(r3)
            bsh.BSHTryWithResources r3 = r1.tryWithResources
            java.util.List r3 = r3.autoClose()
            java.util.Iterator r3 = r3.iterator()
        L97:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L187
            java.lang.Object r4 = r3.next()
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r2 == 0) goto L97
            if (r2 == r4) goto L97
            r2.addSuppressed(r4)
            goto L97
        Lab:
            r0 = move-exception
            r14 = 0
            goto L27b
        Laf:
            r0 = move-exception
            r10 = r2
        Lb1:
            r2 = r0
            goto Ldb
        Lb3:
            r0 = move-exception
            r10 = r2
            goto L132
        Lb7:
            r0 = move-exception
            r4 = r0
            r3 = r2
            bsh.TargetError r2 = new bsh.TargetError     // Catch: java.lang.Throwable -> Lab bsh.EvalException -> Ld5 bsh.TargetError -> Ld8
            r7 = r3
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> Lab bsh.EvalException -> Lcf bsh.TargetError -> Ld2
            r16 = r7
            r7 = 0
            r10 = r16
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lab bsh.EvalException -> Lca bsh.TargetError -> Lcc
            throw r2     // Catch: java.lang.Throwable -> Lab bsh.EvalException -> Lca bsh.TargetError -> Lcc
        Lca:
            r0 = move-exception
            goto Lb1
        Lcc:
            r0 = move-exception
            goto L132
        Lcf:
            r0 = move-exception
            r10 = r7
            goto Lb1
        Ld2:
            r0 = move-exception
            r10 = r7
            goto L132
        Ld5:
            r0 = move-exception
            r10 = r3
            goto Lb1
        Ld8:
            r0 = move-exception
            r10 = r3
            goto L132
        Ldb:
            java.lang.String r0 = "EvalException from try block: "
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}     // Catch: java.lang.Throwable -> Lab
            bsh.Interpreter.debug(r0)     // Catch: java.lang.Throwable -> Lab
        Le4:
            int r0 = r6.depth()     // Catch: java.lang.Throwable -> Lee
            if (r0 <= r10) goto Lf2
            r6.pop()     // Catch: java.lang.Throwable -> Lee
            goto Le4
        Lee:
            r0 = move-exception
            r14 = r2
            goto L27b
        Lf2:
            if (r2 == 0) goto L107
            java.lang.Throwable r0 = r2.getCause()
            boolean r0 = r0 instanceof bsh.TargetError
            if (r0 == 0) goto L107
            java.lang.Throwable r0 = r2.getCause()
            bsh.TargetError r0 = (bsh.TargetError) r0
            java.lang.Throwable r2 = r0.getTarget()
            goto Lf2
        L107:
            bsh.BSHTryWithResources r0 = r1.tryWithResources
            if (r0 == 0) goto L130
            java.lang.Object[] r0 = new java.lang.Object[]{r9}
            bsh.Interpreter.debug(r0)
            bsh.BSHTryWithResources r0 = r1.tryWithResources
            java.util.List r0 = r0.autoClose()
            java.util.Iterator r0 = r0.iterator()
        L11c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L130
            java.lang.Object r3 = r0.next()
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r2 == 0) goto L11c
            if (r2 == r3) goto L11c
            r2.addSuppressed(r3)
            goto L11c
        L130:
            r0 = 0
            goto L187
        L132:
            java.lang.String r2 = "TargetError from try block: "
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r0}     // Catch: java.lang.Throwable -> Lab
            bsh.Interpreter.debug(r2)     // Catch: java.lang.Throwable -> Lab
            java.lang.Throwable r2 = r0.getTarget()     // Catch: java.lang.Throwable -> Lab
        L13f:
            int r0 = r6.depth()     // Catch: java.lang.Throwable -> Lee
            if (r0 <= r10) goto L149
            r6.pop()     // Catch: java.lang.Throwable -> Lee
            goto L13f
        L149:
            if (r2 == 0) goto L15e
            java.lang.Throwable r0 = r2.getCause()
            boolean r0 = r0 instanceof bsh.TargetError
            if (r0 == 0) goto L15e
            java.lang.Throwable r0 = r2.getCause()
            bsh.TargetError r0 = (bsh.TargetError) r0
            java.lang.Throwable r2 = r0.getTarget()
            goto L149
        L15e:
            bsh.BSHTryWithResources r0 = r1.tryWithResources
            if (r0 == 0) goto L130
            java.lang.Object[] r0 = new java.lang.Object[]{r9}
            bsh.Interpreter.debug(r0)
            bsh.BSHTryWithResources r0 = r1.tryWithResources
            java.util.List r0 = r0.autoClose()
            java.util.Iterator r0 = r0.iterator()
        L173:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L130
            java.lang.Object r3 = r0.next()
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r2 == 0) goto L173
            if (r2 == r3) goto L173
            r2.addSuppressed(r3)
            goto L173
        L187:
            if (r2 == 0) goto L24e
            java.lang.String r3 = "Try catch thrown: "
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r2}     // Catch: java.lang.Throwable -> L1b5
            bsh.Interpreter.debug(r3)     // Catch: java.lang.Throwable -> L1b5
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Throwable -> L1b5
            int r4 = r12.size()     // Catch: java.lang.Throwable -> L1b5
            r5 = 0
        L19b:
            if (r5 >= r4) goto L24e
            java.lang.Object r7 = r12.get(r5)     // Catch: java.lang.Throwable -> L1b5
            bsh.BSHMultiCatch r7 = (bsh.BSHMultiCatch) r7     // Catch: java.lang.Throwable -> L1b5
            bsh.Modifiers r9 = new bsh.Modifiers     // Catch: java.lang.Throwable -> L1b5
            r10 = 4
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L1b5
            boolean r10 = r7.isFinal()     // Catch: java.lang.Throwable -> L1b5
            if (r10 == 0) goto L1b8
            java.lang.String r10 = "final"
            r9.addModifier(r10)     // Catch: java.lang.Throwable -> L1b5
            goto L1b8
        L1b5:
            r0 = move-exception
            goto L251
        L1b8:
            r7.eval(r6, r8)     // Catch: java.lang.Throwable -> L1b5
            boolean r10 = r7.isUntyped()     // Catch: java.lang.Throwable -> L1b5
            if (r10 == 0) goto L1d0
            boolean r10 = r8.getStrictJava()     // Catch: java.lang.Throwable -> L1b5
            if (r10 != 0) goto L1c8
            goto L1d0
        L1c8:
            bsh.EvalException r0 = new bsh.EvalException     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r2 = "(Strict Java) Untyped catch block"
            r0.<init>(r2, r1, r6)     // Catch: java.lang.Throwable -> L1b5
            throw r0     // Catch: java.lang.Throwable -> L1b5
        L1d0:
            boolean r10 = r7.isUntyped()     // Catch: java.lang.Throwable -> L1b5
            if (r10 != 0) goto L210
            java.lang.Class[] r10 = r7.getTypes()     // Catch: java.lang.Throwable -> L1b5
            int r14 = r10.length     // Catch: java.lang.Throwable -> L1b5
            r11 = 0
            r17 = 0
        L1de:
            if (r11 >= r14) goto L1fd
            r18 = r0
            r0 = r10[r11]     // Catch: java.lang.Throwable -> L1b5
            r19 = r4
            boolean r4 = bsh.Types.isBshAssignable(r0, r3)     // Catch: java.lang.Throwable -> L1b5
            r20 = r3
            r3 = 1
            if (r3 != r4) goto L1f2
            r17 = r4
            goto L205
        L1f2:
            int r11 = r11 + 1
            r17 = r4
            r0 = r18
            r4 = r19
            r3 = r20
            goto L1de
        L1fd:
            r18 = r0
            r20 = r3
            r19 = r4
            r3 = 1
            r0 = 0
        L205:
            if (r17 != 0) goto L211
            int r5 = r5 + 1
            r0 = r18
            r4 = r19
            r3 = r20
            goto L19b
        L210:
            r0 = 0
        L211:
            java.lang.Object r3 = r13.get(r5)     // Catch: java.lang.Throwable -> L1b5
            bsh.BSHBlock r3 = (bsh.BSHBlock) r3     // Catch: java.lang.Throwable -> L1b5
            bsh.NameSpace r4 = r6.top()     // Catch: java.lang.Throwable -> L1b5
            bsh.BlockNameSpace r5 = new bsh.BlockNameSpace     // Catch: java.lang.Throwable -> L1b5
            bsh.NameSpace r10 = r6.top()     // Catch: java.lang.Throwable -> L1b5
            int r11 = r1.blockId     // Catch: java.lang.Throwable -> L1b5
            r5.<init>(r10, r11)     // Catch: java.lang.Throwable -> L1b5
            java.lang.Class<?> r10 = bsh.BSHMultiCatch.UNTYPED     // Catch: java.lang.Throwable -> L1b5 bsh.UtilEvalError -> L246
            java.lang.String r7 = r7.name
            if (r0 != r10) goto L230
            r5.setBlockVariable(r7, r2)     // Catch: java.lang.Throwable -> L1b5 bsh.UtilEvalError -> L246
            goto L233
        L230:
            r5.setTypedVariable(r7, r0, r2, r9)     // Catch: java.lang.Throwable -> L1b5 bsh.UtilEvalError -> L246
        L233:
            r6.swap(r5)     // Catch: java.lang.Throwable -> L1b5
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L241
            java.lang.Object r0 = r3.eval(r6, r8, r0)     // Catch: java.lang.Throwable -> L241
            r6.swap(r4)     // Catch: java.lang.Throwable -> L1b5
            r14 = 0
            goto L260
        L241:
            r0 = move-exception
            r6.swap(r4)     // Catch: java.lang.Throwable -> L1b5
            throw r0     // Catch: java.lang.Throwable -> L1b5
        L246:
            bsh.InterpreterError r0 = new bsh.InterpreterError     // Catch: java.lang.Throwable -> L1b5
            java.lang.String r2 = "Unable to set var in catch block namespace."
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1b5
            throw r0     // Catch: java.lang.Throwable -> L1b5
        L24e:
            r18 = r0
            goto L25d
        L251:
            if (r15 == 0) goto L25c
            java.lang.Object r2 = r15.eval(r6, r8)
            boolean r3 = r2 instanceof bsh.ReturnControl
            if (r3 == 0) goto L25c
            return r2
        L25c:
            throw r0
        L25d:
            r14 = r2
            r0 = r18
        L260:
            if (r15 == 0) goto L26b
            java.lang.Object r2 = r15.eval(r6, r8)
            boolean r3 = r2 instanceof bsh.ReturnControl
            if (r3 == 0) goto L26b
            return r2
        L26b:
            if (r14 != 0) goto L275
            boolean r2 = r0 instanceof bsh.ReturnControl
            if (r2 == 0) goto L272
            goto L274
        L272:
            bsh.Primitive r0 = bsh.Primitive.VOID
        L274:
            return r0
        L275:
            bsh.TargetError r0 = new bsh.TargetError
            r0.<init>(r14, r1, r6)
            throw r0
        L27b:
            if (r14 == 0) goto L290
            java.lang.Throwable r2 = r14.getCause()
            boolean r2 = r2 instanceof bsh.TargetError
            if (r2 == 0) goto L290
            java.lang.Throwable r2 = r14.getCause()
            bsh.TargetError r2 = (bsh.TargetError) r2
            java.lang.Throwable r14 = r2.getTarget()
            goto L27b
        L290:
            bsh.BSHTryWithResources r2 = r1.tryWithResources
            if (r2 == 0) goto L2b9
            java.lang.Object[] r2 = new java.lang.Object[]{r9}
            bsh.Interpreter.debug(r2)
            bsh.BSHTryWithResources r2 = r1.tryWithResources
            java.util.List r2 = r2.autoClose()
            java.util.Iterator r2 = r2.iterator()
        L2a5:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2b9
            java.lang.Object r3 = r2.next()
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r14 == 0) goto L2a5
            if (r14 == r3) goto L2a5
            r14.addSuppressed(r3)
            goto L2a5
        L2b9:
            throw r0
    }
}
