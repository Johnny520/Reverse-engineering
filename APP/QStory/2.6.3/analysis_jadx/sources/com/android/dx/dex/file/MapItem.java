package com.android.dx.dex.file;

import androidx.profileinstaller.AbstractC2442;
import bsh.C2633;
import com.android.dx.util.AnnotatedOutput;
import com.android.dx.util.Hex;
import java.util.ArrayList;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class MapItem extends OffsettedItem {
    private static final int ALIGNMENT = 4;
    private static final int WRITE_SIZE = 12;
    private final Item firstItem;
    private final int itemCount;
    private final Item lastItem;
    private final Section section;
    private final ItemType type;

    private MapItem(ItemType itemType, Section section, Item item, Item item2, int i) {
        super(4, 12);
        if (itemType == null) {
            C2633.m5343("type == null");
            throw null;
        }
        if (section == null) {
            C2633.m5343("section == null");
            throw null;
        }
        if (item == null) {
            C2633.m5343("firstItem == null");
            throw null;
        }
        if (item2 == null) {
            C2633.m5343("lastItem == null");
            throw null;
        }
        if (i <= 0) {
            C5925.m11310("itemCount <= 0");
            throw null;
        }
        this.type = itemType;
        this.section = section;
        this.firstItem = item;
        this.lastItem = item2;
        this.itemCount = i;
    }

    public static void addMap(Section[] sectionArr, MixedItemSection mixedItemSection) {
        if (sectionArr == null) {
            C2633.m5343("sections == null");
            return;
        }
        if (mixedItemSection.items().size() != 0) {
            C5925.m11310("mapSection.items().size() != 0");
            return;
        }
        ArrayList arrayList = new ArrayList(50);
        for (Section section : sectionArr) {
            int i = 0;
            ItemType itemType = null;
            Item item = null;
            Item item2 = null;
            for (Item item3 : section.items()) {
                ItemType itemType2 = item3.itemType();
                if (itemType2 != itemType) {
                    if (i != 0) {
                        arrayList.add(new MapItem(itemType, section, item, item2, i));
                    }
                    i = 0;
                    item = item3;
                    itemType = itemType2;
                }
                i++;
                item2 = item3;
            }
            if (i != 0) {
                arrayList.add(new MapItem(itemType, section, item, item2, i));
            } else if (section == mixedItemSection) {
                arrayList.add(new MapItem(mixedItemSection));
            }
        }
        mixedItemSection.add(new UniformListItem(ItemType.TYPE_MAP_LIST, arrayList));
    }

    @Override // com.android.dx.dex.file.Item
    public ItemType itemType() {
        return ItemType.TYPE_MAP_ITEM;
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public final String toHuman() {
        return toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(MapItem.class.getName());
        sb.append('{');
        sb.append(this.section.toString());
        sb.append(' ');
        sb.append(this.type.toHuman());
        sb.append('}');
        return sb.toString();
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int mapValue = this.type.getMapValue();
        Item item = this.firstItem;
        Section section = this.section;
        int fileOffset = item == null ? section.getFileOffset() : section.getAbsoluteItemOffset(item);
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, offsetString() + ' ' + this.type.getTypeName() + " map");
            StringBuilder sb = new StringBuilder("  type:   ");
            sb.append(Hex.u2(mapValue));
            sb.append(" // ");
            sb.append(this.type.toString());
            annotatedOutput.annotate(2, sb.toString());
            annotatedOutput.annotate(2, "  unused: 0");
            annotatedOutput.annotate(4, "  size:   " + Hex.u4(this.itemCount));
            AbstractC2442.m4563(fileOffset, new StringBuilder("  offset: "), annotatedOutput, 4);
        }
        annotatedOutput.writeShort(mapValue);
        annotatedOutput.writeShort(0);
        annotatedOutput.writeInt(this.itemCount);
        annotatedOutput.writeInt(fileOffset);
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(DexFile dexFile) {
    }

    private MapItem(Section section) {
        super(4, 12);
        if (section != null) {
            this.type = ItemType.TYPE_MAP_LIST;
            this.section = section;
            this.firstItem = null;
            this.lastItem = null;
            this.itemCount = 1;
            return;
        }
        C2633.m5343("section == null");
        throw null;
    }
}
