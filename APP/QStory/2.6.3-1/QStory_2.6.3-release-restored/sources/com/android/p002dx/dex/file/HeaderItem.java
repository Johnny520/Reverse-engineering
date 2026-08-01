package com.android.p002dx.dex.file;

import androidx.profileinstaller.AbstractC3275;
import com.android.p002dx.rop.cst.CstString;
import com.android.p002dx.util.AnnotatedOutput;
import com.android.p002dx.util.Hex;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class HeaderItem extends IndexedItem {
    @Override // com.android.p002dx.dex.file.Item
    public ItemType itemType() {
        return ItemType.TYPE_HEADER_ITEM;
    }

    @Override // com.android.p002dx.dex.file.Item
    public int writeSize() {
        return 112;
    }

    @Override // com.android.p002dx.dex.file.Item
    public void writeTo(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int fileOffset = dexFile.getMap().getFileOffset();
        Section firstDataSection = dexFile.getFirstDataSection();
        Section lastDataSection = dexFile.getLastDataSection();
        int fileOffset2 = firstDataSection.getFileOffset();
        int iWriteSize = (lastDataSection.writeSize() + lastDataSection.getFileOffset()) - fileOffset2;
        String magic = dexFile.getDexOptions().getMagic();
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(8, "magic: " + new CstString(magic).toQuoted());
            annotatedOutput.annotate(4, "checksum");
            annotatedOutput.annotate(20, "signature");
            annotatedOutput.annotate(4, "file_size:       " + Hex.m30u4(dexFile.getFileSize()));
            annotatedOutput.annotate(4, "header_size:     " + Hex.m30u4(112));
            AbstractC3275.m5123(305419896, new StringBuilder("endian_tag:      "), annotatedOutput, 4);
            annotatedOutput.annotate(4, "link_size:       0");
            annotatedOutput.annotate(4, "link_off:        0");
            AbstractC3275.m5123(fileOffset, new StringBuilder("map_off:         "), annotatedOutput, 4);
        }
        for (int i = 0; i < 8; i++) {
            annotatedOutput.writeByte(magic.charAt(i));
        }
        annotatedOutput.writeZeroes(24);
        annotatedOutput.writeInt(dexFile.getFileSize());
        annotatedOutput.writeInt(112);
        annotatedOutput.writeInt(305419896);
        annotatedOutput.writeZeroes(8);
        annotatedOutput.writeInt(fileOffset);
        dexFile.getStringIds().writeHeaderPart(annotatedOutput);
        dexFile.getTypeIds().writeHeaderPart(annotatedOutput);
        dexFile.getProtoIds().writeHeaderPart(annotatedOutput);
        dexFile.getFieldIds().writeHeaderPart(annotatedOutput);
        dexFile.getMethodIds().writeHeaderPart(annotatedOutput);
        dexFile.getClassDefs().writeHeaderPart(annotatedOutput);
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(4, "data_size:       " + Hex.m30u4(iWriteSize));
            AbstractC3275.m5123(fileOffset2, new StringBuilder("data_off:        "), annotatedOutput, 4);
        }
        annotatedOutput.writeInt(iWriteSize);
        annotatedOutput.writeInt(fileOffset2);
    }

    @Override // com.android.p002dx.dex.file.Item
    public void addContents(DexFile dexFile) {
    }
}
