package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public final class RegisterSpecSet extends com.android.dx.util.MutabilityControl {
    public static final com.android.dx.rop.code.RegisterSpecSet EMPTY = null;
    private int size;
    private final com.android.dx.rop.code.RegisterSpec[] specs;

    static {
            com.android.dx.rop.code.RegisterSpecSet r0 = new com.android.dx.rop.code.RegisterSpecSet
            r1 = 0
            r0.<init>(r1)
            com.android.dx.rop.code.RegisterSpecSet.EMPTY = r0
            return
    }

    public RegisterSpecSet(int r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r2.<init>(r1)
            com.android.dx.rop.code.RegisterSpec[] r3 = new com.android.dx.rop.code.RegisterSpec[r3]
            r2.specs = r3
            r2.size = r0
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            boolean r0 = r6 instanceof com.android.dx.rop.code.RegisterSpecSet
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.android.dx.rop.code.RegisterSpecSet r6 = (com.android.dx.rop.code.RegisterSpecSet) r6
            com.android.dx.rop.code.RegisterSpec[] r0 = r6.specs
            com.android.dx.rop.code.RegisterSpec[] r2 = r5.specs
            int r2 = r2.length
            int r3 = r0.length
            if (r2 != r3) goto L36
            int r3 = r5.size()
            int r6 = r6.size()
            if (r3 == r6) goto L1b
            goto L36
        L1b:
            r6 = r1
        L1c:
            if (r6 >= r2) goto L34
            com.android.dx.rop.code.RegisterSpec[] r3 = r5.specs
            r3 = r3[r6]
            r4 = r0[r6]
            if (r3 != r4) goto L27
            goto L30
        L27:
            if (r3 == 0) goto L33
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L30
            goto L33
        L30:
            int r6 = r6 + 1
            goto L1c
        L33:
            return r1
        L34:
            r6 = 1
            return r6
        L36:
            return r1
    }

    public com.android.dx.rop.code.RegisterSpec findMatchingLocal(com.android.dx.rop.code.RegisterSpec r5) {
            r4 = this;
            com.android.dx.rop.code.RegisterSpec[] r0 = r4.specs
            int r0 = r0.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L17
            com.android.dx.rop.code.RegisterSpec[] r2 = r4.specs
            r2 = r2[r1]
            if (r2 != 0) goto Ld
            goto L14
        Ld:
            boolean r3 = r5.matchesVariable(r2)
            if (r3 == 0) goto L14
            return r2
        L14:
            int r1 = r1 + 1
            goto L4
        L17:
            r5 = 0
            return r5
    }

    public com.android.dx.rop.code.RegisterSpec get(int r2) {
            r1 = this;
            com.android.dx.rop.code.RegisterSpec[] r0 = r1.specs     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L5
            r2 = r0[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L5
            return r2
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bogus reg"
            r2.<init>(r0)
            throw r2
    }

    public com.android.dx.rop.code.RegisterSpec get(com.android.dx.rop.code.RegisterSpec r1) {
            r0 = this;
            int r1 = r1.getReg()
            com.android.dx.rop.code.RegisterSpec r1 = r0.get(r1)
            return r1
    }

    public int getMaxSize() {
            r1 = this;
            com.android.dx.rop.code.RegisterSpec[] r0 = r1.specs
            int r0 = r0.length
            return r0
    }

    public int hashCode() {
            r5 = this;
            com.android.dx.rop.code.RegisterSpec[] r0 = r5.specs
            int r0 = r0.length
            r1 = 0
            r2 = r1
            r3 = r2
        L6:
            if (r2 >= r0) goto L1a
            com.android.dx.rop.code.RegisterSpec[] r4 = r5.specs
            r4 = r4[r2]
            if (r4 != 0) goto L10
            r4 = r1
            goto L14
        L10:
            int r4 = r4.hashCode()
        L14:
            int r3 = r3 * 31
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L6
        L1a:
            return r3
    }

    public void intersect(com.android.dx.rop.code.RegisterSpecSet r6, boolean r7) {
            r5 = this;
            r5.throwIfImmutable()
            com.android.dx.rop.code.RegisterSpec[] r6 = r6.specs
            com.android.dx.rop.code.RegisterSpec[] r0 = r5.specs
            int r0 = r0.length
            int r1 = r6.length
            int r1 = java.lang.Math.min(r0, r1)
            r2 = -1
            r5.size = r2
            r2 = 0
        L11:
            if (r2 >= r1) goto L29
            com.android.dx.rop.code.RegisterSpec[] r3 = r5.specs
            r3 = r3[r2]
            if (r3 != 0) goto L1a
            goto L26
        L1a:
            r4 = r6[r2]
            com.android.dx.rop.code.RegisterSpec r4 = r3.intersect(r4, r7)
            if (r4 == r3) goto L26
            com.android.dx.rop.code.RegisterSpec[] r3 = r5.specs
            r3[r2] = r4
        L26:
            int r2 = r2 + 1
            goto L11
        L29:
            if (r1 >= r0) goto L33
            com.android.dx.rop.code.RegisterSpec[] r6 = r5.specs
            r7 = 0
            r6[r1] = r7
            int r1 = r1 + 1
            goto L29
        L33:
            return
    }

    public com.android.dx.rop.code.RegisterSpec localItemToSpec(com.android.dx.rop.code.LocalItem r5) {
            r4 = this;
            com.android.dx.rop.code.RegisterSpec[] r0 = r4.specs
            int r0 = r0.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L1a
            com.android.dx.rop.code.RegisterSpec[] r2 = r4.specs
            r2 = r2[r1]
            if (r2 == 0) goto L17
            com.android.dx.rop.code.LocalItem r3 = r2.getLocalItem()
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L17
            return r2
        L17:
            int r1 = r1 + 1
            goto L4
        L1a:
            r5 = 0
            return r5
    }

    public com.android.dx.rop.code.RegisterSpecSet mutableCopy() {
            r4 = this;
            com.android.dx.rop.code.RegisterSpec[] r0 = r4.specs
            int r0 = r0.length
            com.android.dx.rop.code.RegisterSpecSet r1 = new com.android.dx.rop.code.RegisterSpecSet
            r1.<init>(r0)
            r2 = 0
        L9:
            if (r2 >= r0) goto L17
            com.android.dx.rop.code.RegisterSpec[] r3 = r4.specs
            r3 = r3[r2]
            if (r3 == 0) goto L14
            r1.put(r3)
        L14:
            int r2 = r2 + 1
            goto L9
        L17:
            int r0 = r4.size
            r1.size = r0
            return r1
    }

    public void put(com.android.dx.rop.code.RegisterSpec r6) {
            r5 = this;
            r5.throwIfImmutable()
            if (r6 == 0) goto L39
            r0 = -1
            r5.size = r0
            int r0 = r6.getReg()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L31
            com.android.dx.rop.code.RegisterSpec[] r1 = r5.specs     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L31
            r1[r0] = r6     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L31
            r2 = 0
            r3 = 2
            if (r0 <= 0) goto L24
            int r4 = r0 + (-1)
            r1 = r1[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L31
            if (r1 == 0) goto L24
            int r1 = r1.getCategory()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L31
            if (r1 != r3) goto L24
            com.android.dx.rop.code.RegisterSpec[] r1 = r5.specs     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L31
            r1[r4] = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L31
        L24:
            int r6 = r6.getCategory()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L31
            if (r6 != r3) goto L30
            com.android.dx.rop.code.RegisterSpec[] r6 = r5.specs     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L31
            int r0 = r0 + 1
            r6[r0] = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L31
        L30:
            return
        L31:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "spec.getReg() out of range"
            r6.<init>(r0)
            throw r6
        L39:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "spec == null"
            r6.<init>(r0)
            throw r6
    }

    public void putAll(com.android.dx.rop.code.RegisterSpecSet r4) {
            r3 = this;
            int r0 = r4.getMaxSize()
            r1 = 0
        L5:
            if (r1 >= r0) goto L13
            com.android.dx.rop.code.RegisterSpec r2 = r4.get(r1)
            if (r2 == 0) goto L10
            r3.put(r2)
        L10:
            int r1 = r1 + 1
            goto L5
        L13:
            return
    }

    public void remove(com.android.dx.rop.code.RegisterSpec r3) {
            r2 = this;
            com.android.dx.rop.code.RegisterSpec[] r0 = r2.specs     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld
            int r3 = r3.getReg()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld
            r1 = 0
            r0[r3] = r1     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld
            r3 = -1
            r2.size = r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Ld
            return
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bogus reg"
            r3.<init>(r0)
            throw r3
    }

    public int size() {
            r4 = this;
            int r0 = r4.size
            if (r0 >= 0) goto L19
            com.android.dx.rop.code.RegisterSpec[] r0 = r4.specs
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L9:
            if (r2 >= r0) goto L16
            com.android.dx.rop.code.RegisterSpec[] r3 = r4.specs
            r3 = r3[r2]
            if (r3 == 0) goto L13
            int r1 = r1 + 1
        L13:
            int r2 = r2 + 1
            goto L9
        L16:
            r4.size = r1
            r0 = r1
        L19:
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            com.android.dx.rop.code.RegisterSpec[] r0 = r6.specs
            int r0 = r0.length
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r0 * 25
            r1.<init>(r2)
            r2 = 123(0x7b, float:1.72E-43)
            r1.append(r2)
            r2 = 0
            r3 = r2
        L11:
            if (r2 >= r0) goto L28
            com.android.dx.rop.code.RegisterSpec[] r4 = r6.specs
            r4 = r4[r2]
            if (r4 == 0) goto L25
            if (r3 == 0) goto L21
            java.lang.String r5 = ", "
            r1.append(r5)
            goto L22
        L21:
            r3 = 1
        L22:
            r1.append(r4)
        L25:
            int r2 = r2 + 1
            goto L11
        L28:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public com.android.dx.rop.code.RegisterSpecSet withOffset(int r5) {
            r4 = this;
            com.android.dx.rop.code.RegisterSpec[] r0 = r4.specs
            int r0 = r0.length
            com.android.dx.rop.code.RegisterSpecSet r1 = new com.android.dx.rop.code.RegisterSpecSet
            int r2 = r0 + r5
            r1.<init>(r2)
            r2 = 0
        Lb:
            if (r2 >= r0) goto L1d
            com.android.dx.rop.code.RegisterSpec[] r3 = r4.specs
            r3 = r3[r2]
            if (r3 == 0) goto L1a
            com.android.dx.rop.code.RegisterSpec r3 = r3.withOffset(r5)
            r1.put(r3)
        L1a:
            int r2 = r2 + 1
            goto Lb
        L1d:
            int r5 = r4.size
            r1.size = r5
            boolean r5 = r4.isImmutable()
            if (r5 == 0) goto L2a
            r1.setImmutable()
        L2a:
            return r1
    }
}
