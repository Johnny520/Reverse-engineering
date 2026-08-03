package com.android.dx.util;

/* JADX INFO: loaded from: classes.dex */
public class FixedSizeList extends com.android.dx.util.MutabilityControl implements com.android.dx.util.ToHuman {
    private java.lang.Object[] arr;

    public FixedSizeList(int r2) {
            r1 = this;
            if (r2 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            r1.<init>(r0)
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NegativeArraySizeException -> Ld
            r1.arr = r2     // Catch: java.lang.NegativeArraySizeException -> Ld
            return
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size < 0"
            r2.<init>(r0)
            throw r2
    }

    private java.lang.Object throwIndex(int r2) {
            r1 = this;
            if (r2 >= 0) goto La
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "n < 0"
            r2.<init>(r0)
            throw r2
        La:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "n >= size()"
            r2.<init>(r0)
            throw r2
    }

    private java.lang.String toString0(java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7) {
            r3 = this;
            java.lang.Object[] r0 = r3.arr
            int r0 = r0.length
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r0 * 10
            int r2 = r2 + 10
            r1.<init>(r2)
            if (r4 == 0) goto L11
            r1.append(r4)
        L11:
            r4 = 0
        L12:
            if (r4 >= r0) goto L35
            if (r4 == 0) goto L1b
            if (r5 == 0) goto L1b
            r1.append(r5)
        L1b:
            if (r7 == 0) goto L2b
            java.lang.Object[] r2 = r3.arr
            r2 = r2[r4]
            com.android.dx.util.ToHuman r2 = (com.android.dx.util.ToHuman) r2
            java.lang.String r2 = r2.toHuman()
            r1.append(r2)
            goto L32
        L2b:
            java.lang.Object[] r2 = r3.arr
            r2 = r2[r4]
            r1.append(r2)
        L32:
            int r4 = r4 + 1
            goto L12
        L35:
            if (r6 == 0) goto L3a
            r1.append(r6)
        L3a:
            java.lang.String r4 = r1.toString()
            return r4
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1c
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto L11
            goto L1c
        L11:
            com.android.dx.util.FixedSizeList r3 = (com.android.dx.util.FixedSizeList) r3
            java.lang.Object[] r0 = r2.arr
            java.lang.Object[] r3 = r3.arr
            boolean r3 = java.util.Arrays.equals(r0, r3)
            return r3
        L1c:
            r3 = 0
            return r3
    }

    public final java.lang.Object get0(int r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.arr     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1e
            r0 = r0[r4]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1e
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1e
            r1.<init>()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1e
            java.lang.String r2 = "unset: "
            r1.append(r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1e
            r1.append(r4)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1e
            r0.<init>(r1)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1e
            throw r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L1e
        L1e:
            java.lang.Object r4 = r3.throwIndex(r4)
            return r4
    }

    public final java.lang.Object getOrNull0(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.arr
            r2 = r0[r2]
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object[] r0 = r1.arr
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public final void set0(int r2, java.lang.Object r3) {
            r1 = this;
            r1.throwIfImmutable()
            java.lang.Object[] r0 = r1.arr     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8
            r0[r2] = r3     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L8
            goto Lb
        L8:
            r1.throwIndex(r2)
        Lb:
            return
    }

    public void shrinkToFit() {
            r6 = this;
            java.lang.Object[] r0 = r6.arr
            int r0 = r0.length
            r1 = 0
            r2 = r1
            r3 = r2
        L6:
            if (r2 >= r0) goto L13
            java.lang.Object[] r4 = r6.arr
            r4 = r4[r2]
            if (r4 == 0) goto L10
            int r3 = r3 + 1
        L10:
            int r2 = r2 + 1
            goto L6
        L13:
            if (r0 != r3) goto L16
            return
        L16:
            r6.throwIfImmutable()
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r4 = r1
        L1c:
            if (r1 >= r0) goto L2b
            java.lang.Object[] r5 = r6.arr
            r5 = r5[r1]
            if (r5 == 0) goto L28
            r2[r4] = r5
            int r4 = r4 + 1
        L28:
            int r1 = r1 + 1
            goto L1c
        L2b:
            r6.arr = r2
            if (r3 != 0) goto L32
            r6.setImmutable()
        L32:
            return
    }

    public final int size() {
            r1 = this;
            java.lang.Object[] r0 = r1.arr
            int r0 = r0.length
            return r0
    }

    public java.lang.String toHuman() {
            r4 = this;
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 46
            int r2 = r0.lastIndexOf(r2)
            r3 = 1
            int r2 = r2 + r3
            java.lang.String r0 = r0.substring(r2)
            r1.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = ", "
            java.lang.String r2 = "}"
            java.lang.String r0 = r4.toString0(r0, r1, r2, r3)
            return r0
    }

    public java.lang.String toHuman(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 1
            java.lang.String r2 = r1.toString0(r2, r3, r4, r0)
            return r2
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 46
            int r2 = r0.lastIndexOf(r2)
            int r2 = r2 + 1
            java.lang.String r0 = r0.substring(r2)
            r1.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "}"
            r2 = 0
            java.lang.String r3 = ", "
            java.lang.String r0 = r4.toString0(r0, r3, r1, r2)
            return r0
    }

    public java.lang.String toString(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = r1.toString0(r2, r3, r4, r0)
            return r2
    }
}
