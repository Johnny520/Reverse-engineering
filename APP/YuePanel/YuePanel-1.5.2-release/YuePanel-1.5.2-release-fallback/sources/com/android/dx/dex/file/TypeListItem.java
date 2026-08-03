package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class TypeListItem extends com.android.dx.dex.file.OffsettedItem {
    private static final int ALIGNMENT = 4;
    private static final int ELEMENT_SIZE = 2;
    private static final int HEADER_SIZE = 4;
    private final com.android.dx.rop.type.TypeList list;

    public TypeListItem(com.android.dx.rop.type.TypeList r3) {
            r2 = this;
            int r0 = r3.size()
            int r0 = r0 * 2
            r1 = 4
            int r0 = r0 + r1
            r2.<init>(r1, r0)
            r2.list = r3
            return
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r4) {
            r3 = this;
            com.android.dx.dex.file.TypeIdsSection r4 = r4.getTypeIds()
            com.android.dx.rop.type.TypeList r0 = r3.list
            int r0 = r0.size()
            r1 = 0
        Lb:
            if (r1 >= r0) goto L19
            com.android.dx.rop.type.TypeList r2 = r3.list
            com.android.dx.rop.type.Type r2 = r2.getType(r1)
            r4.intern(r2)
            int r1 = r1 + 1
            goto Lb
        L19:
            return
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public int compareTo0(com.android.dx.dex.file.OffsettedItem r2) {
            r1 = this;
            com.android.dx.rop.type.TypeList r0 = r1.list
            com.android.dx.dex.file.TypeListItem r2 = (com.android.dx.dex.file.TypeListItem) r2
            com.android.dx.rop.type.TypeList r2 = r2.list
            int r2 = com.android.dx.rop.type.StdTypeList.compareContents(r0, r2)
            return r2
    }

    public com.android.dx.rop.type.TypeList getList() {
            r1 = this;
            com.android.dx.rop.type.TypeList r0 = r1.list
            return r0
    }

    public int hashCode() {
            r1 = this;
            com.android.dx.rop.type.TypeList r0 = r1.list
            int r0 = com.android.dx.rop.type.StdTypeList.hashContents(r0)
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public com.android.dx.dex.file.ItemType itemType() {
            r1 = this;
            com.android.dx.dex.file.ItemType r0 = com.android.dx.dex.file.ItemType.TYPE_TYPE_LIST
            return r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public java.lang.String toHuman() {
            r2 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "unsupported"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void writeTo0(com.android.dx.dex.file.DexFile r8, com.android.dx.util.AnnotatedOutput r9) {
            r7 = this;
            com.android.dx.dex.file.TypeIdsSection r8 = r8.getTypeIds()
            com.android.dx.rop.type.TypeList r0 = r7.list
            int r0 = r0.size()
            boolean r1 = r9.annotates()
            r2 = 0
            if (r1 == 0) goto L77
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r7.offsetString()
            r1.append(r3)
            java.lang.String r3 = " type_list"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r9.annotate(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "  size: "
            r1.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u4(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r3 = 4
            r9.annotate(r3, r1)
            r1 = r2
        L43:
            if (r1 >= r0) goto L77
            com.android.dx.rop.type.TypeList r3 = r7.list
            com.android.dx.rop.type.Type r3 = r3.getType(r1)
            int r4 = r8.indexOf(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "  "
            r5.append(r6)
            java.lang.String r4 = com.android.dx.util.Hex.u2(r4)
            r5.append(r4)
            java.lang.String r4 = " // "
            r5.append(r4)
            java.lang.String r3 = r3.toHuman()
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4 = 2
            r9.annotate(r4, r3)
            int r1 = r1 + 1
            goto L43
        L77:
            r9.writeInt(r0)
        L7a:
            if (r2 >= r0) goto L8c
            com.android.dx.rop.type.TypeList r1 = r7.list
            com.android.dx.rop.type.Type r1 = r1.getType(r2)
            int r1 = r8.indexOf(r1)
            r9.writeShort(r1)
            int r2 = r2 + 1
            goto L7a
        L8c:
            return
    }
}
