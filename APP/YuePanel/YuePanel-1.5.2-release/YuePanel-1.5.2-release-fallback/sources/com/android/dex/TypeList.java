package com.android.dex;

/* JADX INFO: loaded from: classes.dex */
public final class TypeList implements java.lang.Comparable<com.android.dex.TypeList> {
    public static final com.android.dex.TypeList EMPTY = null;
    private final com.android.dex.Dex dex;
    private final short[] types;

    static {
            com.android.dex.TypeList r0 = new com.android.dex.TypeList
            r1 = 0
            short[] r2 = com.android.dex.Dex.EMPTY_SHORT_ARRAY
            r0.<init>(r1, r2)
            com.android.dex.TypeList.EMPTY = r0
            return
    }

    public TypeList(com.android.dex.Dex r1, short[] r2) {
            r0 = this;
            r0.<init>()
            r0.dex = r1
            r0.types = r2
            return
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.android.dex.TypeList r5) {
            r4 = this;
            r0 = 0
        L1:
            short[] r1 = r4.types
            int r2 = r1.length
            if (r0 >= r2) goto L19
            short[] r2 = r5.types
            int r3 = r2.length
            if (r0 >= r3) goto L19
            short r1 = r1[r0]
            short r2 = r2[r0]
            if (r1 == r2) goto L16
            int r5 = com.android.dex.util.Unsigned.compare(r1, r2)
            return r5
        L16:
            int r0 = r0 + 1
            goto L1
        L19:
            int r0 = r1.length
            short[] r5 = r5.types
            int r5 = r5.length
            int r5 = com.android.dex.util.Unsigned.compare(r0, r5)
            return r5
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.android.dex.TypeList r1) {
            r0 = this;
            com.android.dex.TypeList r1 = (com.android.dex.TypeList) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public short[] getTypes() {
            r1 = this;
            short[] r0 = r1.types
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "("
            r0.append(r1)
            short[] r1 = r5.types
            int r1 = r1.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L31
            com.android.dex.Dex r3 = r5.dex
            if (r3 == 0) goto L23
            java.util.List r3 = r3.typeNames()
            short[] r4 = r5.types
            short r4 = r4[r2]
            java.lang.Object r3 = r3.get(r4)
            java.io.Serializable r3 = (java.io.Serializable) r3
            goto L2b
        L23:
            short[] r3 = r5.types
            short r3 = r3[r2]
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
        L2b:
            r0.append(r3)
            int r2 = r2 + 1
            goto Le
        L31:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
