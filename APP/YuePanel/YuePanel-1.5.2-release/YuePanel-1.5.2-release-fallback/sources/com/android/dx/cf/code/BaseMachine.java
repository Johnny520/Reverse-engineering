package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMachine implements com.android.dx.cf.code.Machine {
    private int argCount;
    private com.android.dx.rop.type.TypeBearer[] args;
    private com.android.dx.cf.code.SwitchList auxCases;
    private com.android.dx.rop.cst.Constant auxCst;
    private java.util.ArrayList<com.android.dx.rop.cst.Constant> auxInitValues;
    private int auxInt;
    private int auxTarget;
    private com.android.dx.rop.type.Type auxType;
    private int localIndex;
    private boolean localInfo;
    private com.android.dx.rop.code.RegisterSpec localTarget;
    private final com.android.dx.rop.type.Prototype prototype;
    private int resultCount;
    private com.android.dx.rop.type.TypeBearer[] results;

    public BaseMachine(com.android.dx.rop.type.Prototype r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L16
            r1.prototype = r2
            r2 = 10
            com.android.dx.rop.type.TypeBearer[] r2 = new com.android.dx.rop.type.TypeBearer[r2]
            r1.args = r2
            r2 = 6
            com.android.dx.rop.type.TypeBearer[] r2 = new com.android.dx.rop.type.TypeBearer[r2]
            r1.results = r2
            r1.clearArgs()
            return
        L16:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "prototype == null"
            r2.<init>(r0)
            throw r2
    }

    public static void throwLocalMismatch(com.android.dx.rop.type.TypeBearer r3, com.android.dx.rop.type.TypeBearer r4) {
            com.android.dx.cf.code.SimException r0 = new com.android.dx.cf.code.SimException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "local variable type mismatch: attempt to set or access a value of type "
            r1.append(r2)
            java.lang.String r3 = r3.toHuman()
            r1.append(r3)
            java.lang.String r3 = " using a local variable of type "
            r1.append(r3)
            java.lang.String r3 = r4.toHuman()
            r1.append(r3)
            java.lang.String r3 = ". This is symptomatic of .class transformation tools that ignore local variable information."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public final void addResult(com.android.dx.rop.type.TypeBearer r3) {
            r2 = this;
            if (r3 == 0) goto Ld
            com.android.dx.rop.type.TypeBearer[] r0 = r2.results
            int r1 = r2.resultCount
            r0[r1] = r3
            int r1 = r1 + 1
            r2.resultCount = r1
            return
        Ld:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "result == null"
            r3.<init>(r0)
            throw r3
    }

    public final com.android.dx.rop.type.TypeBearer arg(int r2) {
            r1 = this;
            int r0 = r1.argCount
            if (r2 >= r0) goto L11
            com.android.dx.rop.type.TypeBearer[] r0 = r1.args     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9
            r2 = r0[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "n < 0"
            r2.<init>(r0)
            throw r2
        L11:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "n >= argCount"
            r2.<init>(r0)
            throw r2
    }

    public final int argCount() {
            r1 = this;
            int r0 = r1.argCount
            return r0
    }

    public final int argWidth() {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r3.argCount
            if (r0 >= r2) goto L16
            com.android.dx.rop.type.TypeBearer[] r2 = r3.args
            r2 = r2[r0]
            com.android.dx.rop.type.Type r2 = r2.getType()
            int r2 = r2.getCategory()
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        L16:
            return r1
    }

    @Override // com.android.dx.cf.code.Machine
    public final void auxCstArg(com.android.dx.rop.cst.Constant r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.auxCst = r2
            return
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "cst == null"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.android.dx.cf.code.Machine
    public final void auxInitValues(java.util.ArrayList<com.android.dx.rop.cst.Constant> r1) {
            r0 = this;
            r0.auxInitValues = r1
            return
    }

    @Override // com.android.dx.cf.code.Machine
    public final void auxIntArg(int r1) {
            r0 = this;
            r0.auxInt = r1
            return
    }

    @Override // com.android.dx.cf.code.Machine
    public final void auxSwitchArg(com.android.dx.cf.code.SwitchList r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.auxCases = r2
            return
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "cases == null"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.android.dx.cf.code.Machine
    public final void auxTargetArg(int r1) {
            r0 = this;
            r0.auxTarget = r1
            return
    }

    @Override // com.android.dx.cf.code.Machine
    public final void auxType(com.android.dx.rop.type.Type r1) {
            r0 = this;
            r0.auxType = r1
            return
    }

    @Override // com.android.dx.cf.code.Machine
    public final void clearArgs() {
            r3 = this;
            r0 = 0
            r3.argCount = r0
            r1 = 0
            r3.auxType = r1
            r3.auxInt = r0
            r3.auxCst = r1
            r3.auxTarget = r0
            r3.auxCases = r1
            r3.auxInitValues = r1
            r2 = -1
            r3.localIndex = r2
            r3.localInfo = r0
            r3.localTarget = r1
            r3.resultCount = r2
            return
    }

    public final void clearResult() {
            r1 = this;
            r0 = 0
            r1.resultCount = r0
            return
    }

    public final com.android.dx.cf.code.SwitchList getAuxCases() {
            r1 = this;
            com.android.dx.cf.code.SwitchList r0 = r1.auxCases
            return r0
    }

    public final com.android.dx.rop.cst.Constant getAuxCst() {
            r1 = this;
            com.android.dx.rop.cst.Constant r0 = r1.auxCst
            return r0
    }

    public final int getAuxInt() {
            r1 = this;
            int r0 = r1.auxInt
            return r0
    }

    public final int getAuxTarget() {
            r1 = this;
            int r0 = r1.auxTarget
            return r0
    }

    public final com.android.dx.rop.type.Type getAuxType() {
            r1 = this;
            com.android.dx.rop.type.Type r0 = r1.auxType
            return r0
    }

    public final java.util.ArrayList<com.android.dx.rop.cst.Constant> getInitValues() {
            r1 = this;
            java.util.ArrayList<com.android.dx.rop.cst.Constant> r0 = r1.auxInitValues
            return r0
    }

    public final int getLocalIndex() {
            r1 = this;
            int r0 = r1.localIndex
            return r0
    }

    public final boolean getLocalInfo() {
            r1 = this;
            boolean r0 = r1.localInfo
            return r0
    }

    public final com.android.dx.rop.code.RegisterSpec getLocalTarget(boolean r5) {
            r4 = this;
            com.android.dx.rop.code.RegisterSpec r0 = r4.localTarget
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r4.resultCount
            r2 = 1
            if (r0 == r2) goto L30
            com.android.dx.cf.code.SimException r5 = new com.android.dx.cf.code.SimException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "local target with "
            r0.append(r1)
            int r1 = r4.resultCount
            if (r1 != 0) goto L1e
            java.lang.String r1 = "no"
            goto L20
        L1e:
            java.lang.String r1 = "multiple"
        L20:
            r0.append(r1)
            java.lang.String r1 = " results"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L30:
            com.android.dx.rop.type.TypeBearer[] r0 = r4.results
            r2 = 0
            r0 = r0[r2]
            com.android.dx.rop.type.Type r2 = r0.getType()
            com.android.dx.rop.code.RegisterSpec r3 = r4.localTarget
            com.android.dx.rop.type.Type r3 = r3.getType()
            if (r2 != r3) goto L4d
            if (r5 == 0) goto L4a
            com.android.dx.rop.code.RegisterSpec r5 = r4.localTarget
            com.android.dx.rop.code.RegisterSpec r5 = r5.withType(r0)
            return r5
        L4a:
            com.android.dx.rop.code.RegisterSpec r5 = r4.localTarget
            return r5
        L4d:
            boolean r5 = com.android.dx.cf.code.Merger.isPossiblyAssignableFrom(r3, r2)
            if (r5 != 0) goto L57
            throwLocalMismatch(r2, r3)
            return r1
        L57:
            com.android.dx.rop.type.Type r5 = com.android.dx.rop.type.Type.OBJECT
            if (r3 != r5) goto L63
            com.android.dx.rop.code.RegisterSpec r5 = r4.localTarget
            com.android.dx.rop.code.RegisterSpec r5 = r5.withType(r0)
            r4.localTarget = r5
        L63:
            com.android.dx.rop.code.RegisterSpec r5 = r4.localTarget
            return r5
    }

    @Override // com.android.dx.cf.code.Machine
    public com.android.dx.rop.type.Prototype getPrototype() {
            r1 = this;
            com.android.dx.rop.type.Prototype r0 = r1.prototype
            return r0
    }

    @Override // com.android.dx.cf.code.Machine
    public final void localArg(com.android.dx.cf.code.Frame r3, int r4) {
            r2 = this;
            r2.clearArgs()
            com.android.dx.rop.type.TypeBearer[] r0 = r2.args
            com.android.dx.cf.code.LocalsArray r3 = r3.getLocals()
            com.android.dx.rop.type.TypeBearer r3 = r3.get(r4)
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r2.argCount = r3
            r2.localIndex = r4
            return
    }

    @Override // com.android.dx.cf.code.Machine
    public final void localInfo(boolean r1) {
            r0 = this;
            r0.localInfo = r1
            return
    }

    @Override // com.android.dx.cf.code.Machine
    public final void localTarget(int r1, com.android.dx.rop.type.Type r2, com.android.dx.rop.code.LocalItem r3) {
            r0 = this;
            com.android.dx.rop.code.RegisterSpec r1 = com.android.dx.rop.code.RegisterSpec.makeLocalOptional(r1, r2, r3)
            r0.localTarget = r1
            return
    }

    @Override // com.android.dx.cf.code.Machine
    public final void popArgs(com.android.dx.cf.code.Frame r4, int r5) {
            r3 = this;
            com.android.dx.cf.code.ExecutionStack r4 = r4.getStack()
            r3.clearArgs()
            com.android.dx.rop.type.TypeBearer[] r0 = r3.args
            int r0 = r0.length
            if (r5 <= r0) goto L12
            int r0 = r5 + 10
            com.android.dx.rop.type.TypeBearer[] r0 = new com.android.dx.rop.type.TypeBearer[r0]
            r3.args = r0
        L12:
            int r0 = r5 + (-1)
        L14:
            if (r0 < 0) goto L21
            com.android.dx.rop.type.TypeBearer[] r1 = r3.args
            com.android.dx.rop.type.TypeBearer r2 = r4.pop()
            r1[r0] = r2
            int r0 = r0 + (-1)
            goto L14
        L21:
            r3.argCount = r5
            return
    }

    @Override // com.android.dx.cf.code.Machine
    public void popArgs(com.android.dx.cf.code.Frame r5, com.android.dx.rop.type.Prototype r6) {
            r4 = this;
            com.android.dx.rop.type.StdTypeList r6 = r6.getParameterTypes()
            int r0 = r6.size()
            r4.popArgs(r5, r0)
            r5 = 0
        Lc:
            if (r5 >= r0) goto L5d
            com.android.dx.rop.type.Type r1 = r6.getType(r5)
            com.android.dx.rop.type.TypeBearer[] r2 = r4.args
            r2 = r2[r5]
            boolean r1 = com.android.dx.cf.code.Merger.isPossiblyAssignableFrom(r1, r2)
            if (r1 == 0) goto L1f
            int r5 = r5 + 1
            goto Lc
        L1f:
            com.android.dx.cf.code.SimException r1 = new com.android.dx.cf.code.SimException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "at stack depth "
            r2.append(r3)
            int r0 = r0 + (-1)
            int r0 = r0 - r5
            r2.append(r0)
            java.lang.String r0 = ", expected type "
            r2.append(r0)
            com.android.dx.rop.type.Type r6 = r6.getType(r5)
            java.lang.String r6 = r6.toHuman()
            r2.append(r6)
            java.lang.String r6 = " but found "
            r2.append(r6)
            com.android.dx.rop.type.TypeBearer[] r6 = r4.args
            r5 = r6[r5]
            com.android.dx.rop.type.Type r5 = r5.getType()
            java.lang.String r5 = r5.toHuman()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5)
            throw r1
        L5d:
            return
    }

    @Override // com.android.dx.cf.code.Machine
    public final void popArgs(com.android.dx.cf.code.Frame r4, com.android.dx.rop.type.Type r5) {
            r3 = this;
            r0 = 1
            r3.popArgs(r4, r0)
            com.android.dx.rop.type.TypeBearer[] r4 = r3.args
            r0 = 0
            r4 = r4[r0]
            boolean r4 = com.android.dx.cf.code.Merger.isPossiblyAssignableFrom(r5, r4)
            if (r4 == 0) goto L10
            return
        L10:
            com.android.dx.cf.code.SimException r4 = new com.android.dx.cf.code.SimException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "expected type "
            r1.append(r2)
            java.lang.String r5 = r5.toHuman()
            r1.append(r5)
            java.lang.String r5 = " but found "
            r1.append(r5)
            com.android.dx.rop.type.TypeBearer[] r5 = r3.args
            r5 = r5[r0]
            com.android.dx.rop.type.Type r5 = r5.getType()
            java.lang.String r5 = r5.toHuman()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r4.<init>(r5)
            throw r4
    }

    @Override // com.android.dx.cf.code.Machine
    public final void popArgs(com.android.dx.cf.code.Frame r4, com.android.dx.rop.type.Type r5, com.android.dx.rop.type.Type r6) {
            r3 = this;
            r0 = 2
            r3.popArgs(r4, r0)
            com.android.dx.rop.type.TypeBearer[] r4 = r3.args
            r0 = 0
            r4 = r4[r0]
            boolean r4 = com.android.dx.cf.code.Merger.isPossiblyAssignableFrom(r5, r4)
            java.lang.String r1 = " but found "
            java.lang.String r2 = "expected type "
            if (r4 == 0) goto L4a
            com.android.dx.rop.type.TypeBearer[] r4 = r3.args
            r5 = 1
            r4 = r4[r5]
            boolean r4 = com.android.dx.cf.code.Merger.isPossiblyAssignableFrom(r6, r4)
            if (r4 == 0) goto L1f
            return
        L1f:
            com.android.dx.cf.code.SimException r4 = new com.android.dx.cf.code.SimException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r6 = r6.toHuman()
            r0.append(r6)
            r0.append(r1)
            com.android.dx.rop.type.TypeBearer[] r6 = r3.args
            r5 = r6[r5]
            com.android.dx.rop.type.Type r5 = r5.getType()
            java.lang.String r5 = r5.toHuman()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L4a:
            com.android.dx.cf.code.SimException r4 = new com.android.dx.cf.code.SimException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r5 = r5.toHuman()
            r6.append(r5)
            r6.append(r1)
            com.android.dx.rop.type.TypeBearer[] r5 = r3.args
            r5 = r5[r0]
            com.android.dx.rop.type.Type r5 = r5.getType()
            java.lang.String r5 = r5.toHuman()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
    }

    @Override // com.android.dx.cf.code.Machine
    public final void popArgs(com.android.dx.cf.code.Frame r4, com.android.dx.rop.type.Type r5, com.android.dx.rop.type.Type r6, com.android.dx.rop.type.Type r7) {
            r3 = this;
            r0 = 3
            r3.popArgs(r4, r0)
            com.android.dx.rop.type.TypeBearer[] r4 = r3.args
            r0 = 0
            r4 = r4[r0]
            boolean r4 = com.android.dx.cf.code.Merger.isPossiblyAssignableFrom(r5, r4)
            java.lang.String r1 = " but found "
            java.lang.String r2 = "expected type "
            if (r4 == 0) goto L80
            com.android.dx.rop.type.TypeBearer[] r4 = r3.args
            r5 = 1
            r4 = r4[r5]
            boolean r4 = com.android.dx.cf.code.Merger.isPossiblyAssignableFrom(r6, r4)
            if (r4 == 0) goto L55
            com.android.dx.rop.type.TypeBearer[] r4 = r3.args
            r5 = 2
            r4 = r4[r5]
            boolean r4 = com.android.dx.cf.code.Merger.isPossiblyAssignableFrom(r7, r4)
            if (r4 == 0) goto L2a
            return
        L2a:
            com.android.dx.cf.code.SimException r4 = new com.android.dx.cf.code.SimException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r7 = r7.toHuman()
            r6.append(r7)
            r6.append(r1)
            com.android.dx.rop.type.TypeBearer[] r7 = r3.args
            r5 = r7[r5]
            com.android.dx.rop.type.Type r5 = r5.getType()
            java.lang.String r5 = r5.toHuman()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L55:
            com.android.dx.cf.code.SimException r4 = new com.android.dx.cf.code.SimException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            java.lang.String r6 = r6.toHuman()
            r7.append(r6)
            r7.append(r1)
            com.android.dx.rop.type.TypeBearer[] r6 = r3.args
            r5 = r6[r5]
            com.android.dx.rop.type.Type r5 = r5.getType()
            java.lang.String r5 = r5.toHuman()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r4.<init>(r5)
            throw r4
        L80:
            com.android.dx.cf.code.SimException r4 = new com.android.dx.cf.code.SimException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r5 = r5.toHuman()
            r6.append(r5)
            r6.append(r1)
            com.android.dx.rop.type.TypeBearer[] r5 = r3.args
            r5 = r5[r0]
            com.android.dx.rop.type.Type r5 = r5.getType()
            java.lang.String r5 = r5.toHuman()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
    }

    public final com.android.dx.rop.type.TypeBearer result(int r2) {
            r1 = this;
            int r0 = r1.resultCount
            if (r2 >= r0) goto L11
            com.android.dx.rop.type.TypeBearer[] r0 = r1.results     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9
            r2 = r0[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "n < 0"
            r2.<init>(r0)
            throw r2
        L11:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "n >= resultCount"
            r2.<init>(r0)
            throw r2
    }

    public final int resultCount() {
            r2 = this;
            int r0 = r2.resultCount
            if (r0 < 0) goto L5
            return r0
        L5:
            com.android.dx.cf.code.SimException r0 = new com.android.dx.cf.code.SimException
            java.lang.String r1 = "results never set"
            r0.<init>(r1)
            throw r0
    }

    public final int resultWidth() {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r3.resultCount
            if (r0 >= r2) goto L16
            com.android.dx.rop.type.TypeBearer[] r2 = r3.results
            r2 = r2[r0]
            com.android.dx.rop.type.Type r2 = r2.getType()
            int r2 = r2.getCategory()
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L2
        L16:
            return r1
    }

    public final void setResult(com.android.dx.rop.type.TypeBearer r3) {
            r2 = this;
            if (r3 == 0) goto Lb
            com.android.dx.rop.type.TypeBearer[] r0 = r2.results
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r2.resultCount = r3
            return
        Lb:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "result == null"
            r3.<init>(r0)
            throw r3
    }

    public final void storeResults(com.android.dx.cf.code.Frame r3) {
            r2 = this;
            int r0 = r2.resultCount
            if (r0 < 0) goto L32
            if (r0 != 0) goto L7
            return
        L7:
            com.android.dx.rop.code.RegisterSpec r0 = r2.localTarget
            r1 = 0
            if (r0 == 0) goto L18
            com.android.dx.cf.code.LocalsArray r3 = r3.getLocals()
            com.android.dx.rop.code.RegisterSpec r0 = r2.getLocalTarget(r1)
            r3.set(r0)
            goto L31
        L18:
            com.android.dx.cf.code.ExecutionStack r3 = r3.getStack()
        L1c:
            int r0 = r2.resultCount
            if (r1 >= r0) goto L31
            boolean r0 = r2.localInfo
            if (r0 == 0) goto L27
            r3.setLocal()
        L27:
            com.android.dx.rop.type.TypeBearer[] r0 = r2.results
            r0 = r0[r1]
            r3.push(r0)
            int r1 = r1 + 1
            goto L1c
        L31:
            return
        L32:
            com.android.dx.cf.code.SimException r3 = new com.android.dx.cf.code.SimException
            java.lang.String r0 = "results never set"
            r3.<init>(r0)
            throw r3
    }
}
