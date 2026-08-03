package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public final class ExecutionStack extends com.android.dx.util.MutabilityControl {
    private final boolean[] local;
    private final com.android.dx.rop.type.TypeBearer[] stack;
    private int stackPtr;

    public ExecutionStack(int r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r2.<init>(r1)
            com.android.dx.rop.type.TypeBearer[] r1 = new com.android.dx.rop.type.TypeBearer[r3]
            r2.stack = r1
            boolean[] r3 = new boolean[r3]
            r2.local = r3
            r2.stackPtr = r0
            return
    }

    private static java.lang.String stackElementString(com.android.dx.rop.type.TypeBearer r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = "<invalid>"
            return r0
        L5:
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static com.android.dx.rop.type.TypeBearer throwSimException(java.lang.String r3) {
            com.android.dx.cf.code.SimException r0 = new com.android.dx.cf.code.SimException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "stack: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public void annotate(com.android.dex.util.ExceptionWithContext r6) {
            r5 = this;
            int r0 = r5.stackPtr
            int r0 = r0 + (-1)
            r1 = 0
        L5:
            if (r1 > r0) goto L39
            if (r1 != r0) goto Lc
            java.lang.String r2 = "top0"
            goto L12
        Lc:
            int r2 = r0 - r1
            java.lang.String r2 = com.android.dx.util.Hex.u2(r2)
        L12:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "stack["
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = "]: "
            r3.append(r2)
            com.android.dx.rop.type.TypeBearer[] r2 = r5.stack
            r2 = r2[r1]
            java.lang.String r2 = stackElementString(r2)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r6.addContext(r2)
            int r1 = r1 + 1
            goto L5
        L39:
            return
    }

    public void change(int r4, com.android.dx.rop.type.TypeBearer r5) {
            r3 = this;
            r3.throwIfImmutable()
            com.android.dx.rop.type.TypeBearer r5 = r5.getFrameType()     // Catch: java.lang.NullPointerException -> L4d
            int r0 = r3.stackPtr
            int r0 = r0 - r4
            int r0 = r0 + (-1)
            com.android.dx.rop.type.TypeBearer[] r4 = r3.stack
            r4 = r4[r0]
            if (r4 == 0) goto L24
            com.android.dx.rop.type.Type r1 = r4.getType()
            int r1 = r1.getCategory()
            com.android.dx.rop.type.Type r2 = r5.getType()
            int r2 = r2.getCategory()
            if (r1 == r2) goto L48
        L24:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "incompatible substitution: "
            r1.append(r2)
            java.lang.String r4 = stackElementString(r4)
            r1.append(r4)
            java.lang.String r4 = " -> "
            r1.append(r4)
            java.lang.String r4 = stackElementString(r5)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            throwSimException(r4)
        L48:
            com.android.dx.rop.type.TypeBearer[] r4 = r3.stack
            r4[r0] = r5
            return
        L4d:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "type == null"
            r4.<init>(r5)
            throw r4
    }

    public void clear() {
            r4 = this;
            r4.throwIfImmutable()
            r0 = 0
            r1 = r0
        L5:
            int r2 = r4.stackPtr
            if (r1 >= r2) goto L15
            com.android.dx.rop.type.TypeBearer[] r2 = r4.stack
            r3 = 0
            r2[r1] = r3
            boolean[] r2 = r4.local
            r2[r1] = r0
            int r1 = r1 + 1
            goto L5
        L15:
            r4.stackPtr = r0
            return
    }

    public com.android.dx.cf.code.ExecutionStack copy() {
            r5 = this;
            com.android.dx.cf.code.ExecutionStack r0 = new com.android.dx.cf.code.ExecutionStack
            com.android.dx.rop.type.TypeBearer[] r1 = r5.stack
            int r1 = r1.length
            r0.<init>(r1)
            com.android.dx.rop.type.TypeBearer[] r1 = r5.stack
            com.android.dx.rop.type.TypeBearer[] r2 = r0.stack
            int r3 = r1.length
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r2, r4, r3)
            boolean[] r1 = r5.local
            boolean[] r2 = r0.local
            int r3 = r1.length
            java.lang.System.arraycopy(r1, r4, r2, r4, r3)
            int r1 = r5.stackPtr
            r0.stackPtr = r1
            return r0
    }

    public int getMaxStack() {
            r1 = this;
            com.android.dx.rop.type.TypeBearer[] r0 = r1.stack
            int r0 = r0.length
            return r0
    }

    public void makeInitialized(com.android.dx.rop.type.Type r5) {
            r4 = this;
            int r0 = r4.stackPtr
            if (r0 != 0) goto L5
            return
        L5:
            r4.throwIfImmutable()
            com.android.dx.rop.type.Type r0 = r5.getInitializedType()
            r1 = 0
        Ld:
            int r2 = r4.stackPtr
            if (r1 >= r2) goto L1c
            com.android.dx.rop.type.TypeBearer[] r2 = r4.stack
            r3 = r2[r1]
            if (r3 != r5) goto L19
            r2[r1] = r0
        L19:
            int r1 = r1 + 1
            goto Ld
        L1c:
            return
    }

    public com.android.dx.cf.code.ExecutionStack merge(com.android.dx.cf.code.ExecutionStack r3) {
            r2 = this;
            com.android.dx.cf.code.ExecutionStack r3 = com.android.dx.cf.code.Merger.mergeStack(r2, r3)     // Catch: com.android.dx.cf.code.SimException -> L5
            return r3
        L5:
            r0 = move-exception
            java.lang.String r1 = "underlay stack:"
            r0.addContext(r1)
            r2.annotate(r0)
            java.lang.String r1 = "overlay stack:"
            r0.addContext(r1)
            r3.annotate(r0)
            throw r0
    }

    public com.android.dx.rop.type.TypeBearer peek(int r3) {
            r2 = this;
            if (r3 < 0) goto L15
            int r0 = r2.stackPtr
            if (r3 < r0) goto Ld
            java.lang.String r3 = "underflow"
            com.android.dx.rop.type.TypeBearer r3 = throwSimException(r3)
            return r3
        Ld:
            com.android.dx.rop.type.TypeBearer[] r1 = r2.stack
            int r0 = r0 - r3
            int r0 = r0 + (-1)
            r3 = r1[r0]
            return r3
        L15:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "n < 0"
            r3.<init>(r0)
            throw r3
    }

    public boolean peekLocal(int r3) {
            r2 = this;
            if (r3 < 0) goto L16
            int r0 = r2.stackPtr
            if (r3 >= r0) goto Le
            boolean[] r1 = r2.local
            int r0 = r0 - r3
            int r0 = r0 + (-1)
            boolean r3 = r1[r0]
            return r3
        Le:
            com.android.dx.cf.code.SimException r3 = new com.android.dx.cf.code.SimException
            java.lang.String r0 = "stack: underflow"
            r3.<init>(r0)
            throw r3
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "n < 0"
            r3.<init>(r0)
            throw r3
    }

    public com.android.dx.rop.type.Type peekType(int r1) {
            r0 = this;
            com.android.dx.rop.type.TypeBearer r1 = r0.peek(r1)
            com.android.dx.rop.type.Type r1 = r1.getType()
            return r1
    }

    public com.android.dx.rop.type.TypeBearer pop() {
            r6 = this;
            r6.throwIfImmutable()
            r0 = 0
            com.android.dx.rop.type.TypeBearer r1 = r6.peek(r0)
            com.android.dx.rop.type.TypeBearer[] r2 = r6.stack
            int r3 = r6.stackPtr
            int r4 = r3 + (-1)
            r5 = 0
            r2[r4] = r5
            boolean[] r2 = r6.local
            int r4 = r3 + (-1)
            r2[r4] = r0
            com.android.dx.rop.type.Type r0 = r1.getType()
            int r0 = r0.getCategory()
            int r3 = r3 - r0
            r6.stackPtr = r3
            return r1
    }

    public void push(com.android.dx.rop.type.TypeBearer r6) {
            r5 = this;
            r5.throwIfImmutable()
            com.android.dx.rop.type.TypeBearer r6 = r6.getFrameType()     // Catch: java.lang.NullPointerException -> L31
            com.android.dx.rop.type.Type r0 = r6.getType()     // Catch: java.lang.NullPointerException -> L31
            int r0 = r0.getCategory()     // Catch: java.lang.NullPointerException -> L31
            int r1 = r5.stackPtr
            int r2 = r1 + r0
            com.android.dx.rop.type.TypeBearer[] r3 = r5.stack
            int r4 = r3.length
            if (r2 <= r4) goto L1e
            java.lang.String r6 = "overflow"
            throwSimException(r6)
            return
        L1e:
            r2 = 2
            if (r0 != r2) goto L28
            r0 = 0
            r3[r1] = r0
            int r1 = r1 + 1
            r5.stackPtr = r1
        L28:
            int r0 = r5.stackPtr
            r3[r0] = r6
            int r0 = r0 + 1
            r5.stackPtr = r0
            return
        L31:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "type == null"
            r6.<init>(r0)
            throw r6
    }

    public void setLocal() {
            r3 = this;
            r3.throwIfImmutable()
            boolean[] r0 = r3.local
            int r1 = r3.stackPtr
            r2 = 1
            r0[r1] = r2
            return
    }

    public int size() {
            r1 = this;
            int r0 = r1.stackPtr
            return r0
    }
}
