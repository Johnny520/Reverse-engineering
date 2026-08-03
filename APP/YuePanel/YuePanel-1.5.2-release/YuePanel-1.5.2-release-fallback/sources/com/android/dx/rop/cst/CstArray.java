package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public class CstArray extends com.android.dx.rop.cst.Constant {
    private final com.android.dx.rop.cst.CstArray.List list;

    public static final class List extends com.android.dx.util.FixedSizeList implements java.lang.Comparable<com.android.dx.rop.cst.CstArray.List> {
        public List(int r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(com.android.dx.rop.cst.CstArray.List r8) {
                r7 = this;
                int r0 = r7.size()
                int r1 = r8.size()
                if (r0 >= r1) goto Lc
                r2 = r0
                goto Ld
            Lc:
                r2 = r1
            Ld:
                r3 = 0
                r4 = r3
            Lf:
                if (r4 >= r2) goto L27
                java.lang.Object r5 = r7.get0(r4)
                com.android.dx.rop.cst.Constant r5 = (com.android.dx.rop.cst.Constant) r5
                java.lang.Object r6 = r8.get0(r4)
                com.android.dx.rop.cst.Constant r6 = (com.android.dx.rop.cst.Constant) r6
                int r5 = r5.compareTo2(r6)
                if (r5 == 0) goto L24
                return r5
            L24:
                int r4 = r4 + 1
                goto Lf
            L27:
                if (r0 >= r1) goto L2b
                r8 = -1
                return r8
            L2b:
                if (r0 <= r1) goto L2f
                r8 = 1
                return r8
            L2f:
                return r3
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(com.android.dx.rop.cst.CstArray.List r1) {
                r0 = this;
                com.android.dx.rop.cst.CstArray$List r1 = (com.android.dx.rop.cst.CstArray.List) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        public com.android.dx.rop.cst.Constant get(int r1) {
                r0 = this;
                java.lang.Object r1 = r0.get0(r1)
                com.android.dx.rop.cst.Constant r1 = (com.android.dx.rop.cst.Constant) r1
                return r1
        }

        public void set(int r1, com.android.dx.rop.cst.Constant r2) {
                r0 = this;
                r0.set0(r1, r2)
                return
        }
    }

    public CstArray(com.android.dx.rop.cst.CstArray.List r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto Lb
            r2.throwIfMutable()
            r1.list = r2
            return
        Lb:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "list == null"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.android.dx.rop.cst.Constant
    public int compareTo0(com.android.dx.rop.cst.Constant r2) {
            r1 = this;
            com.android.dx.rop.cst.CstArray$List r0 = r1.list
            com.android.dx.rop.cst.CstArray r2 = (com.android.dx.rop.cst.CstArray) r2
            com.android.dx.rop.cst.CstArray$List r2 = r2.list
            int r2 = r0.compareTo2(r2)
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstArray
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.android.dx.rop.cst.CstArray$List r0 = r1.list
            com.android.dx.rop.cst.CstArray r2 = (com.android.dx.rop.cst.CstArray) r2
            com.android.dx.rop.cst.CstArray$List r2 = r2.list
            boolean r2 = r0.equals(r2)
            return r2
    }

    public com.android.dx.rop.cst.CstArray.List getList() {
            r1 = this;
            com.android.dx.rop.cst.CstArray$List r0 = r1.list
            return r0
    }

    public int hashCode() {
            r1 = this;
            com.android.dx.rop.cst.CstArray$List r0 = r1.list
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public boolean isCategory2() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r4 = this;
            com.android.dx.rop.cst.CstArray$List r0 = r4.list
            java.lang.String r1 = ", "
            java.lang.String r2 = "}"
            java.lang.String r3 = "{"
            java.lang.String r0 = r0.toHuman(r3, r1, r2)
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            com.android.dx.rop.cst.CstArray$List r0 = r4.list
            java.lang.String r1 = ", "
            java.lang.String r2 = "}"
            java.lang.String r3 = "array{"
            java.lang.String r0 = r0.toString(r3, r1, r2)
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public java.lang.String typeName() {
            r1 = this;
            java.lang.String r0 = "array"
            return r0
    }
}
