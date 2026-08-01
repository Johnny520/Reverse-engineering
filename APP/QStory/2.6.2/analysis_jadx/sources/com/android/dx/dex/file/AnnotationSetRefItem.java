package com.android.dx.dex.file;

import androidx.profileinstaller.AbstractC2442;
import bsh.C2632;
import com.android.dx.util.AnnotatedOutput;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationSetRefItem extends OffsettedItem {
    private static final int ALIGNMENT = 4;
    private static final int WRITE_SIZE = 4;
    private AnnotationSetItem annotations;

    public AnnotationSetRefItem(AnnotationSetItem annotationSetItem) {
        super(4, 4);
        if (annotationSetItem != null) {
            this.annotations = annotationSetItem;
        } else {
            C2632.m5298("annotations == null");
            throw null;
        }
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(DexFile dexFile) {
        this.annotations = (AnnotationSetItem) dexFile.getWordData().intern(this.annotations);
    }

    @Override // com.android.dx.dex.file.Item
    public ItemType itemType() {
        return ItemType.TYPE_ANNOTATION_SET_REF_ITEM;
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public String toHuman() {
        return this.annotations.toHuman();
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int absoluteOffset = this.annotations.getAbsoluteOffset();
        if (annotatedOutput.annotates()) {
            AbstractC2442.m4552(absoluteOffset, new StringBuilder("  annotations_off: "), annotatedOutput, 4);
        }
        annotatedOutput.writeInt(absoluteOffset);
    }
}
