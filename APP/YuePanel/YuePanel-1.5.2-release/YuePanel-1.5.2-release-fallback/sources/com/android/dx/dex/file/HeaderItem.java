package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class HeaderItem extends com.android.dx.dex.file.IndexedItem {
    public HeaderItem() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r1) {
            r0 = this;
            return
    }

    @Override // com.android.dx.dex.file.Item
    public com.android.dx.dex.file.ItemType itemType() {
            r1 = this;
            com.android.dx.dex.file.ItemType r0 = com.android.dx.dex.file.ItemType.TYPE_HEADER_ITEM
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public int writeSize() {
            r1 = this;
            r0 = 112(0x70, float:1.57E-43)
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public void writeTo(com.android.dx.dex.file.DexFile r11, com.android.dx.util.AnnotatedOutput r12) {
            r10 = this;
            com.android.dx.dex.file.MixedItemSection r0 = r11.getMap()
            int r0 = r0.getFileOffset()
            com.android.dx.dex.file.Section r1 = r11.getFirstDataSection()
            com.android.dx.dex.file.Section r2 = r11.getLastDataSection()
            int r1 = r1.getFileOffset()
            int r3 = r2.getFileOffset()
            int r2 = r2.writeSize()
            int r3 = r3 + r2
            int r3 = r3 - r1
            com.android.dx.dex.DexOptions r2 = r11.getDexOptions()
            java.lang.String r2 = r2.getMagic()
            boolean r4 = r12.annotates()
            r5 = 305419896(0x12345678, float:5.6904566E-28)
            r6 = 112(0x70, float:1.57E-43)
            r7 = 8
            r8 = 4
            if (r4 == 0) goto Lcb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "magic: "
            r4.append(r9)
            com.android.dx.rop.cst.CstString r9 = new com.android.dx.rop.cst.CstString
            r9.<init>(r2)
            java.lang.String r9 = r9.toQuoted()
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r12.annotate(r7, r4)
            java.lang.String r4 = "checksum"
            r12.annotate(r8, r4)
            r4 = 20
            java.lang.String r9 = "signature"
            r12.annotate(r4, r9)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "file_size:       "
            r4.append(r9)
            int r9 = r11.getFileSize()
            java.lang.String r9 = com.android.dx.util.Hex.u4(r9)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r12.annotate(r8, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "header_size:     "
            r4.append(r9)
            java.lang.String r9 = com.android.dx.util.Hex.u4(r6)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r12.annotate(r8, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "endian_tag:      "
            r4.append(r9)
            java.lang.String r9 = com.android.dx.util.Hex.u4(r5)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r12.annotate(r8, r4)
            java.lang.String r4 = "link_size:       0"
            r12.annotate(r8, r4)
            java.lang.String r4 = "link_off:        0"
            r12.annotate(r8, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "map_off:         "
            r4.append(r9)
            java.lang.String r9 = com.android.dx.util.Hex.u4(r0)
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            r12.annotate(r8, r4)
        Lcb:
            r4 = 0
        Lcc:
            if (r4 >= r7) goto Ld8
            char r9 = r2.charAt(r4)
            r12.writeByte(r9)
            int r4 = r4 + 1
            goto Lcc
        Ld8:
            r2 = 24
            r12.writeZeroes(r2)
            int r2 = r11.getFileSize()
            r12.writeInt(r2)
            r12.writeInt(r6)
            r12.writeInt(r5)
            r12.writeZeroes(r7)
            r12.writeInt(r0)
            com.android.dx.dex.file.StringIdsSection r0 = r11.getStringIds()
            r0.writeHeaderPart(r12)
            com.android.dx.dex.file.TypeIdsSection r0 = r11.getTypeIds()
            r0.writeHeaderPart(r12)
            com.android.dx.dex.file.ProtoIdsSection r0 = r11.getProtoIds()
            r0.writeHeaderPart(r12)
            com.android.dx.dex.file.FieldIdsSection r0 = r11.getFieldIds()
            r0.writeHeaderPart(r12)
            com.android.dx.dex.file.MethodIdsSection r0 = r11.getMethodIds()
            r0.writeHeaderPart(r12)
            com.android.dx.dex.file.ClassDefsSection r11 = r11.getClassDefs()
            r11.writeHeaderPart(r12)
            boolean r11 = r12.annotates()
            if (r11 == 0) goto L150
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "data_size:       "
            r11.append(r0)
            java.lang.String r0 = com.android.dx.util.Hex.u4(r3)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r12.annotate(r8, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "data_off:        "
            r11.append(r0)
            java.lang.String r0 = com.android.dx.util.Hex.u4(r1)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r12.annotate(r8, r11)
        L150:
            r12.writeInt(r3)
            r12.writeInt(r1)
            return
    }
}
