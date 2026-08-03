package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public final class StdConstantPool extends com.android.dx.util.MutabilityControl implements com.android.dx.rop.cst.ConstantPool {
    private final com.android.dx.rop.cst.Constant[] entries;

    public StdConstantPool(int r3) {
            r2 = this;
            r0 = 1
            if (r3 <= r0) goto L5
            r1 = r0
            goto L6
        L5:
            r1 = 0
        L6:
            r2.<init>(r1)
            if (r3 < r0) goto L10
            com.android.dx.rop.cst.Constant[] r3 = new com.android.dx.rop.cst.Constant[r3]
            r2.entries = r3
            return
        L10:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size < 1"
            r3.<init>(r0)
            throw r3
    }

    private static com.android.dx.rop.cst.Constant throwInvalid(int r3) {
            com.android.dex.util.ExceptionWithContext r0 = new com.android.dex.util.ExceptionWithContext
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid constant pool index "
            r1.append(r2)
            java.lang.String r3 = com.android.dx.util.Hex.u2(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // com.android.dx.rop.cst.ConstantPool
    public com.android.dx.rop.cst.Constant get(int r2) {
            r1 = this;
            com.android.dx.rop.cst.Constant[] r0 = r1.entries     // Catch: java.lang.IndexOutOfBoundsException -> La
            r0 = r0[r2]     // Catch: java.lang.IndexOutOfBoundsException -> La
            if (r0 != 0) goto L9
            throwInvalid(r2)     // Catch: java.lang.IndexOutOfBoundsException -> La
        L9:
            return r0
        La:
            com.android.dx.rop.cst.Constant r2 = throwInvalid(r2)
            return r2
    }

    @Override // com.android.dx.rop.cst.ConstantPool
    public com.android.dx.rop.cst.Constant get0Ok(int r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            com.android.dx.rop.cst.Constant r1 = r0.get(r1)
            return r1
    }

    @Override // com.android.dx.rop.cst.ConstantPool
    public com.android.dx.rop.cst.Constant[] getEntries() {
            r1 = this;
            com.android.dx.rop.cst.Constant[] r0 = r1.entries
            return r0
    }

    @Override // com.android.dx.rop.cst.ConstantPool
    public com.android.dx.rop.cst.Constant getOrNull(int r2) {
            r1 = this;
            com.android.dx.rop.cst.Constant[] r0 = r1.entries     // Catch: java.lang.IndexOutOfBoundsException -> L5
            r2 = r0[r2]     // Catch: java.lang.IndexOutOfBoundsException -> L5
            return r2
        L5:
            com.android.dx.rop.cst.Constant r2 = throwInvalid(r2)
            return r2
    }

    public void set(int r5, com.android.dx.rop.cst.Constant r6) {
            r4 = this;
            r4.throwIfImmutable()
            r0 = 1
            if (r6 == 0) goto Le
            boolean r1 = r6.isCategory2()
            if (r1 == 0) goto Le
            r1 = r0
            goto Lf
        Le:
            r1 = 0
        Lf:
            if (r5 < r0) goto L44
            r2 = 0
            if (r1 == 0) goto L27
            com.android.dx.rop.cst.Constant[] r1 = r4.entries
            int r3 = r1.length
            int r3 = r3 - r0
            if (r5 == r3) goto L1f
            int r0 = r5 + 1
            r1[r0] = r2
            goto L27
        L1f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "(n == size - 1) && cst.isCategory2()"
            r5.<init>(r6)
            throw r5
        L27:
            if (r6 == 0) goto L3f
            com.android.dx.rop.cst.Constant[] r0 = r4.entries
            r1 = r0[r5]
            if (r1 != 0) goto L3f
            int r1 = r5 + (-1)
            r0 = r0[r1]
            if (r0 == 0) goto L3f
            boolean r0 = r0.isCategory2()
            if (r0 == 0) goto L3f
            com.android.dx.rop.cst.Constant[] r0 = r4.entries
            r0[r1] = r2
        L3f:
            com.android.dx.rop.cst.Constant[] r0 = r4.entries
            r0[r5] = r6
            return
        L44:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "n < 1"
            r5.<init>(r6)
            throw r5
    }

    @Override // com.android.dx.rop.cst.ConstantPool
    public int size() {
            r1 = this;
            com.android.dx.rop.cst.Constant[] r0 = r1.entries
            int r0 = r0.length
            return r0
    }
}
