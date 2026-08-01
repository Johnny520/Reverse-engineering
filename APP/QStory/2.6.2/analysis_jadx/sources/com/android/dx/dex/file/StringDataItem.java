package com.android.dx.dex.file;

import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstString;
import com.android.dx.util.AnnotatedOutput;
import com.android.dx.util.ByteArray;
import com.android.dx.util.Hex;
import com.bumptech.glide.AbstractC3065;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class StringDataItem extends OffsettedItem {
    private final CstString value;

    public StringDataItem(CstString cstString) {
        super(1, writeSize(cstString));
        this.value = cstString;
    }

    private static int writeSize(CstString cstString) {
        return cstString.getUtf8Size() + AbstractC3065.m6847(cstString.getUtf16Size()) + 1;
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public int compareTo0(OffsettedItem offsettedItem) {
        return this.value.compareTo((Constant) ((StringDataItem) offsettedItem).value);
    }

    @Override // com.android.dx.dex.file.Item
    public ItemType itemType() {
        return ItemType.TYPE_STRING_DATA_ITEM;
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public String toHuman() {
        return this.value.toQuoted();
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        ByteArray bytes = this.value.getBytes();
        int utf16Size = this.value.getUtf16Size();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(AbstractC3065.m6847(utf16Size), "utf16_size: " + Hex.u4(utf16Size));
            annotatedOutput.annotate(bytes.size() + 1, this.value.toQuoted());
        }
        annotatedOutput.writeUleb128(utf16Size);
        annotatedOutput.write(bytes);
        annotatedOutput.writeByte(0);
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(DexFile dexFile) {
    }
}
