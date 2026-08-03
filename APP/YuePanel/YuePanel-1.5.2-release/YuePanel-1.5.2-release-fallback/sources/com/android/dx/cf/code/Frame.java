package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public final class Frame {
    private final com.android.dx.cf.code.LocalsArray locals;
    private final com.android.dx.cf.code.ExecutionStack stack;
    private final com.android.dx.util.IntList subroutines;

    public Frame(int r2, int r3) {
            r1 = this;
            com.android.dx.cf.code.OneLocalsArray r0 = new com.android.dx.cf.code.OneLocalsArray
            r0.<init>(r2)
            com.android.dx.cf.code.ExecutionStack r2 = new com.android.dx.cf.code.ExecutionStack
            r2.<init>(r3)
            r1.<init>(r0, r2)
            return
    }

    private Frame(com.android.dx.cf.code.LocalsArray r2, com.android.dx.cf.code.ExecutionStack r3) {
            r1 = this;
            com.android.dx.util.IntList r0 = com.android.dx.util.IntList.EMPTY
            r1.<init>(r2, r3, r0)
            return
    }

    private Frame(com.android.dx.cf.code.LocalsArray r1, com.android.dx.cf.code.ExecutionStack r2, com.android.dx.util.IntList r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L19
            if (r2 == 0) goto L11
            r3.throwIfMutable()
            r0.locals = r1
            r0.stack = r2
            r0.subroutines = r3
            return
        L11:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "stack == null"
            r1.<init>(r2)
            throw r1
        L19:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "locals == null"
            r1.<init>(r2)
            throw r1
    }

    private static com.android.dx.cf.code.LocalsArray adjustLocalsForSubroutines(com.android.dx.cf.code.LocalsArray r1, com.android.dx.util.IntList r2) {
            boolean r0 = r1 instanceof com.android.dx.cf.code.LocalsArraySet
            if (r0 != 0) goto L5
            return r1
        L5:
            com.android.dx.cf.code.LocalsArraySet r1 = (com.android.dx.cf.code.LocalsArraySet) r1
            int r2 = r2.size()
            if (r2 != 0) goto L11
            com.android.dx.cf.code.OneLocalsArray r1 = r1.getPrimary()
        L11:
            return r1
    }

    private com.android.dx.util.IntList mergeSubroutineLists(com.android.dx.util.IntList r7) {
            r6 = this;
            com.android.dx.util.IntList r0 = r6.subroutines
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Lb
            com.android.dx.util.IntList r7 = r6.subroutines
            return r7
        Lb:
            com.android.dx.util.IntList r0 = new com.android.dx.util.IntList
            r0.<init>()
            com.android.dx.util.IntList r1 = r6.subroutines
            int r1 = r1.size()
            int r2 = r7.size()
            r3 = 0
        L1b:
            if (r3 >= r1) goto L31
            if (r3 >= r2) goto L31
            com.android.dx.util.IntList r4 = r6.subroutines
            int r4 = r4.get(r3)
            int r5 = r7.get(r3)
            if (r4 != r5) goto L31
            r0.add(r3)
            int r3 = r3 + 1
            goto L1b
        L31:
            r0.setImmutable()
            return r0
    }

    public void annotate(com.android.dex.util.ExceptionWithContext r2) {
            r1 = this;
            com.android.dx.cf.code.LocalsArray r0 = r1.locals
            r0.annotate(r2)
            com.android.dx.cf.code.ExecutionStack r0 = r1.stack
            r0.annotate(r2)
            return
    }

    public com.android.dx.cf.code.Frame copy() {
            r4 = this;
            com.android.dx.cf.code.Frame r0 = new com.android.dx.cf.code.Frame
            com.android.dx.cf.code.LocalsArray r1 = r4.locals
            com.android.dx.cf.code.LocalsArray r1 = r1.copy()
            com.android.dx.cf.code.ExecutionStack r2 = r4.stack
            com.android.dx.cf.code.ExecutionStack r2 = r2.copy()
            com.android.dx.util.IntList r3 = r4.subroutines
            r0.<init>(r1, r2, r3)
            return r0
    }

    public com.android.dx.cf.code.LocalsArray getLocals() {
            r1 = this;
            com.android.dx.cf.code.LocalsArray r0 = r1.locals
            return r0
    }

    public com.android.dx.cf.code.ExecutionStack getStack() {
            r1 = this;
            com.android.dx.cf.code.ExecutionStack r0 = r1.stack
            return r0
    }

    public com.android.dx.util.IntList getSubroutines() {
            r1 = this;
            com.android.dx.util.IntList r0 = r1.subroutines
            return r0
    }

    public void initializeWithParameters(com.android.dx.rop.type.StdTypeList r6) {
            r5 = this;
            int r0 = r6.size()
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r0) goto L19
            com.android.dx.rop.type.Type r3 = r6.get(r1)
            com.android.dx.cf.code.LocalsArray r4 = r5.locals
            r4.set(r2, r3)
            int r3 = r3.getCategory()
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L6
        L19:
            return
    }

    public com.android.dx.cf.code.Frame makeExceptionHandlerStartFrame(com.android.dx.rop.cst.CstType r4) {
            r3 = this;
            com.android.dx.cf.code.ExecutionStack r0 = r3.getStack()
            com.android.dx.cf.code.ExecutionStack r0 = r0.copy()
            r0.clear()
            r0.push(r4)
            com.android.dx.cf.code.Frame r4 = new com.android.dx.cf.code.Frame
            com.android.dx.cf.code.LocalsArray r1 = r3.getLocals()
            com.android.dx.util.IntList r2 = r3.subroutines
            r4.<init>(r1, r0, r2)
            return r4
    }

    public void makeInitialized(com.android.dx.rop.type.Type r2) {
            r1 = this;
            com.android.dx.cf.code.LocalsArray r0 = r1.locals
            r0.makeInitialized(r2)
            com.android.dx.cf.code.ExecutionStack r0 = r1.stack
            r0.makeInitialized(r2)
            return
    }

    public com.android.dx.cf.code.Frame makeNewSubroutineStartFrame(int r5, int r6) {
            r4 = this;
            com.android.dx.util.IntList r0 = r4.subroutines
            com.android.dx.util.IntList r0 = r0.mutableCopy()
            r0.add(r5)
            com.android.dx.cf.code.Frame r0 = new com.android.dx.cf.code.Frame
            com.android.dx.cf.code.LocalsArray r1 = r4.locals
            com.android.dx.cf.code.OneLocalsArray r1 = r1.getPrimary()
            com.android.dx.cf.code.ExecutionStack r2 = r4.stack
            com.android.dx.util.IntList r3 = com.android.dx.util.IntList.makeImmutable(r5)
            r0.<init>(r1, r2, r3)
            com.android.dx.cf.code.Frame r5 = r0.mergeWithSubroutineCaller(r4, r5, r6)
            return r5
    }

    public com.android.dx.cf.code.Frame mergeWith(com.android.dx.cf.code.Frame r4) {
            r3 = this;
            com.android.dx.cf.code.LocalsArray r0 = r3.getLocals()
            com.android.dx.cf.code.LocalsArray r1 = r4.getLocals()
            com.android.dx.cf.code.LocalsArray r0 = r0.merge(r1)
            com.android.dx.cf.code.ExecutionStack r1 = r3.getStack()
            com.android.dx.cf.code.ExecutionStack r2 = r4.getStack()
            com.android.dx.cf.code.ExecutionStack r1 = r1.merge(r2)
            com.android.dx.util.IntList r4 = r4.subroutines
            com.android.dx.util.IntList r4 = r3.mergeSubroutineLists(r4)
            com.android.dx.cf.code.LocalsArray r0 = adjustLocalsForSubroutines(r0, r4)
            com.android.dx.cf.code.LocalsArray r2 = r3.getLocals()
            if (r0 != r2) goto L33
            com.android.dx.cf.code.ExecutionStack r2 = r3.getStack()
            if (r1 != r2) goto L33
            com.android.dx.util.IntList r2 = r3.subroutines
            if (r2 != r4) goto L33
            return r3
        L33:
            com.android.dx.cf.code.Frame r2 = new com.android.dx.cf.code.Frame
            r2.<init>(r0, r1, r4)
            return r2
    }

    public com.android.dx.cf.code.Frame mergeWithSubroutineCaller(com.android.dx.cf.code.Frame r8, int r9, int r10) {
            r7 = this;
            com.android.dx.cf.code.LocalsArray r0 = r7.getLocals()
            com.android.dx.cf.code.LocalsArray r1 = r8.getLocals()
            com.android.dx.cf.code.LocalsArraySet r10 = r0.mergeWithSubroutineCaller(r1, r10)
            com.android.dx.cf.code.ExecutionStack r0 = r7.getStack()
            com.android.dx.cf.code.ExecutionStack r1 = r8.getStack()
            com.android.dx.cf.code.ExecutionStack r0 = r0.merge(r1)
            com.android.dx.util.IntList r8 = r8.subroutines
            com.android.dx.util.IntList r8 = r8.mutableCopy()
            r8.add(r9)
            r8.setImmutable()
            com.android.dx.cf.code.LocalsArray r9 = r7.getLocals()
            if (r10 != r9) goto L39
            com.android.dx.cf.code.ExecutionStack r9 = r7.getStack()
            if (r0 != r9) goto L39
            com.android.dx.util.IntList r9 = r7.subroutines
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L39
            return r7
        L39:
            com.android.dx.util.IntList r9 = r7.subroutines
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L44
            com.android.dx.util.IntList r8 = r7.subroutines
            goto L7c
        L44:
            com.android.dx.util.IntList r9 = r7.subroutines
            int r9 = r9.size()
            int r1 = r8.size()
            if (r9 <= r1) goto L56
            com.android.dx.util.IntList r9 = r7.subroutines
            r6 = r9
            r9 = r8
            r8 = r6
            goto L58
        L56:
            com.android.dx.util.IntList r9 = r7.subroutines
        L58:
            int r1 = r8.size()
            int r2 = r9.size()
            int r3 = r2 + (-1)
        L62:
            if (r3 < 0) goto L7c
            int r4 = r9.get(r3)
            int r5 = r1 - r2
            int r5 = r5 + r3
            int r5 = r8.get(r5)
            if (r4 != r5) goto L74
            int r3 = r3 + (-1)
            goto L62
        L74:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Incompatible merged subroutines"
            r8.<init>(r9)
            throw r8
        L7c:
            com.android.dx.cf.code.Frame r9 = new com.android.dx.cf.code.Frame
            r9.<init>(r10, r0, r8)
            return r9
    }

    public void setImmutable() {
            r1 = this;
            com.android.dx.cf.code.LocalsArray r0 = r1.locals
            r0.setImmutable()
            com.android.dx.cf.code.ExecutionStack r0 = r1.stack
            r0.setImmutable()
            return
    }

    public com.android.dx.cf.code.Frame subFrameForLabel(int r5, int r6) {
            r4 = this;
            java.lang.String r0 = "returning from invalid subroutine"
            com.android.dx.cf.code.LocalsArray r1 = r4.locals
            boolean r2 = r1 instanceof com.android.dx.cf.code.LocalsArraySet
            r3 = 0
            if (r2 == 0) goto L10
            com.android.dx.cf.code.LocalsArraySet r1 = (com.android.dx.cf.code.LocalsArraySet) r1
            com.android.dx.cf.code.LocalsArray r6 = r1.subArrayForLabel(r6)
            goto L11
        L10:
            r6 = r3
        L11:
            com.android.dx.util.IntList r1 = r4.subroutines     // Catch: java.lang.NullPointerException -> L31 java.lang.IndexOutOfBoundsException -> L39
            com.android.dx.util.IntList r1 = r1.mutableCopy()     // Catch: java.lang.NullPointerException -> L31 java.lang.IndexOutOfBoundsException -> L39
            int r2 = r1.pop()     // Catch: java.lang.NullPointerException -> L31 java.lang.IndexOutOfBoundsException -> L39
            if (r2 != r5) goto L2b
            r1.setImmutable()     // Catch: java.lang.NullPointerException -> L31 java.lang.IndexOutOfBoundsException -> L39
            if (r6 != 0) goto L23
            goto L2a
        L23:
            com.android.dx.cf.code.Frame r3 = new com.android.dx.cf.code.Frame
            com.android.dx.cf.code.ExecutionStack r5 = r4.stack
            r3.<init>(r6, r5, r1)
        L2a:
            return r3
        L2b:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch: java.lang.NullPointerException -> L31 java.lang.IndexOutOfBoundsException -> L39
            r5.<init>(r0)     // Catch: java.lang.NullPointerException -> L31 java.lang.IndexOutOfBoundsException -> L39
            throw r5     // Catch: java.lang.NullPointerException -> L31 java.lang.IndexOutOfBoundsException -> L39
        L31:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "can't return from non-subroutine"
            r5.<init>(r6)
            throw r5
        L39:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r0)
            throw r5
    }
}
