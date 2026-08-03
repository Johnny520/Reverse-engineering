package com.android.dx.merge;

/* JADX INFO: loaded from: classes.dex */
final class SortableType {
    public static final java.util.Comparator<com.android.dx.merge.SortableType> NULLS_LAST_ORDER = null;
    private final com.android.dex.ClassDef classDef;
    private int depth;
    private final com.android.dex.Dex dex;
    private final com.android.dx.merge.IndexMap indexMap;


    static {
            com.android.dx.merge.SortableType$1 r0 = new com.android.dx.merge.SortableType$1
            r0.<init>()
            com.android.dx.merge.SortableType.NULLS_LAST_ORDER = r0
            return
    }

    public SortableType(com.android.dex.Dex r2, com.android.dx.merge.IndexMap r3, com.android.dex.ClassDef r4) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.depth = r0
            r1.dex = r2
            r1.indexMap = r3
            r1.classDef = r4
            return
    }

    public static /* synthetic */ int access$000(com.android.dx.merge.SortableType r0) {
            int r0 = r0.depth
            return r0
    }

    public com.android.dex.ClassDef getClassDef() {
            r1 = this;
            com.android.dex.ClassDef r0 = r1.classDef
            return r0
    }

    public com.android.dex.Dex getDex() {
            r1 = this;
            com.android.dex.Dex r0 = r1.dex
            return r0
    }

    public com.android.dx.merge.IndexMap getIndexMap() {
            r1 = this;
            com.android.dx.merge.IndexMap r0 = r1.indexMap
            return r0
    }

    public int getTypeIndex() {
            r1 = this;
            com.android.dex.ClassDef r0 = r1.classDef
            int r0 = r0.getTypeIndex()
            return r0
    }

    public boolean isDepthAssigned() {
            r2 = this;
            int r0 = r2.depth
            r1 = -1
            if (r0 == r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public boolean tryAssignDepth(com.android.dx.merge.SortableType[] r9) {
            r8 = this;
            com.android.dex.ClassDef r0 = r8.classDef
            int r0 = r0.getSupertypeIndex()
            r1 = 0
            r2 = 1
            r3 = -1
            if (r0 != r3) goto Ld
            r0 = r1
            goto L2c
        Ld:
            com.android.dex.ClassDef r0 = r8.classDef
            int r0 = r0.getSupertypeIndex()
            com.android.dex.ClassDef r4 = r8.classDef
            int r4 = r4.getTypeIndex()
            if (r0 == r4) goto L51
            com.android.dex.ClassDef r0 = r8.classDef
            int r0 = r0.getSupertypeIndex()
            r0 = r9[r0]
            if (r0 != 0) goto L27
            r0 = r2
            goto L2c
        L27:
            int r0 = r0.depth
            if (r0 != r3) goto L2c
            return r1
        L2c:
            com.android.dex.ClassDef r4 = r8.classDef
            short[] r4 = r4.getInterfaces()
            int r5 = r4.length
            r6 = r1
        L34:
            if (r6 >= r5) goto L4d
            short r7 = r4[r6]
            r7 = r9[r7]
            if (r7 != 0) goto L41
            int r0 = java.lang.Math.max(r0, r2)
            goto L4a
        L41:
            int r7 = r7.depth
            if (r7 != r3) goto L46
            return r1
        L46:
            int r0 = java.lang.Math.max(r0, r7)
        L4a:
            int r6 = r6 + 1
            goto L34
        L4d:
            int r0 = r0 + r2
            r8.depth = r0
            return r2
        L51:
            com.android.dex.DexException r9 = new com.android.dex.DexException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Class with type index "
            r0.append(r1)
            com.android.dex.ClassDef r1 = r8.classDef
            int r1 = r1.getTypeIndex()
            r0.append(r1)
            java.lang.String r1 = " extends itself"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
    }
}
