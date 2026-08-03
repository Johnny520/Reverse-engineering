package com.android.dx.rop.type;

/* JADX INFO: loaded from: classes.dex */
public final class StdTypeList extends com.android.dx.util.FixedSizeList implements com.android.dx.rop.type.TypeList {
    public static final com.android.dx.rop.type.StdTypeList BOOLEANARR_INT = null;
    public static final com.android.dx.rop.type.StdTypeList BYTEARR_INT = null;
    public static final com.android.dx.rop.type.StdTypeList CHARARR_INT = null;
    public static final com.android.dx.rop.type.StdTypeList DOUBLE = null;
    public static final com.android.dx.rop.type.StdTypeList DOUBLEARR_INT = null;
    public static final com.android.dx.rop.type.StdTypeList DOUBLE_DOUBLE = null;
    public static final com.android.dx.rop.type.StdTypeList DOUBLE_DOUBLEARR_INT = null;
    public static final com.android.dx.rop.type.StdTypeList DOUBLE_OBJECT = null;
    public static final com.android.dx.rop.type.StdTypeList EMPTY = null;
    public static final com.android.dx.rop.type.StdTypeList FLOAT = null;
    public static final com.android.dx.rop.type.StdTypeList FLOATARR_INT = null;
    public static final com.android.dx.rop.type.StdTypeList FLOAT_FLOAT = null;
    public static final com.android.dx.rop.type.StdTypeList FLOAT_FLOATARR_INT = null;
    public static final com.android.dx.rop.type.StdTypeList FLOAT_OBJECT = null;
    public static final com.android.dx.rop.type.StdTypeList INT = null;
    public static final com.android.dx.rop.type.StdTypeList INTARR_INT = null;
    public static final com.android.dx.rop.type.StdTypeList INT_BOOLEANARR_INT = null;
    public static final com.android.dx.rop.type.StdTypeList INT_BYTEARR_INT = null;
    public static final com.android.dx.rop.type.StdTypeList INT_CHARARR_INT = null;
    public static final com.android.dx.rop.type.StdTypeList INT_INT = null;
    public static final com.android.dx.rop.type.StdTypeList INT_INTARR_INT = null;
    public static final com.android.dx.rop.type.StdTypeList INT_OBJECT = null;
    public static final com.android.dx.rop.type.StdTypeList INT_SHORTARR_INT = null;
    public static final com.android.dx.rop.type.StdTypeList LONG = null;
    public static final com.android.dx.rop.type.StdTypeList LONGARR_INT = null;
    public static final com.android.dx.rop.type.StdTypeList LONG_INT = null;
    public static final com.android.dx.rop.type.StdTypeList LONG_LONG = null;
    public static final com.android.dx.rop.type.StdTypeList LONG_LONGARR_INT = null;
    public static final com.android.dx.rop.type.StdTypeList LONG_OBJECT = null;
    public static final com.android.dx.rop.type.StdTypeList OBJECT = null;
    public static final com.android.dx.rop.type.StdTypeList OBJECTARR_INT = null;
    public static final com.android.dx.rop.type.StdTypeList OBJECT_OBJECT = null;
    public static final com.android.dx.rop.type.StdTypeList OBJECT_OBJECTARR_INT = null;
    public static final com.android.dx.rop.type.StdTypeList RETURN_ADDRESS = null;
    public static final com.android.dx.rop.type.StdTypeList SHORTARR_INT = null;
    public static final com.android.dx.rop.type.StdTypeList THROWABLE = null;

    static {
            com.android.dx.rop.type.StdTypeList r0 = new com.android.dx.rop.type.StdTypeList
            r1 = 0
            r0.<init>(r1)
            com.android.dx.rop.type.StdTypeList.EMPTY = r0
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.INT
            com.android.dx.rop.type.StdTypeList r1 = make(r0)
            com.android.dx.rop.type.StdTypeList.INT = r1
            com.android.dx.rop.type.Type r1 = com.android.dx.rop.type.Type.LONG
            com.android.dx.rop.type.StdTypeList r2 = make(r1)
            com.android.dx.rop.type.StdTypeList.LONG = r2
            com.android.dx.rop.type.Type r2 = com.android.dx.rop.type.Type.FLOAT
            com.android.dx.rop.type.StdTypeList r3 = make(r2)
            com.android.dx.rop.type.StdTypeList.FLOAT = r3
            com.android.dx.rop.type.Type r3 = com.android.dx.rop.type.Type.DOUBLE
            com.android.dx.rop.type.StdTypeList r4 = make(r3)
            com.android.dx.rop.type.StdTypeList.DOUBLE = r4
            com.android.dx.rop.type.Type r4 = com.android.dx.rop.type.Type.OBJECT
            com.android.dx.rop.type.StdTypeList r5 = make(r4)
            com.android.dx.rop.type.StdTypeList.OBJECT = r5
            com.android.dx.rop.type.Type r5 = com.android.dx.rop.type.Type.RETURN_ADDRESS
            com.android.dx.rop.type.StdTypeList r5 = make(r5)
            com.android.dx.rop.type.StdTypeList.RETURN_ADDRESS = r5
            com.android.dx.rop.type.Type r5 = com.android.dx.rop.type.Type.THROWABLE
            com.android.dx.rop.type.StdTypeList r5 = make(r5)
            com.android.dx.rop.type.StdTypeList.THROWABLE = r5
            com.android.dx.rop.type.StdTypeList r5 = make(r0, r0)
            com.android.dx.rop.type.StdTypeList.INT_INT = r5
            com.android.dx.rop.type.StdTypeList r5 = make(r1, r1)
            com.android.dx.rop.type.StdTypeList.LONG_LONG = r5
            com.android.dx.rop.type.StdTypeList r5 = make(r2, r2)
            com.android.dx.rop.type.StdTypeList.FLOAT_FLOAT = r5
            com.android.dx.rop.type.StdTypeList r5 = make(r3, r3)
            com.android.dx.rop.type.StdTypeList.DOUBLE_DOUBLE = r5
            com.android.dx.rop.type.StdTypeList r5 = make(r4, r4)
            com.android.dx.rop.type.StdTypeList.OBJECT_OBJECT = r5
            com.android.dx.rop.type.StdTypeList r5 = make(r0, r4)
            com.android.dx.rop.type.StdTypeList.INT_OBJECT = r5
            com.android.dx.rop.type.StdTypeList r5 = make(r1, r4)
            com.android.dx.rop.type.StdTypeList.LONG_OBJECT = r5
            com.android.dx.rop.type.StdTypeList r5 = make(r2, r4)
            com.android.dx.rop.type.StdTypeList.FLOAT_OBJECT = r5
            com.android.dx.rop.type.StdTypeList r5 = make(r3, r4)
            com.android.dx.rop.type.StdTypeList.DOUBLE_OBJECT = r5
            com.android.dx.rop.type.StdTypeList r5 = make(r1, r0)
            com.android.dx.rop.type.StdTypeList.LONG_INT = r5
            com.android.dx.rop.type.Type r5 = com.android.dx.rop.type.Type.INT_ARRAY
            com.android.dx.rop.type.StdTypeList r6 = make(r5, r0)
            com.android.dx.rop.type.StdTypeList.INTARR_INT = r6
            com.android.dx.rop.type.Type r6 = com.android.dx.rop.type.Type.LONG_ARRAY
            com.android.dx.rop.type.StdTypeList r7 = make(r6, r0)
            com.android.dx.rop.type.StdTypeList.LONGARR_INT = r7
            com.android.dx.rop.type.Type r7 = com.android.dx.rop.type.Type.FLOAT_ARRAY
            com.android.dx.rop.type.StdTypeList r8 = make(r7, r0)
            com.android.dx.rop.type.StdTypeList.FLOATARR_INT = r8
            com.android.dx.rop.type.Type r8 = com.android.dx.rop.type.Type.DOUBLE_ARRAY
            com.android.dx.rop.type.StdTypeList r9 = make(r8, r0)
            com.android.dx.rop.type.StdTypeList.DOUBLEARR_INT = r9
            com.android.dx.rop.type.Type r9 = com.android.dx.rop.type.Type.OBJECT_ARRAY
            com.android.dx.rop.type.StdTypeList r10 = make(r9, r0)
            com.android.dx.rop.type.StdTypeList.OBJECTARR_INT = r10
            com.android.dx.rop.type.Type r10 = com.android.dx.rop.type.Type.BOOLEAN_ARRAY
            com.android.dx.rop.type.StdTypeList r11 = make(r10, r0)
            com.android.dx.rop.type.StdTypeList.BOOLEANARR_INT = r11
            com.android.dx.rop.type.Type r11 = com.android.dx.rop.type.Type.BYTE_ARRAY
            com.android.dx.rop.type.StdTypeList r12 = make(r11, r0)
            com.android.dx.rop.type.StdTypeList.BYTEARR_INT = r12
            com.android.dx.rop.type.Type r12 = com.android.dx.rop.type.Type.CHAR_ARRAY
            com.android.dx.rop.type.StdTypeList r13 = make(r12, r0)
            com.android.dx.rop.type.StdTypeList.CHARARR_INT = r13
            com.android.dx.rop.type.Type r13 = com.android.dx.rop.type.Type.SHORT_ARRAY
            com.android.dx.rop.type.StdTypeList r14 = make(r13, r0)
            com.android.dx.rop.type.StdTypeList.SHORTARR_INT = r14
            com.android.dx.rop.type.StdTypeList r5 = make(r0, r5, r0)
            com.android.dx.rop.type.StdTypeList.INT_INTARR_INT = r5
            com.android.dx.rop.type.StdTypeList r1 = make(r1, r6, r0)
            com.android.dx.rop.type.StdTypeList.LONG_LONGARR_INT = r1
            com.android.dx.rop.type.StdTypeList r1 = make(r2, r7, r0)
            com.android.dx.rop.type.StdTypeList.FLOAT_FLOATARR_INT = r1
            com.android.dx.rop.type.StdTypeList r1 = make(r3, r8, r0)
            com.android.dx.rop.type.StdTypeList.DOUBLE_DOUBLEARR_INT = r1
            com.android.dx.rop.type.StdTypeList r1 = make(r4, r9, r0)
            com.android.dx.rop.type.StdTypeList.OBJECT_OBJECTARR_INT = r1
            com.android.dx.rop.type.StdTypeList r1 = make(r0, r10, r0)
            com.android.dx.rop.type.StdTypeList.INT_BOOLEANARR_INT = r1
            com.android.dx.rop.type.StdTypeList r1 = make(r0, r11, r0)
            com.android.dx.rop.type.StdTypeList.INT_BYTEARR_INT = r1
            com.android.dx.rop.type.StdTypeList r1 = make(r0, r12, r0)
            com.android.dx.rop.type.StdTypeList.INT_CHARARR_INT = r1
            com.android.dx.rop.type.StdTypeList r0 = make(r0, r13, r0)
            com.android.dx.rop.type.StdTypeList.INT_SHORTARR_INT = r0
            return
    }

    public StdTypeList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static int compareContents(com.android.dx.rop.type.TypeList r7, com.android.dx.rop.type.TypeList r8) {
            int r0 = r7.size()
            int r1 = r8.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        Le:
            if (r4 >= r2) goto L22
            com.android.dx.rop.type.Type r5 = r7.getType(r4)
            com.android.dx.rop.type.Type r6 = r8.getType(r4)
            int r5 = r5.compareTo2(r6)
            if (r5 == 0) goto L1f
            return r5
        L1f:
            int r4 = r4 + 1
            goto Le
        L22:
            if (r0 != r1) goto L25
            return r3
        L25:
            if (r0 >= r1) goto L29
            r7 = -1
            return r7
        L29:
            r7 = 1
            return r7
    }

    public static boolean equalContents(com.android.dx.rop.type.TypeList r5, com.android.dx.rop.type.TypeList r6) {
            int r0 = r5.size()
            int r1 = r6.size()
            r2 = 0
            if (r1 == r0) goto Lc
            return r2
        Lc:
            r1 = r2
        Ld:
            if (r1 >= r0) goto L21
            com.android.dx.rop.type.Type r3 = r5.getType(r1)
            com.android.dx.rop.type.Type r4 = r6.getType(r1)
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1e
            return r2
        L1e:
            int r1 = r1 + 1
            goto Ld
        L21:
            r5 = 1
            return r5
    }

    public static int hashContents(com.android.dx.rop.type.TypeList r4) {
            int r0 = r4.size()
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r0) goto L16
            int r2 = r2 * 31
            com.android.dx.rop.type.Type r3 = r4.getType(r1)
            int r3 = r3.hashCode()
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L6
        L16:
            return r2
    }

    public static com.android.dx.rop.type.StdTypeList make(com.android.dx.rop.type.Type r2) {
            com.android.dx.rop.type.StdTypeList r0 = new com.android.dx.rop.type.StdTypeList
            r1 = 1
            r0.<init>(r1)
            r1 = 0
            r0.set(r1, r2)
            return r0
    }

    public static com.android.dx.rop.type.StdTypeList make(com.android.dx.rop.type.Type r2, com.android.dx.rop.type.Type r3) {
            com.android.dx.rop.type.StdTypeList r0 = new com.android.dx.rop.type.StdTypeList
            r1 = 2
            r0.<init>(r1)
            r1 = 0
            r0.set(r1, r2)
            r2 = 1
            r0.set(r2, r3)
            return r0
    }

    public static com.android.dx.rop.type.StdTypeList make(com.android.dx.rop.type.Type r2, com.android.dx.rop.type.Type r3, com.android.dx.rop.type.Type r4) {
            com.android.dx.rop.type.StdTypeList r0 = new com.android.dx.rop.type.StdTypeList
            r1 = 3
            r0.<init>(r1)
            r1 = 0
            r0.set(r1, r2)
            r2 = 1
            r0.set(r2, r3)
            r2 = 2
            r0.set(r2, r4)
            return r0
    }

    public static com.android.dx.rop.type.StdTypeList make(com.android.dx.rop.type.Type r2, com.android.dx.rop.type.Type r3, com.android.dx.rop.type.Type r4, com.android.dx.rop.type.Type r5) {
            com.android.dx.rop.type.StdTypeList r0 = new com.android.dx.rop.type.StdTypeList
            r1 = 4
            r0.<init>(r1)
            r1 = 0
            r0.set(r1, r2)
            r2 = 1
            r0.set(r2, r3)
            r2 = 2
            r0.set(r2, r4)
            r2 = 3
            r0.set(r2, r5)
            return r0
    }

    public static java.lang.String toHuman(com.android.dx.rop.type.TypeList r4) {
            int r0 = r4.size()
            if (r0 != 0) goto L9
            java.lang.String r4 = "<empty>"
            return r4
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 100
            r1.<init>(r2)
            r2 = 0
        L11:
            if (r2 >= r0) goto L28
            if (r2 == 0) goto L1a
            java.lang.String r3 = ", "
            r1.append(r3)
        L1a:
            com.android.dx.rop.type.Type r3 = r4.getType(r2)
            java.lang.String r3 = r3.toHuman()
            r1.append(r3)
            int r2 = r2 + 1
            goto L11
        L28:
            java.lang.String r4 = r1.toString()
            return r4
    }

    public com.android.dx.rop.type.Type get(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get0(r1)
            com.android.dx.rop.type.Type r1 = (com.android.dx.rop.type.Type) r1
            return r1
    }

    @Override // com.android.dx.rop.type.TypeList
    public com.android.dx.rop.type.Type getType(int r1) {
            r0 = this;
            com.android.dx.rop.type.Type r1 = r0.get(r1)
            return r1
    }

    @Override // com.android.dx.rop.type.TypeList
    public int getWordCount() {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r0) goto L14
            com.android.dx.rop.type.Type r3 = r4.get(r1)
            int r3 = r3.getCategory()
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L6
        L14:
            return r2
    }

    public void set(int r1, com.android.dx.rop.type.Type r2) {
            r0 = this;
            r0.set0(r1, r2)
            return
    }

    @Override // com.android.dx.rop.type.TypeList
    public com.android.dx.rop.type.TypeList withAddedType(com.android.dx.rop.type.Type r5) {
            r4 = this;
            int r0 = r4.size()
            com.android.dx.rop.type.StdTypeList r1 = new com.android.dx.rop.type.StdTypeList
            int r2 = r0 + 1
            r1.<init>(r2)
            r2 = 0
        Lc:
            if (r2 >= r0) goto L18
            java.lang.Object r3 = r4.get0(r2)
            r1.set0(r2, r3)
            int r2 = r2 + 1
            goto Lc
        L18:
            r1.set(r0, r5)
            r1.setImmutable()
            return r1
    }

    public com.android.dx.rop.type.StdTypeList withFirst(com.android.dx.rop.type.Type r4) {
            r3 = this;
            int r0 = r3.size()
            com.android.dx.rop.type.StdTypeList r1 = new com.android.dx.rop.type.StdTypeList
            int r2 = r0 + 1
            r1.<init>(r2)
            r2 = 0
            r1.set0(r2, r4)
        Lf:
            if (r2 >= r0) goto L1c
            int r4 = r2 + 1
            java.lang.Object r2 = r3.getOrNull0(r2)
            r1.set0(r4, r2)
            r2 = r4
            goto Lf
        L1c:
            return r1
    }
}
