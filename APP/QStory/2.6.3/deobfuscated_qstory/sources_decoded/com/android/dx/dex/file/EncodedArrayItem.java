package com.android.dx.dex.file;

import bsh.C2633;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstArray;
import com.android.dx.util.AnnotatedOutput;
import com.android.dx.util.ByteArrayAnnotatedOutput;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class EncodedArrayItem extends OffsettedItem {
    private static final int ALIGNMENT = 1;
    private final CstArray array;
    private byte[] encodedForm;

    public EncodedArrayItem(CstArray cstArray) {
        super(1, -1);
        if (cstArray == null) {
            C2633.m5343("array == null");
            throw null;
        }
        this.array = cstArray;
        this.encodedForm = null;
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(DexFile dexFile) {
        ValueEncoder.addContents(dexFile, this.array);
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public int compareTo0(OffsettedItem offsettedItem) {
        return this.array.compareTo((Constant) ((EncodedArrayItem) offsettedItem).array);
    }

    public int hashCode() {
        return this.array.hashCode();
    }

    @Override // com.android.dx.dex.file.Item
    public ItemType itemType() {
        return ItemType.TYPE_ENCODED_ARRAY_ITEM;
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void place0(Section section, int i) {
        ByteArrayAnnotatedOutput byteArrayAnnotatedOutput = new ByteArrayAnnotatedOutput();
        new ValueEncoder(section.getFile(), byteArrayAnnotatedOutput).writeArray(this.array, false);
        byte[] byteArray = byteArrayAnnotatedOutput.toByteArray();
        this.encodedForm = byteArray;
        setWriteSize(byteArray.length);
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public String toHuman() {
        return this.array.toHuman();
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        if (!annotatedOutput.annotates()) {
            annotatedOutput.write(this.encodedForm);
            return;
        }
        annotatedOutput.annotate(0, offsetString() + " encoded array");
        new ValueEncoder(dexFile, annotatedOutput).writeArray(this.array, true);
    }
}
