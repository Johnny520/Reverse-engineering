package com.android.dx.dex.file;

import androidx.profileinstaller.AbstractC2442;
import bsh.C2632;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstString;
import com.android.dx.util.AnnotatedOutput;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class StringIdItem extends IndexedItem implements Comparable<StringIdItem> {
    private StringDataItem data;
    private final CstString value;

    public StringIdItem(CstString cstString) {
        if (cstString == null) {
            C2632.m5298("value == null");
            throw null;
        }
        this.value = cstString;
        this.data = null;
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(DexFile dexFile) {
        if (this.data == null) {
            MixedItemSection stringData = dexFile.getStringData();
            StringDataItem stringDataItem = new StringDataItem(this.value);
            this.data = stringDataItem;
            stringData.add(stringDataItem);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(StringIdItem stringIdItem) {
        return this.value.compareTo((Constant) stringIdItem.value);
    }

    public boolean equals(Object obj) {
        if (obj instanceof StringIdItem) {
            return this.value.equals(((StringIdItem) obj).value);
        }
        return false;
    }

    public StringDataItem getData() {
        return this.data;
    }

    public CstString getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @Override // com.android.dx.dex.file.Item
    public ItemType itemType() {
        return ItemType.TYPE_STRING_ID_ITEM;
    }

    @Override // com.android.dx.dex.file.Item
    public int writeSize() {
        return 4;
    }

    @Override // com.android.dx.dex.file.Item
    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int absoluteOffset = this.data.getAbsoluteOffset();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, indexString() + ' ' + this.value.toQuoted(100));
            AbstractC2442.m4552(absoluteOffset, new StringBuilder("  string_data_off: "), annotatedOutput, 4);
        }
        annotatedOutput.writeInt(absoluteOffset);
    }
}
