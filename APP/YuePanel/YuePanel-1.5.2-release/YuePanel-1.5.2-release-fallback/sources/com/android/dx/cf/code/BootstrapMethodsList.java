package com.android.dx.cf.code;

/* JADX INFO: loaded from: classes.dex */
public class BootstrapMethodsList extends com.android.dx.util.FixedSizeList {
    public static final com.android.dx.cf.code.BootstrapMethodsList EMPTY = null;

    public static class Item {
        private final com.android.dx.cf.code.BootstrapMethodArgumentsList bootstrapMethodArgumentsList;
        private final com.android.dx.rop.cst.CstMethodHandle bootstrapMethodHandle;
        private final com.android.dx.rop.cst.CstType declaringClass;

        public Item(com.android.dx.rop.cst.CstType r1, com.android.dx.rop.cst.CstMethodHandle r2, com.android.dx.cf.code.BootstrapMethodArgumentsList r3) {
                r0 = this;
                r0.<init>()
                if (r1 == 0) goto L20
                if (r2 == 0) goto L18
                if (r3 == 0) goto L10
                r0.bootstrapMethodHandle = r2
                r0.bootstrapMethodArgumentsList = r3
                r0.declaringClass = r1
                return
            L10:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "bootstrapMethodArguments == null"
                r1.<init>(r2)
                throw r1
            L18:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "bootstrapMethodHandle == null"
                r1.<init>(r2)
                throw r1
            L20:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "declaringClass == null"
                r1.<init>(r2)
                throw r1
        }

        public com.android.dx.cf.code.BootstrapMethodArgumentsList getBootstrapMethodArguments() {
                r1 = this;
                com.android.dx.cf.code.BootstrapMethodArgumentsList r0 = r1.bootstrapMethodArgumentsList
                return r0
        }

        public com.android.dx.rop.cst.CstMethodHandle getBootstrapMethodHandle() {
                r1 = this;
                com.android.dx.rop.cst.CstMethodHandle r0 = r1.bootstrapMethodHandle
                return r0
        }

        public com.android.dx.rop.cst.CstType getDeclaringClass() {
                r1 = this;
                com.android.dx.rop.cst.CstType r0 = r1.declaringClass
                return r0
        }
    }

    static {
            com.android.dx.cf.code.BootstrapMethodsList r0 = new com.android.dx.cf.code.BootstrapMethodsList
            r1 = 0
            r0.<init>(r1)
            com.android.dx.cf.code.BootstrapMethodsList.EMPTY = r0
            return
    }

    public BootstrapMethodsList(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.android.dx.cf.code.BootstrapMethodsList concat(com.android.dx.cf.code.BootstrapMethodsList r6, com.android.dx.cf.code.BootstrapMethodsList r7) {
            com.android.dx.cf.code.BootstrapMethodsList r0 = com.android.dx.cf.code.BootstrapMethodsList.EMPTY
            if (r6 != r0) goto L5
            return r7
        L5:
            if (r7 != r0) goto L8
            return r6
        L8:
            int r0 = r6.size()
            int r1 = r7.size()
            com.android.dx.cf.code.BootstrapMethodsList r2 = new com.android.dx.cf.code.BootstrapMethodsList
            int r3 = r0 + r1
            r2.<init>(r3)
            r3 = 0
            r4 = r3
        L19:
            if (r4 >= r0) goto L25
            com.android.dx.cf.code.BootstrapMethodsList$Item r5 = r6.get(r4)
            r2.set(r4, r5)
            int r4 = r4 + 1
            goto L19
        L25:
            if (r3 >= r1) goto L33
            int r6 = r0 + r3
            com.android.dx.cf.code.BootstrapMethodsList$Item r4 = r7.get(r3)
            r2.set(r6, r4)
            int r3 = r3 + 1
            goto L25
        L33:
            return r2
    }

    public com.android.dx.cf.code.BootstrapMethodsList.Item get(int r1) {
            r0 = this;
            java.lang.Object r1 = r0.get0(r1)
            com.android.dx.cf.code.BootstrapMethodsList$Item r1 = (com.android.dx.cf.code.BootstrapMethodsList.Item) r1
            return r1
    }

    public void set(int r1, com.android.dx.cf.code.BootstrapMethodsList.Item r2) {
            r0 = this;
            if (r2 == 0) goto L6
            r0.set0(r1, r2)
            return
        L6:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "item == null"
            r1.<init>(r2)
            throw r1
    }

    public void set(int r2, com.android.dx.rop.cst.CstType r3, com.android.dx.rop.cst.CstMethodHandle r4, com.android.dx.cf.code.BootstrapMethodArgumentsList r5) {
            r1 = this;
            com.android.dx.cf.code.BootstrapMethodsList$Item r0 = new com.android.dx.cf.code.BootstrapMethodsList$Item
            r0.<init>(r3, r4, r5)
            r1.set(r2, r0)
            return
    }
}
