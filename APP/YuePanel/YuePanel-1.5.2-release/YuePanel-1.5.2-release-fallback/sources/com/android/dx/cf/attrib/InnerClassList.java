package com.android.dx.cf.attrib;

/* JADX INFO: loaded from: classes.dex */
public final class InnerClassList extends com.android.dx.util.FixedSizeList {

    public static class Item {
        private final int accessFlags;
        private final com.android.dx.rop.cst.CstType innerClass;
        private final com.android.dx.rop.cst.CstString innerName;
        private final com.android.dx.rop.cst.CstType outerClass;

        public Item(com.android.dx.rop.cst.CstType r1, com.android.dx.rop.cst.CstType r2, com.android.dx.rop.cst.CstString r3, int r4) {
                r0 = this;
                r0.<init>()
                if (r1 == 0) goto Le
                r0.innerClass = r1
                r0.outerClass = r2
                r0.innerName = r3
                r0.accessFlags = r4
                return
            Le:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "innerClass == null"
                r1.<init>(r2)
                throw r1
        }

        public int getAccessFlags() {
                r1 = this;
                int r0 = r1.accessFlags
                return r0
        }

        public com.android.dx.rop.cst.CstType getInnerClass() {
                r1 = this;
                com.android.dx.rop.cst.CstType r0 = r1.innerClass
                return r0
        }

        public com.android.dx.rop.cst.CstString getInnerName() {
                r1 = this;
                com.android.dx.rop.cst.CstString r0 = r1.innerName
                return r0
        }

        public com.android.dx.rop.cst.CstType getOuterClass() {
                r1 = this;
                com.android.dx.rop.cst.CstType r0 = r1.outerClass
                return r0
        }
    }

    public InnerClassList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public com.android.dx.cf.attrib.InnerClassList.Item get(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get0(r1)
            com.android.dx.cf.attrib.InnerClassList$Item r1 = (com.android.dx.cf.attrib.InnerClassList.Item) r1
            return r1
    }

    public void set(int r2, com.android.dx.rop.cst.CstType r3, com.android.dx.rop.cst.CstType r4, com.android.dx.rop.cst.CstString r5, int r6) {
            r1 = this;
            com.android.dx.cf.attrib.InnerClassList$Item r0 = new com.android.dx.cf.attrib.InnerClassList$Item
            r0.<init>(r3, r4, r5, r6)
            r1.set0(r2, r0)
            return
    }
}
