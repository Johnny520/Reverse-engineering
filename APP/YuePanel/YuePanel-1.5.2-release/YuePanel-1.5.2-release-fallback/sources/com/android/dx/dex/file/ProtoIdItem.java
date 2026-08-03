package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class ProtoIdItem extends com.android.dx.dex.file.IndexedItem {
    private com.android.dx.dex.file.TypeListItem parameterTypes;
    private final com.android.dx.rop.type.Prototype prototype;
    private final com.android.dx.rop.cst.CstString shortForm;

    public ProtoIdItem(com.android.dx.rop.type.Prototype r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L22
            r1.prototype = r2
            com.android.dx.rop.cst.CstString r0 = makeShortForm(r2)
            r1.shortForm = r0
            com.android.dx.rop.type.StdTypeList r2 = r2.getParameterTypes()
            int r0 = r2.size()
            if (r0 != 0) goto L19
            r2 = 0
            goto L1f
        L19:
            com.android.dx.dex.file.TypeListItem r0 = new com.android.dx.dex.file.TypeListItem
            r0.<init>(r2)
            r2 = r0
        L1f:
            r1.parameterTypes = r2
            return
        L22:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "prototype == null"
            r2.<init>(r0)
            throw r2
    }

    private static com.android.dx.rop.cst.CstString makeShortForm(com.android.dx.rop.type.Prototype r4) {
            com.android.dx.rop.type.StdTypeList r0 = r4.getParameterTypes()
            int r1 = r0.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r1 + 1
            r2.<init>(r3)
            com.android.dx.rop.type.Type r4 = r4.getReturnType()
            char r4 = shortFormCharFor(r4)
            r2.append(r4)
            r4 = 0
        L1b:
            if (r4 >= r1) goto L2b
            com.android.dx.rop.type.Type r3 = r0.getType(r4)
            char r3 = shortFormCharFor(r3)
            r2.append(r3)
            int r4 = r4 + 1
            goto L1b
        L2b:
            com.android.dx.rop.cst.CstString r4 = new com.android.dx.rop.cst.CstString
            java.lang.String r0 = r2.toString()
            r4.<init>(r0)
            return r4
    }

    private static char shortFormCharFor(com.android.dx.rop.type.Type r1) {
            java.lang.String r1 = r1.getDescriptor()
            r0 = 0
            char r1 = r1.charAt(r0)
            r0 = 91
            if (r1 != r0) goto Lf
            r1 = 76
        Lf:
            return r1
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r4) {
            r3 = this;
            com.android.dx.dex.file.StringIdsSection r0 = r4.getStringIds()
            com.android.dx.dex.file.TypeIdsSection r1 = r4.getTypeIds()
            com.android.dx.dex.file.MixedItemSection r4 = r4.getTypeLists()
            com.android.dx.rop.type.Prototype r2 = r3.prototype
            com.android.dx.rop.type.Type r2 = r2.getReturnType()
            r1.intern(r2)
            com.android.dx.rop.cst.CstString r1 = r3.shortForm
            r0.intern(r1)
            com.android.dx.dex.file.TypeListItem r0 = r3.parameterTypes
            if (r0 == 0) goto L26
            com.android.dx.dex.file.OffsettedItem r4 = r4.intern(r0)
            com.android.dx.dex.file.TypeListItem r4 = (com.android.dx.dex.file.TypeListItem) r4
            r3.parameterTypes = r4
        L26:
            return
    }

    @Override // com.android.dx.dex.file.Item
    public com.android.dx.dex.file.ItemType itemType() {
            r1 = this;
            com.android.dx.dex.file.ItemType r0 = com.android.dx.dex.file.ItemType.TYPE_PROTO_ID_ITEM
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public int writeSize() {
            r1 = this;
            r0 = 12
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public void writeTo(com.android.dx.dex.file.DexFile r9, com.android.dx.util.AnnotatedOutput r10) {
            r8 = this;
            com.android.dx.dex.file.StringIdsSection r0 = r9.getStringIds()
            com.android.dx.rop.cst.CstString r1 = r8.shortForm
            int r0 = r0.indexOf(r1)
            com.android.dx.dex.file.TypeIdsSection r9 = r9.getTypeIds()
            com.android.dx.rop.type.Prototype r1 = r8.prototype
            com.android.dx.rop.type.Type r1 = r1.getReturnType()
            int r9 = r9.indexOf(r1)
            com.android.dx.dex.file.TypeListItem r1 = r8.parameterTypes
            int r1 = com.android.dx.dex.file.OffsettedItem.getAbsoluteOffsetOr0(r1)
            boolean r2 = r10.annotates()
            if (r2 == 0) goto Le9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.android.dx.rop.type.Prototype r3 = r8.prototype
            com.android.dx.rop.type.Type r3 = r3.getReturnType()
            java.lang.String r3 = r3.toHuman()
            r2.append(r3)
            java.lang.String r3 = " proto("
            r2.append(r3)
            com.android.dx.rop.type.Prototype r3 = r8.prototype
            com.android.dx.rop.type.StdTypeList r3 = r3.getParameterTypes()
            int r4 = r3.size()
            r5 = 0
            r6 = r5
        L47:
            if (r6 >= r4) goto L5e
            if (r6 == 0) goto L50
            java.lang.String r7 = ", "
            r2.append(r7)
        L50:
            com.android.dx.rop.type.Type r7 = r3.getType(r6)
            java.lang.String r7 = r7.toHuman()
            r2.append(r7)
            int r6 = r6 + 1
            goto L47
        L5e:
            java.lang.String r3 = ")"
            r2.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r8.indexString()
            r3.append(r4)
            r4 = 32
            r3.append(r4)
            java.lang.String r2 = r2.toString()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r10.annotate(r5, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "  shorty_idx:      "
            r2.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u4(r0)
            r2.append(r3)
            java.lang.String r3 = " // "
            r2.append(r3)
            com.android.dx.rop.cst.CstString r4 = r8.shortForm
            java.lang.String r4 = r4.toQuoted()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r4 = 4
            r10.annotate(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "  return_type_idx: "
            r2.append(r5)
            java.lang.String r5 = com.android.dx.util.Hex.u4(r9)
            r2.append(r5)
            r2.append(r3)
            com.android.dx.rop.type.Prototype r3 = r8.prototype
            com.android.dx.rop.type.Type r3 = r3.getReturnType()
            java.lang.String r3 = r3.toHuman()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r10.annotate(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "  parameters_off:  "
            r2.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u4(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r10.annotate(r4, r2)
        Le9:
            r10.writeInt(r0)
            r10.writeInt(r9)
            r10.writeInt(r1)
            return
    }
}
