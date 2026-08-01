package com.android.p002dx.dex.file;

import com.android.p002dx.rop.cst.Constant;
import com.android.p002dx.rop.cst.CstString;
import com.android.p002dx.util.AnnotatedOutput;
import com.android.p002dx.util.ByteArray;
import com.android.p002dx.util.Hex;
import com.bumptech.glide.AbstractC3887;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class StringDataItem extends OffsettedItem {
    private final CstString value;

    public StringDataItem(CstString cstString) {
        super(1, writeSize(cstString));
        this.value = cstString;
    }

    private static int writeSize(CstString cstString) {
        return cstString.getUtf8Size() + AbstractC3887.m7197(cstString.getUtf16Size()) + 1;
    }

    @Override // com.android.p002dx.dex.file.OffsettedItem
    public int compareTo0(OffsettedItem offsettedItem) {
        return this.value.compareTo((Constant) ((StringDataItem) offsettedItem).value);
    }

    @Override // com.android.p002dx.dex.file.Item
    public ItemType itemType() {
        return ItemType.TYPE_STRING_DATA_ITEM;
    }

    @Override // com.android.p002dx.dex.file.OffsettedItem
    public String toHuman() {
        return this.value.toQuoted();
    }

    @Override // com.android.p002dx.dex.file.OffsettedItem
    public void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        ByteArray bytes = this.value.getBytes();
        int utf16Size = this.value.getUtf16Size();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(AbstractC3887.m7197(utf16Size), "utf16_size: " + Hex.m30u4(utf16Size));
            annotatedOutput.annotate(bytes.size() + 1, this.value.toQuoted());
        }
        annotatedOutput.writeUleb128(utf16Size);
        annotatedOutput.write(bytes);
        annotatedOutput.writeByte(0);
    }

    @Override // com.android.p002dx.dex.file.Item
    public void addContents(DexFile dexFile) {
    }
}
