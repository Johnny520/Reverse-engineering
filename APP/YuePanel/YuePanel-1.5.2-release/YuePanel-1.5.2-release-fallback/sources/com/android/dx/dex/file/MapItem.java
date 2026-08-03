package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class MapItem extends com.android.dx.dex.file.OffsettedItem {
    private static final int ALIGNMENT = 4;
    private static final int WRITE_SIZE = 12;
    private final com.android.dx.dex.file.Item firstItem;
    private final int itemCount;
    private final com.android.dx.dex.file.Item lastItem;
    private final com.android.dx.dex.file.Section section;
    private final com.android.dx.dex.file.ItemType type;

    private MapItem(com.android.dx.dex.file.ItemType r3, com.android.dx.dex.file.Section r4, com.android.dx.dex.file.Item r5, com.android.dx.dex.file.Item r6, int r7) {
            r2 = this;
            r0 = 4
            r1 = 12
            r2.<init>(r0, r1)
            if (r3 == 0) goto L3b
            if (r4 == 0) goto L33
            if (r5 == 0) goto L2b
            if (r6 == 0) goto L23
            if (r7 <= 0) goto L1b
            r2.type = r3
            r2.section = r4
            r2.firstItem = r5
            r2.lastItem = r6
            r2.itemCount = r7
            return
        L1b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "itemCount <= 0"
            r3.<init>(r4)
            throw r3
        L23:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "lastItem == null"
            r3.<init>(r4)
            throw r3
        L2b:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "firstItem == null"
            r3.<init>(r4)
            throw r3
        L33:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "section == null"
            r3.<init>(r4)
            throw r3
        L3b:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "type == null"
            r3.<init>(r4)
            throw r3
    }

    private MapItem(com.android.dx.dex.file.Section r3) {
            r2 = this;
            r0 = 4
            r1 = 12
            r2.<init>(r0, r1)
            if (r3 == 0) goto L17
            com.android.dx.dex.file.ItemType r0 = com.android.dx.dex.file.ItemType.TYPE_MAP_LIST
            r2.type = r0
            r2.section = r3
            r3 = 0
            r2.firstItem = r3
            r2.lastItem = r3
            r3 = 1
            r2.itemCount = r3
            return
        L17:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "section == null"
            r3.<init>(r0)
            throw r3
    }

    public static void addMap(com.android.dx.dex.file.Section[] r16, com.android.dx.dex.file.MixedItemSection r17) {
            r0 = r16
            r1 = r17
            if (r0 == 0) goto L7e
            java.util.Collection r2 = r17.items()
            int r2 = r2.size()
            if (r2 != 0) goto L76
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 50
            r2.<init>(r3)
            int r3 = r0.length
            r5 = 0
        L19:
            if (r5 >= r3) goto L6b
            r12 = r0[r5]
            java.util.Collection r6 = r12.items()
            java.util.Iterator r13 = r6.iterator()
            r6 = 0
            r7 = r6
            r9 = r7
            r10 = r9
            r11 = 0
        L2a:
            boolean r6 = r13.hasNext()
            if (r6 == 0) goto L51
            java.lang.Object r6 = r13.next()
            r14 = r6
            com.android.dx.dex.file.Item r14 = (com.android.dx.dex.file.Item) r14
            com.android.dx.dex.file.ItemType r15 = r14.itemType()
            if (r15 == r7) goto L4d
            if (r11 == 0) goto L4a
            com.android.dx.dex.file.MapItem r8 = new com.android.dx.dex.file.MapItem
            r6 = r8
            r4 = r8
            r8 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r2.add(r4)
        L4a:
            r9 = r14
            r7 = r15
            r11 = 0
        L4d:
            int r11 = r11 + 1
            r10 = r14
            goto L2a
        L51:
            if (r11 == 0) goto L5e
            com.android.dx.dex.file.MapItem r4 = new com.android.dx.dex.file.MapItem
            r6 = r4
            r8 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r2.add(r4)
            goto L68
        L5e:
            if (r12 != r1) goto L68
            com.android.dx.dex.file.MapItem r4 = new com.android.dx.dex.file.MapItem
            r4.<init>(r1)
            r2.add(r4)
        L68:
            int r5 = r5 + 1
            goto L19
        L6b:
            com.android.dx.dex.file.UniformListItem r0 = new com.android.dx.dex.file.UniformListItem
            com.android.dx.dex.file.ItemType r3 = com.android.dx.dex.file.ItemType.TYPE_MAP_LIST
            r0.<init>(r3, r2)
            r1.add(r0)
            return
        L76:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "mapSection.items().size() != 0"
            r0.<init>(r1)
            throw r0
        L7e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "sections == null"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r1) {
            r0 = this;
            return
    }

    @Override // com.android.dx.dex.file.Item
    public com.android.dx.dex.file.ItemType itemType() {
            r1 = this;
            com.android.dx.dex.file.ItemType r0 = com.android.dx.dex.file.ItemType.TYPE_MAP_ITEM
            return r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public final java.lang.String toHuman() {
            r1 = this;
            java.lang.String r0 = r1.toString()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.lang.Class<com.android.dx.dex.file.MapItem> r1 = com.android.dx.dex.file.MapItem.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            com.android.dx.dex.file.Section r1 = r2.section
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            com.android.dx.dex.file.ItemType r1 = r2.type
            java.lang.String r1 = r1.toHuman()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void writeTo0(com.android.dx.dex.file.DexFile r6, com.android.dx.util.AnnotatedOutput r7) {
            r5 = this;
            com.android.dx.dex.file.ItemType r6 = r5.type
            int r6 = r6.getMapValue()
            com.android.dx.dex.file.Item r0 = r5.firstItem
            if (r0 != 0) goto L11
            com.android.dx.dex.file.Section r0 = r5.section
            int r0 = r0.getFileOffset()
            goto L17
        L11:
            com.android.dx.dex.file.Section r1 = r5.section
            int r0 = r1.getAbsoluteItemOffset(r0)
        L17:
            boolean r1 = r7.annotates()
            r2 = 0
            if (r1 == 0) goto La3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r5.offsetString()
            r1.append(r3)
            r3 = 32
            r1.append(r3)
            com.android.dx.dex.file.ItemType r3 = r5.type
            java.lang.String r3 = r3.getTypeName()
            r1.append(r3)
            java.lang.String r3 = " map"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r7.annotate(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "  type:   "
            r1.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u2(r6)
            r1.append(r3)
            java.lang.String r3 = " // "
            r1.append(r3)
            com.android.dx.dex.file.ItemType r3 = r5.type
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r3 = 2
            r7.annotate(r3, r1)
            java.lang.String r1 = "  unused: 0"
            r7.annotate(r3, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "  size:   "
            r1.append(r3)
            int r3 = r5.itemCount
            java.lang.String r3 = com.android.dx.util.Hex.u4(r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r3 = 4
            r7.annotate(r3, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "  offset: "
            r1.append(r4)
            java.lang.String r4 = com.android.dx.util.Hex.u4(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r7.annotate(r3, r1)
        La3:
            r7.writeShort(r6)
            r7.writeShort(r2)
            int r6 = r5.itemCount
            r7.writeInt(r6)
            r7.writeInt(r0)
            return
    }
}
